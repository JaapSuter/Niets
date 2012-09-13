package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

class iw
  implements DialogInterface.OnClickListener
{
  private static final String z;
  final Main a;

  static
  {
    char[] arrayOfChar = "N\005OxwDOTyjE\017I9C\025Txp\0167tRI".toCharArray();
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
      m = 23;
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
      m = 30;
      continue;
      m = 32;
      continue;
      m = 97;
      continue;
      m = 61;
    }
  }

  iw(Main paramMain)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    k4.d();
    this.a.startActivity(new Intent(z, k4.b()));
    this.a.removeDialog(0);
    this.a.finish();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.iw
 * JD-Core Version:    0.6.1
 */