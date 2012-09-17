package com.whatsapp;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.HashSet;

class hy
  implements gt
{
  boolean a;
  final PopupNotification b;

  hy(PopupNotification paramPopupNotification)
  {
  }

  public void a()
  {
    App.mb();
    if (PopupNotification.c(this.b) != null)
      PopupNotification.d(this.b).add(PopupNotification.c(this.b).b);
    if (PopupNotification.e(this.b) != null)
      PopupNotification.f(this.b).add(PopupNotification.e(this.b).b);
  }

  public void a(int paramInt)
  {
    boolean bool = DialogToastListActivity.f;
    if (this.a);
    while (true)
    {
      return;
      this.a = true;
      if (PopupNotification.a(this.b).size() == 1)
      {
        this.b.a(0);
        if (!bool);
      }
      else if (paramInt == 0)
      {
        PopupNotification.b(this.b).b(1 + PopupNotification.a(this.b).size());
        PopupNotification.b(this.b).c(PopupNotification.a(this.b).size());
        this.b.a(-1 + PopupNotification.a(this.b).size());
        if (!bool);
      }
      else if (paramInt == 1 + PopupNotification.a(this.b).size())
      {
        PopupNotification.b(this.b).b(0);
        PopupNotification.b(this.b).c(1);
        this.b.a(0);
        if (!bool);
      }
      else
      {
        this.b.a(paramInt - 1);
      }
      this.a = false;
    }
  }

  public void a(MotionEvent paramMotionEvent)
  {
  }

  public void a(gw paramgw)
  {
  }

  public void b()
  {
  }

  public void b(int paramInt)
  {
  }
}