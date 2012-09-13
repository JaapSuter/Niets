package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class hk
  implements AdapterView.OnItemClickListener
{
  final ContactPicker a;

  hk(ContactPicker paramContactPicker)
  {
  }

  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    boolean bool = DialogToastListActivity.f;
    if (ContactPicker.b(this.a, paramInt))
    {
      App.a(this.a, this.a);
      if (!bool);
    }
    else if (ContactPicker.c(this.a, paramInt))
    {
      ContactPicker.l(this.a);
      if (!bool);
    }
    else
    {
      if (!ContactPicker.d(this.a, paramInt))
        break label67;
    }
    while (true)
    {
      return;
      label67: ContactPicker.a(this.a, ContactPicker.i(this.a).a(paramInt));
    }
  }
}