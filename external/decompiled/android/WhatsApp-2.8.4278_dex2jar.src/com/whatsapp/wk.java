package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;

class wk
  implements DialogInterface.OnClickListener
{
  final Conversation a;

  wk(Conversation paramConversation)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    int[] arrayOfInt = this.a.getResources().getIntArray(2131165190);
    n5.a(this.a.Qb.b, System.currentTimeMillis() + 1000 * (60 * arrayOfInt[paramInt]));
  }
}