package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;

class a2
  implements DialogInterface.OnClickListener
{
  private static final String[] z;
  final RegisterName a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "t]H\003&|W\002\030'aVB\005gtPX\030&{\035z8\fB".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "}GX\001s:\034A\036+|_I_=bZX\005,g\035O\036$:DM.:aRX\004:".toCharArray();
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
        m = 73;
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
        m = 21;
        continue;
        m = 51;
        continue;
        m = 44;
        continue;
        m = 113;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 73;
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
      i3 = 21;
      continue;
      i3 = 51;
      continue;
      i3 = 44;
      continue;
      i3 = 113;
    }
  }

  a2(RegisterName paramRegisterName)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(109);
    Intent localIntent = new Intent(z[0], Uri.parse(z[1]));
    this.a.startActivity(localIntent);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.a2
 * JD-Core Version:    0.6.1
 */