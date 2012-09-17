package com.whatsapp.wallpaper;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class s
  implements DialogInterface.OnClickListener
{
  final WallpaperPicker a;

  s(WallpaperPicker paramWallpaperPicker)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.finish();
  }
}