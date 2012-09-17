package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class bu
  implements View.OnClickListener
{
  private static final String z;
  final GroupChatInfo a;

  static
  {
    char[] arrayOfChar = "(8\034".toCharArray();
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
      m = 84;
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
      m = 66;
      continue;
      m = 81;
      continue;
      m = 120;
      continue;
      m = 120;
    }
  }

  bu(GroupChatInfo paramGroupChatInfo)
  {
  }

  public void onClick(View paramView)
  {
    if (this.a.t.n)
    {
      Intent localIntent = new Intent(this.a, ViewProfilePhoto.class);
      localIntent.putExtra(z, this.a.t.b);
      this.a.startActivityForResult(localIntent, 14);
      if (!DialogToastListActivity.f);
    }
    else
    {
      iz.a(this.a.t, this.a, 12);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.bu
 * JD-Core Version:    0.6.1
 */