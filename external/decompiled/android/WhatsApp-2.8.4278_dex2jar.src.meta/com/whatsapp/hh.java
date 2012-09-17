package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class hh
  implements View.OnClickListener
{
  private static final String z;
  final Advanced a;

  static
  {
    char[] arrayOfChar = "hT't>z\025 }8".toCharArray();
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
      m = 10;
      continue;
      m = 53;
      continue;
      m = 68;
      continue;
      m = 31;
    }
  }

  hh(Advanced paramAdvanced)
  {
  }

  public void onClick(View paramView)
  {
    App.d(z);
    try
    {
      App.z.a(false, false);
      Conversation.i();
      xq.e();
      label21: return;
    }
    catch (Exception localException)
    {
      break label21;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.hh
 * JD-Core Version:    0.6.1
 */