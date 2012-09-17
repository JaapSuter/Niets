package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.format.Formatter;
import android.text.method.TextKeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class PopupNotification extends Activity
  implements uk
{
  private static final String[] F;
  public static PopupNotification a;
  private static int v;
  private Handler A = new Handler();
  private Runnable B = new ly(this);
  private Handler C = new Handler();
  private Runnable D = new my(this);
  private String E = null;
  private boolean b = false;
  private j4 c;
  private ArrayList<sz> d = new ArrayList();
  private zq e;
  private sz f;
  private View.OnClickListener g;
  private HashSet<uz> h = new HashSet();
  private HashSet<uz> i = new HashSet();
  private HashSet<String> j = new HashSet();
  private GalleryView k;
  private ConversationTextEntry l;
  private Button m;
  private TextView n;
  private TextView o;
  private TextView p;
  private View q;
  private View r;
  private View s;
  private View t;
  private PowerManager.WakeLock u = null;
  private SensorManager w;
  private Sensor x;
  private SensorEventListener y;
  private float z = 5.0F;

  static
  {
    String[] arrayOfString = new String[30];
    char[] arrayOfChar1 = "\031| L?".toCharArray();
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
    char[] arrayOfChar16;
    int i62;
    char[] arrayOfChar17;
    int i66;
    char[] arrayOfChar18;
    int i70;
    char[] arrayOfChar19;
    int i74;
    char[] arrayOfChar20;
    int i78;
    char[] arrayOfChar21;
    int i82;
    char[] arrayOfChar22;
    int i86;
    char[] arrayOfChar23;
    int i90;
    char[] arrayOfChar24;
    int i94;
    char[] arrayOfChar25;
    int i98;
    char[] arrayOfChar26;
    int i102;
    char[] arrayOfChar27;
    int i106;
    char[] arrayOfChar28;
    int i110;
    char[] arrayOfChar29;
    int i114;
    char[] arrayOfChar30;
    int i118;
    if (i1 <= i2)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\031|'\\=\007|#@+��p6]$\006}xJ?\fr#L".toCharArray();
      int i5 = arrayOfChar2.length;
      i6 = 0;
      if (i5 <= i6)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\032v9Z\"\033".toCharArray();
        int i9 = arrayOfChar3.length;
        i10 = 0;
        if (i9 > i10)
          break label1325;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\031|'\\=\007|#@+��p6]$\006}".toCharArray();
        int i13 = arrayOfChar4.length;
        i14 = 0;
        if (i13 > i14)
          break label1417;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\031|'\\=\007|#@+��p6]$\006}xM$\b8N`\032|1]:\ba2\004,\013|\"]`\035|zL5\031z%L".toCharArray();
        int i17 = arrayOfChar5.length;
        i18 = 0;
        if (i17 > i18)
          break label1509;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "\031|'\\=\007|#@+��p6]$\006}xM$\b8Nm\035a.@#\0163#Fm\032{8^m-Z\026e\002.L��h\037\"L\004l\037?Z\024l\022,K\007`\037(G\036f\003E35\\9I~2Z>\bt2\t=\ba6D(\035v%\t$\03239\\!\0052".toCharArray();
        int i21 = arrayOfChar6.length;
        i22 = 0;
        if (i21 > i22)
          break label1601;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "\031|'\\=\007|#@+��p6]$\006}xJ!\fr%G\"\035z1@.\bg>F#\032)".toCharArray();
        int i25 = arrayOfChar7.length;
        i26 = 0;
        if (i25 > i26)
          break label1693;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "\031|'\\=\007|#@+��p6]$\006}xD>\016)".toCharArray();
        int i29 = arrayOfChar8.length;
        i30 = 0;
        if (i29 > i30)
          break label1785;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "\031|'\\=\007|#@+��p6]$\006}xZ9\006c".toCharArray();
        int i33 = arrayOfChar9.length;
        i34 = 0;
        if (i33 > i34)
          break label1877;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "\031|'\\=\007|#@+��p6]$\006}x^,\002v\"Y$\017}2L)\fw".toCharArray();
        int i37 = arrayOfChar10.length;
        i38 = 0;
        if (i37 > i38)
          break label1969;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "I~2Z>\bt2Zc\032z-Lw".toCharArray();
        int i41 = arrayOfChar11.length;
        i42 = 0;
        if (i41 > i42)
          break label2061;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "I~2Z>\bt2v=\006`m".toCharArray();
        int i45 = arrayOfChar12.length;
        i46 = 0;
        if (i45 > i46)
          break label2153;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "��}'\\96~2]%\006w".toCharArray();
        int i49 = arrayOfChar13.length;
        i50 = 0;
        if (i49 > i50)
          break label2245;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "\031|'\\=\007|#@+��p6]$\006}xZ(\007w2G9\033jxL \031g.\t9\fk#\t".toCharArray();
        int i53 = arrayOfChar14.length;
        i54 = 0;
        if (i53 > i54)
          break label2337;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "\031|'\\=\007|#@+��p6]$\006}xZ(\007w2G9\033jx\t>\na2L#6c8Zw".toCharArray();
        int i57 = arrayOfChar15.length;
        i58 = 0;
        if (i57 > i58)
          break label2429;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "\031|'\\=\007|#@+��p6]$\006}xJ\"\007g6J9Dg?\\ \013<5H>\f%c\004)\fp8M(Fv%[\"\033".toCharArray();
        int i61 = arrayOfChar16.length;
        i62 = 0;
        if (i61 > i62)
          break label2521;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "\031|'\\=\007|#@+��p6]$\006}xZ9\ba#".toCharArray();
        int i65 = arrayOfChar17.length;
        i66 = 0;
        if (i65 > i66)
          break label2613;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "\031|'\\=\007|#@+��p6]$\006}xD$\032`>G*6a:]\022\032a4\023".toCharArray();
        int i69 = arrayOfChar18.length;
        i70 = 0;
        if (i69 > i70)
          break label2705;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "\031|'\\=\007|#@+��p6]$\006}xY,\034`2".toCharArray();
        int i73 = arrayOfChar19.length;
        i74 = 0;
        if (i73 > i74)
          break label2797;
        arrayOfString[18] = new String(arrayOfChar19).intern();
        arrayOfChar20 = "\031|'\\=\007|#@+��p6]$\006}xM(\032g%F4".toCharArray();
        int i77 = arrayOfChar20.length;
        i78 = 0;
        if (i77 > i78)
          break label2889;
        arrayOfString[19] = new String(arrayOfChar20).intern();
        arrayOfChar21 = "\031|'\\=\007|#@+��p6]$\006}x^,\002v\"Y".toCharArray();
        int i81 = arrayOfChar21.length;
        i82 = 0;
        if (i81 > i82)
          break label2981;
        arrayOfString[20] = new String(arrayOfChar21).intern();
        arrayOfChar22 = "\031|'\\=\007|#@+��p6]$\006}x@#��g'F=\034c".toCharArray();
        int i85 = arrayOfChar22.length;
        i86 = 0;
        if (i85 > i86)
          break label3073;
        arrayOfString[21] = new String(arrayOfChar22).intern();
        arrayOfChar23 = "\031|'\\=\007|#@+��p6]$\006}xJ\"\034}#\023".toCharArray();
        int i89 = arrayOfChar23.length;
        i90 = 0;
        if (i89 > i90)
          break label3165;
        arrayOfString[22] = new String(arrayOfChar23).intern();
        arrayOfChar24 = "UrwA?\fuj\013".toCharArray();
        int i93 = arrayOfChar24.length;
        i94 = 0;
        if (i93 > i94)
          break label3257;
        arrayOfString[23] = new String(arrayOfChar24).intern();
        arrayOfChar25 = "U<6\027".toCharArray();
        int i97 = arrayOfChar25.length;
        i98 = 0;
        if (i97 > i98)
          break label3349;
        arrayOfString[24] = new String(arrayOfChar25).intern();
        arrayOfChar26 = "5`|".toCharArray();
        int i101 = arrayOfChar26.length;
        i102 = 0;
        if (i101 > i102)
          break label3441;
        arrayOfString[25] = new String(arrayOfChar26).intern();
        arrayOfChar27 = "K-".toCharArray();
        int i105 = arrayOfChar27.length;
        i106 = 0;
        if (i105 > i106)
          break label3533;
        arrayOfString[26] = new String(arrayOfChar27).intern();
        arrayOfChar28 = "\005r.F8\035L>G+\005r#L?".toCharArray();
        int i109 = arrayOfChar28.length;
        i110 = 0;
        if (i109 > i110)
          break label3625;
        arrayOfString[27] = new String(arrayOfChar28).intern();
        arrayOfChar29 = "O`;Ep".toCharArray();
        int i113 = arrayOfChar29.length;
        i114 = 0;
        if (i113 > i114)
          break label3717;
        arrayOfString[28] = new String(arrayOfChar29).intern();
        arrayOfChar30 = "\001g#YwF<:H=\032=0F\"\0162\007.\006~xD,\031`hXp".toCharArray();
        int i117 = arrayOfChar30.length;
        i118 = 0;
        if (i117 > i118)
          break label3809;
        arrayOfString[29] = new String(arrayOfChar30).intern();
        F = arrayOfString;
        a = null;
        v = 200;
      }
    }
    else
    {
      int i3 = arrayOfChar1[i2];
      int i4;
      switch (i2 % 5)
      {
      default:
        i4 = 77;
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
        i4 = 105;
        continue;
        i4 = 19;
        continue;
        i4 = 87;
        continue;
        i4 = 41;
      }
    }
    int i7 = arrayOfChar2[i6];
    int i8;
    switch (i6 % 5)
    {
    default:
      i8 = 77;
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
      i8 = 105;
      continue;
      i8 = 19;
      continue;
      i8 = 87;
      continue;
      i8 = 41;
    }
    label1325: int i11 = arrayOfChar3[i10];
    int i12;
    switch (i10 % 5)
    {
    default:
      i12 = 77;
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
      i12 = 105;
      continue;
      i12 = 19;
      continue;
      i12 = 87;
      continue;
      i12 = 41;
    }
    label1417: int i15 = arrayOfChar4[i14];
    int i16;
    switch (i14 % 5)
    {
    default:
      i16 = 77;
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
      i16 = 105;
      continue;
      i16 = 19;
      continue;
      i16 = 87;
      continue;
      i16 = 41;
    }
    label1509: int i19 = arrayOfChar5[i18];
    int i20;
    switch (i18 % 5)
    {
    default:
      i20 = 77;
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
      i20 = 105;
      continue;
      i20 = 19;
      continue;
      i20 = 87;
      continue;
      i20 = 41;
    }
    label1601: int i23 = arrayOfChar6[i22];
    int i24;
    switch (i22 % 5)
    {
    default:
      i24 = 77;
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
      i24 = 105;
      continue;
      i24 = 19;
      continue;
      i24 = 87;
      continue;
      i24 = 41;
    }
    label1693: int i27 = arrayOfChar7[i26];
    int i28;
    switch (i26 % 5)
    {
    default:
      i28 = 77;
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
      i28 = 105;
      continue;
      i28 = 19;
      continue;
      i28 = 87;
      continue;
      i28 = 41;
    }
    label1785: int i31 = arrayOfChar8[i30];
    int i32;
    switch (i30 % 5)
    {
    default:
      i32 = 77;
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
      i32 = 105;
      continue;
      i32 = 19;
      continue;
      i32 = 87;
      continue;
      i32 = 41;
    }
    label1877: int i35 = arrayOfChar9[i34];
    int i36;
    switch (i34 % 5)
    {
    default:
      i36 = 77;
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
      i36 = 105;
      continue;
      i36 = 19;
      continue;
      i36 = 87;
      continue;
      i36 = 41;
    }
    label1969: int i39 = arrayOfChar10[i38];
    int i40;
    switch (i38 % 5)
    {
    default:
      i40 = 77;
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
      i40 = 105;
      continue;
      i40 = 19;
      continue;
      i40 = 87;
      continue;
      i40 = 41;
    }
    label2061: int i43 = arrayOfChar11[i42];
    int i44;
    switch (i42 % 5)
    {
    default:
      i44 = 77;
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
      i44 = 105;
      continue;
      i44 = 19;
      continue;
      i44 = 87;
      continue;
      i44 = 41;
    }
    label2153: int i47 = arrayOfChar12[i46];
    int i48;
    switch (i46 % 5)
    {
    default:
      i48 = 77;
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
      i48 = 105;
      continue;
      i48 = 19;
      continue;
      i48 = 87;
      continue;
      i48 = 41;
    }
    label2245: int i51 = arrayOfChar13[i50];
    int i52;
    switch (i50 % 5)
    {
    default:
      i52 = 77;
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
      i52 = 105;
      continue;
      i52 = 19;
      continue;
      i52 = 87;
      continue;
      i52 = 41;
    }
    label2337: int i55 = arrayOfChar14[i54];
    int i56;
    switch (i54 % 5)
    {
    default:
      i56 = 77;
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
      i56 = 105;
      continue;
      i56 = 19;
      continue;
      i56 = 87;
      continue;
      i56 = 41;
    }
    label2429: int i59 = arrayOfChar15[i58];
    int i60;
    switch (i58 % 5)
    {
    default:
      i60 = 77;
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
      i60 = 105;
      continue;
      i60 = 19;
      continue;
      i60 = 87;
      continue;
      i60 = 41;
    }
    label2521: int i63 = arrayOfChar16[i62];
    int i64;
    switch (i62 % 5)
    {
    default:
      i64 = 77;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar16[i62] = (char)(i64 ^ i63);
      i62++;
      break;
      i64 = 105;
      continue;
      i64 = 19;
      continue;
      i64 = 87;
      continue;
      i64 = 41;
    }
    label2613: int i67 = arrayOfChar17[i66];
    int i68;
    switch (i66 % 5)
    {
    default:
      i68 = 77;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar17[i66] = (char)(i68 ^ i67);
      i66++;
      break;
      i68 = 105;
      continue;
      i68 = 19;
      continue;
      i68 = 87;
      continue;
      i68 = 41;
    }
    label2705: int i71 = arrayOfChar18[i70];
    int i72;
    switch (i70 % 5)
    {
    default:
      i72 = 77;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar18[i70] = (char)(i72 ^ i71);
      i70++;
      break;
      i72 = 105;
      continue;
      i72 = 19;
      continue;
      i72 = 87;
      continue;
      i72 = 41;
    }
    label2797: int i75 = arrayOfChar19[i74];
    int i76;
    switch (i74 % 5)
    {
    default:
      i76 = 77;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar19[i74] = (char)(i76 ^ i75);
      i74++;
      break;
      i76 = 105;
      continue;
      i76 = 19;
      continue;
      i76 = 87;
      continue;
      i76 = 41;
    }
    label2889: int i79 = arrayOfChar20[i78];
    int i80;
    switch (i78 % 5)
    {
    default:
      i80 = 77;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar20[i78] = (char)(i80 ^ i79);
      i78++;
      break;
      i80 = 105;
      continue;
      i80 = 19;
      continue;
      i80 = 87;
      continue;
      i80 = 41;
    }
    label2981: int i83 = arrayOfChar21[i82];
    int i84;
    switch (i82 % 5)
    {
    default:
      i84 = 77;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar21[i82] = (char)(i84 ^ i83);
      i82++;
      break;
      i84 = 105;
      continue;
      i84 = 19;
      continue;
      i84 = 87;
      continue;
      i84 = 41;
    }
    label3073: int i87 = arrayOfChar22[i86];
    int i88;
    switch (i86 % 5)
    {
    default:
      i88 = 77;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar22[i86] = (char)(i88 ^ i87);
      i86++;
      break;
      i88 = 105;
      continue;
      i88 = 19;
      continue;
      i88 = 87;
      continue;
      i88 = 41;
    }
    label3165: int i91 = arrayOfChar23[i90];
    int i92;
    switch (i90 % 5)
    {
    default:
      i92 = 77;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar23[i90] = (char)(i92 ^ i91);
      i90++;
      break;
      i92 = 105;
      continue;
      i92 = 19;
      continue;
      i92 = 87;
      continue;
      i92 = 41;
    }
    label3257: int i95 = arrayOfChar24[i94];
    int i96;
    switch (i94 % 5)
    {
    default:
      i96 = 77;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar24[i94] = (char)(i96 ^ i95);
      i94++;
      break;
      i96 = 105;
      continue;
      i96 = 19;
      continue;
      i96 = 87;
      continue;
      i96 = 41;
    }
    label3349: int i99 = arrayOfChar25[i98];
    int i100;
    switch (i98 % 5)
    {
    default:
      i100 = 77;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar25[i98] = (char)(i100 ^ i99);
      i98++;
      break;
      i100 = 105;
      continue;
      i100 = 19;
      continue;
      i100 = 87;
      continue;
      i100 = 41;
    }
    label3441: int i103 = arrayOfChar26[i102];
    int i104;
    switch (i102 % 5)
    {
    default:
      i104 = 77;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar26[i102] = (char)(i104 ^ i103);
      i102++;
      break;
      i104 = 105;
      continue;
      i104 = 19;
      continue;
      i104 = 87;
      continue;
      i104 = 41;
    }
    label3533: int i107 = arrayOfChar27[i106];
    int i108;
    switch (i106 % 5)
    {
    default:
      i108 = 77;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar27[i106] = (char)(i108 ^ i107);
      i106++;
      break;
      i108 = 105;
      continue;
      i108 = 19;
      continue;
      i108 = 87;
      continue;
      i108 = 41;
    }
    label3625: int i111 = arrayOfChar28[i110];
    int i112;
    switch (i110 % 5)
    {
    default:
      i112 = 77;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar28[i110] = (char)(i112 ^ i111);
      i110++;
      break;
      i112 = 105;
      continue;
      i112 = 19;
      continue;
      i112 = 87;
      continue;
      i112 = 41;
    }
    label3717: int i115 = arrayOfChar29[i114];
    int i116;
    switch (i114 % 5)
    {
    default:
      i116 = 77;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar29[i114] = (char)(i116 ^ i115);
      i114++;
      break;
      i116 = 105;
      continue;
      i116 = 19;
      continue;
      i116 = 87;
      continue;
      i116 = 41;
    }
    label3809: int i119 = arrayOfChar30[i118];
    int i120;
    switch (i118 % 5)
    {
    default:
      i120 = 77;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar30[i118] = (char)(i120 ^ i119);
      i118++;
      break;
      i120 = 105;
      continue;
      i120 = 19;
      continue;
      i120 = 87;
      continue;
      i120 = 41;
    }
  }

  static float a(PopupNotification paramPopupNotification, float paramFloat)
  {
    paramPopupNotification.z = paramFloat;
    return paramFloat;
  }

  static int a(PopupNotification paramPopupNotification, int paramInt)
  {
    return paramPopupNotification.c(paramInt);
  }

  static SensorEventListener a(PopupNotification paramPopupNotification, SensorEventListener paramSensorEventListener)
  {
    paramPopupNotification.y = paramSensorEventListener;
    return paramSensorEventListener;
  }

  private View a(sz paramsz)
  {
    boolean bool = DialogToastListActivity.f;
    TextView localTextView = new TextView(this);
    String str1 = "";
    if (paramsz.a == 6)
      if (paramsz.c == null)
      {
        g5.b(F[17] + g5.a(paramsz));
        if (!bool)
          break label521;
      }
    label132: label521: for (String str2 = App.w.a(paramsz.c, null).b(); ; str2 = null)
    {
      Object localObject;
      SpannableStringBuilder localSpannableStringBuilder;
      switch ((int)paramsz.m)
      {
      case 2:
      case 3:
      default:
        localObject = str1;
        if (bool)
          localObject = paramsz.b();
        localSpannableStringBuilder = v4.a((String)localObject, this);
        if (localSpannableStringBuilder != null)
          break;
      case 1:
      case 6:
      case 4:
      case 5:
      case 7:
      }
      while (true)
      {
        localTextView.setText((CharSequence)localObject);
        localTextView.setTextSize(ze.b(getResources()));
        localTextView.setGravity(17);
        localTextView.setTextColor(-16777216);
        localTextView.setPadding((int)this.c.i, 0, (int)this.c.i, 0);
        return localTextView;
        App localApp6 = App.Mb;
        Object[] arrayOfObject6 = new Object[2];
        arrayOfObject6[0] = str2;
        arrayOfObject6[1] = paramsz.b();
        str1 = localApp6.getString(2131296856, arrayOfObject6);
        if ((!bool) || (paramsz.c == null))
          break;
        String str3 = App.w.a(paramsz.c, null).b();
        if (paramsz.b() == null)
        {
          App localApp5 = App.Mb;
          Object[] arrayOfObject5 = new Object[1];
          arrayOfObject5[0] = str3;
          str1 = localApp5.getString(2131296638, arrayOfObject5);
          if (!bool);
        }
        else
        {
          App localApp4 = App.Mb;
          Object[] arrayOfObject4 = new Object[1];
          arrayOfObject4[0] = str3;
          str1 = localApp4.getString(2131296637, arrayOfObject4);
        }
        if (!bool)
          break;
        if ((paramsz.c != null) && (paramsz.c.startsWith(App.c())))
        {
          str1 = App.Mb.getString(2131296858);
          if (!bool)
            break;
        }
        App localApp3 = App.Mb;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = str2;
        str1 = localApp3.getString(2131296857, arrayOfObject3);
        if (!bool)
          break;
        App localApp2 = App.Mb;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = str2;
        str1 = localApp2.getString(2131296870, arrayOfObject2);
        if (!bool)
          break;
        if ((paramsz.c != null) && (paramsz.c.startsWith(App.c())))
        {
          str1 = App.Mb.getString(2131296860);
          if (!bool)
            break;
        }
        App localApp1 = App.Mb;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = str2;
        localObject = localApp1.getString(2131296859, arrayOfObject1);
        break label132;
        localObject = localSpannableStringBuilder;
      }
    }
  }

  static ArrayList a(PopupNotification paramPopupNotification)
  {
    return paramPopupNotification.d;
  }

  private boolean a(boolean paramBoolean)
  {
    this.E = eg.a(this, paramBoolean);
    if (this.E != null)
      showDialog(3);
    if (this.E != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private int b(int paramInt)
  {
    if (this.d.size() > 1)
      paramInt--;
    return paramInt;
  }

  private View b(sz paramsz)
  {
    ImageButton localImageButton = new ImageButton(this);
    localImageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
    localImageButton.setBackgroundDrawable(null);
    localImageButton.setImageResource(2130837518);
    localImageButton.setOnClickListener(this.g);
    return localImageButton;
  }

  static GalleryView b(PopupNotification paramPopupNotification)
  {
    return paramPopupNotification.k;
  }

  private void b()
  {
    App.mb();
    if (this.f != null)
      this.h.add(this.f.b);
    if (this.d.size() <= 1)
      return;
    int i1 = -1 + (-1 + this.k.b());
    if (i1 < 0)
      i1 = -1 + this.d.size();
    this.k.b(i1 + 1);
    View localView = this.k.getChildAt(i1 + 1);
    if (App.ub());
    for (int i2 = 1; ; i2 = -1)
    {
      TranslateAnimation localTranslateAnimation = new TranslateAnimation(i2 * -localView.getWidth() / 2, 0.0F, 0.0F, 0.0F);
      localTranslateAnimation.setDuration(v);
      localTranslateAnimation.setFillAfter(true);
      localView.startAnimation(localTranslateAnimation);
      break;
    }
  }

  private int c(int paramInt)
  {
    if (this.d.size() > 1)
      paramInt++;
    return paramInt;
  }

  private View c(sz paramsz)
  {
    ImageButton localImageButton = new ImageButton(this);
    localImageButton.setScaleType(ImageView.ScaleType.CENTER);
    localImageButton.setBackgroundDrawable(null);
    int i1 = (int)this.c.K;
    localImageButton.setPadding(i1, i1, i1, i1);
    Bitmap localBitmap = m5.b(paramsz);
    if (localBitmap != null)
    {
      o localo = new o(this, localBitmap);
      localo.a(100.0F * this.c.O / localBitmap.getHeight());
      localImageButton.setImageDrawable(localo);
      if (!DialogToastListActivity.f);
    }
    else
    {
      localImageButton.setBackgroundResource(17301508);
      localImageButton.setImageResource(2130838490);
    }
    localImageButton.setOnClickListener(this.g);
    return localImageButton;
  }

  static sz c(PopupNotification paramPopupNotification)
  {
    return paramPopupNotification.f;
  }

  private void c()
  {
    App.mb();
    if (this.f != null)
      this.h.add(this.f.b);
    if (this.d.size() <= 1)
      return;
    int i1 = 1 + (-1 + this.k.b());
    if (i1 >= this.d.size())
      i1 = 0;
    this.k.b(i1 + 1);
    View localView = this.k.getChildAt(i1 + 1);
    if (App.ub());
    for (int i2 = 1; ; i2 = -1)
    {
      TranslateAnimation localTranslateAnimation = new TranslateAnimation(i2 * localView.getWidth() / 2, 0.0F, 0.0F, 0.0F);
      localTranslateAnimation.setDuration(v);
      localTranslateAnimation.setFillAfter(true);
      localView.startAnimation(localTranslateAnimation);
      break;
    }
  }

  private View d(sz paramsz)
  {
    boolean bool = DialogToastListActivity.f;
    ImageButton localImageButton = new ImageButton(this);
    localImageButton.setScaleType(ImageView.ScaleType.CENTER);
    localImageButton.setBackgroundDrawable(null);
    int i1 = (int)this.c.K;
    localImageButton.setPadding(i1, i1, i1, i1);
    Bitmap localBitmap = m5.b(paramsz);
    if (localBitmap != null);
    while (true)
    {
      try
      {
        if ((localBitmap.getWidth() != this.c.X) || (localBitmap.getHeight() != this.c.X))
          localBitmap = Bitmap.createScaledBitmap(localBitmap, this.c.X, this.c.X, true);
        if (paramsz.m > 0L)
        {
          VideoBitmapDrawable localVideoBitmapDrawable = new VideoBitmapDrawable(this, localBitmap, Formatter.formatShortFileSize(App.Mb, paramsz.m), this.c.M);
          localVideoBitmapDrawable.a(this.c.O);
          localImageButton.setImageDrawable(localVideoBitmapDrawable);
          if (!bool);
        }
        else
        {
          o localo = new o(this, localBitmap);
          localo.a(this.c.O);
          localImageButton.setImageDrawable(localo);
        }
        localImageButton.setOnClickListener(this.g);
        return localImageButton;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        localImageButton.setImageBitmap(localBitmap);
        if (!bool)
          continue;
      }
      localImageButton.setPadding(1, 0, 0, 9);
      localImageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
      localImageButton.setBackgroundResource(17301508);
      localImageButton.setImageResource(2130837517);
    }
  }

  static HashSet d(PopupNotification paramPopupNotification)
  {
    return paramPopupNotification.h;
  }

  private View e(sz paramsz)
  {
    boolean bool = DialogToastListActivity.f;
    RelativeLayout localRelativeLayout = new RelativeLayout(this);
    localRelativeLayout.setGravity(17);
    View localView = ((LayoutInflater)getBaseContext().getSystemService(F[27])).inflate(2130903070, localRelativeLayout, true);
    localView.findViewById(2131558607).setVisibility(8);
    localView.findViewById(2131558600).setVisibility(8);
    TextView localTextView1 = (TextView)localView.findViewById(2131558605);
    TextView localTextView2 = (TextView)localView.findViewById(2131558606);
    if ((paramsz.p == null) || ("".equals(paramsz.p)))
    {
      localTextView1.setVisibility(8);
      localTextView2.setVisibility(8);
      if (!bool);
    }
    else
    {
      localTextView1.setVisibility(0);
      String[] arrayOfString = paramsz.p.split("\n");
      String str;
      if ((paramsz.j == null) || ("".equals(paramsz.j)))
      {
        str = F[29] + Uri.encode(paramsz.p.replaceAll(F[25], "+")) + F[28] + paramsz.q + "," + paramsz.r;
        if (!bool);
      }
      else
      {
        str = paramsz.j;
      }
      localTextView1.setAutoLinkMask(0);
      localTextView1.setText(Html.fromHtml(F[23] + str + F[26] + arrayOfString[0] + F[24]));
      if ((arrayOfString.length > 1) && (!"".equals(arrayOfString[1])))
      {
        localTextView2.setVisibility(0);
        localTextView2.setText(arrayOfString[1]);
        if (!bool);
      }
      else
      {
        localTextView2.setVisibility(8);
      }
      iy localiy = new iy(this, str);
      localTextView1.setOnClickListener(localiy);
      localTextView2.setOnClickListener(localiy);
    }
    ImageButton localImageButton = (ImageButton)localView.findViewById(2131558523);
    localImageButton.setBackgroundDrawable(null);
    int i1 = (int)this.c.K;
    localImageButton.setPadding(i1, i1, i1, i1);
    Bitmap localBitmap = m5.b(paramsz);
    o localo;
    if (localBitmap != null)
    {
      localo = new o(this, localBitmap);
      if (!bool);
    }
    else
    {
      localo = new o(this, d5.a());
    }
    localo.a(this.c.O);
    localImageButton.setImageDrawable(localo);
    localImageButton.setOnClickListener(this.g);
    return localRelativeLayout;
  }

  static zq e(PopupNotification paramPopupNotification)
  {
    return paramPopupNotification.e;
  }

  // ERROR //
  private View f(sz paramsz)
  {
    // Byte code:
    //   0: new 204	android/widget/TextView
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 207	android/widget/TextView:<init>	(Landroid/content/Context;)V
    //   8: astore_2
    //   9: aload_2
    //   10: aload_1
    //   11: getfield 513	com/whatsapp/sz:p	Ljava/lang/String;
    //   14: invokevirtual 260	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   17: aload_2
    //   18: aload_0
    //   19: invokevirtual 264	com/whatsapp/PopupNotification:getResources	()Landroid/content/res/Resources;
    //   22: invokestatic 269	com/whatsapp/ze:b	(Landroid/content/res/Resources;)F
    //   25: invokevirtual 273	android/widget/TextView:setTextSize	(F)V
    //   28: aload_2
    //   29: bipush 17
    //   31: invokevirtual 277	android/widget/TextView:setGravity	(I)V
    //   34: aload_2
    //   35: ldc_w 278
    //   38: invokevirtual 281	android/widget/TextView:setTextColor	(I)V
    //   41: aload_1
    //   42: invokevirtual 251	com/whatsapp/sz:b	()Ljava/lang/String;
    //   45: invokestatic 583	g:b	(Ljava/lang/String;)Lg;
    //   48: astore 15
    //   50: aload 15
    //   52: astore 4
    //   54: aload 4
    //   56: ifnull +258 -> 314
    //   59: aload 4
    //   61: getfield 586	g:f	[B
    //   64: ifnull +250 -> 314
    //   67: aload 4
    //   69: getfield 586	g:f	[B
    //   72: arraylength
    //   73: ifle +241 -> 314
    //   76: aload 4
    //   78: getfield 586	g:f	[B
    //   81: invokestatic 591	wb:b	([B)[B
    //   84: astore 11
    //   86: aload 11
    //   88: iconst_0
    //   89: aload 11
    //   91: arraylength
    //   92: invokestatic 597	android/graphics/BitmapFactory:decodeByteArray	([BII)Landroid/graphics/Bitmap;
    //   95: astore 12
    //   97: aload 12
    //   99: astore 5
    //   101: aload_0
    //   102: invokevirtual 264	com/whatsapp/PopupNotification:getResources	()Landroid/content/res/Resources;
    //   105: ldc_w 598
    //   108: invokevirtual 604	android/content/res/Resources:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   111: astore 6
    //   113: aload 5
    //   115: ifnull +47 -> 162
    //   118: new 426	com/whatsapp/o
    //   121: dup
    //   122: aload_0
    //   123: aload 5
    //   125: invokespecial 429	com/whatsapp/o:<init>	(Landroid/content/Context;Landroid/graphics/Bitmap;)V
    //   128: astore 7
    //   130: aload 7
    //   132: iconst_0
    //   133: iconst_0
    //   134: aload 6
    //   136: invokevirtual 609	android/graphics/drawable/Drawable:getIntrinsicWidth	()I
    //   139: aload 6
    //   141: invokevirtual 612	android/graphics/drawable/Drawable:getIntrinsicHeight	()I
    //   144: invokevirtual 615	com/whatsapp/o:setBounds	(IIII)V
    //   147: aload_2
    //   148: aload 7
    //   150: aconst_null
    //   151: aconst_null
    //   152: aconst_null
    //   153: invokevirtual 619	android/widget/TextView:setCompoundDrawables	(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   156: getstatic 202	com/whatsapp/DialogToastListActivity:f	Z
    //   159: ifeq +12 -> 171
    //   162: aload_2
    //   163: aload 6
    //   165: aconst_null
    //   166: aconst_null
    //   167: aconst_null
    //   168: invokevirtual 622	android/widget/TextView:setCompoundDrawablesWithIntrinsicBounds	(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   171: aload_2
    //   172: aload_0
    //   173: getfield 283	com/whatsapp/PopupNotification:c	Lcom/whatsapp/j4;
    //   176: getfield 418	com/whatsapp/j4:K	F
    //   179: f2i
    //   180: invokevirtual 625	android/widget/TextView:setCompoundDrawablePadding	(I)V
    //   183: aload_2
    //   184: aload_0
    //   185: getfield 283	com/whatsapp/PopupNotification:c	Lcom/whatsapp/j4;
    //   188: getfield 418	com/whatsapp/j4:K	F
    //   191: f2i
    //   192: aload_0
    //   193: getfield 283	com/whatsapp/PopupNotification:c	Lcom/whatsapp/j4;
    //   196: getfield 418	com/whatsapp/j4:K	F
    //   199: f2i
    //   200: aload_0
    //   201: getfield 283	com/whatsapp/PopupNotification:c	Lcom/whatsapp/j4;
    //   204: getfield 418	com/whatsapp/j4:K	F
    //   207: f2i
    //   208: aload_0
    //   209: getfield 283	com/whatsapp/PopupNotification:c	Lcom/whatsapp/j4;
    //   212: getfield 418	com/whatsapp/j4:K	F
    //   215: f2i
    //   216: invokevirtual 291	android/widget/TextView:setPadding	(IIII)V
    //   219: new 482	android/widget/RelativeLayout
    //   222: dup
    //   223: aload_0
    //   224: invokespecial 483	android/widget/RelativeLayout:<init>	(Landroid/content/Context;)V
    //   227: astore 8
    //   229: aload 8
    //   231: bipush 17
    //   233: invokevirtual 484	android/widget/RelativeLayout:setGravity	(I)V
    //   236: aload 8
    //   238: aload_2
    //   239: invokevirtual 629	android/widget/RelativeLayout:addView	(Landroid/view/View;)V
    //   242: aload 8
    //   244: areturn
    //   245: astore 14
    //   247: aload 14
    //   249: invokestatic 632	com/whatsapp/g5:c	(Ljava/lang/Throwable;)V
    //   252: aconst_null
    //   253: astore 4
    //   255: goto -201 -> 54
    //   258: astore 13
    //   260: aload 13
    //   262: invokestatic 634	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   265: aconst_null
    //   266: astore 4
    //   268: goto -214 -> 54
    //   271: astore_3
    //   272: aload_3
    //   273: invokestatic 632	com/whatsapp/g5:c	(Ljava/lang/Throwable;)V
    //   276: aconst_null
    //   277: astore 4
    //   279: goto -225 -> 54
    //   282: astore 10
    //   284: getstatic 141	com/whatsapp/PopupNotification:F	[Ljava/lang/String;
    //   287: bipush 15
    //   289: aaload
    //   290: aload 10
    //   292: invokestatic 637	com/whatsapp/g5:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   295: aconst_null
    //   296: astore 5
    //   298: goto -197 -> 101
    //   301: astore 9
    //   303: getstatic 141	com/whatsapp/PopupNotification:F	[Ljava/lang/String;
    //   306: bipush 15
    //   308: aaload
    //   309: aload 9
    //   311: invokestatic 637	com/whatsapp/g5:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   314: aconst_null
    //   315: astore 5
    //   317: goto -216 -> 101
    //
    // Exception table:
    //   from	to	target	type
    //   41	50	245	java/io/UnsupportedEncodingException
    //   41	50	258	java/io/IOException
    //   41	50	271	b
    //   76	97	282	java/lang/ArrayIndexOutOfBoundsException
    //   76	97	301	java/lang/StringIndexOutOfBoundsException
  }

  static HashSet f(PopupNotification paramPopupNotification)
  {
    return paramPopupNotification.j;
  }

  private void f()
  {
    g5.b(F[9]);
    this.z = 5.0F;
    this.C.removeCallbacks(this.D);
    this.C.postDelayed(this.D, 600L);
    if ((this.y == null) && (this.x != null))
    {
      this.y = new ny(this);
      this.w.registerListener(this.y, this.x, 0);
    }
  }

  private View g(sz paramsz)
  {
    Object localObject;
    switch (paramsz.l)
    {
    default:
      localObject = new TextView(this);
    case 0:
    case 2:
    case 1:
    case 3:
    case 5:
    case 4:
    }
    while (true)
    {
      return localObject;
      localObject = a(paramsz);
      continue;
      localObject = b(paramsz);
      continue;
      localObject = c(paramsz);
      continue;
      localObject = d(paramsz);
      continue;
      localObject = e(paramsz);
      continue;
      localObject = f(paramsz);
    }
  }

  static ConversationTextEntry g(PopupNotification paramPopupNotification)
  {
    return paramPopupNotification.l;
  }

  private void g()
  {
    g5.b(F[20]);
    if ((this.u != null) && (!this.u.isHeld()))
      this.u.acquire();
    this.A.removeCallbacks(this.B);
    this.A.postDelayed(this.B, 5000L);
  }

  private void h()
  {
    Bitmap localBitmap1;
    if (this.e != null)
    {
      localBitmap1 = this.e.a((int)App.Mb.getResources().getDimension(2131361797), j4.a(App.Mb.getApplicationContext()).L, false);
      if (localBitmap1 != null)
        break label68;
    }
    label68: for (Bitmap localBitmap2 = this.e.l(); ; localBitmap2 = localBitmap1)
    {
      ((ImageView)findViewById(2131558728)).setImageBitmap(localBitmap2);
      return;
    }
  }

  static void h(PopupNotification paramPopupNotification)
  {
    paramPopupNotification.c();
  }

  private void i()
  {
    int i1 = 0;
    if (this.e == null);
    int i2;
    int i3;
    while (true)
    {
      return;
      if (a(true))
        break label531;
      if (App.g(this.e.b))
      {
        showDialog(106);
      }
      else
      {
        String str = this.l.getText().toString().trim();
        if (str.length() > 0)
        {
          App.a(this.e, str);
          TextKeyListener.clear(this.l.getText());
          if (!DialogToastListActivity.f);
        }
        else
        {
          g5.b(F[13] + this.d.size());
          continue;
        }
        InputMethodManager localInputMethodManager = (InputMethodManager)App.Mb.getSystemService(F[12]);
        if (localInputMethodManager.isFullscreenMode())
          localInputMethodManager.hideSoftInputFromWindow(this.l.getWindowToken(), 0);
        i2 = this.k.b();
        i3 = b(this.k.b());
        g5.b(F[14] + i2 + F[11] + i3 + F[10] + this.d.size());
        this.i.add(((sz)this.d.get(i3)).b);
        this.d.remove(i3);
        if (!this.d.isEmpty())
          break;
        finish();
      }
    }
    this.k.removeViewAt(i2);
    if (i3 >= this.d.size())
      i3--;
    for (int i4 = 1; ; i4 = 0)
    {
      if (this.d.size() == 1)
      {
        this.k.removeViewAt(-1 + this.k.getChildCount());
        this.k.removeViewAt(0);
        findViewById(2131558741).setVisibility(8);
        findViewById(2131558740).setVisibility(8);
        this.r.setVisibility(8);
        this.t.setVisibility(8);
      }
      while (true)
      {
        int i5 = c(i1);
        this.k.b(i5);
        if (this.f != null)
          this.h.add(this.f.b);
        if (this.e != null)
          this.j.add(this.e.b);
        View localView = this.k.getChildAt(i5);
        int i6;
        if (App.ub())
        {
          i6 = 1;
          label473: if (i4 == 0)
            break label540;
        }
        label531: label540: for (int i7 = -1; ; i7 = 1)
        {
          TranslateAnimation localTranslateAnimation = new TranslateAnimation(i7 * i6 * localView.getWidth() / 2, 0.0F, 0.0F, 0.0F);
          localTranslateAnimation.setDuration(v);
          localTranslateAnimation.setFillAfter(true);
          localView.startAnimation(localTranslateAnimation);
          break;
          break;
          i6 = -1;
          break label473;
        }
        i1 = i3;
      }
    }
  }

  static void i(PopupNotification paramPopupNotification)
  {
    paramPopupNotification.b();
  }

  static int j()
  {
    return v;
  }

  static void j(PopupNotification paramPopupNotification)
  {
    paramPopupNotification.i();
  }

  static PowerManager.WakeLock k(PopupNotification paramPopupNotification)
  {
    return paramPopupNotification.u;
  }

  static SensorEventListener l(PopupNotification paramPopupNotification)
  {
    return paramPopupNotification.y;
  }

  static SensorManager m(PopupNotification paramPopupNotification)
  {
    return paramPopupNotification.w;
  }

  static Sensor n(PopupNotification paramPopupNotification)
  {
    return paramPopupNotification.x;
  }

  static float o(PopupNotification paramPopupNotification)
  {
    return paramPopupNotification.z;
  }

  static void p(PopupNotification paramPopupNotification)
  {
    paramPopupNotification.g();
  }

  public void a()
  {
    if (!this.d.isEmpty())
      a(b(this.k.b()));
  }

  public void a(int paramInt)
  {
    boolean bool = DialogToastListActivity.f;
    this.f = ((sz)this.d.get(paramInt));
    this.e = gp.a(this.f.b.a);
    if (this.e == null)
      return;
    if (App.kb())
      App.a(this.e);
    if ((this.d.size() == 1) || (App.kb()))
    {
      this.h.add(this.f.b);
      this.j.add(this.e.b);
    }
    h();
    int i1 = 2131296512;
    if (this.f.l == 2)
    {
      i1 = 2131296921;
      if (!bool);
    }
    else if (this.f.l == 3)
    {
      i1 = 2131296922;
    }
    this.m.setText(i1);
    Object localObject = this.e.b();
    SpannableStringBuilder localSpannableStringBuilder = v4.a((String)localObject, getBaseContext());
    TextView localTextView1 = this.n;
    if (localSpannableStringBuilder == null);
    while (true)
    {
      localTextView1.setText((CharSequence)localObject);
      if (this.e.o())
      {
        this.o.setText(App.w.a(this.f.c, null).b() + " ");
        if (!bool);
      }
      else
      {
        this.o.setText(this.e.m() + " ");
      }
      TextView localTextView2 = this.p;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramInt + 1);
      arrayOfObject[1] = Integer.valueOf(this.d.size());
      localTextView2.setText(getString(2131296807, arrayOfObject));
      View localView = findViewById(2131558575);
      if (this.l.getText().toString().length() == 0)
      {
        localView.setVisibility(8);
        localView.setEnabled(false);
        if (!bool)
          break;
      }
      localView.setVisibility(0);
      localView.setEnabled(true);
      break;
      localObject = localSpannableStringBuilder;
    }
  }

  public void a(String paramString)
  {
    if ((this.e != null) && (paramString.equals(this.e.b)))
      h();
  }

  public void b(String paramString)
  {
    if ((this.e != null) && (paramString.equals(this.e.b)))
      this.o.setText(this.e.m() + " ");
  }

  public boolean d()
  {
    return this.b;
  }

  public void e()
  {
    boolean bool = DialogToastListActivity.f;
    g5.b(F[21]);
    int i1 = App.Mb.e(true);
    int i2 = App.Mb.e(false);
    if ((i1 == 0) && (i2 == 0))
    {
      finish();
      return;
    }
    if ((b(this.k.b()) == 0) && (!findViewById(2131558575).isShown()));
    for (int i3 = 1; ; i3 = 0)
    {
      this.d = new ArrayList();
      Iterator localIterator1 = gp.a.iterator();
      do
      {
        zq localzq;
        do
        {
          if (!localIterator1.hasNext())
            break;
          localzq = gp.a((String)localIterator1.next());
        }
        while (((localzq.o()) && ((i1 == 0) && (!bool))) || ((i2 == 0) && (!bool)));
        if (localzq.a > 0)
        {
          Iterator localIterator4 = App.z.b(localzq.b, localzq.a).iterator();
          do
          {
            if (!localIterator4.hasNext())
              break;
            sz localsz = (sz)localIterator4.next();
            if (!this.i.contains(localsz.b))
              this.d.add(localsz);
          }
          while (!bool);
        }
      }
      while (!bool);
      g5.b(F[22] + this.d.size());
      if (!this.d.isEmpty())
        break label279;
      finish();
      break;
    }
    label279: if (this.d.size() == 1)
    {
      findViewById(2131558741).setVisibility(8);
      findViewById(2131558740).setVisibility(8);
      this.r.setVisibility(8);
      this.t.setVisibility(8);
      if (!bool);
    }
    else
    {
      findViewById(2131558741).setVisibility(0);
      findViewById(2131558740).setVisibility(0);
      this.r.setVisibility(0);
      this.t.setVisibility(0);
    }
    Collections.sort(this.d, new jy(this));
    this.k.removeAllViews();
    if (this.d.size() > 1)
    {
      TextView localTextView1 = new TextView(this);
      localTextView1.setGravity(17);
      RelativeLayout localRelativeLayout1 = new RelativeLayout(this);
      RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -2);
      localLayoutParams1.addRule(13);
      localRelativeLayout1.addView(localTextView1, localLayoutParams1);
      this.k.addView(localRelativeLayout1);
    }
    Iterator localIterator2 = this.d.iterator();
    do
    {
      if (!localIterator2.hasNext())
        break;
      View localView = g((sz)localIterator2.next());
      RelativeLayout localRelativeLayout3 = new RelativeLayout(this);
      ScrollView localScrollView = new ScrollView(this);
      RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
      localLayoutParams3.addRule(13);
      localScrollView.addView(localView);
      localRelativeLayout3.addView(localScrollView, localLayoutParams3);
      this.k.addView(localRelativeLayout3);
    }
    while (!bool);
    if (this.d.size() > 1)
    {
      TextView localTextView2 = new TextView(this);
      localTextView2.setGravity(17);
      RelativeLayout localRelativeLayout2 = new RelativeLayout(this);
      RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
      localLayoutParams2.addRule(13);
      localRelativeLayout2.addView(localTextView2, localLayoutParams2);
      this.k.addView(localRelativeLayout2);
    }
    label699: int i6;
    if (this.f != null)
      if (i3 != 0)
      {
        new Handler().post(new ky(this));
        if (!bool);
      }
      else
      {
        Iterator localIterator3 = this.d.iterator();
        i4 = 0;
        if ((localIterator3.hasNext()) && ((!((sz)localIterator3.next()).b.equals(this.f.b)) || (bool)))
        {
          i6 = i4 + 1;
          if (bool)
            i4 = i6;
        }
        else if (i4 != this.d.size());
      }
    for (int i4 = 0; ; i4 = 0)
    {
      this.k.b(c(i4));
      Animation localAnimation = AnimationUtils.loadAnimation(this, 2130968577);
      if (i3 != 0);
      for (int i5 = 1; ; i5 = 2)
      {
        localAnimation.setDuration(i5 * v);
        localAnimation.setFillAfter(true);
        this.p.startAnimation(localAnimation);
        if (gp.a(((sz)this.d.get(0)).b.a).o())
        {
          if ((i1 != 2) && (i1 != 3))
            break;
          getWindow().addFlags(524288);
          f();
          if (!bool)
            break;
        }
        if ((i2 != 2) && (i2 != 3))
          break;
        getWindow().addFlags(524288);
        f();
        break;
      }
      i4 = i6;
      break label699;
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    this.w = ((SensorManager)getSystemService(F[2]));
    this.x = this.w.getDefaultSensor(8);
    g5.b(F[1]);
    PowerManager localPowerManager = (PowerManager)App.Mb.getSystemService(F[0]);
    if (localPowerManager != null)
      this.u = localPowerManager.newWakeLock(268435466, F[3]);
    setContentView(2130903118);
    a = this;
    this.c = j4.a(this);
    this.k = ((GalleryView)findViewById(2131558709));
    this.l = ((ConversationTextEntry)findViewById(2131558574));
    this.m = ((Button)findViewById(2131558744));
    this.n = ((TextView)findViewById(2131558739));
    this.o = ((TextView)findViewById(2131558467));
    this.p = ((TextView)findViewById(2131558742));
    this.q = findViewById(2131558694);
    this.r = findViewById(2131558737);
    this.s = findViewById(2131558693);
    this.t = findViewById(2131558736);
    this.k.a(new hy(this));
    ((Button)findViewById(2131558743)).setOnClickListener(new qy(this));
    this.g = new ry(this);
    this.m.setOnClickListener(this.g);
    sy localsy = new sy(this);
    this.q.setOnClickListener(localsy);
    this.r.setOnClickListener(localsy);
    ty localty = new ty(this);
    this.s.setOnClickListener(localty);
    this.t.setOnClickListener(localty);
    this.l.setOnClickListener(new uy(this));
    vy localvy = new vy(this);
    this.l.addTextChangedListener(localvy);
    wy localwy = new wy(this);
    this.l.setOnEditorActionListener(localwy);
    findViewById(2131558575).setOnClickListener(new xy(this));
    e();
    App.a(this);
    if (App.K())
      showDialog(115);
  }

  public Dialog onCreateDialog(int paramInt)
  {
    Object localObject = null;
    switch (paramInt)
    {
    default:
      localObject = super.onCreateDialog(paramInt);
    case 3:
    case 115:
    }
    while (true)
    {
      return localObject;
      if (this.E != null)
      {
        oy localoy = new oy(this);
        py localpy = new py(this);
        localObject = new AlertDialog.Builder(this).setMessage(this.E).setCancelable(false).setPositiveButton(2131296272, localoy).setNegativeButton(2131296273, null).create();
        ((Dialog)localObject).setOnDismissListener(localpy);
      }
      else
      {
        g5.c(F[5]);
        continue;
        g5.b(F[4]);
        localObject = eg.a(this);
      }
    }
  }

  public void onDestroy()
  {
    g5.b(F[19]);
    super.onDestroy();
    this.A.removeCallbacks(this.B);
    this.C.removeCallbacks(this.D);
    if ((this.u != null) && (this.u.isHeld()))
      this.u.release();
    if (this.y != null)
      this.w.unregisterListener(this.y);
    if (a == this)
      a = null;
    App.b(this);
  }

  protected void onPause()
  {
    g5.b(F[18]);
    super.onPause();
    App.nb();
  }

  protected void onStart()
  {
    g5.b(F[16]);
    super.onStart();
    this.b = true;
  }

  public void onStop()
  {
    boolean bool = DialogToastListActivity.f;
    g5.b(F[8]);
    super.onStop();
    this.b = false;
    if (a == this)
    {
      g5.b(F[6] + this.j.size());
      Iterator localIterator1 = this.j.iterator();
      do
      {
        if (!localIterator1.hasNext())
          break;
        String str = (String)localIterator1.next();
        ArrayList localArrayList = new ArrayList();
        zq localzq = gp.a(str);
        Iterator localIterator2 = this.h.iterator();
        do
        {
          if (!localIterator2.hasNext())
            break;
          uz localuz = (uz)localIterator2.next();
          if ((localuz.a != null) && (localuz.a.equals(localzq.b)))
            localArrayList.add(localuz);
        }
        while (!bool);
        g5.b(F[7] + localArrayList.size() + "/" + localzq.a);
        if (localArrayList.size() == localzq.a)
        {
          App.a(localzq, false);
          this.h.removeAll(localArrayList);
        }
      }
      while (!bool);
    }
    App.a(false, false);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.PopupNotification
 * JD-Core Version:    0.6.1
 */