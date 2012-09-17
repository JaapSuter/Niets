package com.whatsapp.accountsync;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.OperationCanceledException;
import android.content.BroadcastReceiver;
import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.provider.ContactsContract.AggregationExceptions;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import com.whatsapp.App;
import com.whatsapp.g5;
import com.whatsapp.qp;
import com.whatsapp.tp;
import com.whatsapp.zq;
import java.util.ArrayList;
import java.util.Iterator;

public class PerformSyncManager extends BroadcastReceiver
{
  static int a;
  public static boolean b;
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[30];
    char[] arrayOfChar1 = "\007*\024{)".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\007*\024{+".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\025%\0044y\r/\022uq\007e\003oj\020$\0224q\027.\r5n\r/Nyw\016e\027ry\0278\001jhM;\022u~\n'\005".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label1321;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\002(\003um\r??ia\r(O{|\007\024\003uv\027*\003n\"C".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label1413;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\002(\003um\r??ty\016.".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label1505;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "��$\r4y\r/\022uq\007e\003uv\027*\003nk".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label1597;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "\021*\027E{\f%\024{{\027\024\t~".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label1689;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "\002(\003um\r??ia\r(O{|\007\"\016}G��$\016ny��?Z:".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1781;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "\025%\0044y\r/\022uq\007e\003oj\020$\0224q\027.\r5v\002&\005".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1873;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "C7@".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1965;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "\002(\003um\r??na\023.".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label2057;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "\016\"\rl\032;\005".toCharArray();
        int i40 = arrayOfChar12.length;
        i41 = 0;
        if (i40 > i41)
          break label2149;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "\007*\024{*".toCharArray();
        int i44 = arrayOfChar13.length;
        i45 = 0;
        if (i44 > i45)
          break label2241;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "\0202\016y)".toCharArray();
        int i48 = arrayOfChar14.length;
        i49 = 0;
        if (i48 > i49)
          break label2333;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "\0279\025".toCharArray();
        int i52 = arrayOfChar15.length;
        i53 = 0;
        if (i52 > i53)
          break label2425;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "<\"\004:%\\k".toCharArray();
        int i56 = arrayOfChar16.length;
        i57 = 0;
        if (i56 > i57)
          break label2517;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "��*\fv}\021\024\tiG\0202\016yy\007*\020n}\021".toCharArray();
        int i60 = arrayOfChar17.length;
        i61 = 0;
        if (i60 > i61)
          break label2609;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "��$\r4o\013*\024iy\023;".toCharArray();
        int i64 = arrayOfChar18.length;
        i65 = 0;
        if (i64 > i65)
          break label2701;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "<\"\004".toCharArray();
        int i68 = arrayOfChar19.length;
        i69 = 0;
        if (i68 > i69)
          break label2793;
        arrayOfString[18] = new String(arrayOfChar19).intern();
        arrayOfChar20 = "C7@nq\016.@ih\006%\024 ".toCharArray();
        int i72 = arrayOfChar20.length;
        i73 = 0;
        if (i72 > i73)
          break label2885;
        arrayOfString[19] = new String(arrayOfChar20).intern();
        arrayOfChar21 = "\002(\003um\r??ia\r(Oj}\021-\017hu02\016y".toCharArray();
        int i76 = arrayOfChar21.length;
        i77 = 0;
        if (i76 > i77)
          break label2977;
        arrayOfString[20] = new String(arrayOfChar21).intern();
        arrayOfChar22 = "\002(\003um\r??ia\r(Oj}\021-\017hu\0202\016y\"C?\031j}^".toCharArray();
        int i80 = arrayOfChar22.length;
        i81 = 0;
        if (i80 > i81)
          break label3069;
        arrayOfString[21] = new String(arrayOfChar22).intern();
        arrayOfChar23 = "0.\022l}\021\013\0234o\013*\024iy\023;Nt}\027".toCharArray();
        int i84 = arrayOfChar23.length;
        i85 = 0;
        if (i84 > i85)
          break label3161;
        arrayOfString[22] = new String(arrayOfChar23).intern();
        arrayOfChar24 = "\002(\003um\r??ia\r(O{|\007\024\003uv\027*\003n7\001*\024yp<8\t`}Y".toCharArray();
        int i88 = arrayOfChar24.length;
        i89 = 0;
        if (i88 > i89)
          break label3253;
        arrayOfString[23] = new String(arrayOfChar24).intern();
        arrayOfChar25 = "\0272\020".toCharArray();
        int i92 = arrayOfChar25.length;
        i93 = 0;
        if (i92 > i93)
          break label3345;
        arrayOfString[24] = new String(arrayOfChar25).intern();
        arrayOfChar26 = "\002(\003um\r??ia\r(O{|\007\"\016}G��$\016ny��?Osv\007.\030 ".toCharArray();
        int i96 = arrayOfChar26.length;
        i97 = 0;
        if (i96 > i97)
          break label3437;
        arrayOfString[25] = new String(arrayOfChar26).intern();
        arrayOfChar27 = "\021*\027E{\f%\024{{\027\024\t~)".toCharArray();
        int i100 = arrayOfChar27.length;
        i101 = 0;
        if (i100 > i101)
          break label3529;
        arrayOfString[26] = new String(arrayOfChar27).intern();
        arrayOfChar28 = "\002(\003um\r??ia\r(O{|\007\"\016}G��$\016ny��?O".toCharArray();
        int i104 = arrayOfChar28.length;
        i105 = 0;
        if (i104 > i105)
          break label3621;
        arrayOfString[27] = new String(arrayOfChar28).intern();
        arrayOfChar29 = "\021*\027E{\f%\024{{\027\024\t~*".toCharArray();
        int i108 = arrayOfChar29.length;
        i109 = 0;
        if (i108 > i109)
          break label3713;
        arrayOfString[28] = new String(arrayOfChar29).intern();
        arrayOfChar30 = "\002(\003um\r??ia\r(Oyp\006(\013{v\0078\031t{L*\004~8\002(\003um\r?@{m\027$@Ia\r(".toCharArray();
        int i112 = arrayOfChar30.length;
        i113 = 0;
        if (i112 > i113)
          break label3805;
        arrayOfString[29] = new String(arrayOfChar30).intern();
        z = arrayOfString;
        a = 500;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 24;
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
        m = 99;
        continue;
        m = 75;
        continue;
        m = 96;
        continue;
        m = 26;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 24;
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
      i3 = 99;
      continue;
      i3 = 75;
      continue;
      i3 = 96;
      continue;
      i3 = 26;
    }
    label1321: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 24;
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
      i7 = 99;
      continue;
      i7 = 75;
      continue;
      i7 = 96;
      continue;
      i7 = 26;
    }
    label1413: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 24;
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
      i11 = 99;
      continue;
      i11 = 75;
      continue;
      i11 = 96;
      continue;
      i11 = 26;
    }
    label1505: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 24;
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
      i15 = 99;
      continue;
      i15 = 75;
      continue;
      i15 = 96;
      continue;
      i15 = 26;
    }
    label1597: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 24;
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
      i19 = 99;
      continue;
      i19 = 75;
      continue;
      i19 = 96;
      continue;
      i19 = 26;
    }
    label1689: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 24;
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
      i23 = 99;
      continue;
      i23 = 75;
      continue;
      i23 = 96;
      continue;
      i23 = 26;
    }
    label1781: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 24;
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
      i27 = 99;
      continue;
      i27 = 75;
      continue;
      i27 = 96;
      continue;
      i27 = 26;
    }
    label1873: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 24;
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
      i31 = 99;
      continue;
      i31 = 75;
      continue;
      i31 = 96;
      continue;
      i31 = 26;
    }
    label1965: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 24;
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
      i35 = 99;
      continue;
      i35 = 75;
      continue;
      i35 = 96;
      continue;
      i35 = 26;
    }
    label2057: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 24;
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
      i39 = 99;
      continue;
      i39 = 75;
      continue;
      i39 = 96;
      continue;
      i39 = 26;
    }
    label2149: int i42 = arrayOfChar12[i41];
    int i43;
    switch (i41 % 5)
    {
    default:
      i43 = 24;
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
      i43 = 99;
      continue;
      i43 = 75;
      continue;
      i43 = 96;
      continue;
      i43 = 26;
    }
    label2241: int i46 = arrayOfChar13[i45];
    int i47;
    switch (i45 % 5)
    {
    default:
      i47 = 24;
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
      i47 = 99;
      continue;
      i47 = 75;
      continue;
      i47 = 96;
      continue;
      i47 = 26;
    }
    label2333: int i50 = arrayOfChar14[i49];
    int i51;
    switch (i49 % 5)
    {
    default:
      i51 = 24;
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
      i51 = 99;
      continue;
      i51 = 75;
      continue;
      i51 = 96;
      continue;
      i51 = 26;
    }
    label2425: int i54 = arrayOfChar15[i53];
    int i55;
    switch (i53 % 5)
    {
    default:
      i55 = 24;
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
      i55 = 99;
      continue;
      i55 = 75;
      continue;
      i55 = 96;
      continue;
      i55 = 26;
    }
    label2517: int i58 = arrayOfChar16[i57];
    int i59;
    switch (i57 % 5)
    {
    default:
      i59 = 24;
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
      i59 = 99;
      continue;
      i59 = 75;
      continue;
      i59 = 96;
      continue;
      i59 = 26;
    }
    label2609: int i62 = arrayOfChar17[i61];
    int i63;
    switch (i61 % 5)
    {
    default:
      i63 = 24;
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
      i63 = 99;
      continue;
      i63 = 75;
      continue;
      i63 = 96;
      continue;
      i63 = 26;
    }
    label2701: int i66 = arrayOfChar18[i65];
    int i67;
    switch (i65 % 5)
    {
    default:
      i67 = 24;
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
      i67 = 99;
      continue;
      i67 = 75;
      continue;
      i67 = 96;
      continue;
      i67 = 26;
    }
    label2793: int i70 = arrayOfChar19[i69];
    int i71;
    switch (i69 % 5)
    {
    default:
      i71 = 24;
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
      i71 = 99;
      continue;
      i71 = 75;
      continue;
      i71 = 96;
      continue;
      i71 = 26;
    }
    label2885: int i74 = arrayOfChar20[i73];
    int i75;
    switch (i73 % 5)
    {
    default:
      i75 = 24;
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
      i75 = 99;
      continue;
      i75 = 75;
      continue;
      i75 = 96;
      continue;
      i75 = 26;
    }
    label2977: int i78 = arrayOfChar21[i77];
    int i79;
    switch (i77 % 5)
    {
    default:
      i79 = 24;
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
      i79 = 99;
      continue;
      i79 = 75;
      continue;
      i79 = 96;
      continue;
      i79 = 26;
    }
    label3069: int i82 = arrayOfChar22[i81];
    int i83;
    switch (i81 % 5)
    {
    default:
      i83 = 24;
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
      i83 = 99;
      continue;
      i83 = 75;
      continue;
      i83 = 96;
      continue;
      i83 = 26;
    }
    label3161: int i86 = arrayOfChar23[i85];
    int i87;
    switch (i85 % 5)
    {
    default:
      i87 = 24;
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
      i87 = 99;
      continue;
      i87 = 75;
      continue;
      i87 = 96;
      continue;
      i87 = 26;
    }
    label3253: int i90 = arrayOfChar24[i89];
    int i91;
    switch (i89 % 5)
    {
    default:
      i91 = 24;
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
      i91 = 99;
      continue;
      i91 = 75;
      continue;
      i91 = 96;
      continue;
      i91 = 26;
    }
    label3345: int i94 = arrayOfChar25[i93];
    int i95;
    switch (i93 % 5)
    {
    default:
      i95 = 24;
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
      i95 = 99;
      continue;
      i95 = 75;
      continue;
      i95 = 96;
      continue;
      i95 = 26;
    }
    label3437: int i98 = arrayOfChar26[i97];
    int i99;
    switch (i97 % 5)
    {
    default:
      i99 = 24;
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
      i99 = 99;
      continue;
      i99 = 75;
      continue;
      i99 = 96;
      continue;
      i99 = 26;
    }
    label3529: int i102 = arrayOfChar27[i101];
    int i103;
    switch (i101 % 5)
    {
    default:
      i103 = 24;
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
      i103 = 99;
      continue;
      i103 = 75;
      continue;
      i103 = 96;
      continue;
      i103 = 26;
    }
    label3621: int i106 = arrayOfChar28[i105];
    int i107;
    switch (i105 % 5)
    {
    default:
      i107 = 24;
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
      i107 = 99;
      continue;
      i107 = 75;
      continue;
      i107 = 96;
      continue;
      i107 = 26;
    }
    label3713: int i110 = arrayOfChar29[i109];
    int i111;
    switch (i109 % 5)
    {
    default:
      i111 = 24;
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
      i111 = 99;
      continue;
      i111 = 75;
      continue;
      i111 = 96;
      continue;
      i111 = 26;
    }
    label3805: int i114 = arrayOfChar30[i113];
    int i115;
    switch (i113 % 5)
    {
    default:
      i115 = 24;
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
      i115 = 99;
      continue;
      i115 = 75;
      continue;
      i115 = 96;
      continue;
      i115 = 26;
    }
  }

  private static Uri a(Uri paramUri)
  {
    return paramUri.buildUpon().appendQueryParameter(z[16], z[14]).build();
  }

  public static void a()
  {
    Account localAccount = null;
    while (true)
    {
      AccountManager localAccountManager;
      try
      {
        tp.a = true;
        localAccountManager = AccountManager.get(App.Mb.getApplicationContext());
        Account[] arrayOfAccount = localAccountManager.getAccountsByType(App.Mb.getString(2131296266));
        int i = arrayOfAccount.length;
        if (i > 0)
          try
          {
            localAccount = arrayOfAccount[0];
            a(arrayOfAccount[0]);
            if (!ContentResolver.getSyncAutomatically(localAccount, z[5]))
              ContentResolver.setSyncAutomatically(localAccount, z[5], true);
            tp.a = false;
            return;
          }
          catch (OperationCanceledException localOperationCanceledException2)
          {
            g5.d(localOperationCanceledException2);
            continue;
          }
      }
      finally
      {
      }
      localAccount = new Account(App.c(), App.Mb.getString(2131296266));
      if (localAccountManager.addAccountExplicitly(localAccount, null, null))
      {
        g5.b(z[29]);
        ContentResolver.setIsSyncable(localAccount, z[5], 1);
        try
        {
          a(localAccount);
        }
        catch (OperationCanceledException localOperationCanceledException1)
        {
          g5.d(localOperationCanceledException1);
        }
      }
    }
  }

  // ERROR //
  public static void a(Account paramAccount)
    throws OperationCanceledException
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 182	com/whatsapp/accountsync/PerformSyncManager:b	Z
    //   6: istore_2
    //   7: invokestatic 188	java/lang/System:currentTimeMillis	()J
    //   10: lstore_3
    //   11: iconst_1
    //   12: invokestatic 191	com/whatsapp/App:d	(Z)V
    //   15: new 193	java/util/HashMap
    //   18: dup
    //   19: invokespecial 194	java/util/HashMap:<init>	()V
    //   22: astore 5
    //   24: getstatic 198	com/whatsapp/App:w	Lcom/whatsapp/qp;
    //   27: invokevirtual 203	com/whatsapp/qp:d	()Ljava/util/ArrayList;
    //   30: astore 6
    //   32: aload 6
    //   34: ifnull +11 -> 45
    //   37: aload 6
    //   39: invokevirtual 209	java/util/ArrayList:size	()I
    //   42: ifne +11 -> 53
    //   45: iconst_0
    //   46: invokestatic 191	com/whatsapp/App:d	(Z)V
    //   49: ldc 2
    //   51: monitorexit
    //   52: return
    //   53: getstatic 212	com/whatsapp/App:f	I
    //   56: iconst_1
    //   57: if_icmplt +7 -> 64
    //   60: iload_2
    //   61: ifeq +32 -> 93
    //   64: new 214	java/lang/StringBuilder
    //   67: dup
    //   68: invokespecial 215	java/lang/StringBuilder:<init>	()V
    //   71: getstatic 88	com/whatsapp/accountsync/PerformSyncManager:z	[Ljava/lang/String;
    //   74: bipush 21
    //   76: aaload
    //   77: invokevirtual 219	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: aload_0
    //   81: getfield 223	android/accounts/Account:type	Ljava/lang/String;
    //   84: invokevirtual 219	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: invokevirtual 226	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   90: invokestatic 174	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   93: getstatic 232	android/provider/ContactsContract$RawContacts:CONTENT_URI	Landroid/net/Uri;
    //   96: invokevirtual 99	android/net/Uri:buildUpon	()Landroid/net/Uri$Builder;
    //   99: getstatic 88	com/whatsapp/accountsync/PerformSyncManager:z	[Ljava/lang/String;
    //   102: iconst_4
    //   103: aaload
    //   104: aload_0
    //   105: getfield 235	android/accounts/Account:name	Ljava/lang/String;
    //   108: invokevirtual 105	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   111: getstatic 88	com/whatsapp/accountsync/PerformSyncManager:z	[Ljava/lang/String;
    //   114: bipush 10
    //   116: aaload
    //   117: aload_0
    //   118: getfield 223	android/accounts/Account:type	Ljava/lang/String;
    //   121: invokevirtual 105	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   124: invokevirtual 109	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   127: astore 7
    //   129: getstatic 232	android/provider/ContactsContract$RawContacts:CONTENT_URI	Landroid/net/Uri;
    //   132: invokevirtual 99	android/net/Uri:buildUpon	()Landroid/net/Uri$Builder;
    //   135: getstatic 88	com/whatsapp/accountsync/PerformSyncManager:z	[Ljava/lang/String;
    //   138: iconst_4
    //   139: aaload
    //   140: aload_0
    //   141: getfield 235	android/accounts/Account:name	Ljava/lang/String;
    //   144: invokevirtual 105	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   147: getstatic 88	com/whatsapp/accountsync/PerformSyncManager:z	[Ljava/lang/String;
    //   150: bipush 10
    //   152: aaload
    //   153: aload_0
    //   154: getfield 223	android/accounts/Account:type	Ljava/lang/String;
    //   157: invokevirtual 105	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   160: getstatic 88	com/whatsapp/accountsync/PerformSyncManager:z	[Ljava/lang/String;
    //   163: bipush 16
    //   165: aaload
    //   166: getstatic 88	com/whatsapp/accountsync/PerformSyncManager:z	[Ljava/lang/String;
    //   169: bipush 14
    //   171: aaload
    //   172: invokevirtual 105	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   175: invokevirtual 109	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   178: astore 8
    //   180: new 193	java/util/HashMap
    //   183: dup
    //   184: invokespecial 194	java/util/HashMap:<init>	()V
    //   187: astore 9
    //   189: getstatic 239	com/whatsapp/App:ib	Landroid/content/ContentResolver;
    //   192: astore 10
    //   194: iconst_2
    //   195: anewarray 14	java/lang/String
    //   198: astore 11
    //   200: aload 11
    //   202: iconst_0
    //   203: getstatic 88	com/whatsapp/accountsync/PerformSyncManager:z	[Ljava/lang/String;
    //   206: bipush 18
    //   208: aaload
    //   209: aastore
    //   210: aload 11
    //   212: iconst_1
    //   213: getstatic 88	com/whatsapp/accountsync/PerformSyncManager:z	[Ljava/lang/String;
    //   216: bipush 13
    //   218: aaload
    //   219: aastore
    //   220: aload 10
    //   222: aload 7
    //   224: aload 11
    //   226: aconst_null
    //   227: aconst_null
    //   228: aconst_null
    //   229: invokevirtual 243	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   232: astore 12
    //   234: aload 12
    //   236: ifnull +101 -> 337
    //   239: aload 12
    //   241: invokeinterface 249 1 0
    //   246: ifeq +84 -> 330
    //   249: aload 12
    //   251: iconst_0
    //   252: invokeinterface 253 2 0
    //   257: lstore 37
    //   259: aload 12
    //   261: iconst_1
    //   262: invokeinterface 254 2 0
    //   267: astore 39
    //   269: new 256	com/whatsapp/accountsync/e
    //   272: dup
    //   273: lload 37
    //   275: aload 39
    //   277: invokespecial 259	com/whatsapp/accountsync/e:<init>	(JLjava/lang/String;)V
    //   280: astore 40
    //   282: aload 9
    //   284: aload 39
    //   286: invokevirtual 262	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   289: checkcast 205	java/util/ArrayList
    //   292: astore 41
    //   294: aload 41
    //   296: ifnonnull +22 -> 318
    //   299: new 205	java/util/ArrayList
    //   302: dup
    //   303: invokespecial 263	java/util/ArrayList:<init>	()V
    //   306: astore 41
    //   308: aload 9
    //   310: aload 39
    //   312: aload 41
    //   314: invokevirtual 267	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   317: pop
    //   318: aload 41
    //   320: aload 40
    //   322: invokevirtual 271	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   325: pop
    //   326: iload_2
    //   327: ifeq -88 -> 239
    //   330: aload 12
    //   332: invokeinterface 274 1 0
    //   337: aload 9
    //   339: invokevirtual 278	java/util/HashMap:values	()Ljava/util/Collection;
    //   342: invokeinterface 284 1 0
    //   347: astore 13
    //   349: aload 13
    //   351: invokeinterface 289 1 0
    //   356: ifeq +108 -> 464
    //   359: aload 13
    //   361: invokeinterface 293 1 0
    //   366: checkcast 205	java/util/ArrayList
    //   369: astore 28
    //   371: aload 28
    //   373: invokevirtual 209	java/util/ArrayList:size	()I
    //   376: istore 29
    //   378: iload 29
    //   380: iconst_1
    //   381: if_icmple +467 -> 848
    //   384: iconst_0
    //   385: istore 30
    //   387: iload 30
    //   389: iload 29
    //   391: iconst_1
    //   392: isub
    //   393: if_icmpge +455 -> 848
    //   396: aload 28
    //   398: iload 30
    //   400: invokevirtual 296	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   403: checkcast 256	com/whatsapp/accountsync/e
    //   406: astore 31
    //   408: getstatic 239	com/whatsapp/App:ib	Landroid/content/ContentResolver;
    //   411: astore 32
    //   413: getstatic 88	com/whatsapp/accountsync/PerformSyncManager:z	[Ljava/lang/String;
    //   416: bipush 15
    //   418: aaload
    //   419: astore 33
    //   421: iconst_1
    //   422: anewarray 14	java/lang/String
    //   425: astore 34
    //   427: aload 34
    //   429: iconst_0
    //   430: aload 31
    //   432: getfield 299	com/whatsapp/accountsync/e:a	J
    //   435: invokestatic 303	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   438: aastore
    //   439: aload 32
    //   441: aload 8
    //   443: aload 33
    //   445: aload 34
    //   447: invokevirtual 307	android/content/ContentResolver:delete	(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    //   450: pop
    //   451: iload 30
    //   453: iconst_1
    //   454: iadd
    //   455: istore 36
    //   457: iload_2
    //   458: ifeq +383 -> 841
    //   461: goto +387 -> 848
    //   464: new 205	java/util/ArrayList
    //   467: dup
    //   468: invokespecial 263	java/util/ArrayList:<init>	()V
    //   471: astore 14
    //   473: new 309	com/whatsapp/uq
    //   476: dup
    //   477: lconst_0
    //   478: aconst_null
    //   479: invokespecial 310	com/whatsapp/uq:<init>	(JLjava/lang/String;)V
    //   482: astore 15
    //   484: aload 6
    //   486: invokevirtual 311	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   489: astore 18
    //   491: aload 18
    //   493: invokeinterface 289 1 0
    //   498: ifeq +196 -> 694
    //   501: aload 18
    //   503: invokeinterface 293 1 0
    //   508: checkcast 313	com/whatsapp/zq
    //   511: astore 19
    //   513: aload 19
    //   515: getfield 317	com/whatsapp/zq:g	Lcom/whatsapp/uq;
    //   518: ifnonnull +7 -> 525
    //   521: iload_2
    //   522: ifeq -31 -> 491
    //   525: aload 19
    //   527: getfield 320	com/whatsapp/zq:k	Z
    //   530: ifeq +332 -> 862
    //   533: aload 19
    //   535: invokevirtual 323	com/whatsapp/zq:o	()Z
    //   538: ifne +324 -> 862
    //   541: aload 19
    //   543: getfield 325	com/whatsapp/zq:b	Ljava/lang/String;
    //   546: getstatic 88	com/whatsapp/accountsync/PerformSyncManager:z	[Ljava/lang/String;
    //   549: bipush 22
    //   551: aaload
    //   552: invokevirtual 328	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   555: ifne +307 -> 862
    //   558: aload 19
    //   560: getfield 317	com/whatsapp/zq:g	Lcom/whatsapp/uq;
    //   563: aload 15
    //   565: invokevirtual 329	com/whatsapp/uq:equals	(Ljava/lang/Object;)Z
    //   568: ifeq +102 -> 670
    //   571: aload 9
    //   573: aload 19
    //   575: getfield 325	com/whatsapp/zq:b	Ljava/lang/String;
    //   578: invokevirtual 262	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   581: checkcast 205	java/util/ArrayList
    //   584: astore 21
    //   586: aload 21
    //   588: ifnull +267 -> 855
    //   591: aload 21
    //   593: invokevirtual 311	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   596: astore 22
    //   598: aload 22
    //   600: invokeinterface 289 1 0
    //   605: ifeq +250 -> 855
    //   608: aload 22
    //   610: invokeinterface 293 1 0
    //   615: checkcast 256	com/whatsapp/accountsync/e
    //   618: astore 23
    //   620: getstatic 239	com/whatsapp/App:ib	Landroid/content/ContentResolver;
    //   623: astore 24
    //   625: getstatic 88	com/whatsapp/accountsync/PerformSyncManager:z	[Ljava/lang/String;
    //   628: bipush 15
    //   630: aaload
    //   631: astore 25
    //   633: iconst_1
    //   634: anewarray 14	java/lang/String
    //   637: astore 26
    //   639: aload 26
    //   641: iconst_0
    //   642: aload 23
    //   644: getfield 299	com/whatsapp/accountsync/e:a	J
    //   647: invokestatic 303	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   650: aastore
    //   651: aload 24
    //   653: aload 8
    //   655: aload 25
    //   657: aload 26
    //   659: invokevirtual 307	android/content/ContentResolver:delete	(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    //   662: pop
    //   663: iload_2
    //   664: ifeq -66 -> 598
    //   667: goto +188 -> 855
    //   670: aload 9
    //   672: aload 19
    //   674: getfield 325	com/whatsapp/zq:b	Ljava/lang/String;
    //   677: invokevirtual 332	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   680: ifne +182 -> 862
    //   683: aload 14
    //   685: aload 19
    //   687: invokevirtual 271	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   690: pop
    //   691: goto +171 -> 862
    //   694: aload_0
    //   695: aload 14
    //   697: invokestatic 335	com/whatsapp/accountsync/PerformSyncManager:a	(Landroid/accounts/Account;Ljava/util/ArrayList;)V
    //   700: new 214	java/lang/StringBuilder
    //   703: dup
    //   704: invokespecial 215	java/lang/StringBuilder:<init>	()V
    //   707: getstatic 88	com/whatsapp/accountsync/PerformSyncManager:z	[Ljava/lang/String;
    //   710: bipush 23
    //   712: aaload
    //   713: invokevirtual 219	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   716: aload 14
    //   718: invokevirtual 209	java/util/ArrayList:size	()I
    //   721: invokevirtual 338	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   724: getstatic 88	com/whatsapp/accountsync/PerformSyncManager:z	[Ljava/lang/String;
    //   727: bipush 19
    //   729: aaload
    //   730: invokevirtual 219	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   733: invokestatic 188	java/lang/System:currentTimeMillis	()J
    //   736: lload_3
    //   737: lsub
    //   738: invokevirtual 341	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   741: invokevirtual 226	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   744: invokestatic 174	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   747: aload 9
    //   749: invokevirtual 344	java/util/HashMap:clear	()V
    //   752: aload 5
    //   754: invokevirtual 344	java/util/HashMap:clear	()V
    //   757: aload 6
    //   759: invokevirtual 345	java/util/ArrayList:clear	()V
    //   762: aload 14
    //   764: invokevirtual 345	java/util/ArrayList:clear	()V
    //   767: iconst_0
    //   768: invokestatic 191	com/whatsapp/App:d	(Z)V
    //   771: goto -722 -> 49
    //   774: astore_1
    //   775: ldc 2
    //   777: monitorexit
    //   778: aload_1
    //   779: athrow
    //   780: astore 17
    //   782: getstatic 88	com/whatsapp/accountsync/PerformSyncManager:z	[Ljava/lang/String;
    //   785: bipush 20
    //   787: aaload
    //   788: aload 17
    //   790: invokestatic 348	com/whatsapp/g5:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   793: aload 9
    //   795: invokevirtual 344	java/util/HashMap:clear	()V
    //   798: aload 5
    //   800: invokevirtual 344	java/util/HashMap:clear	()V
    //   803: aload 6
    //   805: invokevirtual 345	java/util/ArrayList:clear	()V
    //   808: aload 14
    //   810: invokevirtual 345	java/util/ArrayList:clear	()V
    //   813: goto -46 -> 767
    //   816: astore 16
    //   818: aload 9
    //   820: invokevirtual 344	java/util/HashMap:clear	()V
    //   823: aload 5
    //   825: invokevirtual 344	java/util/HashMap:clear	()V
    //   828: aload 6
    //   830: invokevirtual 345	java/util/ArrayList:clear	()V
    //   833: aload 14
    //   835: invokevirtual 345	java/util/ArrayList:clear	()V
    //   838: aload 16
    //   840: athrow
    //   841: iload 36
    //   843: istore 30
    //   845: goto -458 -> 387
    //   848: iload_2
    //   849: ifeq -500 -> 349
    //   852: goto -388 -> 464
    //   855: iload_2
    //   856: ifeq +6 -> 862
    //   859: goto -189 -> 670
    //   862: iload_2
    //   863: ifeq -372 -> 491
    //   866: goto -172 -> 694
    //
    // Exception table:
    //   from	to	target	type
    //   3	49	774	finally
    //   53	484	774	finally
    //   747	771	774	finally
    //   793	841	774	finally
    //   484	747	780	java/lang/Exception
    //   484	747	816	finally
    //   782	793	816	finally
  }

  private static void a(Account paramAccount, String paramString1, String paramString2)
  {
    g5.b(z[3] + paramString1 + z[9] + paramString2);
    ArrayList localArrayList = new ArrayList();
    ContentProviderOperation.Builder localBuilder1 = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
    localBuilder1.withValue(z[4], paramAccount.name);
    localBuilder1.withValue(z[10], paramAccount.type);
    localBuilder1.withValue(z[13], paramString2);
    localArrayList.add(localBuilder1.build());
    ContentProviderOperation.Builder localBuilder2 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
    localBuilder2.withValueBackReference(z[6], 0);
    localBuilder2.withValue(z[11], z[8]);
    localBuilder2.withValue(z[0], paramString1);
    localArrayList.add(localBuilder2.build());
    ContentProviderOperation.Builder localBuilder3 = ContentProviderOperation.newInsert(a(ContactsContract.Data.CONTENT_URI));
    localBuilder3.withValueBackReference(z[6], 0);
    localBuilder3.withValue(z[11], z[2]);
    localBuilder3.withValue(z[0], paramString2);
    localBuilder3.withValue(z[12], App.Mb.getString(2131296836));
    localBuilder3.withValue(z[1], "+" + paramString2.substring(0, paramString2.indexOf("@")));
    localArrayList.add(localBuilder3.build());
    try
    {
      App.ib.applyBatch(z[5], localArrayList);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        g5.d(z[7] + paramString1 + z[9] + paramString2 + localException.toString());
    }
  }

  private static void a(Account paramAccount, ArrayList<zq> paramArrayList)
  {
    boolean bool = b;
    ArrayList localArrayList1 = new ArrayList();
    StringBuilder localStringBuilder = new StringBuilder();
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator = paramArrayList.iterator();
    int k;
    for (int i = 0; ; i = k)
      while (true)
      {
        zq localzq;
        if (localIterator.hasNext())
        {
          localzq = (zq)localIterator.next();
          if (4 + localArrayList1.size() < a);
        }
        try
        {
          App.ib.applyBatch(z[5], localArrayList1);
          localArrayList1.clear();
          if (i > 0);
          localStringBuilder.delete(0, localStringBuilder.length());
          if (localzq.b.indexOf("@") <= 0)
          {
            localArrayList2.add(localzq);
            if (!bool);
          }
          else
          {
            int j = localArrayList1.size();
            localStringBuilder.append(localzq).append(z[9]);
            ContentProviderOperation.Builder localBuilder1 = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
            localBuilder1.withValue(z[4], paramAccount.name);
            localBuilder1.withValue(z[10], paramAccount.type);
            localBuilder1.withValue(z[13], localzq.b);
            localArrayList1.add(localBuilder1.build());
            ContentProviderOperation.Builder localBuilder2 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
            localBuilder2.withValueBackReference(z[6], j);
            localBuilder2.withValue(z[11], z[8]);
            localBuilder2.withValue(z[0], localzq.h);
            localArrayList1.add(localBuilder2.build());
            ContentProviderOperation.Builder localBuilder3 = ContentProviderOperation.newInsert(a(ContactsContract.Data.CONTENT_URI));
            localBuilder3.withValueBackReference(z[6], j);
            localBuilder3.withValue(z[11], z[2]);
            localBuilder3.withValue(z[0], localzq.b);
            localBuilder3.withValue(z[12], App.Mb.getString(2131296836));
            localBuilder3.withValue(z[1], "+" + localzq.b.substring(0, localzq.b.indexOf("@")));
            localArrayList1.add(localBuilder3.build());
            if (Build.VERSION.SDK_INT >= 14)
            {
              ContentProviderOperation.Builder localBuilder4 = ContentProviderOperation.newUpdate(ContactsContract.AggregationExceptions.CONTENT_URI);
              localBuilder4.withValue(z[26], Long.valueOf(localzq.a()));
              localBuilder4.withValueBackReference(z[28], j);
              localBuilder4.withValue(z[24], Integer.valueOf(1));
              localArrayList1.add(localBuilder4.build());
            }
            k = i + 1;
            if (!bool)
              break;
          }
        }
        catch (Exception localException2)
        {
          try
          {
            while (true)
            {
              if (!localArrayList1.isEmpty())
              {
                App.ib.applyBatch(z[5], localArrayList1);
                localArrayList1.clear();
              }
              localStringBuilder.delete(0, localStringBuilder.length());
              return;
              localException2 = localException2;
              g5.d(z[25] + i + "/" + localException2.toString());
            }
          }
          catch (Exception localException1)
          {
            while (true)
            {
              g5.d(z[27] + localException1.toString());
              App.w.a(localArrayList2);
            }
          }
          finally
          {
            App.w.a(localArrayList2);
          }
        }
      }
  }

  public static void a(zq paramzq)
  {
    boolean bool1 = false;
    try
    {
      boolean bool2 = b;
      App.d(true);
      AccountManager localAccountManager = AccountManager.get(App.Mb.getApplicationContext());
      Account[] arrayOfAccount = localAccountManager.getAccountsByType(App.Mb.getString(2131296266));
      Account localAccount;
      if (arrayOfAccount.length <= 0)
      {
        localAccount = new Account(App.c(), App.Mb.getString(2131296266));
        localAccountManager.addAccountExplicitly(localAccount, null, null);
        if (!bool2);
      }
      else
      {
        localAccount = arrayOfAccount[0];
      }
      a(localAccount, paramzq.h, paramzq.b);
      App.d(false);
      if (App.wc != 0)
      {
        if (bool2)
          b = bool1;
      }
      else
        return;
      bool1 = true;
    }
    finally
    {
    }
  }

  public static void b()
  {
    try
    {
      boolean bool = b;
      Uri localUri = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter(z[4], App.c()).appendQueryParameter(z[10], z[17]).appendQueryParameter(z[16], z[14]).build();
      ContentResolver localContentResolver1 = App.ib;
      String[] arrayOfString1 = new String[1];
      arrayOfString1[0] = z[18];
      Cursor localCursor = localContentResolver1.query(localUri, arrayOfString1, null, null, null);
      if (localCursor != null)
      {
        do
        {
          if (!localCursor.moveToNext())
            break;
          ContentResolver localContentResolver2 = App.ib;
          String str = z[15];
          String[] arrayOfString2 = new String[1];
          arrayOfString2[0] = String.valueOf(localCursor.getLong(0));
          localContentResolver2.delete(localUri, str, arrayOfString2);
        }
        while (!bool);
        localCursor.close();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    tp.c();
  }
}