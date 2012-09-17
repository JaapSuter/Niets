package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

class ui
  implements View.OnClickListener
{
  final BroadcastMessageComposer a;

  ui(BroadcastMessageComposer paramBroadcastMessageComposer)
  {
  }

  public void onClick(View paramView)
  {
    BroadcastMessageComposer.a(this.a);
    if (this.a.i.length() == 0)
      this.a.n.setEnabled(false);
  }
}