package com.whatsapp.messaging;

import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.whatsapp.g5;
import com.whatsapp.qz;

public class k extends Handler
{
  private static final String z;
  private final n a;

  static
  {
    char[] arrayOfChar = "R1@\005\034].Y\001VXsB\020P\\sS\032]D9S\001VN".toCharArray();
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
      m = 51;
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
      m = 42;
      continue;
      m = 92;
      continue;
      m = 48;
      continue;
      m = 117;
    }
  }

  public k(n paramn)
  {
    this.a = paramn;
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
    paramMessage.what = 2;
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

  public static void a(Messenger paramMessenger, qz paramqz)
  {
    try
    {
      paramMessenger.send(Message.obtain(null, 0, paramqz));
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
      n.a(this.a, (qz)paramMessage.obj);
      continue;
      n.c(this.a);
      continue;
      n.b(this.a, paramMessage);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.messaging.k
 * JD-Core Version:    0.6.1
 */