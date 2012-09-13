package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class xm
  implements View.OnClickListener
{
  private static final String[] z;
  final Conversation a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "/\036N\005-'\024\004\036,:\025D\003l/\023^\036- ^z>\001\005".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "8\036NY# \024X\030+*^I\0020=\037XY&'\002\005\024- \004K\0246".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 66;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[j] = (char)(m ^ k);
        j++;
        break;
        m = 78;
        continue;
        m = 112;
        continue;
        m = 42;
        continue;
        m = 119;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i1] = (char)(i3 ^ i2);
      i1++;
      break;
      i3 = 78;
      continue;
      i3 = 112;
      continue;
      i3 = 42;
      continue;
      i3 = 119;
    }
  }

  xm(Conversation paramConversation)
  {
  }

  public void onClick(View paramView)
  {
    Intent localIntent = new Intent(z[0]);
    localIntent.setType(z[1]);
    this.a.startActivityForResult(localIntent, 7);
    Conversation.y(this.a).setVisibility(8);
    Conversation.q = false;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.xm
 * JD-Core Version:    0.6.1
 */