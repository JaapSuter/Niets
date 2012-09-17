package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

class qs
  implements View.OnClickListener
{
  private static final String[] z;
  final EULA a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "UI\bg \022\022\013`m\023J\024vnN\\\fg4^R\0218vXZ\035{5".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\\S\030euTYR~tIX\022c4\\^\b~uS\023*^_j".toCharArray();
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
        m = 61;
        continue;
        m = 61;
        continue;
        m = 124;
        continue;
        m = 23;
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
      i3 = 61;
      continue;
      i3 = 61;
      continue;
      i3 = 124;
      continue;
      i3 = 23;
    }
  }

  qs(EULA paramEULA)
  {
  }

  public void onClick(View paramView)
  {
    Intent localIntent = new Intent(z[1], Uri.parse(z[0]));
    this.a.startActivity(localIntent);
  }
}