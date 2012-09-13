package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

class jw
  implements DialogInterface.OnClickListener
{
  private static final String[] z;
  final Main a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "xK\013dYpAAXm@\001b\030xF\033Yw\0139_sN".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "xU\037z_zD\033Yw\n\031xR7D\001rDvL\0138FxF\004wQ|\b\016dUqL\031s".toCharArray();
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
        m = 54;
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
        m = 25;
        continue;
        m = 37;
        continue;
        m = 111;
        continue;
        m = 22;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 54;
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
      i3 = 25;
      continue;
      i3 = 37;
      continue;
      i3 = 111;
      continue;
      i3 = 22;
    }
  }

  jw(Main paramMain)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Intent localIntent = new Intent(z[0]);
    localIntent.setDataAndType(this.a.l, z[1]);
    this.a.startActivity(localIntent);
    this.a.removeDialog(0);
    this.a.finish();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.jw
 * JD-Core Version:    0.6.1
 */