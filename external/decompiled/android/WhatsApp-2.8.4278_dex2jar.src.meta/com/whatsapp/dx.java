package com.whatsapp;

import android.media.MediaPlayer;
import android.os.Handler;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

class dx
  implements SeekBar.OnSeekBarChangeListener
{
  final MediaView a;

  dx(MediaView paramMediaView)
  {
  }

  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    try
    {
      paramSeekBar.setProgress(paramInt);
      label5: return;
    }
    catch (StackOverflowError localStackOverflowError)
    {
      break label5;
    }
  }

  public void onStartTrackingTouch(SeekBar paramSeekBar)
  {
    if ((MediaView.a(this.a) != null) && (MediaView.a(this.a).isPlaying()))
      MediaView.a(this.a).pause();
    MediaView.b(this.a).removeMessages(0);
  }

  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    boolean bool = DialogToastListActivity.f;
    if (MediaView.a(this.a) != null)
    {
      if (MediaView.c(this.a) == 4)
      {
        MediaView.a(this.a).seekTo((int)(MediaView.a(this.a).getDuration() * (paramSeekBar.getProgress() / paramSeekBar.getMax())));
        MediaView.a(this.a).start();
        MediaView.b(this.a).sendEmptyMessage(0);
        MediaView.d(this.a).setText(2131296798);
        if (!bool);
      }
      else
      {
        MediaView.a(this.a, (int)(MediaView.a(this.a).getDuration() * (paramSeekBar.getProgress() / paramSeekBar.getMax())));
        if (!bool);
      }
    }
    else
      paramSeekBar.setProgress(0);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.dx
 * JD-Core Version:    0.6.1
 */