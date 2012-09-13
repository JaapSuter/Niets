package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

public class gu
{
  private static final String[] z;
  public String a;
  public HashMap<String, hu> b = new HashMap();

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "=/}l;7:`68#3q49?0}o.w-sk?3>{x;4)(".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "=/}l;7:`68#3q4*>9?i*(){z\";-|mq".toCharArray();
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
        m = 75;
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
        m = 90;
        continue;
        m = 93;
        continue;
        m = 18;
        continue;
        m = 25;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 75;
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
      i3 = 90;
      continue;
      i3 = 93;
      continue;
      i3 = 18;
      continue;
      i3 = 25;
    }
  }

  public gu(String paramString)
  {
    this.a = paramString;
  }

  public void a(String paramString)
  {
    boolean bool = DialogToastListActivity.f;
    Iterator localIterator = eu.i(paramString).values().iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      String str = (String)localIterator.next();
      if ((!this.b.containsKey(str)) && (!str.contains(App.c())))
        this.b.put(str, new hu(str, eu.r[(this.b.size() % eu.r.length)]));
    }
    while (!bool);
  }

  public void a(String paramString, boolean paramBoolean)
  {
    if ((paramBoolean) || ((!this.b.containsKey(paramString)) && (!paramString.contains(App.c()))))
      this.b.put(paramString, new hu(paramString, eu.r[(this.b.size() % eu.r.length)]));
  }

  public void a(Vector<String> paramVector)
  {
    boolean bool = DialogToastListActivity.f;
    HashMap localHashMap = eu.i(this.a);
    Iterator localIterator1 = paramVector.iterator();
    do
    {
      if (!localIterator1.hasNext())
        break;
      String str2 = (String)localIterator1.next();
      if ((!App.c().equals(str2.substring(0, str2.lastIndexOf("@")))) && (!localHashMap.containsKey(str2)))
      {
        g5.b(z[1] + str2);
        Message localMessage2 = eu.o.obtainMessage(1, eu.b(4, null, this.a, str2, true));
        eu.o.sendMessage(localMessage2);
        a(str2, false);
      }
    }
    while (!bool);
    Iterator localIterator2 = localHashMap.values().iterator();
    do
    {
      if (!localIterator2.hasNext())
        break;
      String str1 = (String)localIterator2.next();
      if (!paramVector.contains(str1))
      {
        g5.b(z[0] + str1);
        Message localMessage1 = eu.o.obtainMessage(1, eu.b(5, null, this.a, str1, true));
        eu.o.sendMessage(localMessage1);
        b(str1, true);
      }
    }
    while (!bool);
  }

  public void b(String paramString, boolean paramBoolean)
  {
    if (this.b.containsKey(paramString))
      this.b.remove(paramString);
  }
}