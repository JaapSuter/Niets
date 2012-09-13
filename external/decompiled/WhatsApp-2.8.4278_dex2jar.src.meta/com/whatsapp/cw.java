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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.cw
 * JD-Core Version:    0.6.1
 */