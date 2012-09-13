package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.provider.ContactsContract.Contacts;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class ContactPicker extends VerifyMessageStoreListActivity
  implements uk, k2
{
  private static boolean D;
  private static final String[] T;
  private static final zq h;
  private static final zq i;
  private static final zq j;
  private String A = null;
  private String B = null;
  private Intent C;
  private int E = 0;
  private ArrayList<zq> F = new ArrayList();
  private ArrayList<zq> G = new ArrayList();
  private ListView H;
  private InputMethodManager I;
  private EditText J;
  private TextView K;
  private ImageButton L;
  private ImageButton M;
  private ImageButton N;
  private ImageButton O;
  private boolean P;
  private pj Q = new pj();
  private boolean R;
  final TextWatcher S = new kk(this);
  private Handler k = new Handler();
  private ProgressBar l;
  private fe m;
  private zq n;
  private HashMap<String, String> o = new HashMap();
  private boolean p;
  private boolean q;
  private boolean r;
  private boolean s;
  private boolean t;
  private boolean u;
  private boolean v;
  private String w;
  private byte x;
  private ArrayList<Uri> y = null;
  private String z = "";

  static
  {
    String[] arrayOfString = new String[54];
    char[] arrayOfChar1 = "\006\nk:\035\034\006.2\017".toCharArray();
    int i1 = arrayOfChar1.length;
    int i2 = 0;
    char[] arrayOfChar2;
    int i6;
    char[] arrayOfChar3;
    int i10;
    char[] arrayOfChar4;
    int i14;
    char[] arrayOfChar5;
    int i17;
    int i18;
    if (i1 <= i2)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\001\01322\022\034".toCharArray();
      int i5 = arrayOfChar2.length;
      i6 = 0;
      arrayOfString[1] = new String(arrayOfChar2).intern();
      arrayOfChar3 = "\002\f\"".toCharArray();
      int i9 = arrayOfChar3.length;
      i10 = 0;
      arrayOfString[2] = new String(arrayOfChar3).intern();
      arrayOfChar4 = "\013\n(#\035\013\0216>\037\003��4x\025\033\021#;\020\t\0034>\031\006\00148\013G\007'3#\030\n5>\b\001\n(w".toCharArray();
      int i13 = arrayOfChar4.length;
      i14 = 0;
      arrayOfString[3] = new String(arrayOfChar4).intern();
      arrayOfChar5 = "\013\n(#\035\013\0216>\037\003��4x\025\033\r#;\f\032\n1x\036\t\001\031'\023\033\f2>\023\006E".toCharArray();
      i17 = arrayOfChar5.length;
      i18 = 0;
    }
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
    char[] arrayOfChar31;
    int i122;
    char[] arrayOfChar32;
    int i126;
    char[] arrayOfChar33;
    int i130;
    char[] arrayOfChar34;
    int i134;
    char[] arrayOfChar35;
    int i138;
    char[] arrayOfChar36;
    int i142;
    char[] arrayOfChar37;
    int i146;
    char[] arrayOfChar38;
    int i150;
    char[] arrayOfChar39;
    int i154;
    char[] arrayOfChar40;
    int i158;
    char[] arrayOfChar41;
    int i162;
    char[] arrayOfChar42;
    int i166;
    char[] arrayOfChar43;
    int i170;
    char[] arrayOfChar44;
    int i174;
    char[] arrayOfChar45;
    int i178;
    char[] arrayOfChar46;
    int i182;
    char[] arrayOfChar47;
    int i186;
    char[] arrayOfChar48;
    int i190;
    char[] arrayOfChar49;
    int i194;
    char[] arrayOfChar50;
    int i198;
    char[] arrayOfChar51;
    int i202;
    char[] arrayOfChar52;
    int i206;
    while (true)
    {
      arrayOfString[4] = new String(arrayOfChar5).intern();
      arrayOfChar6 = "\034��>#".toCharArray();
      int i21 = arrayOfChar6.length;
      i22 = 0;
      if (i21 > i22)
        break label2585;
      arrayOfString[5] = new String(arrayOfChar6).intern();
      arrayOfChar7 = "\001\b'0\031".toCharArray();
      int i25 = arrayOfChar7.length;
      i26 = 0;
      if (i25 > i26)
        break label2677;
      arrayOfString[6] = new String(arrayOfChar7).intern();
      arrayOfChar8 = "\036\f\"2\023".toCharArray();
      int i29 = arrayOfChar8.length;
      i30 = 0;
      if (i29 > i30)
        break label2769;
      arrayOfString[7] = new String(arrayOfChar8).intern();
      arrayOfChar9 = "\t\020\">\023".toCharArray();
      int i33 = arrayOfChar9.length;
      i34 = 0;
      if (i33 > i34)
        break label2861;
      arrayOfString[8] = new String(arrayOfChar9).intern();
      arrayOfChar10 = "\013\n(#\035\013\0216>\037\003��4x\017\r\021f \0357\021?'\031HXf".toCharArray();
      int i37 = arrayOfChar10.length;
      i38 = 0;
      if (i37 > i38)
        break label2953;
      arrayOfString[9] = new String(arrayOfChar10).intern();
      arrayOfChar11 = "\034��>#S\020H04\035\032\001".toCharArray();
      int i41 = arrayOfChar11.length;
      i42 = 0;
      if (i41 > i42)
        break label3045;
      arrayOfString[10] = new String(arrayOfChar11).intern();
      arrayOfChar12 = "\013\n(#\035\013\0216>\037\003��4x\037\032��'#\031".toCharArray();
      int i45 = arrayOfChar12.length;
      i46 = 0;
      if (i45 > i46)
        break label3137;
      arrayOfString[11] = new String(arrayOfChar12).intern();
      arrayOfChar13 = "\005\n39\b\r\001".toCharArray();
      int i49 = arrayOfChar13.length;
      i50 = 0;
      if (i49 > i50)
        break label3229;
      arrayOfString[12] = new String(arrayOfChar13).intern();
      arrayOfChar14 = "\005\n39\b\r\001\031%\023".toCharArray();
      int i53 = arrayOfChar14.length;
      i54 = 0;
      if (i53 > i54)
        break label3321;
      arrayOfString[13] = new String(arrayOfChar14).intern();
      arrayOfChar15 = "\013\n(#\035\013\0216>\037\003��4x\022\007:%8\022\034\004%#\017G\007'3#\030\n5>\b\001\n(w".toCharArray();
      int i57 = arrayOfChar15.length;
      i58 = 0;
      if (i57 > i58)
        break label3413;
      arrayOfString[14] = new String(arrayOfChar15).intern();
      arrayOfChar16 = "\013\n+y\035\006\00148\025\fK%8\022\034\004%#\017".toCharArray();
      int i61 = arrayOfChar16.length;
      i62 = 0;
      if (i61 > i62)
        break label3505;
      arrayOfString[15] = new String(arrayOfChar16).intern();
      arrayOfChar17 = "\013\n(#\035\013\021\031'\025\013\016#%S\007\0252>\023\006\026i$\005\033\021#:\\\013\n(#\035\013\0215w\035\030\025f4\023\035\t\"w\022\007\021f1\023\035\013\"".toCharArray();
      int i65 = arrayOfChar17.length;
      i66 = 0;
      if (i65 > i66)
        break label3597;
      arrayOfString[16] = new String(arrayOfChar17).intern();
      arrayOfChar18 = "\t\013\"%\023\001\001h>\022\034��(#R\t\0062>\023\006K\020\0369?".toCharArray();
      int i69 = arrayOfChar18.length;
      i70 = 0;
      if (i69 > i70)
        break label3689;
      arrayOfString[17] = new String(arrayOfChar18).intern();
      arrayOfChar19 = "\033\r'%\0317\b50".toCharArray();
      int i73 = arrayOfChar19.length;
      i74 = 0;
      if (i73 > i74)
        break label3781;
      arrayOfString[18] = new String(arrayOfChar19).intern();
      arrayOfChar20 = "\t\013\"%\023\001\001h>\022\034��(#R\r\0352%\035F6\022\0059)(".toCharArray();
      int i77 = arrayOfChar20.length;
      i78 = 0;
      if (i77 > i78)
        break label3873;
      arrayOfString[19] = new String(arrayOfChar20).intern();
      arrayOfChar21 = "\032��2\"\016\006E/9\b\r\0132".toCharArray();
      int i81 = arrayOfChar21.length;
      i82 = 0;
      if (i81 > i82)
        break label3965;
      arrayOfString[20] = new String(arrayOfChar21).intern();
      arrayOfChar22 = "��\0045\b\017��\00442".toCharArray();
      int i85 = arrayOfChar22.length;
      i86 = 0;
      if (i85 > i86)
        break label4057;
      arrayOfString[21] = new String(arrayOfChar22).intern();
      arrayOfChar23 = "\013\n(#\035\013\021".toCharArray();
      int i89 = arrayOfChar23.length;
      i90 = 0;
      if (i89 > i90)
        break label4149;
      arrayOfString[22] = new String(arrayOfChar23).intern();
      arrayOfChar24 = "\037\004\031#\005\030��".toCharArray();
      int i93 = arrayOfChar24.length;
      i94 = 0;
      if (i93 > i94)
        break label4241;
      arrayOfString[23] = new String(arrayOfChar24).intern();
      arrayOfChar25 = "\036\006'%\0307\013':\031".toCharArray();
      int i97 = arrayOfChar25.length;
      i98 = 0;
      if (i97 > i98)
        break label4333;
      arrayOfString[24] = new String(arrayOfChar25).intern();
      arrayOfChar26 = "\036\006'%\0307\0262%".toCharArray();
      int i101 = arrayOfChar26.length;
      i102 = 0;
      if (i101 > i102)
        break label4425;
      arrayOfString[25] = new String(arrayOfChar26).intern();
      arrayOfChar27 = "\013\n(#\035\013\0216>\037\003��4x\016\r\0263;\bH\006)9\b\t\0062w\022\007\021f6\030\f��\"".toCharArray();
      int i105 = arrayOfChar27.length;
      i106 = 0;
      if (i105 > i106)
        break label4517;
      arrayOfString[26] = new String(arrayOfChar27).intern();
      arrayOfChar28 = "(\026h \024\t\02156\f\030K(2\b".toCharArray();
      int i109 = arrayOfChar28.length;
      i110 = 0;
      if (i109 > i110)
        break label4609;
      arrayOfString[27] = new String(arrayOfChar28).intern();
      arrayOfChar29 = "\030\004\031;\025\033\021".toCharArray();
      int i113 = arrayOfChar29.length;
      i114 = 0;
      if (i113 > i114)
        break label4701;
      arrayOfString[28] = new String(arrayOfChar29).intern();
      arrayOfChar30 = "\013\n(#\035\013\0216>\037\003��4x\017��\00442S\013\n(#\035\013\021i2\016\032\n4w".toCharArray();
      int i117 = arrayOfChar30.length;
      i118 = 0;
      if (i117 > i118)
        break label4793;
      arrayOfString[29] = new String(arrayOfChar30).intern();
      arrayOfChar31 = "=1��zD".toCharArray();
      int i121 = arrayOfChar31.length;
      i122 = 0;
      if (i121 > i122)
        break label4885;
      arrayOfString[30] = new String(arrayOfChar31).intern();
      arrayOfChar32 = "\013\n(#\035\013\0216>\037\003��4x\017��\00442S\013\n(#\035\013\021i1\025\004��f3\023\r\026(p\bH��>>\017\034E".toCharArray();
      int i125 = arrayOfChar32.length;
      i126 = 0;
      if (i125 > i126)
        break label4977;
      arrayOfString[31] = new String(arrayOfChar32).intern();
      arrayOfChar33 = "\t\013\"%\023\001\001h>\022\034��(#R\t\0062>\023\006K\005\0059)1\003\b/ *\024\003?=1".toCharArray();
      int i129 = arrayOfChar33.length;
      i130 = 0;
      if (i129 > i130)
        break label5069;
      arrayOfString[32] = new String(arrayOfChar33).intern();
      arrayOfChar34 = "\013\n(#\035\013\0216>\037\003��4x\017��\00442S\007\00622\bE\0262%\031\t\bf".toCharArray();
      int i133 = arrayOfChar34.length;
      i134 = 0;
      if (i133 > i134)
        break label5161;
      arrayOfString[33] = new String(arrayOfChar34).intern();
      arrayOfChar35 = "\013\n(#\035\013\0216>\037\003��4x\b\021\025#x\022\035\t*w".toCharArray();
      int i137 = arrayOfChar35.length;
      i138 = 0;
      if (i137 > i138)
        break label5253;
      arrayOfString[34] = new String(arrayOfChar35).intern();
      arrayOfChar36 = "\r\b'>\0207\r/$\b\007\027?".toCharArray();
      int i141 = arrayOfChar36.length;
      i142 = 0;
      if (i141 > i142)
        break label5345;
      arrayOfString[35] = new String(arrayOfChar36).intern();
      arrayOfChar37 = "\017\f\"".toCharArray();
      int i145 = arrayOfChar37.length;
      i146 = 0;
      if (i145 > i146)
        break label5437;
      arrayOfString[36] = new String(arrayOfChar37).intern();
      arrayOfChar38 = "\001\0136\"\b7\b##\024\007\001".toCharArray();
      int i149 = arrayOfChar38.length;
      i150 = 0;
      if (i149 > i150)
        break label5529;
      arrayOfString[37] = new String(arrayOfChar38).intern();
      arrayOfChar39 = "+\n3;\030H\013)#\\\030\0044$\031H\023\0056\016\fE >\020\r_f".toCharArray();
      int i153 = arrayOfChar39.length;
      i154 = 0;
      if (i153 > i154)
        break label5621;
      arrayOfString[38] = new String(arrayOfChar39).intern();
      arrayOfChar40 = "\013\027#6\b\r:!%\023\035\025".toCharArray();
      int i157 = arrayOfChar40.length;
      i158 = 0;
      if (i157 > i158)
        break label5713;
      arrayOfString[39] = new String(arrayOfChar40).intern();
      arrayOfChar41 = "\013\n(#\035\013\0216>\037\003��4x\017��\00442#\035\027/$S\006\020*;\\".toCharArray();
      int i161 = arrayOfChar41.length;
      i162 = 0;
      if (i161 > i162)
        break label5805;
      arrayOfString[40] = new String(arrayOfChar41).intern();
      arrayOfChar42 = "\016\n4 \035\032\001".toCharArray();
      int i165 = arrayOfChar42.length;
      i166 = 0;
      if (i165 > i166)
        break label5897;
      arrayOfString[41] = new String(arrayOfChar42).intern();
      arrayOfChar43 = "\n\t)4\0277\006)9\b\t\0062".toCharArray();
      int i169 = arrayOfChar43.length;
      i170 = 0;
      if (i169 > i170)
        break label5989;
      arrayOfString[42] = new String(arrayOfChar43).intern();
      arrayOfChar44 = "\013\n(#\035\013\0216>\037\003��4x\017��\00442S\033\02142\035\005J".toCharArray();
      int i173 = arrayOfChar44.length;
      i174 = 0;
      if (i173 > i174)
        break label6081;
      arrayOfString[43] = new String(arrayOfChar44).intern();
      arrayOfChar45 = "\007\00622\bE\0262%\031\t\b".toCharArray();
      int i177 = arrayOfChar45.length;
      i178 = 0;
      if (i177 > i178)
        break label6173;
      arrayOfString[44] = new String(arrayOfChar45).intern();
      arrayOfChar46 = "\013\n(#\035\013\0216>\037\003��4x\017��\00442S\035\027/w".toCharArray();
      int i181 = arrayOfChar46.length;
      i182 = 0;
      if (i181 > i182)
        break label6265;
      arrayOfString[45] = new String(arrayOfChar46).intern();
      arrayOfChar47 = "\016\f*2".toCharArray();
      int i185 = arrayOfChar47.length;
      i186 = 0;
      if (i185 > i186)
        break label6357;
      arrayOfString[46] = new String(arrayOfChar47).intern();
      arrayOfChar48 = "\t\013\"%\023\001\001h>\022\034��(#R\r\0352%\035F1\003\017(".toCharArray();
      int i189 = arrayOfChar48.length;
      i190 = 0;
      if (i189 > i190)
        break label6449;
      arrayOfString[47] = new String(arrayOfChar48).intern();
      arrayOfChar49 = "HHf".toCharArray();
      int i193 = arrayOfChar49.length;
      i194 = 0;
      if (i193 > i194)
        break label6541;
      arrayOfString[48] = new String(arrayOfChar49).intern();
      arrayOfChar50 = "\t\013\"%\023\001\001h>\022\034��(#R\r\0352%\035F6\023\0256-&\022".toCharArray();
      int i197 = arrayOfChar50.length;
      i198 = 0;
      if (i197 > i198)
        break label6633;
      arrayOfString[49] = new String(arrayOfChar50).intern();
      arrayOfChar51 = "\013\n(#\035\013\0216>\037\003��4x\017��\00442S\035\027/$\\".toCharArray();
      int i201 = arrayOfChar51.length;
      i202 = 0;
      if (i201 > i202)
        break label6725;
      arrayOfString[50] = new String(arrayOfChar51).intern();
      arrayOfChar52 = "\n\t)4\027\r\001\031;\025\033\021".toCharArray();
      int i205 = arrayOfChar52.length;
      i206 = 0;
      if (i206 > -1)
        break label6817;
      arrayOfString[51] = new String(arrayOfChar52).intern();
      arrayOfChar53 = "\013\n(#\035\013\021\031'\025\013\016#%S\033\r'%\031G\0262%\031\t\bi1\030U\0133;\020".toCharArray();
      i209 = 2.length;
      i210 = 0;
      String tmp2023_2020 = new java/lang/String;
      arrayOfChar53.<init>(2);
      52[tmp2023_2020] = tmp2023_2020.intern();
      arrayOfChar54 = "\036\006'%\030R".toCharArray();
      i213 = 1L.length;
      i214 = 0;
      String tmp2075_2072 = new java/lang/String;
      arrayOfChar54.<init>(1L);
      53[tmp2075_2072] = tmp2075_2072.intern();
      T = arrayOfString;
      h = new zq("");
      i = new zq("");
      j = new zq("");
      D = false;
      return;
      i3 = arrayOfChar1[i2];
      switch (i2 % 5)
      {
      default:
        i4 = 124;
        arrayOfChar1[i2] = (char)(i4 ^ i3);
        tmpTernaryOp = (???++);
        break;
      case 0:
        i4 = 104;
        tmpTernaryOp = arrayOfString;
        while (true);
      case 1:
        i4 = 101;
        tmpTernaryOp = 0.0F;
        while (true);
      case 2:
        i4 = 70;
        tmpTernaryOp = i213;
        while (true);
      case 3:
        i4 = 87;
        i7 = arrayOfChar2[i6];
        switch (i6 % 5)
        {
        default:
          i8 = 124;
          arrayOfChar2[i6] = (char)(i8 ^ i7);
          tmpTernaryOp = (???++);
          break;
        case 0:
          i8 = 104;
          tmpTernaryOp = 0.0F;
          while (true);
        case 1:
          i8 = 101;
          tmpTernaryOp = arrayOfChar54;
          while (true);
        case 2:
          i8 = 70;
          tmpTernaryOp = 1L;
          while (true);
        case 3:
          i8 = 87;
          i11 = arrayOfChar3[i10];
          switch (i10 % 5)
          {
          default:
            i12 = 124;
            arrayOfChar3[i10] = (char)(i12 ^ i11);
            tmpTernaryOp = (???++);
            break;
          case 0:
            i12 = 104;
            tmpTernaryOp = 3;
            while (true);
          case 1:
            i12 = 101;
            tmpTernaryOp = i209;
            while (true);
          case 2:
            i12 = 70;
            tmpTernaryOp = 4;
            while (true);
          case 3:
            i12 = 87;
            i15 = arrayOfChar4[i14];
            switch (i14 % 5)
            {
            default:
              i16 = 124;
              arrayOfChar4[i14] = (char)(i16 ^ i15);
              tmpTernaryOp = (???++);
              break;
            case 0:
              i16 = 104;
              tmpTernaryOp = arrayOfChar53;
              while (true);
            case 1:
              i16 = 101;
              tmpTernaryOp = 2;
              while (true);
            case 2:
              i16 = 70;
              tmpTernaryOp = null;
              while (true);
            case 3:
              i16 = 87;
              i19 = arrayOfChar5[i18];
              switch (i18 % 5)
              {
              default:
                i20 = 124;
                arrayOfChar5[i18] = (char)(i20 ^ i19);
                tmpTernaryOp = (???++);
              case 0:
              case 1:
              case 2:
              case 3:
              }
              break;
            }
            break;
          }
          break;
        }
        break;
      }
    }
    i20 = 104;
    tmpTernaryOp = -1;
    while (true);
    i20 = 101;
    tmpTernaryOp = null;
    char[] arrayOfChar53;
    int i210;
    char[] arrayOfChar54;
    int i214;
    while (true)
    {
      int i209;
      int i213;
      int i3;
      int i4;
      int i7;
      int i8;
      int i11;
      int i12;
      int i15;
      int i16;
      int i19;
      continue;
      int i20 = 70;
      continue;
      i20 = 87;
    }
    label2585: int i23 = arrayOfChar6[i22];
    int i24;
    switch (i22 % 5)
    {
    default:
      i24 = 124;
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
      i24 = 104;
      continue;
      i24 = 101;
      continue;
      i24 = 70;
      continue;
      i24 = 87;
    }
    label2677: int i27 = arrayOfChar7[i26];
    int i28;
    switch (i26 % 5)
    {
    default:
      i28 = 124;
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
      i28 = 104;
      continue;
      i28 = 101;
      continue;
      i28 = 70;
      continue;
      i28 = 87;
    }
    label2769: int i31 = arrayOfChar8[i30];
    int i32;
    switch (i30 % 5)
    {
    default:
      i32 = 124;
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
      i32 = 104;
      continue;
      i32 = 101;
      continue;
      i32 = 70;
      continue;
      i32 = 87;
    }
    label2861: int i35 = arrayOfChar9[i34];
    int i36;
    switch (i34 % 5)
    {
    default:
      i36 = 124;
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
      i36 = 104;
      continue;
      i36 = 101;
      continue;
      i36 = 70;
      continue;
      i36 = 87;
    }
    label2953: int i39 = arrayOfChar10[i38];
    int i40;
    switch (i38 % 5)
    {
    default:
      i40 = 124;
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
      i40 = 104;
      continue;
      i40 = 101;
      continue;
      i40 = 70;
      continue;
      i40 = 87;
    }
    label3045: int i43 = arrayOfChar11[i42];
    int i44;
    switch (i42 % 5)
    {
    default:
      i44 = 124;
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
      i44 = 104;
      continue;
      i44 = 101;
      continue;
      i44 = 70;
      continue;
      i44 = 87;
    }
    label3137: int i47 = arrayOfChar12[i46];
    int i48;
    switch (i46 % 5)
    {
    default:
      i48 = 124;
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
      i48 = 104;
      continue;
      i48 = 101;
      continue;
      i48 = 70;
      continue;
      i48 = 87;
    }
    label3229: int i51 = arrayOfChar13[i50];
    int i52;
    switch (i50 % 5)
    {
    default:
      i52 = 124;
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
      i52 = 104;
      continue;
      i52 = 101;
      continue;
      i52 = 70;
      continue;
      i52 = 87;
    }
    label3321: int i55 = arrayOfChar14[i54];
    int i56;
    switch (i54 % 5)
    {
    default:
      i56 = 124;
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
      i56 = 104;
      continue;
      i56 = 101;
      continue;
      i56 = 70;
      continue;
      i56 = 87;
    }
    label3413: int i59 = arrayOfChar15[i58];
    int i60;
    switch (i58 % 5)
    {
    default:
      i60 = 124;
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
      i60 = 104;
      continue;
      i60 = 101;
      continue;
      i60 = 70;
      continue;
      i60 = 87;
    }
    label3505: int i63 = arrayOfChar16[i62];
    int i64;
    switch (i62 % 5)
    {
    default:
      i64 = 124;
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
      i64 = 104;
      continue;
      i64 = 101;
      continue;
      i64 = 70;
      continue;
      i64 = 87;
    }
    label3597: int i67 = arrayOfChar17[i66];
    int i68;
    switch (i66 % 5)
    {
    default:
      i68 = 124;
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
      i68 = 104;
      continue;
      i68 = 101;
      continue;
      i68 = 70;
      continue;
      i68 = 87;
    }
    label3689: int i71 = arrayOfChar18[i70];
    int i72;
    switch (i70 % 5)
    {
    default:
      i72 = 124;
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
      i72 = 104;
      continue;
      i72 = 101;
      continue;
      i72 = 70;
      continue;
      i72 = 87;
    }
    label3781: int i75 = arrayOfChar19[i74];
    int i76;
    switch (i74 % 5)
    {
    default:
      i76 = 124;
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
      i76 = 104;
      continue;
      i76 = 101;
      continue;
      i76 = 70;
      continue;
      i76 = 87;
    }
    label3873: int i79 = arrayOfChar20[i78];
    int i80;
    switch (i78 % 5)
    {
    default:
      i80 = 124;
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
      i80 = 104;
      continue;
      i80 = 101;
      continue;
      i80 = 70;
      continue;
      i80 = 87;
    }
    label3965: int i83 = arrayOfChar21[i82];
    int i84;
    switch (i82 % 5)
    {
    default:
      i84 = 124;
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
      i84 = 104;
      continue;
      i84 = 101;
      continue;
      i84 = 70;
      continue;
      i84 = 87;
    }
    label4057: int i87 = arrayOfChar22[i86];
    int i88;
    switch (i86 % 5)
    {
    default:
      i88 = 124;
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
      i88 = 104;
      continue;
      i88 = 101;
      continue;
      i88 = 70;
      continue;
      i88 = 87;
    }
    label4149: int i91 = arrayOfChar23[i90];
    int i92;
    switch (i90 % 5)
    {
    default:
      i92 = 124;
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
      i92 = 104;
      continue;
      i92 = 101;
      continue;
      i92 = 70;
      continue;
      i92 = 87;
    }
    label4241: int i95 = arrayOfChar24[i94];
    int i96;
    switch (i94 % 5)
    {
    default:
      i96 = 124;
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
      i96 = 104;
      continue;
      i96 = 101;
      continue;
      i96 = 70;
      continue;
      i96 = 87;
    }
    label4333: int i99 = arrayOfChar25[i98];
    int i100;
    switch (i98 % 5)
    {
    default:
      i100 = 124;
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
      i100 = 104;
      continue;
      i100 = 101;
      continue;
      i100 = 70;
      continue;
      i100 = 87;
    }
    label4425: int i103 = arrayOfChar26[i102];
    int i104;
    switch (i102 % 5)
    {
    default:
      i104 = 124;
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
      i104 = 104;
      continue;
      i104 = 101;
      continue;
      i104 = 70;
      continue;
      i104 = 87;
    }
    label4517: int i107 = arrayOfChar27[i106];
    int i108;
    switch (i106 % 5)
    {
    default:
      i108 = 124;
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
      i108 = 104;
      continue;
      i108 = 101;
      continue;
      i108 = 70;
      continue;
      i108 = 87;
    }
    label4609: int i111 = arrayOfChar28[i110];
    int i112;
    switch (i110 % 5)
    {
    default:
      i112 = 124;
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
      i112 = 104;
      continue;
      i112 = 101;
      continue;
      i112 = 70;
      continue;
      i112 = 87;
    }
    label4701: int i115 = arrayOfChar29[i114];
    int i116;
    switch (i114 % 5)
    {
    default:
      i116 = 124;
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
      i116 = 104;
      continue;
      i116 = 101;
      continue;
      i116 = 70;
      continue;
      i116 = 87;
    }
    label4793: int i119 = arrayOfChar30[i118];
    int i120;
    switch (i118 % 5)
    {
    default:
      i120 = 124;
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
      i120 = 104;
      continue;
      i120 = 101;
      continue;
      i120 = 70;
      continue;
      i120 = 87;
    }
    label4885: int i123 = arrayOfChar31[i122];
    int i124;
    switch (i122 % 5)
    {
    default:
      i124 = 124;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar31[i122] = (char)(i124 ^ i123);
      i122++;
      break;
      i124 = 104;
      continue;
      i124 = 101;
      continue;
      i124 = 70;
      continue;
      i124 = 87;
    }
    label4977: int i127 = arrayOfChar32[i126];
    int i128;
    switch (i126 % 5)
    {
    default:
      i128 = 124;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar32[i126] = (char)(i128 ^ i127);
      i126++;
      break;
      i128 = 104;
      continue;
      i128 = 101;
      continue;
      i128 = 70;
      continue;
      i128 = 87;
    }
    label5069: int i131 = arrayOfChar33[i130];
    int i132;
    switch (i130 % 5)
    {
    default:
      i132 = 124;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar33[i130] = (char)(i132 ^ i131);
      i130++;
      break;
      i132 = 104;
      continue;
      i132 = 101;
      continue;
      i132 = 70;
      continue;
      i132 = 87;
    }
    label5161: int i135 = arrayOfChar34[i134];
    int i136;
    switch (i134 % 5)
    {
    default:
      i136 = 124;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar34[i134] = (char)(i136 ^ i135);
      i134++;
      break;
      i136 = 104;
      continue;
      i136 = 101;
      continue;
      i136 = 70;
      continue;
      i136 = 87;
    }
    label5253: int i139 = arrayOfChar35[i138];
    int i140;
    switch (i138 % 5)
    {
    default:
      i140 = 124;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar35[i138] = (char)(i140 ^ i139);
      i138++;
      break;
      i140 = 104;
      continue;
      i140 = 101;
      continue;
      i140 = 70;
      continue;
      i140 = 87;
    }
    label5345: int i143 = arrayOfChar36[i142];
    int i144;
    switch (i142 % 5)
    {
    default:
      i144 = 124;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar36[i142] = (char)(i144 ^ i143);
      i142++;
      break;
      i144 = 104;
      continue;
      i144 = 101;
      continue;
      i144 = 70;
      continue;
      i144 = 87;
    }
    label5437: int i147 = arrayOfChar37[i146];
    int i148;
    switch (i146 % 5)
    {
    default:
      i148 = 124;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar37[i146] = (char)(i148 ^ i147);
      i146++;
      break;
      i148 = 104;
      continue;
      i148 = 101;
      continue;
      i148 = 70;
      continue;
      i148 = 87;
    }
    label5529: int i151 = arrayOfChar38[i150];
    int i152;
    switch (i150 % 5)
    {
    default:
      i152 = 124;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar38[i150] = (char)(i152 ^ i151);
      i150++;
      break;
      i152 = 104;
      continue;
      i152 = 101;
      continue;
      i152 = 70;
      continue;
      i152 = 87;
    }
    label5621: int i155 = arrayOfChar39[i154];
    int i156;
    switch (i154 % 5)
    {
    default:
      i156 = 124;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar39[i154] = (char)(i156 ^ i155);
      i154++;
      break;
      i156 = 104;
      continue;
      i156 = 101;
      continue;
      i156 = 70;
      continue;
      i156 = 87;
    }
    label5713: int i159 = arrayOfChar40[i158];
    int i160;
    switch (i158 % 5)
    {
    default:
      i160 = 124;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar40[i158] = (char)(i160 ^ i159);
      i158++;
      break;
      i160 = 104;
      continue;
      i160 = 101;
      continue;
      i160 = 70;
      continue;
      i160 = 87;
    }
    label5805: int i163 = arrayOfChar41[i162];
    int i164;
    switch (i162 % 5)
    {
    default:
      i164 = 124;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar41[i162] = (char)(i164 ^ i163);
      i162++;
      break;
      i164 = 104;
      continue;
      i164 = 101;
      continue;
      i164 = 70;
      continue;
      i164 = 87;
    }
    label5897: int i167 = arrayOfChar42[i166];
    int i168;
    switch (i166 % 5)
    {
    default:
      i168 = 124;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar42[i166] = (char)(i168 ^ i167);
      i166++;
      break;
      i168 = 104;
      continue;
      i168 = 101;
      continue;
      i168 = 70;
      continue;
      i168 = 87;
    }
    label5989: int i171 = arrayOfChar43[i170];
    int i172;
    switch (i170 % 5)
    {
    default:
      i172 = 124;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar43[i170] = (char)(i172 ^ i171);
      i170++;
      break;
      i172 = 104;
      continue;
      i172 = 101;
      continue;
      i172 = 70;
      continue;
      i172 = 87;
    }
    label6081: int i175 = arrayOfChar44[i174];
    int i176;
    switch (i174 % 5)
    {
    default:
      i176 = 124;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar44[i174] = (char)(i176 ^ i175);
      i174++;
      break;
      i176 = 104;
      continue;
      i176 = 101;
      continue;
      i176 = 70;
      continue;
      i176 = 87;
    }
    label6173: int i179 = arrayOfChar45[i178];
    int i180;
    switch (i178 % 5)
    {
    default:
      i180 = 124;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar45[i178] = (char)(i180 ^ i179);
      i178++;
      break;
      i180 = 104;
      continue;
      i180 = 101;
      continue;
      i180 = 70;
      continue;
      i180 = 87;
    }
    label6265: int i183 = arrayOfChar46[i182];
    int i184;
    switch (i182 % 5)
    {
    default:
      i184 = 124;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar46[i182] = (char)(i184 ^ i183);
      i182++;
      break;
      i184 = 104;
      continue;
      i184 = 101;
      continue;
      i184 = 70;
      continue;
      i184 = 87;
    }
    label6357: int i187 = arrayOfChar47[i186];
    int i188;
    switch (i186 % 5)
    {
    default:
      i188 = 124;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar47[i186] = (char)(i188 ^ i187);
      i186++;
      break;
      i188 = 104;
      continue;
      i188 = 101;
      continue;
      i188 = 70;
      continue;
      i188 = 87;
    }
    label6449: int i191 = arrayOfChar48[i190];
    int i192;
    switch (i190 % 5)
    {
    default:
      i192 = 124;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar48[i190] = (char)(i192 ^ i191);
      i190++;
      break;
      i192 = 104;
      continue;
      i192 = 101;
      continue;
      i192 = 70;
      continue;
      i192 = 87;
    }
    label6541: int i195 = arrayOfChar49[i194];
    int i196;
    switch (i194 % 5)
    {
    default:
      i196 = 124;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar49[i194] = (char)(i196 ^ i195);
      i194++;
      break;
      i196 = 104;
      continue;
      i196 = 101;
      continue;
      i196 = 70;
      continue;
      i196 = 87;
    }
    label6633: int i199 = arrayOfChar50[i198];
    int i200;
    switch (i198 % 5)
    {
    default:
      i200 = 124;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar50[i198] = (char)(i200 ^ i199);
      i198++;
      break;
      i200 = 104;
      continue;
      i200 = 101;
      continue;
      i200 = 70;
      continue;
      i200 = 87;
    }
    label6725: int i203 = arrayOfChar51[i202];
    int i204;
    switch (i202 % 5)
    {
    default:
      i204 = 124;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar51[i202] = (char)(i204 ^ i203);
      i202++;
      break;
      i204 = 104;
      continue;
      i204 = 101;
      continue;
      i204 = 70;
      continue;
      i204 = 87;
    }
    label6817: int i207 = i206[-1];
    switch (-1 % 5)
    {
    default:
      i208 = 124;
    case 0:
    case 1:
    case 2:
      while (true)
      {
        i208[1] = (char)(i207 ^ 0x0);
        i206++;
        tmpTernaryOp = -1;
        break;
        i208 = 104;
        tmpTernaryOp = 1;
        continue;
        i208 = 101;
        tmpTernaryOp = 1;
        continue;
        i208 = 70;
        tmpTernaryOp = 1;
      }
    case 3:
    }
    int i208 = 87;
    int i211 = i210[4];
    switch (4 % 5)
    {
    default:
      i212 = 124;
    case 0:
    case 1:
    case 2:
      while (true)
      {
        i212[0L] = (char)(i211 ^ 0x5);
        i210++;
        tmpTernaryOp = 4;
        break;
        i212 = 104;
        tmpTernaryOp = 0L;
        continue;
        i212 = 101;
        tmpTernaryOp = 0L;
        continue;
        i212 = 70;
        tmpTernaryOp = 0L;
      }
    case 3:
    }
    int i212 = 87;
    int i215 = i214[1.0F];
    int i216;
    switch (1.0F % 5)
    {
    default:
      i216 = 124;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      i216[0.0D] = (char)(i215 ^ 2.0F);
      i214++;
      tmpTernaryOp = 1.0F;
      break;
      i216 = 104;
      tmpTernaryOp = 0.0D;
      continue;
      i216 = 101;
      tmpTernaryOp = 0.0D;
      continue;
      i216 = 70;
      tmpTernaryOp = 0.0D;
      continue;
      i216 = 87;
      tmpTernaryOp = 0.0D;
    }
  }

  static int a(ContactPicker paramContactPicker, int paramInt)
  {
    paramContactPicker.E = paramInt;
    return paramInt;
  }

  private int a(String paramString)
  {
    boolean bool = DialogToastListActivity.f;
    this.x = -1;
    if (paramString.startsWith(T[8]))
    {
      this.x = 2;
      if (!bool);
    }
    else if (paramString.startsWith(T[7]))
    {
      this.x = 3;
      if (!bool);
    }
    else if (paramString.startsWith(T[6]))
    {
      this.x = 1;
      if (!bool);
    }
    else if (paramString.startsWith(T[10]))
    {
      this.x = 4;
      if (!bool);
    }
    else if (paramString.startsWith(T[5]))
    {
      this.x = 0;
    }
    g5.d(T[9] + this.x);
    return this.x;
  }

  static ImageButton a(ContactPicker paramContactPicker)
  {
    return paramContactPicker.L;
  }

  static void a(ContactPicker paramContactPicker, String paramString)
  {
    paramContactPicker.d(paramString);
  }

  private void a(boolean paramBoolean)
  {
    if (this.l.getVisibility() == 0);
    for (boolean bool = true; ; bool = false)
    {
      if (App.bb == null)
      {
        App.a(this, 2131296621, 1);
        if (!DialogToastListActivity.f);
      }
      else
      {
        this.l.setVisibility(0);
        new Thread(new lk(this, paramBoolean, bool)).start();
      }
      return;
    }
  }

  private boolean a(int paramInt)
  {
    boolean bool = false;
    if ((paramInt >= this.G.size()) || (paramInt < 0))
      g5.d(T[3] + paramInt);
    while (true)
    {
      return bool;
      if (h == this.G.get(paramInt))
        bool = true;
    }
  }

  static boolean a(ContactPicker paramContactPicker, zq paramzq)
  {
    return paramContactPicker.a(paramzq);
  }

  private boolean a(zq paramzq)
  {
    if (b(paramzq));
    while (true)
    {
      return true;
      if (!App.g(paramzq.b))
      {
        String str = paramzq.b;
        this.n = paramzq;
        if ((this.r) && (this.v))
        {
          showDialog(0);
        }
        else if (this.t)
        {
          g5.d(T[20]);
          setResult(-1, App.w.g(paramzq));
          finish();
        }
        else if (this.y != null)
        {
          this.C = new Intent(this, Conversation.class);
          this.C.putExtra(T[2], str);
          this.C.putExtra(T[23], this.x);
          this.C.putExtra(T[21], true);
          this.C.putParcelableArrayListExtra(T[19], this.y);
          this.C.addFlags(335544320);
          showDialog(1);
        }
        else if ((this.z != null) && (this.z.length() > 0))
        {
          this.C = new Intent(this, Conversation.class);
          this.C.putExtra(T[2], str);
          this.C.putExtra(T[23], this.x);
          this.C.putExtra(T[18], this.z);
          this.C.putExtra(T[21], true);
          this.C.addFlags(335544320);
          showDialog(1);
        }
        else if (this.A != null)
        {
          this.C = new Intent(this, Conversation.class);
          this.C.putExtra(T[2], str);
          this.C.putExtra(T[25], this.A);
          this.C.putExtra(T[24], this.B);
          this.C.putExtra(T[23], this.x);
          this.C.putExtra(T[21], true);
          this.C.addFlags(335544320);
          showDialog(1);
        }
        else if (this.u)
        {
          this.C = new Intent();
          this.C.putExtra(T[22], str);
          showDialog(2);
        }
        else
        {
          Intent localIntent = new Intent();
          localIntent.putExtra(T[22], str);
          setResult(-1, localIntent);
          finish();
        }
      }
    }
  }

  static EditText b(ContactPicker paramContactPicker)
  {
    return paramContactPicker.J;
  }

  private boolean b(int paramInt)
  {
    boolean bool = false;
    if ((paramInt >= this.G.size()) || (paramInt < 0))
      g5.d(T[4] + paramInt);
    while (true)
    {
      return bool;
      if (i == this.G.get(paramInt))
        bool = true;
    }
  }

  static boolean b(ContactPicker paramContactPicker, int paramInt)
  {
    return paramContactPicker.a(paramInt);
  }

  private static boolean b(zq paramzq)
  {
    return T[0].equals(paramzq.b);
  }

  static int c(ContactPicker paramContactPicker)
  {
    return paramContactPicker.E;
  }

  private boolean c(int paramInt)
  {
    boolean bool = false;
    if ((paramInt >= this.G.size()) || (paramInt < 0))
      g5.d(T[14] + paramInt);
    while (true)
    {
      return bool;
      if (j == this.G.get(paramInt))
        bool = true;
    }
  }

  static boolean c(ContactPicker paramContactPicker, int paramInt)
  {
    return paramContactPicker.b(paramInt);
  }

  static boolean c(zq paramzq)
  {
    return b(paramzq);
  }

  static ImageButton d(ContactPicker paramContactPicker)
  {
    return paramContactPicker.N;
  }

  private void d(String paramString)
  {
    boolean bool = DialogToastListActivity.f;
    while (true)
    {
      synchronized (this.G)
      {
        this.G.clear();
        if ((this.r) || (this.q))
        {
          Iterator localIterator1 = this.F.iterator();
          if (!localIterator1.hasNext())
            break label495;
          zq localzq4 = (zq)localIterator1.next();
          if ((localzq4.g != null) && (!localzq4.o()) && ((paramString == null) || (localzq4.b().toLowerCase().contains(paramString.toLowerCase()))) && (!this.o.containsKey(localzq4.b)))
            this.G.add(localzq4);
        }
        else
        {
          if (this.p)
          {
            Iterator localIterator3 = this.F.iterator();
            if (!localIterator3.hasNext())
              break label506;
            zq localzq3 = (zq)localIterator3.next();
            if ((!App.z.i(localzq3.b)) || ((paramString != null) && (!localzq3.b().toLowerCase().contains(paramString.toLowerCase()))))
              break label502;
            this.G.add(localzq3);
            break label502;
          }
          Iterator localIterator2 = this.F.iterator();
          zq localzq2;
          if (localIterator2.hasNext())
            localzq2 = (zq)localIterator2.next();
          switch (this.E)
          {
          case 2:
            if (this.E == 2)
            {
              Collections.sort(this.G, new uu());
              if (!bool);
            }
            else
            {
              Collections.sort(this.G, new ej());
            }
            if (this.G.size() == 0)
            {
              zq localzq1 = new zq(T[0]);
              this.G.add(localzq1);
            }
            return;
            if ((paramString != null) && (!localzq2.b().toLowerCase().contains(paramString.toLowerCase())))
              break;
            this.G.add(localzq2);
          case 0:
            if ((!bool) || (localzq2.g == null) || ((paramString != null) && (!localzq2.b().toLowerCase().contains(paramString.toLowerCase()))))
              break;
            this.G.add(localzq2);
          case 1:
            if ((!bool) || (!localzq2.o()) || (localzq2.h == null) || ((paramString != null) && (!localzq2.b().toLowerCase().contains(paramString.toLowerCase()))))
              break;
            this.G.add(localzq2);
          }
        }
      }
      if (bool)
        label495: if (bool)
        {
          continue;
          label502: if (bool)
            label506: if (bool)
            {
              continue;
              if (!bool);
            }
        }
    }
  }

  static boolean d(ContactPicker paramContactPicker, int paramInt)
  {
    return paramContactPicker.c(paramInt);
  }

  static ImageButton e(ContactPicker paramContactPicker)
  {
    return paramContactPicker.O;
  }

  static ImageButton f(ContactPicker paramContactPicker)
  {
    return paramContactPicker.M;
  }

  private void f()
  {
    synchronized (this.F)
    {
      this.F.clear();
      App.w.c(this.F);
      g();
      return;
    }
  }

  static TextView g(ContactPicker paramContactPicker)
  {
    return paramContactPicker.K;
  }

  private void g()
  {
    boolean bool = DialogToastListActivity.f;
    if (this.G != null)
      this.G.clear();
    View localView = findViewById(2131558535);
    zq localzq2;
    if ((this.r) || (this.q))
    {
      Iterator localIterator1 = this.F.iterator();
      do
      {
        if (!localIterator1.hasNext())
          break;
        zq localzq4 = (zq)localIterator1.next();
        if ((!this.o.containsKey(localzq4.b)) && (!localzq4.o()) && (localzq4.g != null))
          this.G.add(localzq4);
      }
      while (!bool);
      Collections.sort(this.G, new ej());
      this.E = 0;
      localView.setVisibility(8);
      if (!bool);
    }
    else if (this.p)
    {
      Iterator localIterator4 = this.F.iterator();
      do
      {
        if (!localIterator4.hasNext())
          break;
        zq localzq3 = (zq)localIterator4.next();
        if (App.z.i(localzq3.b))
          this.G.add(localzq3);
      }
      while (!bool);
      Collections.sort(this.G, new uu());
      this.E = 2;
      localView.setVisibility(8);
      if (!bool);
    }
    else if ((this.t) || (this.u) || (this.s))
    {
      Iterator localIterator2 = this.F.iterator();
      do
      {
        if (!localIterator2.hasNext())
          break;
        localzq2 = (zq)localIterator2.next();
        switch (this.E)
        {
        default:
        case 0:
        case 1:
        case 2:
        }
      }
      while (!bool);
      if (this.G.size() == 0)
        this.G.add(j);
      switch (this.E)
      {
      default:
      case 0:
      case 1:
      case 2:
      }
    }
    while (true)
    {
      localView.setVisibility(0);
      if (bool)
      {
        this.E = 0;
        localView.setVisibility(8);
        Iterator localIterator3 = this.F.iterator();
        do
        {
          if (!localIterator3.hasNext())
            break;
          zq localzq1 = (zq)localIterator3.next();
          if ((!localzq1.o()) && (localzq1.g != null))
            this.G.add(localzq1);
        }
        while (!bool);
        if (this.G.size() == 0)
          this.G.add(j);
        Collections.sort(this.G, new ej());
        if (!this.P)
        {
          this.G.add(h);
          this.G.add(i);
        }
      }
      if (h())
      {
        findViewById(2131558533).setVisibility(0);
        findViewById(2131558461).setVisibility(0);
        if (!bool);
      }
      else
      {
        findViewById(2131558533).setVisibility(8);
        findViewById(2131558461).setVisibility(8);
      }
      return;
      if (localzq2.g == null)
        break;
      this.G.add(localzq2);
      if ((!bool) || (!localzq2.o()) || (localzq2.p()) || (localzq2.h == null))
        break;
      this.G.add(localzq2);
      if (!bool)
        break;
      if (localzq2.o())
      {
        if ((localzq2.p()) || (localzq2.h == null))
          break;
        this.G.add(localzq2);
        if (!bool)
          break;
      }
      if (!App.z.i(localzq2.b))
        break;
      this.G.add(localzq2);
      break;
      Collections.sort(this.G, new ej());
      if (bool)
      {
        Collections.sort(this.G, new ej());
        if (bool)
          Collections.sort(this.G, new uu());
      }
    }
  }

  static ListView h(ContactPicker paramContactPicker)
  {
    return paramContactPicker.H;
  }

  private boolean h()
  {
    boolean bool = true;
    if (this.G == null);
    while (true)
    {
      return bool;
      if ((this.G.size() > 0) && (this.G.get(0) == j))
        bool = false;
      else if (((this.q) || (this.r) || (this.t) || (this.p)) && (this.G.size() == 0))
        bool = false;
    }
  }

  static fe i(ContactPicker paramContactPicker)
  {
    return paramContactPicker.m;
  }

  private void i()
  {
    startActivity(new Intent(this, ContactPickerHelp.class));
  }

  private void j()
  {
    boolean bool = DialogToastListActivity.f;
    ArrayList localArrayList1 = gp.a;
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator1 = localArrayList1.iterator();
    do
    {
      if (!localIterator1.hasNext())
        break;
      String str3 = (String)localIterator1.next();
      zq localzq2 = App.w.a(str3, null);
      if ((localzq2 != null) && (localzq2.g == null) && (str3.endsWith(T[27])))
        localArrayList2.add(localzq2.b);
    }
    while (!bool);
    Iterator localIterator2 = localArrayList2.iterator();
    do
    {
      if (!localIterator2.hasNext())
        break;
      String str2 = (String)localIterator2.next();
      App.w.b(str2);
    }
    while (!bool);
    if (localArrayList2.size() > 0)
    {
      String str1 = (String)localArrayList2.get(0);
      ArrayList localArrayList3 = App.w.h();
      Iterator localIterator3 = localArrayList3.iterator();
      zq localzq1;
      do
      {
        if (!localIterator3.hasNext())
          break;
        localzq1 = (zq)localIterator3.next();
      }
      while (((localzq1.b != null) && (localzq1.b.startsWith(str1))) && (!bool));
      localArrayList3.clear();
    }
  }

  static boolean j(ContactPicker paramContactPicker)
  {
    return paramContactPicker.P;
  }

  static void k(ContactPicker paramContactPicker)
  {
    paramContactPicker.g();
  }

  static void l(ContactPicker paramContactPicker)
  {
    paramContactPicker.i();
  }

  static pj m(ContactPicker paramContactPicker)
  {
    return paramContactPicker.Q;
  }

  static void n(ContactPicker paramContactPicker)
  {
    paramContactPicker.j();
  }

  static ProgressBar o(ContactPicker paramContactPicker)
  {
    return paramContactPicker.l;
  }

  static void p(ContactPicker paramContactPicker)
  {
    paramContactPicker.f();
  }

  static Handler q(ContactPicker paramContactPicker)
  {
    return paramContactPicker.k;
  }

  static zq r(ContactPicker paramContactPicker)
  {
    return paramContactPicker.n;
  }

  static Intent s(ContactPicker paramContactPicker)
  {
    return paramContactPicker.C;
  }

  public void a()
  {
    f();
    this.m.notifyDataSetChanged();
  }

  public void a(j2 paramj2)
  {
    if (paramj2.j)
    {
      this.m.notifyDataSetChanged();
      if (!DialogToastListActivity.f);
    }
    else
    {
      showDialog(108);
    }
  }

  public void a(String paramString)
  {
    zq localzq = App.w.a(paramString, null);
    if (localzq != null)
    {
      vq localvq = new vq(localzq);
      if (zq.a(this.F, localvq))
        this.m.notifyDataSetChanged();
    }
  }

  public void b(String paramString)
  {
  }

  protected void c()
  {
    eu.h = true;
    eu.j = true;
  }

  // ERROR //
  protected void d()
  {
    // Byte code:
    //   0: getstatic 257	com/whatsapp/DialogToastListActivity:f	Z
    //   3: istore_1
    //   4: aload_0
    //   5: invokevirtual 586	com/whatsapp/ContactPicker:getIntent	()Landroid/content/Intent;
    //   8: astore_2
    //   9: aload_2
    //   10: invokevirtual 589	android/content/Intent:getAction	()Ljava/lang/String;
    //   13: ifnull +33 -> 46
    //   16: aload_2
    //   17: invokevirtual 589	android/content/Intent:getAction	()Ljava/lang/String;
    //   20: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   23: bipush 32
    //   25: aaload
    //   26: invokevirtual 412	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   29: ifeq +17 -> 46
    //   32: aload_0
    //   33: iconst_1
    //   34: putfield 353	com/whatsapp/ContactPicker:t	Z
    //   37: aload_0
    //   38: iconst_2
    //   39: putfield 230	com/whatsapp/ContactPicker:E	I
    //   42: iload_1
    //   43: ifeq +1841 -> 1884
    //   46: aload_2
    //   47: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   50: bipush 41
    //   52: aaload
    //   53: iconst_0
    //   54: invokevirtual 593	android/content/Intent:getBooleanExtra	(Ljava/lang/String;Z)Z
    //   57: ifeq +33 -> 90
    //   60: aload_0
    //   61: iconst_1
    //   62: putfield 401	com/whatsapp/ContactPicker:u	Z
    //   65: aload_0
    //   66: ldc_w 594
    //   69: invokevirtual 500	com/whatsapp/ContactPicker:findViewById	(I)Landroid/view/View;
    //   72: checkcast 596	android/widget/TextView
    //   75: ldc_w 597
    //   78: invokevirtual 600	android/widget/TextView:setText	(I)V
    //   81: aload_0
    //   82: iconst_2
    //   83: putfield 230	com/whatsapp/ContactPicker:E	I
    //   86: iload_1
    //   87: ifeq +1797 -> 1884
    //   90: aload_2
    //   91: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   94: bipush 39
    //   96: aaload
    //   97: iconst_0
    //   98: invokevirtual 593	android/content/Intent:getBooleanExtra	(Ljava/lang/String;Z)Z
    //   101: ifeq +102 -> 203
    //   104: aload_0
    //   105: iconst_1
    //   106: putfield 346	com/whatsapp/ContactPicker:r	Z
    //   109: aload_0
    //   110: iconst_0
    //   111: putfield 348	com/whatsapp/ContactPicker:v	Z
    //   114: aload_2
    //   115: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   118: bipush 28
    //   120: aaload
    //   121: invokevirtual 604	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   124: astore 50
    //   126: aload 50
    //   128: ifnull +71 -> 199
    //   131: aload 50
    //   133: invokevirtual 399	java/lang/String:length	()I
    //   136: iconst_1
    //   137: if_icmple +62 -> 199
    //   140: aload 50
    //   142: ldc_w 606
    //   145: invokevirtual 610	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   148: astore 51
    //   150: aload 51
    //   152: arraylength
    //   153: istore 52
    //   155: iconst_0
    //   156: istore 53
    //   158: iload 53
    //   160: iload 52
    //   162: if_icmpge +37 -> 199
    //   165: aload 51
    //   167: iload 53
    //   169: aaload
    //   170: astore 54
    //   172: aload 54
    //   174: invokevirtual 399	java/lang/String:length	()I
    //   177: ifle +15 -> 192
    //   180: aload_0
    //   181: getfield 220	com/whatsapp/ContactPicker:o	Ljava/util/HashMap;
    //   184: aload 54
    //   186: aload 54
    //   188: invokevirtual 614	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   191: pop
    //   192: iinc 53 1
    //   195: iload_1
    //   196: ifeq -38 -> 158
    //   199: iload_1
    //   200: ifeq +1684 -> 1884
    //   203: aload_2
    //   204: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   207: bipush 36
    //   209: aaload
    //   210: invokevirtual 604	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   213: astore_3
    //   214: aload_0
    //   215: aload_3
    //   216: putfield 616	com/whatsapp/ContactPicker:w	Ljava/lang/String;
    //   219: aload_3
    //   220: ifnull +28 -> 248
    //   223: aload_0
    //   224: iconst_1
    //   225: putfield 346	com/whatsapp/ContactPicker:r	Z
    //   228: aload_0
    //   229: iconst_1
    //   230: putfield 348	com/whatsapp/ContactPicker:v	Z
    //   233: aload_0
    //   234: aload_0
    //   235: getfield 616	com/whatsapp/ContactPicker:w	Ljava/lang/String;
    //   238: invokestatic 619	com/whatsapp/eu:i	(Ljava/lang/String;)Ljava/util/HashMap;
    //   241: putfield 220	com/whatsapp/ContactPicker:o	Ljava/util/HashMap;
    //   244: iload_1
    //   245: ifeq +1639 -> 1884
    //   248: aload_2
    //   249: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   252: bipush 35
    //   254: aaload
    //   255: iconst_0
    //   256: invokevirtual 593	android/content/Intent:getBooleanExtra	(Ljava/lang/String;Z)Z
    //   259: ifeq +33 -> 292
    //   262: aload_0
    //   263: ldc_w 594
    //   266: invokevirtual 500	com/whatsapp/ContactPicker:findViewById	(I)Landroid/view/View;
    //   269: checkcast 596	android/widget/TextView
    //   272: ldc_w 620
    //   275: invokevirtual 600	android/widget/TextView:setText	(I)V
    //   278: aload_0
    //   279: iconst_1
    //   280: putfield 459	com/whatsapp/ContactPicker:p	Z
    //   283: aload_0
    //   284: iconst_2
    //   285: putfield 230	com/whatsapp/ContactPicker:E	I
    //   288: iload_1
    //   289: ifeq +1595 -> 1884
    //   292: aload_2
    //   293: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   296: bipush 42
    //   298: aaload
    //   299: iconst_0
    //   300: invokevirtual 593	android/content/Intent:getBooleanExtra	(Ljava/lang/String;Z)Z
    //   303: ifeq +97 -> 400
    //   306: aload_0
    //   307: iconst_1
    //   308: putfield 423	com/whatsapp/ContactPicker:q	Z
    //   311: aload_2
    //   312: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   315: bipush 51
    //   317: aaload
    //   318: invokevirtual 604	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   321: astore 44
    //   323: aload 44
    //   325: ifnull +71 -> 396
    //   328: aload 44
    //   330: invokevirtual 399	java/lang/String:length	()I
    //   333: iconst_1
    //   334: if_icmple +62 -> 396
    //   337: aload 44
    //   339: ldc_w 606
    //   342: invokevirtual 610	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   345: astore 45
    //   347: aload 45
    //   349: arraylength
    //   350: istore 46
    //   352: iconst_0
    //   353: istore 47
    //   355: iload 47
    //   357: iload 46
    //   359: if_icmpge +37 -> 396
    //   362: aload 45
    //   364: iload 47
    //   366: aaload
    //   367: astore 48
    //   369: aload 48
    //   371: invokevirtual 399	java/lang/String:length	()I
    //   374: ifle +15 -> 389
    //   377: aload_0
    //   378: getfield 220	com/whatsapp/ContactPicker:o	Ljava/util/HashMap;
    //   381: aload 48
    //   383: aload 48
    //   385: invokevirtual 614	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   388: pop
    //   389: iinc 47 1
    //   392: iload_1
    //   393: ifeq -38 -> 355
    //   396: iload_1
    //   397: ifeq +1487 -> 1884
    //   400: aload_2
    //   401: invokevirtual 624	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   404: ifnull +1480 -> 1884
    //   407: aload_0
    //   408: iconst_1
    //   409: putfield 505	com/whatsapp/ContactPicker:s	Z
    //   412: aload_0
    //   413: iconst_2
    //   414: putfield 230	com/whatsapp/ContactPicker:E	I
    //   417: aload_0
    //   418: invokevirtual 586	com/whatsapp/ContactPicker:getIntent	()Landroid/content/Intent;
    //   421: invokevirtual 627	android/content/Intent:getType	()Ljava/lang/String;
    //   424: ifnonnull +48 -> 472
    //   427: new 265	java/lang/StringBuilder
    //   430: dup
    //   431: invokespecial 266	java/lang/StringBuilder:<init>	()V
    //   434: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   437: bipush 34
    //   439: aaload
    //   440: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   443: aload_2
    //   444: invokevirtual 628	android/content/Intent:toString	()Ljava/lang/String;
    //   447: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   450: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   453: invokestatic 630	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   456: aload_0
    //   457: invokevirtual 634	com/whatsapp/ContactPicker:getBaseContext	()Landroid/content/Context;
    //   460: ldc_w 635
    //   463: iconst_0
    //   464: invokestatic 305	com/whatsapp/App:a	(Landroid/content/Context;II)V
    //   467: aload_0
    //   468: invokevirtual 368	com/whatsapp/ContactPicker:finish	()V
    //   471: return
    //   472: aload_0
    //   473: aload_0
    //   474: invokevirtual 586	com/whatsapp/ContactPicker:getIntent	()Landroid/content/Intent;
    //   477: invokevirtual 627	android/content/Intent:getType	()Ljava/lang/String;
    //   480: invokespecial 637	com/whatsapp/ContactPicker:a	(Ljava/lang/String;)I
    //   483: pop
    //   484: aload_0
    //   485: ldc_w 594
    //   488: invokevirtual 500	com/whatsapp/ContactPicker:findViewById	(I)Landroid/view/View;
    //   491: checkcast 596	android/widget/TextView
    //   494: ldc_w 597
    //   497: invokevirtual 600	android/widget/TextView:setText	(I)V
    //   500: aload_0
    //   501: getfield 259	com/whatsapp/ContactPicker:x	B
    //   504: ifne +147 -> 651
    //   507: aload_0
    //   508: invokevirtual 586	com/whatsapp/ContactPicker:getIntent	()Landroid/content/Intent;
    //   511: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   514: bipush 49
    //   516: aaload
    //   517: invokevirtual 604	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   520: astore 41
    //   522: aload 41
    //   524: ifnull +46 -> 570
    //   527: aload 41
    //   529: invokevirtual 399	java/lang/String:length	()I
    //   532: ifle +38 -> 570
    //   535: aload_0
    //   536: new 265	java/lang/StringBuilder
    //   539: dup
    //   540: invokespecial 266	java/lang/StringBuilder:<init>	()V
    //   543: aload_0
    //   544: getfield 224	com/whatsapp/ContactPicker:z	Ljava/lang/String;
    //   547: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   550: aload 41
    //   552: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   555: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   558: bipush 48
    //   560: aaload
    //   561: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   564: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   567: putfield 224	com/whatsapp/ContactPicker:z	Ljava/lang/String;
    //   570: aload_0
    //   571: invokevirtual 586	com/whatsapp/ContactPicker:getIntent	()Landroid/content/Intent;
    //   574: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   577: bipush 47
    //   579: aaload
    //   580: invokevirtual 604	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   583: astore 42
    //   585: aload 42
    //   587: ifnull +60 -> 647
    //   590: aload 42
    //   592: invokevirtual 641	java/lang/String:getBytes	()[B
    //   595: astore 43
    //   597: aload 43
    //   599: arraylength
    //   600: sipush 4096
    //   603: if_icmple +18 -> 621
    //   606: new 71	java/lang/String
    //   609: dup
    //   610: aload 43
    //   612: iconst_0
    //   613: sipush 4096
    //   616: invokespecial 644	java/lang/String:<init>	([BII)V
    //   619: astore 42
    //   621: aload_0
    //   622: new 265	java/lang/StringBuilder
    //   625: dup
    //   626: invokespecial 266	java/lang/StringBuilder:<init>	()V
    //   629: aload_0
    //   630: getfield 224	com/whatsapp/ContactPicker:z	Ljava/lang/String;
    //   633: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   636: aload 42
    //   638: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   641: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   644: putfield 224	com/whatsapp/ContactPicker:z	Ljava/lang/String;
    //   647: iload_1
    //   648: ifeq +1236 -> 1884
    //   651: aload_0
    //   652: getfield 259	com/whatsapp/ContactPicker:x	B
    //   655: iconst_4
    //   656: if_icmpne +263 -> 919
    //   659: aload_2
    //   660: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   663: bipush 19
    //   665: aaload
    //   666: invokevirtual 648	android/content/Intent:getParcelableExtra	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   669: invokevirtual 651	java/lang/Object:toString	()Ljava/lang/String;
    //   672: invokestatic 657	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   675: astore 12
    //   677: new 265	java/lang/StringBuilder
    //   680: dup
    //   681: invokespecial 266	java/lang/StringBuilder:<init>	()V
    //   684: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   687: bipush 43
    //   689: aaload
    //   690: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   693: aload 12
    //   695: invokevirtual 658	android/net/Uri:toString	()Ljava/lang/String;
    //   698: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   701: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   704: invokestatic 630	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   707: aconst_null
    //   708: astore 13
    //   710: bipush 255
    //   712: istore 14
    //   714: aload 12
    //   716: invokevirtual 661	android/net/Uri:getScheme	()Ljava/lang/String;
    //   719: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   722: bipush 46
    //   724: aaload
    //   725: invokevirtual 412	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   728: ifeq +445 -> 1173
    //   731: new 663	java/io/File
    //   734: dup
    //   735: aload 12
    //   737: invokevirtual 666	android/net/Uri:getSchemeSpecificPart	()Ljava/lang/String;
    //   740: iconst_2
    //   741: invokevirtual 670	java/lang/String:substring	(I)Ljava/lang/String;
    //   744: invokespecial 671	java/io/File:<init>	(Ljava/lang/String;)V
    //   747: astore 27
    //   749: aload 27
    //   751: invokevirtual 674	java/io/File:exists	()Z
    //   754: ifeq +108 -> 862
    //   757: new 676	java/io/FileInputStream
    //   760: dup
    //   761: aload 27
    //   763: invokevirtual 679	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   766: invokespecial 680	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   769: astore 13
    //   771: aload 27
    //   773: invokevirtual 683	java/io/File:length	()J
    //   776: lstore 28
    //   778: lload 28
    //   780: l2i
    //   781: istore 14
    //   783: aload 13
    //   785: astore 30
    //   787: aconst_null
    //   788: astore 16
    //   790: iload 14
    //   792: ifgt +500 -> 1292
    //   795: aload_0
    //   796: invokevirtual 634	com/whatsapp/ContactPicker:getBaseContext	()Landroid/content/Context;
    //   799: ldc_w 684
    //   802: iconst_0
    //   803: invokestatic 305	com/whatsapp/App:a	(Landroid/content/Context;II)V
    //   806: aload_0
    //   807: invokevirtual 368	com/whatsapp/ContactPicker:finish	()V
    //   810: aload 16
    //   812: ifnull -341 -> 471
    //   815: aload 16
    //   817: invokevirtual 689	android/content/res/AssetFileDescriptor:close	()V
    //   820: goto -349 -> 471
    //   823: astore 38
    //   825: new 265	java/lang/StringBuilder
    //   828: dup
    //   829: invokespecial 266	java/lang/StringBuilder:<init>	()V
    //   832: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   835: bipush 29
    //   837: aaload
    //   838: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   841: aload 38
    //   843: invokevirtual 690	java/io/IOException:toString	()Ljava/lang/String;
    //   846: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   849: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   852: astore 37
    //   854: aload 37
    //   856: invokestatic 692	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   859: goto -388 -> 471
    //   862: new 265	java/lang/StringBuilder
    //   865: dup
    //   866: invokespecial 266	java/lang/StringBuilder:<init>	()V
    //   869: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   872: bipush 31
    //   874: aaload
    //   875: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   878: aload 27
    //   880: invokevirtual 695	java/io/File:getPath	()Ljava/lang/String;
    //   883: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   886: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   889: invokestatic 281	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   892: goto -109 -> 783
    //   895: astore 25
    //   897: aconst_null
    //   898: astore 16
    //   900: aload 25
    //   902: invokestatic 698	com/whatsapp/g5:c	(Ljava/lang/Throwable;)V
    //   905: aload 16
    //   907: ifnull +8 -> 915
    //   910: aload 16
    //   912: invokevirtual 689	android/content/res/AssetFileDescriptor:close	()V
    //   915: iload_1
    //   916: ifeq +968 -> 1884
    //   919: aload_0
    //   920: aload_2
    //   921: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   924: bipush 19
    //   926: aaload
    //   927: invokevirtual 702	android/content/Intent:getParcelableArrayListExtra	(Ljava/lang/String;)Ljava/util/ArrayList;
    //   930: putfield 222	com/whatsapp/ContactPicker:y	Ljava/util/ArrayList;
    //   933: aload_0
    //   934: getfield 222	com/whatsapp/ContactPicker:y	Ljava/util/ArrayList;
    //   937: ifnonnull +78 -> 1015
    //   940: aload_2
    //   941: invokevirtual 624	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   944: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   947: bipush 19
    //   949: aaload
    //   950: invokevirtual 707	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   953: checkcast 653	android/net/Uri
    //   956: astore 10
    //   958: new 265	java/lang/StringBuilder
    //   961: dup
    //   962: invokespecial 266	java/lang/StringBuilder:<init>	()V
    //   965: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   968: bipush 45
    //   970: aaload
    //   971: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   974: aload 10
    //   976: invokevirtual 710	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   979: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   982: invokestatic 630	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   985: aload 10
    //   987: ifnull +24 -> 1011
    //   990: aload_0
    //   991: new 232	java/util/ArrayList
    //   994: dup
    //   995: invokespecial 233	java/util/ArrayList:<init>	()V
    //   998: putfield 222	com/whatsapp/ContactPicker:y	Ljava/util/ArrayList;
    //   1001: aload_0
    //   1002: getfield 222	com/whatsapp/ContactPicker:y	Ljava/util/ArrayList;
    //   1005: aload 10
    //   1007: invokevirtual 457	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1010: pop
    //   1011: iload_1
    //   1012: ifeq +97 -> 1109
    //   1015: new 265	java/lang/StringBuilder
    //   1018: dup
    //   1019: invokespecial 266	java/lang/StringBuilder:<init>	()V
    //   1022: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   1025: bipush 50
    //   1027: aaload
    //   1028: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1031: aload_0
    //   1032: getfield 222	com/whatsapp/ContactPicker:y	Ljava/util/ArrayList;
    //   1035: invokevirtual 326	java/util/ArrayList:size	()I
    //   1038: invokevirtual 273	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1041: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1044: invokestatic 630	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   1047: aload_0
    //   1048: getfield 222	com/whatsapp/ContactPicker:y	Ljava/util/ArrayList;
    //   1051: invokevirtual 427	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   1054: astore 6
    //   1056: aload 6
    //   1058: invokeinterface 433 1 0
    //   1063: ifeq +46 -> 1109
    //   1066: aload 6
    //   1068: invokeinterface 437 1 0
    //   1073: checkcast 653	android/net/Uri
    //   1076: astore 9
    //   1078: new 265	java/lang/StringBuilder
    //   1081: dup
    //   1082: invokespecial 266	java/lang/StringBuilder:<init>	()V
    //   1085: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   1088: bipush 45
    //   1090: aaload
    //   1091: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1094: aload 9
    //   1096: invokevirtual 710	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1099: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1102: invokestatic 630	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   1105: iload_1
    //   1106: ifeq -50 -> 1056
    //   1109: aload_0
    //   1110: getfield 222	com/whatsapp/ContactPicker:y	Ljava/util/ArrayList;
    //   1113: ifnull +13 -> 1126
    //   1116: aload_0
    //   1117: getfield 222	com/whatsapp/ContactPicker:y	Ljava/util/ArrayList;
    //   1120: invokevirtual 713	java/util/ArrayList:isEmpty	()Z
    //   1123: ifeq +626 -> 1749
    //   1126: new 265	java/lang/StringBuilder
    //   1129: dup
    //   1130: invokespecial 266	java/lang/StringBuilder:<init>	()V
    //   1133: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   1136: bipush 40
    //   1138: aaload
    //   1139: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1142: aload_2
    //   1143: invokevirtual 628	android/content/Intent:toString	()Ljava/lang/String;
    //   1146: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1149: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1152: invokestatic 281	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   1155: aload_0
    //   1156: invokevirtual 634	com/whatsapp/ContactPicker:getBaseContext	()Landroid/content/Context;
    //   1159: ldc_w 714
    //   1162: iconst_0
    //   1163: invokestatic 305	com/whatsapp/App:a	(Landroid/content/Context;II)V
    //   1166: aload_0
    //   1167: invokevirtual 368	com/whatsapp/ContactPicker:finish	()V
    //   1170: goto -699 -> 471
    //   1173: getstatic 718	com/whatsapp/App:ib	Landroid/content/ContentResolver;
    //   1176: aload 12
    //   1178: ldc_w 719
    //   1181: invokevirtual 725	android/content/ContentResolver:openAssetFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //   1184: astore 39
    //   1186: aload 39
    //   1188: astore 16
    //   1190: aload 16
    //   1192: ifnonnull +82 -> 1274
    //   1195: aload_0
    //   1196: new 265	java/lang/StringBuilder
    //   1199: dup
    //   1200: invokespecial 266	java/lang/StringBuilder:<init>	()V
    //   1203: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   1206: bipush 52
    //   1208: aaload
    //   1209: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1212: aload 12
    //   1214: invokevirtual 710	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1217: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1220: invokestatic 728	com/whatsapp/App:d	(Landroid/content/Context;Ljava/lang/String;)V
    //   1223: aload_0
    //   1224: invokevirtual 368	com/whatsapp/ContactPicker:finish	()V
    //   1227: aload 16
    //   1229: ifnull -758 -> 471
    //   1232: aload 16
    //   1234: invokevirtual 689	android/content/res/AssetFileDescriptor:close	()V
    //   1237: goto -766 -> 471
    //   1240: astore 40
    //   1242: new 265	java/lang/StringBuilder
    //   1245: dup
    //   1246: invokespecial 266	java/lang/StringBuilder:<init>	()V
    //   1249: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   1252: bipush 29
    //   1254: aaload
    //   1255: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1258: aload 40
    //   1260: invokevirtual 690	java/io/IOException:toString	()Ljava/lang/String;
    //   1263: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1266: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1269: astore 37
    //   1271: goto -417 -> 854
    //   1274: aload 16
    //   1276: invokevirtual 732	android/content/res/AssetFileDescriptor:createInputStream	()Ljava/io/FileInputStream;
    //   1279: astore 30
    //   1281: aload 16
    //   1283: invokevirtual 735	android/content/res/AssetFileDescriptor:getDeclaredLength	()J
    //   1286: l2i
    //   1287: istore 14
    //   1289: goto -499 -> 790
    //   1292: iload 14
    //   1294: newarray byte
    //   1296: astore 31
    //   1298: aload 30
    //   1300: aload 31
    //   1302: invokevirtual 739	java/io/FileInputStream:read	([B)I
    //   1305: ifle +203 -> 1508
    //   1308: new 71	java/lang/String
    //   1311: dup
    //   1312: aload 31
    //   1314: invokespecial 742	java/lang/String:<init>	([B)V
    //   1317: astore 32
    //   1319: new 265	java/lang/StringBuilder
    //   1322: dup
    //   1323: invokespecial 266	java/lang/StringBuilder:<init>	()V
    //   1326: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   1329: bipush 53
    //   1331: aaload
    //   1332: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1335: aload 32
    //   1337: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1340: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1343: invokestatic 281	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   1346: new 743	n
    //   1349: dup
    //   1350: invokespecial 744	n:<init>	()V
    //   1353: astore 33
    //   1355: new 745	q
    //   1358: dup
    //   1359: invokespecial 746	q:<init>	()V
    //   1362: astore 34
    //   1364: aload 33
    //   1366: aload 32
    //   1368: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   1371: bipush 30
    //   1373: aaload
    //   1374: aload 34
    //   1376: invokevirtual 749	n:a	(Ljava/lang/String;Ljava/lang/String;Lq;)Z
    //   1379: ifne +88 -> 1467
    //   1382: new 265	java/lang/StringBuilder
    //   1385: dup
    //   1386: invokespecial 266	java/lang/StringBuilder:<init>	()V
    //   1389: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   1392: bipush 38
    //   1394: aaload
    //   1395: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1398: aload 32
    //   1400: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1403: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1406: invokestatic 692	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   1409: aload_0
    //   1410: invokevirtual 634	com/whatsapp/ContactPicker:getBaseContext	()Landroid/content/Context;
    //   1413: ldc_w 750
    //   1416: iconst_0
    //   1417: invokestatic 305	com/whatsapp/App:a	(Landroid/content/Context;II)V
    //   1420: aload 16
    //   1422: ifnull -951 -> 471
    //   1425: aload 16
    //   1427: invokevirtual 689	android/content/res/AssetFileDescriptor:close	()V
    //   1430: goto -959 -> 471
    //   1433: astore 36
    //   1435: new 265	java/lang/StringBuilder
    //   1438: dup
    //   1439: invokespecial 266	java/lang/StringBuilder:<init>	()V
    //   1442: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   1445: bipush 29
    //   1447: aaload
    //   1448: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1451: aload 36
    //   1453: invokevirtual 690	java/io/IOException:toString	()Ljava/lang/String;
    //   1456: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1459: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1462: astore 37
    //   1464: goto -610 -> 854
    //   1467: aload_0
    //   1468: iconst_4
    //   1469: putfield 259	com/whatsapp/ContactPicker:x	B
    //   1472: aload_0
    //   1473: aload 32
    //   1475: putfield 226	com/whatsapp/ContactPicker:A	Ljava/lang/String;
    //   1478: aload_0
    //   1479: aload 34
    //   1481: getfield 753	q:b	Ljava/util/List;
    //   1484: iconst_0
    //   1485: invokeinterface 756 2 0
    //   1490: checkcast 757	r
    //   1493: iconst_0
    //   1494: aload 32
    //   1496: invokestatic 761	g:a	(Lr;ILjava/lang/String;)Lg;
    //   1499: getfield 764	g:c	Lj;
    //   1502: getfield 767	j:a	Ljava/lang/String;
    //   1505: putfield 228	com/whatsapp/ContactPicker:B	Ljava/lang/String;
    //   1508: aload 16
    //   1510: ifnull -595 -> 915
    //   1513: aload 16
    //   1515: invokevirtual 689	android/content/res/AssetFileDescriptor:close	()V
    //   1518: goto -603 -> 915
    //   1521: astore 35
    //   1523: new 265	java/lang/StringBuilder
    //   1526: dup
    //   1527: invokespecial 266	java/lang/StringBuilder:<init>	()V
    //   1530: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   1533: bipush 29
    //   1535: aaload
    //   1536: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1539: aload 35
    //   1541: invokevirtual 690	java/io/IOException:toString	()Ljava/lang/String;
    //   1544: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1547: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1550: astore 20
    //   1552: aload 20
    //   1554: invokestatic 692	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   1557: goto -642 -> 915
    //   1560: astore 23
    //   1562: aconst_null
    //   1563: astore 16
    //   1565: aload 23
    //   1567: invokestatic 698	com/whatsapp/g5:c	(Ljava/lang/Throwable;)V
    //   1570: aload 16
    //   1572: ifnull -657 -> 915
    //   1575: aload 16
    //   1577: invokevirtual 689	android/content/res/AssetFileDescriptor:close	()V
    //   1580: goto -665 -> 915
    //   1583: astore 24
    //   1585: new 265	java/lang/StringBuilder
    //   1588: dup
    //   1589: invokespecial 266	java/lang/StringBuilder:<init>	()V
    //   1592: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   1595: bipush 29
    //   1597: aaload
    //   1598: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1601: aload 24
    //   1603: invokevirtual 690	java/io/IOException:toString	()Ljava/lang/String;
    //   1606: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1609: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1612: astore 20
    //   1614: goto -62 -> 1552
    //   1617: astore 21
    //   1619: aconst_null
    //   1620: astore 16
    //   1622: aload 21
    //   1624: invokestatic 698	com/whatsapp/g5:c	(Ljava/lang/Throwable;)V
    //   1627: aload 16
    //   1629: ifnull -714 -> 915
    //   1632: aload 16
    //   1634: invokevirtual 689	android/content/res/AssetFileDescriptor:close	()V
    //   1637: goto -722 -> 915
    //   1640: astore 22
    //   1642: new 265	java/lang/StringBuilder
    //   1645: dup
    //   1646: invokespecial 266	java/lang/StringBuilder:<init>	()V
    //   1649: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   1652: bipush 29
    //   1654: aaload
    //   1655: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1658: aload 22
    //   1660: invokevirtual 690	java/io/IOException:toString	()Ljava/lang/String;
    //   1663: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1666: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1669: astore 20
    //   1671: goto -119 -> 1552
    //   1674: astore 18
    //   1676: aconst_null
    //   1677: astore 16
    //   1679: aload 18
    //   1681: invokestatic 698	com/whatsapp/g5:c	(Ljava/lang/Throwable;)V
    //   1684: aload 16
    //   1686: ifnull -771 -> 915
    //   1689: aload 16
    //   1691: invokevirtual 689	android/content/res/AssetFileDescriptor:close	()V
    //   1694: goto -779 -> 915
    //   1697: astore 19
    //   1699: new 265	java/lang/StringBuilder
    //   1702: dup
    //   1703: invokespecial 266	java/lang/StringBuilder:<init>	()V
    //   1706: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   1709: bipush 29
    //   1711: aaload
    //   1712: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1715: aload 19
    //   1717: invokevirtual 690	java/io/IOException:toString	()Ljava/lang/String;
    //   1720: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1723: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1726: astore 20
    //   1728: goto -176 -> 1552
    //   1731: astore 15
    //   1733: aconst_null
    //   1734: astore 16
    //   1736: aload 16
    //   1738: ifnull +8 -> 1746
    //   1741: aload 16
    //   1743: invokevirtual 689	android/content/res/AssetFileDescriptor:close	()V
    //   1746: aload 15
    //   1748: athrow
    //   1749: aload_0
    //   1750: getfield 222	com/whatsapp/ContactPicker:y	Ljava/util/ArrayList;
    //   1753: invokevirtual 326	java/util/ArrayList:size	()I
    //   1756: bipush 10
    //   1758: if_icmple +21 -> 1779
    //   1761: aload_0
    //   1762: invokevirtual 634	com/whatsapp/ContactPicker:getBaseContext	()Landroid/content/Context;
    //   1765: ldc_w 768
    //   1768: iconst_0
    //   1769: invokestatic 305	com/whatsapp/App:a	(Landroid/content/Context;II)V
    //   1772: aload_0
    //   1773: invokevirtual 368	com/whatsapp/ContactPicker:finish	()V
    //   1776: goto -1305 -> 471
    //   1779: aload_0
    //   1780: getfield 222	com/whatsapp/ContactPicker:y	Ljava/util/ArrayList;
    //   1783: invokevirtual 427	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   1786: astore 7
    //   1788: aload 7
    //   1790: invokeinterface 433 1 0
    //   1795: ifeq +89 -> 1884
    //   1798: aload 7
    //   1800: invokeinterface 437 1 0
    //   1805: checkcast 653	android/net/Uri
    //   1808: astore 8
    //   1810: aload 8
    //   1812: invokevirtual 658	android/net/Uri:toString	()Ljava/lang/String;
    //   1815: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   1818: bipush 44
    //   1820: aaload
    //   1821: invokevirtual 451	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   1824: ifeq +56 -> 1880
    //   1827: new 265	java/lang/StringBuilder
    //   1830: dup
    //   1831: invokespecial 266	java/lang/StringBuilder:<init>	()V
    //   1834: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   1837: bipush 33
    //   1839: aaload
    //   1840: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1843: aload 8
    //   1845: invokevirtual 658	android/net/Uri:toString	()Ljava/lang/String;
    //   1848: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1851: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1854: invokestatic 281	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   1857: aload_0
    //   1858: invokevirtual 634	com/whatsapp/ContactPicker:getBaseContext	()Landroid/content/Context;
    //   1861: ldc_w 635
    //   1864: iconst_0
    //   1865: invokestatic 305	com/whatsapp/App:a	(Landroid/content/Context;II)V
    //   1868: aload_0
    //   1869: aconst_null
    //   1870: putfield 222	com/whatsapp/ContactPicker:y	Ljava/util/ArrayList;
    //   1873: aload_0
    //   1874: invokevirtual 368	com/whatsapp/ContactPicker:finish	()V
    //   1877: goto -1406 -> 471
    //   1880: iload_1
    //   1881: ifeq -93 -> 1788
    //   1884: aload_0
    //   1885: invokespecial 549	com/whatsapp/ContactPicker:f	()V
    //   1888: aload_0
    //   1889: new 554	com/whatsapp/fe
    //   1892: dup
    //   1893: aload_0
    //   1894: aload_0
    //   1895: aload_0
    //   1896: getfield 237	com/whatsapp/ContactPicker:G	Ljava/util/ArrayList;
    //   1899: invokespecial 771	com/whatsapp/fe:<init>	(Lcom/whatsapp/ContactPicker;Landroid/content/Context;Ljava/util/ArrayList;)V
    //   1902: putfield 519	com/whatsapp/ContactPicker:m	Lcom/whatsapp/fe;
    //   1905: aload_0
    //   1906: aload_0
    //   1907: getfield 519	com/whatsapp/ContactPicker:m	Lcom/whatsapp/fe;
    //   1910: invokevirtual 775	com/whatsapp/ContactPicker:setListAdapter	(Landroid/widget/ListAdapter;)V
    //   1913: aload_0
    //   1914: aload_0
    //   1915: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   1918: bipush 37
    //   1920: aaload
    //   1921: invokevirtual 779	com/whatsapp/ContactPicker:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   1924: checkcast 781	android/view/inputmethod/InputMethodManager
    //   1927: putfield 783	com/whatsapp/ContactPicker:I	Landroid/view/inputmethod/InputMethodManager;
    //   1930: aload_0
    //   1931: aload_0
    //   1932: ldc_w 784
    //   1935: invokevirtual 500	com/whatsapp/ContactPicker:findViewById	(I)Landroid/view/View;
    //   1938: checkcast 786	android/widget/EditText
    //   1941: putfield 405	com/whatsapp/ContactPicker:J	Landroid/widget/EditText;
    //   1944: aload_0
    //   1945: aload_0
    //   1946: ldc_w 787
    //   1949: invokevirtual 500	com/whatsapp/ContactPicker:findViewById	(I)Landroid/view/View;
    //   1952: checkcast 789	android/widget/ImageButton
    //   1955: putfield 284	com/whatsapp/ContactPicker:L	Landroid/widget/ImageButton;
    //   1958: aload_0
    //   1959: getfield 405	com/whatsapp/ContactPicker:J	Landroid/widget/EditText;
    //   1962: aload_0
    //   1963: getfield 249	com/whatsapp/ContactPicker:S	Landroid/text/TextWatcher;
    //   1966: invokevirtual 793	android/widget/EditText:addTextChangedListener	(Landroid/text/TextWatcher;)V
    //   1969: aload_0
    //   1970: getfield 405	com/whatsapp/ContactPicker:J	Landroid/widget/EditText;
    //   1973: aload_0
    //   1974: getfield 405	com/whatsapp/ContactPicker:J	Landroid/widget/EditText;
    //   1977: invokevirtual 797	android/widget/EditText:getText	()Landroid/text/Editable;
    //   1980: invokevirtual 651	java/lang/Object:toString	()Ljava/lang/String;
    //   1983: invokestatic 800	com/whatsapp/TextEmojiLabel:a	(Ljava/lang/String;)I
    //   1986: invokevirtual 803	android/widget/EditText:setGravity	(I)V
    //   1989: aload_0
    //   1990: aload_0
    //   1991: ldc_w 594
    //   1994: invokevirtual 500	com/whatsapp/ContactPicker:findViewById	(I)Landroid/view/View;
    //   1997: checkcast 596	android/widget/TextView
    //   2000: putfield 495	com/whatsapp/ContactPicker:K	Landroid/widget/TextView;
    //   2003: aload_0
    //   2004: getfield 284	com/whatsapp/ContactPicker:L	Landroid/widget/ImageButton;
    //   2007: new 805	com/whatsapp/tj
    //   2010: dup
    //   2011: aload_0
    //   2012: invokespecial 806	com/whatsapp/tj:<init>	(Lcom/whatsapp/ContactPicker;)V
    //   2015: invokevirtual 810	android/widget/ImageButton:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   2018: aload_0
    //   2019: aload_0
    //   2020: ldc_w 811
    //   2023: invokevirtual 500	com/whatsapp/ContactPicker:findViewById	(I)Landroid/view/View;
    //   2026: checkcast 789	android/widget/ImageButton
    //   2029: putfield 487	com/whatsapp/ContactPicker:M	Landroid/widget/ImageButton;
    //   2032: aload_0
    //   2033: aload_0
    //   2034: ldc_w 812
    //   2037: invokevirtual 500	com/whatsapp/ContactPicker:findViewById	(I)Landroid/view/View;
    //   2040: checkcast 789	android/widget/ImageButton
    //   2043: putfield 418	com/whatsapp/ContactPicker:N	Landroid/widget/ImageButton;
    //   2046: aload_0
    //   2047: aload_0
    //   2048: ldc_w 813
    //   2051: invokevirtual 500	com/whatsapp/ContactPicker:findViewById	(I)Landroid/view/View;
    //   2054: checkcast 789	android/widget/ImageButton
    //   2057: putfield 485	com/whatsapp/ContactPicker:O	Landroid/widget/ImageButton;
    //   2060: aload_0
    //   2061: getfield 487	com/whatsapp/ContactPicker:M	Landroid/widget/ImageButton;
    //   2064: new 815	com/whatsapp/dk
    //   2067: dup
    //   2068: aload_0
    //   2069: invokespecial 816	com/whatsapp/dk:<init>	(Lcom/whatsapp/ContactPicker;)V
    //   2072: invokevirtual 810	android/widget/ImageButton:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   2075: aload_0
    //   2076: getfield 418	com/whatsapp/ContactPicker:N	Landroid/widget/ImageButton;
    //   2079: new 818	com/whatsapp/fk
    //   2082: dup
    //   2083: aload_0
    //   2084: invokespecial 819	com/whatsapp/fk:<init>	(Lcom/whatsapp/ContactPicker;)V
    //   2087: invokevirtual 810	android/widget/ImageButton:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   2090: aload_0
    //   2091: getfield 485	com/whatsapp/ContactPicker:O	Landroid/widget/ImageButton;
    //   2094: new 821	com/whatsapp/gk
    //   2097: dup
    //   2098: aload_0
    //   2099: invokespecial 822	com/whatsapp/gk:<init>	(Lcom/whatsapp/ContactPicker;)V
    //   2102: invokevirtual 810	android/widget/ImageButton:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   2105: aload_0
    //   2106: getfield 230	com/whatsapp/ContactPicker:E	I
    //   2109: tableswitch	default:+27 -> 2136, 0:+220->2329, 1:+275->2384, 2:+165->2274
    //   2137: aload_0
    //   2138: invokevirtual 826	com/whatsapp/ContactPicker:getListView	()Landroid/widget/ListView;
    //   2141: putfield 516	com/whatsapp/ContactPicker:H	Landroid/widget/ListView;
    //   2144: aload_0
    //   2145: getfield 516	com/whatsapp/ContactPicker:H	Landroid/widget/ListView;
    //   2148: iconst_0
    //   2149: invokevirtual 831	android/widget/ListView:setDividerHeight	(I)V
    //   2152: aload_0
    //   2153: getfield 516	com/whatsapp/ContactPicker:H	Landroid/widget/ListView;
    //   2156: ldc_w 832
    //   2159: invokevirtual 835	android/widget/ListView:setSelector	(I)V
    //   2162: aload_0
    //   2163: getfield 516	com/whatsapp/ContactPicker:H	Landroid/widget/ListView;
    //   2166: iconst_1
    //   2167: invokevirtual 838	android/widget/ListView:setFastScrollEnabled	(Z)V
    //   2170: aload_0
    //   2171: getfield 516	com/whatsapp/ContactPicker:H	Landroid/widget/ListView;
    //   2174: iconst_1
    //   2175: invokevirtual 841	android/widget/ListView:setScrollbarFadingEnabled	(Z)V
    //   2178: aload_0
    //   2179: getfield 516	com/whatsapp/ContactPicker:H	Landroid/widget/ListView;
    //   2182: aload_0
    //   2183: ldc_w 842
    //   2186: invokevirtual 500	com/whatsapp/ContactPicker:findViewById	(I)Landroid/view/View;
    //   2189: invokevirtual 846	android/widget/ListView:setEmptyView	(Landroid/view/View;)V
    //   2192: aload_0
    //   2193: getfield 516	com/whatsapp/ContactPicker:H	Landroid/widget/ListView;
    //   2196: iconst_1
    //   2197: invokevirtual 849	android/widget/ListView:setTextFilterEnabled	(Z)V
    //   2200: aload_0
    //   2201: getfield 516	com/whatsapp/ContactPicker:H	Landroid/widget/ListView;
    //   2204: new 851	com/whatsapp/hk
    //   2207: dup
    //   2208: aload_0
    //   2209: invokespecial 852	com/whatsapp/hk:<init>	(Lcom/whatsapp/ContactPicker;)V
    //   2212: invokevirtual 856	android/widget/ListView:setOnItemClickListener	(Landroid/widget/AdapterView$OnItemClickListener;)V
    //   2215: aload_0
    //   2216: ldc_w 510
    //   2219: invokevirtual 500	com/whatsapp/ContactPicker:findViewById	(I)Landroid/view/View;
    //   2222: new 858	com/whatsapp/ik
    //   2225: dup
    //   2226: aload_0
    //   2227: invokespecial 859	com/whatsapp/ik:<init>	(Lcom/whatsapp/ContactPicker;)V
    //   2230: invokevirtual 860	android/view/View:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   2233: new 862	com/whatsapp/jk
    //   2236: dup
    //   2237: aload_0
    //   2238: invokespecial 863	com/whatsapp/jk:<init>	(Lcom/whatsapp/ContactPicker;)V
    //   2241: astore 4
    //   2243: aload_0
    //   2244: ldc_w 864
    //   2247: invokevirtual 500	com/whatsapp/ContactPicker:findViewById	(I)Landroid/view/View;
    //   2250: aload 4
    //   2252: invokevirtual 860	android/view/View:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   2255: aload_0
    //   2256: aload_0
    //   2257: getfield 516	com/whatsapp/ContactPicker:H	Landroid/widget/ListView;
    //   2260: invokevirtual 867	com/whatsapp/ContactPicker:registerForContextMenu	(Landroid/view/View;)V
    //   2263: aload_0
    //   2264: aload_0
    //   2265: invokestatic 870	com/whatsapp/App:i	(Landroid/content/Context;)Z
    //   2268: putfield 872	com/whatsapp/ContactPicker:R	Z
    //   2271: goto -1800 -> 471
    //   2274: aload_0
    //   2275: getfield 485	com/whatsapp/ContactPicker:O	Landroid/widget/ImageButton;
    //   2278: aload_0
    //   2279: invokevirtual 876	com/whatsapp/ContactPicker:getResources	()Landroid/content/res/Resources;
    //   2282: ldc_w 877
    //   2285: invokevirtual 883	android/content/res/Resources:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   2288: invokevirtual 887	android/widget/ImageButton:setBackgroundDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   2291: aload_0
    //   2292: getfield 418	com/whatsapp/ContactPicker:N	Landroid/widget/ImageButton;
    //   2295: aload_0
    //   2296: invokevirtual 876	com/whatsapp/ContactPicker:getResources	()Landroid/content/res/Resources;
    //   2299: ldc_w 877
    //   2302: invokevirtual 883	android/content/res/Resources:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   2305: invokevirtual 887	android/widget/ImageButton:setBackgroundDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   2308: aload_0
    //   2309: getfield 487	com/whatsapp/ContactPicker:M	Landroid/widget/ImageButton;
    //   2312: aload_0
    //   2313: invokevirtual 876	com/whatsapp/ContactPicker:getResources	()Landroid/content/res/Resources;
    //   2316: ldc_w 888
    //   2319: invokevirtual 883	android/content/res/Resources:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   2322: invokevirtual 887	android/widget/ImageButton:setBackgroundDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   2325: iload_1
    //   2326: ifeq -190 -> 2136
    //   2329: aload_0
    //   2330: getfield 485	com/whatsapp/ContactPicker:O	Landroid/widget/ImageButton;
    //   2333: aload_0
    //   2334: invokevirtual 876	com/whatsapp/ContactPicker:getResources	()Landroid/content/res/Resources;
    //   2337: ldc_w 888
    //   2340: invokevirtual 883	android/content/res/Resources:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   2343: invokevirtual 887	android/widget/ImageButton:setBackgroundDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   2346: aload_0
    //   2347: getfield 418	com/whatsapp/ContactPicker:N	Landroid/widget/ImageButton;
    //   2350: aload_0
    //   2351: invokevirtual 876	com/whatsapp/ContactPicker:getResources	()Landroid/content/res/Resources;
    //   2354: ldc_w 877
    //   2357: invokevirtual 883	android/content/res/Resources:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   2360: invokevirtual 887	android/widget/ImageButton:setBackgroundDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   2363: aload_0
    //   2364: getfield 487	com/whatsapp/ContactPicker:M	Landroid/widget/ImageButton;
    //   2367: aload_0
    //   2368: invokevirtual 876	com/whatsapp/ContactPicker:getResources	()Landroid/content/res/Resources;
    //   2371: ldc_w 877
    //   2374: invokevirtual 883	android/content/res/Resources:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   2377: invokevirtual 887	android/widget/ImageButton:setBackgroundDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   2380: iload_1
    //   2381: ifeq -245 -> 2136
    //   2384: aload_0
    //   2385: getfield 485	com/whatsapp/ContactPicker:O	Landroid/widget/ImageButton;
    //   2388: aload_0
    //   2389: invokevirtual 876	com/whatsapp/ContactPicker:getResources	()Landroid/content/res/Resources;
    //   2392: ldc_w 877
    //   2395: invokevirtual 883	android/content/res/Resources:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   2398: invokevirtual 887	android/widget/ImageButton:setBackgroundDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   2401: aload_0
    //   2402: getfield 418	com/whatsapp/ContactPicker:N	Landroid/widget/ImageButton;
    //   2405: aload_0
    //   2406: invokevirtual 876	com/whatsapp/ContactPicker:getResources	()Landroid/content/res/Resources;
    //   2409: ldc_w 888
    //   2412: invokevirtual 883	android/content/res/Resources:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   2415: invokevirtual 887	android/widget/ImageButton:setBackgroundDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   2418: aload_0
    //   2419: getfield 487	com/whatsapp/ContactPicker:M	Landroid/widget/ImageButton;
    //   2422: aload_0
    //   2423: invokevirtual 876	com/whatsapp/ContactPicker:getResources	()Landroid/content/res/Resources;
    //   2426: ldc_w 877
    //   2429: invokevirtual 883	android/content/res/Resources:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   2432: invokevirtual 887	android/widget/ImageButton:setBackgroundDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   2435: goto -299 -> 2136
    //   2438: astore 17
    //   2440: new 265	java/lang/StringBuilder
    //   2443: dup
    //   2444: invokespecial 266	java/lang/StringBuilder:<init>	()V
    //   2447: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   2450: bipush 29
    //   2452: aaload
    //   2453: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2456: aload 17
    //   2458: invokevirtual 690	java/io/IOException:toString	()Ljava/lang/String;
    //   2461: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2464: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2467: invokestatic 692	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   2470: goto -724 -> 1746
    //   2473: astore 26
    //   2475: new 265	java/lang/StringBuilder
    //   2478: dup
    //   2479: invokespecial 266	java/lang/StringBuilder:<init>	()V
    //   2482: getstatic 193	com/whatsapp/ContactPicker:T	[Ljava/lang/String;
    //   2485: bipush 29
    //   2487: aaload
    //   2488: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2491: aload 26
    //   2493: invokevirtual 690	java/io/IOException:toString	()Ljava/lang/String;
    //   2496: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2499: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2502: astore 20
    //   2504: goto -952 -> 1552
    //   2507: astore 15
    //   2509: goto -773 -> 1736
    //   2512: astore 18
    //   2514: goto -835 -> 1679
    //   2517: astore 21
    //   2519: goto -897 -> 1622
    //   2522: astore 23
    //   2524: goto -959 -> 1565
    //   2527: astore 25
    //   2529: goto -1629 -> 900
    //
    // Exception table:
    //   from	to	target	type
    //   815	820	823	java/io/IOException
    //   714	778	895	java/io/UnsupportedEncodingException
    //   862	892	895	java/io/UnsupportedEncodingException
    //   1173	1186	895	java/io/UnsupportedEncodingException
    //   1232	1237	1240	java/io/IOException
    //   1425	1430	1433	java/io/IOException
    //   1513	1518	1521	java/io/IOException
    //   714	778	1560	b
    //   862	892	1560	b
    //   1173	1186	1560	b
    //   1575	1580	1583	java/io/IOException
    //   714	778	1617	java/io/FileNotFoundException
    //   862	892	1617	java/io/FileNotFoundException
    //   1173	1186	1617	java/io/FileNotFoundException
    //   1632	1637	1640	java/io/IOException
    //   714	778	1674	java/io/IOException
    //   862	892	1674	java/io/IOException
    //   1173	1186	1674	java/io/IOException
    //   1689	1694	1697	java/io/IOException
    //   714	778	1731	finally
    //   862	892	1731	finally
    //   1173	1186	1731	finally
    //   1741	1746	2438	java/io/IOException
    //   910	915	2473	java/io/IOException
    //   795	810	2507	finally
    //   900	905	2507	finally
    //   1195	1227	2507	finally
    //   1274	1420	2507	finally
    //   1467	1508	2507	finally
    //   1565	1570	2507	finally
    //   1622	1627	2507	finally
    //   1679	1684	2507	finally
    //   795	810	2512	java/io/IOException
    //   1195	1227	2512	java/io/IOException
    //   1274	1420	2512	java/io/IOException
    //   1467	1508	2512	java/io/IOException
    //   795	810	2517	java/io/FileNotFoundException
    //   1195	1227	2517	java/io/FileNotFoundException
    //   1274	1420	2517	java/io/FileNotFoundException
    //   1467	1508	2517	java/io/FileNotFoundException
    //   795	810	2522	b
    //   1195	1227	2522	b
    //   1274	1420	2522	b
    //   1467	1508	2522	b
    //   795	810	2527	java/io/UnsupportedEncodingException
    //   1195	1227	2527	java/io/UnsupportedEncodingException
    //   1274	1420	2527	java/io/UnsupportedEncodingException
    //   1467	1508	2527	java/io/UnsupportedEncodingException
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    try
    {
      boolean bool2 = super.dispatchTouchEvent(paramMotionEvent);
      bool1 = bool2;
      return bool1;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      while (true)
        boolean bool1 = false;
    }
  }

  protected void e()
  {
    App.a(this);
    this.m.notifyDataSetChanged();
    D = false;
    if (App.i(this) != this.R)
    {
      this.R = App.i(this);
      a();
    }
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
        a(false);
        if (!DialogToastListActivity.f);
      }
      else
      {
        g5.b(T[26]);
      }
      g.a(false);
    }
  }

  public void onBackPressed()
  {
    if (this.P)
    {
      a();
      findViewById(2131558526).setVisibility(8);
      findViewById(2131558530).setVisibility(0);
      this.P = false;
      g();
      this.m.notifyDataSetChanged();
      if (!DialogToastListActivity.f);
    }
    else
    {
      super.onBackPressed();
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
  }

  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    AdapterView.AdapterContextMenuInfo localAdapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramMenuItem.getMenuInfo();
    zq localzq = (zq)getListView().getItemAtPosition(localAdapterContextMenuInfo.position);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    }
    for (boolean bool = super.onContextItemSelected(paramMenuItem); ; bool = true)
    {
      return bool;
      if (!App.sb())
      {
        App.a(getBaseContext(), 2131296525, 0);
        if (!DialogToastListActivity.f);
      }
      else
      {
        showDialog(107);
        new q8(this, localzq).start();
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool = DialogToastListActivity.f;
    super.onCreate(paramBundle);
    setContentView(2130903055);
    j2.a(this);
    g5.b(T[11]);
    if ((App.bb == null) || (App.c(this) != 3))
    {
      App.a(this, 2131296621, 1);
      startActivity(new Intent(this, Main.class));
      finish();
    }
    while (true)
    {
      return;
      this.l = ((ProgressBar)findViewById(2131558532));
      if (!App.z.l())
      {
        D = true;
        String str = Environment.getExternalStorageState();
        if ((!str.equals(T[12])) && (!str.equals(T[13])))
        {
          showDialog(107);
          if (!bool);
        }
        else
        {
          b();
        }
        if (!bool);
      }
      else
      {
        d();
      }
    }
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AdapterView.AdapterContextMenuInfo localAdapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    zq localzq = (zq)getListView().getItemAtPosition(localAdapterContextMenuInfo.position);
    if (!App.g(localzq.b));
    while (true)
    {
      return;
      String str = getString(2131296809);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localzq.h;
      paramContextMenu.add(0, 0, 0, String.format(str, arrayOfObject));
      super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    }
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    boolean bool = DialogToastListActivity.f;
    Object localObject1;
    switch (paramInt)
    {
    default:
      localObject1 = super.onCreateDialog(paramInt);
    case 0:
    case 1:
    case 2:
    case 107:
    case 108:
    }
    while (true)
    {
      return localObject1;
      Object[] arrayOfObject7 = new Object[2];
      arrayOfObject7[0] = this.n.b();
      arrayOfObject7[1] = App.w.c(this.w).b();
      Object localObject4 = getString(2131296622, arrayOfObject7);
      SpannableStringBuilder localSpannableStringBuilder3 = v4.a((String)localObject4, getBaseContext());
      AlertDialog.Builder localBuilder3 = new AlertDialog.Builder(this);
      if (localSpannableStringBuilder3 == null);
      while (true)
      {
        localObject1 = localBuilder3.setMessage((CharSequence)localObject4).setCancelable(true).setNegativeButton(2131296268, new wj(this)).setPositiveButton(2131296270, new vj(this)).setOnCancelListener(new uj(this)).create();
        break;
        localObject4 = localSpannableStringBuilder3;
      }
      Object localObject3;
      if (this.n.o())
      {
        if ((this.y != null) && (this.y.size() > 1))
        {
          String str2 = App.Z.a(2131427336, this.y.size());
          Object[] arrayOfObject6 = new Object[2];
          arrayOfObject6[0] = Integer.valueOf(this.y.size());
          arrayOfObject6[1] = this.n.b();
          localObject3 = String.format(str2, arrayOfObject6);
          if (!bool);
        }
        else
        {
          Object[] arrayOfObject5 = new Object[1];
          arrayOfObject5[0] = this.n.b();
          localObject3 = getString(2131296625, arrayOfObject5);
          if (!bool);
        }
      }
      else if ((this.y != null) && (this.y.size() > 1))
      {
        String str1 = App.Z.a(2131427335, this.y.size());
        Object[] arrayOfObject4 = new Object[2];
        arrayOfObject4[0] = Integer.valueOf(this.y.size());
        arrayOfObject4[1] = this.n.b();
        localObject3 = String.format(str1, arrayOfObject4);
        if (!bool);
      }
      else
      {
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = this.n.b();
        localObject3 = getString(2131296624, arrayOfObject3);
      }
      SpannableStringBuilder localSpannableStringBuilder2 = v4.a((String)localObject3, getBaseContext());
      AlertDialog.Builder localBuilder2 = new AlertDialog.Builder(this);
      if (localSpannableStringBuilder2 == null);
      while (true)
      {
        localObject1 = localBuilder2.setMessage((CharSequence)localObject3).setCancelable(true).setNegativeButton(2131296268, new zj(this)).setPositiveButton(2131296270, new yj(this)).setOnCancelListener(new xj(this)).create();
        break;
        localObject3 = localSpannableStringBuilder2;
      }
      Object localObject2;
      if (this.n.o())
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = this.n.b();
        localObject2 = getString(2131296627, arrayOfObject2);
        if (!bool);
      }
      else
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = this.n.b();
        localObject2 = getString(2131296626, arrayOfObject1);
      }
      SpannableStringBuilder localSpannableStringBuilder1 = v4.a((String)localObject2, getBaseContext());
      AlertDialog.Builder localBuilder1 = new AlertDialog.Builder(this);
      if (localSpannableStringBuilder1 == null);
      while (true)
      {
        localObject1 = localBuilder1.setMessage((CharSequence)localObject2).setCancelable(true).setNegativeButton(2131296268, new ck(this)).setPositiveButton(2131296270, new bk(this)).setOnCancelListener(new ak(this)).create();
        break;
        localObject2 = localSpannableStringBuilder1;
      }
      localObject1 = new ProgressDialog(this);
      ((ProgressDialog)localObject1).setMessage(getString(2131296394));
      ((ProgressDialog)localObject1).setIndeterminate(true);
      ((ProgressDialog)localObject1).setCancelable(false);
      continue;
      localObject1 = new AlertDialog.Builder(this).setMessage(2131296943).setNeutralButton(2131296270, new ek(this)).create();
    }
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    Resources localResources = getResources();
    String str = getString(2131296322);
    paramMenu.add(0, 1, 0, 2131296461).setIcon(2130838481);
    paramMenu.add(0, 2, 0, 2131296318).setIcon(2130838466);
    paramMenu.add(0, 0, 0, str).setIcon(localResources.getDrawable(2130838478));
    paramMenu.add(0, 3, 0, 2131296676).setIcon(2130838470);
    return true;
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.Q.a();
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    boolean bool = DialogToastListActivity.f;
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      return true;
      a(true);
      continue;
      Intent localIntent1 = new Intent(T[17], ContactsContract.Contacts.CONTENT_URI);
      localIntent1.setComponent(localIntent1.resolveActivity(getPackageManager()));
      if (localIntent1.getComponent() != null)
      {
        startActivity(localIntent1);
        if (!bool);
      }
      else
      {
        try
        {
          Intent localIntent2 = getPackageManager().getLaunchIntentForPackage(T[15]);
          if (localIntent2 == null)
          {
            App.i();
            if (!bool)
              continue;
          }
          startActivity(localIntent2);
        }
        catch (ActivityNotFoundException localActivityNotFoundException)
        {
          g5.c(T[16]);
          App.i();
        }
        continue;
        App.a(this, this);
        continue;
        i();
      }
    }
  }

  public void onPause()
  {
    App.b(this);
    j2.b(this);
    super.onPause();
  }

  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    super.onRestoreInstanceState(paramBundle);
    String str = paramBundle.getString(T[2]);
    if (str != null)
      this.n = App.w.a(str, null);
    this.C = ((Intent)paramBundle.getParcelable(T[1]));
  }

  public void onResume()
  {
    super.onResume();
    if (!D)
      e();
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (this.n != null)
      paramBundle.putCharSequence(T[2], this.n.b);
    if (this.C != null)
      paramBundle.putParcelable(T[1], this.C);
  }

  public boolean onSearchRequested()
  {
    if (!this.P)
    {
      findViewById(2131558526).setVisibility(0);
      findViewById(2131558530).setVisibility(8);
      this.I.toggleSoftInput(0, 0);
      this.J.requestFocus();
      this.J.setText("");
      this.P = true;
      this.H.clearTextFilter();
      d(null);
      this.m.notifyDataSetChanged();
    }
    return false;
  }
}