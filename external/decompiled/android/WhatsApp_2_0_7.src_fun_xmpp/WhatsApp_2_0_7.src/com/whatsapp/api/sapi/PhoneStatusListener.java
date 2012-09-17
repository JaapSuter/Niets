package com.whatsapp.api.sapi;

public abstract interface PhoneStatusListener
{
  public abstract void networkChanged(String paramString);

  public abstract void phoneStatusReceived(byte paramByte, boolean paramBoolean1, String paramString, boolean paramBoolean2);

  public abstract void batteryChanged(byte paramByte, boolean paramBoolean);

  public abstract void wifiChanged(boolean paramBoolean);

  public abstract void systemMessageReceived(String paramString);

  public abstract void phoneConnectionClosed(String paramString);
}

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.sapi.PhoneStatusListener
 * JD-Core Version:    0.6.0
 */