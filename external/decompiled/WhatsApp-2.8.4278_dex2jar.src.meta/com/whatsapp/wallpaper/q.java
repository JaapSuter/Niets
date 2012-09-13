package com.whatsapp.wallpaper;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class q
  implements DialogInterface.OnCancelListener
{
  final WallpaperPicker a;

  q(WallpaperPicker paramWallpaperPicker)
  {
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    this.a.removeDialog(1);
    this.a.finish();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.wallpaper.q
 * JD-Core Version:    0.6.1
 */