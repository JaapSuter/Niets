package com.whatsapp;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

class in
  implements Runnable
{
  private static final String[] z;
  Random a = new Random();
  int b = 0;
  long c = this.d.i;
  final sz d;
  final Handler e;
  final Conversation f;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "=B>q".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "3��".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "gM=bTpD!x\034>".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label289;
        arrayOfString[2] = new String(arrayOfChar3).intern();
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
        m = 121;
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
        m = 19;
        continue;
        m = 40;
        continue;
        m = 78;
        continue;
        m = 22;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 121;
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
      i3 = 19;
      continue;
      i3 = 40;
      continue;
      i3 = 78;
      continue;
      i3 = 22;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 121;
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
      i7 = 19;
      continue;
      i7 = 40;
      continue;
      i7 = 78;
      continue;
      i7 = 22;
    }
  }

  in(Conversation paramConversation, sz paramsz, Handler paramHandler)
  {
  }

  public void run()
  {
    boolean bool = DialogToastListActivity.f;
    sz localsz = new sz(new uz(this.d.b.a, this.d.b.b, z[2] + Long.toString(System.currentTimeMillis())));
    localsz.c = this.d.c;
    localsz.e = this.d.e;
    if (this.d.h == 0)
    {
      localsz.b(this.d.b());
      if (!bool);
    }
    else
    {
      localsz.a(this.d.c());
    }
    localsz.i = this.d.i;
    localsz.a = this.d.a;
    localsz.q = this.d.q;
    localsz.r = this.d.r;
    localsz.j = this.d.j;
    localsz.l = this.d.l;
    localsz.k = this.d.k;
    localsz.m = this.d.m;
    localsz.o = this.d.o;
    localsz.p = this.d.p;
    localsz.t = this.d.t;
    if (this.d.l == 0)
      localsz.b(localsz.b() + z[1] + this.b + ")");
    MediaData localMediaData;
    if (this.d.l == 1)
    {
      Bitmap localBitmap1 = m5.b(this.d);
      Bitmap localBitmap2 = Bitmap.createBitmap(localBitmap1.getWidth(), localBitmap1.getHeight(), localBitmap1.getConfig());
      Canvas localCanvas = new Canvas(localBitmap2);
      Paint localPaint = new Paint();
      localPaint.setAntiAlias(true);
      localPaint.setFilterBitmap(true);
      localPaint.setDither(true);
      localCanvas.drawBitmap(localBitmap1, 0.0F, 0.0F, localPaint);
      TextPaint localTextPaint = new TextPaint();
      localTextPaint.setAntiAlias(true);
      localTextPaint.setColor(-1);
      localTextPaint.setTextSize(36.0F);
      localTextPaint.setTypeface(Typeface.DEFAULT_BOLD);
      localTextPaint.setTextAlign(Paint.Align.CENTER);
      localCanvas.drawText(Integer.toString(this.b), localBitmap1.getWidth() / 2, localBitmap1.getHeight() / 2, localTextPaint);
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      localBitmap2.compress(Bitmap.CompressFormat.JPEG, 80, localByteArrayOutputStream);
      byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
      localsz.h = 1;
      localsz.a(arrayOfByte);
      if (localsz.b.b)
      {
        localMediaData = new MediaData();
        String str = j5.a(1);
        localMediaData.file = App.a(str + z[0], (byte)1);
      }
    }
    try
    {
      j5.a(((MediaData)localsz.t).file, localMediaData.file);
      App.a(this.d.b.a, localsz.c(), localMediaData, localsz.l);
      if (bool)
        App.z.a(localsz);
      if (bool)
        App.z.a(localsz);
      int i = 1 + this.b;
      this.b = i;
      if (i < 5)
        this.e.postDelayed(this, 2000L);
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      while (true)
        localFileNotFoundException.printStackTrace();
    }
    catch (IOException localIOException)
    {
      while (true)
        localIOException.printStackTrace();
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.in
 * JD-Core Version:    0.6.1
 */