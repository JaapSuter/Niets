package com.whatsapp;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;

class wh
  implements SharedPreferences.OnSharedPreferenceChangeListener
{
  private static final String[] z;
  final App a;

  static
  {
    String[] arrayOfString = new String[8];
    char[] arrayOfChar1 = "(B&TK\020^&UR)I\026WR-B(U^\020\\,O\\;X".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "!_=H]6o%H\\'D\026BT#_;".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "!_=H]6o;HU(D&O^".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label477;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "(B&TK\020^&UR)I\026MR(X=~X \\&S".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label569;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "(B&TK\020^&UR)I\026QT?E9~V T,".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label661;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "!_=H]6o?HY=Q=Dd#U'FO'".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label753;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "(B&TK\020^&UR)I\026UT!U".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label845;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "!_=H]6o9NK:@\026LT+U".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label937;
        arrayOfString[7] = new String(arrayOfChar8).intern();
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
        m = 59;
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
        m = 79;
        continue;
        m = 48;
        continue;
        m = 73;
        continue;
        m = 33;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 59;
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
      i3 = 79;
      continue;
      i3 = 48;
      continue;
      i3 = 73;
      continue;
      i3 = 33;
    }
    label477: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 59;
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
      i7 = 79;
      continue;
      i7 = 48;
      continue;
      i7 = 73;
      continue;
      i7 = 33;
    }
    label569: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 59;
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
      i11 = 79;
      continue;
      i11 = 48;
      continue;
      i11 = 73;
      continue;
      i11 = 33;
    }
    label661: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 59;
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
      i15 = 79;
      continue;
      i15 = 48;
      continue;
      i15 = 73;
      continue;
      i15 = 33;
    }
    label753: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 59;
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
      i19 = 79;
      continue;
      i19 = 48;
      continue;
      i19 = 73;
      continue;
      i19 = 33;
    }
    label845: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 59;
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
      i23 = 79;
      continue;
      i23 = 48;
      continue;
      i23 = 73;
      continue;
      i23 = 33;
    }
    label937: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 59;
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
      i27 = 79;
      continue;
      i27 = 48;
      continue;
      i27 = 73;
      continue;
      i27 = 33;
    }
  }

  wh(App paramApp)
  {
  }

  public void onSharedPreferenceChanged(SharedPreferences paramSharedPreferences, String paramString)
  {
    if ((paramString != null) && ((paramString.equals(z[4])) || (paramString.equals(z[7])) || (paramString.equals(z[6])) || (paramString.equals(z[2])) || (paramString.equals(z[3])) || (paramString.equals(z[1])) || (paramString.equals(z[0])) || (paramString.equals(z[5]))))
      App.j(App.c(paramSharedPreferences));
  }
}