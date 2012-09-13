package org.apache.commons.codec.binary;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Base64OutputStream extends FilterOutputStream
{
  private final Base64 base64;
  private final boolean doEncode;
  private final byte[] singleByte = new byte[1];

  public Base64OutputStream(OutputStream paramOutputStream)
  {
    this(paramOutputStream, true);
  }

  public Base64OutputStream(OutputStream paramOutputStream, boolean paramBoolean)
  {
    super(paramOutputStream);
    this.doEncode = paramBoolean;
    this.base64 = new Base64();
  }

  public Base64OutputStream(OutputStream paramOutputStream, boolean paramBoolean, int paramInt, byte[] paramArrayOfByte)
  {
    super(paramOutputStream);
    this.doEncode = paramBoolean;
    this.base64 = new Base64(paramInt, paramArrayOfByte);
  }

  private void flush(boolean paramBoolean)
    throws IOException
  {
    int i = this.base64.avail();
    if (i > 0)
    {
      byte[] arrayOfByte = new byte[i];
      int j = this.base64.readResults(arrayOfByte, 0, i);
      if (j > 0)
        this.out.write(arrayOfByte, 0, j);
    }
    if (paramBoolean)
      this.out.flush();
  }

  public void close()
    throws IOException
  {
    if (this.doEncode)
      this.base64.encode(this.singleByte, 0, -1);
    while (true)
    {
      flush();
      this.out.close();
      return;
      this.base64.decode(this.singleByte, 0, -1);
    }
  }

  public void flush()
    throws IOException
  {
    flush(true);
  }

  public void write(int paramInt)
    throws IOException
  {
    this.singleByte[0] = (byte)paramInt;
    write(this.singleByte, 0, 1);
  }

  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if (paramArrayOfByte == null)
      throw new NullPointerException();
    if ((paramInt1 < 0) || (paramInt2 < 0))
      throw new IndexOutOfBoundsException();
    if ((paramInt1 > paramArrayOfByte.length) || (paramInt1 + paramInt2 > paramArrayOfByte.length))
      throw new IndexOutOfBoundsException();
    if (paramInt2 > 0)
    {
      if (!this.doEncode)
        break label77;
      this.base64.encode(paramArrayOfByte, paramInt1, paramInt2);
    }
    while (true)
    {
      flush(false);
      return;
      label77: this.base64.decode(paramArrayOfByte, paramInt1, paramInt2);
    }
  }
}