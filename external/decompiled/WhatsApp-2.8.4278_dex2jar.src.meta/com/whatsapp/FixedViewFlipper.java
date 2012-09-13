package com.whatsapp;

import android.content.Context;
import android.widget.ViewFlipper;

public class FixedViewFlipper extends ViewFlipper
{
  public FixedViewFlipper(Context paramContext)
  {
    super(paramContext);
  }

  protected void onDetachedFromWindow()
  {
    try
    {
      super.onDetachedFromWindow();
      super.stopFlipping();
      return;
    }
    catch (Exception localException)
    {
      while (true)
        super.stopFlipping();
    }
  }

  protected void onWindowVisibilityChanged(int paramInt)
  {
    try
    {
      super.onWindowVisibilityChanged(paramInt);
      if (paramInt == 4)
        super.stopFlipping();
      return;
    }
    catch (Exception localException)
    {
      while (true)
        super.stopFlipping();
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.FixedViewFlipper
 * JD-Core Version:    0.6.1
 */