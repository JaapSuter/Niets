package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

class ge extends ArrayAdapter<zq>
{
  public LayoutInflater a;
  ArrayList<zq> b;
  final ContactPickerHelp c;

  public ge(Context paramContext, int paramInt, ArrayList<zq> paramArrayList)
  {
    super(paramInt, paramArrayList, localList);
    this.a = LayoutInflater.from(paramInt);
    this.b = localList;
  }

  private boolean a()
  {
    if (this.b.size() == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean areAllItemsEnabled()
  {
    return false;
  }

  public int getCount()
  {
    if (a());
    for (int i = 1; ; i = super.getCount())
      return i;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool = DialogToastListActivity.f;
    if ((getCount() == 1) && (a()))
    {
      paramView = this.a.inflate(2130903112, paramViewGroup, false);
      ((TextView)paramView.findViewById(2131558552)).setText(2131296955);
      paramView.setTag(Integer.valueOf(2));
      paramView.setClickable(false);
      return paramView;
    }
    View localView;
    if ((paramView == null) || (((Integer)paramView.getTag()).intValue() != 1))
    {
      localView = this.a.inflate(2130903058, paramViewGroup, false);
      if (!bool)
        break label206;
    }
    while (true)
    {
      TextView localTextView1 = (TextView)paramView.findViewById(2131558549);
      TextView localTextView2 = (TextView)paramView.findViewById(2131558550);
      zq localzq = (zq)getItem(paramInt);
      localTextView1.setText(localzq.b());
      localTextView2.setText(localzq.a());
      paramView.setTag(Integer.valueOf(2));
      if (paramInt % 2 == 0)
      {
        paramView.setBackgroundColor(this.c.getResources().getColor(2131230745));
        if (!bool)
          break;
      }
      paramView.setBackgroundColor(this.c.getResources().getColor(2131230746));
      break;
      label206: paramView = localView;
    }
  }

  public int getViewTypeCount()
  {
    return 2;
  }

  public boolean isEnabled(int paramInt)
  {
    return false;
  }
}