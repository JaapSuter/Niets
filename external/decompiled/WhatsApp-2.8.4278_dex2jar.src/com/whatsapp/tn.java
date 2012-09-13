package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class tn
  implements View.OnClickListener
{
  private static final String z;
  final af a;

  static
  {
    char[] arrayOfChar = "\035\021\f3*".toCharArray();
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
      m = 78;
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
      m = 107;
      continue;
      m = 114;
      continue;
      m = 109;
      continue;
      m = 65;
    }
  }

  private tn(af paramaf)
  {
  }

  tn(af paramaf, sn paramsn)
  {
    this(paramaf);
  }

  public void onClick(View paramView)
  {
    Intent localIntent = new Intent(this.a.getContext(), ViewSharedContactActivity.class);
    localIntent.putExtra(z, this.a.o.b());
    this.a.getContext().startActivity(localIntent);
  }
}