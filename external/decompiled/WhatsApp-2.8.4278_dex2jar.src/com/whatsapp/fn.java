package com.whatsapp;

import android.view.View;
import android.widget.ListView;
import java.util.HashSet;

class fn
  implements Runnable
{
  private static final String[] z;
  final sz a;
  final Conversation b;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = ";GBoN*[MmB7F\003kN>ZIjCb\bBv\013.AIn\013>G^9".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "x��".toCharArray();
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
        m = 88;
        continue;
        m = 40;
        continue;
        m = 44;
        continue;
        m = 25;
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
      i3 = 88;
      continue;
      i3 = 40;
      continue;
      i3 = 44;
      continue;
      i3 = 25;
    }
  }

  fn(Conversation paramConversation, sz paramsz)
  {
  }

  public void run()
  {
    View localView = this.b.Ib.findViewWithTag(this.a);
    if (localView != null)
    {
      ((ze)localView).c();
      if (!DialogToastListActivity.f);
    }
    else if (!Conversation.G(this.b).contains(this.a))
    {
      Conversation.G(this.b).add(this.a);
      g5.c(z[0] + this.a.b.c + " " + this.b.Ib.getFirstVisiblePosition() + "-" + this.b.Ib.getLastVisiblePosition() + z[1] + this.b.Ib.getCount() + ")");
    }
  }
}