package com.whatsapp;

import android.os.AsyncTask;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import java.util.ArrayList;

public class sb extends AsyncTask<Void, Void, Integer>
{
  private boolean a;
  private ArrayList<sz> b;
  final MediaView c;

  public sb(MediaView paramMediaView)
  {
  }

  static boolean a(sb paramsb)
  {
    return paramsb.a;
  }

  protected Integer a(Void[] paramArrayOfVoid)
  {
    boolean bool = DialogToastListActivity.f;
    Integer localInteger1 = Integer.valueOf(0);
    kx localkx = new kx(this);
    this.b = App.z.a(MediaView.t(this.c), localkx);
    Integer localInteger2 = localInteger1;
    int j;
    for (int i = 0; ; i = j)
    {
      if (i < this.b.size())
        if (((sz)this.b.get(i)).b.hashCode() == this.c.U)
        {
          localInteger2 = Integer.valueOf(-1 + (this.b.size() - i));
          if (!bool);
        }
        else
        {
          j = i + 1;
          if (!bool)
            continue;
        }
      return localInteger2;
    }
  }

  public void a()
  {
    this.a = true;
    cancel(true);
  }

  protected void a(Integer paramInteger)
  {
    boolean bool = DialogToastListActivity.f;
    TouchImageView localTouchImageView1 = (TouchImageView)MediaView.h(this.c).getChildAt(0);
    this.c.x = this.b;
    MediaView.i(this.c, this.c.x.size());
    MediaView.e(this.c, paramInteger.intValue());
    this.c.V = true;
    MediaView.h(this.c).removeAllViews();
    int i = 0;
    do
    {
      if (i >= this.c.x.size())
        break;
      TouchImageView localTouchImageView2 = new TouchImageView(this.c);
      localTouchImageView2.setScaleType(ImageView.ScaleType.MATRIX);
      localTouchImageView2.setTag(Integer.valueOf(i));
      MediaView.h(this.c).addView(localTouchImageView2);
      i++;
    }
    while (!bool);
    if (MediaView.i(this.c) == 0)
    {
      MediaView.v(this.c).setImageDrawable(null);
      if (!bool);
    }
    else
    {
      MediaView.v(this.c).setImageResource(2130838545);
    }
    if (MediaView.i(this.c) == -1 + this.c.x.size())
    {
      MediaView.w(this.c).setImageDrawable(null);
      if (!bool);
    }
    else
    {
      MediaView.w(this.c).setImageResource(2130838544);
    }
    if (this.c.x.size() > 0)
    {
      MediaView.a(this.c, (TouchImageView)MediaView.h(this.c).getChildAt(MediaView.i(this.c)));
      MediaView.a(this.c, MediaView.i(this.c), MediaView.o(this.c), localTouchImageView1, false);
      MediaView.h(this.c).b(MediaView.i(this.c));
      if ((!MediaView.o(this.c).i) && (!MediaView.o(this.c).h))
        MediaView.o(this.c).a(localTouchImageView1);
    }
    this.c.findViewById(2131558713).setVisibility(8);
    MediaView.n(this.c).setVisibility(0);
    this.c.V = false;
  }
}