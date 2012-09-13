package com.whatsapp;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;

class qd extends Handler
{
  final RegisterName a;

  qd(RegisterName paramRegisterName)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    boolean bool = DialogToastListActivity.f;
    if ((RegisterName.j() != null) && (RegisterName.j().b))
      if (RegisterName.j().c)
      {
        if (!this.a.isFinishing())
        {
          Intent localIntent = new Intent(this.a, Main.class);
          this.a.startActivity(localIntent);
          this.a.finish();
          if (!bool);
        }
      }
      else
        switch (RegisterName.j().d)
        {
        case 2:
        default:
        case 1:
        case 3:
        }
    while (true)
    {
      this.a.removeDialog(0);
      RegisterName.a(null);
      RegisterName.a(null);
      return;
      this.a.showDialog(1);
      if (bool)
        this.a.showDialog(109);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.qd
 * JD-Core Version:    0.6.1
 */