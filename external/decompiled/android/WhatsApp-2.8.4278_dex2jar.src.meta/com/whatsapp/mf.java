package com.whatsapp;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class mf extends FilterOutputStream
{
  final int a;

  public mf(OutputStream paramOutputStream, int paramInt)
  {
    super(paramOutputStream);
    this.a = paramInt;
  }

  public void write(int paramInt)
    throws IOException
  {
    e4.b(1L, this.a);
    super.write(paramInt);
  }

  public void write(byte[] paramArrayOfByte)
    throws IOException
  {
    e4.b(paramArrayOfByte.length, this.a);
    super.write(paramArrayOfByte);
  }

  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    e4.b(paramInt2, this.a);
    super.write(paramArrayOfByte, paramInt1, paramInt2);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.mf
 * JD-Core Version:    0.6.1
 */