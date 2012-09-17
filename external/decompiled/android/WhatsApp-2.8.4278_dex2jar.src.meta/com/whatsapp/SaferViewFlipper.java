package com.whatsapp;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ViewFlipper;

public class SaferViewFlipper extends ViewFlipper
{
  private static final String z;

  static
  {
    char[] arrayOfChar = "[Y^9=sS\032; u]_(&:^I8'\027\fzk+\027M$ qVH$'tS\024".toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    if (i <= j)
    {
      z = new String(arrayOfChar).intern();
      return;
    }
    int k = arrayOfChar[j];
    int m;
    switch (j % 5)
    {
    default:
      m = 82;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar[j] = (char)(m ^ k);
      j++;
      break;
      m = 26;
      continue;
      m = 55;
      continue;
      m = 58;
      continue;
      m = 75;
    }
  }

  public SaferViewFlipper(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  protected void onDetachedFromWindow()
  {
    try
    {
      super.onDetachedFromWindow();
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      while (true)
      {
        g5.b(z);
        super.stopFlipping();
      }
    }
    finally
    {
      super.stopFlipping();
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.SaferViewFlipper
 * JD-Core Version:    0.6.1
 */