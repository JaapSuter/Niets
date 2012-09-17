package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class ds
{
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[46];
    char[] arrayOfChar1 = "7R_M\0317QTQUsG_L\037t\rBQ\b}NHC\t}".toCharArray();
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
    char[] arrayOfChar15;
    int i53;
    char[] arrayOfChar16;
    int i57;
    char[] arrayOfChar17;
    int i61;
    char[] arrayOfChar18;
    int i65;
    char[] arrayOfChar19;
    int i69;
    char[] arrayOfChar20;
    int i73;
    char[] arrayOfChar21;
    int i77;
    char[] arrayOfChar22;
    int i81;
    char[] arrayOfChar23;
    int i85;
    char[] arrayOfChar24;
    int i89;
    char[] arrayOfChar25;
    int i93;
    char[] arrayOfChar26;
    int i97;
    char[] arrayOfChar27;
    int i101;
    char[] arrayOfChar28;
    int i105;
    char[] arrayOfChar29;
    int i109;
    char[] arrayOfChar30;
    int i113;
    char[] arrayOfChar31;
    int i117;
    char[] arrayOfChar32;
    int i121;
    char[] arrayOfChar33;
    int i125;
    char[] arrayOfChar34;
    int i129;
    char[] arrayOfChar35;
    int i133;
    char[] arrayOfChar36;
    int i137;
    char[] arrayOfChar37;
    int i141;
    char[] arrayOfChar38;
    int i145;
    char[] arrayOfChar39;
    int i149;
    char[] arrayOfChar40;
    int i153;
    char[] arrayOfChar41;
    int i157;
    char[] arrayOfChar42;
    int i161;
    char[] arrayOfChar43;
    int i165;
    char[] arrayOfChar44;
    int i169;
    char[] arrayOfChar45;
    int i173;
    char[] arrayOfChar46;
    int i177;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "MLFL\025oL\rP\037tGLQ\037".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "7R_M\0317QTQUsG_L\037t\r[G\bkKBL".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label1921;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "8WCI\024wUC\002\f}P^K\025v".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label2013;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "yLIP\025qF\003K\024lGCVT}ZYP\0336qyp?Yo".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label2105;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "yLIP\025qF\003K\024lGCVT}ZYP\0336vhz.".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label2197;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "hNLK\0247VHZ\016".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label2289;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "yR]N\023{CYK\025v\rWK\n".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label2381;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "aCCF\037`\f@C\023t".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label2473;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "yLIP\025qF\003K\024lGCVTyAYK\025v\f~g4\\".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label2565;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "pMYO\033qN".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label2657;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "O".toCharArray();
        int i40 = arrayOfChar12.length;
        i41 = 0;
        if (i40 > i41)
          break label2749;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "~QNITs\033".toCharArray();
        int i44 = arrayOfChar13.length;
        i45 = 0;
        if (i44 > i45)
          break label2841;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "VM\rN\025\002KK\026}\002YMZyVYC\031p\f'".toCharArray();
        int i48 = arrayOfChar14.length;
        i49 = 0;
        if (i48 > i49)
          break label2933;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "yLIP\025qF\003O\033qN".toCharArray();
        int i52 = arrayOfChar15.length;
        i53 = 0;
        if (i52 > i53)
          break label3025;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "uCDN\036jMDF".toCharArray();
        int i56 = arrayOfChar16.length;
        i57 = 0;
        if (i56 > i57)
          break label3117;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "8^\r".toCharArray();
        int i60 = arrayOfChar17.length;
        i61 = 0;
        if (i60 > i61)
          break label3209;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "yLIP\025qF\003K\024lGCVT}ZYP\0336qx`0]ay".toCharArray();
        int i64 = arrayOfChar18.length;
        i65 = 0;
        if (i64 > i65)
          break label3301;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "yLIP\025qF\003K\024lGCVT}ZYP\0336g`c3T".toCharArray();
        int i68 = arrayOfChar19.length;
        i69 = 0;
        if (i68 > i69)
          break label3393;
        arrayOfString[18] = new String(arrayOfChar19).intern();
        arrayOfChar20 = "}OLK\026".toCharArray();
        int i72 = arrayOfChar20.length;
        i73 = 0;
        if (i72 > i73)
          break label3485;
        arrayOfString[19] = new String(arrayOfChar20).intern();
        arrayOfChar21 = "}OLK\0265QHL\036}P\002C\nh\002".toCharArray();
        int i76 = arrayOfChar21.length;
        i77 = 0;
        if (i76 > i77)
          break label3577;
        arrayOfString[20] = new String(arrayOfChar21).intern();
        arrayOfChar22 = "\"\002".toCharArray();
        int i80 = arrayOfChar22.length;
        i81 = 0;
        if (i80 > i81)
          break label3669;
        arrayOfString[21] = new String(arrayOfChar22).intern();
        arrayOfChar23 = "\\G[K\031}".toCharArray();
        int i84 = arrayOfChar23.length;
        i85 = 0;
        if (i84 > i85)
          break label3761;
        arrayOfString[22] = new String(arrayOfChar23).intern();
        arrayOfChar24 = "tA".toCharArray();
        int i88 = arrayOfChar24.length;
        i89 = 0;
        if (i88 > i89)
          break label3853;
        arrayOfString[23] = new String(arrayOfChar24).intern();
        arrayOfChar25 = "\022('(".toCharArray();
        int i92 = arrayOfChar25.length;
        i93 = 0;
        if (i92 > i93)
          break label3945;
        arrayOfString[24] = new String(arrayOfChar25).intern();
        arrayOfChar26 = "\\K^V\bq@XV\023wL".toCharArray();
        int i96 = arrayOfChar26.length;
        i97 = 0;
        if (i96 > i97)
          break label4037;
        arrayOfString[25] = new String(arrayOfChar26).intern();
        arrayOfChar27 = "\\GOW\0358KCD\025".toCharArray();
        int i100 = arrayOfChar27.length;
        i101 = 0;
        if (i100 > i101)
          break label4129;
        arrayOfString[26] = new String(arrayOfChar27).intern();
        arrayOfChar28 = "NG_Q\023wL".toCharArray();
        int i104 = arrayOfChar28.length;
        i105 = 0;
        if (i104 > i105)
          break label4221;
        arrayOfString[27] = new String(arrayOfChar28).intern();
        arrayOfChar29 = "LC_E\037l".toCharArray();
        int i108 = arrayOfChar29.length;
        i109 = 0;
        if (i108 > i109)
          break label4313;
        arrayOfString[28] = new String(arrayOfChar29).intern();
        arrayOfChar30 = "KG_T\037j".toCharArray();
        int i112 = arrayOfChar30.length;
        i113 = 0;
        if (i112 > i113)
          break label4405;
        arrayOfString[29] = new String(arrayOfChar30).intern();
        arrayOfChar31 = "ZWDN\036".toCharArray();
        int i116 = arrayOfChar31.length;
        i117 = 0;
        if (i116 > i117)
          break label4497;
        arrayOfString[30] = new String(arrayOfChar31).intern();
        arrayOfChar32 = "tE".toCharArray();
        int i120 = arrayOfChar32.length;
        i121 = 0;
        if (i120 > i121)
          break label4589;
        arrayOfString[31] = new String(arrayOfChar32).intern();
        arrayOfChar33 = "HPBF\017{V".toCharArray();
        int i124 = arrayOfChar33.length;
        i125 = 0;
        if (i124 > i125)
          break label4681;
        arrayOfString[32] = new String(arrayOfChar33).intern();
        arrayOfChar34 = "Wq".toCharArray();
        int i128 = arrayOfChar34.length;
        i129 = 0;
        if (i128 > i129)
          break label4773;
        arrayOfString[33] = new String(arrayOfChar34).intern();
        arrayOfChar35 = "{A".toCharArray();
        int i132 = arrayOfChar35.length;
        i133 = 0;
        if (i132 > i133)
          break label4865;
        arrayOfString[34] = new String(arrayOfChar35).intern();
        arrayOfChar36 = "UMIG\026".toCharArray();
        int i136 = arrayOfChar36.length;
        i137 = 0;
        if (i136 > i137)
          break label4957;
        arrayOfString[35] = new String(arrayOfChar36).intern();
        arrayOfChar37 = "[aBF\037".toCharArray();
        int i140 = arrayOfChar37.length;
        i141 = 0;
        if (i140 > i141)
          break label5049;
        arrayOfString[36] = new String(arrayOfChar37).intern();
        arrayOfChar38 = "[MCL\037{VDM\024".toCharArray();
        int i144 = arrayOfChar38.length;
        i145 = 0;
        if (i144 > i145)
          break label5141;
        arrayOfString[37] = new String(arrayOfChar38).intern();
        arrayOfChar39 = "mL_G\035qQYG\b}F".toCharArray();
        int i148 = arrayOfChar39.length;
        i149 = 0;
        if (i148 > i149)
          break label5233;
        arrayOfString[38] = new String(arrayOfChar39).intern();
        arrayOfChar40 = "UCCW\034yAYW\b}P".toCharArray();
        int i152 = arrayOfChar40.length;
        i153 = 0;
        if (i152 > i153)
          break label5325;
        arrayOfString[39] = new String(arrayOfChar40).intern();
        arrayOfChar41 = "SG_L\037t".toCharArray();
        int i156 = arrayOfChar41.length;
        i157 = 0;
        if (i156 > i157)
          break label5417;
        arrayOfString[40] = new String(arrayOfChar41).intern();
        arrayOfChar42 = "[MCV\037`V".toCharArray();
        int i160 = arrayOfChar42.length;
        i161 = 0;
        if (i160 > i161)
          break label5509;
        arrayOfString[41] = new String(arrayOfChar42).intern();
        arrayOfChar43 = "hJ".toCharArray();
        int i164 = arrayOfChar43.length;
        i165 = 0;
        if (i164 > i165)
          break label5601;
        arrayOfString[42] = new String(arrayOfChar43).intern();
        arrayOfChar44 = "Vmcg".toCharArray();
        int i168 = arrayOfChar44.length;
        i169 = 0;
        if (i168 > i169)
          break label5693;
        arrayOfString[43] = new String(arrayOfChar44).intern();
        arrayOfChar45 = "8\n".toCharArray();
        int i172 = arrayOfChar45.length;
        i173 = 0;
        if (i172 > i173)
          break label5785;
        arrayOfString[44] = new String(arrayOfChar45).intern();
        arrayOfChar46 = "{MCL\037{VDT\023l[".toCharArray();
        int i176 = arrayOfChar46.length;
        i177 = 0;
        if (i176 > i177)
          break label5877;
        arrayOfString[45] = new String(arrayOfChar46).intern();
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
        m = 122;
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
        m = 24;
        continue;
        m = 34;
        continue;
        m = 45;
        continue;
        m = 34;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 122;
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
      i3 = 24;
      continue;
      i3 = 34;
      continue;
      i3 = 45;
      continue;
      i3 = 34;
    }
    label1921: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 122;
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
      i7 = 24;
      continue;
      i7 = 34;
      continue;
      i7 = 45;
      continue;
      i7 = 34;
    }
    label2013: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 122;
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
      i11 = 24;
      continue;
      i11 = 34;
      continue;
      i11 = 45;
      continue;
      i11 = 34;
    }
    label2105: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 122;
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
      i15 = 24;
      continue;
      i15 = 34;
      continue;
      i15 = 45;
      continue;
      i15 = 34;
    }
    label2197: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 122;
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
      i19 = 24;
      continue;
      i19 = 34;
      continue;
      i19 = 45;
      continue;
      i19 = 34;
    }
    label2289: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 122;
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
      i23 = 24;
      continue;
      i23 = 34;
      continue;
      i23 = 45;
      continue;
      i23 = 34;
    }
    label2381: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 122;
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
      i27 = 24;
      continue;
      i27 = 34;
      continue;
      i27 = 45;
      continue;
      i27 = 34;
    }
    label2473: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 122;
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
      i31 = 24;
      continue;
      i31 = 34;
      continue;
      i31 = 45;
      continue;
      i31 = 34;
    }
    label2565: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 122;
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
      i35 = 24;
      continue;
      i35 = 34;
      continue;
      i35 = 45;
      continue;
      i35 = 34;
    }
    label2657: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 122;
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
      i39 = 24;
      continue;
      i39 = 34;
      continue;
      i39 = 45;
      continue;
      i39 = 34;
    }
    label2749: int i42 = arrayOfChar12[i41];
    int i43;
    switch (i41 % 5)
    {
    default:
      i43 = 122;
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
      i43 = 24;
      continue;
      i43 = 34;
      continue;
      i43 = 45;
      continue;
      i43 = 34;
    }
    label2841: int i46 = arrayOfChar13[i45];
    int i47;
    switch (i45 % 5)
    {
    default:
      i47 = 122;
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
      i47 = 24;
      continue;
      i47 = 34;
      continue;
      i47 = 45;
      continue;
      i47 = 34;
    }
    label2933: int i50 = arrayOfChar14[i49];
    int i51;
    switch (i49 % 5)
    {
    default:
      i51 = 122;
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
      i51 = 24;
      continue;
      i51 = 34;
      continue;
      i51 = 45;
      continue;
      i51 = 34;
    }
    label3025: int i54 = arrayOfChar15[i53];
    int i55;
    switch (i53 % 5)
    {
    default:
      i55 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar15[i53] = (char)(i55 ^ i54);
      i53++;
      break;
      i55 = 24;
      continue;
      i55 = 34;
      continue;
      i55 = 45;
      continue;
      i55 = 34;
    }
    label3117: int i58 = arrayOfChar16[i57];
    int i59;
    switch (i57 % 5)
    {
    default:
      i59 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar16[i57] = (char)(i59 ^ i58);
      i57++;
      break;
      i59 = 24;
      continue;
      i59 = 34;
      continue;
      i59 = 45;
      continue;
      i59 = 34;
    }
    label3209: int i62 = arrayOfChar17[i61];
    int i63;
    switch (i61 % 5)
    {
    default:
      i63 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar17[i61] = (char)(i63 ^ i62);
      i61++;
      break;
      i63 = 24;
      continue;
      i63 = 34;
      continue;
      i63 = 45;
      continue;
      i63 = 34;
    }
    label3301: int i66 = arrayOfChar18[i65];
    int i67;
    switch (i65 % 5)
    {
    default:
      i67 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar18[i65] = (char)(i67 ^ i66);
      i65++;
      break;
      i67 = 24;
      continue;
      i67 = 34;
      continue;
      i67 = 45;
      continue;
      i67 = 34;
    }
    label3393: int i70 = arrayOfChar19[i69];
    int i71;
    switch (i69 % 5)
    {
    default:
      i71 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar19[i69] = (char)(i71 ^ i70);
      i69++;
      break;
      i71 = 24;
      continue;
      i71 = 34;
      continue;
      i71 = 45;
      continue;
      i71 = 34;
    }
    label3485: int i74 = arrayOfChar20[i73];
    int i75;
    switch (i73 % 5)
    {
    default:
      i75 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar20[i73] = (char)(i75 ^ i74);
      i73++;
      break;
      i75 = 24;
      continue;
      i75 = 34;
      continue;
      i75 = 45;
      continue;
      i75 = 34;
    }
    label3577: int i78 = arrayOfChar21[i77];
    int i79;
    switch (i77 % 5)
    {
    default:
      i79 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar21[i77] = (char)(i79 ^ i78);
      i77++;
      break;
      i79 = 24;
      continue;
      i79 = 34;
      continue;
      i79 = 45;
      continue;
      i79 = 34;
    }
    label3669: int i82 = arrayOfChar22[i81];
    int i83;
    switch (i81 % 5)
    {
    default:
      i83 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar22[i81] = (char)(i83 ^ i82);
      i81++;
      break;
      i83 = 24;
      continue;
      i83 = 34;
      continue;
      i83 = 45;
      continue;
      i83 = 34;
    }
    label3761: int i86 = arrayOfChar23[i85];
    int i87;
    switch (i85 % 5)
    {
    default:
      i87 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar23[i85] = (char)(i87 ^ i86);
      i85++;
      break;
      i87 = 24;
      continue;
      i87 = 34;
      continue;
      i87 = 45;
      continue;
      i87 = 34;
    }
    label3853: int i90 = arrayOfChar24[i89];
    int i91;
    switch (i89 % 5)
    {
    default:
      i91 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar24[i89] = (char)(i91 ^ i90);
      i89++;
      break;
      i91 = 24;
      continue;
      i91 = 34;
      continue;
      i91 = 45;
      continue;
      i91 = 34;
    }
    label3945: int i94 = arrayOfChar25[i93];
    int i95;
    switch (i93 % 5)
    {
    default:
      i95 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar25[i93] = (char)(i95 ^ i94);
      i93++;
      break;
      i95 = 24;
      continue;
      i95 = 34;
      continue;
      i95 = 45;
      continue;
      i95 = 34;
    }
    label4037: int i98 = arrayOfChar26[i97];
    int i99;
    switch (i97 % 5)
    {
    default:
      i99 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar26[i97] = (char)(i99 ^ i98);
      i97++;
      break;
      i99 = 24;
      continue;
      i99 = 34;
      continue;
      i99 = 45;
      continue;
      i99 = 34;
    }
    label4129: int i102 = arrayOfChar27[i101];
    int i103;
    switch (i101 % 5)
    {
    default:
      i103 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar27[i101] = (char)(i103 ^ i102);
      i101++;
      break;
      i103 = 24;
      continue;
      i103 = 34;
      continue;
      i103 = 45;
      continue;
      i103 = 34;
    }
    label4221: int i106 = arrayOfChar28[i105];
    int i107;
    switch (i105 % 5)
    {
    default:
      i107 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar28[i105] = (char)(i107 ^ i106);
      i105++;
      break;
      i107 = 24;
      continue;
      i107 = 34;
      continue;
      i107 = 45;
      continue;
      i107 = 34;
    }
    label4313: int i110 = arrayOfChar29[i109];
    int i111;
    switch (i109 % 5)
    {
    default:
      i111 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar29[i109] = (char)(i111 ^ i110);
      i109++;
      break;
      i111 = 24;
      continue;
      i111 = 34;
      continue;
      i111 = 45;
      continue;
      i111 = 34;
    }
    label4405: int i114 = arrayOfChar30[i113];
    int i115;
    switch (i113 % 5)
    {
    default:
      i115 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar30[i113] = (char)(i115 ^ i114);
      i113++;
      break;
      i115 = 24;
      continue;
      i115 = 34;
      continue;
      i115 = 45;
      continue;
      i115 = 34;
    }
    label4497: int i118 = arrayOfChar31[i117];
    int i119;
    switch (i117 % 5)
    {
    default:
      i119 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar31[i117] = (char)(i119 ^ i118);
      i117++;
      break;
      i119 = 24;
      continue;
      i119 = 34;
      continue;
      i119 = 45;
      continue;
      i119 = 34;
    }
    label4589: int i122 = arrayOfChar32[i121];
    int i123;
    switch (i121 % 5)
    {
    default:
      i123 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar32[i121] = (char)(i123 ^ i122);
      i121++;
      break;
      i123 = 24;
      continue;
      i123 = 34;
      continue;
      i123 = 45;
      continue;
      i123 = 34;
    }
    label4681: int i126 = arrayOfChar33[i125];
    int i127;
    switch (i125 % 5)
    {
    default:
      i127 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar33[i125] = (char)(i127 ^ i126);
      i125++;
      break;
      i127 = 24;
      continue;
      i127 = 34;
      continue;
      i127 = 45;
      continue;
      i127 = 34;
    }
    label4773: int i130 = arrayOfChar34[i129];
    int i131;
    switch (i129 % 5)
    {
    default:
      i131 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar34[i129] = (char)(i131 ^ i130);
      i129++;
      break;
      i131 = 24;
      continue;
      i131 = 34;
      continue;
      i131 = 45;
      continue;
      i131 = 34;
    }
    label4865: int i134 = arrayOfChar35[i133];
    int i135;
    switch (i133 % 5)
    {
    default:
      i135 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar35[i133] = (char)(i135 ^ i134);
      i133++;
      break;
      i135 = 24;
      continue;
      i135 = 34;
      continue;
      i135 = 45;
      continue;
      i135 = 34;
    }
    label4957: int i138 = arrayOfChar36[i137];
    int i139;
    switch (i137 % 5)
    {
    default:
      i139 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar36[i137] = (char)(i139 ^ i138);
      i137++;
      break;
      i139 = 24;
      continue;
      i139 = 34;
      continue;
      i139 = 45;
      continue;
      i139 = 34;
    }
    label5049: int i142 = arrayOfChar37[i141];
    int i143;
    switch (i141 % 5)
    {
    default:
      i143 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar37[i141] = (char)(i143 ^ i142);
      i141++;
      break;
      i143 = 24;
      continue;
      i143 = 34;
      continue;
      i143 = 45;
      continue;
      i143 = 34;
    }
    label5141: int i146 = arrayOfChar38[i145];
    int i147;
    switch (i145 % 5)
    {
    default:
      i147 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar38[i145] = (char)(i147 ^ i146);
      i145++;
      break;
      i147 = 24;
      continue;
      i147 = 34;
      continue;
      i147 = 45;
      continue;
      i147 = 34;
    }
    label5233: int i150 = arrayOfChar39[i149];
    int i151;
    switch (i149 % 5)
    {
    default:
      i151 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar39[i149] = (char)(i151 ^ i150);
      i149++;
      break;
      i151 = 24;
      continue;
      i151 = 34;
      continue;
      i151 = 45;
      continue;
      i151 = 34;
    }
    label5325: int i154 = arrayOfChar40[i153];
    int i155;
    switch (i153 % 5)
    {
    default:
      i155 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar40[i153] = (char)(i155 ^ i154);
      i153++;
      break;
      i155 = 24;
      continue;
      i155 = 34;
      continue;
      i155 = 45;
      continue;
      i155 = 34;
    }
    label5417: int i158 = arrayOfChar41[i157];
    int i159;
    switch (i157 % 5)
    {
    default:
      i159 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar41[i157] = (char)(i159 ^ i158);
      i157++;
      break;
      i159 = 24;
      continue;
      i159 = 34;
      continue;
      i159 = 45;
      continue;
      i159 = 34;
    }
    label5509: int i162 = arrayOfChar42[i161];
    int i163;
    switch (i161 % 5)
    {
    default:
      i163 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar42[i161] = (char)(i163 ^ i162);
      i161++;
      break;
      i163 = 24;
      continue;
      i163 = 34;
      continue;
      i163 = 45;
      continue;
      i163 = 34;
    }
    label5601: int i166 = arrayOfChar43[i165];
    int i167;
    switch (i165 % 5)
    {
    default:
      i167 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar43[i165] = (char)(i167 ^ i166);
      i165++;
      break;
      i167 = 24;
      continue;
      i167 = 34;
      continue;
      i167 = 45;
      continue;
      i167 = 34;
    }
    label5693: int i170 = arrayOfChar44[i169];
    int i171;
    switch (i169 % 5)
    {
    default:
      i171 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar44[i169] = (char)(i171 ^ i170);
      i169++;
      break;
      i171 = 24;
      continue;
      i171 = 34;
      continue;
      i171 = 45;
      continue;
      i171 = 34;
    }
    label5785: int i174 = arrayOfChar45[i173];
    int i175;
    switch (i173 % 5)
    {
    default:
      i175 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar45[i173] = (char)(i175 ^ i174);
      i173++;
      break;
      i175 = 24;
      continue;
      i175 = 34;
      continue;
      i175 = 45;
      continue;
      i175 = 34;
    }
    label5877: int i178 = arrayOfChar46[i177];
    int i179;
    switch (i177 % 5)
    {
    default:
      i179 = 122;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar46[i177] = (char)(i179 ^ i178);
      i177++;
      break;
      i179 = 24;
      continue;
      i179 = 34;
      continue;
      i179 = 45;
      continue;
      i179 = 34;
    }
  }

  // ERROR //
  public static String a()
  {
    // Byte code:
    //   0: getstatic 116	com/whatsapp/ds:z	[Ljava/lang/String;
    //   3: iconst_0
    //   4: aaload
    //   5: pop
    //   6: getstatic 116	com/whatsapp/ds:z	[Ljava/lang/String;
    //   9: iconst_2
    //   10: aaload
    //   11: pop
    //   12: new 121	java/lang/StringBuilder
    //   15: dup
    //   16: invokespecial 123	java/lang/StringBuilder:<init>	()V
    //   19: astore_2
    //   20: new 125	java/io/BufferedReader
    //   23: dup
    //   24: new 127	java/io/FileReader
    //   27: dup
    //   28: getstatic 116	com/whatsapp/ds:z	[Ljava/lang/String;
    //   31: iconst_0
    //   32: aaload
    //   33: invokespecial 130	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   36: invokespecial 133	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   39: astore_3
    //   40: aload_2
    //   41: aload_3
    //   42: invokevirtual 136	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   45: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: pop
    //   49: aload_3
    //   50: ifnull +7 -> 57
    //   53: aload_3
    //   54: invokevirtual 143	java/io/BufferedReader:close	()V
    //   57: aload_3
    //   58: astore 7
    //   60: new 125	java/io/BufferedReader
    //   63: dup
    //   64: new 127	java/io/FileReader
    //   67: dup
    //   68: getstatic 116	com/whatsapp/ds:z	[Ljava/lang/String;
    //   71: iconst_2
    //   72: aaload
    //   73: invokespecial 130	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   76: invokespecial 133	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   79: astore 8
    //   81: aload_2
    //   82: new 121	java/lang/StringBuilder
    //   85: dup
    //   86: invokespecial 123	java/lang/StringBuilder:<init>	()V
    //   89: ldc 145
    //   91: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: aload 8
    //   96: invokevirtual 136	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   99: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: invokevirtual 148	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   105: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: pop
    //   109: aload 8
    //   111: ifnull +8 -> 119
    //   114: aload 8
    //   116: invokevirtual 143	java/io/BufferedReader:close	()V
    //   119: aload_2
    //   120: invokevirtual 148	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   123: areturn
    //   124: astore 4
    //   126: aconst_null
    //   127: astore_3
    //   128: aload_3
    //   129: ifnull +7 -> 136
    //   132: aload_3
    //   133: invokevirtual 143	java/io/BufferedReader:close	()V
    //   136: aload 4
    //   138: athrow
    //   139: astore 5
    //   141: aload_2
    //   142: getstatic 116	com/whatsapp/ds:z	[Ljava/lang/String;
    //   145: iconst_1
    //   146: aaload
    //   147: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: pop
    //   151: aload 5
    //   153: invokestatic 154	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   156: aload_3
    //   157: astore 7
    //   159: goto -99 -> 60
    //   162: astore 9
    //   164: aload 7
    //   166: astore 8
    //   168: aload 8
    //   170: ifnull +8 -> 178
    //   173: aload 8
    //   175: invokevirtual 143	java/io/BufferedReader:close	()V
    //   178: aload 9
    //   180: athrow
    //   181: astore 10
    //   183: aload_2
    //   184: getstatic 116	com/whatsapp/ds:z	[Ljava/lang/String;
    //   187: iconst_3
    //   188: aaload
    //   189: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: pop
    //   193: aload 10
    //   195: invokestatic 154	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   198: goto -79 -> 119
    //   201: astore 9
    //   203: goto -35 -> 168
    //   206: astore 4
    //   208: goto -80 -> 128
    //
    // Exception table:
    //   from	to	target	type
    //   20	40	124	finally
    //   53	57	139	java/io/IOException
    //   132	139	139	java/io/IOException
    //   60	81	162	finally
    //   114	119	181	java/io/IOException
    //   173	181	181	java/io/IOException
    //   81	109	201	finally
    //   40	49	206	finally
  }

  private static String a(Context paramContext)
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService(z[45])).getActiveNetworkInfo();
    StringBuilder localStringBuilder = new StringBuilder();
    if (localNetworkInfo != null)
    {
      localStringBuilder.append(localNetworkInfo.getTypeName());
      if (localNetworkInfo.getSubtypeName().length() > 0)
      {
        localStringBuilder.append(z[44] + localNetworkInfo.getSubtypeName() + ")");
        if (!DialogToastListActivity.f);
      }
    }
    else
    {
      localStringBuilder.append(z[43]);
    }
    return localStringBuilder.toString();
  }

  private static String a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    Resources localResources = paramContext.getResources();
    int i = 1;
    String str1 = z[38];
    if ((App.bb != null) && (App.bb.jabber_id != null))
    {
      str1 = "+" + App.bb.jabber_id;
      i = 0;
    }
    StringBuilder localStringBuilder1 = new StringBuilder();
    if (paramString2 != null)
      localStringBuilder1.append(paramString2);
    localStringBuilder1.append(z[24]);
    localStringBuilder1.append(a(z[26], str1));
    SharedPreferences localSharedPreferences = App.Mb.getSharedPreferences(localResources.getString(2131296258), 0);
    String str2 = z[36];
    StringBuilder localStringBuilder2 = new StringBuilder().append(localSharedPreferences.getString(z[34], "")).append(" ");
    if (i != 0);
    for (String str3 = localSharedPreferences.getString(z[42], ""); ; str3 = "")
    {
      localStringBuilder1.append(a(str2, str3));
      localStringBuilder1.append(a(z[27], localResources.getString(2131296260)));
      localStringBuilder1.append(a(z[28], App.l));
      localStringBuilder1.append(a(z[25], App.m));
      localStringBuilder1.append(a(z[41], paramString1));
      localStringBuilder1.append(a(z[32], Build.PRODUCT));
      localStringBuilder1.append(a(z[39], Build.MANUFACTURER));
      localStringBuilder1.append(a(z[35], Build.MODEL));
      localStringBuilder1.append(a(z[22], Build.DEVICE));
      localStringBuilder1.append(a(z[30], Build.DISPLAY));
      localStringBuilder1.append(a(z[33], Build.VERSION.RELEASE));
      localStringBuilder1.append(a(z[40], a()));
      localStringBuilder1.append(a(z[31], c()));
      localStringBuilder1.append(a(z[23], b()));
      localStringBuilder1.append(a(z[37], a(paramContext)));
      if (paramString3 != null)
        localStringBuilder1.append(a(z[29], paramString3));
      return localStringBuilder1.toString();
    }
  }

  private static String a(String paramString1, String paramString2)
  {
    return paramString1 + z[21] + paramString2 + "\n";
  }

  public static void a(DialogToastActivity paramDialogToastActivity, String paramString1, String paramString2, String paramString3)
  {
    boolean bool = DialogToastListActivity.f;
    String str1 = paramDialogToastActivity.getString(2131296445);
    String str2 = paramDialogToastActivity.getString(2131296446);
    String str3 = a(paramDialogToastActivity, paramString1, paramString2, paramString3);
    File localFile = i5.a(g5.b(3));
    Intent localIntent = new Intent(z[9]);
    if (localFile == null)
    {
      localIntent.setType(z[6]);
      str3 = str3 + z[13];
      if (!bool);
    }
    else
    {
      localIntent.setType(z[7]);
      localIntent.putExtra(z[4], Uri.fromFile(localFile));
    }
    String str4 = z[18];
    String[] arrayOfString = new String[1];
    arrayOfString[0] = str2;
    localIntent.putExtra(str4, arrayOfString);
    localIntent.putExtra(z[17], str1);
    localIntent.putExtra(z[5], str3);
    ArrayList localArrayList = new ArrayList();
    List localList = App.hb.queryIntentActivities(localIntent, 0);
    if (localList != null)
    {
      Iterator localIterator = localList.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        ResolveInfo localResolveInfo = (ResolveInfo)localIterator.next();
        ActivityInfo localActivityInfo = localResolveInfo.activityInfo;
        String str5 = localActivityInfo.name;
        String str6 = localActivityInfo.applicationInfo.packageName;
        g5.b(z[20] + str6 + z[16] + str5);
        if ((str6.contains(z[11])) || (str6.contains(z[19])) || (str6.contains(z[12])) || (str6.contains(z[15])) || (str6.contains(z[10])) || (str6.contains(z[14])) || (str6.contains(z[8])))
          localArrayList.add(new Pair(localResolveInfo, localIntent));
      }
      while (!bool);
    }
    if (localArrayList.size() == 0)
    {
      paramDialogToastActivity.a(2131296992);
      if (!bool);
    }
    else
    {
      new a(paramDialogToastActivity, 2131296501, localArrayList).show();
    }
  }

  private static String b()
  {
    Locale localLocale = App.Mb.getResources().getConfiguration().locale;
    if (localLocale != null);
    for (String str = localLocale.getCountry(); ; str = "")
      return str;
  }

  private static String c()
  {
    Locale localLocale = App.Mb.getResources().getConfiguration().locale;
    if (localLocale != null);
    for (String str = localLocale.getLanguage(); ; str = "")
      return str;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ds
 * JD-Core Version:    0.6.1
 */