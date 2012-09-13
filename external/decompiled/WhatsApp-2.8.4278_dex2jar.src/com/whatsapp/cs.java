package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class cs
  implements View.OnClickListener
{
  private static final String z;
  final EditStatus a;

  static
  {
    char[] arrayOfChar = "!\nnH6!".toCharArray();
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
      m = 67;
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
      m = 82;
      continue;
      m = 126;
      continue;
      m = 15;
      continue;
      m = 60;
    }
  }

  cs(EditStatus paramEditStatus)
  {
  }

  public void onClick(View paramView)
  {
    String str = this.a.a.getText().toString().trim();
    if (str.length() > 0)
    {
      if (str.length() >= 139)
        str = str.substring(0, 139);
      Intent localIntent = new Intent();
      localIntent.putExtra(z, str);
      this.a.setResult(-1, localIntent);
      this.a.finish();
    }
  }
}