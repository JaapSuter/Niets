import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

class a extends BufferedReader
{
  private long a;

  public a(Reader paramReader)
  {
    super(paramReader);
  }

  public String readLine()
    throws IOException
  {
    long l1 = System.currentTimeMillis();
    String str = super.readLine();
    long l2 = System.currentTimeMillis();
    this.a += l2 - l1;
    return str;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     a
 * JD-Core Version:    0.6.1
 */