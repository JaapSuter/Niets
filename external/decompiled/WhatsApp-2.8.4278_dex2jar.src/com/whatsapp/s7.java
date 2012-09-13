package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import i;

class s7
  implements View.OnClickListener
{
  private static final String[] z;
  final ViewSharedContactActivity a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "cbH.\b$9Q?Bx8[1]lzYpQd{\0233S{e\003/\017".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "jxX,]br\0227\\sR*\034juH7]e8j\027w\\".toCharArray();
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
        m = 50;
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
        m = 11;
        continue;
        m = 22;
        continue;
        m = 60;
        continue;
        m = 94;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 50;
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
      i3 = 11;
      continue;
      i3 = 22;
      continue;
      i3 = 60;
      continue;
      i3 = 94;
    }
  }

  s7(ViewSharedContactActivity paramViewSharedContactActivity)
  {
  }

  public void onClick(View paramView)
  {
    if (this.a.i)
      ViewSharedContactActivity.a(this.a, paramView);
    while (true)
    {
      return;
      String str1 = ((i)paramView.getTag()).c;
      String str2 = z[0] + str1;
      Intent localIntent = new Intent(z[1], Uri.parse(str2));
      this.a.startActivity(localIntent);
    }
  }
}