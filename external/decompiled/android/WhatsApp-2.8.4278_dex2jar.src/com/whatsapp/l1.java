package com.whatsapp;

import android.media.MediaPlayer;
import android.os.Handler;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

class l1
  implements SeekBar.OnSeekBarChangeListener
{
  final RecordAudio a;

  l1(RecordAudio paramRecordAudio)
  {
  }

  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    paramSeekBar.setProgress(paramInt);
  }

  public void onStartTrackingTouch(SeekBar paramSeekBar)
  {
    if ((this.a.j != null) && (this.a.j.isPlaying()))
      this.a.j.pause();
    RecordAudio.a(this.a).removeMessages(0);
  }

  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    boolean bool = DialogToastListActivity.f;
    if (this.a.j != null)
    {
      if (this.a.f == 4)
      {
        this.a.j.seekTo((int)(this.a.j.getDuration() * (paramSeekBar.getProgress() / paramSeekBar.getMax())));
        this.a.j.start();
        RecordAudio.a(this.a).sendEmptyMessage(0);
        this.a.l.setText(2131296798);
        if (!bool);
      }
      else
      {
        RecordAudio.a(this.a, (int)(this.a.j.getDuration() * (paramSeekBar.getProgress() / paramSeekBar.getMax())));
        if (!bool);
      }
    }
    else
      paramSeekBar.setProgress(0);
  }
}