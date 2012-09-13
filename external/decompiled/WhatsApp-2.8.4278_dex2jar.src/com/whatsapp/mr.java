package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class mr
  implements DialogInterface.OnClickListener
{
  final DialogToastActivity a;

  mr(DialogToastActivity paramDialogToastActivity)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(500);
    if (DialogToastActivity.a(this.a) != null)
      DialogToastActivity.a(this.a).a();
  }
}