package com.whatsapp;

import android.view.View;
import android.view.View.OnLongClickListener;

class ao
  implements View.OnLongClickListener
{
  final df a;

  ao(df paramdf)
  {
  }

  public boolean onLongClick(View paramView)
  {
    if (df.a(this.a).file == null)
      df.a(this.a).file = App.a(this.a.o);
    App.a(this.a.getContext(), df.a(this.a).file, this.a.o.l);
    return true;
  }
}