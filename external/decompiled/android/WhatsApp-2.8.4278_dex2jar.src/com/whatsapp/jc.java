package com.whatsapp;

import android.os.CountDownTimer;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

class jc extends CountDownTimer
{
  final ProgressBar a;
  final long b;
  final View c;
  final VerifySms d;

  jc(VerifySms paramVerifySms, long paramLong1, long paramLong2, ProgressBar paramProgressBar, long paramLong3, View paramView)
  {
    super(paramLong1, paramLong2);
  }

  public void onFinish()
  {
    VerifySms.l(this.d).setEnabled(true);
    this.c.setVisibility(8);
    this.a.setVisibility(8);
  }

  public void onTick(long paramLong)
  {
    this.a.setProgress((int)(100.0D * this.b - paramLong / this.b));
  }
}