package com.whatsapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Date;

final class e extends c
{
  private static final String z;
  final Activity b;

  static
  {
    char[] arrayOfChar = "^BM\031\007O^B\033\013RCP@\001QB@\004OJ_L\001\005\020YJ\002\007\035".toCharArray();
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
      m = 98;
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
      m = 61;
      continue;
      m = 45;
      continue;
      m = 35;
      continue;
      m = 111;
    }
  }

  e(Activity paramActivity1, int paramInt, Activity paramActivity2)
  {
    super(paramActivity1, paramInt);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Date localDate = new Date();
    g5.c(z + localDate.toString());
    Activity localActivity = this.b;
    if (App.g == 0);
    for (int i = 2131296419; ; i = 2131296418)
    {
      String str = localActivity.getString(i);
      ((TextView)findViewById(2131558766)).setText(str);
      findViewById(2131558767).setOnClickListener(new so(this));
      return;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.e
 * JD-Core Version:    0.6.1
 */