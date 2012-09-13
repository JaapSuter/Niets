package com.whatsapp;

import android.content.Intent;

class o8 extends Thread
{
  private static final String z;
  final Intent a;
  final BlockList b;

  static
  {
    char[] arrayOfChar = "\013>P\003\003\013%".toCharArray();
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
      m = 98;
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
      m = 104;
      continue;
      m = 81;
      continue;
      m = 62;
      continue;
      m = 119;
    }
  }

  o8(BlockList paramBlockList, Intent paramIntent)
  {
  }

  public void run()
  {
    try
    {
      Thread.sleep(300L);
      App.a(this.b, true, this.a.getStringExtra(z));
      label24: return;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label24;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.o8
 * JD-Core Version:    0.6.1
 */