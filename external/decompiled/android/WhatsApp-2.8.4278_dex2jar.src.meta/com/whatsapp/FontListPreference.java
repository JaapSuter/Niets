package com.whatsapp;

import android.content.Context;
import android.preference.ListPreference;
import android.util.AttributeSet;

public class FontListPreference extends ListPreference
{
  static int a = 0;
  public static final int b = -2;
  public static final int c = 4;

  public FontListPreference(Context paramContext)
  {
    super(paramContext);
  }

  public FontListPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public boolean persistString(String paramString)
  {
    a = Integer.parseInt(paramString);
    return super.persistString(paramString);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.FontListPreference
 * JD-Core Version:    0.6.1
 */