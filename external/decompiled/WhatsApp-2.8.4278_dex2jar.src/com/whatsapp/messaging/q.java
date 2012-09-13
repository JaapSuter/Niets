package com.whatsapp.messaging;

import android.os.Messenger;
import com.whatsapp.c1;
import com.whatsapp.g5;
import com.whatsapp.sz;
import com.whatsapp.uz;
import com.whatsapp.x0;
import java.io.IOException;
import java.util.Hashtable;

public class q
  implements x0
{
  private static final String[] z;
  private final Messenger a;

  static
  {
    String[] arrayOfString = new String[43];
    char[] arrayOfChar1 = "h\020)\020\001b\0308\004KbR+\005OtR*\024Od\b*O[`\0318\024Kt".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "h\020)\020\001b\0308\004KbR+\005OtR)\022Kc\0307\003K?\034/\001G|\034;\fK0".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "h\020)\020\001b\0308\004KbR+\005OtR)\022Kc\0307\003K?\b7\001Xq\0245\001L|\030y".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label1809;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\023\013\005Bq\004\013\005_e\030*\024".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label1901;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\023\035\t\\d\004v\024Or\021<@]y\007<Z".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label1993;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "h\020)\020\001b\0308\004KbR+\005OtR:\fGu\023-?M\023?\tI".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label2085;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "0\030!\020\016t\034-\005\016".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label2177;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "h\020)\020\001b\0308\004KbR+\005OtR8\003M\b7\024\016d\004)\005\016".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label2269;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "h\020)\020\001b\0308\004KbR+\005OtR*\024\\u\0344OKb\0176\022".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label2361;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "h\020)\020\001b\0308\004KbR+\005OtR*\024\\u\0344OKb\0176\022\016".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label2453;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "h\020)\020\001b\0308\004KbR+\005OtR*\024Od\b*OKb\0176\022\016".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label2545;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "h\020)\020\001b\0308\004KbR+\005OtR;\fAs\0265\t]dR8\004J0".toCharArray();
        int i40 = arrayOfChar12.length;
        i41 = 0;
        if (i40 > i41)
          break label2637;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "h\020)\020\001b\0308\004KbR+\005OtR5\001]d\016<\005@?\030+\022Ab]".toCharArray();
        int i44 = arrayOfChar13.length;
        i45 = 0;
        if (i44 > i45)
          break label2729;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "0\t \020K*".toCharArray();
        int i48 = arrayOfChar14.length;
        i49 = 0;
        if (i48 > i49)
          break label2821;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "0\0258\023qt\034-\001\024".toCharArray();
        int i52 = arrayOfChar15.length;
        i53 = 0;
        if (i52 > i53)
          break label2913;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "0\024=Z".toCharArray();
        int i56 = arrayOfChar16.length;
        i57 = 0;
        if (i56 > i57)
          break label3005;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "h\020)\020\001b\0308\004KbR+\005OtR)\022Av\0245\005^x\022-\017\\u\036<\tXu\031y".toCharArray();
        int i60 = arrayOfChar17.length;
        i61 = 0;
        if (i60 > i61)
          break label3097;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "h\020)\020\001b\0308\004KbR+\005OtR)\022Av\0245\005^x\022-\017Gt]".toCharArray();
        int i64 = arrayOfChar18.length;
        i65 = 0;
        if (i64 > i65)
          break label3189;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "h\020)\020\001b\0308\004KbR+\005OtR:\fGu\023-?M\023?\tIO\016<\024".toCharArray();
        int i68 = arrayOfChar19.length;
        i69 = 0;
        if (i68 > i69)
          break label3281;
        arrayOfString[18] = new String(arrayOfChar19).intern();
        arrayOfChar20 = "cS,\023".toCharArray();
        int i72 = arrayOfChar20.length;
        i73 = 0;
        if (i72 > i73)
          break label3373;
        arrayOfString[19] = new String(arrayOfChar20).intern();
        arrayOfChar21 = "h\020)\020\001b\0308\004KbR+\005OtR)\022Av\0245\005^x\022-\017B\016-@".toCharArray();
        int i76 = arrayOfChar21.length;
        i77 = 0;
        if (i76 > i77)
          break label3465;
        arrayOfString[20] = new String(arrayOfChar21).intern();
        arrayOfChar22 = "h\020)\020\001b\0308\004KbR+\005OtR6\006H|\0247\005\003s\0224\020Bu\t<@M\b7\024\023".toCharArray();
        int i80 = arrayOfChar22.length;
        i81 = 0;
        if (i80 > i81)
          break label3557;
        arrayOfString[21] = new String(arrayOfChar22).intern();
        arrayOfChar23 = "h\020)\020\001b\0308\004KbR+\005OtR)\t@w\"+\005]`\0227\023K".toCharArray();
        int i84 = arrayOfChar23.length;
        i85 = 0;
        if (i84 > i85)
          break label3649;
        arrayOfString[22] = new String(arrayOfChar23).intern();
        arrayOfChar24 = "h\020)\020\001b\0308\004KbR+\005OtR5\001]d\016<\005@0".toCharArray();
        int i88 = arrayOfChar24.length;
        i89 = 0;
        if (i88 > i89)
          break label3741;
        arrayOfString[23] = new String(arrayOfChar24).intern();
        arrayOfChar25 = "0\0366\004K*".toCharArray();
        int i92 = arrayOfChar25.length;
        i93 = 0;
        if (i92 > i93)
          break label3833;
        arrayOfString[24] = new String(arrayOfChar25).intern();
        arrayOfChar26 = "h\020)\020\001b\0308\004KbR+\005OtR)\022Av\0245\005^x\022-\017Kb\0176\022\016".toCharArray();
        int i96 = arrayOfChar26.length;
        i97 = 0;
        if (i96 > i97)
          break label3925;
        arrayOfString[25] = new String(arrayOfChar26).intern();
        arrayOfChar27 = "0\0270\004qs\0258\016Iu\031\006\002W*".toCharArray();
        int i100 = arrayOfChar27.length;
        i101 = 0;
        if (i100 > i101)
          break label4017;
        arrayOfString[26] = new String(arrayOfChar27).intern();
        arrayOfChar28 = "h\020)\020\001b\0308\004KbR+\005OtR)\022Av\0245\005^x\022-\017Mx\0347\007K0".toCharArray();
        int i104 = arrayOfChar28.length;
        i105 = 0;
        if (i104 > i105)
          break label4109;
        arrayOfString[27] = new String(arrayOfChar28).intern();
        arrayOfChar29 = "0\r1\017Z\"0\004qc\t+\t@wG".toCharArray();
        int i108 = arrayOfChar29.length;
        i109 = 0;
        if (i108 > i109)
          break label4201;
        arrayOfString[28] = new String(arrayOfChar29).intern();
        arrayOfChar30 = "h\020)\020\001b\0308\004KbR+\005OtR*\024\\u\0344OJu\037,\007\016x\022*\024\023".toCharArray();
        int i112 = arrayOfChar30.length;
        i113 = 0;
        if (i112 > i113)
          break label4293;
        arrayOfString[29] = new String(arrayOfChar30).intern();
        arrayOfChar31 = "0\0160\032K-".toCharArray();
        int i116 = arrayOfChar31.length;
        i117 = 0;
        if (i116 > i117)
          break label4385;
        arrayOfString[30] = new String(arrayOfChar31).intern();
        arrayOfChar32 = "0\017<\003A~\023<\003Z-".toCharArray();
        int i120 = arrayOfChar32.length;
        i121 = 0;
        if (i120 > i121)
          break label4477;
        arrayOfString[31] = new String(arrayOfChar32).intern();
        arrayOfChar33 = "h\020)\020\001b\0308\004KbR+\005OtR:\017C`\022*\005\001d\004)\t@w]".toCharArray();
        int i124 = arrayOfChar33.length;
        i125 = 0;
        if (i124 > i125)
          break label4569;
        arrayOfString[32] = new String(arrayOfChar33).intern();
        arrayOfChar34 = "h\020)\020\001b\0308\004KbR+\005OtR:\017C`\022*\005\001`\034,\023Kt]".toCharArray();
        int i128 = arrayOfChar34.length;
        i129 = 0;
        if (i128 > i129)
          break label4661;
        arrayOfString[33] = new String(arrayOfChar34).intern();
        arrayOfChar35 = "h\020)\020\001b\0308\004KbR+\005OtR4\005]c\034>\005\001r\022,\016Mu]".toCharArray();
        int i132 = arrayOfChar35.length;
        i133 = 0;
        if (i132 > i133)
          break label4753;
        arrayOfString[34] = new String(arrayOfChar35).intern();
        arrayOfChar36 = "h\020)\020\001b\0308\004KbR+\005OtR4\005]c\034>\005\001b\030:\005G`\tv\004Kf\024:\005\016".toCharArray();
        int i136 = arrayOfChar36.length;
        i137 = 0;
        if (i136 > i137)
          break label4845;
        arrayOfString[35] = new String(arrayOfChar36).intern();
        arrayOfChar37 = "h\020)\020\001b\0308\004KbR+\005OtR4\005]c\034>\005\001b\030:\005G`\tv\025@{\0236\027@0".toCharArray();
        int i140 = arrayOfChar37.length;
        i141 = 0;
        if (i140 > i141)
          break label4937;
        arrayOfString[36] = new String(arrayOfChar37).intern();
        arrayOfChar38 = "h\020)\020\001b\0308\004KbR+\005OtR4\005]c\034>\005\001b\030:\005G`\tv\023Kb\013<\022\016".toCharArray();
        int i144 = arrayOfChar38.length;
        i145 = 0;
        if (i144 > i145)
          break label5029;
        arrayOfString[37] = new String(arrayOfChar38).intern();
        arrayOfChar39 = "h\020)\020\001b\0308\004KbR+\005OtR*\024Od\b*\025^t\034-\005H\0174\005".toCharArray();
        int i148 = arrayOfChar39.length;
        i149 = 0;
        if (i148 > i149)
          break label5121;
        arrayOfString[38] = new String(arrayOfChar39).intern();
        arrayOfChar40 = "h\020)\020\001b\0308\004KbR+\005OtR4\005]c\034>\005\016".toCharArray();
        int i152 = arrayOfChar40.length;
        i153 = 0;
        if (i152 > i153)
          break label5213;
        arrayOfString[39] = new String(arrayOfChar40).intern();
        arrayOfChar41 = "h\020)\020\001b\0308\004KbR+\005OtR+\005C\013<\001Ms\022,\016Z".toCharArray();
        int i156 = arrayOfChar41.length;
        i157 = 0;
        if (i156 > i157)
          break label5305;
        arrayOfString[40] = new String(arrayOfChar41).intern();
        arrayOfChar42 = "h\020)\020\001b\0308\004KbR+\005OtR)\t@w".toCharArray();
        int i160 = arrayOfChar42.length;
        i161 = 0;
        if (i160 > i161)
          break label5397;
        arrayOfString[41] = new String(arrayOfChar42).intern();
        arrayOfChar43 = "h\020)\020\001b\0308\004KbR+\005OtR;\fAs\0265\t]dR:\fKq\017".toCharArray();
        int i164 = arrayOfChar43.length;
        i165 = 0;
        if (i164 > i165)
          break label5489;
        arrayOfString[42] = new String(arrayOfChar43).intern();
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
        m = 46;
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
        m = 16;
        continue;
        m = 125;
        continue;
        m = 89;
        continue;
        m = 96;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 46;
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
      i3 = 16;
      continue;
      i3 = 125;
      continue;
      i3 = 89;
      continue;
      i3 = 96;
    }
    label1809: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 46;
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
      i7 = 16;
      continue;
      i7 = 125;
      continue;
      i7 = 89;
      continue;
      i7 = 96;
    }
    label1901: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 46;
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
      i11 = 16;
      continue;
      i11 = 125;
      continue;
      i11 = 89;
      continue;
      i11 = 96;
    }
    label1993: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 46;
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
      i15 = 16;
      continue;
      i15 = 125;
      continue;
      i15 = 89;
      continue;
      i15 = 96;
    }
    label2085: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 46;
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
      i19 = 16;
      continue;
      i19 = 125;
      continue;
      i19 = 89;
      continue;
      i19 = 96;
    }
    label2177: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 46;
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
      i23 = 16;
      continue;
      i23 = 125;
      continue;
      i23 = 89;
      continue;
      i23 = 96;
    }
    label2269: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 46;
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
      i27 = 16;
      continue;
      i27 = 125;
      continue;
      i27 = 89;
      continue;
      i27 = 96;
    }
    label2361: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 46;
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
      i31 = 16;
      continue;
      i31 = 125;
      continue;
      i31 = 89;
      continue;
      i31 = 96;
    }
    label2453: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 46;
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
      i35 = 16;
      continue;
      i35 = 125;
      continue;
      i35 = 89;
      continue;
      i35 = 96;
    }
    label2545: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 46;
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
      i39 = 16;
      continue;
      i39 = 125;
      continue;
      i39 = 89;
      continue;
      i39 = 96;
    }
    label2637: int i42 = arrayOfChar12[i41];
    int i43;
    switch (i41 % 5)
    {
    default:
      i43 = 46;
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
      i43 = 16;
      continue;
      i43 = 125;
      continue;
      i43 = 89;
      continue;
      i43 = 96;
    }
    label2729: int i46 = arrayOfChar13[i45];
    int i47;
    switch (i45 % 5)
    {
    default:
      i47 = 46;
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
      i47 = 16;
      continue;
      i47 = 125;
      continue;
      i47 = 89;
      continue;
      i47 = 96;
    }
    label2821: int i50 = arrayOfChar14[i49];
    int i51;
    switch (i49 % 5)
    {
    default:
      i51 = 46;
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
      i51 = 16;
      continue;
      i51 = 125;
      continue;
      i51 = 89;
      continue;
      i51 = 96;
    }
    label2913: int i54 = arrayOfChar15[i53];
    int i55;
    switch (i53 % 5)
    {
    default:
      i55 = 46;
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
      i55 = 16;
      continue;
      i55 = 125;
      continue;
      i55 = 89;
      continue;
      i55 = 96;
    }
    label3005: int i58 = arrayOfChar16[i57];
    int i59;
    switch (i57 % 5)
    {
    default:
      i59 = 46;
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
      i59 = 16;
      continue;
      i59 = 125;
      continue;
      i59 = 89;
      continue;
      i59 = 96;
    }
    label3097: int i62 = arrayOfChar17[i61];
    int i63;
    switch (i61 % 5)
    {
    default:
      i63 = 46;
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
      i63 = 16;
      continue;
      i63 = 125;
      continue;
      i63 = 89;
      continue;
      i63 = 96;
    }
    label3189: int i66 = arrayOfChar18[i65];
    int i67;
    switch (i65 % 5)
    {
    default:
      i67 = 46;
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
      i67 = 16;
      continue;
      i67 = 125;
      continue;
      i67 = 89;
      continue;
      i67 = 96;
    }
    label3281: int i70 = arrayOfChar19[i69];
    int i71;
    switch (i69 % 5)
    {
    default:
      i71 = 46;
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
      i71 = 16;
      continue;
      i71 = 125;
      continue;
      i71 = 89;
      continue;
      i71 = 96;
    }
    label3373: int i74 = arrayOfChar20[i73];
    int i75;
    switch (i73 % 5)
    {
    default:
      i75 = 46;
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
      i75 = 16;
      continue;
      i75 = 125;
      continue;
      i75 = 89;
      continue;
      i75 = 96;
    }
    label3465: int i78 = arrayOfChar21[i77];
    int i79;
    switch (i77 % 5)
    {
    default:
      i79 = 46;
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
      i79 = 16;
      continue;
      i79 = 125;
      continue;
      i79 = 89;
      continue;
      i79 = 96;
    }
    label3557: int i82 = arrayOfChar22[i81];
    int i83;
    switch (i81 % 5)
    {
    default:
      i83 = 46;
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
      i83 = 16;
      continue;
      i83 = 125;
      continue;
      i83 = 89;
      continue;
      i83 = 96;
    }
    label3649: int i86 = arrayOfChar23[i85];
    int i87;
    switch (i85 % 5)
    {
    default:
      i87 = 46;
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
      i87 = 16;
      continue;
      i87 = 125;
      continue;
      i87 = 89;
      continue;
      i87 = 96;
    }
    label3741: int i90 = arrayOfChar24[i89];
    int i91;
    switch (i89 % 5)
    {
    default:
      i91 = 46;
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
      i91 = 16;
      continue;
      i91 = 125;
      continue;
      i91 = 89;
      continue;
      i91 = 96;
    }
    label3833: int i94 = arrayOfChar25[i93];
    int i95;
    switch (i93 % 5)
    {
    default:
      i95 = 46;
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
      i95 = 16;
      continue;
      i95 = 125;
      continue;
      i95 = 89;
      continue;
      i95 = 96;
    }
    label3925: int i98 = arrayOfChar26[i97];
    int i99;
    switch (i97 % 5)
    {
    default:
      i99 = 46;
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
      i99 = 16;
      continue;
      i99 = 125;
      continue;
      i99 = 89;
      continue;
      i99 = 96;
    }
    label4017: int i102 = arrayOfChar27[i101];
    int i103;
    switch (i101 % 5)
    {
    default:
      i103 = 46;
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
      i103 = 16;
      continue;
      i103 = 125;
      continue;
      i103 = 89;
      continue;
      i103 = 96;
    }
    label4109: int i106 = arrayOfChar28[i105];
    int i107;
    switch (i105 % 5)
    {
    default:
      i107 = 46;
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
      i107 = 16;
      continue;
      i107 = 125;
      continue;
      i107 = 89;
      continue;
      i107 = 96;
    }
    label4201: int i110 = arrayOfChar29[i109];
    int i111;
    switch (i109 % 5)
    {
    default:
      i111 = 46;
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
      i111 = 16;
      continue;
      i111 = 125;
      continue;
      i111 = 89;
      continue;
      i111 = 96;
    }
    label4293: int i114 = arrayOfChar30[i113];
    int i115;
    switch (i113 % 5)
    {
    default:
      i115 = 46;
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
      i115 = 16;
      continue;
      i115 = 125;
      continue;
      i115 = 89;
      continue;
      i115 = 96;
    }
    label4385: int i118 = arrayOfChar31[i117];
    int i119;
    switch (i117 % 5)
    {
    default:
      i119 = 46;
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
      i119 = 16;
      continue;
      i119 = 125;
      continue;
      i119 = 89;
      continue;
      i119 = 96;
    }
    label4477: int i122 = arrayOfChar32[i121];
    int i123;
    switch (i121 % 5)
    {
    default:
      i123 = 46;
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
      i123 = 16;
      continue;
      i123 = 125;
      continue;
      i123 = 89;
      continue;
      i123 = 96;
    }
    label4569: int i126 = arrayOfChar33[i125];
    int i127;
    switch (i125 % 5)
    {
    default:
      i127 = 46;
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
      i127 = 16;
      continue;
      i127 = 125;
      continue;
      i127 = 89;
      continue;
      i127 = 96;
    }
    label4661: int i130 = arrayOfChar34[i129];
    int i131;
    switch (i129 % 5)
    {
    default:
      i131 = 46;
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
      i131 = 16;
      continue;
      i131 = 125;
      continue;
      i131 = 89;
      continue;
      i131 = 96;
    }
    label4753: int i134 = arrayOfChar35[i133];
    int i135;
    switch (i133 % 5)
    {
    default:
      i135 = 46;
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
      i135 = 16;
      continue;
      i135 = 125;
      continue;
      i135 = 89;
      continue;
      i135 = 96;
    }
    label4845: int i138 = arrayOfChar36[i137];
    int i139;
    switch (i137 % 5)
    {
    default:
      i139 = 46;
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
      i139 = 16;
      continue;
      i139 = 125;
      continue;
      i139 = 89;
      continue;
      i139 = 96;
    }
    label4937: int i142 = arrayOfChar37[i141];
    int i143;
    switch (i141 % 5)
    {
    default:
      i143 = 46;
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
      i143 = 16;
      continue;
      i143 = 125;
      continue;
      i143 = 89;
      continue;
      i143 = 96;
    }
    label5029: int i146 = arrayOfChar38[i145];
    int i147;
    switch (i145 % 5)
    {
    default:
      i147 = 46;
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
      i147 = 16;
      continue;
      i147 = 125;
      continue;
      i147 = 89;
      continue;
      i147 = 96;
    }
    label5121: int i150 = arrayOfChar39[i149];
    int i151;
    switch (i149 % 5)
    {
    default:
      i151 = 46;
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
      i151 = 16;
      continue;
      i151 = 125;
      continue;
      i151 = 89;
      continue;
      i151 = 96;
    }
    label5213: int i154 = arrayOfChar40[i153];
    int i155;
    switch (i153 % 5)
    {
    default:
      i155 = 46;
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
      i155 = 16;
      continue;
      i155 = 125;
      continue;
      i155 = 89;
      continue;
      i155 = 96;
    }
    label5305: int i158 = arrayOfChar41[i157];
    int i159;
    switch (i157 % 5)
    {
    default:
      i159 = 46;
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
      i159 = 16;
      continue;
      i159 = 125;
      continue;
      i159 = 89;
      continue;
      i159 = 96;
    }
    label5397: int i162 = arrayOfChar42[i161];
    int i163;
    switch (i161 % 5)
    {
    default:
      i163 = 46;
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
      i163 = 16;
      continue;
      i163 = 125;
      continue;
      i163 = 89;
      continue;
      i163 = 96;
    }
    label5489: int i166 = arrayOfChar43[i165];
    int i167;
    switch (i165 % 5)
    {
    default:
      i167 = 46;
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
      i167 = 16;
      continue;
      i167 = 125;
      continue;
      i167 = 89;
      continue;
      i167 = 96;
    }
  }

  public q(Messenger paramMessenger)
  {
    this.a = paramMessenger;
  }

  static Messenger a(q paramq)
  {
    return paramq.a;
  }

  public void a()
  {
    g5.b(z[22]);
    e.c(this.a);
  }

  public void a(int paramInt)
  {
    g5.b(z[21] + paramInt);
    e.a(this.a, s.a(paramInt));
  }

  public void a(int paramInt, long paramLong)
  {
    g5.b(z[7] + paramInt + z[6] + paramLong);
    e.a(this.a, s.a(paramInt, paramLong));
  }

  public void a(sz paramsz)
    throws IOException
  {
    long l = System.currentTimeMillis() - paramsz.i;
    g5.b(z[39] + paramsz.b.a + " " + paramsz.b.c + " " + l + " " + paramsz.v);
    e.a(this.a, s.a(paramsz));
  }

  public void a(uz paramuz)
  {
    g5.b(z[0]);
    e.a(this.a, s.c());
  }

  public void a(uz paramuz, int paramInt)
  {
    int i = MessageService.C;
    switch (paramInt)
    {
    case 6:
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 7:
    }
    while (true)
    {
      g5.d(z[36] + paramInt + " " + paramuz.a + " " + paramuz.c);
      do
      {
        do
        {
          do
          {
            e.a(this.a, s.a(paramuz, paramInt));
            return;
            g5.b(z[37] + paramuz.a + " " + paramuz.c);
          }
          while (i == 0);
          g5.b(z[35] + paramuz.a + " " + paramuz.c);
        }
        while (i == 0);
        g5.b(z[34] + paramuz.a + " " + paramuz.c);
      }
      while (i == 0);
    }
  }

  public void a(String paramString)
    throws IOException
  {
    g5.b(z[41]);
    e.a(this.a, s.a(paramString));
  }

  public void a(String paramString, int paramInt)
  {
    g5.b(z[25] + paramString + z[24] + paramInt);
    e.a(this.a, s.b(paramString, paramInt));
  }

  public void a(String paramString1, int paramInt, String paramString2)
  {
    g5.b(z[23] + paramString1 + " " + paramInt + "s");
    e.a(this.a, s.a(paramString1, paramInt, paramString2));
  }

  public void a(String paramString1, String paramString2)
  {
    g5.b(z[18]);
  }

  public void a(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    g5.d(z[3]);
  }

  public void a(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    g5.b(z[27] + paramString2 + z[26] + paramString3 + z[28] + paramString4);
    int j;
    if (paramString4 == null)
    {
      j = -1;
      e.a(this.a, s.a(paramString1, paramString2, paramString3, j, paramInt));
    }
    while (true)
      while (true)
      {
        return;
        try
        {
          int i = Integer.parseInt(paramString4);
          j = i;
        }
        catch (NumberFormatException localNumberFormatException)
        {
        }
      }
  }

  public void a(String paramString1, String paramString2, byte[] paramArrayOfByte, String paramString3)
  {
    StringBuilder localStringBuilder = new StringBuilder().append(z[16]).append(paramString1).append(z[15]).append(paramString2).append(z[13]).append(paramString3).append(z[14]);
    boolean bool;
    int j;
    if (paramArrayOfByte != null)
    {
      bool = true;
      g5.b(bool);
      if (paramString2 != null)
        break label109;
      j = -1;
      e.a(this.a, s.a(paramString1, j, paramArrayOfByte, paramString3));
    }
    while (true)
      while (true)
      {
        return;
        bool = false;
        break;
        try
        {
          label109: int i = Integer.parseInt(paramString2);
          j = i;
        }
        catch (NumberFormatException localNumberFormatException)
        {
        }
      }
  }

  public void a(String paramString, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      g5.b(z[1] + paramString);
      if (MessageService.C == 0);
    }
    else
    {
      g5.b(z[2] + paramString);
    }
    e.a(this.a, s.a(paramString, paramBoolean));
  }

  public void a(String paramString, boolean paramBoolean, int paramInt)
  {
    g5.b(z[29] + paramString + z[31] + paramBoolean + z[30] + paramInt);
  }

  public void a(Hashtable paramHashtable)
  {
    g5.d(z[4] + paramHashtable.size());
    e.a(this.a, s.a(paramHashtable));
  }

  public void a(c1[] paramArrayOfc1)
  {
    if ((paramArrayOfc1 != null) && (paramArrayOfc1.length > 0))
    {
      g5.b(z[9] + paramArrayOfc1[0].a + " " + paramArrayOfc1[0].d);
      if (MessageService.C == 0);
    }
    else
    {
      g5.b(z[8]);
    }
  }

  public void b()
  {
    g5.b(z[42]);
    e.a(this.a, s.a());
  }

  public void b(sz paramsz)
  {
    g5.b(z[38]);
    e.a(this.a, s.a(paramsz));
  }

  public void b(uz paramuz, int paramInt)
  {
    if (paramuz.a.endsWith(z[19]))
    {
      e.a(this.a, s.b(paramuz, paramInt));
      if (MessageService.C == 0);
    }
    else
    {
      e.a(this.a, s.c(paramuz, paramInt));
    }
  }

  public void b(String paramString)
  {
    g5.b(z[5]);
    e.a(this.a, s.b(paramString));
  }

  public void b(String paramString1, String paramString2)
  {
    g5.b(z[17] + paramString1 + z[15] + paramString2);
    int j;
    if (paramString2 == null)
    {
      j = -1;
      e.a(this.a, s.a(paramString1, j));
    }
    while (true)
      while (true)
      {
        return;
        try
        {
          int i = Integer.parseInt(paramString2);
          j = i;
        }
        catch (NumberFormatException localNumberFormatException)
        {
        }
      }
  }

  public void b(String paramString, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      g5.b(z[32] + paramString);
      if (MessageService.C == 0);
    }
    else
    {
      g5.b(z[33] + paramString);
    }
    e.a(this.a, s.b(paramString, paramBoolean));
  }

  public void c()
  {
    g5.b(z[40]);
    e.a(this.a, s.b());
  }

  public void c(uz paramuz, int paramInt)
  {
    g5.b(z[10] + paramInt);
    e.a(this.a, s.b(paramuz, paramInt));
  }

  public void c(String paramString)
  {
    g5.b(z[12] + paramString);
    e.a(this.a, s.c(paramString));
  }

  public void c(String paramString1, String paramString2)
  {
    g5.b(z[20] + paramString2);
    e.a(this.a, s.a(paramString1, paramString2));
  }

  public void d(String paramString)
  {
    g5.b(z[11] + paramString);
    e.a(this.a, s.d(paramString));
  }
}