package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class jg
  implements View.OnClickListener
{
  final Advanced a;

  jg(Advanced paramAdvanced)
  {
  }

  public void onClick(View paramView)
  {
    App.a(this.a, 0);
    Intent localIntent = new Intent(this.a, EULA.class);
    this.a.finish();
    this.a.startActivity(localIntent);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.jg
 * JD-Core Version:    0.6.1
 */