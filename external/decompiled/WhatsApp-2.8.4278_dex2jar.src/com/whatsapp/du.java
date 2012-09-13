package com.whatsapp;

import java.util.Comparator;

public class du
  implements Comparator<zq>
{
  public int a(zq paramzq1, zq paramzq2)
  {
    int i = 1;
    int j = 0;
    String str1 = paramzq1.b();
    String str2 = paramzq2.b();
    int k;
    if ((str1.length() > 0) && (Character.isLetter(str1.charAt(0))))
    {
      k = i;
      if ((str2.length() > 0) && (Character.isLetter(str2.charAt(0))))
        j = i;
      if (k != j)
        break label86;
      i = str1.compareToIgnoreCase(str2);
    }
    while (true)
    {
      return i;
      k = 0;
      break;
      label86: if (k != 0)
        i = -1;
    }
  }
}