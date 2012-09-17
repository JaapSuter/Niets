package com.whatsapp;

final class o5
  implements Runnable
{
  final String a;

  o5(String paramString)
  {
  }

  public void run()
  {
    if (Conversations.a())
      Conversations.b().d(this.a);
  }
}