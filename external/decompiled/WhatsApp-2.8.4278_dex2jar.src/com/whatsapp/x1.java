package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

class x1
  implements TextWatcher
{
  final RegisterName a;

  x1(RegisterName paramRegisterName)
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
    if (RegisterName.c(this.a) != null)
      RegisterName.c(this.a).setGravity(TextEmojiLabel.a(paramCharSequence.toString()));
  }
}