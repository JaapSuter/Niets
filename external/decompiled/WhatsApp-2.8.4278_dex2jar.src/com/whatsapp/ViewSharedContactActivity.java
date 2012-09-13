package com.whatsapp;

import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.content.ContentProviderResult;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Im;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.CommonDataKinds.StructuredPostal;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b;
import e;
import h;
import i;
import j;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k;
import l;
import m;
import wb;

public class ViewSharedContactActivity extends DialogToastActivity
{
  private static final String[] z;
  g f = null;
  boolean g = false;
  Bitmap h = null;
  boolean i = false;
  String j;
  String k;
  String l;
  LinearLayout m;

  static
  {
    String[] arrayOfString = new String[50];
    char[] arrayOfChar1 = "zq=G\flt;KS".toCharArray();
    int n = arrayOfChar1.length;
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
    char[] arrayOfChar28;
    int i109;
    char[] arrayOfChar29;
    int i113;
    char[] arrayOfChar30;
    int i117;
    char[] arrayOfChar31;
    int i121;
    char[] arrayOfChar32;
    int i125;
    char[] arrayOfChar33;
    int i129;
    char[] arrayOfChar34;
    int i133;
    char[] arrayOfChar35;
    int i137;
    char[] arrayOfChar36;
    int i141;
    char[] arrayOfChar37;
    int i145;
    char[] arrayOfChar38;
    int i149;
    char[] arrayOfChar39;
    int i153;
    char[] arrayOfChar40;
    int i157;
    char[] arrayOfChar41;
    int i161;
    char[] arrayOfChar42;
    int i165;
    char[] arrayOfChar43;
    int i169;
    char[] arrayOfChar44;
    int i173;
    char[] arrayOfChar45;
    int i177;
    char[] arrayOfChar46;
    int i181;
    char[] arrayOfChar47;
    int i185;
    char[] arrayOfChar48;
    int i189;
    char[] arrayOfChar49;
    int i193;
    char[] arrayOfChar50;
    int i197;
    if (n <= i1)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "p-[\bc".toCharArray();
      int i4 = arrayOfChar2.length;
      i5 = 0;
      if (i4 <= i5)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "jr?F\005".toCharArray();
        int i8 = arrayOfChar3.length;
        i9 = 0;
        if (i8 > i9)
          break label2073;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "w1A\f5".toCharArray();
        int i12 = arrayOfChar4.length;
        i13 = 0;
        if (i12 > i13)
          break label2165;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "yv;X\032g~,J\rlp0[\blk?L\035fi7[\020 z&[\fal7@\007/".toCharArray();
        int i16 = arrayOfChar5.length;
        i17 = 0;
        if (i16 > i17)
          break label2257;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "yq:\001\ba{,@��k1=Z\033|p,\001��{z3��\031`l*N\005\"~:K\033jl-p\037=".toCharArray();
        int i20 = arrayOfChar6.length;
        i21 = 0;
        if (i20 > i21)
          break label2349;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "yq:\001\ba{,@��k1=Z\033|p,\001��{z3��\006}x?A��u~*F\006a".toCharArray();
        int i24 = arrayOfChar7.length;
        i25 = 0;
        if (i24 > i25)
          break label2441;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "k~*N[".toCharArray();
        int i28 = arrayOfChar8.length;
        i29 = 0;
        if (i28 > i29)
          break label2533;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "k~*NX?".toCharArray();
        int i32 = arrayOfChar9.length;
        i33 = 0;
        if (i32 > i33)
          break label2625;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "k~*N\\".toCharArray();
        int i36 = arrayOfChar10.length;
        i37 = 0;
        if (i36 > i37)
          break label2717;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "yq:\001\ba{,@��k1=Z\033|p,\001��{z3����b".toCharArray();
        int i40 = arrayOfChar11.length;
        i41 = 0;
        if (i40 > i41)
          break label2809;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "yq:\001\ba{,@��k1=Z\033|p,\001��{z3��\031gp0J6y-".toCharArray();
        int i44 = arrayOfChar12.length;
        i45 = 0;
        if (i44 > i45)
          break label2901;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "n|=@\034ak\001[\020z".toCharArray();
        int i48 = arrayOfChar13.length;
        i49 = 0;
        if (i48 > i49)
          break label2993;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "k~*N_".toCharArray();
        int i52 = arrayOfChar14.length;
        i53 = 0;
        if (i52 > i53)
          break label3085;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "yq:\001\ba{,@��k1=Z\033|p,\001��{z3��\fb~7C6y-".toCharArray();
        int i56 = arrayOfChar15.length;
        i57 = 0;
        if (i56 > i57)
          break label3177;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "k~*NX:".toCharArray();
        int i60 = arrayOfChar16.length;
        i61 = 0;
        if (i60 > i61)
          break label3269;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "yv;X6|w?]\fk@=@\007{~=[Faz)p\007zr<J\033 q;J\rP{;C\035n@-V\007l".toCharArray();
        int i64 = arrayOfChar17.length;
        i65 = 0;
        if (i64 > i65)
          break label3361;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "yq:\001\ba{,@��k1=Z\033|p,\001��{z3��\007f|5A\bbz".toCharArray();
        int i68 = arrayOfChar18.length;
        i69 = 0;
        if (i68 > i69)
          break label3453;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "yq:\001\ba{,@��k1=Z\033|p,\001��{z3��\031gp*@".toCharArray();
        int i72 = arrayOfChar19.length;
        i73 = 0;
        if (i72 > i73)
          break label3545;
        arrayOfString[18] = new String(arrayOfChar19).intern();
        arrayOfChar20 = "yv;X\032g~,J\rlp0[\blk?L\035fi7[\020/".toCharArray();
        int i76 = arrayOfChar20.length;
        i77 = 0;
        if (i76 > i77)
          break label3637;
        arrayOfString[19] = new String(arrayOfChar20).intern();
        arrayOfChar21 = "bv3J\035vo;".toCharArray();
        int i80 = arrayOfChar21.length;
        i81 = 0;
        if (i80 > i81)
          break label3729;
        arrayOfString[20] = new String(arrayOfChar21).intern();
        arrayOfChar22 = "AV\035d'NR\033".toCharArray();
        int i84 = arrayOfChar22.length;
        i85 = 0;
        if (i84 > i85)
          break label3821;
        arrayOfString[21] = new String(arrayOfChar22).intern();
        arrayOfChar23 = "yq:\001\ba{,@��k1=Z\033|p,\001��{z3��\007nr;".toCharArray();
        int i88 = arrayOfChar23.length;
        i89 = 0;
        if (i88 > i89)
          break label3913;
        arrayOfString[22] = new String(arrayOfChar23).intern();
        arrayOfChar24 = "n|=@\034ak\001A\bbz".toCharArray();
        int i92 = arrayOfChar24.length;
        i93 = 0;
        if (i92 > i93)
          break label4005;
        arrayOfString[23] = new String(arrayOfChar24).intern();
        arrayOfChar25 = "k~*N]".toCharArray();
        int i96 = arrayOfChar25.length;
        i97 = 0;
        if (i96 > i97)
          break label4097;
        arrayOfString[24] = new String(arrayOfChar25).intern();
        arrayOfChar26 = "yq:\001\ba{,@��k1=Z\033|p,\001��{z3��\n`q*N\n{@;Y\fak".toCharArray();
        int i100 = arrayOfChar26.length;
        i101 = 0;
        if (i100 > i101)
          break label4189;
        arrayOfString[25] = new String(arrayOfChar26).intern();
        arrayOfChar27 = "}~)p\n`q*N\n{@7K".toCharArray();
        int i104 = arrayOfChar27.length;
        i105 = 0;
        if (i104 > i105)
          break label4281;
        arrayOfString[26] = new String(arrayOfChar27).intern();
        arrayOfChar28 = "lp3\001\ba{,@��k1=@\007{~=[\032".toCharArray();
        int i108 = arrayOfChar28.length;
        i109 = 0;
        if (i108 > i109)
          break label4373;
        arrayOfString[27] = new String(arrayOfChar28).intern();
        arrayOfChar29 = "M[\037v".toCharArray();
        int i112 = arrayOfChar29.length;
        i113 = 0;
        if (i112 > i113)
          break label4465;
        arrayOfString[28] = new String(arrayOfChar29).intern();
        arrayOfChar30 = "k~*NZ".toCharArray();
        int i116 = arrayOfChar30.length;
        i117 = 0;
        if (i116 > i117)
          break label4557;
        arrayOfString[29] = new String(arrayOfChar30).intern();
        arrayOfChar31 = "k~*NX".toCharArray();
        int i120 = arrayOfChar31.length;
        i121 = 0;
        if (i120 > i121)
          break label4649;
        arrayOfString[30] = new String(arrayOfChar31).intern();
        arrayOfChar32 = "n{:p\032g~,J\rP|1A\035n|*��".toCharArray();
        int i124 = arrayOfChar32.length;
        i125 = 0;
        if (i124 > i125)
          break label4741;
        arrayOfString[31] = new String(arrayOfChar32).intern();
        arrayOfChar33 = "yv;X6|w?]\fk@=@\007{~=[Fzq5@\036a@=@\007{~=[6zo:N\035j%".toCharArray();
        int i128 = arrayOfChar33.length;
        i129 = 0;
        if (i128 > i129)
          break label4833;
        arrayOfString[32] = new String(arrayOfChar33).intern();
        arrayOfChar34 = "k~*NQ".toCharArray();
        int i132 = arrayOfChar34.length;
        i133 = 0;
        if (i132 > i133)
          break label4925;
        arrayOfString[33] = new String(arrayOfChar34).intern();
        arrayOfChar35 = "yv;X\032g~,J\rlp0[\blk?L\035fi7[\020 k'_\f j0D\007`h0\017".toCharArray();
        int i136 = arrayOfChar35.length;
        i137 = 0;
        if (i136 > i137)
          break label5017;
        arrayOfString[34] = new String(arrayOfChar35).intern();
        arrayOfChar36 = "/c~".toCharArray();
        int i140 = arrayOfChar36.length;
        i141 = 0;
        if (i140 > i141)
          break label5109;
        arrayOfString[35] = new String(arrayOfChar36).intern();
        arrayOfChar37 = "k~*NP".toCharArray();
        int i144 = arrayOfChar37.length;
        i145 = 0;
        if (i144 > i145)
          break label5201;
        arrayOfString[36] = new String(arrayOfChar37).intern();
        arrayOfChar38 = "yv;X6|w?]\fk@=@\007{~=[Flm;N\035j@=@\007{~=[S/".toCharArray();
        int i148 = arrayOfChar38.length;
        i149 = 0;
        if (i148 > i149)
          break label5293;
        arrayOfString[37] = new String(arrayOfChar38).intern();
        arrayOfChar39 = "k~*N^".toCharArray();
        int i152 = arrayOfChar39.length;
        i153 = 0;
        if (i152 > i153)
          break label5385;
        arrayOfString[38] = new String(arrayOfChar39).intern();
        arrayOfChar40 = "ZM\022".toCharArray();
        int i156 = arrayOfChar40.length;
        i157 = 0;
        if (i156 > i157)
          break label5477;
        arrayOfString[39] = new String(arrayOfChar40).intern();
        arrayOfChar41 = "lp0[\blk\001F\r".toCharArray();
        int i160 = arrayOfChar41.length;
        i161 = 0;
        if (i160 > i161)
          break label5569;
        arrayOfString[40] = new String(arrayOfChar41).intern();
        arrayOfChar42 = "'w*[\031sw*[\031|6d��F'D\002XDR4\002\001@$D\002XDR4v��2Shs\017G  {\t\bboe\0224%6a".toCharArray();
        int i164 = arrayOfChar42.length;
        i165 = 0;
        if (i164 > i165)
          break label5661;
        arrayOfString[41] = new String(arrayOfChar42).intern();
        arrayOfChar43 = "yv;X\032g~,J\rlp0[\blkqL\033j~*JFy|?]\r/v-\017\007zs2\016".toCharArray();
        int i168 = arrayOfChar43.length;
        i169 = 0;
        if (i168 > i169)
          break label5753;
        arrayOfString[42] = new String(arrayOfChar43).intern();
        arrayOfChar44 = "ev:".toCharArray();
        int i172 = arrayOfChar44.length;
        i173 = 0;
        if (i172 > i173)
          break label5845;
        arrayOfString[43] = new String(arrayOfChar44).intern();
        arrayOfChar45 = "y|?]\r".toCharArray();
        int i176 = arrayOfChar45.length;
        i177 = 0;
        if (i176 > i177)
          break label5937;
        arrayOfString[44] = new String(arrayOfChar45).intern();
        arrayOfChar46 = "yv;X\001nm;K\n`q*N\n{02@\bk@=@\007{~=[6w1[\006Py?F\005j{~".toCharArray();
        int i180 = arrayOfChar46.length;
        i181 = 0;
        if (i180 > i181)
          break label6029;
        arrayOfString[45] = new String(arrayOfChar46).intern();
        arrayOfChar47 = "j{7[6lp0[\blk\001F\007ip".toCharArray();
        int i184 = arrayOfChar47.length;
        i185 = 0;
        if (i184 > i185)
          break label6121;
        arrayOfString[46] = new String(arrayOfChar47).intern();
        arrayOfChar48 = "aj2C".toCharArray();
        int i188 = arrayOfChar48.length;
        i189 = 0;
        if (i188 > i189)
          break label6213;
        arrayOfString[47] = new String(arrayOfChar48).intern();
        arrayOfChar49 = "c~'@\034{@7A\017c~*J\033".toCharArray();
        int i192 = arrayOfChar49.length;
        i193 = 0;
        if (i192 > i193)
          break label6305;
        arrayOfString[48] = new String(arrayOfChar49).intern();
        arrayOfChar50 = "hz*{\020z\022N\013js\fJ\032`j,L\f".toCharArray();
        int i196 = arrayOfChar50.length;
        i197 = 0;
        if (i196 > i197)
          break label6397;
        arrayOfString[49] = new String(arrayOfChar50).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int i2 = arrayOfChar1[i1];
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
        arrayOfChar1[i1] = (char)(i3 ^ i2);
        i1++;
        break;
        i3 = 15;
        continue;
        i3 = 31;
        continue;
        i3 = 94;
        continue;
        i3 = 47;
      }
    }
    int i6 = arrayOfChar2[i5];
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
      arrayOfChar2[i5] = (char)(i7 ^ i6);
      i5++;
      break;
      i7 = 15;
      continue;
      i7 = 31;
      continue;
      i7 = 94;
      continue;
      i7 = 47;
    }
    label2073: int i10 = arrayOfChar3[i9];
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
      arrayOfChar3[i9] = (char)(i11 ^ i10);
      i9++;
      break;
      i11 = 15;
      continue;
      i11 = 31;
      continue;
      i11 = 94;
      continue;
      i11 = 47;
    }
    label2165: int i14 = arrayOfChar4[i13];
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
      arrayOfChar4[i13] = (char)(i15 ^ i14);
      i13++;
      break;
      i15 = 15;
      continue;
      i15 = 31;
      continue;
      i15 = 94;
      continue;
      i15 = 47;
    }
    label2257: int i18 = arrayOfChar5[i17];
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
      arrayOfChar5[i17] = (char)(i19 ^ i18);
      i17++;
      break;
      i19 = 15;
      continue;
      i19 = 31;
      continue;
      i19 = 94;
      continue;
      i19 = 47;
    }
    label2349: int i22 = arrayOfChar6[i21];
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
      arrayOfChar6[i21] = (char)(i23 ^ i22);
      i21++;
      break;
      i23 = 15;
      continue;
      i23 = 31;
      continue;
      i23 = 94;
      continue;
      i23 = 47;
    }
    label2441: int i26 = arrayOfChar7[i25];
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
      arrayOfChar7[i25] = (char)(i27 ^ i26);
      i25++;
      break;
      i27 = 15;
      continue;
      i27 = 31;
      continue;
      i27 = 94;
      continue;
      i27 = 47;
    }
    label2533: int i30 = arrayOfChar8[i29];
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
      arrayOfChar8[i29] = (char)(i31 ^ i30);
      i29++;
      break;
      i31 = 15;
      continue;
      i31 = 31;
      continue;
      i31 = 94;
      continue;
      i31 = 47;
    }
    label2625: int i34 = arrayOfChar9[i33];
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
      arrayOfChar9[i33] = (char)(i35 ^ i34);
      i33++;
      break;
      i35 = 15;
      continue;
      i35 = 31;
      continue;
      i35 = 94;
      continue;
      i35 = 47;
    }
    label2717: int i38 = arrayOfChar10[i37];
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
      arrayOfChar10[i37] = (char)(i39 ^ i38);
      i37++;
      break;
      i39 = 15;
      continue;
      i39 = 31;
      continue;
      i39 = 94;
      continue;
      i39 = 47;
    }
    label2809: int i42 = arrayOfChar11[i41];
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
      arrayOfChar11[i41] = (char)(i43 ^ i42);
      i41++;
      break;
      i43 = 15;
      continue;
      i43 = 31;
      continue;
      i43 = 94;
      continue;
      i43 = 47;
    }
    label2901: int i46 = arrayOfChar12[i45];
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
      arrayOfChar12[i45] = (char)(i47 ^ i46);
      i45++;
      break;
      i47 = 15;
      continue;
      i47 = 31;
      continue;
      i47 = 94;
      continue;
      i47 = 47;
    }
    label2993: int i50 = arrayOfChar13[i49];
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
      arrayOfChar13[i49] = (char)(i51 ^ i50);
      i49++;
      break;
      i51 = 15;
      continue;
      i51 = 31;
      continue;
      i51 = 94;
      continue;
      i51 = 47;
    }
    label3085: int i54 = arrayOfChar14[i53];
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
      arrayOfChar14[i53] = (char)(i55 ^ i54);
      i53++;
      break;
      i55 = 15;
      continue;
      i55 = 31;
      continue;
      i55 = 94;
      continue;
      i55 = 47;
    }
    label3177: int i58 = arrayOfChar15[i57];
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
      arrayOfChar15[i57] = (char)(i59 ^ i58);
      i57++;
      break;
      i59 = 15;
      continue;
      i59 = 31;
      continue;
      i59 = 94;
      continue;
      i59 = 47;
    }
    label3269: int i62 = arrayOfChar16[i61];
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
      arrayOfChar16[i61] = (char)(i63 ^ i62);
      i61++;
      break;
      i63 = 15;
      continue;
      i63 = 31;
      continue;
      i63 = 94;
      continue;
      i63 = 47;
    }
    label3361: int i66 = arrayOfChar17[i65];
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
      arrayOfChar17[i65] = (char)(i67 ^ i66);
      i65++;
      break;
      i67 = 15;
      continue;
      i67 = 31;
      continue;
      i67 = 94;
      continue;
      i67 = 47;
    }
    label3453: int i70 = arrayOfChar18[i69];
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
      arrayOfChar18[i69] = (char)(i71 ^ i70);
      i69++;
      break;
      i71 = 15;
      continue;
      i71 = 31;
      continue;
      i71 = 94;
      continue;
      i71 = 47;
    }
    label3545: int i74 = arrayOfChar19[i73];
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
      arrayOfChar19[i73] = (char)(i75 ^ i74);
      i73++;
      break;
      i75 = 15;
      continue;
      i75 = 31;
      continue;
      i75 = 94;
      continue;
      i75 = 47;
    }
    label3637: int i78 = arrayOfChar20[i77];
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
      arrayOfChar20[i77] = (char)(i79 ^ i78);
      i77++;
      break;
      i79 = 15;
      continue;
      i79 = 31;
      continue;
      i79 = 94;
      continue;
      i79 = 47;
    }
    label3729: int i82 = arrayOfChar21[i81];
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
      arrayOfChar21[i81] = (char)(i83 ^ i82);
      i81++;
      break;
      i83 = 15;
      continue;
      i83 = 31;
      continue;
      i83 = 94;
      continue;
      i83 = 47;
    }
    label3821: int i86 = arrayOfChar22[i85];
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
      arrayOfChar22[i85] = (char)(i87 ^ i86);
      i85++;
      break;
      i87 = 15;
      continue;
      i87 = 31;
      continue;
      i87 = 94;
      continue;
      i87 = 47;
    }
    label3913: int i90 = arrayOfChar23[i89];
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
      arrayOfChar23[i89] = (char)(i91 ^ i90);
      i89++;
      break;
      i91 = 15;
      continue;
      i91 = 31;
      continue;
      i91 = 94;
      continue;
      i91 = 47;
    }
    label4005: int i94 = arrayOfChar24[i93];
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
      arrayOfChar24[i93] = (char)(i95 ^ i94);
      i93++;
      break;
      i95 = 15;
      continue;
      i95 = 31;
      continue;
      i95 = 94;
      continue;
      i95 = 47;
    }
    label4097: int i98 = arrayOfChar25[i97];
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
      arrayOfChar25[i97] = (char)(i99 ^ i98);
      i97++;
      break;
      i99 = 15;
      continue;
      i99 = 31;
      continue;
      i99 = 94;
      continue;
      i99 = 47;
    }
    label4189: int i102 = arrayOfChar26[i101];
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
      arrayOfChar26[i101] = (char)(i103 ^ i102);
      i101++;
      break;
      i103 = 15;
      continue;
      i103 = 31;
      continue;
      i103 = 94;
      continue;
      i103 = 47;
    }
    label4281: int i106 = arrayOfChar27[i105];
    int i107;
    switch (i105 % 5)
    {
    default:
      i107 = 105;
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
      i107 = 15;
      continue;
      i107 = 31;
      continue;
      i107 = 94;
      continue;
      i107 = 47;
    }
    label4373: int i110 = arrayOfChar28[i109];
    int i111;
    switch (i109 % 5)
    {
    default:
      i111 = 105;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar28[i109] = (char)(i111 ^ i110);
      i109++;
      break;
      i111 = 15;
      continue;
      i111 = 31;
      continue;
      i111 = 94;
      continue;
      i111 = 47;
    }
    label4465: int i114 = arrayOfChar29[i113];
    int i115;
    switch (i113 % 5)
    {
    default:
      i115 = 105;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar29[i113] = (char)(i115 ^ i114);
      i113++;
      break;
      i115 = 15;
      continue;
      i115 = 31;
      continue;
      i115 = 94;
      continue;
      i115 = 47;
    }
    label4557: int i118 = arrayOfChar30[i117];
    int i119;
    switch (i117 % 5)
    {
    default:
      i119 = 105;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar30[i117] = (char)(i119 ^ i118);
      i117++;
      break;
      i119 = 15;
      continue;
      i119 = 31;
      continue;
      i119 = 94;
      continue;
      i119 = 47;
    }
    label4649: int i122 = arrayOfChar31[i121];
    int i123;
    switch (i121 % 5)
    {
    default:
      i123 = 105;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar31[i121] = (char)(i123 ^ i122);
      i121++;
      break;
      i123 = 15;
      continue;
      i123 = 31;
      continue;
      i123 = 94;
      continue;
      i123 = 47;
    }
    label4741: int i126 = arrayOfChar32[i125];
    int i127;
    switch (i125 % 5)
    {
    default:
      i127 = 105;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar32[i125] = (char)(i127 ^ i126);
      i125++;
      break;
      i127 = 15;
      continue;
      i127 = 31;
      continue;
      i127 = 94;
      continue;
      i127 = 47;
    }
    label4833: int i130 = arrayOfChar33[i129];
    int i131;
    switch (i129 % 5)
    {
    default:
      i131 = 105;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar33[i129] = (char)(i131 ^ i130);
      i129++;
      break;
      i131 = 15;
      continue;
      i131 = 31;
      continue;
      i131 = 94;
      continue;
      i131 = 47;
    }
    label4925: int i134 = arrayOfChar34[i133];
    int i135;
    switch (i133 % 5)
    {
    default:
      i135 = 105;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar34[i133] = (char)(i135 ^ i134);
      i133++;
      break;
      i135 = 15;
      continue;
      i135 = 31;
      continue;
      i135 = 94;
      continue;
      i135 = 47;
    }
    label5017: int i138 = arrayOfChar35[i137];
    int i139;
    switch (i137 % 5)
    {
    default:
      i139 = 105;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar35[i137] = (char)(i139 ^ i138);
      i137++;
      break;
      i139 = 15;
      continue;
      i139 = 31;
      continue;
      i139 = 94;
      continue;
      i139 = 47;
    }
    label5109: int i142 = arrayOfChar36[i141];
    int i143;
    switch (i141 % 5)
    {
    default:
      i143 = 105;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar36[i141] = (char)(i143 ^ i142);
      i141++;
      break;
      i143 = 15;
      continue;
      i143 = 31;
      continue;
      i143 = 94;
      continue;
      i143 = 47;
    }
    label5201: int i146 = arrayOfChar37[i145];
    int i147;
    switch (i145 % 5)
    {
    default:
      i147 = 105;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar37[i145] = (char)(i147 ^ i146);
      i145++;
      break;
      i147 = 15;
      continue;
      i147 = 31;
      continue;
      i147 = 94;
      continue;
      i147 = 47;
    }
    label5293: int i150 = arrayOfChar38[i149];
    int i151;
    switch (i149 % 5)
    {
    default:
      i151 = 105;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar38[i149] = (char)(i151 ^ i150);
      i149++;
      break;
      i151 = 15;
      continue;
      i151 = 31;
      continue;
      i151 = 94;
      continue;
      i151 = 47;
    }
    label5385: int i154 = arrayOfChar39[i153];
    int i155;
    switch (i153 % 5)
    {
    default:
      i155 = 105;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar39[i153] = (char)(i155 ^ i154);
      i153++;
      break;
      i155 = 15;
      continue;
      i155 = 31;
      continue;
      i155 = 94;
      continue;
      i155 = 47;
    }
    label5477: int i158 = arrayOfChar40[i157];
    int i159;
    switch (i157 % 5)
    {
    default:
      i159 = 105;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar40[i157] = (char)(i159 ^ i158);
      i157++;
      break;
      i159 = 15;
      continue;
      i159 = 31;
      continue;
      i159 = 94;
      continue;
      i159 = 47;
    }
    label5569: int i162 = arrayOfChar41[i161];
    int i163;
    switch (i161 % 5)
    {
    default:
      i163 = 105;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar41[i161] = (char)(i163 ^ i162);
      i161++;
      break;
      i163 = 15;
      continue;
      i163 = 31;
      continue;
      i163 = 94;
      continue;
      i163 = 47;
    }
    label5661: int i166 = arrayOfChar42[i165];
    int i167;
    switch (i165 % 5)
    {
    default:
      i167 = 105;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar42[i165] = (char)(i167 ^ i166);
      i165++;
      break;
      i167 = 15;
      continue;
      i167 = 31;
      continue;
      i167 = 94;
      continue;
      i167 = 47;
    }
    label5753: int i170 = arrayOfChar43[i169];
    int i171;
    switch (i169 % 5)
    {
    default:
      i171 = 105;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar43[i169] = (char)(i171 ^ i170);
      i169++;
      break;
      i171 = 15;
      continue;
      i171 = 31;
      continue;
      i171 = 94;
      continue;
      i171 = 47;
    }
    label5845: int i174 = arrayOfChar44[i173];
    int i175;
    switch (i173 % 5)
    {
    default:
      i175 = 105;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar44[i173] = (char)(i175 ^ i174);
      i173++;
      break;
      i175 = 15;
      continue;
      i175 = 31;
      continue;
      i175 = 94;
      continue;
      i175 = 47;
    }
    label5937: int i178 = arrayOfChar45[i177];
    int i179;
    switch (i177 % 5)
    {
    default:
      i179 = 105;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar45[i177] = (char)(i179 ^ i178);
      i177++;
      break;
      i179 = 15;
      continue;
      i179 = 31;
      continue;
      i179 = 94;
      continue;
      i179 = 47;
    }
    label6029: int i182 = arrayOfChar46[i181];
    int i183;
    switch (i181 % 5)
    {
    default:
      i183 = 105;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar46[i181] = (char)(i183 ^ i182);
      i181++;
      break;
      i183 = 15;
      continue;
      i183 = 31;
      continue;
      i183 = 94;
      continue;
      i183 = 47;
    }
    label6121: int i186 = arrayOfChar47[i185];
    int i187;
    switch (i185 % 5)
    {
    default:
      i187 = 105;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar47[i185] = (char)(i187 ^ i186);
      i185++;
      break;
      i187 = 15;
      continue;
      i187 = 31;
      continue;
      i187 = 94;
      continue;
      i187 = 47;
    }
    label6213: int i190 = arrayOfChar48[i189];
    int i191;
    switch (i189 % 5)
    {
    default:
      i191 = 105;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar48[i189] = (char)(i191 ^ i190);
      i189++;
      break;
      i191 = 15;
      continue;
      i191 = 31;
      continue;
      i191 = 94;
      continue;
      i191 = 47;
    }
    label6305: int i194 = arrayOfChar49[i193];
    int i195;
    switch (i193 % 5)
    {
    default:
      i195 = 105;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar49[i193] = (char)(i195 ^ i194);
      i193++;
      break;
      i195 = 15;
      continue;
      i195 = 31;
      continue;
      i195 = 94;
      continue;
      i195 = 47;
    }
    label6397: int i198 = arrayOfChar50[i197];
    int i199;
    switch (i197 % 5)
    {
    default:
      i199 = 105;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar50[i197] = (char)(i199 ^ i198);
      i197++;
      break;
      i199 = 15;
      continue;
      i199 = 31;
      continue;
      i199 = 94;
      continue;
      i199 = 47;
    }
  }

  private RelativeLayout a(e parame)
  {
    boolean bool = DialogToastListActivity.f;
    RelativeLayout localRelativeLayout = (RelativeLayout)((LayoutInflater)getSystemService(z[48])).inflate(2130903131, null, true);
    localRelativeLayout.setOnClickListener(new v7(this, parame));
    localRelativeLayout.setTag(parame.b);
    localRelativeLayout.setClickable(true);
    localRelativeLayout.setFocusable(true);
    localRelativeLayout.setBackgroundDrawable(getResources().getDrawable(2130838546));
    if (this.i)
      localRelativeLayout.findViewById(2131558801).setVisibility(0);
    TextView localTextView1 = (TextView)localRelativeLayout.findViewById(2131558803);
    if (g.a.containsKey(parame.a))
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = g.b.get(parame.a);
      localTextView1.setText(getString(2131296814, arrayOfObject2));
      if (!bool);
    }
    else if (parame.a.equals(z[39]))
    {
      Object[] arrayOfObject1 = parame.e.toArray();
      if ((arrayOfObject1 != null) && (arrayOfObject1.length > 0))
      {
        localTextView1.setText((String)parame.e.toArray()[0]);
        if (!bool);
      }
      else
      {
        localTextView1.setText(getResources().getString(2131296817));
      }
      if (!bool);
    }
    else
    {
      localTextView1.setText((CharSequence)g.b.get(parame.a));
    }
    TextView localTextView2 = (TextView)localRelativeLayout.findViewById(2131558804);
    localTextView2.setWidth(300);
    localTextView2.setMaxLines(2);
    localTextView2.setText(parame.b);
    localRelativeLayout.findViewById(2131558802).setVisibility(8);
    return localRelativeLayout;
  }

  private RelativeLayout a(i parami, int paramInt)
  {
    RelativeLayout localRelativeLayout = (RelativeLayout)((LayoutInflater)getSystemService(z[48])).inflate(2130903131, null, true);
    localRelativeLayout.setTag(parami.c);
    localRelativeLayout.setClickable(true);
    localRelativeLayout.setFocusable(true);
    localRelativeLayout.setBackgroundDrawable(getResources().getDrawable(2130838546));
    if (this.i)
      localRelativeLayout.findViewById(2131558801).setVisibility(0);
    TextView localTextView1 = (TextView)localRelativeLayout.findViewById(2131558803);
    StringBuilder localStringBuilder = new StringBuilder().append(getResources().getString(2131296512)).append(" ");
    if (parami.b == 0);
    for (String str = parami.e; ; str = a(ContactsContract.CommonDataKinds.StructuredPostal.class, parami.b))
    {
      localTextView1.setText(str + " " + getResources().getString(2131296488));
      TextView localTextView2 = (TextView)localRelativeLayout.findViewById(2131558804);
      localTextView2.setWidth(300);
      localTextView2.setMaxLines(3);
      if (parami.d != null)
        localTextView2.setText(parami.d.c());
      ((ImageView)localRelativeLayout.findViewById(2131558802)).setBackgroundResource(paramInt);
      return localRelativeLayout;
    }
  }

  private RelativeLayout a(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    RelativeLayout localRelativeLayout = (RelativeLayout)((LayoutInflater)getSystemService(z[48])).inflate(2130903131, null, true);
    localRelativeLayout.setTag(paramString3);
    localRelativeLayout.setClickable(true);
    localRelativeLayout.setFocusable(true);
    localRelativeLayout.setBackgroundDrawable(getResources().getDrawable(2130838546));
    if (this.i)
      localRelativeLayout.findViewById(2131558801).setVisibility(0);
    ((TextView)localRelativeLayout.findViewById(2131558803)).setText(paramString1);
    TextView localTextView = (TextView)localRelativeLayout.findViewById(2131558804);
    localTextView.setWidth(300);
    localTextView.setMaxLines(2);
    if (!paramString2.equalsIgnoreCase(z[47]))
      localTextView.setText(paramString2);
    ((ImageView)localRelativeLayout.findViewById(2131558802)).setBackgroundResource(paramInt);
    return localRelativeLayout;
  }

  private g a(String paramString)
  {
    try
    {
      g localg2 = g.b(paramString);
      localg1 = localg2;
      return localg1;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
      {
        g5.c(localUnsupportedEncodingException);
        g localg1 = null;
      }
    }
    catch (IOException localIOException)
    {
      while (true)
        g5.d(localIOException);
    }
    catch (b localb)
    {
      while (true)
        g5.c(localb);
    }
  }

  private String a(Class paramClass, int paramInt)
  {
    try
    {
      String str2 = z[49];
      Class[] arrayOfClass = new Class[1];
      arrayOfClass[0] = Integer.TYPE;
      Method localMethod = paramClass.getMethod(str2, arrayOfClass);
      App localApp = App.Mb;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      String str3 = localApp.getString(((Integer)localMethod.invoke(null, arrayOfObject)).intValue());
      str1 = str3;
      return str1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        g5.d(localException);
        String str1 = null;
      }
    }
  }

  private void a()
  {
    if (this.g)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.f.a();
      c(getString(2131296813, arrayOfObject));
      if (!DialogToastListActivity.f);
    }
    else
    {
      c();
      this.g = true;
    }
  }

  private void a(View paramView)
  {
    CheckBox localCheckBox = (CheckBox)paramView.findViewById(2131558801);
    if (localCheckBox.isChecked())
    {
      localCheckBox.setChecked(false);
      if (!DialogToastListActivity.f);
    }
    else
    {
      localCheckBox.setChecked(true);
    }
  }

  static void a(ViewSharedContactActivity paramViewSharedContactActivity)
  {
    paramViewSharedContactActivity.a();
  }

  static void a(ViewSharedContactActivity paramViewSharedContactActivity, View paramView)
  {
    paramViewSharedContactActivity.a(paramView);
  }

  private void a(String paramString1, String paramString2, String paramString3)
  {
    ((TextView)findViewById(2131558796)).setText(paramString1);
    if ((paramString2 != null) && (paramString2.length() > 0))
    {
      ((TextView)findViewById(2131558797)).setText(paramString2);
      if (!DialogToastListActivity.f);
    }
    else
    {
      findViewById(2131558797).setVisibility(8);
    }
  }

  private void b()
  {
    boolean bool = DialogToastListActivity.f;
    int i1;
    for (int n = 0; ; n = i1)
      if (n < this.m.getChildCount())
      {
        View localView = this.m.getChildAt(n);
        if (!((CheckBox)localView.findViewById(2131558801)).isChecked())
        {
          g5.d(z[0] + n);
          if ((localView.getTag() instanceof String))
          {
            g5.d(z[4] + localView.getTag().toString());
            this.f.k.remove(localView.getTag().toString());
            if (!bool);
          }
          else if ((localView.getTag() instanceof i))
          {
            i locali = (i)localView.getTag();
            this.f.i.remove(locali);
            if (locali.a == ContactsContract.CommonDataKinds.Email.class)
            {
              g5.d(z[2] + localView.getTag());
              if (!bool);
            }
            else if (locali.a == ContactsContract.CommonDataKinds.StructuredPostal.class)
            {
              g5.d(z[1] + localView.getTag());
            }
            if (!bool);
          }
          else if ((localView.getTag() instanceof l))
          {
            this.f.h.remove(localView.getTag());
            g5.d(z[3] + localView.getTag());
          }
        }
        i1 = n + 1;
        if (!bool);
      }
      else
      {
        m localm = new m();
        try
        {
          String str = localm.a(this.f, 2);
          App.a(this.k, this.f.c.a, str);
          setResult(-1);
          finish();
          return;
        }
        catch (b localb)
        {
          while (true)
          {
            g5.d(localb);
            a(2131296815);
          }
        }
      }
  }

  static void b(ViewSharedContactActivity paramViewSharedContactActivity)
  {
    paramViewSharedContactActivity.b();
  }

  protected void c()
  {
    boolean bool = DialogToastListActivity.f;
    ArrayList localArrayList1 = new ArrayList();
    ContentProviderOperation.Builder localBuilder1 = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
    localBuilder1.withValue(z[23], null);
    localBuilder1.withValue(z[12], null);
    localArrayList1.add(localBuilder1.build());
    ContentProviderOperation.Builder localBuilder2 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
    localBuilder2.withValueBackReference(z[26], 0);
    localBuilder2.withValue(z[20], z[22]);
    localBuilder2.withValue(z[30], this.f.c.a);
    localBuilder2.withValue(z[29], this.f.c.c);
    localBuilder2.withValue(z[7], this.f.c.b);
    localBuilder2.withValue(z[9], this.f.c.d);
    localBuilder2.withValue(z[24], this.f.c.e);
    localBuilder2.withValue(z[13], this.f.c.f);
    localBuilder2.withValue(z[38], this.f.c.g);
    localBuilder2.withValue(z[36], this.f.c.h);
    localArrayList1.add(localBuilder2.build());
    if (this.f.h != null)
    {
      Iterator localIterator5 = this.f.h.iterator();
      do
      {
        if (!localIterator5.hasNext())
          break;
        l locall2 = (l)localIterator5.next();
        ContentProviderOperation.Builder localBuilder7 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
        localBuilder7.withValueBackReference(z[26], 0);
        localBuilder7.withValue(z[20], z[11]);
        localBuilder7.withValue(z[30], locall2.b);
        localBuilder7.withValue(z[7], Integer.valueOf(locall2.a));
        if (locall2.a == 0)
          localBuilder7.withValue(z[29], locall2.c);
        localArrayList1.add(localBuilder7.build());
      }
      while (!bool);
    }
    if (this.f.i != null)
    {
      Iterator localIterator4 = this.f.i.iterator();
      do
      {
        if (!localIterator4.hasNext())
          break;
        i locali = (i)localIterator4.next();
        if (locali.a == ContactsContract.CommonDataKinds.Email.class)
        {
          ContentProviderOperation.Builder localBuilder6 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
          localBuilder6.withValueBackReference(z[26], 0);
          localBuilder6.withValue(z[20], z[14]);
          localBuilder6.withValue(z[30], locali.c);
          localBuilder6.withValue(z[7], Integer.valueOf(locali.b));
          if (locali.b == 0)
            localBuilder6.withValue(z[29], locali.e);
          localArrayList1.add(localBuilder6.build());
          if (!bool);
        }
        else if (locali.a == ContactsContract.CommonDataKinds.StructuredPostal.class)
        {
          ContentProviderOperation.Builder localBuilder5 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
          localBuilder5.withValueBackReference(z[26], 0);
          localBuilder5.withValue(z[20], z[5]);
          localBuilder5.withValue(z[24], locali.d.b());
          localBuilder5.withValue(z[38], locali.d.b);
          localBuilder5.withValue(z[33], locali.d.c);
          localBuilder5.withValue(z[36], locali.d.d);
          localBuilder5.withValue(z[8], locali.d.e);
          localBuilder5.withValue(z[7], Integer.valueOf(locali.b));
          if (locali.b == 0)
            localBuilder5.withValue(z[29], locali.e);
          localArrayList1.add(localBuilder5.build());
          if (!bool);
        }
        else if (locali.a == ContactsContract.CommonDataKinds.Im.class)
        {
          g5.d(z[19] + locali.toString());
          if (!bool);
        }
        else
        {
          g5.d(z[34] + locali.toString());
        }
      }
      while (!bool);
    }
    k localk;
    ContentProviderOperation.Builder localBuilder4;
    int i5;
    String str3;
    if ((this.f.j != null) && (this.f.j.size() > 0))
    {
      localk = (k)this.f.j.get(0);
      localBuilder4 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
      localBuilder4.withValueBackReference(z[26], 0);
      localBuilder4.withValue(z[20], z[6]);
      i5 = localk.b.lastIndexOf(" ");
      if (i5 <= 0)
        break label1941;
      str3 = localk.b.substring(0, i5);
    }
    while (true)
    {
      localBuilder4.withValue(z[30], str3);
      if (i5 > 0)
        localBuilder4.withValue(z[9], localk.b.substring(i5 + 1));
      localBuilder4.withValue(z[24], localk.c);
      localArrayList1.add(localBuilder4.build());
      if (this.f.k != null)
      {
        Iterator localIterator3 = this.f.k.keySet().iterator();
        do
        {
          if (!localIterator3.hasNext())
            break;
          String str2 = (String)localIterator3.next();
          if (str2.equals(z[21]))
            localArrayList1.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference(z[26], 0).withValue(z[20], z[17]).withValue(z[30], ((e)((List)this.f.k.get(str2)).get(0)).b).build());
          if (str2.equals(z[28]))
            localArrayList1.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference(z[26], 0).withValue(z[20], z[25]).withValue(z[7], Integer.valueOf(3)).withValue(z[30], ((e)((List)this.f.k.get(str2)).get(0)).b).build());
          if (g.a.containsKey(str2))
          {
            e locale = (e)((List)this.f.k.get(str2)).get(0);
            ContentProviderOperation.Builder localBuilder3 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference(z[26], 0).withValue(z[20], z[10]).withValue(z[9], g.a.get(str2)).withValue(z[30], ((e)((List)this.f.k.get(str2)).get(0)).b);
            if ((locale.e != null) && (locale.e.size() > 0))
              localBuilder3.withValue(z[7], locale.e.toArray()[0]);
            localArrayList1.add(localBuilder3.build());
          }
        }
        while (!bool);
      }
      if (this.h != null)
      {
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        this.h.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
        byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
        localArrayList1.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference(z[26], 0).withValue(z[20], z[18]).withValue(z[15], arrayOfByte).build());
      }
      try
      {
        g.a(true);
        String str1 = App.ib.applyBatch(z[27], localArrayList1)[0].uri.getLastPathSegment();
        g5.b(z[37] + this.f.c + z[35] + str1);
        Iterator localIterator1 = this.f.h.iterator();
        n = 0;
        if (localIterator1.hasNext())
        {
          l locall1 = (l)localIterator1.next();
          ArrayList localArrayList2 = App.w.f(locall1.b);
          if (localArrayList2.size() <= 0)
            break label2043;
          Iterator localIterator2 = localArrayList2.iterator();
          i2 = 0;
          if (localIterator2.hasNext())
          {
            zq localzq = (zq)localIterator2.next();
            if (localzq.g == null)
            {
              g5.b(z[32] + localzq);
              localzq.g = new uq(Long.parseLong(str1), locall1.b);
              localzq.h = this.f.a();
              localzq.k = true;
              i4 = 1;
              break label2028;
              label1846: if (i3 == 0)
                break label2039;
              App.w.c(localArrayList2, null);
              App.Ib.sendEmptyMessage(1);
              break label2039;
              label1871: if (i1 != 0)
              {
                g5.b(z[16]);
                y9 localy9 = new y9(this);
                localy9.setPriority(1);
                localy9.start();
              }
              g.a(false);
              Object[] arrayOfObject = new Object[1];
              arrayOfObject[0] = this.f.a();
              c(getString(2131296812, arrayOfObject));
              return;
              label1941: str3 = localk.b;
            }
          }
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          int n;
          int i2;
          int i4;
          int i3;
          int i1;
          g5.d(z[31] + localException.toString());
          continue;
          label2028: label2039: label2043: label2046: 
          do
          {
            n = i1;
            break;
            do
            {
              i1 = n;
              break label2046;
              do
              {
                i2 = i4;
                break;
                i4 = i2;
                continue;
                i3 = i2;
                break label1846;
                i1 = n;
                break label1871;
              }
              while (!bool);
              i3 = i4;
              break label1846;
            }
            while (!bool);
            i1 = 1;
          }
          while (!bool);
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    String str1 = null;
    boolean bool = DialogToastListActivity.f;
    super.onCreate(paramBundle);
    setContentView(2130903130);
    this.i = getIntent().getBooleanExtra(z[46], false);
    this.j = getIntent().getStringExtra(z[44]);
    this.k = getIntent().getStringExtra(z[43]);
    this.l = getIntent().getStringExtra(z[40]);
    if (this.j == null)
    {
      g5.d(z[42]);
      App.a(this, 2131296816, 0);
    }
    while (true)
    {
      return;
      this.m = ((LinearLayout)findViewById(2131558799));
      this.f = a(this.j);
      if (this.f == null)
        a(2131296985, new p7(this));
      if (this.i)
      {
        findViewById(2131558535).setVisibility(8);
        findViewById(2131558798).setVisibility(0);
        if (this.f == null);
      }
      try
      {
        this.f.f = g.a(getBaseContext(), this.l);
        if (this.f != null)
        {
          if ((this.f.f != null) && (this.f.f.length > 0))
          {
            byte[] arrayOfByte;
            if (!this.i)
            {
              arrayOfByte = wb.b(this.f.f);
              if (!bool);
            }
            else
            {
              arrayOfByte = this.f.f;
            }
            this.h = BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length);
            br localbr = new br(this, "", arrayOfByte);
            ((ImageView)findViewById(2131558794)).setImageBitmap(localbr.a((int)App.Mb.getResources().getDimension(2131361797), j4.a(App.Mb.getApplicationContext()).L, false));
          }
          if ((this.f.j == null) || (this.f.j.size() <= 0))
            break label1059;
          str1 = ((k)this.f.j.get(0)).b;
          str2 = ((k)this.f.j.get(0)).c;
          a(this.f.c.a, str1, str2);
          if (this.f.h != null)
          {
            Iterator localIterator4 = this.f.h.iterator();
            do
            {
              if (!localIterator4.hasNext())
                break;
              locall = (l)localIterator4.next();
              StringBuilder localStringBuilder2 = new StringBuilder().append(getResources().getString(2131296481)).append(" ");
              if (locall.a != 0)
                break label1025;
              str5 = locall.c;
              RelativeLayout localRelativeLayout4 = a(str5, locall.b, 2130837558, locall.b);
              localRelativeLayout4.setOnClickListener(new q7(this));
              localRelativeLayout4.setTag(locall);
              this.m.addView(localRelativeLayout4);
            }
            while (!bool);
          }
          if (this.f.i != null)
          {
            Iterator localIterator3 = this.f.i.iterator();
            do
            {
              if (!localIterator3.hasNext())
                break;
              locali = (i)localIterator3.next();
              if (locali.a == ContactsContract.CommonDataKinds.Email.class)
              {
                StringBuilder localStringBuilder1 = new StringBuilder().append(getResources().getString(2131296486)).append(" ");
                if (locali.b != 0)
                  break label1042;
                str4 = locali.e;
                RelativeLayout localRelativeLayout3 = a(str4, locali.c, 2130837567, locali.c);
                localRelativeLayout3.setOnClickListener(new r7(this));
                localRelativeLayout3.setTag(locali);
                this.m.addView(localRelativeLayout3);
                if (!bool);
              }
              else if (locali.a == ContactsContract.CommonDataKinds.StructuredPostal.class)
              {
                RelativeLayout localRelativeLayout2 = a(locali, 2130837568);
                localRelativeLayout2.setOnClickListener(new s7(this));
                localRelativeLayout2.setTag(locali);
                this.m.addView(localRelativeLayout2);
              }
            }
            while (!bool);
          }
          if (this.f.k != null)
          {
            Iterator localIterator1 = this.f.k.keySet().iterator();
            do
            {
              if (!localIterator1.hasNext())
                break;
              String str3 = (String)localIterator1.next();
              Iterator localIterator2 = ((List)this.f.k.get(str3)).iterator();
              do
              {
                e locale;
                do
                {
                  if (!localIterator2.hasNext())
                    break;
                  locale = (e)localIterator2.next();
                  g5.d(locale.toString());
                }
                while ((locale.a.equals(z[39])) && (!Pattern.compile(z[41]).matcher(locale.b).matches()) && (!bool));
                RelativeLayout localRelativeLayout1 = a(locale);
                this.m.addView(localRelativeLayout1);
              }
              while (!bool);
            }
            while (!bool);
          }
        }
        findViewById(2131558674).setOnClickListener(new t7(this));
        findViewById(2131558798).setOnClickListener(new u7(this));
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        while (true)
        {
          l locall;
          i locali;
          g5.d(z[45]);
          continue;
          label1025: String str5 = a(ContactsContract.CommonDataKinds.Phone.class, locall.a);
          continue;
          label1042: String str4 = a(ContactsContract.CommonDataKinds.Email.class, locali.b);
          continue;
          label1059: String str2 = null;
        }
      }
    }
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    if (this.i)
    {
      paramMenu.add(0, 1, 0, getResources().getString(2131296840)).setIcon(getResources().getDrawable(2130838481));
      if (!DialogToastListActivity.f);
    }
    else
    {
      paramMenu.add(0, 0, 0, getResources().getString(2131296810)).setIcon(getResources().getDrawable(2130838460));
    }
    return true;
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    boolean bool = true;
    switch (paramMenuItem.getItemId())
    {
    default:
      bool = false;
    case 0:
    case 1:
    }
    while (true)
    {
      return bool;
      a();
      continue;
      b();
    }
  }

  public void onResume()
  {
    super.onResume();
  }
}