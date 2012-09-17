package com.whatsapp;

import android.text.format.DateUtils;
import java.util.Calendar;
import java.util.GregorianCalendar;

class aab extends GregorianCalendar
{
  private int a;
  final MediaGallery b;

  public aab(MediaGallery paramMediaGallery, int paramInt, Calendar paramCalendar)
  {
    this.a = paramInt;
    setTime(paramCalendar.getTime());
  }

  public String toString()
  {
    String str;
    switch (this.a)
    {
    default:
      str = Integer.toString(get(1));
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return str;
      str = this.b.getString(2131296791);
      continue;
      str = this.b.getString(2131296790);
      continue;
      str = this.b.getString(2131296789);
      continue;
      str = DateUtils.getMonthString(get(2), 10);
    }
  }
}