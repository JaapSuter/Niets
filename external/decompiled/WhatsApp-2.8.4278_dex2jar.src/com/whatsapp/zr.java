package com.whatsapp;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.ArrayList;

public class zr
  implements InputFilter
{
  private static final String[] z;
  private int a;

  static
  {
    String[] arrayOfString = new String[7];
    char[] arrayOfChar1 = "\020\032fxlDS".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\020\004sa$".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\020\f|}$".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label441;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\020\ramB\035(".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label533;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "C\006gk}U".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label625;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "T\fam$".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label717;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "S\006gwj\n".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label809;
        arrayOfString[6] = new String(arrayOfChar7).intern();
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
        m = 30;
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
        m = 48;
        continue;
        m = 105;
        continue;
        m = 18;
        continue;
        m = 25;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 30;
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
      i3 = 48;
      continue;
      i3 = 105;
      continue;
      i3 = 18;
      continue;
      i3 = 25;
    }
    label441: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 30;
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
      i7 = 48;
      continue;
      i7 = 105;
      continue;
      i7 = 18;
      continue;
      i7 = 25;
    }
    label533: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 30;
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
      i11 = 48;
      continue;
      i11 = 105;
      continue;
      i11 = 18;
      continue;
      i11 = 25;
    }
    label625: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 30;
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
      i15 = 48;
      continue;
      i15 = 105;
      continue;
      i15 = 18;
      continue;
      i15 = 25;
    }
    label717: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 30;
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
      i19 = 48;
      continue;
      i19 = 105;
      continue;
      i19 = 18;
      continue;
      i19 = 25;
    }
    label809: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 30;
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
      i23 = 48;
      continue;
      i23 = 105;
      continue;
      i23 = 18;
      continue;
      i23 = 25;
    }
  }

  public zr(int paramInt)
  {
    this.a = paramInt;
  }

  public CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
  {
    Object localObject = null;
    if (EditGroupSubject.w)
      g5.d(z[4] + paramCharSequence + z[0] + paramInt1 + z[2] + paramInt2);
    if (EditGroupSubject.w)
      g5.c(z[5] + paramSpanned + z[3] + paramInt3);
    int i = EditGroupSubject.u.size();
    if (EditGroupSubject.w)
      g5.d(z[6] + i + z[1] + this.a);
    if (i < this.a);
    while (true)
    {
      return localObject;
      if (EditGroupSubject.y)
        EditGroupSubject.y = false;
      else
        localObject = "";
    }
  }
}