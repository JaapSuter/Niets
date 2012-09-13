package com.whatsapp;

import android.telephony.PhoneNumberUtils;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat;
import java.text.SimpleDateFormat;

public abstract class yq
{
  static SimpleDateFormat d;
  public static int e;
  private static final String[] z;
  public int a;
  public String b;
  public String c = null;

  static
  {
    String[] arrayOfString = new String[6];
    char[] arrayOfChar1 = "\021S0\021o\021Hq\003a��Q?\021z\027Ns��v\021Y.\021g\035R~\013{\037\006".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "(f".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\021S0\021o\021Hq\025f\035R;\013{\037^;\027!\030U:J`\007P2".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label417;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "RI0\026k\027R\001\b}\025c=\n{\034Hc".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label509;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\030U:X".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label601;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "7\006\026-4\037Qd\026}".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label693;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        z = arrayOfString;
        d = new SimpleDateFormat(z[5]);
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 14;
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
        m = 114;
        continue;
        m = 60;
        continue;
        m = 94;
        continue;
        m = 101;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 14;
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
      i3 = 114;
      continue;
      i3 = 60;
      continue;
      i3 = 94;
      continue;
      i3 = 101;
    }
    label417: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 14;
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
      i7 = 114;
      continue;
      i7 = 60;
      continue;
      i7 = 94;
      continue;
      i7 = 101;
    }
    label509: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 14;
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
      i11 = 114;
      continue;
      i11 = 60;
      continue;
      i11 = 94;
      continue;
      i11 = 101;
    }
    label601: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 14;
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
      i15 = 114;
      continue;
      i15 = 60;
      continue;
      i15 = 94;
      continue;
      i15 = 101;
    }
    label693: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 14;
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
      i19 = 114;
      continue;
      i19 = 60;
      continue;
      i19 = 94;
      continue;
      i19 = 101;
    }
  }

  protected yq()
  {
    this.b = null;
  }

  protected yq(String paramString)
  {
    this.b = paramString;
  }

  protected yq(String paramString1, String paramString2)
  {
    this.b = paramString1;
    this.c = paramString2;
  }

  public static String a(String paramString)
  {
    if (paramString == null)
    {
      g5.c(z[2]);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      int i = paramString.indexOf('@');
      if (i != -1)
        if (zq.c(paramString))
        {
          paramString = paramString.substring(1 + paramString.indexOf("-"), paramString.lastIndexOf("@"));
        }
        else
        {
          String str1 = paramString.substring(0, i);
          if (PhoneNumberUtils.isGlobalPhoneNumber(str1))
          {
            str1 = '+' + str1;
            if (!eu.f(paramString))
              try
              {
                PhoneNumberUtil localPhoneNumberUtil = PhoneNumberUtil.getInstance();
                String str2 = localPhoneNumberUtil.format(localPhoneNumberUtil.parse(str1, z[1]), PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL);
                paramString = str2;
              }
              catch (Exception localException)
              {
                g5.d(z[0] + str1 + " " + localException.getMessage());
              }
          }
          else
          {
            paramString = str1;
          }
        }
    }
  }

  public String a()
  {
    return a(this.b);
  }

  public String toString()
  {
    return z[4] + this.b + z[3] + this.a;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.yq
 * JD-Core Version:    0.6.1
 */