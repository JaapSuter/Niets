package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageButton;

class px
  implements TextWatcher
{
  final MultipleContactPicker a;

  px(MultipleContactPicker paramMultipleContactPicker)
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
    if (this.a.t != null)
      this.a.t.setGravity(TextEmojiLabel.a(paramCharSequence.toString()));
    if (paramCharSequence.length() > 0)
    {
      MultipleContactPicker.a(this.a, paramCharSequence.toString());
      this.a.u.setVisibility(0);
      if (!DialogToastListActivity.f);
    }
    else
    {
      this.a.u.setVisibility(8);
      MultipleContactPicker.b(this.a);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.px
 * JD-Core Version:    0.6.1
 */