package com.whatsapp;

import android.content.Context;
import android.text.format.DateUtils;
import android.text.format.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class t4
{
  private static final String z;

  static
  {
    char[] arrayOfChar = "\032\031~\bI.\004c".toCharArray();
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
      m = 4;
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
      m = 99;
      continue;
      m = 96;
      continue;
      m = 7;
      continue;
      m = 113;
    }
  }

  public static int a(long paramLong1, long paramLong2)
  {
    Time localTime = new Time();
    localTime.set(paramLong1);
    int i = (int)((paramLong1 + 1000L * localTime.gmtoff) / 86400000L);
    localTime.set(paramLong2);
    return i - (int)((paramLong2 + 1000L * localTime.gmtoff) / 86400000L);
  }

  public static String a()
  {
    Date localDate = new Date();
    return new SimpleDateFormat(z).format(localDate);
  }

  public static String a(long paramLong)
  {
    long l1 = paramLong / 3600000L;
    long l2 = (paramLong - 3600000L * l1) / 60000L;
    String str5;
    if (l1 == 0L)
    {
      if (l2 == 0L)
        l2 = 1L;
      String str7 = App.Z.a(2131427329, (int)l2);
      Object[] arrayOfObject5 = new Object[1];
      arrayOfObject5[0] = Integer.valueOf((int)l2);
      str5 = String.format(str7, arrayOfObject5);
    }
    while (true)
    {
      return str5;
      if (l2 == 0L)
      {
        String str6 = App.Z.a(2131427328, (int)l1);
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = Integer.valueOf((int)l1);
        str5 = String.format(str6, arrayOfObject4);
      }
      else
      {
        String str1 = App.Z.a(2131427329, (int)l2);
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf((int)l2);
        String str2 = String.format(str1, arrayOfObject1);
        String str3 = App.Z.a(2131427328, (int)l1);
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf((int)l1);
        String str4 = String.format(str3, arrayOfObject2);
        App localApp = App.Mb;
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = str4;
        arrayOfObject3[1] = str2;
        str5 = localApp.getString(2131296401, arrayOfObject3);
      }
    }
  }

  public static String a(Context paramContext, long paramLong)
  {
    int i = a(System.currentTimeMillis(), paramLong);
    int j = 524289;
    if (i > 0)
      if (i < 7)
      {
        j = 524291;
        if (g5.n == 0);
      }
      else
      {
        j |= 16;
      }
    return DateUtils.formatDateTime(paramContext, paramLong, j);
  }

  public static String b(Context paramContext, long paramLong)
  {
    return DateUtils.formatDateTime(paramContext, paramLong, 524289);
  }

  public static boolean b(long paramLong)
  {
    if (a(System.currentTimeMillis(), paramLong) == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean b(long paramLong1, long paramLong2)
  {
    int i = 1;
    GregorianCalendar localGregorianCalendar1 = new GregorianCalendar();
    localGregorianCalendar1.setTimeInMillis(paramLong1);
    GregorianCalendar localGregorianCalendar2 = new GregorianCalendar();
    localGregorianCalendar2.setTimeInMillis(paramLong2);
    if ((localGregorianCalendar1.get(i) == localGregorianCalendar2.get(i)) && (localGregorianCalendar1.get(2) == localGregorianCalendar2.get(2)) && (localGregorianCalendar1.get(5) == localGregorianCalendar2.get(5)));
    while (true)
    {
      return i;
      int j = 0;
    }
  }

  public static String c(Context paramContext, long paramLong)
  {
    return DateUtils.formatDateTime(paramContext, paramLong, 524305);
  }

  public static String d(Context paramContext, long paramLong)
  {
    int i = a(System.currentTimeMillis(), paramLong);
    String str2;
    String str1;
    if (i <= 1)
    {
      str2 = g(paramContext, paramLong);
      if (i == 0)
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = str2;
        str1 = paramContext.getString(2131296489, arrayOfObject2);
      }
    }
    while (true)
    {
      return str1;
      if (i == 1)
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = str2;
        str1 = paramContext.getString(2131296491, arrayOfObject1);
      }
      else
      {
        str1 = i(paramContext, paramLong);
      }
    }
  }

  public static String e(Context paramContext, long paramLong)
  {
    int i = a(System.currentTimeMillis(), paramLong);
    String str;
    if (i == 0)
      str = g(paramContext, paramLong);
    while (true)
    {
      return str;
      if (i == 1)
        str = paramContext.getString(2131296492);
      else
        str = h(paramContext, paramLong);
    }
  }

  public static String f(Context paramContext, long paramLong)
  {
    return h(paramContext, paramLong);
  }

  public static String g(Context paramContext, long paramLong)
  {
    return DateUtils.formatDateTime(paramContext, paramLong, 9);
  }

  public static String h(Context paramContext, long paramLong)
  {
    return DateUtils.formatDateTime(paramContext, paramLong, 131092);
  }

  public static String i(Context paramContext, long paramLong)
  {
    return DateUtils.formatDateTime(paramContext, paramLong, 131093);
  }

  public static String j(Context paramContext, long paramLong)
  {
    return DateUtils.formatDateTime(paramContext, paramLong, 20);
  }
}