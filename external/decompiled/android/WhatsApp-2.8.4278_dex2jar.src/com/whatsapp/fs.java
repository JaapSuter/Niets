package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

class fs
  implements View.OnClickListener
{
  final b a;

  fs(b paramb)
  {
  }

  public void onClick(View paramView)
  {
    if (this.a.l.getVisibility() != 0)
    {
      this.a.l.setVisibility(0);
      this.a.a(this.a.l, this.a.e);
      if (!DialogToastListActivity.f);
    }
    else
    {
      this.a.l.setVisibility(8);
      this.a.k = false;
    }
  }
}