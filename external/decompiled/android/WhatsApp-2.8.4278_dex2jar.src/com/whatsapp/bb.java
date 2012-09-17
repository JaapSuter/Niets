package com.whatsapp;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;

class bb extends AsyncTask<Void, Void, String>
{
  private String a;
  private Handler b;
  private Runnable c;
  private long d;
  final Conversation e;

  public bb(Conversation paramConversation, String paramString)
  {
    this.a = paramString;
    this.d = SystemClock.uptimeMillis();
  }

  static String a(bb parambb)
  {
    return parambb.a;
  }

  protected String a(Void[] paramArrayOfVoid)
  {
    return eu.j(this.a);
  }

  protected void a()
  {
    super.cancel(false);
    if (this.b != null)
      this.b.removeCallbacks(this.c);
    this.b = null;
    this.c = null;
  }

  protected void a(String paramString)
  {
    if (this.a.equals(this.e.Qb.b))
    {
      this.b = new Handler();
      this.c = new ln(this, paramString);
      this.b.postAtTime(this.c, 3000L + this.d);
    }
  }
}