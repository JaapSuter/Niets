package com.whatsapp;

import android.widget.ProgressBar;

class mk
  implements Runnable
{
  final int a;
  final lk b;

  mk(lk paramlk, int paramInt)
  {
  }

  public void run()
  {
    boolean bool = DialogToastListActivity.f;
    if (ContactPicker.o(this.b.c).getVisibility() == 0)
    {
      ContactPicker.o(this.b.c).setVisibility(4);
      ContactPicker.p(this.b.c);
      ContactPicker.i(this.b.c).notifyDataSetChanged();
    }
    if (this.a == 1)
    {
      App.lc.b(true);
      App.Mb.b(System.currentTimeMillis());
      App.a(this.b.c, 2131296613, 0);
      if (!bool);
    }
    else if (this.a == 2)
    {
      if (this.b.b)
        ContactPicker.o(this.b.c).setVisibility(0);
      this.b.c.a(2131296615);
      if (!bool);
    }
    else if (this.a == 0)
    {
      this.b.c.a(2131296614);
      App.lc.c(true);
      if (!bool);
    }
    else if (this.a == 3)
    {
      this.b.c.a(2131296616);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.mk
 * JD-Core Version:    0.6.1
 */