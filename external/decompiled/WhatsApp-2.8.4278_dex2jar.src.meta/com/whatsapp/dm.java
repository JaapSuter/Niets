package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class dm
  implements View.OnClickListener
{
  private static final String z;
  final Conversation a;

  static
  {
    char[] arrayOfChar = "XK��".toCharArray();
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
      m = 50;
      continue;
      m = 34;
      continue;
      m = 100;
      continue;
      m = 69;
    }
  }

  dm(Conversation paramConversation)
  {
  }

  public void onClick(View paramView)
  {
    boolean bool = DialogToastListActivity.f;
    Conversation.y(this.a).setVisibility(8);
    this.a.V.setVisibility(8);
    if (this.a.Qb.n)
    {
      Intent localIntent = new Intent(this.a, ViewProfilePhoto.class);
      localIntent.putExtra(z, this.a.Qb.b);
      this.a.startActivity(localIntent);
      if (!bool);
    }
    else if (Conversation.k(this.a))
    {
      iz.a(this.a.Qb, this.a, 19);
      if (!bool);
    }
    else
    {
      App.a(this.a, 2131296654, 0);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.dm
 * JD-Core Version:    0.6.1
 */