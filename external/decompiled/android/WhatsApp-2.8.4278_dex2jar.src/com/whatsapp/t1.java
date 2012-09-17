package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class t1
  implements DialogInterface.OnClickListener
{
  final RecordAudio a;

  t1(RecordAudio paramRecordAudio)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(0);
    this.a.finish();
  }
}