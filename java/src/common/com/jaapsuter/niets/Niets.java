// Copyright 2012, Jaap Suter - This file is subject to the
// terms and conditions defined in file LICENSE.md, which
// is part of the package - or contact license@jaapsuter.com

package com.jaapsuter.niets;

import com.jaapsuter.niets.md5.*;
import com.jaapsuter.niets.xmpp.*;
import com.airg.hookt.network.intel.GatherWhatsApp;
import java.util.Vector;
import java.util.Random;
import java.util.Enumeration;
import javax.microedition.pim.*;
import net.rim.blackberry.api.pdap.*; 

public final class Niets
{
    public static void run() {
        // MD5Sasl.test();
        // Decoder.test();

        // String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><!DOCTYPE plist PUBLIC \"-//Apple//DTD PLIST 1.0//EN\" \"http://www.apple.com/DTDs/PropertyList-1.0.dtd\"><plist version=\"1.0\"><array>\t<dict>\t\t<key>P</key>\t\t<string>16043135227</string>\t\t<key>T</key>\t\t<integer>164362</integer>\t\t<key>S</key>\t\t<string>*** no status ***</string>\t\t<key>JID</key>\t\t<string>16043135227</string>\t\t<key>NP</key>\t\t<true/>\t</dict>\t<dict>\t\t<key>P</key>\t\t<string>6045646511</string>\t\t<key>T</key>\t\t<integer>65752</integer>\t\t<key>S</key>\t\t<string>N/A</string>\t\t<key>JID</key>\t\t<string>16045646511</string>\t\t<key>NP</key>\t\t<true/>\t</dict></array></plist>\n";
        // parseWhatsAppMemberQueryResponse(xml);
        
        Enumeration phoneNumbers = getPhoneNumbers();
        
        final Vector testPhoneNumbers = new Vector() {{
            
            addElement("6043135227");
            addElement("6045646511");
            addElement("61416905612");
            addElement("16043135227");
            addElement("31234567890");
            addElement("14443332222");
            addElement("16045646511");
        }};
        
        final int maxTestPhoneNumbers = 6000;
        final int testPhoneNumberLength = 11;
        Random rand = new Random();
        for (int i = 0; i < maxTestPhoneNumbers; ++i)
        {
            testPhoneNumbers.addElement(generateRandomPhoneNumber(testPhoneNumberLength, rand));
        }       
        
        phoneNumbers = testPhoneNumbers.elements();
        
        final String countryCode = "1";
        Enumeration members = GatherWhatsApp.selectMembers(phoneNumbers, countryCode);
        
        while (members.hasMoreElements())
        {
            System.out.println((String)members.nextElement());
        }
    }
    
    private static String generateRandomPhoneNumber(int len, Random rand)
    {
        StringBuffer sb = new StringBuffer(len);
        for (int i = 0; i < len; ++i)
        {
            final int exclusiveUpperBound = 10;
            sb.append(rand.nextInt(exclusiveUpperBound));
        }
        return sb.toString();        
    }
    
    private static Enumeration getPhoneNumbers()
    {   
        Vector ret = new Vector();
        try {
            BlackBerryContactList contactList = (BlackBerryContactList)PIM.getInstance().openPIMList(PIM.CONTACT_LIST, PIM.READ_ONLY);
            
            if (!contactList.isSupportedField(BlackBerryContact.TEL))
                return ret.elements();
                
            Enumeration e = contactList.items();
            while (e.hasMoreElements()) {
                BlackBerryContact contact = (BlackBerryContact) e.nextElement();
                int phoneNrCount = contact.countValues(BlackBerryContact.TEL);
                for (int i = 0; i < phoneNrCount; i++) {
                    String phoneNr = contact.getString(BlackBerryContact.TEL, i);
                    if (phoneNr != null) {
                        ret.addElement(phoneNr.trim());
                    }
                }
            }
        } catch (PIMException ex) {}
        
        return ret.elements();
    }
}
