package com.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class qe extends BaseAdapter
{
  private static final String z;
  final LocationPicker a;

  static
  {
    char[] arrayOfChar = "*\021`mi2/plz*\021mgn".toCharArray();
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
      m = 28;
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
      m = 70;
      continue;
      m = 112;
      continue;
      m = 25;
      continue;
      m = 2;
    }
  }

  public qe(LocationPicker paramLocationPicker, Context paramContext)
  {
  }

  public int getCount()
  {
    if (LocationPicker.a(this.a) == null);
    for (int i = 0; ; i = LocationPicker.a(this.a).size())
      return i;
  }

  public Object getItem(int paramInt)
  {
    if ((LocationPicker.a(this.a) == null) || (paramInt >= LocationPicker.a(this.a).size()));
    for (Object localObject = null; ; localObject = LocationPicker.a(this.a).get(paramInt))
      return localObject;
  }

  public long getItemId(int paramInt)
  {
    return 0L;
  }

  public int getItemViewType(int paramInt)
  {
    return 0;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool = DialogToastListActivity.f;
    if (paramView == null)
      paramView = ((LayoutInflater)App.Mb.getBaseContext().getSystemService(z)).inflate(2130903105, null);
    TextView localTextView1 = (TextView)paramView.findViewById(2131558701);
    TextView localTextView2 = (TextView)paramView.findViewById(2131558706);
    fy localfy = (fy)LocationPicker.a(this.a).get(paramInt);
    localTextView1.setText(localfy.a);
    if ((localfy.b != null) && (!"".equals(localfy.b)))
    {
      localTextView2.setVisibility(0);
      localTextView2.setText(localfy.b);
      localTextView2.setSingleLine(true);
      if (!bool);
    }
    else
    {
      localTextView2.setVisibility(8);
    }
    if (localfy == LocationPicker.h(this.a))
    {
      localTextView1.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2130838501, 0);
      if (!bool);
    }
    else
    {
      localTextView1.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }
    return paramView;
  }

  public int getViewTypeCount()
  {
    return 1;
  }
}