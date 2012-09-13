package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class s6
  implements DialogInterface.OnClickListener
{
  final VerifyMessageStoreListActivity a;

  s6(VerifyMessageStoreListActivity paramVerifyMessageStoreListActivity)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(105);
    this.a.showDialog(106);
  }
}