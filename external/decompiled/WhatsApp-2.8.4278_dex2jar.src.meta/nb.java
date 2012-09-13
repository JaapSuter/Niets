import com.whatsapp.App;

public class nb
  implements ub
{
  public static int e;
  private static final String[] z;
  private byte[] a = null;
  private int b = 0;
  private int c = 0;
  private byte[] d = null;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "gS8i\004gYnx\t|\\#m\034kOnx\t}N+lHzRnZ+:\035'f\001z\035c(".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "gS>}\034._;n\016kOn|\007a\035=`\007|I".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "aH:x\035z\035,}\016hX<(\034aRn{��aO:".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label289;
        arrayOfString[2] = new String(arrayOfChar3).intern();
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
        m = 104;
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
        m = 61;
        continue;
        m = 78;
        continue;
        m = 8;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 104;
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
      i3 = 61;
      continue;
      i3 = 78;
      continue;
      i3 = 8;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 104;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i5] = (char)(i7 ^ i6);
      i5++;
      break;
      i7 = 14;
      continue;
      i7 = 61;
      continue;
      i7 = 78;
      continue;
      i7 = 8;
    }
  }

  public nb()
  {
    if (App.wc != 0)
      e = i + 1;
  }

  private void a(byte[] paramArrayOfByte)
  {
    int i = 0;
    int j = e;
    this.d = paramArrayOfByte;
    this.b = 0;
    this.c = 0;
    if (this.a == null)
      this.a = new byte[256];
    int k = 0;
    do
    {
      if (k >= 256)
        break;
      this.a[k] = (byte)k;
      k++;
    }
    while (j == 0);
    int m = 0;
    int n = 0;
    do
    {
      if (i >= 256)
        break;
      m = 0xFF & m + ((0xFF & paramArrayOfByte[n]) + this.a[i]);
      int i1 = this.a[i];
      this.a[i] = this.a[m];
      this.a[m] = i1;
      n = (n + 1) % paramArrayOfByte.length;
      i++;
    }
    while (j == 0);
  }

  public void a(boolean paramBoolean, jb paramjb)
  {
    if ((paramjb instanceof rb))
    {
      this.d = ((rb)paramjb).a();
      a(this.d);
      return;
    }
    throw new IllegalArgumentException(z[0] + paramjb.getClass().getName());
  }

  public void a(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3)
  {
    int i = e;
    if (paramInt1 + paramInt2 > paramArrayOfByte1.length)
      throw new bc(z[1]);
    if (paramInt3 + paramInt2 > paramArrayOfByte2.length)
      throw new bc(z[2]);
    int j = 0;
    while (j < paramInt2)
    {
      this.b = (0xFF & 1 + this.b);
      this.c = (0xFF & this.a[this.b] + this.c);
      int k = this.a[this.b];
      this.a[this.b] = this.a[this.c];
      this.a[this.c] = k;
      paramArrayOfByte2[(j + paramInt3)] = (byte)(paramArrayOfByte1[(j + paramInt1)] ^ this.a[(0xFF & this.a[this.b] + this.a[this.c])]);
      j++;
      if (i != 0)
        App.wc = 1 + App.wc;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     nb
 * JD-Core Version:    0.6.1
 */