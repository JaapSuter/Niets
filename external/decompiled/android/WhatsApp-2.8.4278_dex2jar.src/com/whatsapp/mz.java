package com.whatsapp;

import java.io.IOException;
import java.io.Writer;

public class mz
  implements f1
{
  Writer a;
  f1 b;
  f1 c;
  String d;

  public mz(f1 paramf1, Writer paramWriter, String paramString)
    throws IOException
  {
    this.c = paramf1;
    this.a = paramWriter;
    this.b = new j1(this.a);
    this.d = paramString;
  }

  public void a()
    throws IOException
  {
    this.c.a();
    this.a.write(this.d);
    this.b.a();
  }

  public void a(c1 paramc1)
    throws IOException
  {
    this.c.a(paramc1);
    try
    {
      this.a.write(this.d);
      this.b.a(paramc1);
      label31: return;
    }
    catch (Throwable localThrowable)
    {
      break label31;
    }
  }

  public void a(c1 paramc1, boolean paramBoolean)
    throws IOException
  {
    this.c.a(paramc1, paramBoolean);
    try
    {
      this.a.write(this.d);
      this.b.a(paramc1);
      label32: return;
    }
    catch (Throwable localThrowable)
    {
      break label32;
    }
  }

  public void a(g1 paramg1)
  {
    this.c.a(paramg1);
  }

  public void a(String paramString1, String paramString2)
    throws IOException
  {
    this.c.a(paramString1, paramString2);
    this.a.write(this.d);
    this.b.a(paramString1, paramString2);
  }
}