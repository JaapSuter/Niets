package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.List;

class qn
  implements DialogInterface.OnClickListener
{
  final List a;
  final sz b;
  final int c;
  final ze d;

  qn(ze paramze, List paramList, sz paramsz, int paramInt)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.d.n.a(((rn)this.a.get(paramInt)).b, ((rn)this.a.get(paramInt)).c, this.b, this.c);
  }
}