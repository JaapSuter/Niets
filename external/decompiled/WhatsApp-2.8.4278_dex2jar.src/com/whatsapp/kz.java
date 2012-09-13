package com.whatsapp;

import java.io.IOException;
import mb;
import nb;
import pb;
import qb;
import rb;
import sb;
import tb;
import ub;

public class kz
  implements g1
{
  private ub a = null;
  private pb b = null;
  private ub c = null;
  private pb d = null;

  public kz(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
    throws IOException
  {
    byte[] arrayOfByte1 = a(paramArrayOfByte1, paramArrayOfByte2, 16, 20);
    byte[] arrayOfByte2 = new byte[256];
    this.c = new nb();
    this.c.a(true, new rb(arrayOfByte1));
    this.c.a(arrayOfByte2, 0, 256, arrayOfByte2, 0);
    this.d = new qb(new mb());
    this.d.a(new rb(arrayOfByte1));
    byte[] arrayOfByte3 = new byte[256];
    this.a = new nb();
    this.a.a(true, new rb(arrayOfByte1));
    this.a.a(arrayOfByte3, 0, 256, arrayOfByte3, 0);
    this.b = new qb(new mb());
    this.b.a(new rb(arrayOfByte1));
    if (App.wc != 0)
      if (!bool2)
        break label240;
    while (true)
    {
      nz.b = bool1;
      return;
      label240: bool1 = true;
    }
  }

  private static byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2)
  {
    tb localtb = new tb();
    localtb.a(paramArrayOfByte1, paramArrayOfByte2, paramInt1);
    return ((rb)localtb.a(paramInt2 * 8)).a();
  }

  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    this.a.a(paramArrayOfByte, paramInt1, paramInt2, paramArrayOfByte, paramInt1);
    this.b.a(paramArrayOfByte, paramInt1, paramInt2);
  }

  public byte[] a()
    throws IOException
  {
    byte[] arrayOfByte = new byte[this.b.a()];
    this.b.a(arrayOfByte, 0);
    return arrayOfByte;
  }

  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    this.d.a(paramArrayOfByte, paramInt1, paramInt2);
    this.c.a(paramArrayOfByte, paramInt1, paramInt2, paramArrayOfByte, paramInt1);
  }

  public byte[] b()
    throws IOException
  {
    byte[] arrayOfByte = new byte[this.d.a()];
    this.d.a(arrayOfByte, 0);
    return arrayOfByte;
  }
}