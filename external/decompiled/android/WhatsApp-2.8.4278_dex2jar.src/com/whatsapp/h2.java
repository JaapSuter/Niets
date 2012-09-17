package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class h2
  implements View.OnClickListener
{
  private static final String z;
  final RegisterPhone a;

  static
  {
    char[] arrayOfChar = "_\013\002)tQ\022_?l@HO1i^\022^'C^\007A;".toCharArray();
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
      m = 94;
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
      m = 28;
      continue;
      m = 48;
      continue;
      m = 102;
      continue;
      m = 44;
    }
  }

  h2(RegisterPhone paramRegisterPhone)
  {
  }

  public void onClick(View paramView)
  {
    Intent localIntent = new Intent(this.a, CountryPicker.class);
    localIntent.putExtra(z, this.a.C.getText().toString());
    this.a.startActivityForResult(localIntent, 0);
    this.a.B.removeTextChangedListener(RegisterPhone.c(this.a));
  }
}