package com.whatsapp;

import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public class vu
{
  private static final String[] z;
  private Resources a;
  private Method b;
  private wu c;
  private String d;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "O3\0202/[9\021\022)M\024\005\007\036M.\020".toCharArray();
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
      arrayOfChar2 = "x:\021\022+Dv\026\0059G#\026\003/\b\037 @i\030.".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\b?\020\005'\025".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label325;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\b'\021\001$\\?\020\031w".toCharArray();
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
        m = 40;
        continue;
        m = 86;
        continue;
        m = 100;
        continue;
        m = 96;
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
      i3 = 40;
      continue;
      i3 = 86;
      continue;
      i3 = 100;
      continue;
      i3 = 96;
    }
    label325: int i6 = arrayOfChar3[i5];
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
      i7 = 40;
      continue;
      i7 = 86;
      continue;
      i7 = 100;
      continue;
      i7 = 96;
    }
    label417: int i10 = arrayOfChar4[i9];
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
      i11 = 40;
      continue;
      i11 = 86;
      continue;
      i11 = 100;
      continue;
      i11 = 96;
    }
  }

  public vu(Resources paramResources)
  {
    this.a = paramResources;
    if (Build.VERSION.SDK_INT >= 11);
    while (true)
    {
      return;
      try
      {
        Class localClass = paramResources.getAssets().getClass();
        String str = z[0];
        Class[] arrayOfClass = new Class[2];
        arrayOfClass[0] = Integer.TYPE;
        arrayOfClass[1] = Integer.TYPE;
        this.b = localClass.getDeclaredMethod(str, arrayOfClass);
        this.b.setAccessible(true);
      }
      catch (SecurityException localSecurityException)
      {
        g5.d(localSecurityException);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        g5.d(localNoSuchMethodException);
      }
    }
  }

  public String a(int paramInt1, int paramInt2)
    throws Resources.NotFoundException
  {
    String str;
    if (Build.VERSION.SDK_INT >= 11)
      str = this.a.getQuantityString(paramInt1, paramInt2);
    while (true)
    {
      return str;
      if (this.b == null)
      {
        str = this.a.getQuantityString(paramInt1, paramInt2);
      }
      else
      {
        Locale localLocale = this.a.getConfiguration().locale;
        if (!localLocale.getLanguage().equals(this.d))
        {
          this.d = localLocale.getLanguage();
          this.c = wu.a(localLocale);
        }
        if (this.c == null)
        {
          str = this.a.getQuantityString(paramInt1, paramInt2);
        }
        else
        {
          Object localObject1 = null;
          if (0 == 0);
          try
          {
            Method localMethod2 = this.b;
            AssetManager localAssetManager2 = this.a.getAssets();
            Object[] arrayOfObject2 = new Object[2];
            arrayOfObject2[0] = Integer.valueOf(paramInt1);
            arrayOfObject2[1] = Integer.valueOf(wu.b(this.c.a(paramInt2)));
            localObject1 = localMethod2.invoke(localAssetManager2, arrayOfObject2);
            if (localObject1 == null)
            {
              Method localMethod1 = this.b;
              AssetManager localAssetManager1 = this.a.getAssets();
              Object[] arrayOfObject1 = new Object[2];
              arrayOfObject1[0] = Integer.valueOf(paramInt1);
              arrayOfObject1[1] = Integer.valueOf(16777220);
              Object localObject2 = localMethod1.invoke(localAssetManager1, arrayOfObject1);
              localObject1 = localObject2;
            }
            if (localObject1 == null)
              throw new Resources.NotFoundException(z[1] + Integer.toHexString(paramInt1) + z[3] + paramInt2 + z[2] + wu.c(this.c.a(paramInt2)));
          }
          catch (IllegalArgumentException localIllegalArgumentException)
          {
            throw new Resources.NotFoundException(localIllegalArgumentException.getMessage());
          }
          catch (IllegalAccessException localIllegalAccessException)
          {
            throw new Resources.NotFoundException(localIllegalAccessException.getMessage());
          }
          catch (InvocationTargetException localInvocationTargetException)
          {
            throw new Resources.NotFoundException(localInvocationTargetException.getMessage());
          }
          str = localObject1.toString();
        }
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.vu
 * JD-Core Version:    0.6.1
 */