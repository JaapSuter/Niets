package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

class hs
  implements TextWatcher
{
  final b a;

  hs(b paramb)
  {
  }

  public void afterTextChanged(Editable paramEditable)
  {
    String str = paramEditable.toString();
    v4.a(paramEditable, this.a.e);
    this.a.f.setText("" + (eu.c - str.length()));
  }

  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.a.q != null)
      this.a.q.setGravity(TextEmojiLabel.a(paramCharSequence.toString()));
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.hs
 * JD-Core Version:    0.6.1
 */