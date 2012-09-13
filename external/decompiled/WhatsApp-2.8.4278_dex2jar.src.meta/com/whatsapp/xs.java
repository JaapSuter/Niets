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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.xs
 * JD-Core Version:    0.6.1
 */