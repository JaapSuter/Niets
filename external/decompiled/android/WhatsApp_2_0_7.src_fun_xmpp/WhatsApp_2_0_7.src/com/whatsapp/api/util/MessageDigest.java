package com.whatsapp.api.util;

public abstract interface MessageDigest
{
  public abstract void reset();

  public abstract void update(byte[] paramArrayOfByte);

  public abstract byte[] digest();
}

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.util.MessageDigest
 * JD-Core Version:    0.6.0
 */