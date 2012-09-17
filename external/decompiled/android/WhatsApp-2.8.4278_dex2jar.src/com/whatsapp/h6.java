package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class h6
  implements DialogInterface.OnClickListener
{
  final VerifyMessageStoreActivity a;

  h6(VerifyMessageStoreActivity paramVerifyMessageStoreActivity)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(105);
    new ac(this.a, true, this.a.k).execute(new Object[0]);
  }
}