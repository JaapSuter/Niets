package com.whatsapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import wb;

class bj
{
  boolean a = false;
  final BroadcastMessageComposer b;

  bj(BroadcastMessageComposer paramBroadcastMessageComposer)
  {
  }

  public void a()
  {
    if (!this.a)
    {
      this.b.showDialog(2);
      BroadcastMessageComposer.a(this.b);
    }
  }

  public void a(int paramInt)
  {
    ((ProgressBar)this.b.findViewById(2131558492)).setProgress(paramInt);
  }

  public void a(sz paramsz)
  {
    BroadcastMessageComposer localBroadcastMessageComposer = this.b;
    Long localLong;
    if ((paramsz.l != 5) && (paramsz.l != 4))
    {
      localLong = Long.valueOf(paramsz.m);
      BroadcastMessageComposer.a(localBroadcastMessageComposer, false, localLong);
      BroadcastMessageComposer.k = paramsz;
      if (paramsz.l == 5)
      {
        ImageView localImageView = (ImageView)this.b.findViewById(2131558488);
        ViewGroup.LayoutParams localLayoutParams = localImageView.getLayoutParams();
        if (BroadcastMessageComposer.f(this.b) < 1.0F)
        {
          localLayoutParams.width = 60;
          localLayoutParams.height = 60;
          localImageView.setLayoutParams(localLayoutParams);
        }
        if (paramsz.h != 0)
          break label151;
      }
    }
    label151: for (byte[] arrayOfByte = wb.a(paramsz.b()); ; arrayOfByte = paramsz.c())
    {
      Bitmap localBitmap = BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length);
      ((ImageView)this.b.findViewById(2131558488)).setImageBitmap(localBitmap);
      return;
      localLong = null;
      break;
    }
  }

  public void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  public boolean b()
  {
    return this.a;
  }
}