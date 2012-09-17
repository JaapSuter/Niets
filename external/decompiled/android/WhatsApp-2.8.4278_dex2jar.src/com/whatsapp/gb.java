package com.whatsapp;

import android.content.Intent;
import android.os.AsyncTask;
import java.io.IOException;

public class gb extends AsyncTask<String, Void, Integer>
{
  private static final String[] z;
  final DeleteAccount a;

  static
  {
    String[] arrayOfString = new String[6];
    char[] arrayOfChar1 = "=k\021j\003<o\036l\003vm\025j\0242`\bb\025<|Rv\022*".toCharArray();
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
      arrayOfChar2 = "=k\021j\003<o\036l\003vm\025j\0242`\bb\025<|Rx\0056`\032\"\031,c\037j\005ym\0362".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "y~\025a\00243".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label401;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "=k\021j\003<o\036l\003vm\025j\0242`\bb\025<|Rf\030<|\017`\005y".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label493;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "=k\021j\003<o\036l\003vm\025j\0242`\bb\025<|Rj\005+a\017/".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label585;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "y|\030i\002*k\031".toCharArray();
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
        m = 119;
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
        m = 89;
        continue;
        m = 14;
        continue;
        m = 125;
        continue;
        m = 15;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 119;
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
      i3 = 89;
      continue;
      i3 = 14;
      continue;
      i3 = 125;
      continue;
      i3 = 15;
    }
    label401: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 119;
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
      i7 = 89;
      continue;
      i7 = 14;
      continue;
      i7 = 125;
      continue;
      i7 = 15;
    }
    label493: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 119;
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
      i11 = 89;
      continue;
      i11 = 14;
      continue;
      i11 = 125;
      continue;
      i11 = 15;
    }
    label585: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 119;
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
      i15 = 89;
      continue;
      i15 = 14;
      continue;
      i15 = 125;
      continue;
      i15 = 15;
    }
    label677: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 119;
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
      i19 = 89;
      continue;
      i19 = 14;
      continue;
      i19 = 125;
      continue;
      i19 = 15;
    }
  }

  protected gb(DeleteAccount paramDeleteAccount)
  {
  }

  protected Integer a(String[] paramArrayOfString)
  {
    Object localObject;
    try
    {
      String str2 = yp.a(paramArrayOfString[0], paramArrayOfString[1]);
      if (App.bb.jabber_id.equals(str2))
      {
        localObject = Integer.valueOf(1);
      }
      else
      {
        Integer localInteger = Integer.valueOf(2);
        localObject = localInteger;
      }
    }
    catch (IOException localIOException)
    {
      String str1 = localIOException.toString();
      g5.d(z[3] + str1);
      if ((str1 != null) && (str1.contains(z[5])))
        localObject = Integer.valueOf(4);
      else
        localObject = Integer.valueOf(3);
    }
    catch (Exception localException)
    {
      g5.d(z[4] + localException.toString());
      localObject = Integer.valueOf(4);
    }
    return localObject;
  }

  protected void a(Integer paramInteger)
  {
    boolean bool = DialogToastListActivity.f;
    this.a.removeDialog(1);
    if (paramInteger.intValue() == 1)
    {
      g5.b(z[0]);
      Intent localIntent = new Intent(this.a, DeleteAccountConfirmation.class);
      this.a.startActivity(localIntent);
      this.a.finish();
      if (!bool);
    }
    else if (paramInteger.intValue() == 2)
    {
      g5.c(z[1] + DeleteAccount.a() + z[2] + DeleteAccount.b());
      this.a.a(2131296964);
      if (!bool);
    }
    else if (paramInteger.intValue() == 4)
    {
      if (!this.a.isFinishing())
      {
        this.a.showDialog(109);
        if (!bool);
      }
    }
    else if ((paramInteger.intValue() == 3) && (!this.a.isFinishing()))
    {
      DeleteAccount localDeleteAccount1 = this.a;
      DeleteAccount localDeleteAccount2 = this.a;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.a.getString(2131296328);
      localDeleteAccount1.c(localDeleteAccount2.getString(2131296333, arrayOfObject));
    }
  }

  protected void onPreExecute()
  {
    this.a.showDialog(1);
  }
}