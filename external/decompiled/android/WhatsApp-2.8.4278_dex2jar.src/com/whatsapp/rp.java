package com.whatsapp;

import android.database.sqlite.SQLiteTransactionListener;
import android.os.Handler;

class rp
  implements SQLiteTransactionListener
{
  private static final String z;
  final zq a;
  final qp b;

  static
  {
    char[] arrayOfChar = "mXiX\n|DfZ\006aYt\001\016jSbJOmXiZ\016mC=\016".toCharArray();
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
      m = 111;
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
      m = 14;
      continue;
      m = 55;
      continue;
      m = 7;
      continue;
      m = 46;
    }
  }

  rp(qp paramqp, zq paramzq)
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