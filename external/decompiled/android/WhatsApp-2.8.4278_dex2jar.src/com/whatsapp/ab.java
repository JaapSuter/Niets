package com.whatsapp;

import android.os.AsyncTask;
import android.widget.CheckBox;

public class ab extends AsyncTask<String, Void, Integer>
{
  private static final String[] z;
  final ContactPickerHelp a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "\025\007Y#\021\025\034_2\034\006GD.\036\025GQ6\031\032\rSx\023\024\033C6\004\003\033\027".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\025\007Y#\021\025\034_2\034\006GD.\036\025GD\"\023\025\rD$_\025\nD#\021\002\035Dw".toCharArray();
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
        m = 112;
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
        m = 118;
        continue;
        m = 104;
        continue;
        m = 55;
        continue;
        m = 87;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 112;
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
      i3 = 118;
      continue;
      i3 = 104;
      continue;
      i3 = 55;
      continue;
      i3 = 87;
    }
  }

  protected ab(ContactPickerHelp paramContactPickerHelp)
  {
  }

  protected Integer a(String[] paramArrayOfString)
  {
    return Integer.valueOf(tp.a(true));
  }

  protected void a(Integer paramInteger)
  {
    boolean bool = DialogToastListActivity.f;
    this.a.removeDialog(2);
    if (paramInteger.intValue() == 1)
    {
      App.lc.b(true);
      App.Mb.b(System.currentTimeMillis());
      g5.b(z[1] + this.a.h.isChecked());
      this.a.a(2131296958, new tk(this));
      if (!bool);
    }
    else if (paramInteger.intValue() == 2)
    {
      this.a.l = true;
      this.a.h.toggle();
      g5.b(z[0] + this.a.h.isChecked());
      App.a(this.a, this.a.h.isChecked());
      this.a.a(2131296615);
      if (!bool);
    }
    else if (paramInteger.intValue() == 0)
    {
      App.lc.c(true);
      this.a.l = true;
      this.a.h.toggle();
      g5.b(z[0] + this.a.h.isChecked());
      App.a(this.a, this.a.h.isChecked());
      this.a.a(2131296614);
      if (!bool);
    }
    else if (paramInteger.intValue() == 3)
    {
      this.a.l = true;
      this.a.h.toggle();
      g5.b(z[0] + this.a.h.isChecked());
      App.a(this.a, this.a.h.isChecked());
      this.a.a(2131296616);
    }
  }

  protected void onPreExecute()
  {
    this.a.showDialog(2);
  }
}