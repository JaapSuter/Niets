package com.whatsapp.messaging;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.whatsapp.g5;
import java.util.ArrayList;

public class d extends Handler
{
  private static final String[] z;
  private final m a;

  static
  {
    String[] arrayOfString = new String[5];
    char[] arrayOfChar1 = "Zn\001\t\031A{\023\036".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    char[] arrayOfChar4;
    int i9;
    char[] arrayOfChar5;
    int i13;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "Yw\004".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "Rh\001\004\021R|\f\b".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label365;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "Ci".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label457;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "Ks\020\035RPq\016\003\030Pj\t\002\023\034l\005\016\013\034}\017\003\023V}\024".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label549;
        arrayOfString[4] = new String(arrayOfChar5).intern();
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
        m = 125;
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
        m = 51;
        continue;
        m = 30;
        continue;
        m = 96;
        continue;
        m = 109;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 125;
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
      i3 = 51;
      continue;
      i3 = 30;
      continue;
      i3 = 96;
      continue;
      i3 = 109;
    }
    label365: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 125;
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
      i7 = 51;
      continue;
      i7 = 30;
      continue;
      i7 = 96;
      continue;
      i7 = 109;
    }
    label457: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 125;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i9] = (char)(i11 ^ i10);
      i9++;
      break;
      i11 = 51;
      continue;
      i11 = 30;
      continue;
      i11 = 96;
      continue;
      i11 = 109;
    }
    label549: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 125;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i13] = (char)(i15 ^ i14);
      i13++;
      break;
      i15 = 51;
      continue;
      i15 = 30;
      continue;
      i15 = 96;
      continue;
      i15 = 109;
    }
  }

  public d(m paramm)
  {
    this.a = paramm;
  }

  public static void a(Messenger paramMessenger)
  {
    try
    {
      paramMessenger.send(Message.obtain(null, 5));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
  }

  public static void a(Messenger paramMessenger, Message paramMessage)
  {
    paramMessage.what = 3;
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

  public static void a(Messenger paramMessenger, String paramString1, String paramString2, ArrayList<String> paramArrayList, boolean paramBoolean)
  {
    Bundle localBundle = new Bundle(2);
    localBundle.putString(z[1], paramString1);
    localBundle.putString(z[3], paramString2);
    localBundle.putStringArrayList(z[0], paramArrayList);
    localBundle.putBoolean(z[2], paramBoolean);
    try
    {
      paramMessenger.send(Message.obtain(null, 0, localBundle));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
  }

  public static void a(Messenger paramMessenger, boolean paramBoolean)
  {
    int i = 1;
    if ((!paramBoolean) || (MessageService.C != 0))
      i = 0;
    try
    {
      paramMessenger.send(Message.obtain(null, 1, i, 0));
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
      paramMessenger.send(Message.obtain(null, 2));
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
      paramMessenger.send(Message.obtain(null, 4));
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
    case 5:
    case 6:
    case 2:
    case 3:
    case 4:
    case 7:
    }
    while (true)
    {
      return;
      g5.b(z[4]);
      Bundle localBundle = (Bundle)paramMessage.obj;
      m.a(this.a, localBundle.getString(z[1]), localBundle.getString(z[3]), localBundle.getStringArrayList(z[0]), localBundle.getBoolean(z[2]));
      continue;
      m localm = this.a;
      if (paramMessage.arg1 == 1);
      for (boolean bool = true; ; bool = false)
      {
        m.a(localm, bool);
        break;
      }
      m.e(this.a);
      continue;
      m.f(this.a);
      continue;
      m.g(this.a);
      continue;
      m.b(this.a, paramMessage);
      continue;
      m.c(this.a, paramMessage);
      continue;
      m.d(this.a, paramMessage);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.messaging.d
 * JD-Core Version:    0.6.1
 */