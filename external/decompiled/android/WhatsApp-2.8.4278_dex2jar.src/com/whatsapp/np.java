package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Filter;

class np
  implements TextWatcher
{
  final CountryPicker a;

  np(CountryPicker paramCountryPicker)
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
    if (this.a.a != null)
      this.a.a.setGravity(TextEmojiLabel.a(paramCharSequence.toString()));
    this.a.b.getFilter().filter(paramCharSequence);
  }
}