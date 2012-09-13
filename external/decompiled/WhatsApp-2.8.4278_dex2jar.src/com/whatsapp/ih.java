package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class ih
  implements View.OnClickListener
{
  private static final String[] z;
  final Advanced a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "\031".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\020\0174W\021}\ngQ\006{\027}J\032".toCharArray();
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
        m = 37;
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
        m = 26;
        continue;
        m = 99;
        continue;
        m = 20;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 37;
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
      i3 = 26;
      continue;
      i3 = 99;
      continue;
      i3 = 20;
    }
  }

  ih(Advanced paramAdvanced)
  {
  }

  public void onClick(View paramView)
  {
    App.d(z[1]);
    this.a.deleteFile(z[0]);
  }
}