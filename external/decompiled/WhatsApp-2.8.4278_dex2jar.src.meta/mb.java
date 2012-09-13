import com.whatsapp.App;

public class mb extends lb
{
  private static final String z;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int[] j = new int[80];
  private int k;

  static
  {
    char[] arrayOfChar = "B\013\f\013I".toCharArray();
    int m = arrayOfChar.length;
    int n = 0;
    if (m <= n)
    {
      z = new String(arrayOfChar).intern();
      return;
    }
    int i1 = arrayOfChar[n];
    int i2;
    switch (n % 5)
    {
    default:
      i2 = 120;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar[n] = (char)(i2 ^ i1);
      n++;
      break;
      i2 = 17;
      continue;
      i2 = 67;
      continue;
      i2 = 77;
      continue;
      i2 = 38;
    }
  }

  public mb()
  {
    c();
  }

  private int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return paramInt1 & paramInt2 | paramInt3 & (paramInt1 ^ 0xFFFFFFFF);
  }

  private int b(int paramInt1, int paramInt2, int paramInt3)
  {
    return paramInt3 ^ (paramInt1 ^ paramInt2);
  }

  private int c(int paramInt1, int paramInt2, int paramInt3)
  {
    return paramInt1 & paramInt2 | paramInt1 & paramInt3 | paramInt2 & paramInt3;
  }

  public int a(byte[] paramArrayOfByte, int paramInt)
  {
    a();
    vb.a(this.e, paramArrayOfByte, paramInt);
    vb.a(this.f, paramArrayOfByte, paramInt + 4);
    vb.a(this.g, paramArrayOfByte, paramInt + 8);
    vb.a(this.h, paramArrayOfByte, paramInt + 12);
    vb.a(this.i, paramArrayOfByte, paramInt + 16);
    c();
    return 20;
  }

  public String a()
  {
    return z;
  }

  protected void a(long paramLong)
  {
    if (this.k > 14)
      b();
    this.j[14] = (int)(paramLong >>> 32);
    this.j[15] = (int)(0xFFFFFFFF & paramLong);
  }

  protected void a(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool1 = lb.d;
    int m = paramArrayOfByte[paramInt] << 24;
    int n = paramInt + 1;
    int i1 = m | (0xFF & paramArrayOfByte[n]) << 16;
    int i2 = n + 1;
    int i3 = i1 | (0xFF & paramArrayOfByte[i2]) << 8 | 0xFF & paramArrayOfByte[(i2 + 1)];
    this.j[this.k] = i3;
    int i4 = 1 + this.k;
    this.k = i4;
    if (i4 == 16)
      b();
    if (App.wc != 0)
      if (!bool1)
        break label121;
    label121: for (boolean bool2 = false; ; bool2 = true)
    {
      lb.d = bool2;
      return;
    }
  }

  public int b()
  {
    return 20;
  }

  protected void b()
  {
    boolean bool = lb.d;
    int m = 16;
    while (m < 80)
    {
      int i78 = this.j[(m - 3)] ^ this.j[(m - 8)] ^ this.j[(m - 14)] ^ this.j[(m - 16)];
      this.j[m] = (i78 << 1 | i78 >>> 31);
      m++;
      if (bool)
        App.wc = 1 + App.wc;
    }
    int n = this.e;
    int i1 = this.f;
    int i2 = this.g;
    int i3 = this.h;
    int i4 = this.i;
    int i5 = 0;
    int i6 = i4;
    int i7 = i3;
    int i8 = i2;
    int i9 = i1;
    int i10 = n;
    int i11 = 0;
    do
    {
      if (i11 >= 4)
        break;
      int i64 = (i10 << 5 | i10 >>> 27) + a(i9, i8, i7);
      int[] arrayOfInt16 = this.j;
      int i65 = i5 + 1;
      int i66 = i6 + (1518500249 + (i64 + arrayOfInt16[i5]));
      int i67 = i9 << 30 | i9 >>> 2;
      int i68 = (i66 << 5 | i66 >>> 27) + a(i10, i67, i8);
      int[] arrayOfInt17 = this.j;
      int i69 = i65 + 1;
      int i70 = i7 + (1518500249 + (i68 + arrayOfInt17[i65]));
      int i71 = i10 << 30 | i10 >>> 2;
      int i72 = (i70 << 5 | i70 >>> 27) + a(i66, i71, i67);
      int[] arrayOfInt18 = this.j;
      int i73 = i69 + 1;
      int i74 = i8 + (1518500249 + (i72 + arrayOfInt18[i69]));
      i6 = i66 << 30 | i66 >>> 2;
      int i75 = (i74 << 5 | i74 >>> 27) + a(i70, i6, i71);
      int[] arrayOfInt19 = this.j;
      int i76 = i73 + 1;
      i9 = i67 + (1518500249 + (i75 + arrayOfInt19[i73]));
      i7 = i70 << 30 | i70 >>> 2;
      int i77 = (i9 << 5 | i9 >>> 27) + a(i74, i7, i6);
      int[] arrayOfInt20 = this.j;
      i5 = i76 + 1;
      i10 = i71 + (1518500249 + (i77 + arrayOfInt20[i76]));
      i8 = i74 << 30 | i74 >>> 2;
      i11++;
    }
    while (!bool);
    int i12 = 0;
    do
    {
      if (i12 >= 4)
        break;
      int i50 = (i10 << 5 | i10 >>> 27) + b(i9, i8, i7);
      int[] arrayOfInt11 = this.j;
      int i51 = i5 + 1;
      int i52 = i6 + (1859775393 + (i50 + arrayOfInt11[i5]));
      int i53 = i9 << 30 | i9 >>> 2;
      int i54 = (i52 << 5 | i52 >>> 27) + b(i10, i53, i8);
      int[] arrayOfInt12 = this.j;
      int i55 = i51 + 1;
      int i56 = i7 + (1859775393 + (i54 + arrayOfInt12[i51]));
      int i57 = i10 << 30 | i10 >>> 2;
      int i58 = (i56 << 5 | i56 >>> 27) + b(i52, i57, i53);
      int[] arrayOfInt13 = this.j;
      int i59 = i55 + 1;
      int i60 = i8 + (1859775393 + (i58 + arrayOfInt13[i55]));
      i6 = i52 << 30 | i52 >>> 2;
      int i61 = (i60 << 5 | i60 >>> 27) + b(i56, i6, i57);
      int[] arrayOfInt14 = this.j;
      int i62 = i59 + 1;
      i9 = i53 + (1859775393 + (i61 + arrayOfInt14[i59]));
      i7 = i56 << 30 | i56 >>> 2;
      int i63 = (i9 << 5 | i9 >>> 27) + b(i60, i7, i6);
      int[] arrayOfInt15 = this.j;
      i5 = i62 + 1;
      i10 = i57 + (1859775393 + (i63 + arrayOfInt15[i62]));
      i8 = i60 << 30 | i60 >>> 2;
      i12++;
    }
    while (!bool);
    int i13 = 0;
    do
    {
      if (i13 >= 4)
        break;
      int i36 = (i10 << 5 | i10 >>> 27) + c(i9, i8, i7);
      int[] arrayOfInt6 = this.j;
      int i37 = i5 + 1;
      int i38 = i6 + (-1894007588 + (i36 + arrayOfInt6[i5]));
      int i39 = i9 << 30 | i9 >>> 2;
      int i40 = (i38 << 5 | i38 >>> 27) + c(i10, i39, i8);
      int[] arrayOfInt7 = this.j;
      int i41 = i37 + 1;
      int i42 = i7 + (-1894007588 + (i40 + arrayOfInt7[i37]));
      int i43 = i10 << 30 | i10 >>> 2;
      int i44 = (i42 << 5 | i42 >>> 27) + c(i38, i43, i39);
      int[] arrayOfInt8 = this.j;
      int i45 = i41 + 1;
      int i46 = i8 + (-1894007588 + (i44 + arrayOfInt8[i41]));
      i6 = i38 << 30 | i38 >>> 2;
      int i47 = (i46 << 5 | i46 >>> 27) + c(i42, i6, i43);
      int[] arrayOfInt9 = this.j;
      int i48 = i45 + 1;
      i9 = i39 + (-1894007588 + (i47 + arrayOfInt9[i45]));
      i7 = i42 << 30 | i42 >>> 2;
      int i49 = (i9 << 5 | i9 >>> 27) + c(i46, i7, i6);
      int[] arrayOfInt10 = this.j;
      i5 = i48 + 1;
      i10 = i43 + (-1894007588 + (i49 + arrayOfInt10[i48]));
      i8 = i46 << 30 | i46 >>> 2;
      i13++;
    }
    while (!bool);
    int i14 = i5;
    int i15 = i6;
    int i16 = i7;
    int i17 = i8;
    int i18 = i9;
    int i19 = i10;
    int i20 = 0;
    do
    {
      if (i20 > 3)
        break;
      int i22 = (i19 << 5 | i19 >>> 27) + b(i18, i17, i16);
      int[] arrayOfInt1 = this.j;
      int i23 = i14 + 1;
      int i24 = i15 + (-899497514 + (i22 + arrayOfInt1[i14]));
      int i25 = i18 << 30 | i18 >>> 2;
      int i26 = (i24 << 5 | i24 >>> 27) + b(i19, i25, i17);
      int[] arrayOfInt2 = this.j;
      int i27 = i23 + 1;
      int i28 = i16 + (-899497514 + (i26 + arrayOfInt2[i23]));
      int i29 = i19 << 30 | i19 >>> 2;
      int i30 = (i28 << 5 | i28 >>> 27) + b(i24, i29, i25);
      int[] arrayOfInt3 = this.j;
      int i31 = i27 + 1;
      int i32 = i17 + (-899497514 + (i30 + arrayOfInt3[i27]));
      i15 = i24 << 30 | i24 >>> 2;
      int i33 = (i32 << 5 | i32 >>> 27) + b(i28, i15, i29);
      int[] arrayOfInt4 = this.j;
      int i34 = i31 + 1;
      i18 = i25 + (-899497514 + (i33 + arrayOfInt4[i31]));
      i16 = i28 << 30 | i28 >>> 2;
      int i35 = (i18 << 5 | i18 >>> 27) + b(i32, i16, i15);
      int[] arrayOfInt5 = this.j;
      i14 = i34 + 1;
      i19 = i29 + (-899497514 + (i35 + arrayOfInt5[i34]));
      i17 = i32 << 30 | i32 >>> 2;
      i20++;
    }
    while (!bool);
    this.e = (i19 + this.e);
    this.f = (i18 + this.f);
    this.g = (i17 + this.g);
    this.h = (i16 + this.h);
    this.i = (i15 + this.i);
    this.k = 0;
    int i21 = 0;
    do
    {
      if (i21 >= 16)
        break;
      this.j[i21] = 0;
      i21++;
    }
    while (!bool);
  }

  public void c()
  {
    boolean bool = lb.d;
    super.c();
    this.e = 1732584193;
    this.f = -271733879;
    this.g = -1732584194;
    this.h = 271733878;
    this.i = -1009589776;
    this.k = 0;
    int m = 0;
    do
    {
      if (m == this.j.length)
        break;
      this.j[m] = 0;
      m++;
    }
    while (!bool);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     mb
 * JD-Core Version:    0.6.1
 */