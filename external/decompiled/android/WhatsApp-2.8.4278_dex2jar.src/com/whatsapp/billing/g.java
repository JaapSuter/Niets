package com.whatsapp.billing;

import android.os.Bundle;
import android.os.RemoteException;
import com.b;

class g extends f
{
  private static final String[] z;
  final String[] d;
  final BillingService e;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "4{&,x%y\006%e>r!)p#}'$b".toCharArray();
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
      arrayOfChar2 = "\005Q\031\037T\004@\027\003U".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\031[\034\003W\016K\001\016B".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label325;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\024[\006\fX\005Y\027\004^\003]\016\003R\026@\001\005_\004".toCharArray();
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
        m = 17;
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
        m = 87;
        continue;
        m = 20;
        continue;
        m = 72;
        continue;
        m = 74;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 17;
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
      i3 = 87;
      continue;
      i3 = 20;
      continue;
      i3 = 72;
      continue;
      i3 = 74;
    }
    label325: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 17;
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
      i7 = 87;
      continue;
      i7 = 20;
      continue;
      i7 = 72;
      continue;
      i7 = 74;
    }
    label417: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 17;
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
      i11 = 87;
      continue;
      i11 = 20;
      continue;
      i11 = 72;
      continue;
      i11 = 74;
    }
  }

  public g(BillingService paramBillingService, int paramInt, String[] paramArrayOfString)
  {
    super(paramBillingService, paramInt);
    this.d = paramArrayOfString;
  }

  protected long d()
    throws RemoteException
  {
    Bundle localBundle1 = a(z[3]);
    localBundle1.putStringArray(z[2], this.d);
    Bundle localBundle2 = BillingService.d().a(localBundle1);
    a(z[0], localBundle2);
    return localBundle2.getLong(z[1], i.a);
  }
}