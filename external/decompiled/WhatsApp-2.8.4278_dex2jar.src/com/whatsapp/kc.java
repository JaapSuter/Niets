package com.whatsapp;

import android.os.CountDownTimer;
import android.text.format.DateUtils;
import android.widget.Button;

class kc extends CountDownTimer
{
  final VerifySms a;

  kc(VerifySms paramVerifySms, long paramLong1, long paramLong2)
  {
    super(paramLong1, paramLong2);
  }

  public void onFinish()
  {
    VerifySms.m(this.a).setText(this.a.getString(2131296378));
    VerifySms.m(this.a).setEnabled(true);
  }

  public void onTick(long paramLong)
  {
    Button localButton = VerifySms.m(this.a);
    VerifySms localVerifySms = this.a;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = DateUtils.getRelativeTimeSpanString(paramLong + System.currentTimeMillis(), System.currentTimeMillis(), 0L);
    localButton.setText(localVerifySms.getString(2131296379, arrayOfObject));
  }
}