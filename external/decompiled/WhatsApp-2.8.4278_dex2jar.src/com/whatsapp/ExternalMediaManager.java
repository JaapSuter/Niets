package com.whatsapp;

import android.app.Service;
import android.content.Intent;
import android.os.Environment;
import android.os.IBinder;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashSet;
import java.util.Iterator;

public class ExternalMediaManager extends Service
{
  public static HashSet<FileChannel> a;
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[5];
    char[] arrayOfChar1 = "BrZdnIkB^qBnG`3UoOe1HdBx".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    char[] arrayOfChar4;
    int i9;
    char[] arrayOfChar5;
    int i13;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "BrZdnIkB^qBnG`3F|OhpFhBd".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "Je[ohBnqss".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label372;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "Je[ohBn".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label460;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "BrZdnIkB^qBnG`3RdOw}NfOcpB*".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label548;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        z = arrayOfString;
        a = new HashSet();
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 28;
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
        m = 39;
        continue;
        m = 10;
        continue;
        m = 46;
        continue;
        m = 1;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 28;
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
      i3 = 39;
      continue;
      i3 = 10;
      continue;
      i3 = 46;
      continue;
      i3 = 1;
    }
    label372: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 28;
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
      i7 = 39;
      continue;
      i7 = 10;
      continue;
      i7 = 46;
      continue;
      i7 = 1;
    }
    label460: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 28;
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
      i11 = 39;
      continue;
      i11 = 10;
      continue;
      i11 = 46;
      continue;
      i11 = 1;
    }
    label548: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 28;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i13] = (char)(i15 ^ i14);
      i13++;
      break;
      i15 = 39;
      continue;
      i15 = 10;
      continue;
      i15 = 46;
      continue;
      i15 = 1;
    }
  }

  private static void a()
  {
    try
    {
      boolean bool = DialogToastListActivity.f;
      Iterator localIterator = a.iterator();
      while (true)
      {
        FileChannel localFileChannel;
        if (localIterator.hasNext())
          localFileChannel = (FileChannel)localIterator.next();
        try
        {
          localFileChannel.force(true);
        }
        catch (IOException localIOException1)
        {
          try
          {
            while (true)
            {
              localFileChannel.close();
              label42: if (!bool)
                break;
              a.clear();
              return;
              localIOException1 = localIOException1;
            }
          }
          catch (IOException localIOException2)
          {
            break label42;
          }
        }
      }
    }
    finally
    {
    }
  }

  private void b()
  {
    try
    {
      if (!App.lb)
      {
        App.lb = true;
        App.mb = true;
        g5.b(z[4] + Environment.getExternalStorageState());
        a();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void c()
  {
    try
    {
      if ((App.lb) || (App.mb))
      {
        App.lb = false;
        App.mb = false;
        g5.b(z[1]);
        App.l(this);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void d()
  {
    try
    {
      if ((App.lb) || (!App.mb))
      {
        App.lb = false;
        App.mb = true;
        g5.b(z[0]);
        App.l(this);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    boolean bool = DialogToastListActivity.f;
    String str = Environment.getExternalStorageState();
    if (str.equals(z[3]))
    {
      fq.c();
      c();
      j5.a();
      if (!bool);
    }
    else if (str.equals(z[2]))
    {
      d();
      j5.a();
      if (!bool);
    }
    else
    {
      b();
    }
    return 2;
  }
}