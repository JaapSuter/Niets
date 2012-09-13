package com.whatsapp;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.os.AsyncTask;
import android.widget.Toast;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

class gc extends AsyncTask<Void, Integer, Boolean>
{
  private static final String z;
  private ProgressDialog a;
  private w7 b;
  final WebImagePicker c;

  static
  {
    char[] arrayOfChar = "my\002".toCharArray();
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
      m = 42;
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
      m = 72;
      continue;
      m = 75;
      continue;
      m = 50;
      continue;
      m = 63;
    }
  }

  gc(WebImagePicker paramWebImagePicker, w7 paramw7)
  {
    this.b = paramw7;
  }

  static ProgressDialog a(gc paramgc)
  {
    return paramgc.a;
  }

  static ProgressDialog a(gc paramgc, ProgressDialog paramProgressDialog)
  {
    paramgc.a = paramProgressDialog;
    return paramProgressDialog;
  }

  protected Boolean a(Void[] paramArrayOfVoid)
  {
    boolean bool1 = true;
    boolean bool2 = DialogToastListActivity.f;
    try
    {
      InputStream localInputStream = new URL(this.b.b.replace(" ", z)).openStream();
      OutputStream localOutputStream = App.ib.openOutputStream(WebImagePicker.a(this.c));
      byte[] arrayOfByte = new byte[1024];
      i = 0;
      j = 0;
      if (!isCancelled())
      {
        int k = localInputStream.read(arrayOfByte, 0, 1024);
        if ((k != -1) || (bool2))
        {
          localOutputStream.write(arrayOfByte, 0, k);
          m = k + j;
          if (this.b.c == 0)
            break label231;
          n = m * 100 / this.b.c;
          label134: if (n == i)
            break label224;
          Integer[] arrayOfInteger = new Integer[1];
          arrayOfInteger[0] = Integer.valueOf(n);
          publishProgress(arrayOfInteger);
          break label237;
        }
      }
      localOutputStream.close();
      if (!isCancelled())
      {
        localBoolean = Boolean.valueOf(bool1);
        return localBoolean;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        int i;
        int j;
        int m;
        int n;
        if (!isCancelled())
          g5.d(localException);
        Boolean localBoolean = Boolean.FALSE;
        continue;
        bool1 = false;
        continue;
        label224: label231: label237: 
        do
        {
          i = n;
          j = m;
          break;
          n = i;
          continue;
          n = 0;
          break label134;
        }
        while (!bool2);
      }
    }
  }

  protected void a(Boolean paramBoolean)
  {
    if (this.a != null)
      this.a.dismiss();
    this.a = null;
    if (WebImagePicker.e(this.c) == this)
      WebImagePicker.a(this.c, null);
    if (paramBoolean.booleanValue())
    {
      this.c.setResult(-1);
      this.c.finish();
      if (!DialogToastListActivity.f);
    }
    else if (!isCancelled())
    {
      Toast.makeText(this.c.getApplicationContext(), this.c.getString(2131296988), 1).show();
    }
  }

  protected void a(Integer[] paramArrayOfInteger)
  {
    if (this.a != null)
      this.a.setProgress(paramArrayOfInteger[0].intValue());
  }

  protected void onPreExecute()
  {
    this.a = new ProgressDialog(this.c);
    this.a.setProgressStyle(1);
    this.a.setMessage(this.c.getString(2131296648));
    this.a.setCancelable(true);
    this.a.setOnCancelListener(new c8(this));
    this.a.show();
  }
}