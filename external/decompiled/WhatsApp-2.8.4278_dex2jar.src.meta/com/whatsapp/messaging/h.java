package com.whatsapp.messaging;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

public class h extends Handler
{
  private static final String[] z;
  private final MessageService a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "Lq".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "Vo\"".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
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
        m = 80;
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
        m = 60;
        continue;
        m = 6;
        continue;
        m = 70;
        continue;
        m = 61;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 80;
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
      i3 = 60;
      continue;
      i3 = 6;
      continue;
      i3 = 70;
      continue;
      i3 = 61;
    }
  }

  public h(MessageService paramMessageService)
  {
    this.a = paramMessageService;
  }

  public static void a(Messenger paramMessenger)
  {
    Message localMessage = Message.obtain(null, 2);
    try
    {
      paramMessenger.send(localMessage);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
  }

  public static void a(Messenger paramMessenger, Message paramMessage)
  {
    paramMessage.what = 1;
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

  public static void a(Messenger paramMessenger, String paramString1, String paramString2)
  {
    Bundle localBundle = new Bundle(2);
    localBundle.putString(z[1], paramString1);
    localBundle.putString(z[0], paramString2);
    Message localMessage = Message.obtain(null, 5, localBundle);
    try
    {
      paramMessenger.send(localMessage);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
  }

  public static void a(Messenger paramMessenger1, String paramString1, String paramString2, Messenger paramMessenger2)
  {
    Bundle localBundle = new Bundle(2);
    localBundle.putString(z[1], paramString1);
    localBundle.putString(z[0], paramString2);
    Message localMessage = Message.obtain(null, 0, localBundle);
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

  public static void b(Messenger paramMessenger)
  {
    Message localMessage = Message.obtain(null, 3);
    try
    {
      paramMessenger.send(localMessage);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
  }

  public static void c(Messenger paramMessenger)
  {
    Message localMessage = Message.obtain(null, 4);
    try
    {
      paramMessenger.send(localMessage);
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
    case 2:
    case 3:
    case 1:
    case 4:
    case 5:
    }
    while (true)
    {
      return;
      Bundle localBundle2 = (Bundle)paramMessage.obj;
      MessageService.a(this.a, localBundle2.getString(z[1]), localBundle2.getString(z[0]), paramMessage.replyTo);
      continue;
      MessageService.k(this.a);
      continue;
      MessageService.l(this.a);
      continue;
      MessageService.b(this.a, paramMessage);
      continue;
      MessageService.m(this.a);
      continue;
      Bundle localBundle1 = (Bundle)paramMessage.obj;
      MessageService.a(this.a, localBundle1.getString(z[1]), localBundle1.getString(z[0]));
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.messaging.h
 * JD-Core Version:    0.6.1
 */