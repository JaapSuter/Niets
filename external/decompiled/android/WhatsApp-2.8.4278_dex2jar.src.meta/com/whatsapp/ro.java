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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ro
 * JD-Core Version:    0.6.1
 */