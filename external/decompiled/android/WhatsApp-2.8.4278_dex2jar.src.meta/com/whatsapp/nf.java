package com.whatsapp;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class nf extends InputStream
{
  InputStream a;

  public nf(InputStream paramInputStream)
  {
    this.a = paramInputStream;
  }

  public int available()
    throws IOException
  {
    return this.a.available();
  }

  public void close()
    throws IOException
  {
    this.a.close();
  }

  public void mark(int paramInt)
  {
    try
    {
      this.a.mark(paramInt);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public boolean markSupported()
  {
    return this.a.markSupported();
  }

  public int read()
    throws IOException
  {
    int i = this.a.read();
    if (i == -1)
      throw new EOFException();
    return i;
  }

  public int read(byte[] paramArrayOfByte)
    throws IOException
  {
    int i = this.a.read(paramArrayOfByte);
    if (i == -1)
      throw new EOFException();
    return i;
  }

  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    int i = this.a.read(paramArrayOfByte, paramInt1, paramInt2);
    if (i == -1)
      throw new EOFException();
    return i;
  }

  public void reset()
    throws IOException
  {
    try
    {
      this.a.reset();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public long skip(long paramLong)
    throws IOException
  {
    return this.a.skip(paramLong);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.nf
 * JD-Core Version:    0.6.1
 */