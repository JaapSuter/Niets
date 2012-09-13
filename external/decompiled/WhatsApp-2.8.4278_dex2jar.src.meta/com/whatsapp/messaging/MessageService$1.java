package com.whatsapp.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import com.whatsapp.g5;

class MessageService$1 extends BroadcastReceiver
{
  private static final String[] z;
  final MessageService a;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "9BOv\0041H\005j\016,\002Hk\0056\002hK%\026ihP\"\016e]4\033djJ,\035".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    char[] arrayOfChar4;
    int i9;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = " A[tD+IYr\002;I\004j\016,[Dv��wMHp\002.I\013".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = " A[tD+IYr\002;I\004j\016,[Dv��wBDp\002;I\013".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label324;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "6I_s\004*Gbj\r7".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label412;
        arrayOfString[3] = new String(arrayOfChar4).intern();
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
        m = 107;
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
        m = 88;
        continue;
        m = 44;
        continue;
        m = 43;
        continue;
        m = 4;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 107;
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
      i3 = 88;
      continue;
      i3 = 44;
      continue;
      i3 = 43;
      continue;
      i3 = 4;
    }
    label324: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 107;
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
      i7 = 88;
      continue;
      i7 = 44;
      continue;
      i7 = 43;
      continue;
      i7 = 4;
    }
    label412: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 107;
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
      i11 = 88;
      continue;
      i11 = 44;
      continue;
      i11 = 43;
      continue;
      i11 = 4;
    }
  }

  MessageService$1(MessageService paramMessageService)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    NetworkInfo localNetworkInfo2;
    if (paramIntent.getAction().equals(z[0]))
    {
      NetworkInfo localNetworkInfo1 = (NetworkInfo)paramIntent.getParcelableExtra(z[3]);
      localNetworkInfo2 = MessageService.a(this.a).getActiveNetworkInfo();
      g5.b(z[2] + MessageService.a(this.a, localNetworkInfo1));
      g5.b(z[1] + MessageService.a(this.a, localNetworkInfo2));
      if (localNetworkInfo2 == null)
      {
        MessageService.a(this.a, -1);
        MessageService.a(this.a, false);
        if (MessageService.C == 0);
      }
      else
      {
        if (localNetworkInfo2.getState() != NetworkInfo.State.CONNECTED)
          break label169;
      }
    }
    label169: for (boolean bool = true; ; bool = false)
    {
      MessageService.a(this.a, localNetworkInfo2.getType());
      MessageService.a(this.a, bool);
      return;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.messaging.MessageService.1
 * JD-Core Version:    0.6.1
 */