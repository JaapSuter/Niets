package com.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class re extends BaseAdapter
{
  private static final String z;
  final LocationPickerPopup a;

  static
  {
    char[] arrayOfChar = "x;.\0071`\005>\006\"x;#\r6".toCharArray();
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
      m = 68;
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
      m = 20;
      continue;
      m = 90;
      continue;
      m = 87;
      continue;
      m = 104;
    }
  }

  public re(LocationPickerPopup paramLocationPickerPopup, Context paramContext)
  {
  }

  public int getCount()
  {
    if (LocationPickerPopup.b(this.a) == null);
    for (int i = 0; ; i = LocationPickerPopup.b(this.a).size())
      return i;
  }

  public Object getItem(int paramInt)
  {
    return LocationPickerPopup.b(this.a).get(paramInt);
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
    if (paramView == null)
      paramView = ((LayoutInflater)App.Mb.getBaseContext().getSystemService(z)).inflate(2130903105, null);
    TextView localTextView1 = (TextView)paramView.findViewById(2131558701);
    TextView localTextView2 = (TextView)paramView.findViewById(2131558706);
    if (LocationPickerPopup.b(this.a) != null)
    {
      fy localfy = (fy)LocationPickerPopup.b(this.a).get(paramInt);
      localTextView1.setText(localfy.a);
      if ((localfy.b != null) && (!"".equals(localfy.b)))
      {
        localTextView2.setVisibility(0);
        localTextView2.setText(localfy.b);
        if (!DialogToastListActivity.f);
      }
      else
      {
        localTextView2.setVisibility(8);
      }
    }
    return paramView;
  }

  public int getViewTypeCount()
  {
    return 1;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.re
 * JD-Core Version:    0.6.1
 */