package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

class ee extends ArrayAdapter<zq>
{
  private LayoutInflater a;
  protected List<zq> b;
  final ContactInfo c;

  public ee(ContactInfo paramContactInfo, Context paramContext, int paramInt)
  {
    super(paramContext, paramInt, (List)null);
    this.a = LayoutInflater.from(paramContext);
    this.b = new ArrayList();
  }

  public zq a(int paramInt)
  {
    return (zq)this.b.get(paramInt);
  }

  public void a(List<zq> paramList)
  {
    this.b = paramList;
    notifyDataSetChanged();
  }

  public int getCount()
  {
    if (this.b == null);
    for (int i = 0; ; i = this.b.size())
      return i;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool = DialogToastListActivity.f;
    View localView;
    if (paramView == null)
    {
      localView = this.a.inflate(2130903116, paramViewGroup, false);
      if (!bool)
        break label202;
    }
    while (true)
    {
      zq localzq = a(paramInt);
      TextView localTextView1 = (TextView)paramView.findViewById(2131558733);
      TextView localTextView2 = (TextView)paramView.findViewById(2131558734);
      Object localObject = v4.a(localzq.b(), this.c);
      if (localObject == null)
        localObject = localzq.b();
      localTextView1.setText((CharSequence)localObject);
      localTextView2.setText(eu.j(localzq.b));
      ImageView localImageView = (ImageView)paramView.findViewById(2131558625);
      Bitmap localBitmap = localzq.a((int)this.c.getResources().getDimension(2131361796), j4.a(this.c).L, true);
      if (localBitmap == null)
      {
        localImageView.setImageResource(localzq.k());
        if (!bool);
      }
      else
      {
        localImageView.setImageBitmap(localBitmap);
      }
      paramView.setTag(localzq);
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
      label202: paramView = localView;
    }
  }

  public int getViewTypeCount()
  {
    return 1;
  }
}