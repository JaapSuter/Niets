package com.whatsapp;

import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.Toast;

class aw
  implements View.OnLongClickListener
{
  private static final String[] z;
  final LocationPicker a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = ".t_$\020\025fRp\007\022#p?\006\017pG%\022\017f".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = ".t_$\020\025fRp\007\022#q?\034\032oS".toCharArray();
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
        m = 115;
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
        m = 125;
        continue;
        m = 3;
        continue;
        m = 54;
        continue;
        m = 80;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 115;
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
      i3 = 125;
      continue;
      i3 = 3;
      continue;
      i3 = 54;
      continue;
      i3 = 80;
    }
  }

  aw(LocationPicker paramLocationPicker)
  {
  }

  public boolean onLongClick(View paramView)
  {
    if (!LocationPicker.b());
    for (boolean bool = true; ; bool = false)
    {
      LocationPicker.a(bool);
      if (LocationPicker.b())
      {
        z9.a(1);
        Toast.makeText(this.a.getApplicationContext(), z[0], 1).show();
        if (!DialogToastListActivity.f);
      }
      else
      {
        z9.a(2);
        Toast.makeText(this.a.getApplicationContext(), z[1], 1).show();
      }
      return false;
    }
  }
}