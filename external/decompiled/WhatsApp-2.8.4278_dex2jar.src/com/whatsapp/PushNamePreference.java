package com.whatsapp;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;

public class PushNamePreference extends Preference
{
  private static final String z;

  static
  {
    char[] arrayOfChar = "\016\"WLi\026\034GMz\016\"ZFn".toCharArray();
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
      m = 98;
      continue;
      m = 67;
      continue;
      m = 46;
      continue;
      m = 35;
    }
  }

  public PushNamePreference(Context paramContext)
  {
    super(paramContext);
  }

  public PushNamePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public PushNamePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected View onCreateView(ViewGroup paramViewGroup)
  {
    View localView1 = super.onCreateView(paramViewGroup);
    if ((localView1 instanceof ViewGroup))
    {
      View localView2 = ((ViewGroup)localView1).findViewById(16908310);
      if (localView2 != null)
      {
        ViewParent localViewParent = localView2.getParent();
        if ((localViewParent instanceof ViewGroup))
        {
          ViewGroup localViewGroup = (ViewGroup)localViewParent;
          int i = localViewGroup.indexOfChild(localView2);
          TextView localTextView = (TextView)((LayoutInflater)getContext().getSystemService(z)).inflate(2130903120, paramViewGroup, false);
          localViewGroup.removeView(localView2);
          localViewGroup.addView(localTextView, i);
        }
      }
    }
    return localView1;
  }
}