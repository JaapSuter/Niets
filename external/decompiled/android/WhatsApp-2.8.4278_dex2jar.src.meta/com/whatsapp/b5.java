package com.whatsapp;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.format.Formatter;

public class b5
{
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "\rC*(y\032T((y\034T*hy\rA75\rC*(y".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\rC*(y\032T((y\034T*ho\001B3.dGU14`\033A9$nH".toCharArray();
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
        m = 11;
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
        m = 104;
        continue;
        m = 49;
        continue;
        m = 88;
        continue;
        m = 71;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 11;
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
      i3 = 104;
      continue;
      i3 = 49;
      continue;
      i3 = 88;
      continue;
      i3 = 71;
    }
  }

  public static void a()
  {
    String str = Formatter.formatFileSize(App.Mb, App.k());
    App localApp = App.Mb;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = str;
    a(localApp.getString(2131296973, arrayOfObject));
  }

  public static void a(int paramInt)
  {
    long l = App.k();
    String str = null;
    if (l < 10485760L)
    {
      str = Formatter.formatFileSize(App.Mb, l);
      g5.b(z[1] + str);
    }
    if (str != null)
    {
      StringBuilder localStringBuilder = new StringBuilder().append(App.Mb.getString(paramInt)).append(" ");
      App localApp = App.Mb;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = str;
      a(localApp.getString(2131296978, arrayOfObject));
      if (g5.n == 0);
    }
    else
    {
      a(App.Mb.getString(paramInt));
    }
  }

  public static void a(String paramString)
  {
    int i = g5.n;
    g5.b(z[0]);
    tx localtx = tx.a(App.Mb);
    String str1 = App.Mb.getString(2131296971);
    String str2 = App.Mb.getString(2131296972);
    localtx.a(2130838517);
    localtx.a(str1);
    localtx.b(str2);
    localtx.c(paramString);
    Context localContext = App.Mb.getApplicationContext();
    localtx.a(PendingIntent.getActivity(localContext, 0, new Intent(localContext, Main.class), 268435456));
    Notification localNotification = localtx.a();
    App.gb.notify(2, localNotification);
    if (i != 0)
      App.wc = 1 + App.wc;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.b5
 * JD-Core Version:    0.6.1
 */