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