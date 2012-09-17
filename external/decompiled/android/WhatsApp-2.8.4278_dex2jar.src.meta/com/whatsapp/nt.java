package com.whatsapp;

import android.view.View;
import android.widget.ImageButton;

class nt
  implements ms
{
  private static final String z;
  final GroupChatInfo a;

  static
  {
    char[] arrayOfChar = "\006|\027\017M>g\026\034RNm\020\033S\006kX\tH\003d\035\031I[".toCharArray();
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
      m = 61;
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
      m = 97;
      continue;
      m = 14;
      continue;
      m = 120;
      continue;
      m = 122;
    }
  }

  nt(GroupChatInfo paramGroupChatInfo)
  {
  }

  public void a(String paramString)
  {
    boolean bool = DialogToastListActivity.f;
    if (!this.a.t.b().equals(paramString))
      if (App.sb())
      {
        if (paramString.length() <= eu.c)
        {
          this.a.B.setVisibility(0);
          this.a.w.setVisibility(8);
          this.a.w.setOnClickListener(null);
          g5.b(z + paramString);
          App.b(this.a.i, paramString);
          if (!bool);
        }
        else
        {
          GroupChatInfo localGroupChatInfo = this.a;
          String str = this.a.getString(2131296852);
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Integer.valueOf(eu.c);
          App.a(localGroupChatInfo, String.format(str, arrayOfObject), 0);
          if (!bool);
        }
      }
      else
        App.a(this.a.getBaseContext(), 2131296525, 0);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.nt
 * JD-Core Version:    0.6.1
 */