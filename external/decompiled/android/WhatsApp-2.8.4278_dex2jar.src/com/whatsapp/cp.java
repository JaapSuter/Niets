package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;

class cp
  implements DialogInterface.OnClickListener
{
  private static final String[] z;
  final Conversations a;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "O9\006\r\022G3L\026\023Z2\f\013SO4\026\026\022@y468y".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    char[] arrayOfChar4;
    int i9;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\b4\t\f\bCj".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\021'\n\020\023Kj".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label325;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "O5\001".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label417;
        arrayOfString[3] = new String(arrayOfChar4).intern();
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
        m = 125;
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
        m = 87;
        continue;
        m = 98;
        continue;
        m = 127;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 125;
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
      i3 = 87;
      continue;
      i3 = 98;
      continue;
      i3 = 127;
    }
    label325: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 125;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i5] = (char)(i7 ^ i6);
      i5++;
      break;
      i7 = 46;
      continue;
      i7 = 87;
      continue;
      i7 = 98;
      continue;
      i7 = 127;
    }
    label417: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 125;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i9] = (char)(i11 ^ i10);
      i9++;
      break;
      i11 = 46;
      continue;
      i11 = 87;
      continue;
      i11 = 98;
      continue;
      i11 = 127;
    }
  }

  cp(Conversations paramConversations)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    eg.b(System.currentTimeMillis());
    String str1 = App.bb.jabber_id + z[3];
    String str2 = z[2] + App.bb.jabber_id + z[1] + mh.b(str1);
    Intent localIntent = new Intent(z[0]);
    localIntent.setData(Uri.parse(f8.e + str2));
    this.a.startActivity(localIntent);
    this.a.removeDialog(2);
  }
}