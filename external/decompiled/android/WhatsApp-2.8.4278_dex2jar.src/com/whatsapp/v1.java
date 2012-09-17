package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

class v1
  implements View.OnClickListener
{
  final RegisterName a;

  v1(RegisterName paramRegisterName)
  {
  }

  public void onClick(View paramView)
  {
    ((CheckBox)this.a.findViewById(2131558760)).toggle();
  }
}