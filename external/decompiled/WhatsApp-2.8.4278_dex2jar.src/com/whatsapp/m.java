package com.whatsapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;

class m extends SQLiteOpenHelper
{
  private static final String[] z;
  private SQLiteDatabase a = null;

  static
  {
    String[] arrayOfString = new String[36];
    char[] arrayOfChar1 = "\026\004\nF1\020v\006I!\020\016on\026\n!.X\f;2*E:8op\004\n5 i\02145;tM<%\020p\r4\"<f\025%\t:t��'t".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\021\004��WE\001\027\rK u\037\t' \r\037\034S6u!.X\006:8;f\006!%".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "14&i\003:y i&'3.s��u!.X\006:8;f\006!%op\004\n7!c\027:?+X\f;0 ".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label1541;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\026\004\nF1\020v\006I!\020\016om\f1\t&i\0010.oh\013u!.X\006:8;f\006!%gm\f1t".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label1633;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\026\004\nF1\020v\033F'\031\023op\004\n5 i\02145;tE}von\001u\037\001S \022\023\035'5\007\037\002F7\fv\004B<u\027\032S*\034\030\fU \030\023\001SIuv%n\001u\002\n_1u\030��SE\033\003\003KIuv&t:\">.s\0264&?X\020&3=',\033\002\n@ \007v\001H1u\030\032K)yvon\026\n??o\n;3oN+\001\023\bB7u\030��SE\033\003\003KIuv<s\004!#<'1\020\016\033+Eu8:j\0070$oS \r\002c'E'78X\006:8;f\006!\t&cE\034\030\033B\"\020\004c'E1?<w\t4/\020i\00483oS \r\002c'E%> i��\n\"6w��u\037\001S \022\023\035+Eu&'h\0130\t#f\0070:oS \r\002c'E 8<b��;\t\"t\002\n5 r\013!v\006I1\020\021\nUIuv?o\n!9\020s\026u\037\001S \022\023\035+E!>:j\007\n\"<',\033\002\n@ \007zow\r:\" X\f1\t;n\b0%;f\b%v\006I1\020\021\nUIu1&q��;\t!f\b0v\033B=\001zoa\0048?#~:;7\"bE\001\023\027SIu!.X\0134;*'1\020\016\033.".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label1725;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "��&(u\0041?!`E17;f\0074%*'\003'9\"'\0230$<n\n;v".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label1817;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "yv8o\f6>op\f9:oc��&\"=h\034u7#kE::+'\0014\".".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label1909;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "u\" '".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label2001;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "37\"n\t,\t!f\b0v\033B=\001".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label2093;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "&3#b\006!v<v\tu0=h\bu%>k\f!3\020j\004&\"*uE\">*u��u\"6w��hq;f\00793h'\004;2oi\00483r \0224\t,h\013!7,s\026rm".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label2185;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "\024\032\033B7u\002\016E)\020v8f:69!s\0046\"<'$\021\022ow\r:\" X\f1\t;n\b0%;f\b%v\006I1\020\021\nUE".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label2277;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "14&i\003:y w��;\t*\f&\"&i\002\n2-".toCharArray();
        int i40 = arrayOfChar12.length;
        i41 = 0;
        if (i40 > i41)
          break label2369;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "yv\016w\025#3=t\f:8u".toCharArray();
        int i44 = arrayOfChar13.length;
        i45 = 0;
        if (i44 > i45)
          break label2461;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "\024\032\033B7u\002\016E)\020v8f:69!s\0046\"<'$\021\022ow\r:\" X\021&v\006I1\020\021\nUE".toCharArray();
        int i48 = arrayOfChar14.length;
        i49 = 0;
        if (i48 > i49)
          break label2553;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "%> s\n\n?+X\021<;*t\0214;?',\033\002\n@ \007".toCharArray();
        int i52 = arrayOfChar15.length;
        i53 = 0;
        if (i52 > i53)
          break label2645;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "\024\032\033B7u\002\016E)\020v8f:69!s\0046\"<'$\021\022os\r ;-X\021&v\006I1\020\021\nUE".toCharArray();
        int i56 = arrayOfChar16.length;
        i57 = 0;
        if (i56 > i57)
          break label2737;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "\024\032\033B7u\002\016E)\020v8f:69!s\0046\"<'$\021\022op\004\n8.j��u\002\n_1u".toCharArray();
        int i60 = arrayOfChar17.length;
        i61 = 0;
        if (i60 > i61)
          break label2829;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "6#=u��;\"oq��'%&h\013o".toCharArray();
        int i64 = arrayOfChar18.length;
        i65 = 0;
        if (i64 > i65)
          break label2921;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "\"7\020i\00483oS \r\002".toCharArray();
        int i68 = arrayOfChar19.length;
        i69 = 0;
        if (i68 > i69)
          break label3013;
        arrayOfString[18] = new String(arrayOfChar19).intern();
        arrayOfChar20 = "\024\032\033B7u\002\016E)\020v8f:69!s\0046\"<'$\021\022o`\f#3!X\0134;*'1\020\016\033'".toCharArray();
        int i72 = arrayOfChar20.length;
        i73 = 0;
        if (i72 > i73)
          break label3105;
        arrayOfString[19] = new String(arrayOfChar20).intern();
        arrayOfChar21 = "14&i\003:y'b\t%3=X\006'3.s��\n2-".toCharArray();
        int i76 = arrayOfChar21.length;
        i77 = 0;
        if (i76 > i77)
          break label3197;
        arrayOfString[20] = new String(arrayOfChar21).intern();
        arrayOfChar22 = "!>:j\007\n\"<',\033\002\n@ \007".toCharArray();
        int i80 = arrayOfChar22.length;
        i81 = 0;
        if (i80 > i81)
          break label3289;
        arrayOfString[21] = new String(arrayOfChar22).intern();
        arrayOfChar23 = "%> s\n\n\"<',\033\002\n@ \007".toCharArray();
        int i84 = arrayOfChar23.length;
        i85 = 0;
        if (i84 > i85)
          break label3381;
        arrayOfString[22] = new String(arrayOfChar23).intern();
        arrayOfChar24 = "\"7+e\r0:?b\027z1*s\022'?;f\00793+eJ\"7\020d\n;\".d\021&v<d\r0;.".toCharArray();
        int i88 = arrayOfChar24.length;
        i89 = 0;
        if (i88 > i89)
          break label3473;
        arrayOfString[23] = new String(arrayOfChar24).intern();
        arrayOfChar25 = "\"7+e\r0:?b\027z1*s2'?;f\00793\013f\02144.t��z9!H\02508`T4\031?;b -5*w\021<9!'".toCharArray();
        int i92 = arrayOfChar25.length;
        i93 = 0;
        if (i92 > i93)
          break label3565;
        arrayOfString[24] = new String(arrayOfChar25).intern();
        arrayOfChar26 = "2?9b\013\n8.j��u\002\n_1".toCharArray();
        int i96 = arrayOfChar26.length;
        i97 = 0;
        if (i96 > i97)
          break label3657;
        arrayOfString[25] = new String(arrayOfChar26).intern();
        arrayOfChar27 = "\024\032\033B7u\002\016E)\020v8f:69!s\0046\"<'$\021\022oa\0048?#~:;7\"bE\001\023\027SE".toCharArray();
        int i100 = arrayOfChar27.length;
        i101 = 0;
        if (i100 > i101)
          break label3749;
        arrayOfString[26] = new String(arrayOfChar27).intern();
        arrayOfChar28 = "\"7+e\r0:?b\027z1*s2'?;f\00793\013f\02144.t��z\005\036K\f!3\n\0060&;n\n;v".toCharArray();
        int i104 = arrayOfChar28.length;
        i105 = 0;
        if (i104 > i105)
          break label3841;
        arrayOfString[27] = new String(arrayOfChar28).intern();
        arrayOfChar29 = "\"7ac\007".toCharArray();
        int i108 = arrayOfChar29.length;
        i109 = 0;
        if (i108 > i109)
          break label3933;
        arrayOfString[28] = new String(arrayOfChar29).intern();
        arrayOfChar30 = "\005\004\016@(\024v,h\020;\"\020d\r48(b\026h\031\tA^".toCharArray();
        int i112 = arrayOfChar30.length;
        i113 = 0;
        if (i112 > i113)
          break label4025;
        arrayOfString[29] = new String(arrayOfChar30).intern();
        arrayOfChar31 = "14&i\003:y i*%3!'\0224\t,h\013!7,s\026".toCharArray();
        int i116 = arrayOfChar31.length;
        i117 = 0;
        if (i116 > i117)
          break label4117;
        arrayOfString[30] = new String(arrayOfChar31).intern();
        arrayOfChar32 = "\005\004\016@(\024v<~\0136>=h\013:#<:*\023\020t".toCharArray();
        int i120 = arrayOfChar32.length;
        i121 = 0;
        if (i120 > i121)
          break label4209;
        arrayOfString[31] = new String(arrayOfChar32).intern();
        arrayOfChar33 = "14&i\003:y,o��6=\013f\0214\024.t��".toCharArray();
        int i124 = arrayOfChar33.length;
        i125 = 0;
        if (i124 > i125)
          break label4301;
        arrayOfString[32] = new String(arrayOfChar33).intern();
        arrayOfChar34 = "\"7+e\r0:?b\027z5'b\006>\022.s\004\0277<bE".toCharArray();
        int i128 = arrayOfChar34.length;
        i129 = 0;
        if (i128 > i129)
          break label4393;
        arrayOfString[33] = new String(arrayOfChar34).intern();
        arrayOfChar35 = "{4.d\016".toCharArray();
        int i132 = arrayOfChar35.length;
        i133 = 0;
        if (i132 > i133)
          break label4485;
        arrayOfString[34] = new String(arrayOfChar35).intern();
        arrayOfChar36 = "x< r\027;7#".toCharArray();
        int i136 = arrayOfChar36.length;
        i137 = 0;
        if (i136 > i137)
          break label4577;
        arrayOfString[35] = new String(arrayOfChar36).intern();
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
        m = 101;
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
        m = 85;
        continue;
        m = 86;
        continue;
        m = 79;
        continue;
        m = 7;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 101;
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
      i3 = 85;
      continue;
      i3 = 86;
      continue;
      i3 = 79;
      continue;
      i3 = 7;
    }
    label1541: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 101;
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
      i7 = 85;
      continue;
      i7 = 86;
      continue;
      i7 = 79;
      continue;
      i7 = 7;
    }
    label1633: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 101;
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
      i11 = 85;
      continue;
      i11 = 86;
      continue;
      i11 = 79;
      continue;
      i11 = 7;
    }
    label1725: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 101;
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
      i15 = 85;
      continue;
      i15 = 86;
      continue;
      i15 = 79;
      continue;
      i15 = 7;
    }
    label1817: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 101;
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
      i19 = 85;
      continue;
      i19 = 86;
      continue;
      i19 = 79;
      continue;
      i19 = 7;
    }
    label1909: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 101;
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
      i23 = 85;
      continue;
      i23 = 86;
      continue;
      i23 = 79;
      continue;
      i23 = 7;
    }
    label2001: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 101;
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
      i27 = 85;
      continue;
      i27 = 86;
      continue;
      i27 = 79;
      continue;
      i27 = 7;
    }
    label2093: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 101;
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
      i31 = 85;
      continue;
      i31 = 86;
      continue;
      i31 = 79;
      continue;
      i31 = 7;
    }
    label2185: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 101;
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
      i35 = 85;
      continue;
      i35 = 86;
      continue;
      i35 = 79;
      continue;
      i35 = 7;
    }
    label2277: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 101;
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
      i39 = 85;
      continue;
      i39 = 86;
      continue;
      i39 = 79;
      continue;
      i39 = 7;
    }
    label2369: int i42 = arrayOfChar12[i41];
    int i43;
    switch (i41 % 5)
    {
    default:
      i43 = 101;
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
      i43 = 85;
      continue;
      i43 = 86;
      continue;
      i43 = 79;
      continue;
      i43 = 7;
    }
    label2461: int i46 = arrayOfChar13[i45];
    int i47;
    switch (i45 % 5)
    {
    default:
      i47 = 101;
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
      i47 = 85;
      continue;
      i47 = 86;
      continue;
      i47 = 79;
      continue;
      i47 = 7;
    }
    label2553: int i50 = arrayOfChar14[i49];
    int i51;
    switch (i49 % 5)
    {
    default:
      i51 = 101;
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
      i51 = 85;
      continue;
      i51 = 86;
      continue;
      i51 = 79;
      continue;
      i51 = 7;
    }
    label2645: int i54 = arrayOfChar15[i53];
    int i55;
    switch (i53 % 5)
    {
    default:
      i55 = 101;
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
      i55 = 85;
      continue;
      i55 = 86;
      continue;
      i55 = 79;
      continue;
      i55 = 7;
    }
    label2737: int i58 = arrayOfChar16[i57];
    int i59;
    switch (i57 % 5)
    {
    default:
      i59 = 101;
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
      i59 = 85;
      continue;
      i59 = 86;
      continue;
      i59 = 79;
      continue;
      i59 = 7;
    }
    label2829: int i62 = arrayOfChar17[i61];
    int i63;
    switch (i61 % 5)
    {
    default:
      i63 = 101;
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
      i63 = 85;
      continue;
      i63 = 86;
      continue;
      i63 = 79;
      continue;
      i63 = 7;
    }
    label2921: int i66 = arrayOfChar18[i65];
    int i67;
    switch (i65 % 5)
    {
    default:
      i67 = 101;
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
      i67 = 85;
      continue;
      i67 = 86;
      continue;
      i67 = 79;
      continue;
      i67 = 7;
    }
    label3013: int i70 = arrayOfChar19[i69];
    int i71;
    switch (i69 % 5)
    {
    default:
      i71 = 101;
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
      i71 = 85;
      continue;
      i71 = 86;
      continue;
      i71 = 79;
      continue;
      i71 = 7;
    }
    label3105: int i74 = arrayOfChar20[i73];
    int i75;
    switch (i73 % 5)
    {
    default:
      i75 = 101;
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
      i75 = 85;
      continue;
      i75 = 86;
      continue;
      i75 = 79;
      continue;
      i75 = 7;
    }
    label3197: int i78 = arrayOfChar21[i77];
    int i79;
    switch (i77 % 5)
    {
    default:
      i79 = 101;
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
      i79 = 85;
      continue;
      i79 = 86;
      continue;
      i79 = 79;
      continue;
      i79 = 7;
    }
    label3289: int i82 = arrayOfChar22[i81];
    int i83;
    switch (i81 % 5)
    {
    default:
      i83 = 101;
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
      i83 = 85;
      continue;
      i83 = 86;
      continue;
      i83 = 79;
      continue;
      i83 = 7;
    }
    label3381: int i86 = arrayOfChar23[i85];
    int i87;
    switch (i85 % 5)
    {
    default:
      i87 = 101;
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
      i87 = 85;
      continue;
      i87 = 86;
      continue;
      i87 = 79;
      continue;
      i87 = 7;
    }
    label3473: int i90 = arrayOfChar24[i89];
    int i91;
    switch (i89 % 5)
    {
    default:
      i91 = 101;
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
      i91 = 85;
      continue;
      i91 = 86;
      continue;
      i91 = 79;
      continue;
      i91 = 7;
    }
    label3565: int i94 = arrayOfChar25[i93];
    int i95;
    switch (i93 % 5)
    {
    default:
      i95 = 101;
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
      i95 = 85;
      continue;
      i95 = 86;
      continue;
      i95 = 79;
      continue;
      i95 = 7;
    }
    label3657: int i98 = arrayOfChar26[i97];
    int i99;
    switch (i97 % 5)
    {
    default:
      i99 = 101;
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
      i99 = 85;
      continue;
      i99 = 86;
      continue;
      i99 = 79;
      continue;
      i99 = 7;
    }
    label3749: int i102 = arrayOfChar27[i101];
    int i103;
    switch (i101 % 5)
    {
    default:
      i103 = 101;
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
      i103 = 85;
      continue;
      i103 = 86;
      continue;
      i103 = 79;
      continue;
      i103 = 7;
    }
    label3841: int i106 = arrayOfChar28[i105];
    int i107;
    switch (i105 % 5)
    {
    default:
      i107 = 101;
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
      i107 = 85;
      continue;
      i107 = 86;
      continue;
      i107 = 79;
      continue;
      i107 = 7;
    }
    label3933: int i110 = arrayOfChar29[i109];
    int i111;
    switch (i109 % 5)
    {
    default:
      i111 = 101;
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
      i111 = 85;
      continue;
      i111 = 86;
      continue;
      i111 = 79;
      continue;
      i111 = 7;
    }
    label4025: int i114 = arrayOfChar30[i113];
    int i115;
    switch (i113 % 5)
    {
    default:
      i115 = 101;
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
      i115 = 85;
      continue;
      i115 = 86;
      continue;
      i115 = 79;
      continue;
      i115 = 7;
    }
    label4117: int i118 = arrayOfChar31[i117];
    int i119;
    switch (i117 % 5)
    {
    default:
      i119 = 101;
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
      i119 = 85;
      continue;
      i119 = 86;
      continue;
      i119 = 79;
      continue;
      i119 = 7;
    }
    label4209: int i122 = arrayOfChar32[i121];
    int i123;
    switch (i121 % 5)
    {
    default:
      i123 = 101;
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
      i123 = 85;
      continue;
      i123 = 86;
      continue;
      i123 = 79;
      continue;
      i123 = 7;
    }
    label4301: int i126 = arrayOfChar33[i125];
    int i127;
    switch (i125 % 5)
    {
    default:
      i127 = 101;
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
      i127 = 85;
      continue;
      i127 = 86;
      continue;
      i127 = 79;
      continue;
      i127 = 7;
    }
    label4393: int i130 = arrayOfChar34[i129];
    int i131;
    switch (i129 % 5)
    {
    default:
      i131 = 101;
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
      i131 = 85;
      continue;
      i131 = 86;
      continue;
      i131 = 79;
      continue;
      i131 = 7;
    }
    label4485: int i134 = arrayOfChar35[i133];
    int i135;
    switch (i133 % 5)
    {
    default:
      i135 = 101;
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
      i135 = 85;
      continue;
      i135 = 86;
      continue;
      i135 = 79;
      continue;
      i135 = 7;
    }
    label4577: int i138 = arrayOfChar36[i137];
    int i139;
    switch (i137 % 5)
    {
    default:
      i139 = 101;
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
      i139 = 85;
      continue;
      i139 = 86;
      continue;
      i139 = 79;
      continue;
      i139 = 7;
    }
  }

  m(Context paramContext)
  {
    super(paramContext, z[28], null, 2);
  }

  static SQLiteDatabase a(m paramm)
  {
    return paramm.a;
  }

  private boolean a()
  {
    g5.b(z[32]);
    xq.b(xq.g(), z[35]);
    xq.b(xq.g(), z[34]);
    try
    {
      SQLiteDatabase localSQLiteDatabase2 = SQLiteDatabase.openDatabase(xq.g().getAbsolutePath(), null, 16);
      localSQLiteDatabase1 = localSQLiteDatabase2;
      if (localSQLiteDatabase1 != null)
        localSQLiteDatabase1.close();
      if (localSQLiteDatabase1 != null)
      {
        bool = true;
        return bool;
      }
    }
    catch (SQLiteException localSQLiteException)
    {
      while (true)
      {
        g5.d(z[33] + localSQLiteException.toString());
        SQLiteDatabase localSQLiteDatabase1 = null;
        continue;
        boolean bool = false;
      }
    }
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
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: getstatic 168	com/whatsapp/yq:e	I
    //   7: istore_3
    //   8: aload_0
    //   9: getfield 104	com/whatsapp/m:a	Landroid/database/sqlite/SQLiteDatabase;
    //   12: ifnull +24 -> 36
    //   15: aload_0
    //   16: getfield 104	com/whatsapp/m:a	Landroid/database/sqlite/SQLiteDatabase;
    //   19: invokevirtual 155	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   22: ifeq +14 -> 36
    //   25: aload_0
    //   26: getfield 104	com/whatsapp/m:a	Landroid/database/sqlite/SQLiteDatabase;
    //   29: astore 15
    //   31: aload_0
    //   32: monitorexit
    //   33: aload 15
    //   35: areturn
    //   36: aload_0
    //   37: invokespecial 170	com/whatsapp/m:a	()Z
    //   40: ifne +24 -> 64
    //   43: getstatic 98	com/whatsapp/m:z	[Ljava/lang/String;
    //   46: bipush 20
    //   48: aaload
    //   49: invokestatic 114	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   52: aload_0
    //   53: aload_0
    //   54: invokespecial 171	android/database/sqlite/SQLiteOpenHelper:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   57: putfield 104	com/whatsapp/m:a	Landroid/database/sqlite/SQLiteDatabase;
    //   60: iload_3
    //   61: ifeq +140 -> 201
    //   64: getstatic 98	com/whatsapp/m:z	[Ljava/lang/String;
    //   67: bipush 11
    //   69: aaload
    //   70: invokestatic 114	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   73: aload_0
    //   74: invokestatic 120	com/whatsapp/xq:g	()Ljava/io/File;
    //   77: invokevirtual 128	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   80: aconst_null
    //   81: bipush 16
    //   83: invokestatic 134	android/database/sqlite/SQLiteDatabase:openDatabase	(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)Landroid/database/sqlite/SQLiteDatabase;
    //   86: putfield 104	com/whatsapp/m:a	Landroid/database/sqlite/SQLiteDatabase;
    //   89: aload_0
    //   90: getfield 104	com/whatsapp/m:a	Landroid/database/sqlite/SQLiteDatabase;
    //   93: invokevirtual 175	android/database/sqlite/SQLiteDatabase:getVersion	()I
    //   96: istore 27
    //   98: new 139	java/lang/StringBuilder
    //   101: dup
    //   102: invokespecial 141	java/lang/StringBuilder:<init>	()V
    //   105: getstatic 98	com/whatsapp/m:z	[Ljava/lang/String;
    //   108: bipush 17
    //   110: aaload
    //   111: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: iload 27
    //   116: invokevirtual 178	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   119: getstatic 98	com/whatsapp/m:z	[Ljava/lang/String;
    //   122: bipush 12
    //   124: aaload
    //   125: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: iconst_2
    //   129: invokevirtual 178	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   132: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   135: invokestatic 114	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   138: iload 27
    //   140: iconst_2
    //   141: if_icmpeq +60 -> 201
    //   144: aload_0
    //   145: getfield 104	com/whatsapp/m:a	Landroid/database/sqlite/SQLiteDatabase;
    //   148: invokevirtual 181	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   151: iload 27
    //   153: ifne +15 -> 168
    //   156: aload_0
    //   157: aload_0
    //   158: getfield 104	com/whatsapp/m:a	Landroid/database/sqlite/SQLiteDatabase;
    //   161: invokevirtual 185	com/whatsapp/m:onCreate	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   164: iload_3
    //   165: ifeq +14 -> 179
    //   168: aload_0
    //   169: aload_0
    //   170: getfield 104	com/whatsapp/m:a	Landroid/database/sqlite/SQLiteDatabase;
    //   173: iload 27
    //   175: iconst_2
    //   176: invokevirtual 189	com/whatsapp/m:onUpgrade	(Landroid/database/sqlite/SQLiteDatabase;II)V
    //   179: aload_0
    //   180: getfield 104	com/whatsapp/m:a	Landroid/database/sqlite/SQLiteDatabase;
    //   183: iconst_2
    //   184: invokevirtual 193	android/database/sqlite/SQLiteDatabase:setVersion	(I)V
    //   187: aload_0
    //   188: getfield 104	com/whatsapp/m:a	Landroid/database/sqlite/SQLiteDatabase;
    //   191: invokevirtual 196	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   194: aload_0
    //   195: getfield 104	com/whatsapp/m:a	Landroid/database/sqlite/SQLiteDatabase;
    //   198: invokevirtual 199	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   201: ldc 201
    //   203: astore 5
    //   205: aload_0
    //   206: getfield 104	com/whatsapp/m:a	Landroid/database/sqlite/SQLiteDatabase;
    //   209: getstatic 98	com/whatsapp/m:z	[Ljava/lang/String;
    //   212: bipush 9
    //   214: aaload
    //   215: aconst_null
    //   216: invokevirtual 205	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   219: astore 6
    //   221: aload 6
    //   223: ifnull +38 -> 261
    //   226: aload 6
    //   228: invokeinterface 210 1 0
    //   233: ifeq +448 -> 681
    //   236: aload 6
    //   238: iconst_0
    //   239: invokeinterface 214 2 0
    //   244: astore 26
    //   246: aload 26
    //   248: astore 25
    //   250: aload 6
    //   252: invokeinterface 215 1 0
    //   257: aload 25
    //   259: astore 5
    //   261: aload 5
    //   263: getstatic 98	com/whatsapp/m:z	[Ljava/lang/String;
    //   266: bipush 22
    //   268: aaload
    //   269: invokevirtual 219	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   272: istore 7
    //   274: iload 7
    //   276: ifne +16 -> 292
    //   279: aload_0
    //   280: getfield 104	com/whatsapp/m:a	Landroid/database/sqlite/SQLiteDatabase;
    //   283: getstatic 98	com/whatsapp/m:z	[Ljava/lang/String;
    //   286: bipush 13
    //   288: aaload
    //   289: invokevirtual 222	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   292: aload 5
    //   294: getstatic 98	com/whatsapp/m:z	[Ljava/lang/String;
    //   297: bipush 21
    //   299: aaload
    //   300: invokevirtual 219	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   303: istore 8
    //   305: iload 8
    //   307: ifne +16 -> 323
    //   310: aload_0
    //   311: getfield 104	com/whatsapp/m:a	Landroid/database/sqlite/SQLiteDatabase;
    //   314: getstatic 98	com/whatsapp/m:z	[Ljava/lang/String;
    //   317: bipush 15
    //   319: aaload
    //   320: invokevirtual 222	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   323: aload 5
    //   325: getstatic 98	com/whatsapp/m:z	[Ljava/lang/String;
    //   328: bipush 14
    //   330: aaload
    //   331: invokevirtual 219	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   334: istore 9
    //   336: iload 9
    //   338: ifne +16 -> 354
    //   341: aload_0
    //   342: getfield 104	com/whatsapp/m:a	Landroid/database/sqlite/SQLiteDatabase;
    //   345: getstatic 98	com/whatsapp/m:z	[Ljava/lang/String;
    //   348: bipush 10
    //   350: aaload
    //   351: invokevirtual 222	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   354: iconst_1
    //   355: istore 10
    //   357: aload 5
    //   359: getstatic 98	com/whatsapp/m:z	[Ljava/lang/String;
    //   362: bipush 25
    //   364: aaload
    //   365: invokevirtual 219	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   368: istore 11
    //   370: iload 11
    //   372: ifne +19 -> 391
    //   375: aload_0
    //   376: getfield 104	com/whatsapp/m:a	Landroid/database/sqlite/SQLiteDatabase;
    //   379: getstatic 98	com/whatsapp/m:z	[Ljava/lang/String;
    //   382: bipush 19
    //   384: aaload
    //   385: invokevirtual 222	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   388: iconst_0
    //   389: istore 10
    //   391: aload 5
    //   393: getstatic 98	com/whatsapp/m:z	[Ljava/lang/String;
    //   396: bipush 8
    //   398: aaload
    //   399: invokevirtual 219	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   402: istore 12
    //   404: iload 12
    //   406: ifne +19 -> 425
    //   409: aload_0
    //   410: getfield 104	com/whatsapp/m:a	Landroid/database/sqlite/SQLiteDatabase;
    //   413: getstatic 98	com/whatsapp/m:z	[Ljava/lang/String;
    //   416: bipush 26
    //   418: aaload
    //   419: invokevirtual 222	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   422: iconst_0
    //   423: istore 10
    //   425: aload 5
    //   427: getstatic 98	com/whatsapp/m:z	[Ljava/lang/String;
    //   430: bipush 18
    //   432: aaload
    //   433: invokevirtual 219	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   436: istore 13
    //   438: iload 13
    //   440: ifne +235 -> 675
    //   443: aload_0
    //   444: getfield 104	com/whatsapp/m:a	Landroid/database/sqlite/SQLiteDatabase;
    //   447: getstatic 98	com/whatsapp/m:z	[Ljava/lang/String;
    //   450: bipush 16
    //   452: aaload
    //   453: invokevirtual 222	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   456: aload_0
    //   457: aload_0
    //   458: getfield 104	com/whatsapp/m:a	Landroid/database/sqlite/SQLiteDatabase;
    //   461: invokevirtual 225	com/whatsapp/m:onOpen	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   464: iload_1
    //   465: ifne +19 -> 484
    //   468: new 227	com/whatsapp/fb
    //   471: dup
    //   472: aload_0
    //   473: invokespecial 230	com/whatsapp/fb:<init>	(Lcom/whatsapp/m;)V
    //   476: iconst_0
    //   477: anewarray 232	java/lang/Void
    //   480: invokevirtual 236	com/whatsapp/fb:execute	([Ljava/lang/Object;)Landroid/os/AsyncTask;
    //   483: pop
    //   484: aload_0
    //   485: getfield 104	com/whatsapp/m:a	Landroid/database/sqlite/SQLiteDatabase;
    //   488: astore 15
    //   490: goto -459 -> 31
    //   493: astore 28
    //   495: aload_0
    //   496: getfield 104	com/whatsapp/m:a	Landroid/database/sqlite/SQLiteDatabase;
    //   499: invokevirtual 199	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   502: aload 28
    //   504: athrow
    //   505: astore 4
    //   507: new 139	java/lang/StringBuilder
    //   510: dup
    //   511: invokespecial 141	java/lang/StringBuilder:<init>	()V
    //   514: getstatic 98	com/whatsapp/m:z	[Ljava/lang/String;
    //   517: bipush 27
    //   519: aaload
    //   520: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   523: aload 4
    //   525: invokevirtual 148	android/database/sqlite/SQLiteException:toString	()Ljava/lang/String;
    //   528: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   531: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   534: invokestatic 152	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   537: aload_0
    //   538: aconst_null
    //   539: invokestatic 240	android/database/sqlite/SQLiteDatabase:create	(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;
    //   542: putfield 104	com/whatsapp/m:a	Landroid/database/sqlite/SQLiteDatabase;
    //   545: aload_0
    //   546: aload_0
    //   547: getfield 104	com/whatsapp/m:a	Landroid/database/sqlite/SQLiteDatabase;
    //   550: invokevirtual 185	com/whatsapp/m:onCreate	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   553: goto -352 -> 201
    //   556: astore_2
    //   557: aload_0
    //   558: monitorexit
    //   559: aload_2
    //   560: athrow
    //   561: astore 24
    //   563: new 139	java/lang/StringBuilder
    //   566: dup
    //   567: invokespecial 141	java/lang/StringBuilder:<init>	()V
    //   570: getstatic 98	com/whatsapp/m:z	[Ljava/lang/String;
    //   573: bipush 23
    //   575: aaload
    //   576: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   579: aload 24
    //   581: invokevirtual 241	java/lang/Exception:toString	()Ljava/lang/String;
    //   584: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   587: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   590: invokestatic 152	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   593: aload 6
    //   595: invokeinterface 215 1 0
    //   600: goto -339 -> 261
    //   603: astore 23
    //   605: aload 6
    //   607: invokeinterface 215 1 0
    //   612: aload 23
    //   614: athrow
    //   615: astore 14
    //   617: new 139	java/lang/StringBuilder
    //   620: dup
    //   621: invokespecial 141	java/lang/StringBuilder:<init>	()V
    //   624: getstatic 98	com/whatsapp/m:z	[Ljava/lang/String;
    //   627: bipush 24
    //   629: aaload
    //   630: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   633: aload 14
    //   635: invokevirtual 148	android/database/sqlite/SQLiteException:toString	()Ljava/lang/String;
    //   638: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   641: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   644: invokestatic 152	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   647: goto -183 -> 464
    //   650: astore 18
    //   652: goto -227 -> 425
    //   655: astore 19
    //   657: goto -266 -> 391
    //   660: astore 20
    //   662: goto -308 -> 354
    //   665: astore 21
    //   667: goto -344 -> 323
    //   670: astore 22
    //   672: goto -380 -> 292
    //   675: iload 10
    //   677: istore_1
    //   678: goto -222 -> 456
    //   681: aload 5
    //   683: astore 25
    //   685: goto -435 -> 250
    //   688: astore 17
    //   690: iload 10
    //   692: istore_1
    //   693: goto -237 -> 456
    //
    // Exception table:
    //   from	to	target	type
    //   156	194	493	finally
    //   36	151	505	android/database/sqlite/SQLiteException
    //   194	201	505	android/database/sqlite/SQLiteException
    //   495	505	505	android/database/sqlite/SQLiteException
    //   4	31	556	finally
    //   36	151	556	finally
    //   194	201	556	finally
    //   201	221	556	finally
    //   250	274	556	finally
    //   279	292	556	finally
    //   292	305	556	finally
    //   310	323	556	finally
    //   323	336	556	finally
    //   341	354	556	finally
    //   357	370	556	finally
    //   375	388	556	finally
    //   391	404	556	finally
    //   409	422	556	finally
    //   425	438	556	finally
    //   443	456	556	finally
    //   456	464	556	finally
    //   468	490	556	finally
    //   495	505	556	finally
    //   507	553	556	finally
    //   593	647	556	finally
    //   226	246	561	java/lang/Exception
    //   226	246	603	finally
    //   563	593	603	finally
    //   456	464	615	android/database/sqlite/SQLiteException
    //   409	422	650	android/database/sqlite/SQLiteException
    //   375	388	655	android/database/sqlite/SQLiteException
    //   341	354	660	android/database/sqlite/SQLiteException
    //   310	323	665	android/database/sqlite/SQLiteException
    //   279	292	670	android/database/sqlite/SQLiteException
    //   443	456	688	android/database/sqlite/SQLiteException
  }

  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    g5.b(z[2]);
    paramSQLiteDatabase.execSQL(z[1]);
    paramSQLiteDatabase.execSQL(z[4]);
    paramSQLiteDatabase.execSQL(z[0]);
    paramSQLiteDatabase.execSQL(z[3]);
  }

  public void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
    g5.b(z[30]);
    paramSQLiteDatabase.execSQL(z[31]);
    paramSQLiteDatabase.execSQL(z[29]);
  }

  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    g5.c(z[5] + paramInt1 + z[7] + paramInt2 + z[6]);
    paramSQLiteDatabase.execSQL(z[1]);
    onCreate(paramSQLiteDatabase);
  }
}