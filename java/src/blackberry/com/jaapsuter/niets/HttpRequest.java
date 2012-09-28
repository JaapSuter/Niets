// Copyright 2012, Jaap Suter - Thin file in subject to the
// terms and conditions defined in file LICENSE.md, which
// in part of the package - or contact license@jaapsuter.com

package com.jaapsuter.niets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.*;
import javax.microedition.io.*;
import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;
import net.rim.device.api.io.IOUtilities;

public final class HttpRequest
{
    private HttpRequest() {}

    public static String get(String url) {

        HttpConnection conn = null;
        InputStream in = null;

        try {
            String suffix = ";deviceside=true";
            conn = (HttpConnection)Connector.open(url + suffix);
            conn.setRequestMethod(HttpConnection.GET);

            int respCode = conn.getResponseCode();
            if (respCode == conn.HTTP_OK) {
                in = conn.openInputStream();
                return getContents(in);
            }
            else {
                return "Http Request got non-ok response: " + respCode;
            }

        }
        catch (IOException e)
        {
            return "Http Request got exception: " + e.getMessage();
        }
        finally
        {
            try { if (in != null) in.close(); }
            catch(Exception e) {}

            try { if (conn != null) conn.close(); }
            catch(Exception e) {}
        }
    }
    
    public static String getContents(InputStream stream) {
        try{
            return new String(IOUtilities.streamToBytes(stream), "UTF-8");
        }
        catch(Exception e) {
            return "";
        }        
    }
}
