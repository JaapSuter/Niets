package com.whatsapp;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Contacts;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class zq extends yq
{
  private static final HashMap<Integer, Bitmap> u;
  private static final String[] z;
  public long f = -1L;
  public uq g = null;
  public String h;
  public Integer i = null;
  public String j;
  public boolean k;
  public boolean l = false;
  public String m = null;
  public transient boolean n;
  public int o;
  public int p;
  public long q;
  public String r;
  public String s;
  public String t;

  static
  {
    String[] arrayOfString = new String[37];
    char[] arrayOfChar1 = "ye\007{5:<\013`!8eH".toCharArray();
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
      arrayOfChar2 = "yr\007c83r\034f;8<\013`!8eH".toCharArray();
      int i5 = arrayOfChar2.length;
      i6 = 0;
      if (i5 <= i6)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\026bFx<7e\033n$&?\006j ".toCharArray();
        int i9 = arrayOfChar3.length;
        i10 = 0;
        if (i9 > i10)
          break label1589;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "&c\007m83|\t{=51\013`:\"p\013{n".toCharArray();
        int i13 = arrayOfChar4.length;
        i14 = 0;
        if (i13 > i14)
          break label1681;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "va��`:3,".toCharArray();
        int i17 = arrayOfChar5.length;
        i18 = 0;
        if (i17 > i18)
          break label1773;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "$~\037P=2,".toCharArray();
        int i21 = arrayOfChar6.length;
        i22 = 0;
        if (i21 > i22)
          break label1865;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "vz\rvi".toCharArray();
        int i25 = arrayOfChar7.length;
        i26 = 0;
        if (i25 > i26)
          break label1957;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "~\035c8".toCharArray();
        int i29 = arrayOfChar8.length;
        i30 = 0;
        if (i29 > i30)
          break label2049;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "v{\001ki".toCharArray();
        int i33 = arrayOfChar9.length;
        i34 = 0;
        if (i33 > i34)
          break label2141;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "vx\033x5k".toCharArray();
        int i37 = arrayOfChar10.length;
        i38 = 0;
        if (i37 > i38)
          break label2233;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "yr\007z:\"1".toCharArray();
        int i41 = arrayOfChar11.length;
        i42 = 0;
        if (i41 > i42)
          break label2325;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "\"t\005".toCharArray();
        int i45 = arrayOfChar12.length;
        i46 = 0;
        if (i45 > i46)
          break label2417;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "5d\033{;;N\032f:1e\007a1".toCharArray();
        int i49 = arrayOfChar13.length;
        i50 = 0;
        if (i49 > i50)
          break label2509;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "v\tb1k".toCharArray();
        int i53 = arrayOfChar14.length;
        i54 = 0;
        if (i53 > i54)
          break label2601;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "vb\034n #bU".toCharArray();
        int i57 = arrayOfChar15.length;
        i58 = 0;
        if (i57 > i58)
          break label2693;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "\027g\t{5$b".toCharArray();
        int i61 = arrayOfChar16.length;
        i62 = 0;
        if (i61 > i62)
          break label2785;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "x{".toCharArray();
        int i65 = arrayOfChar17.length;
        i66 = 0;
        if (i65 > i66)
          break label2877;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "!p\013`:\"p\013{{1t\034<9e\007i5%eG`!\"<\007iy;t\005`&/1".toCharArray();
        int i69 = arrayOfChar18.length;
        i70 = 0;
        if (i69 > i70)
          break label2969;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "vu\rl;2t;{&3p\005/&3e\035}:%1\006z8:".toCharArray();
        int i73 = arrayOfChar19.length;
        i74 = 0;
        if (i73 > i74)
          break label3061;
        arrayOfString[18] = new String(arrayOfChar19).intern();
        arrayOfChar20 = "vt\032};$1\013c;%x\006ht%e\032j5;".toCharArray();
        int i77 = arrayOfChar20.length;
        i78 = 0;
        if (i77 > i78)
          break label3153;
        arrayOfString[19] = new String(arrayOfChar20).intern();
        arrayOfChar21 = "vb\034}17|Hf'v\035c8".toCharArray();
        int i81 = arrayOfChar21.length;
        i82 = 0;
        if (i81 > i82)
          break label3245;
        arrayOfString[20] = new String(arrayOfChar21).intern();
        arrayOfChar22 = "!p\013`:\"p\013{{1t\034<9e\007i5%eG".toCharArray();
        int i85 = arrayOfChar22.length;
        i86 = 0;
        if (i85 > i86)
          break label3337;
        arrayOfString[21] = new String(arrayOfChar22).intern();
        arrayOfChar23 = "!p\013`:\"p\013{{1t\034<9e\007i5%eGj&$~\032/".toCharArray();
        int i89 = arrayOfChar23.length;
        i90 = 0;
        if (i89 > i90)
          break label3429;
        arrayOfString[22] = new String(arrayOfChar23).intern();
        arrayOfChar24 = "$p\037P79\034n7\"N\001ktk1W/\025\030UHb=;t\034v$3,W".toCharArray();
        int i93 = arrayOfChar24.length;
        i94 = 0;
        if (i93 > i94)
          break label3521;
        arrayOfString[23] = new String(arrayOfChar24).intern();
        arrayOfChar25 = "2p\034ng".toCharArray();
        int i97 = arrayOfChar25.length;
        i98 = 0;
        if (i97 > i98)
          break label3613;
        arrayOfString[24] = new String(arrayOfChar25).intern();
        arrayOfChar26 = "2p\034nf".toCharArray();
        int i101 = arrayOfChar26.length;
        i102 = 0;
        if (i101 > i102)
          break label3705;
        arrayOfString[25] = new String(arrayOfChar26).intern();
        arrayOfChar27 = " \f!58u\032`=2?\013z&%~\032!=\"t\005 :7|\r".toCharArray();
        int i105 = arrayOfChar27.length;
        i106 = 0;
        if (i105 > i106)
          break label3797;
        arrayOfString[26] = new String(arrayOfChar27).intern();
        arrayOfChar28 = "#a\fn 3A��` 9W\001c1%".toCharArray();
        int i109 = arrayOfChar28.length;
        i110 = 0;
        if (i109 > i110)
          break label3889;
        arrayOfString[27] = new String(arrayOfChar28).intern();
        arrayOfChar29 = "9a\ra\0279\034n7\"A��` 9X\006!\"B\034}17|".toCharArray();
        int i113 = arrayOfChar29.length;
        i114 = 0;
        if (i113 > i114)
          break label3981;
        arrayOfString[28] = new String(arrayOfChar29).intern();
        arrayOfChar30 = "ve��z941\016f831\005f'%x\006ht?uR".toCharArray();
        int i117 = arrayOfChar30.length;
        i118 = 0;
        if (i117 > i118)
          break label4073;
        arrayOfString[29] = new String(arrayOfChar30).intern();
        arrayOfChar31 = "!p\013`:\"p\013{{1t\034<9e\007| $t\tb{".toCharArray();
        int i121 = arrayOfChar31.length;
        i122 = 0;
        if (i121 > i122)
          break label4165;
        arrayOfString[30] = new String(arrayOfChar31).intern();
        arrayOfChar32 = "vw\035c8vw\001c1v|\001|'?\017/=2+".toCharArray();
        int i125 = arrayOfChar32.length;
        i126 = 0;
        if (i125 > i126)
          break label4257;
        arrayOfString[31] = new String(arrayOfChar32).intern();
        arrayOfChar33 = ";~\035a 3u".toCharArray();
        int i129 = arrayOfChar33.length;
        i130 = 0;
        if (i129 > i130)
          break label4349;
        arrayOfString[32] = new String(arrayOfChar33).intern();
        arrayOfChar34 = ";~\035a 3u7};".toCharArray();
        int i133 = arrayOfChar34.length;
        i134 = 0;
        if (i133 > i134)
          break label4441;
        arrayOfString[33] = new String(arrayOfChar34).intern();
        arrayOfChar35 = "x\007b12x\t".toCharArray();
        int i137 = arrayOfChar35.length;
        i138 = 0;
        if (i137 > i138)
          break label4533;
        arrayOfString[34] = new String(arrayOfChar35).intern();
        arrayOfChar36 = "x{\030h".toCharArray();
        int i141 = arrayOfChar36.length;
        i142 = 0;
        if (i141 > i142)
          break label4625;
        arrayOfString[35] = new String(arrayOfChar36).intern();
        arrayOfChar37 = "\006c\007i=:tH_=5e\035}1%".toCharArray();
        int i145 = arrayOfChar37.length;
        i146 = 0;
        if (i145 > i146)
          break label4717;
        arrayOfString[36] = new String(arrayOfChar37).intern();
        z = arrayOfString;
        u = new HashMap();
      }
    }
    else
    {
      int i3 = arrayOfChar1[i2];
      int i4;
      switch (i2 % 5)
      {
      default:
        i4 = 84;
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
        i4 = 86;
        continue;
        i4 = 17;
        continue;
        i4 = 104;
        continue;
        i4 = 15;
      }
    }
    int i7 = arrayOfChar2[i6];
    int i8;
    switch (i6 % 5)
    {
    default:
      i8 = 84;
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
      i8 = 86;
      continue;
      i8 = 17;
      continue;
      i8 = 104;
      continue;
      i8 = 15;
    }
    label1589: int i11 = arrayOfChar3[i10];
    int i12;
    switch (i10 % 5)
    {
    default:
      i12 = 84;
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
      i12 = 86;
      continue;
      i12 = 17;
      continue;
      i12 = 104;
      continue;
      i12 = 15;
    }
    label1681: int i15 = arrayOfChar4[i14];
    int i16;
    switch (i14 % 5)
    {
    default:
      i16 = 84;
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
      i16 = 86;
      continue;
      i16 = 17;
      continue;
      i16 = 104;
      continue;
      i16 = 15;
    }
    label1773: int i19 = arrayOfChar5[i18];
    int i20;
    switch (i18 % 5)
    {
    default:
      i20 = 84;
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
      i20 = 86;
      continue;
      i20 = 17;
      continue;
      i20 = 104;
      continue;
      i20 = 15;
    }
    label1865: int i23 = arrayOfChar6[i22];
    int i24;
    switch (i22 % 5)
    {
    default:
      i24 = 84;
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
      i24 = 86;
      continue;
      i24 = 17;
      continue;
      i24 = 104;
      continue;
      i24 = 15;
    }
    label1957: int i27 = arrayOfChar7[i26];
    int i28;
    switch (i26 % 5)
    {
    default:
      i28 = 84;
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
      i28 = 86;
      continue;
      i28 = 17;
      continue;
      i28 = 104;
      continue;
      i28 = 15;
    }
    label2049: int i31 = arrayOfChar8[i30];
    int i32;
    switch (i30 % 5)
    {
    default:
      i32 = 84;
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
      i32 = 86;
      continue;
      i32 = 17;
      continue;
      i32 = 104;
      continue;
      i32 = 15;
    }
    label2141: int i35 = arrayOfChar9[i34];
    int i36;
    switch (i34 % 5)
    {
    default:
      i36 = 84;
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
      i36 = 86;
      continue;
      i36 = 17;
      continue;
      i36 = 104;
      continue;
      i36 = 15;
    }
    label2233: int i39 = arrayOfChar10[i38];
    int i40;
    switch (i38 % 5)
    {
    default:
      i40 = 84;
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
      i40 = 86;
      continue;
      i40 = 17;
      continue;
      i40 = 104;
      continue;
      i40 = 15;
    }
    label2325: int i43 = arrayOfChar11[i42];
    int i44;
    switch (i42 % 5)
    {
    default:
      i44 = 84;
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
      i44 = 86;
      continue;
      i44 = 17;
      continue;
      i44 = 104;
      continue;
      i44 = 15;
    }
    label2417: int i47 = arrayOfChar12[i46];
    int i48;
    switch (i46 % 5)
    {
    default:
      i48 = 84;
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
      i48 = 86;
      continue;
      i48 = 17;
      continue;
      i48 = 104;
      continue;
      i48 = 15;
    }
    label2509: int i51 = arrayOfChar13[i50];
    int i52;
    switch (i50 % 5)
    {
    default:
      i52 = 84;
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
      i52 = 86;
      continue;
      i52 = 17;
      continue;
      i52 = 104;
      continue;
      i52 = 15;
    }
    label2601: int i55 = arrayOfChar14[i54];
    int i56;
    switch (i54 % 5)
    {
    default:
      i56 = 84;
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
      i56 = 86;
      continue;
      i56 = 17;
      continue;
      i56 = 104;
      continue;
      i56 = 15;
    }
    label2693: int i59 = arrayOfChar15[i58];
    int i60;
    switch (i58 % 5)
    {
    default:
      i60 = 84;
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
      i60 = 86;
      continue;
      i60 = 17;
      continue;
      i60 = 104;
      continue;
      i60 = 15;
    }
    label2785: int i63 = arrayOfChar16[i62];
    int i64;
    switch (i62 % 5)
    {
    default:
      i64 = 84;
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
      i64 = 86;
      continue;
      i64 = 17;
      continue;
      i64 = 104;
      continue;
      i64 = 15;
    }
    label2877: int i67 = arrayOfChar17[i66];
    int i68;
    switch (i66 % 5)
    {
    default:
      i68 = 84;
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
      i68 = 86;
      continue;
      i68 = 17;
      continue;
      i68 = 104;
      continue;
      i68 = 15;
    }
    label2969: int i71 = arrayOfChar18[i70];
    int i72;
    switch (i70 % 5)
    {
    default:
      i72 = 84;
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
      i72 = 86;
      continue;
      i72 = 17;
      continue;
      i72 = 104;
      continue;
      i72 = 15;
    }
    label3061: int i75 = arrayOfChar19[i74];
    int i76;
    switch (i74 % 5)
    {
    default:
      i76 = 84;
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
      i76 = 86;
      continue;
      i76 = 17;
      continue;
      i76 = 104;
      continue;
      i76 = 15;
    }
    label3153: int i79 = arrayOfChar20[i78];
    int i80;
    switch (i78 % 5)
    {
    default:
      i80 = 84;
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
      i80 = 86;
      continue;
      i80 = 17;
      continue;
      i80 = 104;
      continue;
      i80 = 15;
    }
    label3245: int i83 = arrayOfChar21[i82];
    int i84;
    switch (i82 % 5)
    {
    default:
      i84 = 84;
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
      i84 = 86;
      continue;
      i84 = 17;
      continue;
      i84 = 104;
      continue;
      i84 = 15;
    }
    label3337: int i87 = arrayOfChar22[i86];
    int i88;
    switch (i86 % 5)
    {
    default:
      i88 = 84;
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
      i88 = 86;
      continue;
      i88 = 17;
      continue;
      i88 = 104;
      continue;
      i88 = 15;
    }
    label3429: int i91 = arrayOfChar23[i90];
    int i92;
    switch (i90 % 5)
    {
    default:
      i92 = 84;
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
      i92 = 86;
      continue;
      i92 = 17;
      continue;
      i92 = 104;
      continue;
      i92 = 15;
    }
    label3521: int i95 = arrayOfChar24[i94];
    int i96;
    switch (i94 % 5)
    {
    default:
      i96 = 84;
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
      i96 = 86;
      continue;
      i96 = 17;
      continue;
      i96 = 104;
      continue;
      i96 = 15;
    }
    label3613: int i99 = arrayOfChar25[i98];
    int i100;
    switch (i98 % 5)
    {
    default:
      i100 = 84;
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
      i100 = 86;
      continue;
      i100 = 17;
      continue;
      i100 = 104;
      continue;
      i100 = 15;
    }
    label3705: int i103 = arrayOfChar26[i102];
    int i104;
    switch (i102 % 5)
    {
    default:
      i104 = 84;
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
      i104 = 86;
      continue;
      i104 = 17;
      continue;
      i104 = 104;
      continue;
      i104 = 15;
    }
    label3797: int i107 = arrayOfChar27[i106];
    int i108;
    switch (i106 % 5)
    {
    default:
      i108 = 84;
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
      i108 = 86;
      continue;
      i108 = 17;
      continue;
      i108 = 104;
      continue;
      i108 = 15;
    }
    label3889: int i111 = arrayOfChar28[i110];
    int i112;
    switch (i110 % 5)
    {
    default:
      i112 = 84;
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
      i112 = 86;
      continue;
      i112 = 17;
      continue;
      i112 = 104;
      continue;
      i112 = 15;
    }
    label3981: int i115 = arrayOfChar29[i114];
    int i116;
    switch (i114 % 5)
    {
    default:
      i116 = 84;
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
      i116 = 86;
      continue;
      i116 = 17;
      continue;
      i116 = 104;
      continue;
      i116 = 15;
    }
    label4073: int i119 = arrayOfChar30[i118];
    int i120;
    switch (i118 % 5)
    {
    default:
      i120 = 84;
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
      i120 = 86;
      continue;
      i120 = 17;
      continue;
      i120 = 104;
      continue;
      i120 = 15;
    }
    label4165: int i123 = arrayOfChar31[i122];
    int i124;
    switch (i122 % 5)
    {
    default:
      i124 = 84;
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
      i124 = 86;
      continue;
      i124 = 17;
      continue;
      i124 = 104;
      continue;
      i124 = 15;
    }
    label4257: int i127 = arrayOfChar32[i126];
    int i128;
    switch (i126 % 5)
    {
    default:
      i128 = 84;
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
      i128 = 86;
      continue;
      i128 = 17;
      continue;
      i128 = 104;
      continue;
      i128 = 15;
    }
    label4349: int i131 = arrayOfChar33[i130];
    int i132;
    switch (i130 % 5)
    {
    default:
      i132 = 84;
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
      i132 = 86;
      continue;
      i132 = 17;
      continue;
      i132 = 104;
      continue;
      i132 = 15;
    }
    label4441: int i135 = arrayOfChar34[i134];
    int i136;
    switch (i134 % 5)
    {
    default:
      i136 = 84;
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
      i136 = 86;
      continue;
      i136 = 17;
      continue;
      i136 = 104;
      continue;
      i136 = 15;
    }
    label4533: int i139 = arrayOfChar35[i138];
    int i140;
    switch (i138 % 5)
    {
    default:
      i140 = 84;
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
      i140 = 86;
      continue;
      i140 = 17;
      continue;
      i140 = 104;
      continue;
      i140 = 15;
    }
    label4625: int i143 = arrayOfChar36[i142];
    int i144;
    switch (i142 % 5)
    {
    default:
      i144 = 84;
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
      i144 = 86;
      continue;
      i144 = 17;
      continue;
      i144 = 104;
      continue;
      i144 = 15;
    }
    label4717: int i147 = arrayOfChar37[i146];
    int i148;
    switch (i146 % 5)
    {
    default:
      i148 = 84;
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
      i148 = 86;
      continue;
      i148 = 17;
      continue;
      i148 = 104;
      continue;
      i148 = 15;
    }
  }

  public zq(Cursor paramCursor)
  {
    super(paramCursor.getString(i1), paramCursor.getString(4));
    this.n = i1;
    this.f = paramCursor.getLong(0);
    this.h = paramCursor.getString(7);
    this.i = Integer.valueOf(paramCursor.getInt(8));
    this.j = paramCursor.getString(9);
    String str = paramCursor.getString(5);
    long l1 = paramCursor.getLong(6);
    if (((l1 > 0L) || (l1 == -2L)) && (str != null) && (str.length() >= 5))
    {
      this.g = new uq(l1, str);
      if (yq.e == 0);
    }
    else if (str != null)
    {
      this.m = str;
    }
    if (paramCursor.getInt(2) == i1);
    while (true)
    {
      this.k = i1;
      this.a = paramCursor.getInt(10);
      this.o = paramCursor.getInt(11);
      this.p = paramCursor.getInt(12);
      this.q = paramCursor.getLong(13);
      this.r = paramCursor.getString(14);
      this.s = paramCursor.getString(15);
      this.t = paramCursor.getString(16);
      return;
      i1 = 0;
    }
  }

  public zq(uq paramuq, String paramString1, int paramInt, String paramString2)
  {
    this.n = true;
    this.g = paramuq;
    this.h = paramString1;
    this.i = Integer.valueOf(paramInt);
    this.j = paramString2;
  }

  public zq(String paramString)
  {
    super(paramString);
    this.n = true;
    this.k = true;
    this.g = null;
  }

  public zq(String paramString1, long paramLong, String paramString2, int paramInt, String paramString3)
  {
    this.n = true;
    this.h = paramString2;
    this.i = Integer.valueOf(paramInt);
    this.j = paramString3;
    this.g = new uq(paramLong, paramString1);
  }

  private zq(String paramString1, boolean paramBoolean, String paramString2, long paramLong, String paramString3)
  {
    this.n = true;
    this.b = paramString1;
    this.k = paramBoolean;
    this.h = paramString3;
    this.g = new uq(paramLong, paramString2);
  }

  public static zq a(Cursor paramCursor)
  {
    int i1 = 1;
    String str = paramCursor.getString(i1);
    if (paramCursor.getInt(2) == i1);
    while (true)
    {
      zq localzq = new zq(str, i1, paramCursor.getString(3), paramCursor.getLong(4), paramCursor.getString(5));
      localzq.f = paramCursor.getLong(0);
      return localzq;
      int i2 = 0;
    }
  }

  public static File a(String paramString)
  {
    File localFile1 = new File(App.c, z[36]);
    File localFile2;
    if (!localFile1.exists())
    {
      localFile1.mkdirs();
      localFile2 = new File(localFile1, z[34]);
    }
    try
    {
      localFile2.createNewFile();
      label49: return new File(localFile1, paramString.substring(0, paramString.indexOf("@")) + z[35]);
    }
    catch (IOException localIOException)
    {
      break label49;
    }
  }

  public static void a(Collection<LinkedList<zq>> paramCollection, String paramString)
  {
    int i1 = yq.e;
    int i2 = paramCollection.size();
    g5.b(paramString + z[1] + i2);
    if (App.f < 1)
      return;
    int i3;
    if (i2 < 1000)
    {
      Iterator localIterator1 = paramCollection.iterator();
      i3 = 0;
      do
      {
        if (!localIterator1.hasNext())
          break;
        LinkedList localLinkedList = (LinkedList)localIterator1.next();
        i3 += localLinkedList.size();
        Iterator localIterator2 = localLinkedList.iterator();
        do
        {
          if (!localIterator2.hasNext())
            break;
          ((zq)localIterator2.next());
        }
        while (i1 == 0);
      }
      while (i1 == 0);
    }
    while (true)
    {
      g5.b(paramString + z[0] + i3);
      break;
      i3 = 0;
    }
  }

  public static void a(Collection<zq> paramCollection, String paramString1, String paramString2)
  {
    int i1 = yq.e;
    int i2 = paramCollection.size();
    g5.b(paramString1 + z[10] + i2);
    if (App.f < 1)
      return;
    while (true)
      if (i2 < 5000)
      {
        Iterator localIterator = paramCollection.iterator();
        if (localIterator.hasNext())
        {
          ((zq)localIterator.next());
          if (i1 == 0)
            break;
        }
      }
  }

  public static boolean a(List<zq> paramList, wq paramwq)
  {
    int i1 = yq.e;
    boolean bool1 = false;
    boolean bool2;
    if (paramList != null)
    {
      Iterator localIterator = paramList.iterator();
      bool2 = false;
      if (!localIterator.hasNext())
        break label70;
      if (!paramwq.a((zq)localIterator.next()))
        break label64;
      bool1 = true;
      label52: if (i1 == 0)
        break label58;
    }
    while (true)
    {
      return bool1;
      label58: bool2 = bool1;
      break;
      label64: bool1 = bool2;
      break label52;
      label70: bool1 = bool2;
    }
  }

  public static File b(String paramString)
  {
    File localFile = new File(App.Mb.getFilesDir(), z[15]);
    if (!localFile.exists())
      localFile.mkdirs();
    return new File(localFile, paramString + z[16]);
  }

  public static boolean c(String paramString)
  {
    return paramString.substring(1 + paramString.lastIndexOf("@"), paramString.length()).equals(z[11]);
  }

  public long a()
  {
    if (this.g == null);
    for (long l1 = 0L; ; l1 = this.g.a)
      return l1;
  }

  public Bitmap a(int paramInt, float paramFloat, boolean paramBoolean)
  {
    int i1 = yq.e;
    SoftReference localSoftReference = (SoftReference)App.wb.get(f());
    boolean bool;
    Bitmap localBitmap1;
    InputStream localInputStream;
    if (paramInt >= 144)
    {
      bool = true;
      if ((paramBoolean) && (localSoftReference != null) && (localSoftReference.get() != null))
        break label914;
      localBitmap1 = null;
      localInputStream = null;
    }
    while (true)
    {
      Bitmap localBitmap2;
      try
      {
        while (true)
        {
          if (this.n)
            localInputStream = b(bool);
          if (((o()) || (App.p())) && (this.b != null) && ((!o()) || (!p())))
            if (bool)
            {
              if ((this.o == 0) || (c(true)))
              {
                App.a(this.b, this.o, 1);
                if (i1 == 0);
              }
            }
            else if ((this.p == 0) || (c(false)))
              App.a(this.b, this.p, 2);
          if (localInputStream != null)
          {
            BitmapFactory.Options localOptions = new BitmapFactory.Options();
            localOptions.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(localInputStream, null, localOptions);
            try
            {
              localInputStream.close();
              localInputStream = b(bool);
              if (localInputStream == null)
              {
                g5.d(z[21] + this.b + z[20]);
                localBitmap2 = null;
              }
            }
            catch (IOException localIOException3)
            {
              while (true)
              {
                try
                {
                  localInputStream.close();
                  if (0 != 0)
                    null.recycle();
                  return localBitmap2;
                  bool = false;
                  break;
                  localIOException3 = localIOException3;
                  g5.d(z[21] + this.b + z[19]);
                  g5.d(localIOException3);
                  localBitmap2 = null;
                  if (localInputStream != null)
                    localInputStream.close();
                  if (0 == 0)
                    continue;
                  null.recycle();
                  continue;
                }
                catch (IOException localIOException2)
                {
                  continue;
                }
                localOptions.inSampleSize = Math.max(localOptions.outWidth / paramInt, localOptions.outHeight / paramInt);
                localOptions.inDither = true;
                localOptions.inJustDecodeBounds = false;
                localOptions.inScaled = false;
                localOptions.inPreferredConfig = Bitmap.Config.ARGB_8888;
                localBitmap1 = BitmapFactory.decodeStream(localInputStream, null, localOptions);
                if (localBitmap1 == null)
                {
                  g5.d(z[21] + this.b + z[18]);
                  localBitmap2 = null;
                  if (localInputStream != null)
                    localInputStream.close();
                  if (localBitmap1 != null)
                    localBitmap1.recycle();
                }
                else
                {
                  localBitmap2 = Bitmap.createBitmap(paramInt, paramInt, Bitmap.Config.ARGB_8888);
                  Canvas localCanvas = new Canvas(localBitmap2);
                  Paint localPaint = new Paint();
                  RectF localRectF1 = new RectF(0.0F, 0.0F, paramInt, paramInt);
                  localPaint.setAntiAlias(true);
                  localPaint.setDither(true);
                  localPaint.setFilterBitmap(true);
                  localCanvas.drawARGB(0, 0, 0, 0);
                  localPaint.setColor(-1);
                  localCanvas.drawRoundRect(localRectF1, paramFloat, paramFloat, localPaint);
                  localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                  RectF localRectF2 = new RectF(0.0F, 0.0F, paramInt, paramInt);
                  int i2 = (localBitmap1.getWidth() - localBitmap1.getHeight()) / 2;
                  Rect localRect;
                  if (i2 > 0)
                  {
                    localRect = new Rect(i2, 0, localBitmap1.getWidth() - i2, localBitmap1.getHeight());
                    if (i1 == 0);
                  }
                  else
                  {
                    localRect = new Rect(0, -i2, localBitmap1.getWidth(), i2 + localBitmap1.getHeight());
                  }
                  localCanvas.drawBitmap(localBitmap1, localRect, localRectF2, localPaint);
                  localBitmap1.recycle();
                  if (paramBoolean)
                    App.wb.put(f(), new SoftReference(localBitmap2));
                  if (localInputStream != null)
                    localInputStream.close();
                  if (localBitmap1 != null)
                    localBitmap1.recycle();
                }
              }
            }
          }
        }
        this.n = false;
        localBitmap2 = null;
        if (localInputStream != null)
          localInputStream.close();
        if (0 == 0)
          continue;
        null.recycle();
        continue;
      }
      catch (SQLiteException localSQLiteException)
      {
        g5.d(z[22] + localSQLiteException.toString());
        localBitmap2 = null;
        if (localInputStream != null)
          localInputStream.close();
        if (localBitmap1 == null)
          continue;
        localBitmap1.recycle();
        continue;
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        g5.d(z[17] + localOutOfMemoryError.toString());
        localBitmap2 = null;
        if (localInputStream != null)
          localInputStream.close();
        if (localBitmap1 == null)
          continue;
        localBitmap1.recycle();
        continue;
      }
      finally
      {
        if (localInputStream == null);
      }
      try
      {
        localInputStream.close();
        if (localBitmap1 != null)
          localBitmap1.recycle();
        label911: throw localObject;
        label914: localBitmap2 = (Bitmap)localSoftReference.get();
      }
      catch (IOException localIOException1)
      {
        break label911;
      }
    }
  }

  public Uri a(ContentResolver paramContentResolver)
  {
    if (e() == null);
    for (Uri localUri = null; ; localUri = ContactsContract.RawContacts.getContactLookupUri(paramContentResolver, e()))
      return localUri;
  }

  public InputStream a(ContentResolver paramContentResolver, boolean paramBoolean)
  {
    InputStream localInputStream = null;
    Uri localUri = b(paramContentResolver);
    if ((localUri == null) || ((paramBoolean) && (Build.VERSION.SDK_INT >= 14)));
    try
    {
      String str = z[28];
      Class[] arrayOfClass = new Class[3];
      arrayOfClass[0] = ContentResolver.class;
      arrayOfClass[1] = Uri.class;
      arrayOfClass[2] = Boolean.TYPE;
      Method localMethod = ContactsContract.Contacts.class.getDeclaredMethod(str, arrayOfClass);
      localMethod.setAccessible(true);
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = paramContentResolver;
      arrayOfObject[1] = localUri;
      arrayOfObject[2] = Boolean.valueOf(true);
      localInputStream = (InputStream)localMethod.invoke(null, arrayOfObject);
      return localInputStream;
    }
    catch (SecurityException localSecurityException)
    {
      while (true)
      {
        g5.d(localSecurityException);
        localInputStream = ContactsContract.Contacts.openContactPhotoInputStream(paramContentResolver, localUri);
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      while (true)
        g5.d(localNoSuchMethodException);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      while (true)
        g5.d(localIllegalArgumentException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      while (true)
        g5.d(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      while (true)
        g5.d(localInvocationTargetException);
    }
  }

  protected InputStream a(boolean paramBoolean)
  {
    int i1 = yq.e;
    ContentResolver localContentResolver = App.Mb.getContentResolver();
    InputStream localInputStream = a(localContentResolver, paramBoolean);
    if (localInputStream == null)
    {
      Iterator localIterator = App.w.f(this).iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        Long localLong = (Long)localIterator.next();
        localInputStream = new zq(this.g.b, localLong.longValue(), this.h, 0, null).a(localContentResolver, paramBoolean);
      }
      while (((localInputStream == null) || (i1 != 0)) && (i1 == 0));
    }
    return localInputStream;
  }

  public CharSequence a(Resources paramResources)
  {
    String str;
    if (this.i != null)
      if ((this.i.intValue() == 0) && (this.j != null))
        str = this.j;
    while (true)
    {
      return str;
      str = paramResources.getString(ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(this.i.intValue()));
      continue;
      str = null;
    }
  }

  public void a(int paramInt1, int paramInt2)
  {
    this.o = paramInt1;
    this.p = paramInt2;
    this.q = System.currentTimeMillis();
    App.w.g(this, null);
  }

  public void a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1 != null);
    try
    {
      j5.a(paramArrayOfByte1, g());
      if (paramArrayOfByte2 != null)
        j5.a(paramArrayOfByte2, h());
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      while (true)
        g5.b(z[27], localFileNotFoundException);
    }
    catch (IOException localIOException)
    {
      while (true)
        g5.b(z[27], localIOException);
    }
  }

  public Uri b(ContentResolver paramContentResolver)
  {
    Object localObject = null;
    Uri localUri1 = a(paramContentResolver);
    if (localUri1 != null);
    try
    {
      Uri localUri2 = ContactsContract.Contacts.lookupContact(paramContentResolver, localUri1);
      localObject = localUri2;
      return localObject;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      while (true)
        g5.d(localIllegalArgumentException);
    }
    catch (IllegalStateException localIllegalStateException)
    {
      while (true)
        g5.d(localIllegalStateException);
    }
  }

  public InputStream b(boolean paramBoolean)
  {
    Object localObject = null;
    File localFile;
    if (this.n)
    {
      if ((!o()) && (!App.p()))
        break label252;
      if (!paramBoolean)
        break label155;
      localFile = g();
      if (!localFile.exists())
      {
        localFile = h();
        if (this.o > 0)
        {
          String str = Environment.getExternalStorageState();
          if ((str.equals(z[32])) && (!str.equals(z[33])))
          {
            g5.d(z[30] + this.b + z[31] + this.o);
            this.o = 0;
          }
        }
      }
      if (!localFile.exists())
        break label243;
    }
    while (true)
    {
      try
      {
        FileInputStream localFileInputStream = new FileInputStream(localFile);
        localObject = localFileInputStream;
        return localObject;
        label155: localFile = h();
        if (localFile.exists())
          break;
        localFile = g();
        if (this.p <= 0)
          break;
        g5.d(z[30] + this.b + z[29] + this.p);
        this.p = 0;
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        localObject = a(paramBoolean);
        continue;
      }
      label243: localObject = a(paramBoolean);
      continue;
      label252: localObject = a(paramBoolean);
    }
  }

  public String b()
  {
    if ((this.h != null) && (this.h.length() > 0));
    for (String str = this.h; ; str = a())
      return str;
  }

  public void c()
  {
    if (this.g != null)
    {
      String[] arrayOfString1 = new String[2];
      arrayOfString1[0] = z[25];
      arrayOfString1[1] = z[24];
      ContentResolver localContentResolver = App.ib;
      Uri localUri = ContactsContract.Data.CONTENT_URI;
      String str = z[23];
      String[] arrayOfString2 = new String[2];
      arrayOfString2[0] = Long.toString(this.g.a);
      arrayOfString2[1] = z[26];
      Cursor localCursor = localContentResolver.query(localUri, arrayOfString1, str, arrayOfString2, null);
      if (localCursor != null)
      {
        if (localCursor.moveToNext())
        {
          this.r = localCursor.getString(localCursor.getColumnIndex(z[25]));
          this.s = localCursor.getString(localCursor.getColumnIndex(z[24]));
        }
        localCursor.close();
      }
    }
    if (this.r == null)
      this.r = "";
    if (this.s == null)
      this.s = "";
  }

  public boolean c(boolean paramBoolean)
  {
    if (259200000L + this.q < System.currentTimeMillis());
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public String d()
  {
    if ((this.g != null) && (this.r != null) && (this.r.length() != 0));
    for (String str = this.r; ; str = b())
      return str;
  }

  public Uri e()
  {
    if ((this.g == null) || (this.g.a == -2L) || (this.g.a < 0L));
    for (Uri localUri = null; ; localUri = ContentUris.withAppendedId(ContactsContract.RawContacts.CONTENT_URI, this.g.a))
      return localUri;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    zq localzq = (zq)paramObject;
    if (localzq == null);
    while (true)
    {
      return bool;
      if (((this.g == null) || (localzq.g != null)) && ((this.g != null) || (localzq.g == null)) && (hashCode() == localzq.hashCode()))
        bool = true;
    }
  }

  public String f()
  {
    if (this.g != null);
    for (String str = this.g.toString(); ; str = this.b)
      return str;
  }

  public File g()
  {
    return a(this.b);
  }

  public File h()
  {
    return b(this.b);
  }

  public int hashCode()
  {
    if (this.g != null);
    for (int i1 = this.g.hashCode(); ; i1 = this.b.hashCode())
      return i1;
  }

  public void i()
  {
    g().delete();
    h().delete();
  }

  public void j()
  {
    App.wb.remove(f());
    App.xb.remove(f());
    this.n = true;
  }

  public int k()
  {
    int i1;
    if (eu.f(this.b))
      if (this.b.contains(z[11]))
        i1 = 2130837520;
    while (true)
    {
      return i1;
      i1 = 2130837521;
      continue;
      i1 = 2130837519;
    }
  }

  public Bitmap l()
  {
    int i1 = k();
    Bitmap localBitmap = (Bitmap)u.get(Integer.valueOf(i1));
    if (localBitmap != null);
    while (true)
    {
      return localBitmap;
      Drawable localDrawable = App.Mb.getResources().getDrawable(i1);
      localBitmap = Bitmap.createBitmap(localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
      Canvas localCanvas = new Canvas(localBitmap);
      localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
      localDrawable.draw(localCanvas);
      u.put(Integer.valueOf(i1), localBitmap);
    }
  }

  public String m()
  {
    String str;
    if (App.y.c(this.b))
      str = App.Mb.getString(2131296761);
    while (true)
    {
      return str;
      long l1 = App.y.a(this.b);
      if (l1 == 0L)
        str = "";
      else if (l1 == 1L)
        str = App.Mb.getString(2131296763);
      else
        str = App.Mb.getString(2131296762) + " " + t4.d(App.Mb, l1);
    }
  }

  // ERROR //
  public String n()
  {
    // Byte code:
    //   0: aload_0
    //   1: getstatic 637	com/whatsapp/App:ib	Landroid/content/ContentResolver;
    //   4: invokevirtual 509	com/whatsapp/zq:b	(Landroid/content/ContentResolver;)Landroid/net/Uri;
    //   7: astore_3
    //   8: aload_3
    //   9: ifnull +83 -> 92
    //   12: getstatic 637	com/whatsapp/App:ib	Landroid/content/ContentResolver;
    //   15: aload_3
    //   16: aconst_null
    //   17: aconst_null
    //   18: aconst_null
    //   19: aconst_null
    //   20: invokevirtual 650	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   23: astore 4
    //   25: aload 4
    //   27: ifnull +65 -> 92
    //   30: aload 4
    //   32: invokeinterface 751 1 0
    //   37: ifeq +60 -> 97
    //   40: aload 4
    //   42: aload 4
    //   44: getstatic 122	com/whatsapp/zq:z	[Ljava/lang/String;
    //   47: bipush 12
    //   49: aaload
    //   50: invokeinterface 656 2 0
    //   55: invokeinterface 135 2 0
    //   60: astore 6
    //   62: aload 6
    //   64: astore_2
    //   65: aload 4
    //   67: invokeinterface 657 1 0
    //   72: goto +35 -> 107
    //   75: astore 5
    //   77: aload 4
    //   79: invokeinterface 657 1 0
    //   84: aload 5
    //   86: athrow
    //   87: astore_1
    //   88: aload_1
    //   89: invokestatic 379	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   92: aconst_null
    //   93: astore_2
    //   94: goto +13 -> 107
    //   97: aload 4
    //   99: invokeinterface 657 1 0
    //   104: goto -12 -> 92
    //   107: aload_2
    //   108: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   30	62	75	finally
    //   0	25	87	android/database/sqlite/SQLiteException
    //   65	87	87	android/database/sqlite/SQLiteException
    //   97	104	87	android/database/sqlite/SQLiteException
  }

  public boolean o()
  {
    String str;
    if (this.b == null)
    {
      StringBuffer localStringBuffer1 = new StringBuffer();
      localStringBuffer1.append(z[5]).append(this.f);
      StringBuffer localStringBuffer2 = localStringBuffer1.append(z[8]);
      if (this.b == null)
      {
        str = z[7];
        localStringBuffer2.append(str);
        localStringBuffer1.append(z[6]);
        if (this.g == null)
        {
          localStringBuffer1.append(z[7]);
          if (yq.e == 0);
        }
        else
        {
          localStringBuffer1.append(this.g.a).append("-").append(this.g.b);
        }
        localStringBuffer1.append(z[4]).append(this.i);
        localStringBuffer1.append(z[9]).append(this.k);
        if (this.f != -1L)
          g5.d(z[3] + localStringBuffer1.toString());
      }
    }
    for (boolean bool = false; ; bool = eu.f(this.b))
    {
      return bool;
      str = this.b;
      break;
    }
  }

  public boolean p()
  {
    return this.b.substring(1 + this.b.lastIndexOf("@"), this.b.length()).equals(z[11]);
  }

  public String q()
  {
    String str;
    if (eu.f(this.b))
      if (this.m != null)
        str = this.m;
    while (true)
    {
      return str;
      str = this.b.substring(0, this.b.indexOf("-")) + z[2];
      continue;
      str = null;
    }
  }

  public String toString()
  {
    int i1 = yq.e;
    StringBuffer localStringBuffer1 = new StringBuffer();
    localStringBuffer1.append(z[5]).append(this.f);
    StringBuffer localStringBuffer2 = localStringBuffer1.append(z[8]);
    if (this.b == null);
    for (String str = z[7]; ; str = this.b)
    {
      localStringBuffer2.append(str);
      localStringBuffer1.append(z[6]);
      if (this.g == null)
      {
        localStringBuffer1.append(z[7]);
        if (i1 == 0);
      }
      else
      {
        localStringBuffer1.append(this.g.a).append("-").append(this.g.b);
      }
      localStringBuffer1.append(z[4]).append(this.i);
      localStringBuffer1.append(z[9]).append(this.k);
      if (o())
      {
        localStringBuffer1.append(z[13]).append(b());
        localStringBuffer1.append(z[14]).append(this.c);
        if (i1 == 0);
      }
      else if (App.f >= 1)
      {
        localStringBuffer1.append(z[13]).append(b());
      }
      return localStringBuffer1.toString();
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.zq
 * JD-Core Version:    0.6.1
 */