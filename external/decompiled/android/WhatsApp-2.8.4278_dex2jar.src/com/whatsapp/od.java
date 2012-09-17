package com.whatsapp;

import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Message;
import android.widget.ProgressBar;
import android.widget.TextView;

class od extends Handler
{
  final RecordAudio a;

  od(RecordAudio paramRecordAudio)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    boolean bool = DialogToastListActivity.f;
    int i = 0;
    if (this.a.f == 3)
    {
      int j = this.a.j.getCurrentPosition();
      if (Math.abs(100 * (j - this.a.y) / this.a.q.getMax()) >= 3)
      {
        TextView localTextView3 = this.a.k;
        StringBuilder localStringBuilder3 = new StringBuilder();
        RecordAudio localRecordAudio3 = this.a;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(j * 100 / this.a.q.getMax());
        localTextView3.setText(localRecordAudio3.getString(2131296802, arrayOfObject3) + "%");
        this.a.y = j;
      }
      this.a.q.setProgress(j);
      if (!bool);
    }
    else if (this.a.f == 1)
    {
      long l = System.currentTimeMillis() - this.a.g;
      if (l > 120000L)
      {
        i = 1;
        this.a.a();
        this.a.f = 2;
        this.a.b(this.a.f);
        if (!bool);
      }
      else
      {
        TextView localTextView2 = this.a.k;
        StringBuilder localStringBuilder2 = new StringBuilder();
        RecordAudio localRecordAudio2 = this.a;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Long.valueOf(100L * (System.currentTimeMillis() - this.a.g) / this.a.q.getMax());
        localTextView2.setText(localRecordAudio2.getString(2131296800, arrayOfObject2) + "%");
        this.a.q.setProgress((int)l);
      }
    }
    if ((i == 0) && (!this.a.isFinishing()) && (((this.a.f == 3) && (this.a.j.isPlaying())) || (this.a.f == 1)))
    {
      this.a.p.sendEmptyMessageDelayed(0, 50L);
      if (!bool);
    }
    else if (this.a.f == 3)
    {
      this.a.q.setProgress(this.a.q.getMax());
      TextView localTextView1 = this.a.k;
      StringBuilder localStringBuilder1 = new StringBuilder();
      RecordAudio localRecordAudio1 = this.a;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(100);
      localTextView1.setText(localRecordAudio1.getString(2131296802, arrayOfObject1) + "%");
      this.a.f = 2;
      this.a.b(this.a.f);
    }
  }
}