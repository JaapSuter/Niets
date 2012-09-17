package com.whatsapp;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.StyleSpan;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.MultiAutoCompleteTextView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EditGroupSubject extends DialogToastActivity
{
  static Handler B;
  private static final String[] J;
  static HashMap<String, xr> s;
  static HashMap<yr, xr> t;
  static ArrayList<xr> u;
  static boolean w;
  static boolean x;
  static boolean y;
  int A = 0;
  boolean C = false;
  String D;
  j4 E;
  final TextView.OnEditorActionListener F = new sr(this);
  AdapterView.OnItemClickListener G = new tr(this);
  final TextWatcher H = new ur(this);
  final TextWatcher I = new vr(this);
  final InputMethodManager f = (InputMethodManager)App.Mb.getSystemService(J[6]);
  EditText g;
  ArrayList<xr> h;
  MultiAutoCompleteTextView i;
  TextView j;
  TextView k;
  TextView l;
  TextView m;
  String n = "";
  ScrollView o;
  ImageButton p;
  ImageButton q;
  Button r;
  public ArrayList<yr> v = new ArrayList();
  int z;

  static
  {
    String[] arrayOfString = new String[15];
    char[] arrayOfChar1 = "K8".toCharArray();
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
    char[] arrayOfChar15;
    int i58;
    if (i1 <= i2)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "��jO^q8{RN`\023}\017EnGvE_v\bjK\013`\004{EXrK8FJh\0138TD!\004jEJu\0028GYn\022h".toCharArray();
      int i5 = arrayOfChar2.length;
      i6 = 0;
      if (i5 <= i6)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "��jO^q8{RN`\023}\017LnG{RN`\023}��Ls\bmP\021".toCharArray();
        int i9 = arrayOfChar3.length;
        i10 = 0;
        if (i9 > i10)
          break label780;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "JC".toCharArray();
        int i13 = arrayOfChar4.length;
        i14 = 0;
        if (i13 > i14)
          break label868;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\004wN_`\004l".toCharArray();
        int i17 = arrayOfChar5.length;
        i18 = 0;
        if (i17 > i18)
          break label956;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "E6\n\024#O'\035\007(".toCharArray();
        int i21 = arrayOfChar6.length;
        i22 = 0;
        if (i21 > i22)
          break label1044;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "\016vP^u8uE_i\b|".toCharArray();
        int i25 = arrayOfChar7.length;
        i26 = 0;
        if (i25 > i26)
          break label1132;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "��jO^q8{RN`\023}\017Jt\023w��_d\037l\032".toCharArray();
        int i29 = arrayOfChar8.length;
        i30 = 0;
        if (i29 > i30)
          break label1220;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "��jO^q8{RN`\023}\017[`GrIOr]".toCharArray();
        int i33 = arrayOfChar9.length;
        i34 = 0;
        if (i33 > i34)
          break label1308;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = ",}YX,<".toCharArray();
        int i37 = arrayOfChar10.length;
        i38 = 0;
        if (i37 > i38)
          break label1396;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "\002|I_f\025wU[r\022zJNb\0237CYd\006lE".toCharArray();
        int i41 = arrayOfChar11.length;
        i42 = 0;
        if (i41 > i42)
          break label1484;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "\013yS_!\027wS\021".toCharArray();
        int i45 = arrayOfChar12.length;
        i46 = 0;
        if (i45 > i46)
          break label1572;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "��jO^q8{RN`\023}\017Mn\022vD\013o\bl��F`\023{H\004".toCharArray();
        int i49 = arrayOfChar13.length;
        i50 = 0;
        if (i49 > i50)
          break label1660;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "\001qNO;".toCharArray();
        int i53 = arrayOfChar14.length;
        i54 = 0;
        if (i53 > i54)
          break label1748;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "HjE[m\006{E\004".toCharArray();
        int i57 = arrayOfChar15.length;
        i58 = 0;
        if (i57 > i58)
          break label1836;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        J = arrayOfString;
        s = new HashMap();
        t = new HashMap();
        u = new ArrayList();
        w = false;
        y = false;
      }
    }
    else
    {
      int i3 = arrayOfChar1[i2];
      int i4;
      switch (i2 % 5)
      {
      default:
        i4 = 1;
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
        i4 = 103;
        continue;
        i4 = 24;
        continue;
        i4 = 32;
        continue;
        i4 = 43;
      }
    }
    int i7 = arrayOfChar2[i6];
    int i8;
    switch (i6 % 5)
    {
    default:
      i8 = 1;
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
      i8 = 103;
      continue;
      i8 = 24;
      continue;
      i8 = 32;
      continue;
      i8 = 43;
    }
    label780: int i11 = arrayOfChar3[i10];
    int i12;
    switch (i10 % 5)
    {
    default:
      i12 = 1;
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
      i12 = 103;
      continue;
      i12 = 24;
      continue;
      i12 = 32;
      continue;
      i12 = 43;
    }
    label868: int i15 = arrayOfChar4[i14];
    int i16;
    switch (i14 % 5)
    {
    default:
      i16 = 1;
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
      i16 = 103;
      continue;
      i16 = 24;
      continue;
      i16 = 32;
      continue;
      i16 = 43;
    }
    label956: int i19 = arrayOfChar5[i18];
    int i20;
    switch (i18 % 5)
    {
    default:
      i20 = 1;
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
      i20 = 103;
      continue;
      i20 = 24;
      continue;
      i20 = 32;
      continue;
      i20 = 43;
    }
    label1044: int i23 = arrayOfChar6[i22];
    int i24;
    switch (i22 % 5)
    {
    default:
      i24 = 1;
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
      i24 = 103;
      continue;
      i24 = 24;
      continue;
      i24 = 32;
      continue;
      i24 = 43;
    }
    label1132: int i27 = arrayOfChar7[i26];
    int i28;
    switch (i26 % 5)
    {
    default:
      i28 = 1;
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
      i28 = 103;
      continue;
      i28 = 24;
      continue;
      i28 = 32;
      continue;
      i28 = 43;
    }
    label1220: int i31 = arrayOfChar8[i30];
    int i32;
    switch (i30 % 5)
    {
    default:
      i32 = 1;
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
      i32 = 103;
      continue;
      i32 = 24;
      continue;
      i32 = 32;
      continue;
      i32 = 43;
    }
    label1308: int i35 = arrayOfChar9[i34];
    int i36;
    switch (i34 % 5)
    {
    default:
      i36 = 1;
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
      i36 = 103;
      continue;
      i36 = 24;
      continue;
      i36 = 32;
      continue;
      i36 = 43;
    }
    label1396: int i39 = arrayOfChar10[i38];
    int i40;
    switch (i38 % 5)
    {
    default:
      i40 = 1;
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
      i40 = 103;
      continue;
      i40 = 24;
      continue;
      i40 = 32;
      continue;
      i40 = 43;
    }
    label1484: int i43 = arrayOfChar11[i42];
    int i44;
    switch (i42 % 5)
    {
    default:
      i44 = 1;
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
      i44 = 103;
      continue;
      i44 = 24;
      continue;
      i44 = 32;
      continue;
      i44 = 43;
    }
    label1572: int i47 = arrayOfChar12[i46];
    int i48;
    switch (i46 % 5)
    {
    default:
      i48 = 1;
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
      i48 = 103;
      continue;
      i48 = 24;
      continue;
      i48 = 32;
      continue;
      i48 = 43;
    }
    label1660: int i51 = arrayOfChar13[i50];
    int i52;
    switch (i50 % 5)
    {
    default:
      i52 = 1;
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
      i52 = 103;
      continue;
      i52 = 24;
      continue;
      i52 = 32;
      continue;
      i52 = 43;
    }
    label1748: int i55 = arrayOfChar14[i54];
    int i56;
    switch (i54 % 5)
    {
    default:
      i56 = 1;
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
      i56 = 103;
      continue;
      i56 = 24;
      continue;
      i56 = 32;
      continue;
      i56 = 43;
    }
    label1836: int i59 = arrayOfChar15[i58];
    int i60;
    switch (i58 % 5)
    {
    default:
      i60 = 1;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar15[i58] = (char)(i60 ^ i59);
      i58++;
      break;
      i60 = 103;
      continue;
      i60 = 24;
      continue;
      i60 = 32;
      continue;
      i60 = 43;
    }
  }

  private String a(String paramString)
  {
    int i1 = paramString.lastIndexOf("\"");
    int i2 = paramString.indexOf("\"");
    if ((i2 >= 0) && (i1 > i2) && (i1 < paramString.length()))
      paramString = paramString.substring(1 + paramString.indexOf("\""), paramString.lastIndexOf("\""));
    return paramString;
  }

  private void a()
  {
    ((InputMethodManager)getSystemService(J[6])).toggleSoftInput(2, 0);
  }

  static void a(EditGroupSubject paramEditGroupSubject)
  {
    paramEditGroupSubject.g();
  }

  static void a(EditGroupSubject paramEditGroupSubject, CharSequence paramCharSequence)
  {
    paramEditGroupSubject.a(paramCharSequence);
  }

  static void a(EditGroupSubject paramEditGroupSubject, String paramString)
  {
    paramEditGroupSubject.b(paramString);
  }

  private void a(CharSequence paramCharSequence)
  {
    this.k.setText(String.valueOf(eu.c - paramCharSequence.length()));
  }

  private void a(String paramString, ArrayList<yr> paramArrayList)
  {
    boolean bool1 = DialogToastListActivity.f;
    Matcher localMatcher = Pattern.compile(J[5]).matcher(paramString);
    boolean bool2 = localMatcher.find();
    int i1 = 0;
    int i4;
    for (int i2 = 0; ; i2 = i4)
    {
      int i3;
      boolean bool3;
      if (bool2)
      {
        i3 = localMatcher.end();
        String str2 = a(localMatcher.group());
        System.out.println(J[13] + str2);
        xr localxr2 = (xr)s.get(str2);
        if (localxr2 != null)
        {
          paramArrayList.add(localxr2.c);
          if (this.z == -1)
          {
            this.z = i2;
            g5.d(J[11] + this.z);
          }
          if (w)
            g5.d(J[12] + i2 + J[14] + paramArrayList.get(-1 + paramArrayList.size()));
        }
        i4 = i2 + 1;
        bool3 = localMatcher.find();
        if (bool1)
        {
          i2 = i4;
          i1 = i3;
        }
      }
      else
      {
        if (i1 != paramString.length())
        {
          String str1 = a(paramString.substring(i1));
          xr localxr1 = (xr)s.get(str1);
          if (localxr1 != null)
          {
            paramArrayList.add(localxr1.c);
            if (this.z == -1)
            {
              this.z = i2;
              g5.d(J[11] + this.z);
            }
            if (w)
              g5.d(J[12] + i2 + J[14] + paramArrayList.get(-1 + paramArrayList.size()));
          }
        }
        return;
      }
      i1 = i3;
      bool2 = bool3;
    }
  }

  private void b()
  {
    String str1 = this.g.getText().toString();
    Vector localVector = c();
    if (str1.length() <= eu.c)
    {
      if (localVector.size() != 0)
        break label84;
      App.a(this, getString(2131296892), 0);
    }
    while (true)
    {
      return;
      String str2 = getString(2131296852);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(eu.c);
      App.a(this, String.format(str2, arrayOfObject), 0);
      continue;
      label84: String str3 = eu.g(str1);
      eu.b(str3, localVector);
      startActivity(new Intent(this, Conversations.class));
      if (App.sb())
      {
        g5.b(J[2] + str3);
        App.z.a(eu.a(str3, str1, localVector, 2));
        new j9(this, str3, str1, localVector).start();
        if (!DialogToastListActivity.f);
      }
      else
      {
        g5.b(J[1]);
        App.z.a(eu.a(str3, str1, localVector, 3));
      }
      finish();
    }
  }

  static void b(EditGroupSubject paramEditGroupSubject)
  {
    paramEditGroupSubject.b();
  }

  private void b(String paramString)
  {
    boolean bool = DialogToastListActivity.f;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString + J[3]);
    Iterator localIterator = u.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      localStringBuilder.append(((xr)localIterator.next()).c).append(",");
    }
    while (!bool);
    localStringBuilder.append("]");
    g5.c(localStringBuilder.toString());
  }

  static String[] b(EditGroupSubject paramEditGroupSubject, String paramString)
  {
    return paramEditGroupSubject.c(paramString);
  }

  static String c(EditGroupSubject paramEditGroupSubject, String paramString)
  {
    return paramEditGroupSubject.a(paramString);
  }

  private Vector c()
  {
    boolean bool = DialogToastListActivity.f;
    Vector localVector = new Vector();
    String str = this.i.getText().toString();
    g5.b(J[7] + str);
    Iterator localIterator = u.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      localVector.add(((xr)localIterator.next()).a);
    }
    while (!bool);
    g5.b(J[8] + Arrays.deepToString(localVector.toArray()));
    return localVector;
  }

  static void c(EditGroupSubject paramEditGroupSubject)
  {
    paramEditGroupSubject.i();
  }

  private String[] c(String paramString)
  {
    int i1 = 0;
    boolean bool1 = DialogToastListActivity.f;
    ArrayList localArrayList = new ArrayList(10);
    Matcher localMatcher = Pattern.compile(J[5]).matcher(paramString);
    boolean bool2 = localMatcher.find();
    int i2 = 0;
    do
    {
      if (!bool2)
        break;
      i1 = localMatcher.end();
      localArrayList.add(a(localMatcher.group()));
      i2++;
      bool2 = localMatcher.find();
    }
    while (!bool1);
    if (i1 != paramString.length())
      localArrayList.add(a(paramString.substring(i1)));
    return (String[])localArrayList.toArray(new String[localArrayList.size()]);
  }

  private ArrayList<xr> d()
  {
    boolean bool = DialogToastListActivity.f;
    List localList = App.w.c();
    s.clear();
    t.clear();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = localList.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      zq localzq = (zq)localIterator.next();
      if ((!localzq.o()) && (localzq.g != null))
      {
        xr localxr = new xr(localzq.b, localzq.b(), localzq.a(getResources()).toString(), localzq.c);
        localArrayList.add(localxr);
        s.put(localxr.c.a, localxr);
        t.put(localxr.c, localxr);
      }
    }
    while (!bool);
    if ((localArrayList != null) && (localArrayList.size() > 1));
    try
    {
      Collections.sort(localArrayList, new wr(this));
      label179: return localArrayList;
    }
    catch (ClassCastException localClassCastException)
    {
      break label179;
    }
  }

  static void d(EditGroupSubject paramEditGroupSubject)
  {
    paramEditGroupSubject.h();
  }

  private void e()
  {
    boolean bool = DialogToastListActivity.f;
    u.clear();
    Iterator localIterator = this.v.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      yr localyr = (yr)localIterator.next();
      u.add(t.get(localyr));
    }
    while (!bool);
  }

  static void e(EditGroupSubject paramEditGroupSubject)
  {
    paramEditGroupSubject.f();
  }

  private void f()
  {
    boolean bool = DialogToastListActivity.f;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(J[9]);
    Iterator localIterator = this.v.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      localStringBuilder.append((yr)localIterator.next()).append(",");
    }
    while (!bool);
    localStringBuilder.append("]");
    g5.c(localStringBuilder.toString());
  }

  static void f(EditGroupSubject paramEditGroupSubject)
  {
    paramEditGroupSubject.e();
  }

  private void g()
  {
    boolean bool = DialogToastListActivity.f;
    SpannableStringBuilder localSpannableStringBuilder1 = new SpannableStringBuilder();
    Iterator localIterator = this.v.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      yr localyr = (yr)localIterator.next();
      SpannableStringBuilder localSpannableStringBuilder2 = new SpannableStringBuilder("\"" + localyr.a + "\"");
      localSpannableStringBuilder2.setSpan(new StyleSpan(1), 1, 1 + localyr.a.length(), 33);
      localSpannableStringBuilder1.append(localSpannableStringBuilder2).append(J[0]);
    }
    while (!bool);
    this.C = true;
    this.i.setText(localSpannableStringBuilder1);
    this.i.requestFocus();
    this.i.setSelection(localSpannableStringBuilder1.length());
    h();
  }

  private void h()
  {
    this.m.setText(u.size() + "/" + eu.b);
    if ((u.size() == 0) || (!x))
    {
      this.r.setEnabled(false);
      if (!DialogToastListActivity.f);
    }
    else
    {
      this.r.setEnabled(true);
    }
  }

  private void i()
  {
    ((InputMethodManager)getSystemService(J[6])).hideSoftInputFromWindow(this.g.getWindowToken(), 0);
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    default:
    case 1:
    }
    while (true)
    {
      return;
      if (paramInt2 == -1)
      {
        String str1 = paramIntent.getStringExtra(J[4]);
        zq localzq = App.w.a(str1, null);
        String str2 = this.i.getText().toString();
        ArrayList localArrayList = new ArrayList();
        a(str2, localArrayList);
        localArrayList.add(new yr(localzq.b(), localzq.a(getResources()).toString()));
        this.v.clear();
        this.v.addAll(localArrayList);
        y = true;
        e();
        a();
        g();
      }
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
  }

  public void onCreate(Bundle paramBundle)
  {
    g5.b(J[10]);
    super.onCreate(paramBundle);
    setContentView(2130903095);
    this.E = j4.a(getBaseContext());
    B = new fd(this);
    u.clear();
    this.o = ((ScrollView)findViewById(2131558541));
    this.j = ((TextView)findViewById(2131558667));
    this.k = ((TextView)findViewById(2131558668));
    a("");
    this.l = ((TextView)findViewById(2131558671));
    this.m = ((TextView)findViewById(2131558672));
    this.l.setText(getString(2131296900).toUpperCase());
    this.j.setText(getString(2131296899).toUpperCase());
    InputFilter[] arrayOfInputFilter1 = new InputFilter[1];
    arrayOfInputFilter1[0] = new InputFilter.LengthFilter(eu.c);
    this.p = ((ImageButton)findViewById(2131558670));
    this.p.setOnClickListener(new pr(this));
    this.q = ((ImageButton)findViewById(2131558674));
    this.q.setOnClickListener(new qr(this));
    this.g = ((EditText)findViewById(2131558669));
    this.g.addTextChangedListener(this.H);
    this.g.setFilters(arrayOfInputFilter1);
    this.g.setGravity(TextEmojiLabel.a(this.g.getText().toString()));
    this.h = d();
    oe localoe = new oe(this);
    this.i = ((MultiAutoCompleteTextView)findViewById(2131558673));
    this.i.setAdapter(localoe);
    this.i.setTokenizer(new as());
    this.i.setOnItemClickListener(this.G);
    this.i.setThreshold(1);
    this.i.setOnEditorActionListener(this.F);
    InputFilter[] arrayOfInputFilter2 = new InputFilter[1];
    arrayOfInputFilter2[0] = new zr(eu.b);
    this.i.setFilters(arrayOfInputFilter2);
    this.i.setGravity(TextEmojiLabel.a(this.i.getText().toString()));
    this.r = ((Button)findViewById(2131558666));
    this.r.setOnClickListener(new rr(this));
    h();
    this.i.addTextChangedListener(this.I);
    if (!this.E.b())
      a();
  }

  public void onPause()
  {
    super.onPause();
    i();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.EditGroupSubject
 * JD-Core Version:    0.6.1
 */