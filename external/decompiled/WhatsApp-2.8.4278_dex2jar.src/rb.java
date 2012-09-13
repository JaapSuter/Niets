import com.whatsapp.App;

public class rb
  implements jb
{
  public static boolean b;
  private byte[] a;

  public rb(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, 0, paramArrayOfByte.length);
    if (App.wc != 0)
      if (!bool2)
        break label29;
    while (true)
    {
      b = bool1;
      return;
      label29: bool1 = true;
    }
  }

  public rb(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, this.a, 0, paramInt2);
    if (bool)
      App.wc = 1 + App.wc;
  }

  public byte[] a()
  {
    return this.a;
  }
}