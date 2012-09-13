package com.whatsapp;

import android.view.View;
import android.widget.TextView;

class n2
  implements ms
{
  private static final String z;
  final SetStatus a;

  static
  {
    char[] arrayOfChar = "kvO8dm>]\"b|k]l".toCharArray();
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
      m = 3;
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
      m = 8;
      continue;
      m = 30;
      continue;
      m = 46;
      continue;
      m = 86;
    }
  }

  n2(SetStatus paramSetStatus)
  {
  }

  public void a(String paramString)
  {
    if (paramString.length() > 0)
    {
      if (paramString.length() >= 139)
        paramString = paramString.substring(0, 139);
      if (!paramString.equals(this.a.f.getText().toString()))
      {
        SetStatus.b(this.a).setOnClickListener(null);
        g5.d(z + paramString);
        this.a.a(paramString);
      }
    }
  }
}