package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class y5
  implements DialogInterface.OnClickListener
{
  final VerifyMessageStoreActivity a;

  y5(VerifyMessageStoreActivity paramVerifyMessageStoreActivity)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(106);
    new ac(this.a, true, this.a.k).execute(new Object[0]);
  }
}