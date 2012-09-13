package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class s2
  implements DialogInterface.OnClickListener
{
  final zq a;
  final Settings b;

  s2(Settings paramSettings, zq paramzq)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.b.removeDialog(19);
    Conversation.a(this.b, this.a, false, 17, 18);
  }
}