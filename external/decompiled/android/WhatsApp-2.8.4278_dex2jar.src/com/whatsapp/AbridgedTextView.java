package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;

public class AbridgedTextView extends TextView
{
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "\0258m+".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "��:m".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 25;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[j] = (char)(m ^ k);
        j++;
        break;
        m = 46;
        continue;
        m = 20;
        continue;
        m = 67;
        continue;
        m = 11;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 25;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i1] = (char)(i3 ^ i2);
      i1++;
      break;
      i3 = 46;
      continue;
      i3 = 20;
      continue;
      i3 = 67;
      continue;
      i3 = 11;
    }
  }

  public AbridgedTextView(Context paramContext)
  {
    super(paramContext);
  }

  public AbridgedTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private boolean a(String paramString, char paramChar)
  {
    boolean bool1 = false;
    boolean bool2 = DialogToastListActivity.f;
    int i = 0;
    if (i < paramString.length())
    {
      if (paramString.charAt(i) != paramChar)
        break label33;
      bool1 = true;
    }
    while (true)
    {
      return bool1;
      label33: i++;
      if (!bool2)
        break;
    }
  }

  String a(String paramString)
  {
    boolean bool = DialogToastListActivity.f;
    TextPaint localTextPaint = new TextPaint();
    localTextPaint.setTextSize(getResources().getDimension(2131361800));
    float f = getWidth();
    float[] arrayOfFloat = new float[paramString.length()];
    localTextPaint.getTextWidths(paramString, 0, paramString.length(), arrayOfFloat);
    String str = z[0];
    int i = 0;
    int j = 2;
    int k = 0;
    int m = 0;
    int n = 0;
    do
    {
      if (n >= arrayOfFloat.length)
        break;
      m = (int)(m + arrayOfFloat[n]);
      if (a(str, paramString.charAt(n)))
        k = n;
      if (m > f)
      {
        j--;
        i = n;
        m = 0;
        n = k;
      }
      if (j == 0)
      {
        i -= 3;
        if (!bool)
          break;
      }
      n++;
    }
    while (!bool);
    if (j == 0)
      paramString = paramString.substring(0, i) + z[1];
    return paramString;
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt2, paramInt1, paramInt3, paramInt4);
    super.setText(a(super.getText().toString()));
  }
}