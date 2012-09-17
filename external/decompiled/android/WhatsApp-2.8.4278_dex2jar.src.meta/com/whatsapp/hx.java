package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class hx
  implements View.OnClickListener
{
  private static final String z;
  final MediaView a;

  static
  {
    char[] arrayOfChar = "@81".toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    if (i <= j)
    {
      z = new String(arrayOfChar).intern();
      return;
    }
    int k = arrayOfChar[j];
    int m;
    switch (j % 5)
    {
    default:
      m = 44;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar[j] = (char)(m ^ k);
      j++;
      break;
      m = 42;
      continue;
      m = 81;
      continue;
      m = 85;
      continue;
      m = 65;
    }
  }

  hx(MediaView paramMediaView)
  {
  }

  public void onClick(View paramView)
  {
    Intent localIntent = new Intent(this.a, MediaGallery.class);
    localIntent.putExtra(z, MediaView.t(this.a));
    this.a.startActivity(localIntent);
    this.a.finish();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.hx
 * JD-Core Version:    0.6.1
 */