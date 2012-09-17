package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import e;

class v7
  implements View.OnClickListener
{
  private static final String[] z;
  final e a;
  final ViewSharedContactActivity b;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "47\020".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "��\0138\031G\b\001r\002F\025��2\037\006��\006(\002G\017K\n\"m6".toCharArray();
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
        m = 40;
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
        m = 97;
        continue;
        m = 101;
        continue;
        m = 92;
        continue;
        m = 107;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 40;
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
      i3 = 97;
      continue;
      i3 = 101;
      continue;
      i3 = 92;
      continue;
      i3 = 107;
    }
  }

  v7(ViewSharedContactActivity paramViewSharedContactActivity, e parame)
  {
  }

  public void onClick(View paramView)
  {
    if (this.b.i)
      ViewSharedContactActivity.a(this.b, paramView);
    if (this.a.a.equals(z[0]))
    {
      Intent localIntent = new Intent(z[1], Uri.parse(paramView.getTag().toString()));
      this.b.startActivity(localIntent);
    }
  }
}