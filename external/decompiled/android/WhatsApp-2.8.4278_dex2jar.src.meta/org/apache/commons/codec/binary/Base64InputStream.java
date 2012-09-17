package org.apache.commons.codec.binary;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Base64InputStream extends FilterInputStream
{
  private final Base64 base64;
  private final boolean doEncode;
  private final byte[] singleByte = new byte[1];

  public Base64InputStream(InputStream paramInputStream)
  {
    this(paramInputStream, false);
  }

  public Base64InputStream(InputStream paramInputStream, boolean paramBoolean)
  {
    super(paramInputStream);
    this.doEncode = paramBoolean;
    this.base64 = new Base64();
  }

  public Base64InputStream(InputStream paramInputStream, boolean paramBoolean, int paramInt, byte[] paramArrayOfByte)
  {
    super(paramInputStream);
    this.doEncode = paramBoolean;
    this.base64 = new Base64(paramInt, paramArrayOfByte);
  }

  public boolean markSupported()
  {
    return false;
  }

  public int read()
    throws IOException
  {
    for (int i = read(this.singleByte, 0, 1); i == 0; i = read(this.singleByte, 0, 1));
    int j;
    if (i > 0)
      if (this.singleByte[0] < 0)
        j = 256 + this.singleByte[0];
    while (true)
    {
      return j;
      j = this.singleByte[0];
      continue;
      j = -1;
    }
  }

  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if (paramArrayOfByte == null)
      throw new NullPointerException();
    if ((paramInt1 < 0) || (paramInt2 < 0))
      throw new IndexOutOfBoundsException();
    if ((paramInt1 > paramArrayOfByte.length) || (paramInt1 + paramInt2 > paramArrayOfByte.length))
      throw new IndexOutOfBoundsException();
    int i;
    if (paramInt2 == 0)
    {
      i = 0;
      return i;
    }
    int j;
    label82: byte[] arrayOfByte;
    int k;
    if (!this.base64.hasData())
    {
      if (!this.doEncode)
        break label154;
      j = 4096;
      arrayOfByte = new byte[j];
      k = this.in.read(arrayOfByte);
      if ((k > 0) && (paramArrayOfByte.length == paramInt2))
        this.base64.setInitialBuffer(paramArrayOfByte, paramInt1, paramInt2);
      if (!this.doEncode)
        break label162;
      this.base64.encode(arrayOfByte, 0, k);
    }
    while (true)
    {
      i = this.base64.readResults(paramArrayOfByte, paramInt1, paramInt2);
      break;
      label154: j = 8192;
      break label82;
      label162: this.base64.decode(arrayOfByte, 0, k);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     org.apache.commons.codec.binary.Base64InputStream
 * JD-Core Version:    0.6.1
 */