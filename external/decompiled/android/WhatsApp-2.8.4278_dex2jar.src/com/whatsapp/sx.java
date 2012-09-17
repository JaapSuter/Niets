package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;

class sx
  implements View.OnClickListener
{
  final je a;

  sx(je paramje)
  {
  }

  public void onClick(View paramView)
  {
    boolean bool = DialogToastListActivity.f;
    CheckBox localCheckBox = (CheckBox)paramView.findViewById(2131558725);
    zq localzq = (zq)localCheckBox.getTag();
    if (App.g(localzq.b));
    while (true)
    {
      return;
      if (localzq.l)
      {
        localCheckBox.setChecked(false);
        localzq.l = false;
        MultipleContactPicker localMultipleContactPicker3 = this.a.a;
        localMultipleContactPicker3.A = (-1 + localMultipleContactPicker3.A);
        if (!bool);
      }
      else if (this.a.a.A == MultipleContactPicker.d(this.a.a))
      {
        MultipleContactPicker localMultipleContactPicker2 = this.a.a;
        String str = this.a.a.getString(this.a.a.l);
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(MultipleContactPicker.d(this.a.a));
        localMultipleContactPicker2.c(String.format(str, arrayOfObject));
        localCheckBox.setChecked(false);
        if (!bool);
      }
      else
      {
        MultipleContactPicker localMultipleContactPicker1 = this.a.a;
        localMultipleContactPicker1.A = (1 + localMultipleContactPicker1.A);
        localCheckBox.setChecked(true);
        localzq.l = true;
      }
      MultipleContactPicker.a(this.a.a, MultipleContactPicker.e(this.a.a), this.a.a.A);
      if (this.a.a.A != 0)
      {
        this.a.a.z.setEnabled(true);
        if (!bool);
      }
      else
      {
        this.a.a.z.setEnabled(false);
      }
    }
  }
}