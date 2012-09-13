package com.whatsapp;

import android.content.Context;

final class nb extends mb
{
  final fy o;

  nb(Context paramContext, sz paramsz, bj parambj, fy paramfy)
  {
    super(paramContext, paramsz, parambj);
  }

  public Boolean a(Void[] paramArrayOfVoid)
  {
    if ((!this.o.m) && (this.o.i == null))
    {
      this.o.a();
      this.a.j = this.o.g;
      if (this.o.i != null)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        sz localsz = this.a;
        localsz.p = (localsz.p + "\n" + this.o.i);
      }
    }
    return super.a(paramArrayOfVoid);
  }
}