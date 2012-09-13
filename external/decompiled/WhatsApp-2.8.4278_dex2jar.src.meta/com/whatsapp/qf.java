package com.whatsapp;

import java.io.IOException;
import java.io.OutputStream;

class qf extends OutputStream
{
  final OutputStream b;
  final OutputStream c;

  public qf(OutputStream paramOutputStream1, OutputStream paramOutputStream2)
  {
    this.b = paramOutputStream1;
    this.c = paramOutputStream2;
  }

  public void close()
    throws IOException
  {
    this.b.close();
    this.c.close();
  }

  public void flush()
    throws IOException
  {
    this.b.flush();
    this.c.flush();
  }

  public void write(int paramInt)
    throws IOException
  {
    this.b.write(paramInt);
    this.c.write(paramInt);
  }

  public void write(byte[] paramArrayOfByte)
    throws IOException
  {
    this.b.write(paramArrayOfByte);
    this.c.write(paramArrayOfByte);
  }

  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    this.b.write(paramArrayOfByte, paramInt1, paramInt2);
    this.c.write(paramArrayOfByte, paramInt1, paramInt2);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.qf
 * JD-Core Version:    0.6.1
 */