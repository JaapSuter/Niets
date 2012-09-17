package com.whatsapp;

import android.app.Activity;
import java.util.ArrayList;

class kn
  implements Runnable
{
  final ArrayList a;
  final t8 b;

  kn(t8 paramt8, ArrayList paramArrayList)
  {
  }

  public void run()
  {
    this.b.d.removeDialog(this.b.e);
    if (this.a != null)
    {
      gp.a(this.b.d, this.b.a, this.a);
      if (!DialogToastListActivity.f);
    }
    else
    {
      this.b.d.showDialog(this.b.f);
    }
  }
}