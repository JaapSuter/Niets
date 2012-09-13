package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class mi
  implements View.OnClickListener
{
  private static final String z;
  final BroadcastMediaPicker a;

  static
  {
    char[] arrayOfChar = "KM'[ZoL4GOTB0GHjH0".toCharArray();
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
      m = 59;
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
      m = 11;
      continue;
      m = 47;
      continue;
      m = 85;
      continue;
      m = 52;
    }
  }

  mi(BroadcastMediaPicker paramBroadcastMediaPicker)
  {
  }

  public void onClick(View paramView)
  {
    BroadcastMessageComposer.k = new sz(App.bb.jabber_id + z, (byte[])null, new MediaData());
    BroadcastMessageComposer.k.h = 1;
    BroadcastMessageComposer.k.l = 5;
    this.a.setResult(-1, null);
    this.a.finish();
  }
}