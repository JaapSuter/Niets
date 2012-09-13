package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageButton;

class kk
  implements TextWatcher
{
  final ContactPicker a;

  kk(ContactPicker paramContactPicker)
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
    if (ContactPicker.b(this.a) != null)
      ContactPicker.b(this.a).setGravity(TextEmojiLabel.a(paramCharSequence.toString()));
    if (paramCharSequence.length() > 0)
    {
      ContactPicker.a(this.a, paramCharSequence.toString());
      ContactPicker.a(this.a).setVisibility(0);
      if (!DialogToastListActivity.f);
    }
    else
    {
      ContactPicker.a(this.a).setVisibility(8);
      ContactPicker.k(this.a);
    }
    ContactPicker.i(this.a).notifyDataSetChanged();
  }
}