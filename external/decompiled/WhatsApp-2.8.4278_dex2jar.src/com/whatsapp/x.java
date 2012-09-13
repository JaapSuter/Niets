package com.whatsapp;

import android.os.AsyncTask;
import android.text.method.TextKeyListener;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Iterator;

class x extends AsyncTask<Void, Void, ArrayList<zq>>
{
  private static final String z;
  String a;
  ArrayList<zq> b = new ArrayList();
  final BroadcastMessageComposer c;

  static
  {
    char[] arrayOfChar = "6@".toCharArray();
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
      m = 121;
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
      m = 26;
      continue;
      m = 96;
      continue;
      m = 16;
      continue;
      m = 88;
    }
  }

  public x(BroadcastMessageComposer paramBroadcastMessageComposer, String paramString)
  {
    this.a = paramString;
  }

  public ArrayList<zq> a(Void[] paramArrayOfVoid)
  {
    boolean bool = DialogToastListActivity.f;
    int j;
    for (int i = 0; ; i = j)
      if (i < BroadcastMessageComposer.e(this.c).size())
      {
        if (App.g(((zq)BroadcastMessageComposer.e(this.c).get(i)).b))
        {
          this.b.add(BroadcastMessageComposer.e(this.c).remove(i));
          i--;
        }
        j = i + 1;
        if (!bool);
      }
      else
      {
        return this.b;
      }
  }

  public void a(ArrayList<zq> paramArrayList)
  {
    boolean bool = DialogToastListActivity.f;
    if (paramArrayList.size() > 0)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("[");
      Iterator localIterator1 = paramArrayList.iterator();
      do
      {
        if (!localIterator1.hasNext())
          break;
        localStringBuilder.append(((zq)localIterator1.next()).b()).append(z);
      }
      while (!bool);
      localStringBuilder.delete(-2 + localStringBuilder.length(), -1 + localStringBuilder.length());
      localStringBuilder.append("]");
      BroadcastMessageComposer localBroadcastMessageComposer1 = this.c;
      BroadcastMessageComposer localBroadcastMessageComposer2 = this.c;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localStringBuilder.toString();
      App.a(localBroadcastMessageComposer1, localBroadcastMessageComposer2.getString(2131296774, arrayOfObject), 1);
    }
    Iterator localIterator2 = BroadcastMessageComposer.e(this.c).iterator();
    do
    {
      if (!localIterator2.hasNext())
        break;
      zq localzq = (zq)localIterator2.next();
      if (this.a.trim().length() > 0)
      {
        sz localsz1 = new sz(localzq.b, this.a, null);
        App.z.a(localsz1);
      }
      if (BroadcastMessageComposer.k != null)
      {
        sz localsz2 = BroadcastMessageComposer.a(this.c, localzq);
        App.z.a(localsz2);
      }
    }
    while (!bool);
    TextKeyListener.clear(this.c.i.getText());
    this.c.removeDialog(1);
    this.c.finish();
  }

  public void onPreExecute()
  {
  }
}