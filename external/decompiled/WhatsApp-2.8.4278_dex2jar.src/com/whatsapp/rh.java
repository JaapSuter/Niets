package com.whatsapp;

import java.util.ArrayList;

final class rh
  implements Runnable
{
  final zq a;

  rh(zq paramzq)
  {
  }

  public void run()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this.a);
    App.w.a(localArrayList);
  }
}