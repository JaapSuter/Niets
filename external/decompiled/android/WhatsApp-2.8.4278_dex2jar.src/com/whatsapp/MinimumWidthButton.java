package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.Button;

public class MinimumWidthButton extends Button
{
  static int minimunWidth;
  private static final String z;
  private Context mContext;

  static
  {
    char[] arrayOfChar = "K~x@\023".toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    if (i <= j)
    {
      z = new String(arrayOfChar).intern();
      minimunWidth = 0;
      return;
    }
    int k = arrayOfChar[j];
    int m;
    switch (j % 5)
    {
    default:
      m = 123;
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
      m = 60;
      continue;
      m = 23;
      continue;
      m = 28;
      continue;
      m = 52;
    }
  }

  public MinimumWidthButton(Context paramContext, AttributeSet paramAttributeSet)
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
        minimunWidth = (int)(Integer.parseInt(str.substring(0, str.indexOf("."))) * j4.a(paramContext).d);
        if (!bool)
          break;
      }
      i++;
    }
    while (!bool);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 0;
    boolean bool = DialogToastListActivity.f;
    TextPaint localTextPaint = new TextPaint();
    localTextPaint.setTextSize(getResources().getDimension(2131361800));
    localTextPaint.setTypeface(Typeface.DEFAULT_BOLD);
    float f1 = 0.0F;
    float[] arrayOfFloat = new float[getText().length()];
    localTextPaint.getTextWidths(getText(), 0, getText().length(), arrayOfFloat);
    do
    {
      if (i >= arrayOfFloat.length)
        break;
      f1 += arrayOfFloat[i];
      i++;
    }
    while (!bool);
    float f2 = f1 + j4.a(this.mContext).J;
    int j;
    int k;
    if (minimunWidth > getSuggestedMinimumWidth())
    {
      j = minimunWidth;
      k = resolveSize(getSuggestedMinimumHeight(), paramInt2);
      if (j <= f2)
        break label174;
    }
    label174: for (float f3 = j; ; f3 = f2)
    {
      setMeasuredDimension((int)f3, k);
      return;
      j = getSuggestedMinimumWidth();
      break;
    }
  }
}