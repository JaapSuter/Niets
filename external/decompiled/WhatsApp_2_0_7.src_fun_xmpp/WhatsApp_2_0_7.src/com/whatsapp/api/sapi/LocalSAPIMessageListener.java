package com.whatsapp.api.sapi;

import com.nokia.mid.s40.codec.DataDecoder;

abstract interface LocalSAPIMessageListener
{
  public abstract void localSAPIMessageReceived(String paramString, DataDecoder paramDataDecoder);

  public abstract void SAPIconnectionClosed(int paramInt);

  public abstract void commonSAPIMessageReceived(String paramString);

  public abstract void SAPIready();
}

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.sapi.LocalSAPIMessageListener
 * JD-Core Version:    0.6.0
 */