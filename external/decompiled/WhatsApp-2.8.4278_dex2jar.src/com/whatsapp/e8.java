package com.whatsapp;

import java.io.File;
import java.util.Comparator;

final class e8
  implements Comparator<File>
{
  public int a(File paramFile1, File paramFile2)
  {
    return Long.valueOf(paramFile1.lastModified()).compareTo(Long.valueOf(paramFile2.lastModified()));
  }
}