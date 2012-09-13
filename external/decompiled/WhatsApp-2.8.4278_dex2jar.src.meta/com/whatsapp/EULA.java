package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class EULA extends UserFeedbackActivity
{
  private static final String[] z;
  int j = 0;

  static
  {
    String[] arrayOfString = new String[5];
    char[] arrayOfChar1 = "*)uqO,.|q\024*snb\017!;4c\024.(|0\002 )ws\005o(v0\r.5w".toCharArray();
    int i = arrayOfChar1.length;
    int k = 0;
    char[] arrayOfChar2;
    int i2;
    char[] arrayOfChar3;
    int i6;
    char[] arrayOfChar4;
    int i10;
    char[] arrayOfChar5;
    int i14;
    if (i <= k)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "*)uqO,.|q\024*".toCharArray();
      int i1 = arrayOfChar2.length;
      i2 = 0;
      if (i1 <= i2)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "<4vg?=9~y\023;.xd\t 2Fv\t=/mO\004#;".toCharArray();
        int i5 = arrayOfChar3.length;
        i6 = 0;
        if (i5 > i6)
          break label365;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "*)uq".toCharArray();
        int i9 = arrayOfChar4.length;
        i10 = 0;
        if (i9 > i10)
          break label457;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "EV".toCharArray();
        int i13 = arrayOfChar5.length;
        i14 = 0;
        if (i13 > i14)
          break label549;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int m = arrayOfChar1[k];
      int n;
      switch (k % 5)
      {
      default:
        n = 96;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[k] = (char)(n ^ m);
        k++;
        break;
        n = 79;
        continue;
        n = 92;
        continue;
        n = 25;
        continue;
        n = 16;
      }
    }
    int i3 = arrayOfChar2[i2];
    int i4;
    switch (i2 % 5)
    {
    default:
      i4 = 96;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i2] = (char)(i4 ^ i3);
      i2++;
      break;
      i4 = 79;
      continue;
      i4 = 92;
      continue;
      i4 = 25;
      continue;
      i4 = 16;
    }
    label365: int i7 = arrayOfChar3[i6];
    int i8;
    switch (i6 % 5)
    {
    default:
      i8 = 96;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i6] = (char)(i8 ^ i7);
      i6++;
      break;
      i8 = 79;
      continue;
      i8 = 92;
      continue;
      i8 = 25;
      continue;
      i8 = 16;
    }
    label457: int i11 = arrayOfChar4[i10];
    int i12;
    switch (i10 % 5)
    {
    default:
      i12 = 96;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i10] = (char)(i12 ^ i11);
      i10++;
      break;
      i12 = 79;
      continue;
      i12 = 92;
      continue;
      i12 = 25;
      continue;
      i12 = 16;
    }
    label549: int i15 = arrayOfChar5[i14];
    int i16;
    switch (i14 % 5)
    {
    default:
      i16 = 96;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i14] = (char)(i16 ^ i15);
      i14++;
      break;
      i16 = 79;
      continue;
      i16 = 92;
      continue;
      i16 = 25;
      continue;
      i16 = 16;
    }
  }

  private void a()
  {
    c();
    if (getResources().getConfiguration().orientation == 1)
    {
      findViewById(2131558662).setBackgroundResource(2130837523);
      if (!DialogToastListActivity.f);
    }
    else
    {
      findViewById(2131558662).setBackgroundResource(2130837524);
    }
  }

  private void c()
  {
    if (getResources().getConfiguration().orientation == 1)
    {
      findViewById(2131558404).setVisibility(0);
      if (!DialogToastListActivity.f);
    }
    else
    {
      findViewById(2131558404).setVisibility(8);
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    a();
  }

  public void onCreate(Bundle paramBundle)
  {
    g5.b(z[1]);
    super.onCreate(paramBundle);
    setContentView(2130903094);
    a();
    if (App.c(this) != 0)
    {
      g5.d(z[0]);
      startActivity(new Intent(this, Main.class));
      finish();
    }
    while (true)
    {
      return;
      c();
      if (App.D != null)
      {
        showDialog(6);
        if (!DialogToastListActivity.f);
      }
      else if (mh.b() != null)
      {
        showDialog(8);
      }
      Button localButton1 = (Button)findViewById(2131558664);
      SpannableString localSpannableString = new SpannableString(getText(2131296300));
      localSpannableString.setSpan(new UnderlineSpan(), 0, localSpannableString.length(), 0);
      localButton1.setText(localSpannableString);
      Button localButton2 = (Button)findViewById(2131558665);
      localButton1.setOnClickListener(new qs(this));
      localButton2.setOnClickListener(new rs(this));
      if (getIntent().getBooleanExtra(z[2], false))
        showDialog(0);
      App.a(this, 0);
    }
  }

  public Dialog onCreateDialog(int paramInt)
  {
    Object localObject;
    switch (paramInt)
    {
    case 1:
    case 4:
    default:
      localObject = super.onCreateDialog(paramInt);
    case 10:
    case 9:
    case 0:
    case 2:
    case 3:
    case 5:
    case 6:
    case 7:
    case 8:
    }
    while (true)
    {
      return localObject;
      localObject = new AlertDialog.Builder(this).setTitle(2131296269).setMessage(2131296418).setPositiveButton(2131296289, new ns(this)).create();
      continue;
      localObject = new AlertDialog.Builder(this).setTitle(2131296269).setMessage(2131296415).setPositiveButton(2131296270, new ss(this)).create();
      continue;
      localObject = new AlertDialog.Builder(this).setMessage(2131296357).setPositiveButton(2131296270, new ts(this)).create();
      continue;
      localObject = new AlertDialog.Builder(this).setTitle(2131296269).setMessage(2131296392).setNeutralButton(2131296270, new us(this)).create();
      continue;
      localObject = new AlertDialog.Builder(this).setTitle(2131296269).setMessage(getString(2131296818) + z[4] + getString(2131296307)).setNeutralButton(2131296270, new vs(this)).create();
      continue;
      localObject = new AlertDialog.Builder(this).setMessage(2131296305).setOnCancelListener(new ws(this)).create();
      continue;
      this.j = 1;
      localObject = new AlertDialog.Builder(this).setTitle(2131296269).setMessage(2131296302).setCancelable(false).setPositiveButton(2131296304, new ys(this)).setNegativeButton(2131296270, new xs(this)).create();
      continue;
      localObject = new AlertDialog.Builder(this).setMessage(2131296306).setOnCancelListener(new zs(this)).create();
      continue;
      this.j = 2;
      localObject = new AlertDialog.Builder(this).setTitle(2131296269).setMessage(2131296303).setCancelable(false).setPositiveButton(2131296304, new ps(this)).setNegativeButton(2131296270, new os(this)).create();
    }
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    paramMenu.add(0, 0, 0, 2131296336).setIcon(2130838470);
    return true;
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    }
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      d(z[3]);
    }
  }

  public void onResume()
  {
    super.onResume();
    switch (this.j)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      showDialog(6);
      if (DialogToastListActivity.f)
        showDialog(8);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.EULA
 * JD-Core Version:    0.6.1
 */