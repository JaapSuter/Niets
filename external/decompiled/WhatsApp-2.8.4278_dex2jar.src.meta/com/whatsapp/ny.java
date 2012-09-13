package com.whatsapp;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

class ny
  implements SensorEventListener
{
  private static final String z;
  final PopupNotification a;

  static
  {
    char[] arrayOfChar = "\034p&s\001\002p\"o\027\005|7r\030\003qyv\003\003g?k\030\030fl".toCharArray();
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
      m = 113;
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
      m = 108;
      continue;
      m = 31;
      continue;
      m = 86;
      continue;
      m = 6;
    }
  }

  ny(PopupNotification paramPopupNotification)
  {
  }

  public void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    PopupNotification.a(this.a, paramSensorEvent.values[0]);
    g5.b(z + PopupNotification.o(this.a));
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ny
 * JD-Core Version:    0.6.1
 */