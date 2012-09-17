package com.whatsapp;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class c8
  implements DialogInterface.OnCancelListener
{
  final gc a;

  c8(gc paramgc)
  {
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    if (gc.a(this.a) != null)
      gc.a(this.a).dismiss();
    gc.a(this.a, null);
    this.a.cancel(true);
    if (WebImagePicker.e(this.a.c) == this.a)
      WebImagePicker.a(this.a.c, null);
  }
}