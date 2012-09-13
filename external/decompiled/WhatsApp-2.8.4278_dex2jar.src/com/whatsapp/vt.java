package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.HashMap;

class vt
  implements AdapterView.OnItemClickListener
{
  final GroupChatInfo a;

  vt(GroupChatInfo paramGroupChatInfo)
  {
  }

  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    boolean bool = DialogToastListActivity.f;
    zq localzq = (zq)paramView.getTag();
    if ((localzq != null) && (this.a.s.containsKey(localzq.b)))
    {
      if (App.sb())
      {
        this.a.a(paramView, true);
        new m9(this, localzq).start();
        if (!bool);
      }
      else
      {
        eu.b(this.a.i, localzq.b);
        App.a(this.a.getBaseContext(), 2131296885, 0);
        if (!bool);
      }
    }
    else if (localzq != null)
    {
      this.a.E = localzq;
      this.a.showDialog(3);
    }
  }
}