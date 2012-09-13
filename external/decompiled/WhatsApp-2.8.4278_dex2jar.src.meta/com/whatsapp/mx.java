package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;

class mx
  implements View.OnClickListener
{
  final MultipleContactPicker a;

  mx(MultipleContactPicker paramMultipleContactPicker)
  {
  }

  public void onClick(View paramView)
  {
    this.a.u.setVisibility(8);
    this.a.t.setText("");
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.mx
 * JD-Core Version:    0.6.1
 */