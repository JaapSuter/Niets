package com;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.whatsapp.App;

class c
  implements b
{
  private static final String z;
  private IBinder a;

  static
  {
    char[] arrayOfChar = "\020~5X\020".toCharArray();
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
      m = 114;
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
      m = 115;
      continue;
      m = 17;
      continue;
      m = 88;
      continue;
      m = 118;
    }
  }

  c(IBinder paramIBinder)
  {
    this.a = paramIBinder;
    if (App.wc != 0)
      if (!bool1)
        break label30;
    label30: for (boolean bool2 = false; ; bool2 = true)
    {
      a.a = bool2;
      return;
    }
  }

  public Bundle a(Bundle paramBundle)
    throws RemoteException
  {
    boolean bool = a.a;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken(z);
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
        if (bool)
          App.wc = 1 + App.wc;
      }
      else
      {
        localParcel1.writeInt(0);
      }
      this.a.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      Bundle localBundle;
      if (localParcel2.readInt() != 0)
      {
        localBundle = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
        if (!bool);
      }
      else
      {
        localBundle = null;
      }
      return localBundle;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public IBinder asBinder()
  {
    return this.a;
  }
}