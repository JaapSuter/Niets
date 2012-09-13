package com.whatsapp;

import android.os.AsyncTask;
import android.os.Environment;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

class vb extends AsyncTask<Void, Void, Boolean>
{
  private static final String[] z;
  final Settings a;

  static
  {
    String[] arrayOfString = new String[5];
    char[] arrayOfChar1 = "Eb1M\"Wg0".toCharArray();
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
      arrayOfChar2 = "Wl%C%".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "Tf&R>Id!\t5F`9S'\bn!A$Sl CxBq I%\007".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label364;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "Jl'H#Bg".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label452;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "Jl'H#Bg\rT8".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label540;
        arrayOfString[4] = new String(arrayOfChar5).intern();
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
        m = 87;
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
        m = 3;
        continue;
        m = 82;
        continue;
        m = 38;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 87;
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
      i3 = 3;
      continue;
      i3 = 82;
      continue;
      i3 = 38;
    }
    label364: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 87;
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
      i7 = 3;
      continue;
      i7 = 82;
      continue;
      i7 = 38;
    }
    label452: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 87;
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
      i11 = 3;
      continue;
      i11 = 82;
      continue;
      i11 = 38;
    }
    label540: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 87;
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
      i15 = 3;
      continue;
      i15 = 82;
      continue;
      i15 = 38;
    }
  }

  private vb(Settings paramSettings)
  {
  }

  vb(Settings paramSettings, q2 paramq2)
  {
    this(paramSettings);
  }

  protected Boolean a(Void[] paramArrayOfVoid)
  {
    Boolean localBoolean1 = Boolean.valueOf(false);
    PowerManager.WakeLock localWakeLock = ((PowerManager)this.a.getSystemService(z[1])).newWakeLock(1, z[0]);
    while (true)
    {
      try
      {
        localWakeLock.acquire();
        Boolean localBoolean3 = Boolean.valueOf(App.z.a(false));
        localBoolean2 = localBoolean3;
        return localBoolean2;
      }
      catch (Exception localException)
      {
        g5.d(z[2] + localException.toString());
        if (localWakeLock.isHeld())
        {
          localWakeLock.release();
          localBoolean2 = localBoolean1;
          continue;
        }
      }
      finally
      {
        if (localWakeLock.isHeld())
          localWakeLock.release();
      }
      Boolean localBoolean2 = localBoolean1;
    }
  }

  protected void a(Boolean paramBoolean)
  {
    boolean bool = DialogToastListActivity.f;
    this.a.removeDialog(8);
    Conversation.i();
    if (paramBoolean.booleanValue())
    {
      Settings.b(this.a);
      if (!bool);
    }
    else
    {
      String str = Environment.getExternalStorageState();
      int i;
      if (str.equals(z[4]))
      {
        i = 2131296933;
        if (!bool);
      }
      else if (str.equals(z[3]))
      {
        i = 2131296934;
        if (!bool);
      }
      else
      {
        i = 2131296932;
      }
      this.a.a(i);
    }
  }

  protected void onPreExecute()
  {
    this.a.showDialog(8);
  }
}