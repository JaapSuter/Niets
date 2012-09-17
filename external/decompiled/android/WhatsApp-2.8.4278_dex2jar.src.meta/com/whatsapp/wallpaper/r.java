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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.wallpaper.r
 * JD-Core Version:    0.6.1
 */