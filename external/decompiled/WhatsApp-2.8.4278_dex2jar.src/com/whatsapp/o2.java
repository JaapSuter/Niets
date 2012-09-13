package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class o2
  implements View.OnClickListener
{
  final SetStatus a;

  o2(SetStatus paramSetStatus)
  {
  }

  public void onClick(View paramView)
  {
    this.a.showDialog(50);
  }
}