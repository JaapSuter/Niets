package com.whatsapp;

import android.graphics.Bitmap;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map.Entry;

class cab extends bab<uz, Bitmap>
{
  final m5 b;

  cab(m5 paramm5, int paramInt)
  {
    super(paramInt);
  }

  protected boolean removeEldestEntry(Map.Entry<uz, Bitmap> paramEntry)
  {
    if (super.removeEldestEntry(paramEntry))
      m5.a(this.b).put(paramEntry.getKey(), new SoftReference(paramEntry.getValue()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}