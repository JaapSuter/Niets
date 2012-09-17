package com.whatsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Process;
import android.view.View;
import android.view.View.OnClickListener;

class qo
  implements View.OnClickListener
{
  private static final String z;
  final d a;

  static
  {
    char[] arrayOfChar = "EF05{MLz4qP\\=)sW\006\020\006@aw\007\002@pa\032��G".toCharArray();
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
      m = 20;
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
      m = 36;
      continue;
      m = 40;
      continue;
      m = 84;
      continue;
      m = 71;
    }
  }

  qo(d paramd)
  {
  }

  public void onClick(View paramView)
  {
    this.a.b.startActivity(new Intent(z));
    this.a.b.finish();
    Process.killProcess(Process.myPid());
  }
}