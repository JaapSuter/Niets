package org.apache.commons.codec.binary;

import java.math.BigInteger;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

public class Base64
  implements BinaryEncoder, BinaryDecoder
{
  static final byte[] CHUNK_SEPARATOR;
  static final int CHUNK_SIZE = 76;
  private static final byte[] DECODE_TABLE = arrayOfByte4;
  private static final int DEFAULT_BUFFER_RESIZE_FACTOR = 2;
  private static final int DEFAULT_BUFFER_SIZE = 8192;
  private static final int MASK_6BITS = 63;
  private static final int MASK_8BITS = 255;
  private static final byte PAD = 61;
  private static final byte[] STANDARD_ENCODE_TABLE;
  private static final byte[] URL_SAFE_ENCODE_TABLE;
  private byte[] buffer;
  private int currentLinePos;
  private final int decodeSize;
  private final int encodeSize;
  private final byte[] encodeTable;
  private boolean eof;
  private final int lineLength;
  private final byte[] lineSeparator;
  private int modulus;
  private int pos;
  private int readPos;
  private int x;

  static
  {
    byte[] arrayOfByte1 = new byte[2];
    arrayOfByte1[0] = 13;
    arrayOfByte1[1] = 10;
    CHUNK_SEPARATOR = arrayOfByte1;
    byte[] arrayOfByte2 = new byte[64];
    arrayOfByte2[0] = 65;
    arrayOfByte2[1] = 66;
    arrayOfByte2[2] = 67;
    arrayOfByte2[3] = 68;
    arrayOfByte2[4] = 69;
    arrayOfByte2[5] = 70;
    arrayOfByte2[6] = 71;
    arrayOfByte2[7] = 72;
    arrayOfByte2[8] = 73;
    arrayOfByte2[9] = 74;
    arrayOfByte2[10] = 75;
    arrayOfByte2[11] = 76;
    arrayOfByte2[12] = 77;
    arrayOfByte2[13] = 78;
    arrayOfByte2[14] = 79;
    arrayOfByte2[15] = 80;
    arrayOfByte2[16] = 81;
    arrayOfByte2[17] = 82;
    arrayOfByte2[18] = 83;
    arrayOfByte2[19] = 84;
    arrayOfByte2[20] = 85;
    arrayOfByte2[21] = 86;
    arrayOfByte2[22] = 87;
    arrayOfByte2[23] = 88;
    arrayOfByte2[24] = 89;
    arrayOfByte2[25] = 90;
    arrayOfByte2[26] = 97;
    arrayOfByte2[27] = 98;
    arrayOfByte2[28] = 99;
    arrayOfByte2[29] = 100;
    arrayOfByte2[30] = 101;
    arrayOfByte2[31] = 102;
    arrayOfByte2[32] = 103;
    arrayOfByte2[33] = 104;
    arrayOfByte2[34] = 105;
    arrayOfByte2[35] = 106;
    arrayOfByte2[36] = 107;
    arrayOfByte2[37] = 108;
    arrayOfByte2[38] = 109;
    arrayOfByte2[39] = 110;
    arrayOfByte2[40] = 111;
    arrayOfByte2[41] = 112;
    arrayOfByte2[42] = 113;
    arrayOfByte2[43] = 114;
    arrayOfByte2[44] = 115;
    arrayOfByte2[45] = 116;
    arrayOfByte2[46] = 117;
    arrayOfByte2[47] = 118;
    arrayOfByte2[48] = 119;
    arrayOfByte2[49] = 120;
    arrayOfByte2[50] = 121;
    arrayOfByte2[51] = 122;
    arrayOfByte2[52] = 48;
    arrayOfByte2[53] = 49;
    arrayOfByte2[54] = 50;
    arrayOfByte2[55] = 51;
    arrayOfByte2[56] = 52;
    arrayOfByte2[57] = 53;
    arrayOfByte2[58] = 54;
    arrayOfByte2[59] = 55;
    arrayOfByte2[60] = 56;
    arrayOfByte2[61] = 57;
    arrayOfByte2[62] = 43;
    arrayOfByte2[63] = 47;
    STANDARD_ENCODE_TABLE = arrayOfByte2;
    byte[] arrayOfByte3 = new byte[64];
    arrayOfByte3[0] = 65;
    arrayOfByte3[1] = 66;
    arrayOfByte3[2] = 67;
    arrayOfByte3[3] = 68;
    arrayOfByte3[4] = 69;
    arrayOfByte3[5] = 70;
    arrayOfByte3[6] = 71;
    arrayOfByte3[7] = 72;
    arrayOfByte3[8] = 73;
    arrayOfByte3[9] = 74;
    arrayOfByte3[10] = 75;
    arrayOfByte3[11] = 76;
    arrayOfByte3[12] = 77;
    arrayOfByte3[13] = 78;
    arrayOfByte3[14] = 79;
    arrayOfByte3[15] = 80;
    arrayOfByte3[16] = 81;
    arrayOfByte3[17] = 82;
    arrayOfByte3[18] = 83;
    arrayOfByte3[19] = 84;
    arrayOfByte3[20] = 85;
    arrayOfByte3[21] = 86;
    arrayOfByte3[22] = 87;
    arrayOfByte3[23] = 88;
    arrayOfByte3[24] = 89;
    arrayOfByte3[25] = 90;
    arrayOfByte3[26] = 97;
    arrayOfByte3[27] = 98;
    arrayOfByte3[28] = 99;
    arrayOfByte3[29] = 100;
    arrayOfByte3[30] = 101;
    arrayOfByte3[31] = 102;
    arrayOfByte3[32] = 103;
    arrayOfByte3[33] = 104;
    arrayOfByte3[34] = 105;
    arrayOfByte3[35] = 106;
    arrayOfByte3[36] = 107;
    arrayOfByte3[37] = 108;
    arrayOfByte3[38] = 109;
    arrayOfByte3[39] = 110;
    arrayOfByte3[40] = 111;
    arrayOfByte3[41] = 112;
    arrayOfByte3[42] = 113;
    arrayOfByte3[43] = 114;
    arrayOfByte3[44] = 115;
    arrayOfByte3[45] = 116;
    arrayOfByte3[46] = 117;
    arrayOfByte3[47] = 118;
    arrayOfByte3[48] = 119;
    arrayOfByte3[49] = 120;
    arrayOfByte3[50] = 121;
    arrayOfByte3[51] = 122;
    arrayOfByte3[52] = 48;
    arrayOfByte3[53] = 49;
    arrayOfByte3[54] = 50;
    arrayOfByte3[55] = 51;
    arrayOfByte3[56] = 52;
    arrayOfByte3[57] = 53;
    arrayOfByte3[58] = 54;
    arrayOfByte3[59] = 55;
    arrayOfByte3[60] = 56;
    arrayOfByte3[61] = 57;
    arrayOfByte3[62] = 45;
    arrayOfByte3[63] = 95;
    URL_SAFE_ENCODE_TABLE = arrayOfByte3;
    byte[] arrayOfByte4 = new byte[123];
    arrayOfByte4[0] = -1;
    arrayOfByte4[1] = -1;
    arrayOfByte4[2] = -1;
    arrayOfByte4[3] = -1;
    arrayOfByte4[4] = -1;
    arrayOfByte4[5] = -1;
    arrayOfByte4[6] = -1;
    arrayOfByte4[7] = -1;
    arrayOfByte4[8] = -1;
    arrayOfByte4[9] = -1;
    arrayOfByte4[10] = -1;
    arrayOfByte4[11] = -1;
    arrayOfByte4[12] = -1;
    arrayOfByte4[13] = -1;
    arrayOfByte4[14] = -1;
    arrayOfByte4[15] = -1;
    arrayOfByte4[16] = -1;
    arrayOfByte4[17] = -1;
    arrayOfByte4[18] = -1;
    arrayOfByte4[19] = -1;
    arrayOfByte4[20] = -1;
    arrayOfByte4[21] = -1;
    arrayOfByte4[22] = -1;
    arrayOfByte4[23] = -1;
    arrayOfByte4[24] = -1;
    arrayOfByte4[25] = -1;
    arrayOfByte4[26] = -1;
    arrayOfByte4[27] = -1;
    arrayOfByte4[28] = -1;
    arrayOfByte4[29] = -1;
    arrayOfByte4[30] = -1;
    arrayOfByte4[31] = -1;
    arrayOfByte4[32] = -1;
    arrayOfByte4[33] = -1;
    arrayOfByte4[34] = -1;
    arrayOfByte4[35] = -1;
    arrayOfByte4[36] = -1;
    arrayOfByte4[37] = -1;
    arrayOfByte4[38] = -1;
    arrayOfByte4[39] = -1;
    arrayOfByte4[40] = -1;
    arrayOfByte4[41] = -1;
    arrayOfByte4[42] = -1;
    arrayOfByte4[43] = 62;
    arrayOfByte4[44] = -1;
    arrayOfByte4[45] = 62;
    arrayOfByte4[46] = -1;
    arrayOfByte4[47] = 63;
    arrayOfByte4[48] = 52;
    arrayOfByte4[49] = 53;
    arrayOfByte4[50] = 54;
    arrayOfByte4[51] = 55;
    arrayOfByte4[52] = 56;
    arrayOfByte4[53] = 57;
    arrayOfByte4[54] = 58;
    arrayOfByte4[55] = 59;
    arrayOfByte4[56] = 60;
    arrayOfByte4[57] = 61;
    arrayOfByte4[58] = -1;
    arrayOfByte4[59] = -1;
    arrayOfByte4[60] = -1;
    arrayOfByte4[61] = -1;
    arrayOfByte4[62] = -1;
    arrayOfByte4[63] = -1;
    arrayOfByte4[64] = -1;
    arrayOfByte4[65] = 0;
    arrayOfByte4[66] = 1;
    arrayOfByte4[67] = 2;
    arrayOfByte4[68] = 3;
    arrayOfByte4[69] = 4;
    arrayOfByte4[70] = 5;
    arrayOfByte4[71] = 6;
    arrayOfByte4[72] = 7;
    arrayOfByte4[73] = 8;
    arrayOfByte4[74] = 9;
    arrayOfByte4[75] = 10;
    arrayOfByte4[76] = 11;
    arrayOfByte4[77] = 12;
    arrayOfByte4[78] = 13;
    arrayOfByte4[79] = 14;
    arrayOfByte4[80] = 15;
    arrayOfByte4[81] = 16;
    arrayOfByte4[82] = 17;
    arrayOfByte4[83] = 18;
    arrayOfByte4[84] = 19;
    arrayOfByte4[85] = 20;
    arrayOfByte4[86] = 21;
    arrayOfByte4[87] = 22;
    arrayOfByte4[88] = 23;
    arrayOfByte4[89] = 24;
    arrayOfByte4[90] = 25;
    arrayOfByte4[91] = -1;
    arrayOfByte4[92] = -1;
    arrayOfByte4[93] = -1;
    arrayOfByte4[94] = -1;
    arrayOfByte4[95] = 63;
    arrayOfByte4[96] = -1;
    arrayOfByte4[97] = 26;
    arrayOfByte4[98] = 27;
    arrayOfByte4[99] = 28;
    arrayOfByte4[100] = 29;
    arrayOfByte4[101] = 30;
    arrayOfByte4[102] = 31;
    arrayOfByte4[103] = 32;
    arrayOfByte4[104] = 33;
    arrayOfByte4[105] = 34;
    arrayOfByte4[106] = 35;
    arrayOfByte4[107] = 36;
    arrayOfByte4[108] = 37;
    arrayOfByte4[109] = 38;
    arrayOfByte4[110] = 39;
    arrayOfByte4[111] = 40;
    arrayOfByte4[112] = 41;
    arrayOfByte4[113] = 42;
    arrayOfByte4[114] = 43;
    arrayOfByte4[115] = 44;
    arrayOfByte4[116] = 45;
    arrayOfByte4[117] = 46;
    arrayOfByte4[118] = 47;
    arrayOfByte4[119] = 48;
    arrayOfByte4[120] = 49;
    arrayOfByte4[121] = 50;
    arrayOfByte4[122] = 51;
  }

  public Base64()
  {
    this(false);
  }

  public Base64(int paramInt)
  {
    this(paramInt, CHUNK_SEPARATOR);
  }

  public Base64(int paramInt, byte[] paramArrayOfByte)
  {
    this(paramInt, paramArrayOfByte, false);
  }

  public Base64(int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if (paramArrayOfByte == null)
    {
      paramInt = 0;
      paramArrayOfByte = CHUNK_SEPARATOR;
    }
    int i;
    if (paramInt > 0)
    {
      i = 4 * (paramInt / 4);
      this.lineLength = i;
      this.lineSeparator = new byte[paramArrayOfByte.length];
      System.arraycopy(paramArrayOfByte, 0, this.lineSeparator, 0, paramArrayOfByte.length);
      if (paramInt <= 0)
        break label126;
    }
    label126: for (this.encodeSize = (4 + paramArrayOfByte.length); ; this.encodeSize = 4)
    {
      this.decodeSize = (-1 + this.encodeSize);
      if (!containsBase64Byte(paramArrayOfByte))
        break label134;
      String str = StringUtils.newStringUtf8(paramArrayOfByte);
      throw new IllegalArgumentException("lineSeperator must not contain base64 characters: [" + str + "]");
      i = 0;
      break;
    }
    label134: if (paramBoolean);
    for (byte[] arrayOfByte = URL_SAFE_ENCODE_TABLE; ; arrayOfByte = STANDARD_ENCODE_TABLE)
    {
      this.encodeTable = arrayOfByte;
      return;
    }
  }

  public Base64(boolean paramBoolean)
  {
    this(76, CHUNK_SEPARATOR, paramBoolean);
  }

  private static boolean containsBase64Byte(byte[] paramArrayOfByte)
  {
    int i = 0;
    if (i < paramArrayOfByte.length)
      if (!isBase64(paramArrayOfByte[i]));
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      i++;
      break;
    }
  }

  public static byte[] decodeBase64(String paramString)
  {
    return new Base64().decode(paramString);
  }

  public static byte[] decodeBase64(byte[] paramArrayOfByte)
  {
    return new Base64().decode(paramArrayOfByte);
  }

  public static BigInteger decodeInteger(byte[] paramArrayOfByte)
  {
    return new BigInteger(1, decodeBase64(paramArrayOfByte));
  }

  static byte[] discardWhitespace(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte1 = new byte[paramArrayOfByte.length];
    int i = 0;
    for (int j = 0; j < paramArrayOfByte.length; j++)
      switch (paramArrayOfByte[j])
      {
      default:
        int k = i + 1;
        arrayOfByte1[i] = paramArrayOfByte[j];
        i = k;
      case 9:
      case 10:
      case 13:
      case 32:
      }
    byte[] arrayOfByte2 = new byte[i];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, i);
    return arrayOfByte2;
  }

  public static byte[] encodeBase64(byte[] paramArrayOfByte)
  {
    return encodeBase64(paramArrayOfByte, false);
  }

  public static byte[] encodeBase64(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    return encodeBase64(paramArrayOfByte, paramBoolean, false);
  }

  public static byte[] encodeBase64(byte[] paramArrayOfByte, boolean paramBoolean1, boolean paramBoolean2)
  {
    return encodeBase64(paramArrayOfByte, paramBoolean1, paramBoolean2, 2147483647);
  }

  public static byte[] encodeBase64(byte[] paramArrayOfByte, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
      return paramArrayOfByte;
    long l = getEncodeLength(paramArrayOfByte, 76, CHUNK_SEPARATOR);
    if (l > paramInt)
      throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + l + ") than the specified maxium size of " + paramInt);
    if (paramBoolean1);
    for (Base64 localBase64 = new Base64(paramBoolean2); ; localBase64 = new Base64(0, CHUNK_SEPARATOR, paramBoolean2))
    {
      paramArrayOfByte = localBase64.encode(paramArrayOfByte);
      break;
    }
  }

  public static byte[] encodeBase64Chunked(byte[] paramArrayOfByte)
  {
    return encodeBase64(paramArrayOfByte, true);
  }

  public static String encodeBase64String(byte[] paramArrayOfByte)
  {
    return StringUtils.newStringUtf8(encodeBase64(paramArrayOfByte, true));
  }

  public static byte[] encodeBase64URLSafe(byte[] paramArrayOfByte)
  {
    return encodeBase64(paramArrayOfByte, false, true);
  }

  public static String encodeBase64URLSafeString(byte[] paramArrayOfByte)
  {
    return StringUtils.newStringUtf8(encodeBase64(paramArrayOfByte, false, true));
  }

  public static byte[] encodeInteger(BigInteger paramBigInteger)
  {
    if (paramBigInteger == null)
      throw new NullPointerException("encodeInteger called with null parameter");
    return encodeBase64(toIntegerBytes(paramBigInteger), false);
  }

  private static long getEncodeLength(byte[] paramArrayOfByte1, int paramInt, byte[] paramArrayOfByte2)
  {
    int i = 4 * (paramInt / 4);
    long l1 = 4 * paramArrayOfByte1.length / 3;
    long l2 = l1 % 4L;
    if (l2 != 0L)
      l1 += 4L - l2;
    if (i > 0)
      if (l1 % i != 0L)
        break label88;
    label88: for (int j = 1; ; j = 0)
    {
      l1 += l1 / i * paramArrayOfByte2.length;
      if (j == 0)
        l1 += paramArrayOfByte2.length;
      return l1;
    }
  }

  public static boolean isArrayByteBase64(byte[] paramArrayOfByte)
  {
    int i = 0;
    if (i < paramArrayOfByte.length)
      if ((isBase64(paramArrayOfByte[i])) || (isWhiteSpace(paramArrayOfByte[i])));
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      i++;
      break;
    }
  }

  public static boolean isBase64(byte paramByte)
  {
    if ((paramByte == 61) || ((paramByte >= 0) && (paramByte < DECODE_TABLE.length) && (DECODE_TABLE[paramByte] != -1)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static boolean isWhiteSpace(byte paramByte)
  {
    switch (paramByte)
    {
    default:
    case 9:
    case 10:
    case 13:
    case 32:
    }
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  private void reset()
  {
    this.buffer = null;
    this.pos = 0;
    this.readPos = 0;
    this.currentLinePos = 0;
    this.modulus = 0;
    this.eof = false;
  }

  private void resizeBuffer()
  {
    if (this.buffer == null)
    {
      this.buffer = new byte[8192];
      this.pos = 0;
      this.readPos = 0;
    }
    while (true)
    {
      return;
      byte[] arrayOfByte = new byte[2 * this.buffer.length];
      System.arraycopy(this.buffer, 0, arrayOfByte, 0, this.buffer.length);
      this.buffer = arrayOfByte;
    }
  }

  static byte[] toIntegerBytes(BigInteger paramBigInteger)
  {
    int i = 7 + paramBigInteger.bitLength() >> 3 << 3;
    Object localObject = paramBigInteger.toByteArray();
    if ((paramBigInteger.bitLength() % 8 != 0) && (1 + paramBigInteger.bitLength() / 8 == i / 8));
    while (true)
    {
      return localObject;
      int j = 0;
      int k = localObject.length;
      if (paramBigInteger.bitLength() % 8 == 0)
      {
        j = 1;
        k--;
      }
      int m = i / 8 - k;
      byte[] arrayOfByte = new byte[i / 8];
      System.arraycopy(localObject, j, arrayOfByte, m, k);
      localObject = arrayOfByte;
    }
  }

  int avail()
  {
    if (this.buffer != null);
    for (int i = this.pos - this.readPos; ; i = 0)
      return i;
  }

  public Object decode(Object paramObject)
    throws DecoderException
  {
    if ((paramObject instanceof byte[]));
    for (byte[] arrayOfByte = decode((byte[])paramObject); ; arrayOfByte = decode((String)paramObject))
    {
      return arrayOfByte;
      if (!(paramObject instanceof String))
        break;
    }
    throw new DecoderException("Parameter supplied to Base64 decode is not a byte[] or a String");
  }

  void decode(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.eof);
    label455: 
    while (true)
    {
      return;
      if (paramInt2 < 0)
        this.eof = true;
      int i = 0;
      int j = paramInt1;
      int i1;
      int i2;
      if (i < paramInt2)
      {
        if ((this.buffer == null) || (this.buffer.length - this.pos < this.decodeSize))
          resizeBuffer();
        i1 = j + 1;
        i2 = paramArrayOfByte[j];
        if (i2 == 61)
          this.eof = true;
      }
      while (true)
      {
        if ((!this.eof) || (this.modulus == 0))
          break label455;
        this.x <<= 6;
        switch (this.modulus)
        {
        default:
          break;
        case 2:
          this.x <<= 6;
          byte[] arrayOfByte3 = this.buffer;
          int n = this.pos;
          this.pos = (n + 1);
          arrayOfByte3[n] = (byte)(0xFF & this.x >> 16);
          break;
          if ((i2 >= 0) && (i2 < DECODE_TABLE.length))
          {
            int i3 = DECODE_TABLE[i2];
            if (i3 >= 0)
            {
              int i4 = 1 + this.modulus;
              this.modulus = i4;
              this.modulus = (i4 % 4);
              this.x = (i3 + (this.x << 6));
              if (this.modulus == 0)
              {
                byte[] arrayOfByte4 = this.buffer;
                int i5 = this.pos;
                this.pos = (i5 + 1);
                arrayOfByte4[i5] = (byte)(0xFF & this.x >> 16);
                byte[] arrayOfByte5 = this.buffer;
                int i6 = this.pos;
                this.pos = (i6 + 1);
                arrayOfByte5[i6] = (byte)(0xFF & this.x >> 8);
                byte[] arrayOfByte6 = this.buffer;
                int i7 = this.pos;
                this.pos = (i7 + 1);
                arrayOfByte6[i7] = (byte)(0xFF & this.x);
              }
            }
          }
          i++;
          j = i1;
          break;
        case 3:
          byte[] arrayOfByte1 = this.buffer;
          int k = this.pos;
          this.pos = (k + 1);
          arrayOfByte1[k] = (byte)(0xFF & this.x >> 16);
          byte[] arrayOfByte2 = this.buffer;
          int m = this.pos;
          this.pos = (m + 1);
          arrayOfByte2[m] = (byte)(0xFF & this.x >> 8);
          break;
        }
      }
    }
  }

  public byte[] decode(String paramString)
  {
    return decode(StringUtils.getBytesUtf8(paramString));
  }

  public byte[] decode(byte[] paramArrayOfByte)
  {
    reset();
    byte[] arrayOfByte1;
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
      arrayOfByte1 = paramArrayOfByte;
    while (true)
    {
      return arrayOfByte1;
      byte[] arrayOfByte2 = new byte[(int)3 * paramArrayOfByte.length / 4];
      setInitialBuffer(arrayOfByte2, 0, arrayOfByte2.length);
      decode(paramArrayOfByte, 0, paramArrayOfByte.length);
      decode(paramArrayOfByte, 0, -1);
      arrayOfByte1 = new byte[this.pos];
      readResults(arrayOfByte1, 0, arrayOfByte1.length);
    }
  }

  public Object encode(Object paramObject)
    throws EncoderException
  {
    if (!(paramObject instanceof byte[]))
      throw new EncoderException("Parameter supplied to Base64 encode is not a byte[]");
    return encode((byte[])paramObject);
  }

  void encode(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.eof);
    label425: int j;
    while (true)
    {
      return;
      if (paramInt2 < 0)
      {
        this.eof = true;
        if ((this.buffer == null) || (this.buffer.length - this.pos < this.encodeSize))
          resizeBuffer();
        switch (this.modulus)
        {
        default:
        case 1:
        case 2:
        }
        while (true)
        {
          if ((this.lineLength <= 0) || (this.pos <= 0))
            break label425;
          System.arraycopy(this.lineSeparator, 0, this.buffer, this.pos, this.lineSeparator.length);
          this.pos += this.lineSeparator.length;
          break;
          byte[] arrayOfByte9 = this.buffer;
          int i9 = this.pos;
          this.pos = (i9 + 1);
          arrayOfByte9[i9] = this.encodeTable[(0x3F & this.x >> 2)];
          byte[] arrayOfByte10 = this.buffer;
          int i10 = this.pos;
          this.pos = (i10 + 1);
          arrayOfByte10[i10] = this.encodeTable[(0x3F & this.x << 4)];
          if (this.encodeTable == STANDARD_ENCODE_TABLE)
          {
            byte[] arrayOfByte11 = this.buffer;
            int i11 = this.pos;
            this.pos = (i11 + 1);
            arrayOfByte11[i11] = 61;
            byte[] arrayOfByte12 = this.buffer;
            int i12 = this.pos;
            this.pos = (i12 + 1);
            arrayOfByte12[i12] = 61;
            continue;
            byte[] arrayOfByte5 = this.buffer;
            int i5 = this.pos;
            this.pos = (i5 + 1);
            arrayOfByte5[i5] = this.encodeTable[(0x3F & this.x >> 10)];
            byte[] arrayOfByte6 = this.buffer;
            int i6 = this.pos;
            this.pos = (i6 + 1);
            arrayOfByte6[i6] = this.encodeTable[(0x3F & this.x >> 4)];
            byte[] arrayOfByte7 = this.buffer;
            int i7 = this.pos;
            this.pos = (i7 + 1);
            arrayOfByte7[i7] = this.encodeTable[(0x3F & this.x << 2)];
            if (this.encodeTable == STANDARD_ENCODE_TABLE)
            {
              byte[] arrayOfByte8 = this.buffer;
              int i8 = this.pos;
              this.pos = (i8 + 1);
              arrayOfByte8[i8] = 61;
            }
          }
        }
      }
      else
      {
        int i = 0;
        int m;
        for (j = paramInt1; i < paramInt2; j = m)
        {
          if ((this.buffer == null) || (this.buffer.length - this.pos < this.encodeSize))
            resizeBuffer();
          int k = 1 + this.modulus;
          this.modulus = k;
          this.modulus = (k % 3);
          m = j + 1;
          int n = paramArrayOfByte[j];
          if (n < 0)
            n += 256;
          this.x = (n + (this.x << 8));
          if (this.modulus == 0)
          {
            byte[] arrayOfByte1 = this.buffer;
            int i1 = this.pos;
            this.pos = (i1 + 1);
            arrayOfByte1[i1] = this.encodeTable[(0x3F & this.x >> 18)];
            byte[] arrayOfByte2 = this.buffer;
            int i2 = this.pos;
            this.pos = (i2 + 1);
            arrayOfByte2[i2] = this.encodeTable[(0x3F & this.x >> 12)];
            byte[] arrayOfByte3 = this.buffer;
            int i3 = this.pos;
            this.pos = (i3 + 1);
            arrayOfByte3[i3] = this.encodeTable[(0x3F & this.x >> 6)];
            byte[] arrayOfByte4 = this.buffer;
            int i4 = this.pos;
            this.pos = (i4 + 1);
            arrayOfByte4[i4] = this.encodeTable[(0x3F & this.x)];
            this.currentLinePos = (4 + this.currentLinePos);
            if ((this.lineLength > 0) && (this.lineLength <= this.currentLinePos))
            {
              System.arraycopy(this.lineSeparator, 0, this.buffer, this.pos, this.lineSeparator.length);
              this.pos += this.lineSeparator.length;
              this.currentLinePos = 0;
            }
          }
          i++;
        }
      }
    }
  }

  public byte[] encode(byte[] paramArrayOfByte)
  {
    reset();
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0));
    byte[] arrayOfByte;
    for (Object localObject = paramArrayOfByte; ; localObject = arrayOfByte)
    {
      do
      {
        return localObject;
        localObject = new byte[(int)getEncodeLength(paramArrayOfByte, this.lineLength, this.lineSeparator)];
        setInitialBuffer((byte[])localObject, 0, localObject.length);
        encode(paramArrayOfByte, 0, paramArrayOfByte.length);
        encode(paramArrayOfByte, 0, -1);
        if (this.buffer != localObject)
          readResults((byte[])localObject, 0, localObject.length);
      }
      while ((!isUrlSafe()) || (this.pos >= localObject.length));
      arrayOfByte = new byte[this.pos];
      System.arraycopy(localObject, 0, arrayOfByte, 0, this.pos);
    }
  }

  public String encodeToString(byte[] paramArrayOfByte)
  {
    return StringUtils.newStringUtf8(encode(paramArrayOfByte));
  }

  boolean hasData()
  {
    if (this.buffer != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean isUrlSafe()
  {
    if (this.encodeTable == URL_SAFE_ENCODE_TABLE);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  int readResults(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int j;
    if (this.buffer != null)
    {
      j = Math.min(avail(), paramInt2);
      if (this.buffer != paramArrayOfByte)
      {
        System.arraycopy(this.buffer, this.readPos, paramArrayOfByte, paramInt1, j);
        this.readPos = (j + this.readPos);
        if (this.readPos < this.pos);
      }
      for (this.buffer = null; ; this.buffer = null)
        return j;
    }
    if (this.eof);
    for (int i = -1; ; i = 0)
    {
      j = i;
      break;
    }
  }

  void setInitialBuffer(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length == paramInt2))
    {
      this.buffer = paramArrayOfByte;
      this.pos = paramInt1;
      this.readPos = paramInt1;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     org.apache.commons.codec.binary.Base64
 * JD-Core Version:    0.6.1
 */