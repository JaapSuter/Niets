package com.whatsapp;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.util.AttributeSet;

public class DialogPreference extends android.preference.DialogPreference
{
  private DialogInterface.OnClickListener a = null;

  public DialogPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public void a(DialogInterface.OnClickListener paramOnClickListener)
  {
    this.a = paramOnClickListener;
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (this.a != null)
      this.a.onClick(paramDialogInterface, paramInt);
    super.onClick(paramDialogInterface, paramInt);
  }
}