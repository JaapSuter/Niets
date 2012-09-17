package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

class ir
  implements View.OnClickListener
{
  private static final String[] z;
  final DescribeProblemActivity a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "9\004_:n1\016\025!o,\017U</9\tO!n6Dm\001D\017".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "0\036O8;wEL?vv\035S)u+\013K8/;\005Vgg9\033\024".toCharArray();
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
        m = 1;
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
        m = 88;
        continue;
        m = 106;
        continue;
        m = 59;
        continue;
        m = 72;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 1;
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
      i3 = 88;
      continue;
      i3 = 106;
      continue;
      i3 = 59;
      continue;
      i3 = 72;
    }
  }

  ir(DescribeProblemActivity paramDescribeProblemActivity)
  {
  }

  public void onClick(View paramView)
  {
    String str = z[1];
    Intent localIntent = new Intent(z[0], Uri.parse(str));
    this.a.startActivity(localIntent);
  }
}