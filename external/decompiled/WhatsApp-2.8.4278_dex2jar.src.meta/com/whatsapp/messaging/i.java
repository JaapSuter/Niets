package com.whatsapp.messaging;

import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.whatsapp.cg;

public class i extends Handler
{
  private final MessageService a;

  public i(MessageService paramMessageService)
  {
    this.a = paramMessageService;
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

  public static void a(Messenger paramMessenger, boolean paramBoolean)
  {
    int i = 0;
    if (paramBoolean)
      i = 1;
    try
    {
      paramMessenger.send(Message.obtain(null, 4, i, 0));
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
      paramMessenger.send(Message.obtain(null, 6));
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
      paramMessenger.send(Message.obtain(null, 7));
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
      paramMessenger.send(Message.obtain(null, 3));
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
      paramMessenger.send(Message.obtain(null, 8));
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
      paramMessenger.send(Message.obtain(null, 9));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
  }

  public void handleMessage(Message paramMessage)
  {
    int i = 1;
    switch (paramMessage.what)
    {
    default:
    case 0:
    case 1:
    case 6:
    case 7:
    case 2:
    case 3:
    case 4:
    case 8:
    case 9:
    case 5:
    }
    while (true)
    {
      return;
      MessageService.a(this.a, paramMessage.replyTo);
      continue;
      MessageService.e(this.a);
      continue;
      MessageService.f(this.a);
      continue;
      MessageService.g(this.a);
      continue;
      MessageService.a(this.a, (cg)paramMessage.obj);
      continue;
      MessageService.h(this.a);
      continue;
      MessageService localMessageService = this.a;
      if (paramMessage.arg1 == i);
      while (true)
      {
        MessageService.b(localMessageService, i);
        break;
        int j = 0;
      }
      MessageService.i(this.a);
      continue;
      MessageService.j(this.a);
      continue;
      MessageService.a(this.a, paramMessage);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.messaging.i
 * JD-Core Version:    0.6.1
 */