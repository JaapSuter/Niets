package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

public class DividerView extends TextView
{
  Context context;

  public DividerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    new Paint().setColor(j4.a(this.context).e);
    Rect localRect = new Rect(0, 0, getMeasuredWidth(), getMeasuredHeight());
    Drawable localDrawable = this.context.getResources().getDrawable(2130837574);
    localDrawable.setBounds(localRect);
    localDrawable.setDither(true);
    localDrawable.draw(paramCanvas);
    super.onDraw(paramCanvas);
  }
}