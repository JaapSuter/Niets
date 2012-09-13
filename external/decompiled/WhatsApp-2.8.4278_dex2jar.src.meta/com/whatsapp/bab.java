package com.whatsapp;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class bab<K, V> extends LinkedHashMap<K, V>
{
  private int a;

  public bab(int paramInt)
  {
    super(1 + (int)Math.ceil(paramInt / 0.75F), 0.75F, true);
    this.a = paramInt;
  }

  protected boolean removeEldestEntry(Map.Entry<K, V> paramEntry)
  {
    if (size() > this.a);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.bab
 * JD-Core Version:    0.6.1
 */