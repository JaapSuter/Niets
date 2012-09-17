import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class wb
{
  private static final yb a;
  public static int b;
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "RI5\034\007CX9\027WR_5\026\023^_1Y\025VB3OC\027B\"\013\036YVlY".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "RI5\034\007CX9\027WST5\026\023^_1Y\025VB3OC\027B\"\013\036YVlY".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        z = arrayOfString;
        a = new xb();
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 119;
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
        m = 55;
        continue;
        m = 49;
        continue;
        m = 86;
        continue;
        m = 121;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 119;
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
      i3 = 55;
      continue;
      i3 = 49;
      continue;
      i3 = 86;
      continue;
      i3 = 121;
    }
  }

  public static byte[] a(String paramString)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(3 * (paramString.length() / 4));
    try
    {
      a.a(paramString, localByteArrayOutputStream);
      return localByteArrayOutputStream.toByteArray();
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(z[1] + localIOException);
    }
  }

  public static byte[] a(byte[] paramArrayOfByte)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(4 * ((2 + paramArrayOfByte.length) / 3));
    try
    {
      a.a(paramArrayOfByte, 0, paramArrayOfByte.length, localByteArrayOutputStream);
      return localByteArrayOutputStream.toByteArray();
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(z[0] + localIOException);
    }
  }

  public static byte[] b(byte[] paramArrayOfByte)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(3 * (paramArrayOfByte.length / 4));
    try
    {
      a.b(paramArrayOfByte, 0, paramArrayOfByte.length, localByteArrayOutputStream);
      return localByteArrayOutputStream.toByteArray();
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(z[1] + localIOException);
    }
  }
}