package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class e6
  implements DialogInterface.OnClickListener
{
  final VerifyMessageStoreActivity a;

  e6(VerifyMessageStoreActivity paramVerifyMessageStoreActivity)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(103);
    this.a.showDialog(106);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.e6
 * JD-Core Version:    0.6.1
 */