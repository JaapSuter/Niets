package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class y5
  implements DialogInterface.OnClickListener
{
  final VerifyMessageStoreActivity a;

  y5(VerifyMessageStoreActivity paramVerifyMessageStoreActivity)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(106);
    new ac(this.a, true, this.a.k).execute(new Object[0]);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.y5
 * JD-Core Version:    0.6.1
 */