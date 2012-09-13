package com.whatsapp.messaging;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.g5;
import com.whatsapp.sz;

class c extends Handler
{
  private static final String z;
  final m a;

  static
  {
    char[] arrayOfChar = "cx\nX\002xz\024FHxa\023GC4x\tO_~v\037A]o:\024GC~".toCharArray();
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
      m = 45;
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
      m = 27;
      continue;
      m = 21;
      continue;
      m = 122;
      continue;
      m = 40;
    }
  }

  private c(m paramm)
  {
  }

  c(m paramm, u paramu)
  {
    this(paramm);
  }

  public void a()
  {
    removeMessages(0);
  }

  public void a(sz paramsz, long paramLong)
  {
    sendMessageDelayed(Message.obtain(this, 0, paramsz), paramLong);
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
      if (((sz)paramMessage.obj).a < 4)
      {
        g5.c(z);
        removeMessages(0);
        m.a(this.a, true);
      }
    }
  }
}