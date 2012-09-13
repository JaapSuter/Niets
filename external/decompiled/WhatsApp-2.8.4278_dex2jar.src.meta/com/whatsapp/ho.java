package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ho
  implements DialogInterface.OnClickListener
{
  private static final String z;
  final Conversations a;

  static
  {
    char[] arrayOfChar = "e5ha2t)gc>i4u83c6cc2+9iy#g9r".toCharArray();
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
      m = 87;
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
      m = 6;
      continue;
      m = 90;
      continue;
      m = 6;
      continue;
      m = 23;
    }
  }

  ho(Conversations paramConversations)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    g5.b(z);
    App.m(Conversations.k().b);
    Conversations.a(this.a, 1 + Conversations.f(this.a));
    this.a.removeDialog(10);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ho
 * JD-Core Version:    0.6.1
 */