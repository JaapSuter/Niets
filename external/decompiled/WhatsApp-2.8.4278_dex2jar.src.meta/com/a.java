package com;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public abstract class a extends Binder
  implements b
{
  public static boolean a;
  private static final String z;

  static
  {
    char[] arrayOfChar = "P\002\036x:".toCharArray();
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
      m = 88;
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
      m = 51;
      continue;
      m = 109;
      continue;
      m = 115;
      continue;
      m = 86;
    }
  }

  public static b a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null)
      localObject = null;
    while (true)
    {
      return localObject;
      IInterface localIInterface = paramIBinder.queryLocalInterface(z);
      if ((localIInterface != null) && ((localIInterface instanceof b)))
        localObject = (b)localIInterface;
      else
        localObject = new c(paramIBinder);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.a
 * JD-Core Version:    0.6.1
 */