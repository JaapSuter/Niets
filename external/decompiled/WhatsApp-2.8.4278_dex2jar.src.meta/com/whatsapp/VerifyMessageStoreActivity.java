package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;

public class VerifyMessageStoreActivity extends UserFeedbackActivity
{
  protected static f j;
  private static final String[] z;
  protected boolean k = false;

  static
  {
    String[] arrayOfString = new String[8];
    char[] arrayOfChar1 = "JB\f\\YEJ\rRLHH\fP\020IT\033]VOS\021GFUA\033MVOS\r\032]]D\025@OZN\022PLZH\013[[\034".toCharArray();
    int i = arrayOfChar1.length;
    int m = 0;
    char[] arrayOfChar2;
    int i3;
    char[] arrayOfChar3;
    int i7;
    char[] arrayOfChar4;
    int i11;
    char[] arrayOfChar5;
    int i15;
    char[] arrayOfChar6;
    int i19;
    char[] arrayOfChar7;
    int i23;
    char[] arrayOfChar8;
    int i27;
    if (i <= m)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "JB\f\\YEJ\rRLHH\fP\020XN\037YP[\b\023P[UF\035TMXI\021AYSR\020Q^OL\fPKN^".toCharArray();
      int i2 = arrayOfChar2.length;
      i3 = 0;
      if (i2 <= i3)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "JB\f\\YEJ\rRLHH\fP\020XN\037YP[\b\rPKIW".toCharArray();
        int i6 = arrayOfChar3.length;
        i7 = 0;
        if (i6 > i7)
          break label481;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "JB\f\\YEJ\rRLHH\fP\020XN\037YP[\b\fPLHH\fP[IB\nZZNU\021G".toCharArray();
        int i10 = arrayOfChar4.length;
        i11 = 0;
        if (i10 > i11)
          break label573;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "JB\f\\YEJ\rRLHH\fP\020XN\037YP[\b\031GPIW\rLQ_".toCharArray();
        int i14 = arrayOfChar5.length;
        i15 = 0;
        if (i14 > i15)
          break label665;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "JB\f\\YEJ\rRLHH\fP\020XN\037YP[\b\fPLHH\fP".toCharArray();
        int i18 = arrayOfChar6.length;
        i19 = 0;
        if (i18 > i19)
          break label757;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "JB\f\\YEJ\rRLHH\fP\020XN\037YP[\b\fPLHH\fPYNH\023W^_L\013E[IB\nZZNU\021G\\]U\032[PHA\021@QXF\r^MYS\fL".toCharArray();
        int i22 = arrayOfChar7.length;
        i23 = 0;
        if (i22 > i23)
          break label849;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "JB\f\\YEJ\rRLHH\fP\020XN\037YP[\b\023FXOS\021GZYU\fZM".toCharArray();
        int i26 = arrayOfChar8.length;
        i27 = 0;
        if (i26 > i27)
          break label941;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        z = arrayOfString;
        j = null;
      }
    }
    else
    {
      int n = arrayOfChar1[m];
      int i1;
      switch (m % 5)
      {
      default:
        i1 = 63;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[m] = (char)(i1 ^ n);
        m++;
        break;
        i1 = 60;
        continue;
        i1 = 39;
        continue;
        i1 = 126;
        continue;
        i1 = 53;
      }
    }
    int i4 = arrayOfChar2[i3];
    int i5;
    switch (i3 % 5)
    {
    default:
      i5 = 63;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i3] = (char)(i5 ^ i4);
      i3++;
      break;
      i5 = 60;
      continue;
      i5 = 39;
      continue;
      i5 = 126;
      continue;
      i5 = 53;
    }
    label481: int i8 = arrayOfChar3[i7];
    int i9;
    switch (i7 % 5)
    {
    default:
      i9 = 63;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i7] = (char)(i9 ^ i8);
      i7++;
      break;
      i9 = 60;
      continue;
      i9 = 39;
      continue;
      i9 = 126;
      continue;
      i9 = 53;
    }
    label573: int i12 = arrayOfChar4[i11];
    int i13;
    switch (i11 % 5)
    {
    default:
      i13 = 63;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i11] = (char)(i13 ^ i12);
      i11++;
      break;
      i13 = 60;
      continue;
      i13 = 39;
      continue;
      i13 = 126;
      continue;
      i13 = 53;
    }
    label665: int i16 = arrayOfChar5[i15];
    int i17;
    switch (i15 % 5)
    {
    default:
      i17 = 63;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i15] = (char)(i17 ^ i16);
      i15++;
      break;
      i17 = 60;
      continue;
      i17 = 39;
      continue;
      i17 = 126;
      continue;
      i17 = 53;
    }
    label757: int i20 = arrayOfChar6[i19];
    int i21;
    switch (i19 % 5)
    {
    default:
      i21 = 63;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i19] = (char)(i21 ^ i20);
      i19++;
      break;
      i21 = 60;
      continue;
      i21 = 39;
      continue;
      i21 = 126;
      continue;
      i21 = 53;
    }
    label849: int i24 = arrayOfChar7[i23];
    int i25;
    switch (i23 % 5)
    {
    default:
      i25 = 63;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i23] = (char)(i25 ^ i24);
      i23++;
      break;
      i25 = 60;
      continue;
      i25 = 39;
      continue;
      i25 = 126;
      continue;
      i25 = 53;
    }
    label941: int i28 = arrayOfChar8[i27];
    int i29;
    switch (i27 % 5)
    {
    default:
      i29 = 63;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar8[i27] = (char)(i29 ^ i28);
      i27++;
      break;
      i29 = 60;
      continue;
      i29 = 39;
      continue;
      i29 = 126;
      continue;
      i29 = 53;
    }
  }

  protected void c()
  {
    int i = App.z.e();
    g5.b(z[0] + i);
    if (i > 0)
    {
      showDialog(103);
      if (!DialogToastListActivity.f);
    }
    else
    {
      new ac(this, false, this.k).execute(new Object[0]);
    }
  }

  protected void d()
  {
  }

  protected void e()
  {
  }

  protected void f()
  {
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    Object localObject;
    switch (paramInt)
    {
    default:
      localObject = super.onCreateDialog(paramInt);
    case 100:
    case 101:
    case 102:
    case 107:
    case 103:
    case 105:
    case 106:
    case 104:
    }
    while (true)
    {
      return localObject;
      g5.b(z[2]);
      j = new f(this);
      j.setTitle(getString(2131296937));
      j.setMessage(getString(2131296938));
      j.setIndeterminate(false);
      j.setCancelable(false);
      j.setProgressStyle(1);
      localObject = j;
      continue;
      g5.b(z[7]);
      localObject = new AlertDialog.Builder(this).setTitle(2131296269).setMessage(getString(2131296939)).setNeutralButton(2131296270, new x5(this)).create();
      continue;
      g5.b(z[1]);
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this).setTitle(2131296269);
      if (App.tb());
      for (int m = 2131296428; ; m = 2131296429)
      {
        localObject = localBuilder.setMessage(getString(m)).setNegativeButton(2131296484, new b6(this)).setPositiveButton(2131296286, new a6(this)).setCancelable(false).create();
        break;
      }
      g5.b(z[6]);
      StringBuilder localStringBuilder = new StringBuilder().append(getString(2131296433)).append(" ");
      if (App.tb());
      for (int i = 2131296428; ; i = 2131296429)
      {
        String str2 = getString(i);
        localObject = new AlertDialog.Builder(this).setTitle(2131296269).setMessage(str2).setNegativeButton(2131296484, new d6(this)).setPositiveButton(2131296286, new c6(this)).setCancelable(false).create();
        break;
      }
      g5.b(z[5]);
      localObject = new AlertDialog.Builder(this).setTitle(2131296430).setMessage(getString(2131296431)).setPositiveButton(2131296272, new f6(this)).setNegativeButton(2131296273, new e6(this)).setCancelable(false).create();
      continue;
      g5.b(z[3]);
      String str1 = getString(2131296433) + " " + getString(2131296431);
      localObject = new AlertDialog.Builder(this).setTitle(2131296432).setMessage(str1).setPositiveButton(2131296272, new h6(this)).setNegativeButton(2131296273, new g6(this)).setCancelable(false).create();
      continue;
      localObject = new AlertDialog.Builder(this).setTitle(2131296434).setMessage(getString(2131296435)).setPositiveButton(2131296437, new z5(this)).setNegativeButton(2131296436, new y5(this)).setCancelable(false).create();
      continue;
      g5.b(z[4]);
      localObject = new f(this);
      ((f)localObject).setTitle(getString(2131296393));
      ((f)localObject).setMessage(getString(2131296394));
      ((f)localObject).setIndeterminate(true);
      ((f)localObject).setCancelable(false);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.VerifyMessageStoreActivity
 * JD-Core Version:    0.6.1
 */