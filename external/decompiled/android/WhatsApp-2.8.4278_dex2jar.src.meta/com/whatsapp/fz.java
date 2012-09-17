package com.whatsapp;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

class fz
  implements Runnable
{
  final ProfileInfoActivity a;

  fz(ProfileInfoActivity paramProfileInfoActivity)
  {
  }

  public void run()
  {
    if ((ProfileInfoActivity.b(this.a).p == 0) && (ProfileInfoActivity.b(this.a).o == 0))
    {
      ProfileInfoActivity.c(this.a).setVisibility(4);
      ProfileInfoActivity.d(this.a).setVisibility(0);
      ProfileInfoActivity.e(this.a).setVisibility(4);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.fz
 * JD-Core Version:    0.6.1
 */