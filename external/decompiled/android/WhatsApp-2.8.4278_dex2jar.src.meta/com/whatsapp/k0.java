package com.whatsapp;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

class k0 extends xz
{
  private static final String z;
  final Runnable a;
  final wz b;
  final qz c;

  static
  {
    char[] arrayOfChar = "Y;o".toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    if (i <= j)
    {
      z = new String(arrayOfChar).intern();
      return;
    }
    int k = arrayOfChar[j];
    int m;
    switch (j % 5)
    {
    default:
      m = 103;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar[j] = (char)(m ^ k);
      j++;
      break;
      m = 56;
      continue;
      m = 95;
      continue;
      m = 11;
      continue;
      m = 21;
    }
  }

  k0(qz paramqz, Runnable paramRunnable, wz paramwz)
  {
  }

  public void a(int paramInt)
  {
    if (this.b != null)
      this.b.a(paramInt);
  }

  public void a(c1 paramc1, String paramString)
    throws bg, IOException
  {
    Vector localVector = new Vector();
    Hashtable localHashtable = new Hashtable();
    qz.a(this.c, paramc1, localVector, localHashtable, z);
    this.c.k.a(paramString, localVector, localHashtable);
    if (this.a != null)
      this.a.run();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.k0
 * JD-Core Version:    0.6.1
 */