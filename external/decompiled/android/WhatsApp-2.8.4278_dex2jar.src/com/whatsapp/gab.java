package com.whatsapp;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import java.util.HashMap;
import java.util.TimerTask;

class gab extends TimerTask
{
  private static final String z;
  j2 a;

  static
  {
    char[] arrayOfChar = "58/8 31\036/7#($.&\r)(07=(5r&+-$g".toCharArray();
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
      m = 82;
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
      m = 82;
      continue;
      m = 93;
      continue;
      m = 65;
      continue;
      m = 93;
    }
  }

  public gab(j2 paramj2)
  {
    this.a = paramj2;
  }

  public void run()
  {
    if (this.a.j)
      return;
    g5.b(z + this.a.f);
    this.a.i = true;
    switch (this.a.f)
    {
    default:
    case 3:
    }
    while (true)
    {
      j2.a.remove(this.a.d);
      break;
      if ((this.a.e != null) && (!this.a.e.isFinishing()))
      {
        Message localMessage = j2.b.obtainMessage(1, this.a);
        j2.b.sendMessage(localMessage);
      }
    }
  }
}