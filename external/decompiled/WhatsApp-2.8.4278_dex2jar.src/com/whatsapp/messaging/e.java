package com.whatsapp.messaging;

import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

public class e extends Handler
{
  private final m a;
  private boolean b = false;

  public e(m paramm)
  {
    this.a = paramm;
  }

  public static void a(Messenger paramMessenger)
  {
    try
    {
      paramMessenger.send(Message.obtain(null, 1));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
  }

  public static void a(Messenger paramMessenger, Message paramMessage)
  {
    paramMessage.what = 0;
    try
    {
      paramMessenger.send(paramMessage);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
  }

  public static void b(Messenger paramMessenger)
  {
    try
    {
      paramMessenger.send(Message.obtain(null, 2));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
  }

  public static void c(Messenger paramMessenger)
  {
    try
    {
      paramMessenger.send(Message.obtain(null, 3));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
  }

  public void a()
  {
    this.b = true;
  }

  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return;
      m.a(this.a, paramMessage);
      continue;
      if (!this.b)
      {
        m.b(this.a);
        continue;
        if (!this.b)
        {
          m.c(this.a);
          continue;
          m.d(this.a);
        }
      }
    }
  }
}