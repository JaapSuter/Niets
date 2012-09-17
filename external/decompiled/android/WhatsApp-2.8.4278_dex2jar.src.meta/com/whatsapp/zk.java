package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

class zk
  implements DialogInterface.OnClickListener
{
  private static final String z;
  final Conversation a;

  static
  {
    char[] arrayOfChar = "'cpEi/i:Dc2y}Ya5#XxE\007Y]xH\031^[bT\005HKdC\022Y]yA\025".toCharArray();
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
      m = 6;
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
      m = 70;
      continue;
      m = 13;
      continue;
      m = 20;
      continue;
      m = 55;
    }
  }

  zk(Conversation paramConversation)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.startActivityForResult(new Intent(z), 15);
    Conversation.q = false;
    this.a.removeDialog(2);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.zk
 * JD-Core Version:    0.6.1
 */