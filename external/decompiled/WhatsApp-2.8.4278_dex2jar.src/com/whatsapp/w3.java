package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;

class w3
  implements DialogInterface.OnClickListener
{
  private static final String[] z;
  final Settings a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "aeOJ3&>VUk`}^\024}~xONl{?XUd&fZez}pOOz".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "h_Hf`u\025Sg}tUN'hrOSfg?msL^".toCharArray();
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
        m = 9;
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
        m = 9;
        continue;
        m = 17;
        continue;
        m = 59;
        continue;
        m = 58;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 9;
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
      i3 = 9;
      continue;
      i3 = 17;
      continue;
      i3 = 59;
      continue;
      i3 = 58;
    }
  }

  w3(Settings paramSettings)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(12);
    Intent localIntent = new Intent(z[1], Uri.parse(z[0]));
    this.a.startActivity(localIntent);
  }
}