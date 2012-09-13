package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ew
  implements DialogInterface.OnClickListener
{
  final LocationPickerPopup a;

  ew(LocationPickerPopup paramLocationPickerPopup)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    boolean bool = DialogToastListActivity.f;
    if (paramInt == 0)
    {
      if (LocationPickerPopup.e(this.a) != null)
      {
        App.a(this.a, LocationPickerPopup.f(this.a), LocationPickerPopup.e(this.a));
        if (!bool);
      }
      else
      {
        App.e(this.a, LocationPickerPopup.f(this.a));
        if (!bool);
      }
    }
    else if (LocationPickerPopup.b(this.a) != null)
    {
      fy localfy = (fy)LocationPickerPopup.b(this.a).get(paramInt - 2);
      App.a(this.a, LocationPickerPopup.f(this.a), localfy);
    }
    this.a.finish();
  }
}