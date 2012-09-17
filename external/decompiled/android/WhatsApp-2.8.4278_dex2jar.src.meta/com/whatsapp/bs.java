package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

class bs
  implements TextWatcher
{
  final EditStatus a;

  bs(EditStatus paramEditStatus)
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
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.bs
 * JD-Core Version:    0.6.1
 */