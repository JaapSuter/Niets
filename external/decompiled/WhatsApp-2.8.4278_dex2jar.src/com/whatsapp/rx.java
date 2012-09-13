package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import java.util.UnknownFormatConversionException;

class rx
  implements View.OnClickListener
{
  final je a;

  rx(je paramje)
  {
  }

  public void onClick(View paramView)
  {
    boolean bool1 = DialogToastListActivity.f;
    boolean bool2 = ((CheckBox)paramView).isChecked();
    zq localzq = (zq)paramView.getTag();
    if (App.g(localzq.b));
    while (true)
    {
      return;
      if ((!bool2) || (this.a.a.A == MultipleContactPicker.d(this.a.a)));
      try
      {
        MultipleContactPicker localMultipleContactPicker3 = this.a.a;
        String str = this.a.a.getString(this.a.a.l);
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(MultipleContactPicker.d(this.a.a));
        localMultipleContactPicker3.c(String.format(str, arrayOfObject));
        ((CheckBox)paramView).setChecked(false);
        if (bool1)
        {
          bool2 = false;
          MultipleContactPicker localMultipleContactPicker2 = this.a.a;
          localMultipleContactPicker2.A = (1 + localMultipleContactPicker2.A);
          if (bool1)
          {
            MultipleContactPicker localMultipleContactPicker1 = this.a.a;
            localMultipleContactPicker1.A = (-1 + localMultipleContactPicker1.A);
          }
          localzq.l = bool2;
          MultipleContactPicker.a(this.a.a, MultipleContactPicker.e(this.a.a), this.a.a.A);
          if (this.a.a.A != 0)
          {
            this.a.a.z.setEnabled(true);
            if (!bool1)
              continue;
          }
          this.a.a.z.setEnabled(false);
        }
      }
      catch (UnknownFormatConversionException localUnknownFormatConversionException)
      {
        while (true)
        {
          this.a.a.a(2131296869);
          continue;
          bool2 = false;
        }
      }
    }
  }
}