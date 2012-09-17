import com.whatsapp.App;

public abstract class vb
{
  public static int a;

  public static void a(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    int i = a;
    paramArrayOfByte[paramInt2] = (byte)(paramInt1 >>> 24);
    int j = paramInt2 + 1;
    paramArrayOfByte[j] = (byte)(paramInt1 >>> 16);
    int k = j + 1;
    paramArrayOfByte[k] = (byte)(paramInt1 >>> 8);
    paramArrayOfByte[(k + 1)] = (byte)paramInt1;
    if (i != 0)
      App.wc = 1 + App.wc;
  }
}