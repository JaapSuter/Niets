package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;

public class VerifyMessageStoreListActivity extends DialogToastListActivity
{
  protected static f g;
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[8];
    char[] arrayOfChar1 = "d\002(zkk\n)t~f\b(va{\024.<xa\0022z~f\b(jdt\002\"z~f\024uqlq\f/ck{\013?`k}\0224w-".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "d\002(zkk\n)t~f\b(va{\024.<i{\0066|j=\n?wds\004;ai|\b.ubg\t>r~y\025?gk".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "d\002(zkk\n)t~f\b(va{\024.<i{\0066|j=��(|xb\024#}n".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label481;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "d\002(zkk\n)t~f\b(va{\024.<i{\0066|j=\025?`y}\025?wxw\0235v`\b(".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label573;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "d\002(zkk\n)t~f\b(va{\024.<i{\0066|j=\025?`y}\025?u}\n8rny\022*wxw\0235v`\b(pl`\0034|yt\b/}is\0241ahf\025#".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label665;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "d\002(zkk\n)t~f\b(va{\024.<i{\0066|j=\n)t~f\b(vh`\0255a".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label757;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "d\002(zkk\n)t~f\b(va{\024.<i{\0066|j=\025?`y}\025?".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label849;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "d\002(zkk\n)t~f\b(va{\024.<i{\0066|j=\024?gxb".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label941;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        z = arrayOfString;
        g = null;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 13;
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
        m = 18;
        continue;
        m = 103;
        continue;
        m = 90;
        continue;
        m = 19;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 13;
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
      i3 = 18;
      continue;
      i3 = 103;
      continue;
      i3 = 90;
      continue;
      i3 = 19;
    }
    label481: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 13;
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
      i7 = 18;
      continue;
      i7 = 103;
      continue;
      i7 = 90;
      continue;
      i7 = 19;
    }
    label573: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 13;
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
      i11 = 18;
      continue;
      i11 = 103;
      continue;
      i11 = 90;
      continue;
      i11 = 19;
    }
    label665: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 13;
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
      i15 = 18;
      continue;
      i15 = 103;
      continue;
      i15 = 90;
      continue;
      i15 = 19;
    }
    label757: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 13;
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
      i19 = 18;
      continue;
      i19 = 103;
      continue;
      i19 = 90;
      continue;
      i19 = 19;
    }
    label849: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 13;
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
      i23 = 18;
      continue;
      i23 = 103;
      continue;
      i23 = 90;
      continue;
      i23 = 19;
    }
    label941: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 13;
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
      i27 = 18;
      continue;
      i27 = 103;
      continue;
      i27 = 90;
      continue;
      i27 = 19;
    }
  }

  protected void b()
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
      new bc(this, false, false).execute(new Object[0]);
    }
  }

  protected void c()
  {
  }

  protected void d()
  {
  }

  protected void e()
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
      g5.b(z[7]);
      g = new f(this);
      g.setTitle(getString(2131296937));
      g.setMessage(getString(2131296938));
      g.setIndeterminate(false);
      g.setCancelable(false);
      g.setProgressStyle(1);
      localObject = g;
      continue;
      g5.b(z[5]);
      localObject = new AlertDialog.Builder(this).setTitle(2131296269).setMessage(getString(2131296939)).setNeutralButton(2131296270, new j6(this)).create();
      continue;
      g5.b(z[1]);
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this).setTitle(2131296269);
      if (App.tb());
      for (int j = 2131296428; ; j = 2131296429)
      {
        localObject = localBuilder.setMessage(getString(j)).setNegativeButton(2131296484, new n6(this)).setPositiveButton(2131296286, new m6(this)).setCancelable(false).create();
        break;
      }
      g5.b(z[4]);
      StringBuilder localStringBuilder = new StringBuilder().append(getString(2131296433)).append(" ");
      if (App.tb());
      for (int i = 2131296428; ; i = 2131296429)
      {
        String str2 = getString(i);
        localObject = new AlertDialog.Builder(this).setTitle(2131296269).setMessage(str2).setNegativeButton(2131296484, new p6(this)).setPositiveButton(2131296286, new o6(this)).setCancelable(false).create();
        break;
      }
      g5.b(z[6]);
      localObject = new AlertDialog.Builder(this).setTitle(2131296430).setMessage(getString(2131296431)).setPositiveButton(2131296272, new r6(this)).setNegativeButton(2131296273, new q6(this)).setCancelable(false).create();
      continue;
      g5.b(z[3]);
      String str1 = getString(2131296433) + " " + getString(2131296431);
      localObject = new AlertDialog.Builder(this).setTitle(2131296432).setMessage(str1).setPositiveButton(2131296272, new t6(this)).setNegativeButton(2131296273, new s6(this)).setCancelable(false).create();
      continue;
      localObject = new AlertDialog.Builder(this).setTitle(2131296434).setMessage(getString(2131296435)).setPositiveButton(2131296437, new l6(this)).setNegativeButton(2131296436, new k6(this)).setCancelable(false).create();
      continue;
      g5.b(z[2]);
      localObject = new f(this);
      ((f)localObject).setTitle(getString(2131296393));
      ((f)localObject).setMessage(getString(2131296394));
      ((f)localObject).setIndeterminate(true);
      ((f)localObject).setCancelable(false);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.VerifyMessageStoreListActivity
 * JD-Core Version:    0.6.1
 */