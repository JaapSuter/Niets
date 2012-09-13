package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.ArrayList;

class tt
  implements DialogInterface.OnClickListener
{
  final ArrayList a;
  final GroupChatInfo b;

  tt(GroupChatInfo paramGroupChatInfo, ArrayList paramArrayList)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt < this.a.size())
      GroupChatInfo.a(this.b, this.b.E, ((Integer)this.a.get(paramInt)).intValue());
    this.b.removeDialog(3);
  }
}