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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.t1
 * JD-Core Version:    0.6.1
 */