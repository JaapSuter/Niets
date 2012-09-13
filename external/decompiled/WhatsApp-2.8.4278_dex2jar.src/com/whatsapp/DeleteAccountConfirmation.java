package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.NotificationManager;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.View;
import java.io.File;

public class DeleteAccountConfirmation extends Activity
{
  private static DeleteAccountConfirmation a;
  private static final String[] z;
  private Handler b = new dd(this);

  static
  {
    String[] arrayOfString = new String[11];
    char[] arrayOfChar1 = "D\031;w\tE\0354q\tC\0239t\024R\021xe\017O\0220?\016T\035#w]B\023\"|\036E\\#}]M\035>|]".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    char[] arrayOfChar4;
    int i9;
    char[] arrayOfChar5;
    int i13;
    char[] arrayOfChar6;
    int i17;
    char[] arrayOfChar7;
    int i21;
    char[] arrayOfChar8;
    int i25;
    char[] arrayOfChar9;
    int i29;
    char[] arrayOfChar10;
    int i33;
    char[] arrayOfChar11;
    int i37;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "D\031;w\tE\0354q\022U\022#q\022N\032>`\020\017\037%w\034T\031".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "D\031;w\tE\0354q\tC\0239t\024R\021xd\030R\0251k\016M\017xq\022M\021>f]F\035>~\030D".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label597;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "D\031;w\tE\0354q\tC\0239t\024R\021x`\030G\f?}\023ES4}\020M\025#2\033A\025;w\031".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label689;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "r\0310{\016T\031%B\025O\0222".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label781;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "v\031%{\033Y/:a".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label873;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "M\023\"|\tE\030".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label965;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "D\031;w\tE\0354q\tC\0239t\024R\021xq\021E\0359g\r\017\0172f\013E\016${\022N\\1s\024L\0313".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1057;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "D\031;w\tE\0354q\tC\0239t\024R\021xw\005T\031%|\034L\0212v\024AQ$f\034T\031w".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1149;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "D\031;w\tE\0354q\tC\0239t\024R\021xq\021E\0359g\r\017\037;w\034R\\1s\024L\0313".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1241;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "V\031%a\024O\022".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label1333;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        z = arrayOfString;
        a = null;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 125;
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
        m = 32;
        continue;
        m = 124;
        continue;
        m = 87;
        continue;
        m = 18;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 125;
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
      i3 = 32;
      continue;
      i3 = 124;
      continue;
      i3 = 87;
      continue;
      i3 = 18;
    }
    label597: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 125;
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
      i7 = 32;
      continue;
      i7 = 124;
      continue;
      i7 = 87;
      continue;
      i7 = 18;
    }
    label689: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 125;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i9] = (char)(i11 ^ i10);
      i9++;
      break;
      i11 = 32;
      continue;
      i11 = 124;
      continue;
      i11 = 87;
      continue;
      i11 = 18;
    }
    label781: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 125;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i13] = (char)(i15 ^ i14);
      i13++;
      break;
      i15 = 32;
      continue;
      i15 = 124;
      continue;
      i15 = 87;
      continue;
      i15 = 18;
    }
    label873: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 125;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i17] = (char)(i19 ^ i18);
      i17++;
      break;
      i19 = 32;
      continue;
      i19 = 124;
      continue;
      i19 = 87;
      continue;
      i19 = 18;
    }
    label965: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 125;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i21] = (char)(i23 ^ i22);
      i21++;
      break;
      i23 = 32;
      continue;
      i23 = 124;
      continue;
      i23 = 87;
      continue;
      i23 = 18;
    }
    label1057: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 125;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar8[i25] = (char)(i27 ^ i26);
      i25++;
      break;
      i27 = 32;
      continue;
      i27 = 124;
      continue;
      i27 = 87;
      continue;
      i27 = 18;
    }
    label1149: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 125;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar9[i29] = (char)(i31 ^ i30);
      i29++;
      break;
      i31 = 32;
      continue;
      i31 = 124;
      continue;
      i31 = 87;
      continue;
      i31 = 18;
    }
    label1241: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 125;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar10[i33] = (char)(i35 ^ i34);
      i33++;
      break;
      i35 = 32;
      continue;
      i35 = 124;
      continue;
      i35 = 87;
      continue;
      i35 = 18;
    }
    label1333: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 125;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar11[i37] = (char)(i39 ^ i38);
      i37++;
      break;
      i39 = 32;
      continue;
      i39 = 124;
      continue;
      i39 = 87;
      continue;
      i39 = 18;
    }
  }

  static Handler a(DeleteAccountConfirmation paramDeleteAccountConfirmation)
  {
    return paramDeleteAccountConfirmation.b;
  }

  public static void a()
  {
    boolean bool = DialogToastListActivity.f;
    App.a(App.Mb, 6);
    if (a != null)
      a.b.removeMessages(0);
    App.gb.cancel(1);
    File localFile = App.Mb.getFilesDir();
    String[] arrayOfString = App.Mb.fileList();
    int i = arrayOfString.length;
    int j = 0;
    do
    {
      if (j >= i)
        break;
      arrayOfString[j];
      j++;
    }
    while (!bool);
    fq.a(localFile);
    g5.b();
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(App.Mb);
    if (!localSharedPreferences.edit().clear().commit())
      g5.d(z[9]);
    PreferenceManager.setDefaultValues(App.Mb, 2131034116, true);
    App.a(App.Mb, 6);
    if (!localSharedPreferences.edit().putString(z[10], App.j).commit())
      g5.d(z[7]);
    c();
    App.b = false;
    App.V();
    String str = Environment.getExternalStorageState();
    g5.b(z[8] + str);
    if (str.equals(z[6]))
      fq.t();
    App.u();
    new hb().execute(new Void[0]);
  }

  private static void b()
  {
    App.bb = null;
    App.a(App.Mb, 0);
    fq.y();
    xq.f();
  }

  static void c()
  {
    if (!App.Mb.getSharedPreferences(z[4], 0).edit().clear().commit())
      g5.d(z[3]);
    if (!App.Mb.getSharedPreferences(z[5], 0).edit().clear().commit())
      g5.d(z[2]);
  }

  static DeleteAccountConfirmation d()
  {
    return a;
  }

  static void e()
  {
    b();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    g5.b(z[1]);
    setContentView(2130903086);
    findViewById(2131558650).setOnClickListener(new fr(this));
    int i = eg.h;
    if (i == -1)
      i = eg.a();
    if (i != 0)
      findViewById(2131558641).setVisibility(0);
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
      ((ProgressDialog)localObject).setMessage(getString(2131296967));
      ((ProgressDialog)localObject).setIndeterminate(true);
      ((ProgressDialog)localObject).setCancelable(false);
      continue;
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = getString(2131296328);
      localObject = localBuilder.setMessage(getString(2131296333, arrayOfObject)).setNeutralButton(2131296270, new gr(this)).create();
      continue;
      localObject = new AlertDialog.Builder(this).setMessage(2131296968).setNeutralButton(2131296270, new hr(this)).create();
    }
  }

  protected void onDestroy()
  {
    super.onDestroy();
    this.b.removeMessages(0);
  }

  protected void onPause()
  {
    super.onPause();
    a = null;
  }

  protected void onResume()
  {
    super.onResume();
    a = this;
    int i = App.c(this);
    if ((i != 3) && (i != 6))
    {
      g5.d(z[0] + i);
      startActivity(new Intent(this, Main.class));
      finish();
    }
  }
}