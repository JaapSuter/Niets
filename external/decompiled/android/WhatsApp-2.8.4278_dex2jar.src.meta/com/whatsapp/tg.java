package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import java.io.IOException;

class tg
  implements View.OnClickListener
{
  private static final String z;
  final EditText a;
  final Advanced b;

  static
  {
    char[] arrayOfChar = "ekW)\tpW4\002xa\0053\r`".toCharArray();
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
      m = 108;
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
      m = 12;
      continue;
      m = 4;
      continue;
      m = 119;
      continue;
      m = 93;
    }
  }

  tg(Advanced paramAdvanced, EditText paramEditText)
  {
  }

  public void onClick(View paramView)
  {
    App.d(z);
    try
    {
      Advanced.a(this.b, App.C.d(), Integer.parseInt(this.a.getText().toString()));
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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.tg
 * JD-Core Version:    0.6.1
 */