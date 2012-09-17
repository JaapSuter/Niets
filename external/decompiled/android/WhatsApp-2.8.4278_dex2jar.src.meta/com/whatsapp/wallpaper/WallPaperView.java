package com.whatsapp.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.whatsapp.g5;

public class WallPaperView extends ImageView
{
  private static final String[] z;
  private Rect currRect;
  private boolean redraw;
  private boolean reset;
  private Bitmap srcBitmap;

  static
  {
    String[] arrayOfString = new String[5];
    char[] arrayOfChar1 = "U\023|\036GPV{\004GI\021}\b\034".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    char[] arrayOfChar4;
    int i9;
    char[] arrayOfChar5;
    int i13;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "U\023|\036GPL".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "T\023lLIU\037\005H".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label365;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "I\0318\037EF\032}LSW".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label457;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\007\n8".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label549;
        arrayOfString[4] = new String(arrayOfChar5).intern();
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
        m = 38;
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
        m = 39;
        continue;
        m = 118;
        continue;
        m = 24;
        continue;
        m = 108;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 38;
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
      i3 = 39;
      continue;
      i3 = 118;
      continue;
      i3 = 24;
      continue;
      i3 = 108;
    }
    label365: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 38;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i5] = (char)(i7 ^ i6);
      i5++;
      break;
      i7 = 39;
      continue;
      i7 = 118;
      continue;
      i7 = 24;
      continue;
      i7 = 108;
    }
    label457: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 38;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i9] = (char)(i11 ^ i10);
      i9++;
      break;
      i11 = 39;
      continue;
      i11 = 118;
      continue;
      i11 = 24;
      continue;
      i11 = 108;
    }
    label549: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 38;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i13] = (char)(i15 ^ i14);
      i13++;
      break;
      i15 = 39;
      continue;
      i15 = 118;
      continue;
      i15 = 24;
      continue;
      i15 = 108;
    }
  }

  public WallPaperView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public void a()
  {
    this.reset = false;
    setImageDrawable(null);
    if (this.srcBitmap != null)
      this.srcBitmap.recycle();
    this.srcBitmap = null;
    invalidate();
  }

  public void a(Drawable paramDrawable)
  {
    this.reset = true;
    this.srcBitmap = ((BitmapDrawable)paramDrawable).getBitmap();
    setImageBitmap(this.srcBitmap);
    invalidate();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    boolean bool = ImageViewTouchBase.a;
    int i = getMeasuredWidth();
    int j = getMeasuredHeight();
    this.redraw = false;
    if (this.currRect == null)
    {
      g5.b(z[1] + i + z[4] + j);
      this.currRect = new Rect(0, 0, i, j);
      this.redraw = true;
      if (!bool);
    }
    else if ((this.currRect.width() != i) || (this.currRect.height() != j))
    {
      this.currRect = new Rect(0, 0, i, j);
      g5.b(z[0] + i + z[4] + j);
      this.redraw = true;
    }
    super.onDraw(paramCanvas);
    if (((this.redraw) || (this.reset)) && (j > 0) && (i > 0) && (this.srcBitmap != null))
      if ((i > this.srcBitmap.getWidth()) && (j > this.srcBitmap.getHeight()))
      {
        g5.d(z[3]);
        if (!bool);
      }
      else if ((i == this.srcBitmap.getWidth()) && (j == this.srcBitmap.getHeight()))
      {
        g5.c(z[2]);
        if (!bool);
      }
      else
      {
        if ((i != this.srcBitmap.getWidth()) || (j >= this.srcBitmap.getHeight()))
          break label306;
      }
    while (true)
    {
      this.reset = false;
      return;
      label306: if ((i >= this.srcBitmap.getWidth()) || (j >= this.srcBitmap.getHeight()));
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.wallpaper.WallPaperView
 * JD-Core Version:    0.6.1
 */