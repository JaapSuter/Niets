package com.whatsapp;

import java.util.ArrayList;

class mj
  implements Runnable
{
  final ArrayList a;
  final y b;

  mj(y paramy, ArrayList paramArrayList)
  {
  }

  public void run()
  {
    if (!this.b.isCancelled())
      ContactInfo.b(this.b.a, this.a);
  }
}