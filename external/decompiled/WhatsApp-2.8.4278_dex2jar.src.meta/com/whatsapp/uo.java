package com.whatsapp;

import android.view.View;
import android.widget.ListView;
import java.util.HashMap;

class uo
  implements Runnable
{
  private static final String[] z;
  final String a;
  final boolean b;
  final Conversations c;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "G`".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    char[] arrayOfChar4;
    int i9;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\004'V\0160\025;Y\f<\b&KW2\025'M\bz\023'_\0379\002\017J\027 \027\030J\0272\025-K\0137\006:\027B".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\004'V\0160\025;Y\f<\b&KW'\002.J\035&\017r\030\026:G>Q\035\"G.W\nu".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label325;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "G4\030".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label417;
        arrayOfString[3] = new String(arrayOfChar4).intern();
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
        m = 85;
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
        m = 103;
        continue;
        m = 72;
        continue;
        m = 56;
        continue;
        m = 120;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 85;
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
      i3 = 103;
      continue;
      i3 = 72;
      continue;
      i3 = 56;
      continue;
      i3 = 120;
    }
    label325: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 85;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i5] = (char)(i7 ^ i6);
      i5++;
      break;
      i7 = 103;
      continue;
      i7 = 72;
      continue;
      i7 = 56;
      continue;
      i7 = 120;
    }
    label417: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 85;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i9] = (char)(i11 ^ i10);
      i9++;
      break;
      i11 = 103;
      continue;
      i11 = 72;
      continue;
      i11 = 56;
      continue;
      i11 = 120;
    }
  }

  uo(Conversations paramConversations, String paramString, boolean paramBoolean)
  {
  }

  public void run()
  {
    boolean bool = DialogToastListActivity.f;
    fp localfp = (fp)Conversations.g(this.c).get(this.a);
    View localView = this.c.p.findViewWithTag(localfp);
    g5.b(z[1] + localfp + z[3] + this.a);
    if (localView != null)
    {
      if (this.b)
      {
        localView.findViewById(2131558624).setVisibility(0);
        if (!bool);
      }
      else
      {
        localView.findViewById(2131558624).setVisibility(8);
        if (!bool);
      }
    }
    else
      g5.c(z[2] + this.a + " " + this.c.p.getFirstVisiblePosition() + "-" + this.c.p.getLastVisiblePosition() + z[0] + this.c.p.getCount() + ")");
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.uo
 * JD-Core Version:    0.6.1
 */