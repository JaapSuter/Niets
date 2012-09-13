package com.whatsapp;

import android.media.MediaPlayer;
import android.view.View;
import android.view.View.OnClickListener;
import java.io.File;

class m1
  implements View.OnClickListener
{
  final RecordAudio a;

  m1(RecordAudio paramRecordAudio)
  {
  }

  public void onClick(View paramView)
  {
    if (RecordAudio.b(this.a))
    {
      if ((this.a.j != null) && (this.a.j.isPlaying()))
      {
        this.a.j.stop();
        if (!DialogToastListActivity.f);
      }
    }
    else if (this.a.o.exists())
      this.a.o.delete();
    this.a.finish();
  }
}