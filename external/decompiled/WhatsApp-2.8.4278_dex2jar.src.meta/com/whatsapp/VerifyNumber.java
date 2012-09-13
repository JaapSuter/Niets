package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.google.i18n.phonenumbers.AsYouTypeFormatter;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import java.io.IOException;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.HttpException;
import org.xmlpull.v1.XmlPullParserException;

public class VerifyNumber extends UserFeedbackActivity
{
  protected static String j;
  private static final String[] z;
  boolean k = false;
  boolean l = false;
  int m;
  private String n = null;
  private int o = -1;
  PhoneStateListener p = new xd(this);

  static
  {
    String[] arrayOfString = new String[27];
    char[] arrayOfChar1 = "rpa*\n'\005-\r]!\035)bDs".toCharArray();
    int i = arrayOfChar1.length;
    int i1 = 0;
    char[] arrayOfChar2;
    int i5;
    char[] arrayOfChar3;
    int i9;
    char[] arrayOfChar4;
    int i13;
    char[] arrayOfChar5;
    int i17;
    char[] arrayOfChar6;
    int i21;
    char[] arrayOfChar7;
    int i25;
    char[] arrayOfChar8;
    int i29;
    char[] arrayOfChar9;
    int i33;
    char[] arrayOfChar10;
    int i37;
    char[] arrayOfChar11;
    int i41;
    char[] arrayOfChar12;
    int i45;
    char[] arrayOfChar13;
    int i49;
    char[] arrayOfChar14;
    int i53;
    char[] arrayOfChar15;
    int i57;
    char[] arrayOfChar16;
    int i61;
    char[] arrayOfChar17;
    int i65;
    char[] arrayOfChar18;
    int i69;
    char[] arrayOfChar19;
    int i73;
    char[] arrayOfChar20;
    int i77;
    char[] arrayOfChar21;
    int i81;
    char[] arrayOfChar22;
    int i85;
    char[] arrayOfChar23;
    int i89;
    char[] arrayOfChar24;
    int i93;
    char[] arrayOfChar25;
    int i97;
    char[] arrayOfChar26;
    int i101;
    char[] arrayOfChar27;
    int i105;
    if (i <= i1)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = ",Iw8_#Bp<[?^*#\\+Y`\"M9Ca4\0267Of|L4Gk>N4\f".toCharArray();
      int i4 = arrayOfChar2.length;
      i5 = 0;
      if (i4 <= i5)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = ",Iw8_#Bp<[?^*#\\+Y`\"M9Ca4\0263Bs0U3H(2V/Bq#@z".toCharArray();
        int i8 = arrayOfChar3.length;
        i9 = 0;
        if (i8 > i9)
          break label1204;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\001M(+d!\036x".toCharArray();
        int i12 = arrayOfChar4.length;
        i13 = 0;
        if (i12 > i13)
          break label1292;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "j\0345".toCharArray();
        int i16 = arrayOfChar5.length;
        i17 = 0;
        if (i16 > i17)
          break label1380;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = ",Iw8_#Bp<[?^*#\\+Y`\"M9Ca4\0267Bf~_5^h0M?^w>Kz".toCharArray();
        int i20 = arrayOfChar6.length;
        i21 = 0;
        if (i20 > i21)
          break label1468;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = " V".toCharArray();
        int i24 = arrayOfChar7.length;
        i25 = 0;
        if (i24 > i25)
          break label1556;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "\03465".toCharArray();
        int i28 = arrayOfChar8.length;
        i29 = 0;
        if (i28 > i29)
          break label1644;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "��v".toCharArray();
        int i32 = arrayOfChar9.length;
        i33 = 0;
        if (i32 > i33)
          break label1732;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = ",Iw8_#Bp<[?^*#\\+Y`\"M9Ca4\0263Bs0U3H(=X4Kp0^?\f".toCharArray();
        int i36 = arrayOfChar10.length;
        i37 = 0;
        if (i36 > i37)
          break label1820;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "\001m(\013d!\036x".toCharArray();
        int i40 = arrayOfChar11.length;
        i41 = 0;
        if (i40 > i41)
          break label1908;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = ",Iw8_#Bp<[?^*!Q5B`\016M#\\`q".toCharArray();
        int i44 = arrayOfChar12.length;
        i45 = 0;
        if (i44 > i45)
          break label1996;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = ",Iw8_#Bp<[?^*!K?Xq(I(Ek%\0269O(>Kw\\m?L7\001l\"\0244Yi=".toCharArray();
        int i48 = arrayOfChar13.length;
        i49 = 0;
        if (i48 > i49)
          break label2084;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "\006h".toCharArray();
        int i52 = arrayOfChar14.length;
        i53 = 0;
        if (i52 > i53)
          break label2172;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = ",Iw8_#Bp<[?^*7V(Ad%M?^(4A9Iu%P5B".toCharArray();
        int i56 = arrayOfChar15.length;
        i57 = 0;
        if (i56 > i57)
          break label2260;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = ",Iw8_#Bp<[?^*!K?Xq(I(Ek%\0264C(7V(Ad%M?^%".toCharArray();
        int i60 = arrayOfChar16.length;
        i61 = 0;
        if (i60 > i61)
          break label2348;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = ",Iw8_#Bp<[?^*6\\.\\m>W?Bk$T8Iw~\\(^j#\031".toCharArray();
        int i64 = arrayOfChar17.length;
        i65 = 0;
        if (i64 > i65)
          break label2436;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = ",Iw8_#Bp<[?^*?V.Ec(\026/Bs4K3Jl4]".toCharArray();
        int i68 = arrayOfChar18.length;
        i69 = 0;
        if (i68 > i69)
          break label2524;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "9ChN2Mq\"X*\\+'\\(Ec(W/Ag4KtHl0U5K".toCharArray();
        int i72 = arrayOfChar19.length;
        i73 = 0;
        if (i72 > i73)
          break label2612;
        arrayOfString[18] = new String(arrayOfChar19).intern();
        arrayOfChar20 = ",Iw8_#Bp<[?^*2V4Jl6\031".toCharArray();
        int i76 = arrayOfChar20.length;
        i77 = 0;
        if (i76 > i77)
          break label2700;
        arrayOfString[19] = new String(arrayOfChar20).intern();
        arrayOfChar21 = ",Iw8_#Bp<[?^*?\\.[j#Ru".toCharArray();
        int i80 = arrayOfChar21.length;
        i81 = 0;
        if (i80 > i81)
          break label2788;
        arrayOfString[20] = new String(arrayOfChar21).intern();
        arrayOfChar22 = ",Iw8_#Bp<[?^*?\\.[j#RuBd<\\g".toCharArray();
        int i84 = arrayOfChar22.length;
        i85 = 0;
        if (i84 > i85)
          break label2876;
        arrayOfString[21] = new String(arrayOfChar22).intern();
        arrayOfChar23 = "uOj5\\g".toCharArray();
        int i88 = arrayOfChar23.length;
        i89 = 0;
        if (i88 > i89)
          break label2964;
        arrayOfString[22] = new String(arrayOfChar23).intern();
        arrayOfChar24 = ",Iw8_#Bp<[?^*\"P7Cuq".toCharArray();
        int i92 = arrayOfChar24.length;
        i93 = 0;
        if (i92 > i93)
          break label3052;
        arrayOfString[23] = new String(arrayOfChar24).intern();
        arrayOfChar25 = ",Iw8_#Bp<[?^*?V.Ec(\026,Iw8_3Ia".toCharArray();
        int i96 = arrayOfChar25.length;
        i97 = 0;
        if (i96 > i97)
          break label3140;
        arrayOfString[24] = new String(arrayOfChar25).intern();
        arrayOfChar26 = ")Ii7\024)Ik5\0249Hh0".toCharArray();
        int i100 = arrayOfChar26.length;
        i101 = 0;
        if (i100 > i101)
          break label3228;
        arrayOfString[25] = new String(arrayOfChar26).intern();
        arrayOfChar27 = ")Ii7\024)Ik5\0240Ml=[(Cn4W".toCharArray();
        int i104 = arrayOfChar27.length;
        i105 = 0;
        if (i104 > i105)
          break label3316;
        arrayOfString[26] = new String(arrayOfChar27).intern();
        z = arrayOfString;
        j = "";
      }
    }
    else
    {
      int i2 = arrayOfChar1[i1];
      int i3;
      switch (i1 % 5)
      {
      default:
        i3 = 57;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[i1] = (char)(i3 ^ i2);
        i1++;
        break;
        i3 = 90;
        continue;
        i3 = 44;
        continue;
        i3 = 5;
        continue;
        i3 = 81;
      }
    }
    int i6 = arrayOfChar2[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 57;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i5] = (char)(i7 ^ i6);
      i5++;
      break;
      i7 = 90;
      continue;
      i7 = 44;
      continue;
      i7 = 5;
      continue;
      i7 = 81;
    }
    label1204: int i10 = arrayOfChar3[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 57;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i9] = (char)(i11 ^ i10);
      i9++;
      break;
      i11 = 90;
      continue;
      i11 = 44;
      continue;
      i11 = 5;
      continue;
      i11 = 81;
    }
    label1292: int i14 = arrayOfChar4[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 57;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i13] = (char)(i15 ^ i14);
      i13++;
      break;
      i15 = 90;
      continue;
      i15 = 44;
      continue;
      i15 = 5;
      continue;
      i15 = 81;
    }
    label1380: int i18 = arrayOfChar5[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 57;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i17] = (char)(i19 ^ i18);
      i17++;
      break;
      i19 = 90;
      continue;
      i19 = 44;
      continue;
      i19 = 5;
      continue;
      i19 = 81;
    }
    label1468: int i22 = arrayOfChar6[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 57;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i21] = (char)(i23 ^ i22);
      i21++;
      break;
      i23 = 90;
      continue;
      i23 = 44;
      continue;
      i23 = 5;
      continue;
      i23 = 81;
    }
    label1556: int i26 = arrayOfChar7[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 57;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i25] = (char)(i27 ^ i26);
      i25++;
      break;
      i27 = 90;
      continue;
      i27 = 44;
      continue;
      i27 = 5;
      continue;
      i27 = 81;
    }
    label1644: int i30 = arrayOfChar8[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 57;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar8[i29] = (char)(i31 ^ i30);
      i29++;
      break;
      i31 = 90;
      continue;
      i31 = 44;
      continue;
      i31 = 5;
      continue;
      i31 = 81;
    }
    label1732: int i34 = arrayOfChar9[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 57;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar9[i33] = (char)(i35 ^ i34);
      i33++;
      break;
      i35 = 90;
      continue;
      i35 = 44;
      continue;
      i35 = 5;
      continue;
      i35 = 81;
    }
    label1820: int i38 = arrayOfChar10[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 57;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar10[i37] = (char)(i39 ^ i38);
      i37++;
      break;
      i39 = 90;
      continue;
      i39 = 44;
      continue;
      i39 = 5;
      continue;
      i39 = 81;
    }
    label1908: int i42 = arrayOfChar11[i41];
    int i43;
    switch (i41 % 5)
    {
    default:
      i43 = 57;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar11[i41] = (char)(i43 ^ i42);
      i41++;
      break;
      i43 = 90;
      continue;
      i43 = 44;
      continue;
      i43 = 5;
      continue;
      i43 = 81;
    }
    label1996: int i46 = arrayOfChar12[i45];
    int i47;
    switch (i45 % 5)
    {
    default:
      i47 = 57;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar12[i45] = (char)(i47 ^ i46);
      i45++;
      break;
      i47 = 90;
      continue;
      i47 = 44;
      continue;
      i47 = 5;
      continue;
      i47 = 81;
    }
    label2084: int i50 = arrayOfChar13[i49];
    int i51;
    switch (i49 % 5)
    {
    default:
      i51 = 57;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar13[i49] = (char)(i51 ^ i50);
      i49++;
      break;
      i51 = 90;
      continue;
      i51 = 44;
      continue;
      i51 = 5;
      continue;
      i51 = 81;
    }
    label2172: int i54 = arrayOfChar14[i53];
    int i55;
    switch (i53 % 5)
    {
    default:
      i55 = 57;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar14[i53] = (char)(i55 ^ i54);
      i53++;
      break;
      i55 = 90;
      continue;
      i55 = 44;
      continue;
      i55 = 5;
      continue;
      i55 = 81;
    }
    label2260: int i58 = arrayOfChar15[i57];
    int i59;
    switch (i57 % 5)
    {
    default:
      i59 = 57;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar15[i57] = (char)(i59 ^ i58);
      i57++;
      break;
      i59 = 90;
      continue;
      i59 = 44;
      continue;
      i59 = 5;
      continue;
      i59 = 81;
    }
    label2348: int i62 = arrayOfChar16[i61];
    int i63;
    switch (i61 % 5)
    {
    default:
      i63 = 57;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar16[i61] = (char)(i63 ^ i62);
      i61++;
      break;
      i63 = 90;
      continue;
      i63 = 44;
      continue;
      i63 = 5;
      continue;
      i63 = 81;
    }
    label2436: int i66 = arrayOfChar17[i65];
    int i67;
    switch (i65 % 5)
    {
    default:
      i67 = 57;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar17[i65] = (char)(i67 ^ i66);
      i65++;
      break;
      i67 = 90;
      continue;
      i67 = 44;
      continue;
      i67 = 5;
      continue;
      i67 = 81;
    }
    label2524: int i70 = arrayOfChar18[i69];
    int i71;
    switch (i69 % 5)
    {
    default:
      i71 = 57;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar18[i69] = (char)(i71 ^ i70);
      i69++;
      break;
      i71 = 90;
      continue;
      i71 = 44;
      continue;
      i71 = 5;
      continue;
      i71 = 81;
    }
    label2612: int i74 = arrayOfChar19[i73];
    int i75;
    switch (i73 % 5)
    {
    default:
      i75 = 57;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar19[i73] = (char)(i75 ^ i74);
      i73++;
      break;
      i75 = 90;
      continue;
      i75 = 44;
      continue;
      i75 = 5;
      continue;
      i75 = 81;
    }
    label2700: int i78 = arrayOfChar20[i77];
    int i79;
    switch (i77 % 5)
    {
    default:
      i79 = 57;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar20[i77] = (char)(i79 ^ i78);
      i77++;
      break;
      i79 = 90;
      continue;
      i79 = 44;
      continue;
      i79 = 5;
      continue;
      i79 = 81;
    }
    label2788: int i82 = arrayOfChar21[i81];
    int i83;
    switch (i81 % 5)
    {
    default:
      i83 = 57;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar21[i81] = (char)(i83 ^ i82);
      i81++;
      break;
      i83 = 90;
      continue;
      i83 = 44;
      continue;
      i83 = 5;
      continue;
      i83 = 81;
    }
    label2876: int i86 = arrayOfChar22[i85];
    int i87;
    switch (i85 % 5)
    {
    default:
      i87 = 57;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar22[i85] = (char)(i87 ^ i86);
      i85++;
      break;
      i87 = 90;
      continue;
      i87 = 44;
      continue;
      i87 = 5;
      continue;
      i87 = 81;
    }
    label2964: int i90 = arrayOfChar23[i89];
    int i91;
    switch (i89 % 5)
    {
    default:
      i91 = 57;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar23[i89] = (char)(i91 ^ i90);
      i89++;
      break;
      i91 = 90;
      continue;
      i91 = 44;
      continue;
      i91 = 5;
      continue;
      i91 = 81;
    }
    label3052: int i94 = arrayOfChar24[i93];
    int i95;
    switch (i93 % 5)
    {
    default:
      i95 = 57;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar24[i93] = (char)(i95 ^ i94);
      i93++;
      break;
      i95 = 90;
      continue;
      i95 = 44;
      continue;
      i95 = 5;
      continue;
      i95 = 81;
    }
    label3140: int i98 = arrayOfChar25[i97];
    int i99;
    switch (i97 % 5)
    {
    default:
      i99 = 57;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar25[i97] = (char)(i99 ^ i98);
      i97++;
      break;
      i99 = 90;
      continue;
      i99 = 44;
      continue;
      i99 = 5;
      continue;
      i99 = 81;
    }
    label3228: int i102 = arrayOfChar26[i101];
    int i103;
    switch (i101 % 5)
    {
    default:
      i103 = 57;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar26[i101] = (char)(i103 ^ i102);
      i101++;
      break;
      i103 = 90;
      continue;
      i103 = 44;
      continue;
      i103 = 5;
      continue;
      i103 = 81;
    }
    label3316: int i106 = arrayOfChar27[i105];
    int i107;
    switch (i105 % 5)
    {
    default:
      i107 = 57;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar27[i105] = (char)(i107 ^ i106);
      i105++;
      break;
      i107 = 90;
      continue;
      i107 = 44;
      continue;
      i107 = 5;
      continue;
      i107 = 81;
    }
  }

  static aq a(String paramString1, String paramString2, Locale paramLocale, String paramString3, String paramString4)
    throws IOException, HttpException, XmlPullParserException, Exception
  {
    boolean bool = DialogToastListActivity.f;
    String str1 = paramLocale.getCountry();
    String str2 = paramLocale.getLanguage();
    String str3 = z[4];
    Object localObject = z[4];
    String str4 = App.db.getNetworkOperator();
    String str5 = mh.a(paramString2);
    String str6 = f();
    if ((str1 == null) || (!Pattern.matches(z[10], str1)))
    {
      g5.b(z[2] + str1);
      str1 = z[8];
    }
    if ((str2 == null) || (!Pattern.matches(z[3], str2)))
    {
      g5.b(z[9] + str2);
      str2 = z[6];
    }
    Matcher localMatcher;
    if (str4 != null)
    {
      localMatcher = Pattern.compile(z[0]).matcher(str4);
      if (localMatcher.find())
        str3 = localMatcher.group(1);
    }
    while (true)
    {
      try
      {
        Locale localLocale = Locale.US;
        String str9 = z[7];
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(localMatcher.group(2));
        String str10 = String.format(localLocale, str9, arrayOfObject);
        localObject = str10;
        str7 = str3;
        String str8;
        if ((mh.d()) || (mh.b() != null))
        {
          str8 = null;
          if (!bool);
        }
        else
        {
          str8 = App.db.getSubscriberId();
        }
        if ((str6 != null) && (str6.length() == 0))
          str6 = null;
        return yp.a(paramString1, paramString1 + paramString2, paramString2, str2, str1, (String)localObject, str7, str8, paramString3, paramString4, str5, str6);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        g5.d(z[5] + localNumberFormatException.toString());
        if (!bool)
          break label390;
      }
      g5.b(z[1] + str4);
      label390: String str7 = str3;
    }
  }

  static String a(String paramString1, String paramString2)
  {
    int i = 0;
    boolean bool = DialogToastListActivity.f;
    Object localObject1;
    if ((paramString1 == null) || (paramString2 == null))
    {
      g5.d(z[12]);
      localObject1 = null;
    }
    label165: label324: 
    while (true)
    {
      return localObject1;
      localObject1 = "+" + paramString1 + " " + paramString2;
      AsYouTypeFormatter localAsYouTypeFormatter1;
      char[] arrayOfChar;
      int i1;
      int i2;
      Object localObject2;
      try
      {
        AsYouTypeFormatter localAsYouTypeFormatter2 = PhoneNumberUtil.getInstance().getAsYouTypeFormatter(jp.f(paramString1));
        localAsYouTypeFormatter1 = localAsYouTypeFormatter2;
        if (localAsYouTypeFormatter1 == null)
          g5.d(z[15] + paramString1);
      }
      catch (NullPointerException localNullPointerException)
      {
        while (true)
        {
          g5.b(z[14], localNullPointerException);
          localAsYouTypeFormatter1 = null;
        }
      }
      catch (IOException localIOException)
      {
        while (true)
        {
          g5.b(z[14], localIOException);
          localAsYouTypeFormatter1 = null;
        }
        arrayOfChar = paramString2.toCharArray();
        i1 = arrayOfChar.length;
        i2 = 0;
        localObject2 = localObject1;
      }
      label222: int i3;
      if (i2 < i1)
      {
        char c = arrayOfChar[i2];
        i++;
        if (i == paramString2.toString().length())
        {
          localObject1 = localAsYouTypeFormatter1.inputDigit(c);
          if (paramString2.equalsIgnoreCase(((String)localObject1).replaceAll(z[13], "")))
          {
            localAsYouTypeFormatter1.inputDigit(c);
            i3 = i2 + 1;
            if (!bool);
          }
        }
      }
      while (true)
      {
        if (((String)localObject1).startsWith("+" + paramString1))
          break label324;
        localObject1 = "+" + paramString1 + " " + (String)localObject1;
        break;
        i2 = i3;
        localObject2 = localObject1;
        break label165;
        localObject1 = localObject2;
        break label222;
        localObject1 = localObject2;
      }
    }
  }

  static String b(String paramString)
  {
    boolean bool = DialogToastListActivity.f;
    if (paramString == null);
    StringBuilder localStringBuilder;
    for (String str = null; ; str = localStringBuilder.toString())
    {
      return str;
      localStringBuilder = new StringBuilder();
      int i = 0;
      do
      {
        if (i >= paramString.length())
          break;
        localStringBuilder.append(0x12 ^ paramString.charAt(i));
        int i1 = 1;
        do
        {
          if (i1 >= 6)
            break;
          localStringBuilder.append((char)(0x12 ^ 48 + new Random().nextInt(10)));
          i1++;
        }
        while (!bool);
        i++;
      }
      while (!bool);
    }
  }

  protected static SpannableStringBuilder c(String paramString1, String paramString2)
  {
    SpannableStringBuilder localSpannableStringBuilder;
    if (paramString1 == null)
      localSpannableStringBuilder = null;
    while (true)
    {
      return localSpannableStringBuilder;
      localSpannableStringBuilder = new SpannableStringBuilder(paramString1);
      if (paramString2 != null)
      {
        int i = paramString1.indexOf(paramString2);
        if (i != -1)
          localSpannableStringBuilder.setSpan(new StyleSpan(1), i, i + paramString2.length(), 33);
      }
    }
  }

  static String c(String paramString)
  {
    boolean bool = DialogToastListActivity.f;
    if (paramString == null);
    StringBuilder localStringBuilder;
    for (String str = null; ; str = localStringBuilder.toString())
    {
      return str;
      localStringBuilder = new StringBuilder();
      int i = 0;
      do
      {
        if (i >= paramString.length())
          break;
        localStringBuilder.append(0x12 ^ paramString.charAt(i));
        i += 6;
      }
      while (!bool);
    }
  }

  static String f()
  {
    try
    {
      String str2 = App.db.getLine1Number();
      str1 = str2;
      return str1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        g5.c(z[16] + localException.toString());
        String str1 = null;
      }
    }
  }

  protected void a()
  {
    g5.b(z[24]);
    long l1 = System.currentTimeMillis();
    String str1 = getString(2131296308);
    String str2 = getString(2131296310);
    String str3 = getString(2131296312);
    Notification localNotification = new Notification(2130838516, str1, l1);
    localNotification.defaults = 3;
    localNotification.flags = 16;
    Context localContext = getApplicationContext();
    localNotification.setLatestEventInfo(localContext, str2, str3, PendingIntent.getActivity(localContext, 0, new Intent(localContext, RegisterName.class), 268435456));
    App.a(this, 2);
    App.gb.notify(1, localNotification);
  }

  protected void a(ServiceState paramServiceState)
  {
  }

  protected void a(String paramString)
  {
    d(paramString);
  }

  String b(String paramString1, String paramString2)
  {
    int i = App.db.getNetworkType();
    g5.b(z[20] + i);
    String str1 = App.db.getNetworkOperator();
    String str2 = App.db.getNetworkOperatorName();
    NetworkInfo localNetworkInfo = App.eb.getActiveNetworkInfo();
    g5.b(z[21] + str2 + z[22] + str1);
    g5.b(z[19] + getResources().getConfiguration().mcc + " " + getResources().getConfiguration().mnc);
    g5.b(z[23] + App.db.getSimOperator());
    if ((jp.b(paramString1, str1)) || (jp.a(paramString1, str2)) || (jp.a(paramString1, localNetworkInfo)));
    while (true)
    {
      return paramString2;
      paramString2 = "+" + paramString1 + paramString2;
    }
  }

  protected void b(int paramInt)
  {
    g5.b(z[17]);
    long l1 = System.currentTimeMillis();
    String str1 = getString(2131296309);
    String str2 = getString(2131296311);
    String str3 = getString(2131296313);
    Notification localNotification = new Notification(2130838516, str1, l1);
    localNotification.defaults = 3;
    localNotification.flags = 16;
    Context localContext = getApplicationContext();
    Intent localIntent = new Intent(localContext, getClass());
    if (paramInt != -1)
      localIntent.putExtra(z[18], paramInt);
    localIntent.addFlags(536870912);
    localNotification.setLatestEventInfo(localContext, str2, str3, PendingIntent.getActivity(localContext, 0, localIntent, 268435456));
    App.gb.notify(1, localNotification);
  }

  protected void c()
  {
    b(-1);
  }

  protected void c(int paramInt)
  {
    if ((this.l) || (isFinishing()))
    {
      b(paramInt);
      if (!DialogToastListActivity.f);
    }
    else
    {
      showDialog(paramInt);
    }
  }

  public void d(int paramInt)
  {
    if ((!this.l) && (!isFinishing()))
    {
      a(paramInt);
      if (!DialogToastListActivity.f);
    }
    else
    {
      this.n = getString(paramInt);
    }
  }

  protected boolean d()
  {
    boolean bool = true;
    if ((mh.b() != null) || (mh.d()) || ((App.f != 3) && (mh.e())) || (!mh.c(getApplication())))
    {
      j = z[26];
      if (!DialogToastListActivity.f);
    }
    for (int i = 0; ; i = bool)
    {
      if (this.m == 2)
        j = z[25];
      for (i = 0; ; i = 0)
      {
        if ((e()) && (i != 0));
        while (true)
        {
          return bool;
          bool = false;
        }
      }
    }
  }

  public void e(int paramInt)
  {
    if ((!this.l) && (!isFinishing()))
    {
      showDialog(paramInt);
      if (!DialogToastListActivity.f);
    }
    else
    {
      this.o = paramInt;
    }
  }

  protected void e(String paramString)
  {
    j = paramString;
    App.b(this, paramString);
  }

  protected boolean e()
  {
    if (App.db.getNetworkType() != 11);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void f(String paramString)
  {
    if ((!this.l) && (!isFinishing()))
    {
      super.c(paramString);
      if (!DialogToastListActivity.f);
    }
    else
    {
      this.n = paramString;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.m = App.db.getPhoneType();
    g5.b(z[11] + this.m);
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 109:
    }
    for (Object localObject = super.onCreateDialog(paramInt); ; localObject = new AlertDialog.Builder(this).setMessage(2131296334).setPositiveButton(2131296332, new w6(this)).setNeutralButton(2131296268, new v6(this)).create())
      return localObject;
  }

  public void onPause()
  {
    this.l = true;
    super.onPause();
    App.b(this, j);
  }

  public void onResume()
  {
    this.l = false;
    super.onResume();
    j = App.f(this);
    if (this.n != null)
      c(this.n);
    if (this.o != -1)
      showDialog(this.o);
    this.n = null;
    this.o = -1;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.VerifyNumber
 * JD-Core Version:    0.6.1
 */