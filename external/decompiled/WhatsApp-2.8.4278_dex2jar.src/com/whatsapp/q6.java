package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class q6
  implements DialogInterface.OnClickListener
{
  final VerifyMessageStoreListActivity a;

  q6(VerifyMessageStoreListActivity paramVerifyMessageStoreListActivity)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(103);
    this.a.showDialog(106);
  }
}