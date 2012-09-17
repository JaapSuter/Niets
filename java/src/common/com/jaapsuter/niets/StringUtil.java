package com.jaapsuter.niets;

import java.io.UnsupportedEncodingException;
import java.util.Random;

public class StringUtil {
    private StringUtil() {}

    public static String GenerateUuidish() {

        return new StringBuffer()
                .append(zeroPad(Long.toString(_random.nextLong()), 8))
                .append("-BA5E-1018-2012-")
                .append(zeroPad(Long.toString(_random.nextLong()), 12))
                .toString();

    }

    public static String zeroPad(String str, int size) {
        String s = "0000000000" + str;
        return s.substring(s.length() - size);
    }

    public static String unquote(String str) {
        if (str.charAt(0) == '"')
            str = str.substring(1);
        if (str.charAt(str.length() - 1) == '"')
            str = str.substring(0, str.length() - 1);
        return str;
    }

    public static byte[] hexStringToByteArray(String hex) {
        byte[] bts = new byte[hex.length() / 2];
        for (int i = 0; i < bts.length; i++) {
            bts[i] = (byte) Integer.parseInt(hex.substring(2 * i, 2 * i + 2), 16);
        }
        return bts;
    }

    public static String byteArrayToHexString(byte[] bytes) {
        return byteArrayToHexString(bytes,  0);
    }
    

    public static String byteArrayToHexString(byte[] bytes, int offset) {
        StringBuffer sb = new StringBuffer(bytes.length * 2);
        for (int i = offset; i < bytes.length; i++) {
            sb.append(toHex(bytes[i] >> 4));
            sb.append(toHex(bytes[i]));
        }

        return sb.toString();
    }
    
    public static String byteArrayToString(byte[] bytes) {
        StringBuffer sb = new StringBuffer(bytes.length);
        for (int i = 0; i < bytes.length; i++) {
            sb.append(toHex(bytes[i]));
        }

        return sb.toString();
    }

    private static char toHex(int nibble) {
        final char[] hexDigit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        return hexDigit[nibble & 0xF];
    }

    public static String[] split(String strString, String strDelimiter) {
        String[] strArray;
        int iOccurrences = 0;
        int iIndexOfInnerString = 0;
        int iIndexOfDelimiter = 0;
        int iCounter = 0;

        //Check for null input strings.
        if (strString == null) {
            throw new IllegalArgumentException("Input string cannot be null.");
        }
        //Check for null or empty delimiter strings.
        if (strDelimiter.length() <= 0 || strDelimiter == null) {
            throw new IllegalArgumentException("Delimeter cannot be null or empty.");
        }

        if (strString.startsWith(strDelimiter)) {
            strString = strString.substring(strDelimiter.length());
        }

        //If strString does not end with the delimiter then add it
        //to the string in order to comply with the desired format.
        if (!strString.endsWith(strDelimiter)) {
            strString += strDelimiter;
        }

        //Count occurrences of the delimiter in the string.
        //Occurrences should be the same amount of inner strings.
        while((iIndexOfDelimiter = strString.indexOf(strDelimiter,
                iIndexOfInnerString)) != -1) {
            iOccurrences += 1;
            iIndexOfInnerString = iIndexOfDelimiter +
                    strDelimiter.length();
        }

        //Declare the array with the correct size.
        strArray = new String[iOccurrences];

        //Reset the indices.
        iIndexOfInnerString = 0;
        iIndexOfDelimiter = 0;

        //Walk across the string again and this time add the
        //strings to the array.
        while((iIndexOfDelimiter = strString.indexOf(strDelimiter,
                iIndexOfInnerString)) != -1) {

            //Add string to array.
            strArray[iCounter] = strString.substring(iIndexOfInnerString,iIndexOfDelimiter);

            //Increment the index to the next character after
            //the next delimiter.
            iIndexOfInnerString = iIndexOfDelimiter +
                    strDelimiter.length();

            //Inc the counter.
            iCounter += 1;
        }

        return strArray;
    }

    public static byte[] getBytesUTF8(StringBuffer sb)
    {
        return getBytesUTF8(sb.toString());
    }

    public static byte[] getBytesUTF8(String s)
    {
        try {
            return s.toString().getBytes("UTF-8");
        }
        catch (UnsupportedEncodingException uee)
        {
            throw new Error("UTF-8 encoding not supported.");
        }
    }

    private static Random _random = new Random();


}
