package com.whatsapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class de extends ArrayAdapter<zq>
{
  private static final String z;
  private ArrayList<zq> a;
  private LayoutInflater b;
  final BroadcastMessageComposer c;

  static
  {
    char[] arrayOfChar = "qD".toCharArray();
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
      m = 104;
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
      m = 81;
      continue;
      m = 100;
      continue;
      m = 104;
      continue;
      m = 4;
    }
  }

  public de(Context paramContext, int paramInt, ArrayList<zq> paramArrayList)
  {
    super(paramInt, paramArrayList, localList);
    this.a = localList;
    this.b = LayoutInflater.from(paramInt);
  }

  public zq a(int paramInt)
  {
    return (zq)this.a.get(paramInt);
  }

  public int getCount()
  {
    return this.a.size();
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool = DialogToastListActivity.f;
    if (paramView == null)
      paramView = this.b.inflate(2130903116, paramViewGroup, false);
    zq localzq = a(paramInt);
    paramView.setTag(localzq);
    ImageView localImageView = (ImageView)paramView.findViewById(2131558625);
    Bitmap localBitmap = localzq.a(BroadcastMessageComposer.e(), BroadcastMessageComposer.f(), true);
    if (localBitmap == null)
    {
      localImageView.setImageResource(localzq.k());
      if (!bool);
    }
    else
    {
      localImageView.setImageBitmap(localBitmap);
    }
    TextView localTextView1 = (TextView)paramView.findViewById(2131558733);
    TextView localTextView2 = (TextView)paramView.findViewById(2131558734);
    localTextView1.setText(localzq.b());
    Object localObject;
    SpannableStringBuilder localSpannableStringBuilder;
    if (localzq.c != null)
    {
      localObject = localzq.c + z;
      localSpannableStringBuilder = v4.b((String)localObject, this.c.getBaseContext());
      if (localSpannableStringBuilder != null)
        break label211;
    }
    while (true)
    {
      localTextView2.setText((CharSequence)localObject);
      if (paramInt % 2 == 0)
      {
        paramView.setBackgroundResource(2130838548);
        if (!bool);
      }
      else
      {
        paramView.setBackgroundResource(2130838550);
      }
      return paramView;
      localObject = z;
      break;
      label211: localObject = localSpannableStringBuilder;
    }
  }

  public boolean hasStableIds()
  {
    return true;
  }
}