package com.whatsapp;

import java.text.Collator;
import java.util.Comparator;

public class ej
  implements Comparator<zq>
{
  public int a(zq paramzq1, zq paramzq2)
  {
    int i = 0;
    if ((paramzq1 == null) && (paramzq2 == null));
    while (true)
    {
      return i;
      if ((paramzq1 == null) || (paramzq1.b() == null))
      {
        i = 1;
      }
      else if ((paramzq2 == null) || (paramzq2.b() == null))
      {
        i = -1;
      }
      else
      {
        Collator localCollator = Collator.getInstance();
        localCollator.setStrength(0);
        localCollator.setDecomposition(1);
        int j = localCollator.compare(paramzq1.b(), paramzq2.b());
        if (j == 0)
        {
          if ((paramzq1.b != null) || (paramzq2.b != null))
            if (paramzq1.b == null)
              i = 1;
            else if (paramzq2.b == null)
              i = -1;
            else
              i = paramzq1.b.compareTo(paramzq2.b);
        }
        else
          i = j;
      }
    }
  }
}