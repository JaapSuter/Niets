package com.whatsapp;

import android.view.animation.Interpolator;

class it
  implements Interpolator
{
  private float a = 1.3F;

  public float getInterpolation(float paramFloat)
  {
    float f = paramFloat - 1.0F;
    return 1.0F + f * f * (f * (1.0F + this.a) + this.a);
  }
}