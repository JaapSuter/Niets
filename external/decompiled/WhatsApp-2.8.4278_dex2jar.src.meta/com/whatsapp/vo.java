package com.whatsapp;

import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import java.util.HashMap;

class vo
  implements Runnable
{
  private static final String[] z;
  final String a;
  final String b;
  final String c;
  final iu d;
  final Conversations e;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "r\032we\024c\006xg\030~\033j<\003t\023kv\002y!|~\001V\007vf\001G\034|dK1\033v3\007x\020n3\027~\0079".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "1]".toCharArray();
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
        m = 113;
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
        m = 17;
        continue;
        m = 117;
        continue;
        m = 25;
        continue;
        m = 19;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 113;
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
      i3 = 17;
      continue;
      i3 = 117;
      continue;
      i3 = 25;
      continue;
      i3 = 19;
    }
  }

  vo(Conversations paramConversations, String paramString1, String paramString2, String paramString3, iu paramiu)
  {
  }

  public void run()
  {
    fp localfp = (fp)Conversations.g(this.e).get(this.a);
    View localView = this.e.p.findViewWithTag(localfp);
    if (localView != null)
    {
      localView.findViewById(2131558624).setVisibility(8);
      localView.findViewById(2131558628).setVisibility(8);
      ((TextView)localView.findViewById(2131558631)).setText(this.b);
      localfp.l = this.c;
      localView.setTag(localfp);
      gp.a(this.a, this.c, this.b);
      this.d.a(true);
      if (!DialogToastListActivity.f);
    }
    else
    {
      g5.c(z[0] + this.a + " " + this.e.p.getFirstVisiblePosition() + "-" + this.e.p.getLastVisiblePosition() + z[1] + this.e.p.getCount() + ")");
      this.d.a(false);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.vo
 * JD-Core Version:    0.6.1
 */