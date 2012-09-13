package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

class kr
  implements TextWatcher
{
  final DescribeProblemActivity a;

  kr(DescribeProblemActivity paramDescribeProblemActivity)
  {
  }

  public void afterTextChanged(Editable paramEditable)
  {
    Button localButton = DescribeProblemActivity.c(this.a);
    if (paramEditable.toString().trim().length() >= 3);
    for (boolean bool = true; ; bool = false)
    {
      localButton.setEnabled(bool);
      return;
    }
  }

  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (DescribeProblemActivity.b(this.a) != null)
      DescribeProblemActivity.b(this.a).setGravity(TextEmojiLabel.a(paramCharSequence.toString()));
  }
}