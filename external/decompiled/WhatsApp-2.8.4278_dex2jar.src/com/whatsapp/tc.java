package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

public class tc extends Handler
{
  public static void a(Messenger paramMessenger)
  {
    try
    {
      paramMessenger.send(Message.obtain(null, 0));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
  }

  public static void a(Messenger paramMessenger, Message paramMessage)
  {
    paramMessage.what = 5;
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

  public static void a(Messenger paramMessenger, cg paramcg)
  {
    try
    {
      paramMessenger.send(Message.obtain(null, 2, paramcg));
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
      paramMessenger.send(Message.obtain(null, 1));
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

  public static void d(Messenger paramMessenger)
  {
    try
    {
      paramMessenger.send(Message.obtain(null, 4));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
  }

  public static void e(Messenger paramMessenger)
  {
    try
    {
      paramMessenger.send(Message.obtain(null, 7));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
  }

  public static void f(Messenger paramMessenger)
  {
    try
    {
      paramMessenger.send(Message.obtain(null, 8));
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
    case 3:
    case 4:
    case 6:
    case 7:
    case 8:
    case 5:
    }
    while (true)
    {
      return;
      App.Fb();
      continue;
      App.Gb();
      continue;
      App.b((cg)paramMessage.obj);
      continue;
      App.Hb();
      continue;
      App.Ib();
      continue;
      App.Jb();
      continue;
      App.Kb();
      continue;
      App.Lb();
      continue;
      App.b(paramMessage);
    }
  }
}