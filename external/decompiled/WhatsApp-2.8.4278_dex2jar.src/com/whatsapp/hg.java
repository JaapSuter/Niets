package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

class hg
  implements View.OnClickListener
{
  private static final String z;
  final AccountInfoActivity a;

  static
  {
    char[] arrayOfChar = "\\x*D4Tr`_5Is Bu\\u:_4S8\030\036j".toCharArray();
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
      m = 91;
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
      m = 61;
      continue;
      m = 22;
      continue;
      m = 78;
      continue;
      m = 54;
    }
  }

  hg(AccountInfoActivity paramAccountInfoActivity)
  {
  }

  public void onClick(View paramView)
  {
    Intent localIntent = new Intent(z);
    localIntent.setData(Uri.parse(AccountInfoActivity.a(this.a)));
    this.a.startActivity(localIntent);
  }
}