package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.AsyncTask.Status;
import android.os.Bundle;
import android.os.Environment;
import android.widget.LinearLayout;

public class Main extends VerifyMessageStoreActivity
{
  private static final String[] z;
  Uri l = null;
  lb m = null;

  static
  {
    String[] arrayOfString = new String[19];
    char[] arrayOfChar1 = "Upm".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i2;
    char[] arrayOfChar3;
    int i6;
    char[] arrayOfChar4;
    int i10;
    char[] arrayOfChar5;
    int i14;
    char[] arrayOfChar6;
    int i18;
    char[] arrayOfChar7;
    int i22;
    char[] arrayOfChar8;
    int i26;
    char[] arrayOfChar9;
    int i30;
    char[] arrayOfChar10;
    int i34;
    char[] arrayOfChar11;
    int i38;
    char[] arrayOfChar12;
    int i42;
    char[] arrayOfChar13;
    int i46;
    char[] arrayOfChar14;
    int i50;
    char[] arrayOfChar15;
    int i54;
    char[] arrayOfChar16;
    int i58;
    char[] arrayOfChar17;
    int i62;
    char[] arrayOfChar18;
    int i66;
    char[] arrayOfChar19;
    int i70;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "Rx`\021tM|j\r>^ml (Wv{\0138Jm".toCharArray();
      int i1 = arrayOfChar2.length;
      i2 = 0;
      if (i1 <= i2)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "Lqf\r/\\l} -Zkz\0264Q".toCharArray();
        int i5 = arrayOfChar3.length;
        i6 = 0;
        if (i5 > i6)
          break label897;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "^wm\r4V}'\0265K|g\013u^z}\0264Q7D>\022q".toCharArray();
        int i9 = arrayOfChar4.length;
        i10 = 0;
        if (i9 > i10)
          break label989;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "Rx`\021t[ph\0234X6|\017<Mxm\032".toCharArray();
        int i13 = arrayOfChar5.length;
        i14 = 0;
        if (i13 > i14)
          break label1081;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "Rx`\021t[ph\0234X6z\027.K}f\b5".toCharArray();
        int i17 = arrayOfChar6.length;
        i18 = 0;
        if (i17 > i18)
          break label1173;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "Rx`\021t[ph\0234X6y\036(Lnf\r?".toCharArray();
        int i21 = arrayOfChar7.length;
        i22 = 0;
        if (i21 > i22)
          break label1265;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "oul\036(Z9`\021(Kxe\023{Kql_?Pne\020:[|m_(P}\b:M|)\017:\\rh\030>".toCharArray();
        int i25 = arrayOfChar8.length;
        i26 = 0;
        if (i25 > i26)
          break label1357;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "\0049m\032=^le\013{Kv):\016sX".toCharArray();
        int i29 = arrayOfChar9.length;
        i30 = 0;
        if (i29 > i30)
          break label1449;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "Rx`\021tQv$\022>\020kl\0305^tl".toCharArray();
        int i33 = arrayOfChar10.length;
        i34 = 0;
        if (i33 > i34)
          break label1541;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "Rx`\021tXv}\020\032\\m`\t2K`".toCharArray();
        int i37 = arrayOfChar11.length;
        i38 = 0;
        if (i37 > i38)
          break label1633;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "Rx`\021tLqf\b{[ph\0234X9z\0065\\".toCharArray();
        int i41 = arrayOfChar12.length;
        i42 = 0;
        if (i41 > i42)
          break label1725;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "Rx`\021tR|&\r>Xwh\022>".toCharArray();
        int i45 = arrayOfChar13.length;
        i46 = 0;
        if (i45 > i46)
          break label1817;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "Rx`\021tVw\0367V}&\r>Xpz\013)^m`\0205\037j}\036/Z$".toCharArray();
        int i49 = arrayOfChar14.length;
        i50 = 0;
        if (i49 > i50)
          break label1909;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "Lqf\b\004M|n\026(Kkh\0132PwV\0312Mj} ?S~".toCharArray();
        int i53 = arrayOfChar15.length;
        i54 = 0;
        if (i53 > i54)
          break label2001;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "Rx`\021t\\kl\036/Z6k\0368Tly\0312S|z\0314Jwm_".toCharArray();
        int i57 = arrayOfChar16.length;
        i58 = 0;
        if (i57 > i58)
          break label2093;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "Rx`\021t\\kl\036/Z".toCharArray();
        int i61 = arrayOfChar17.length;
        i62 = 0;
        if (i61 > i62)
          break label2185;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "Rv|\021/Z}V\r4".toCharArray();
        int i65 = arrayOfChar18.length;
        i66 = 0;
        if (i65 > i66)
          break label2277;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "Rv|\021/Z}".toCharArray();
        int i69 = arrayOfChar19.length;
        i70 = 0;
        if (i69 > i70)
          break label2369;
        arrayOfString[18] = new String(arrayOfChar19).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int n;
      switch (j % 5)
      {
      default:
        n = 91;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[j] = (char)(n ^ k);
        j++;
        break;
        n = 63;
        continue;
        n = 25;
        continue;
        n = 9;
        continue;
        n = 127;
      }
    }
    int i3 = arrayOfChar2[i2];
    int i4;
    switch (i2 % 5)
    {
    default:
      i4 = 91;
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
      i4 = 63;
      continue;
      i4 = 25;
      continue;
      i4 = 9;
      continue;
      i4 = 127;
    }
    label897: int i7 = arrayOfChar3[i6];
    int i8;
    switch (i6 % 5)
    {
    default:
      i8 = 91;
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
      i8 = 63;
      continue;
      i8 = 25;
      continue;
      i8 = 9;
      continue;
      i8 = 127;
    }
    label989: int i11 = arrayOfChar4[i10];
    int i12;
    switch (i10 % 5)
    {
    default:
      i12 = 91;
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
      i12 = 63;
      continue;
      i12 = 25;
      continue;
      i12 = 9;
      continue;
      i12 = 127;
    }
    label1081: int i15 = arrayOfChar5[i14];
    int i16;
    switch (i14 % 5)
    {
    default:
      i16 = 91;
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
      i16 = 63;
      continue;
      i16 = 25;
      continue;
      i16 = 9;
      continue;
      i16 = 127;
    }
    label1173: int i19 = arrayOfChar6[i18];
    int i20;
    switch (i18 % 5)
    {
    default:
      i20 = 91;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i18] = (char)(i20 ^ i19);
      i18++;
      break;
      i20 = 63;
      continue;
      i20 = 25;
      continue;
      i20 = 9;
      continue;
      i20 = 127;
    }
    label1265: int i23 = arrayOfChar7[i22];
    int i24;
    switch (i22 % 5)
    {
    default:
      i24 = 91;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i22] = (char)(i24 ^ i23);
      i22++;
      break;
      i24 = 63;
      continue;
      i24 = 25;
      continue;
      i24 = 9;
      continue;
      i24 = 127;
    }
    label1357: int i27 = arrayOfChar8[i26];
    int i28;
    switch (i26 % 5)
    {
    default:
      i28 = 91;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar8[i26] = (char)(i28 ^ i27);
      i26++;
      break;
      i28 = 63;
      continue;
      i28 = 25;
      continue;
      i28 = 9;
      continue;
      i28 = 127;
    }
    label1449: int i31 = arrayOfChar9[i30];
    int i32;
    switch (i30 % 5)
    {
    default:
      i32 = 91;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar9[i30] = (char)(i32 ^ i31);
      i30++;
      break;
      i32 = 63;
      continue;
      i32 = 25;
      continue;
      i32 = 9;
      continue;
      i32 = 127;
    }
    label1541: int i35 = arrayOfChar10[i34];
    int i36;
    switch (i34 % 5)
    {
    default:
      i36 = 91;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar10[i34] = (char)(i36 ^ i35);
      i34++;
      break;
      i36 = 63;
      continue;
      i36 = 25;
      continue;
      i36 = 9;
      continue;
      i36 = 127;
    }
    label1633: int i39 = arrayOfChar11[i38];
    int i40;
    switch (i38 % 5)
    {
    default:
      i40 = 91;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar11[i38] = (char)(i40 ^ i39);
      i38++;
      break;
      i40 = 63;
      continue;
      i40 = 25;
      continue;
      i40 = 9;
      continue;
      i40 = 127;
    }
    label1725: int i43 = arrayOfChar12[i42];
    int i44;
    switch (i42 % 5)
    {
    default:
      i44 = 91;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar12[i42] = (char)(i44 ^ i43);
      i42++;
      break;
      i44 = 63;
      continue;
      i44 = 25;
      continue;
      i44 = 9;
      continue;
      i44 = 127;
    }
    label1817: int i47 = arrayOfChar13[i46];
    int i48;
    switch (i46 % 5)
    {
    default:
      i48 = 91;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar13[i46] = (char)(i48 ^ i47);
      i46++;
      break;
      i48 = 63;
      continue;
      i48 = 25;
      continue;
      i48 = 9;
      continue;
      i48 = 127;
    }
    label1909: int i51 = arrayOfChar14[i50];
    int i52;
    switch (i50 % 5)
    {
    default:
      i52 = 91;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar14[i50] = (char)(i52 ^ i51);
      i50++;
      break;
      i52 = 63;
      continue;
      i52 = 25;
      continue;
      i52 = 9;
      continue;
      i52 = 127;
    }
    label2001: int i55 = arrayOfChar15[i54];
    int i56;
    switch (i54 % 5)
    {
    default:
      i56 = 91;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar15[i54] = (char)(i56 ^ i55);
      i54++;
      break;
      i56 = 63;
      continue;
      i56 = 25;
      continue;
      i56 = 9;
      continue;
      i56 = 127;
    }
    label2093: int i59 = arrayOfChar16[i58];
    int i60;
    switch (i58 % 5)
    {
    default:
      i60 = 91;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar16[i58] = (char)(i60 ^ i59);
      i58++;
      break;
      i60 = 63;
      continue;
      i60 = 25;
      continue;
      i60 = 9;
      continue;
      i60 = 127;
    }
    label2185: int i63 = arrayOfChar17[i62];
    int i64;
    switch (i62 % 5)
    {
    default:
      i64 = 91;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar17[i62] = (char)(i64 ^ i63);
      i62++;
      break;
      i64 = 63;
      continue;
      i64 = 25;
      continue;
      i64 = 9;
      continue;
      i64 = 127;
    }
    label2277: int i67 = arrayOfChar18[i66];
    int i68;
    switch (i66 % 5)
    {
    default:
      i68 = 91;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar18[i66] = (char)(i68 ^ i67);
      i66++;
      break;
      i68 = 63;
      continue;
      i68 = 25;
      continue;
      i68 = 9;
      continue;
      i68 = 127;
    }
    label2369: int i71 = arrayOfChar19[i70];
    int i72;
    switch (i70 % 5)
    {
    default:
      i72 = 91;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar19[i70] = (char)(i72 ^ i71);
      i70++;
      break;
      i72 = 63;
      continue;
      i72 = 25;
      continue;
      i72 = 9;
      continue;
      i72 = 127;
    }
  }

  private void a()
  {
    String str = getIntent().getStringExtra(z[0]);
    if ((str != null) && (str.length() > 0))
    {
      zq localzq = App.w.a(str, null);
      if ((localzq != null) && (((!localzq.o()) && (!localzq.p())) || (localzq.h != null)))
        if (!isFinishing())
        {
          startActivity(Conversation.a(localzq));
          finish();
        }
    }
    while (true)
    {
      return;
      g();
      g();
    }
  }

  static void a(Main paramMain)
  {
    paramMain.g();
  }

  static void b(Main paramMain)
  {
    paramMain.a();
  }

  private void g()
  {
    if (!isFinishing())
    {
      Intent localIntent = getIntent();
      if ((localIntent != null) && (!z[3].equals(localIntent.getAction())) && ((0x4000000 & localIntent.getFlags()) != 0) && (!localIntent.hasExtra(z[0])))
      {
        SharedPreferences localSharedPreferences = getSharedPreferences(getString(2131296258), 0);
        if ((localSharedPreferences != null) && (localSharedPreferences.getInt(z[2], 0) == 0))
        {
          g5.b(z[1]);
          RegisterName.a(this, getString(2131296256), 0);
          RegisterName.a(this, getString(2131296256));
          SharedPreferences.Editor localEditor = localSharedPreferences.edit();
          localEditor.putInt(z[2], 1);
          localEditor.commit();
        }
      }
      startActivity(new Intent(this, Conversations.class));
      finish();
    }
  }

  protected void d()
  {
    eu.h = true;
    eu.j = true;
  }

  protected void e()
  {
    boolean bool = DialogToastListActivity.f;
    super.e();
    Intent localIntent;
    if (App.bb == null)
      if (!isFinishing())
      {
        int i = App.c(this);
        switch (i)
        {
        case 3:
        default:
          g5.d(z[13] + i + z[8]);
          App.a(this, 0);
          localIntent = new Intent(this, EULA.class);
          if (localIntent != null)
          {
            startActivity(localIntent);
            finish();
          }
          break;
        case 0:
        case 1:
        case 5:
        case 2:
        case 4:
        case 6:
        }
      }
    while (true)
    {
      return;
      localIntent = new Intent(this, EULA.class);
      if (!getIntent().getBooleanExtra(z[14], false))
        break;
      localIntent.putExtra(z[14], true);
      break;
      localIntent = new Intent(this, RegisterPhone.class);
      break;
      g5.b(z[9]);
      localIntent = new Intent(this, RegisterName.class);
      break;
      localIntent = new Intent(this, VerifySms.class);
      break;
      localIntent = new Intent(this, DeleteAccountConfirmation.class);
      break;
      if ((App.bb != null) && (App.c(this) == 2))
      {
        g5.b(z[12]);
        startActivity(new Intent(this, RegisterName.class));
        finish();
      }
      else
      {
        App.a(this, 3);
        this.l = k4.c();
        if ((App.g == 1) && (this.l != null))
        {
          if (!isFinishing())
          {
            showDialog(0);
            if (!bool);
          }
        }
        else if (App.cb == null)
        {
          if (!isFinishing())
          {
            showDialog(1);
            if (!bool);
          }
        }
        else if (App.kb)
        {
          if (!isFinishing())
          {
            showDialog(2);
            if (!bool);
          }
        }
        else if (eu.j)
        {
          if ((this.m == null) || (this.m.getStatus() != AsyncTask.Status.RUNNING))
          {
            this.m = new lb(this);
            this.m.execute(new Void[0]);
            if (!bool);
          }
          else
          {
            g5.b(z[11]);
            showDialog(104);
            if (!bool);
          }
        }
        else
        {
          g5.b(z[10]);
          a();
        }
      }
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    boolean bool = DialogToastListActivity.f;
    super.onCreate(paramBundle);
    g5.b(z[16]);
    setContentView(new LinearLayout(this));
    int i = App.c(this);
    if ((App.bb == null) && (i == 0))
      if (!isFinishing())
      {
        Intent localIntent = new Intent(this, EULA.class);
        if (getIntent().getBooleanExtra(z[14], false))
          localIntent.putExtra(z[14], true);
        startActivity(localIntent);
        finish();
      }
    while (true)
    {
      return;
      if (i == 6)
      {
        if (!isFinishing())
        {
          startActivity(new Intent(this, DeleteAccountConfirmation.class));
          finish();
        }
      }
      else if ((App.bb != null) && (!App.z.l()))
      {
        String str = Environment.getExternalStorageState();
        if ((!str.equals(z[18])) && (!str.equals(z[17])))
        {
          showDialog(107);
          if (!bool);
        }
        else
        {
          int j = App.z.e();
          g5.b(z[15] + j);
          if (j > 0)
          {
            showDialog(105);
            if (!bool);
          }
          else
          {
            new ac(this, false, false).execute(new Object[0]);
          }
        }
        if (!bool);
      }
      else
      {
        e();
      }
    }
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    Object localObject;
    switch (paramInt)
    {
    default:
      localObject = super.onCreateDialog(paramInt);
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return localObject;
      g5.b(z[4]);
      localObject = new AlertDialog.Builder(this).setTitle(2131296671).setMessage(2131296673).setPositiveButton(2131296272, new jw(this)).setNeutralButton(2131296278, new iw(this)).setNegativeButton(2131296277, new hw(this)).create();
      continue;
      g5.b(z[6]);
      localObject = new AlertDialog.Builder(this).setTitle(2131296269).setMessage(2131296818).setNeutralButton(2131296270, new kw(this)).create();
      continue;
      g5.b(z[5]);
      localObject = new AlertDialog.Builder(this).setTitle(2131296269).setCancelable(false).setMessage(z[7]).setNeutralButton(2131296270, new lw(this)).create();
    }
  }
}