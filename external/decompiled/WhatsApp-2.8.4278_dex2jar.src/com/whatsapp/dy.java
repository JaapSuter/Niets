package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class dy
  implements View.OnClickListener
{
  private static final String z;
  final PickFileType a;

  static
  {
    char[] arrayOfChar = "\031LH".toCharArray();
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
      m = 96;
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
      m = 115;
      continue;
      m = 37;
      continue;
      m = 44;
      continue;
      m = 58;
    }
  }

  dy(PickFileType paramPickFileType)
  {
  }

  public void onClick(View paramView)
  {
    if (App.e())
    {
      Intent localIntent = new Intent(this.a, LocationPicker.class);
      localIntent.putExtra(z, this.a.i);
      this.a.startActivity(localIntent);
      if (!DialogToastListActivity.f);
    }
    else
    {
      App.e(this.a, this.a.i);
    }
    this.a.finish();
  }
}