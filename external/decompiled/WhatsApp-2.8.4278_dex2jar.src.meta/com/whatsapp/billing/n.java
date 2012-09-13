package com.whatsapp.billing;

import android.content.Context;
import com.whatsapp.App;

final class n
  implements Runnable
{
  final Context a;
  final String b;
  final String c;
  final b d;
  final long e;
  final String f;

  n(Context paramContext, String paramString1, String paramString2, b paramb, long paramLong, String paramString3)
  {
  }

  public void run()
  {
    int i = i.b;
    j localj = new j(this.a);
    int j = localj.b(this.b, this.c, this.d, this.e, this.f);
    localj.a();
    try
    {
      if (m.a() != null)
        m.a().b(this.d, this.c, j, this.e, this.f);
      if (App.wc != 0)
        i.b = i + 1;
      return;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.billing.n
 * JD-Core Version:    0.6.1
 */