package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class wg
  implements View.OnClickListener
{
  private static final String z;
  final Advanced a;

  static
  {
    char[] arrayOfChar = "\026uO*;".toCharArray();
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
      m = 92;
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
      m = 114;
      continue;
      m = 16;
      continue;
      m = 45;
      continue;
      m = 95;
    }
  }

  wg(Advanced paramAdvanced)
  {
  }

  public void onClick(View paramView)
  {
    App.w.a(null);
    Intent localIntent = new Intent(this.a, RegisterName.class);
    localIntent.putExtra(z, true);
    this.a.finish();
    this.a.startActivity(localIntent);
  }
}