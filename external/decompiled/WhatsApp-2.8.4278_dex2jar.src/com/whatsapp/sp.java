package com.whatsapp;

import android.database.sqlite.SQLiteTransactionListener;
import android.os.Handler;

class sp
  implements SQLiteTransactionListener
{
  private static final String z;
  final zq a;
  final qp b;

  static
  {
    char[] arrayOfChar = "\0076A\031Z\026*N\033V\0137\\@^��=J\013\037\0076A\033^\007-\025O".toCharArray();
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
      m = 63;
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
      m = 100;
      continue;
      m = 89;
      continue;
      m = 47;
      continue;
      m = 111;
    }
  }

  sp(qp paramqp, zq paramzq)
  {
  }

  public void onBegin()
  {
  }

  public void onCommit()
  {
    App.Ib.sendEmptyMessage(1);
    g5.b(z.concat(this.a.toString()));
    g.a(false);
  }

  public void onRollback()
  {
  }
}