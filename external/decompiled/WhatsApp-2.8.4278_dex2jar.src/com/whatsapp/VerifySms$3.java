package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;

class VerifySms$3 extends BroadcastReceiver
{
  private static final String[] z;
  final VerifySms a;

  static
  {
    String[] arrayOfString = new String[27];
    char[] arrayOfChar1 = "\rzVk\017\002lIqF\tzGg��\rz@/\033\036|Ak\037\036m\013o\f\blEe\fVqQn\005".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\rzVk\017\002lIqF\034zPM\033\022xMl\b\017vJe(\037{Vg\032\b?".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "P*\0263".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label1200;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\rzVk\017\002lIqF\034zPQ\f\tiMa\f8zJv\f\t^@f\033\036lW\"".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label1288;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\rzVk\017\002lIqF\tzGg��\rz@/\033\036|Ak\037\036m\013f\b\017~\013k\007\017zJv".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label1376;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "\rzVk\017\002lIq".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label1464;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "[mAa\f\022iAfT".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label1552;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "\rzVk\017\002lIqF\034zPR\032\036j@m:\016}Ng\n\017?".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1640;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "\rzVk\017\002lIqF\tzGg��\rz@/\033\036|Ak\037\036m\013r\r\016l\tn\f\025xPjF".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1728;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "\rzVk\017\002lIqF\tzGg��\rz@/\033\036|Ak\037\036m\004".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1816;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "\013{Qq".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label1904;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "\rzVk\017\002lIqF\tzGg��\rz@/\033\036|Ak\037\036m\013`\034\025{HgD\025jHn".toCharArray();
        int i40 = arrayOfChar12.length;
        i41 = 0;
        if (i40 > i41)
          break label1992;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "\rzVk\017\002lIqF\036rEk\005=mKoI".toCharArray();
        int i44 = arrayOfChar13.length;
        i45 = 0;
        if (i44 > i45)
          break label2080;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "P*\026".toCharArray();
        int i48 = arrayOfChar14.length;
        i49 = 0;
        if (i48 > i49)
          break label2168;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "\rzVk\017\002lIqF\tzGg��\rz@/\033\036|Ak\037\036m\013f\f\bkVm\020\036{".toCharArray();
        int i52 = arrayOfChar15.length;
        i53 = 0;
        if (i52 > i53)
          break label2256;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "\rzVk\017\002lIqF\036rEk\0059p@{I".toCharArray();
        int i56 = arrayOfChar16.length;
        i57 = 0;
        if (i56 > i57)
          break label2344;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "\rzVk\017\002lIqF\tzGg��\rz@/\033\036|Ak\037\036m\013o��\brEv\n\0230Wj\006\tk\004".toCharArray();
        int i60 = arrayOfChar17.length;
        i61 = 0;
        if (i60 > i61)
          break label2432;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "\rzVk\017\002lIqF\037vWr\005\032fig\032\b~Cg+\024{]\"".toCharArray();
        int i64 = arrayOfChar18.length;
        i65 = 0;
        if (i64 > i65)
          break label2520;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "\rzVk\017\002lIqF\034zPO\f\blEe\f9p@{I".toCharArray();
        int i68 = arrayOfChar19.length;
        i69 = 0;
        if (i68 > i69)
          break label2608;
        arrayOfString[18] = new String(arrayOfChar19).intern();
        arrayOfChar20 = "\rzVk\017\002lIqF\tzGg��\rz@/\033\036|Ak\037\036m\013o��\blMl\016V|Lc\005\027zJe\f".toCharArray();
        int i72 = arrayOfChar20.length;
        i73 = 0;
        if (i72 > i73)
          break label2696;
        arrayOfString[19] = new String(arrayOfChar20).intern();
        arrayOfChar21 = "?zWv��\025p\004k\007\030pVp\f\030kK".toCharArray();
        int i76 = arrayOfChar21.length;
        i77 = 0;
        if (i76 > i77)
          break label2784;
        arrayOfString[20] = new String(arrayOfChar21).intern();
        arrayOfChar22 = "\rzVk\017\002lIqF\034zPQ\f\tiMa\f8zJv\f\tKMo\f\bkEo\031[".toCharArray();
        int i80 = arrayOfChar22.length;
        i81 = 0;
        if (i80 > i81)
          break label2872;
        arrayOfString[21] = new String(arrayOfChar22).intern();
        arrayOfChar23 = "\rzVk\017\002lIqF\037vWr\005\032fkp��\034vJc\035\022qCC\r\037mAq\032[".toCharArray();
        int i84 = arrayOfChar23.length;
        i85 = 0;
        if (i84 > i85)
          break label2960;
        arrayOfString[22] = new String(arrayOfChar23).intern();
        arrayOfChar24 = "\rzVk\017\002lIqF\tzGg��\rz@/\033\036|Ak\037\036m\013t\f\tvBk\f\037".toCharArray();
        int i88 = arrayOfChar24.length;
        i89 = 0;
        if (i88 > i89)
          break label3048;
        arrayOfString[23] = new String(arrayOfChar24).intern();
        arrayOfChar25 = "\rzVk\017\002lIqF\024jP/\006\0352Ig\004\024m]\"".toCharArray();
        int i92 = arrayOfChar25.length;
        i93 = 0;
        if (i92 > i93)
          break label3136;
        arrayOfString[24] = new String(arrayOfChar25).intern();
        arrayOfChar26 = "\bzHdD\bzJfD\026vWo\b\017|L/\031\023pJg".toCharArray();
        int i96 = arrayOfChar26.length;
        i97 = 0;
        if (i96 > i97)
          break label3224;
        arrayOfString[25] = new String(arrayOfChar26).intern();
        arrayOfChar27 = "\rzVk\017\002lIqF\tzGg��\rz@/\033\036|Ak\037\036m\013o��\brEv\n\0230Rc\005\016z\004l\034\026}ApT".toCharArray();
        int i100 = arrayOfChar27.length;
        i101 = 0;
        if (i100 > i101)
          break label3312;
        arrayOfString[26] = new String(arrayOfChar27).intern();
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
        m = 105;
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
        m = 123;
        continue;
        m = 31;
        continue;
        m = 36;
        continue;
        m = 2;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 105;
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
      i3 = 123;
      continue;
      i3 = 31;
      continue;
      i3 = 36;
      continue;
      i3 = 2;
    }
    label1200: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 105;
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
      i7 = 123;
      continue;
      i7 = 31;
      continue;
      i7 = 36;
      continue;
      i7 = 2;
    }
    label1288: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 105;
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
      i11 = 123;
      continue;
      i11 = 31;
      continue;
      i11 = 36;
      continue;
      i11 = 2;
    }
    label1376: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 105;
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
      i15 = 123;
      continue;
      i15 = 31;
      continue;
      i15 = 36;
      continue;
      i15 = 2;
    }
    label1464: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 105;
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
      i19 = 123;
      continue;
      i19 = 31;
      continue;
      i19 = 36;
      continue;
      i19 = 2;
    }
    label1552: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 105;
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
      i23 = 123;
      continue;
      i23 = 31;
      continue;
      i23 = 36;
      continue;
      i23 = 2;
    }
    label1640: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 105;
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
      i27 = 123;
      continue;
      i27 = 31;
      continue;
      i27 = 36;
      continue;
      i27 = 2;
    }
    label1728: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 105;
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
      i31 = 123;
      continue;
      i31 = 31;
      continue;
      i31 = 36;
      continue;
      i31 = 2;
    }
    label1816: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 105;
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
      i35 = 123;
      continue;
      i35 = 31;
      continue;
      i35 = 36;
      continue;
      i35 = 2;
    }
    label1904: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 105;
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
      i39 = 123;
      continue;
      i39 = 31;
      continue;
      i39 = 36;
      continue;
      i39 = 2;
    }
    label1992: int i42 = arrayOfChar12[i41];
    int i43;
    switch (i41 % 5)
    {
    default:
      i43 = 105;
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
      i43 = 123;
      continue;
      i43 = 31;
      continue;
      i43 = 36;
      continue;
      i43 = 2;
    }
    label2080: int i46 = arrayOfChar13[i45];
    int i47;
    switch (i45 % 5)
    {
    default:
      i47 = 105;
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
      i47 = 123;
      continue;
      i47 = 31;
      continue;
      i47 = 36;
      continue;
      i47 = 2;
    }
    label2168: int i50 = arrayOfChar14[i49];
    int i51;
    switch (i49 % 5)
    {
    default:
      i51 = 105;
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
      i51 = 123;
      continue;
      i51 = 31;
      continue;
      i51 = 36;
      continue;
      i51 = 2;
    }
    label2256: int i54 = arrayOfChar15[i53];
    int i55;
    switch (i53 % 5)
    {
    default:
      i55 = 105;
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
      i55 = 123;
      continue;
      i55 = 31;
      continue;
      i55 = 36;
      continue;
      i55 = 2;
    }
    label2344: int i58 = arrayOfChar16[i57];
    int i59;
    switch (i57 % 5)
    {
    default:
      i59 = 105;
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
      i59 = 123;
      continue;
      i59 = 31;
      continue;
      i59 = 36;
      continue;
      i59 = 2;
    }
    label2432: int i62 = arrayOfChar17[i61];
    int i63;
    switch (i61 % 5)
    {
    default:
      i63 = 105;
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
      i63 = 123;
      continue;
      i63 = 31;
      continue;
      i63 = 36;
      continue;
      i63 = 2;
    }
    label2520: int i66 = arrayOfChar18[i65];
    int i67;
    switch (i65 % 5)
    {
    default:
      i67 = 105;
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
      i67 = 123;
      continue;
      i67 = 31;
      continue;
      i67 = 36;
      continue;
      i67 = 2;
    }
    label2608: int i70 = arrayOfChar19[i69];
    int i71;
    switch (i69 % 5)
    {
    default:
      i71 = 105;
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
      i71 = 123;
      continue;
      i71 = 31;
      continue;
      i71 = 36;
      continue;
      i71 = 2;
    }
    label2696: int i74 = arrayOfChar20[i73];
    int i75;
    switch (i73 % 5)
    {
    default:
      i75 = 105;
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
      i75 = 123;
      continue;
      i75 = 31;
      continue;
      i75 = 36;
      continue;
      i75 = 2;
    }
    label2784: int i78 = arrayOfChar21[i77];
    int i79;
    switch (i77 % 5)
    {
    default:
      i79 = 105;
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
      i79 = 123;
      continue;
      i79 = 31;
      continue;
      i79 = 36;
      continue;
      i79 = 2;
    }
    label2872: int i82 = arrayOfChar22[i81];
    int i83;
    switch (i81 % 5)
    {
    default:
      i83 = 105;
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
      i83 = 123;
      continue;
      i83 = 31;
      continue;
      i83 = 36;
      continue;
      i83 = 2;
    }
    label2960: int i86 = arrayOfChar23[i85];
    int i87;
    switch (i85 % 5)
    {
    default:
      i87 = 105;
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
      i87 = 123;
      continue;
      i87 = 31;
      continue;
      i87 = 36;
      continue;
      i87 = 2;
    }
    label3048: int i90 = arrayOfChar24[i89];
    int i91;
    switch (i89 % 5)
    {
    default:
      i91 = 105;
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
      i91 = 123;
      continue;
      i91 = 31;
      continue;
      i91 = 36;
      continue;
      i91 = 2;
    }
    label3136: int i94 = arrayOfChar25[i93];
    int i95;
    switch (i93 % 5)
    {
    default:
      i95 = 105;
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
      i95 = 123;
      continue;
      i95 = 31;
      continue;
      i95 = 36;
      continue;
      i95 = 2;
    }
    label3224: int i98 = arrayOfChar26[i97];
    int i99;
    switch (i97 % 5)
    {
    default:
      i99 = 105;
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
      i99 = 123;
      continue;
      i99 = 31;
      continue;
      i99 = 36;
      continue;
      i99 = 2;
    }
    label3312: int i102 = arrayOfChar27[i101];
    int i103;
    switch (i101 % 5)
    {
    default:
      i103 = 105;
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
      i103 = 123;
      continue;
      i103 = 31;
      continue;
      i103 = 36;
      continue;
      i103 = 2;
    }
  }

  VerifySms$3(VerifySms paramVerifySms)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    boolean bool = DialogToastListActivity.f;
    g5.b(z[4]);
    Object[] arrayOfObject;
    String str1;
    String str2;
    Object localObject;
    int i;
    if (!this.a.V)
    {
      Bundle localBundle = paramIntent.getExtras();
      if (localBundle != null)
      {
        arrayOfObject = (Object[])localBundle.get(z[10]);
        g5.b(z[8] + arrayOfObject.length);
        str1 = "";
        str2 = "";
        localObject = null;
        i = 0;
      }
    }
    while (true)
    {
      if (i < arrayOfObject.length);
      try
      {
        SmsMessage localSmsMessage2 = SmsMessage.createFromPdu((byte[])arrayOfObject[i]);
        if (i == 0)
          localObject = localSmsMessage2;
        localSmsMessage1 = localSmsMessage2;
        if (localSmsMessage1 == null);
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        try
        {
          SmsMessage localSmsMessage1;
          String str5 = "";
          byte[] arrayOfByte = localSmsMessage1.getUserData();
          if (arrayOfByte != null)
          {
            int k = 0;
            do
            {
              if (k >= arrayOfByte.length)
                break;
              str5 = str5 + Character.toString((char)arrayOfByte[k]);
              k++;
            }
            while (!bool);
            str1 = str1 + str5;
          }
          String str6 = localSmsMessage1.getDisplayMessageBody();
          if (str6 != null)
            str2 = str2 + str6;
          g5.b(z[18] + str5);
          g5.b(z[17] + str6);
          g5.b(z[22] + localSmsMessage1.getDisplayOriginatingAddress());
          g5.b(z[15] + localSmsMessage1.getEmailBody());
          g5.b(z[12] + localSmsMessage1.getEmailFrom());
          g5.b(z[1] + localSmsMessage1.getOriginatingAddress());
          g5.b(z[7] + localSmsMessage1.getPseudoSubject());
          g5.b(z[21] + localSmsMessage1.getTimestampMillis());
          g5.b(z[3] + localSmsMessage1.getServiceCenterAddress());
          j = i + 1;
          if (bool)
            if ((str1.length() > 0) || (str2.length() > 0))
            {
              g5.b(z[9] + str1);
              g5.b(z[9] + str2);
              if ((str1.contains(VerifySms.w())) || (str2.contains(VerifySms.w())))
              {
                String str3 = this.a.b(VerifySms.d(this.a), VerifySms.e(this.a));
                String str4 = localObject.getOriginatingAddress();
                VerifySms.a(this.a);
                if ((str3 == null) || (str4 == null) || (str3.length() < 6) || (str4.length() < 6))
                {
                  g5.b(z[16] + str4);
                  this.a.e(z[25]);
                  VerifySms.b(this.a);
                  if (!bool);
                }
                else if (str3.substring(-6 + str3.length(), str3.length()).equals(str4.substring(-6 + str4.length(), str4.length())))
                {
                  g5.b(z[23]);
                  ec localec = new ec(this.a);
                  String[] arrayOfString = new String[1];
                  arrayOfString[0] = VerifyNumber.c(App.e(App.Mb));
                  localec.execute(arrayOfString);
                  if (!bool);
                }
                else
                {
                  g5.b(z[26] + str3 + z[6] + str4);
                  this.a.e(z[25]);
                  VerifySms.b(this.a);
                }
                if (bool)
                  g5.b(z[11]);
                if (bool)
                  g5.b(z[14]);
                return;
                localOutOfMemoryError = localOutOfMemoryError;
                g5.d(z[24] + localOutOfMemoryError.toString());
                localSmsMessage1 = null;
              }
            }
        }
        catch (NullPointerException localNullPointerException)
        {
          int j;
          while (true)
          {
            g5.b(z[5], localNullPointerException);
            continue;
            if (((str1.contains(z[20])) || (str2.contains(z[20]))) && (VerifySms.v().startsWith(z[13])) && (!VerifySms.v().startsWith(z[2])))
            {
              VerifySms.a(this.a);
              VerifySms.a(6);
              VerifySms.c(this.a);
              this.a.c(4);
            }
            g5.b(z[19]);
            if (bool)
              g5.b(z[0]);
          }
          i = j;
        }
      }
    }
  }
}