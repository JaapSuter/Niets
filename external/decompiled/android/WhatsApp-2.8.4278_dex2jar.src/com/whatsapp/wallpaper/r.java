package com.whatsapp.wallpaper;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class r
  implements DialogInterface.OnClickListener
{
  final WallpaperPicker a;

  r(WallpaperPicker paramWallpaperPicker)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(1);
    this.a.finish();
  }
}