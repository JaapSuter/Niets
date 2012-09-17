package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

class vy
  implements TextWatcher
{
  final PopupNotification a;

  vy(PopupNotification paramPopupNotification)
  {
  }

  public void afterTextChanged(Editable paramEditable)
  {
    boolean bool = false;
    App.mb();
    String str = paramEditable.toString();
    View localView = this.a.findViewById(2131558575);
    if (str.length() > 0)
      localView.setVisibility(0);
    if ((PopupNotification.e(this.a) != null) && (!PopupNotification.e(this.a).o()))
      if (str.length() != 0)
      {
        App.a(PopupNotification.e(this.a).b, App.y.b(PopupNotification.e(this.a).b));
        if (!DialogToastListActivity.f);
      }
      else
      {
        App.b(PopupNotification.e(this.a).b, App.y.b(PopupNotification.e(this.a).b));
      }
    if (str.trim().length() > 0)
      bool = true;
    localView.setEnabled(bool);
  }

  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (PopupNotification.g(this.a) != null)
      PopupNotification.g(this.a).setGravity(TextEmojiLabel.a(paramCharSequence.toString()));
  }
}