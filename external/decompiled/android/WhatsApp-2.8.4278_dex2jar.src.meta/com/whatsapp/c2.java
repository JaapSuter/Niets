package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

class c2
  implements DialogInterface.OnClickListener
{
  private static final String[] z;
  final RegisterPhone a;

  static
  {
    String[] arrayOfString = new String[6];
    char[] arrayOfChar1 = "\003\002I\022-\b\fPO;\020\035\nj?\022\004BE\t\r\036\nO?\022\033AN)\005\003@".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\022\bCU)\024\bVL2\017\003A\0239\017\003BU(\rBRS3\003\b".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\020\005".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label401;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\003\016".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label493;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\003\002I\022-\b\fPO;\020\035\nj?\022\004BE\t\r\036\nN5\001��MR=".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label585;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "\022\bCU)\024\bVL2\017\003A\023)\005\031G_*\b\002JY4\025��\013Z;\t\001AX".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label677;
        arrayOfString[5] = new String(arrayOfChar6).intern();
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
        m = 90;
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
        m = 96;
        continue;
        m = 109;
        continue;
        m = 36;
        continue;
        m = 60;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 90;
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
      i3 = 96;
      continue;
      i3 = 109;
      continue;
      i3 = 36;
      continue;
      i3 = 60;
    }
    label401: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 90;
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
      i7 = 96;
      continue;
      i7 = 109;
      continue;
      i7 = 36;
      continue;
      i7 = 60;
    }
    label493: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 90;
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
      i11 = 96;
      continue;
      i11 = 109;
      continue;
      i11 = 36;
      continue;
      i11 = 60;
    }
    label585: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 90;
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
      i15 = 96;
      continue;
      i15 = 109;
      continue;
      i15 = 36;
      continue;
      i15 = 60;
    }
    label677: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 90;
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
      i19 = 96;
      continue;
      i19 = 109;
      continue;
      i19 = 36;
      continue;
      i19 = 60;
    }
  }

  c2(RegisterPhone paramRegisterPhone)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    boolean bool = DialogToastListActivity.f;
    this.a.removeDialog(21);
    SharedPreferences.Editor localEditor = this.a.getSharedPreferences(this.a.getString(2131296258), 0).edit();
    localEditor.putString(z[3], RegisterPhone.m());
    localEditor.putString(z[2], RegisterPhone.n());
    if (!localEditor.commit())
      g5.d(z[5]);
    Intent localIntent;
    if (this.a.e())
    {
      if (this.a.d())
      {
        RegisterPhone.a(14);
        if (!bool);
      }
      else
      {
        RegisterPhone.a(0);
      }
      RegisterPhone.a(this.a);
      App.a(this.a, 4);
      localIntent = new Intent(this.a, VerifySms.class);
      localIntent.putExtra(z[0], this.a.y);
      localIntent.putExtra(z[4], this.a.k);
      if (!bool);
    }
    else
    {
      RegisterPhone.a(0);
      RegisterPhone.a(this.a);
      g5.b(z[1]);
      App.a(this.a, 4);
      localIntent = new Intent(this.a, VerifySms.class);
      localIntent.putExtra(z[4], this.a.k);
    }
    this.a.startActivity(localIntent);
    this.a.finish();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.c2
 * JD-Core Version:    0.6.1
 */