package com.google.i18n.phonenumbers;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

class RegexCache$LRUCache$1 extends LinkedHashMap<K, V>
{
  RegexCache$LRUCache$1(RegexCache.LRUCache paramLRUCache, int paramInt, float paramFloat, boolean paramBoolean)
  {
    super(paramInt, paramFloat, paramBoolean);
  }

  protected boolean removeEldestEntry(Map.Entry<K, V> paramEntry)
  {
    if (size() > RegexCache.LRUCache.access$000(this.this$0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.google.i18n.phonenumbers.RegexCache.LRUCache.1
 * JD-Core Version:    0.6.1
 */