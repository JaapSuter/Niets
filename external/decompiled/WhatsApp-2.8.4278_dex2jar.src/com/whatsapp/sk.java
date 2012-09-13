package com.whatsapp;

import android.view.View;
import android.widget.ScrollView;

class sk
  implements Runnable
{
  final z a;

  sk(z paramz)
  {
  }

  public void run()
  {
    View localView = this.a.a.findViewById(2131558542);
    ((ScrollView)this.a.a.findViewById(2131558541)).smoothScrollTo(0, localView.getTop());
  }
}