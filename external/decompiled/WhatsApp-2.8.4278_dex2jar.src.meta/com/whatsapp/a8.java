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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.a8
 * JD-Core Version:    0.6.1
 */