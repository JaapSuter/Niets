package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class n4
  implements DialogInterface.OnClickListener
{
  final UserFeedbackActivity a;

  n4(UserFeedbackActivity paramUserFeedbackActivity)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(201);
    UserFeedbackActivity.a(this.a, UserFeedbackActivity.a(this.a), UserFeedbackActivity.b(this.a), null);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.n4
 * JD-Core Version:    0.6.1
 */