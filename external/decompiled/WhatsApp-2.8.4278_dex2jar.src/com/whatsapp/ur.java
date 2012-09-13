package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.MultiAutoCompleteTextView;

class ur
  implements TextWatcher
{
  final EditGroupSubject a;

  ur(EditGroupSubject paramEditGroupSubject)
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
    if (this.a.g != null)
      this.a.g.setGravity(TextEmojiLabel.a(paramCharSequence.toString()));
    if (paramCharSequence.length() > 0)
    {
      EditGroupSubject.x = true;
      this.a.p.setVisibility(0);
      if (this.a.i.getText().length() > 0)
      {
        this.a.r.setEnabled(true);
        if (!DialogToastListActivity.f);
      }
    }
    else
    {
      EditGroupSubject.x = false;
      this.a.r.setEnabled(false);
      this.a.p.setVisibility(8);
    }
    EditGroupSubject.a(this.a, paramCharSequence);
  }
}