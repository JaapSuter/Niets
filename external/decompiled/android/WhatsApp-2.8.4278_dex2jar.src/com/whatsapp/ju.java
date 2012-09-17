package com.whatsapp;

import android.os.Handler;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Timer;
import java.util.Vector;

public class ju
  implements wz, d1, Runnable
{
  private static Timer a;
  private static final String[] z;
  public String b;
  public String c;
  public Vector d;
  public int e;
  public Long f;
  public boolean g = false;
  public boolean h = false;
  public Hashtable i;
  private dab j;

  static
  {
    String[] arrayOfString = new String[15];
    char[] arrayOfChar1 = "b;Qykh.L#i`8KihqiMyxf,M4".toCharArray();
    int k = arrayOfChar1.length;
    int m = 0;
    char[] arrayOfChar2;
    int i3;
    char[] arrayOfChar3;
    int i7;
    char[] arrayOfChar4;
    int i11;
    char[] arrayOfChar5;
    int i15;
    char[] arrayOfChar6;
    int i19;
    char[] arrayOfChar7;
    int i23;
    char[] arrayOfChar8;
    int i27;
    char[] arrayOfChar9;
    int i31;
    char[] arrayOfChar10;
    int i35;
    char[] arrayOfChar11;
    int i39;
    char[] arrayOfChar12;
    int i43;
    char[] arrayOfChar13;
    int i47;
    char[] arrayOfChar14;
    int i51;
    char[] arrayOfChar15;
    int i55;
    if (k <= m)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "b;Qykh.L#i`$Qz~Z9_Si`:Ncuv,\021iiw&LS/5x".toCharArray();
      int i2 = arrayOfChar2.length;
      i3 = 0;
      if (i2 <= i3)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "b;Qykh.L#xw,_x~Z.L|Dw,M|tk:[#~w;Q~D0y\016".toCharArray();
        int i6 = arrayOfChar3.length;
        i7 = 0;
        if (i6 > i7)
          break label752;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "b;Qykh.L#xw,_x~Z.L|Dw,M|tk:[#~w;Q~D1y\017".toCharArray();
        int i10 = arrayOfChar4.length;
        i11 = 0;
        if (i10 > i11)
          break label840;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "b;Qykh.L#i`8KihqiXmri,Z,!%".toCharArray();
        int i14 = arrayOfChar5.length;
        i15 = 0;
        if (i14 > i15)
          break label928;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "b;Qykh.L#w`(HiDb;NSi`:Ncuv,\021iiw&LS/5y".toCharArray();
        int i18 = arrayOfChar6.length;
        i19 = 0;
        if (i18 > i19)
          break label1016;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "b;Qykh.L#za-a|zZ;[kj'Mi4`;LciZ|\016<".toCharArray();
        int i22 = arrayOfChar7.length;
        i23 = 0;
        if (i22 > i23)
          break label1104;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "b;Qykh.L#xw,_x~Z.L|Dw,M|tk:[#~w;Q~D1y\b".toCharArray();
        int i26 = arrayOfChar8.length;
        i27 = 0;
        if (i26 > i27)
          break label1192;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "b;Qykh.L#za-a|zZ;[kj'Mi4`;LciZ}\016=".toCharArray();
        int i30 = arrayOfChar9.length;
        i31 = 0;
        if (i30 > i31)
          break label1280;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "b;Qykh.L#xw,_x~Z.L|Dw,M|tk:[#~w;Q~D1y\016".toCharArray();
        int i34 = arrayOfChar10.length;
        i35 = 0;
        if (i34 > i35)
          break label1368;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "b;Qykh.L#za-a|zZ;[kj'Mi4`;LciZ}\016<".toCharArray();
        int i38 = arrayOfChar11.length;
        i39 = 0;
        if (i38 > i39)
          break label1456;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "b;Qykh.L#i`$Qz~Z9_Si`:Ncuv,\021iiw&LS/5y".toCharArray();
        int i42 = arrayOfChar12.length;
        i43 = 0;
        if (i42 > i43)
          break label1544;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "%5\036".toCharArray();
        int i46 = arrayOfChar13.length;
        i47 = 0;
        if (i46 > i47)
          break label1632;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "b;Qykh.L#i`$Qz~Z9_Si`:Ncuv,\021iiw&LS/5}".toCharArray();
        int i50 = arrayOfChar14.length;
        i51 = 0;
        if (i50 > i51)
          break label1720;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "b;Qykh.L#i`8KihqiMyxf,M;?i".toCharArray();
        int i54 = arrayOfChar15.length;
        i55 = 0;
        if (i54 > i55)
          break label1808;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        z = arrayOfString;
        a = new Timer();
      }
    }
    else
    {
      int n = arrayOfChar1[m];
      int i1;
      switch (m % 5)
      {
      default:
        i1 = 27;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[m] = (char)(i1 ^ n);
        m++;
        break;
        i1 = 5;
        continue;
        i1 = 73;
        continue;
        i1 = 62;
        continue;
        i1 = 12;
      }
    }
    int i4 = arrayOfChar2[i3];
    int i5;
    switch (i3 % 5)
    {
    default:
      i5 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i3] = (char)(i5 ^ i4);
      i3++;
      break;
      i5 = 5;
      continue;
      i5 = 73;
      continue;
      i5 = 62;
      continue;
      i5 = 12;
    }
    label752: int i8 = arrayOfChar3[i7];
    int i9;
    switch (i7 % 5)
    {
    default:
      i9 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i7] = (char)(i9 ^ i8);
      i7++;
      break;
      i9 = 5;
      continue;
      i9 = 73;
      continue;
      i9 = 62;
      continue;
      i9 = 12;
    }
    label840: int i12 = arrayOfChar4[i11];
    int i13;
    switch (i11 % 5)
    {
    default:
      i13 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i11] = (char)(i13 ^ i12);
      i11++;
      break;
      i13 = 5;
      continue;
      i13 = 73;
      continue;
      i13 = 62;
      continue;
      i13 = 12;
    }
    label928: int i16 = arrayOfChar5[i15];
    int i17;
    switch (i15 % 5)
    {
    default:
      i17 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i15] = (char)(i17 ^ i16);
      i15++;
      break;
      i17 = 5;
      continue;
      i17 = 73;
      continue;
      i17 = 62;
      continue;
      i17 = 12;
    }
    label1016: int i20 = arrayOfChar6[i19];
    int i21;
    switch (i19 % 5)
    {
    default:
      i21 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i19] = (char)(i21 ^ i20);
      i19++;
      break;
      i21 = 5;
      continue;
      i21 = 73;
      continue;
      i21 = 62;
      continue;
      i21 = 12;
    }
    label1104: int i24 = arrayOfChar7[i23];
    int i25;
    switch (i23 % 5)
    {
    default:
      i25 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i23] = (char)(i25 ^ i24);
      i23++;
      break;
      i25 = 5;
      continue;
      i25 = 73;
      continue;
      i25 = 62;
      continue;
      i25 = 12;
    }
    label1192: int i28 = arrayOfChar8[i27];
    int i29;
    switch (i27 % 5)
    {
    default:
      i29 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar8[i27] = (char)(i29 ^ i28);
      i27++;
      break;
      i29 = 5;
      continue;
      i29 = 73;
      continue;
      i29 = 62;
      continue;
      i29 = 12;
    }
    label1280: int i32 = arrayOfChar9[i31];
    int i33;
    switch (i31 % 5)
    {
    default:
      i33 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar9[i31] = (char)(i33 ^ i32);
      i31++;
      break;
      i33 = 5;
      continue;
      i33 = 73;
      continue;
      i33 = 62;
      continue;
      i33 = 12;
    }
    label1368: int i36 = arrayOfChar10[i35];
    int i37;
    switch (i35 % 5)
    {
    default:
      i37 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar10[i35] = (char)(i37 ^ i36);
      i35++;
      break;
      i37 = 5;
      continue;
      i37 = 73;
      continue;
      i37 = 62;
      continue;
      i37 = 12;
    }
    label1456: int i40 = arrayOfChar11[i39];
    int i41;
    switch (i39 % 5)
    {
    default:
      i41 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar11[i39] = (char)(i41 ^ i40);
      i39++;
      break;
      i41 = 5;
      continue;
      i41 = 73;
      continue;
      i41 = 62;
      continue;
      i41 = 12;
    }
    label1544: int i44 = arrayOfChar12[i43];
    int i45;
    switch (i43 % 5)
    {
    default:
      i45 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar12[i43] = (char)(i45 ^ i44);
      i43++;
      break;
      i45 = 5;
      continue;
      i45 = 73;
      continue;
      i45 = 62;
      continue;
      i45 = 12;
    }
    label1632: int i48 = arrayOfChar13[i47];
    int i49;
    switch (i47 % 5)
    {
    default:
      i49 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar13[i47] = (char)(i49 ^ i48);
      i47++;
      break;
      i49 = 5;
      continue;
      i49 = 73;
      continue;
      i49 = 62;
      continue;
      i49 = 12;
    }
    label1720: int i52 = arrayOfChar14[i51];
    int i53;
    switch (i51 % 5)
    {
    default:
      i53 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar14[i51] = (char)(i53 ^ i52);
      i51++;
      break;
      i53 = 5;
      continue;
      i53 = 73;
      continue;
      i53 = 62;
      continue;
      i53 = 12;
    }
    label1808: int i56 = arrayOfChar15[i55];
    int i57;
    switch (i55 % 5)
    {
    default:
      i57 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar15[i55] = (char)(i57 ^ i56);
      i55++;
      break;
      i57 = 5;
      continue;
      i57 = 73;
      continue;
      i57 = 62;
      continue;
      i57 = 12;
    }
  }

  public ju(String paramString1, String paramString2, Vector paramVector, int paramInt)
  {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramVector;
    this.e = paramInt;
    if (paramString1 == null)
    {
      this.f = Long.valueOf(System.currentTimeMillis());
      eu.p.put("" + this.f, this);
      if (!DialogToastListActivity.f);
    }
    else
    {
      eu.p.put(paramString1, this);
    }
    if ((paramInt == 16) || (paramInt == 14) || (paramInt == 34))
    {
      this.j = new dab(this);
      a.schedule(this.j, 20000L);
    }
  }

  static dab a(ju paramju)
  {
    return paramju.j;
  }

  public void a(int paramInt)
  {
    boolean bool = DialogToastListActivity.f;
    g5.b(z[4] + paramInt + z[12] + this.b + z[12] + this.e);
    switch (this.e)
    {
    default:
    case 13:
    case 14:
      do
      {
        do
        {
          if (this.b == null)
          {
            eu.p.remove(this.f);
            if (!bool);
          }
          else
          {
            eu.p.remove(this.b);
          }
          return;
          switch (paramInt)
          {
          default:
            App.z.a(eu.a(this.b, this.c, this.d, 3));
          case 500:
          case 406:
          case 401:
          case 400:
          }
        }
        while (!bool);
        switch (paramInt)
        {
        default:
        case 500:
        case 401:
        case 400:
        }
      }
      while (!bool);
    case 34:
      label184: label244: switch (paramInt)
      {
      case 402:
      case 403:
      default:
      case 400:
      case 401:
      case 404:
      }
      break;
    case 16:
    }
    while (bool)
      switch (paramInt)
      {
      default:
        break;
      case 400:
        g5.d(z[5]);
        break;
        g5.d(z[2]);
        eu.o.sendEmptyMessage(50);
        g5.d(z[7]);
        if (!bool)
          break label184;
        g5.d(z[3]);
        if (!bool)
          break label184;
        g5.d(z[9]);
        break label184;
        g5.d(z[6]);
        if (!bool)
          break label244;
        g5.d(z[8]);
        if (!bool)
          break label244;
        g5.d(z[10]);
        break label244;
        g5.d(z[11]);
        if (bool)
        {
          g5.d(z[1]);
          if (bool)
            g5.d(z[13]);
        }
        break;
      }
  }

  public void a(String paramString)
  {
    this.h = true;
    g5.b(z[14] + paramString + z[12] + this.e);
    if (this.b == null)
    {
      eu.p.remove(this.f);
      if (!DialogToastListActivity.f);
    }
    else
    {
      eu.p.remove(this.b);
    }
  }

  public void run()
  {
    g5.b(z[0] + this.e);
    if (this.b == null)
    {
      eu.p.remove(this.f);
      if (!DialogToastListActivity.f);
    }
    else
    {
      eu.p.remove(this.b);
    }
  }
}