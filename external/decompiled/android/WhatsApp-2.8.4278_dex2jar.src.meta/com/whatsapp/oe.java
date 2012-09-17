package com.whatsapp;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import java.util.ArrayList;

class oe extends BaseAdapter
  implements Filterable
{
  private static final String[] z;
  ArrayList<xr> a;
  public Filter b = new xe(this, null);
  final EditGroupSubject c;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "bx^\001Opx".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "-(\026_\0135\026\006^\030-(\033U\f".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "ai".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label289;
        arrayOfString[2] = new String(arrayOfChar3).intern();
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
        m = 126;
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
        m = 65;
        continue;
        m = 73;
        continue;
        m = 111;
        continue;
        m = 48;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 126;
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
      i3 = 65;
      continue;
      i3 = 73;
      continue;
      i3 = 111;
      continue;
      i3 = 48;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 126;
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
      i7 = 65;
      continue;
      i7 = 73;
      continue;
      i7 = 111;
      continue;
      i7 = 48;
    }
  }

  public oe(EditGroupSubject paramEditGroupSubject)
  {
  }

  public xr a(int paramInt)
  {
    synchronized (this.a)
    {
      xr localxr = (xr)this.a.get(paramInt);
      return localxr;
    }
  }

  public int getCount()
  {
    if (this.a != null);
    for (int i = this.a.size(); ; i = 0)
      return i;
  }

  public Filter getFilter()
  {
    return this.b;
  }

  public long getItemId(int paramInt)
  {
    return 0L;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool = DialogToastListActivity.f;
    xr localxr = a(paramInt);
    if (paramView == null)
      paramView = ((LayoutInflater)this.c.getSystemService(z[1])).inflate(2130903046, null);
    TextView localTextView1 = (TextView)paramView.findViewById(2131558457);
    localTextView1.setText(localxr.c.a);
    TextView localTextView2 = (TextView)paramView.findViewById(2131558459);
    if (App.g(localxr.a))
    {
      localTextView2.setText(2131296620);
      localTextView1.setTextColor(-7829368);
      paramView.setLongClickable(true);
      if (!bool);
    }
    else
    {
      if (localxr.b == null)
        break label258;
    }
    label258: for (String str1 = localxr.b + z[2]; ; str1 = z[2])
    {
      SpannableStringBuilder localSpannableStringBuilder = v4.b(str1, this.c.getBaseContext());
      localTextView1.setTextColor(-16777216);
      localTextView2.setTextColor(Color.parseColor(z[0]));
      if (localSpannableStringBuilder == null)
      {
        localTextView2.setGravity(16);
        localTextView2.setText(str1);
        if (!bool);
      }
      else
      {
        localTextView2.setGravity(48);
        localTextView2.setText(localSpannableStringBuilder);
      }
      paramView.setLongClickable(false);
      String str2 = localxr.c.b;
      if (str2 != null)
        ((TextView)paramView.findViewById(2131558458)).setText(str2);
      paramView.setTag(localxr);
      return paramView;
    }
  }

  public boolean hasStableIds()
  {
    return true;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.oe
 * JD-Core Version:    0.6.1
 */