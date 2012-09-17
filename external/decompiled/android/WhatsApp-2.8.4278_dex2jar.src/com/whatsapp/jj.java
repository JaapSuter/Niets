package com.whatsapp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

class jj
  implements View.OnClickListener
{
  private static final String[] z;
  final kj a;
  final ContactInfo b;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "3h\021Qd3s Lk6hPAl1k_Al1k\032W%1w\017\005k?s_Cj%i\033".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "1i\033Wj9cQLk$b\021Q+1d\013Lj>);lD\034".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "$b\023\037".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label288;
        arrayOfString[2] = new String(arrayOfChar3).intern();
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
        m = 5;
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
        m = 80;
        continue;
        m = 7;
        continue;
        m = 127;
        continue;
        m = 37;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 5;
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
      i3 = 80;
      continue;
      i3 = 7;
      continue;
      i3 = 127;
      continue;
      i3 = 37;
    }
    label288: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 5;
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
      i7 = 80;
      continue;
      i7 = 7;
      continue;
      i7 = 127;
      continue;
      i7 = 37;
    }
  }

  jj(ContactInfo paramContactInfo, kj paramkj)
  {
  }

  public void onClick(View paramView)
  {
    String str = z[2] + this.a.a;
    Intent localIntent = new Intent(z[1], Uri.parse(str));
    try
    {
      this.b.startActivity(localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      while (true)
      {
        g5.c(z[0]);
        App.i();
      }
    }
  }
}