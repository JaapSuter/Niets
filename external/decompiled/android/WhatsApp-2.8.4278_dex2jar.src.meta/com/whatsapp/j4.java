package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.widget.EditText;

public class j4
{
  private static j4 a;
  private static final String kb;
  public int A = (int)(72.0F * this.d);
  public int B = (int)(13.333333F * this.d);
  public int C = 14;
  public int D = (int)(10.666667F * this.d);
  public int E = (int)(20.0F * this.d);
  public int F = (int)(16.666666F * this.d);
  public int G = (int)(4.0F * this.d);
  public int H = (int)(10.0F * this.d);
  public int I = (int)(12.0F * this.d);
  public float J;
  public float K;
  public float L;
  public float M;
  public float N;
  public float O;
  public float P;
  public float Q;
  public float R;
  public float S;
  public float T;
  public float U;
  public float V;
  public int W;
  public int X = 100;
  public int Y;
  public int Z;
  public float ab;
  public int b = 0;
  public int bb;
  public int c = 1;
  public int cb;
  public float d = App.Mb.getResources().getDisplayMetrics().density;
  public int db;
  public int e = Color.argb(255, 163, 213, 252);
  public int eb;
  public int f = Color.argb(255, 213, 244, 255);
  public int fb;
  public float g = 2.0F * this.d;
  public int gb;
  public float h = 3.333333F * this.d;
  public int hb;
  public float i = 3.333333F * this.d;
  public int ib;
  public float j = 60.0F * this.d;
  public int jb;
  public float k = 10.666667F * this.d;
  public float l = 5.333334F * this.d;
  public int m = (int)(2.666667F * this.d);
  public int n = (int)(2.666667F * this.d);
  public int o = (int)(5.0F * this.d);
  public int p = (int)(1.333333F * this.d);
  public float q = 8.0F * this.d;
  public float r = 12.0F * this.d;
  public float s = 5.333334F * this.d;
  public int t = (int)(43.333332F * this.d);
  public int u = (int)(43.333332F * this.d);
  public int v = (int)(186.66667F * this.d);
  public int w = (int)(93.333336F * this.d);
  public int x = 0;
  public int y = (int)(-6.666667F * this.d);
  public int z = (int)(6.0F * this.d);

  static
  {
    char[] arrayOfChar = "5L4M��5".toCharArray();
    int i1 = arrayOfChar.length;
    int i2 = 0;
    if (i1 <= i2)
    {
      kb = new String(arrayOfChar).intern();
      a = null;
      return;
    }
    int i3 = arrayOfChar[i2];
    int i4;
    switch (i2 % 5)
    {
    default:
      i4 = 111;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar[i2] = (char)(i4 ^ i3);
      i2++;
      break;
      i4 = 66;
      continue;
      i4 = 37;
      continue;
      i4 = 90;
      continue;
      i4 = 41;
    }
  }

  private j4(Context paramContext)
  {
    float f1;
    float f2;
    if (this.d >= 1.5F)
    {
      f1 = 52.0F;
      this.J = f1;
      this.K = (int)(4.0F * this.d);
      this.P = (2.0F * this.d);
      this.Q = (15.333333F * this.d);
      this.T = (19.333334F * this.d);
      this.R = (11.333333F * this.d);
      this.S = (5.333334F * this.d);
      this.U = (3.333333F * this.d);
      this.V = (2.0F * this.d);
      this.W = (int)(26.666666F * this.d);
      this.L = (4.666667F * this.d);
      this.M = (3.333333F * this.d);
      if (this.d <= 1.5F)
        break label743;
      f2 = 1.33F;
    }
    while (true)
    {
      this.N = f2;
      this.O = (2.0F * this.d / 3.0F);
      this.Y = (int)(66.666664F * this.d);
      this.Z = (int)(1.333333F * this.d);
      this.ab = (3.333333F * this.d);
      this.bb = (int)(66.666664F * this.d);
      this.hb = (int)(18.666666F * this.d);
      this.ib = (int)(2.666667F * this.d);
      this.db = (int)(2.666667F * this.d);
      this.cb = (int)(1.333333F * this.d);
      this.eb = (int)(5.333334F * this.d);
      this.fb = (int)(1.333333F * this.d);
      this.gb = (int)(1.333333F * this.d);
      this.jb = (int)(4.0F * this.d);
      return;
      f1 = 42.0F;
      break;
      label743: if (this.d < 1.0F)
        f2 = this.d;
      else
        f2 = 1.0F;
    }
  }

  public static j4 a(Context paramContext)
  {
    if (a == null)
      a = new j4(paramContext);
    return a;
  }

  public float a(float paramFloat)
  {
    if (this.d >= 1.5F)
      paramFloat *= 0.78F;
    while (true)
    {
      return paramFloat;
      if (this.d >= 1.0F)
        paramFloat *= 0.8F;
      else if (this.d >= 0.75F)
        paramFloat *= 0.8F;
    }
  }

  public void a(EditText paramEditText)
  {
    boolean bool = DialogToastListActivity.f;
    if (this.d >= 1.5F)
    {
      paramEditText.setMaxLines(6);
      if (!bool);
    }
    else if (this.d >= 1.0F)
    {
      paramEditText.setMaxLines(5);
      if (!bool);
    }
    else
    {
      paramEditText.setMaxLines(4);
    }
  }

  public boolean a()
  {
    if ((this.d > 0.75F) && (this.d < 1.5F));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public float b(float paramFloat)
  {
    if (this.d >= 1.5F)
      paramFloat *= 0.59F;
    while (true)
    {
      return paramFloat;
      if (this.d >= 1.0F)
        paramFloat *= 0.6F;
      else if (this.d >= 0.75F)
        paramFloat *= 0.6F;
    }
  }

  public boolean b()
  {
    if (this.d <= 0.75F);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public float c(float paramFloat)
  {
    float f1;
    if (this.d >= 1.5F)
      f1 = 0.55F * paramFloat;
    while (true)
    {
      return f1;
      if (this.d >= 1.0F)
        f1 = paramFloat * 0.56F;
      else if (this.d >= 0.75F)
        f1 = 0.54F * paramFloat;
      else
        f1 = paramFloat * 0.56F;
    }
  }

  public int c()
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)App.Mb.getSystemService(kb)).getDefaultDisplay().getMetrics(localDisplayMetrics);
    int i1;
    if (localDisplayMetrics.densityDpi >= 240)
      i1 = 38;
    while (true)
    {
      return i1;
      if (localDisplayMetrics.densityDpi >= 160)
        i1 = 25;
      else
        i1 = 19;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.j4
 * JD-Core Version:    0.6.1
 */