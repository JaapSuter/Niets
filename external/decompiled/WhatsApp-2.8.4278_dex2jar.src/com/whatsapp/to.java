package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class to
  implements DialogInterface.OnCancelListener
{
  final Activity a;

  to(Activity paramActivity)
  {
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    this.a.finish();
  }
}