package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class nk
  implements View.OnClickListener
{
  private static final String z;
  final ContactPickerHelp a;

  static
  {
    char[] arrayOfChar = "F]'l\001FF!}\fU\035:p\017R['n\tV[+t\005\nQ%q\003NW-".toCharArray();
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
      m = 96;
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
      m = 37;
      continue;
      m = 50;
      continue;
      m = 73;
      continue;
      m = 24;
    }
  }

  nk(ContactPickerHelp paramContactPickerHelp)
  {
  }

  public void onClick(View paramView)
  {
    g5.b(z);
    new z(this.a).execute(new String[0]);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.nk
 * JD-Core Version:    0.6.1
 */