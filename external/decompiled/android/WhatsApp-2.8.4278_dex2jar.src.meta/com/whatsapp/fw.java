package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class fw
  implements DialogInterface.OnCancelListener
{
  final LocationPickerPopup a;

  fw(LocationPickerPopup paramLocationPickerPopup)
  {
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    this.a.finish();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.fw
 * JD-Core Version:    0.6.1
 */