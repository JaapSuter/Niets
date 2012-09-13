package com.whatsapp;

import android.os.AsyncTask;

public class lb extends AsyncTask<Void, Void, Void>
{
  private static final String z;
  final Main a;

  static
  {
    char[] arrayOfChar = "k<R^&a2O_He)RF`r$".toCharArray();
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
      m = 9;
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
      m = 6;
      continue;
      m = 93;
      continue;
      m = 59;
      continue;
      m = 48;
    }
  }

  public lb(Main paramMain)
  {
  }

  protected Void a(Void[] paramArrayOfVoid)
  {
    boolean bool = DialogToastListActivity.f;
    int i = 0;
    do
      while (true)
      {
        if ((!eu.j) || (i >= 45000))
          break label44;
        i += 200;
        try
        {
          Thread.sleep(200L);
        }
        catch (InterruptedException localInterruptedException)
        {
          localInterruptedException.printStackTrace();
        }
      }
    while (!bool);
    label44: if (i >= 45000)
      if (eu.f)
      {
        eu.a(true);
        if (!bool);
      }
      else
      {
        eu.a(false);
      }
    return null;
  }

  protected void a(Void paramVoid)
  {
    this.a.removeDialog(104);
    g5.d(z);
    Main.b(this.a);
  }

  protected void onPreExecute()
  {
    if (!this.a.isFinishing())
      this.a.showDialog(104);
  }
}