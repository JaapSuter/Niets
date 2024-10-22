package org.apache.commons.codec.net;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.binary.StringUtils;

public class URLCodec
  implements BinaryEncoder, BinaryDecoder, StringEncoder, StringDecoder
{
  protected static byte ESCAPE_CHAR = 0;
  static final int RADIX = 16;
  protected static final BitSet WWW_FORM_URL = new BitSet(256);
  protected String charset;

  static
  {
    for (int i = 97; i <= 122; i++)
      WWW_FORM_URL.set(i);
    for (int j = 65; j <= 90; j++)
      WWW_FORM_URL.set(j);
    for (int k = 48; k <= 57; k++)
      WWW_FORM_URL.set(k);
    WWW_FORM_URL.set(45);
    WWW_FORM_URL.set(95);
    WWW_FORM_URL.set(46);
    WWW_FORM_URL.set(42);
    WWW_FORM_URL.set(32);
  }

  public URLCodec()
  {
    this("UTF-8");
  }

  public URLCodec(String paramString)
  {
    this.charset = paramString;
  }

  public static final byte[] decodeUrl(byte[] paramArrayOfByte)
    throws DecoderException
  {
    if (paramArrayOfByte == null);
    ByteArrayOutputStream localByteArrayOutputStream;
    for (byte[] arrayOfByte = null; ; arrayOfByte = localByteArrayOutputStream.toByteArray())
    {
      return arrayOfByte;
      localByteArrayOutputStream = new ByteArrayOutputStream();
      int i = 0;
      if (i < paramArrayOfByte.length)
      {
        int j = paramArrayOfByte[i];
        if (j == 43)
          localByteArrayOutputStream.write(32);
        while (true)
        {
          i++;
          break;
          if (j == ESCAPE_CHAR)
          {
            int k = i + 1;
            try
            {
              int m = Utils.digit16(paramArrayOfByte[k]);
              i = k + 1;
              localByteArrayOutputStream.write((char)(Utils.digit16(paramArrayOfByte[i]) + (m << 4)));
            }
            catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
            {
              throw new DecoderException("Invalid URL encoding: ", localArrayIndexOutOfBoundsException);
            }
          }
          else
          {
            localByteArrayOutputStream.write(j);
          }
        }
      }
    }
  }

  public static final byte[] encodeUrl(BitSet paramBitSet, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null);
    ByteArrayOutputStream localByteArrayOutputStream;
    for (byte[] arrayOfByte = null; ; arrayOfByte = localByteArrayOutputStream.toByteArray())
    {
      return arrayOfByte;
      if (paramBitSet == null)
        paramBitSet = WWW_FORM_URL;
      localByteArrayOutputStream = new ByteArrayOutputStream();
      int i = 0;
      if (i < paramArrayOfByte.length)
      {
        int j = paramArrayOfByte[i];
        if (j < 0)
          j += 256;
        if (paramBitSet.get(j))
        {
          if (j == 32)
            j = 43;
          localByteArrayOutputStream.write(j);
        }
        while (true)
        {
          i++;
          break;
          localByteArrayOutputStream.write(ESCAPE_CHAR);
          int k = Character.toUpperCase(Character.forDigit(0xF & j >> 4, 16));
          int m = Character.toUpperCase(Character.forDigit(j & 0xF, 16));
          localByteArrayOutputStream.write(k);
          localByteArrayOutputStream.write(m);
        }
      }
    }
  }

  public Object decode(Object paramObject)
    throws DecoderException
  {
    Object localObject;
    if (paramObject == null)
      localObject = null;
    while (true)
    {
      return localObject;
      if ((paramObject instanceof byte[]))
      {
        localObject = decode((byte[])paramObject);
      }
      else
      {
        if (!(paramObject instanceof String))
          break;
        localObject = decode((String)paramObject);
      }
    }
    throw new DecoderException("Objects of type " + paramObject.getClass().getName() + " cannot be URL decoded");
  }

  public String decode(String paramString)
    throws DecoderException
  {
    Object localObject;
    if (paramString == null)
      localObject = null;
    while (true)
    {
      return localObject;
      try
      {
        String str = decode(paramString, getDefaultCharset());
        localObject = str;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        throw new DecoderException(localUnsupportedEncodingException.getMessage(), localUnsupportedEncodingException);
      }
    }
  }

  public String decode(String paramString1, String paramString2)
    throws DecoderException, UnsupportedEncodingException
  {
    if (paramString1 == null);
    for (String str = null; ; str = new String(decode(StringUtils.getBytesUsAscii(paramString1)), paramString2))
      return str;
  }

  public byte[] decode(byte[] paramArrayOfByte)
    throws DecoderException
  {
    return decodeUrl(paramArrayOfByte);
  }

  public Object encode(Object paramObject)
    throws EncoderException
  {
    Object localObject;
    if (paramObject == null)
      localObject = null;
    while (true)
    {
      return localObject;
      if ((paramObject instanceof byte[]))
      {
        localObject = encode((byte[])paramObject);
      }
      else
      {
        if (!(paramObject instanceof String))
          break;
        localObject = encode((String)paramObject);
      }
    }
    throw new EncoderException("Objects of type " + paramObject.getClass().getName() + " cannot be URL encoded");
  }

  public String encode(String paramString)
    throws EncoderException
  {
    Object localObject;
    if (paramString == null)
      localObject = null;
    while (true)
    {
      return localObject;
      try
      {
        String str = encode(paramString, getDefaultCharset());
        localObject = str;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        throw new EncoderException(localUnsupportedEncodingException.getMessage(), localUnsupportedEncodingException);
      }
    }
  }

  public String encode(String paramString1, String paramString2)
    throws UnsupportedEncodingException
  {
    if (paramString1 == null);
    for (String str = null; ; str = StringUtils.newStringUsAscii(encode(paramString1.getBytes(paramString2))))
      return str;
  }

  public byte[] encode(byte[] paramArrayOfByte)
  {
    return encodeUrl(WWW_FORM_URL, paramArrayOfByte);
  }

  public String getDefaultCharset()
  {
    return this.charset;
  }

  public String getEncoding()
  {
    return this.charset;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     org.apache.commons.codec.net.URLCodec
 * JD-Core Version:    0.6.1
 */