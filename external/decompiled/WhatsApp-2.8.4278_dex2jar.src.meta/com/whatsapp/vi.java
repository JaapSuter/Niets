package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;

class vi
  implements View.OnClickListener
{
  private static final String z;
  final BroadcastMessageComposer a;

  static
  {
    char[] arrayOfChar = "\026,\036=3 /\013</\020&".toCharArray();
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
      m = 71;
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
      m = 127;
      continue;
      m = 66;
      continue;
      m = 110;
      continue;
      m = 72;
    }
  }

  vi(BroadcastMessageComposer paramBroadcastMessageComposer)
  {
  }

  public void onClick(View paramView)
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)this.a.getSystemService(z);
    if (localInputMethodManager != null)
      localInputMethodManager.hideSoftInputFromWindow(paramView.getWindowToken(), 0);
    Intent localIntent = new Intent(this.a, BroadcastMediaPicker.class);
    this.a.startActivityForResult(localIntent, 0);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.vi
 * JD-Core Version:    0.6.1
 */