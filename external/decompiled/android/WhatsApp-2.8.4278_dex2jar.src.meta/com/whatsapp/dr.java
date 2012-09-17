package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class dr
  implements View.OnClickListener
{
  private static final String z;
  final DeleteAccount a;

  static
  {
    char[] arrayOfChar = "`\033\030\020'k\025\001M1s\004[]?v\032\001L)\\\032\024S5".toCharArray();
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
      m = 80;
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
      m = 3;
      continue;
      m = 116;
      continue;
      m = 117;
      continue;
      m = 62;
    }
  }

  dr(DeleteAccount paramDeleteAccount)
  {
  }

  public void onClick(View paramView)
  {
    Intent localIntent = new Intent(this.a, CountryPicker.class);
    localIntent.putExtra(z, this.a.o.getText().toString());
    this.a.startActivityForResult(localIntent, 0);
    this.a.n.removeTextChangedListener(DeleteAccount.b(this.a));
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.dr
 * JD-Core Version:    0.6.1
 */