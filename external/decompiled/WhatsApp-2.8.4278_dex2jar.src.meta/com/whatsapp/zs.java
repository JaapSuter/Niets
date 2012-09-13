package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class zs
  implements DialogInterface.OnCancelListener
{
  final EULA a;

  zs(EULA paramEULA)
  {
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    this.a.removeDialog(7);
    this.a.showDialog(8);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.zs
 * JD-Core Version:    0.6.1
 */