package com.whatsapp.wallpaper;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

class o
  implements DialogInterface.OnClickListener
{
  final String a;
  final WallpaperPicker b;

  o(WallpaperPicker paramWallpaperPicker, String paramString)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.b.startActivity(new Intent(this.a));
  }
}