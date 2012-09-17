package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.binary.StringUtils;

abstract class RFC1522Codec
{
  protected static final String POSTFIX = "?=";
  protected static final String PREFIX = "=?";
  protected static final char SEP = '?';

  protected String decodeText(String paramString)
    throws DecoderException, UnsupportedEncodingException
  {
    if (paramString == null);
    String str1;
    int n;
    for (String str3 = null; ; str3 = new String(doDecoding(StringUtils.getBytesUsAscii(paramString.substring(n, paramString.indexOf('?', n)))), str1))
    {
      return str3;
      if ((!paramString.startsWith("=?")) || (!paramString.endsWith("?=")))
        throw new DecoderException("RFC 1522 violation: malformed encoded content");
      int i = -2 + paramString.length();
      int j = paramString.indexOf('?', 2);
      if (j == i)
        throw new DecoderException("RFC 1522 violation: charset token not found");
      str1 = paramString.substring(2, j);
      if (str1.equals(""))
        throw new DecoderException("RFC 1522 violation: charset not specified");
      int k = j + 1;
      int m = paramString.indexOf('?', k);
      if (m == i)
        throw new DecoderException("RFC 1522 violation: encoding token not found");
      String str2 = paramString.substring(k, m);
      if (!getEncoding().equalsIgnoreCase(str2))
        throw new DecoderException("This codec cannot decode " + str2 + " encoded content");
      n = m + 1;
    }
  }

  protected abstract byte[] doDecoding(byte[] paramArrayOfByte)
    throws DecoderException;

  protected abstract byte[] doEncoding(byte[] paramArrayOfByte)
    throws EncoderException;

  protected String encodeText(String paramString1, String paramString2)
    throws EncoderException, UnsupportedEncodingException
  {
    if (paramString1 == null);
    StringBuffer localStringBuffer;
    for (String str = null; ; str = localStringBuffer.toString())
    {
      return str;
      localStringBuffer = new StringBuffer();
      localStringBuffer.append("=?");
      localStringBuffer.append(paramString2);
      localStringBuffer.append('?');
      localStringBuffer.append(getEncoding());
      localStringBuffer.append('?');
      localStringBuffer.append(StringUtils.newStringUsAscii(doEncoding(paramString1.getBytes(paramString2))));
      localStringBuffer.append("?=");
    }
  }

  protected abstract String getEncoding();
}