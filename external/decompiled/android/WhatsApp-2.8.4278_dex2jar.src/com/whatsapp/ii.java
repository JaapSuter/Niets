package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ii
  implements DialogInterface.OnClickListener
{
  final BlockList a;

  ii(BlockList paramBlockList)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(108);
  }
}