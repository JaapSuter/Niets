package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Iterator;

class ah
  implements View.OnClickListener
{
  private static final String[] z;
  final Advanced a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "dvF@\036Eq\033V\006T+\006R\002".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "@p\005GVGj\006C\027Gq\033".toCharArray();
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
        m = 118;
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
        m = 36;
        continue;
        m = 5;
        continue;
        m = 104;
        continue;
        m = 55;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 118;
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
      i3 = 36;
      continue;
      i3 = 5;
      continue;
      i3 = 104;
      continue;
      i3 = 55;
    }
  }

  ah(Advanced paramAdvanced)
  {
  }

  public void onClick(View paramView)
  {
    boolean bool = DialogToastListActivity.f;
    App.d(z[1]);
    String str = ((EditText)this.a.findViewById(2131558422)).getText().toString();
    ArrayList localArrayList;
    if ((str != null) && (str.length() > 0) && (str.contains("-")))
      localArrayList = App.w.i();
    while (true)
    {
      if ((localArrayList != null) && (localArrayList.size() > 0))
      {
        Iterator localIterator = localArrayList.iterator();
        do
        {
          if (!localIterator.hasNext())
            break;
          ((zq)localIterator.next());
        }
        while (!bool);
      }
      return;
      if ((str != null) && (str.length() > 0))
        localArrayList = App.w.e(str + z[0]);
      else
        localArrayList = App.w.h();
    }
  }
}