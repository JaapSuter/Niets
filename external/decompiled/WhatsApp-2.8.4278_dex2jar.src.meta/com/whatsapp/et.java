package com.whatsapp;

import java.io.File;
import java.text.SimpleDateFormat;

public class et
{
  public static String a = z(z("\030D\003\005tV&1\t|Cz'\021m\027H\023\005tX"));
  public static String b = z(z("\030D\003\005tV&1\t|Cz'\021m\027_\017\005xX"));
  public static String c = z(z("\030D\003\005tV&1\t|Cz'\021m\027@\013��zRz"));
  public static String d = z(z("\030D\003\005tV&H2uV{\003\005"));
  public static String e = z(z("`h\n\rMVy\003\023"));
  public static String f = z(z("\030D\003\005tV&")) + e;
  static SimpleDateFormat g = new SimpleDateFormat(z[1]);
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[2];
    arrayOfString[0] = z(z("\030D\003\005tV"));
    arrayOfString[1] = z(z("r3.)'Zd\\\022n"));
    z = arrayOfString;
  }

  public static String a(byte paramByte)
  {
    String str;
    if (paramByte == 2)
      str = a;
    while (true)
    {
      return str;
      if (paramByte == 1)
        str = c;
      else if (paramByte == 3)
        str = b;
      else
        str = z[0];
    }
  }

  public static void a()
  {
    File localFile1 = new File(App.c + z[0]);
    if (!localFile1.exists())
      localFile1.mkdirs();
    File localFile2 = new File(App.c + a);
    if (!localFile2.exists())
      localFile2.mkdirs();
    File localFile3 = new File(App.c + b);
    if (!localFile3.exists())
      localFile3.mkdirs();
    File localFile4 = new File(App.c + c);
    if (!localFile4.exists())
      localFile4.mkdirs();
    File localFile5 = new File(App.c + f);
    if (!localFile5.exists())
      localFile5.mkdirs();
  }

  private static String z(char[] paramArrayOfChar)
  {
    int i = paramArrayOfChar.length;
    int j = 0;
    if (i <= j)
      return new String(paramArrayOfChar).intern();
    int k = paramArrayOfChar[j];
    int m;
    switch (j % 5)
    {
    default:
      m = 29;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      paramArrayOfChar[j] = (char)(m ^ k);
      j++;
      break;
      m = 55;
      continue;
      m = 9;
      continue;
      m = 102;
      continue;
      m = 97;
    }
  }

  private static char[] z(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    if (arrayOfChar.length < 2)
      arrayOfChar[0] = (char)(0x1D ^ arrayOfChar[0]);
    return arrayOfChar;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.et
 * JD-Core Version:    0.6.1
 */