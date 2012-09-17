package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class vm
  implements View.OnClickListener
{
  private static final String z;
  final Conversation a;

  static
  {
    char[] arrayOfChar = ",oQ".toCharArray();
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
      m = 46;
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
      m = 70;
      continue;
      m = 6;
      continue;
      m = 53;
      continue;
      m = 96;
    }
  }

  vm(Conversation paramConversation)
  {
  }

  public void onClick(View paramView)
  {
    if (App.e())
    {
      Intent localIntent = new Intent(this.a, LocationPicker.class);
      localIntent.putExtra(z, this.a.Qb.b);
      this.a.startActivity(localIntent);
      Conversation.q = false;
      if (!DialogToastListActivity.f);
    }
    else
    {
      App.e(this.a, this.a.Qb.b);
    }
    Conversation.y(this.a).setVisibility(8);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.vm
 * JD-Core Version:    0.6.1
 */