package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class nx
  implements View.OnClickListener
{
  private static final String z;
  final MultipleContactPicker a;

  static
  {
    char[] arrayOfChar = "\\E\nR".toCharArray();
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
      m = 73;
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
      m = 44;
      continue;
      m = 110;
      continue;
      m = 33;
    }
  }

  nx(MultipleContactPicker paramMultipleContactPicker)
  {
  }

  public void onClick(View paramView)
  {
    if (this.a.m == 1)
    {
      Intent localIntent1 = new Intent(this.a, BroadcastMessageComposer.class);
      localIntent1.putExtra(z, MultipleContactPicker.a(this.a));
      this.a.startActivity(localIntent1);
      this.a.finish();
    }
    while (true)
    {
      return;
      Intent localIntent2 = new Intent(this.a, EditGroupSubject.class);
      eu.c(MultipleContactPicker.a(this.a));
      this.a.startActivity(localIntent2);
      this.a.finish();
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.nx
 * JD-Core Version:    0.6.1
 */