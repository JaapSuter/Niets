package com.whatsapp;

import android.text.TextUtils;

public class lp
{
  public final String a;
  public final String b;
  public final int c;
  public final int[] d;
  public final int[] e;
  public final String[] f;

  private lp(String[] paramArrayOfString)
    throws NumberFormatException, IllegalArgumentException
  {
    if (paramArrayOfString.length < 7)
      throw new IllegalArgumentException();
    String str1 = paramArrayOfString[0];
    String str2 = paramArrayOfString[1];
    String str3 = paramArrayOfString[2];
    String str4 = paramArrayOfString[3];
    String str5 = paramArrayOfString[4];
    String str6 = paramArrayOfString[5];
    if ((str2 == null) || (str3 == null))
      throw new IllegalArgumentException();
    this.a = str2;
    this.b = str1;
    this.c = Integer.parseInt(str3);
    int[] arrayOfInt1;
    if ((str4 != null) && (str4.trim().length() > 0))
    {
      arrayOfInt1 = jp.g(str4);
      this.d = arrayOfInt1;
      if ((str5 == null) || (str5.trim().length() <= 0))
        break label182;
    }
    label182: for (int[] arrayOfInt2 = jp.g(str5); ; arrayOfInt2 = null)
    {
      this.e = arrayOfInt2;
      if ((str6 != null) && (str6.trim().length() > 0))
        arrayOfString = TextUtils.split(str6, ",");
      this.f = arrayOfString;
      return;
      arrayOfInt1 = null;
      break;
    }
  }

  lp(String[] paramArrayOfString, kp paramkp)
    throws NumberFormatException, IllegalArgumentException
  {
    this(paramArrayOfString);
  }

  public int a()
  {
    boolean bool = DialogToastListActivity.f;
    int i;
    if ((this.e == null) || (this.e.length == 0))
      i = 14;
    while (true)
    {
      return i;
      i = this.e[0];
      int j = 1;
      if (j < this.e.length)
      {
        if (this.e[j] > i)
          i = this.e[j];
        j++;
        if (!bool)
          break;
      }
    }
  }

  public int a(int paramInt)
  {
    int i = 0;
    boolean bool = DialogToastListActivity.f;
    if (paramInt < b())
      i = -1;
    while (true)
    {
      return i;
      if (paramInt > a())
      {
        i = 1;
      }
      else if ((this.e != null) && (this.e.length != 0))
      {
        int j = 0;
        do
        {
          if (j >= this.e.length)
            break label78;
          if (this.e[j] == paramInt)
            break;
          j++;
        }
        while (!bool);
        label78: i = 1;
      }
    }
  }

  public String a(String paramString)
  {
    boolean bool = DialogToastListActivity.f;
    int i = 0;
    if ((i >= paramString.length()) || (this.f == null));
    while (true)
    {
      return paramString;
      int j = 0;
      int k = 0;
      do
      {
        if ((j >= this.f.length) || (k != 0))
          break;
        if (this.f[j].charAt(0) == paramString.charAt(i))
          k = 1;
        j++;
      }
      while (!bool);
      if (k == 0)
      {
        paramString = paramString.substring(i);
      }
      else
      {
        i++;
        if (!bool)
          break;
      }
    }
  }

  public int b()
  {
    boolean bool = DialogToastListActivity.f;
    int i;
    if ((this.e == null) || (this.e.length == 0))
      i = 5;
    while (true)
    {
      return i;
      i = this.e[0];
      int j = 1;
      if (j < this.e.length)
      {
        if (this.e[j] < i)
          i = this.e[j];
        j++;
        if (!bool)
          break;
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.lp
 * JD-Core Version:    0.6.1
 */