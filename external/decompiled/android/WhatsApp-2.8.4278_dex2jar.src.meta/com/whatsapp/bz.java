package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class bz
  implements View.OnClickListener
{
  final ProfileInfoActivity a;

  bz(ProfileInfoActivity paramProfileInfoActivity)
  {
  }

  public void onClick(View paramView)
  {
    cz localcz = new cz(this);
    String str = App.b(this.a);
    new b(this.a, 2131296693, str, localcz, 25, 0, 2131296931).show();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.bz
 * JD-Core Version:    0.6.1
 */