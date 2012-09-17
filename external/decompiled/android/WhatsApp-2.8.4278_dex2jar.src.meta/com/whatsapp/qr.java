package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.Iterator;

class qr
  implements View.OnClickListener
{
  private static final String[] z;
  final EditGroupSubject a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "\001\002~\"&\002\027".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\022\021D/;\024<F< \004\023".toCharArray();
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
        m = 79;
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
        m = 113;
        continue;
        m = 99;
        continue;
        m = 33;
        continue;
        m = 78;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 79;
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
      i3 = 113;
      continue;
      i3 = 99;
      continue;
      i3 = 33;
      continue;
      i3 = 78;
    }
  }

  qr(EditGroupSubject paramEditGroupSubject)
  {
  }

  public void onClick(View paramView)
  {
    boolean bool = DialogToastListActivity.f;
    if (EditGroupSubject.u.size() < eu.b)
    {
      Intent localIntent = new Intent(this.a, ContactPicker.class);
      StringBuilder localStringBuilder = new StringBuilder();
      Iterator localIterator = EditGroupSubject.u.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        localStringBuilder.append(((xr)localIterator.next()).a).append(",");
      }
      while (!bool);
      localIntent.putExtra(z[1], true);
      localIntent.putExtra(z[0], localStringBuilder.toString());
      this.a.startActivityForResult(localIntent, 1);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.qr
 * JD-Core Version:    0.6.1
 */