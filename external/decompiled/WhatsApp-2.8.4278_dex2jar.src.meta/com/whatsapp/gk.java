package com.whatsapp;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

class gk
  implements View.OnClickListener
{
  final ContactPicker a;

  gk(ContactPicker paramContactPicker)
  {
  }

  public void onClick(View paramView)
  {
    boolean bool = DialogToastListActivity.f;
    if (ContactPicker.c(this.a) != 0)
    {
      ContactPicker.a(this.a, 0);
      ContactPicker.e(this.a).setBackgroundDrawable(this.a.getResources().getDrawable(2130837572));
      ContactPicker.d(this.a).setBackgroundDrawable(this.a.getResources().getDrawable(2130837571));
      ContactPicker.f(this.a).setBackgroundDrawable(this.a.getResources().getDrawable(2130837571));
      ContactPicker.g(this.a).setText(2131296411);
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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.gk
 * JD-Core Version:    0.6.1
 */