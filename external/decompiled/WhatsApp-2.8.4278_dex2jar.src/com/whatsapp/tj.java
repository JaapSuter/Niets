package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;

class tj
  implements View.OnClickListener
{
  final ContactPicker a;

  tj(ContactPicker paramContactPicker)
  {
  }

  public void onClick(View paramView)
  {
    ContactPicker.a(this.a).setVisibility(8);
    ContactPicker.b(this.a).setText("");
  }
}