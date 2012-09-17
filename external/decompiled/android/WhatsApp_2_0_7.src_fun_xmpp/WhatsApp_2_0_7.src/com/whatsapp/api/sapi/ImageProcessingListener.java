package com.whatsapp.api.sapi;

public abstract interface ImageProcessingListener
{
  public abstract void systemMessageReceived(String paramString);

  public abstract void imageProcessingServerReady();

  public abstract void imageProcessingServerClosed(int paramInt);

  public abstract void imageScaleComplete(byte paramByte, String paramString);

  public abstract void imageScaleError(byte paramByte, String paramString);
}

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.sapi.ImageProcessingListener
 * JD-Core Version:    0.6.0
 */