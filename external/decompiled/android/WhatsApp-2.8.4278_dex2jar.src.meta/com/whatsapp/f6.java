package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class f6
  implements DialogInterface.OnClickListener
{
  final VerifyMessageStoreActivity a;

  f6(VerifyMessageStoreActivity paramVerifyMessageStoreActivity)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(103);
    new ac(this.a, true, this.a.k).execute(new Object[0]);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.f6
 * JD-Core Version:    0.6.1
 */