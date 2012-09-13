package com.whatsapp;

import android.os.AsyncTask;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import java.io.IOException;

public class xb extends AsyncTask<String, Void, Integer>
{
  private static final String[] z;
  final Settings a;

  static
  {
    String[] arrayOfString = new String[16];
    char[] arrayOfChar1 = "|NlD\0312[jW\004n@fT\0352".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    char[] arrayOfChar4;
    int i9;
    char[] arrayOfChar5;
    int i13;
    char[] arrayOfChar6;
    int i17;
    char[] arrayOfChar7;
    int i21;
    char[] arrayOfChar8;
    int i25;
    char[] arrayOfChar9;
    int i29;
    char[] arrayOfChar10;
    int i33;
    char[] arrayOfChar11;
    int i37;
    char[] arrayOfChar12;
    int i41;
    char[] arrayOfChar13;
    int i45;
    char[] arrayOfChar14;
    int i49;
    char[] arrayOfChar15;
    int i53;
    char[] arrayOfChar16;
    int i57;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "sIuT\037".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "|NlD\0312[jW\004n@fT\0352IqC\002o\f".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label780;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "yIeP\030qX".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label868;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "sIuT\0370[kX\001x\001s]\030zKfU".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label956;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "jEeX2n@fT\035B\\l]\004~U".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label1044;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "hBh_\002jB".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label1132;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "|NlD\0312[jW\004n@fT\0352BlE@{Cv_\t".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1220;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "|ZbX\001|NoT".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1308;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "\027&".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1396;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "~DbE@".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label1484;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "~DbE".toCharArray();
        int i40 = arrayOfChar12.length;
        i41 = 0;
        if (i40 > i41)
          break label1572;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "sC.R\002sBfR\031tZjE\024".toCharArray();
        int i44 = arrayOfChar13.length;
        i45 = 0;
        if (i44 > i45)
          break label1660;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "nIwE\004sKp\036\fCvE".toCharArray();
        int i48 = arrayOfChar14.length;
        i49 = 0;
        if (i48 > i49)
          break label1748;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "|NlD\0312Ol_\031|OwBB~Cv_\031=".toCharArray();
        int i52 = arrayOfChar15.length;
        i53 = 0;
        if (i52 > i53)
          break label1836;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "=\004".toCharArray();
        int i56 = arrayOfChar16.length;
        i57 = 0;
        if (i56 > i57)
          break label1924;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 109;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[j] = (char)(m ^ k);
        j++;
        break;
        m = 29;
        continue;
        m = 44;
        continue;
        m = 3;
        continue;
        m = 49;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 109;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i1] = (char)(i3 ^ i2);
      i1++;
      break;
      i3 = 29;
      continue;
      i3 = 44;
      continue;
      i3 = 3;
      continue;
      i3 = 49;
    }
    label780: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 109;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i5] = (char)(i7 ^ i6);
      i5++;
      break;
      i7 = 29;
      continue;
      i7 = 44;
      continue;
      i7 = 3;
      continue;
      i7 = 49;
    }
    label868: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 109;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i9] = (char)(i11 ^ i10);
      i9++;
      break;
      i11 = 29;
      continue;
      i11 = 44;
      continue;
      i11 = 3;
      continue;
      i11 = 49;
    }
    label956: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 109;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i13] = (char)(i15 ^ i14);
      i13++;
      break;
      i15 = 29;
      continue;
      i15 = 44;
      continue;
      i15 = 3;
      continue;
      i15 = 49;
    }
    label1044: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 109;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i17] = (char)(i19 ^ i18);
      i17++;
      break;
      i19 = 29;
      continue;
      i19 = 44;
      continue;
      i19 = 3;
      continue;
      i19 = 49;
    }
    label1132: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 109;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i21] = (char)(i23 ^ i22);
      i21++;
      break;
      i23 = 29;
      continue;
      i23 = 44;
      continue;
      i23 = 3;
      continue;
      i23 = 49;
    }
    label1220: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 109;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar8[i25] = (char)(i27 ^ i26);
      i25++;
      break;
      i27 = 29;
      continue;
      i27 = 44;
      continue;
      i27 = 3;
      continue;
      i27 = 49;
    }
    label1308: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 109;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar9[i29] = (char)(i31 ^ i30);
      i29++;
      break;
      i31 = 29;
      continue;
      i31 = 44;
      continue;
      i31 = 3;
      continue;
      i31 = 49;
    }
    label1396: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 109;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar10[i33] = (char)(i35 ^ i34);
      i33++;
      break;
      i35 = 29;
      continue;
      i35 = 44;
      continue;
      i35 = 3;
      continue;
      i35 = 49;
    }
    label1484: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 109;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar11[i37] = (char)(i39 ^ i38);
      i37++;
      break;
      i39 = 29;
      continue;
      i39 = 44;
      continue;
      i39 = 3;
      continue;
      i39 = 49;
    }
    label1572: int i42 = arrayOfChar12[i41];
    int i43;
    switch (i41 % 5)
    {
    default:
      i43 = 109;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar12[i41] = (char)(i43 ^ i42);
      i41++;
      break;
      i43 = 29;
      continue;
      i43 = 44;
      continue;
      i43 = 3;
      continue;
      i43 = 49;
    }
    label1660: int i46 = arrayOfChar13[i45];
    int i47;
    switch (i45 % 5)
    {
    default:
      i47 = 109;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar13[i45] = (char)(i47 ^ i46);
      i45++;
      break;
      i47 = 29;
      continue;
      i47 = 44;
      continue;
      i47 = 3;
      continue;
      i47 = 49;
    }
    label1748: int i50 = arrayOfChar14[i49];
    int i51;
    switch (i49 % 5)
    {
    default:
      i51 = 109;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar14[i49] = (char)(i51 ^ i50);
      i49++;
      break;
      i51 = 29;
      continue;
      i51 = 44;
      continue;
      i51 = 3;
      continue;
      i51 = 49;
    }
    label1836: int i54 = arrayOfChar15[i53];
    int i55;
    switch (i53 % 5)
    {
    default:
      i55 = 109;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar15[i53] = (char)(i55 ^ i54);
      i53++;
      break;
      i55 = 29;
      continue;
      i55 = 44;
      continue;
      i55 = 3;
      continue;
      i55 = 49;
    }
    label1924: int i58 = arrayOfChar16[i57];
    int i59;
    switch (i57 % 5)
    {
    default:
      i59 = 109;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar16[i57] = (char)(i59 ^ i58);
      i57++;
      break;
      i59 = 29;
      continue;
      i59 = 44;
      continue;
      i59 = 3;
      continue;
      i59 = 49;
    }
  }

  protected xb(Settings paramSettings)
  {
  }

  protected Integer a(String[] paramArrayOfString)
  {
    a();
    try
    {
      Settings.a(this.a, yp.a());
      g5.b(z[14] + tp.c(1) + "/" + tp.c(2) + z[15] + App.i(App.Mb) + ")");
      localInteger = Integer.valueOf(0);
      return localInteger;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        Settings.a(this.a, null);
        localInteger = Integer.valueOf(-1);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        Settings.a(this.a, null);
        Integer localInteger = Integer.valueOf(-1);
      }
    }
  }

  void a()
  {
    boolean bool = DialogToastListActivity.f;
    try
    {
      switch (Settings.System.getInt(this.a.getContentResolver(), z[5]))
      {
      default:
      case 0:
      case 2:
      case 1:
      }
      while (true)
      {
        String str = z[6];
        do
        {
          do
          {
            do
            {
              g5.b(z[0] + str);
              break;
              str = z[3];
            }
            while (!bool);
            str = z[1];
          }
          while (!bool);
          str = z[4];
        }
        while (!bool);
      }
    }
    catch (Settings.SettingNotFoundException localSettingNotFoundException)
    {
      g5.b(z[7]);
    }
    catch (Exception localException)
    {
      g5.b(z[2] + localException.toString());
    }
  }

  protected void a(Integer paramInteger)
  {
    int i = 0;
    this.a.removeDialog(101);
    q4 localq4 = UserFeedbackActivity.a(this.a, z[11], Settings.c(this.a));
    if (localq4.a != null)
    {
      if (localq4.b == z[12])
      {
        this.a.showDialog(102);
        return;
      }
      StringBuilder localStringBuilder = new StringBuilder().append(localq4.a).append(z[9]);
      Settings localSettings2 = this.a;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[i] = this.a.getString(2131296288);
      localq4.a = localSettings2.getString(2131296346, arrayOfObject);
    }
    Settings.a(this.a, localq4.a);
    if (localq4.b != null)
    {
      if (localq4.b == z[8])
        i = 1;
      localq4.b = (z[10] + localq4.b);
    }
    Settings localSettings1 = this.a;
    if (i != 0);
    for (String str = null; ; str = localq4.b)
    {
      Settings.b(localSettings1, str);
      if (this.a.isFinishing())
        break;
      if (Settings.e(this.a) != null)
      {
        this.a.showDialog(103);
        if (!DialogToastListActivity.f)
          break;
      }
      UserFeedbackActivity.a(this.a, z[13], Settings.a(this.a), Integer.valueOf(1));
      break;
    }
  }

  protected void onPreExecute()
  {
    this.a.showDialog(101);
  }
}