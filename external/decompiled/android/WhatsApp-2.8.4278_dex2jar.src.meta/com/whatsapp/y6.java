package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class y6
  implements DialogInterface.OnClickListener
{
  final VerifySms a;

  y6(VerifySms paramVerifySms)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(23);
    VerifySms.n(this.a);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.y6
 * JD-Core Version:    0.6.1
 */