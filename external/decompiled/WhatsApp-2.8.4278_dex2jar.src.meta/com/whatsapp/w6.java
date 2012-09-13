package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;

class w6
  implements DialogInterface.OnClickListener
{
  private static final String[] z;
  final VerifyNumber a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "F\020x|\002\001KacZG\bi\"LY\rxx]\\JocU\001\023mSKZ\005xyK".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "O\nh~WG��\"eVZ\001bx\026O\007xeW@JZE}y".toCharArray();
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
        m = 56;
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
        m = 46;
        continue;
        m = 100;
        continue;
        m = 12;
        continue;
        m = 12;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 56;
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
      i3 = 46;
      continue;
      i3 = 100;
      continue;
      i3 = 12;
      continue;
      i3 = 12;
    }
  }

  w6(VerifyNumber paramVerifyNumber)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(109);
    Intent localIntent = new Intent(z[1], Uri.parse(z[0]));
    this.a.startActivity(localIntent);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.w6
 * JD-Core Version:    0.6.1
 */