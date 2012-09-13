package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class t6
  implements DialogInterface.OnClickListener
{
  final VerifyMessageStoreListActivity a;

  t6(VerifyMessageStoreListActivity paramVerifyMessageStoreListActivity)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(105);
    new bc(this.a, true, false).execute(new Object[0]);
  }
}