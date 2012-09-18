// Copyright 2012, Jaap Suter - This file is subject to the
// terms and conditions defined in file LICENSE.md, which
// is part of the package - or contact license@jaapsuter.com
package com.jaapsuter.niets.md5;

import java.util.Hashtable;

import com.jaapsuter.niets.*;


public class MD5Sasl {

    public static class Challenge
    {
        public String nonce;
        public String qop;
    }

    public static class Response
    {
        public String cnonce;
        public String response;
        public String username;
        public String realm;
        public static final String nc = "00000001";
    }

    private static Hashtable decodeParameters(String commaListOfAssignedPairs)
    {

        String[] parameters = StringUtil.split(commaListOfAssignedPairs, ",");
        Hashtable ret = new Hashtable();
        for (int i = 0; i < parameters.length; ++i)
        {
            String[] keyValue = StringUtil.split(parameters[i], "=");
            ret.put(keyValue[0], StringUtil.unquote(keyValue[1]));
        }

        return ret;
    }

    public static Challenge decode(String commaListOfAssignedPairs)
    {
        final Hashtable parameters = decodeParameters(commaListOfAssignedPairs);

        return new Challenge() {{
            nonce = HashtableUtil.get(parameters, "nonce");
            qop = HashtableUtil.get(parameters, "qop");
        }};
    }

    public static String respond(Challenge challenge, String username, String password, String realm)
    {
        String cnonce = "aa7415ff-BA5E-1018-2012-f3f188f6678a"; // StringUtil.GenerateUuidish();

        Response response = calculate(challenge, username, password, realm, cnonce);
        return encode(challenge, response);
    }


    private static String encode(Challenge challenge, Response response)
    {
        return new StringBuffer()
                .append("username=")
                .append(response.username)
                .append(",nonce=")
                .append(challenge.nonce)
                .append(",digest-uri=xmpp/")
                .append(response.realm)
                .append(",realm=")
                .append(response.realm)
                .append(",qop=")
                .append(challenge.qop)
                .append(",cnonce=")
                .append(response.cnonce)
                .append(",nc=")
                .append(response.nc)
                .append(",response=")
                .append(response.response)
                .toString();


    }

    private static Response calculate(Challenge challenge, String username, String password, String realm, String cnonce)
    {
        final byte[] prefixHA1 = new MD5(CalculatePrefixHA1(username, realm, password)).doFinal();
        final byte[] ha1 = new MD5(CalculateHA1(prefixHA1, challenge.nonce, cnonce)).doFinal();
        final byte[] ha2 = new MD5(CalculateHA2(realm)).doFinal();

        Response response = new Response();
        response.response = StringUtil.byteArrayToHexString(
                                new MD5(new StringBuffer()
                                        .append(StringUtil.byteArrayToHexString(ha1))
                                        .append(':')
                                        .append(challenge.nonce)
                                        .append(':')
                                        .append(response.nc)
                                        .append(':')
                                        .append(cnonce)
                                        .append(':')
                                        .append(challenge.qop)
                                        .append(':')
                                        .append(StringUtil.byteArrayToHexString(ha2))
                                        .toString()
                                ).doFinal());
        response.realm = realm;
        response.cnonce = cnonce;
        response.username = username;

        return response;
    }

    private static byte[] CalculatePrefixHA1(String username, String realm, String password)
    {
        return StringUtil.getBytesUTF8(new StringBuffer(username).append(':').append(realm).append(':').append(password));
    }

    private static byte[] CalculateHA1(byte[] prefixHA1, String nonce, String cnonce)
    {
        return ArrayUtil.concat(prefixHA1, StringUtil.getBytesUTF8(new StringBuffer().append(':').append(nonce).append(':').append(cnonce)));
    }

    private static byte[] CalculateHA2(String realm)
    {
        return StringUtil.getBytesUTF8(new StringBuffer("AUTHENTICATE:xmpp/").append(realm));
    }

    public static void test()
    {
        Challenge challenge = new Challenge() {{
            nonce = "392616736";
            qop = "auth";
        }};

        String realm = "osXstream.local";
        String username = "test";
        String password = "secret";
        String cnonce = "05E0A6E7-0B7B-4430-9549-0FE1C244ABAB";

        Response response = MD5Sasl.calculate(challenge, username, password, realm, cnonce);

        Assert.Equal(response.cnonce, cnonce);
        Assert.Equal(response.realm, realm);
        Assert.Equal(response.response, "37991b870e0f6cc757ec74c47877472b");
        Assert.Equal(response.username, username);
    }
}