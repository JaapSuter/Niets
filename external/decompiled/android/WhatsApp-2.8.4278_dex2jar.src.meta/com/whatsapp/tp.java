package com.whatsapp;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.telephony.PhoneNumberUtils;
import java.util.ArrayList;
import java.util.HashMap;

public class tp
{
  public static boolean a;
  static final Object b;
  static long c;
  static boolean d;
  static vp e;
  static int f;
  static boolean g;
  private static int h;
  private static boolean i;
  private static boolean j;
  private static final String[] k;
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[49];
    char[] arrayOfChar1 = "xd\\".toCharArray();
    int m = arrayOfChar1.length;
    int n = 0;
    char[] arrayOfChar2;
    int i4;
    char[] arrayOfChar3;
    int i8;
    char[] arrayOfChar4;
    int i12;
    char[] arrayOfChar5;
    int i16;
    char[] arrayOfChar6;
    int i20;
    char[] arrayOfChar7;
    int i24;
    char[] arrayOfChar8;
    int i28;
    char[] arrayOfChar9;
    int i32;
    char[] arrayOfChar10;
    int i36;
    char[] arrayOfChar11;
    int i40;
    char[] arrayOfChar12;
    int i44;
    char[] arrayOfChar13;
    int i48;
    char[] arrayOfChar14;
    int i52;
    char[] arrayOfChar15;
    int i56;
    char[] arrayOfChar16;
    int i60;
    char[] arrayOfChar17;
    int i64;
    char[] arrayOfChar18;
    int i68;
    char[] arrayOfChar19;
    int i72;
    char[] arrayOfChar20;
    int i76;
    char[] arrayOfChar21;
    int i80;
    char[] arrayOfChar22;
    int i84;
    char[] arrayOfChar23;
    int i88;
    char[] arrayOfChar24;
    int i92;
    char[] arrayOfChar25;
    int i96;
    char[] arrayOfChar26;
    int i100;
    char[] arrayOfChar27;
    int i104;
    char[] arrayOfChar28;
    int i108;
    char[] arrayOfChar29;
    int i112;
    char[] arrayOfChar30;
    int i116;
    char[] arrayOfChar31;
    int i120;
    char[] arrayOfChar32;
    int i124;
    char[] arrayOfChar33;
    int i128;
    char[] arrayOfChar34;
    int i132;
    char[] arrayOfChar35;
    int i136;
    char[] arrayOfChar36;
    int i140;
    char[] arrayOfChar37;
    int i144;
    char[] arrayOfChar38;
    int i148;
    char[] arrayOfChar39;
    int i152;
    char[] arrayOfChar40;
    int i156;
    char[] arrayOfChar41;
    int i160;
    char[] arrayOfChar42;
    int i164;
    char[] arrayOfChar43;
    int i168;
    char[] arrayOfChar44;
    int i172;
    char[] arrayOfChar45;
    int i176;
    char[] arrayOfChar46;
    int i180;
    char[] arrayOfChar47;
    int i184;
    char[] arrayOfChar48;
    int i188;
    char[] arrayOfChar49;
    int i192;
    if (m <= n)
    {
      arrayOfString1[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "ZVt\032\023F".toCharArray();
      int i3 = arrayOfChar2.length;
      i4 = 0;
      if (i3 <= i4)
      {
        arrayOfString1[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "FF~\021\005@Fk\013\017Z@6\037\023@|j\001\030W|{\031\002WK6\024\021Q\f|\n\004[Q".toCharArray();
        int i7 = arrayOfChar3.length;
        i8 = 0;
        if (i7 > i8)
          break label2149;
        arrayOfString1[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "]MF\016\037GJ{\024\023kDk\027\003D\003$XI".toCharArray();
        int i11 = arrayOfChar4.length;
        i12 = 0;
        if (i11 > i12)
          break label2241;
        arrayOfString1[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "PBm\031D".toCharArray();
        int i15 = arrayOfChar5.length;
        i16 = 0;
        if (i15 > i16)
          break label2333;
        arrayOfString1[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "FF~\021\005@Fk\013\017Z@6\013\002UQmW\021QWF\013\017Z@F\032\027@@q".toCharArray();
        int i19 = arrayOfChar6.length;
        i20 = 0;
        if (i19 > i20)
          break label2425;
        arrayOfString1[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "FF~\021\005@Fk\013\017Z@6\013\002UQmW\021QWF\013\017Z@F\032\027@@qW\025[Vw\fV".toCharArray();
        int i23 = arrayOfChar7.length;
        i24 = 0;
        if (i23 > i24)
          break label2517;
        arrayOfString1[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "FF~\021\005@Fk\013\017Z@6\037\023@|j\001\030W|{\031\002WK6\024\021Q".toCharArray();
        int i27 = arrayOfChar8.length;
        i28 = 0;
        if (i27 > i28)
          break label2609;
        arrayOfString1[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "PJj\b\032UZF\026\027YF".toCharArray();
        int i31 = arrayOfChar9.length;
        i32 = 0;
        if (i31 > i32)
          break label2701;
        arrayOfString1[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "ZBt\035".toCharArray();
        int i35 = arrayOfChar10.length;
        i36 = 0;
        if (i35 > i36)
          break label2793;
        arrayOfString1[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "FBn'\025[Mm\031\025@|p\034".toCharArray();
        int i39 = arrayOfChar11.length;
        i40 = 0;
        if (i39 > i40)
          break label2885;
        arrayOfString1[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "PBm\031G".toCharArray();
        int i43 = arrayOfChar12.length;
        i44 = 0;
        if (i43 > i44)
          break label2977;
        arrayOfString1[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "WLw\f\023ZW#WY]@zW\027PM".toCharArray();
        int i47 = arrayOfChar13.length;
        i48 = 0;
        if (i47 > i48)
          break label3069;
        arrayOfString1[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "]MF\016\037GJ{\024\023kDk\027\003D".toCharArray();
        int i51 = arrayOfChar14.length;
        i52 = 0;
        if (i51 > i52)
          break label3161;
        arrayOfString1[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "PBm\031E".toCharArray();
        int i55 = arrayOfChar15.length;
        i56 = 0;
        if (i55 > i56)
          break label3253;
        arrayOfString1[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "GZw\033YGZw\0337XO".toCharArray();
        int i59 = arrayOfChar16.length;
        i60 = 0;
        if (i59 > i60)
          break label3345;
        arrayOfString1[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "GZw\033Y]PF\031\032FFx\034\017kQl\026\030]M~W\005_Ji".toCharArray();
        int i63 = arrayOfChar17.length;
        i64 = 0;
        if (i63 > i64)
          break label3437;
        arrayOfString1[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "GZw\033YGWx\n\002\032\r7P\025[Vw\fK".toCharArray();
        int i67 = arrayOfChar18.length;
        i68 = 0;
        if (i67 > i68)
          break label3529;
        arrayOfString1[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "GZw\033Y@Jt\035)GJw\033\023kOx\013\002kP`\026\025\016\003".toCharArray();
        int i71 = arrayOfChar19.length;
        i72 = 0;
        if (i71 > i72)
          break label3621;
        arrayOfString1[18] = new String(arrayOfChar19).intern();
        arrayOfChar20 = "GZw\033YGZw\0332QOm\031".toCharArray();
        int i75 = arrayOfChar20.length;
        i76 = 0;
        if (i75 > i76)
          break label3713;
        arrayOfString1[19] = new String(arrayOfChar20).intern();
        arrayOfChar21 = "GZw\033YU@z\f)Q[i\021\004QG6\013\035]SF\013\017Z@".toCharArray();
        int i79 = arrayOfChar21.length;
        i80 = 0;
        if (i79 > i80)
          break label3805;
        arrayOfString1[20] = new String(arrayOfChar21).intern();
        arrayOfChar22 = "FFt\027��Q|u\021\005@".toCharArray();
        int i83 = arrayOfChar22.length;
        i84 = 0;
        if (i83 > i84)
          break label3897;
        arrayOfString1[21] = new String(arrayOfChar22).intern();
        arrayOfChar23 = "AS}\031\002Q".toCharArray();
        int i87 = arrayOfChar23.length;
        i88 = 0;
        if (i87 > i88)
          break label3989;
        arrayOfString1[22] = new String(arrayOfChar23).intern();
        arrayOfChar24 = "FFt\027��Q".toCharArray();
        int i91 = arrayOfChar24.length;
        i92 = 0;
        if (i91 > i92)
          break label4081;
        arrayOfString1[23] = new String(arrayOfChar24).intern();
        arrayOfChar25 = "GZw\033YGFi\031\004UW|W\032SF6\035\004FLkX".toCharArray();
        int i95 = arrayOfChar25.length;
        i96 = 0;
        if (i95 > i96)
          break label4173;
        arrayOfString1[24] = new String(arrayOfChar25).intern();
        arrayOfChar26 = "Q[m\n\027".toCharArray();
        int i99 = arrayOfChar26.length;
        i100 = 0;
        if (i99 > i100)
          break label4265;
        arrayOfString1[25] = new String(arrayOfChar26).intern();
        arrayOfChar27 = "Q[m\n\027kP`\026\025kOp\013\002".toCharArray();
        int i103 = arrayOfChar27.length;
        i104 = 0;
        if (i103 > i104)
          break label4357;
        arrayOfString1[26] = new String(arrayOfChar27).intern();
        arrayOfChar28 = "AS}\031\002Q|u\021\005@".toCharArray();
        int i107 = arrayOfChar28.length;
        i108 = 0;
        if (i107 > i108)
          break label4449;
        arrayOfString1[27] = new String(arrayOfChar28).intern();
        arrayOfChar29 = "GZw\033YGFi\031\004UW|W\032SF".toCharArray();
        int i111 = arrayOfChar29.length;
        i112 = 0;
        if (i111 > i112)
          break label4541;
        arrayOfString1[28] = new String(arrayOfChar29).intern();
        arrayOfChar30 = "GZw\033YGZw\0332QOm\031YUOu'\025[Mm\031\025@PF\024\037GW".toCharArray();
        int i115 = arrayOfChar30.length;
        i116 = 0;
        if (i115 > i116)
          break label4633;
        arrayOfString1[29] = new String(arrayOfChar30).intern();
        arrayOfChar31 = "GZw\033YRBp\024\003FF6\034\023XWx".toCharArray();
        int i119 = arrayOfChar31.length;
        i120 = 0;
        if (i119 > i120)
          break label4725;
        arrayOfString1[30] = new String(arrayOfChar31).intern();
        arrayOfChar32 = "GZw\033YGZw\0332QOm\031YWVk\013\031F\fz\027\003ZW9".toCharArray();
        int i123 = arrayOfChar32.length;
        i124 = 0;
        if (i123 > i124)
          break label4817;
        arrayOfString1[31] = new String(arrayOfChar32).intern();
        arrayOfChar33 = "UOu".toCharArray();
        int i127 = arrayOfChar33.length;
        i128 = 0;
        if (i127 > i128)
          break label4909;
        arrayOfString1[32] = new String(arrayOfChar33).intern();
        arrayOfChar34 = "GZw\033YGZw\0332QOm\031YQQk\027\004\024".toCharArray();
        int i131 = arrayOfChar34.length;
        i132 = 0;
        if (i131 > i132)
          break label5001;
        arrayOfString1[33] = new String(arrayOfChar34).intern();
        arrayOfChar35 = "GZw\033YGZw\0332QOm\031V\031\003m\021\033Q\003j\b\023ZW#".toCharArray();
        int i135 = arrayOfChar35.length;
        i136 = 0;
        if (i135 > i136)
          break label5093;
        arrayOfString1[34] = new String(arrayOfChar35).intern();
        arrayOfChar36 = "GZw\033YGZw\0332QOm\031Y".toCharArray();
        int i139 = arrayOfChar36.length;
        i140 = 0;
        if (i139 > i140)
          break label5185;
        arrayOfString1[35] = new String(arrayOfChar36).intern();
        arrayOfChar37 = "GZw\033YGZw\0332QOm\031YZL9\t\003QQ`".toCharArray();
        int i143 = arrayOfChar37.length;
        i144 = 0;
        if (i143 > i144)
          break label5277;
        arrayOfString1[36] = new String(arrayOfChar37).intern();
        arrayOfChar38 = "\024\013|\n\004[Q0".toCharArray();
        int i147 = arrayOfChar38.length;
        i148 = 0;
        if (i147 > i148)
          break label5369;
        arrayOfString1[37] = new String(arrayOfChar38).intern();
        arrayOfChar39 = "WLtV\027ZGk\027\037P\rz\027\030@Bz\f\005".toCharArray();
        int i151 = arrayOfChar39.length;
        i152 = 0;
        if (i151 > i152)
          break label5461;
        arrayOfString1[38] = new String(arrayOfChar39).intern();
        arrayOfChar40 = "GZw\033Y\\Bj\033\003FQ|\026\002GZw\033Y@Zi\035K".toCharArray();
        int i155 = arrayOfChar40.length;
        i156 = 0;
        if (i155 > i156)
          break label5553;
        arrayOfString1[39] = new String(arrayOfChar40).intern();
        arrayOfChar41 = "WLtV\001\\Bm\013\027DS".toCharArray();
        int i159 = arrayOfChar41.length;
        i160 = 0;
        if (i159 > i160)
          break label5645;
        arrayOfString1[40] = new String(arrayOfChar41).intern();
        arrayOfChar42 = "GZw\033YGZw\0337XO6".toCharArray();
        int i163 = arrayOfChar42.length;
        i164 = 0;
        if (i163 > i164)
          break label5737;
        arrayOfString1[41] = new String(arrayOfChar42).intern();
        arrayOfChar43 = "GZw\033YGZw\0337XO6\033\003FPv\nYWLl\026\002\024".toCharArray();
        int i167 = arrayOfChar43.length;
        i168 = 0;
        if (i167 > i168)
          break label5829;
        arrayOfString1[42] = new String(arrayOfChar43).intern();
        arrayOfChar44 = "GZw\033YGZw\0337XO9UV@Jt\035VGS|\026\002\016".toCharArray();
        int i171 = arrayOfChar44.length;
        i172 = 0;
        if (i171 > i172)
          break label5921;
        arrayOfString1[43] = new String(arrayOfChar44).intern();
        arrayOfChar45 = "GZw\033YGZw\0337XO6\031\032X|z\027\030@Bz\f\005kOp\013\002".toCharArray();
        int i175 = arrayOfChar45.length;
        i176 = 0;
        if (i175 > i176)
          break label6013;
        arrayOfString1[44] = new String(arrayOfChar45).intern();
        arrayOfChar46 = "GZw\033YGZw\0337XO6\021\030@Fk\n\003DW|\034\023FQv\nV".toCharArray();
        int i179 = arrayOfChar46.length;
        i180 = 0;
        if (i179 > i180)
          break label6105;
        arrayOfString1[45] = new String(arrayOfChar46).intern();
        arrayOfChar47 = "GZw\033YGZw\0337XO6\021\030BJj\021\024XF6\033\003FPv\nYWLl\026\002\024".toCharArray();
        int i183 = arrayOfChar47.length;
        i184 = 0;
        if (i183 > i184)
          break label6197;
        arrayOfString1[46] = new String(arrayOfChar47).intern();
        arrayOfChar48 = "GZw\033YGZw\0337XO6\026\031\024Rl\035\004M".toCharArray();
        int i187 = arrayOfChar48.length;
        i188 = 0;
        if (i187 > i188)
          break label6289;
        arrayOfString1[47] = new String(arrayOfChar48).intern();
        arrayOfChar49 = "SFm\021\030BJj\021\024XF6\033\003FPv\nYWLl\026\002\024".toCharArray();
        int i191 = arrayOfChar49.length;
        i192 = 0;
        if (i191 > i192)
          break label6381;
        arrayOfString1[48] = new String(arrayOfChar49).intern();
        z = arrayOfString1;
        a = false;
        b = new Object();
        c = System.currentTimeMillis();
        d = false;
        e = new up();
        f = 0;
        g = false;
        h = -1;
        i = true;
        j = true;
        String[] arrayOfString2 = new String[5];
        arrayOfString2[0] = z[10];
        arrayOfString2[1] = z[8];
        arrayOfString2[2] = z[11];
        arrayOfString2[3] = z[4];
        arrayOfString2[4] = z[14];
        k = arrayOfString2;
      }
    }
    else
    {
      int i1 = arrayOfChar1[n];
      int i2;
      switch (n % 5)
      {
      default:
        i2 = 118;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[n] = (char)(i2 ^ i1);
        n++;
        break;
        i2 = 52;
        continue;
        i2 = 35;
        continue;
        i2 = 25;
        continue;
        i2 = 120;
      }
    }
    int i5 = arrayOfChar2[i4];
    int i6;
    switch (i4 % 5)
    {
    default:
      i6 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i4] = (char)(i6 ^ i5);
      i4++;
      break;
      i6 = 52;
      continue;
      i6 = 35;
      continue;
      i6 = 25;
      continue;
      i6 = 120;
    }
    label2149: int i9 = arrayOfChar3[i8];
    int i10;
    switch (i8 % 5)
    {
    default:
      i10 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i8] = (char)(i10 ^ i9);
      i8++;
      break;
      i10 = 52;
      continue;
      i10 = 35;
      continue;
      i10 = 25;
      continue;
      i10 = 120;
    }
    label2241: int i13 = arrayOfChar4[i12];
    int i14;
    switch (i12 % 5)
    {
    default:
      i14 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i12] = (char)(i14 ^ i13);
      i12++;
      break;
      i14 = 52;
      continue;
      i14 = 35;
      continue;
      i14 = 25;
      continue;
      i14 = 120;
    }
    label2333: int i17 = arrayOfChar5[i16];
    int i18;
    switch (i16 % 5)
    {
    default:
      i18 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i16] = (char)(i18 ^ i17);
      i16++;
      break;
      i18 = 52;
      continue;
      i18 = 35;
      continue;
      i18 = 25;
      continue;
      i18 = 120;
    }
    label2425: int i21 = arrayOfChar6[i20];
    int i22;
    switch (i20 % 5)
    {
    default:
      i22 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i20] = (char)(i22 ^ i21);
      i20++;
      break;
      i22 = 52;
      continue;
      i22 = 35;
      continue;
      i22 = 25;
      continue;
      i22 = 120;
    }
    label2517: int i25 = arrayOfChar7[i24];
    int i26;
    switch (i24 % 5)
    {
    default:
      i26 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i24] = (char)(i26 ^ i25);
      i24++;
      break;
      i26 = 52;
      continue;
      i26 = 35;
      continue;
      i26 = 25;
      continue;
      i26 = 120;
    }
    label2609: int i29 = arrayOfChar8[i28];
    int i30;
    switch (i28 % 5)
    {
    default:
      i30 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar8[i28] = (char)(i30 ^ i29);
      i28++;
      break;
      i30 = 52;
      continue;
      i30 = 35;
      continue;
      i30 = 25;
      continue;
      i30 = 120;
    }
    label2701: int i33 = arrayOfChar9[i32];
    int i34;
    switch (i32 % 5)
    {
    default:
      i34 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar9[i32] = (char)(i34 ^ i33);
      i32++;
      break;
      i34 = 52;
      continue;
      i34 = 35;
      continue;
      i34 = 25;
      continue;
      i34 = 120;
    }
    label2793: int i37 = arrayOfChar10[i36];
    int i38;
    switch (i36 % 5)
    {
    default:
      i38 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar10[i36] = (char)(i38 ^ i37);
      i36++;
      break;
      i38 = 52;
      continue;
      i38 = 35;
      continue;
      i38 = 25;
      continue;
      i38 = 120;
    }
    label2885: int i41 = arrayOfChar11[i40];
    int i42;
    switch (i40 % 5)
    {
    default:
      i42 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar11[i40] = (char)(i42 ^ i41);
      i40++;
      break;
      i42 = 52;
      continue;
      i42 = 35;
      continue;
      i42 = 25;
      continue;
      i42 = 120;
    }
    label2977: int i45 = arrayOfChar12[i44];
    int i46;
    switch (i44 % 5)
    {
    default:
      i46 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar12[i44] = (char)(i46 ^ i45);
      i44++;
      break;
      i46 = 52;
      continue;
      i46 = 35;
      continue;
      i46 = 25;
      continue;
      i46 = 120;
    }
    label3069: int i49 = arrayOfChar13[i48];
    int i50;
    switch (i48 % 5)
    {
    default:
      i50 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar13[i48] = (char)(i50 ^ i49);
      i48++;
      break;
      i50 = 52;
      continue;
      i50 = 35;
      continue;
      i50 = 25;
      continue;
      i50 = 120;
    }
    label3161: int i53 = arrayOfChar14[i52];
    int i54;
    switch (i52 % 5)
    {
    default:
      i54 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar14[i52] = (char)(i54 ^ i53);
      i52++;
      break;
      i54 = 52;
      continue;
      i54 = 35;
      continue;
      i54 = 25;
      continue;
      i54 = 120;
    }
    label3253: int i57 = arrayOfChar15[i56];
    int i58;
    switch (i56 % 5)
    {
    default:
      i58 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar15[i56] = (char)(i58 ^ i57);
      i56++;
      break;
      i58 = 52;
      continue;
      i58 = 35;
      continue;
      i58 = 25;
      continue;
      i58 = 120;
    }
    label3345: int i61 = arrayOfChar16[i60];
    int i62;
    switch (i60 % 5)
    {
    default:
      i62 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar16[i60] = (char)(i62 ^ i61);
      i60++;
      break;
      i62 = 52;
      continue;
      i62 = 35;
      continue;
      i62 = 25;
      continue;
      i62 = 120;
    }
    label3437: int i65 = arrayOfChar17[i64];
    int i66;
    switch (i64 % 5)
    {
    default:
      i66 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar17[i64] = (char)(i66 ^ i65);
      i64++;
      break;
      i66 = 52;
      continue;
      i66 = 35;
      continue;
      i66 = 25;
      continue;
      i66 = 120;
    }
    label3529: int i69 = arrayOfChar18[i68];
    int i70;
    switch (i68 % 5)
    {
    default:
      i70 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar18[i68] = (char)(i70 ^ i69);
      i68++;
      break;
      i70 = 52;
      continue;
      i70 = 35;
      continue;
      i70 = 25;
      continue;
      i70 = 120;
    }
    label3621: int i73 = arrayOfChar19[i72];
    int i74;
    switch (i72 % 5)
    {
    default:
      i74 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar19[i72] = (char)(i74 ^ i73);
      i72++;
      break;
      i74 = 52;
      continue;
      i74 = 35;
      continue;
      i74 = 25;
      continue;
      i74 = 120;
    }
    label3713: int i77 = arrayOfChar20[i76];
    int i78;
    switch (i76 % 5)
    {
    default:
      i78 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar20[i76] = (char)(i78 ^ i77);
      i76++;
      break;
      i78 = 52;
      continue;
      i78 = 35;
      continue;
      i78 = 25;
      continue;
      i78 = 120;
    }
    label3805: int i81 = arrayOfChar21[i80];
    int i82;
    switch (i80 % 5)
    {
    default:
      i82 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar21[i80] = (char)(i82 ^ i81);
      i80++;
      break;
      i82 = 52;
      continue;
      i82 = 35;
      continue;
      i82 = 25;
      continue;
      i82 = 120;
    }
    label3897: int i85 = arrayOfChar22[i84];
    int i86;
    switch (i84 % 5)
    {
    default:
      i86 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar22[i84] = (char)(i86 ^ i85);
      i84++;
      break;
      i86 = 52;
      continue;
      i86 = 35;
      continue;
      i86 = 25;
      continue;
      i86 = 120;
    }
    label3989: int i89 = arrayOfChar23[i88];
    int i90;
    switch (i88 % 5)
    {
    default:
      i90 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar23[i88] = (char)(i90 ^ i89);
      i88++;
      break;
      i90 = 52;
      continue;
      i90 = 35;
      continue;
      i90 = 25;
      continue;
      i90 = 120;
    }
    label4081: int i93 = arrayOfChar24[i92];
    int i94;
    switch (i92 % 5)
    {
    default:
      i94 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar24[i92] = (char)(i94 ^ i93);
      i92++;
      break;
      i94 = 52;
      continue;
      i94 = 35;
      continue;
      i94 = 25;
      continue;
      i94 = 120;
    }
    label4173: int i97 = arrayOfChar25[i96];
    int i98;
    switch (i96 % 5)
    {
    default:
      i98 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar25[i96] = (char)(i98 ^ i97);
      i96++;
      break;
      i98 = 52;
      continue;
      i98 = 35;
      continue;
      i98 = 25;
      continue;
      i98 = 120;
    }
    label4265: int i101 = arrayOfChar26[i100];
    int i102;
    switch (i100 % 5)
    {
    default:
      i102 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar26[i100] = (char)(i102 ^ i101);
      i100++;
      break;
      i102 = 52;
      continue;
      i102 = 35;
      continue;
      i102 = 25;
      continue;
      i102 = 120;
    }
    label4357: int i105 = arrayOfChar27[i104];
    int i106;
    switch (i104 % 5)
    {
    default:
      i106 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar27[i104] = (char)(i106 ^ i105);
      i104++;
      break;
      i106 = 52;
      continue;
      i106 = 35;
      continue;
      i106 = 25;
      continue;
      i106 = 120;
    }
    label4449: int i109 = arrayOfChar28[i108];
    int i110;
    switch (i108 % 5)
    {
    default:
      i110 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar28[i108] = (char)(i110 ^ i109);
      i108++;
      break;
      i110 = 52;
      continue;
      i110 = 35;
      continue;
      i110 = 25;
      continue;
      i110 = 120;
    }
    label4541: int i113 = arrayOfChar29[i112];
    int i114;
    switch (i112 % 5)
    {
    default:
      i114 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar29[i112] = (char)(i114 ^ i113);
      i112++;
      break;
      i114 = 52;
      continue;
      i114 = 35;
      continue;
      i114 = 25;
      continue;
      i114 = 120;
    }
    label4633: int i117 = arrayOfChar30[i116];
    int i118;
    switch (i116 % 5)
    {
    default:
      i118 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar30[i116] = (char)(i118 ^ i117);
      i116++;
      break;
      i118 = 52;
      continue;
      i118 = 35;
      continue;
      i118 = 25;
      continue;
      i118 = 120;
    }
    label4725: int i121 = arrayOfChar31[i120];
    int i122;
    switch (i120 % 5)
    {
    default:
      i122 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar31[i120] = (char)(i122 ^ i121);
      i120++;
      break;
      i122 = 52;
      continue;
      i122 = 35;
      continue;
      i122 = 25;
      continue;
      i122 = 120;
    }
    label4817: int i125 = arrayOfChar32[i124];
    int i126;
    switch (i124 % 5)
    {
    default:
      i126 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar32[i124] = (char)(i126 ^ i125);
      i124++;
      break;
      i126 = 52;
      continue;
      i126 = 35;
      continue;
      i126 = 25;
      continue;
      i126 = 120;
    }
    label4909: int i129 = arrayOfChar33[i128];
    int i130;
    switch (i128 % 5)
    {
    default:
      i130 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar33[i128] = (char)(i130 ^ i129);
      i128++;
      break;
      i130 = 52;
      continue;
      i130 = 35;
      continue;
      i130 = 25;
      continue;
      i130 = 120;
    }
    label5001: int i133 = arrayOfChar34[i132];
    int i134;
    switch (i132 % 5)
    {
    default:
      i134 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar34[i132] = (char)(i134 ^ i133);
      i132++;
      break;
      i134 = 52;
      continue;
      i134 = 35;
      continue;
      i134 = 25;
      continue;
      i134 = 120;
    }
    label5093: int i137 = arrayOfChar35[i136];
    int i138;
    switch (i136 % 5)
    {
    default:
      i138 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar35[i136] = (char)(i138 ^ i137);
      i136++;
      break;
      i138 = 52;
      continue;
      i138 = 35;
      continue;
      i138 = 25;
      continue;
      i138 = 120;
    }
    label5185: int i141 = arrayOfChar36[i140];
    int i142;
    switch (i140 % 5)
    {
    default:
      i142 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar36[i140] = (char)(i142 ^ i141);
      i140++;
      break;
      i142 = 52;
      continue;
      i142 = 35;
      continue;
      i142 = 25;
      continue;
      i142 = 120;
    }
    label5277: int i145 = arrayOfChar37[i144];
    int i146;
    switch (i144 % 5)
    {
    default:
      i146 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar37[i144] = (char)(i146 ^ i145);
      i144++;
      break;
      i146 = 52;
      continue;
      i146 = 35;
      continue;
      i146 = 25;
      continue;
      i146 = 120;
    }
    label5369: int i149 = arrayOfChar38[i148];
    int i150;
    switch (i148 % 5)
    {
    default:
      i150 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar38[i148] = (char)(i150 ^ i149);
      i148++;
      break;
      i150 = 52;
      continue;
      i150 = 35;
      continue;
      i150 = 25;
      continue;
      i150 = 120;
    }
    label5461: int i153 = arrayOfChar39[i152];
    int i154;
    switch (i152 % 5)
    {
    default:
      i154 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar39[i152] = (char)(i154 ^ i153);
      i152++;
      break;
      i154 = 52;
      continue;
      i154 = 35;
      continue;
      i154 = 25;
      continue;
      i154 = 120;
    }
    label5553: int i157 = arrayOfChar40[i156];
    int i158;
    switch (i156 % 5)
    {
    default:
      i158 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar40[i156] = (char)(i158 ^ i157);
      i156++;
      break;
      i158 = 52;
      continue;
      i158 = 35;
      continue;
      i158 = 25;
      continue;
      i158 = 120;
    }
    label5645: int i161 = arrayOfChar41[i160];
    int i162;
    switch (i160 % 5)
    {
    default:
      i162 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar41[i160] = (char)(i162 ^ i161);
      i160++;
      break;
      i162 = 52;
      continue;
      i162 = 35;
      continue;
      i162 = 25;
      continue;
      i162 = 120;
    }
    label5737: int i165 = arrayOfChar42[i164];
    int i166;
    switch (i164 % 5)
    {
    default:
      i166 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar42[i164] = (char)(i166 ^ i165);
      i164++;
      break;
      i166 = 52;
      continue;
      i166 = 35;
      continue;
      i166 = 25;
      continue;
      i166 = 120;
    }
    label5829: int i169 = arrayOfChar43[i168];
    int i170;
    switch (i168 % 5)
    {
    default:
      i170 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar43[i168] = (char)(i170 ^ i169);
      i168++;
      break;
      i170 = 52;
      continue;
      i170 = 35;
      continue;
      i170 = 25;
      continue;
      i170 = 120;
    }
    label5921: int i173 = arrayOfChar44[i172];
    int i174;
    switch (i172 % 5)
    {
    default:
      i174 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar44[i172] = (char)(i174 ^ i173);
      i172++;
      break;
      i174 = 52;
      continue;
      i174 = 35;
      continue;
      i174 = 25;
      continue;
      i174 = 120;
    }
    label6013: int i177 = arrayOfChar45[i176];
    int i178;
    switch (i176 % 5)
    {
    default:
      i178 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar45[i176] = (char)(i178 ^ i177);
      i176++;
      break;
      i178 = 52;
      continue;
      i178 = 35;
      continue;
      i178 = 25;
      continue;
      i178 = 120;
    }
    label6105: int i181 = arrayOfChar46[i180];
    int i182;
    switch (i180 % 5)
    {
    default:
      i182 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar46[i180] = (char)(i182 ^ i181);
      i180++;
      break;
      i182 = 52;
      continue;
      i182 = 35;
      continue;
      i182 = 25;
      continue;
      i182 = 120;
    }
    label6197: int i185 = arrayOfChar47[i184];
    int i186;
    switch (i184 % 5)
    {
    default:
      i186 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar47[i184] = (char)(i186 ^ i185);
      i184++;
      break;
      i186 = 52;
      continue;
      i186 = 35;
      continue;
      i186 = 25;
      continue;
      i186 = 120;
    }
    label6289: int i189 = arrayOfChar48[i188];
    int i190;
    switch (i188 % 5)
    {
    default:
      i190 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar48[i188] = (char)(i190 ^ i189);
      i188++;
      break;
      i190 = 52;
      continue;
      i190 = 35;
      continue;
      i190 = 25;
      continue;
      i190 = 120;
    }
    label6381: int i193 = arrayOfChar49[i192];
    int i194;
    switch (i192 % 5)
    {
    default:
      i194 = 118;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar49[i192] = (char)(i194 ^ i193);
      i192++;
      break;
      i194 = 52;
      continue;
      i194 = 35;
      continue;
      i194 = 25;
      continue;
      i194 = 120;
    }
  }

  // ERROR //
  public static int a(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: new 176	java/lang/StringBuilder
    //   5: dup
    //   6: invokespecial 177	java/lang/StringBuilder:<init>	()V
    //   9: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   12: bipush 18
    //   14: aaload
    //   15: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   18: invokestatic 150	java/lang/System:currentTimeMillis	()J
    //   21: getstatic 152	com/whatsapp/tp:c	J
    //   24: lsub
    //   25: ldc2_w 182
    //   28: ldiv
    //   29: invokevirtual 186	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   32: ldc 188
    //   34: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   40: invokestatic 196	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   43: invokestatic 199	com/whatsapp/tp:a	()Z
    //   46: ifne +5 -> 51
    //   49: iload_1
    //   50: ireturn
    //   51: getstatic 144	com/whatsapp/tp:b	Ljava/lang/Object;
    //   54: astore_2
    //   55: aload_2
    //   56: monitorenter
    //   57: getstatic 140	com/whatsapp/tp:a	Z
    //   60: istore 4
    //   62: iconst_1
    //   63: putstatic 140	com/whatsapp/tp:a	Z
    //   66: aload_2
    //   67: monitorexit
    //   68: iload 4
    //   70: ifeq +26 -> 96
    //   73: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   76: bipush 16
    //   78: aaload
    //   79: invokestatic 196	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   82: iconst_0
    //   83: putstatic 154	com/whatsapp/tp:d	Z
    //   86: iconst_2
    //   87: istore_1
    //   88: goto -39 -> 49
    //   91: astore_3
    //   92: aload_2
    //   93: monitorexit
    //   94: aload_3
    //   95: athrow
    //   96: invokestatic 204	com/whatsapp/App:sb	()Z
    //   99: ifne +31 -> 130
    //   102: getstatic 144	com/whatsapp/tp:b	Ljava/lang/Object;
    //   105: astore 14
    //   107: aload 14
    //   109: monitorenter
    //   110: iconst_0
    //   111: putstatic 140	com/whatsapp/tp:a	Z
    //   114: aload 14
    //   116: monitorexit
    //   117: iconst_3
    //   118: istore_1
    //   119: goto -70 -> 49
    //   122: astore 15
    //   124: aload 14
    //   126: monitorexit
    //   127: aload 15
    //   129: athrow
    //   130: new 176	java/lang/StringBuilder
    //   133: dup
    //   134: invokespecial 177	java/lang/StringBuilder:<init>	()V
    //   137: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   140: bipush 17
    //   142: aaload
    //   143: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: getstatic 208	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   149: invokevirtual 212	com/whatsapp/App:getApplicationContext	()Landroid/content/Context;
    //   152: invokestatic 215	com/whatsapp/App:h	(Landroid/content/Context;)I
    //   155: invokevirtual 218	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   158: ldc 220
    //   160: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   166: invokestatic 196	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   169: getstatic 223	com/whatsapp/g:d	Z
    //   172: ifeq +7 -> 179
    //   175: iconst_1
    //   176: putstatic 225	com/whatsapp/g:e	Z
    //   179: iconst_0
    //   180: putstatic 161	com/whatsapp/tp:f	I
    //   183: iload_0
    //   184: ifeq +27 -> 211
    //   187: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   190: bipush 15
    //   192: aaload
    //   193: invokestatic 227	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   196: getstatic 159	com/whatsapp/tp:e	Lcom/whatsapp/vp;
    //   199: invokestatic 230	com/whatsapp/tp:a	(Lcom/whatsapp/vp;)Z
    //   202: putstatic 163	com/whatsapp/tp:g	Z
    //   205: getstatic 234	com/whatsapp/yq:e	I
    //   208: ifeq +21 -> 229
    //   211: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   214: bipush 19
    //   216: aaload
    //   217: invokestatic 227	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   220: getstatic 159	com/whatsapp/tp:e	Lcom/whatsapp/vp;
    //   223: invokestatic 236	com/whatsapp/tp:b	(Lcom/whatsapp/vp;)Z
    //   226: putstatic 163	com/whatsapp/tp:g	Z
    //   229: iconst_0
    //   230: putstatic 154	com/whatsapp/tp:d	Z
    //   233: getstatic 163	com/whatsapp/tp:g	Z
    //   236: istore 9
    //   238: iload 9
    //   240: ifeq +41 -> 281
    //   243: getstatic 144	com/whatsapp/tp:b	Ljava/lang/Object;
    //   246: astore 12
    //   248: aload 12
    //   250: monitorenter
    //   251: getstatic 163	com/whatsapp/tp:g	Z
    //   254: ifeq +9 -> 263
    //   257: getstatic 165	com/whatsapp/tp:h	I
    //   260: invokestatic 239	com/whatsapp/g:a	(I)V
    //   263: iconst_0
    //   264: putstatic 140	com/whatsapp/tp:a	Z
    //   267: aload 12
    //   269: monitorexit
    //   270: goto -221 -> 49
    //   273: astore 13
    //   275: aload 12
    //   277: monitorexit
    //   278: aload 13
    //   280: athrow
    //   281: getstatic 144	com/whatsapp/tp:b	Ljava/lang/Object;
    //   284: astore 10
    //   286: aload 10
    //   288: monitorenter
    //   289: getstatic 163	com/whatsapp/tp:g	Z
    //   292: ifeq +9 -> 301
    //   295: getstatic 165	com/whatsapp/tp:h	I
    //   298: invokestatic 239	com/whatsapp/g:a	(I)V
    //   301: iconst_0
    //   302: putstatic 140	com/whatsapp/tp:a	Z
    //   305: aload 10
    //   307: monitorexit
    //   308: iconst_0
    //   309: istore_1
    //   310: goto -261 -> 49
    //   313: astore 11
    //   315: aload 10
    //   317: monitorexit
    //   318: aload 11
    //   320: athrow
    //   321: astore 8
    //   323: invokestatic 243	com/whatsapp/b5:a	()V
    //   326: aload 8
    //   328: athrow
    //   329: astore 5
    //   331: getstatic 144	com/whatsapp/tp:b	Ljava/lang/Object;
    //   334: astore 6
    //   336: aload 6
    //   338: monitorenter
    //   339: getstatic 163	com/whatsapp/tp:g	Z
    //   342: ifeq +9 -> 351
    //   345: getstatic 165	com/whatsapp/tp:h	I
    //   348: invokestatic 239	com/whatsapp/g:a	(I)V
    //   351: iconst_0
    //   352: putstatic 140	com/whatsapp/tp:a	Z
    //   355: aload 6
    //   357: monitorexit
    //   358: aload 5
    //   360: athrow
    //   361: astore 7
    //   363: aload 6
    //   365: monitorexit
    //   366: aload 7
    //   368: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   57	68	91	finally
    //   92	94	91	finally
    //   110	127	122	finally
    //   251	278	273	finally
    //   289	318	313	finally
    //   130	238	321	android/database/sqlite/SQLiteFullException
    //   130	238	329	finally
    //   323	329	329	finally
    //   339	358	361	finally
    //   363	366	361	finally
  }

  // ERROR //
  private static void a(Cursor paramCursor, ArrayList<zq> paramArrayList1, HashMap<uq, zq> paramHashMap1, ArrayList<zq> paramArrayList2, HashMap<uq, zq> paramHashMap2, String paramString)
  {
    // Byte code:
    //   0: getstatic 234	com/whatsapp/yq:e	I
    //   3: istore 6
    //   5: aload_0
    //   6: invokeinterface 251 1 0
    //   11: ifeq +301 -> 312
    //   14: aload_0
    //   15: iconst_2
    //   16: invokeinterface 255 2 0
    //   21: invokestatic 261	android/telephony/PhoneNumberUtils:stripSeparators	(Ljava/lang/String;)Ljava/lang/String;
    //   24: astore 20
    //   26: aload 20
    //   28: ifnull +279 -> 307
    //   31: aload 20
    //   33: invokevirtual 265	java/lang/String:length	()I
    //   36: invokestatic 268	com/whatsapp/tp:a	(I)Z
    //   39: ifeq +268 -> 307
    //   42: new 270	com/whatsapp/uq
    //   45: dup
    //   46: aload_0
    //   47: iconst_0
    //   48: invokeinterface 274 2 0
    //   53: aload 20
    //   55: invokespecial 277	com/whatsapp/uq:<init>	(JLjava/lang/String;)V
    //   58: astore 21
    //   60: aload 4
    //   62: aload 21
    //   64: invokevirtual 283	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   67: checkcast 285	com/whatsapp/zq
    //   70: astore 22
    //   72: aload 22
    //   74: ifnonnull +85 -> 159
    //   77: aload 20
    //   79: invokestatic 289	android/telephony/PhoneNumberUtils:isGlobalPhoneNumber	(Ljava/lang/String;)Z
    //   82: ifeq +225 -> 307
    //   85: new 285	com/whatsapp/zq
    //   88: dup
    //   89: aload 21
    //   91: aload_0
    //   92: iconst_1
    //   93: invokeinterface 255 2 0
    //   98: aload_0
    //   99: iconst_3
    //   100: invokeinterface 293 2 0
    //   105: aload_0
    //   106: iconst_4
    //   107: invokeinterface 255 2 0
    //   112: invokespecial 296	com/whatsapp/zq:<init>	(Lcom/whatsapp/uq;Ljava/lang/String;ILjava/lang/String;)V
    //   115: astore 28
    //   117: getstatic 297	com/whatsapp/App:f	I
    //   120: iconst_2
    //   121: if_icmpne +26 -> 147
    //   124: aload_0
    //   125: iconst_5
    //   126: invokeinterface 293 2 0
    //   131: iconst_1
    //   132: if_icmpne +22 -> 154
    //   135: aload_1
    //   136: aload 28
    //   138: invokevirtual 303	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   141: pop
    //   142: iload 6
    //   144: ifeq +10 -> 154
    //   147: aload_1
    //   148: aload 28
    //   150: invokevirtual 303	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   153: pop
    //   154: iload 6
    //   156: ifeq +151 -> 307
    //   159: aload_0
    //   160: iconst_1
    //   161: invokeinterface 255 2 0
    //   166: astore 23
    //   168: aload_0
    //   169: iconst_3
    //   170: invokeinterface 293 2 0
    //   175: istore 24
    //   177: aload_0
    //   178: iconst_4
    //   179: invokeinterface 255 2 0
    //   184: astore 25
    //   186: aload 22
    //   188: getfield 306	com/whatsapp/zq:h	Ljava/lang/String;
    //   191: ifnonnull +8 -> 199
    //   194: aload 23
    //   196: ifnonnull +63 -> 259
    //   199: aload 22
    //   201: getfield 306	com/whatsapp/zq:h	Ljava/lang/String;
    //   204: ifnull +16 -> 220
    //   207: aload 22
    //   209: getfield 306	com/whatsapp/zq:h	Ljava/lang/String;
    //   212: aload 23
    //   214: invokevirtual 309	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   217: ifeq +42 -> 259
    //   220: aload 22
    //   222: getfield 312	com/whatsapp/zq:i	Ljava/lang/Integer;
    //   225: invokevirtual 317	java/lang/Integer:intValue	()I
    //   228: iload 24
    //   230: if_icmpne +29 -> 259
    //   233: iload 24
    //   235: ifne +60 -> 295
    //   238: aload 22
    //   240: getfield 319	com/whatsapp/zq:j	Ljava/lang/String;
    //   243: ifnull +52 -> 295
    //   246: aload 22
    //   248: getfield 319	com/whatsapp/zq:j	Ljava/lang/String;
    //   251: aload 25
    //   253: invokevirtual 309	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   256: ifne +39 -> 295
    //   259: aload 22
    //   261: aload 23
    //   263: putfield 306	com/whatsapp/zq:h	Ljava/lang/String;
    //   266: aload 22
    //   268: iload 24
    //   270: invokestatic 323	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   273: putfield 312	com/whatsapp/zq:i	Ljava/lang/Integer;
    //   276: aload 22
    //   278: aload 25
    //   280: putfield 319	com/whatsapp/zq:j	Ljava/lang/String;
    //   283: aload 22
    //   285: invokevirtual 325	com/whatsapp/zq:c	()V
    //   288: aload_3
    //   289: aload 22
    //   291: invokevirtual 303	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   294: pop
    //   295: aload_2
    //   296: aload 22
    //   298: getfield 328	com/whatsapp/zq:g	Lcom/whatsapp/uq;
    //   301: aload 22
    //   303: invokevirtual 332	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   306: pop
    //   307: iload 6
    //   309: ifeq -304 -> 5
    //   312: getstatic 337	android/os/Build:MANUFACTURER	Ljava/lang/String;
    //   315: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   318: iconst_0
    //   319: aaload
    //   320: invokevirtual 340	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   323: ifeq +282 -> 605
    //   326: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   329: bipush 28
    //   331: aaload
    //   332: invokestatic 196	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   335: getstatic 344	com/whatsapp/App:ib	Landroid/content/ContentResolver;
    //   338: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   341: bipush 12
    //   343: aaload
    //   344: invokestatic 350	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   347: aconst_null
    //   348: aconst_null
    //   349: aconst_null
    //   350: aconst_null
    //   351: invokevirtual 356	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   354: astore 13
    //   356: aload 13
    //   358: astore 10
    //   360: aload 10
    //   362: invokeinterface 251 1 0
    //   367: ifeq +226 -> 593
    //   370: aload 10
    //   372: aload 10
    //   374: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   377: iconst_1
    //   378: aaload
    //   379: invokeinterface 360 2 0
    //   384: invokeinterface 255 2 0
    //   389: invokestatic 261	android/telephony/PhoneNumberUtils:stripSeparators	(Ljava/lang/String;)Ljava/lang/String;
    //   392: astore 14
    //   394: aload 14
    //   396: ifnull +192 -> 588
    //   399: aload 14
    //   401: invokevirtual 265	java/lang/String:length	()I
    //   404: invokestatic 268	com/whatsapp/tp:a	(I)Z
    //   407: ifeq +181 -> 588
    //   410: aload 4
    //   412: new 270	com/whatsapp/uq
    //   415: dup
    //   416: ldc2_w 361
    //   419: aload 14
    //   421: invokespecial 277	com/whatsapp/uq:<init>	(JLjava/lang/String;)V
    //   424: invokevirtual 283	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   427: checkcast 285	com/whatsapp/zq
    //   430: astore 15
    //   432: aload 15
    //   434: ifnonnull +67 -> 501
    //   437: aload 14
    //   439: invokestatic 289	android/telephony/PhoneNumberUtils:isGlobalPhoneNumber	(Ljava/lang/String;)Z
    //   442: ifeq +146 -> 588
    //   445: new 285	com/whatsapp/zq
    //   448: dup
    //   449: aload 14
    //   451: ldc2_w 361
    //   454: aload 10
    //   456: aload 10
    //   458: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   461: bipush 9
    //   463: aaload
    //   464: invokeinterface 360 2 0
    //   469: invokeinterface 255 2 0
    //   474: iconst_0
    //   475: getstatic 208	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   478: ldc_w 363
    //   481: invokevirtual 364	com/whatsapp/App:getString	(I)Ljava/lang/String;
    //   484: invokespecial 367	com/whatsapp/zq:<init>	(Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;)V
    //   487: astore 15
    //   489: aload_1
    //   490: aload 15
    //   492: invokevirtual 303	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   495: pop
    //   496: iload 6
    //   498: ifeq +90 -> 588
    //   501: aload 10
    //   503: aload 10
    //   505: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   508: bipush 9
    //   510: aaload
    //   511: invokeinterface 360 2 0
    //   516: invokeinterface 255 2 0
    //   521: astore 16
    //   523: aload 15
    //   525: getfield 306	com/whatsapp/zq:h	Ljava/lang/String;
    //   528: ifnonnull +8 -> 536
    //   531: aload 16
    //   533: ifnonnull +24 -> 557
    //   536: aload 15
    //   538: getfield 306	com/whatsapp/zq:h	Ljava/lang/String;
    //   541: ifnull +35 -> 576
    //   544: aload 15
    //   546: getfield 306	com/whatsapp/zq:h	Ljava/lang/String;
    //   549: aload 16
    //   551: invokevirtual 309	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   554: ifne +22 -> 576
    //   557: aload 15
    //   559: aload 16
    //   561: putfield 306	com/whatsapp/zq:h	Ljava/lang/String;
    //   564: aload 15
    //   566: invokevirtual 325	com/whatsapp/zq:c	()V
    //   569: aload_3
    //   570: aload 15
    //   572: invokevirtual 303	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   575: pop
    //   576: aload_2
    //   577: aload 15
    //   579: getfield 328	com/whatsapp/zq:g	Lcom/whatsapp/uq;
    //   582: aload 15
    //   584: invokevirtual 332	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   587: pop
    //   588: iload 6
    //   590: ifeq -230 -> 360
    //   593: aload 10
    //   595: ifnull +10 -> 605
    //   598: aload 10
    //   600: invokeinterface 370 1 0
    //   605: aload_1
    //   606: new 176	java/lang/StringBuilder
    //   609: dup
    //   610: invokespecial 177	java/lang/StringBuilder:<init>	()V
    //   613: aload 5
    //   615: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   618: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   621: bipush 26
    //   623: aaload
    //   624: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   627: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   630: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   633: bipush 25
    //   635: aaload
    //   636: invokestatic 373	com/whatsapp/zq:a	(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;)V
    //   639: aload_3
    //   640: new 176	java/lang/StringBuilder
    //   643: dup
    //   644: invokespecial 177	java/lang/StringBuilder:<init>	()V
    //   647: aload 5
    //   649: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   652: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   655: bipush 27
    //   657: aaload
    //   658: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   661: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   664: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   667: bipush 22
    //   669: aaload
    //   670: invokestatic 373	com/whatsapp/zq:a	(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;)V
    //   673: aload_2
    //   674: invokevirtual 377	java/util/HashMap:values	()Ljava/util/Collection;
    //   677: invokeinterface 383 1 0
    //   682: astore 7
    //   684: aload 7
    //   686: invokeinterface 388 1 0
    //   691: ifeq +27 -> 718
    //   694: aload 4
    //   696: aload 7
    //   698: invokeinterface 392 1 0
    //   703: checkcast 285	com/whatsapp/zq
    //   706: getfield 328	com/whatsapp/zq:g	Lcom/whatsapp/uq;
    //   709: invokevirtual 395	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   712: pop
    //   713: iload 6
    //   715: ifeq -31 -> 684
    //   718: aload 4
    //   720: invokevirtual 377	java/util/HashMap:values	()Ljava/util/Collection;
    //   723: new 176	java/lang/StringBuilder
    //   726: dup
    //   727: invokespecial 177	java/lang/StringBuilder:<init>	()V
    //   730: aload 5
    //   732: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   735: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   738: bipush 21
    //   740: aaload
    //   741: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   744: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   747: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   750: bipush 23
    //   752: aaload
    //   753: invokestatic 373	com/whatsapp/zq:a	(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;)V
    //   756: return
    //   757: astore 11
    //   759: aconst_null
    //   760: astore 12
    //   762: new 176	java/lang/StringBuilder
    //   765: dup
    //   766: invokespecial 177	java/lang/StringBuilder:<init>	()V
    //   769: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   772: bipush 24
    //   774: aaload
    //   775: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   778: aload 11
    //   780: invokevirtual 396	java/lang/Exception:toString	()Ljava/lang/String;
    //   783: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   786: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   789: invokestatic 398	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   792: aload 12
    //   794: ifnull -189 -> 605
    //   797: aload 12
    //   799: invokeinterface 370 1 0
    //   804: goto -199 -> 605
    //   807: astore 9
    //   809: aconst_null
    //   810: astore 10
    //   812: aload 10
    //   814: ifnull +10 -> 824
    //   817: aload 10
    //   819: invokeinterface 370 1 0
    //   824: aload 9
    //   826: athrow
    //   827: astore 9
    //   829: goto -17 -> 812
    //   832: astore 9
    //   834: aload 12
    //   836: astore 10
    //   838: goto -26 -> 812
    //   841: astore 11
    //   843: aload 10
    //   845: astore 12
    //   847: goto -85 -> 762
    //
    // Exception table:
    //   from	to	target	type
    //   335	356	757	java/lang/Exception
    //   335	356	807	finally
    //   360	588	827	finally
    //   762	792	832	finally
    //   360	588	841	java/lang/Exception
  }

  static boolean a()
  {
    boolean bool = true;
    if (eg.a(bool) == 0)
    {
      g5.b(z[20]);
      bool = false;
    }
    return bool;
  }

  private static boolean a(int paramInt)
  {
    if ((paramInt < 5) || (paramInt > 20));
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  // ERROR //
  private static boolean a(vp paramvp)
  {
    // Byte code:
    //   0: getstatic 234	com/whatsapp/yq:e	I
    //   3: istore_1
    //   4: iconst_1
    //   5: putstatic 167	com/whatsapp/tp:i	Z
    //   8: invokestatic 150	java/lang/System:currentTimeMillis	()J
    //   11: lstore_2
    //   12: new 299	java/util/ArrayList
    //   15: dup
    //   16: invokespecial 405	java/util/ArrayList:<init>	()V
    //   19: astore 4
    //   21: new 299	java/util/ArrayList
    //   24: dup
    //   25: invokespecial 405	java/util/ArrayList:<init>	()V
    //   28: astore 5
    //   30: new 279	java/util/HashMap
    //   33: dup
    //   34: invokespecial 406	java/util/HashMap:<init>	()V
    //   37: astore 6
    //   39: new 279	java/util/HashMap
    //   42: dup
    //   43: invokespecial 406	java/util/HashMap:<init>	()V
    //   46: astore 7
    //   48: new 279	java/util/HashMap
    //   51: dup
    //   52: invokespecial 406	java/util/HashMap:<init>	()V
    //   55: astore 8
    //   57: getstatic 410	com/whatsapp/App:w	Lcom/whatsapp/qp;
    //   60: aload 7
    //   62: aconst_null
    //   63: invokevirtual 415	com/whatsapp/qp:b	(Ljava/util/HashMap;Landroid/database/sqlite/SQLiteTransactionListener;)V
    //   66: aload 7
    //   68: invokevirtual 377	java/util/HashMap:values	()Ljava/util/Collection;
    //   71: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   74: bipush 44
    //   76: aaload
    //   77: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   80: bipush 32
    //   82: aaload
    //   83: invokestatic 373	com/whatsapp/zq:a	(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;)V
    //   86: iconst_5
    //   87: anewarray 26	java/lang/String
    //   90: astore 9
    //   92: aload 9
    //   94: iconst_0
    //   95: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   98: bipush 10
    //   100: aaload
    //   101: aastore
    //   102: aload 9
    //   104: iconst_1
    //   105: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   108: bipush 8
    //   110: aaload
    //   111: aastore
    //   112: aload 9
    //   114: iconst_2
    //   115: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   118: bipush 11
    //   120: aaload
    //   121: aastore
    //   122: aload 9
    //   124: iconst_3
    //   125: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   128: iconst_4
    //   129: aaload
    //   130: aastore
    //   131: aload 9
    //   133: iconst_4
    //   134: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   137: bipush 14
    //   139: aaload
    //   140: aastore
    //   141: bipush 6
    //   143: anewarray 26	java/lang/String
    //   146: astore 10
    //   148: aload 10
    //   150: iconst_0
    //   151: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   154: bipush 10
    //   156: aaload
    //   157: aastore
    //   158: aload 10
    //   160: iconst_1
    //   161: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   164: bipush 8
    //   166: aaload
    //   167: aastore
    //   168: aload 10
    //   170: iconst_2
    //   171: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   174: bipush 11
    //   176: aaload
    //   177: aastore
    //   178: aload 10
    //   180: iconst_3
    //   181: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   184: iconst_4
    //   185: aaload
    //   186: aastore
    //   187: aload 10
    //   189: iconst_4
    //   190: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   193: bipush 14
    //   195: aaload
    //   196: aastore
    //   197: aload 10
    //   199: iconst_5
    //   200: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   203: bipush 13
    //   205: aaload
    //   206: aastore
    //   207: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   210: iconst_3
    //   211: aaload
    //   212: astore 11
    //   214: iconst_1
    //   215: anewarray 26	java/lang/String
    //   218: astore 12
    //   220: aload 12
    //   222: iconst_0
    //   223: ldc_w 417
    //   226: aastore
    //   227: aconst_null
    //   228: astore 13
    //   230: getstatic 410	com/whatsapp/App:w	Lcom/whatsapp/qp;
    //   233: invokevirtual 419	com/whatsapp/qp:e	()I
    //   236: istore 14
    //   238: getstatic 297	com/whatsapp/App:f	I
    //   241: iconst_2
    //   242: if_icmpne +80 -> 322
    //   245: getstatic 344	com/whatsapp/App:ib	Landroid/content/ContentResolver;
    //   248: getstatic 425	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   251: aload 10
    //   253: aconst_null
    //   254: aconst_null
    //   255: aconst_null
    //   256: invokevirtual 356	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   259: astore 42
    //   261: aload 42
    //   263: astore 27
    //   265: aload 27
    //   267: ifnonnull +108 -> 375
    //   270: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   273: bipush 47
    //   275: aaload
    //   276: invokestatic 227	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   279: aload 27
    //   281: ifnull +10 -> 291
    //   284: aload 27
    //   286: invokeinterface 370 1 0
    //   291: aload 7
    //   293: invokevirtual 428	java/util/HashMap:clear	()V
    //   296: aload 4
    //   298: invokevirtual 429	java/util/ArrayList:clear	()V
    //   301: aload 5
    //   303: invokevirtual 429	java/util/ArrayList:clear	()V
    //   306: aload 6
    //   308: invokevirtual 428	java/util/HashMap:clear	()V
    //   311: aload 8
    //   313: invokevirtual 428	java/util/HashMap:clear	()V
    //   316: iconst_0
    //   317: istore 18
    //   319: iload 18
    //   321: ireturn
    //   322: getstatic 208	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   325: invokestatic 432	com/whatsapp/App:i	(Landroid/content/Context;)Z
    //   328: ifeq +22 -> 350
    //   331: getstatic 344	com/whatsapp/App:ib	Landroid/content/ContentResolver;
    //   334: getstatic 425	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   337: aload 9
    //   339: aconst_null
    //   340: aconst_null
    //   341: aconst_null
    //   342: invokevirtual 356	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   345: astore 27
    //   347: goto -82 -> 265
    //   350: getstatic 344	com/whatsapp/App:ib	Landroid/content/ContentResolver;
    //   353: getstatic 425	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   356: aload 9
    //   358: aload 11
    //   360: aload 12
    //   362: aconst_null
    //   363: invokevirtual 356	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   366: astore 26
    //   368: aload 26
    //   370: astore 27
    //   372: goto -107 -> 265
    //   375: new 176	java/lang/StringBuilder
    //   378: dup
    //   379: invokespecial 177	java/lang/StringBuilder:<init>	()V
    //   382: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   385: bipush 42
    //   387: aaload
    //   388: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   391: aload 27
    //   393: invokeinterface 435 1 0
    //   398: invokevirtual 218	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   401: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   404: invokestatic 196	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   407: aload 27
    //   409: aload 5
    //   411: aload 6
    //   413: aload 4
    //   415: aload 7
    //   417: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   420: bipush 41
    //   422: aaload
    //   423: invokestatic 437	com/whatsapp/tp:a	(Landroid/database/Cursor;Ljava/util/ArrayList;Ljava/util/HashMap;Ljava/util/ArrayList;Ljava/util/HashMap;Ljava/lang/String;)V
    //   426: new 439	com/whatsapp/c9
    //   429: dup
    //   430: aload 5
    //   432: aload_0
    //   433: invokespecial 442	com/whatsapp/c9:<init>	(Ljava/util/ArrayList;Lcom/whatsapp/vp;)V
    //   436: astore 30
    //   438: aload 30
    //   440: invokevirtual 447	java/lang/Thread:start	()V
    //   443: aload 6
    //   445: invokevirtual 377	java/util/HashMap:values	()Ljava/util/Collection;
    //   448: invokeinterface 383 1 0
    //   453: astore 31
    //   455: aload 31
    //   457: invokeinterface 388 1 0
    //   462: ifeq +32 -> 494
    //   465: aload 31
    //   467: invokeinterface 392 1 0
    //   472: checkcast 285	com/whatsapp/zq
    //   475: astore 40
    //   477: aload 8
    //   479: aload 40
    //   481: getfield 449	com/whatsapp/zq:b	Ljava/lang/String;
    //   484: aload 40
    //   486: invokevirtual 332	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   489: pop
    //   490: iload_1
    //   491: ifeq -36 -> 455
    //   494: new 451	com/whatsapp/d9
    //   497: dup
    //   498: aload 6
    //   500: aload 8
    //   502: aload_0
    //   503: aload 5
    //   505: invokespecial 454	com/whatsapp/d9:<init>	(Ljava/util/HashMap;Ljava/util/HashMap;Lcom/whatsapp/vp;Ljava/util/ArrayList;)V
    //   508: astore 32
    //   510: aload 32
    //   512: invokevirtual 447	java/lang/Thread:start	()V
    //   515: aload 30
    //   517: invokevirtual 457	java/lang/Thread:join	()V
    //   520: aload 32
    //   522: invokevirtual 457	java/lang/Thread:join	()V
    //   525: getstatic 167	com/whatsapp/tp:i	Z
    //   528: ifeq +56 -> 584
    //   531: aload 4
    //   533: invokevirtual 460	java/util/ArrayList:size	()I
    //   536: ifle +12 -> 548
    //   539: getstatic 410	com/whatsapp/App:w	Lcom/whatsapp/qp;
    //   542: aload 4
    //   544: aconst_null
    //   545: invokevirtual 463	com/whatsapp/qp:a	(Ljava/util/ArrayList;Landroid/database/sqlite/SQLiteTransactionListener;)V
    //   548: getstatic 410	com/whatsapp/App:w	Lcom/whatsapp/qp;
    //   551: invokevirtual 466	com/whatsapp/qp:a	()Ljava/util/ArrayList;
    //   554: astore 38
    //   556: aload 38
    //   558: aload 7
    //   560: invokevirtual 377	java/util/HashMap:values	()Ljava/util/Collection;
    //   563: invokevirtual 470	java/util/ArrayList:addAll	(Ljava/util/Collection;)Z
    //   566: pop
    //   567: aload 38
    //   569: invokevirtual 460	java/util/ArrayList:size	()I
    //   572: ifle +12 -> 584
    //   575: getstatic 410	com/whatsapp/App:w	Lcom/whatsapp/qp;
    //   578: aload 38
    //   580: aconst_null
    //   581: invokevirtual 473	com/whatsapp/qp:a	(Ljava/util/Collection;Landroid/database/sqlite/SQLiteTransactionListener;)V
    //   584: new 176	java/lang/StringBuilder
    //   587: dup
    //   588: invokespecial 177	java/lang/StringBuilder:<init>	()V
    //   591: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   594: bipush 43
    //   596: aaload
    //   597: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   600: invokestatic 150	java/lang/System:currentTimeMillis	()J
    //   603: lload_2
    //   604: lsub
    //   605: invokevirtual 186	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   608: astore 33
    //   610: getstatic 167	com/whatsapp/tp:i	Z
    //   613: ifeq +74 -> 687
    //   616: ldc_w 475
    //   619: astore 34
    //   621: aload 33
    //   623: aload 34
    //   625: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   628: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   631: invokestatic 196	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   634: getstatic 167	com/whatsapp/tp:i	Z
    //   637: istore 35
    //   639: iload 35
    //   641: ifne +57 -> 698
    //   644: aload 27
    //   646: ifnull +10 -> 656
    //   649: aload 27
    //   651: invokeinterface 370 1 0
    //   656: aload 7
    //   658: invokevirtual 428	java/util/HashMap:clear	()V
    //   661: aload 4
    //   663: invokevirtual 429	java/util/ArrayList:clear	()V
    //   666: aload 5
    //   668: invokevirtual 429	java/util/ArrayList:clear	()V
    //   671: aload 6
    //   673: invokevirtual 428	java/util/HashMap:clear	()V
    //   676: aload 8
    //   678: invokevirtual 428	java/util/HashMap:clear	()V
    //   681: iconst_0
    //   682: istore 18
    //   684: goto -365 -> 319
    //   687: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   690: bipush 37
    //   692: aaload
    //   693: astore 34
    //   695: goto -74 -> 621
    //   698: aload_0
    //   699: ifnull +20 -> 719
    //   702: aload_0
    //   703: aload 4
    //   705: invokevirtual 460	java/util/ArrayList:size	()I
    //   708: aload 7
    //   710: invokevirtual 476	java/util/HashMap:size	()I
    //   713: iadd
    //   714: invokeinterface 479 2 0
    //   719: getstatic 161	com/whatsapp/tp:f	I
    //   722: ifle +11 -> 733
    //   725: getstatic 483	com/whatsapp/App:Ib	Landroid/os/Handler;
    //   728: iconst_1
    //   729: invokevirtual 488	android/os/Handler:sendEmptyMessage	(I)Z
    //   732: pop
    //   733: getstatic 491	com/whatsapp/App:vc	Landroid/os/Handler;
    //   736: iconst_0
    //   737: invokevirtual 488	android/os/Handler:sendEmptyMessage	(I)Z
    //   740: pop
    //   741: aload 27
    //   743: ifnull +10 -> 753
    //   746: aload 27
    //   748: invokeinterface 370 1 0
    //   753: aload 7
    //   755: invokevirtual 428	java/util/HashMap:clear	()V
    //   758: aload 4
    //   760: invokevirtual 429	java/util/ArrayList:clear	()V
    //   763: aload 5
    //   765: invokevirtual 429	java/util/ArrayList:clear	()V
    //   768: aload 6
    //   770: invokevirtual 428	java/util/HashMap:clear	()V
    //   773: aload 8
    //   775: invokevirtual 428	java/util/HashMap:clear	()V
    //   778: getstatic 297	com/whatsapp/App:f	I
    //   781: iconst_1
    //   782: if_icmplt +370 -> 1152
    //   785: iconst_1
    //   786: anewarray 26	java/lang/String
    //   789: astore 19
    //   791: aload 19
    //   793: iconst_0
    //   794: ldc_w 493
    //   797: aastore
    //   798: getstatic 410	com/whatsapp/App:w	Lcom/whatsapp/qp;
    //   801: aload 7
    //   803: aconst_null
    //   804: invokevirtual 415	com/whatsapp/qp:b	(Ljava/util/HashMap;Landroid/database/sqlite/SQLiteTransactionListener;)V
    //   807: getstatic 344	com/whatsapp/App:ib	Landroid/content/ContentResolver;
    //   810: getstatic 425	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   813: aload 9
    //   815: aload 11
    //   817: aload 19
    //   819: aconst_null
    //   820: invokevirtual 356	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   823: astore 22
    //   825: aload 22
    //   827: astore 21
    //   829: aload 21
    //   831: ifnonnull +155 -> 986
    //   834: aload_0
    //   835: ifnull +11 -> 846
    //   838: aload_0
    //   839: iload 14
    //   841: invokeinterface 495 2 0
    //   846: iconst_1
    //   847: istore 18
    //   849: aload 21
    //   851: ifnull +10 -> 861
    //   854: aload 21
    //   856: invokeinterface 370 1 0
    //   861: aload 7
    //   863: invokevirtual 428	java/util/HashMap:clear	()V
    //   866: goto -547 -> 319
    //   869: astore 16
    //   871: aconst_null
    //   872: astore 17
    //   874: new 176	java/lang/StringBuilder
    //   877: dup
    //   878: invokespecial 177	java/lang/StringBuilder:<init>	()V
    //   881: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   884: bipush 45
    //   886: aaload
    //   887: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   890: aload 16
    //   892: invokevirtual 496	java/lang/InterruptedException:toString	()Ljava/lang/String;
    //   895: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   898: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   901: invokestatic 398	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   904: aload 17
    //   906: ifnull +10 -> 916
    //   909: aload 17
    //   911: invokeinterface 370 1 0
    //   916: aload 7
    //   918: invokevirtual 428	java/util/HashMap:clear	()V
    //   921: aload 4
    //   923: invokevirtual 429	java/util/ArrayList:clear	()V
    //   926: aload 5
    //   928: invokevirtual 429	java/util/ArrayList:clear	()V
    //   931: aload 6
    //   933: invokevirtual 428	java/util/HashMap:clear	()V
    //   936: aload 8
    //   938: invokevirtual 428	java/util/HashMap:clear	()V
    //   941: goto -163 -> 778
    //   944: astore 15
    //   946: aload 13
    //   948: ifnull +10 -> 958
    //   951: aload 13
    //   953: invokeinterface 370 1 0
    //   958: aload 7
    //   960: invokevirtual 428	java/util/HashMap:clear	()V
    //   963: aload 4
    //   965: invokevirtual 429	java/util/ArrayList:clear	()V
    //   968: aload 5
    //   970: invokevirtual 429	java/util/ArrayList:clear	()V
    //   973: aload 6
    //   975: invokevirtual 428	java/util/HashMap:clear	()V
    //   978: aload 8
    //   980: invokevirtual 428	java/util/HashMap:clear	()V
    //   983: aload 15
    //   985: athrow
    //   986: new 176	java/lang/StringBuilder
    //   989: dup
    //   990: invokespecial 177	java/lang/StringBuilder:<init>	()V
    //   993: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   996: bipush 46
    //   998: aaload
    //   999: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1002: aload 21
    //   1004: invokeinterface 435 1 0
    //   1009: invokevirtual 218	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1012: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1015: invokestatic 196	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   1018: aload 21
    //   1020: invokeinterface 251 1 0
    //   1025: ifeq +110 -> 1135
    //   1028: aload 21
    //   1030: iconst_2
    //   1031: invokeinterface 255 2 0
    //   1036: invokestatic 261	android/telephony/PhoneNumberUtils:stripSeparators	(Ljava/lang/String;)Ljava/lang/String;
    //   1039: astore 23
    //   1041: aload 23
    //   1043: ifnull +88 -> 1131
    //   1046: aload 23
    //   1048: invokevirtual 265	java/lang/String:length	()I
    //   1051: invokestatic 268	com/whatsapp/tp:a	(I)Z
    //   1054: ifeq +77 -> 1131
    //   1057: new 270	com/whatsapp/uq
    //   1060: dup
    //   1061: aload 21
    //   1063: iconst_0
    //   1064: invokeinterface 274 2 0
    //   1069: aload 23
    //   1071: invokespecial 277	com/whatsapp/uq:<init>	(JLjava/lang/String;)V
    //   1074: astore 24
    //   1076: aload 7
    //   1078: aload 24
    //   1080: invokevirtual 283	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   1083: checkcast 285	com/whatsapp/zq
    //   1086: ifnonnull +45 -> 1131
    //   1089: aload 23
    //   1091: invokestatic 289	android/telephony/PhoneNumberUtils:isGlobalPhoneNumber	(Ljava/lang/String;)Z
    //   1094: ifeq +37 -> 1131
    //   1097: new 285	com/whatsapp/zq
    //   1100: dup
    //   1101: aload 24
    //   1103: aload 21
    //   1105: iconst_1
    //   1106: invokeinterface 255 2 0
    //   1111: aload 21
    //   1113: iconst_3
    //   1114: invokeinterface 293 2 0
    //   1119: aload 21
    //   1121: iconst_4
    //   1122: invokeinterface 255 2 0
    //   1127: invokespecial 296	com/whatsapp/zq:<init>	(Lcom/whatsapp/uq;Ljava/lang/String;ILjava/lang/String;)V
    //   1130: pop
    //   1131: iload_1
    //   1132: ifeq -114 -> 1018
    //   1135: aload 21
    //   1137: ifnull +10 -> 1147
    //   1140: aload 21
    //   1142: invokeinterface 370 1 0
    //   1147: aload 7
    //   1149: invokevirtual 428	java/util/HashMap:clear	()V
    //   1152: getstatic 167	com/whatsapp/tp:i	Z
    //   1155: ifeq +15 -> 1170
    //   1158: aload_0
    //   1159: ifnull +11 -> 1170
    //   1162: aload_0
    //   1163: iload 14
    //   1165: invokeinterface 495 2 0
    //   1170: getstatic 167	com/whatsapp/tp:i	Z
    //   1173: istore 18
    //   1175: goto -856 -> 319
    //   1178: astore 20
    //   1180: aconst_null
    //   1181: astore 21
    //   1183: aload 21
    //   1185: ifnull +10 -> 1195
    //   1188: aload 21
    //   1190: invokeinterface 370 1 0
    //   1195: aload 7
    //   1197: invokevirtual 428	java/util/HashMap:clear	()V
    //   1200: aload 20
    //   1202: athrow
    //   1203: astore 20
    //   1205: goto -22 -> 1183
    //   1208: astore 29
    //   1210: aload 27
    //   1212: astore 13
    //   1214: aload 29
    //   1216: astore 15
    //   1218: goto -272 -> 946
    //   1221: astore 15
    //   1223: aload 17
    //   1225: astore 13
    //   1227: goto -281 -> 946
    //   1230: astore 28
    //   1232: aload 27
    //   1234: astore 17
    //   1236: aload 28
    //   1238: astore 16
    //   1240: goto -366 -> 874
    //
    // Exception table:
    //   from	to	target	type
    //   238	261	869	java/lang/InterruptedException
    //   322	368	869	java/lang/InterruptedException
    //   238	261	944	finally
    //   322	368	944	finally
    //   807	825	1178	finally
    //   838	846	1203	finally
    //   986	1131	1203	finally
    //   270	279	1208	finally
    //   375	639	1208	finally
    //   687	741	1208	finally
    //   874	904	1221	finally
    //   270	279	1230	java/lang/InterruptedException
    //   375	639	1230	java/lang/InterruptedException
    //   687	741	1230	java/lang/InterruptedException
  }

  // ERROR //
  public static boolean a(HashMap<String, java.util.LinkedList<zq>> paramHashMap, ContentResolver paramContentResolver)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: getstatic 234	com/whatsapp/yq:e	I
    //   5: istore_3
    //   6: bipush 6
    //   8: anewarray 26	java/lang/String
    //   11: astore 4
    //   13: aload 4
    //   15: iconst_0
    //   16: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   19: bipush 10
    //   21: aaload
    //   22: aastore
    //   23: aload 4
    //   25: iconst_1
    //   26: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   29: bipush 8
    //   31: aaload
    //   32: aastore
    //   33: aload 4
    //   35: iconst_2
    //   36: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   39: bipush 11
    //   41: aaload
    //   42: aastore
    //   43: aload 4
    //   45: iconst_3
    //   46: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   49: iconst_4
    //   50: aaload
    //   51: aastore
    //   52: aload 4
    //   54: iconst_4
    //   55: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   58: bipush 14
    //   60: aaload
    //   61: aastore
    //   62: aload 4
    //   64: iconst_5
    //   65: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   68: bipush 13
    //   70: aaload
    //   71: aastore
    //   72: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   75: iconst_5
    //   76: aaload
    //   77: invokestatic 227	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   80: iconst_1
    //   81: anewarray 26	java/lang/String
    //   84: astore 5
    //   86: aload 5
    //   88: iconst_0
    //   89: ldc_w 417
    //   92: aastore
    //   93: getstatic 297	com/whatsapp/App:f	I
    //   96: iconst_2
    //   97: if_icmpne +44 -> 141
    //   100: aload_1
    //   101: getstatic 425	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   104: aload 4
    //   106: aconst_null
    //   107: aconst_null
    //   108: aconst_null
    //   109: invokevirtual 356	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   112: astore 28
    //   114: aload 28
    //   116: astore 8
    //   118: aload 8
    //   120: ifnonnull +77 -> 197
    //   123: aload 8
    //   125: ifnull +10 -> 135
    //   128: aload 8
    //   130: invokeinterface 370 1 0
    //   135: iconst_0
    //   136: istore 9
    //   138: iload 9
    //   140: ireturn
    //   141: getstatic 208	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   144: invokestatic 432	com/whatsapp/App:i	(Landroid/content/Context;)Z
    //   147: ifeq +23 -> 170
    //   150: getstatic 344	com/whatsapp/App:ib	Landroid/content/ContentResolver;
    //   153: getstatic 425	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   156: getstatic 171	com/whatsapp/tp:k	[Ljava/lang/String;
    //   159: aconst_null
    //   160: aconst_null
    //   161: aconst_null
    //   162: invokevirtual 356	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   165: astore 8
    //   167: goto -49 -> 118
    //   170: aload_1
    //   171: getstatic 425	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   174: getstatic 171	com/whatsapp/tp:k	[Ljava/lang/String;
    //   177: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   180: iconst_3
    //   181: aaload
    //   182: aload 5
    //   184: aconst_null
    //   185: invokevirtual 356	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   188: astore 7
    //   190: aload 7
    //   192: astore 8
    //   194: goto -76 -> 118
    //   197: new 176	java/lang/StringBuilder
    //   200: dup
    //   201: invokespecial 177	java/lang/StringBuilder:<init>	()V
    //   204: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   207: bipush 6
    //   209: aaload
    //   210: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   213: aload 8
    //   215: invokeinterface 435 1 0
    //   220: invokevirtual 218	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   223: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   226: invokestatic 196	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   229: aload 8
    //   231: invokeinterface 251 1 0
    //   236: ifeq +203 -> 439
    //   239: aload 8
    //   241: iconst_2
    //   242: invokeinterface 255 2 0
    //   247: invokestatic 261	android/telephony/PhoneNumberUtils:stripSeparators	(Ljava/lang/String;)Ljava/lang/String;
    //   250: astore 21
    //   252: aload 21
    //   254: ifnull +542 -> 796
    //   257: aload 21
    //   259: invokevirtual 265	java/lang/String:length	()I
    //   262: invokestatic 268	com/whatsapp/tp:a	(I)Z
    //   265: ifeq +531 -> 796
    //   268: new 285	com/whatsapp/zq
    //   271: dup
    //   272: aload 21
    //   274: aload 8
    //   276: iconst_0
    //   277: invokeinterface 274 2 0
    //   282: aload 8
    //   284: iconst_1
    //   285: invokeinterface 255 2 0
    //   290: aload 8
    //   292: iconst_3
    //   293: invokeinterface 293 2 0
    //   298: aload 8
    //   300: iconst_4
    //   301: invokeinterface 255 2 0
    //   306: invokespecial 367	com/whatsapp/zq:<init>	(Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;)V
    //   309: astore 22
    //   311: getstatic 297	com/whatsapp/App:f	I
    //   314: iconst_2
    //   315: if_icmpne +19 -> 334
    //   318: aload 8
    //   320: iconst_5
    //   321: invokeinterface 293 2 0
    //   326: iconst_1
    //   327: if_icmpeq +7 -> 334
    //   330: iload_3
    //   331: ifeq -102 -> 229
    //   334: aload_0
    //   335: aload 22
    //   337: getfield 328	com/whatsapp/zq:g	Lcom/whatsapp/uq;
    //   340: getfield 498	com/whatsapp/uq:b	Ljava/lang/String;
    //   343: invokevirtual 283	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   346: checkcast 500	java/util/LinkedList
    //   349: astore 23
    //   351: aload 23
    //   353: ifnull +51 -> 404
    //   356: aload 23
    //   358: iconst_0
    //   359: invokevirtual 503	java/util/LinkedList:get	(I)Ljava/lang/Object;
    //   362: checkcast 285	com/whatsapp/zq
    //   365: getfield 328	com/whatsapp/zq:g	Lcom/whatsapp/uq;
    //   368: aload 22
    //   370: getfield 328	com/whatsapp/zq:g	Lcom/whatsapp/uq;
    //   373: invokevirtual 504	com/whatsapp/uq:equals	(Ljava/lang/Object;)Z
    //   376: ifne +420 -> 796
    //   379: aload_0
    //   380: aload 22
    //   382: getfield 328	com/whatsapp/zq:g	Lcom/whatsapp/uq;
    //   385: getfield 498	com/whatsapp/uq:b	Ljava/lang/String;
    //   388: invokevirtual 283	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   391: checkcast 500	java/util/LinkedList
    //   394: aload 22
    //   396: invokevirtual 505	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   399: pop
    //   400: iload_3
    //   401: ifeq +395 -> 796
    //   404: new 500	java/util/LinkedList
    //   407: dup
    //   408: invokespecial 506	java/util/LinkedList:<init>	()V
    //   411: astore 24
    //   413: aload 24
    //   415: aload 22
    //   417: invokevirtual 505	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   420: pop
    //   421: aload_0
    //   422: aload 22
    //   424: getfield 328	com/whatsapp/zq:g	Lcom/whatsapp/uq;
    //   427: getfield 498	com/whatsapp/uq:b	Ljava/lang/String;
    //   430: aload 24
    //   432: invokevirtual 332	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   435: pop
    //   436: goto +360 -> 796
    //   439: getstatic 337	android/os/Build:MANUFACTURER	Ljava/lang/String;
    //   442: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   445: iconst_0
    //   446: aaload
    //   447: invokevirtual 340	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   450: ifeq +244 -> 694
    //   453: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   456: bipush 7
    //   458: aaload
    //   459: invokestatic 196	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   462: getstatic 208	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   465: invokevirtual 510	com/whatsapp/App:getContentResolver	()Landroid/content/ContentResolver;
    //   468: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   471: bipush 12
    //   473: aaload
    //   474: invokestatic 350	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   477: aconst_null
    //   478: aconst_null
    //   479: aconst_null
    //   480: aconst_null
    //   481: invokevirtual 356	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   484: astore 13
    //   486: aload 13
    //   488: astore_2
    //   489: aload_2
    //   490: invokeinterface 251 1 0
    //   495: ifeq +189 -> 684
    //   498: aload_2
    //   499: aload_2
    //   500: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   503: iconst_1
    //   504: aaload
    //   505: invokeinterface 360 2 0
    //   510: invokeinterface 255 2 0
    //   515: invokestatic 261	android/telephony/PhoneNumberUtils:stripSeparators	(Ljava/lang/String;)Ljava/lang/String;
    //   518: astore 14
    //   520: aload 14
    //   522: ifnull +158 -> 680
    //   525: aload 14
    //   527: invokevirtual 265	java/lang/String:length	()I
    //   530: invokestatic 268	com/whatsapp/tp:a	(I)Z
    //   533: ifeq +147 -> 680
    //   536: new 285	com/whatsapp/zq
    //   539: dup
    //   540: aload 14
    //   542: ldc2_w 361
    //   545: aload_2
    //   546: aload_2
    //   547: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   550: bipush 9
    //   552: aaload
    //   553: invokeinterface 360 2 0
    //   558: invokeinterface 255 2 0
    //   563: iconst_0
    //   564: getstatic 208	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   567: ldc_w 363
    //   570: invokevirtual 364	com/whatsapp/App:getString	(I)Ljava/lang/String;
    //   573: invokespecial 367	com/whatsapp/zq:<init>	(Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;)V
    //   576: astore 15
    //   578: aload_0
    //   579: aload 15
    //   581: getfield 328	com/whatsapp/zq:g	Lcom/whatsapp/uq;
    //   584: getfield 498	com/whatsapp/uq:b	Ljava/lang/String;
    //   587: invokevirtual 283	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   590: checkcast 500	java/util/LinkedList
    //   593: astore 16
    //   595: aload 16
    //   597: ifnull +51 -> 648
    //   600: aload 16
    //   602: iconst_0
    //   603: invokevirtual 503	java/util/LinkedList:get	(I)Ljava/lang/Object;
    //   606: checkcast 285	com/whatsapp/zq
    //   609: getfield 328	com/whatsapp/zq:g	Lcom/whatsapp/uq;
    //   612: aload 15
    //   614: getfield 328	com/whatsapp/zq:g	Lcom/whatsapp/uq;
    //   617: invokevirtual 504	com/whatsapp/uq:equals	(Ljava/lang/Object;)Z
    //   620: ifne +60 -> 680
    //   623: aload_0
    //   624: aload 15
    //   626: getfield 328	com/whatsapp/zq:g	Lcom/whatsapp/uq;
    //   629: getfield 498	com/whatsapp/uq:b	Ljava/lang/String;
    //   632: invokevirtual 283	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   635: checkcast 500	java/util/LinkedList
    //   638: aload 15
    //   640: invokevirtual 505	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   643: pop
    //   644: iload_3
    //   645: ifeq +35 -> 680
    //   648: new 500	java/util/LinkedList
    //   651: dup
    //   652: invokespecial 506	java/util/LinkedList:<init>	()V
    //   655: astore 17
    //   657: aload 17
    //   659: aload 15
    //   661: invokevirtual 505	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   664: pop
    //   665: aload_0
    //   666: aload 15
    //   668: getfield 328	com/whatsapp/zq:g	Lcom/whatsapp/uq;
    //   671: getfield 498	com/whatsapp/uq:b	Ljava/lang/String;
    //   674: aload 17
    //   676: invokevirtual 332	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   679: pop
    //   680: iload_3
    //   681: ifeq -192 -> 489
    //   684: aload_2
    //   685: ifnull +9 -> 694
    //   688: aload_2
    //   689: invokeinterface 370 1 0
    //   694: aload 8
    //   696: ifnull +10 -> 706
    //   699: aload 8
    //   701: invokeinterface 370 1 0
    //   706: iconst_1
    //   707: istore 9
    //   709: goto -571 -> 138
    //   712: astore 11
    //   714: aconst_null
    //   715: astore 12
    //   717: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   720: iconst_2
    //   721: aaload
    //   722: aload 11
    //   724: invokestatic 513	com/whatsapp/g5:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   727: aload 12
    //   729: ifnull -35 -> 694
    //   732: aload 12
    //   734: invokeinterface 370 1 0
    //   739: goto -45 -> 694
    //   742: astore 6
    //   744: aload 8
    //   746: astore_2
    //   747: aload_2
    //   748: ifnull +9 -> 757
    //   751: aload_2
    //   752: invokeinterface 370 1 0
    //   757: aload 6
    //   759: athrow
    //   760: astore 10
    //   762: aload_2
    //   763: ifnull +9 -> 772
    //   766: aload_2
    //   767: invokeinterface 370 1 0
    //   772: aload 10
    //   774: athrow
    //   775: astore 6
    //   777: goto -30 -> 747
    //   780: astore 10
    //   782: aload 12
    //   784: astore_2
    //   785: goto -23 -> 762
    //   788: astore 11
    //   790: aload_2
    //   791: astore 12
    //   793: goto -76 -> 717
    //   796: iload_3
    //   797: ifeq -568 -> 229
    //   800: goto -361 -> 439
    //
    // Exception table:
    //   from	to	target	type
    //   462	486	712	java/lang/Exception
    //   197	462	742	finally
    //   688	694	742	finally
    //   732	739	742	finally
    //   766	775	742	finally
    //   462	486	760	finally
    //   489	680	760	finally
    //   93	114	775	finally
    //   141	190	775	finally
    //   717	727	780	finally
    //   489	680	788	java/lang/Exception
  }

  public static wp b(int paramInt)
  {
    Object localObject1 = null;
    int m = yq.e;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = "0";
    HashMap localHashMap = new HashMap();
    int n;
    if (paramInt < 0)
      n = 1;
    while (true)
    {
      App.w.b(localHashMap, null);
      try
      {
        localCursor = App.ib.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, k, z[3], arrayOfString, null);
        if (localCursor == null)
        {
          if (localCursor != null)
            localCursor.close();
          localHashMap.clear();
          localwp = null;
          return localwp;
          n = 0;
          continue;
        }
      }
      finally
      {
        try
        {
          wp localwp;
          int i1 = localCursor.getCount();
          g5.b(z[48] + localCursor.getCount());
          if (n != 0);
          for (int i2 = i1; ; i2 = paramInt)
          {
            ArrayList localArrayList = new ArrayList(i2);
            do
            {
              if ((!localCursor.moveToNext()) || ((n == 0) && (localArrayList.size() >= paramInt)))
                break;
              String str = PhoneNumberUtils.stripSeparators(localCursor.getString(2));
              if ((str != null) && (a(str.length())))
              {
                uq localuq = new uq(localCursor.getLong(0), str);
                zq localzq1 = (zq)localHashMap.get(localuq);
                if (localzq1 == null)
                {
                  if (PhoneNumberUtils.isGlobalPhoneNumber(str))
                  {
                    zq localzq2 = new zq(localuq, localCursor.getString(1), localCursor.getInt(3), localCursor.getString(4));
                    localzq2.b = str;
                    localArrayList.add(localzq2);
                    if (m == 0);
                  }
                }
                else
                  localArrayList.add(localzq1);
              }
            }
            while (m == 0);
            if (localCursor != null)
              localCursor.close();
            localHashMap.clear();
            localwp = new wp(i1, localArrayList);
            break;
          }
          localObject2 = finally;
          if (localObject1 != null)
            localObject1.close();
          localHashMap.clear();
          throw localObject2;
        }
        finally
        {
          Cursor localCursor;
          localObject1 = localCursor;
        }
      }
    }
  }

  public static boolean b()
  {
    int m = 1;
    int i1 = yq.e;
    Account[] arrayOfAccount = AccountManager.get(App.Mb.getApplicationContext()).getAccounts();
    int i2 = arrayOfAccount.length;
    int i3 = 0;
    if (i3 < i2)
    {
      Account localAccount = arrayOfAccount[i3];
      if ((!localAccount.type.equals(z[40])) && (ContentResolver.isSyncActive(localAccount, z[38])))
        if ((App.f < m) || (i1 != 0))
          g5.b(z[39] + localAccount.type);
    }
    while (true)
    {
      return m;
      i3++;
      if (i1 == 0)
        break;
      int n = 0;
    }
  }

  // ERROR //
  private static boolean b(vp paramvp)
  {
    // Byte code:
    //   0: iconst_1
    //   1: putstatic 169	com/whatsapp/tp:j	Z
    //   4: invokestatic 150	java/lang/System:currentTimeMillis	()J
    //   7: lstore_1
    //   8: new 299	java/util/ArrayList
    //   11: dup
    //   12: invokespecial 405	java/util/ArrayList:<init>	()V
    //   15: astore_3
    //   16: new 299	java/util/ArrayList
    //   19: dup
    //   20: invokespecial 405	java/util/ArrayList:<init>	()V
    //   23: astore 4
    //   25: new 279	java/util/HashMap
    //   28: dup
    //   29: invokespecial 406	java/util/HashMap:<init>	()V
    //   32: astore 5
    //   34: new 279	java/util/HashMap
    //   37: dup
    //   38: invokespecial 406	java/util/HashMap:<init>	()V
    //   41: astore 6
    //   43: getstatic 410	com/whatsapp/App:w	Lcom/whatsapp/qp;
    //   46: aload 6
    //   48: aconst_null
    //   49: invokevirtual 415	com/whatsapp/qp:b	(Ljava/util/HashMap;Landroid/database/sqlite/SQLiteTransactionListener;)V
    //   52: aload 6
    //   54: invokevirtual 377	java/util/HashMap:values	()Ljava/util/Collection;
    //   57: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   60: bipush 29
    //   62: aaload
    //   63: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   66: bipush 32
    //   68: aaload
    //   69: invokestatic 373	com/whatsapp/zq:a	(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;)V
    //   72: iconst_5
    //   73: anewarray 26	java/lang/String
    //   76: astore 7
    //   78: aload 7
    //   80: iconst_0
    //   81: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   84: bipush 10
    //   86: aaload
    //   87: aastore
    //   88: aload 7
    //   90: iconst_1
    //   91: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   94: bipush 8
    //   96: aaload
    //   97: aastore
    //   98: aload 7
    //   100: iconst_2
    //   101: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   104: bipush 11
    //   106: aaload
    //   107: aastore
    //   108: aload 7
    //   110: iconst_3
    //   111: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   114: iconst_4
    //   115: aaload
    //   116: aastore
    //   117: aload 7
    //   119: iconst_4
    //   120: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   123: bipush 14
    //   125: aaload
    //   126: aastore
    //   127: bipush 6
    //   129: anewarray 26	java/lang/String
    //   132: astore 8
    //   134: aload 8
    //   136: iconst_0
    //   137: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   140: bipush 10
    //   142: aaload
    //   143: aastore
    //   144: aload 8
    //   146: iconst_1
    //   147: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   150: bipush 8
    //   152: aaload
    //   153: aastore
    //   154: aload 8
    //   156: iconst_2
    //   157: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   160: bipush 11
    //   162: aaload
    //   163: aastore
    //   164: aload 8
    //   166: iconst_3
    //   167: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   170: iconst_4
    //   171: aaload
    //   172: aastore
    //   173: aload 8
    //   175: iconst_4
    //   176: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   179: bipush 14
    //   181: aaload
    //   182: aastore
    //   183: aload 8
    //   185: iconst_5
    //   186: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   189: bipush 13
    //   191: aaload
    //   192: aastore
    //   193: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   196: iconst_3
    //   197: aaload
    //   198: astore 9
    //   200: iconst_1
    //   201: anewarray 26	java/lang/String
    //   204: astore 10
    //   206: aload 10
    //   208: iconst_0
    //   209: ldc_w 417
    //   212: aastore
    //   213: getstatic 410	com/whatsapp/App:w	Lcom/whatsapp/qp;
    //   216: invokevirtual 419	com/whatsapp/qp:e	()I
    //   219: istore 11
    //   221: aconst_null
    //   222: astore 12
    //   224: getstatic 297	com/whatsapp/App:f	I
    //   227: iconst_2
    //   228: if_icmpne +69 -> 297
    //   231: getstatic 344	com/whatsapp/App:ib	Landroid/content/ContentResolver;
    //   234: getstatic 425	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   237: aload 8
    //   239: aconst_null
    //   240: aconst_null
    //   241: aconst_null
    //   242: invokevirtual 356	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   245: astore 29
    //   247: aload 29
    //   249: astore 19
    //   251: aload 19
    //   253: ifnonnull +97 -> 350
    //   256: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   259: bipush 36
    //   261: aaload
    //   262: invokestatic 227	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   265: aload 19
    //   267: ifnull +10 -> 277
    //   270: aload 19
    //   272: invokeinterface 370 1 0
    //   277: aload 6
    //   279: invokevirtual 428	java/util/HashMap:clear	()V
    //   282: aload_3
    //   283: invokevirtual 429	java/util/ArrayList:clear	()V
    //   286: aload 4
    //   288: invokevirtual 429	java/util/ArrayList:clear	()V
    //   291: iconst_0
    //   292: istore 17
    //   294: iload 17
    //   296: ireturn
    //   297: getstatic 208	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   300: invokestatic 432	com/whatsapp/App:i	(Landroid/content/Context;)Z
    //   303: ifeq +22 -> 325
    //   306: getstatic 344	com/whatsapp/App:ib	Landroid/content/ContentResolver;
    //   309: getstatic 425	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   312: aload 7
    //   314: aconst_null
    //   315: aconst_null
    //   316: aconst_null
    //   317: invokevirtual 356	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   320: astore 19
    //   322: goto -71 -> 251
    //   325: getstatic 344	com/whatsapp/App:ib	Landroid/content/ContentResolver;
    //   328: getstatic 425	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   331: aload 7
    //   333: aload 9
    //   335: aload 10
    //   337: aconst_null
    //   338: invokevirtual 356	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   341: astore 18
    //   343: aload 18
    //   345: astore 19
    //   347: goto -96 -> 251
    //   350: new 176	java/lang/StringBuilder
    //   353: dup
    //   354: invokespecial 177	java/lang/StringBuilder:<init>	()V
    //   357: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   360: bipush 31
    //   362: aaload
    //   363: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   366: aload 19
    //   368: invokeinterface 435 1 0
    //   373: invokevirtual 218	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   376: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   379: invokestatic 196	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   382: aload 19
    //   384: aload 4
    //   386: aload 5
    //   388: aload_3
    //   389: aload 6
    //   391: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   394: bipush 35
    //   396: aaload
    //   397: invokestatic 437	com/whatsapp/tp:a	(Landroid/database/Cursor;Ljava/util/ArrayList;Ljava/util/HashMap;Ljava/util/ArrayList;Ljava/util/HashMap;Ljava/lang/String;)V
    //   400: getstatic 545	com/whatsapp/App:bb	Lcom/whatsapp/App$Me;
    //   403: aload 4
    //   405: aload_0
    //   406: invokestatic 550	com/whatsapp/yp:a	(Lcom/whatsapp/App$Me;Ljava/util/ArrayList;Lcom/whatsapp/vp;)V
    //   409: aload_3
    //   410: invokevirtual 460	java/util/ArrayList:size	()I
    //   413: ifle +11 -> 424
    //   416: getstatic 410	com/whatsapp/App:w	Lcom/whatsapp/qp;
    //   419: aload_3
    //   420: aconst_null
    //   421: invokevirtual 463	com/whatsapp/qp:a	(Ljava/util/ArrayList;Landroid/database/sqlite/SQLiteTransactionListener;)V
    //   424: aload 6
    //   426: invokevirtual 476	java/util/HashMap:size	()I
    //   429: ifle +15 -> 444
    //   432: getstatic 410	com/whatsapp/App:w	Lcom/whatsapp/qp;
    //   435: aload 6
    //   437: invokevirtual 377	java/util/HashMap:values	()Ljava/util/Collection;
    //   440: aconst_null
    //   441: invokevirtual 473	com/whatsapp/qp:a	(Ljava/util/Collection;Landroid/database/sqlite/SQLiteTransactionListener;)V
    //   444: new 176	java/lang/StringBuilder
    //   447: dup
    //   448: invokespecial 177	java/lang/StringBuilder:<init>	()V
    //   451: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   454: bipush 34
    //   456: aaload
    //   457: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   460: invokestatic 150	java/lang/System:currentTimeMillis	()J
    //   463: lload_1
    //   464: lsub
    //   465: invokevirtual 186	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   468: astore 24
    //   470: getstatic 169	com/whatsapp/tp:j	Z
    //   473: ifeq +141 -> 614
    //   476: ldc_w 475
    //   479: astore 25
    //   481: aload 24
    //   483: aload 25
    //   485: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   488: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   491: invokestatic 196	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   494: getstatic 169	com/whatsapp/tp:j	Z
    //   497: istore 26
    //   499: iload 26
    //   501: ifne +124 -> 625
    //   504: aload 19
    //   506: ifnull +10 -> 516
    //   509: aload 19
    //   511: invokeinterface 370 1 0
    //   516: aload 6
    //   518: invokevirtual 428	java/util/HashMap:clear	()V
    //   521: aload_3
    //   522: invokevirtual 429	java/util/ArrayList:clear	()V
    //   525: aload 4
    //   527: invokevirtual 429	java/util/ArrayList:clear	()V
    //   530: iconst_0
    //   531: istore 17
    //   533: goto -239 -> 294
    //   536: astore 23
    //   538: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   541: bipush 30
    //   543: aaload
    //   544: aload 23
    //   546: invokestatic 513	com/whatsapp/g5:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   549: aload_0
    //   550: ifnull +9 -> 559
    //   553: aload_0
    //   554: invokeinterface 551 1 0
    //   559: iconst_0
    //   560: putstatic 169	com/whatsapp/tp:j	Z
    //   563: goto -119 -> 444
    //   566: astore 22
    //   568: aload 19
    //   570: astore 14
    //   572: aload 22
    //   574: astore 13
    //   576: aload 13
    //   578: athrow
    //   579: astore 15
    //   581: aload 14
    //   583: astore 12
    //   585: aload 12
    //   587: ifnull +10 -> 597
    //   590: aload 12
    //   592: invokeinterface 370 1 0
    //   597: aload 6
    //   599: invokevirtual 428	java/util/HashMap:clear	()V
    //   602: aload_3
    //   603: invokevirtual 429	java/util/ArrayList:clear	()V
    //   606: aload 4
    //   608: invokevirtual 429	java/util/ArrayList:clear	()V
    //   611: aload 15
    //   613: athrow
    //   614: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   617: bipush 37
    //   619: aaload
    //   620: astore 25
    //   622: goto -141 -> 481
    //   625: aload_0
    //   626: aload_3
    //   627: invokevirtual 460	java/util/ArrayList:size	()I
    //   630: aload 6
    //   632: invokevirtual 476	java/util/HashMap:size	()I
    //   635: iadd
    //   636: invokeinterface 479 2 0
    //   641: getstatic 161	com/whatsapp/tp:f	I
    //   644: ifle +11 -> 655
    //   647: getstatic 483	com/whatsapp/App:Ib	Landroid/os/Handler;
    //   650: iconst_1
    //   651: invokevirtual 488	android/os/Handler:sendEmptyMessage	(I)Z
    //   654: pop
    //   655: getstatic 491	com/whatsapp/App:vc	Landroid/os/Handler;
    //   658: iconst_0
    //   659: invokevirtual 488	android/os/Handler:sendEmptyMessage	(I)Z
    //   662: pop
    //   663: aload 19
    //   665: ifnull +10 -> 675
    //   668: aload 19
    //   670: invokeinterface 370 1 0
    //   675: aload 6
    //   677: invokevirtual 428	java/util/HashMap:clear	()V
    //   680: aload_3
    //   681: invokevirtual 429	java/util/ArrayList:clear	()V
    //   684: aload 4
    //   686: invokevirtual 429	java/util/ArrayList:clear	()V
    //   689: getstatic 169	com/whatsapp/tp:j	Z
    //   692: ifeq +15 -> 707
    //   695: aload_0
    //   696: ifnull +11 -> 707
    //   699: aload_0
    //   700: iload 11
    //   702: invokeinterface 495 2 0
    //   707: getstatic 169	com/whatsapp/tp:j	Z
    //   710: istore 17
    //   712: goto -418 -> 294
    //   715: astore 16
    //   717: new 176	java/lang/StringBuilder
    //   720: dup
    //   721: invokespecial 177	java/lang/StringBuilder:<init>	()V
    //   724: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   727: bipush 33
    //   729: aaload
    //   730: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   733: aload 16
    //   735: invokevirtual 396	java/lang/Exception:toString	()Ljava/lang/String;
    //   738: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   741: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   744: invokestatic 398	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   747: aload_0
    //   748: ifnull +9 -> 757
    //   751: aload_0
    //   752: invokeinterface 551 1 0
    //   757: iconst_0
    //   758: putstatic 169	com/whatsapp/tp:j	Z
    //   761: aload 12
    //   763: ifnull +10 -> 773
    //   766: aload 12
    //   768: invokeinterface 370 1 0
    //   773: aload 6
    //   775: invokevirtual 428	java/util/HashMap:clear	()V
    //   778: aload_3
    //   779: invokevirtual 429	java/util/ArrayList:clear	()V
    //   782: aload 4
    //   784: invokevirtual 429	java/util/ArrayList:clear	()V
    //   787: goto -98 -> 689
    //   790: astore 15
    //   792: goto -207 -> 585
    //   795: astore 21
    //   797: aload 19
    //   799: astore 12
    //   801: aload 21
    //   803: astore 15
    //   805: goto -220 -> 585
    //   808: astore 20
    //   810: aload 19
    //   812: astore 12
    //   814: aload 20
    //   816: astore 16
    //   818: goto -101 -> 717
    //   821: astore 13
    //   823: aconst_null
    //   824: astore 14
    //   826: goto -250 -> 576
    //
    // Exception table:
    //   from	to	target	type
    //   400	444	536	java/lang/Exception
    //   256	265	566	android/database/sqlite/SQLiteDatabaseCorruptException
    //   350	400	566	android/database/sqlite/SQLiteDatabaseCorruptException
    //   400	444	566	android/database/sqlite/SQLiteDatabaseCorruptException
    //   444	499	566	android/database/sqlite/SQLiteDatabaseCorruptException
    //   538	563	566	android/database/sqlite/SQLiteDatabaseCorruptException
    //   614	663	566	android/database/sqlite/SQLiteDatabaseCorruptException
    //   576	579	579	finally
    //   224	247	715	java/lang/Exception
    //   297	343	715	java/lang/Exception
    //   224	247	790	finally
    //   297	343	790	finally
    //   717	761	790	finally
    //   256	265	795	finally
    //   350	400	795	finally
    //   400	444	795	finally
    //   444	499	795	finally
    //   538	563	795	finally
    //   614	663	795	finally
    //   256	265	808	java/lang/Exception
    //   350	400	808	java/lang/Exception
    //   444	499	808	java/lang/Exception
    //   538	563	808	java/lang/Exception
    //   614	663	808	java/lang/Exception
    //   224	247	821	android/database/sqlite/SQLiteDatabaseCorruptException
    //   297	343	821	android/database/sqlite/SQLiteDatabaseCorruptException
  }

  static boolean b(boolean paramBoolean)
  {
    i = paramBoolean;
    return paramBoolean;
  }

  // ERROR //
  public static java.lang.Integer c(int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: iconst_1
    //   3: anewarray 26	java/lang/String
    //   6: astore_2
    //   7: aload_2
    //   8: iconst_0
    //   9: ldc_w 493
    //   12: aastore
    //   13: iload_0
    //   14: iconst_1
    //   15: if_icmpne +51 -> 66
    //   18: getstatic 344	com/whatsapp/App:ib	Landroid/content/ContentResolver;
    //   21: getstatic 425	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   24: getstatic 171	com/whatsapp/tp:k	[Ljava/lang/String;
    //   27: getstatic 138	com/whatsapp/tp:z	[Ljava/lang/String;
    //   30: iconst_3
    //   31: aaload
    //   32: aload_2
    //   33: aconst_null
    //   34: invokevirtual 356	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   37: astore 8
    //   39: aload 8
    //   41: astore 5
    //   43: aload 5
    //   45: ifnonnull +45 -> 90
    //   48: aload 5
    //   50: ifnull +10 -> 60
    //   53: aload 5
    //   55: invokeinterface 370 1 0
    //   60: aconst_null
    //   61: astore 7
    //   63: aload 7
    //   65: areturn
    //   66: getstatic 344	com/whatsapp/App:ib	Landroid/content/ContentResolver;
    //   69: getstatic 425	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   72: getstatic 171	com/whatsapp/tp:k	[Ljava/lang/String;
    //   75: aconst_null
    //   76: aconst_null
    //   77: aconst_null
    //   78: invokevirtual 356	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   81: astore 4
    //   83: aload 4
    //   85: astore 5
    //   87: goto -44 -> 43
    //   90: aload 5
    //   92: invokeinterface 435 1 0
    //   97: istore 6
    //   99: aload 5
    //   101: ifnull +10 -> 111
    //   104: aload 5
    //   106: invokeinterface 370 1 0
    //   111: iload 6
    //   113: invokestatic 323	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   116: astore 7
    //   118: goto -55 -> 63
    //   121: astore_3
    //   122: aload_1
    //   123: ifnull +9 -> 132
    //   126: aload_1
    //   127: invokeinterface 370 1 0
    //   132: aload_3
    //   133: athrow
    //   134: astore_3
    //   135: aload 5
    //   137: astore_1
    //   138: goto -16 -> 122
    //
    // Exception table:
    //   from	to	target	type
    //   18	39	121	finally
    //   66	83	121	finally
    //   90	99	134	finally
  }

  public static void c()
  {
    e9 locale9 = new e9();
    locale9.setPriority(1);
    locale9.start();
  }

  static int d(int paramInt)
  {
    h = paramInt;
    return paramInt;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.tp
 * JD-Core Version:    0.6.1
 */