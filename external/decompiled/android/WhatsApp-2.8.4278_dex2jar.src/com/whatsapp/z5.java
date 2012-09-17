package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class z5
  implements DialogInterface.OnClickListener
{
  final VerifyMessageStoreActivity a;

  z5(VerifyMessageStoreActivity paramVerifyMessageStoreActivity)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(106);
    new ac(this.a, false, this.a.k).execute(new Object[0]);
  }
}