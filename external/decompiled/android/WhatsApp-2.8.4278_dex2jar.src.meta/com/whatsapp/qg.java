package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class qg
  implements View.OnClickListener
{
  private static final String z;
  final Advanced a;

  static
  {
    char[] arrayOfChar = "^C\021]\bKW".toCharArray();
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
      m = 107;
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
      m = 59;
      continue;
      m = 34;
      continue;
      m = 101;
      continue;
      m = 125;
    }
  }

  qg(Advanced paramAdvanced)
  {
  }

  public void onClick(View paramView)
  {
    App.d(z);
    new lc(this).handleMessage(null);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.qg
 * JD-Core Version:    0.6.1
 */