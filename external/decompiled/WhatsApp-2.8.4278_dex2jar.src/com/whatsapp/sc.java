package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.messaging.h;
import com.whatsapp.messaging.s;

final class sc extends Handler
{
  private void a(String paramString, boolean paramBoolean)
  {
    int i = 1;
    if (!hasMessages(i, paramString))
    {
      removeMessages(0, paramString);
      if ((!hasMessages(2, paramString)) && (App.yb()))
        h.a(App.zb(), s.c(paramString, paramBoolean));
      removeMessages(2, paramString);
      if (!paramBoolean)
        break label70;
    }
    while (true)
    {
      sendMessageDelayed(obtainMessage(2, i, 0, paramString), 2000L);
      return;
      label70: i = 0;
    }
  }

  private void b(String paramString, boolean paramBoolean)
  {
    if (!hasMessages(0, paramString))
    {
      if ((App.yb()) && (paramBoolean))
        h.a(App.zb(), s.h(paramString));
      removeMessages(1, paramString);
      removeMessages(2, paramString);
    }
  }

  public void handleMessage(Message paramMessage)
  {
    int i = 1;
    switch (paramMessage.what)
    {
    default:
    case 0:
      label53: 
      do
      {
        return;
        String str2 = (String)paramMessage.obj;
        if (paramMessage.arg1 != i)
          break;
        int k = i;
        a(str2, k);
      }
      while (!DialogToastListActivity.f);
    case 1:
    case 2:
    }
    String str1 = (String)paramMessage.obj;
    if (paramMessage.arg1 == i);
    while (true)
    {
      b(str1, i);
      break;
      int m = 0;
      break label53;
      int j = 0;
    }
  }
}