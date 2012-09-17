package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

final class gg
  implements DialogInterface.OnClickListener
{
  private static final String z;
  final Activity a;

  static
  {
    char[] arrayOfChar = "'\035\013QB/\027AJC2\026\001W\003'\020\033JB(]9jh\021".toCharArray();
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
      m = 45;
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
      m = 70;
      continue;
      m = 115;
      continue;
      m = 111;
      continue;
      m = 35;
    }
  }

  gg(Activity paramActivity)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(115);
    Intent localIntent = new Intent(z);
    localIntent.setData(k4.a());
    this.a.startActivity(localIntent);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.gg
 * JD-Core Version:    0.6.1
 */