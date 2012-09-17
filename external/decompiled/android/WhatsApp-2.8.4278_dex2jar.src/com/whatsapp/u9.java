package com.whatsapp;

class u9 extends Thread
{
  final s9 a;

  u9(s9 params9)
  {
  }

  public void run()
  {
    boolean bool = DialogToastListActivity.f;
    int i = 0;
    do
      while (true)
      {
        if ((!eu.j) || (i >= 45000))
          break label42;
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
    label42: if (i >= 45000)
      if (eu.f)
      {
        eu.a(true);
        if (!bool);
      }
      else
      {
        eu.a(false);
      }
  }
}