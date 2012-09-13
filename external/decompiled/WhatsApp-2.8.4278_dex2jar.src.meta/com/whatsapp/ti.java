package com.whatsapp;

import android.text.method.TextKeyListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import java.util.ArrayList;

class ti
  implements View.OnClickListener
{
  final BroadcastMessageComposer a;

  ti(BroadcastMessageComposer paramBroadcastMessageComposer)
  {
  }

  public void onClick(View paramView)
  {
    BroadcastMessageComposer.l.clear();
    synchronized (new StringBuilder(this.a.i.getText()))
    {
      String str = ???.toString().trim();
      if (((str.length() > 0) || (BroadcastMessageComposer.k != null)) && (!BroadcastMessageComposer.a(this.a, true)))
      {
        TextKeyListener.clear(this.a.i.getText());
        if (this.a.r.getVisibility() == 0)
          this.a.r.setVisibility(8);
        this.a.showDialog(1);
        new x(this.a, str).execute(new Void[0]);
      }
      return;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ti
 * JD-Core Version:    0.6.1
 */