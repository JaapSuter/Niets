package com.whatsapp;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

final class nd extends Handler
{
  private void a(String paramString)
  {
    zq localzq = App.w.a(paramString, null);
    if (localzq != null)
      localzq.j();
    App.e(paramString);
  }

  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 1:
      do
      {
        return;
        a((String)paramMessage.obj);
      }
      while (!DialogToastListActivity.f);
    case 2:
    }
    String str = (String)paramMessage.obj;
    a(str);
    App.b(str, paramMessage.arg1);
    Context localContext = App.Mb.getApplicationContext();
    App localApp = App.Mb;
    if (eu.f(str));
    for (int i = 2131296642; ; i = 2131296643)
    {
      App.a(localContext, localApp.getString(i), 0);
      break;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.nd
 * JD-Core Version:    0.6.1
 */