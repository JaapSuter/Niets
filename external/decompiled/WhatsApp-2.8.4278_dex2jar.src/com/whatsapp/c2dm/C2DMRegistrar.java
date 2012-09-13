package com.whatsapp.c2dm;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.ConnectivityManager;
import android.os.SystemClock;
import com.whatsapp.App;
import com.whatsapp.g5;
import java.io.File;
import java.util.Random;

public class C2DMRegistrar extends IntentService
{
  private static final Random a;
  public static int b;
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[44];
    char[] arrayOfChar1 = "\013s\024>a��}\rcw\030lWs$\fqWS$,Q+uq\001o\rbw\032".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\013.\035}9\035r\013uq\001o\rud\rx".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\032y\037bs\033t".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label1857;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\013s\024>q\007s\036|sF}\027td\007u\035>uZx\024>\006h\034~bFN<W_;H+QB!S7".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label1949;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\013.\035}9\032y\036ye\034n\030d\007rVbs\016n\034c~".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label2041;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "\013s\024>a��}\rcw\030lWs$\fqWS$,Q+uq\001o\rbw\0322*DW:H".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label2133;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "\032y\036O\f".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label2225;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "\013.\035}9\032y\036ye\034n\030d\007rVsz\r}\013?p\tu\025".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label2317;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "\013.\035}I\032y\036O\f".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label2409;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "\013.\035}9\032y\036ye\034n\030d\007rVbs\031i\034cb".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label2501;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "\tp\030b{".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label2593;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "\005o".toCharArray();
        int i40 = arrayOfChar12.length;
        i41 = 0;
        if (i40 > i41)
          break label2685;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "Z%J)#](M!.[(".toCharArray();
        int i44 = arrayOfChar13.length;
        i45 = 0;
        if (i44 > i45)
          break label2777;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "\013s\024>q\007s\036|sF}\027td\007u\035>uZx\024>\006h\034~bFN<W_;H<B".toCharArray();
        int i48 = arrayOfChar14.length;
        i49 = 0;
        if (i48 > i49)
          break label2869;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "\013.\035}9\n}\032{y\016zY".toCharArray();
        int i52 = arrayOfChar15.length;
        i53 = 0;
        if (i52 > i53)
          break label2961;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "\033y\027ts\032".toCharArray();
        int i56 = arrayOfChar16.length;
        i57 = 0;
        if (i56 > i57)
          break label3053;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "\013.\035}9\032y\036ye\034n\030d\007rVgw\001h\020~q".toCharArray();
        int i60 = arrayOfChar17.length;
        i61 = 0;
        if (i60 > i61)
          break label3145;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "\tl\t".toCharArray();
        int i64 = arrayOfChar18.length;
        i65 = 0;
        if (i64 > i65)
          break label3237;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "\013.\035}I\n}\032{y\016z".toCharArray();
        int i68 = arrayOfChar19.length;
        i69 = 0;
        if (i68 > i69)
          break label3329;
        arrayOfString[18] = new String(arrayOfChar19).intern();
        arrayOfChar20 = "\013.\035}9\032y\036ye\034n\030d\007rVrw\013w\026vpGo\030fsGz\030yz\rx".toCharArray();
        int i72 = arrayOfChar20.length;
        i73 = 0;
        if (i72 > i73)
          break label3421;
        arrayOfString[19] = new String(arrayOfChar20).intern();
        arrayOfChar21 = "\033t\030bs\fC\tbs\016o".toCharArray();
        int i76 = arrayOfChar21.length;
        i77 = 0;
        if (i76 > i77)
          break label3513;
        arrayOfString[20] = new String(arrayOfChar21).intern();
        arrayOfChar22 = "\013.\035}9\033t\030bs\fl\013up\033u\027vyG".toCharArray();
        int i80 = arrayOfChar22.length;
        i81 = 0;
        if (i80 > i81)
          break label3605;
        arrayOfString[21] = new String(arrayOfChar22).intern();
        arrayOfChar23 = "\013.\035}9\033t\030bs\fl\013up\033u\027vyGk\013yb\r!".toCharArray();
        int i84 = arrayOfChar23.length;
        i85 = 0;
        if (i84 > i85)
          break label3697;
        arrayOfString[22] = new String(arrayOfChar23).intern();
        arrayOfChar24 = "\013s\024>q\007s\036|sF}\027td\007u\035>uZx\024>\006h\034~bFI7BS/U*DS:".toCharArray();
        int i88 = arrayOfChar24.length;
        i89 = 0;
        if (i88 > i89)
          break label3789;
        arrayOfString[23] = new String(arrayOfChar24).intern();
        arrayOfChar25 = "\013.\035}9\035r\013uq\001o\rbw\034u\026~".toCharArray();
        int i92 = arrayOfChar25.length;
        i93 = 0;
        if (i92 > i93)
          break label3881;
        arrayOfString[24] = new String(arrayOfChar25).intern();
        arrayOfChar26 = "\013.\035}9\032y\037bs\033t".toCharArray();
        int i96 = arrayOfChar26.length;
        i97 = 0;
        if (i96 > i97)
          break label3973;
        arrayOfString[25] = new String(arrayOfChar26).intern();
        arrayOfChar27 = "\013.\035}9\032y\036ye\034y\013urH".toCharArray();
        int i100 = arrayOfChar27.length;
        i101 = 0;
        if (i100 > i101)
          break label4065;
        arrayOfString[26] = new String(arrayOfChar27).intern();
        arrayOfChar28 = "\013.\035}9\032y\036ye\034y\013urGr\034g".toCharArray();
        int i104 = arrayOfChar28.length;
        i105 = 0;
        if (i104 > i105)
          break label4157;
        arrayOfString[27] = new String(arrayOfChar28).intern();
        arrayOfChar29 = "Hj\030|c\r!".toCharArray();
        int i108 = arrayOfChar29.length;
        i109 = 0;
        if (i108 > i109)
          break label4249;
        arrayOfString[28] = new String(arrayOfChar29).intern();
        arrayOfChar30 = "\013.\035}9\032y\036ye\034n\030d\007rVcw\036yVvw\001p".toCharArray();
        int i112 = arrayOfChar30.length;
        i113 = 0;
        if (i112 > i113)
          break label4341;
        arrayOfString[29] = new String(arrayOfChar30).intern();
        arrayOfChar31 = "\013.\035}9\032y\036ye\034n\030d\007rVcw\036yVvw\001pVsy\006h\030yxU".toCharArray();
        int i116 = arrayOfChar31.length;
        i117 = 0;
        if (i116 > i117)
          break label4433;
        arrayOfString[30] = new String(arrayOfChar31).intern();
        arrayOfChar32 = "\013.\035}9\032y\036ye\034n\030d\007rVrw\013w\026vpGn\034cs\0343\037q\004y\035".toCharArray();
        int i120 = arrayOfChar32.length;
        i121 = 0;
        if (i120 > i121)
          break label4525;
        arrayOfString[31] = new String(arrayOfChar32).intern();
        arrayOfChar33 = "Ho\034b`\rnD".toCharArray();
        int i124 = arrayOfChar33.length;
        i125 = 0;
        if (i124 > i125)
          break label4617;
        arrayOfString[32] = new String(arrayOfChar33).intern();
        arrayOfChar34 = "\013.\035}9\032y\036ye\034n\030d\007rVcw\036y\0350".toCharArray();
        int i128 = arrayOfChar34.length;
        i129 = 0;
        if (i128 > i129)
          break label4709;
        arrayOfString[33] = new String(arrayOfChar34).intern();
        arrayOfChar35 = "\013.\035}9\032y\036ye\034n\030d\007rVyx\036}\025yr".toCharArray();
        int i132 = arrayOfChar35.length;
        i133 = 0;
        if (i132 > i133)
          break label4801;
        arrayOfString[34] = new String(arrayOfChar35).intern();
        arrayOfChar36 = "\013.\035}9\032y\036ye\034n\030d\007rV}\033q\030du��<\nq`\rxD".toCharArray();
        int i136 = arrayOfChar36.length;
        i137 = 0;
        if (i136 > i137)
          break label4893;
        arrayOfString[35] = new String(arrayOfChar36).intern();
        arrayOfChar37 = "\013.\035}9\032y\036ye\034n\030d\007rVcw\036y\0350x\035p\025".toCharArray();
        int i140 = arrayOfChar37.length;
        i141 = 0;
        if (i140 > i141)
          break label4985;
        arrayOfString[36] = new String(arrayOfChar37).intern();
        arrayOfChar38 = "\013.\035}9\032y\036ye\034n\030d\007rVud\032s\0130".toCharArray();
        int i144 = arrayOfChar38.length;
        i145 = 0;
        if (i144 > i145)
          break label5077;
        arrayOfString[37] = new String(arrayOfChar38).intern();
        arrayOfChar39 = "\013.\035}9\032y\036ye\034n\030d\007rVud\032s\0130d\rh\013i\006{".toCharArray();
        int i148 = arrayOfChar39.length;
        i149 = 0;
        if (i148 > i149)
          break label5169;
        arrayOfString[38] = new String(arrayOfChar39).intern();
        arrayOfChar40 = ";Y+F_+Y&^Y<C8FW!P8RZ-".toCharArray();
        int i152 = arrayOfChar40.length;
        i153 = 0;
        if (i152 > i153)
          break label5261;
        arrayOfString[39] = new String(arrayOfChar40).intern();
        arrayOfChar41 = "\032y\036ye\034n\030d\007r&yr".toCharArray();
        int i156 = arrayOfChar41.length;
        i157 = 0;
        if (i156 > i157)
          break label5353;
        arrayOfString[40] = new String(arrayOfChar41).intern();
        arrayOfChar42 = "\035r\013uq\001o\rud\rx".toCharArray();
        int i160 = arrayOfChar42.length;
        i161 = 0;
        if (i160 > i161)
          break label5445;
        arrayOfString[41] = new String(arrayOfChar42).intern();
        arrayOfChar43 = "\001{\027d\001r\0360uZx\0240d\r{\020cb\032}\ryy\006<\020~b\rr\r0a\001h\0210x\035p\0250\f".toCharArray();
        int i164 = arrayOfChar43.length;
        i165 = 0;
        if (i164 > i165)
          break label5537;
        arrayOfString[42] = new String(arrayOfChar43).intern();
        arrayOfChar44 = "\rn\013d".toCharArray();
        int i168 = arrayOfChar44.length;
        i169 = 0;
        if (i168 > i169)
          break label5629;
        arrayOfString[43] = new String(arrayOfChar44).intern();
        z = arrayOfString;
        a = new Random();
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 22;
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
        m = 104;
        continue;
        m = 28;
        continue;
        m = 121;
        continue;
        m = 16;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 22;
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
      i3 = 104;
      continue;
      i3 = 28;
      continue;
      i3 = 121;
      continue;
      i3 = 16;
    }
    label1857: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 22;
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
      i7 = 104;
      continue;
      i7 = 28;
      continue;
      i7 = 121;
      continue;
      i7 = 16;
    }
    label1949: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 22;
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
      i11 = 104;
      continue;
      i11 = 28;
      continue;
      i11 = 121;
      continue;
      i11 = 16;
    }
    label2041: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 22;
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
      i15 = 104;
      continue;
      i15 = 28;
      continue;
      i15 = 121;
      continue;
      i15 = 16;
    }
    label2133: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 22;
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
      i19 = 104;
      continue;
      i19 = 28;
      continue;
      i19 = 121;
      continue;
      i19 = 16;
    }
    label2225: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 22;
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
      i23 = 104;
      continue;
      i23 = 28;
      continue;
      i23 = 121;
      continue;
      i23 = 16;
    }
    label2317: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 22;
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
      i27 = 104;
      continue;
      i27 = 28;
      continue;
      i27 = 121;
      continue;
      i27 = 16;
    }
    label2409: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 22;
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
      i31 = 104;
      continue;
      i31 = 28;
      continue;
      i31 = 121;
      continue;
      i31 = 16;
    }
    label2501: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 22;
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
      i35 = 104;
      continue;
      i35 = 28;
      continue;
      i35 = 121;
      continue;
      i35 = 16;
    }
    label2593: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 22;
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
      i39 = 104;
      continue;
      i39 = 28;
      continue;
      i39 = 121;
      continue;
      i39 = 16;
    }
    label2685: int i42 = arrayOfChar12[i41];
    int i43;
    switch (i41 % 5)
    {
    default:
      i43 = 22;
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
      i43 = 104;
      continue;
      i43 = 28;
      continue;
      i43 = 121;
      continue;
      i43 = 16;
    }
    label2777: int i46 = arrayOfChar13[i45];
    int i47;
    switch (i45 % 5)
    {
    default:
      i47 = 22;
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
      i47 = 104;
      continue;
      i47 = 28;
      continue;
      i47 = 121;
      continue;
      i47 = 16;
    }
    label2869: int i50 = arrayOfChar14[i49];
    int i51;
    switch (i49 % 5)
    {
    default:
      i51 = 22;
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
      i51 = 104;
      continue;
      i51 = 28;
      continue;
      i51 = 121;
      continue;
      i51 = 16;
    }
    label2961: int i54 = arrayOfChar15[i53];
    int i55;
    switch (i53 % 5)
    {
    default:
      i55 = 22;
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
      i55 = 104;
      continue;
      i55 = 28;
      continue;
      i55 = 121;
      continue;
      i55 = 16;
    }
    label3053: int i58 = arrayOfChar16[i57];
    int i59;
    switch (i57 % 5)
    {
    default:
      i59 = 22;
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
      i59 = 104;
      continue;
      i59 = 28;
      continue;
      i59 = 121;
      continue;
      i59 = 16;
    }
    label3145: int i62 = arrayOfChar17[i61];
    int i63;
    switch (i61 % 5)
    {
    default:
      i63 = 22;
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
      i63 = 104;
      continue;
      i63 = 28;
      continue;
      i63 = 121;
      continue;
      i63 = 16;
    }
    label3237: int i66 = arrayOfChar18[i65];
    int i67;
    switch (i65 % 5)
    {
    default:
      i67 = 22;
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
      i67 = 104;
      continue;
      i67 = 28;
      continue;
      i67 = 121;
      continue;
      i67 = 16;
    }
    label3329: int i70 = arrayOfChar19[i69];
    int i71;
    switch (i69 % 5)
    {
    default:
      i71 = 22;
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
      i71 = 104;
      continue;
      i71 = 28;
      continue;
      i71 = 121;
      continue;
      i71 = 16;
    }
    label3421: int i74 = arrayOfChar20[i73];
    int i75;
    switch (i73 % 5)
    {
    default:
      i75 = 22;
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
      i75 = 104;
      continue;
      i75 = 28;
      continue;
      i75 = 121;
      continue;
      i75 = 16;
    }
    label3513: int i78 = arrayOfChar21[i77];
    int i79;
    switch (i77 % 5)
    {
    default:
      i79 = 22;
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
      i79 = 104;
      continue;
      i79 = 28;
      continue;
      i79 = 121;
      continue;
      i79 = 16;
    }
    label3605: int i82 = arrayOfChar22[i81];
    int i83;
    switch (i81 % 5)
    {
    default:
      i83 = 22;
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
      i83 = 104;
      continue;
      i83 = 28;
      continue;
      i83 = 121;
      continue;
      i83 = 16;
    }
    label3697: int i86 = arrayOfChar23[i85];
    int i87;
    switch (i85 % 5)
    {
    default:
      i87 = 22;
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
      i87 = 104;
      continue;
      i87 = 28;
      continue;
      i87 = 121;
      continue;
      i87 = 16;
    }
    label3789: int i90 = arrayOfChar24[i89];
    int i91;
    switch (i89 % 5)
    {
    default:
      i91 = 22;
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
      i91 = 104;
      continue;
      i91 = 28;
      continue;
      i91 = 121;
      continue;
      i91 = 16;
    }
    label3881: int i94 = arrayOfChar25[i93];
    int i95;
    switch (i93 % 5)
    {
    default:
      i95 = 22;
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
      i95 = 104;
      continue;
      i95 = 28;
      continue;
      i95 = 121;
      continue;
      i95 = 16;
    }
    label3973: int i98 = arrayOfChar26[i97];
    int i99;
    switch (i97 % 5)
    {
    default:
      i99 = 22;
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
      i99 = 104;
      continue;
      i99 = 28;
      continue;
      i99 = 121;
      continue;
      i99 = 16;
    }
    label4065: int i102 = arrayOfChar27[i101];
    int i103;
    switch (i101 % 5)
    {
    default:
      i103 = 22;
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
      i103 = 104;
      continue;
      i103 = 28;
      continue;
      i103 = 121;
      continue;
      i103 = 16;
    }
    label4157: int i106 = arrayOfChar28[i105];
    int i107;
    switch (i105 % 5)
    {
    default:
      i107 = 22;
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
      i107 = 104;
      continue;
      i107 = 28;
      continue;
      i107 = 121;
      continue;
      i107 = 16;
    }
    label4249: int i110 = arrayOfChar29[i109];
    int i111;
    switch (i109 % 5)
    {
    default:
      i111 = 22;
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
      i111 = 104;
      continue;
      i111 = 28;
      continue;
      i111 = 121;
      continue;
      i111 = 16;
    }
    label4341: int i114 = arrayOfChar30[i113];
    int i115;
    switch (i113 % 5)
    {
    default:
      i115 = 22;
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
      i115 = 104;
      continue;
      i115 = 28;
      continue;
      i115 = 121;
      continue;
      i115 = 16;
    }
    label4433: int i118 = arrayOfChar31[i117];
    int i119;
    switch (i117 % 5)
    {
    default:
      i119 = 22;
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
      i119 = 104;
      continue;
      i119 = 28;
      continue;
      i119 = 121;
      continue;
      i119 = 16;
    }
    label4525: int i122 = arrayOfChar32[i121];
    int i123;
    switch (i121 % 5)
    {
    default:
      i123 = 22;
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
      i123 = 104;
      continue;
      i123 = 28;
      continue;
      i123 = 121;
      continue;
      i123 = 16;
    }
    label4617: int i126 = arrayOfChar33[i125];
    int i127;
    switch (i125 % 5)
    {
    default:
      i127 = 22;
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
      i127 = 104;
      continue;
      i127 = 28;
      continue;
      i127 = 121;
      continue;
      i127 = 16;
    }
    label4709: int i130 = arrayOfChar34[i129];
    int i131;
    switch (i129 % 5)
    {
    default:
      i131 = 22;
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
      i131 = 104;
      continue;
      i131 = 28;
      continue;
      i131 = 121;
      continue;
      i131 = 16;
    }
    label4801: int i134 = arrayOfChar35[i133];
    int i135;
    switch (i133 % 5)
    {
    default:
      i135 = 22;
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
      i135 = 104;
      continue;
      i135 = 28;
      continue;
      i135 = 121;
      continue;
      i135 = 16;
    }
    label4893: int i138 = arrayOfChar36[i137];
    int i139;
    switch (i137 % 5)
    {
    default:
      i139 = 22;
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
      i139 = 104;
      continue;
      i139 = 28;
      continue;
      i139 = 121;
      continue;
      i139 = 16;
    }
    label4985: int i142 = arrayOfChar37[i141];
    int i143;
    switch (i141 % 5)
    {
    default:
      i143 = 22;
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
      i143 = 104;
      continue;
      i143 = 28;
      continue;
      i143 = 121;
      continue;
      i143 = 16;
    }
    label5077: int i146 = arrayOfChar38[i145];
    int i147;
    switch (i145 % 5)
    {
    default:
      i147 = 22;
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
      i147 = 104;
      continue;
      i147 = 28;
      continue;
      i147 = 121;
      continue;
      i147 = 16;
    }
    label5169: int i150 = arrayOfChar39[i149];
    int i151;
    switch (i149 % 5)
    {
    default:
      i151 = 22;
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
      i151 = 104;
      continue;
      i151 = 28;
      continue;
      i151 = 121;
      continue;
      i151 = 16;
    }
    label5261: int i154 = arrayOfChar40[i153];
    int i155;
    switch (i153 % 5)
    {
    default:
      i155 = 22;
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
      i155 = 104;
      continue;
      i155 = 28;
      continue;
      i155 = 121;
      continue;
      i155 = 16;
    }
    label5353: int i158 = arrayOfChar41[i157];
    int i159;
    switch (i157 % 5)
    {
    default:
      i159 = 22;
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
      i159 = 104;
      continue;
      i159 = 28;
      continue;
      i159 = 121;
      continue;
      i159 = 16;
    }
    label5445: int i162 = arrayOfChar42[i161];
    int i163;
    switch (i161 % 5)
    {
    default:
      i163 = 22;
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
      i163 = 104;
      continue;
      i163 = 28;
      continue;
      i163 = 121;
      continue;
      i163 = 16;
    }
    label5537: int i166 = arrayOfChar43[i165];
    int i167;
    switch (i165 % 5)
    {
    default:
      i167 = 22;
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
      i167 = 104;
      continue;
      i167 = 28;
      continue;
      i167 = 121;
      continue;
      i167 = 16;
    }
    label5629: int i170 = arrayOfChar44[i169];
    int i171;
    switch (i169 % 5)
    {
    default:
      i171 = 22;
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
      i171 = 104;
      continue;
      i171 = 28;
      continue;
      i171 = 121;
      continue;
      i171 = 16;
    }
  }

  public C2DMRegistrar()
  {
    super(z[0]);
  }

  private int a()
  {
    int i = 0;
    int j = getSharedPreferences(getString(2131296258), 0).getInt(z[18], 0);
    if (j > 0)
      i = 100 * a.nextInt(j);
    return i;
  }

  public static void a(Context paramContext)
  {
    int i = b;
    g5.b(z[4]);
    Intent localIntent = new Intent(z[3]);
    localIntent.putExtra(z[2], z[2]);
    a(paramContext, localIntent);
    if (i != 0)
      App.wc = 1 + App.wc;
  }

  public static void a(Context paramContext, Intent paramIntent)
  {
    paramIntent.setClassName(paramContext, z[0]);
    paramContext.startService(paramIntent);
  }

  public static void a(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent(z[5]);
    if (paramString != null)
      localIntent.putExtra(z[6], paramString);
    a(paramContext, localIntent);
  }

  private void a(Intent paramIntent)
  {
    int i = b;
    String str1 = paramIntent.getStringExtra(z[43]);
    String str2 = paramIntent.getStringExtra(z[41]);
    String str3 = paramIntent.getStringExtra(z[2]);
    String str4 = paramIntent.getStringExtra(z[40]);
    if (str1 != null)
    {
      b(str1);
      if (i == 0);
    }
    else if (str2 != null)
    {
      f();
      if (i == 0);
    }
    else if (str3 != null)
    {
      e();
      if (i == 0);
    }
    else if (str4 != null)
    {
      c(str4);
      if (i == 0);
    }
    else
    {
      g5.c(z[42]);
    }
  }

  private void a(String paramString)
  {
    int i = b;
    String str = h();
    if (str == null)
    {
      g5.b(z[36]);
      a(false);
      if (i == 0);
    }
    else
    {
      g5.b(z[33] + str);
      if (paramString == null)
      {
        g5.b(z[34]);
        d();
        if (i == 0);
      }
      else if (!paramString.equals(str))
      {
        g5.b(z[35] + str + z[32] + paramString);
        e(str);
      }
    }
  }

  private void a(boolean paramBoolean)
  {
    int i = b;
    Intent localIntent = new Intent(z[13]);
    localIntent.putExtra(z[17], PendingIntent.getBroadcast(this, 0, new Intent(), 0));
    localIntent.putExtra(z[15], z[12]);
    PendingIntent localPendingIntent1 = PendingIntent.getService(this, 0, localIntent, 536870912);
    if ((paramBoolean) || (localPendingIntent1 == null))
    {
      int j = a();
      if (j > 0)
      {
        g5.b(z[14] + j + z[11]);
        PendingIntent localPendingIntent2 = PendingIntent.getService(this, 0, localIntent, 0);
        ((AlarmManager)getSystemService(z[10])).set(3, SystemClock.elapsedRealtime() + j, localPendingIntent2);
        if (i == 0);
      }
      else
      {
        g5.b(z[9]);
        startService(localIntent);
      }
      if (i == 0);
    }
    else
    {
      g5.b(z[16]);
    }
  }

  private void b()
  {
    int i = getSharedPreferences(getString(2131296258), 0).getInt(z[18], 0);
    if (i == 0)
    {
      i = 2;
      if (b == 0);
    }
    else
    {
      i *= 2;
      if (i > 864000)
        i = 864000;
    }
    if (!getSharedPreferences(getString(2131296258), 0).edit().putInt(z[18], i).commit())
      g5.d(z[19]);
  }

  private void b(String paramString)
  {
    if (paramString.equals(z[39]))
    {
      g5.b(z[38]);
      b();
      a(true);
      if (b == 0);
    }
    else
    {
      g5.c(z[37].concat(paramString));
      g();
    }
  }

  public static boolean b(Context paramContext)
  {
    boolean bool = false;
    int i = b;
    if ((paramContext.getSharedPreferences(paramContext.getString(2131296258), 0).contains(z[8])) && (App.eb.getBackgroundDataSetting()))
      bool = true;
    if (App.wc != 0)
      b = i + 1;
    return bool;
  }

  private void c()
  {
    if (!getSharedPreferences(getString(2131296258), 0).edit().remove(z[18]).commit())
      g5.d(z[31]);
  }

  private void c(String paramString)
  {
    g5.b(z[26] + paramString);
    c();
    if (h() == null)
    {
      g5.b(z[27]);
      App.c(this, 0);
    }
    d(paramString);
    e(paramString);
  }

  private void d()
  {
    g5.b(z[24]);
    Intent localIntent = new Intent(z[23]);
    localIntent.putExtra(z[17], PendingIntent.getBroadcast(this, 0, new Intent(), 0));
    startService(localIntent);
  }

  private void d(String paramString)
  {
    if (!getSharedPreferences(getString(2131296258), 0).edit().putString(z[8], paramString).commit())
    {
      g5.d(z[29]);
      g5.b(z[30] + getSharedPreferences(getString(2131296258), 0).contains(z[8]) + z[28] + getSharedPreferences(getString(2131296258), 0).getString(z[8], null));
      i();
    }
  }

  private void e()
  {
    g5.b(z[25]);
    a(false);
  }

  private void e(String paramString)
  {
    App.i(paramString);
  }

  private void f()
  {
    g5.b(z[1]);
    g();
    a(false);
  }

  private void g()
  {
    if (!getSharedPreferences(getString(2131296258), 0).edit().remove(z[8]).commit())
      g5.d(z[7]);
  }

  private String h()
  {
    return getSharedPreferences(getString(2131296258), 0).getString(z[8], null);
  }

  private void i()
  {
    int i = b;
    File localFile1 = new File(App.Mb.getFilesDir().getParentFile(), z[20]);
    g5.b(z[22] + localFile1.canWrite());
    File[] arrayOfFile = localFile1.listFiles();
    if (arrayOfFile != null)
    {
      int j = arrayOfFile.length;
      int k = 0;
      do
      {
        if (k >= j)
          break;
        File localFile2 = arrayOfFile[k];
        g5.b(z[21] + localFile2.getName() + " " + localFile2.length() + " " + localFile2.canWrite());
        k++;
      }
      while (i == 0);
    }
  }

  public void onHandleIntent(Intent paramIntent)
  {
    if (paramIntent.getAction().equals(z[3]))
    {
      a(paramIntent);
      if (b == 0);
    }
    else if (paramIntent.getAction().equals(z[5]))
    {
      a(paramIntent.getStringExtra(z[6]));
    }
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    int i = 3;
    if (paramIntent.getAction().equals(z[i]))
      super.onStartCommand(paramIntent, paramInt1, paramInt2);
    while (true)
    {
      return i;
      super.onStartCommand(paramIntent, paramInt1, paramInt2);
      i = 2;
    }
  }
}