package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class jn
  implements DialogInterface.OnClickListener
{
  final int[] a;
  final String b;
  final int c;
  final Conversation d;

  jn(Conversation paramConversation, int[] paramArrayOfInt, String paramString, int paramInt)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.d.a(this.a[paramInt], this.b, this.c);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.jn
 * JD-Core Version:    0.6.1
 */