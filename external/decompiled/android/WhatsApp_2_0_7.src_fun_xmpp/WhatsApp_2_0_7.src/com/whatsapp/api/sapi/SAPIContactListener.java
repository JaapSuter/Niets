package com.whatsapp.api.sapi;

import java.util.Hashtable;

public abstract interface SAPIContactListener
{
  public abstract void contactsSystemMessageReceived(String paramString);

  public abstract void contactsConnectionClosed(String paramString);

  public abstract void contactAdded(Hashtable paramHashtable);

  public abstract void contactDeleted(Hashtable paramHashtable);

  public abstract void contactUpdated(Hashtable paramHashtable);
}

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.sapi.SAPIContactListener
 * JD-Core Version:    0.6.0
 */