package com.whatsapp;

import android.graphics.Bitmap;
import android.text.format.Formatter;
import android.widget.LinearLayout;
import android.widget.ListView;

class uw
  implements Runnable
{
  private static final String[] z;
  final Bitmap a;
  final tw b;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "!Af';\023Cc\"6)V{\0213!Ee+u/El 58\004d'4(\004t'?;\036".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "?Avn,%Aut".toCharArray();
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
        m = 90;
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
        m = 76;
        continue;
        m = 36;
        continue;
        m = 2;
        continue;
        m = 78;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 90;
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
      i3 = 76;
      continue;
      i3 = 36;
      continue;
      i3 = 2;
      continue;
      i3 = 78;
    }
  }

  uw(tw paramtw, Bitmap paramBitmap)
  {
  }

  public void run()
  {
    if (this.b.e.debug)
      g5.d(z[1] + this.b.d);
    LinearLayout localLinearLayout;
    if (MediaGallery.g != null)
    {
      localLinearLayout = (LinearLayout)MediaGallery.g.n.findViewWithTag(Integer.valueOf(this.b.d));
      if (localLinearLayout != null)
        break label78;
    }
    while (true)
    {
      return;
      label78: MediaGalleryImageView localMediaGalleryImageView = (MediaGalleryImageView)localLinearLayout.findViewWithTag(Integer.valueOf(this.b.c.b.hashCode()));
      if (localMediaGalleryImageView == null)
      {
        if (this.b.e.debug)
          g5.b(z[0] + this.b.d);
      }
      else if ((this.b.c.l == 3) && (this.b.c.m > 0L))
      {
        Bitmap localBitmap = this.a;
        j4 localj4 = j4.a(MediaGallery.g);
        if ((localBitmap.getWidth() != localj4.X) || (localBitmap.getHeight() != localj4.X))
          localBitmap = Bitmap.createScaledBitmap(localBitmap, localj4.X, localj4.X, true);
        localMediaGalleryImageView.setImageDrawable(new VideoBitmapDrawable(MediaGallery.g, localBitmap, Formatter.formatShortFileSize(App.Mb, this.b.c.m), 0.0F));
        if (!DialogToastListActivity.f);
      }
      else
      {
        localMediaGalleryImageView.setImageBitmap(this.a);
      }
    }
  }
}