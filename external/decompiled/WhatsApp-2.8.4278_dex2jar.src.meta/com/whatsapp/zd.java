package com.whatsapp;

import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.SpannableString;

final class zd extends Spannable.Factory
{
  public Spannable newSpannable(CharSequence paramCharSequence)
  {
    return new g4(new SpannableString(paramCharSequence));
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.zd
 * JD-Core Version:    0.6.1
 */