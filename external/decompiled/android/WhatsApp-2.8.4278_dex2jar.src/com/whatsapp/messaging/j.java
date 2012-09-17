package com.whatsapp.messaging;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.g5;

class j extends Handler
{
  private static final String[] z;
  final MessageService a;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "pV7\033V{^5\035\020k^h\007\026oR)D\raV\"\004\f|\024\"\023\taI\"\017".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "pV7\033V{^5\035\020k^h\007\026oR)D\raV\"\004\f|\0244\037\030zO".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "pV7\033V{^5\035\020k^h\007\026oR)D\raV\"\004\f|\0244\037\026x".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label289;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 121;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[j] = (char)(m ^ k);
        j++;
        break;
        m = 8;
        continue;
        m = 59;
        continue;
        m = 71;
        continue;
        m = 107;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 121;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i1] = (char)(i3 ^ i2);
      i1++;
      break;
      i3 = 8;
      continue;
      i3 = 59;
      continue;
      i3 = 71;
      continue;
      i3 = 107;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 121;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i5] = (char)(i7 ^ i6);
      i5++;
      break;
      i7 = 8;
      continue;
      i7 = 59;
      continue;
      i7 = 71;
      continue;
      i7 = 107;
    }
  }

  j(MessageService paramMessageService)
  {
  }

  public void a()
  {
    g5.b(z[2]);
    removeMessages(0);
  }

  public void a(long paramLong)
  {
    g5.b(z[1]);
    sendEmptyMessageDelayed(0, paramLong);
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
      g5.d(z[0]);
      if (MessageService.n(this.a))
        MessageService.o(this.a).h();
    }
  }
}