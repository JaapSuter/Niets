package org.apache.commons.codec.binary;

import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

public class BinaryCodec
  implements BinaryDecoder, BinaryEncoder
{
  private static final int[] BITS = arrayOfInt;
  private static final int BIT_0 = 1;
  private static final int BIT_1 = 2;
  private static final int BIT_2 = 4;
  private static final int BIT_3 = 8;
  private static final int BIT_4 = 16;
  private static final int BIT_5 = 32;
  private static final int BIT_6 = 64;
  private static final int BIT_7 = 128;
  private static final byte[] EMPTY_BYTE_ARRAY;
  private static final char[] EMPTY_CHAR_ARRAY = new char[0];

  static
  {
    EMPTY_BYTE_ARRAY = new byte[0];
    int[] arrayOfInt = new int[8];
    arrayOfInt[0] = 1;
    arrayOfInt[1] = 2;
    arrayOfInt[2] = 4;
    arrayOfInt[3] = 8;
    arrayOfInt[4] = 16;
    arrayOfInt[5] = 32;
    arrayOfInt[6] = 64;
    arrayOfInt[7] = 128;
  }

  public static byte[] fromAscii(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte;
    if (isEmpty(paramArrayOfByte))
      arrayOfByte = EMPTY_BYTE_ARRAY;
    while (true)
    {
      return arrayOfByte;
      arrayOfByte = new byte[paramArrayOfByte.length >> 3];
      int i = 0;
      for (int j = -1 + paramArrayOfByte.length; i < arrayOfByte.length; j -= 8)
      {
        for (int k = 0; k < BITS.length; k++)
          if (paramArrayOfByte[(j - k)] == 49)
            arrayOfByte[i] = (byte)(arrayOfByte[i] | BITS[k]);
        i++;
      }
    }
  }

  public static byte[] fromAscii(char[] paramArrayOfChar)
  {
    byte[] arrayOfByte;
    if ((paramArrayOfChar == null) || (paramArrayOfChar.length == 0))
      arrayOfByte = EMPTY_BYTE_ARRAY;
    while (true)
    {
      return arrayOfByte;
      arrayOfByte = new byte[paramArrayOfChar.length >> 3];
      int i = 0;
      for (int j = -1 + paramArrayOfChar.length; i < arrayOfByte.length; j -= 8)
      {
        for (int k = 0; k < BITS.length; k++)
          if (paramArrayOfChar[(j - k)] == '1')
            arrayOfByte[i] = (byte)(arrayOfByte[i] | BITS[k]);
        i++;
      }
    }
  }

  private static boolean isEmpty(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static byte[] toAsciiBytes(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte;
    if (isEmpty(paramArrayOfByte))
      arrayOfByte = EMPTY_BYTE_ARRAY;
    while (true)
    {
      return arrayOfByte;
      arrayOfByte = new byte[paramArrayOfByte.length << 3];
      int i = 0;
      for (int j = -1 + arrayOfByte.length; i < paramArrayOfByte.length; j -= 8)
      {
        int k = 0;
        if (k < BITS.length)
        {
          if ((paramArrayOfByte[i] & BITS[k]) == 0)
            arrayOfByte[(j - k)] = 48;
          while (true)
          {
            k++;
            break;
            arrayOfByte[(j - k)] = 49;
          }
        }
        i++;
      }
    }
  }

  public static char[] toAsciiChars(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar;
    if (isEmpty(paramArrayOfByte))
      arrayOfChar = EMPTY_CHAR_ARRAY;
    while (true)
    {
      return arrayOfChar;
      arrayOfChar = new char[paramArrayOfByte.length << 3];
      int i = 0;
      for (int j = -1 + arrayOfChar.length; i < paramArrayOfByte.length; j -= 8)
      {
        int k = 0;
        if (k < BITS.length)
        {
          if ((paramArrayOfByte[i] & BITS[k]) == 0)
            arrayOfChar[(j - k)] = '0';
          while (true)
          {
            k++;
            break;
            arrayOfChar[(j - k)] = '1';
          }
        }
        i++;
      }
    }
  }

  public static String toAsciiString(byte[] paramArrayOfByte)
  {
    return new String(toAsciiChars(paramArrayOfByte));
  }

  public Object decode(Object paramObject)
    throws DecoderException
  {
    byte[] arrayOfByte;
    if (paramObject == null)
      arrayOfByte = EMPTY_BYTE_ARRAY;
    while (true)
    {
      return arrayOfByte;
      if ((paramObject instanceof byte[]))
      {
        arrayOfByte = fromAscii((byte[])paramObject);
      }
      else if ((paramObject instanceof char[]))
      {
        arrayOfByte = fromAscii((char[])paramObject);
      }
      else
      {
        if (!(paramObject instanceof String))
          break;
        arrayOfByte = fromAscii(((String)paramObject).toCharArray());
      }
    }
    throw new DecoderException("argument not a byte array");
  }

  public byte[] decode(byte[] paramArrayOfByte)
  {
    return fromAscii(paramArrayOfByte);
  }

  public Object encode(Object paramObject)
    throws EncoderException
  {
    if (!(paramObject instanceof byte[]))
      throw new EncoderException("argument not a byte array");
    return toAsciiChars((byte[])paramObject);
  }

  public byte[] encode(byte[] paramArrayOfByte)
  {
    return toAsciiBytes(paramArrayOfByte);
  }

  public byte[] toByteArray(String paramString)
  {
    if (paramString == null);
    for (byte[] arrayOfByte = EMPTY_BYTE_ARRAY; ; arrayOfByte = fromAscii(paramString.toCharArray()))
      return arrayOfByte;
  }
}