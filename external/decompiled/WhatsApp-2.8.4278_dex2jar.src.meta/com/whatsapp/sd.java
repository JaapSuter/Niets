package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

class sd extends Handler
{
  final SetStatus a;

  sd(SetStatus paramSetStatus)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    boolean bool = DialogToastListActivity.f;
    int i;
    int j;
    if (paramMessage.what == 1)
    {
      Object localObject = v4.a(App.a, this.a.getBaseContext());
      TextView localTextView = this.a.f;
      if (localObject == null)
        localObject = App.a;
      localTextView.setText((CharSequence)localObject);
      Iterator localIterator = SetStatus.g.iterator();
      i = 0;
      if (!localIterator.hasNext())
        break label192;
      if (!((String)localIterator.next()).equals(App.a))
        break label185;
      if (!bool)
        break label179;
      j = 1;
      label96: if (!bool)
        break label172;
    }
    while (true)
    {
      if (j == 0)
        SetStatus.g.add(0, App.a);
      this.a.h.notifyDataSetInvalidated();
      SetStatus.a(this.a);
      if (bool)
        App.a(App.Mb, 2131296594, 0);
      this.a.removeDialog(2);
      SetStatus.b(this.a).setOnClickListener(new l2(this));
      return;
      label172: i = j;
      break;
      label179: j = 1;
      continue;
      label185: j = i;
      break label96;
      label192: j = i;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.sd
 * JD-Core Version:    0.6.1
 */