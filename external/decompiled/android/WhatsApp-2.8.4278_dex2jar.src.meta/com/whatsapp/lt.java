package com.whatsapp;

import android.view.View;
import android.widget.ListView;

class lt
  implements Runnable
{
  private static final String[] z;
  final View a;
  final boolean b;
  final GroupChatInfo c;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "Je".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\r?,&[5$-5DE?&5Y\017>+i\013\004\"c%B\017:c5D\030m".toCharArray();
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
        m = 43;
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
        m = 106;
        continue;
        m = 77;
        continue;
        m = 67;
        continue;
        m = 83;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 43;
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
      i3 = 106;
      continue;
      i3 = 77;
      continue;
      i3 = 67;
      continue;
      i3 = 83;
    }
  }

  lt(GroupChatInfo paramGroupChatInfo, View paramView, boolean paramBoolean)
  {
  }

  public void run()
  {
    boolean bool = DialogToastListActivity.f;
    if (this.a != null)
    {
      if (this.b)
      {
        this.c.B.setVisibility(0);
        if (!bool);
      }
      else
      {
        this.c.B.setVisibility(8);
        if (!bool);
      }
    }
    else
      g5.b(z[1] + this.c.D.getFirstVisiblePosition() + "-" + this.c.D.getLastVisiblePosition() + z[0] + this.c.D.getCount() + ")");
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.lt
 * JD-Core Version:    0.6.1
 */