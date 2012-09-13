package com.whatsapp;

import java.text.Collator;
import java.util.Comparator;

public class uu
  implements Comparator<zq>
{
  public int a(zq paramzq1, zq paramzq2)
  {
    sz localsz1 = null;
    sz localsz2;
    int i;
    if (App.z.i(paramzq1.b))
    {
      localsz2 = App.z.j(paramzq1.b);
      if (App.z.i(paramzq2.b))
        localsz1 = App.z.j(paramzq2.b);
      if ((localsz2 != null) || (localsz1 != null))
        break label101;
      Collator localCollator = Collator.getInstance();
      localCollator.setStrength(0);
      localCollator.setDecomposition(1);
      i = localCollator.compare(paramzq1.b(), paramzq2.b());
    }
    while (true)
    {
      return i;
      localsz2 = null;
      break;
      label101: if (localsz2 == null)
        i = 1;
      else if (localsz1 == null)
        i = -1;
      else if (localsz2.i == localsz1.i)
        i = paramzq1.b().compareTo(paramzq2.b());
      else if (localsz2.i < localsz1.i)
        i = 1;
      else
        i = -1;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.uu
 * JD-Core Version:    0.6.1
 */