package com.whatsapp;

class cw
  implements Runnable
{
  final LocationPickerPopup a;

  cw(LocationPickerPopup paramLocationPickerPopup)
  {
  }

  public void run()
  {
    if (LocationPickerPopup.a(this.a) != null)
      LocationPickerPopup.a(this.a, LocationPickerPopup.a(this.a));
  }
}