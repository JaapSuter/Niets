package com.whatsapp;

import android.hardware.Sensor;
import android.hardware.SensorManager;

class my
  implements Runnable
{
  private static final String[] z;
  final PopupNotification a;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "rc|2\003lcx.\025kom3\032mb#7\001mte*\032vu6".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\"am?I".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "rc|2\003lcx.\025kom3\032mb#)\034\"|~(\013kae3\n\"i)��m~".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label288;
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
        m = 115;
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
        m = 2;
        continue;
        m = 12;
        continue;
        m = 12;
        continue;
        m = 71;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 115;
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
      i3 = 2;
      continue;
      i3 = 12;
      continue;
      i3 = 12;
      continue;
      i3 = 71;
    }
    label288: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 115;
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
      i7 = 2;
      continue;
      i7 = 12;
      continue;
      i7 = 12;
      continue;
      i7 = 71;
    }
  }

  my(PopupNotification paramPopupNotification)
  {
  }

  public void run()
  {
    if (PopupNotification.l(this.a) != null)
      PopupNotification.m(this.a).unregisterListener(PopupNotification.l(this.a));
    PopupNotification.a(this.a, null);
    if (PopupNotification.n(this.a) != null)
    {
      g5.b(z[0] + PopupNotification.o(this.a) + z[1] + PopupNotification.n(this.a).getMaximumRange());
      if ((PopupNotification.o(this.a) >= 5.0F) || (PopupNotification.o(this.a) == PopupNotification.n(this.a).getMaximumRange()))
      {
        PopupNotification.p(this.a);
        if (!DialogToastListActivity.f);
      }
    }
    else
    {
      g5.b(z[2]);
      PopupNotification.p(this.a);
    }
  }
}