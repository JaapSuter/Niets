package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class gs
  implements DialogInterface.OnCancelListener
{
  final b a;

  gs(b paramb)
  {
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    b.a(this.a, false);
    b.b = null;
    this.a.d.removeDialog(50);
  }
}