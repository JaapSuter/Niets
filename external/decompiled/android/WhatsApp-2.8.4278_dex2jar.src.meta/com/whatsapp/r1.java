package com.whatsapp;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

class r1
  implements MediaPlayer.OnPreparedListener
{
  private static final String z;
  final RecordAudio a;

  static
  {
    char[] arrayOfChar = "LsK'\013\ro\\n\026HgK7".toCharArray();
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
      m = 100;
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
      m = 45;
      continue;
      m = 6;
      continue;
      m = 47;
      continue;
      m = 78;
    }
  }

  r1(RecordAudio paramRecordAudio)
  {
  }

  public void onPrepared(MediaPlayer paramMediaPlayer)
  {
    g5.b(z);
    RecordAudio.a(this.a, true);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.r1
 * JD-Core Version:    0.6.1
 */