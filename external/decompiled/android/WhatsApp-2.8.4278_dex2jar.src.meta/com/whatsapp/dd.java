package com.whatsapp;

import android.os.Handler;
import android.os.Message;

class dd extends Handler
{
  private static final String[] z;
  final DeleteAccountConfirmation a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = ">N��5R?J\0173R9D\0026O(FC$O7N\003%RuN\024 O(N\b".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = ">N��5R?J\0173R9D\0026O(FC4O;G\0037\013>N��5R?\006\n1O6N\b".toCharArray();
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
        m = 38;
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
        m = 90;
        continue;
        m = 43;
        continue;
        m = 108;
        continue;
        m = 80;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 38;
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
      i3 = 90;
      continue;
      i3 = 43;
      continue;
      i3 = 108;
      continue;
      i3 = 80;
    }
  }

  dd(DeleteAccountConfirmation paramDeleteAccountConfirmation)
  {
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
      g5.b(z[0]);
      if (DeleteAccountConfirmation.d() == this.a)
      {
        this.a.removeDialog(1);
        if (App.c(App.Mb) != 0)
        {
          g5.c(z[1]);
          this.a.showDialog(3);
        }
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.dd
 * JD-Core Version:    0.6.1
 */