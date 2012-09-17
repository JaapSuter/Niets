package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.ArrayList;

class p2
  implements AdapterView.OnItemClickListener
{
  final SetStatus a;

  p2(SetStatus paramSetStatus)
  {
  }

  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    String str = (String)SetStatus.g.get(paramInt);
    this.a.a(str);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.p2
 * JD-Core Version:    0.6.1
 */