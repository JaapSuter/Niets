package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class or
  implements DialogInterface.OnClickListener
{
  final DialogToastListActivity a;

  or(DialogToastListActivity paramDialogToastListActivity)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(500);
    if (DialogToastListActivity.a(this.a) != null)
      DialogToastListActivity.a(this.a).a();
  }
}