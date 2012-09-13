package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class zt
  implements View.OnClickListener
{
  private static final String z;
  final GroupChatInfo a;

  static
  {
    char[] arrayOfChar = "Z[\005".toCharArray();
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
      m = 105;
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
      m = 48;
      continue;
      m = 50;
      continue;
      m = 97;
      continue;
      m = 20;
    }
  }

  zt(GroupChatInfo paramGroupChatInfo)
  {
  }

  public void onClick(View paramView)
  {
    Intent localIntent = new Intent(this.a, MediaGallery.class);
    localIntent.putExtra(z, this.a.i);
    this.a.startActivity(localIntent);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.zt
 * JD-Core Version:    0.6.1
 */