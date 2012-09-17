package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class au
  implements View.OnClickListener
{
  private static final String z;
  final GroupChatInfo a;

  static
  {
    char[] arrayOfChar = "*\023U".toCharArray();
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
      m = 112;
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
      m = 64;
      continue;
      m = 122;
      continue;
      m = 49;
      continue;
      m = 18;
    }
  }

  au(GroupChatInfo paramGroupChatInfo)
  {
  }

  public void onClick(View paramView)
  {
    if (App.e())
    {
      Intent localIntent = new Intent(this.a, GroupChatMap.class);
      localIntent.putExtra(z, this.a.i);
      this.a.startActivity(localIntent);
      if (!DialogToastListActivity.f);
    }
    else
    {
      App.a(this.a, 2131296667, 0);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.au
 * JD-Core Version:    0.6.1
 */