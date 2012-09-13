package com.whatsapp;

import java.util.Comparator;

final class ip
  implements Comparator<String>
{
  public int a(String paramString1, String paramString2)
  {
    int i = -1;
    if (paramString1.equals(eu.c()));
    while (true)
    {
      return i;
      if (paramString2.equals(eu.c()))
      {
        i = 1;
      }
      else
      {
        sz localsz1 = App.z.j(paramString1);
        sz localsz2 = App.z.j(paramString2);
        if ((localsz1 == null) && (localsz2 == null))
          i = paramString1.compareTo(paramString2);
        else if (localsz1 == null)
          i = 1;
        else if (localsz2 != null)
          if (localsz1.i == localsz2.i)
            i = paramString1.compareTo(paramString2);
          else if (localsz1.i < localsz2.i)
            i = 1;
      }
    }
  }
}