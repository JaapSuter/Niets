package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class yk
  implements DialogInterface.OnClickListener
{
  private static final String z;
  final Conversation a;

  static
  {
    char[] arrayOfChar = "zVod5kJ`f9vW.v9xUnu{Unq;6Wn?>|Mv}\"r\024bs>wVu?2uVby".toCharArray();
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
      m = 80;
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
      m = 25;
      continue;
      m = 57;
      continue;
      m = 1;
      continue;
      m = 18;
    }
  }

  yk(Conversation paramConversation)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (!App.sb())
    {
      g5.c(z);
      App.a(this.a.getBaseContext(), 2131296525, 0);
      if (!DialogToastListActivity.f);
    }
    else
    {
      Conversation.d(this.a, true);
      this.a.showDialog(107);
      new r8(this).start();
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.yk
 * JD-Core Version:    0.6.1
 */