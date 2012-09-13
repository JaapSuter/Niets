package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Process;

final class ro
  implements DialogInterface.OnCancelListener
{
  final Activity a;

  ro(Activity paramActivity)
  {
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    this.a.finish();
    Process.killProcess(Process.myPid());
  }
}