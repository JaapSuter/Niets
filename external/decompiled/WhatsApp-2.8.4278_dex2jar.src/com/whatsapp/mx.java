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