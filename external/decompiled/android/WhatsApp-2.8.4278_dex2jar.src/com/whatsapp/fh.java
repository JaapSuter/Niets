package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.messaging.MessageService;

class fh
  implements View.OnClickListener
{
  private static final String z;
  final Advanced a;

  static
  {
    char[] arrayOfChar = "\025.7\"\020\t.79".toCharArray();
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
      m = 126;
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
      m = 103;
      continue;
      m = 75;
      continue;
      m = 84;
      continue;
      m = 77;
    }
  }

  fh(Advanced paramAdvanced)
  {
  }

  public void onClick(View paramView)
  {
    App.d(z);
    MessageService.a(this.a, true);
  }
}