package com.whatsapp;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import java.lang.ref.SoftReference;
import java.util.HashMap;

class r extends AsyncTask<Void, Void, Bitmap>
{
  private static final String z;
  private int a;
  private zq b;
  final boolean c;
  final boolean d;

  static
  {
    char[] arrayOfChar = "\030bj?E\035nv6\004\033+h<\021\006mo0\004\033bi=IOli'E\033cs>\007".toCharArray();
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
      m = 101;
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
      m = 111;
      continue;
      m = 11;
      continue;
      m = 6;
      continue;
      m = 83;
    }
  }

  public r(zq paramzq, int paramInt)
  {
    this.b = paramzq;
    this.a = paramInt;
  }

  protected Bitmap a(Void[] paramArrayOfVoid)
  {
    return this.b.a(this.a, 0.0F, false);
  }

  protected void a(Bitmap paramBitmap)
  {
    if (paramBitmap != null)
    {
      App.xb.put(this.b.f(), new SoftReference(paramBitmap));
      g5.b(z);
    }
    App.a(true, this.c, this.d);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.r
 * JD-Core Version:    0.6.1
 */