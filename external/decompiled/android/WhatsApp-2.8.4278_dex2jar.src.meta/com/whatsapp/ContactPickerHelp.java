package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;

public class ContactPickerHelp extends DialogToastListActivity
{
  private static final String z;
  TextView g;
  CheckBox h;
  wp i;
  ge j;
  ArrayList<zq> k;
  boolean l;

  static
  {
    char[] arrayOfChar = "\007\006<it\007\035:xy\024F1op\005\0357".toCharArray();
    int m = arrayOfChar.length;
    int n = 0;
    if (m <= n)
    {
      z = new String(arrayOfChar).intern();
      return;
    }
    int i1 = arrayOfChar[n];
    int i2;
    switch (n % 5)
    {
    default:
      i2 = 21;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar[n] = (char)(i2 ^ i1);
      n++;
      break;
      i2 = 100;
      continue;
      i2 = 105;
      continue;
      i2 = 82;
      continue;
      i2 = 29;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    g5.b(z);
    super.onCreate(paramBundle);
    setContentView(2130903057);
    ((Button)findViewById(2131558543)).setOnClickListener(new nk(this));
    this.g = ((TextView)findViewById(2131558548));
    this.k = new ArrayList();
    this.j = new ge(this, this, 2130903058, this.k);
    getListView().setAdapter(this.j);
    this.g.setVisibility(4);
    getListView().setVisibility(8);
    this.h = ((CheckBox)findViewById(2131558546));
    this.h.setChecked(App.i(this));
    this.h.setOnCheckedChangeListener(new ok(this));
    findViewById(2131558545).setOnClickListener(new pk(this));
    ((ScrollView)findViewById(2131558541)).post(new qk(this));
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    Object localObject;
    switch (paramInt)
    {
    default:
      localObject = super.onCreateDialog(paramInt);
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return localObject;
      localObject = new ProgressDialog(this);
      ((ProgressDialog)localObject).setMessage(getString(2131296337));
      ((ProgressDialog)localObject).setIndeterminate(true);
      ((ProgressDialog)localObject).setCancelable(false);
      continue;
      localObject = new ProgressDialog(this);
      ((ProgressDialog)localObject).setMessage(getString(2131296394));
      ((ProgressDialog)localObject).setIndeterminate(true);
      ((ProgressDialog)localObject).setCancelable(false);
      continue;
      localObject = new AlertDialog.Builder(this).setMessage(2131296958).setCancelable(false).setNeutralButton(2131296270, new rk(this)).create();
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ContactPickerHelp
 * JD-Core Version:    0.6.1
 */