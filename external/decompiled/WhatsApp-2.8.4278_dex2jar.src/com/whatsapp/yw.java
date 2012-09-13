package com.whatsapp;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

class yw
  implements MediaPlayer.OnPreparedListener
{
  private static final String z;
  final MediaView a;

  static
  {
    char[] arrayOfChar = "\032F\016f\004[Z\031/\031\036R\016v".toCharArray();
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
      m = 107;
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
      m = 123;
      continue;
      m = 51;
      continue;
      m = 106;
      continue;
      m = 15;
    }
  }

  yw(MediaView paramMediaView)
  {
  }

  public void onPrepared(MediaPlayer paramMediaPlayer)
  {
    g5.b(z);
    MediaView.b(this.a, true);
  }
}