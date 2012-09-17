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