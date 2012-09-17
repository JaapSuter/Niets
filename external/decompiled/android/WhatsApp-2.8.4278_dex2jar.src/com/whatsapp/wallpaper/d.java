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