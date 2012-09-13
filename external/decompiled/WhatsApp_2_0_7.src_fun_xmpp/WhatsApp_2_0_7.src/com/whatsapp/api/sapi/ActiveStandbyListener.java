package com.whatsapp.api.sapi;

public abstract interface ActiveStandbyListener
{
  public abstract void registrationSuccess(long paramLong);

  public abstract void registrationError(long paramLong, String paramString);

  public abstract void activeStandbySystemMessageReceived(String paramString);

  public abstract void activeStandbyConnectionClosed(String paramString);

  public abstract void activated(byte paramByte, short paramShort1, short paramShort2);

  public abstract void deActivated();

  public abstract void keyPressed(String paramString);

  public abstract void updateError(long paramLong, String paramString);

  public abstract void updateSuccess(long paramLong);
}

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.sapi.ActiveStandbyListener
 * JD-Core Version:    0.6.0
 */