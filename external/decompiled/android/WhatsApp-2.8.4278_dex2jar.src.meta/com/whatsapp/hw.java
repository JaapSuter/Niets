package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class hw
  implements DialogInterface.OnClickListener
{
  final Main a;

  hw(Main paramMain)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    k4.d();
    this.a.removeDialog(0);
    Main.a(this.a);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.hw
 * JD-Core Version:    0.6.1
 */