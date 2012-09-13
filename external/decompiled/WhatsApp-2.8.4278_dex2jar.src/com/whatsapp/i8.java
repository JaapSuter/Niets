package com.whatsapp;

import java.io.File;

class i8 extends Thread
{
  private static final String[] z;
  final App.22 a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "wQ8".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "4\020}o0\"\fG}66\016}jq".toCharArray();
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
        m = 94;
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
        m = 87;
        continue;
        m = 124;
        continue;
        m = 24;
        continue;
        m = 14;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 94;
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
      i3 = 87;
      continue;
      i3 = 124;
      continue;
      i3 = 24;
      continue;
      i3 = 14;
    }
  }

  i8(App.22 param22)
  {
  }

  public void run()
  {
    boolean bool = DialogToastListActivity.f;
    File[] arrayOfFile = new File(App.c, et.d).listFiles();
    if (arrayOfFile != null)
    {
      int i = arrayOfFile.length;
      int j = 0;
      do
      {
        if (j >= i)
          break;
        File localFile = arrayOfFile[j];
        g5.b(z[1] + localFile.getName() + ":" + System.currentTimeMillis() + z[0] + localFile.lastModified());
        if (System.currentTimeMillis() - localFile.lastModified() > 86400000L)
          localFile.delete();
        j++;
      }
      while (!bool);
    }
  }
}