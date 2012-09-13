package com.whatsapp;

import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Message;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

class pd extends Handler
{
  final RecordAudio a;

  pd(RecordAudio paramRecordAudio)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    boolean bool = DialogToastListActivity.f;
    if (this.a.f == 4)
    {
      int i = this.a.j.getCurrentPosition();
      if (Math.abs(100 * (i - this.a.y) / this.a.r.getMax()) >= 3)
      {
        TextView localTextView2 = this.a.k;
        StringBuilder localStringBuilder2 = new StringBuilder();
        RecordAudio localRecordAudio2 = this.a;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(i * 100 / this.a.r.getMax());
        localTextView2.setText(localRecordAudio2.getString(2131296802, arrayOfObject2) + "%");
        this.a.y = i;
      }
      this.a.r.setProgress(i);
    }
    if (((!this.a.isFinishing()) && (this.a.f == 4) && (this.a.j.isPlaying())) || ((this.a.f == 5) && (this.a.j.getCurrentPosition() != this.a.j.getDuration())))
    {
      RecordAudio.a(this.a).sendEmptyMessageDelayed(0, 50L);
      if (!bool);
    }
    else
    {
      TextView localTextView1 = this.a.k;
      StringBuilder localStringBuilder1 = new StringBuilder();
      RecordAudio localRecordAudio1 = this.a;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(100);
      localTextView1.setText(localRecordAudio1.getString(2131296802, arrayOfObject1) + "%");
      this.a.l.setText(2131296797);
      if (!RecordAudio.c(this.a))
      {
        this.a.finish();
        if (!bool);
      }
      else
      {
        this.a.r.setProgress(this.a.r.getMax());
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.pd
 * JD-Core Version:    0.6.1
 */