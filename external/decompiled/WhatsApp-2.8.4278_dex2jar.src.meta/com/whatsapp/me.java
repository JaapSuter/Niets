package com.whatsapp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

class me extends BaseAdapter
{
  private static final String z;
  private Context a;
  private int b;
  final Conversation c;

  static
  {
    char[] arrayOfChar = " (>n%8\026.o6 (3d\"".toCharArray();
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
      m = 80;
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
      m = 76;
      continue;
      m = 73;
      continue;
      m = 71;
      continue;
      m = 1;
    }
  }

  public me(Conversation paramConversation, Context paramContext, int paramInt)
  {
    this.a = paramContext;
    this.b = paramInt;
  }

  public int getCount()
  {
    int i = v4.a(v4.b) / this.c.X;
    if (v4.a(v4.b) % this.c.X != 0);
    for (int j = 1; ; j = 0)
      return j + i;
  }

  public Object getItem(int paramInt)
  {
    return null;
  }

  public long getItemId(int paramInt)
  {
    return 0L;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool = DialogToastListActivity.f;
    LinearLayout localLinearLayout2;
    if ((paramView == null) || (((LinearLayout)paramView).getChildCount() != this.c.X))
    {
      LinearLayout localLinearLayout1 = (LinearLayout)((LayoutInflater)App.Mb.getBaseContext().getSystemService(z)).inflate(2130903092, null);
      int i = 0;
      do
      {
        if (i >= this.c.X)
          break;
        ImageView localImageView1 = new ImageView(this.a);
        localImageView1.setLayoutParams(new LinearLayout.LayoutParams(Conversation.m(this.c).t, Conversation.m(this.c).u));
        localImageView1.setScaleType(ImageView.ScaleType.CENTER);
        localLinearLayout1.addView(localImageView1);
        i++;
      }
      while (!bool);
      localLinearLayout2 = localLinearLayout1;
    }
    int k;
    for (int j = 0; ; j = k)
      if (j < localLinearLayout2.getChildCount())
      {
        Drawable localDrawable = v4.a(this.b, j + paramInt * this.c.X);
        ImageView localImageView2 = (ImageView)localLinearLayout2.getChildAt(j);
        if (localDrawable != null)
        {
          localDrawable.setBounds(0, 0, (int)Conversation.m(this.c).a(localDrawable.getIntrinsicWidth()), (int)Conversation.m(this.c).a(localDrawable.getIntrinsicWidth()));
          localImageView2.setImageDrawable(localDrawable);
          localImageView2.setBackgroundResource(2130838542);
          localImageView2.setClickable(true);
          localImageView2.setTag(Integer.valueOf(j + paramInt * this.c.X));
          localImageView2.setOnClickListener(this.c.gc);
          if (!bool);
        }
        else
        {
          localImageView2.setImageDrawable(null);
          localImageView2.setBackgroundDrawable(null);
          localImageView2.setClickable(false);
        }
        k = j + 1;
        if (!bool);
      }
      else
      {
        localLinearLayout2.setClickable(false);
        localLinearLayout2.setOnTouchListener(new mn(this));
        return localLinearLayout2;
        localLinearLayout2 = (LinearLayout)paramView;
        break;
      }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.me
 * JD-Core Version:    0.6.1
 */