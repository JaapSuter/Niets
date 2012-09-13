package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class vn
  implements View.OnClickListener
{
  final cf a;

  private vn(cf paramcf)
  {
  }

  vn(cf paramcf, un paramun)
  {
    this(paramcf);
  }

  public void onClick(View paramView)
  {
    App.a(this.a.getContext(), this.a.o);
  }
}