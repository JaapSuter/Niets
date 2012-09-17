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