package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import java.util.HashMap;

public class ye extends RelativeLayout
{
  private static int a;
  static Paint b;
  static j4 c;
  private static final String[] z;
  boolean d;
  sz e;
  Context f;
  boolean g = false;
  int h;
  int i;
  int j;
  int k;
  boolean l;
  public int m = -1;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "[ZGk9\\��Wl6M\017Kf!\031FK`!PNQl1\031V@}{\003".toCharArray();
    int n = arrayOfChar1.length;
    int i1 = 0;
    char[] arrayOfChar2;
    int i5;
    char[] arrayOfChar3;
    int i9;
    char[] arrayOfChar4;
    int i13;
    if (n <= i1)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "[ZGk9\\pWV9XVJ|!\026HWh,fMPk7UJ".toCharArray();
      int i4 = arrayOfChar2.length;
      i5 = 0;
      if (i4 <= i5)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "[ZGk9\\pWV9XVJ|!\026HWl0WpG|7[C@&".toCharArray();
        int i8 = arrayOfChar3.length;
        i9 = 0;
        if (i8 > i9)
          break label333;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\032l\025Jaz\037".toCharArray();
        int i12 = arrayOfChar4.length;
        i13 = 0;
        if (i12 > i13)
          break label425;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        z = arrayOfString;
        a = -1;
      }
    }
    else
    {
      int i2 = arrayOfChar1[i1];
      int i3;
      switch (i1 % 5)
      {
      default:
        i3 = 85;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[i1] = (char)(i3 ^ i2);
        i1++;
        break;
        i3 = 57;
        continue;
        i3 = 47;
        continue;
        i3 = 37;
        continue;
        i3 = 9;
      }
    }
    int i6 = arrayOfChar2[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 85;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i5] = (char)(i7 ^ i6);
      i5++;
      break;
      i7 = 57;
      continue;
      i7 = 47;
      continue;
      i7 = 37;
      continue;
      i7 = 9;
    }
    label333: int i10 = arrayOfChar3[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 85;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i9] = (char)(i11 ^ i10);
      i9++;
      break;
      i11 = 57;
      continue;
      i11 = 47;
      continue;
      i11 = 37;
      continue;
      i11 = 9;
    }
    label425: int i14 = arrayOfChar4[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 85;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i13] = (char)(i15 ^ i14);
      i13++;
      break;
      i15 = 57;
      continue;
      i15 = 47;
      continue;
      i15 = 37;
      continue;
      i15 = 9;
    }
  }

  public ye(Context paramContext)
  {
    super(paramContext);
    this.f = paramContext;
  }

  public ye(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public ye(Context paramContext, sz paramsz)
  {
    super(paramContext);
    this.e = paramsz;
    this.f = paramContext;
    if (c == null)
      c = j4.a(paramContext);
    if (b == null)
    {
      b = new Paint();
      b.setColor(Color.parseColor(z[3]));
      b.setStrokeWidth(c.V);
    }
    if (a == -1)
      a = (int)getResources().getDimension(2131361832);
  }

  private float a()
  {
    this.k = 0;
    ViewGroup localViewGroup = (ViewGroup)getChildAt(1);
    this.j = localViewGroup.getTop();
    this.l = eu.f(this.e.b.a);
    View localView;
    float f1;
    if ((this.l) && (!this.e.b.b))
    {
      localView = localViewGroup.getChildAt(0);
      this.i = localView.getMeasuredHeight();
      switch (localViewGroup.getId())
      {
      default:
        if (App.ub())
        {
          this.h = ((ViewGroup)localViewGroup.getChildAt(1)).getChildAt(0).getMeasuredWidth();
          if (!DialogToastListActivity.f);
        }
        else
        {
          this.h = ((ViewGroup)localViewGroup.getChildAt(1)).getChildAt(1).getMeasuredWidth();
        }
        this.k += localViewGroup.getMeasuredWidth();
        f1 = this.k + c.q + c.l;
      case 2131558613:
      }
    }
    while (true)
    {
      return f1;
      this.h = localView.getMeasuredWidth();
      f1 = localViewGroup.getMeasuredWidth() + c.q + c.l;
      continue;
      this.k = localViewGroup.getMeasuredWidth();
      f1 = this.k + c.q + c.l;
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    int n = 0;
    boolean bool = DialogToastListActivity.f;
    int i4;
    int i32;
    int i33;
    label108: int i34;
    label120: Rect localRect2;
    if ((this.e.a != -1) && (this.e.a != 6) && (Conversation.g))
    {
      i4 = (int)a();
      if (this.e.b.b)
      {
        if (this.e.l == 0)
          break label1003;
        if (!App.ub())
          break label972;
        i32 = getWidth() - i4 - c.o;
        if (!this.g)
          break label978;
        i33 = this.j - c.z;
        if (!App.ub())
          break label989;
        i34 = getWidth();
        localRect2 = new Rect(i32, i33, i34, getHeight() - c.n);
      }
    }
    while (true)
    {
      try
      {
        Drawable localDrawable3 = App.Mb.getApplicationContext().getResources().getDrawable(2130838452);
        if (localDrawable3 != null)
        {
          localDrawable3.setDither(true);
          localDrawable3.setBounds(localRect2);
          localDrawable3.draw(paramCanvas);
        }
        if (bool)
        {
          if (this.m != -1)
            if (Conversation.j.containsKey(this.e.b))
            {
              i27 = Conversation.Q.getWidth() - a;
              dj localdj1 = (dj)Conversation.j.get(this.e.b);
              if (dj.a(localdj1) > i27)
              {
                if (!bool)
                  continue;
                i4 = i27;
              }
              if (dj.a(localdj1) < i4)
              {
                if (dj.a(localdj1) >= i4)
                {
                  i4 = dj.a(localdj1);
                  if (!bool)
                    continue;
                }
                localdj1.a(i4);
                i28 = 1;
                if (i28 != 0)
                {
                  dj localdj2 = localdj1.f;
                  if (localdj2 != null)
                  {
                    localdj2.a(i4);
                    View localView2 = Conversation.b().Ib.findViewWithTag(localdj2.d);
                    if (localView2 != null)
                      localView2.invalidate();
                    localdj2 = localdj2.f;
                    if (!bool)
                      continue;
                  }
                  dj localdj3 = localdj1.e;
                  if (localdj3 != null)
                  {
                    localdj3.a(i4);
                    View localView1 = Conversation.b().Ib.findViewWithTag(localdj3.d);
                    if (localView1 != null)
                      localView1.invalidate();
                    localdj3 = localdj3.e;
                    if (!bool)
                      continue;
                  }
                }
                if (!bool);
              }
              else
              {
                i4 = dj.a(localdj1);
              }
              if (!bool);
            }
            else
            {
              this.m = -1;
            }
          if (this.e.l == 0)
            continue;
          if (!App.ub())
            continue;
          i22 = 0;
          if (!this.g)
            continue;
          int i25 = this.j;
          if (!this.l)
            continue;
          i26 = 0;
          i23 = i25 - i26;
          if (!App.ub())
            continue;
          i24 = i4 - c.o;
          localObject = new Rect(i22, i23, i24, getHeight() - c.n);
          switch (this.m)
          {
          default:
          case 1:
          case 2:
          case 3:
          }
        }
      }
      catch (OutOfMemoryError localOutOfMemoryError2)
      {
        int i27;
        try
        {
          Object localObject;
          Drawable localDrawable2 = this.f.getResources().getDrawable(2130838448);
          localDrawable1 = localDrawable2;
          if (localDrawable1 != null)
          {
            localDrawable1.setBounds((Rect)localObject);
            localDrawable1.setDither(true);
            localDrawable1.draw(paramCanvas);
          }
          i1 = i4;
          super.onDraw(paramCanvas);
          if ((this.e.a != -1) && (!this.e.b.b) && (this.l))
          {
            if (!this.g)
              continue;
            int i3 = this.j;
            if (!this.l)
              continue;
            f1 = i3 - n;
            float f2 = f1 + this.i;
            i2 = this.f.getResources().getDisplayMetrics().widthPixels;
            if (c.R + this.h <= i1 / 2)
              continue;
            f3 = c.S + this.h;
            if (this.e.l == 0)
            {
              if (this.m == -1)
              {
                if (!App.ub())
                  continue;
                f11 = c.Q;
                if (!App.ub())
                  continue;
                f12 = f3;
                paramCanvas.drawLine(f11, f2, f12, f2, b);
                if (!bool);
              }
              else if (this.m == 1)
              {
                if (!App.ub())
                  continue;
                f9 = c.Q;
                if (!App.ub())
                  continue;
                f10 = f3;
                paramCanvas.drawLine(f9, f2, f10, f2, b);
                if (!bool);
              }
              else
              {
                ((dj)Conversation.j.get(this.e.b));
                f6 = 0.25F * i1;
                if (!App.ub())
                  continue;
                f7 = c.Q;
                if (!App.ub())
                  continue;
                f8 = f6 + c.Q;
                paramCanvas.drawLine(f7, 1.0F, f8, 1.0F, b);
                if (!bool);
              }
            }
            else
            {
              if (!App.ub())
                continue;
              f4 = c.T;
              if (!App.ub())
                continue;
              f5 = this.h + c.U;
              paramCanvas.drawLine(f4, f2, f5, f2, b);
            }
          }
          return;
          label972: i32 = 0;
          break;
          label978: i33 = c.m;
          break label108;
          label989: i34 = i4 + c.o;
          break label120;
          label1003: if (App.ub())
          {
            i29 = getWidth() - i4;
            if (!this.g)
              continue;
            i30 = this.j - c.z;
            if (!App.ub())
              continue;
            i31 = getWidth();
            localRect2 = new Rect(i29, i30, i31, getHeight() - c.m);
            continue;
          }
          int i29 = 0;
          continue;
          int i30 = c.m;
          continue;
          int i31 = i4;
          continue;
          localOutOfMemoryError2 = localOutOfMemoryError2;
          g5.d(z[2] + localOutOfMemoryError2);
          j5.c();
          continue;
          int i22 = getWidth() - i4 + c.o;
          continue;
          int i26 = c.z;
          continue;
          int i23 = c.m;
          continue;
          int i24 = getWidth();
          continue;
          if (this.m == -1)
          {
            if (App.ub())
            {
              i17 = 0;
              if (!this.g)
                continue;
              int i20 = this.j;
              if (!this.l)
                continue;
              i21 = 0;
              i18 = i20 - i21;
              if (!App.ub())
                continue;
              i19 = i4;
              localObject = new Rect(i17, i18, i19, getHeight() - c.m);
              continue;
            }
            int i17 = getWidth() - i4;
            continue;
            int i21 = c.z;
            continue;
            int i18 = c.m;
            continue;
            int i19 = getWidth();
            continue;
          }
          int i12;
          int i16;
          int i13;
          int i14;
          switch (this.m)
          {
          default:
            if (App.ub())
            {
              i12 = 0;
              if (!this.g)
                continue;
              int i15 = this.j;
              if (!this.l)
                continue;
              i16 = 0;
              i13 = i15 - i16;
              if (!App.ub())
                continue;
              i14 = i4;
              Rect localRect1 = new Rect(i12, i13, i14, getHeight() - c.m);
              g5.d(z[0] + this.m);
              localObject = localRect1;
            }
            break;
          case 1:
            if (App.ub())
            {
              i9 = 0;
              if (!this.g)
                continue;
              i10 = this.j;
              if (!App.ub())
                continue;
              i11 = i4;
              localObject = new Rect(i9, i10, i11, 1 + getHeight());
              continue;
            }
            int i9 = getWidth() - i4;
            continue;
            int i10 = c.m;
            continue;
            int i11 = getWidth();
            break;
          case 2:
            if (App.ub())
            {
              i7 = 0;
              if (!App.ub())
                continue;
              i8 = i4;
              localObject = new Rect(i7, -1, i8, 1 + getHeight());
              continue;
            }
            int i7 = getWidth() - i4;
            continue;
            int i8 = getWidth();
            break;
          case 3:
            if (App.ub())
            {
              i5 = 0;
              if (!App.ub())
                continue;
              i6 = i4;
              localObject = new Rect(i5, -1, i6, getHeight() - c.m);
              continue;
            }
            int i5 = getWidth() - i4;
            continue;
            int i6 = getWidth();
            continue;
            i12 = getWidth() - i4;
            continue;
            i16 = c.z;
            continue;
            i13 = c.m;
            continue;
            i14 = getWidth();
            continue;
            localDrawable1 = this.f.getResources().getDrawable(2130838451);
            continue;
            localDrawable1 = this.f.getResources().getDrawable(2130838449);
            continue;
            localDrawable1 = this.f.getResources().getDrawable(2130838450);
            continue;
          }
        }
        catch (OutOfMemoryError localOutOfMemoryError1)
        {
          int i2;
          float f6;
          g5.d(z[1] + localOutOfMemoryError1);
          Drawable localDrawable1 = null;
          j5.c();
          continue;
          n = c.z;
          continue;
          float f1 = c.P;
          continue;
          float f3 = i1 / 2;
          continue;
          float f11 = i2 - f3;
          continue;
          float f12 = i2 - c.Q;
          continue;
          float f9 = i2 - f3;
          continue;
          float f10 = i2 - c.Q;
          continue;
          float f7 = i2 - c.Q - f6;
          continue;
          float f8 = i2 - c.Q;
          continue;
          float f4 = i2 - this.h - c.U;
          continue;
          float f5 = i2 - c.T;
          continue;
        }
        int i28 = 0;
        continue;
        i4 = i27;
        continue;
      }
      int i1 = 0;
    }
  }
}