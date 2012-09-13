package com.whatsapp;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Stack;

public class q5
{
  private static final String z;
  private HashMap<String, Bitmap> a = new bab(60);
  private w9 b = new w9(this);
  private final File c;
  private final int d;
  private final int e;
  private final int f;
  s5 g = new s5(this);

  static
  {
    char[] arrayOfChar = "nu\026".toCharArray();
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
      m = 48;
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
      m = 75;
      continue;
      m = 71;
      continue;
      m = 38;
      continue;
      m = 64;
    }
  }

  public q5(int paramInt1, int paramInt2, int paramInt3, File paramFile)
  {
    this.e = paramInt1;
    this.d = paramInt2;
    this.f = paramInt3;
    this.c = paramFile;
    this.b.setPriority(4);
  }

  static Bitmap a(q5 paramq5, t5 paramt5)
  {
    return paramq5.a(paramt5);
  }

  private Bitmap a(t5 paramt5)
  {
    int i = g5.n;
    File localFile = new File(paramt5.b);
    Object localObject = a(localFile, paramt5.c);
    if (localObject != null);
    while (true)
    {
      return localObject;
      if (localFile.exists())
        localObject = null;
      else
        try
        {
          InputStream localInputStream = new URL(paramt5.a.replace(" ", z)).openStream();
          FileOutputStream localFileOutputStream = new FileOutputStream(localFile);
          byte[] arrayOfByte = new byte[1024];
          do
          {
            int j = localInputStream.read(arrayOfByte, 0, 1024);
            if ((j == -1) && (i == 0))
              break;
            localFileOutputStream.write(arrayOfByte, 0, j);
          }
          while (i == 0);
          localFileOutputStream.close();
          Bitmap localBitmap = a(localFile, paramt5.c);
          localObject = localBitmap;
        }
        catch (Exception localException)
        {
          g5.d(localException);
          localObject = null;
        }
    }
  }

  static HashMap a(q5 paramq5)
  {
    return paramq5.a;
  }

  static int b(q5 paramq5)
  {
    return paramq5.e;
  }

  private void b(String paramString1, String paramString2, Activity paramActivity, ImageView paramImageView, u5 paramu5)
  {
    t5 localt5;
    synchronized (s5.a(this.g))
    {
      this.g.a(paramImageView);
      localt5 = new t5(this, paramString1, paramString2, paramImageView, paramu5);
    }
    synchronized (s5.a(this.g))
    {
      s5.a(this.g).add(0, localt5);
      s5.a(this.g).notifyAll();
      if (this.b.getState() == Thread.State.NEW)
        this.b.start();
      return;
      localObject1 = finally;
      throw localObject1;
    }
  }

  public Bitmap a(File paramFile, ImageView paramImageView)
  {
    Object localObject = null;
    int i = g5.n;
    try
    {
      BitmapFactory.Options localOptions = new BitmapFactory.Options();
      localOptions.inJustDecodeBounds = true;
      BitmapFactory.decodeStream(new FileInputStream(paramFile), null, localOptions);
      if ((localOptions.outWidth >= 0) && (localOptions.outHeight >= 0))
      {
        int j = localOptions.outWidth;
        int k = localOptions.outHeight;
        localOptions.inSampleSize = 1;
        do
        {
          if ((j / 2 < this.f) && (k / 2 < this.f) && (i == 0))
            break;
          j /= 2;
          k /= 2;
          localOptions.inSampleSize = (1 + localOptions.inSampleSize);
        }
        while (i == 0);
        localOptions.inJustDecodeBounds = false;
        localOptions.inInputShareable = true;
        localOptions.inPurgeable = true;
        Bitmap localBitmap = BitmapFactory.decodeStream(new FileInputStream(paramFile), null, localOptions);
        localObject = localBitmap;
      }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
    }
    return localObject;
  }

  public void a()
  {
    this.b.interrupt();
  }

  public void a(String paramString1, String paramString2, Activity paramActivity, ImageView paramImageView)
  {
    a(paramString1, paramString2, paramActivity, paramImageView, null);
  }

  public void a(String paramString1, String paramString2, Activity paramActivity, ImageView paramImageView, u5 paramu5)
  {
    int i = g5.n;
    paramImageView.setTag(paramString1);
    if (paramString2 == null)
      paramImageView.setImageResource(this.e);
    while (true)
    {
      return;
      String str = new File(this.c, paramString2).getAbsolutePath();
      if (paramString1 == null)
      {
        paramImageView.setImageDrawable(Drawable.createFromPath(str));
      }
      else if (this.a.containsKey(paramString1))
      {
        Bitmap localBitmap = (Bitmap)this.a.get(paramString1);
        if (localBitmap != null)
        {
          paramImageView.setImageBitmap(localBitmap);
          if (i == 0);
        }
        else if (this.e != 0)
        {
          paramImageView.setImageResource(this.e);
          if (i == 0);
        }
        else
        {
          paramImageView.setVisibility(8);
        }
        if (paramu5 != null)
          paramu5.a(localBitmap);
        if (i == 0);
      }
      else
      {
        b(paramString1, str, paramActivity, paramImageView, paramu5);
        paramImageView.setImageResource(this.d);
      }
    }
  }

  public void b()
  {
    int i = g5.n;
    synchronized (this.a)
    {
      this.a.clear();
      File[] arrayOfFile = this.c.listFiles();
      if (arrayOfFile != null)
      {
        int j = arrayOfFile.length;
        int k = 0;
        do
        {
          if (k >= j)
            break;
          arrayOfFile[k].delete();
          k++;
        }
        while (i == 0);
      }
      return;
    }
  }
}