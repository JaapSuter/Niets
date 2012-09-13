package com.whatsapp.wallpaper;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class n
  implements DialogInterface.OnClickListener
{
  final WallpaperPicker a;

  n(WallpaperPicker paramWallpaperPicker)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.finish();
  }
}