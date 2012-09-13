package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class ik
  implements View.OnClickListener
{
  final ContactPicker a;

  ik(ContactPicker paramContactPicker)
  {
  }

  public void onClick(View paramView)
  {
    this.a.onSearchRequested();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ik
 * JD-Core Version:    0.6.1
 */