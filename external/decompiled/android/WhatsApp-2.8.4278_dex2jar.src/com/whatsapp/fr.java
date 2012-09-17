package com.whatsapp;

import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;

class fr
  implements View.OnClickListener
{
  private static final String z;
  final DeleteAccountConfirmation a;

  static
  {
    char[] arrayOfChar = "\005Sg\020\t\004Wh\026\t\002Ye\023\024\023[$\033\022LUd\033\023\004U\034\013\bBr".toCharArray();
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
      m = 125;
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
      m = 97;
      continue;
      m = 54;
      continue;
      m = 11;
      continue;
      m = 117;
    }
  }

  fr(DeleteAccountConfirmation paramDeleteAccountConfirmation)
  {
  }

  public void onClick(View paramView)
  {
    if (!App.sb())
    {
      g5.b(z);
      this.a.showDialog(2);
    }
    while (true)
    {
      return;
      this.a.showDialog(1);
      DeleteAccountConfirmation.a(this.a).sendEmptyMessageDelayed(0, 60000L);
      App.r();
    }
  }
}