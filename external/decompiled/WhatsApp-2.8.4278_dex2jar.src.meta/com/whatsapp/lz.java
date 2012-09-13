package com.whatsapp;

import java.io.IOException;
import java.io.Writer;

public class lz
  implements e1
{
  e1 a;
  Writer b;
  f1 c;
  String d;

  public lz(e1 parame1, Writer paramWriter, String paramString)
    throws IOException
  {
    this.a = parame1;
    this.b = paramWriter;
    this.c = new j1(this.b);
    this.d = paramString;
  }

  public c1 a()
    throws bg, IOException
  {
    c1 localc1 = this.a.a();
    try
    {
      this.b.write(this.d);
      this.c.a(localc1);
      label31: return localc1;
    }
    catch (Throwable localThrowable)
    {
      break label31;
    }
  }

  public void a(g1 paramg1)
  {
    this.a.a(paramg1);
  }

  public void b()
    throws IOException, bg
  {
    this.a.b();
  }

  public String c()
  {
    return this.a.c();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.lz
 * JD-Core Version:    0.6.1
 */