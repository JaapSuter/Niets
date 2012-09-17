package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

class pi
  implements DialogInterface.OnClickListener
{
  private static final String z;
  final BroadcastMessageComposer a;

  static
  {
    char[] arrayOfChar = "\017��BN\"\007\n\bO(\032\032OR*\035@js\016/:os\0031=ii\037-+yo\b::or\n=".toCharArray();
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
      m = 77;
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
      m = 110;
      continue;
      m = 110;
      continue;
      m = 38;
      continue;
      m = 60;
    }
  }

  pi(BroadcastMessageComposer paramBroadcastMessageComposer)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.startActivityForResult(new Intent(z), 0);
    this.a.removeDialog(2);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.pi
 * JD-Core Version:    0.6.1
 */