package com.whatsapp;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

class wy
  implements TextView.OnEditorActionListener
{
  final PopupNotification a;

  wy(PopupNotification paramPopupNotification)
  {
  }

  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
      PopupNotification.j(this.a);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}