package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import java.io.File;

class kg
  implements View.OnClickListener
{
  private static final String[] z;
  final Advanced a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = ";\021s<\f:T~7\034-\033v=X<\033q-\031<��l".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = ">\032{+\0276\020@:\0271��~:\f,".toCharArray();
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
        m = 120;
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
        m = 95;
        continue;
        m = 116;
        continue;
        m = 31;
        continue;
        m = 89;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 120;
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
      i3 = 95;
      continue;
      i3 = 116;
      continue;
      i3 = 31;
      continue;
      i3 = 89;
    }
  }

  kg(Advanced paramAdvanced)
  {
  }

  public void onClick(View paramView)
  {
    App.d(z[0]);
    new File(App.Mb.getFilesDir(), z[1]).delete();
  }
}