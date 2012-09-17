package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import android.view.View;

class vd extends Handler
{
  final ViewProfilePhoto a;

  vd(ViewProfilePhoto paramViewProfilePhoto)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    App localApp = App.Mb;
    if (ViewProfilePhoto.a(this.a).o());
    for (int i = 2131296642; ; i = 2131296643)
    {
      App.a(localApp, i, 0);
      this.a.findViewById(2131558492).setVisibility(8);
      return;
    }
  }
}