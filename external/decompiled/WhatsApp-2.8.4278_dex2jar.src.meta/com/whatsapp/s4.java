package com.whatsapp;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;

public class s4
{
  static final SimpleDateFormat a;
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = " $".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "wl$N\027CXpS^".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        z = arrayOfString;
        a = new SimpleDateFormat(z[1], Locale.US);
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 58;
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
        m = 14;
        continue;
        m = 21;
        continue;
        m = 93;
        continue;
        m = 55;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 58;
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
      i3 = 14;
      continue;
      i3 = 21;
      continue;
      i3 = 93;
      continue;
      i3 = 55;
    }
  }

  private static int a(String paramString)
  {
    return paramString.indexOf('.') + "-".length();
  }

  public static File a(File paramFile, String paramString)
    throws IOException
  {
    Date localDate = new Date();
    String str1 = a(paramFile.getName(), localDate);
    String str2 = a(paramFile.getName(), paramString);
    Object localObject = "1";
    String str3 = a(paramFile, localDate, paramString);
    int i;
    int j;
    if (str3 != null)
    {
      i = 1 + str1.length();
      j = str3.length() - str2.length();
      if (i >= j);
    }
    try
    {
      String str5 = Integer.toString(1 + Integer.parseInt(str3.substring(i, j)));
      localObject = str5;
      label95: String str4 = str1 + "." + (String)localObject + str2;
      File localFile = new File(paramFile.getParent(), str4);
      localFile.createNewFile();
      return localFile;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      break label95;
    }
  }

  public static String a(File paramFile, Date paramDate, String paramString)
  {
    int i = g5.n;
    String str1 = a(paramFile.getName(), paramDate);
    String str2 = a(paramFile.getName(), paramString);
    int j = 0;
    Object localObject1 = null;
    File[] arrayOfFile = paramFile.getParentFile().listFiles();
    int k;
    int m;
    if (arrayOfFile != null)
    {
      k = arrayOfFile.length;
      m = 0;
    }
    while (true)
    {
      Object localObject2;
      String str4;
      int i1;
      int i2;
      if (m < k)
      {
        localObject2 = arrayOfFile[m];
        str4 = ((File)localObject2).getName();
        if ((str4.startsWith(str1)) && (str4.endsWith(str2)))
        {
          i1 = 1 + str1.length();
          i2 = str4.length() - str2.length();
          if ((i2 >= str4.length()) || (i1 >= i2));
        }
      }
      try
      {
        int i3 = Integer.parseInt(str4.substring(i1, i2));
        if (i3 > j)
        {
          i4 = i3;
          j = i4;
          localObject1 = localObject2;
          n = m + 1;
          if (i == 0)
            break label246;
          if (localObject1 != null);
          StringBuilder localStringBuilder;
          for (String str3 = localObject1.getName(); ; str3 = localStringBuilder.toString())
          {
            return str3;
            localStringBuilder = new StringBuilder();
            localStringBuilder.append(str1).append(z[0]).append(str2);
          }
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        int n;
        while (true)
        {
          continue;
          localObject2 = localObject1;
          int i4 = j;
        }
        label246: m = n;
      }
    }
  }

  private static String a(String paramString1, String paramString2)
  {
    String str = paramString1.substring(paramString1.indexOf('.'));
    return str + paramString2;
  }

  private static String a(String paramString, Date paramDate)
  {
    String str = paramString.substring(0, paramString.indexOf('.'));
    return str + "-" + a.format(paramDate);
  }

  public static ArrayList<File> a(File paramFile, int paramInt, String paramString)
  {
    int i = g5.n;
    ArrayList localArrayList = new ArrayList();
    Date localDate1 = new Date();
    String str1 = a.toPattern();
    String str2 = a(paramFile.getName(), paramString);
    String str3 = b(paramFile.getName());
    File[] arrayOfFile = paramFile.getParentFile().listFiles();
    int j;
    int k;
    if (arrayOfFile != null)
    {
      Arrays.sort(arrayOfFile);
      j = arrayOfFile.length;
      k = 0;
    }
    while (true)
    {
      File localFile;
      String str5;
      if (k < j)
      {
        localFile = arrayOfFile[k];
        String str4 = localFile.getName();
        if ((str4.startsWith(str3)) && (str4.endsWith(str2)))
          str5 = str4.substring(str3.length(), str3.length() + str1.length());
      }
      try
      {
        Date localDate2 = a.parse(str5);
        if ((localDate1.getTime() - localDate2.getTime()) / 86400000L < paramInt)
          localArrayList.add(localFile);
        label179: k++;
        if (i == 0)
          continue;
        return localArrayList;
      }
      catch (ParseException localParseException)
      {
        break label179;
      }
    }
  }

  public static ArrayList<File> a(File paramFile, int paramInt, String paramString, boolean paramBoolean)
  {
    int i = g5.n;
    ArrayList localArrayList = new ArrayList();
    Date localDate1 = new Date();
    String str1 = a.toPattern();
    String str2 = a(paramFile.getName(), "");
    String str3 = a(paramFile.getName(), paramString);
    String str4 = b(paramFile.getName());
    File[] arrayOfFile = paramFile.getParentFile().listFiles();
    int j;
    int k;
    if (arrayOfFile != null)
    {
      j = arrayOfFile.length;
      k = 0;
    }
    while (true)
    {
      File localFile2;
      String str6;
      if (k < j)
      {
        localFile2 = arrayOfFile[k];
        String str5 = localFile2.getName();
        if (((paramBoolean) && (str5.startsWith(str4)) && (str5.endsWith(str2))) || ((str5.startsWith(str4)) && (str5.endsWith(str3))))
          str6 = str5.substring(str4.length(), str4.length() + str1.length());
      }
      try
      {
        Date localDate2 = a.parse(str6);
        if ((localDate1.getTime() - localDate2.getTime()) / 86400000L < paramInt)
          localArrayList.add(localFile2);
        label210: k++;
        if (i == 0)
          continue;
        if ((paramBoolean) && (a(paramFile, paramInt)))
          localArrayList.add(paramFile);
        File localFile1 = new File(paramFile.getPath() + paramString);
        if (a(localFile1, paramInt))
          localArrayList.add(localFile1);
        Collections.sort(localArrayList, new r4());
        if (App.wc != 0)
          g5.n = i + 1;
        return localArrayList;
      }
      catch (ParseException localParseException)
      {
        break label210;
      }
    }
  }

  public static void a(FileChannel paramFileChannel, WritableByteChannel paramWritableByteChannel)
    throws IOException
  {
    int i = g5.n;
    long l = 0L;
    do
    {
      if (l >= paramFileChannel.size())
        break;
      paramFileChannel.transferTo(l, Math.min(131072L, paramFileChannel.size() - l), paramWritableByteChannel);
      l += 131072L;
    }
    while (i == 0);
  }

  private static boolean a(File paramFile, int paramInt)
  {
    (float)((System.currentTimeMillis() - paramFile.lastModified()) / 86400000L);
    if ((paramFile.exists()) && ((System.currentTimeMillis() - paramFile.lastModified()) / 86400000L <= paramInt));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean a(File paramFile1, File paramFile2)
  {
    boolean bool1 = false;
    if (paramFile1.exists());
    try
    {
      boolean bool2 = paramFile1.renameTo(paramFile2);
      bool1 = bool2;
      label19: return bool1;
    }
    catch (SecurityException localSecurityException)
    {
      break label19;
    }
  }

  private static String b(String paramString)
  {
    return a(paramString, new Date()).substring(0, a(paramString));
  }

  public static void b(File paramFile, int paramInt, String paramString)
  {
    int i = g5.n;
    Date localDate1 = new Date();
    String str1 = a.toPattern();
    String str2 = a(paramFile.getName(), paramString);
    String str3 = b(paramFile.getName());
    String str4 = null;
    int n;
    if (paramInt < 0)
    {
      n = paramFile.getName().indexOf('.');
      if (n != -1);
    }
    File[] arrayOfFile;
    int j;
    int k;
    label100: 
    do
    {
      do
      {
        return;
        str4 = paramFile.getName().substring(0, n);
        arrayOfFile = paramFile.getParentFile().listFiles();
      }
      while (arrayOfFile == null);
      j = arrayOfFile.length;
      k = 0;
    }
    while (k >= j);
    File localFile = arrayOfFile[k];
    String str5 = localFile.getName();
    if (paramInt < 0)
      if (!str5.startsWith(str4));
    while (true)
    {
      try
      {
        localFile.delete();
        k++;
        if (i == 0)
          break label100;
      }
      catch (SecurityException localSecurityException2)
      {
        if (i == 0)
          continue;
      }
      if ((str5.startsWith(str3)) && (str5.endsWith(str2)))
      {
        int m = str3.length() + str1.length();
        if ((m <= str5.length()) || (i != 0))
        {
          String str6 = str5.substring(str3.length(), m);
          try
          {
            Date localDate2 = a.parse(str6);
            if ((localDate1.getTime() - localDate2.getTime()) / 86400000L > paramInt)
              localFile.delete();
          }
          catch (ParseException localParseException)
          {
          }
          catch (SecurityException localSecurityException1)
          {
          }
        }
      }
    }
  }

  public static boolean b(File paramFile, String paramString)
  {
    boolean bool1 = false;
    if (paramFile.exists());
    try
    {
      String str = a(paramFile, new Date(), paramString);
      boolean bool2 = paramFile.renameTo(new File(paramFile.getParentFile(), str));
      bool1 = bool2;
      label45: return bool1;
    }
    catch (SecurityException localSecurityException)
    {
      break label45;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.s4
 * JD-Core Version:    0.6.1
 */