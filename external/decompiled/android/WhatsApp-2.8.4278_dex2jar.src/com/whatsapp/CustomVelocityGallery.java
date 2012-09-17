package com.whatsapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Gallery;

public class CustomVelocityGallery extends Gallery
{
  private pp adVelocity;

  public CustomVelocityGallery(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public void a(pp parampp)
  {
    this.adVelocity = parampp;
  }

  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    if (this.adVelocity != null)
      paramFloat1 = this.adVelocity.a(paramFloat1);
    return super.onFling(paramMotionEvent1, paramMotionEvent2, paramFloat1, paramFloat2);
  }
}