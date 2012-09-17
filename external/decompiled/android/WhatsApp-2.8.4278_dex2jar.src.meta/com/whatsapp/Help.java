package com.whatsapp;

import android.app.Activity;
import android.os.Bundle;

public class Help extends Activity
{
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903100);
  }

  public void onDestroy()
  {
    App.a(null);
    super.onDestroy();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.Help
 * JD-Core Version:    0.6.1
 */