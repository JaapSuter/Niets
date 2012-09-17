package com.whatsapp;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;

class s1
  implements MediaPlayer.OnErrorListener
{
  private static final String[] z;
  final RecordAudio a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "xT%B9*\025z".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "=\0062U?bT7R,,N".toCharArray();
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
        m = 77;
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
        m = 88;
        continue;
        m = 116;
        continue;
        m = 64;
        continue;
        m = 58;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 77;
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
      i3 = 88;
      continue;
      i3 = 116;
      continue;
      i3 = 64;
      continue;
      i3 = 58;
    }
  }

  s1(RecordAudio paramRecordAudio)
  {
  }

  public boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    g5.d(z[1] + paramInt1 + z[0] + paramInt2);
    return false;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.s1
 * JD-Core Version:    0.6.1
 */