package com.whatsapp.billing;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedList;

abstract class f
{
  private static final String[] z;
  private final int a;
  protected long b;
  final BillingService c;

  static
  {
    String[] arrayOfString = new String[6];
    char[] arrayOfChar1 = "K@6e\005WV j\tVA ".toCharArray();
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
    char[] arrayOfChar6;
    int i17;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "k`\bZ>|%\007\\&ul\013Rjj`\027C#z`EV8xv\rP.".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "[l\tY#wb6P8ol\006P".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label400;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "XU,j\034\\W6|\005W".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label488;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "ID&~\013^@:{\013T@".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label576;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "[L)y\003WB:g\017HP f\036".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label664;
        arrayOfString[5] = new String(arrayOfChar6).intern();
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
        m = 74;
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
        m = 25;
        continue;
        m = 5;
        continue;
        m = 101;
        continue;
        m = 53;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 74;
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
      i3 = 25;
      continue;
      i3 = 5;
      continue;
      i3 = 101;
      continue;
      i3 = 53;
    }
    label400: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 74;
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
      i7 = 25;
      continue;
      i7 = 5;
      continue;
      i7 = 101;
      continue;
      i7 = 53;
    }
    label488: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 74;
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
      i11 = 25;
      continue;
      i11 = 5;
      continue;
      i11 = 101;
      continue;
      i11 = 53;
    }
    label576: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 74;
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
      i15 = 25;
      continue;
      i15 = 5;
      continue;
      i15 = 101;
      continue;
      i15 = 53;
    }
    label664: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 74;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i17] = (char)(i19 ^ i18);
      i17++;
      break;
      i19 = 25;
      continue;
      i19 = 5;
      continue;
      i19 = 101;
      continue;
      i19 = 53;
    }
  }

  public f(BillingService paramBillingService, int paramInt)
  {
    this.a = paramInt;
  }

  public int a()
  {
    return this.a;
  }

  protected Bundle a(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString(z[5], paramString);
    localBundle.putInt(z[3], 1);
    localBundle.putString(z[4], this.c.getPackageName());
    return localBundle;
  }

  protected void a(RemoteException paramRemoteException)
  {
    Log.w(z[2], z[1]);
    BillingService.a(null);
  }

  protected void a(c paramc)
  {
  }

  protected void a(String paramString, Bundle paramBundle)
  {
    c.a(paramBundle.getInt(z[0]));
  }

  public boolean b()
  {
    boolean bool = true;
    if (c());
    while (true)
    {
      return bool;
      if (BillingService.a(this.c))
        BillingService.c().add(this);
      else
        bool = false;
    }
  }

  public boolean c()
  {
    if (BillingService.d() != null);
    while (true)
    {
      try
      {
        this.b = d();
        if (this.b >= 0L)
          BillingService.e().put(Long.valueOf(this.b), this);
        bool = true;
        return bool;
      }
      catch (RemoteException localRemoteException)
      {
        a(localRemoteException);
      }
      boolean bool = false;
    }
  }

  protected abstract long d()
    throws RemoteException;
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.billing.f
 * JD-Core Version:    0.6.1
 */