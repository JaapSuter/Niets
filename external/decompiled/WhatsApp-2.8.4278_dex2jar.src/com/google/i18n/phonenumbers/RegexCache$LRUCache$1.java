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