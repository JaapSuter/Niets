package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class hj
  implements AdapterView.OnItemClickListener
{
  final ContactInfo a;

  hj(ContactInfo paramContactInfo)
  {
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i = paramInt - 1;
    if ((i >= 0) && (i < ContactInfo.b(this.a).getCount()))
    {
      zq localzq = ContactInfo.b(this.a).a(i);
      this.a.startActivity(Conversation.a(localzq));
    }
  }
}