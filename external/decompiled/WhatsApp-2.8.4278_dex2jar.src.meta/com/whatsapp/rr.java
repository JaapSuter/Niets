package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;

class rr
  implements View.OnClickListener
{
  private static final String z;
  final EditGroupSubject a;

  static
  {
    char[] arrayOfChar = "`=c*KV>v+Wf7".toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    if (i <= j)
    {
      z = new String(arrayOfChar).intern();
      return;
    }
    int k = arrayOfChar[j];
    int m;
    switch (j % 5)
    {
    default:
      m = 63;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar[j] = (char)(m ^ k);
      j++;
      break;
      m = 9;
      continue;
      m = 83;
      continue;
      m = 19;
      continue;
      m = 95;
    }
  }

  rr(EditGroupSubject paramEditGroupSubject)
  {
  }

  public void onClick(View paramView)
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)this.a.getSystemService(z);
    if (this.a.i.hasFocus())
    {
      localInputMethodManager.hideSoftInputFromWindow(this.a.i.getWindowToken(), 0);
      if (!DialogToastListActivity.f);
    }
    else
    {
      localInputMethodManager.hideSoftInputFromWindow(this.a.g.getWindowToken(), 0);
    }
    EditGroupSubject.b(this.a);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.rr
 * JD-Core Version:    0.6.1
 */