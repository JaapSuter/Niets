public abstract class lb
  implements ob
{
  public static boolean d;
  private byte[] a = new byte[4];
  private int b = 0;
  private long c;

  public int a()
  {
    return 64;
  }

  public void a()
  {
    boolean bool = d;
    long l = this.c << 3;
    a((byte)-128);
    do
    {
      if (this.b == 0)
        break;
      a((byte)0);
    }
    while (!bool);
    a(l);
    b();
  }

  public void a(byte paramByte)
  {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    this.b = (i + 1);
    arrayOfByte[i] = paramByte;
    if (this.b == this.a.length)
    {
      a(this.a, 0);
      this.b = 0;
    }
    this.c = (1L + this.c);
  }

  protected abstract void a(long paramLong);

  protected abstract void a(byte[] paramArrayOfByte, int paramInt);

  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool = d;
    do
    {
      if ((this.b == 0) || (paramInt2 <= 0))
        break;
      a(paramArrayOfByte[paramInt1]);
      paramInt1++;
      paramInt2--;
    }
    while (!bool);
    do
    {
      if (paramInt2 <= this.a.length)
        break;
      a(paramArrayOfByte, paramInt1);
      paramInt1 += this.a.length;
      paramInt2 -= this.a.length;
      this.c += this.a.length;
    }
    while (!bool);
    do
    {
      if (paramInt2 <= 0)
        break;
      a(paramArrayOfByte[paramInt1]);
      paramInt1++;
      paramInt2--;
    }
    while (!bool);
  }

  protected abstract void b();

  public void c()
  {
    boolean bool = d;
    this.c = 0L;
    this.b = 0;
    int i = 0;
    do
    {
      if (i >= this.a.length)
        break;
      this.a[i] = 0;
      i++;
    }
    while (!bool);
  }
}