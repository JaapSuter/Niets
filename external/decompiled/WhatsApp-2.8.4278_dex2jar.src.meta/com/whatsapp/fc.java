package com.whatsapp;

import android.os.AsyncTask;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.io.IOException;

public class fc extends AsyncTask<String, Void, wf>
{
  private static final String[] z;
  final VerifySms a;

  static
  {
    String[] arrayOfString = new String[14];
    char[] arrayOfChar1 = "\005:vBB\n)kBG\026prNV\0329}]K\032<a\004A\001-kY\t\0366wXM\0358".toCharArray();
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
    char[] arrayOfChar14;
    int i49;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\005:vBB\n)kBG\026prNV\0329}]K\032<a\004A\001-kY\t\0200jEA\020+m]M\007&".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\005:vBB\n)kBG\026prNV\0329}]K\032<a\004A\001-kY".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label704;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\005:vBB\n)kBG\026prNV\0329}]K\032<a\004A\001-kY\t\0070k\006I\0221}\006P\0016aX".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label792;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\0321t^P,2a_L\034;".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label880;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "\005:vBB\n)kBG\026prNV\0329}]K\032<a\004R\026-mMM\026;".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label968;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "\005:vBB\n)kBG\026prNV\0329}]K\032<a\004A\001-kY\t\0213kHO\026;".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label1056;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "\005:vBB\n)kBG\026prNV\0329}]K\032<a\004A\001-kY\t\0070k\006I\0221}\006C\006:wXA��".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1144;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "\005:vBB\n)kBG\026prNV\0329}]K\032<a\004M\035<kYV\026<p".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1232;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "\026-vDVS2mXW\0321c".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1320;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "\005:vBB\n)kBG\026prNV\0329}]K\032<a".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label1408;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "\005:vBB\n)kBG\026prNV\0329}]K\032<a\004A\001-kY\004".toCharArray();
        int i40 = arrayOfChar12.length;
        i41 = 0;
        if (i40 > i41)
          break label1496;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "\001:b^W\026;".toCharArray();
        int i44 = arrayOfChar13.length;
        i45 = 0;
        if (i44 > i45)
          break label1584;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "\005:vBB\n)kBG\026prNV\0329}]K\032<a\004M\034:vYK\001".toCharArray();
        int i48 = arrayOfChar14.length;
        i49 = 0;
        if (i48 > i49)
          break label1672;
        arrayOfString[13] = new String(arrayOfChar14).intern();
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
        m = 36;
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
        m = 115;
        continue;
        m = 95;
        continue;
        m = 4;
        continue;
        m = 43;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 36;
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
      i3 = 115;
      continue;
      i3 = 95;
      continue;
      i3 = 4;
      continue;
      i3 = 43;
    }
    label704: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 36;
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
      i7 = 115;
      continue;
      i7 = 95;
      continue;
      i7 = 4;
      continue;
      i7 = 43;
    }
    label792: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 36;
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
      i11 = 115;
      continue;
      i11 = 95;
      continue;
      i11 = 4;
      continue;
      i11 = 43;
    }
    label880: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 36;
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
      i15 = 115;
      continue;
      i15 = 95;
      continue;
      i15 = 4;
      continue;
      i15 = 43;
    }
    label968: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 36;
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
      i19 = 115;
      continue;
      i19 = 95;
      continue;
      i19 = 4;
      continue;
      i19 = 43;
    }
    label1056: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 36;
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
      i23 = 115;
      continue;
      i23 = 95;
      continue;
      i23 = 4;
      continue;
      i23 = 43;
    }
    label1144: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 36;
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
      i27 = 115;
      continue;
      i27 = 95;
      continue;
      i27 = 4;
      continue;
      i27 = 43;
    }
    label1232: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 36;
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
      i31 = 115;
      continue;
      i31 = 95;
      continue;
      i31 = 4;
      continue;
      i31 = 43;
    }
    label1320: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 36;
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
      i35 = 115;
      continue;
      i35 = 95;
      continue;
      i35 = 4;
      continue;
      i35 = 43;
    }
    label1408: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 36;
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
      i39 = 115;
      continue;
      i39 = 95;
      continue;
      i39 = 4;
      continue;
      i39 = 43;
    }
    label1496: int i42 = arrayOfChar12[i41];
    int i43;
    switch (i41 % 5)
    {
    default:
      i43 = 36;
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
      i43 = 115;
      continue;
      i43 = 95;
      continue;
      i43 = 4;
      continue;
      i43 = 43;
    }
    label1584: int i46 = arrayOfChar13[i45];
    int i47;
    switch (i45 % 5)
    {
    default:
      i47 = 36;
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
      i47 = 115;
      continue;
      i47 = 95;
      continue;
      i47 = 4;
      continue;
      i47 = 43;
    }
    label1672: int i50 = arrayOfChar14[i49];
    int i51;
    switch (i49 % 5)
    {
    default:
      i51 = 36;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar14[i49] = (char)(i51 ^ i50);
      i49++;
      break;
      i51 = 115;
      continue;
      i51 = 95;
      continue;
      i51 = 4;
      continue;
      i51 = 43;
    }
  }

  protected fc(VerifySms paramVerifySms)
  {
  }

  protected wf a(String[] paramArrayOfString)
  {
    wf localwf = wf.c;
    try
    {
      cq localcq = yp.b(VerifySms.d(this.a), VerifySms.e(this.a), mh.c(u4.a()), paramArrayOfString[0]);
      App.c(App.Mb, localcq.b);
      localwf = localcq.a;
      return localwf;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        String str = localIOException.toString();
        g5.c(z[13] + str);
        if ((str != null) && (str.contains(z[12])))
        {
          localwf = wf.c;
          if (!DialogToastListActivity.f);
        }
        else
        {
          localwf = wf.d;
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
        g5.d(z[11] + localException.toString());
    }
  }

  protected void a(wf paramwf)
  {
    boolean bool = DialogToastListActivity.f;
    this.a.removeDialog(24);
    if (paramwf == wf.a)
    {
      g5.b(z[5]);
      VerifySms.a(3);
      VerifySms.a(this.a, true);
      if (!bool);
    }
    else if (paramwf == wf.b)
    {
      g5.b(z[8]);
      VerifySms.l(this.a).setText("");
      if (VerifySms.y() == 13)
      {
        VerifySms.a(3);
        VerifySms localVerifySms7 = this.a;
        VerifySms localVerifySms8 = this.a;
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = this.a.getString(2131296378);
        localVerifySms7.f(localVerifySms8.getString(2131296381, arrayOfObject4));
        ((InputMethodManager)App.Mb.getSystemService(z[4])).hideSoftInputFromWindow(VerifySms.l(this.a).getWindowToken(), 0);
        if (!bool);
      }
      else
      {
        VerifySms.a(10);
        if (VerifySms.z() > 0)
        {
          VerifySms localVerifySms5 = this.a;
          VerifySms localVerifySms6 = this.a;
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = Integer.valueOf(VerifySms.A());
          localVerifySms5.f(localVerifySms6.getString(2131296349, arrayOfObject3));
          if (!bool);
        }
        else
        {
          this.a.f(this.a.getString(2131296350));
        }
        VerifySms.c(this.a, VerifySms.t(this.a));
        long l = VerifySms.t(this.a) + VerifySms.u(this.a);
        VerifySms.d(this.a, VerifySms.u(this.a));
        VerifySms.e(this.a, l);
        if (!bool);
      }
    }
    else if (paramwf == wf.c)
    {
      g5.d(z[2]);
      VerifySms.a(11);
      this.a.e(109);
      if (!bool);
    }
    else if (paramwf == wf.e)
    {
      g5.d(z[0]);
      App.d(z[9]);
      VerifySms.a(3);
      VerifySms localVerifySms3 = this.a;
      VerifySms localVerifySms4 = this.a;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = this.a.getString(2131296378);
      localVerifySms3.f(localVerifySms4.getString(2131296381, arrayOfObject2));
      if (!bool);
    }
    else if (paramwf == wf.f)
    {
      g5.d(z[7]);
      VerifySms.a(3);
      this.a.f(this.a.getString(2131296404));
      if (!bool);
    }
    else if (paramwf == wf.g)
    {
      g5.d(z[3]);
      VerifySms.a(10);
      VerifySms.b(true);
      this.a.e(27);
      if (!bool);
    }
    else if (paramwf == wf.d)
    {
      g5.d(z[1]);
      VerifySms.a(11);
      VerifySms localVerifySms1 = this.a;
      VerifySms localVerifySms2 = this.a;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = this.a.getString(2131296328);
      localVerifySms1.f(localVerifySms2.getString(2131296333, arrayOfObject1));
      if (!bool);
    }
    else if (paramwf == wf.h)
    {
      g5.d(z[6]);
      VerifySms.a(12);
      VerifySms.o(this.a);
    }
    VerifySms.c(this.a);
    VerifySms.s(this.a);
  }

  protected void onPreExecute()
  {
    g5.b(z[10]);
    if (!this.a.isFinishing())
      this.a.showDialog(24);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.fc
 * JD-Core Version:    0.6.1
 */