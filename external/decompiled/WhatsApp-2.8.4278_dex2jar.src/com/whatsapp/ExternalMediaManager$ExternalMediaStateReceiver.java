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