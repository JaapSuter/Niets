package com.whatsapp.messaging;

import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.whatsapp.g5;
import com.whatsapp.qz;
import com.whatsapp.sz;

public class f extends Handler
{
  private static final String z;
  private final m a;

  static
  {
    char[] arrayOfChar = "j\026l\023~q\024r\r4q\017u\f?=\ty��'=\fn\n%w\tC\0279`\036}\007\016`\036}\007(".toCharArray();
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
      m = 81;
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
      m = 18;
      continue;
      m = 123;
      continue;
      m = 28;
      continue;
      m = 99;
    }
  }

  public f(m paramm)
  {
    this.a = paramm;
  }

  public static void a(Messenger paramMessenger1, Messenger paramMessenger2)
  {
    Message localMessage = Message.obtain(null, 0);
    localMessage.replyTo = paramMessenger2;
    try
    {
      paramMessenger1.send(localMessage);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
  }

  public static void a(Messenger paramMessenger, qz paramqz)
  {
    try
    {
      paramMessenger.send(Message.obtain(null, 1, paramqz));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
  }

  public static void a(Messenger paramMessenger, sz paramsz)
  {
    try
    {
      paramMessenger.send(Message.obtain(null, 2, paramsz));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
  }

  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      g5.b(z);
      m.a(this.a, paramMessage.replyTo);
      continue;
      m.a(this.a, (qz)paramMessage.obj);
      continue;
      m.a(this.a, (sz)paramMessage.obj);
    }
  }
}