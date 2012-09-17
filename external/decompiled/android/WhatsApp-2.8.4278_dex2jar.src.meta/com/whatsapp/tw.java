package com.whatsapp;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import java.lang.ref.SoftReference;
import java.util.HashMap;

class tw
  implements Runnable
{
  Uri a;
  int b;
  sz c;
  int d;
  final MediaGalleryImageView e;

  public tw(MediaGalleryImageView paramMediaGalleryImageView, sz paramsz, int paramInt1, Uri paramUri, int paramInt2)
  {
    this.a = paramUri;
    this.b = paramInt2;
    this.c = paramsz;
    this.d = paramInt1;
  }

  public int hashCode()
  {
    return (int)System.currentTimeMillis();
  }

  public void run()
  {
    SoftReference localSoftReference = (SoftReference)MediaGalleryImageView.tempBitmaps.get(this.c.b);
    if (localSoftReference != null);
    for (Bitmap localBitmap = (Bitmap)localSoftReference.get(); ; localBitmap = null)
    {
      if (localBitmap == null)
      {
        BitmapFactory.Options localOptions = new BitmapFactory.Options();
        localOptions.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(this.a.getPath(), localOptions);
        localOptions.inSampleSize = Math.min(localOptions.outWidth / this.b, localOptions.outHeight / this.b);
        localOptions.inJustDecodeBounds = false;
        localOptions.inInputShareable = true;
        localOptions.inPurgeable = true;
        localBitmap = BitmapFactory.decodeFile(this.a.getPath(), localOptions);
        MediaGalleryImageView.tempBitmaps.put(this.c.b, new SoftReference(localBitmap));
      }
      if (localBitmap != null)
      {
        MediaGallery localMediaGallery = MediaGallery.g;
        if (localMediaGallery != null)
          localMediaGallery.runOnUiThread(new uw(this, localBitmap));
      }
      return;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.tw
 * JD-Core Version:    0.6.1
 */