package com.whatsapp;

import java.io.IOException;
import java.io.InputStream;

public class rz
{
  public static int a(InputStream paramInputStream)
    throws IOException
  {
    int i = paramInputStream.read();
    int j = paramInputStream.read();
    return paramInputStream.read() + ((i << 16) + (j << 8));
  }

  public static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
    throws IOException
  {
    int i = 0xFFFFF & paramInt3 | paramInt2 << 20;
    paramArrayOfByte[paramInt1] = (byte)((0xFF0000 & i) >> 16);
    paramArrayOfByte[(paramInt1 + 1)] = (byte)((0xFF00 & i) >> 8);
    paramArrayOfByte[(paramInt1 + 2)] = (byte)((i & 0xFF) >> 0);
  }

  public static boolean a(int paramInt)
  {
    if ((0x900000 & paramInt) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static int b(int paramInt)
  {
    return 0xFFFFF & paramInt;
  }

  public static boolean c(int paramInt)
  {
    if ((0x8 & paramInt >> 20) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}