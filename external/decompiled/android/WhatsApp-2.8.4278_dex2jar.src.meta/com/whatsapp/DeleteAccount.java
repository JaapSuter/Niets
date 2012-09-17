package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.io.IOException;

public class DeleteAccount extends DialogToastActivity
{
  private static String f;
  private static String g;
  private static final String[] z;
  private TextWatcher h;
  private TextWatcher i;
  private String j;
  private int k;
  private int l;
  boolean m = false;
  EditText n;
  EditText o;
  EditText p;

  static
  {
    String[] arrayOfString = new String[14];
    char[] arrayOfChar1 = "\017\017".toCharArray();
    int i1 = arrayOfChar1.length;
    int i2 = 0;
    char[] arrayOfChar2;
    int i6;
    char[] arrayOfChar3;
    int i10;
    char[] arrayOfChar4;
    int i14;
    char[] arrayOfChar5;
    int i18;
    char[] arrayOfChar6;
    int i22;
    char[] arrayOfChar7;
    int i26;
    char[] arrayOfChar8;
    int i30;
    char[] arrayOfChar9;
    int i34;
    char[] arrayOfChar10;
    int i38;
    char[] arrayOfChar11;
    int i42;
    char[] arrayOfChar12;
    int i46;
    char[] arrayOfChar13;
    int i50;
    char[] arrayOfChar14;
    int i54;
    if (i1 <= i2)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\017\003iZQ\036\025CZD\001\t".toCharArray();
      int i5 = arrayOfChar2.length;
      i6 = 0;
      if (i5 <= i6)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "L\017}AV\t\b<UKL%Sq]\017\tl@L\003\002".toCharArray();
        int i9 = arrayOfChar3.length;
        i10 = 0;
        if (i9 > i10)
          break label713;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "L\020<".toCharArray();
        int i13 = arrayOfChar4.length;
        i14 = 0;
        if (i13 > i14)
          break label805;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\b\tpQQ\t\rWQC\017sAK\030\036e\016".toCharArray();
        int i17 = arrayOfChar5.length;
        i18 = 0;
        if (i17 > i18)
          break label897;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "\b\tpQQ\t\rWQC\017sAK\030\036e\016\005".toCharArray();
        int i21 = arrayOfChar6.length;
        i22 = 0;
        if (i21 > i22)
          break label989;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "\b\tpQQ\t\rWQC\nsFH\r\030hQWA\tdW@\034\030u[K".toCharArray();
        int i25 = arrayOfChar7.length;
        i26 = 0;
        if (i25 > i26)
          break label1081;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "\n\ruX@\bLh[\005��\003s_P\034/sAK\030\036euG\016\036^Mk\r\001y\024C\036\003q\024f\003\031r@W\025<t[K\t%rRJL".toCharArray();
        int i29 = arrayOfChar8.length;
        i30 = 0;
        if (i29 > i30)
          break label1173;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "\b\tpQQ\t\rWQC\034}AV\tL".toCharArray();
        int i33 = arrayOfChar9.length;
        i34 = 0;
        if (i33 > i34)
          break label1265;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "L\n}]I\t\b<wJ\031\002hF\\<\004sZ@%\002z[\013��\003s_P\034/sAK\030\036euG\016\036^Mk\r\001y\034\f".toCharArray();
        int i37 = arrayOfChar10.length;
        i38 = 0;
        if (i37 > i38)
          break label1357;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "\b\tpQQ\t\rWQC\005o[\n\017\003xQ\005\n\ruX@\bLh[\005\013\th\024F\003\by\024C\036\003q\024f\003\031r@W\025<t[K\t%rRJ".toCharArray();
        int i41 = arrayOfChar11.length;
        i42 = 0;
        if (i41 > i42)
          break label1449;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "\b\tpQQ\t\rWQC\017nQD\030\t".toCharArray();
        int i45 = arrayOfChar12.length;
        i46 = 0;
        if (i45 > i46)
          break label1541;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "\b\tpQQ\t\rWQC\034t[K\tCsZa\t\037hFJ\025D5".toCharArray();
        int i49 = arrayOfChar13.length;
        i50 = 0;
        if (i49 > i50)
          break label1633;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "\b\tpQQ\t\rWQC\034t[K\tCnQV\031\001y".toCharArray();
        int i53 = arrayOfChar14.length;
        i54 = 0;
        if (i53 > i54)
          break label1725;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        z = arrayOfString;
        f = null;
        g = null;
      }
    }
    else
    {
      int i3 = arrayOfChar1[i2];
      int i4;
      switch (i2 % 5)
      {
      default:
        i4 = 37;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[i2] = (char)(i4 ^ i3);
        i2++;
        break;
        i4 = 108;
        continue;
        i4 = 108;
        continue;
        i4 = 28;
        continue;
        i4 = 52;
      }
    }
    int i7 = arrayOfChar2[i6];
    int i8;
    switch (i6 % 5)
    {
    default:
      i8 = 37;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i6] = (char)(i8 ^ i7);
      i6++;
      break;
      i8 = 108;
      continue;
      i8 = 108;
      continue;
      i8 = 28;
      continue;
      i8 = 52;
    }
    label713: int i11 = arrayOfChar3[i10];
    int i12;
    switch (i10 % 5)
    {
    default:
      i12 = 37;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i10] = (char)(i12 ^ i11);
      i10++;
      break;
      i12 = 108;
      continue;
      i12 = 108;
      continue;
      i12 = 28;
      continue;
      i12 = 52;
    }
    label805: int i15 = arrayOfChar4[i14];
    int i16;
    switch (i14 % 5)
    {
    default:
      i16 = 37;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i14] = (char)(i16 ^ i15);
      i14++;
      break;
      i16 = 108;
      continue;
      i16 = 108;
      continue;
      i16 = 28;
      continue;
      i16 = 52;
    }
    label897: int i19 = arrayOfChar5[i18];
    int i20;
    switch (i18 % 5)
    {
    default:
      i20 = 37;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i18] = (char)(i20 ^ i19);
      i18++;
      break;
      i20 = 108;
      continue;
      i20 = 108;
      continue;
      i20 = 28;
      continue;
      i20 = 52;
    }
    label989: int i23 = arrayOfChar6[i22];
    int i24;
    switch (i22 % 5)
    {
    default:
      i24 = 37;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i22] = (char)(i24 ^ i23);
      i22++;
      break;
      i24 = 108;
      continue;
      i24 = 108;
      continue;
      i24 = 28;
      continue;
      i24 = 52;
    }
    label1081: int i27 = arrayOfChar7[i26];
    int i28;
    switch (i26 % 5)
    {
    default:
      i28 = 37;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i26] = (char)(i28 ^ i27);
      i26++;
      break;
      i28 = 108;
      continue;
      i28 = 108;
      continue;
      i28 = 28;
      continue;
      i28 = 52;
    }
    label1173: int i31 = arrayOfChar8[i30];
    int i32;
    switch (i30 % 5)
    {
    default:
      i32 = 37;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar8[i30] = (char)(i32 ^ i31);
      i30++;
      break;
      i32 = 108;
      continue;
      i32 = 108;
      continue;
      i32 = 28;
      continue;
      i32 = 52;
    }
    label1265: int i35 = arrayOfChar9[i34];
    int i36;
    switch (i34 % 5)
    {
    default:
      i36 = 37;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar9[i34] = (char)(i36 ^ i35);
      i34++;
      break;
      i36 = 108;
      continue;
      i36 = 108;
      continue;
      i36 = 28;
      continue;
      i36 = 52;
    }
    label1357: int i39 = arrayOfChar10[i38];
    int i40;
    switch (i38 % 5)
    {
    default:
      i40 = 37;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar10[i38] = (char)(i40 ^ i39);
      i38++;
      break;
      i40 = 108;
      continue;
      i40 = 108;
      continue;
      i40 = 28;
      continue;
      i40 = 52;
    }
    label1449: int i43 = arrayOfChar11[i42];
    int i44;
    switch (i42 % 5)
    {
    default:
      i44 = 37;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar11[i42] = (char)(i44 ^ i43);
      i42++;
      break;
      i44 = 108;
      continue;
      i44 = 108;
      continue;
      i44 = 28;
      continue;
      i44 = 52;
    }
    label1541: int i47 = arrayOfChar12[i46];
    int i48;
    switch (i46 % 5)
    {
    default:
      i48 = 37;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar12[i46] = (char)(i48 ^ i47);
      i46++;
      break;
      i48 = 108;
      continue;
      i48 = 108;
      continue;
      i48 = 28;
      continue;
      i48 = 52;
    }
    label1633: int i51 = arrayOfChar13[i50];
    int i52;
    switch (i50 % 5)
    {
    default:
      i52 = 37;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar13[i50] = (char)(i52 ^ i51);
      i50++;
      break;
      i52 = 108;
      continue;
      i52 = 108;
      continue;
      i52 = 28;
      continue;
      i52 = 52;
    }
    label1725: int i55 = arrayOfChar14[i54];
    int i56;
    switch (i54 % 5)
    {
    default:
      i56 = 37;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar14[i54] = (char)(i56 ^ i55);
      i54++;
      break;
      i56 = 108;
      continue;
      i56 = 108;
      continue;
      i56 = 28;
      continue;
      i56 = 52;
    }
  }

  static String a()
  {
    return f;
  }

  static String a(DeleteAccount paramDeleteAccount)
  {
    return paramDeleteAccount.j;
  }

  static void a(DeleteAccount paramDeleteAccount, String paramString)
  {
    paramDeleteAccount.a(paramString);
  }

  private void a(String paramString)
  {
    try
    {
      g5.b(z[4] + paramString + z[3] + jp.e(paramString));
    }
    catch (IOException localIOException1)
    {
      try
      {
        while (true)
        {
          if (this.i != null)
            this.p.removeTextChangedListener(this.i);
          this.i = new zx(jp.e(paramString));
          this.p.addTextChangedListener(this.i);
          return;
          localIOException1 = localIOException1;
          g5.d(z[5] + paramString + z[7] + localIOException1.toString());
        }
      }
      catch (NullPointerException localNullPointerException)
      {
        while (true)
          g5.b(z[6], localNullPointerException);
      }
      catch (IOException localIOException2)
      {
        while (true)
          g5.b(z[4] + paramString + z[2], localIOException2);
      }
    }
  }

  static TextWatcher b(DeleteAccount paramDeleteAccount)
  {
    return paramDeleteAccount.h;
  }

  static String b()
  {
    return g;
  }

  static String b(String paramString)
  {
    f = paramString;
    return paramString;
  }

  static String c(String paramString)
  {
    g = paramString;
    return paramString;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 0) && (paramInt2 == -1))
    {
      f = paramIntent.getStringExtra(z[0]);
      this.j = paramIntent.getStringExtra(z[1]);
      this.n.setText(f);
      this.o.setText(this.j);
      a(this.j);
      if (this.l == -1)
        this.l = 2147483647;
      this.k = -1;
    }
    this.n.addTextChangedListener(this.h);
  }

  protected void onCreate(Bundle paramBundle)
  {
    g5.b(z[11]);
    super.onCreate(paramBundle);
    setContentView(2130903085);
    this.n = ((EditText)findViewById(2131558647));
    this.o = ((EditText)findViewById(2131558645));
    this.p = ((EditText)findViewById(2131558648));
    ((TextView)findViewById(2131558643)).setText(getString(2131296366).toUpperCase());
    ((TextView)findViewById(2131558646)).setText(getString(2131296365).toUpperCase());
    TextView localTextView = (TextView)findViewById(2131558642);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = getString(2131296738);
    localTextView.setText(getString(2131296963, arrayOfObject));
    InputFilter[] arrayOfInputFilter1 = new InputFilter[1];
    arrayOfInputFilter1[0] = new InputFilter.LengthFilter(3);
    this.n.setFilters(arrayOfInputFilter1);
    InputFilter[] arrayOfInputFilter2 = new InputFilter[1];
    arrayOfInputFilter2[0] = new InputFilter.LengthFilter(17);
    this.p.setFilters(arrayOfInputFilter2);
    String str1 = App.db.getNetworkCountryIso();
    if (str1 != null);
    try
    {
      f = jp.d(str1);
      this.h = new cr(this);
      this.n.addTextChangedListener(this.h);
      dr localdr = new dr(this);
      this.o.setOnClickListener(localdr);
      this.p.requestFocus();
      this.l = RegisterPhone.a(this.p);
      this.k = RegisterPhone.a(this.n);
      ((Button)findViewById(2131558649)).setOnClickListener(new er(this));
      if (f != null)
        this.n.setText(f);
      str2 = this.o.getText().toString();
      if ((str2 == null) || (str2.length() <= 0));
    }
    catch (IOException localIOException2)
    {
      try
      {
        g5.b(z[4] + str2 + z[3] + jp.e(str2));
        a(str2);
        int i1 = eg.h;
        if (i1 == -1)
          i1 = eg.a();
        if (i1 != 0)
          findViewById(2131558641).setVisibility(0);
        return;
        localIOException2 = localIOException2;
        g5.d(z[10]);
      }
      catch (IOException localIOException1)
      {
        while (true)
        {
          String str2;
          g5.b(z[4] + str2 + z[9], localIOException1);
        }
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
    case 1:
    }
    while (true)
    {
      return localObject;
      localObject = new ProgressDialog(this);
      ((ProgressDialog)localObject).setMessage(getString(2131296335));
      ((ProgressDialog)localObject).setIndeterminate(true);
      ((ProgressDialog)localObject).setCancelable(false);
    }
  }

  protected void onDestroy()
  {
    g5.b(z[12]);
    super.onDestroy();
  }

  public void onPause()
  {
    super.onPause();
    this.l = RegisterPhone.a(this.p);
    this.k = RegisterPhone.a(this.n);
    g5.b(z[8]);
  }

  public void onResume()
  {
    super.onResume();
    if (f != null)
      this.n.setText(f);
    if (this.j != null)
      this.o.setText(this.j);
    RegisterPhone.b(this.n, this.k);
    RegisterPhone.b(this.p, this.l);
    g5.b(z[13]);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.DeleteAccount
 * JD-Core Version:    0.6.1
 */