import com.whatsapp.App;
import java.io.IOException;
import java.io.OutputStream;

public class xb
  implements yb
{
  protected final byte[] a;
  protected byte b;
  protected final byte[] c;

  public xb()
  {
    byte[] arrayOfByte = new byte[64];
    arrayOfByte[0] = 65;
    arrayOfByte[1] = 66;
    arrayOfByte[2] = 67;
    arrayOfByte[3] = 68;
    arrayOfByte[4] = 69;
    arrayOfByte[5] = 70;
    arrayOfByte[6] = 71;
    arrayOfByte[7] = 72;
    arrayOfByte[8] = 73;
    arrayOfByte[9] = 74;
    arrayOfByte[10] = 75;
    arrayOfByte[11] = 76;
    arrayOfByte[12] = 77;
    arrayOfByte[13] = 78;
    arrayOfByte[14] = 79;
    arrayOfByte[15] = 80;
    arrayOfByte[16] = 81;
    arrayOfByte[17] = 82;
    arrayOfByte[18] = 83;
    arrayOfByte[19] = 84;
    arrayOfByte[20] = 85;
    arrayOfByte[21] = 86;
    arrayOfByte[22] = 87;
    arrayOfByte[23] = 88;
    arrayOfByte[24] = 89;
    arrayOfByte[25] = 90;
    arrayOfByte[26] = 97;
    arrayOfByte[27] = 98;
    arrayOfByte[28] = 99;
    arrayOfByte[29] = 100;
    arrayOfByte[30] = 101;
    arrayOfByte[31] = 102;
    arrayOfByte[32] = 103;
    arrayOfByte[33] = 104;
    arrayOfByte[34] = 105;
    arrayOfByte[35] = 106;
    arrayOfByte[36] = 107;
    arrayOfByte[37] = 108;
    arrayOfByte[38] = 109;
    arrayOfByte[39] = 110;
    arrayOfByte[40] = 111;
    arrayOfByte[41] = 112;
    arrayOfByte[42] = 113;
    arrayOfByte[43] = 114;
    arrayOfByte[44] = 115;
    arrayOfByte[45] = 116;
    arrayOfByte[46] = 117;
    arrayOfByte[47] = 118;
    arrayOfByte[48] = 119;
    arrayOfByte[49] = 120;
    arrayOfByte[50] = 121;
    arrayOfByte[51] = 122;
    arrayOfByte[52] = 48;
    arrayOfByte[53] = 49;
    arrayOfByte[54] = 50;
    arrayOfByte[55] = 51;
    arrayOfByte[56] = 52;
    arrayOfByte[57] = 53;
    arrayOfByte[58] = 54;
    arrayOfByte[59] = 55;
    arrayOfByte[60] = 56;
    arrayOfByte[61] = 57;
    arrayOfByte[62] = 43;
    arrayOfByte[63] = 47;
    this.a = arrayOfByte;
    this.b = 61;
    this.c = new byte[''];
    a();
  }

  private int a(OutputStream paramOutputStream, char paramChar1, char paramChar2, char paramChar3, char paramChar4)
    throws IOException
  {
    int n;
    if (paramChar3 == this.b)
    {
      int i4 = this.c[paramChar1];
      int i5 = this.c[paramChar2];
      paramOutputStream.write(i4 << 2 | i5 >> 4);
      n = 1;
    }
    while (true)
    {
      return n;
      if (paramChar4 == this.b)
      {
        int i1 = this.c[paramChar1];
        int i2 = this.c[paramChar2];
        int i3 = this.c[paramChar3];
        paramOutputStream.write(i1 << 2 | i2 >> 4);
        paramOutputStream.write(i2 << 4 | i3 >> 2);
        n = 2;
      }
      else
      {
        int i = this.c[paramChar1];
        int j = this.c[paramChar2];
        int k = this.c[paramChar3];
        int m = this.c[paramChar4];
        paramOutputStream.write(i << 2 | j >> 4);
        paramOutputStream.write(j << 4 | k >> 2);
        paramOutputStream.write(m | k << 6);
        n = 3;
      }
    }
  }

  private int a(String paramString, int paramInt1, int paramInt2)
  {
    int i = wb.b;
    int j = paramInt1;
    do
    {
      if ((j >= paramInt2) || (!a(paramString.charAt(j))))
        break;
      j++;
    }
    while (i == 0);
    return j;
  }

  private int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = wb.b;
    int j = paramInt1;
    do
    {
      if ((j >= paramInt2) || (!a((char)paramArrayOfByte[j])))
        break;
      j++;
    }
    while (i == 0);
    return j;
  }

  private boolean a(char paramChar)
  {
    if ((paramChar == '\n') || (paramChar == '\r') || (paramChar == '\t') || (paramChar == ' '));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public int a(String paramString, OutputStream paramOutputStream)
    throws IOException
  {
    int i = wb.b;
    int j = paramString.length();
    do
    {
      if ((j <= 0) || ((!a(paramString.charAt(j - 1))) && (i == 0)))
        break;
      j--;
    }
    while (i == 0);
    int k = j - 4;
    int m = a(paramString, 0, k);
    int n = 0;
    int i1 = m;
    do
    {
      if (i1 >= k)
        break;
      byte[] arrayOfByte1 = this.c;
      int i3 = i1 + 1;
      int i4 = arrayOfByte1[paramString.charAt(i1)];
      int i5 = a(paramString, i3, k);
      byte[] arrayOfByte2 = this.c;
      int i6 = i5 + 1;
      int i7 = arrayOfByte2[paramString.charAt(i5)];
      int i8 = a(paramString, i6, k);
      byte[] arrayOfByte3 = this.c;
      int i9 = i8 + 1;
      int i10 = arrayOfByte3[paramString.charAt(i8)];
      int i11 = a(paramString, i9, k);
      byte[] arrayOfByte4 = this.c;
      int i12 = i11 + 1;
      int i13 = arrayOfByte4[paramString.charAt(i11)];
      paramOutputStream.write(i4 << 2 | i7 >> 4);
      paramOutputStream.write(i7 << 4 | i10 >> 2);
      paramOutputStream.write(i13 | i10 << 6);
      n += 3;
      i1 = a(paramString, i12, k);
    }
    while (i == 0);
    int i2 = n + a(paramOutputStream, paramString.charAt(j - 4), paramString.charAt(j - 3), paramString.charAt(j - 2), paramString.charAt(j - 1));
    if (App.wc != 0)
      wb.b = i + 1;
    return i2;
  }

  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, OutputStream paramOutputStream)
    throws IOException
  {
    int i = wb.b;
    int j = paramInt2 % 3;
    int k = paramInt2 - j;
    int m = paramInt1;
    do
    {
      if (m >= paramInt1 + k)
        break;
      int i10 = 0xFF & paramArrayOfByte[m];
      int i11 = 0xFF & paramArrayOfByte[(m + 1)];
      int i12 = 0xFF & paramArrayOfByte[(m + 2)];
      paramOutputStream.write(this.a[(0x3F & i10 >>> 2)]);
      paramOutputStream.write(this.a[(0x3F & (i10 << 4 | i11 >>> 4))]);
      paramOutputStream.write(this.a[(0x3F & (i11 << 2 | i12 >>> 6))]);
      paramOutputStream.write(this.a[(i12 & 0x3F)]);
      m += 3;
    }
    while (i == 0);
    int i5;
    switch (j)
    {
    default:
      i5 = 4 * (k / 3);
      if (j != 0)
        break;
    case 0:
    case 1:
    case 2:
    }
    for (int i6 = 0; ; i6 = 4)
    {
      return i6 + i5;
      if (i == 0)
        break;
      int i7 = 0xFF & paramArrayOfByte[(paramInt1 + k)];
      int i8 = 0x3F & i7 >>> 2;
      int i9 = 0x3F & i7 << 4;
      paramOutputStream.write(this.a[i8]);
      paramOutputStream.write(this.a[i9]);
      paramOutputStream.write(this.b);
      paramOutputStream.write(this.b);
      if (i == 0)
        break;
      int n = 0xFF & paramArrayOfByte[(paramInt1 + k)];
      int i1 = 0xFF & paramArrayOfByte[(1 + (paramInt1 + k))];
      int i2 = 0x3F & n >>> 2;
      int i3 = 0x3F & (n << 4 | i1 >>> 4);
      int i4 = 0x3F & i1 << 2;
      paramOutputStream.write(this.a[i2]);
      paramOutputStream.write(this.a[i3]);
      paramOutputStream.write(this.a[i4]);
      paramOutputStream.write(this.b);
      break;
    }
  }

  protected void a()
  {
    for (int i = 0; i < this.a.length; i++)
      this.c[this.a[i]] = (byte)i;
  }

  public int b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, OutputStream paramOutputStream)
    throws IOException
  {
    int i = wb.b;
    int j = paramInt1 + paramInt2;
    do
    {
      if (j <= paramInt1)
        break;
      if (!a((char)paramArrayOfByte[(j - 1)]))
      {
        if (i == 0)
          break;
        App.wc = 1 + App.wc;
      }
      j--;
    }
    while (i == 0);
    int k = j - 4;
    int m = a(paramArrayOfByte, paramInt1, k);
    int n = 0;
    int i1 = m;
    do
    {
      if (i1 >= k)
        break;
      byte[] arrayOfByte1 = this.c;
      int i2 = i1 + 1;
      int i3 = arrayOfByte1[paramArrayOfByte[i1]];
      int i4 = a(paramArrayOfByte, i2, k);
      byte[] arrayOfByte2 = this.c;
      int i5 = i4 + 1;
      int i6 = arrayOfByte2[paramArrayOfByte[i4]];
      int i7 = a(paramArrayOfByte, i5, k);
      byte[] arrayOfByte3 = this.c;
      int i8 = i7 + 1;
      int i9 = arrayOfByte3[paramArrayOfByte[i7]];
      int i10 = a(paramArrayOfByte, i8, k);
      byte[] arrayOfByte4 = this.c;
      int i11 = i10 + 1;
      int i12 = arrayOfByte4[paramArrayOfByte[i10]];
      paramOutputStream.write(i3 << 2 | i6 >> 4);
      paramOutputStream.write(i6 << 4 | i9 >> 2);
      paramOutputStream.write(i12 | i9 << 6);
      n += 3;
      i1 = a(paramArrayOfByte, i11, k);
    }
    while (i == 0);
    return n + a(paramOutputStream, (char)paramArrayOfByte[(j - 4)], (char)paramArrayOfByte[(j - 3)], (char)paramArrayOfByte[(j - 2)], (char)paramArrayOfByte[(j - 1)]);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     xb
 * JD-Core Version:    0.6.1
 */