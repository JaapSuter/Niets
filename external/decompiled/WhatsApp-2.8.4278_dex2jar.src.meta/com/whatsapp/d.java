package com.whatsapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Date;
import java.util.TimeZone;

final class d extends c
{
  private static final String z;
  final Activity b;

  static
  {
    char[] arrayOfChar = "N`=)1_|2+=Ba p7A`04yZ}<13��{:21\r".toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    if (i <= j)
    {
      z = new String(arrayOfChar).intern();
      return;
    }
    int k = arrayOfChar[j];
    int m;
    switch (j % 5)
    {
    default:
      m = 84;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar[j] = (char)(m ^ k);
      j++;
      break;
      m = 45;
      continue;
      m = 15;
      continue;
      m = 83;
      continue;
      m = 95;
    }
  }

  d(Activity paramActivity1, int paramInt, Activity paramActivity2)
  {
    super(paramActivity1, paramInt);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Date localDate = new Date();
    g5.c(z + localDate.toString());
    if (App.H == null);
    for (long l = localDate.getTime(); ; l = App.H.getTime())
    {
      Activity localActivity = this.b;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = t4.i(App.Mb, l);
      arrayOfObject[1] = TimeZone.getDefault().getDisplayName();
      String str = localActivity.getString(2131296417, arrayOfObject);
      ((TextView)findViewById(2131558497)).setText(str);
      findViewById(2131558498).setOnClickListener(new qo(this));
      return;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.d
 * JD-Core Version:    0.6.1
 */