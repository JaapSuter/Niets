package com.whatsapp;

import android.os.AsyncTask;
import android.preference.CheckBoxPreference;

public class yb extends AsyncTask<String, Void, Integer>
{
  private static final String[] z;
  final Settings a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "0?\017J-=\b$P:4\030$P69\030nP0u\030iP7;\017~Pc".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "0?\017J-=\b$P:4\030$E\"3\027nGl9\031xW\".\016x\003".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
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
        m = 35;
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
        m = 67;
        continue;
        m = 90;
        continue;
        m = 123;
        continue;
        m = 11;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 35;
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
      i3 = 67;
      continue;
      i3 = 90;
      continue;
      i3 = 123;
      continue;
      i3 = 11;
    }
  }

  protected yb(Settings paramSettings)
  {
  }

  private void a(CheckBoxPreference paramCheckBoxPreference)
  {
    if (!paramCheckBoxPreference.isChecked());
    for (boolean bool = true; ; bool = false)
    {
      paramCheckBoxPreference.setChecked(bool);
      return;
    }
  }

  protected Integer a(String[] paramArrayOfString)
  {
    return Integer.valueOf(tp.a(true));
  }

  protected void a(Integer paramInteger)
  {
    boolean bool = DialogToastListActivity.f;
    this.a.removeDialog(16);
    if (paramInteger.intValue() == 1)
    {
      App.lc.b(true);
      App.Mb.b(System.currentTimeMillis());
      g5.b(z[0] + Settings.d(this.a).isChecked());
      this.a.a(2131296958);
      if (!bool);
    }
    else if (paramInteger.intValue() == 2)
    {
      a(Settings.d(this.a));
      g5.b(z[1] + Settings.d(this.a).isChecked());
      this.a.a(2131296615);
      if (!bool);
    }
    else if (paramInteger.intValue() == 0)
    {
      App.lc.c(true);
      a(Settings.d(this.a));
      g5.b(z[1] + Settings.d(this.a).isChecked());
      this.a.a(2131296614);
      if (!bool);
    }
    else if (paramInteger.intValue() == 3)
    {
      a(Settings.d(this.a));
      g5.b(z[1] + Settings.d(this.a).isChecked());
      this.a.a(2131296616);
    }
  }

  protected void onPreExecute()
  {
    this.a.showDialog(16);
  }
}