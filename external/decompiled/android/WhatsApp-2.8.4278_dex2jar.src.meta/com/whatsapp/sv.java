package com.whatsapp;

import android.location.Location;
import android.location.LocationManager;

class sv
  implements Runnable
{
  private static final String[] z;
  final LocationPicker a;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "<.5".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "5;2\rb)5".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "71%\033y21(".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label289;
        arrayOfString[2] = new String(arrayOfChar3).intern();
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
        m = 13;
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
        m = 91;
        continue;
        m = 94;
        continue;
        m = 70;
        continue;
        m = 122;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 13;
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
      i3 = 91;
      continue;
      i3 = 94;
      continue;
      i3 = 70;
      continue;
      i3 = 122;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 13;
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
      i7 = 91;
      continue;
      i7 = 94;
      continue;
      i7 = 70;
      continue;
      i7 = 122;
    }
  }

  sv(LocationPicker paramLocationPicker)
  {
  }

  public void run()
  {
    LocationPicker.b(this.a, true);
    if ((LocationPicker.f(this.a) != null) && (LocationPicker.a(this.a) == null))
    {
      int i = Math.max((int)LocationPicker.f(this.a).getAccuracy(), 100);
      LocationPicker.a(this.a, LocationPicker.f(this.a), i, null, true);
    }
    if ((LocationPicker.f(this.a) == null) || (LocationPicker.f(this.a).getAccuracy() > 200.0F))
    {
      LocationManager localLocationManager = (LocationManager)this.a.getSystemService(z[2]);
      if ((!localLocationManager.isProviderEnabled(z[0])) || (!localLocationManager.isProviderEnabled(z[1])))
        this.a.showDialog(2);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.sv
 * JD-Core Version:    0.6.1
 */