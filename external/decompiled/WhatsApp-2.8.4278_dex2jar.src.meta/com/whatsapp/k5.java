package com.whatsapp;

import android.os.Handler.Callback;
import android.os.Message;

public class k5
  implements Handler.Callback
{
  private boolean a;

  public k5(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  public void a()
  {
    this.a = true;
  }

  public void b()
  {
    this.a = false;
  }

  public boolean handleMessage(Message paramMessage)
  {
    if (this.a);
    return this.a;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.k5
 * JD-Core Version:    0.6.1
 */