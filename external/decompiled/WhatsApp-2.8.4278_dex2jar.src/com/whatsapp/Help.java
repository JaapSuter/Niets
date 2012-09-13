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