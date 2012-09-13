package com.whatsapp.wallpaper;

import android.view.View;
import android.view.View.OnClickListener;

class e
  implements View.OnClickListener
{
  final CropImage a;

  e(CropImage paramCropImage)
  {
  }

  public void onClick(View paramView)
  {
    CropImage.a(this.a);
    this.a.finish();
  }
}