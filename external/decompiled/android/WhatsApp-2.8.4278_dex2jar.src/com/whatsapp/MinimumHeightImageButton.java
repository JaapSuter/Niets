package com.whatsapp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class MinimumHeightImageButton extends ImageButton
{
  static int minimunHeight;
  private static final String z;
  private Context mContext;

  static
  {
    char[] arrayOfChar = "\025Bj8W\t".toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    if (i <= j)
    {
      z = new String(arrayOfChar).intern();
      minimunHeight = 0;
      return;
    }
    int k = arrayOfChar[j];
    int m;
    switch (j % 5)
    {
    default:
      m = 63;
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
      m = 125;
      continue;
      m = 39;
      continue;
      m = 3;
      continue;
      m = 95;
    }
  }

  public MinimumHeightImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    int i = 0;
    do
    {
      if (i >= paramAttributeSet.getAttributeCount())
        break;
      if (paramAttributeSet.getAttributeName(i).equals(z))
      {
        String str = paramAttributeSet.getAttributeValue(i);
        minimunHeight = (int)(Integer.parseInt(str.substring(0, str.indexOf("."))) * j4.a(paramContext).d);
        if (!bool)
          break;
      }
      i++;
    }
    while (!bool);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    float f = getDrawable().getIntrinsicHeight() + j4.a(this.mContext).K;
    int i = (int)(getDrawable().getIntrinsicWidth() + j4.a(this.mContext).K);
    if (f < minimunHeight)
      f = minimunHeight;
    setMeasuredDimension(i, (int)f);
  }
}