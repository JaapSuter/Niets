package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class g6
  implements DialogInterface.OnClickListener
{
  final VerifyMessageStoreActivity a;

  g6(VerifyMessageStoreActivity paramVerifyMessageStoreActivity)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(105);
    this.a.showDialog(106);
  }
}