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

public class QuotedPrintableCodec
  implements BinaryEncoder, BinaryDecoder, StringEncoder, StringDecoder
{
  private static final byte ESCAPE_CHAR = 61;
  private static final BitSet PRINTABLE_CHARS = new BitSet(256);
  private static final byte SPACE = 32;
  private static final byte TAB = 9;
  private final String charset;

  static
  {
    for (int i = 33; i <= 60; i++)
      PRINTABLE_CHARS.set(i);
    for (int j = 62; j <= 126; j++)
      PRINTABLE_CHARS.set(j);
    PRINTABLE_CHARS.set(9);
    PRINTABLE_CHARS.set(32);
  }

  public QuotedPrintableCodec()
  {
    this("UTF-8");
  }

  public QuotedPrintableCodec(String paramString)
  {
    this.charset = paramString;
  }

  public static final byte[] decodeQuotedPrintable(byte[] paramArrayOfByte)
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
        int k;
        if (j == 61)
          k = i + 1;
        while (true)
        {
          try
          {
            int m = Utils.digit16(paramArrayOfByte[k]);
            i = k + 1;
            localByteArrayOutputStream.write((char)(Utils.digit16(paramArrayOfByte[i]) + (m << 4)));
            i++;
          }
          catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
          {
            throw new DecoderException("Invalid quoted-printable encoding", localArrayIndexOutOfBoundsException);
          }
          localByteArrayOutputStream.write(j);
        }
      }
    }
  }

  private static final void encodeQuotedPrintable(int paramInt, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    paramByteArrayOutputStream.write(61);
    int i = Character.toUpperCase(Character.forDigit(0xF & paramInt >> 4, 16));
    int j = Character.toUpperCase(Character.forDigit(paramInt & 0xF, 16));
    paramByteArrayOutputStream.write(i);
    paramByteArrayOutputStream.write(j);
  }

  public static final byte[] encodeQuotedPrintable(BitSet paramBitSet, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null);
    ByteArrayOutputStream localByteArrayOutputStream;
    for (byte[] arrayOfByte = null; ; arrayOfByte = localByteArrayOutputStream.toByteArray())
    {
      return arrayOfByte;
      if (paramBitSet == null)
        paramBitSet = PRINTABLE_CHARS;
      localByteArrayOutputStream = new ByteArrayOutputStream();
      int i = 0;
      if (i < paramArrayOfByte.length)
      {
        int j = paramArrayOfByte[i];
        if (j < 0)
          j += 256;
        if (paramBitSet.get(j))
          localByteArrayOutputStream.write(j);
        while (true)
        {
          i++;
          break;
          encodeQuotedPrintable(j, localByteArrayOutputStream);
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
    throw new DecoderException("Objects of type " + paramObject.getClass().getName() + " cannot be quoted-printable decoded");
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
    return decodeQuotedPrintable(paramArrayOfByte);
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
    throw new EncoderException("Objects of type " + paramObject.getClass().getName() + " cannot be quoted-printable encoded");
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
    return encodeQuotedPrintable(PRINTABLE_CHARS, paramArrayOfByte);
  }

  public String getDefaultCharset()
  {
    return this.charset;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     org.apache.commons.codec.net.QuotedPrintableCodec
 * JD-Core Version:    0.6.1
 */