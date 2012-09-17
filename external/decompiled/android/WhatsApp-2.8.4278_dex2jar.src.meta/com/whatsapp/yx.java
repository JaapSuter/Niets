package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class yx
  implements View.OnClickListener
{
  private static final String z;
  final OverlayAlert a;

  static
  {
    char[] arrayOfChar = "goLu\033i`\006u\022z|Nn\004||[(\024dpJl\022l".toCharArray();
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
      m = 119;
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
      m = 8;
      continue;
      m = 25;
      continue;
      m = 41;
      continue;
      m = 7;
    }
  }

  yx(OverlayAlert paramOverlayAlert)
  {
  }

  public void onClick(View paramView)
  {
    g5.b(z);
    OverlayAlert.a(this.a);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.yx
 * JD-Core Version:    0.6.1
 */