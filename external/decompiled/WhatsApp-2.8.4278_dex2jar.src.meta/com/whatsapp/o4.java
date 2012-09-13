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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.o4
 * JD-Core Version:    0.6.1
 */