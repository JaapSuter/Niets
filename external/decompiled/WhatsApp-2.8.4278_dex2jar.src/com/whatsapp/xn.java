package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class xn
  implements View.OnClickListener
{
  private static final String z;
  final df a;

  static
  {
    char[] arrayOfChar = "\036h~F$\t)tG<\023eI/]duL\"\034)}M8\016hwMk\n`d@k\023f0E.\031`q\b*\t}qK#\030m".toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    if (i <= j)
    {
      z = new String(arrayOfChar).intern();
      return;
    }
    int k = arrayOfChar[j];
    int m;
    switch (j % 5)
    {
    default:
      m = 75;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar[j] = (char)(m ^ k);
      j++;
      break;
      m = 125;
      continue;
      m = 9;
      continue;
      m = 16;
      continue;
      m = 40;
    }
  }

  xn(df paramdf)
  {
  }

  public void onClick(View paramView)
  {
    if (this.a.o.j != null)
    {
      App.a(this.a.n, this.a.o);
      if (!DialogToastListActivity.f);
    }
    else
    {
      g5.d(z);
      App.a(this.a.getContext(), 2131296523, 0);
    }
  }
}