package com.whatsapp;

import android.os.AsyncTask;

final class u extends AsyncTask<Void, Void, byte[]>
{
  final sz a;

  u(sz paramsz)
  {
  }

  protected void a(byte[] paramArrayOfByte)
  {
    ((MediaData)this.a.t).transferring = false;
    this.a.h = 1;
    this.a.a(paramArrayOfByte);
    fq localfq = App.z;
    sz localsz = this.a;
    if (paramArrayOfByte != null);
    for (boolean bool = true; ; bool = false)
    {
      localfq.a(localsz, bool, -1);
      return;
    }
  }

  protected byte[] a(Void[] paramArrayOfVoid)
  {
    return mb.a(this.a.q, this.a.r);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.u
 * JD-Core Version:    0.6.1
 */