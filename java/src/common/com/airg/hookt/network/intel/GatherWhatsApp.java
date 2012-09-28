// Copyright 2012, airG & Jaap Suter - All Rights Reserved.
// This file is subject to terms and conditions available on
// request by contacting license@jaapsuter.com

package com.airg.hookt.network.intel;

import java.util.Vector;
import java.util.Enumeration;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.ByteArrayInputStream;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;
import net.rim.blackberry.api.browser.URLEncodedPostData;
import net.rim.device.api.io.IOUtilities;

/**
 * Figures out which phone numbers in a given list are WhatsApp subscribers.
 *
 * Note; this is a static class. It's not meant to be instantiated, it merely
 * encapsulates a single static method that does the work.
 */
public final class GatherWhatsApp
{
    /**
     * Filter a collection of phone numbers to WhatsApp subscribers only.
     *
     * This function makes one or more HTTP requests in a blocking manner. Avoid
     * calling this on the UI thread. Instead, execute this code on a separate
     * worker thread.
     *
     * This function operates extremely conservative, meaning that any errors (such
     * as the WhatsApp servers not being available or the format of their GET response
     * having changed) are swallowed silently, simply resulting in an empty list. This
     * can be improved upon, but currently the intended use-case is merely a "nice-to-have"
     * justifying this error handling strategy.
     *
     * @param phoneNumbersAsStrings A collection of phone numbers to be tested.
     * @countryCode Default country code to use for phone numbers that don't have a country
     *              code. Typically this would be the country code of the phone this code is
     *              running on. Do not include prefix '0's or '+'s. (e.g., in the US and Canada
     *              this would simply be "1").
     * @return The subset of phone numbers that are confirmed WhatsApp subscribers.
     */
    public static Enumeration selectMembers(Enumeration phoneNumbersAsStrings, String countryCode)
    {
        String[] batch = new String[_maxPhoneNumbersPerQuery];
        int idx = 0;
        Vector ret = new Vector();
        
        while (phoneNumbersAsStrings.hasMoreElements())
        {
            batch[idx] = (String)phoneNumbersAsStrings.nextElement();
            
            if (++idx >= _maxPhoneNumbersPerQuery)
            {
                processBatch(batch, idx, countryCode, ret);
                idx = 0;
            }
        }
        
        if (idx > 0)
        {
            processBatch(batch, idx, countryCode, ret);
        }
        
        return ret.elements();
    }

    /**
     * Because there's a limit to how many phone numbers can be queried in a
     * single HTTP url encoded GET request, the entire set of phone numbers
     * can be split over multiple requests. This function processes a
     * single batch.
     *
     * @param batch Array of phone numbers.
     * @param count Number of phone numbers to test; <= batch.length()
     * @param ret Vector that accumulates phone numbers of WhatsApp subscribers.
     */
    private static void processBatch(String[] batch, int count, String countryCode, Vector ret)
    {
        URLEncodedPostData urlParams = new URLEncodedPostData(URLEncodedPostData.DEFAULT_CHARSET, false);
        urlParams.append("cd", "1");
        urlParams.append("cc", countryCode);
        urlParams.append("me", _fakeDummyPhoneNumber);
        for (int i = 0; i < count; ++i)
            urlParams.append("u[" + i + "]", batch[i]);            
            
        try
        {
            SaxHandler saxHandler = new SaxHandler(ret);
            parseXmlFromHttpGet(_baseUrl + urlParams.toString(), saxHandler);    
        }
        catch (Exception e) {
            return;
        }        
    }

    /**
     * Performs a single HTTP get request and obtains valid phone numbers.
     *
     * @param url The HTTP url encoded GET request to execute.
     * @param saxHandler The SAX parse event handler that extracts phone numbers
     *                   of WhatsApp subscribers from the HTTP response
     */
    private static void parseXmlFromHttpGet(String url, SaxHandler saxHandler)
    {
        HttpConnection conn = null;
        InputStream in = null;

        try
        {
            conn = (HttpConnection)Connector.open(url);
            conn.setRequestMethod(HttpConnection.GET);
            
            if (conn.getResponseCode() == conn.HTTP_OK)
            {
                in = conn.openInputStream();
                SAXParser saxParser = SAXParserFactory.newInstance().newSAXParser();
                saxParser.parse(in, saxHandler);
            }
        }
        catch (Exception e) {}
        finally
        {
            try { if (in != null) in.close(); } catch(Exception e) {}
            try { if (conn != null) conn.close(); } catch(Exception e) {}
        }
    }

    private static final class SaxHandler extends DefaultHandler
    {        
        public SaxHandler(Vector phoneNumbers)
        {
            _phoneNumbers = phoneNumbers;
        }

        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
        {
            _sb.setLength(0);       
        }
        
        public void endElement(String uri, String localName, String qName) throws SAXException
        {
            String content = _sb.toString();
            if (_nextElementIsPhoneNumber)
            {
                _phoneNumbers.addElement(content.trim());
            }
            
            _nextElementIsPhoneNumber = qName.equals("key") && content.equals("P");
        }

        public void characters(char[] chars, int start, int length) throws SAXException
        {
            _sb.append(chars, start, length);
        }
        
        private StringBuffer _sb = new StringBuffer();
        private boolean _nextElementIsPhoneNumber;         
        private Vector _phoneNumbers;
    }
    
    private static final int _typicalEncodedPhoneNumberLength = 15;
    private static final int _conservativeMaxUrlLength = 2000;
    private static final int _urlMinLength = 100;
    private static final int _maxPhoneNumbersPerQuery = (_conservativeMaxUrlLength - _urlMinLength) / _typicalEncodedPhoneNumberLength;
    private static final String _fakeDummyPhoneNumber = "0000000000";
    private static final String _baseUrl = "https://sro.whatsapp.net/client/iphone/iq.php?";
    private static final String _encUtf8 = "UTF-8";

    /**
     * Private constructor; disables instantiation because
     * this class is only to provide a single static method.
     */
    private GatherWhatsApp() {}      
}
