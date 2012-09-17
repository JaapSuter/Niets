package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

public class UnreadMsgIndicator extends View
{
  Context mContext;
  TextPaint textPaint = new TextPaint();
  String unreadCount;

  public UnreadMsgIndicator(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
  }

  public void a(int paramInt)
  {
    this.unreadCount = ("" + paramInt);
    invalidate();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    int i = 0;
    float f = 0.0F;
    boolean bool = DialogToastListActivity.f;
    Paint localPaint = new Paint();
    localPaint.setColor(Color.rgb(121, 129, 137));
    localPaint.setAntiAlias(true);
    paramCanvas.drawRoundRect(new RectF(0.0F, 0.0F, getWidth(), getHeight()), j4.a(this.mContext).G, j4.a(this.mContext).G, localPaint);
    this.textPaint.setAntiAlias(true);
    this.textPaint.setColor(-1);
    this.textPaint.setTextSize(j4.a(this.mContext).D);
    this.textPaint.setTypeface(Typeface.DEFAULT_BOLD);
    float[] arrayOfFloat = new float[this.unreadCount.length()];
    this.textPaint.getTextWidths(this.unreadCount, 0, this.unreadCount.length(), arrayOfFloat);
    do
    {
      if (i >= arrayOfFloat.length)
        break;
      f += arrayOfFloat[i];
      i++;
    }
    while (!bool);
    paramCanvas.drawText(this.unreadCount, j4.a(this.mContext).H - f / 2.0F, j4.a(this.mContext).I, this.textPaint);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(j4.a(this.mContext).E, j4.a(this.mContext).F);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.UnreadMsgIndicator
 * JD-Core Version:    0.6.1
 */