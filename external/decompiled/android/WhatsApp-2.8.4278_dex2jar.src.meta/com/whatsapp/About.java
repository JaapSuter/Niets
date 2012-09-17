package com.whatsapp;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class About extends DialogToastActivity
{
  private void a()
  {
    if (getResources().getConfiguration().orientation == 1)
    {
      setContentView(2130903040);
      findViewById(2131558400).setBackgroundResource(2130837523);
      if (!DialogToastListActivity.f);
    }
    else
    {
      setContentView(2130903041);
      findViewById(2131558400).setBackgroundResource(2130837524);
    }
    TextView localTextView = (TextView)findViewById(2131558403);
    String str1 = getString(2131296441);
    String str2 = getString(2131296260);
    localTextView.setText(str1 + " " + str2);
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    a();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.About
 * JD-Core Version:    0.6.1
 */