package com.whatsapp.api.sapi;

public abstract interface ProfilesListener
{
  public abstract void profilesSystemMessageReceived(String paramString);

  public abstract void profilesServerReady();

  public abstract void profilesServerClosed(int paramInt);

  public abstract void profilesInfoReceived(String paramString1, byte paramByte, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2);
}

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.sapi.ProfilesListener
 * JD-Core Version:    0.6.0
 */