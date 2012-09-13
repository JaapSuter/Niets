package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class e6
  implements DialogInterface.OnClickListener
{
  final VerifyMessageStoreActivity a;

  e6(VerifyMessageStoreActivity paramVerifyMessageStoreActivity)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(103);
    this.a.showDialog(106);
  }
}