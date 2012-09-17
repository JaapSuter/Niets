package com.whatsapp;

import android.media.MediaPlayer;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;

class q1
  implements View.OnClickListener
{
  final RecordAudio a;

  q1(RecordAudio paramRecordAudio)
  {
  }

  public void onClick(View paramView)
  {
    boolean bool = DialogToastListActivity.f;
    if (RecordAudio.b(this.a))
    {
      if (this.a.j.isPlaying())
      {
        this.a.j.pause();
        this.a.f = 5;
        if (!bool);
      }
      else
      {
        if ((this.a.f == 5) && (this.a.j.getCurrentPosition() != this.a.j.getDuration()))
        {
          this.a.j.start();
          if (!bool);
        }
        else
        {
          RecordAudio.a(this.a, 0);
        }
        this.a.f = 4;
        if (!bool);
      }
    }
    else
    {
      this.a.q.setMax((int)(this.a.h - this.a.g));
      this.a.f = 3;
      this.a.p.sendEmptyMessage(0);
      this.a.j.start();
    }
    this.a.b(this.a.f);
  }
}