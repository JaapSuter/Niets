package com.whatsapp.messaging;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Messenger;
import com.whatsapp.App;
import com.whatsapp.g5;
import com.whatsapp.jz;
import com.whatsapp.qz;
import com.whatsapp.sz;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import wb;

public class m extends HandlerThread
{
  private static final String[] D;
  public static final int[] a;
  public static int y;
  public static boolean z;
  final String A = D[22];
  private final t B = new u(this);
  private HashSet<String> C = new HashSet();
  private x b;
  private n c;
  private final Messenger d;
  private Messenger e;
  private Messenger f;
  private Messenger g;
  private Messenger h;
  private b i;
  private e j;
  private c k;
  private a l;
  private boolean m;
  private boolean n = false;
  private boolean o = false;
  private boolean p = false;
  private qz q;
  private Socket r;
  private final Context s;
  private final String t;
  private final jz u;
  private int v = -1;
  private List<InetAddress> w = null;
  private SharedPreferences x = null;

  static
  {
    String[] arrayOfString = new String[37];
    char[] arrayOfChar1 = "\006\025'KA\030\032*PI\t\r9IE\t\0369ME\n\034)LX".toCharArray();
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
    if (i1 <= i2)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "&5\007ka".toCharArray();
      int i5 = arrayOfChar2.length;
      i6 = 0;
      if (i5 <= i6)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "?4\026i#$6\bwi$-\017vbh5\t~e)".toCharArray();
        int i9 = arrayOfChar3.length;
        i10 = 0;
        if (i9 > i10)
          break label1613;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "?4\026i#$6\bwi$-\017vbh:\twb\":\0226b(-Kx`+6\021|hh*\tx08\024|!\"!\026p~\"=".toCharArray();
        int i13 = arrayOfChar4.length;
        i14 = 0;
        if (i13 > i14)
          break label1705;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "?4\026i#$6\bwi$-\017vbh:\twb\":\0226b(-Kx`+6\021|hh5\t~e)t��xe+<\002".toCharArray();
        int i17 = arrayOfChar5.length;
        i18 = 0;
        if (i17 > i18)
          break label1797;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "?4\026i#$6\bwi$-\017vbh*\tzg\"-Iz`(*\003}".toCharArray();
        int i21 = arrayOfChar6.length;
        i22 = 0;
        if (i21 > i22)
          break label1889;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = ")6Fwc):\0039e)y\005qm+5\003wk\"".toCharArray();
        int i25 = arrayOfChar7.length;
        i26 = 0;
        if (i25 > i26)
          break label1981;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "?4\026i#$6\bwi$-\017vbh*\tzg\"-Iwi?-Kic5-Izc5+\023ixj*\022ki&4K|t$<\026me(7F".toCharArray();
        int i29 = arrayOfChar8.length;
        i30 = 0;
        if (i29 > i30)
          break label2073;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "?4\026i#$6\bwi$-\017vbh.\024px\"v\005ue\"7\022Fo(7��pkh>\003m".toCharArray();
        int i33 = arrayOfChar9.length;
        i34 = 0;
        if (i33 > i34)
          break label2165;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "?4\026i#$6\bwi$-\017vbh.\024px\"v\004uc$2\np3v\001|x".toCharArray();
        int i37 = arrayOfChar10.length;
        i38 = 0;
        if (i37 > i38)
          break label2257;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "?4\026i#$6\bwi$-\017vbh*\tzg\"-Izc)7\003zx\"=".toCharArray();
        int i41 = arrayOfChar11.length;
        i42 = 0;
        if (i41 > i42)
          break label2349;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "?4\026i#$6\bwi$-\017vbh:\twb\":\022".toCharArray();
        int i45 = arrayOfChar12.length;
        i46 = 0;
        if (i45 > i46)
          break label2441;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "?4\026i#$6\bwi$-\017vbh5\t~e)v��xe+,\024|,".toCharArray();
        int i49 = arrayOfChar13.length;
        i50 = 0;
        if (i49 > i50)
          break label2533;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "\025\034%O,".toCharArray();
        int i53 = arrayOfChar14.length;
        i54 = 0;
        if (i53 > i54)
          break label2625;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "?4\026i#$6\bwi$-\017vbh*\tzg\"-Izc)7\003zx.7\0019".toCharArray();
        int i57 = arrayOfChar15.length;
        i58 = 0;
        if (i57 > i58)
          break label2717;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "?4\026i#$6\bwi$-\017vbh*\tzg\"-Iwi?-Kic5-Ipcj<\036zi7-\017vb".toCharArray();
        int i61 = arrayOfChar16.length;
        i62 = 0;
        if (i61 > i62)
          break label2809;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "?4\026i#$6\bwi$-\017vbh:\twb\":\0226b(-Kx`+6\021|hh:\nvo,".toCharArray();
        int i65 = arrayOfChar17.length;
        i66 = 0;
        if (i65 > i66)
          break label2901;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "4w\021qm3*\007i|i7\003m".toCharArray();
        int i69 = arrayOfChar18.length;
        i70 = 0;
        if (i69 > i70)
          break label2993;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "%8\0029b(7\005|,.7Fzd&5\n|b <".toCharArray();
        int i73 = arrayOfChar19.length;
        i74 = 0;
        if (i73 > i74)
          break label3085;
        arrayOfString[18] = new String(arrayOfChar19).intern();
        arrayOfChar20 = "\024\034(],".toCharArray();
        int i77 = arrayOfChar20.length;
        i78 = 0;
        if (i77 > i78)
          break label3177;
        arrayOfString[19] = new String(arrayOfChar20).intern();
        arrayOfChar21 = "?4\026i#$6\bwi$-\017vbh*\tzg\"-I}e4:\twb\":\0229".toCharArray();
        int i81 = arrayOfChar21.length;
        i82 = 0;
        if (i81 > i82)
          break label3269;
        arrayOfString[20] = new String(arrayOfChar21).intern();
        arrayOfChar22 = "$w\021qm3*\007i|i7\003m\"".toCharArray();
        int i85 = arrayOfChar22.length;
        i86 = 0;
        if (i85 > i86)
          break label3361;
        arrayOfString[21] = new String(arrayOfChar22).intern();
        arrayOfChar23 = ")<\036mS$19}m38".toCharArray();
        int i89 = arrayOfChar23.length;
        i90 = 0;
        if (i89 > i90)
          break label3453;
        arrayOfString[22] = new String(arrayOfChar23).intern();
        arrayOfChar24 = "?4\026i#$6\bwi$-\017vbh5\t~e)v��xe+,\024|#)<\036mS$19}m38Izc*4\017m".toCharArray();
        int i93 = arrayOfChar24.length;
        i94 = 0;
        if (i93 > i94)
          break label3545;
        arrayOfString[23] = new String(arrayOfChar24).intern();
        arrayOfChar25 = "\033w".toCharArray();
        int i97 = arrayOfChar25.length;
        i98 = 0;
        if (i97 > i98)
          break label3637;
        arrayOfString[24] = new String(arrayOfChar25).intern();
        arrayOfChar26 = "?4\026i#$6\bwi$-\017vbh>\003m!.)Km.5\003}".toCharArray();
        int i101 = arrayOfChar26.length;
        i102 = 0;
        if (i101 > i102)
          break label3729;
        arrayOfString[25] = new String(arrayOfChar26).intern();
        arrayOfChar27 = "\n\035S".toCharArray();
        int i105 = arrayOfChar27.length;
        i106 = 0;
        if (i105 > i106)
          break label3821;
        arrayOfString[26] = new String(arrayOfChar27).intern();
        arrayOfChar28 = "$8\b9b(-Fky)y\021px/6\023m,*=S".toCharArray();
        int i109 = arrayOfChar28.length;
        i110 = 0;
        if (i109 > i110)
          break label3913;
        arrayOfString[27] = new String(arrayOfChar28).intern();
        arrayOfChar29 = "?4\026iS$6\bwi$-\017vb\030-\016ki&=".toCharArray();
        int i113 = arrayOfChar29.length;
        i114 = 0;
        if (i113 > i114)
          break label4005;
        arrayOfString[28] = new String(arrayOfChar29).intern();
        arrayOfChar30 = "?4\026i#$6\bwi$-\017vbh(\023px".toCharArray();
        int i117 = arrayOfChar30.length;
        i118 = 0;
        if (i117 > i118)
          break label4097;
        arrayOfString[29] = new String(arrayOfChar30).intern();
        arrayOfChar31 = "?4\026i#$6\bwi$-\017vbh5\t~e)v\022pa\"6\023m".toCharArray();
        int i121 = arrayOfChar31.length;
        i122 = 0;
        if (i121 > i122)
          break label4189;
        arrayOfString[30] = new String(arrayOfChar31).intern();
        arrayOfChar32 = "?4\026i#$6\bwi$-\017vbh:\nv\"\n\tzg\"-F".toCharArray();
        int i125 = arrayOfChar32.length;
        i126 = 0;
        if (i125 > i126)
          break label4281;
        arrayOfString[31] = new String(arrayOfChar32).intern();
        arrayOfChar33 = "?4\026i#$6\bwi$-\017vbh*\tzg\"-Iz`(*\003".toCharArray();
        int i129 = arrayOfChar33.length;
        i130 = 0;
        if (i129 > i130)
          break label4373;
        arrayOfString[32] = new String(arrayOfChar33).intern();
        arrayOfChar34 = ")6Fp|g8\002}~\"*\025|g?\tlb#y��v~g".toCharArray();
        int i133 = arrayOfChar34.length;
        i134 = 0;
        if (i133 > i134)
          break label4465;
        arrayOfString[33] = new String(arrayOfChar34).intern();
        arrayOfChar35 = "?4\026i#$6\bwi$-\017vbh)\017wk30\013|c2-I|t70\024|hh0\001wc5<".toCharArray();
        int i137 = arrayOfChar35.length;
        i138 = 0;
        if (i137 > i138)
          break label4557;
        arrayOfString[34] = new String(arrayOfChar35).intern();
        arrayOfChar36 = "?4\026i#$6\bwi$-\017vbh)\017wk30\013|c2-I|t70\024|h".toCharArray();
        int i141 = arrayOfChar36.length;
        i142 = 0;
        if (i141 > i142)
          break label4649;
        arrayOfString[35] = new String(arrayOfChar36).intern();
        arrayOfChar37 = "-0\002".toCharArray();
        int i145 = arrayOfChar37.length;
        i146 = 0;
        if (i145 > i146)
          break label4741;
        arrayOfString[36] = new String(arrayOfChar37).intern();
        D = arrayOfString;
        int[] arrayOfInt = new int[2];
        arrayOfInt[0] = 443;
        arrayOfInt[1] = 5222;
        a = arrayOfInt;
        y = 0;
        z = false;
      }
    }
    else
    {
      int i3 = arrayOfChar1[i2];
      int i4;
      switch (i2 % 5)
      {
      default:
        i4 = 12;
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
        i4 = 71;
        continue;
        i4 = 89;
        continue;
        i4 = 102;
        continue;
        i4 = 25;
      }
    }
    int i7 = arrayOfChar2[i6];
    int i8;
    switch (i6 % 5)
    {
    default:
      i8 = 12;
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
      i8 = 71;
      continue;
      i8 = 89;
      continue;
      i8 = 102;
      continue;
      i8 = 25;
    }
    label1613: int i11 = arrayOfChar3[i10];
    int i12;
    switch (i10 % 5)
    {
    default:
      i12 = 12;
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
      i12 = 71;
      continue;
      i12 = 89;
      continue;
      i12 = 102;
      continue;
      i12 = 25;
    }
    label1705: int i15 = arrayOfChar4[i14];
    int i16;
    switch (i14 % 5)
    {
    default:
      i16 = 12;
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
      i16 = 71;
      continue;
      i16 = 89;
      continue;
      i16 = 102;
      continue;
      i16 = 25;
    }
    label1797: int i19 = arrayOfChar5[i18];
    int i20;
    switch (i18 % 5)
    {
    default:
      i20 = 12;
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
      i20 = 71;
      continue;
      i20 = 89;
      continue;
      i20 = 102;
      continue;
      i20 = 25;
    }
    label1889: int i23 = arrayOfChar6[i22];
    int i24;
    switch (i22 % 5)
    {
    default:
      i24 = 12;
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
      i24 = 71;
      continue;
      i24 = 89;
      continue;
      i24 = 102;
      continue;
      i24 = 25;
    }
    label1981: int i27 = arrayOfChar7[i26];
    int i28;
    switch (i26 % 5)
    {
    default:
      i28 = 12;
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
      i28 = 71;
      continue;
      i28 = 89;
      continue;
      i28 = 102;
      continue;
      i28 = 25;
    }
    label2073: int i31 = arrayOfChar8[i30];
    int i32;
    switch (i30 % 5)
    {
    default:
      i32 = 12;
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
      i32 = 71;
      continue;
      i32 = 89;
      continue;
      i32 = 102;
      continue;
      i32 = 25;
    }
    label2165: int i35 = arrayOfChar9[i34];
    int i36;
    switch (i34 % 5)
    {
    default:
      i36 = 12;
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
      i36 = 71;
      continue;
      i36 = 89;
      continue;
      i36 = 102;
      continue;
      i36 = 25;
    }
    label2257: int i39 = arrayOfChar10[i38];
    int i40;
    switch (i38 % 5)
    {
    default:
      i40 = 12;
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
      i40 = 71;
      continue;
      i40 = 89;
      continue;
      i40 = 102;
      continue;
      i40 = 25;
    }
    label2349: int i43 = arrayOfChar11[i42];
    int i44;
    switch (i42 % 5)
    {
    default:
      i44 = 12;
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
      i44 = 71;
      continue;
      i44 = 89;
      continue;
      i44 = 102;
      continue;
      i44 = 25;
    }
    label2441: int i47 = arrayOfChar12[i46];
    int i48;
    switch (i46 % 5)
    {
    default:
      i48 = 12;
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
      i48 = 71;
      continue;
      i48 = 89;
      continue;
      i48 = 102;
      continue;
      i48 = 25;
    }
    label2533: int i51 = arrayOfChar13[i50];
    int i52;
    switch (i50 % 5)
    {
    default:
      i52 = 12;
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
      i52 = 71;
      continue;
      i52 = 89;
      continue;
      i52 = 102;
      continue;
      i52 = 25;
    }
    label2625: int i55 = arrayOfChar14[i54];
    int i56;
    switch (i54 % 5)
    {
    default:
      i56 = 12;
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
      i56 = 71;
      continue;
      i56 = 89;
      continue;
      i56 = 102;
      continue;
      i56 = 25;
    }
    label2717: int i59 = arrayOfChar15[i58];
    int i60;
    switch (i58 % 5)
    {
    default:
      i60 = 12;
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
      i60 = 71;
      continue;
      i60 = 89;
      continue;
      i60 = 102;
      continue;
      i60 = 25;
    }
    label2809: int i63 = arrayOfChar16[i62];
    int i64;
    switch (i62 % 5)
    {
    default:
      i64 = 12;
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
      i64 = 71;
      continue;
      i64 = 89;
      continue;
      i64 = 102;
      continue;
      i64 = 25;
    }
    label2901: int i67 = arrayOfChar17[i66];
    int i68;
    switch (i66 % 5)
    {
    default:
      i68 = 12;
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
      i68 = 71;
      continue;
      i68 = 89;
      continue;
      i68 = 102;
      continue;
      i68 = 25;
    }
    label2993: int i71 = arrayOfChar18[i70];
    int i72;
    switch (i70 % 5)
    {
    default:
      i72 = 12;
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
      i72 = 71;
      continue;
      i72 = 89;
      continue;
      i72 = 102;
      continue;
      i72 = 25;
    }
    label3085: int i75 = arrayOfChar19[i74];
    int i76;
    switch (i74 % 5)
    {
    default:
      i76 = 12;
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
      i76 = 71;
      continue;
      i76 = 89;
      continue;
      i76 = 102;
      continue;
      i76 = 25;
    }
    label3177: int i79 = arrayOfChar20[i78];
    int i80;
    switch (i78 % 5)
    {
    default:
      i80 = 12;
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
      i80 = 71;
      continue;
      i80 = 89;
      continue;
      i80 = 102;
      continue;
      i80 = 25;
    }
    label3269: int i83 = arrayOfChar21[i82];
    int i84;
    switch (i82 % 5)
    {
    default:
      i84 = 12;
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
      i84 = 71;
      continue;
      i84 = 89;
      continue;
      i84 = 102;
      continue;
      i84 = 25;
    }
    label3361: int i87 = arrayOfChar22[i86];
    int i88;
    switch (i86 % 5)
    {
    default:
      i88 = 12;
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
      i88 = 71;
      continue;
      i88 = 89;
      continue;
      i88 = 102;
      continue;
      i88 = 25;
    }
    label3453: int i91 = arrayOfChar23[i90];
    int i92;
    switch (i90 % 5)
    {
    default:
      i92 = 12;
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
      i92 = 71;
      continue;
      i92 = 89;
      continue;
      i92 = 102;
      continue;
      i92 = 25;
    }
    label3545: int i95 = arrayOfChar24[i94];
    int i96;
    switch (i94 % 5)
    {
    default:
      i96 = 12;
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
      i96 = 71;
      continue;
      i96 = 89;
      continue;
      i96 = 102;
      continue;
      i96 = 25;
    }
    label3637: int i99 = arrayOfChar25[i98];
    int i100;
    switch (i98 % 5)
    {
    default:
      i100 = 12;
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
      i100 = 71;
      continue;
      i100 = 89;
      continue;
      i100 = 102;
      continue;
      i100 = 25;
    }
    label3729: int i103 = arrayOfChar26[i102];
    int i104;
    switch (i102 % 5)
    {
    default:
      i104 = 12;
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
      i104 = 71;
      continue;
      i104 = 89;
      continue;
      i104 = 102;
      continue;
      i104 = 25;
    }
    label3821: int i107 = arrayOfChar27[i106];
    int i108;
    switch (i106 % 5)
    {
    default:
      i108 = 12;
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
      i108 = 71;
      continue;
      i108 = 89;
      continue;
      i108 = 102;
      continue;
      i108 = 25;
    }
    label3913: int i111 = arrayOfChar28[i110];
    int i112;
    switch (i110 % 5)
    {
    default:
      i112 = 12;
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
      i112 = 71;
      continue;
      i112 = 89;
      continue;
      i112 = 102;
      continue;
      i112 = 25;
    }
    label4005: int i115 = arrayOfChar29[i114];
    int i116;
    switch (i114 % 5)
    {
    default:
      i116 = 12;
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
      i116 = 71;
      continue;
      i116 = 89;
      continue;
      i116 = 102;
      continue;
      i116 = 25;
    }
    label4097: int i119 = arrayOfChar30[i118];
    int i120;
    switch (i118 % 5)
    {
    default:
      i120 = 12;
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
      i120 = 71;
      continue;
      i120 = 89;
      continue;
      i120 = 102;
      continue;
      i120 = 25;
    }
    label4189: int i123 = arrayOfChar31[i122];
    int i124;
    switch (i122 % 5)
    {
    default:
      i124 = 12;
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
      i124 = 71;
      continue;
      i124 = 89;
      continue;
      i124 = 102;
      continue;
      i124 = 25;
    }
    label4281: int i127 = arrayOfChar32[i126];
    int i128;
    switch (i126 % 5)
    {
    default:
      i128 = 12;
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
      i128 = 71;
      continue;
      i128 = 89;
      continue;
      i128 = 102;
      continue;
      i128 = 25;
    }
    label4373: int i131 = arrayOfChar33[i130];
    int i132;
    switch (i130 % 5)
    {
    default:
      i132 = 12;
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
      i132 = 71;
      continue;
      i132 = 89;
      continue;
      i132 = 102;
      continue;
      i132 = 25;
    }
    label4465: int i135 = arrayOfChar34[i134];
    int i136;
    switch (i134 % 5)
    {
    default:
      i136 = 12;
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
      i136 = 71;
      continue;
      i136 = 89;
      continue;
      i136 = 102;
      continue;
      i136 = 25;
    }
    label4557: int i139 = arrayOfChar35[i138];
    int i140;
    switch (i138 % 5)
    {
    default:
      i140 = 12;
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
      i140 = 71;
      continue;
      i140 = 89;
      continue;
      i140 = 102;
      continue;
      i140 = 25;
    }
    label4649: int i143 = arrayOfChar36[i142];
    int i144;
    switch (i142 % 5)
    {
    default:
      i144 = 12;
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
      i144 = 71;
      continue;
      i144 = 89;
      continue;
      i144 = 102;
      continue;
      i144 = 25;
    }
    label4741: int i147 = arrayOfChar37[i146];
    int i148;
    switch (i146 % 5)
    {
    default:
      i148 = 12;
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
      i148 = 71;
      continue;
      i148 = 89;
      continue;
      i148 = 102;
      continue;
      i148 = 25;
    }
  }

  public m(Context paramContext, Messenger paramMessenger)
  {
    super(D[28]);
    this.d = paramMessenger;
    this.s = paramContext;
    this.t = (paramContext.getString(2131296261) + "-" + paramContext.getString(2131296260));
    try
    {
      this.u = new jz(MessageDigest.getInstance(D[26]));
      this.x = paramContext.getSharedPreferences(paramContext.getString(2131296258), 0);
      if (App.wc != 0)
        MessageService.C = i1 + 1;
      return;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
    }
    throw new InternalError(D[27]);
  }

  private static byte a(int paramInt)
  {
    byte b1 = 0;
    int i1 = MessageService.C;
    int i2 = 0;
    do
    {
      if (i2 >= 8)
        break;
      b1 = (byte)(b1 << 1);
      if ((paramInt & 0x80) > 0)
        b1 = (byte)(b1 | 0x1);
      paramInt <<= 1;
      i2++;
    }
    while (i1 == 0);
    return b1;
  }

  static Messenger a(m paramm)
  {
    return paramm.f;
  }

  private InetAddress a(String paramString)
    throws UnknownHostException, IOException
  {
    this.v = (1 + this.v);
    if ((this.w == null) || (this.v >= this.w.size()))
    {
      this.w = Arrays.asList(InetAddress.getAllByName(paramString));
      if (this.w.size() == 0)
        throw new IOException(D[33] + paramString);
      Collections.shuffle(this.w);
      this.v = 0;
    }
    return (InetAddress)this.w.get(this.v);
  }

  private void a(Message paramMessage)
  {
    int i1 = MessageService.C;
    switch (s.a(paramMessage))
    {
    default:
      i.a(this.d, Message.obtain(paramMessage));
    case 2:
    case 5:
    case 21:
    }
    while (true)
    {
      return;
      s.a(this.B, paramMessage);
      if (i1 == 0)
        break;
      String str2 = ((Bundle)paramMessage.obj).getString(D[36]);
      this.l.a(str2);
      if (i1 == 0)
        break;
      String str1 = (String)paramMessage.obj;
      this.l.a(str1);
    }
  }

  private void a(Messenger paramMessenger)
  {
    this.f = paramMessenger;
    i.a(this.d, this.e);
  }

  static void a(m paramm, Message paramMessage)
  {
    paramm.a(paramMessage);
  }

  static void a(m paramm, Messenger paramMessenger)
  {
    paramm.a(paramMessenger);
  }

  static void a(m paramm, qz paramqz)
  {
    paramm.a(paramqz);
  }

  static void a(m paramm, sz paramsz)
  {
    paramm.a(paramsz);
  }

  static void a(m paramm, String paramString1, String paramString2, ArrayList paramArrayList, boolean paramBoolean)
  {
    paramm.b(paramString1, paramString2, paramArrayList, paramBoolean);
  }

  static void a(m paramm, boolean paramBoolean)
  {
    paramm.c(paramBoolean);
  }

  private void a(qz paramqz)
  {
    if (paramqz == this.q)
      a(true);
  }

  private void a(sz paramsz)
  {
    this.k.a(paramsz, 45000L);
  }

  // ERROR //
  private void a(String paramString1, String paramString2, ArrayList<String> paramArrayList, boolean paramBoolean)
  {
    // Byte code:
    //   0: getstatic 161	com/whatsapp/messaging/MessageService:C	I
    //   3: istore 5
    //   5: aload_0
    //   6: getfield 166	com/whatsapp/messaging/m:n	Z
    //   9: ifeq +4 -> 13
    //   12: return
    //   13: getstatic 365	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   16: invokevirtual 368	com/whatsapp/App:I	()Z
    //   19: ifeq +22 -> 41
    //   22: getstatic 148	com/whatsapp/messaging/m:D	[Ljava/lang/String;
    //   25: bipush 16
    //   27: aaload
    //   28: invokestatic 372	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   31: aload_0
    //   32: getfield 193	com/whatsapp/messaging/m:d	Landroid/os/Messenger;
    //   35: invokestatic 374	com/whatsapp/messaging/i:e	(Landroid/os/Messenger;)V
    //   38: goto -26 -> 12
    //   41: invokestatic 376	com/whatsapp/App:a	()Z
    //   44: ifeq +14 -> 58
    //   47: getstatic 148	com/whatsapp/messaging/m:D	[Ljava/lang/String;
    //   50: iconst_4
    //   51: aaload
    //   52: invokestatic 372	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   55: goto -43 -> 12
    //   58: invokestatic 379	com/whatsapp/App:J	()Z
    //   61: ifeq +21 -> 82
    //   64: getstatic 148	com/whatsapp/messaging/m:D	[Ljava/lang/String;
    //   67: iconst_3
    //   68: aaload
    //   69: invokestatic 372	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   72: aload_0
    //   73: getfield 193	com/whatsapp/messaging/m:d	Landroid/os/Messenger;
    //   76: invokestatic 381	com/whatsapp/messaging/i:f	(Landroid/os/Messenger;)V
    //   79: goto -67 -> 12
    //   82: getstatic 148	com/whatsapp/messaging/m:D	[Ljava/lang/String;
    //   85: bipush 11
    //   87: aaload
    //   88: invokestatic 383	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   91: aload_0
    //   92: getfield 193	com/whatsapp/messaging/m:d	Landroid/os/Messenger;
    //   95: invokestatic 384	com/whatsapp/messaging/i:a	(Landroid/os/Messenger;)V
    //   98: aload_0
    //   99: getfield 386	com/whatsapp/messaging/m:r	Ljava/net/Socket;
    //   102: ifnull +17 -> 119
    //   105: aload_0
    //   106: getfield 386	com/whatsapp/messaging/m:r	Ljava/net/Socket;
    //   109: invokevirtual 391	java/net/Socket:isClosed	()Z
    //   112: ifne +7 -> 119
    //   115: aload_0
    //   116: invokespecial 393	com/whatsapp/messaging/m:b	()V
    //   119: iconst_0
    //   120: istore 6
    //   122: aconst_null
    //   123: astore 7
    //   125: aload_0
    //   126: new 388	java/net/Socket
    //   129: dup
    //   130: invokespecial 394	java/net/Socket:<init>	()V
    //   133: putfield 386	com/whatsapp/messaging/m:r	Ljava/net/Socket;
    //   136: aload_3
    //   137: ifnull +1432 -> 1569
    //   140: aload_3
    //   141: invokevirtual 397	java/util/ArrayList:size	()I
    //   144: ifle +1425 -> 1569
    //   147: aconst_null
    //   148: astore 34
    //   150: getstatic 154	com/whatsapp/messaging/m:z	Z
    //   153: ifeq +685 -> 838
    //   156: aload_3
    //   157: invokevirtual 397	java/util/ArrayList:size	()I
    //   160: iconst_2
    //   161: if_icmplt +13 -> 174
    //   164: aload_3
    //   165: iconst_1
    //   166: invokevirtual 398	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   169: checkcast 60	java/lang/String
    //   172: astore 34
    //   174: aload 34
    //   176: ifnull +1393 -> 1569
    //   179: aload_0
    //   180: aload 34
    //   182: invokespecial 400	com/whatsapp/messaging/m:b	(Ljava/lang/String;)Ljava/net/InetAddress;
    //   185: astore 16
    //   187: aload 16
    //   189: ifnonnull +15 -> 204
    //   192: aload_0
    //   193: getstatic 148	com/whatsapp/messaging/m:D	[Ljava/lang/String;
    //   196: bipush 21
    //   198: aaload
    //   199: invokespecial 402	com/whatsapp/messaging/m:a	(Ljava/lang/String;)Ljava/net/InetAddress;
    //   202: astore 16
    //   204: aload_0
    //   205: invokespecial 404	com/whatsapp/messaging/m:c	()I
    //   208: istore 17
    //   210: new 197	java/lang/StringBuilder
    //   213: dup
    //   214: invokespecial 198	java/lang/StringBuilder:<init>	()V
    //   217: getstatic 148	com/whatsapp/messaging/m:D	[Ljava/lang/String;
    //   220: bipush 14
    //   222: aaload
    //   223: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   226: aload 16
    //   228: invokevirtual 407	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   231: ldc_w 409
    //   234: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   237: iload 17
    //   239: invokevirtual 412	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   242: invokevirtual 215	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   245: invokestatic 383	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   248: new 414	java/net/InetSocketAddress
    //   251: dup
    //   252: aload 16
    //   254: iload 17
    //   256: invokespecial 417	java/net/InetSocketAddress:<init>	(Ljava/net/InetAddress;I)V
    //   259: astore 18
    //   261: aload_0
    //   262: getfield 386	com/whatsapp/messaging/m:r	Ljava/net/Socket;
    //   265: aload 18
    //   267: sipush 30000
    //   270: invokevirtual 421	java/net/Socket:connect	(Ljava/net/SocketAddress;I)V
    //   273: aload_0
    //   274: getfield 386	com/whatsapp/messaging/m:r	Ljava/net/Socket;
    //   277: sipush 30000
    //   280: invokevirtual 425	java/net/Socket:setSoTimeout	(I)V
    //   283: getstatic 148	com/whatsapp/messaging/m:D	[Ljava/lang/String;
    //   286: bipush 10
    //   288: aaload
    //   289: invokestatic 383	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   292: aload_0
    //   293: new 427	com/whatsapp/messaging/e
    //   296: dup
    //   297: aload_0
    //   298: invokespecial 428	com/whatsapp/messaging/e:<init>	(Lcom/whatsapp/messaging/m;)V
    //   301: putfield 430	com/whatsapp/messaging/m:j	Lcom/whatsapp/messaging/e;
    //   304: aload_0
    //   305: new 432	android/os/Messenger
    //   308: dup
    //   309: aload_0
    //   310: getfield 430	com/whatsapp/messaging/m:j	Lcom/whatsapp/messaging/e;
    //   313: invokespecial 435	android/os/Messenger:<init>	(Landroid/os/Handler;)V
    //   316: putfield 437	com/whatsapp/messaging/m:h	Landroid/os/Messenger;
    //   319: new 439	com/whatsapp/messaging/q
    //   322: dup
    //   323: aload_0
    //   324: getfield 437	com/whatsapp/messaging/m:h	Landroid/os/Messenger;
    //   327: invokespecial 441	com/whatsapp/messaging/q:<init>	(Landroid/os/Messenger;)V
    //   330: astore 19
    //   332: new 443	com/whatsapp/mf
    //   335: dup
    //   336: aload_0
    //   337: getfield 386	com/whatsapp/messaging/m:r	Ljava/net/Socket;
    //   340: invokevirtual 447	java/net/Socket:getOutputStream	()Ljava/io/OutputStream;
    //   343: iconst_1
    //   344: invokespecial 450	com/whatsapp/mf:<init>	(Ljava/io/OutputStream;I)V
    //   347: astore 20
    //   349: new 452	com/whatsapp/oz
    //   352: dup
    //   353: new 454	com/whatsapp/lf
    //   356: dup
    //   357: aload_0
    //   358: getfield 386	com/whatsapp/messaging/m:r	Ljava/net/Socket;
    //   361: invokevirtual 458	java/net/Socket:getInputStream	()Ljava/io/InputStream;
    //   364: iconst_1
    //   365: invokespecial 461	com/whatsapp/lf:<init>	(Ljava/io/InputStream;I)V
    //   368: getstatic 465	com/whatsapp/nz:a	[Ljava/lang/String;
    //   371: invokespecial 468	com/whatsapp/oz:<init>	(Ljava/io/InputStream;[Ljava/lang/String;)V
    //   374: astore 21
    //   376: getstatic 470	com/whatsapp/App:f	I
    //   379: iconst_1
    //   380: if_icmplt +1182 -> 1562
    //   383: new 472	com/whatsapp/lz
    //   386: dup
    //   387: aload 21
    //   389: new 474	com/whatsapp/rf
    //   392: dup
    //   393: invokespecial 475	com/whatsapp/rf:<init>	()V
    //   396: getstatic 148	com/whatsapp/messaging/m:D	[Ljava/lang/String;
    //   399: bipush 13
    //   401: aaload
    //   402: invokespecial 478	com/whatsapp/lz:<init>	(Lcom/whatsapp/e1;Ljava/io/Writer;Ljava/lang/String;)V
    //   405: astore 22
    //   407: new 480	com/whatsapp/pz
    //   410: dup
    //   411: aload 20
    //   413: getstatic 465	com/whatsapp/nz:a	[Ljava/lang/String;
    //   416: invokespecial 483	com/whatsapp/pz:<init>	(Ljava/io/OutputStream;[Ljava/lang/String;)V
    //   419: astore 23
    //   421: getstatic 470	com/whatsapp/App:f	I
    //   424: iconst_1
    //   425: if_icmplt +1130 -> 1555
    //   428: new 485	com/whatsapp/mz
    //   431: dup
    //   432: aload 23
    //   434: new 474	com/whatsapp/rf
    //   437: dup
    //   438: invokespecial 475	com/whatsapp/rf:<init>	()V
    //   441: getstatic 148	com/whatsapp/messaging/m:D	[Ljava/lang/String;
    //   444: bipush 19
    //   446: aaload
    //   447: invokespecial 488	com/whatsapp/mz:<init>	(Lcom/whatsapp/f1;Ljava/io/Writer;Ljava/lang/String;)V
    //   450: astore 24
    //   452: aload_0
    //   453: invokevirtual 491	com/whatsapp/messaging/m:a	()[B
    //   456: astore 25
    //   458: new 493	com/whatsapp/z0
    //   461: dup
    //   462: aload 22
    //   464: aload 24
    //   466: aload_0
    //   467: getfield 230	com/whatsapp/messaging/m:u	Lcom/whatsapp/jz;
    //   470: aload 25
    //   472: invokespecial 496	com/whatsapp/z0:<init>	(Lcom/whatsapp/e1;Lcom/whatsapp/f1;Lcom/whatsapp/i1;[B)V
    //   475: astore 26
    //   477: aload_0
    //   478: getfield 195	com/whatsapp/messaging/m:s	Landroid/content/Context;
    //   481: invokestatic 499	com/whatsapp/App:b	(Landroid/content/Context;)Ljava/lang/String;
    //   484: astore 27
    //   486: new 501	com/whatsapp/messaging/o
    //   489: dup
    //   490: aload_0
    //   491: invokespecial 502	com/whatsapp/messaging/o:<init>	(Lcom/whatsapp/messaging/m;)V
    //   494: astore 28
    //   496: aload_0
    //   497: new 504	com/whatsapp/qz
    //   500: dup
    //   501: aload 26
    //   503: getstatic 148	com/whatsapp/messaging/m:D	[Ljava/lang/String;
    //   506: bipush 17
    //   508: aaload
    //   509: aload_0
    //   510: getfield 217	com/whatsapp/messaging/m:t	Ljava/lang/String;
    //   513: aload_1
    //   514: aload 27
    //   516: aload_2
    //   517: aload 19
    //   519: getstatic 507	com/whatsapp/App:x	Lcom/whatsapp/eu;
    //   522: aload 28
    //   524: invokespecial 510	com/whatsapp/qz:<init>	(Lcom/whatsapp/y0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whatsapp/x0;Lcom/whatsapp/vz;Lcom/whatsapp/h1;)V
    //   527: putfield 346	com/whatsapp/messaging/m:q	Lcom/whatsapp/qz;
    //   530: aload 26
    //   532: aload_0
    //   533: getfield 346	com/whatsapp/messaging/m:q	Lcom/whatsapp/qz;
    //   536: invokevirtual 511	com/whatsapp/z0:a	(Lcom/whatsapp/qz;)V
    //   539: aload_0
    //   540: getfield 346	com/whatsapp/messaging/m:q	Lcom/whatsapp/qz;
    //   543: iconst_1
    //   544: invokevirtual 512	com/whatsapp/qz:a	(Z)V
    //   547: aload_0
    //   548: getfield 346	com/whatsapp/messaging/m:q	Lcom/whatsapp/qz;
    //   551: invokestatic 514	com/whatsapp/App:o	()Z
    //   554: invokevirtual 516	com/whatsapp/qz:b	(Z)V
    //   557: aload_0
    //   558: getfield 346	com/whatsapp/messaging/m:q	Lcom/whatsapp/qz;
    //   561: invokestatic 518	com/whatsapp/App:p	()Z
    //   564: invokevirtual 519	com/whatsapp/qz:c	(Z)V
    //   567: aload_0
    //   568: getfield 346	com/whatsapp/messaging/m:q	Lcom/whatsapp/qz;
    //   571: iconst_0
    //   572: invokevirtual 521	com/whatsapp/qz:d	(Z)V
    //   575: getstatic 148	com/whatsapp/messaging/m:D	[Ljava/lang/String;
    //   578: iconst_2
    //   579: aaload
    //   580: invokestatic 383	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   583: aload_0
    //   584: getfield 193	com/whatsapp/messaging/m:d	Landroid/os/Messenger;
    //   587: invokestatic 523	com/whatsapp/messaging/i:b	(Landroid/os/Messenger;)V
    //   590: iconst_1
    //   591: istore 11
    //   593: aload_0
    //   594: getfield 346	com/whatsapp/messaging/m:q	Lcom/whatsapp/qz;
    //   597: iload 4
    //   599: invokevirtual 525	com/whatsapp/qz:e	(Z)V
    //   602: aload_0
    //   603: aload 26
    //   605: getfield 528	com/whatsapp/z0:g	[B
    //   608: invokevirtual 531	com/whatsapp/messaging/m:a	([B)V
    //   611: aload_0
    //   612: getfield 193	com/whatsapp/messaging/m:d	Landroid/os/Messenger;
    //   615: invokestatic 533	com/whatsapp/messaging/i:c	(Landroid/os/Messenger;)V
    //   618: invokestatic 535	com/whatsapp/App:f	()Z
    //   621: ifeq +19 -> 640
    //   624: getstatic 148	com/whatsapp/messaging/m:D	[Ljava/lang/String;
    //   627: bipush 9
    //   629: aaload
    //   630: invokestatic 383	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   633: aload_0
    //   634: getfield 346	com/whatsapp/messaging/m:q	Lcom/whatsapp/qz;
    //   637: invokevirtual 537	com/whatsapp/qz:f	()V
    //   640: getstatic 148	com/whatsapp/messaging/m:D	[Ljava/lang/String;
    //   643: bipush 8
    //   645: aaload
    //   646: invokestatic 383	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   649: aload_0
    //   650: getfield 346	com/whatsapp/messaging/m:q	Lcom/whatsapp/qz;
    //   653: invokevirtual 539	com/whatsapp/qz:c	()V
    //   656: aload_0
    //   657: getfield 346	com/whatsapp/messaging/m:q	Lcom/whatsapp/qz;
    //   660: getfield 541	com/whatsapp/qz:w	J
    //   663: lconst_0
    //   664: lcmp
    //   665: ifle +17 -> 682
    //   668: ldc2_w 542
    //   671: aload_0
    //   672: getfield 346	com/whatsapp/messaging/m:q	Lcom/whatsapp/qz;
    //   675: getfield 541	com/whatsapp/qz:w	J
    //   678: lmul
    //   679: invokestatic 548	com/whatsapp/eg:a	(J)V
    //   682: aload_0
    //   683: getfield 346	com/whatsapp/messaging/m:q	Lcom/whatsapp/qz;
    //   686: getfield 549	com/whatsapp/qz:v	I
    //   689: invokestatic 551	com/whatsapp/eg:a	(I)V
    //   692: aload_0
    //   693: getfield 346	com/whatsapp/messaging/m:q	Lcom/whatsapp/qz;
    //   696: getfield 549	com/whatsapp/qz:v	I
    //   699: invokestatic 553	com/whatsapp/eg:c	(I)V
    //   702: aload_0
    //   703: getfield 386	com/whatsapp/messaging/m:r	Ljava/net/Socket;
    //   706: ldc_w 554
    //   709: invokevirtual 425	java/net/Socket:setSoTimeout	(I)V
    //   712: aload_0
    //   713: new 556	com/whatsapp/messaging/x
    //   716: dup
    //   717: aload_0
    //   718: getfield 346	com/whatsapp/messaging/m:q	Lcom/whatsapp/qz;
    //   721: aload 19
    //   723: invokespecial 559	com/whatsapp/messaging/x:<init>	(Lcom/whatsapp/qz;Lcom/whatsapp/messaging/q;)V
    //   726: putfield 561	com/whatsapp/messaging/m:b	Lcom/whatsapp/messaging/x;
    //   729: aload_0
    //   730: getfield 561	com/whatsapp/messaging/m:b	Lcom/whatsapp/messaging/x;
    //   733: invokevirtual 564	com/whatsapp/messaging/x:start	()V
    //   736: aload_0
    //   737: iconst_1
    //   738: putfield 166	com/whatsapp/messaging/m:n	Z
    //   741: aload_0
    //   742: invokespecial 565	com/whatsapp/messaging/m:f	()V
    //   745: aload_0
    //   746: getfield 166	com/whatsapp/messaging/m:n	Z
    //   749: ifeq +26 -> 775
    //   752: aload_0
    //   753: getfield 193	com/whatsapp/messaging/m:d	Landroid/os/Messenger;
    //   756: invokestatic 567	com/whatsapp/messaging/i:d	(Landroid/os/Messenger;)V
    //   759: aload_0
    //   760: getfield 247	com/whatsapp/messaging/m:f	Landroid/os/Messenger;
    //   763: aload_0
    //   764: getfield 346	com/whatsapp/messaging/m:q	Lcom/whatsapp/qz;
    //   767: invokestatic 572	com/whatsapp/messaging/k:a	(Landroid/os/Messenger;Lcom/whatsapp/qz;)V
    //   770: iload 5
    //   772: ifeq -760 -> 12
    //   775: aload_0
    //   776: getfield 386	com/whatsapp/messaging/m:r	Ljava/net/Socket;
    //   779: ifnull +30 -> 809
    //   782: aload_0
    //   783: getfield 386	com/whatsapp/messaging/m:r	Ljava/net/Socket;
    //   786: invokevirtual 391	java/net/Socket:isClosed	()Z
    //   789: ifne +12 -> 801
    //   792: aload_0
    //   793: invokespecial 393	com/whatsapp/messaging/m:b	()V
    //   796: iload 5
    //   798: ifeq +11 -> 809
    //   801: getstatic 148	com/whatsapp/messaging/m:D	[Ljava/lang/String;
    //   804: iconst_5
    //   805: aaload
    //   806: invokestatic 383	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   809: aload_0
    //   810: getfield 430	com/whatsapp/messaging/m:j	Lcom/whatsapp/messaging/e;
    //   813: ifnull +10 -> 823
    //   816: aload_0
    //   817: getfield 430	com/whatsapp/messaging/m:j	Lcom/whatsapp/messaging/e;
    //   820: invokevirtual 574	com/whatsapp/messaging/e:a	()V
    //   823: aload_0
    //   824: getfield 193	com/whatsapp/messaging/m:d	Landroid/os/Messenger;
    //   827: astore 14
    //   829: aload 14
    //   831: iconst_1
    //   832: invokestatic 577	com/whatsapp/messaging/i:a	(Landroid/os/Messenger;Z)V
    //   835: goto -823 -> 12
    //   838: aload_3
    //   839: iconst_0
    //   840: invokevirtual 398	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   843: checkcast 60	java/lang/String
    //   846: astore 34
    //   848: goto -674 -> 174
    //   851: astore 30
    //   853: new 197	java/lang/StringBuilder
    //   856: dup
    //   857: invokespecial 198	java/lang/StringBuilder:<init>	()V
    //   860: getstatic 148	com/whatsapp/messaging/m:D	[Ljava/lang/String;
    //   863: bipush 12
    //   865: aaload
    //   866: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   869: aload 30
    //   871: getfield 579	com/whatsapp/cg:a	I
    //   874: invokevirtual 412	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   877: invokevirtual 215	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   880: invokestatic 383	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   883: iconst_1
    //   884: istore 10
    //   886: aload_0
    //   887: getfield 193	com/whatsapp/messaging/m:d	Landroid/os/Messenger;
    //   890: invokestatic 533	com/whatsapp/messaging/i:c	(Landroid/os/Messenger;)V
    //   893: aload_0
    //   894: getfield 166	com/whatsapp/messaging/m:n	Z
    //   897: ifeq +26 -> 923
    //   900: aload_0
    //   901: getfield 193	com/whatsapp/messaging/m:d	Landroid/os/Messenger;
    //   904: invokestatic 567	com/whatsapp/messaging/i:d	(Landroid/os/Messenger;)V
    //   907: aload_0
    //   908: getfield 247	com/whatsapp/messaging/m:f	Landroid/os/Messenger;
    //   911: aload_0
    //   912: getfield 346	com/whatsapp/messaging/m:q	Lcom/whatsapp/qz;
    //   915: invokestatic 572	com/whatsapp/messaging/k:a	(Landroid/os/Messenger;Lcom/whatsapp/qz;)V
    //   918: iload 5
    //   920: ifeq -908 -> 12
    //   923: aload_0
    //   924: getfield 386	com/whatsapp/messaging/m:r	Ljava/net/Socket;
    //   927: ifnull +30 -> 957
    //   930: aload_0
    //   931: getfield 386	com/whatsapp/messaging/m:r	Ljava/net/Socket;
    //   934: invokevirtual 391	java/net/Socket:isClosed	()Z
    //   937: ifne +12 -> 949
    //   940: aload_0
    //   941: invokespecial 393	com/whatsapp/messaging/m:b	()V
    //   944: iload 5
    //   946: ifeq +11 -> 957
    //   949: getstatic 148	com/whatsapp/messaging/m:D	[Ljava/lang/String;
    //   952: iconst_5
    //   953: aaload
    //   954: invokestatic 383	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   957: aload_0
    //   958: getfield 430	com/whatsapp/messaging/m:j	Lcom/whatsapp/messaging/e;
    //   961: ifnull +10 -> 971
    //   964: aload_0
    //   965: getfield 430	com/whatsapp/messaging/m:j	Lcom/whatsapp/messaging/e;
    //   968: invokevirtual 574	com/whatsapp/messaging/e:a	()V
    //   971: aload_0
    //   972: getfield 193	com/whatsapp/messaging/m:d	Landroid/os/Messenger;
    //   975: aload 30
    //   977: invokestatic 582	com/whatsapp/messaging/i:a	(Landroid/os/Messenger;Lcom/whatsapp/cg;)V
    //   980: iload 5
    //   982: ifeq -970 -> 12
    //   985: aload_0
    //   986: getfield 193	com/whatsapp/messaging/m:d	Landroid/os/Messenger;
    //   989: astore 14
    //   991: goto -162 -> 829
    //   994: astore 29
    //   996: aload_0
    //   997: getfield 193	com/whatsapp/messaging/m:d	Landroid/os/Messenger;
    //   1000: invokestatic 533	com/whatsapp/messaging/i:c	(Landroid/os/Messenger;)V
    //   1003: aload 29
    //   1005: athrow
    //   1006: astore 8
    //   1008: aconst_null
    //   1009: astore 9
    //   1011: iconst_0
    //   1012: istore 10
    //   1014: aload 8
    //   1016: invokevirtual 585	java/io/IOException:getMessage	()Ljava/lang/String;
    //   1019: astore 13
    //   1021: getstatic 148	com/whatsapp/messaging/m:D	[Ljava/lang/String;
    //   1024: bipush 18
    //   1026: aaload
    //   1027: aload 13
    //   1029: invokevirtual 589	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1032: ifne +17 -> 1049
    //   1035: getstatic 148	com/whatsapp/messaging/m:D	[Ljava/lang/String;
    //   1038: bipush 6
    //   1040: aaload
    //   1041: aload 13
    //   1043: invokevirtual 589	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1046: ifeq +8 -> 1054
    //   1049: aload_0
    //   1050: aconst_null
    //   1051: invokevirtual 531	com/whatsapp/messaging/m:a	([B)V
    //   1054: new 197	java/lang/StringBuilder
    //   1057: dup
    //   1058: invokespecial 198	java/lang/StringBuilder:<init>	()V
    //   1061: getstatic 148	com/whatsapp/messaging/m:D	[Ljava/lang/String;
    //   1064: bipush 20
    //   1066: aaload
    //   1067: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1070: aload 8
    //   1072: invokevirtual 590	java/io/IOException:toString	()Ljava/lang/String;
    //   1075: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1078: invokevirtual 215	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1081: invokestatic 383	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   1084: aload_0
    //   1085: getfield 166	com/whatsapp/messaging/m:n	Z
    //   1088: ifeq +8 -> 1096
    //   1091: iload 11
    //   1093: ifeq +16 -> 1109
    //   1096: getstatic 148	com/whatsapp/messaging/m:D	[Ljava/lang/String;
    //   1099: bipush 15
    //   1101: aaload
    //   1102: invokestatic 383	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   1105: aload_0
    //   1106: invokespecial 592	com/whatsapp/messaging/m:d	()V
    //   1109: aload_0
    //   1110: getfield 166	com/whatsapp/messaging/m:n	Z
    //   1113: ifeq +26 -> 1139
    //   1116: aload_0
    //   1117: getfield 193	com/whatsapp/messaging/m:d	Landroid/os/Messenger;
    //   1120: invokestatic 567	com/whatsapp/messaging/i:d	(Landroid/os/Messenger;)V
    //   1123: aload_0
    //   1124: getfield 247	com/whatsapp/messaging/m:f	Landroid/os/Messenger;
    //   1127: aload_0
    //   1128: getfield 346	com/whatsapp/messaging/m:q	Lcom/whatsapp/qz;
    //   1131: invokestatic 572	com/whatsapp/messaging/k:a	(Landroid/os/Messenger;Lcom/whatsapp/qz;)V
    //   1134: iload 5
    //   1136: ifeq -1124 -> 12
    //   1139: aload_0
    //   1140: getfield 386	com/whatsapp/messaging/m:r	Ljava/net/Socket;
    //   1143: ifnull +30 -> 1173
    //   1146: aload_0
    //   1147: getfield 386	com/whatsapp/messaging/m:r	Ljava/net/Socket;
    //   1150: invokevirtual 391	java/net/Socket:isClosed	()Z
    //   1153: ifne +12 -> 1165
    //   1156: aload_0
    //   1157: invokespecial 393	com/whatsapp/messaging/m:b	()V
    //   1160: iload 5
    //   1162: ifeq +11 -> 1173
    //   1165: getstatic 148	com/whatsapp/messaging/m:D	[Ljava/lang/String;
    //   1168: iconst_5
    //   1169: aaload
    //   1170: invokestatic 383	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   1173: aload_0
    //   1174: getfield 430	com/whatsapp/messaging/m:j	Lcom/whatsapp/messaging/e;
    //   1177: ifnull +10 -> 1187
    //   1180: aload_0
    //   1181: getfield 430	com/whatsapp/messaging/m:j	Lcom/whatsapp/messaging/e;
    //   1184: invokevirtual 574	com/whatsapp/messaging/e:a	()V
    //   1187: iload 10
    //   1189: ifeq +17 -> 1206
    //   1192: aload_0
    //   1193: getfield 193	com/whatsapp/messaging/m:d	Landroid/os/Messenger;
    //   1196: aload 9
    //   1198: invokestatic 582	com/whatsapp/messaging/i:a	(Landroid/os/Messenger;Lcom/whatsapp/cg;)V
    //   1201: iload 5
    //   1203: ifeq -1191 -> 12
    //   1206: aload_0
    //   1207: getfield 193	com/whatsapp/messaging/m:d	Landroid/os/Messenger;
    //   1210: astore 14
    //   1212: goto -383 -> 829
    //   1215: astore 15
    //   1217: new 197	java/lang/StringBuilder
    //   1220: dup
    //   1221: invokespecial 198	java/lang/StringBuilder:<init>	()V
    //   1224: getstatic 148	com/whatsapp/messaging/m:D	[Ljava/lang/String;
    //   1227: bipush 7
    //   1229: aaload
    //   1230: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1233: aload 15
    //   1235: invokevirtual 593	com/whatsapp/bg:toString	()Ljava/lang/String;
    //   1238: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1241: invokevirtual 215	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1244: invokestatic 383	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   1247: aload_0
    //   1248: invokespecial 592	com/whatsapp/messaging/m:d	()V
    //   1251: aload_0
    //   1252: getfield 166	com/whatsapp/messaging/m:n	Z
    //   1255: ifeq +26 -> 1281
    //   1258: aload_0
    //   1259: getfield 193	com/whatsapp/messaging/m:d	Landroid/os/Messenger;
    //   1262: invokestatic 567	com/whatsapp/messaging/i:d	(Landroid/os/Messenger;)V
    //   1265: aload_0
    //   1266: getfield 247	com/whatsapp/messaging/m:f	Landroid/os/Messenger;
    //   1269: aload_0
    //   1270: getfield 346	com/whatsapp/messaging/m:q	Lcom/whatsapp/qz;
    //   1273: invokestatic 572	com/whatsapp/messaging/k:a	(Landroid/os/Messenger;Lcom/whatsapp/qz;)V
    //   1276: iload 5
    //   1278: ifeq -1266 -> 12
    //   1281: aload_0
    //   1282: getfield 386	com/whatsapp/messaging/m:r	Ljava/net/Socket;
    //   1285: ifnull +30 -> 1315
    //   1288: aload_0
    //   1289: getfield 386	com/whatsapp/messaging/m:r	Ljava/net/Socket;
    //   1292: invokevirtual 391	java/net/Socket:isClosed	()Z
    //   1295: ifne +12 -> 1307
    //   1298: aload_0
    //   1299: invokespecial 393	com/whatsapp/messaging/m:b	()V
    //   1302: iload 5
    //   1304: ifeq +11 -> 1315
    //   1307: getstatic 148	com/whatsapp/messaging/m:D	[Ljava/lang/String;
    //   1310: iconst_5
    //   1311: aaload
    //   1312: invokestatic 383	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   1315: aload_0
    //   1316: getfield 430	com/whatsapp/messaging/m:j	Lcom/whatsapp/messaging/e;
    //   1319: ifnull +10 -> 1329
    //   1322: aload_0
    //   1323: getfield 430	com/whatsapp/messaging/m:j	Lcom/whatsapp/messaging/e;
    //   1326: invokevirtual 574	com/whatsapp/messaging/e:a	()V
    //   1329: iload 6
    //   1331: ifeq +17 -> 1348
    //   1334: aload_0
    //   1335: getfield 193	com/whatsapp/messaging/m:d	Landroid/os/Messenger;
    //   1338: aload 7
    //   1340: invokestatic 582	com/whatsapp/messaging/i:a	(Landroid/os/Messenger;Lcom/whatsapp/cg;)V
    //   1343: iload 5
    //   1345: ifeq -1333 -> 12
    //   1348: aload_0
    //   1349: getfield 193	com/whatsapp/messaging/m:d	Landroid/os/Messenger;
    //   1352: astore 14
    //   1354: goto -525 -> 829
    //   1357: astore 12
    //   1359: aload_0
    //   1360: getfield 166	com/whatsapp/messaging/m:n	Z
    //   1363: ifeq +26 -> 1389
    //   1366: aload_0
    //   1367: getfield 193	com/whatsapp/messaging/m:d	Landroid/os/Messenger;
    //   1370: invokestatic 567	com/whatsapp/messaging/i:d	(Landroid/os/Messenger;)V
    //   1373: aload_0
    //   1374: getfield 247	com/whatsapp/messaging/m:f	Landroid/os/Messenger;
    //   1377: aload_0
    //   1378: getfield 346	com/whatsapp/messaging/m:q	Lcom/whatsapp/qz;
    //   1381: invokestatic 572	com/whatsapp/messaging/k:a	(Landroid/os/Messenger;Lcom/whatsapp/qz;)V
    //   1384: iload 5
    //   1386: ifeq +78 -> 1464
    //   1389: aload_0
    //   1390: getfield 386	com/whatsapp/messaging/m:r	Ljava/net/Socket;
    //   1393: ifnull +30 -> 1423
    //   1396: aload_0
    //   1397: getfield 386	com/whatsapp/messaging/m:r	Ljava/net/Socket;
    //   1400: invokevirtual 391	java/net/Socket:isClosed	()Z
    //   1403: ifne +12 -> 1415
    //   1406: aload_0
    //   1407: invokespecial 393	com/whatsapp/messaging/m:b	()V
    //   1410: iload 5
    //   1412: ifeq +11 -> 1423
    //   1415: getstatic 148	com/whatsapp/messaging/m:D	[Ljava/lang/String;
    //   1418: iconst_5
    //   1419: aaload
    //   1420: invokestatic 383	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   1423: aload_0
    //   1424: getfield 430	com/whatsapp/messaging/m:j	Lcom/whatsapp/messaging/e;
    //   1427: ifnull +10 -> 1437
    //   1430: aload_0
    //   1431: getfield 430	com/whatsapp/messaging/m:j	Lcom/whatsapp/messaging/e;
    //   1434: invokevirtual 574	com/whatsapp/messaging/e:a	()V
    //   1437: iload 6
    //   1439: ifeq +17 -> 1456
    //   1442: aload_0
    //   1443: getfield 193	com/whatsapp/messaging/m:d	Landroid/os/Messenger;
    //   1446: aload 7
    //   1448: invokestatic 582	com/whatsapp/messaging/i:a	(Landroid/os/Messenger;Lcom/whatsapp/cg;)V
    //   1451: iload 5
    //   1453: ifeq +11 -> 1464
    //   1456: aload_0
    //   1457: getfield 193	com/whatsapp/messaging/m:d	Landroid/os/Messenger;
    //   1460: iconst_1
    //   1461: invokestatic 577	com/whatsapp/messaging/i:a	(Landroid/os/Messenger;Z)V
    //   1464: aload 12
    //   1466: athrow
    //   1467: astore 12
    //   1469: aload 9
    //   1471: astore 7
    //   1473: iload 10
    //   1475: istore 6
    //   1477: goto -118 -> 1359
    //   1480: astore 33
    //   1482: aload 30
    //   1484: astore 7
    //   1486: iload 10
    //   1488: istore 6
    //   1490: aload 33
    //   1492: astore 12
    //   1494: goto -135 -> 1359
    //   1497: astore 32
    //   1499: aload 30
    //   1501: astore 7
    //   1503: iload 10
    //   1505: istore 6
    //   1507: aload 32
    //   1509: astore 15
    //   1511: goto -294 -> 1217
    //   1514: astore 8
    //   1516: aconst_null
    //   1517: astore 9
    //   1519: iconst_0
    //   1520: istore 10
    //   1522: iconst_0
    //   1523: istore 11
    //   1525: goto -511 -> 1014
    //   1528: astore 8
    //   1530: iconst_0
    //   1531: istore 10
    //   1533: iconst_0
    //   1534: istore 11
    //   1536: aconst_null
    //   1537: astore 9
    //   1539: goto -525 -> 1014
    //   1542: astore 31
    //   1544: aload 30
    //   1546: astore 9
    //   1548: aload 31
    //   1550: astore 8
    //   1552: goto -538 -> 1014
    //   1555: aload 23
    //   1557: astore 24
    //   1559: goto -1107 -> 452
    //   1562: aload 21
    //   1564: astore 22
    //   1566: goto -1159 -> 407
    //   1569: aconst_null
    //   1570: astore 16
    //   1572: goto -1385 -> 187
    //
    // Exception table:
    //   from	to	target	type
    //   593	611	851	com/whatsapp/cg
    //   593	611	994	finally
    //   853	883	994	finally
    //   996	1006	1006	java/io/IOException
    //   125	590	1215	com/whatsapp/bg
    //   611	745	1215	com/whatsapp/bg
    //   838	848	1215	com/whatsapp/bg
    //   996	1006	1215	com/whatsapp/bg
    //   125	590	1357	finally
    //   611	745	1357	finally
    //   838	848	1357	finally
    //   996	1006	1357	finally
    //   1217	1251	1357	finally
    //   1014	1109	1467	finally
    //   886	893	1480	finally
    //   886	893	1497	com/whatsapp/bg
    //   125	590	1514	java/io/IOException
    //   838	848	1514	java/io/IOException
    //   611	745	1528	java/io/IOException
    //   886	893	1542	java/io/IOException
  }

  private void a(boolean paramBoolean)
  {
    this.k.a();
    this.l.a();
    if ((this.n) && (!this.o))
    {
      if (paramBoolean)
      {
        b();
        k.a(this.f);
        i.a(this.d, true);
        this.n = false;
        f();
        if (MessageService.C == 0);
      }
      else
      {
        this.i.a(10000L);
        k.a(this.f, s.h());
      }
      this.o = true;
    }
  }

  private InetAddress b(String paramString)
    throws UnknownHostException
  {
    int i1 = 0;
    int i2 = MessageService.C;
    String[] arrayOfString = paramString.split(D[24]);
    boolean bool;
    if (arrayOfString != null)
      bool = true;
    while (true)
    {
      g5.b(bool);
      byte[] arrayOfByte = new byte[arrayOfString.length];
      try
      {
        do
        {
          if (i1 >= arrayOfString.length)
            break;
          arrayOfByte[i1] = a(Integer.valueOf(arrayOfString[i1]).intValue());
          i1++;
        }
        while (i2 == 0);
        localInetAddress = InetAddress.getByAddress(arrayOfByte);
        return localInetAddress;
        bool = false;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        while (true)
        {
          g5.d(D[25]);
          InetAddress localInetAddress = null;
        }
      }
    }
  }

  private void b()
  {
    g5.b(D[32]);
    try
    {
      if (!this.r.isOutputShutdown())
        this.r.shutdownOutput();
      try
      {
        label26: if (!this.r.isInputShutdown())
          this.r.shutdownInput();
        try
        {
          label43: if (!this.r.isClosed())
            this.r.close();
          return;
        }
        catch (Exception localException3)
        {
          while (true)
            g5.b(D[31] + localException3.toString());
        }
      }
      catch (Exception localException2)
      {
        break label43;
      }
    }
    catch (Exception localException1)
    {
      break label26;
    }
  }

  private void b(Message paramMessage)
  {
    k.a(this.f, Message.obtain(paramMessage));
    if (paramMessage.arg1 == 9)
      this.l.a((String)paramMessage.obj, 32000L);
  }

  static void b(m paramm)
  {
    paramm.i();
  }

  static void b(m paramm, Message paramMessage)
  {
    paramm.b(paramMessage);
  }

  private void b(String paramString1, String paramString2, ArrayList<String> paramArrayList, boolean paramBoolean)
  {
    a(paramString1, paramString2, paramArrayList, paramBoolean);
  }

  private void b(boolean paramBoolean)
  {
    this.n = false;
    this.o = false;
    if (!this.p)
    {
      this.i.a();
      k.a(this.f);
      if (this.m)
        paramBoolean = true;
      i.a(this.d, paramBoolean);
      if (MessageService.C == 0);
    }
    else
    {
      g5.b(D[29]);
      this.c.quit();
      quit();
    }
    f();
    this.k.a();
    this.l.a();
  }

  private int c()
    throws UnknownHostException, IOException
  {
    if (y >= a.length)
      y = 0;
    return a[y];
  }

  private void c(Message paramMessage)
  {
    e();
    k.a(this.f, s.i());
  }

  static void c(m paramm)
  {
    paramm.j();
  }

  static void c(m paramm, Message paramMessage)
  {
    paramm.c(paramMessage);
  }

  private void c(boolean paramBoolean)
  {
    a(paramBoolean);
  }

  private void d()
  {
    y = 1 + y;
  }

  private void d(Message paramMessage)
  {
    g();
  }

  static void d(m paramm)
  {
    paramm.f();
  }

  static void d(m paramm, Message paramMessage)
  {
    paramm.d(paramMessage);
  }

  private void e()
  {
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.add(13, 32);
    PendingIntent localPendingIntent = PendingIntent.getBroadcast(App.Mb, 0, new Intent(D[0]), 0);
    ((AlarmManager)App.Mb.getSystemService(D[1])).set(0, localCalendar.getTimeInMillis(), localPendingIntent);
    this.m = true;
  }

  static void e(m paramm)
  {
    paramm.m();
  }

  private void f()
  {
    PendingIntent localPendingIntent = PendingIntent.getBroadcast(App.Mb, 0, new Intent(D[0]), 536870912);
    if (localPendingIntent != null)
      ((AlarmManager)App.Mb.getSystemService(D[1])).cancel(localPendingIntent);
    this.m = false;
  }

  static void f(m paramm)
  {
    paramm.n();
  }

  static void g(m paramm)
  {
    paramm.l();
  }

  static void h(m paramm)
  {
    paramm.k();
  }

  static HashSet i(m paramm)
  {
    return paramm.C;
  }

  private void i()
  {
    b();
    b(false);
  }

  private void j()
  {
    b();
    b(true);
  }

  private void k()
  {
    b();
  }

  private void l()
  {
    this.p = true;
    a(false);
  }

  private void m()
  {
    k.a(this.f, s.j());
  }

  private void n()
  {
    k.a(this.f, s.k());
  }

  void a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null);
    for (String str = null; ; str = new String(wb.a(paramArrayOfByte)))
    {
      SharedPreferences.Editor localEditor = this.x.edit();
      localEditor.putString(D[22], str);
      if (!localEditor.commit())
        g5.d(D[23]);
      return;
    }
  }

  byte[] a()
  {
    byte[] arrayOfByte = null;
    this.x.edit();
    String str = this.x.getString(D[22], null);
    if (str == null);
    while (true)
    {
      return arrayOfByte;
      arrayOfByte = wb.a(str);
    }
  }

  public void g()
  {
    g5.b(D[35]);
    if (this.m)
    {
      c(true);
      if (MessageService.C == 0);
    }
    else
    {
      g5.c(D[34]);
    }
    this.m = false;
  }

  void h()
  {
    g5.d(D[30]);
    b();
  }

  protected void onLooperPrepared()
  {
    this.e = new Messenger(new d(this));
    this.i = new b(this, null);
    this.k = new c(this, null);
    this.l = new a(this, null);
    this.g = new Messenger(new f(this));
    this.c = new n(this.g);
    this.c.start();
  }
}