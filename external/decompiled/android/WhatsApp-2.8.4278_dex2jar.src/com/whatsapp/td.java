package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;

class td extends Handler
{
  final SetStatus a;

  td(SetStatus paramSetStatus)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 1)
    {
      Object localObject = v4.a(App.a, this.a.getBaseContext());
      TextView localTextView = this.a.f;
      if (localObject == null)
        localObject = App.a;
      localTextView.setText((CharSequence)localObject);
      App.b = true;
      this.a.h.notifyDataSetInvalidated();
      if (!DialogToastListActivity.f);
    }
    else
    {
      App.a(App.Mb, 2131296595, 0);
    }
    this.a.findViewById(2131558624).setVisibility(8);
    this.a.findViewById(2131558762).setVisibility(0);
    SetStatus.b(this.a).setOnClickListener(new m2(this));
  }
}