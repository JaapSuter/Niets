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

class pe extends BaseAdapter
{
  private static final String z;
  private Context a;
  private int b;
  final b c;

  static
  {
    char[] arrayOfChar = ">J6\003!&t&\0022>J;\t&".toCharArray();
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
      m = 84;
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
      m = 82;
      continue;
      m = 43;
      continue;
      m = 79;
      continue;
      m = 108;
    }
  }

  public pe(b paramb, Context paramContext, int paramInt)
  {
    this.a = paramContext;
    this.b = paramInt;
  }

  public int getCount()
  {
    int i = v4.a(v4.b) / this.c.o;
    if (v4.a(v4.b) % this.c.o != 0);
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
    if ((paramView == null) || (((LinearLayout)paramView).getChildCount() != this.c.o))
    {
      LinearLayout localLinearLayout1 = (LinearLayout)((LayoutInflater)App.Mb.getBaseContext().getSystemService(z)).inflate(2130903092, null);
      int i = 0;
      do
      {
        if (i >= this.c.o)
          break;
        ImageView localImageView1 = new ImageView(this.a);
        localImageView1.setLayoutParams(new LinearLayout.LayoutParams(j4.a(this.a).t, j4.a(this.a).u));
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
        Drawable localDrawable = v4.a(this.b, j + paramInt * this.c.o);
        ImageView localImageView2 = (ImageView)localLinearLayout2.getChildAt(j);
        if (localDrawable != null)
        {
          localDrawable.setBounds(0, 0, (int)j4.a(this.a).a(localDrawable.getIntrinsicWidth()), (int)j4.a(this.a).a(localDrawable.getIntrinsicWidth()));
          localImageView2.setImageDrawable(localDrawable);
          localImageView2.setBackgroundResource(2130838542);
          localImageView2.setClickable(true);
          localImageView2.setTag(Integer.valueOf(j + paramInt * this.c.o));
          localImageView2.setOnClickListener(this.c.w);
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
        localLinearLayout2.setOnTouchListener(new ks(this));
        return localLinearLayout2;
        localLinearLayout2 = (LinearLayout)paramView;
        break;
      }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.pe
 * JD-Core Version:    0.6.1
 */