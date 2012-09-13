package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class j7
  implements View.OnClickListener
{
  private static final String z;
  final VerifySms a;

  static
  {
    char[] arrayOfChar = "@/h&��O9w<IS.s;".toCharArray();
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
      m = 102;
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
      m = 54;
      continue;
      m = 74;
      continue;
      m = 26;
      continue;
      m = 79;
    }
  }

  j7(VerifySms paramVerifySms)
  {
  }

  public void onClick(View paramView)
  {
    g5.b(z);
    VerifySms.n(this.a);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.j7
 * JD-Core Version:    0.6.1
 */