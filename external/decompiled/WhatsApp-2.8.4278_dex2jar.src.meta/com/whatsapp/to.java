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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.to
 * JD-Core Version:    0.6.1
 */