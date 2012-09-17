package com.whatsapp;

import java.util.ArrayList;

class lj
  implements Runnable
{
  final ArrayList a;
  final y b;

  lj(y paramy, ArrayList paramArrayList)
  {
  }

  public void run()
  {
    if (!this.b.isCancelled())
      ContactInfo.a(this.b.a, this.a);
  }
}