package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class xs
  implements DialogInterface.OnClickListener
{
  final EULA a;

  xs(EULA paramEULA)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(6);
    if (mh.b() != null)
    {
      this.a.showDialog(8);
      if (!DialogToastListActivity.f);
    }
    else
    {
      this.a.j = 0;
    }
  }
}