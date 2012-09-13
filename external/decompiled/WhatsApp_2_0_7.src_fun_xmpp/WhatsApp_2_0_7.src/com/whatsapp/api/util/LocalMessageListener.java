package com.whatsapp.api.util;

public abstract interface LocalMessageListener
{
  public abstract void localMessageReceived(byte[] paramArrayOfByte, byte paramByte);

  public abstract void connectionClosed(int paramInt);
}

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.util.LocalMessageListener
 * JD-Core Version:    0.6.0
 */