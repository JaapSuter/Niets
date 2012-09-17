package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class j6
  implements DialogInterface.OnClickListener
{
  final VerifyMessageStoreListActivity a;

  j6(VerifyMessageStoreListActivity paramVerifyMessageStoreListActivity)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.finish();
  }
}