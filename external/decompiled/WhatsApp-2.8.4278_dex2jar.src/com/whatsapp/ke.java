package com.whatsapp;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

class ke extends ArrayAdapter<String>
{
  private static final String z;
  private ArrayList<String> a;
  final SetStatus b;

  static
  {
    char[] arrayOfChar = "9 oA2!\036@!9 bK5".toCharArray();
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
      m = 71;
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
      m = 85;
      continue;
      m = 65;
      continue;
      m = 22;
      continue;
      m = 46;
    }
  }

  public ke(Context paramContext, int paramInt, ArrayList<String> paramArrayList)
  {
    super(paramInt, paramArrayList, localList);
    this.a = localList;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
      paramView = ((LayoutInflater)this.b.getSystemService(z)).inflate(2130903125, null);
    Object localObject = (String)this.a.get(paramInt);
    TextView localTextView;
    SpannableStringBuilder localSpannableStringBuilder;
    if (localObject != null)
    {
      localTextView = (TextView)paramView.findViewById(2131558765);
      if (localTextView != null)
      {
        if (((String)localObject).equals(App.a))
        {
          localTextView.setTextColor(Color.argb(255, 51, 102, 153));
          if (!DialogToastListActivity.f);
        }
        else
        {
          localTextView.setTextColor(-16777216);
        }
        localSpannableStringBuilder = v4.a((String)localObject, this.b.getBaseContext());
        if (localSpannableStringBuilder != null)
          break label128;
      }
    }
    while (true)
    {
      localTextView.setText((CharSequence)localObject);
      return paramView;
      label128: localObject = localSpannableStringBuilder;
    }
  }
}