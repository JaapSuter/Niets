package com.whatsapp;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;

class wt
  implements View.OnClickListener
{
  private static final String z;
  final GroupChatInfo a;

  static
  {
    char[] arrayOfChar = "Y\004G".toCharArray();
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
      m = 33;
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
      m = 62;
      continue;
      m = 109;
      continue;
      m = 35;
      continue;
      m = 94;
    }
  }

  wt(GroupChatInfo paramGroupChatInfo)
  {
  }

  public void onClick(View paramView)
  {
    if (this.a.r.size() < eu.b)
    {
      Intent localIntent = new Intent(this.a, ContactPicker.class);
      localIntent.putExtra(z, this.a.i);
      this.a.startActivityForResult(localIntent, 1);
      if (!DialogToastListActivity.f);
    }
    else
    {
      AlertDialog localAlertDialog = new AlertDialog.Builder(this.a).create();
      localAlertDialog.setTitle(this.a.getString(2131296269));
      GroupChatInfo localGroupChatInfo = this.a;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(eu.b);
      localAlertDialog.setMessage(localGroupChatInfo.getString(2131296851, arrayOfObject));
      localAlertDialog.setButton(this.a.getString(2131296270), new xt(this));
      localAlertDialog.show();
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.wt
 * JD-Core Version:    0.6.1
 */