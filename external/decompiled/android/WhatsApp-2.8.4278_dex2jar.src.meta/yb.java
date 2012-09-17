import java.io.IOException;
import java.io.OutputStream;

public abstract interface yb
{
  public abstract int a(String paramString, OutputStream paramOutputStream)
    throws IOException;

  public abstract int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, OutputStream paramOutputStream)
    throws IOException;

  public abstract int b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, OutputStream paramOutputStream)
    throws IOException;
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     yb
 * JD-Core Version:    0.6.1
 */