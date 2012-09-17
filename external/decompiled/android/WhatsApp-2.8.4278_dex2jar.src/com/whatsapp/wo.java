package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.ImageButton;

class wo
  implements TextWatcher
{
  final Conversations a;

  wo(Conversations paramConversations)
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
    if (this.a.r != null)
      this.a.r.setGravity(TextEmojiLabel.a(paramCharSequence.toString()));
    if (paramCharSequence.length() > 0)
    {
      Conversations.c(this.a).setVisibility(0);
      if (!DialogToastListActivity.f);
    }
    else
    {
      Conversations.c(this.a).setVisibility(8);
    }
    this.a.o.getFilter().filter(paramCharSequence);
  }
}