package com.whatsapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.ArrayList;

public class te extends BaseAdapter
{
  private static final String z;
  private boolean a;
  private hc b;
  final WebImagePicker c;

  static
  {
    char[] arrayOfChar = "v7\036\020".toCharArray();
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
      m = 34;
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
      m = 88;
      continue;
      m = 93;
      continue;
      m = 110;
      continue;
      m = 119;
    }
  }

  public te(WebImagePicker paramWebImagePicker, Context paramContext)
  {
  }

  static hc a(te paramte, hc paramhc)
  {
    paramte.b = paramhc;
    return paramhc;
  }

  private void a()
  {
    if (this.b != null)
      this.b.cancel(false);
  }

  static void a(te paramte)
  {
    paramte.a();
  }

  static void a(te paramte, String paramString)
  {
    paramte.a(paramString);
  }

  private void a(String paramString)
  {
    if (paramString != null)
    {
      if (this.b != null)
        this.b.cancel(false);
      this.a = true;
      WebImagePicker.a(this.c, new d8(paramString));
      WebImagePicker.b(this.c).clear();
      WebImagePicker.j(this.c).a();
      WebImagePicker.j(this.c).b();
      WebImagePicker.a(this.c, new q5(2130838462, 2130838520, WebImagePicker.h(this.c), WebImagePicker.k(this.c)));
    }
    this.b = new hc(this);
    this.b.execute(new Void[0]);
    if (paramString != null)
      notifyDataSetChanged();
  }

  static boolean a(te paramte, boolean paramBoolean)
  {
    paramte.a = paramBoolean;
    return paramBoolean;
  }

  public int getCount()
  {
    int i = (-1 + (WebImagePicker.b(this.c).size() + WebImagePicker.f(this.c))) / WebImagePicker.f(this.c);
    if (this.a);
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

  public int getItemViewType(int paramInt)
  {
    if ((paramInt == -1 + getCount()) && (this.a));
    for (int i = 1; ; i = 0)
      return i;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool = DialogToastListActivity.f;
    if (getItemViewType(paramInt) == 1)
    {
      if ((this.b == null) && (this.a))
        a(null);
      if (paramView == null);
    }
    label224: label613: 
    while (true)
    {
      return paramView;
      paramView = new LinearLayout(this.c);
      paramView.setPadding(WebImagePicker.g(this.c).db, WebImagePicker.g(this.c).cb, WebImagePicker.g(this.c).cb, WebImagePicker.g(this.c).cb);
      paramView.setClickable(false);
      paramView.addView(new ProgressBar(App.Mb, null, 16842873));
      paramView.setGravity(17);
      TextView localTextView = new TextView(App.Mb);
      localTextView.setText(2131296648);
      paramView.addView(localTextView);
      continue;
      int j;
      int k;
      label244: ImageView localImageView;
      int m;
      int i1;
      if ((paramView == null) || (((LinearLayout)paramView).getChildCount() != WebImagePicker.f(this.c)))
      {
        paramView = new LinearLayout(this.c);
        paramView.setPadding(WebImagePicker.g(this.c).db, WebImagePicker.g(this.c).cb, 0, WebImagePicker.g(this.c).cb);
        paramView.setClickable(false);
        int i = paramView.getChildCount();
        j = paramInt * WebImagePicker.f(this.c);
        k = 0;
        if (j >= (paramInt + 1) * WebImagePicker.f(this.c))
          break label608;
        if (j < WebImagePicker.b(this.c).size())
        {
          w7 localw7 = (w7)WebImagePicker.b(this.c).get(j);
          if (i > k)
            break label577;
          localImageView = new ImageView(this.c);
          localImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
          LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(WebImagePicker.h(this.c), WebImagePicker.h(this.c));
          localImageView.setLayoutParams(localLayoutParams);
          localLayoutParams.rightMargin = (int)WebImagePicker.g(this.c).ab;
          localImageView.setBackgroundResource(2130838546);
          localImageView.setPadding(WebImagePicker.g(this.c).Z, WebImagePicker.g(this.c).Z, WebImagePicker.g(this.c).Z, WebImagePicker.g(this.c).Z);
          localImageView.setOnClickListener(WebImagePicker.i(this.c));
          paramView.addView(localImageView);
          WebImagePicker.j(this.c).a(localw7.a, j + z, this.c, localImageView);
          k++;
          if (!bool);
        }
        else
        {
          int n = j - paramInt * WebImagePicker.f(this.c);
          if (i > n)
            ((ImageView)paramView.getChildAt(n)).setVisibility(4);
        }
        m = k;
        i1 = j + 1;
        if (!bool)
          break label597;
      }
      while (true)
      {
        if ((this.b != null) || (!this.a) || (m >= WebImagePicker.f(this.c)))
          break label613;
        a(null);
        break;
        paramView = (LinearLayout)paramView;
        break label224;
        localImageView = (ImageView)paramView.getChildAt(k);
        localImageView.setVisibility(0);
        break label436;
        j = i1;
        k = m;
        break label244;
        m = k;
      }
    }
  }

  public int getViewTypeCount()
  {
    return 2;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.te
 * JD-Core Version:    0.6.1
 */