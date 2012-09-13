package com.whatsapp;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

class z7
  implements TextView.OnEditorActionListener
{
  final WebImagePicker a;

  z7(WebImagePicker paramWebImagePicker)
  {
  }

  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 3)
      WebImagePicker.c(this.a);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}