package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import java.io.IOException;

class ug
  implements View.OnClickListener
{
  private static final String z;
  final EditText a;
  final Advanced b;

  static
  {
    char[] arrayOfChar = "}\006\003;\"g\035\003*?`\fQ!&x".toCharArray();
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
      m = 71;
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
      m = 20;
      continue;
      m = 105;
      continue;
      m = 35;
      continue;
      m = 79;
    }
  }

  ug(Advanced paramAdvanced, EditText paramEditText)
  {
  }

  public void onClick(View paramView)
  {
    App.d(z);
    try
    {
      Advanced.a(this.b, App.B.d(), Integer.parseInt(this.a.getText().toString()));
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        g5.d(localIOException);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true)
        g5.c(localNumberFormatException);
    }
  }
}