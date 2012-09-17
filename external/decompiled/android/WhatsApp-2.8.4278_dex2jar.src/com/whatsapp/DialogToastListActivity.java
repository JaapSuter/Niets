package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ListActivity;
import android.os.Build.VERSION;
import android.os.Bundle;

public class DialogToastListActivity extends ListActivity
  implements lr
{
  public static boolean f;
  private static final String[] z;
  private String a;
  private int b;
  private nr c;
  private ed d;
  private boolean e = true;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "\nU^?K\bvc1F\024ed*U\016P\027C".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\nU^?K\bvc1F\024ed*U\016P".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\003xV2H��eX?T\023}^-S\006rC7Q\016eNqH\tsV=L\027cR-T\002u\030?D\023xA7S\0361Y1\007\006rC7Q\002".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label289;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 39;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[j] = (char)(m ^ k);
        j++;
        break;
        m = 103;
        continue;
        m = 17;
        continue;
        m = 55;
        continue;
        m = 94;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 39;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i1] = (char)(i3 ^ i2);
      i1++;
      break;
      i3 = 103;
      continue;
      i3 = 17;
      continue;
      i3 = 55;
      continue;
      i3 = 94;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 39;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i5] = (char)(i7 ^ i6);
      i5++;
      break;
      i7 = 103;
      continue;
      i7 = 17;
      continue;
      i7 = 55;
      continue;
      i7 = 94;
    }
  }

  static nr a(DialogToastListActivity paramDialogToastListActivity)
  {
    return paramDialogToastListActivity.c;
  }

  public void a(int paramInt)
  {
    this.c = null;
    this.a = getString(paramInt);
    if (!isFinishing())
      showDialog(500);
  }

  public void a(int paramInt, nr paramnr)
  {
    this.c = paramnr;
    this.a = getString(paramInt);
    if (!isFinishing())
      showDialog(500);
  }

  public void c(String paramString)
  {
    this.c = null;
    this.a = paramString;
    if (!isFinishing())
      showDialog(500);
  }

  public void onBackPressed()
  {
    if ((this.e) || (Build.VERSION.SDK_INT < 11))
    {
      super.onBackPressed();
      if (!f);
    }
    else
    {
      g5.d(z[2]);
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.d = new ed();
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 500:
    }
    for (Object localObject = super.onCreateDialog(paramInt); ; localObject = new AlertDialog.Builder(this).setMessage(this.a).setNeutralButton(2131296270, new or(this)).create())
      return localObject;
  }

  public void onPause()
  {
    App.b(this);
    super.onPause();
    if (this.d.hasMessages(0))
      this.d.removeMessages(0);
    App.nb();
    this.e = false;
  }

  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    super.onRestoreInstanceState(paramBundle);
    this.a = paramBundle.getString(z[1]);
    this.b = paramBundle.getInt(z[0], 0);
    if (this.b != 0)
      this.a = getString(this.b);
  }

  public void onResume()
  {
    App.a(this);
    super.onResume();
    this.d.sendEmptyMessageDelayed(0, 3000L);
    this.e = true;
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putCharSequence(z[1], this.a);
    paramBundle.putInt(z[0], this.b);
  }
}