package com.whatsapp;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

class fk
  implements View.OnClickListener
{
  final ContactPicker a;

  fk(ContactPicker paramContactPicker)
  {
  }

  public void onClick(View paramView)
  {
    boolean bool = DialogToastListActivity.f;
    if (ContactPicker.c(this.a) != 1)
    {
      ContactPicker.a(this.a, 1);
      ContactPicker.d(this.a).setBackgroundDrawable(this.a.getResources().getDrawable(2130837572));
      ContactPicker.e(this.a).setBackgroundDrawable(this.a.getResources().getDrawable(2130837571));
      ContactPicker.f(this.a).setBackgroundDrawable(this.a.getResources().getDrawable(2130837571));
      ContactPicker.g(this.a).setText(2131296410);
      if (ContactPicker.h(this.a).hasTextFilter())
      {
        ContactPicker.a(this.a, ContactPicker.h(this.a).getTextFilter().toString());
        ContactPicker.i(this.a).notifyDataSetChanged();
        if (!bool);
      }
      else
      {
        String str = ContactPicker.b(this.a).getText().toString();
        if ((ContactPicker.j(this.a)) && (str != null) && (str.length() > 0))
        {
          ContactPicker.b(this.a).setText(str);
          if (!bool);
        }
        else
        {
          ContactPicker.k(this.a);
          ContactPicker.i(this.a).notifyDataSetChanged();
        }
      }
      ContactPicker.h(this.a).setSelection(0);
    }
  }
}