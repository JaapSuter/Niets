package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class ie extends ArrayAdapter<zq>
{
  public LayoutInflater a;
  final GroupChatInfo b;

  public ie(Context paramContext, int paramInt, List<zq> paramList)
  {
    super(paramInt, paramList, localList);
    this.a = LayoutInflater.from(paramInt);
  }

  public int getCount()
  {
    int i = this.b.r.size();
    if (this.b.t.k);
    for (int j = 1; ; j = 0)
      return j + i;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool = DialogToastListActivity.f;
    View localView;
    if (paramView == null)
    {
      localView = this.a.inflate(2130903116, paramViewGroup, false);
      if (!bool)
        break label547;
    }
    while (true)
    {
      paramView.findViewById(2131558624).setVisibility(8);
      if ((paramInt == -1 + getCount()) && (this.b.t.k))
      {
        ((TextView)paramView.findViewById(2131558733)).setText(this.b.getString(2131296866));
        if (!App.b)
        {
          this.b.k();
          if (!bool);
        }
        else
        {
          Object localObject = v4.b(App.a, this.b.getBaseContext());
          TextView localTextView3 = (TextView)paramView.findViewById(2131558734);
          if (localObject == null)
            localObject = App.a;
          localTextView3.setText((CharSequence)localObject);
        }
        ((TextView)paramView.findViewById(2131558733)).setTextColor(this.b.getResources().getColor(2131230721));
        ImageView localImageView2 = (ImageView)paramView.findViewById(2131558625);
        Bitmap localBitmap2 = App.w.b().a(GroupChatInfo.a(this.b), GroupChatInfo.b(this.b), true);
        if (localBitmap2 == null)
        {
          localImageView2.setImageResource(2130837522);
          if (!bool);
        }
        else
        {
          localImageView2.setImageBitmap(localBitmap2);
        }
        paramView.setTag(null);
        if (!bool);
      }
      else
      {
        zq localzq = (zq)getItem(paramInt);
        TextView localTextView1 = (TextView)paramView.findViewById(2131558733);
        TextView localTextView2 = (TextView)paramView.findViewById(2131558734);
        localTextView1.setText(localzq.b());
        if (this.b.s.containsKey(localzq.b))
        {
          ((ImageView)paramView.findViewById(2131558625)).setImageResource(2130838471);
          localTextView1.setTextColor(this.b.getResources().getColor(2131230725));
          localTextView2.setTextColor(this.b.getResources().getColor(2131230725));
          localTextView2.setText(2131296884);
          if (!bool);
        }
        else
        {
          ImageView localImageView1 = (ImageView)paramView.findViewById(2131558625);
          Bitmap localBitmap1 = localzq.a(GroupChatInfo.a(this.b), GroupChatInfo.b(this.b), true);
          if (localBitmap1 == null)
          {
            localImageView1.setImageResource(localzq.k());
            if (!bool);
          }
          else
          {
            localImageView1.setImageBitmap(localBitmap1);
          }
          localTextView1.setTextColor(this.b.getResources().getColor(2131230721));
          if (localTextView2 != null)
          {
            localTextView2.setTextColor(this.b.getResources().getColor(2131230723));
            SpannableStringBuilder localSpannableStringBuilder = v4.b(localzq.c, this.b.getBaseContext());
            if (localSpannableStringBuilder == null)
            {
              localTextView2.setText(localzq.c);
              localTextView2.setGravity(16);
              if (!bool);
            }
            else
            {
              localTextView2.setText(localSpannableStringBuilder);
              localTextView2.setGravity(48);
            }
          }
        }
        paramView.setTag(localzq);
      }
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
      label547: paramView = localView;
    }
  }

  public int getViewTypeCount()
  {
    return 1;
  }
}