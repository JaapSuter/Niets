package com.whatsapp.messaging;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.g5;

class g extends Handler
{
  private static final String z;
  final MessageService a;

  static
  {
    char[] arrayOfChar = "C6n\006\rH>l��KX>1\032M\\4k\002\017O2s\023P\024/w\033GT.j".toCharArray();
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
      m = 34;
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
      m = 59;
      continue;
      m = 91;
      continue;
      m = 30;
      continue;
      m = 118;
    }
  }

  g(MessageService paramMessageService)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    g5.b(z);
    if (!MessageService.c(this.a))
    {
      MessageService.b(this.a);
      MessageService.c(this.a);
      if (MessageService.C == 0);
    }
    else
    {
      d.a(MessageService.d(this.a), false);
    }
  }
}