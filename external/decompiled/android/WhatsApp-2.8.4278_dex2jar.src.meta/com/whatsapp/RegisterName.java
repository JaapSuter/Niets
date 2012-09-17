package com.whatsapp;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.provider.ContactsContract.Profile;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import com.whatsapp.messaging.MessageService;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URISyntaxException;

public class RegisterName extends VerifyMessageStoreActivity
  implements uk
{
  private static s9 l;
  private static f m;
  private static final String[] z;
  private zq n;
  private ImageButton o;
  private View p;
  private EditText q;
  private Handler r = new qd(this);
  private Bitmap s;

  static
  {
    String[] arrayOfString = new String[36];
    char[] arrayOfChar1 = "Y/$^1_/1Y#F/lT.B)(R&\0049'T#Y.0C#_/c".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i3;
    char[] arrayOfChar3;
    int i7;
    char[] arrayOfChar4;
    int i11;
    char[] arrayOfChar5;
    int i15;
    char[] arrayOfChar6;
    int i19;
    char[] arrayOfChar7;
    int i23;
    char[] arrayOfChar8;
    int i27;
    char[] arrayOfChar9;
    int i31;
    char[] arrayOfChar10;
    int i35;
    char[] arrayOfChar11;
    int i39;
    char[] arrayOfChar12;
    int i43;
    char[] arrayOfChar13;
    int i47;
    char[] arrayOfChar14;
    int i51;
    char[] arrayOfChar15;
    int i55;
    char[] arrayOfChar16;
    int i59;
    char[] arrayOfChar17;
    int i63;
    char[] arrayOfChar18;
    int i67;
    char[] arrayOfChar19;
    int i71;
    char[] arrayOfChar20;
    int i75;
    char[] arrayOfChar21;
    int i79;
    char[] arrayOfChar22;
    int i83;
    char[] arrayOfChar23;
    int i87;
    char[] arrayOfChar24;
    int i91;
    char[] arrayOfChar25;
    int i95;
    char[] arrayOfChar26;
    int i99;
    char[] arrayOfChar27;
    int i103;
    char[] arrayOfChar28;
    int i107;
    char[] arrayOfChar29;
    int i111;
    char[] arrayOfChar30;
    int i115;
    char[] arrayOfChar31;
    int i119;
    char[] arrayOfChar32;
    int i123;
    char[] arrayOfChar33;
    int i127;
    char[] arrayOfChar34;
    int i131;
    char[] arrayOfChar35;
    int i135;
    char[] arrayOfChar36;
    int i139;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "Y/$^1_/1Y#F/lT.D)(\0325Y%-P".toCharArray();
      int i2 = arrayOfChar2.length;
      i3 = 0;
      if (i2 <= i3)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "Y/$^1_/1Y#F/lT0N+7R".toCharArray();
        int i6 = arrayOfChar3.length;
        i7 = 0;
        if (i6 > i7)
          break label1549;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "x%-N".toCharArray();
        int i10 = arrayOfChar4.length;
        i11 = 0;
        if (i10 > i11)
          break label1641;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "Y/$^1_/1Y#F/lT0N+7RmI+'\0321_+7RbI%6Y!Nj7XbF+*Y".toCharArray();
        int i14 = arrayOfChar5.length;
        i15 = 0;
        if (i14 > i15)
          break label1733;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "Y/$^1_/1Y#F/lT0N+7RmF#0D+E-nG#Y+.DbI%6Y!Nj7XbY/$G*D$&".toCharArray();
        int i18 = arrayOfChar6.length;
        i19 = 0;
        if (i18 > i19)
          break label1825;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "Y/$^1_/1Y#F/lZ1L97X0Ne+R#G>+N".toCharArray();
        int i22 = arrayOfChar7.length;
        i23 = 0;
        if (i22 > i23)
          break label1917;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "O/!B%".toCharArray();
        int i26 = arrayOfChar8.length;
        i27 = 0;
        if (i26 > i27)
          break label2009;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "F%6Y6N.".toCharArray();
        int i30 = arrayOfChar9.length;
        i31 = 0;
        if (i30 > i31)
          break label2101;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "F%6Y6N.\034E-".toCharArray();
        int i34 = arrayOfChar10.length;
        i35 = 0;
        if (i34 > i35)
          break label2193;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "J$'E-B.m^,_/-ClN27E#\0059+X0_)6Clb\004\027r\f".toCharArray();
        int i38 = arrayOfChar11.length;
        i39 = 0;
        if (i38 > i39)
          break label2285;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "H%.\0315C+7D#[:mz#B$".toCharArray();
        int i42 = arrayOfChar12.length;
        i43 = 0;
        if (i42 > i43)
          break label2377;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "H+-Y-_j3V0X/cD*D87T7_j6E+\013".toCharArray();
        int i46 = arrayOfChar13.length;
        i47 = 0;
        if (i46 > i47)
          break label2469;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "H%.\031#E.1X+Od/V7E)+R0\005+ C+D$mb\fb\004\020c\003g\006\034d\nd\030\027t\027".toCharArray();
        int i50 = arrayOfChar14.length;
        i51 = 0;
        if (i50 > i51)
          break label2561;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "J$'E-B.m^,_/-ClN27E#\0059+X0_)6Cle\013\016r".toCharArray();
        int i54 = arrayOfChar15.length;
        i55 = 0;
        if (i54 > i55)
          break label2653;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "H%.\0315C+7D#[:".toCharArray();
        int i58 = arrayOfChar16.length;
        i59 = 0;
        if (i58 > i59)
          break label2745;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "Y/$^1_/1Y#F/lE'X?.R".toCharArray();
        int i62 = arrayOfChar17.length;
        i63 = 0;
        if (i62 > i63)
          break label2837;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "Y/$^1_/1Y#F/lY-\006:6D*E+.R".toCharArray();
        int i66 = arrayOfChar18.length;
        i67 = 0;
        if (i66 > i67)
          break label2929;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "Y/$^1_/1Y#F/lS+J&,PmH+-CoH%-Y'H>".toCharArray();
        int i70 = arrayOfChar19.length;
        i71 = 0;
        if (i70 > i71)
          break label3021;
        arrayOfString[18] = new String(arrayOfChar19).intern();
        arrayOfChar20 = "Y/$^1_/1Y#F/lS+J&,PmM+*['Og-R6".toCharArray();
        int i74 = arrayOfChar20.length;
        i75 = 0;
        if (i74 > i75)
          break label3113;
        arrayOfString[19] = new String(arrayOfChar20).intern();
        arrayOfChar21 = "Y/$^1_/1Y#F/lS+J&,PmH&,T)\006=1X,L".toCharArray();
        int i78 = arrayOfChar21.length;
        i79 = 0;
        if (i78 > i79)
          break label3205;
        arrayOfString[20] = new String(arrayOfChar21).intern();
        arrayOfChar22 = "Y/$^1_/1\032,J'&".toCharArray();
        int i82 = arrayOfChar22.length;
        i83 = 0;
        if (i82 > i83)
          break label3297;
        arrayOfString[21] = new String(arrayOfChar22).intern();
        arrayOfChar23 = "B9\034E'X/7".toCharArray();
        int i86 = arrayOfChar23.length;
        i87 = 0;
        if (i86 > i87)
          break label3389;
        arrayOfString[22] = new String(arrayOfChar23).intern();
        arrayOfChar24 = "F/".toCharArray();
        int i90 = arrayOfChar24.length;
        i91 = 0;
        if (i90 > i91)
          break label3481;
        arrayOfString[23] = new String(arrayOfChar24).intern();
        arrayOfChar25 = "Y/$^1_/1Y#F/lD'_\025'^0_3".toCharArray();
        int i94 = arrayOfChar25.length;
        i95 = 0;
        if (i94 > i95)
          break label3573;
        arrayOfString[24] = new String(arrayOfChar25).intern();
        arrayOfChar26 = "Y/$^1_/1Y#F/lT0N+7RmX+5RbF/".toCharArray();
        int i98 = arrayOfChar26.length;
        i99 = 0;
        if (i98 > i99)
          break label3665;
        arrayOfString[25] = new String(arrayOfChar26).intern();
        arrayOfChar27 = "Y/$^1_/1Y#F/lZ'X9\"P'X>,E']/1^$B/'\030/B90^,Lg3V0J'0\027 D?-T'\013>,\0270N-3_-E/".toCharArray();
        int i102 = arrayOfChar27.length;
        i103 = 0;
        if (i102 > i103)
          break label3757;
        arrayOfString[26] = new String(arrayOfChar27).intern();
        arrayOfChar28 = "J$'E-B.m^,_/-ClH+7R%D8:\031\016j\037\rt\nn\030".toCharArray();
        int i106 = arrayOfChar28.length;
        i107 = 0;
        if (i106 > i107)
          break label3849;
        arrayOfString[27] = new String(arrayOfChar28).intern();
        arrayOfChar29 = "J$'E-B.m^,_/-ClJ)7^-Ed\016v\013e".toCharArray();
        int i110 = arrayOfChar29.length;
        i111 = 0;
        if (i110 > i111)
          break label3941;
        arrayOfString[28] = new String(arrayOfChar29).intern();
        arrayOfChar30 = "H%.\031%D%$['".toCharArray();
        int i114 = arrayOfChar30.length;
        i115 = 0;
        if (i114 > i115)
          break label4033;
        arrayOfString[29] = new String(arrayOfChar30).intern();
        arrayOfChar31 = "Y/$^1_/1Y#F/lP'_'&Y#F/c".toCharArray();
        int i118 = arrayOfChar31.length;
        i119 = 0;
        if (i118 > i119)
          break label4125;
        arrayOfString[30] = new String(arrayOfChar31).intern();
        arrayOfChar32 = "O#0G.J3\034Y#F/".toCharArray();
        int i122 = arrayOfChar32.length;
        i123 = 0;
        if (i122 > i123)
          break label4217;
        arrayOfString[31] = new String(arrayOfChar32).intern();
        arrayOfChar33 = "J$'E-B.m^,_/-ClN27E#\0059+X0_)6Clb\t\fy\035y\017\020x\027y\t\006".toCharArray();
        int i126 = arrayOfChar33.length;
        i127 = 0;
        if (i126 > i127)
          break label4309;
        arrayOfString[32] = new String(arrayOfChar33).intern();
        arrayOfChar34 = "O?3[+H+7R".toCharArray();
        int i130 = arrayOfChar34.length;
        i131 = 0;
        if (i130 > i131)
          break label4401;
        arrayOfString[33] = new String(arrayOfChar34).intern();
        arrayOfChar35 = "H%.\031#E.1X+Od/V7E)+R0\005+ C+D$m~\fx\036\002{\016t\031\013x\020\t\026c".toCharArray();
        int i134 = arrayOfChar35.length;
        i135 = 0;
        if (i134 > i135)
          break label4493;
        arrayOfString[34] = new String(arrayOfChar35).intern();
        arrayOfChar36 = "Y/$^1_/1Y#F/lS'X>1X;".toCharArray();
        int i138 = arrayOfChar36.length;
        i139 = 0;
        if (i138 > i139)
          break label4585;
        arrayOfString[35] = new String(arrayOfChar36).intern();
        z = arrayOfString;
        l = null;
        m = null;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int i1;
      switch (j % 5)
      {
      default:
        i1 = 66;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[j] = (char)(i1 ^ k);
        j++;
        break;
        i1 = 43;
        continue;
        i1 = 74;
        continue;
        i1 = 67;
        continue;
        i1 = 55;
      }
    }
    int i4 = arrayOfChar2[i3];
    int i5;
    switch (i3 % 5)
    {
    default:
      i5 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i3] = (char)(i5 ^ i4);
      i3++;
      break;
      i5 = 43;
      continue;
      i5 = 74;
      continue;
      i5 = 67;
      continue;
      i5 = 55;
    }
    label1549: int i8 = arrayOfChar3[i7];
    int i9;
    switch (i7 % 5)
    {
    default:
      i9 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i7] = (char)(i9 ^ i8);
      i7++;
      break;
      i9 = 43;
      continue;
      i9 = 74;
      continue;
      i9 = 67;
      continue;
      i9 = 55;
    }
    label1641: int i12 = arrayOfChar4[i11];
    int i13;
    switch (i11 % 5)
    {
    default:
      i13 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i11] = (char)(i13 ^ i12);
      i11++;
      break;
      i13 = 43;
      continue;
      i13 = 74;
      continue;
      i13 = 67;
      continue;
      i13 = 55;
    }
    label1733: int i16 = arrayOfChar5[i15];
    int i17;
    switch (i15 % 5)
    {
    default:
      i17 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i15] = (char)(i17 ^ i16);
      i15++;
      break;
      i17 = 43;
      continue;
      i17 = 74;
      continue;
      i17 = 67;
      continue;
      i17 = 55;
    }
    label1825: int i20 = arrayOfChar6[i19];
    int i21;
    switch (i19 % 5)
    {
    default:
      i21 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i19] = (char)(i21 ^ i20);
      i19++;
      break;
      i21 = 43;
      continue;
      i21 = 74;
      continue;
      i21 = 67;
      continue;
      i21 = 55;
    }
    label1917: int i24 = arrayOfChar7[i23];
    int i25;
    switch (i23 % 5)
    {
    default:
      i25 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i23] = (char)(i25 ^ i24);
      i23++;
      break;
      i25 = 43;
      continue;
      i25 = 74;
      continue;
      i25 = 67;
      continue;
      i25 = 55;
    }
    label2009: int i28 = arrayOfChar8[i27];
    int i29;
    switch (i27 % 5)
    {
    default:
      i29 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar8[i27] = (char)(i29 ^ i28);
      i27++;
      break;
      i29 = 43;
      continue;
      i29 = 74;
      continue;
      i29 = 67;
      continue;
      i29 = 55;
    }
    label2101: int i32 = arrayOfChar9[i31];
    int i33;
    switch (i31 % 5)
    {
    default:
      i33 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar9[i31] = (char)(i33 ^ i32);
      i31++;
      break;
      i33 = 43;
      continue;
      i33 = 74;
      continue;
      i33 = 67;
      continue;
      i33 = 55;
    }
    label2193: int i36 = arrayOfChar10[i35];
    int i37;
    switch (i35 % 5)
    {
    default:
      i37 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar10[i35] = (char)(i37 ^ i36);
      i35++;
      break;
      i37 = 43;
      continue;
      i37 = 74;
      continue;
      i37 = 67;
      continue;
      i37 = 55;
    }
    label2285: int i40 = arrayOfChar11[i39];
    int i41;
    switch (i39 % 5)
    {
    default:
      i41 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar11[i39] = (char)(i41 ^ i40);
      i39++;
      break;
      i41 = 43;
      continue;
      i41 = 74;
      continue;
      i41 = 67;
      continue;
      i41 = 55;
    }
    label2377: int i44 = arrayOfChar12[i43];
    int i45;
    switch (i43 % 5)
    {
    default:
      i45 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar12[i43] = (char)(i45 ^ i44);
      i43++;
      break;
      i45 = 43;
      continue;
      i45 = 74;
      continue;
      i45 = 67;
      continue;
      i45 = 55;
    }
    label2469: int i48 = arrayOfChar13[i47];
    int i49;
    switch (i47 % 5)
    {
    default:
      i49 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar13[i47] = (char)(i49 ^ i48);
      i47++;
      break;
      i49 = 43;
      continue;
      i49 = 74;
      continue;
      i49 = 67;
      continue;
      i49 = 55;
    }
    label2561: int i52 = arrayOfChar14[i51];
    int i53;
    switch (i51 % 5)
    {
    default:
      i53 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar14[i51] = (char)(i53 ^ i52);
      i51++;
      break;
      i53 = 43;
      continue;
      i53 = 74;
      continue;
      i53 = 67;
      continue;
      i53 = 55;
    }
    label2653: int i56 = arrayOfChar15[i55];
    int i57;
    switch (i55 % 5)
    {
    default:
      i57 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar15[i55] = (char)(i57 ^ i56);
      i55++;
      break;
      i57 = 43;
      continue;
      i57 = 74;
      continue;
      i57 = 67;
      continue;
      i57 = 55;
    }
    label2745: int i60 = arrayOfChar16[i59];
    int i61;
    switch (i59 % 5)
    {
    default:
      i61 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar16[i59] = (char)(i61 ^ i60);
      i59++;
      break;
      i61 = 43;
      continue;
      i61 = 74;
      continue;
      i61 = 67;
      continue;
      i61 = 55;
    }
    label2837: int i64 = arrayOfChar17[i63];
    int i65;
    switch (i63 % 5)
    {
    default:
      i65 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar17[i63] = (char)(i65 ^ i64);
      i63++;
      break;
      i65 = 43;
      continue;
      i65 = 74;
      continue;
      i65 = 67;
      continue;
      i65 = 55;
    }
    label2929: int i68 = arrayOfChar18[i67];
    int i69;
    switch (i67 % 5)
    {
    default:
      i69 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar18[i67] = (char)(i69 ^ i68);
      i67++;
      break;
      i69 = 43;
      continue;
      i69 = 74;
      continue;
      i69 = 67;
      continue;
      i69 = 55;
    }
    label3021: int i72 = arrayOfChar19[i71];
    int i73;
    switch (i71 % 5)
    {
    default:
      i73 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar19[i71] = (char)(i73 ^ i72);
      i71++;
      break;
      i73 = 43;
      continue;
      i73 = 74;
      continue;
      i73 = 67;
      continue;
      i73 = 55;
    }
    label3113: int i76 = arrayOfChar20[i75];
    int i77;
    switch (i75 % 5)
    {
    default:
      i77 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar20[i75] = (char)(i77 ^ i76);
      i75++;
      break;
      i77 = 43;
      continue;
      i77 = 74;
      continue;
      i77 = 67;
      continue;
      i77 = 55;
    }
    label3205: int i80 = arrayOfChar21[i79];
    int i81;
    switch (i79 % 5)
    {
    default:
      i81 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar21[i79] = (char)(i81 ^ i80);
      i79++;
      break;
      i81 = 43;
      continue;
      i81 = 74;
      continue;
      i81 = 67;
      continue;
      i81 = 55;
    }
    label3297: int i84 = arrayOfChar22[i83];
    int i85;
    switch (i83 % 5)
    {
    default:
      i85 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar22[i83] = (char)(i85 ^ i84);
      i83++;
      break;
      i85 = 43;
      continue;
      i85 = 74;
      continue;
      i85 = 67;
      continue;
      i85 = 55;
    }
    label3389: int i88 = arrayOfChar23[i87];
    int i89;
    switch (i87 % 5)
    {
    default:
      i89 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar23[i87] = (char)(i89 ^ i88);
      i87++;
      break;
      i89 = 43;
      continue;
      i89 = 74;
      continue;
      i89 = 67;
      continue;
      i89 = 55;
    }
    label3481: int i92 = arrayOfChar24[i91];
    int i93;
    switch (i91 % 5)
    {
    default:
      i93 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar24[i91] = (char)(i93 ^ i92);
      i91++;
      break;
      i93 = 43;
      continue;
      i93 = 74;
      continue;
      i93 = 67;
      continue;
      i93 = 55;
    }
    label3573: int i96 = arrayOfChar25[i95];
    int i97;
    switch (i95 % 5)
    {
    default:
      i97 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar25[i95] = (char)(i97 ^ i96);
      i95++;
      break;
      i97 = 43;
      continue;
      i97 = 74;
      continue;
      i97 = 67;
      continue;
      i97 = 55;
    }
    label3665: int i100 = arrayOfChar26[i99];
    int i101;
    switch (i99 % 5)
    {
    default:
      i101 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar26[i99] = (char)(i101 ^ i100);
      i99++;
      break;
      i101 = 43;
      continue;
      i101 = 74;
      continue;
      i101 = 67;
      continue;
      i101 = 55;
    }
    label3757: int i104 = arrayOfChar27[i103];
    int i105;
    switch (i103 % 5)
    {
    default:
      i105 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar27[i103] = (char)(i105 ^ i104);
      i103++;
      break;
      i105 = 43;
      continue;
      i105 = 74;
      continue;
      i105 = 67;
      continue;
      i105 = 55;
    }
    label3849: int i108 = arrayOfChar28[i107];
    int i109;
    switch (i107 % 5)
    {
    default:
      i109 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar28[i107] = (char)(i109 ^ i108);
      i107++;
      break;
      i109 = 43;
      continue;
      i109 = 74;
      continue;
      i109 = 67;
      continue;
      i109 = 55;
    }
    label3941: int i112 = arrayOfChar29[i111];
    int i113;
    switch (i111 % 5)
    {
    default:
      i113 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar29[i111] = (char)(i113 ^ i112);
      i111++;
      break;
      i113 = 43;
      continue;
      i113 = 74;
      continue;
      i113 = 67;
      continue;
      i113 = 55;
    }
    label4033: int i116 = arrayOfChar30[i115];
    int i117;
    switch (i115 % 5)
    {
    default:
      i117 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar30[i115] = (char)(i117 ^ i116);
      i115++;
      break;
      i117 = 43;
      continue;
      i117 = 74;
      continue;
      i117 = 67;
      continue;
      i117 = 55;
    }
    label4125: int i120 = arrayOfChar31[i119];
    int i121;
    switch (i119 % 5)
    {
    default:
      i121 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar31[i119] = (char)(i121 ^ i120);
      i119++;
      break;
      i121 = 43;
      continue;
      i121 = 74;
      continue;
      i121 = 67;
      continue;
      i121 = 55;
    }
    label4217: int i124 = arrayOfChar32[i123];
    int i125;
    switch (i123 % 5)
    {
    default:
      i125 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar32[i123] = (char)(i125 ^ i124);
      i123++;
      break;
      i125 = 43;
      continue;
      i125 = 74;
      continue;
      i125 = 67;
      continue;
      i125 = 55;
    }
    label4309: int i128 = arrayOfChar33[i127];
    int i129;
    switch (i127 % 5)
    {
    default:
      i129 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar33[i127] = (char)(i129 ^ i128);
      i127++;
      break;
      i129 = 43;
      continue;
      i129 = 74;
      continue;
      i129 = 67;
      continue;
      i129 = 55;
    }
    label4401: int i132 = arrayOfChar34[i131];
    int i133;
    switch (i131 % 5)
    {
    default:
      i133 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar34[i131] = (char)(i133 ^ i132);
      i131++;
      break;
      i133 = 43;
      continue;
      i133 = 74;
      continue;
      i133 = 67;
      continue;
      i133 = 55;
    }
    label4493: int i136 = arrayOfChar35[i135];
    int i137;
    switch (i135 % 5)
    {
    default:
      i137 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar35[i135] = (char)(i137 ^ i136);
      i135++;
      break;
      i137 = 43;
      continue;
      i137 = 74;
      continue;
      i137 = 67;
      continue;
      i137 = 55;
    }
    label4585: int i140 = arrayOfChar36[i139];
    int i141;
    switch (i139 % 5)
    {
    default:
      i141 = 66;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar36[i139] = (char)(i141 ^ i140);
      i139++;
      break;
      i141 = 43;
      continue;
      i141 = 74;
      continue;
      i141 = 67;
      continue;
      i141 = 55;
    }
  }

  public static Intent a(Context paramContext)
  {
    Intent localIntent = new Intent();
    localIntent.setClassName(z[15], z[11]);
    localIntent.setAction(z[28]);
    localIntent.addCategory(z[27]);
    localIntent.addFlags(268435456);
    localIntent.addFlags(2097152);
    return localIntent;
  }

  static f a(f paramf)
  {
    m = paramf;
    return paramf;
  }

  static s9 a(s9 params9)
  {
    l = params9;
    return params9;
  }

  public static void a(Context paramContext, String paramString)
  {
    Intent localIntent1 = a(paramContext);
    Intent localIntent2 = new Intent();
    localIntent2.putExtra(z[10], localIntent1);
    localIntent2.putExtra(z[33], false);
    localIntent2.putExtra(z[14], paramString);
    localIntent2.putExtra(z[32], Intent.ShortcutIconResource.fromContext(paramContext, 2130838487));
    localIntent2.setAction(z[34]);
    paramContext.sendBroadcast(localIntent2);
  }

  public static void a(Context paramContext, String paramString, int paramInt)
  {
    Intent localIntent1;
    if (paramInt == 0)
    {
      localIntent1 = new Intent();
      localIntent1.setClassName(z[15], z[11]);
      localIntent1.addFlags(268435456);
      localIntent1.addFlags(67108864);
      if (!DialogToastListActivity.f);
    }
    else
    {
      localIntent1 = a(paramContext);
    }
    Intent localIntent2 = new Intent();
    try
    {
      localIntent2.putExtra(z[10], Intent.parseUri(localIntent1.toUri(0), 0));
      localIntent2.putExtra(z[14], paramString);
      localIntent2.setAction(z[13]);
      paramContext.sendBroadcast(localIntent2);
      return;
    }
    catch (URISyntaxException localURISyntaxException)
    {
      while (true)
        g5.d(z[12] + localURISyntaxException.getMessage());
    }
  }

  private void a(Bitmap paramBitmap, String paramString)
  {
    float f = 1.5F * j4.a(this).L;
    this.o.setImageDrawable(new p(getResources(), paramBitmap, f, paramString));
    this.o.getDrawable().setDither(true);
    this.o.getDrawable().setFilterBitmap(true);
  }

  static void a(RegisterName paramRegisterName)
  {
    paramRegisterName.g();
  }

  static zq b(RegisterName paramRegisterName)
  {
    return paramRegisterName.n;
  }

  static EditText c(RegisterName paramRegisterName)
  {
    return paramRegisterName.q;
  }

  private void g()
  {
    String str = ((EditText)findViewById(2131558746)).getText().toString().trim();
    if (str.length() == 0)
    {
      g5.c(z[17]);
      App.a(this, 2131296391, 0);
      if (!DialogToastListActivity.f);
    }
    else
    {
      ((App)getApplication()).a(str);
      App.h(str);
      App.b(this, false);
      l = new s9(this, this.r);
      if (App.j())
        showDialog(0);
    }
    if (((CheckBox)findViewById(2131558760)).isChecked())
      a(this, getString(2131296256));
  }

  private String h()
  {
    Object localObject1 = null;
    boolean bool = DialogToastListActivity.f;
    if (Build.VERSION.SDK_INT >= 14);
    while (true)
    {
      try
      {
        ContentResolver localContentResolver = getContentResolver();
        Uri localUri = ContactsContract.Profile.CONTENT_URI;
        String[] arrayOfString = new String[1];
        arrayOfString[0] = z[31];
        localCursor = localContentResolver.query(localUri, arrayOfString, null, null, null);
        if (localCursor != null)
          if (localCursor.moveToFirst())
          {
            String str = localCursor.getString(0);
            localObject2 = str;
          }
      }
      catch (Exception localException1)
      {
        try
        {
          Cursor localCursor;
          localCursor.close();
          if (localObject2 == null)
          {
            AccountManager localAccountManager = AccountManager.get(App.Mb.getApplicationContext());
            if (localAccountManager != null)
            {
              Account[] arrayOfAccount = localAccountManager.getAccounts();
              if (arrayOfAccount != null)
              {
                int i = arrayOfAccount.length;
                int j = 0;
                if (j < i)
                {
                  Account localAccount = arrayOfAccount[j];
                  if (localAccount.type.equals(z[29]))
                  {
                    if (localAccount.name.contains("@"))
                    {
                      localObject2 = localAccount.name.substring(0, localAccount.name.indexOf("@")).replace('.', ' ');
                      if (!bool);
                    }
                    else
                    {
                      localObject2 = localAccount.name.replace('.', ' ');
                      if (!bool);
                    }
                  }
                  else
                  {
                    j++;
                    if (!bool)
                      continue;
                  }
                }
              }
            }
          }
          return localObject2;
          localException1 = localException1;
          g5.d(z[30] + localException1.toString());
          localObject2 = localObject1;
          continue;
        }
        catch (Exception localException2)
        {
          localObject1 = localObject2;
          Object localObject3 = localException2;
          continue;
        }
        localObject2 = null;
        continue;
      }
      Object localObject2 = null;
    }
  }

  private void i()
  {
    Object localObject1 = null;
    int i = getResources().getDimensionPixelSize(2131361806);
    float f = 1.5F * j4.a(this).L;
    Object localObject2;
    if (hz.a(this.n.b))
    {
      this.o.setEnabled(false);
      this.p.setVisibility(0);
      if (this.s == null)
        this.s = Bitmap.createBitmap(i, i, Bitmap.Config.ALPHA_8);
      localObject2 = this.s;
    }
    while (true)
    {
      a((Bitmap)localObject2, (String)localObject1);
      return;
      this.o.setEnabled(true);
      this.p.setVisibility(8);
      if (this.n.h().exists())
        localObject1 = this.n.a(i, f, false);
      String str2;
      if (localObject1 == null)
      {
        localObject1 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), 2130838458), i, i, true);
        str2 = getResources().getString(2131296629);
        if (!DialogToastListActivity.f);
      }
      else
      {
        String str1 = getResources().getString(2131296630);
        localObject2 = localObject1;
        localObject1 = str1;
        continue;
      }
      localObject2 = localObject1;
      localObject1 = str2;
    }
  }

  static s9 j()
  {
    return l;
  }

  public void a()
  {
  }

  public void a(String paramString)
  {
    if (paramString.equals(this.n.b))
      i();
  }

  public void b(String paramString)
  {
  }

  protected void e()
  {
    App.Me localMe;
    if ((getIntent().getExtras() != null) && (getIntent().getBooleanExtra(z[7], false)))
    {
      localMe = App.bb;
      if (!DialogToastListActivity.f);
    }
    else
    {
      localMe = App.d(this);
    }
    localMe.jabber_id = App.g(App.Mb);
    if (localMe.jabber_id == null)
    {
      g5.d(z[26]);
      App.a(this, 1);
      startActivity(new Intent(this, RegisterPhone.class));
      finish();
    }
    while (true)
    {
      return;
      try
      {
        ObjectOutputStream localObjectOutputStream = new ObjectOutputStream(App.Mb.openFileOutput(z[23], 0));
        localObjectOutputStream.writeObject(localMe);
        localObjectOutputStream.close();
        App.bb = localMe;
        g5.b(z[24]);
        eu.h = true;
        eu.j = true;
        App.m(getApplication());
        App.n(getApplication());
        MessageService.a(App.Mb);
        this.n = App.w.b();
        App.a(this.n.b, 0, 2);
        i();
        this.p.setVisibility(0);
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        g5.b(z[25], localFileNotFoundException);
        finish();
      }
      catch (IOException localIOException)
      {
        g5.b(z[25], localIOException);
        finish();
      }
    }
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    boolean bool = DialogToastListActivity.f;
    switch (paramInt1)
    {
    default:
    case 12:
    case 13:
    }
    while (true)
    {
      return;
      if (paramInt2 == -1)
        if ((paramIntent != null) && (paramIntent.getBooleanExtra(z[22], false)))
        {
          iz.b(this.n, this);
          i();
          if (!bool);
        }
        else
        {
          iz.a(paramIntent, this.n, this, 13, this);
          if (bool)
          {
            iz.a().delete();
            if (paramInt2 == -1)
            {
              if (iz.a(this.n, this))
              {
                i();
                if (!bool);
              }
            }
            else if ((paramInt2 == 0) && (paramIntent != null))
              iz.a(paramIntent, this);
          }
        }
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    boolean bool = DialogToastListActivity.f;
    g5.b(z[2]);
    super.onCreate(paramBundle);
    setContentView(2130903122);
    int i = App.c(this);
    if (((i != 3) || (getIntent().getExtras() == null) || (!getIntent().getBooleanExtra(z[7], false))) && (i != 2))
    {
      g5.d(z[4]);
      startActivity(new Intent(this, Main.class));
      finish();
    }
    while (true)
    {
      return;
      if (App.g(App.Mb) == null)
      {
        g5.d(z[5]);
        App.a(this, 1);
        startActivity(new Intent(this, RegisterPhone.class));
        finish();
      }
      else
      {
        ((Button)findViewById(2131558756)).setOnClickListener(new u1(this));
        if (Build.MANUFACTURER.startsWith(z[3]))
        {
          findViewById(2131558758).setVisibility(8);
          ((CheckBox)findViewById(2131558760)).setChecked(false);
          findViewById(2131558544).setVisibility(8);
          findViewById(2131558547).setVisibility(8);
          if (!bool);
        }
        else
        {
          ((CheckBox)findViewById(2131558760)).setChecked(true);
          findViewById(2131558758).setOnClickListener(new v1(this));
        }
        this.o = ((ImageButton)findViewById(2131558678));
        this.o.setOnClickListener(new w1(this));
        this.p = findViewById(2131558566);
        String str1 = h();
        if (str1 != null)
          ((EditText)findViewById(2131558746)).setText(str1);
        if (l != null)
        {
          this.n = App.w.b();
          i();
          showDialog(0);
          if (!bool);
        }
        else if (!App.z.d())
        {
          String str2 = Environment.getExternalStorageState();
          g5.b(z[0] + str2);
          if ((!str2.equals(z[8])) && (!str2.equals(z[9])))
          {
            showDialog(102);
            if (!bool);
          }
          else
          {
            c();
          }
          if (!bool);
        }
        else
        {
          g5.b(z[6]);
          App.z.a();
          App.z.a(null);
          App.B();
          App.Mb.O();
          e();
        }
        this.q = ((EditText)findViewById(2131558746));
        this.q.setGravity(TextEmojiLabel.a(this.q.getText().toString()));
        this.q.addTextChangedListener(new x1(this));
        if (App.Mb.I())
        {
          g5.c(z[1]);
          Conversations.a(this, 113);
        }
        App.a(this, 2);
        App.a(this);
      }
    }
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    Object localObject;
    switch (paramInt)
    {
    default:
      localObject = super.onCreateDialog(paramInt);
    case 0:
    case 1:
    case 109:
    case 113:
    }
    while (true)
    {
      return localObject;
      m = new f(this);
      m.setTitle(getString(2131296393));
      m.setMessage(getString(2131296394));
      m.setIndeterminate(true);
      m.setCancelable(false);
      localObject = m;
      continue;
      g5.c(z[19]);
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this).setTitle(2131296326);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = getString(2131296328);
      localObject = localBuilder.setMessage(getString(2131296329, arrayOfObject)).setPositiveButton(2131296331, new y1(this)).create();
      continue;
      g5.c(z[18]);
      localObject = new AlertDialog.Builder(this).setMessage(2131296334).setPositiveButton(2131296332, new a2(this)).setNeutralButton(2131296268, new z1(this)).create();
      continue;
      g5.c(z[20]);
      localObject = Conversations.a(this);
    }
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    paramMenu.add(0, 0, 0, 2131296336).setIcon(2130838470);
    return true;
  }

  public void onDestroy()
  {
    super.onDestroy();
    g5.b(z[35]);
    App.b(this);
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    }
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      d(z[21]);
    }
  }

  public void onPause()
  {
    super.onPause();
    if (l != null)
      l.a();
  }

  public void onResume()
  {
    g5.b(z[16]);
    super.onResume();
    this.k = true;
    if (l != null)
    {
      if (m == null)
        showDialog(0);
      l.a(this.r);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.RegisterName
 * JD-Core Version:    0.6.1
 */