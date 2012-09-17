package com.whatsapp;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;

class ym
  implements TextWatcher
{
  final Conversation a;

  ym(Conversation paramConversation)
  {
  }

  public void afterTextChanged(Editable paramEditable)
  {
    this.a.sb = paramEditable.toString();
    if (TextUtils.isEmpty(this.a.sb))
      Conversation.D(this.a);
    this.a.Pb.notifyDataSetChanged();
  }

  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (Conversation.C(this.a) != null)
      Conversation.C(this.a).setGravity(TextEmojiLabel.a(paramCharSequence.toString()));
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ym
 * JD-Core Version:    0.6.1
 */