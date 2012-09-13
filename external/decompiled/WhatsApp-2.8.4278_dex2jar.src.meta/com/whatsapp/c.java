package com.whatsapp;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;

public class c extends Dialog
{
  private int a;

  public c(Activity paramActivity, int paramInt)
  {
    super(paramActivity, 2131492885);
    this.a = paramInt;
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(this.a);
    getWindow().setLayout(-1, -1);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.c
 * JD-Core Version:    0.6.1
 */