package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class o4
  implements DialogInterface.OnClickListener
{
  final UserFeedbackActivity a;

  o4(UserFeedbackActivity paramUserFeedbackActivity)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(202);
  }
}