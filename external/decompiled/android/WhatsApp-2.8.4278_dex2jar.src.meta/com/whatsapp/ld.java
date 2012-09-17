package com.whatsapp;

import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Message;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

class ld extends Handler
{
  private static final String z;
  final MediaView a;

  static
  {
    char[] arrayOfChar = "\035xeRN\006tdL��\021heR@_ndO\017\004r!H[\037m!H[\021itH".toCharArray();
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
      m = 47;
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
      m = 112;
      continue;
      m = 29;
      continue;
      m = 1;
      continue;
      m = 59;
    }
  }

  ld(MediaView paramMediaView)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    boolean bool = DialogToastListActivity.f;
    if (MediaView.a(this.a) == null);
    while (true)
    {
      return;
      if (MediaView.c(this.a) == 4)
        if (MediaView.f(this.a).getMax() > 0)
        {
          int i = Math.min(MediaView.a(this.a).getCurrentPosition(), MediaView.f(this.a).getMax());
          if (Math.abs(100 * (i - MediaView.r(this.a)) / MediaView.f(this.a).getMax()) >= 3)
          {
            TextView localTextView2 = MediaView.s(this.a);
            StringBuilder localStringBuilder2 = new StringBuilder();
            MediaView localMediaView2 = this.a;
            Object[] arrayOfObject2 = new Object[1];
            arrayOfObject2[0] = Integer.valueOf(i * 100 / MediaView.f(this.a).getMax());
            localTextView2.setText(localMediaView2.getString(2131296802, arrayOfObject2) + "%");
            MediaView.f(this.a, i);
          }
          MediaView.f(this.a).setProgress(i);
          if (!bool);
        }
        else
        {
          this.a.a(2131296986);
        }
      if ((!this.a.isFinishing()) && (MediaView.c(this.a) == 4) && (MediaView.a(this.a).isPlaying()))
      {
        MediaView.b(this.a).sendEmptyMessageDelayed(0, 50L);
        if (!bool);
      }
      else if (MediaView.c(this.a) != 5)
      {
        g5.b(z);
        MediaView.f(this.a).setProgress(MediaView.f(this.a).getMax());
        TextView localTextView1 = MediaView.s(this.a);
        StringBuilder localStringBuilder1 = new StringBuilder();
        MediaView localMediaView1 = this.a;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(100);
        localTextView1.setText(localMediaView1.getString(2131296802, arrayOfObject1) + "%");
        MediaView.b(this.a, 5);
        MediaView.d(this.a).setText(this.a.getString(2131296756));
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ld
 * JD-Core Version:    0.6.1
 */