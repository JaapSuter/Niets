package com.whatsapp;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.ContentObserver;
import android.os.Handler;
import java.util.HashMap;

public class g extends ContentObserver
{
  protected static int a;
  protected static int b;
  protected static int c;
  public static boolean d;
  public static boolean e;
  private static int f;
  private static boolean g;
  protected static boolean h;
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[13];
    char[] arrayOfChar1 = "}?S\037Z}$b\035^l#T\004U".toCharArray();
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
    char[] arrayOfChar12;
    int i41;
    char[] arrayOfChar13;
    int i45;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "}?S\037Z}$\022\004Ym5O\035^lU\nHH5Q\004Xw$D?^m$i\003I{1YQ".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = ">#\\\035^zm".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label701;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = ">\023R\005O3I8Bp3\023\002HA\"H\005Uw>ZQ".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label793;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "}?S\037Z}$\022\004Ym5O\035^lR\005Xv1S\f^1&X\031Hw?SV".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label885;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "m)S\bdp5X\017^z".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label977;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "n\"X\rH1#D\005Xk Y\nO{p".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label1069;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = ">6\\\002W{4".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1161;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "}?S\037Z}$\022\004Ym5O\035^lN\016Oh5O\030Rq>��".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1253;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = ">xM\031^hm".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1345;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = " MDH{$K\016Im9R\005Hk=\022\rZw<X\017".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label1437;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "13H\031I{>IV".toCharArray();
        int i40 = arrayOfChar12.length;
        i41 = 0;
        if (i40 > i41)
          break label1529;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "}?S\037Z}$\022\004Ym5O\035^lM\031^h9R\036H#".toCharArray();
        int i44 = arrayOfChar13.length;
        i45 = 0;
        if (i44 > i45)
          break label1621;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        z = arrayOfString;
        a = 5000;
        b = 0;
        c = 0;
        d = false;
        e = false;
        f = -1;
        g = false;
        h = false;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 59;
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
        m = 30;
        continue;
        m = 80;
        continue;
        m = 61;
        continue;
        m = 107;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 59;
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
      i3 = 30;
      continue;
      i3 = 80;
      continue;
      i3 = 61;
      continue;
      i3 = 107;
    }
    label701: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 59;
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
      i7 = 30;
      continue;
      i7 = 80;
      continue;
      i7 = 61;
      continue;
      i7 = 107;
    }
    label793: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 59;
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
      i11 = 30;
      continue;
      i11 = 80;
      continue;
      i11 = 61;
      continue;
      i11 = 107;
    }
    label885: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 59;
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
      i15 = 30;
      continue;
      i15 = 80;
      continue;
      i15 = 61;
      continue;
      i15 = 107;
    }
    label977: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 59;
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
      i19 = 30;
      continue;
      i19 = 80;
      continue;
      i19 = 61;
      continue;
      i19 = 107;
    }
    label1069: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 59;
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
      i23 = 30;
      continue;
      i23 = 80;
      continue;
      i23 = 61;
      continue;
      i23 = 107;
    }
    label1161: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 59;
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
      i27 = 30;
      continue;
      i27 = 80;
      continue;
      i27 = 61;
      continue;
      i27 = 107;
    }
    label1253: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 59;
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
      i31 = 30;
      continue;
      i31 = 80;
      continue;
      i31 = 61;
      continue;
      i31 = 107;
    }
    label1345: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 59;
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
      i35 = 30;
      continue;
      i35 = 80;
      continue;
      i35 = 61;
      continue;
      i35 = 107;
    }
    label1437: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 59;
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
      i39 = 30;
      continue;
      i39 = 80;
      continue;
      i39 = 61;
      continue;
      i39 = 107;
    }
    label1529: int i42 = arrayOfChar12[i41];
    int i43;
    switch (i41 % 5)
    {
    default:
      i43 = 59;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar12[i41] = (char)(i43 ^ i42);
      i41++;
      break;
      i43 = 30;
      continue;
      i43 = 80;
      continue;
      i43 = 61;
      continue;
      i43 = 107;
    }
    label1621: int i46 = arrayOfChar13[i45];
    int i47;
    switch (i45 % 5)
    {
    default:
      i47 = 59;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar13[i45] = (char)(i47 ^ i46);
      i45++;
      break;
      i47 = 30;
      continue;
      i47 = 80;
      continue;
      i47 = 61;
      continue;
      i47 = 107;
    }
  }

  public g()
  {
    super(null);
  }

  public static int a()
  {
    if (f == -1)
    {
      String str = App.Mb.getString(2131296258);
      f = App.Mb.getSharedPreferences(str, 0).getInt(z[0], 0);
    }
    return f;
  }

  public static void a(int paramInt)
  {
    int i = f;
    f = paramInt;
    g5.b(z[8] + f + z[9] + i + ")");
    SharedPreferences.Editor localEditor = App.Mb.getSharedPreferences(App.Mb.getString(2131296258), 0).edit();
    localEditor.putInt(z[0], paramInt);
    if (!localEditor.commit())
      g5.d(z[10]);
  }

  public static void a(boolean paramBoolean)
  {
    g = paramBoolean;
    if (!g)
      b(App.w.e());
  }

  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 0;
    boolean bool = DialogToastListActivity.f;
    String str = App.Mb.getString(2131296258);
    SharedPreferences localSharedPreferences;
    if (str != null)
    {
      localSharedPreferences = App.Mb.getSharedPreferences(str, 0);
      if (localSharedPreferences != null)
      {
        int j = localSharedPreferences.getInt(z[5], 0);
        if (paramBoolean2);
        switch (j)
        {
        default:
          i = 1;
          if (bool)
          {
            if ((paramBoolean1) && (!bool))
              break label194;
            if ((j != 1) || (paramBoolean1))
              break;
          }
          break;
        case 0:
        case 2:
        case 1:
        }
      }
    }
    label194: label197: 
    while (true)
    {
      return;
      if (!bool)
        break;
      if (paramBoolean1)
      {
        if (!bool)
          break;
        continue;
        for (i = 2; ; i = 1)
        {
          if (localSharedPreferences.edit().putInt(z[5], i).commit())
            break label197;
          g5.d(z[6] + i + z[7]);
          break;
        }
      }
    }
  }

  public static boolean b(int paramInt)
  {
    g5.b(z[12] + a() + z[11] + paramInt);
    if (paramInt == a());
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      a(paramInt);
    }
  }

  public void b(boolean paramBoolean)
  {
    a(paramBoolean, true);
  }

  public void c(boolean paramBoolean)
  {
    a(paramBoolean, false);
  }

  public void onChange(boolean paramBoolean)
  {
    int i = App.w.e();
    g5.b(z[4] + i + z[2] + a());
    if ((App.bb == null) || (g));
    while (true)
    {
      return;
      if (a() != i)
      {
        App.wb.clear();
        App.xb.clear();
        if (!h)
        {
          g5.b(z[1] + d + z[3] + tp.a);
          if ((!d) && (!tp.a))
          {
            m8 localm8 = new m8(this);
            localm8.setPriority(1);
            localm8.start();
          }
          d = true;
          b = 1 + b;
          if (c < b)
            c = b;
          App.kc.sendEmptyMessage(1);
        }
      }
    }
  }
}