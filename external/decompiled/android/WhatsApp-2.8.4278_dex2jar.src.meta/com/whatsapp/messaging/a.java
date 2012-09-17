package com.whatsapp.messaging;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.g5;
import java.util.HashSet;

class a extends Handler
{
  private static final String z;
  final m a;

  static
  {
    char[] arrayOfChar = "9>hl\027\"<vr]\"'qsVn?yoL26}r\027\"?}}Jn9qx\025/<l1^.&vx\030".toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    if (i <= j)
    {
      z = new String(arrayOfChar).intern();
      return;
    }
    int k = arrayOfChar[j];
    int m;
    switch (j % 5)
    {
    default:
      m = 56;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar[j] = (char)(m ^ k);
      j++;
      break;
      m = 65;
      continue;
      m = 83;
      continue;
      m = 24;
      continue;
      m = 28;
    }
  }

  private a(m paramm)
  {
  }

  a(m paramm, u paramu)
  {
    this(paramm);
  }

  public void a()
  {
    removeMessages(0);
    m.i(this.a).clear();
  }

  public void a(String paramString)
  {
    if (m.i(this.a).remove(paramString));
    while (true)
    {
      return;
      g5.c(z + paramString);
    }
  }

  public void a(String paramString, long paramLong)
  {
    Message localMessage = Message.obtain(this, 0, paramString);
    m.i(this.a).add(paramString);
    sendMessageDelayed(localMessage, paramLong);
  }

  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 0:
    }
    while (true)
    {
      return;
      String str = (String)paramMessage.obj;
      if (m.i(this.a).remove(str))
      {
        removeMessages(0);
        m.a(this.a, true);
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.messaging.a
 * JD-Core Version:    0.6.1
 */