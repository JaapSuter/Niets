package com.whatsapp;

import java.util.Vector;

class j9 extends Thread
{
  final String a;
  final String b;
  final Vector c;
  final EditGroupSubject d;

  j9(EditGroupSubject paramEditGroupSubject, String paramString1, String paramString2, Vector paramVector)
  {
  }

  public void run()
  {
    try
    {
      Thread.sleep(300L);
      App.a(new ju(this.a, this.b, this.c, 13));
      label30: return;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label30;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.j9
 * JD-Core Version:    0.6.1
 */