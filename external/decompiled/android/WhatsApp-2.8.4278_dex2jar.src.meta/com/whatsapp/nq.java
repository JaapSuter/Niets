package com.whatsapp;

import android.database.Cursor;
import android.view.View;
import android.widget.ListView;
import java.util.ArrayList;

class nq extends lq
{
  private static final String[] z;
  final Conversation a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "%xxF@4dwDL)y9\\L5cuXD(psT\n*xwT@'ezY@48x_Q0~eYG*r9B@+x`UG3cb_K".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "%xxF@4dwDL)y9\\L5cuXD(psT\n*xwT@'ezY@48~UD\"rdSK27".toCharArray();
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
        m = 37;
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
        m = 70;
        continue;
        m = 23;
        continue;
        m = 22;
        continue;
        m = 48;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 37;
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
      i3 = 70;
      continue;
      i3 = 23;
      continue;
      i3 = 22;
      continue;
      i3 = 48;
    }
  }

  nq(Conversation paramConversation)
  {
  }

  public void a(sz paramsz)
  {
    if ((paramsz != null) && (paramsz.b.a.equals(this.a.p)) && (paramsz.b.b))
    {
      if (this.a.Pb.getCursor() != null)
        Conversation.e(this.a).add(paramsz);
      if ((Conversation.k(this.a)) && (paramsz.m == 1L))
        this.a.n();
      if ((Conversation.k(this.a)) && (Conversation.d(this.a) != 0))
      {
        ue.a(this.a.Pb, ue.a(this.a.Pb));
        Conversation.d(this.a, 0);
      }
      this.a.Pb.notifyDataSetChanged();
      Conversation.g(this.a);
    }
  }

  public void a(sz paramsz, int paramInt)
  {
    boolean bool = DialogToastListActivity.f;
    if ((paramsz != null) && (paramsz.b.a.equals(this.a.p)))
      if (Conversation.n(this.a) != 0)
      {
        Conversation.o(this.a).add(paramsz);
        if (!bool);
      }
      else
      {
        if (Conversation.p(this.a))
        {
          this.a.Pb.getCursor().requery();
          Conversation.c(this.a, false);
          if (!bool);
        }
        else if (!paramsz.b.b)
        {
          Conversation.b(this.a, paramsz);
        }
        this.a.Pb.notifyDataSetChanged();
        Conversation.q(this.a);
      }
  }

  public void a(String paramString)
  {
    if ((paramString != null) && (paramString.equals(this.a.p)))
    {
      this.a.Pb.getCursor().requery();
      if ((!App.z.a(this.a.p, null)) && (Conversation.r(this.a) != null))
      {
        Conversation.r(this.a).setVisibility(8);
        this.a.Ib.removeHeaderView(Conversation.r(this.a));
        g5.b(z[1] + this.a.Ib.getHeaderViewsCount());
        Conversation.a(this.a, null);
        g5.b(z[0]);
        this.a.Pb.notifyDataSetChanged();
      }
    }
  }

  public void b(sz paramsz, int paramInt)
  {
    if ((paramsz != null) && (paramsz.b.a.equals(this.a.p)))
      Conversation.c(this.a, paramsz);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.nq
 * JD-Core Version:    0.6.1
 */