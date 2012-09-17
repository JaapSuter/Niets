package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

class a8
  implements View.OnClickListener
{
  final ImageButton a;
  final WebImagePicker b;

  a8(WebImagePicker paramWebImagePicker, ImageButton paramImageButton)
  {
  }

  public void onClick(View paramView)
  {
    this.a.setVisibility(8);
    WebImagePicker.d(this.b).setText("");
  }
}