package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class a6
  implements DialogInterface.OnClickListener
{
  final VerifyMessageStoreActivity a;

  a6(VerifyMessageStoreActivity paramVerifyMessageStoreActivity)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(102);
    new ac(this.a, false, this.a.k).execute(new Object[0]);
  }
}