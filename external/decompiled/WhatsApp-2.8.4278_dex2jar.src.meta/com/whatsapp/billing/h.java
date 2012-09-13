package com.whatsapp.billing;

import android.os.Bundle;
import android.os.RemoteException;
import com.b;

class h extends f
{
  private static final String[] z;
  long d;
  final String[] e;
  final BillingService f;

  static
  {
    String[] arrayOfString = new String[5];
    char[] arrayOfChar1 = "\021\007\f\016\032\020\026\002\022\033".toCharArray();
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
      arrayOfChar2 = "$')\013*1!5:,&\0133=01/</6,,".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\004\007\t\004\017\026\020\036\023\036\020\007\002\022\021\005\r\017\026\036\027\013\022\025".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label365;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\r\r\t\022\031\032\035\024\037\f".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label457;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\r\r\023\030\032".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label549;
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
        m = 95;
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
        m = 67;
        continue;
        m = 66;
        continue;
        m = 93;
        continue;
        m = 91;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 95;
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
      i3 = 67;
      continue;
      i3 = 66;
      continue;
      i3 = 93;
      continue;
      i3 = 91;
    }
    label365: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 95;
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
      i7 = 67;
      continue;
      i7 = 66;
      continue;
      i7 = 93;
      continue;
      i7 = 91;
    }
    label457: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 95;
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
      i11 = 67;
      continue;
      i11 = 66;
      continue;
      i11 = 93;
      continue;
      i11 = 91;
    }
    label549: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 95;
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
      i15 = 67;
      continue;
      i15 = 66;
      continue;
      i15 = 93;
      continue;
      i15 = 91;
    }
  }

  public h(BillingService paramBillingService, int paramInt, String[] paramArrayOfString)
  {
    super(paramBillingService, paramInt);
    this.e = paramArrayOfString;
  }

  protected void a(RemoteException paramRemoteException)
  {
    super.a(paramRemoteException);
    o.a(this.d);
  }

  protected long d()
    throws RemoteException
  {
    this.d = o.a();
    Bundle localBundle1 = a(z[2]);
    localBundle1.putLong(z[4], this.d);
    localBundle1.putStringArray(z[3], this.e);
    Bundle localBundle2 = BillingService.d().a(localBundle1);
    a(z[1], localBundle2);
    return localBundle2.getLong(z[0], i.a);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.billing.h
 * JD-Core Version:    0.6.1
 */