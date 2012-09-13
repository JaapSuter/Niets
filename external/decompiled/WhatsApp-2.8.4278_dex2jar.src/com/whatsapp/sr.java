package com.whatsapp;

import android.text.Editable;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

class sr
  implements TextView.OnEditorActionListener
{
  final EditGroupSubject a;

  sr(EditGroupSubject paramEditGroupSubject)
  {
  }

  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent == null) || ((paramInt == 6) || (paramKeyEvent.getKeyCode() == 66)))
      if (this.a.g.getText().length() > 0)
        if (this.a.E.b())
        {
          EditGroupSubject.c(this.a);
          if (!DialogToastListActivity.f);
        }
        else
        {
          EditGroupSubject.b(this.a);
        }
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}