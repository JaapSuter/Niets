package com.whatsapp.wallpaper;

import android.view.View;
import android.view.View.OnClickListener;

class d
  implements View.OnClickListener
{
  final CropImage a;

  d(CropImage paramCropImage)
  {
  }

  public void onClick(View paramView)
  {
    this.a.setResult(0);
    this.a.finish();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.wallpaper.d
 * JD-Core Version:    0.6.1
 */