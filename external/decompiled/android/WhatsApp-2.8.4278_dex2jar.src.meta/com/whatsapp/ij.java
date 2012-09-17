package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class ij
  implements View.OnClickListener
{
  private static final String z;
  final kj a;
  final ContactInfo b;

  static
  {
    char[] arrayOfChar = "M\031}".toCharArray();
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
      m = 39;
      continue;
      m = 112;
      continue;
      m = 25;
      continue;
      m = 123;
    }
  }

  ij(ContactInfo paramContactInfo, kj paramkj)
  {
  }

  public void onClick(View paramView)
  {
    Intent localIntent = new Intent(App.Mb.getApplicationContext(), Conversation.class).putExtra(z, this.a.c).addFlags(335544320);
    this.b.startActivity(localIntent);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ij
 * JD-Core Version:    0.6.1
 */