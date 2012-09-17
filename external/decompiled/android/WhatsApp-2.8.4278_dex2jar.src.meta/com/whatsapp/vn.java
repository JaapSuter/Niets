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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.vn
 * JD-Core Version:    0.6.1
 */