package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class ni
  implements View.OnClickListener
{
  private static final String[] z;
  final BroadcastMediaPicker a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = ":)sB\003\"#e\003\013(it\031\020?(eB\006%58\017\r\"3v\017\026".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "-)s\036\r%#9\005\f8\"y\030L-$c\005\r\"iG%!\007".toCharArray();
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
        m = 98;
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
        m = 76;
        continue;
        m = 71;
        continue;
        m = 23;
        continue;
        m = 108;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 98;
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
      i3 = 76;
      continue;
      i3 = 71;
      continue;
      i3 = 23;
      continue;
      i3 = 108;
    }
  }

  ni(BroadcastMediaPicker paramBroadcastMediaPicker)
  {
  }

  public void onClick(View paramView)
  {
    Intent localIntent = new Intent(z[1]);
    localIntent.setType(z[0]);
    this.a.startActivityForResult(localIntent, 7);
  }
}