package com.whatsapp;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class so
  implements View.OnClickListener
{
  private static final String z;
  final e a;

  static
  {
    char[] arrayOfChar = "kT]\0317c^\027\0026~_W\037vkYM\0027d\024o\"\035]".toCharArray();
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
      m = 88;
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
      m = 10;
      continue;
      m = 58;
      continue;
      m = 57;
      continue;
      m = 107;
    }
  }

  so(e parame)
  {
  }

  public void onClick(View paramView)
  {
    Intent localIntent = new Intent(z);
    localIntent.setData(k4.a());
    this.a.b.startActivity(localIntent);
    this.a.b.finish();
  }
}