package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ExternalMediaManager$ExternalMediaStateReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext.startService(paramIntent.setClass(paramContext, ExternalMediaManager.class));
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ExternalMediaManager.ExternalMediaStateReceiver
 * JD-Core Version:    0.6.1
 */