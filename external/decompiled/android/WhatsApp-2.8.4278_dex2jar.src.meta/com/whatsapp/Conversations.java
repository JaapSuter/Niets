package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AsyncPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract.Contacts;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.ImageButton;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Conversations extends DialogToastListActivity
  implements uk
{
  static zq A;
  private static final String[] C;
  private static boolean h;
  private static Conversations i;
  private static zq j;
  private static zq k;
  final TextWatcher B = new wo(this);
  private Handler g = new Handler();
  private pj l = new pj();
  private HashMap<String, fp> m = new HashMap();
  public HashMap<uq, uq> n = new HashMap();
  ne o;
  ListView p;
  InputMethodManager q;
  EditText r;
  boolean s = false;
  ArrayList<String> t;
  private ImageButton u;
  private ImageButton v;
  private String w;
  private boolean x;
  private ep y = null;
  String z = null;

  static
  {
    String[] arrayOfString = new String[40];
    char[] arrayOfChar1 = "A\026p]\t@,P\034Q,W\bK\007".toCharArray();
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
    if (i1 <= i2)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "F\034rN\030W��}L\024J\035o\027\036J\035h]\005QSoA\016Q\026q\030\036J\035hY\036QSpQ\016QSW\bI\027<V\022QSzW\bK\027".toCharArray();
      int i5 = arrayOfChar2.length;
      i6 = 0;
      if (i5 <= i6)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "U\033sV\030".toCharArray();
        int i9 = arrayOfChar3.length;
        i10 = 0;
        if (i9 > i10)
          break label1697;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "S\035x\026\034K\027nW\024A]M\017V\034n\026\024Q\026q\027\036J\035hY\036Q".toCharArray();
        int i13 = arrayOfChar4.length;
        i14 = 0;
        if (i13 > i14)
          break label1789;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "D\035xJ\022L\0272Q\023Q\026rLSD\020hQ\022K]Uv.`!Hg2w,Y|4q".toCharArray();
        int i17 = arrayOfChar5.length;
        i18 = 0;
        if (i17 > i18)
          break label1881;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "D\035xJ\022L\0272Q\023Q\026rLSD\020hQ\022K]Uv.`!H".toCharArray();
        int i21 = arrayOfChar6.length;
        i22 = 0;
        if (i21 > i22)
          break label1973;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "U\033sV\030z\007eH\030".toCharArray();
        int i25 = arrayOfChar7.length;
        i26 = 0;
        if (i25 > i26)
          break label2065;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "F\034rN\030W��}L\024J\035o\027\031@\037yL\030\n\024nW\bUI".toCharArray();
        int i29 = arrayOfChar8.length;
        i30 = 0;
        if (i29 > i30)
          break label2157;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "I\022eW\bQ,uV\033I\022h]\017".toCharArray();
        int i33 = arrayOfChar9.length;
        i34 = 0;
        if (i33 > i34)
          break label2249;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "L\035lM\tz\036yL\025J\027".toCharArray();
        int i37 = arrayOfChar10.length;
        i38 = 0;
        if (i37 > i38)
          break label2341;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "F\034rN\030W��}L\024J\035o\027\036W\026}L\030".toCharArray();
        int i41 = arrayOfChar11.length;
        i42 = 0;
        if (i41 > i42)
          break label2433;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "F\034rN\030W��}L\024J\035o\030\037J\006r[\030\005\007s\030\020D\032r".toCharArray();
        int i45 = arrayOfChar12.length;
        i46 = 0;
        if (i45 > i46)
          break label2525;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "F\034rN\030W��}L\024J\035o\027\036I\034SPR\001sV\032".toCharArray();
        int i49 = arrayOfChar13.length;
        i50 = 0;
        if (i49 > i50)
          break label2617;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "F\034rN\030W��}L\024J\035o\027\016R^y@\rL\001y\\".toCharArray();
        int i53 = arrayOfChar14.length;
        i54 = 0;
        if (i53 > i54)
          break label2709;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "F\034rN\030W��}L\024J\035o\027\036W\026}L\030\n\035s\025\020@^sJPH��{K\tJ\001y\025\031G".toCharArray();
        int i57 = arrayOfChar15.length;
        i58 = 0;
        if (i57 > i58)
          break label2801;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "F\034rN\030W��}L\024J\035o\027\032W\034iHRW\026zJ\030V\033H]\020U4nW\bU%u]\n\005".toCharArray();
        int i61 = arrayOfChar16.length;
        i62 = 0;
        if (i61 > i62)
          break label2893;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "F\034rN\030W��}L\024J\035o\027\031L\022pW\032\b\037s_\024K^zY\024I\026x".toCharArray();
        int i65 = arrayOfChar17.length;
        i66 = 0;
        if (i65 > i66)
          break label2985;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "F\034rN\030W��}L\024J\035o\027\031L\022pW\032\b��s^\tR\022n]P@\013lQ\017@\027".toCharArray();
        int i69 = arrayOfChar18.length;
        i70 = 0;
        if (i69 > i70)
          break label3077;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "F\034rN\030W��}L\024J\035o\027\031L\022pW\032\005\007nA\024K\024<L\022\005��tW\n\0057Uy1j4Co<w=Ck8w%U{8z6Dh4w2Hq2k_<Z\bQSq]\016V\022{]]U\022nY\020@\007yJ]L��<V\bI\037=".toCharArray();
        int i73 = arrayOfChar19.length;
        i74 = 0;
        if (i73 > i74)
          break label3169;
        arrayOfString[18] = new String(arrayOfChar19).intern();
        arrayOfChar20 = "F\034rN\030W��}L\024J\035o\027\031L\022pW\032\b��s^\tR\022n]PD\021sM\t\b\007s\025\030]\003uJ\030".toCharArray();
        int i77 = arrayOfChar20.length;
        i78 = 0;
        if (i77 > i78)
          break label3261;
        arrayOfString[19] = new String(arrayOfChar20).intern();
        arrayOfChar21 = "F\034rN\030W��}L\024J\035o\027\031L\022pW\032\b\020pW\036N^kJ\022K\024".toCharArray();
        int i81 = arrayOfChar21.length;
        i82 = 0;
        if (i81 > i82)
          break label3353;
        arrayOfString[20] = new String(arrayOfChar21).intern();
        arrayOfChar22 = "F\034rN\030W��}L\024J\035o\027\rD\006o]".toCharArray();
        int i85 = arrayOfChar22.length;
        i86 = 0;
        if (i85 > i86)
          break label3445;
        arrayOfString[21] = new String(arrayOfChar22).intern();
        arrayOfChar23 = "D\035xJ\022L\0272Q\023Q\026rLSD\020hQ\022K]Jq8r".toCharArray();
        int i89 = arrayOfChar23.length;
        i90 = 0;
        if (i89 > i90)
          break label3537;
        arrayOfString[22] = new String(arrayOfChar23).intern();
        arrayOfChar24 = "F\034rN\030W��}L\024J\035o\027\022U\007uW\023V\\rW\024K\007yV\t\n��eK\t@\0361[\022K\007}[\tV^}H\r\b\035sLPC\034iV\031".toCharArray();
        int i93 = arrayOfChar24.length;
        i94 = 0;
        if (i93 > i94)
          break label3629;
        arrayOfString[23] = new String(arrayOfChar24).intern();
        arrayOfChar25 = "F\034q\026\034K\027nW\024A]W\023Q\022L\016".toCharArray();
        int i97 = arrayOfChar25.length;
        i98 = 0;
        if (i97 > i98)
          break label3721;
        arrayOfString[24] = new String(arrayOfChar25).intern();
        arrayOfChar26 = "F\034rN\030W��}L\024J\035o\027\022U\007uW\023V\\oA\016Q\026q\025\036J\035hY\036Q��1Y\rU^rW\t\b\025sM\023A".toCharArray();
        int i101 = arrayOfChar26.length;
        i102 = 0;
        if (i101 > i102)
          break label3813;
        arrayOfString[25] = new String(arrayOfChar26).intern();
        arrayOfChar27 = "A\026oL".toCharArray();
        int i105 = arrayOfChar27.length;
        i106 = 0;
        if (i105 > i106)
          break label3905;
        arrayOfString[26] = new String(arrayOfChar27).intern();
        arrayOfChar28 = "F\034rN\030W��}L\024J\035o\027\036J\035h]\005Q\\rM\021I".toCharArray();
        int i109 = arrayOfChar28.length;
        i110 = 0;
        if (i109 > i110)
          break label3997;
        arrayOfString[27] = new String(arrayOfChar28).intern();
        arrayOfChar29 = "F\034rN\030W��}L\024J\035o\027\017@��iT\t\005\020sV\tD\020h\030\023J\007<Y\031A\026x".toCharArray();
        int i113 = arrayOfChar29.length;
        i114 = 0;
        if (i113 > i114)
          break label4089;
        arrayOfString[28] = new String(arrayOfChar29).intern();
        arrayOfChar30 = "F\034rN\030W��}L\024J\035o\027\017@��iT\t\n��wQ\r\n\020sV\tD\020h\030\023J\007<Y\031A\026x".toCharArray();
        int i117 = arrayOfChar30.length;
        i118 = 0;
        if (i117 > i118)
          break label4181;
        arrayOfString[29] = new String(arrayOfChar30).intern();
        arrayOfChar31 = "F\034rL\034F\007".toCharArray();
        int i121 = arrayOfChar31.length;
        i122 = 0;
        if (i121 > i122)
          break label4273;
        arrayOfString[30] = new String(arrayOfChar31).intern();
        arrayOfChar32 = "A\026p]\t@,{J\022P\003CQ\031".toCharArray();
        int i125 = arrayOfChar32.length;
        i126 = 0;
        if (i125 > i126)
          break label4365;
        arrayOfString[31] = new String(arrayOfChar32).intern();
        arrayOfChar33 = "F\034rN\030W��}L\024J\035o\027\016@\007x]\021@\007y[\025D\0073^\034L\037y\\".toCharArray();
        int i129 = arrayOfChar33.length;
        i130 = 0;
        if (i129 > i130)
          break label4457;
        arrayOfString[32] = new String(arrayOfChar33).intern();
        arrayOfChar34 = "K\034<Y\036Q\032j]]V\026oK\024J\035".toCharArray();
        int i133 = arrayOfChar34.length;
        i134 = 0;
        if (i133 > i134)
          break label4549;
        arrayOfString[33] = new String(arrayOfChar34).intern();
        arrayOfChar35 = "F\034rN\030W��}L\024J\035o\027\036J\035zQ\032F\033}V\032@\\oOP@\013lQ\017@\027".toCharArray();
        int i137 = arrayOfChar35.length;
        i138 = 0;
        if (i137 > i138)
          break label4641;
        arrayOfString[34] = new String(arrayOfChar35).intern();
        arrayOfChar36 = "F\034rN\030W��}L\024J\035o\027\036J\035zQ\032F\033}V\032@\\T\022F\0301O\017J\035{".toCharArray();
        int i141 = arrayOfChar36.length;
        i142 = 0;
        if (i141 > i142)
          break label4733;
        arrayOfString[35] = new String(arrayOfChar36).intern();
        arrayOfChar37 = "F\034rN\030W��}L\024J\035o\027\037D\020w".toCharArray();
        int i145 = arrayOfChar37.length;
        i146 = 0;
        if (i145 > i146)
          break label4825;
        arrayOfString[36] = new String(arrayOfChar37).intern();
        arrayOfChar38 = "F\034rN\030W��}L\024J\035o\027\031@��hJ\022\\".toCharArray();
        int i149 = arrayOfChar38.length;
        i150 = 0;
        if (i149 > i150)
          break label4917;
        arrayOfString[37] = new String(arrayOfChar38).intern();
        arrayOfChar39 = "F\034rN\030W��}L\024J\035o\027\017@��iU\030\n\035s\025\020@^sJPH��{K\tJ\001y\025\031G".toCharArray();
        int i153 = arrayOfChar39.length;
        i154 = 0;
        if (i153 > i154)
          break label5009;
        arrayOfString[38] = new String(arrayOfChar39).intern();
        arrayOfChar40 = "F\034rN\030W��}L\024J\035o\027\017@��iU\030".toCharArray();
        int i157 = arrayOfChar40.length;
        i158 = 0;
        if (i157 > i158)
          break label5101;
        arrayOfString[39] = new String(arrayOfChar40).intern();
        C = arrayOfString;
        h = false;
      }
    }
    else
    {
      int i3 = arrayOfChar1[i2];
      int i4;
      switch (i2 % 5)
      {
      default:
        i4 = 125;
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
        i4 = 37;
        continue;
        i4 = 115;
        continue;
        i4 = 28;
        continue;
        i4 = 56;
      }
    }
    int i7 = arrayOfChar2[i6];
    int i8;
    switch (i6 % 5)
    {
    default:
      i8 = 125;
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
      i8 = 37;
      continue;
      i8 = 115;
      continue;
      i8 = 28;
      continue;
      i8 = 56;
    }
    label1697: int i11 = arrayOfChar3[i10];
    int i12;
    switch (i10 % 5)
    {
    default:
      i12 = 125;
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
      i12 = 37;
      continue;
      i12 = 115;
      continue;
      i12 = 28;
      continue;
      i12 = 56;
    }
    label1789: int i15 = arrayOfChar4[i14];
    int i16;
    switch (i14 % 5)
    {
    default:
      i16 = 125;
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
      i16 = 37;
      continue;
      i16 = 115;
      continue;
      i16 = 28;
      continue;
      i16 = 56;
    }
    label1881: int i19 = arrayOfChar5[i18];
    int i20;
    switch (i18 % 5)
    {
    default:
      i20 = 125;
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
      i20 = 37;
      continue;
      i20 = 115;
      continue;
      i20 = 28;
      continue;
      i20 = 56;
    }
    label1973: int i23 = arrayOfChar6[i22];
    int i24;
    switch (i22 % 5)
    {
    default:
      i24 = 125;
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
      i24 = 37;
      continue;
      i24 = 115;
      continue;
      i24 = 28;
      continue;
      i24 = 56;
    }
    label2065: int i27 = arrayOfChar7[i26];
    int i28;
    switch (i26 % 5)
    {
    default:
      i28 = 125;
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
      i28 = 37;
      continue;
      i28 = 115;
      continue;
      i28 = 28;
      continue;
      i28 = 56;
    }
    label2157: int i31 = arrayOfChar8[i30];
    int i32;
    switch (i30 % 5)
    {
    default:
      i32 = 125;
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
      i32 = 37;
      continue;
      i32 = 115;
      continue;
      i32 = 28;
      continue;
      i32 = 56;
    }
    label2249: int i35 = arrayOfChar9[i34];
    int i36;
    switch (i34 % 5)
    {
    default:
      i36 = 125;
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
      i36 = 37;
      continue;
      i36 = 115;
      continue;
      i36 = 28;
      continue;
      i36 = 56;
    }
    label2341: int i39 = arrayOfChar10[i38];
    int i40;
    switch (i38 % 5)
    {
    default:
      i40 = 125;
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
      i40 = 37;
      continue;
      i40 = 115;
      continue;
      i40 = 28;
      continue;
      i40 = 56;
    }
    label2433: int i43 = arrayOfChar11[i42];
    int i44;
    switch (i42 % 5)
    {
    default:
      i44 = 125;
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
      i44 = 37;
      continue;
      i44 = 115;
      continue;
      i44 = 28;
      continue;
      i44 = 56;
    }
    label2525: int i47 = arrayOfChar12[i46];
    int i48;
    switch (i46 % 5)
    {
    default:
      i48 = 125;
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
      i48 = 37;
      continue;
      i48 = 115;
      continue;
      i48 = 28;
      continue;
      i48 = 56;
    }
    label2617: int i51 = arrayOfChar13[i50];
    int i52;
    switch (i50 % 5)
    {
    default:
      i52 = 125;
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
      i52 = 37;
      continue;
      i52 = 115;
      continue;
      i52 = 28;
      continue;
      i52 = 56;
    }
    label2709: int i55 = arrayOfChar14[i54];
    int i56;
    switch (i54 % 5)
    {
    default:
      i56 = 125;
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
      i56 = 37;
      continue;
      i56 = 115;
      continue;
      i56 = 28;
      continue;
      i56 = 56;
    }
    label2801: int i59 = arrayOfChar15[i58];
    int i60;
    switch (i58 % 5)
    {
    default:
      i60 = 125;
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
      i60 = 37;
      continue;
      i60 = 115;
      continue;
      i60 = 28;
      continue;
      i60 = 56;
    }
    label2893: int i63 = arrayOfChar16[i62];
    int i64;
    switch (i62 % 5)
    {
    default:
      i64 = 125;
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
      i64 = 37;
      continue;
      i64 = 115;
      continue;
      i64 = 28;
      continue;
      i64 = 56;
    }
    label2985: int i67 = arrayOfChar17[i66];
    int i68;
    switch (i66 % 5)
    {
    default:
      i68 = 125;
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
      i68 = 37;
      continue;
      i68 = 115;
      continue;
      i68 = 28;
      continue;
      i68 = 56;
    }
    label3077: int i71 = arrayOfChar18[i70];
    int i72;
    switch (i70 % 5)
    {
    default:
      i72 = 125;
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
      i72 = 37;
      continue;
      i72 = 115;
      continue;
      i72 = 28;
      continue;
      i72 = 56;
    }
    label3169: int i75 = arrayOfChar19[i74];
    int i76;
    switch (i74 % 5)
    {
    default:
      i76 = 125;
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
      i76 = 37;
      continue;
      i76 = 115;
      continue;
      i76 = 28;
      continue;
      i76 = 56;
    }
    label3261: int i79 = arrayOfChar20[i78];
    int i80;
    switch (i78 % 5)
    {
    default:
      i80 = 125;
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
      i80 = 37;
      continue;
      i80 = 115;
      continue;
      i80 = 28;
      continue;
      i80 = 56;
    }
    label3353: int i83 = arrayOfChar21[i82];
    int i84;
    switch (i82 % 5)
    {
    default:
      i84 = 125;
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
      i84 = 37;
      continue;
      i84 = 115;
      continue;
      i84 = 28;
      continue;
      i84 = 56;
    }
    label3445: int i87 = arrayOfChar22[i86];
    int i88;
    switch (i86 % 5)
    {
    default:
      i88 = 125;
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
      i88 = 37;
      continue;
      i88 = 115;
      continue;
      i88 = 28;
      continue;
      i88 = 56;
    }
    label3537: int i91 = arrayOfChar23[i90];
    int i92;
    switch (i90 % 5)
    {
    default:
      i92 = 125;
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
      i92 = 37;
      continue;
      i92 = 115;
      continue;
      i92 = 28;
      continue;
      i92 = 56;
    }
    label3629: int i95 = arrayOfChar24[i94];
    int i96;
    switch (i94 % 5)
    {
    default:
      i96 = 125;
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
      i96 = 37;
      continue;
      i96 = 115;
      continue;
      i96 = 28;
      continue;
      i96 = 56;
    }
    label3721: int i99 = arrayOfChar25[i98];
    int i100;
    switch (i98 % 5)
    {
    default:
      i100 = 125;
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
      i100 = 37;
      continue;
      i100 = 115;
      continue;
      i100 = 28;
      continue;
      i100 = 56;
    }
    label3813: int i103 = arrayOfChar26[i102];
    int i104;
    switch (i102 % 5)
    {
    default:
      i104 = 125;
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
      i104 = 37;
      continue;
      i104 = 115;
      continue;
      i104 = 28;
      continue;
      i104 = 56;
    }
    label3905: int i107 = arrayOfChar27[i106];
    int i108;
    switch (i106 % 5)
    {
    default:
      i108 = 125;
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
      i108 = 37;
      continue;
      i108 = 115;
      continue;
      i108 = 28;
      continue;
      i108 = 56;
    }
    label3997: int i111 = arrayOfChar28[i110];
    int i112;
    switch (i110 % 5)
    {
    default:
      i112 = 125;
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
      i112 = 37;
      continue;
      i112 = 115;
      continue;
      i112 = 28;
      continue;
      i112 = 56;
    }
    label4089: int i115 = arrayOfChar29[i114];
    int i116;
    switch (i114 % 5)
    {
    default:
      i116 = 125;
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
      i116 = 37;
      continue;
      i116 = 115;
      continue;
      i116 = 28;
      continue;
      i116 = 56;
    }
    label4181: int i119 = arrayOfChar30[i118];
    int i120;
    switch (i118 % 5)
    {
    default:
      i120 = 125;
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
      i120 = 37;
      continue;
      i120 = 115;
      continue;
      i120 = 28;
      continue;
      i120 = 56;
    }
    label4273: int i123 = arrayOfChar31[i122];
    int i124;
    switch (i122 % 5)
    {
    default:
      i124 = 125;
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
      i124 = 37;
      continue;
      i124 = 115;
      continue;
      i124 = 28;
      continue;
      i124 = 56;
    }
    label4365: int i127 = arrayOfChar32[i126];
    int i128;
    switch (i126 % 5)
    {
    default:
      i128 = 125;
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
      i128 = 37;
      continue;
      i128 = 115;
      continue;
      i128 = 28;
      continue;
      i128 = 56;
    }
    label4457: int i131 = arrayOfChar33[i130];
    int i132;
    switch (i130 % 5)
    {
    default:
      i132 = 125;
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
      i132 = 37;
      continue;
      i132 = 115;
      continue;
      i132 = 28;
      continue;
      i132 = 56;
    }
    label4549: int i135 = arrayOfChar34[i134];
    int i136;
    switch (i134 % 5)
    {
    default:
      i136 = 125;
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
      i136 = 37;
      continue;
      i136 = 115;
      continue;
      i136 = 28;
      continue;
      i136 = 56;
    }
    label4641: int i139 = arrayOfChar35[i138];
    int i140;
    switch (i138 % 5)
    {
    default:
      i140 = 125;
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
      i140 = 37;
      continue;
      i140 = 115;
      continue;
      i140 = 28;
      continue;
      i140 = 56;
    }
    label4733: int i143 = arrayOfChar36[i142];
    int i144;
    switch (i142 % 5)
    {
    default:
      i144 = 125;
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
      i144 = 37;
      continue;
      i144 = 115;
      continue;
      i144 = 28;
      continue;
      i144 = 56;
    }
    label4825: int i147 = arrayOfChar37[i146];
    int i148;
    switch (i146 % 5)
    {
    default:
      i148 = 125;
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
      i148 = 37;
      continue;
      i148 = 115;
      continue;
      i148 = 28;
      continue;
      i148 = 56;
    }
    label4917: int i151 = arrayOfChar38[i150];
    int i152;
    switch (i150 % 5)
    {
    default:
      i152 = 125;
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
      i152 = 37;
      continue;
      i152 = 115;
      continue;
      i152 = 28;
      continue;
      i152 = 56;
    }
    label5009: int i155 = arrayOfChar39[i154];
    int i156;
    switch (i154 % 5)
    {
    default:
      i156 = 125;
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
      i156 = 37;
      continue;
      i156 = 115;
      continue;
      i156 = 28;
      continue;
      i156 = 56;
    }
    label5101: int i159 = arrayOfChar40[i158];
    int i160;
    switch (i158 % 5)
    {
    default:
      i160 = 125;
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
      i160 = 37;
      continue;
      i160 = 115;
      continue;
      i160 = 28;
      continue;
      i160 = 56;
    }
  }

  public static Dialog a(Activity paramActivity)
  {
    d locald = new d(paramActivity, 2130903049, paramActivity);
    locald.setOnCancelListener(new ro(paramActivity));
    return locald;
  }

  public static void a(Activity paramActivity, int paramInt)
  {
    App.R = true;
    App.Mb.L();
    paramActivity.showDialog(paramInt);
  }

  private static void a(Conversations paramConversations)
  {
    i = paramConversations;
    h = true;
  }

  static void a(Conversations paramConversations, int paramInt)
  {
    paramConversations.b(paramInt);
  }

  static void a(Conversations paramConversations, boolean paramBoolean)
  {
    paramConversations.a(paramBoolean);
  }

  private void a(boolean paramBoolean)
  {
    if ((!paramBoolean) && (!isFinishing()))
      showDialog(0);
  }

  public static boolean a()
  {
    return h;
  }

  public static Dialog b(Activity paramActivity)
  {
    e locale = new e(paramActivity, 2130903126, paramActivity);
    locale.setOnCancelListener(new to(paramActivity));
    return locale;
  }

  public static Conversations b()
  {
    if (h)
      return i;
    throw new RuntimeException(C[33]);
  }

  private void b(int paramInt)
  {
    SharedPreferences.Editor localEditor = getSharedPreferences(getString(2131296258), 0).edit();
    localEditor.putInt(C[0], paramInt);
    if (!localEditor.commit())
      g5.d(C[32]);
  }

  private static void b(Conversations paramConversations)
  {
    if (i == paramConversations)
      h = false;
  }

  static ImageButton c(Conversations paramConversations)
  {
    return paramConversations.u;
  }

  private void c()
  {
    if ((!xp.e()) && (!xp.f()))
    {
      new eb(this, null).execute(new Void[0]);
      if (!DialogToastListActivity.f);
    }
    else
    {
      a(xp.d());
    }
  }

  private void d()
  {
    xp.c();
    new eb(this, null).execute(new Void[0]);
  }

  static void d(Conversations paramConversations)
  {
    paramConversations.d();
  }

  private int e()
  {
    return getSharedPreferences(getString(2131296258), 0).getInt(C[0], 0);
  }

  static Handler e(Conversations paramConversations)
  {
    return paramConversations.g;
  }

  private void e(String paramString)
  {
    if (this.o != null)
      this.o.notifyDataSetChanged();
  }

  static int f(Conversations paramConversations)
  {
    return paramConversations.e();
  }

  static HashMap g(Conversations paramConversations)
  {
    return paramConversations.m;
  }

  private void g()
  {
    this.z = eg.a(this, false);
    if (this.z != null)
      showDialog(2);
    eg.d = false;
    eg.e = false;
  }

  static ep h(Conversations paramConversations)
  {
    return paramConversations.y;
  }

  static pj i(Conversations paramConversations)
  {
    return paramConversations.l;
  }

  private void j()
  {
    if (this.o != null)
      this.o.notifyDataSetChanged();
  }

  static zq k()
  {
    return k;
  }

  static zq l()
  {
    return j;
  }

  public void a()
  {
    int i1 = App.w.f();
    View localView1 = findViewById(2131558622);
    View localView2 = findViewById(2131558620);
    if (i1 > 0)
    {
      localView2.setVisibility(0);
      this.p.setEmptyView(localView2);
      localView1.setVisibility(8);
      if (!DialogToastListActivity.f);
    }
    else
    {
      localView1.setVisibility(0);
      this.p.setEmptyView(localView1);
      localView2.setVisibility(8);
    }
  }

  public void a(String paramString)
  {
    e(paramString);
  }

  public void a(String paramString1, String paramString2, String paramString3, iu paramiu)
  {
    g5.b(C[15] + paramString1);
    this.p.post(new vo(this, paramString1, paramString3, paramString2, paramiu));
  }

  public void a(String paramString, boolean paramBoolean)
  {
    this.p.post(new uo(this, paramString, paramBoolean));
  }

  public void b(String paramString)
  {
  }

  public void d(String paramString)
  {
    e(paramString);
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

  public void f()
  {
    if (!this.x)
      showDialog(110);
  }

  public void h()
  {
    if (this.o != null)
    {
      if (this.s);
      this.o.notifyDataSetChanged();
    }
  }

  public void i()
  {
    j();
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    boolean bool = DialogToastListActivity.f;
    switch (paramInt1)
    {
    default:
    case 1:
    case 10:
    case 11:
    }
    while (true)
    {
      return;
      if (paramInt2 == -1)
      {
        String str = paramIntent.getStringExtra(C[30]);
        startActivity(Conversation.a(App.w.a(str, null)));
        if (bool)
        {
          if (paramInt2 == -1)
          {
            if ((paramIntent != null) && (paramIntent.getData() != null))
            {
              App.w.a(paramIntent.getData(), A);
              if (!bool);
            }
            else
            {
              App.w.b(A);
              if (!bool);
            }
          }
          else
            g5.b(C[28]);
          g.a(false);
          if (bool)
          {
            if (paramInt2 == -1)
            {
              App.w.b(A);
              if (!bool);
            }
            else
            {
              g5.b(C[29]);
            }
            g.a(false);
          }
        }
      }
    }
  }

  public void onBackPressed()
  {
    if (this.s)
    {
      g5.d(C[36]);
      findViewById(2131558526).setVisibility(8);
      findViewById(2131558460).setVisibility(0);
      this.s = false;
      this.o.getFilter().filter("");
      if (!DialogToastListActivity.f);
    }
    else
    {
      super.onBackPressed();
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    boolean bool = DialogToastListActivity.f;
    super.onConfigurationChanged(paramConfiguration);
    if (App.Mb.I())
    {
      g5.c(C[35]);
      removeDialog(113);
      a(this, 113);
      if (!bool);
    }
    else if (App.J())
    {
      g5.c(C[34]);
      removeDialog(114);
      a(this, 114);
      if (!bool);
    }
    else if (App.K())
    {
      showDialog(115);
    }
  }

  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    boolean bool1 = DialogToastListActivity.f;
    zq localzq = App.w.a(this.w, null);
    boolean bool2;
    switch (paramMenuItem.getItemId())
    {
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    default:
      bool2 = super.onContextItemSelected(paramMenuItem);
    case 0:
    case 1:
    case 2:
    case 3:
    case 5:
    case 4:
    case 12:
    }
    while (true)
    {
      return bool2;
      if (localzq.g != null)
        ContactInfo.a(localzq, this);
      bool2 = true;
      continue;
      if (localzq.o())
      {
        g5.b(C[7] + localzq);
        if (eu.j)
        {
          App.a(this, 2131296471, 0);
          if (!bool1);
        }
        else
        {
          j = localzq;
          showDialog(7);
          if (!bool1);
        }
      }
      else
      {
        k = localzq;
        showDialog(10);
      }
      bool2 = true;
      continue;
      A = localzq;
      String str = localzq.a();
      Intent localIntent2 = new Intent(C[5], ContactsContract.Contacts.CONTENT_URI);
      localIntent2.putExtra(C[2], str);
      localIntent2.setComponent(localIntent2.resolveActivity(getPackageManager()));
      if (localIntent2.getComponent() != null)
      {
        g.a(true);
        startActivityForResult(localIntent2, 10);
        if (!bool1);
      }
      else
      {
        g5.c(C[1]);
        App.h();
      }
      bool2 = true;
      continue;
      A = localzq;
      g.a(true);
      Intent localIntent1 = new Intent(C[4]);
      localIntent1.setType(C[3]);
      localIntent1.putExtra(C[2], A.b());
      localIntent1.putExtra(C[6], 2);
      localIntent1.setFlags(524288);
      startActivityForResult(localIntent1, 11);
      bool2 = true;
      continue;
      if ((App.mb) || (App.lb))
        if (!App.tb())
          break label424;
      label424: for (int i1 = 2131296438; ; i1 = 2131296439)
      {
        a(i1);
        if (bool1)
          showDialog(12);
        bool2 = true;
        break;
      }
      App.w.h(localzq);
      bool2 = true;
      continue;
      GroupChatInfo.a(localzq, this);
      bool2 = true;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool = DialogToastListActivity.f;
    super.onCreate(paramBundle);
    if ((App.bb == null) || (!App.z.l()) || (App.c(this) != 3))
    {
      g5.b(C[14]);
      App.d(C[11]);
      startActivity(new Intent(this, Main.class));
      finish();
    }
    while (true)
    {
      return;
      if (this.y == null)
      {
        this.y = new ep();
        this.y.a = getString(2131296893);
        this.y.c = getString(2131296871);
        this.y.b = getString(2131296872);
        this.y.e = getString(2131296873);
        this.y.d = getString(2131296874);
        this.y.f = getString(2131296870);
        this.y.g = getString(2131296875);
        this.y.h = getString(2131296876);
        this.y.i = getString(2131296644);
        this.y.j = getString(2131296645);
        this.y.k = getString(2131296646);
        this.y.l = getString(2131296647);
        this.y.m = getString(2131296879);
        this.y.n = getString(2131296878);
        this.y.o = getString(2131296764);
        this.y.p = getString(2131296765);
        this.y.q = getString(2131296766);
        this.y.r = getString(2131296768);
        this.y.s = getString(2131296767);
        this.y.t = getString(2131296854);
      }
      App.oc.stop();
      a(this);
      g5.b(C[10]);
      App.z();
      setContentView(2130903077);
      this.q = ((InputMethodManager)getSystemService(C[9]));
      this.r = ((EditText)findViewById(2131558528));
      this.r.addTextChangedListener(this.B);
      this.r.setGravity(TextEmojiLabel.a(this.r.getText().toString()));
      this.u = ((ImageButton)findViewById(2131558529));
      this.u.setOnClickListener(new oo(this));
      this.v = ((ImageButton)findViewById(2131558533));
      this.v.setOnClickListener(new xo(this));
      App.a(this);
      this.t = gp.a;
      this.p = getListView();
      this.p.setFastScrollEnabled(true);
      this.p.setScrollbarFadingEnabled(true);
      a();
      if (e() < 3)
      {
        View localView = ((LayoutInflater)getBaseContext().getSystemService(C[8])).inflate(2130903080, this.p, false);
        this.p.addFooterView(localView, null, false);
      }
      this.o = new ne(this);
      this.p.setDividerHeight(0);
      this.p.setAdapter(this.o);
      this.p.setOnItemClickListener(new yo(this));
      registerForContextMenu(this.p);
      if (App.Mb.I())
      {
        g5.c(C[12]);
        a(this, 113);
        if (!bool);
      }
      else if (App.J())
      {
        g5.c(C[13]);
        a(this, 114);
        if (!bool);
      }
      else if (App.K())
      {
        showDialog(115);
        if (!bool);
      }
      else
      {
        zo localzo = new zo(this);
        findViewById(2131558618).setOnClickListener(localzo);
        ap localap = new ap(this);
        findViewById(2131558661).setOnClickListener(localap);
      }
      App.oc.stop();
      g();
      c();
    }
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    boolean bool = DialogToastListActivity.f;
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    fp localfp = (fp)((AdapterView.AdapterContextMenuInfo)paramContextMenuInfo).targetView.getTag();
    if (localfp == null)
      g5.b(C[27]);
    while (true)
    {
      return;
      this.w = localfp.l;
      zq localzq = App.w.a(this.w, null);
      if (localzq.p())
      {
        if (!localzq.b.contains(App.E))
          paramContextMenu.add(0, 1, 0, getString(2131296468));
      }
      else if (!localzq.b.equals(eu.c()))
        if (localzq.g == null)
        {
          if (localzq.o())
          {
            if (localfp.c.getVisibility() != 0)
            {
              paramContextMenu.add(0, 12, 0, getString(2131296487));
              if (!bool);
            }
          }
          else
          {
            paramContextMenu.add(0, 2, 0, getString(2131296810));
            paramContextMenu.add(0, 3, 0, getString(2131296811));
            if (!bool);
          }
        }
        else
        {
          paramContextMenu.add(0, 0, 0, getString(2131296494));
          paramContextMenu.add(0, 4, 0, getString(2131296474));
          if (localzq.o())
          {
            paramContextMenu.add(0, 1, 0, getString(2131296468));
            if (!bool);
          }
          else
          {
            paramContextMenu.add(0, 1, 0, getString(2131296467));
          }
          if (App.z.j(this.w) != null)
            paramContextMenu.add(0, 5, 0, getString(2131296502));
        }
    }
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    Object localObject1 = null;
    switch (paramInt)
    {
    default:
      localObject1 = super.onCreateDialog(paramInt);
    case 5:
    case 1:
    case 0:
    case 2:
    case 3:
    case 4:
    case 6:
    case 100:
    case 9:
    case 10:
    case 7:
    case 11:
    case 12:
    case 114:
    case 110:
    case 115:
    case 113:
    }
    while (true)
    {
      return localObject1;
      localObject1 = new ProgressDialog(this);
      ((ProgressDialog)localObject1).setTitle(getString(2131296393));
      ((ProgressDialog)localObject1).setMessage(getString(2131296394));
      ((ProgressDialog)localObject1).setIndeterminate(true);
      ((ProgressDialog)localObject1).setCancelable(false);
      continue;
      localObject1 = new ProgressDialog(this);
      ((ProgressDialog)localObject1).setTitle(getString(2131296393));
      ((ProgressDialog)localObject1).setMessage(getString(2131296394));
      ((ProgressDialog)localObject1).setIndeterminate(true);
      ((ProgressDialog)localObject1).setCancelable(false);
      continue;
      bp localbp = new bp(this);
      AlertDialog.Builder localBuilder3 = new AlertDialog.Builder(this).setTitle(2131296326);
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = getString(2131296328);
      localObject1 = localBuilder3.setMessage(getString(2131296329, arrayOfObject3)).setCancelable(false).setPositiveButton(2131296331, localbp).create();
      continue;
      if (this.z != null)
      {
        cp localcp = new cp(this);
        dp localdp = new dp(this);
        localObject1 = new AlertDialog.Builder(this).setMessage(this.z).setCancelable(false).setPositiveButton(2131296272, localcp).setNegativeButton(2131296273, null).create();
        ((Dialog)localObject1).setOnDismissListener(localdp);
      }
      else
      {
        g5.c(C[18]);
        continue;
        bo localbo = new bo(this);
        localObject1 = new AlertDialog.Builder(this).setMessage(2131296477).setPositiveButton(2131296270, localbo).setNeutralButton(2131296268, null).create();
        continue;
        eo localeo = new eo(this);
        localObject1 = new AlertDialog.Builder(this).setMessage(2131296479).setPositiveButton(2131296270, localeo).setNeutralButton(2131296268, null).create();
        continue;
        localObject1 = new ProgressDialog(this);
        ((ProgressDialog)localObject1).setTitle(getString(2131296480));
        ((ProgressDialog)localObject1).setMessage(getString(2131296394));
        ((ProgressDialog)localObject1).setIndeterminate(true);
        ((ProgressDialog)localObject1).setCancelable(false);
        continue;
        localObject1 = new ProgressDialog(this);
        ((ProgressDialog)localObject1).setTitle(getString(2131296935));
        ((ProgressDialog)localObject1).setMessage(getString(2131296936));
        ((ProgressDialog)localObject1).setIndeterminate(true);
        ((ProgressDialog)localObject1).setCancelable(false);
        continue;
        localObject1 = new AlertDialog.Builder(this).setMessage(2131296548).setNeutralButton(2131296270, new go(this)).create();
        continue;
        if (k != null)
        {
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = k.b();
          Object localObject3 = getString(2131296473, arrayOfObject2);
          SpannableStringBuilder localSpannableStringBuilder2 = v4.a((String)localObject3, getBaseContext());
          AlertDialog.Builder localBuilder2 = new AlertDialog.Builder(this);
          if (localSpannableStringBuilder2 == null);
          while (true)
          {
            localObject1 = localBuilder2.setTitle((CharSequence)localObject3).setCancelable(true).setNegativeButton(2131296268, new io(this)).setPositiveButton(2131296272, new ho(this)).create();
            break;
            localObject3 = localSpannableStringBuilder2;
          }
          if (j != null)
          {
            Object[] arrayOfObject1 = new Object[1];
            arrayOfObject1[0] = j.b();
            Object localObject2 = getString(2131296472, arrayOfObject1);
            SpannableStringBuilder localSpannableStringBuilder1 = v4.a((String)localObject2, getBaseContext());
            AlertDialog.Builder localBuilder1 = new AlertDialog.Builder(this);
            if (localSpannableStringBuilder1 == null);
            while (true)
            {
              localObject1 = localBuilder1.setMessage((CharSequence)localObject2).setCancelable(true).setNegativeButton(2131296268, new ko(this)).setPositiveButton(2131296270, new jo(this)).create();
              break;
              localObject2 = localSpannableStringBuilder1;
            }
            localObject1 = new AlertDialog.Builder(this).setMessage(2131296287).setNeutralButton(2131296270, new lo(this)).create();
            continue;
            if (this.w != null)
            {
              zq localzq = App.w.a(this.w, null);
              localObject1 = new AlertDialog.Builder(this).setMessage(2131296561).setPositiveButton(2131296562, new no(this, localzq)).setNeutralButton(2131296563, new mo(this, localzq)).create();
              continue;
              g5.c(C[17]);
              localObject1 = b(this);
              continue;
              g5.c(C[16]);
              localObject1 = new AlertDialog.Builder(this).setMessage(2131296413).setCancelable(false).setNeutralButton(2131296970, new po(this)).create();
              continue;
              g5.b(C[19]);
              localObject1 = eg.a(this);
              continue;
              g5.c(C[20]);
              localObject1 = a(this);
            }
          }
        }
      }
    }
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    Resources localResources = getResources();
    paramMenu.add(0, 0, 0, 2131296316).setIcon(2130838477).setAlphabeticShortcut('n');
    paramMenu.add(0, 10, 0, 2131296317).setIcon(2130838469).setAlphabeticShortcut('g');
    paramMenu.add(0, 1, 0, 2131296319).setIcon(2130838483).setAlphabeticShortcut('s');
    paramMenu.add(0, 4, 0, 2131296318).setIcon(2130838466).setAlphabeticShortcut('c');
    paramMenu.add(0, 2, 0, 2131296320).setIcon(2130838480).setAlphabeticShortcut('o');
    if (App.f == 3)
      paramMenu.add(0, 3, 0, 2131296321).setIcon(localResources.getDrawable(2130838504));
    SubMenu localSubMenu = paramMenu.addSubMenu(0, 5, 0, 2131296482);
    localSubMenu.clearHeader();
    localSubMenu.getItem().setIcon(2130838473);
    localSubMenu.add(0, 7, 0, 2131296281);
    localSubMenu.add(0, 6, 0, 2131296476);
    localSubMenu.add(0, 8, 0, 2131296478);
    localSubMenu.add(0, 9, 0, 2131296325);
    return true;
  }

  public void onDestroy()
  {
    g5.b(C[37]);
    super.onDestroy();
    App.b(this);
    b(this);
    A = null;
    this.m.clear();
    this.l.a();
  }

  public void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    String str = paramIntent.getStringExtra(C[31]);
    if ((str != null) && (str.length() > 0))
    {
      a(str, true);
      u8 localu8 = new u8(this, str);
      localu8.setPriority(1);
      localu8.start();
    }
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    boolean bool1 = false;
    boolean bool2 = DialogToastListActivity.f;
    switch (paramMenuItem.getItemId())
    {
    case 5:
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 7:
    case 6:
    case 8:
    case 9:
      while (true)
      {
        return bool1;
        startActivityForResult(new Intent(this, ContactPicker.class), 1);
        bool1 = true;
        continue;
        startActivity(new Intent(this, SetStatus.class));
        bool1 = true;
        continue;
        startActivity(new Intent(this, Settings.class));
        bool1 = true;
        continue;
        finish();
        startActivity(new Intent(this, Advanced.class));
        bool1 = true;
        continue;
        Intent localIntent2 = new Intent(C[22], ContactsContract.Contacts.CONTENT_URI);
        localIntent2.setComponent(localIntent2.resolveActivity(getPackageManager()));
        if (localIntent2.getComponent() != null)
        {
          startActivity(localIntent2);
          if (!bool2)
            break label255;
        }
        try
        {
          Intent localIntent3 = getPackageManager().getLaunchIntentForPackage(C[24]);
          if (localIntent3 == null)
          {
            g5.c(C[23]);
            showDialog(11);
            if (!bool2);
          }
          else
          {
            startActivity(localIntent3);
          }
          label255: bool1 = true;
        }
        catch (ActivityNotFoundException localActivityNotFoundException)
        {
          while (true)
          {
            g5.c(C[25]);
            showDialog(11);
          }
        }
        onSearchRequested();
        bool1 = true;
        continue;
        showDialog(3);
        bool1 = true;
        continue;
        showDialog(4);
        bool1 = true;
        continue;
        Intent localIntent1 = new Intent(this, MultipleContactPicker.class);
        localIntent1.putExtra(C[26], 1);
        startActivity(localIntent1);
        bool1 = true;
      }
    case 10:
    }
    Iterator localIterator = gp.a.iterator();
    int i1 = 0;
    label358: int i2;
    if (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((eu.f(str)) && (str.contains(App.c())) && (!zq.c(str)))
      {
        i2 = i1 + 1;
        label413: if (!bool2);
      }
    }
    while (true)
    {
      if (i2 >= eu.a)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[bool1] = Integer.valueOf(eu.a);
        c(getString(2131296877, arrayOfObject));
        bool1 = true;
        break;
      }
      startActivity(new Intent(this, EditGroupSubject.class));
      bool1 = true;
      break;
      i1 = i2;
      break label358;
      i2 = i1;
      break label413;
      i2 = i1;
    }
  }

  public void onPause()
  {
    boolean bool = DialogToastListActivity.f;
    g5.b(C[21]);
    this.x = true;
    super.onPause();
    int i1 = this.p.getFirstVisiblePosition();
    do
    {
      if (i1 >= this.p.getLastVisiblePosition())
        break;
      zq localzq = gp.a(this.o.a(i1));
      this.n.put(localzq.g, localzq.g);
      i1++;
    }
    while (!bool);
  }

  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    boolean bool = DialogToastListActivity.f;
    if (this.o.getCount() > 0)
    {
      paramMenu.findItem(6).setVisible(true);
      paramMenu.findItem(8).setVisible(true);
      if (!bool);
    }
    else
    {
      paramMenu.findItem(6).setVisible(false);
      paramMenu.findItem(8).setVisible(false);
    }
    MenuItem localMenuItem = paramMenu.findItem(5);
    if (localMenuItem.getSubMenu().hasVisibleItems())
    {
      localMenuItem.setVisible(true);
      if (!bool);
    }
    else
    {
      localMenuItem.setVisible(false);
    }
    return super.onCreateOptionsMenu(paramMenu);
  }

  public void onResume()
  {
    boolean bool = DialogToastListActivity.f;
    g5.b(C[39]);
    this.x = false;
    super.onResume();
    if ((App.bb == null) || (!App.z.l()) || (App.c(this) != 3))
    {
      g5.b(C[38]);
      App.d(C[11]);
      startActivity(new Intent(this, Main.class));
      finish();
    }
    while (true)
    {
      return;
      n5.a();
      App.oc.stop();
      if (App.a())
      {
        showDialog(110);
        if (!bool);
      }
      else if (App.H != null)
      {
        a(this, 113);
        if (!bool);
      }
      else if (App.p)
      {
        a(this, 114);
        if (!bool);
      }
      else if (App.K())
      {
        showDialog(115);
      }
    }
  }

  public boolean onSearchRequested()
  {
    if (!this.s)
    {
      findViewById(2131558526).setVisibility(0);
      findViewById(2131558460).setVisibility(8);
      this.q.toggleSoftInput(0, 0);
      this.r.requestFocus();
      this.r.setText("");
      this.s = true;
      this.p.clearTextFilter();
    }
    return false;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.Conversations
 * JD-Core Version:    0.6.1
 */