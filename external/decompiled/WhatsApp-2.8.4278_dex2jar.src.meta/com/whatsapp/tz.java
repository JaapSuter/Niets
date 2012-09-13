package com.whatsapp;

public class tz
{
  private static final String z;
  private sz a;
  private String b;
  private String c;
  private Boolean d;
  private String e;
  private Boolean f;
  private String g;
  private byte[] h;
  private Integer i;
  private Long j;
  private Boolean k;
  private Byte l;
  private Long m;
  private String n;
  private Integer o;
  private String p;
  private String q;
  private String r;
  private Double s;
  private Double t;
  private String u;

  static
  {
    char[] arrayOfChar = "\"g\rD+!i^E'>{\027E'+.\016E-?k\fC;ol\033Q-=k^^,<z\037Y6&o\n^,(.\020R5og\020T-\"g\020Pb\"k\rD#(k".toCharArray();
    int i1 = arrayOfChar.length;
    int i2 = 0;
    if (i1 <= i2)
    {
      z = new String(arrayOfChar).intern();
      return;
    }
    int i3 = arrayOfChar[i2];
    int i4;
    switch (i2 % 5)
    {
    default:
      i4 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar[i2] = (char)(i4 ^ i3);
      i2++;
      break;
      i4 = 79;
      continue;
      i4 = 14;
      continue;
      i4 = 126;
      continue;
      i4 = 55;
    }
  }

  public tz a(byte paramByte)
  {
    this.l = new Byte(paramByte);
    return this;
  }

  public tz a(int paramInt)
  {
    this.i = new Integer(paramInt);
    return this;
  }

  public tz a(long paramLong)
  {
    this.j = new Long(paramLong);
    return this;
  }

  public tz a(uz paramuz)
  {
    this.b = paramuz.a;
    if (paramuz.b);
    for (Boolean localBoolean = Boolean.TRUE; ; localBoolean = Boolean.FALSE)
    {
      this.d = localBoolean;
      this.e = paramuz.c;
      return this;
    }
  }

  public tz a(Boolean paramBoolean)
  {
    this.k = paramBoolean;
    return this;
  }

  public tz a(Double paramDouble)
  {
    this.s = paramDouble;
    return this;
  }

  public tz a(String paramString)
  {
    this.c = paramString;
    return this;
  }

  public tz a(boolean paramBoolean)
  {
    if (paramBoolean);
    for (Boolean localBoolean = Boolean.TRUE; ; localBoolean = Boolean.FALSE)
    {
      this.f = localBoolean;
      return this;
    }
  }

  public tz a(byte[] paramArrayOfByte)
  {
    this.h = paramArrayOfByte;
    return this;
  }

  public Byte a()
  {
    return this.l;
  }

  public tz b()
    throws UnsupportedOperationException
  {
    if ((this.b == null) || (this.d == null) || (this.e == null))
      throw new UnsupportedOperationException(z);
    this.a = new sz(new uz(this.b, this.d.booleanValue(), this.e));
    return this;
  }

  public tz b(int paramInt)
  {
    this.o = new Integer(paramInt);
    return this;
  }

  public tz b(long paramLong)
  {
    this.m = new Long(paramLong);
    return this;
  }

  public tz b(Double paramDouble)
  {
    this.t = paramDouble;
    return this;
  }

  public tz b(String paramString)
  {
    this.g = paramString;
    return this;
  }

  public sz c()
  {
    if (this.a == null);
    for (sz localsz = null; ; localsz = this.a)
    {
      return localsz;
      if ((this.b != null) && (this.d != null) && (this.e != null))
        this.a.b = new uz(this.b, this.d.booleanValue(), this.e);
      if (this.c != null)
        this.a.c = this.c;
      if (this.f != null)
        this.a.e = this.f.booleanValue();
      if (this.g != null)
        this.a.b(this.g);
      if (this.h != null)
        this.a.a(this.h);
      if (this.i != null)
        this.a.h = this.i.intValue();
      if (this.j != null)
        this.a.i = this.j.longValue();
      if (this.k != null)
        this.a.v = this.k.booleanValue();
      if (this.l != null)
        this.a.l = this.l.byteValue();
      if (this.m != null)
        this.a.m = this.m.longValue();
      if (this.n != null)
        this.a.n = this.n;
      if (this.o != null)
        this.a.o = this.o.intValue();
      if (this.p != null)
        this.a.j = this.p;
      if (this.q != null)
        this.a.k = this.q;
      if (this.r != null)
        this.a.p = this.r;
      if (this.s != null)
        this.a.q = this.s.doubleValue();
      if (this.t != null)
        this.a.r = this.t.doubleValue();
      if (this.u != null)
        this.a.s = this.u;
    }
  }

  public tz c(String paramString)
  {
    this.n = paramString;
    return this;
  }

  public tz d(String paramString)
  {
    this.p = paramString;
    return this;
  }

  public tz e(String paramString)
  {
    this.q = paramString;
    return this;
  }

  public tz f(String paramString)
  {
    this.r = paramString;
    return this;
  }

  public tz g(String paramString)
  {
    this.u = paramString;
    return this;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.tz
 * JD-Core Version:    0.6.1
 */