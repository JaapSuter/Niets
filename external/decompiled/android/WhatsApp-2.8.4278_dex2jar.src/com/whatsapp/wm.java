package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;

class wm
  implements TextWatcher
{
  private static final String[] z;
  final Conversation a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "}k\002\016@".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "<~\023\007\b\t}\037\02695y\t\005\0379\"".toCharArray();
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
        m = 122;
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
        m = 93;
        continue;
        m = 24;
        continue;
        m = 103;
        continue;
        m = 98;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 122;
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
      i3 = 93;
      continue;
      i3 = 24;
      continue;
      i3 = 103;
      continue;
      i3 = 98;
    }
  }

  wm(Conversation paramConversation)
  {
  }

  public void afterTextChanged(Editable paramEditable)
  {
    String str = paramEditable.toString();
    Button localButton = this.a.Kb;
    if (str.trim().length() > 0);
    for (boolean bool = true; ; bool = false)
    {
      localButton.setEnabled(bool);
      if (!Conversation.k(this.a))
        if (str.length() != 0)
        {
          App.a(this.a.Qb.b, App.y.b(this.a.Qb.b));
          if (!DialogToastListActivity.f);
        }
        else
        {
          App.b(this.a.Qb.b, App.y.b(this.a.Qb.b));
        }
      v4.a(paramEditable, this.a);
      Conversation.g(this.a);
      if (App.h)
        g5.d(z[1] + v4.a(this.a.Jb.getText().toString()) + z[0] + this.a.Jb.getSelectionStart() + ":" + this.a.Jb.getSelectionStart());
      return;
    }
  }

  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.a.Jb != null)
      this.a.Jb.setGravity(TextEmojiLabel.a(paramCharSequence.toString()));
  }
}