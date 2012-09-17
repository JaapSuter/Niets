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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ui
 * JD-Core Version:    0.6.1
 */