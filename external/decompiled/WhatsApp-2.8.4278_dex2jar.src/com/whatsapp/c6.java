package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class c6
  implements DialogInterface.OnClickListener
{
  final VerifyMessageStoreActivity a;

  c6(VerifyMessageStoreActivity paramVerifyMessageStoreActivity)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(107);
    new ac(this.a, false, this.a.k).execute(new Object[0]);
  }
}