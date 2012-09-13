package com.whatsapp;

import android.text.GetChars;
import android.text.Spannable;
import android.text.SpannableString;

public final class g4
  implements CharSequence, GetChars, Spannable
{
  private SpannableString a;

  public g4(CharSequence paramCharSequence)
  {
    this.a = new SpannableString(paramCharSequence);
  }

  public char charAt(int paramInt)
  {
    return this.a.charAt(paramInt);
  }

  public void getChars(int paramInt1, int paramInt2, char[] paramArrayOfChar, int paramInt3)
  {
    if (paramInt1 < paramInt2)
      this.a.getChars(paramInt1, paramInt2, paramArrayOfChar, paramInt3);
  }

  public int getSpanEnd(Object paramObject)
  {
    return this.a.getSpanEnd(paramObject);
  }

  public int getSpanFlags(Object paramObject)
  {
    return this.a.getSpanFlags(paramObject);
  }

  public int getSpanStart(Object paramObject)
  {
    return this.a.getSpanStart(paramObject);
  }

  public <T> T[] getSpans(int paramInt1, int paramInt2, Class<T> paramClass)
  {
    return this.a.getSpans(paramInt1, paramInt2, paramClass);
  }

  public int length()
  {
    return this.a.length();
  }

  public int nextSpanTransition(int paramInt1, int paramInt2, Class paramClass)
  {
    return this.a.nextSpanTransition(paramInt1, paramInt2, paramClass);
  }

  public void removeSpan(Object paramObject)
  {
    this.a.removeSpan(paramObject);
  }

  public void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    this.a.setSpan(paramObject, paramInt1, paramInt2, paramInt3);
  }

  public CharSequence subSequence(int paramInt1, int paramInt2)
  {
    return this.a.subSequence(paramInt1, paramInt2);
  }

  public final String toString()
  {
    return this.a.toString();
  }
}