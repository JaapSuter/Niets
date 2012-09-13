package com.whatsapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class l extends SQLiteOpenHelper
{
  private static final String[] z;
  private SQLiteDatabase a = null;
  public rq b;
  private int c = 0;
  private int d = 0;

  static
  {
    String[] arrayOfString = new String[26];
    char[] arrayOfChar1 = "^\fAz".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\023\013I)f\021\nKug\016\037\\;v\033XX?`\r\021A42".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\023\013I)f\021\nKuq\f\035O.w^".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label1161;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = ":*a\n2*9l\026W^1hzW&1}\016A^\025K)a\037\037K)".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label1253;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "76}\037@*Xg\024F1XC?a\r\031I?aV'G>>^\023K#M\f\035C5f\033'D3vRXE?k!\036\\5!\025Kv2\025\035W\005{\032T\016)f\037\f[)>^\026K?v\r'^/a\026T\016>s\n\031\002zf\027\025K)f\037\025^v2\023\035J3s!\r\\6>^\025K>{\037'C3\033'Z#b\033T\0167w\032\021O\005e\037'Z#b\033T\0167w\032\021O\005a\027\002Kv2\023\035J3s!\026O7wRXC?v\027\031q2s\r\020\002z~\037\fG.g\032\035\002z~\021\026I3f\013\034Kv2\n\020[7p!\021C;u\033T\016(w\035\035G,w\032'Z3\033\013Z;\016T\016)w\020\034q.{\023\035].s\023\b\002z`\033\033K3b\n']?`\b\035\\\005f\027\025K)f\037\025^v2\f\035M?{\016\fq>w\b\021M?M\n\021C?a\n\031C*;^.o\026G;+\016r#RX\tw#YT\016j>^_\003k5RX\003k>^H\002z\\+4bv2NT\016\024G24\002z\\+4bv2SI\002z?OT\016\024G24\002z\\+4bv2NT\016j>^6{\026^RX\003k>^U\037v2SI\002z?OQ".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label1345;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = ":*a\n2*9l\026W^1hzW&1}\016A^\033F;f!\024G)f".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label1437;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "=*k\033F;X{\024[/-kz[0<k\0022\023\035])s\031\035]\005y\033\001q3|\032\035Vz}\020XC?a\r\031I?a^PE?k!\nK7}\n\035q0{\032T\0161w\007'H(}\023'C?>^\023K#M\027\034\007".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label1529;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "=*k\033F;Xz\033P2=\0169z\037\fq6{\r\f\016rM\027\034\016\023\\*=i\037@^(|\023_?*wzY;!\016\033G*7g\024Q,=c\037\\*T\0161w\007'\\?\021\fK\005x\027\034\016\016W&,\016\017\\7){\037>^\025K)a\037\037K\005f\037\032B?M\027\034\016\023\\*=i\037@W".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1621;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "=*k\033F;Xz\033P2=\0167w\r\013O=w\rX\006\005{\032Xg\024F;?k\b2.*g\027S,!\016\021W'Xo\017F11`\031@;5k\024FRXE?k!\nK7}\n\035q0{\032Xz\037J*X`\025F^6{\026^RXE?k!\036\\5!\025Kz[0,k\035W,T\0161w\007'G>2*=v\016207zz\\+4bv2\r\fO.g\rXg\024F;?k\b>^\026K?v\r'^/a\026Xg\024F;?k\b>^\034O.s^,k\002FRXZ3\033\013Z;\016Xg\024F;?k\b>^\025K>{\037'[(~^,k\002FRXC?v\027\031q7{\023\035q.k\016\035\016\016W&,\002z\033\034G;M\t\031q.k\016\035\016\016W&,\002z\033\034G;M\r\021T?276z\037U;*\002z\033\034G;M\020\031C?2*=v\016>^\025K>{\037'F;a\026Xz\037J*T\0166s\n\021Z/v\033X|\037S2T\0166}\020\037G.g\032\035\016\bW?4\002zf\026\rC8M\027\025O=w^,k\002FRX\\?\021\fK\005`\033\013A/`\035\035\016\016W&,\002z`\033\033K3d\033\034q.{\023\035].s\023\b\016\023\\*=i\037@RX]?|\032'Z3\033\013Z;\016Xg\024F;?k\b>^\nK9w\027\bZ\005a\033\nX?`!\fG7w\r\fO7b^1`\016W9=|v2\f\035M?{\016\fq>w\b\021M?M\n\021C?a\n\031C*276z\037U;*\002z`\037\017q>s\n\031\016\030^1:\007".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1713;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "\023\013I)f\021\nKuu\033\fY({\n\031L6w\032\032\0015|\021\bK4".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1805;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "\023\013I)f\021\nKuu\033\fY({\n\031L6w\032\032\0163a^\nK;v^\027@6k".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label1897;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "\023\035J3s!\020O)z^,k\002F".toCharArray();
        int i40 = arrayOfChar12.length;
        i41 = 0;
        if (i40 > i41)
          break label1989;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "\023\013I)f\021\nKus\022\fK(M\n\031L6w!\031J>M\f\031Y\005v\037\fO".toCharArray();
        int i44 = arrayOfChar13.length;
        i45 = 0;
        if (i44 > i45)
          break label2081;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "\f\031Y\005v\037\fOzP27l".toCharArray();
        int i48 = arrayOfChar14.length;
        i49 = 0;
        if (i48 > i49)
          break label2173;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "\023\013I)f\021\nKuu\033\fY({\n\031L6w\032\032\001?j\027\013Z)".toCharArray();
        int i52 = arrayOfChar15.length;
        i53 = 0;
        if (i52 > i53)
          break label2265;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "\023\013I)f\021\nKuu\033\fY({\n\031L6w\032\032\0016{\r\f\016".toCharArray();
        int i56 = arrayOfChar16.length;
        i57 = 0;
        if (i56 > i57)
          break label2357;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "\r\035B?q\nX]+~^\036\\5^\013_6{\n\035q7s\r\fK(2\t\020K(w^\fW*wC_Z;p\022\035\tzs\020\034\0164s\023\035\023}\033\013];u\033\013\ta".toCharArray();
        int i60 = arrayOfChar17.length;
        i61 = 0;
        if (i60 > i61)
          break label2449;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "?4z\037@^,o\030^;XC?a\r\031I?a^9j\0362\023\035J3s!\020O)z^,k\002F^".toCharArray();
        int i64 = arrayOfChar18.length;
        i65 = 0;
        if (i64 > i65)
          break label2541;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "\023\013I)f\021\nKus\022\fK(M\n\031L6w!\031J>M\023\035J3s!\020O)z".toCharArray();
        int i68 = arrayOfChar19.length;
        i69 = 0;
        if (i68 > i69)
          break label2633;
        arrayOfString[18] = new String(arrayOfChar19).intern();
        arrayOfChar20 = "\023\013I)f\021\nKuu\033\fY({\n\031L6w\032\032\0017w\r\013O=w\rX]9z\033\025O".toCharArray();
        int i72 = arrayOfChar20.length;
        i73 = 0;
        if (i72 > i73)
          break label2725;
        arrayOfString[19] = new String(arrayOfChar20).intern();
        arrayOfChar21 = "\023\013I)f\021\nKuu\033\fY({\n\031L6w\032\032\001>}\020\035\0016{\r\f\016".toCharArray();
        int i76 = arrayOfChar21.length;
        i77 = 0;
        if (i76 > i77)
          break label2817;
        arrayOfString[20] = new String(arrayOfChar21).intern();
        arrayOfChar22 = "?4z\037@^,o\030^;XC?a\r\031I?a^9j\0362\f\031Y\005v\037\fOzP27lz".toCharArray();
        int i80 = arrayOfChar22.length;
        i81 = 0;
        if (i80 > i81)
          break label2909;
        arrayOfString[21] = new String(arrayOfChar22).intern();
        arrayOfChar23 = "\023\013I)f\021\nKuu\033\fY({\n\031L6w\032\032\016>}\033\013@}f^\035V3a\n".toCharArray();
        int i84 = arrayOfChar23.length;
        i85 = 0;
        if (i84 > i85)
          break label3001;
        arrayOfString[22] = new String(arrayOfChar23).intern();
        arrayOfChar24 = "\023\013I)f\021\nKtv\034".toCharArray();
        int i88 = arrayOfChar24.length;
        i89 = 0;
        if (i88 > i89)
          break label3093;
        arrayOfString[23] = new String(arrayOfChar24).intern();
        arrayOfChar25 = ".*o\035_?XM5g\020\fq9z\037\026I?aC7h\034)".toCharArray();
        int i92 = arrayOfChar25.length;
        i93 = 0;
        if (i92 > i93)
          break label3185;
        arrayOfString[24] = new String(arrayOfChar25).intern();
        arrayOfChar26 = ".*o\035_?X]#|\035\020\\5|\021\r]g\\1*c\033^E".toCharArray();
        int i96 = arrayOfChar26.length;
        i97 = 0;
        if (i96 > i97)
          break label3277;
        arrayOfString[25] = new String(arrayOfChar26).intern();
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
        m = 18;
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
        m = 126;
        continue;
        m = 120;
        continue;
        m = 46;
        continue;
        m = 90;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 18;
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
      i3 = 126;
      continue;
      i3 = 120;
      continue;
      i3 = 46;
      continue;
      i3 = 90;
    }
    label1161: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 18;
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
      i7 = 126;
      continue;
      i7 = 120;
      continue;
      i7 = 46;
      continue;
      i7 = 90;
    }
    label1253: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 18;
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
      i11 = 126;
      continue;
      i11 = 120;
      continue;
      i11 = 46;
      continue;
      i11 = 90;
    }
    label1345: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 18;
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
      i15 = 126;
      continue;
      i15 = 120;
      continue;
      i15 = 46;
      continue;
      i15 = 90;
    }
    label1437: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 18;
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
      i19 = 126;
      continue;
      i19 = 120;
      continue;
      i19 = 46;
      continue;
      i19 = 90;
    }
    label1529: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 18;
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
      i23 = 126;
      continue;
      i23 = 120;
      continue;
      i23 = 46;
      continue;
      i23 = 90;
    }
    label1621: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 18;
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
      i27 = 126;
      continue;
      i27 = 120;
      continue;
      i27 = 46;
      continue;
      i27 = 90;
    }
    label1713: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 18;
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
      i31 = 126;
      continue;
      i31 = 120;
      continue;
      i31 = 46;
      continue;
      i31 = 90;
    }
    label1805: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 18;
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
      i35 = 126;
      continue;
      i35 = 120;
      continue;
      i35 = 46;
      continue;
      i35 = 90;
    }
    label1897: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 18;
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
      i39 = 126;
      continue;
      i39 = 120;
      continue;
      i39 = 46;
      continue;
      i39 = 90;
    }
    label1989: int i42 = arrayOfChar12[i41];
    int i43;
    switch (i41 % 5)
    {
    default:
      i43 = 18;
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
      i43 = 126;
      continue;
      i43 = 120;
      continue;
      i43 = 46;
      continue;
      i43 = 90;
    }
    label2081: int i46 = arrayOfChar13[i45];
    int i47;
    switch (i45 % 5)
    {
    default:
      i47 = 18;
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
      i47 = 126;
      continue;
      i47 = 120;
      continue;
      i47 = 46;
      continue;
      i47 = 90;
    }
    label2173: int i50 = arrayOfChar14[i49];
    int i51;
    switch (i49 % 5)
    {
    default:
      i51 = 18;
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
      i51 = 126;
      continue;
      i51 = 120;
      continue;
      i51 = 46;
      continue;
      i51 = 90;
    }
    label2265: int i54 = arrayOfChar15[i53];
    int i55;
    switch (i53 % 5)
    {
    default:
      i55 = 18;
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
      i55 = 126;
      continue;
      i55 = 120;
      continue;
      i55 = 46;
      continue;
      i55 = 90;
    }
    label2357: int i58 = arrayOfChar16[i57];
    int i59;
    switch (i57 % 5)
    {
    default:
      i59 = 18;
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
      i59 = 126;
      continue;
      i59 = 120;
      continue;
      i59 = 46;
      continue;
      i59 = 90;
    }
    label2449: int i62 = arrayOfChar17[i61];
    int i63;
    switch (i61 % 5)
    {
    default:
      i63 = 18;
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
      i63 = 126;
      continue;
      i63 = 120;
      continue;
      i63 = 46;
      continue;
      i63 = 90;
    }
    label2541: int i66 = arrayOfChar18[i65];
    int i67;
    switch (i65 % 5)
    {
    default:
      i67 = 18;
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
      i67 = 126;
      continue;
      i67 = 120;
      continue;
      i67 = 46;
      continue;
      i67 = 90;
    }
    label2633: int i70 = arrayOfChar19[i69];
    int i71;
    switch (i69 % 5)
    {
    default:
      i71 = 18;
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
      i71 = 126;
      continue;
      i71 = 120;
      continue;
      i71 = 46;
      continue;
      i71 = 90;
    }
    label2725: int i74 = arrayOfChar20[i73];
    int i75;
    switch (i73 % 5)
    {
    default:
      i75 = 18;
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
      i75 = 126;
      continue;
      i75 = 120;
      continue;
      i75 = 46;
      continue;
      i75 = 90;
    }
    label2817: int i78 = arrayOfChar21[i77];
    int i79;
    switch (i77 % 5)
    {
    default:
      i79 = 18;
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
      i79 = 126;
      continue;
      i79 = 120;
      continue;
      i79 = 46;
      continue;
      i79 = 90;
    }
    label2909: int i82 = arrayOfChar22[i81];
    int i83;
    switch (i81 % 5)
    {
    default:
      i83 = 18;
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
      i83 = 126;
      continue;
      i83 = 120;
      continue;
      i83 = 46;
      continue;
      i83 = 90;
    }
    label3001: int i86 = arrayOfChar23[i85];
    int i87;
    switch (i85 % 5)
    {
    default:
      i87 = 18;
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
      i87 = 126;
      continue;
      i87 = 120;
      continue;
      i87 = 46;
      continue;
      i87 = 90;
    }
    label3093: int i90 = arrayOfChar24[i89];
    int i91;
    switch (i89 % 5)
    {
    default:
      i91 = 18;
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
      i91 = 126;
      continue;
      i91 = 120;
      continue;
      i91 = 46;
      continue;
      i91 = 90;
    }
    label3185: int i94 = arrayOfChar25[i93];
    int i95;
    switch (i93 % 5)
    {
    default:
      i95 = 18;
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
      i95 = 126;
      continue;
      i95 = 120;
      continue;
      i95 = 46;
      continue;
      i95 = 90;
    }
    label3277: int i98 = arrayOfChar26[i97];
    int i99;
    switch (i97 % 5)
    {
    default:
      i99 = 18;
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
      i99 = 126;
      continue;
      i99 = 120;
      continue;
      i99 = 46;
      continue;
      i99 = 90;
    }
  }

  l(Context paramContext)
  {
    super(paramContext, z[23], null, 1);
  }

  static int a(l paraml, int paramInt)
  {
    paraml.c = paramInt;
    return paramInt;
  }

  public static void a(int paramInt, Object paramObject, SQLiteStatement paramSQLiteStatement)
    throws IOException
  {
    if (paramObject == null)
    {
      paramSQLiteStatement.bindNull(paramInt);
      if (yq.e == 0);
    }
    else
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      new ObjectOutputStream(localByteArrayOutputStream).writeObject(paramObject);
      paramSQLiteStatement.bindBlob(paramInt, localByteArrayOutputStream.toByteArray());
    }
  }

  public static void a(int paramInt, String paramString, SQLiteStatement paramSQLiteStatement)
  {
    if (paramString == null)
    {
      paramSQLiteStatement.bindNull(paramInt);
      if (yq.e == 0);
    }
    else
    {
      paramSQLiteStatement.bindString(paramInt, paramString);
    }
  }

  public static void a(int paramInt, byte[] paramArrayOfByte, SQLiteStatement paramSQLiteStatement)
  {
    if (paramArrayOfByte == null)
    {
      paramSQLiteStatement.bindNull(paramInt);
      if (yq.e == 0);
    }
    else
    {
      paramSQLiteStatement.bindBlob(paramInt, paramArrayOfByte);
    }
  }

  static int b(l paraml, int paramInt)
  {
    paraml.d = paramInt;
    return paramInt;
  }

  public void a(rq paramrq)
  {
    this.b = paramrq;
  }

  public void close()
  {
    try
    {
      if ((this.a != null) && (this.a.isOpen()))
        this.a.close();
      this.a = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public SQLiteDatabase getReadableDatabase()
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      return localSQLiteDatabase;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  // ERROR //
  public SQLiteDatabase getWritableDatabase()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 89	com/whatsapp/l:a	Landroid/database/sqlite/SQLiteDatabase;
    //   6: ifnull +24 -> 30
    //   9: aload_0
    //   10: getfield 89	com/whatsapp/l:a	Landroid/database/sqlite/SQLiteDatabase;
    //   13: invokevirtual 145	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   16: ifeq +14 -> 30
    //   19: aload_0
    //   20: getfield 89	com/whatsapp/l:a	Landroid/database/sqlite/SQLiteDatabase;
    //   23: astore 7
    //   25: aload_0
    //   26: monitorexit
    //   27: aload 7
    //   29: areturn
    //   30: invokestatic 161	com/whatsapp/fq:I	()Ljava/io/File;
    //   33: invokestatic 164	com/whatsapp/fq:c	(Ljava/io/File;)Z
    //   36: ifne +133 -> 169
    //   39: getstatic 83	com/whatsapp/l:z	[Ljava/lang/String;
    //   42: bipush 22
    //   44: aaload
    //   45: invokestatic 169	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   48: invokestatic 161	com/whatsapp/fq:I	()Ljava/io/File;
    //   51: invokevirtual 174	java/io/File:getParentFile	()Ljava/io/File;
    //   54: invokevirtual 177	java/io/File:exists	()Z
    //   57: ifne +13 -> 70
    //   60: invokestatic 161	com/whatsapp/fq:I	()Ljava/io/File;
    //   63: invokevirtual 174	java/io/File:getParentFile	()Ljava/io/File;
    //   66: invokevirtual 180	java/io/File:mkdirs	()Z
    //   69: pop
    //   70: invokestatic 161	com/whatsapp/fq:I	()Ljava/io/File;
    //   73: invokevirtual 183	java/io/File:delete	()Z
    //   76: pop
    //   77: invokestatic 161	com/whatsapp/fq:I	()Ljava/io/File;
    //   80: getstatic 83	com/whatsapp/l:z	[Ljava/lang/String;
    //   83: bipush 15
    //   85: aaload
    //   86: invokestatic 186	com/whatsapp/fq:b	(Ljava/io/File;Ljava/lang/String;)V
    //   89: aload_0
    //   90: invokestatic 161	com/whatsapp/fq:I	()Ljava/io/File;
    //   93: invokevirtual 189	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   96: aconst_null
    //   97: ldc 190
    //   99: invokestatic 194	android/database/sqlite/SQLiteDatabase:openDatabase	(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)Landroid/database/sqlite/SQLiteDatabase;
    //   102: putfield 89	com/whatsapp/l:a	Landroid/database/sqlite/SQLiteDatabase;
    //   105: aload_0
    //   106: getfield 89	com/whatsapp/l:a	Landroid/database/sqlite/SQLiteDatabase;
    //   109: invokevirtual 197	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   112: aload_0
    //   113: aload_0
    //   114: getfield 89	com/whatsapp/l:a	Landroid/database/sqlite/SQLiteDatabase;
    //   117: invokevirtual 201	com/whatsapp/l:onCreate	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   120: aload_0
    //   121: getfield 89	com/whatsapp/l:a	Landroid/database/sqlite/SQLiteDatabase;
    //   124: invokevirtual 204	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   127: aload_0
    //   128: getfield 89	com/whatsapp/l:a	Landroid/database/sqlite/SQLiteDatabase;
    //   131: ifnull +20 -> 151
    //   134: aload_0
    //   135: getfield 89	com/whatsapp/l:a	Landroid/database/sqlite/SQLiteDatabase;
    //   138: invokevirtual 207	android/database/sqlite/SQLiteDatabase:inTransaction	()Z
    //   141: ifeq +10 -> 151
    //   144: aload_0
    //   145: getfield 89	com/whatsapp/l:a	Landroid/database/sqlite/SQLiteDatabase;
    //   148: invokevirtual 210	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   151: invokestatic 161	com/whatsapp/fq:I	()Ljava/io/File;
    //   154: getstatic 83	com/whatsapp/l:z	[Ljava/lang/String;
    //   157: bipush 20
    //   159: aaload
    //   160: invokestatic 186	com/whatsapp/fq:b	(Ljava/io/File;Ljava/lang/String;)V
    //   163: getstatic 108	com/whatsapp/yq:e	I
    //   166: ifeq +160 -> 326
    //   169: getstatic 83	com/whatsapp/l:z	[Ljava/lang/String;
    //   172: bipush 14
    //   174: aaload
    //   175: invokestatic 169	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   178: aload_0
    //   179: invokestatic 161	com/whatsapp/fq:I	()Ljava/io/File;
    //   182: invokevirtual 189	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   185: aconst_null
    //   186: bipush 16
    //   188: invokestatic 194	android/database/sqlite/SQLiteDatabase:openDatabase	(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)Landroid/database/sqlite/SQLiteDatabase;
    //   191: putfield 89	com/whatsapp/l:a	Landroid/database/sqlite/SQLiteDatabase;
    //   194: aload_0
    //   195: getfield 89	com/whatsapp/l:a	Landroid/database/sqlite/SQLiteDatabase;
    //   198: invokevirtual 213	android/database/sqlite/SQLiteDatabase:isReadOnly	()Z
    //   201: ifeq +12 -> 213
    //   204: getstatic 83	com/whatsapp/l:z	[Ljava/lang/String;
    //   207: bipush 10
    //   209: aaload
    //   210: invokestatic 215	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   213: ldc 217
    //   215: astore_2
    //   216: aload_0
    //   217: getfield 89	com/whatsapp/l:a	Landroid/database/sqlite/SQLiteDatabase;
    //   220: getstatic 83	com/whatsapp/l:z	[Ljava/lang/String;
    //   223: bipush 16
    //   225: aaload
    //   226: aconst_null
    //   227: invokevirtual 221	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   230: astore_3
    //   231: aload_3
    //   232: ifnull +34 -> 266
    //   235: aload_3
    //   236: invokeinterface 226 1 0
    //   241: ifeq +297 -> 538
    //   244: aload_3
    //   245: iconst_0
    //   246: invokeinterface 230 2 0
    //   251: astore 14
    //   253: aload 14
    //   255: astore 13
    //   257: aload_3
    //   258: invokeinterface 231 1 0
    //   263: aload 13
    //   265: astore_2
    //   266: aload_2
    //   267: getstatic 83	com/whatsapp/l:z	[Ljava/lang/String;
    //   270: bipush 13
    //   272: aaload
    //   273: invokevirtual 235	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   276: istore 4
    //   278: iload 4
    //   280: ifne +16 -> 296
    //   283: aload_0
    //   284: getfield 89	com/whatsapp/l:a	Landroid/database/sqlite/SQLiteDatabase;
    //   287: getstatic 83	com/whatsapp/l:z	[Ljava/lang/String;
    //   290: bipush 21
    //   292: aaload
    //   293: invokevirtual 238	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   296: aload_2
    //   297: getstatic 83	com/whatsapp/l:z	[Ljava/lang/String;
    //   300: bipush 11
    //   302: aaload
    //   303: invokevirtual 235	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   306: istore 5
    //   308: iload 5
    //   310: ifne +16 -> 326
    //   313: aload_0
    //   314: getfield 89	com/whatsapp/l:a	Landroid/database/sqlite/SQLiteDatabase;
    //   317: getstatic 83	com/whatsapp/l:z	[Ljava/lang/String;
    //   320: bipush 17
    //   322: aaload
    //   323: invokevirtual 238	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   326: aload_0
    //   327: getfield 89	com/whatsapp/l:a	Landroid/database/sqlite/SQLiteDatabase;
    //   330: astore 6
    //   332: aload 6
    //   334: ifnull +11 -> 345
    //   337: aload_0
    //   338: aload_0
    //   339: getfield 89	com/whatsapp/l:a	Landroid/database/sqlite/SQLiteDatabase;
    //   342: invokevirtual 241	com/whatsapp/l:onOpen	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   345: aload_0
    //   346: getfield 89	com/whatsapp/l:a	Landroid/database/sqlite/SQLiteDatabase;
    //   349: astore 7
    //   351: goto -326 -> 25
    //   354: astore 15
    //   356: aload_0
    //   357: getfield 89	com/whatsapp/l:a	Landroid/database/sqlite/SQLiteDatabase;
    //   360: ifnull +20 -> 380
    //   363: aload_0
    //   364: getfield 89	com/whatsapp/l:a	Landroid/database/sqlite/SQLiteDatabase;
    //   367: invokevirtual 207	android/database/sqlite/SQLiteDatabase:inTransaction	()Z
    //   370: ifeq +10 -> 380
    //   373: aload_0
    //   374: getfield 89	com/whatsapp/l:a	Landroid/database/sqlite/SQLiteDatabase;
    //   377: invokevirtual 210	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   380: invokestatic 161	com/whatsapp/fq:I	()Ljava/io/File;
    //   383: getstatic 83	com/whatsapp/l:z	[Ljava/lang/String;
    //   386: bipush 20
    //   388: aaload
    //   389: invokestatic 186	com/whatsapp/fq:b	(Ljava/io/File;Ljava/lang/String;)V
    //   392: aload 15
    //   394: athrow
    //   395: astore_1
    //   396: aload_0
    //   397: monitorexit
    //   398: aload_1
    //   399: athrow
    //   400: astore 12
    //   402: new 243	java/lang/StringBuilder
    //   405: dup
    //   406: invokespecial 244	java/lang/StringBuilder:<init>	()V
    //   409: getstatic 83	com/whatsapp/l:z	[Ljava/lang/String;
    //   412: bipush 19
    //   414: aaload
    //   415: invokevirtual 248	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   418: aload 12
    //   420: invokevirtual 251	java/lang/Exception:toString	()Ljava/lang/String;
    //   423: invokevirtual 248	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   426: invokevirtual 252	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   429: invokestatic 254	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   432: aload_3
    //   433: invokeinterface 231 1 0
    //   438: goto -172 -> 266
    //   441: astore 11
    //   443: aload_3
    //   444: invokeinterface 231 1 0
    //   449: aload 11
    //   451: athrow
    //   452: astore 10
    //   454: new 243	java/lang/StringBuilder
    //   457: dup
    //   458: invokespecial 244	java/lang/StringBuilder:<init>	()V
    //   461: getstatic 83	com/whatsapp/l:z	[Ljava/lang/String;
    //   464: bipush 12
    //   466: aaload
    //   467: invokevirtual 248	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   470: aload 10
    //   472: invokevirtual 255	android/database/sqlite/SQLiteException:toString	()Ljava/lang/String;
    //   475: invokevirtual 248	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   478: invokevirtual 252	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   481: invokestatic 254	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   484: goto -188 -> 296
    //   487: astore 9
    //   489: new 243	java/lang/StringBuilder
    //   492: dup
    //   493: invokespecial 244	java/lang/StringBuilder:<init>	()V
    //   496: getstatic 83	com/whatsapp/l:z	[Ljava/lang/String;
    //   499: bipush 18
    //   501: aaload
    //   502: invokevirtual 248	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   505: aload 9
    //   507: invokevirtual 255	android/database/sqlite/SQLiteException:toString	()Ljava/lang/String;
    //   510: invokevirtual 248	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   513: invokevirtual 252	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   516: invokestatic 254	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   519: goto -193 -> 326
    //   522: astore 8
    //   524: getstatic 83	com/whatsapp/l:z	[Ljava/lang/String;
    //   527: bipush 9
    //   529: aaload
    //   530: aload 8
    //   532: invokestatic 258	com/whatsapp/g5:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   535: goto -190 -> 345
    //   538: aload_2
    //   539: astore 13
    //   541: goto -284 -> 257
    //
    // Exception table:
    //   from	to	target	type
    //   48	127	354	finally
    //   2	25	395	finally
    //   30	48	395	finally
    //   127	231	395	finally
    //   257	278	395	finally
    //   283	296	395	finally
    //   296	308	395	finally
    //   313	326	395	finally
    //   326	332	395	finally
    //   337	345	395	finally
    //   345	395	395	finally
    //   432	535	395	finally
    //   235	253	400	java/lang/Exception
    //   235	253	441	finally
    //   402	432	441	finally
    //   283	296	452	android/database/sqlite/SQLiteException
    //   313	326	487	android/database/sqlite/SQLiteException
    //   337	345	522	android/database/sqlite/SQLiteException
  }

  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    g5.b(z[2]);
    paramSQLiteDatabase.execSQL(z[3]);
    paramSQLiteDatabase.execSQL(z[8]);
    paramSQLiteDatabase.execSQL(z[6]);
    paramSQLiteDatabase.execSQL(z[4]);
    paramSQLiteDatabase.execSQL(z[5]);
    paramSQLiteDatabase.execSQL(z[7]);
    paramSQLiteDatabase.setVersion(1);
  }

  public void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL(z[25]);
    paramSQLiteDatabase.execSQL(z[24]);
  }

  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    g5.b(z[1] + paramInt1 + z[0] + paramInt2);
    onCreate(paramSQLiteDatabase);
  }
}