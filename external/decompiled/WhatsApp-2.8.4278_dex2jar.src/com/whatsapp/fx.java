package com.whatsapp;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.Scroller;
import android.widget.TextView;
import java.util.ArrayList;

class fx
  implements gt
{
  private static final String[] z;
  private boolean a;
  private int b = -1;
  final MediaView c;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "98Sys\"4Rg=7?\030cw -Xc=:2\032y5:R".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    char[] arrayOfChar4;
    int i9;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "98Sys\"4Rg=7?\030cy=-\027v{81\027``1+\02762:8Od".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "'8C`}'4Cy}:".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label325;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "98Sys\"4Rg=7?\030`}'}^~d51^t".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label417;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 18;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[j] = (char)(m ^ k);
        j++;
        break;
        m = 84;
        continue;
        m = 93;
        continue;
        m = 55;
        continue;
        m = 16;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 18;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i1] = (char)(i3 ^ i2);
      i1++;
      break;
      i3 = 84;
      continue;
      i3 = 93;
      continue;
      i3 = 55;
      continue;
      i3 = 16;
    }
    label325: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 18;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i5] = (char)(i7 ^ i6);
      i5++;
      break;
      i7 = 84;
      continue;
      i7 = 93;
      continue;
      i7 = 55;
      continue;
      i7 = 16;
    }
    label417: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 18;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i9] = (char)(i11 ^ i10);
      i9++;
      break;
      i11 = 84;
      continue;
      i11 = 93;
      continue;
      i11 = 55;
      continue;
      i11 = 16;
    }
  }

  fx(MediaView paramMediaView)
  {
  }

  public void a()
  {
    if ((MediaView.o(this.c).i) || (MediaView.o(this.c).h))
      MediaView.p(this.c);
    this.c.a(MediaView.i(this.c), true);
  }

  public void a(int paramInt)
  {
    int i = 0;
    boolean bool = DialogToastListActivity.f;
    if ((paramInt < 0) || (paramInt >= this.c.x.size()))
      g5.d(z[3]);
    label620: 
    while (true)
    {
      return;
      if (this.c.T)
        g5.d(z[2]);
      if ((this.b != paramInt) || (paramInt == 0))
      {
        this.b = paramInt;
        if (this.c.x.size() > 0)
        {
          if (this.c.S)
          {
            g5.c(z[1]);
            MediaView.a(this.c, paramInt, (TouchImageView)MediaView.h(this.c).getChildAt(paramInt));
            MediaView.c(this.c, MediaView.i(this.c));
            if (!bool);
          }
          else
          {
            if (this.c.V)
            {
              MediaView.a(this.c, paramInt, (TouchImageView)MediaView.h(this.c).getChildAt(paramInt), null, false);
              MediaView.c(this.c, MediaView.i(this.c));
            }
            MediaView.d(this.c, paramInt);
          }
          MediaView.j(this.c).setVisibility(0);
          MediaView.k(this.c).setVisibility(0);
          MediaView.l(this.c).setVisibility(0);
          MediaView.e(this.c, paramInt);
          TextView localTextView = MediaView.n(this.c);
          MediaView localMediaView = this.c;
          Object[] arrayOfObject = new Object[2];
          arrayOfObject[i] = Integer.valueOf(1 + MediaView.i(this.c));
          arrayOfObject[1] = Integer.valueOf(MediaView.m(this.c));
          localTextView.setText(localMediaView.getString(2131296807, arrayOfObject));
          MediaView.a(this.c, (TouchImageView)MediaView.h(this.c).getChildAt(MediaView.i(this.c)));
          if (MediaView.o(this.c) != null)
          {
            MediaView.o(this.c).e();
            this.c.a(MediaView.o(this.c), MediaView.o(this.c).a());
            if (!bool);
          }
          else
          {
            g5.c(z[0]);
          }
          if (!this.c.V)
            this.c.a(paramInt, false);
          if (MediaView.o(this.c) != null)
            MediaView.o(this.c).d = false;
          if ((MediaView.a(this.c) != null) && (MediaView.a(this.c).isPlaying()) && (!this.c.V))
            MediaView.a(this.c).stop();
          if ((MediaView.o(this.c) != null) && (MediaView.o(this.c).i))
          {
            MediaView.o(this.c).a(this.c.getResources().getConfiguration().orientation);
            if (MediaView.c(this.c) == 5)
              MediaView.d(this.c).setText(this.c.getString(2131296756));
          }
          if (MediaView.h(this.c).scroller.isFinished())
            while (true)
            {
              if (i >= this.c.x.size())
                break label620;
              if ((i < paramInt - 1) || (i > paramInt + 1))
                ((TouchImageView)MediaView.h(this.c).getChildAt(i)).b();
              int j = i + 1;
              if (bool)
                break;
              i = j;
            }
        }
      }
    }
  }

  public void a(MotionEvent paramMotionEvent)
  {
    MediaView.o(this.c).a(paramMotionEvent);
  }

  public void a(gw paramgw)
  {
    if ((MediaView.o(this.c).i) || (MediaView.o(this.c).h));
    while (true)
    {
      return;
      if (paramgw != null)
        if (paramgw.a())
        {
          MediaView.o(this.c).d();
          if (!DialogToastListActivity.f);
        }
        else
        {
          MediaView.o(this.c).d();
        }
    }
  }

  public void b()
  {
    if (!MediaView.q(this.c))
    {
      MediaView.a(this.c, true);
      this.c.a(2131296984, new gx(this));
    }
  }

  public void b(int paramInt)
  {
    AlphaAnimation localAlphaAnimation;
    if ((MediaView.o(this.c) != null) && (!MediaView.o(this.c).i) && (!MediaView.o(this.c).h))
    {
      if (!this.a)
        break label140;
      this.a = false;
      localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
      MediaView.j(this.c).setVisibility(0);
      MediaView.k(this.c).setVisibility(0);
      MediaView.l(this.c).setVisibility(0);
    }
    while (true)
    {
      localAlphaAnimation.setDuration(400L);
      MediaView.j(this.c).setAnimation(localAlphaAnimation);
      MediaView.k(this.c).setAnimation(localAlphaAnimation);
      MediaView.l(this.c).setAnimation(localAlphaAnimation);
      MediaView.a(this.c, 0);
      return;
      label140: this.a = true;
      localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
      MediaView.j(this.c).setVisibility(4);
      MediaView.k(this.c).setVisibility(4);
      MediaView.l(this.c).setVisibility(4);
    }
  }
}