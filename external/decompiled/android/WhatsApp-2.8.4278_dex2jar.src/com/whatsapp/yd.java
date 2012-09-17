package com.whatsapp;

import android.text.Editable;
import android.text.Editable.Factory;

final class yd extends Editable.Factory
{
  public Editable newEditable(CharSequence paramCharSequence)
  {
    return new ae(paramCharSequence);
  }
}