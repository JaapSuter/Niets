package com.whatsapp;

import java.io.File;
import java.util.Comparator;

class r4
  implements Comparator<File>
{
  public int a(File paramFile1, File paramFile2)
  {
    int i;
    if (paramFile1.lastModified() == paramFile2.lastModified())
      i = 0;
    while (true)
    {
      return i;
      if (paramFile1.lastModified() < paramFile2.lastModified())
        i = -1;
      else
        i = 1;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.r4
 * JD-Core Version:    0.6.1
 */