package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class m6
  implements DialogInterface.OnClickListener
{
  final VerifyMessageStoreListActivity a;

  m6(VerifyMessageStoreListActivity paramVerifyMessageStoreListActivity)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(102);
    new bc(this.a, false, false).execute(new Object[0]);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.m6
 * JD-Core Version:    0.6.1
 */