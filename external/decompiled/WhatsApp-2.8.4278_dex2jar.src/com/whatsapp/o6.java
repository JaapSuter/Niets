package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class o6
  implements DialogInterface.OnClickListener
{
  final VerifyMessageStoreListActivity a;

  o6(VerifyMessageStoreListActivity paramVerifyMessageStoreListActivity)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(107);
    new bc(this.a, false, false).execute(new Object[0]);
  }
}