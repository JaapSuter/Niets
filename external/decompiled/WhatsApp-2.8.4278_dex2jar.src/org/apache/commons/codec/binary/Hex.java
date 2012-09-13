package org.apache.commons.codec.binary;

import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

public class Hex
  implements BinaryEncoder, BinaryDecoder
{
  public static final String DEFAULT_CHARSET_NAME = "UTF-8";
  private static final char[] DIGITS_LOWER;
  private static final char[] DIGITS_UPPER = arrayOfChar2;
  private final String charsetName;

  static
  {
    char[] arrayOfChar1 = new char[16];
    arrayOfChar1[0] = 48;
    arrayOfChar1[1] = 49;
    arrayOfChar1[2] = 50;
    arrayOfChar1[3] = 51;
    arrayOfChar1[4] = 52;
    arrayOfChar1[5] = 53;
    arrayOfChar1[6] = 54;
    arrayOfChar1[7] = 55;
    arrayOfChar1[8] = 56;
    arrayOfChar1[9] = 57;
    arrayOfChar1[10] = 97;
    arrayOfChar1[11] = 98;
    arrayOfChar1[12] = 99;
    arrayOfChar1[13] = 100;
    arrayOfChar1[14] = 101;
    arrayOfChar1[15] = 102;
    DIGITS_LOWER = arrayOfChar1;
    char[] arrayOfChar2 = new char[16];
    arrayOfChar2[0] = 48;
    arrayOfChar2[1] = 49;
    arrayOfChar2[2] = 50;
    arrayOfChar2[3] = 51;
    arrayOfChar2[4] = 52;
    arrayOfChar2[5] = 53;
    arrayOfChar2[6] = 54;
    arrayOfChar2[7] = 55;
    arrayOfChar2[8] = 56;
    arrayOfChar2[9] = 57;
    arrayOfChar2[10] = 65;
    arrayOfChar2[11] = 66;
    arrayOfChar2[12] = 67;
    arrayOfChar2[13] = 68;
    arrayOfChar2[14] = 69;
    arrayOfChar2[15] = 70;
  }

  public Hex()
  {
    this.charsetName = "UTF-8";
  }

  public Hex(String paramString)
  {
    this.charsetName = paramString;
  }

  public static byte[] decodeHex(char[] paramArrayOfChar)
    throws DecoderException
  {
    int i = paramArrayOfChar.length;
    if ((i & 0x1) != 0)
      throw new DecoderException("Odd number of characters.");
    byte[] arrayOfByte = new byte[i >> 1];
    int j = 0;
    int k = 0;
    while (k < i)
    {
      int m = toDigit(paramArrayOfChar[k], k) << 4;
      int n = k + 1;
      int i1 = m | toDigit(paramArrayOfChar[n], n);
      k = n + 1;
      arrayOfByte[j] = (byte)(i1 & 0xFF);
      j++;
    }
    return arrayOfByte;
  }

  public static char[] encodeHex(byte[] paramArrayOfByte)
  {
    return encodeHex(paramArrayOfByte, true);
  }

  public static char[] encodeHex(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if (paramBoolean);
    for (char[] arrayOfChar = DIGITS_LOWER; ; arrayOfChar = DIGITS_UPPER)
      return encodeHex(paramArrayOfByte, arrayOfChar);
  }

  protected static char[] encodeHex(byte[] paramArrayOfByte, char[] paramArrayOfChar)
  {
    int i = paramArrayOfByte.length;
    char[] arrayOfChar = new char[i << 1];
    int j = 0;
    int k = 0;
    while (j < i)
    {
      int m = k + 1;
      arrayOfChar[k] = paramArrayOfChar[((0xF0 & paramArrayOfByte[j]) >>> 4)];
      k = m + 1;
      arrayOfChar[m] = paramArrayOfChar[(0xF & paramArrayOfByte[j])];
      j++;
    }
    return arrayOfChar;
  }

  public static String encodeHexString(byte[] paramArrayOfByte)
  {
    return new String(encodeHex(paramArrayOfByte));
  }

  protected static int toDigit(char paramChar, int paramInt)
    throws DecoderException
  {
    int i = Character.digit(paramChar, 16);
    if (i == -1)
      throw new DecoderException("Illegal hexadecimal charcter " + paramChar + " at index " + paramInt);
    return i;
  }

  public Object decode(Object paramObject)
    throws DecoderException
  {
    try
    {
      if ((paramObject instanceof String));
      char[] arrayOfChar;
      for (Object localObject = ((String)paramObject).toCharArray(); ; localObject = arrayOfChar)
      {
        return decodeHex((char[])localObject);
        arrayOfChar = (char[])paramObject;
      }
    }
    catch (ClassCastException localClassCastException)
    {
      throw new DecoderException(localClassCastException.getMessage(), localClassCastException);
    }
  }

  public byte[] decode(byte[] paramArrayOfByte)
    throws DecoderException
  {
    try
    {
      byte[] arrayOfByte = decodeHex(new String(paramArrayOfByte, getCharsetName()).toCharArray());
      return arrayOfByte;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new DecoderException(localUnsupportedEncodingException.getMessage(), localUnsupportedEncodingException);
    }
  }

  public Object encode(Object paramObject)
    throws EncoderException
  {
    try
    {
      if ((paramObject instanceof String));
      byte[] arrayOfByte;
      for (Object localObject = ((String)paramObject).getBytes(getCharsetName()); ; localObject = arrayOfByte)
      {
        return encodeHex((byte[])localObject);
        arrayOfByte = (byte[])paramObject;
      }
    }
    catch (ClassCastException localClassCastException)
    {
      throw new EncoderException(localClassCastException.getMessage(), localClassCastException);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new EncoderException(localUnsupportedEncodingException.getMessage(), localUnsupportedEncodingException);
    }
  }

  public byte[] encode(byte[] paramArrayOfByte)
  {
    return StringUtils.getBytesUnchecked(encodeHexString(paramArrayOfByte), getCharsetName());
  }

  public String getCharsetName()
  {
    return this.charsetName;
  }

  public String toString()
  {
    return super.toString() + "[charsetName=" + this.charsetName + "]";
  }
}