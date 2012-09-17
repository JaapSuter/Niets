package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.view.View.OnClickListener;
import l;

class q7
  implements View.OnClickListener
{
  private static final String[] z;
  final ViewSharedContactActivity a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "��Gmt5[".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\025Le<u\035F/'t��Go:4\025Au'u\032\fB\017V8".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
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
        m = 26;
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
        m = 116;
        continue;
        m = 34;
        continue;
        m = 1;
        continue;
        m = 78;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 26;
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
      i3 = 116;
      continue;
      i3 = 34;
      continue;
      i3 = 1;
      continue;
      i3 = 78;
    }
  }

  q7(ViewSharedContactActivity paramViewSharedContactActivity)
  {
  }

  public void onClick(View paramView)
  {
    if (this.a.i)
      ViewSharedContactActivity.a(this.a, paramView);
    while (true)
    {
      return;
      String str = PhoneNumberUtils.stripSeparators(((l)paramView.getTag()).b);
      Intent localIntent = new Intent(z[1], Uri.parse(z[0] + str));
      localIntent.setFlags(268435456);
      this.a.startActivity(localIntent);
    }
  }
}