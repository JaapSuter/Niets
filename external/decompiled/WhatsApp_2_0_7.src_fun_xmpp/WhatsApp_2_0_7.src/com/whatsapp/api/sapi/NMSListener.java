package com.whatsapp.api.sapi;

public abstract interface NMSListener
{
  public abstract void NMSsystemMessageReceived(String paramString);

  public abstract void NMSServerReady();

  public abstract void NMSServerClosed(int paramInt);

  public abstract void composeEmailFailed(short paramShort, String paramString);

  public abstract void composerClosed(String paramString);
}

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.sapi.NMSListener
 * JD-Core Version:    0.6.0
 */