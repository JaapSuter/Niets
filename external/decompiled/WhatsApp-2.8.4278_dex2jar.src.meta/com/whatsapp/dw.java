package com.whatsapp;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.Handler;

class dw
  implements LocationListener
{
  private static final String[] z;
  final LocationPickerPopup a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "\034\020\n".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\025\005\r-r\t\013".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
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
        m = 29;
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
        m = 123;
        continue;
        m = 96;
        continue;
        m = 121;
        continue;
        m = 90;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 29;
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
      i3 = 123;
      continue;
      i3 = 96;
      continue;
      i3 = 121;
      continue;
      i3 = 90;
    }
  }

  dw(LocationPickerPopup paramLocationPickerPopup)
  {
  }

  public void onLocationChanged(Location paramLocation)
  {
    boolean bool = DialogToastListActivity.f;
    if (LocationPickerPopup.b(this.a) == null)
      if (paramLocation.getAccuracy() < 200.0F)
      {
        LocationPickerPopup.d(this.a).removeCallbacks(LocationPickerPopup.c(this.a));
        LocationPickerPopup.a(this.a, paramLocation);
        if (!bool);
      }
      else if (LocationPickerPopup.a(this.a) == null)
      {
        LocationPickerPopup.b(this.a, paramLocation);
        if (!bool);
      }
      else if (z[1].equals(LocationPickerPopup.a(this.a).getProvider()))
      {
        LocationPickerPopup.b(this.a, paramLocation);
        if (!bool);
      }
      else if ((z[0].equals(LocationPickerPopup.a(this.a).getProvider())) && (z[0].equals(paramLocation.getProvider())))
      {
        LocationPickerPopup.b(this.a, paramLocation);
      }
  }

  public void onProviderDisabled(String paramString)
  {
  }

  public void onProviderEnabled(String paramString)
  {
  }

  public void onStatusChanged(String paramString, int paramInt, Bundle paramBundle)
  {
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.dw
 * JD-Core Version:    0.6.1
 */