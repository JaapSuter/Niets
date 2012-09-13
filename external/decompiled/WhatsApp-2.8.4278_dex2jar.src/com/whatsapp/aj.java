package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

class aj
  implements TextWatcher
{
  private static final String[] z;
  final BroadcastMessageComposer a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "F?w6fs<{'WO8m4qCc".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\007*f?.".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 20;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[j] = (char)(m ^ k);
        j++;
        break;
        m = 39;
        continue;
        m = 89;
        continue;
        m = 3;
        continue;
        m = 83;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 20;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i1] = (char)(i3 ^ i2);
      i1++;
      break;
      i3 = 39;
      continue;
      i3 = 89;
      continue;
      i3 = 3;
      continue;
      i3 = 83;
    }
  }

  aj(BroadcastMessageComposer paramBroadcastMessageComposer)
  {
  }

  public void afterTextChanged(Editable paramEditable)
  {
    boolean bool = DialogToastListActivity.f;
    if ((paramEditable.toString().length() > 0) && (!BroadcastMessageComposer.j))
    {
      if (this.a.o.getVisibility() == 0)
      {
        this.a.o.setEnabled(true);
        if (!bool);
      }
      else
      {
        this.a.n.setEnabled(true);
        if (!bool);
      }
    }
    else
      this.a.n.setEnabled(false);
    v4.a(paramEditable, this.a);
    if (App.h)
      g5.d(z[0] + v4.a(this.a.i.getText().toString()) + z[1] + this.a.i.getSelectionStart() + ":" + this.a.i.getSelectionStart());
  }

  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.a.i != null)
      this.a.i.setGravity(TextEmojiLabel.a(paramCharSequence.toString()));
  }
}