import com.whatsapp.App;

public class tb extends sb
{
  public static boolean e;
  private static final String z;
  private pb d;

  static
  {
    char[] arrayOfChar = "|<\002LOa!\bP\016v'\022PZ5%\022MZ5*\002\036Oah\013[Of<G\017��".toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    if (i <= j)
    {
      z = new String(arrayOfChar).intern();
      return;
    }
    int k = arrayOfChar[j];
    int m;
    switch (j % 5)
    {
    default:
      m = 46;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar[j] = (char)(m ^ k);
      j++;
      break;
      m = 21;
      continue;
      m = 72;
      continue;
      m = 103;
      continue;
      m = 62;
    }
  }

  public tb()
  {
    this(new mb());
  }

  public tb(kb paramkb)
  {
    this.d = new qb(paramkb);
    if (App.wc != 0)
      if (!bool1)
        break label37;
    label37: for (boolean bool2 = false; ; bool2 = true)
    {
      e = bool2;
      return;
    }
  }

  private void a(byte[] paramArrayOfByte, int paramInt)
  {
    paramArrayOfByte[0] = (byte)(paramInt >>> 24);
    paramArrayOfByte[1] = (byte)(paramInt >>> 16);
    paramArrayOfByte[2] = (byte)(paramInt >>> 8);
    paramArrayOfByte[3] = (byte)paramInt;
  }

  private void a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4, int paramInt2)
  {
    boolean bool = e;
    byte[] arrayOfByte = new byte[this.d.a()];
    rb localrb = new rb(paramArrayOfByte1);
    this.d.a(localrb);
    if (paramArrayOfByte2 != null)
      this.d.a(paramArrayOfByte2, 0, paramArrayOfByte2.length);
    this.d.a(paramArrayOfByte3, 0, paramArrayOfByte3.length);
    this.d.a(arrayOfByte, 0);
    System.arraycopy(arrayOfByte, 0, paramArrayOfByte4, paramInt2, arrayOfByte.length);
    if (paramInt1 == 0)
      throw new IllegalArgumentException(z);
    int k;
    for (int i = 1; ; i = k)
      if (i < paramInt1)
      {
        this.d.a(localrb);
        this.d.a(arrayOfByte, 0, arrayOfByte.length);
        this.d.a(arrayOfByte, 0);
        int j = 0;
        do
        {
          if (j == arrayOfByte.length)
            break;
          int m = paramInt2 + j;
          paramArrayOfByte4[m] = (byte)(paramArrayOfByte4[m] ^ arrayOfByte[j]);
          j++;
        }
        while (!bool);
        k = i + 1;
        if (!bool);
      }
      else
      {
        return;
      }
  }

  private byte[] a(int paramInt)
  {
    boolean bool = e;
    int i = this.d.a();
    int j = (-1 + (paramInt + i)) / i;
    byte[] arrayOfByte1 = new byte[4];
    byte[] arrayOfByte2 = new byte[j * i];
    int m;
    for (int k = 1; ; k = m)
      if (k <= j)
      {
        a(arrayOfByte1, k);
        a(this.a, this.b, this.c, arrayOfByte1, arrayOfByte2, i * (k - 1));
        m = k + 1;
        if (!bool);
      }
      else
      {
        return arrayOfByte2;
      }
  }

  public jb a(int paramInt)
  {
    boolean bool = e;
    int i = paramInt / 8;
    rb localrb = new rb(a(i), 0, i);
    if (bool)
      App.wc = 1 + App.wc;
    return localrb;
  }
}