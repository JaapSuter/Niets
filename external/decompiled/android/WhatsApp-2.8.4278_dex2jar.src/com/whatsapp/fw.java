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