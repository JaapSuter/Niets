package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class b7
  implements DialogInterface.OnClickListener
{
  private static final String z;
  final VerifySms a;

  static
  {
    char[] arrayOfChar = "\001,yPX\016d}VW\024,8".toCharArray();
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
      m = 62;
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
      m = 119;
      continue;
      m = 73;
      continue;
      m = 11;
      continue;
      m = 57;
    }
  }

  b7(VerifySms paramVerifySms)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(26);
    this.a.a(z);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.b7
 * JD-Core Version:    0.6.1
 */