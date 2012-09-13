package com.whatsapp;

import android.widget.ScrollView;

class qk
  implements Runnable
{
  final ContactPickerHelp a;

  qk(ContactPickerHelp paramContactPickerHelp)
  {
  }

  public void run()
  {
    ((ScrollView)this.a.findViewById(2131558541)).fullScroll(130);
  }
}