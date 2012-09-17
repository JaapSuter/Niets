import com.whatsapp.App;
import java.util.Hashtable;

public class qb
  implements pb
{
  private static Hashtable f;
  public static boolean g;
  private static final String z = z(z("LWUj<NW\036`:^\\MpsIXMw6]\003\036"));
  private kb a;
  private int b;
  private int c;
  private byte[] d;
  private byte[] e;

  static
  {
    f = new Hashtable();
    f.put(z(z("~vmP`\r\b\017")), new Integer(32));
    f.put(z(z("t}\f")), new Integer(16));
    f.put(z(z("t}\n")), new Integer(64));
    f.put(z(z("t}\013")), new Integer(64));
    f.put(z(z("kpnA\036}\b\f<")), new Integer(64));
    f.put(z(z("kpnA\036}\b\b4")), new Integer(64));
    f.put(z(z("jq)b")), new Integer(64));
    f.put(z(z("jq)a\013\r")), new Integer(64));
    f.put(z(z("jq)a\f\017")), new Integer(64));
    f.put(z(z("jq)`\001\r")), new Integer(128));
    f.put(z(z("jq)f\b\013")), new Integer(128));
    f.put(z(z("mPYa!")), new Integer(64));
    f.put(z(z("nQWv?IVQh")), new Integer(64));
  }

  public qb(kb paramkb)
  {
    this(paramkb, a(paramkb));
  }

  private qb(kb paramkb, int paramInt)
  {
    this.a = paramkb;
    this.b = paramkb.b();
    this.c = paramInt;
    this.d = new byte[this.c];
    this.e = new byte[this.c];
  }

  private static int a(kb paramkb)
  {
    if ((paramkb instanceof ob));
    Integer localInteger;
    for (int i = ((ob)paramkb).a(); ; i = localInteger.intValue())
    {
      return i;
      localInteger = (Integer)f.get(paramkb.a());
      if (localInteger == null)
        throw new IllegalArgumentException(z + paramkb.a());
    }
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
      m = 83;
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
      m = 57;
      continue;
      m = 57;
      continue;
      m = 62;
      continue;
      m = 4;
    }
  }

  private static char[] z(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    if (arrayOfChar.length < 2)
      arrayOfChar[0] = (char)(0x53 ^ arrayOfChar[0]);
    return arrayOfChar;
  }

  public int a()
  {
    return this.b;
  }

  public int a(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool1 = false;
    boolean bool2 = g;
    byte[] arrayOfByte = new byte[this.b];
    this.a.a(arrayOfByte, 0);
    this.a.a(this.e, 0, this.e.length);
    this.a.a(arrayOfByte, 0, arrayOfByte.length);
    int i = this.a.a(paramArrayOfByte, paramInt);
    a();
    if (App.wc != 0)
      if (!bool2)
        break label97;
    while (true)
    {
      g = bool1;
      return i;
      label97: bool1 = true;
    }
  }

  public void a()
  {
    this.a.c();
    this.a.a(this.d, 0, this.d.length);
  }

  public void a(jb paramjb)
  {
    boolean bool = g;
    this.a.c();
    byte[] arrayOfByte1 = ((rb)paramjb).a();
    if (arrayOfByte1.length > this.c)
    {
      this.a.a(arrayOfByte1, 0, arrayOfByte1.length);
      this.a.a(this.d, 0);
      int m = this.b;
      while (m < this.d.length)
      {
        this.d[m] = 0;
        m++;
        if (bool)
          App.wc = 1 + App.wc;
      }
      if (!bool);
    }
    else
    {
      System.arraycopy(arrayOfByte1, 0, this.d, 0, arrayOfByte1.length);
      int i = arrayOfByte1.length;
      do
      {
        if (i >= this.d.length)
          break;
        this.d[i] = 0;
        i++;
      }
      while (!bool);
    }
    this.e = new byte[this.d.length];
    System.arraycopy(this.d, 0, this.e, 0, this.d.length);
    int j = 0;
    do
    {
      if (j >= this.d.length)
        break;
      byte[] arrayOfByte3 = this.d;
      arrayOfByte3[j] = (byte)(0x36 ^ arrayOfByte3[j]);
      j++;
    }
    while (!bool);
    int k = 0;
    do
    {
      if (k >= this.e.length)
        break;
      byte[] arrayOfByte2 = this.e;
      arrayOfByte2[k] = (byte)(0x5C ^ arrayOfByte2[k]);
      k++;
    }
    while (!bool);
    this.a.a(this.d, 0, this.d.length);
  }

  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a.a(paramArrayOfByte, paramInt1, paramInt2);
  }
}