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