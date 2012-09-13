package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageButton;
import android.widget.TextView;

class b8
  implements TextWatcher
{
  final ImageButton a;
  final WebImagePicker b;

  b8(WebImagePicker paramWebImagePicker, ImageButton paramImageButton)
  {
  }

  public void afterTextChanged(Editable paramEditable)
  {
  }

  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (WebImagePicker.d(this.b) != null)
      WebImagePicker.d(this.b).setGravity(TextEmojiLabel.a(paramCharSequence.toString()));
    if (paramCharSequence.length() > 0)
    {
      this.a.setVisibility(0);
      if (!DialogToastListActivity.f);
    }
    else
    {
      this.a.setVisibility(8);
    }
  }
}