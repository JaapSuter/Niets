package com.whatsapp.wallpaper;

import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.whatsapp.App;
import com.whatsapp.App.Me;
import com.whatsapp.g5;
import com.whatsapp.mh;
import java.io.FileNotFoundException;

public class l
{
  private static SharedPreferences a;
  public static boolean b;
  private static Drawable c;
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[25];
    char[] arrayOfChar1 = "\030\\&\002H\035\003d��B".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\030\\&\002H\035\003e\016B\nBd\033I��Ye\013J\027On\037[\006Ce".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\030Mg\003_\016\\n\035\001\005\\l".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label1141;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\030\\&\002H\035\003y\032A\033Ef\nJ\027On\037[\006Ce".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label1233;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\fCfAX\007M\034N\037\\%\030N\003@{\016_\n^".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label1325;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "\030Mg\003_\016\\n\035\002".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label1417;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "\030\\f\b]@Kn\033x\016@g?N\037IyUt".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label1509;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "\030\\f\b]@Oj\001A��X+\013J\fCo\n\017\013Im\016Z\003X+\030N\003@{\016_\n^".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1601;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "\030Ee\013@\030".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1693;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "\030Mg\003_\016\\n\035��\rMh\004Z\037\003x\013L\016^o0Z\001M}\016F\003Mi\003JO".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1785;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "-Mh\004Z\037_".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label1877;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "\030Mg\003_\016\\n\035��\rMh\004Z\037\003n\035]��^+".toCharArray();
        int i40 = arrayOfChar12.length;
        i41 = 0;
        if (i40 > i41)
          break label1969;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "\030Mg\003_\016\\n\035\001\rG~\037".toCharArray();
        int i44 = arrayOfChar13.length;
        i45 = 0;
        if (i44 > i45)
          break label2061;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "\002C~\001[\nH".toCharArray();
        int i48 = arrayOfChar14.length;
        i49 = 0;
        if (i48 > i49)
          break label2153;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "\030Mg\003_\016\\n\035��\rMh\004Z\037\003x\006U\n\f".toCharArray();
        int i52 = arrayOfChar15.length;
        i53 = 0;
        if (i52 > i53)
          break label2245;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "\030Mg\003_\016\\n\035��\035Ix\033@\035I$\006@\n^y��]O".toCharArray();
        int i56 = arrayOfChar16.length;
        i57 = 0;
        if (i56 > i57)
          break label2337;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "\030Mg\003_\016\\n\035��\035Ix\033@\035I$\006A@Ed\n]\035CyO".toCharArray();
        int i60 = arrayOfChar17.length;
        i61 = 0;
        if (i60 > i61)
          break label2429;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "\030Mg\003_\016\\n\035��\035Ix\033@\035I$\f@\037U+".toCharArray();
        int i64 = arrayOfChar18.length;
        i65 = 0;
        if (i64 > i65)
          break label2521;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "\030Mg\003_\016\\n\035��\035Ix\033@\035I+\f@\032@oOA��X+\035J\001Mf\n\017\033If\037\017\tEg\n".toCharArray();
        int i68 = arrayOfChar19.length;
        i69 = 0;
        if (i68 > i69)
          break label2613;
        arrayOfString[18] = new String(arrayOfChar19).intern();
        arrayOfChar20 = "\030Mg\003_\016\\n\035��\035Ix\033@\035I$��Z\033\003b��J\035^d\035\017".toCharArray();
        int i72 = arrayOfChar20.length;
        i73 = 0;
        if (i72 > i73)
          break label2705;
        arrayOfString[19] = new String(arrayOfChar20).intern();
        arrayOfChar21 = "_l".toCharArray();
        int i76 = arrayOfChar21.length;
        i77 = 0;
        if (i76 > i77)
          break label2797;
        arrayOfString[20] = new String(arrayOfChar21).intern();
        arrayOfChar22 = "OP+".toCharArray();
        int i80 = arrayOfChar22.length;
        i81 = 0;
        if (i80 > i81)
          break label2889;
        arrayOfString[21] = new String(arrayOfChar22).intern();
        arrayOfChar23 = "\030\\f\b]@_n\033x\016@g?N\037IyUt".toCharArray();
        int i84 = arrayOfChar23.length;
        i85 = 0;
        if (i84 > i85)
          break label2981;
        arrayOfString[22] = new String(arrayOfChar23).intern();
        arrayOfChar24 = "^l".toCharArray();
        int i88 = arrayOfChar24.length;
        i89 = 0;
        if (i88 > i89)
          break label3073;
        arrayOfString[23] = new String(arrayOfChar24).intern();
        arrayOfChar25 = "AF{\b".toCharArray();
        int i92 = arrayOfChar25.length;
        i93 = 0;
        if (i92 > i93)
          break label3165;
        arrayOfString[24] = new String(arrayOfChar25).intern();
        z = arrayOfString;
        a = App.Mb.getSharedPreferences(App.Mb.getString(2131296258), 0);
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 47;
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
        m = 111;
        continue;
        m = 44;
        continue;
        m = 11;
        continue;
        m = 111;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 47;
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
      i3 = 111;
      continue;
      i3 = 44;
      continue;
      i3 = 11;
      continue;
      i3 = 111;
    }
    label1141: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 47;
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
      i7 = 111;
      continue;
      i7 = 44;
      continue;
      i7 = 11;
      continue;
      i7 = 111;
    }
    label1233: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 47;
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
      i11 = 111;
      continue;
      i11 = 44;
      continue;
      i11 = 11;
      continue;
      i11 = 111;
    }
    label1325: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 47;
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
      i15 = 111;
      continue;
      i15 = 44;
      continue;
      i15 = 11;
      continue;
      i15 = 111;
    }
    label1417: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 47;
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
      i19 = 111;
      continue;
      i19 = 44;
      continue;
      i19 = 11;
      continue;
      i19 = 111;
    }
    label1509: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 47;
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
      i23 = 111;
      continue;
      i23 = 44;
      continue;
      i23 = 11;
      continue;
      i23 = 111;
    }
    label1601: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 47;
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
      i27 = 111;
      continue;
      i27 = 44;
      continue;
      i27 = 11;
      continue;
      i27 = 111;
    }
    label1693: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 47;
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
      i31 = 111;
      continue;
      i31 = 44;
      continue;
      i31 = 11;
      continue;
      i31 = 111;
    }
    label1785: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 47;
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
      i35 = 111;
      continue;
      i35 = 44;
      continue;
      i35 = 11;
      continue;
      i35 = 111;
    }
    label1877: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 47;
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
      i39 = 111;
      continue;
      i39 = 44;
      continue;
      i39 = 11;
      continue;
      i39 = 111;
    }
    label1969: int i42 = arrayOfChar12[i41];
    int i43;
    switch (i41 % 5)
    {
    default:
      i43 = 47;
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
      i43 = 111;
      continue;
      i43 = 44;
      continue;
      i43 = 11;
      continue;
      i43 = 111;
    }
    label2061: int i46 = arrayOfChar13[i45];
    int i47;
    switch (i45 % 5)
    {
    default:
      i47 = 47;
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
      i47 = 111;
      continue;
      i47 = 44;
      continue;
      i47 = 11;
      continue;
      i47 = 111;
    }
    label2153: int i50 = arrayOfChar14[i49];
    int i51;
    switch (i49 % 5)
    {
    default:
      i51 = 47;
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
      i51 = 111;
      continue;
      i51 = 44;
      continue;
      i51 = 11;
      continue;
      i51 = 111;
    }
    label2245: int i54 = arrayOfChar15[i53];
    int i55;
    switch (i53 % 5)
    {
    default:
      i55 = 47;
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
      i55 = 111;
      continue;
      i55 = 44;
      continue;
      i55 = 11;
      continue;
      i55 = 111;
    }
    label2337: int i58 = arrayOfChar16[i57];
    int i59;
    switch (i57 % 5)
    {
    default:
      i59 = 47;
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
      i59 = 111;
      continue;
      i59 = 44;
      continue;
      i59 = 11;
      continue;
      i59 = 111;
    }
    label2429: int i62 = arrayOfChar17[i61];
    int i63;
    switch (i61 % 5)
    {
    default:
      i63 = 47;
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
      i63 = 111;
      continue;
      i63 = 44;
      continue;
      i63 = 11;
      continue;
      i63 = 111;
    }
    label2521: int i66 = arrayOfChar18[i65];
    int i67;
    switch (i65 % 5)
    {
    default:
      i67 = 47;
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
      i67 = 111;
      continue;
      i67 = 44;
      continue;
      i67 = 11;
      continue;
      i67 = 111;
    }
    label2613: int i70 = arrayOfChar19[i69];
    int i71;
    switch (i69 % 5)
    {
    default:
      i71 = 47;
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
      i71 = 111;
      continue;
      i71 = 44;
      continue;
      i71 = 11;
      continue;
      i71 = 111;
    }
    label2705: int i74 = arrayOfChar20[i73];
    int i75;
    switch (i73 % 5)
    {
    default:
      i75 = 47;
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
      i75 = 111;
      continue;
      i75 = 44;
      continue;
      i75 = 11;
      continue;
      i75 = 111;
    }
    label2797: int i78 = arrayOfChar21[i77];
    int i79;
    switch (i77 % 5)
    {
    default:
      i79 = 47;
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
      i79 = 111;
      continue;
      i79 = 44;
      continue;
      i79 = 11;
      continue;
      i79 = 111;
    }
    label2889: int i82 = arrayOfChar22[i81];
    int i83;
    switch (i81 % 5)
    {
    default:
      i83 = 47;
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
      i83 = 111;
      continue;
      i83 = 44;
      continue;
      i83 = 11;
      continue;
      i83 = 111;
    }
    label2981: int i86 = arrayOfChar23[i85];
    int i87;
    switch (i85 % 5)
    {
    default:
      i87 = 47;
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
      i87 = 111;
      continue;
      i87 = 44;
      continue;
      i87 = 11;
      continue;
      i87 = 111;
    }
    label3073: int i90 = arrayOfChar24[i89];
    int i91;
    switch (i89 % 5)
    {
    default:
      i91 = 47;
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
      i91 = 111;
      continue;
      i91 = 44;
      continue;
      i91 = 11;
      continue;
      i91 = 111;
    }
    label3165: int i94 = arrayOfChar25[i93];
    int i95;
    switch (i93 % 5)
    {
    default:
      i95 = 47;
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
      i95 = 111;
      continue;
      i95 = 44;
      continue;
      i95 = 11;
      continue;
      i95 = 111;
    }
  }

  private static Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    Bitmap localBitmap2;
    if (paramBitmap == null)
      localBitmap2 = null;
    while (true)
    {
      return localBitmap2;
      float f1 = paramBitmap.getWidth() / paramInt1;
      float f2 = paramBitmap.getHeight() / paramInt2;
      if (f1 > f2)
      {
        Bitmap localBitmap3 = Bitmap.createScaledBitmap(paramBitmap, (int)(paramBitmap.getWidth() / f2), paramInt2, true);
        localBitmap2 = Bitmap.createBitmap(localBitmap3, (localBitmap3.getWidth() - paramInt1) / 2, 0, paramInt1, paramInt2);
        if (localBitmap2 != localBitmap3)
          localBitmap3.recycle();
      }
      else
      {
        Bitmap localBitmap1 = Bitmap.createScaledBitmap(paramBitmap, paramInt1, (int)(paramBitmap.getHeight() * paramInt1 / paramBitmap.getWidth()), true);
        localBitmap2 = Bitmap.createBitmap(localBitmap1, 0, (localBitmap1.getHeight() - paramInt2) / 2, paramInt1, paramInt2);
        if (localBitmap2 != localBitmap1)
          localBitmap1.recycle();
      }
    }
  }

  public static Drawable a(String paramString)
  {
    Object localObject = null;
    String str = a.getString(z[5] + paramString, "");
    g5.b(z[6] + paramString + "]");
    String[] arrayOfString = str.split("@");
    if (arrayOfString.length < 2);
    while (true)
    {
      return localObject;
      if (arrayOfString[0].equalsIgnoreCase("0"))
      {
        try
        {
          Drawable localDrawable = App.Mb.getPackageManager().getResourcesForApplication(z[4]).getDrawable(Integer.parseInt(arrayOfString[1]));
          localObject = localDrawable;
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException)
        {
          g5.d(localNameNotFoundException.toString());
        }
      }
      else
      {
        Uri localUri = Uri.parse(arrayOfString[1]);
        try
        {
          BitmapDrawable localBitmapDrawable = new BitmapDrawable(BitmapFactory.decodeStream(App.ib.openInputStream(localUri)));
          localObject = localBitmapDrawable;
        }
        catch (FileNotFoundException localFileNotFoundException)
        {
          g5.d(localFileNotFoundException.toString());
        }
      }
    }
  }

  // ERROR //
  public static Drawable a(boolean paramBoolean, int paramInt1, Uri paramUri, int paramInt2, int paramInt3)
  {
    // Byte code:
    //   0: getstatic 225	com/whatsapp/wallpaper/ImageViewTouchBase:a	Z
    //   3: istore 5
    //   5: aconst_null
    //   6: putstatic 227	com/whatsapp/wallpaper/l:c	Landroid/graphics/drawable/Drawable;
    //   9: iload_0
    //   10: ifeq +287 -> 297
    //   13: getstatic 86	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   16: invokevirtual 164	com/whatsapp/App:getPackageManager	()Landroid/content/pm/PackageManager;
    //   19: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   22: iconst_4
    //   23: aaload
    //   24: invokevirtual 170	android/content/pm/PackageManager:getResourcesForApplication	(Ljava/lang/String;)Landroid/content/res/Resources;
    //   27: iload_1
    //   28: invokevirtual 182	android/content/res/Resources:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   31: putstatic 227	com/whatsapp/wallpaper/l:c	Landroid/graphics/drawable/Drawable;
    //   34: getstatic 227	com/whatsapp/wallpaper/l:c	Landroid/graphics/drawable/Drawable;
    //   37: checkcast 194	android/graphics/drawable/BitmapDrawable
    //   40: invokevirtual 231	android/graphics/drawable/BitmapDrawable:getBitmap	()Landroid/graphics/Bitmap;
    //   43: iload_3
    //   44: iload 4
    //   46: invokestatic 233	com/whatsapp/wallpaper/l:a	(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    //   49: astore 15
    //   51: aload 15
    //   53: ifnull +20 -> 73
    //   56: new 194	android/graphics/drawable/BitmapDrawable
    //   59: dup
    //   60: aload 15
    //   62: invokespecial 213	android/graphics/drawable/BitmapDrawable:<init>	(Landroid/graphics/Bitmap;)V
    //   65: putstatic 227	com/whatsapp/wallpaper/l:c	Landroid/graphics/drawable/Drawable;
    //   68: iload 5
    //   70: ifeq +21 -> 91
    //   73: getstatic 86	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   76: invokevirtual 237	com/whatsapp/App:getApplicationContext	()Landroid/content/Context;
    //   79: getstatic 86	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   82: ldc 238
    //   84: invokevirtual 91	com/whatsapp/App:getString	(I)Ljava/lang/String;
    //   87: iconst_0
    //   88: invokestatic 241	com/whatsapp/App:b	(Landroid/content/Context;Ljava/lang/String;I)V
    //   91: getstatic 227	com/whatsapp/wallpaper/l:c	Landroid/graphics/drawable/Drawable;
    //   94: ifnull +50 -> 144
    //   97: getstatic 86	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   100: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   103: iconst_2
    //   104: aaload
    //   105: iconst_0
    //   106: invokevirtual 245	com/whatsapp/App:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   109: astore 9
    //   111: getstatic 227	com/whatsapp/wallpaper/l:c	Landroid/graphics/drawable/Drawable;
    //   114: checkcast 194	android/graphics/drawable/BitmapDrawable
    //   117: invokevirtual 231	android/graphics/drawable/BitmapDrawable:getBitmap	()Landroid/graphics/Bitmap;
    //   120: getstatic 251	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   123: bipush 90
    //   125: aload 9
    //   127: invokevirtual 255	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   130: pop
    //   131: aload 9
    //   133: invokevirtual 260	java/io/FileOutputStream:flush	()V
    //   136: aload 9
    //   138: invokevirtual 263	java/io/FileOutputStream:close	()V
    //   141: invokestatic 265	com/whatsapp/wallpaper/l:d	()V
    //   144: getstatic 227	com/whatsapp/wallpaper/l:c	Landroid/graphics/drawable/Drawable;
    //   147: areturn
    //   148: astore 14
    //   150: new 125	java/lang/StringBuilder
    //   153: dup
    //   154: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   157: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   160: iconst_1
    //   161: aaload
    //   162: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: aload 14
    //   167: invokevirtual 268	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   170: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   173: invokestatic 186	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   176: getstatic 86	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   179: invokevirtual 237	com/whatsapp/App:getApplicationContext	()Landroid/content/Context;
    //   182: getstatic 86	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   185: ldc 238
    //   187: invokevirtual 91	com/whatsapp/App:getString	(I)Ljava/lang/String;
    //   190: iconst_0
    //   191: invokestatic 241	com/whatsapp/App:b	(Landroid/content/Context;Ljava/lang/String;I)V
    //   194: goto -103 -> 91
    //   197: astore 13
    //   199: new 125	java/lang/StringBuilder
    //   202: dup
    //   203: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   206: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   209: iconst_3
    //   210: aaload
    //   211: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   214: aload 13
    //   216: invokevirtual 268	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   219: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   222: invokestatic 186	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   225: getstatic 86	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   228: invokevirtual 237	com/whatsapp/App:getApplicationContext	()Landroid/content/Context;
    //   231: getstatic 86	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   234: ldc 238
    //   236: invokevirtual 91	com/whatsapp/App:getString	(I)Ljava/lang/String;
    //   239: iconst_0
    //   240: invokestatic 241	com/whatsapp/App:b	(Landroid/content/Context;Ljava/lang/String;I)V
    //   243: goto -152 -> 91
    //   246: astore 12
    //   248: new 125	java/lang/StringBuilder
    //   251: dup
    //   252: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   255: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   258: iconst_0
    //   259: aaload
    //   260: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: aload 12
    //   265: invokevirtual 268	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   268: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   271: invokestatic 186	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   274: getstatic 86	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   277: invokevirtual 237	com/whatsapp/App:getApplicationContext	()Landroid/content/Context;
    //   280: getstatic 86	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   283: ldc 238
    //   285: invokevirtual 91	com/whatsapp/App:getString	(I)Ljava/lang/String;
    //   288: iconst_0
    //   289: invokestatic 241	com/whatsapp/App:b	(Landroid/content/Context;Ljava/lang/String;I)V
    //   292: iload 5
    //   294: ifeq -203 -> 91
    //   297: getstatic 198	com/whatsapp/App:ib	Landroid/content/ContentResolver;
    //   300: aload_2
    //   301: invokevirtual 204	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   304: invokestatic 210	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   307: astore 11
    //   309: aload 11
    //   311: ifnull +20 -> 331
    //   314: new 194	android/graphics/drawable/BitmapDrawable
    //   317: dup
    //   318: aload 11
    //   320: invokespecial 213	android/graphics/drawable/BitmapDrawable:<init>	(Landroid/graphics/Bitmap;)V
    //   323: putstatic 227	com/whatsapp/wallpaper/l:c	Landroid/graphics/drawable/Drawable;
    //   326: iload 5
    //   328: ifeq +21 -> 349
    //   331: getstatic 86	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   334: invokevirtual 237	com/whatsapp/App:getApplicationContext	()Landroid/content/Context;
    //   337: getstatic 86	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   340: ldc 238
    //   342: invokevirtual 91	com/whatsapp/App:getString	(I)Ljava/lang/String;
    //   345: iconst_0
    //   346: invokestatic 241	com/whatsapp/App:b	(Landroid/content/Context;Ljava/lang/String;I)V
    //   349: iconst_1
    //   350: putstatic 270	com/whatsapp/wallpaper/l:b	Z
    //   353: goto -262 -> 91
    //   356: astore 6
    //   358: aload 6
    //   360: invokevirtual 214	java/io/FileNotFoundException:toString	()Ljava/lang/String;
    //   363: invokestatic 186	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   366: goto -275 -> 91
    //   369: astore 8
    //   371: aload 8
    //   373: invokevirtual 214	java/io/FileNotFoundException:toString	()Ljava/lang/String;
    //   376: invokestatic 186	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   379: goto -238 -> 141
    //   382: astore 7
    //   384: aload 7
    //   386: invokevirtual 271	java/io/IOException:toString	()Ljava/lang/String;
    //   389: invokestatic 186	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   392: goto -251 -> 141
    //
    // Exception table:
    //   from	to	target	type
    //   13	91	148	android/content/pm/PackageManager$NameNotFoundException
    //   13	91	197	java/lang/RuntimeException
    //   13	91	246	java/lang/OutOfMemoryError
    //   297	353	356	java/io/FileNotFoundException
    //   97	141	369	java/io/FileNotFoundException
    //   97	141	382	java/io/IOException
  }

  // ERROR //
  public static void a()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: aconst_null
    //   3: putstatic 227	com/whatsapp/wallpaper/l:c	Landroid/graphics/drawable/Drawable;
    //   6: getstatic 86	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   9: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   12: iconst_2
    //   13: aaload
    //   14: iconst_0
    //   15: invokevirtual 245	com/whatsapp/App:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   18: astore_0
    //   19: aload_0
    //   20: iconst_2
    //   21: invokevirtual 275	java/io/FileOutputStream:write	(I)V
    //   24: aload_0
    //   25: invokevirtual 260	java/io/FileOutputStream:flush	()V
    //   28: aload_0
    //   29: ifnull +7 -> 36
    //   32: aload_0
    //   33: invokevirtual 263	java/io/FileOutputStream:close	()V
    //   36: invokestatic 278	com/whatsapp/wallpaper/l:b	()Landroid/graphics/drawable/Drawable;
    //   39: putstatic 227	com/whatsapp/wallpaper/l:c	Landroid/graphics/drawable/Drawable;
    //   42: invokestatic 265	com/whatsapp/wallpaper/l:d	()V
    //   45: return
    //   46: astore 6
    //   48: aload 6
    //   50: invokevirtual 214	java/io/FileNotFoundException:toString	()Ljava/lang/String;
    //   53: invokestatic 186	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   56: aload_0
    //   57: ifnull -21 -> 36
    //   60: aload_0
    //   61: invokevirtual 263	java/io/FileOutputStream:close	()V
    //   64: goto -28 -> 36
    //   67: astore 7
    //   69: aload 7
    //   71: invokevirtual 271	java/io/IOException:toString	()Ljava/lang/String;
    //   74: astore 5
    //   76: aload 5
    //   78: invokestatic 186	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   81: goto -45 -> 36
    //   84: astore_3
    //   85: aload_3
    //   86: invokevirtual 271	java/io/IOException:toString	()Ljava/lang/String;
    //   89: invokestatic 186	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   92: aload_0
    //   93: ifnull -57 -> 36
    //   96: aload_0
    //   97: invokevirtual 263	java/io/FileOutputStream:close	()V
    //   100: goto -64 -> 36
    //   103: astore 4
    //   105: aload 4
    //   107: invokevirtual 271	java/io/IOException:toString	()Ljava/lang/String;
    //   110: astore 5
    //   112: goto -36 -> 76
    //   115: astore_1
    //   116: aload_0
    //   117: ifnull +7 -> 124
    //   120: aload_0
    //   121: invokevirtual 263	java/io/FileOutputStream:close	()V
    //   124: aload_1
    //   125: athrow
    //   126: astore_2
    //   127: aload_2
    //   128: invokevirtual 271	java/io/IOException:toString	()Ljava/lang/String;
    //   131: invokestatic 186	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   134: goto -10 -> 124
    //   137: astore 8
    //   139: aload 8
    //   141: invokevirtual 271	java/io/IOException:toString	()Ljava/lang/String;
    //   144: astore 5
    //   146: goto -70 -> 76
    //
    // Exception table:
    //   from	to	target	type
    //   6	28	46	java/io/FileNotFoundException
    //   60	64	67	java/io/IOException
    //   6	28	84	java/io/IOException
    //   96	100	103	java/io/IOException
    //   6	28	115	finally
    //   48	56	115	finally
    //   85	92	115	finally
    //   120	124	126	java/io/IOException
    //   32	36	137	java/io/IOException
  }

  // ERROR //
  public static void a(android.content.Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: putstatic 227	com/whatsapp/wallpaper/l:c	Landroid/graphics/drawable/Drawable;
    //   6: getstatic 86	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   9: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   12: iconst_2
    //   13: aaload
    //   14: iconst_0
    //   15: invokevirtual 245	com/whatsapp/App:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   18: astore_1
    //   19: aload_1
    //   20: iconst_3
    //   21: invokevirtual 275	java/io/FileOutputStream:write	(I)V
    //   24: aload_1
    //   25: invokevirtual 260	java/io/FileOutputStream:flush	()V
    //   28: aload_1
    //   29: ifnull +7 -> 36
    //   32: aload_1
    //   33: invokevirtual 263	java/io/FileOutputStream:close	()V
    //   36: invokestatic 265	com/whatsapp/wallpaper/l:d	()V
    //   39: return
    //   40: astore 7
    //   42: aload 7
    //   44: invokevirtual 214	java/io/FileNotFoundException:toString	()Ljava/lang/String;
    //   47: invokestatic 186	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   50: aload_1
    //   51: ifnull -15 -> 36
    //   54: aload_1
    //   55: invokevirtual 263	java/io/FileOutputStream:close	()V
    //   58: goto -22 -> 36
    //   61: astore 8
    //   63: aload 8
    //   65: invokevirtual 271	java/io/IOException:toString	()Ljava/lang/String;
    //   68: astore 6
    //   70: aload 6
    //   72: invokestatic 186	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   75: goto -39 -> 36
    //   78: astore 4
    //   80: aload 4
    //   82: invokevirtual 271	java/io/IOException:toString	()Ljava/lang/String;
    //   85: invokestatic 186	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   88: aload_1
    //   89: ifnull -53 -> 36
    //   92: aload_1
    //   93: invokevirtual 263	java/io/FileOutputStream:close	()V
    //   96: goto -60 -> 36
    //   99: astore 5
    //   101: aload 5
    //   103: invokevirtual 271	java/io/IOException:toString	()Ljava/lang/String;
    //   106: astore 6
    //   108: goto -38 -> 70
    //   111: astore_2
    //   112: aload_1
    //   113: ifnull +7 -> 120
    //   116: aload_1
    //   117: invokevirtual 263	java/io/FileOutputStream:close	()V
    //   120: aload_2
    //   121: athrow
    //   122: astore_3
    //   123: aload_3
    //   124: invokevirtual 271	java/io/IOException:toString	()Ljava/lang/String;
    //   127: invokestatic 186	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   130: goto -10 -> 120
    //   133: astore 9
    //   135: aload 9
    //   137: invokevirtual 271	java/io/IOException:toString	()Ljava/lang/String;
    //   140: astore 6
    //   142: goto -72 -> 70
    //
    // Exception table:
    //   from	to	target	type
    //   6	28	40	java/io/FileNotFoundException
    //   54	58	61	java/io/IOException
    //   6	28	78	java/io/IOException
    //   92	96	99	java/io/IOException
    //   6	28	111	finally
    //   42	50	111	finally
    //   80	88	111	finally
    //   116	120	122	java/io/IOException
    //   32	36	133	java/io/IOException
  }

  public static void a(String paramString, boolean paramBoolean, int paramInt, Uri paramUri)
  {
    g5.b(z[22] + paramString + z[21] + paramInt + z[21] + paramUri + "]");
    String str;
    if (paramBoolean)
    {
      str = z[20] + paramInt;
      if (!ImageViewTouchBase.a);
    }
    else
    {
      str = z[23] + paramUri;
    }
    SharedPreferences.Editor localEditor = a.edit();
    localEditor.putString(z[5] + paramString, str);
    localEditor.commit();
  }

  // ERROR //
  public static Drawable b()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: getstatic 225	com/whatsapp/wallpaper/ImageViewTouchBase:a	Z
    //   5: istore_1
    //   6: getstatic 227	com/whatsapp/wallpaper/l:c	Landroid/graphics/drawable/Drawable;
    //   9: ifnonnull +254 -> 263
    //   12: getstatic 86	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   15: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   18: iconst_2
    //   19: aaload
    //   20: invokevirtual 301	com/whatsapp/App:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   23: astore 28
    //   25: aload 28
    //   27: astore_3
    //   28: aload_3
    //   29: invokestatic 210	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   32: astore 32
    //   34: aload 32
    //   36: ifnull +19 -> 55
    //   39: new 194	android/graphics/drawable/BitmapDrawable
    //   42: dup
    //   43: aload 32
    //   45: invokespecial 213	android/graphics/drawable/BitmapDrawable:<init>	(Landroid/graphics/Bitmap;)V
    //   48: putstatic 227	com/whatsapp/wallpaper/l:c	Landroid/graphics/drawable/Drawable;
    //   51: iload_1
    //   52: ifeq +7 -> 59
    //   55: aconst_null
    //   56: putstatic 227	com/whatsapp/wallpaper/l:c	Landroid/graphics/drawable/Drawable;
    //   59: aload_3
    //   60: ifnull +7 -> 67
    //   63: aload_3
    //   64: invokevirtual 304	java/io/FileInputStream:close	()V
    //   67: getstatic 227	com/whatsapp/wallpaper/l:c	Landroid/graphics/drawable/Drawable;
    //   70: ifnonnull +193 -> 263
    //   73: getstatic 86	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   76: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   79: iconst_2
    //   80: aaload
    //   81: invokevirtual 301	com/whatsapp/App:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   84: astore_0
    //   85: aload_0
    //   86: invokevirtual 307	java/io/FileInputStream:read	()I
    //   89: istore 21
    //   91: iload 21
    //   93: istore 9
    //   95: aload_0
    //   96: ifnull +7 -> 103
    //   99: aload_0
    //   100: invokevirtual 304	java/io/FileInputStream:close	()V
    //   103: iload 9
    //   105: iconst_2
    //   106: if_icmpeq +9 -> 115
    //   109: iload 9
    //   111: iconst_1
    //   112: if_icmpne +151 -> 263
    //   115: getstatic 86	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   118: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   121: bipush 8
    //   123: aaload
    //   124: invokevirtual 311	com/whatsapp/App:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   127: checkcast 313	android/view/WindowManager
    //   130: invokeinterface 317 1 0
    //   135: astore 10
    //   137: getstatic 86	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   140: invokestatic 322	com/whatsapp/j4:a	(Landroid/content/Context;)Lcom/whatsapp/j4;
    //   143: astore 11
    //   145: getstatic 86	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   148: invokevirtual 326	com/whatsapp/App:getResources	()Landroid/content/res/Resources;
    //   151: invokevirtual 330	android/content/res/Resources:getConfiguration	()Landroid/content/res/Configuration;
    //   154: getfield 336	android/content/res/Configuration:orientation	I
    //   157: iconst_1
    //   158: if_icmpne +212 -> 370
    //   161: aload 10
    //   163: invokevirtual 339	android/view/Display:getHeight	()I
    //   166: getstatic 86	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   169: invokevirtual 326	com/whatsapp/App:getResources	()Landroid/content/res/Resources;
    //   172: ldc_w 340
    //   175: invokevirtual 344	android/content/res/Resources:getDimension	(I)F
    //   178: f2i
    //   179: isub
    //   180: aload 11
    //   182: invokevirtual 346	com/whatsapp/j4:c	()I
    //   185: isub
    //   186: istore 16
    //   188: aload 10
    //   190: invokevirtual 347	android/view/Display:getWidth	()I
    //   193: istore 17
    //   195: iload 16
    //   197: istore 14
    //   199: iload 17
    //   201: istore 15
    //   203: getstatic 86	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   206: invokevirtual 326	com/whatsapp/App:getResources	()Landroid/content/res/Resources;
    //   209: ldc_w 348
    //   212: invokevirtual 182	android/content/res/Resources:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   215: putstatic 227	com/whatsapp/wallpaper/l:c	Landroid/graphics/drawable/Drawable;
    //   218: getstatic 227	com/whatsapp/wallpaper/l:c	Landroid/graphics/drawable/Drawable;
    //   221: ifnull +33 -> 254
    //   224: new 194	android/graphics/drawable/BitmapDrawable
    //   227: dup
    //   228: getstatic 227	com/whatsapp/wallpaper/l:c	Landroid/graphics/drawable/Drawable;
    //   231: checkcast 194	android/graphics/drawable/BitmapDrawable
    //   234: invokevirtual 231	android/graphics/drawable/BitmapDrawable:getBitmap	()Landroid/graphics/Bitmap;
    //   237: iload 15
    //   239: iload 14
    //   241: invokestatic 233	com/whatsapp/wallpaper/l:a	(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    //   244: invokespecial 213	android/graphics/drawable/BitmapDrawable:<init>	(Landroid/graphics/Bitmap;)V
    //   247: putstatic 227	com/whatsapp/wallpaper/l:c	Landroid/graphics/drawable/Drawable;
    //   250: iload_1
    //   251: ifeq +12 -> 263
    //   254: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   257: bipush 7
    //   259: aaload
    //   260: invokestatic 350	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   263: getstatic 227	com/whatsapp/wallpaper/l:c	Landroid/graphics/drawable/Drawable;
    //   266: areturn
    //   267: astore 25
    //   269: aconst_null
    //   270: astore 26
    //   272: aload 25
    //   274: invokestatic 353	com/whatsapp/g5:b	(Ljava/lang/Throwable;)V
    //   277: aload 26
    //   279: ifnull -212 -> 67
    //   282: aload 26
    //   284: invokevirtual 304	java/io/FileInputStream:close	()V
    //   287: goto -220 -> 67
    //   290: astore 27
    //   292: aload 27
    //   294: invokevirtual 271	java/io/IOException:toString	()Ljava/lang/String;
    //   297: astore 5
    //   299: aload 5
    //   301: invokestatic 186	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   304: goto -237 -> 67
    //   307: astore 23
    //   309: aload_0
    //   310: ifnull +7 -> 317
    //   313: aload_0
    //   314: invokevirtual 304	java/io/FileInputStream:close	()V
    //   317: aload 23
    //   319: athrow
    //   320: astore 19
    //   322: aload_0
    //   323: ifnull +7 -> 330
    //   326: aload_0
    //   327: invokevirtual 304	java/io/FileInputStream:close	()V
    //   330: iconst_2
    //   331: istore 9
    //   333: goto -230 -> 103
    //   336: astore 8
    //   338: aload 8
    //   340: invokestatic 353	com/whatsapp/g5:b	(Ljava/lang/Throwable;)V
    //   343: aload_0
    //   344: ifnull +7 -> 351
    //   347: aload_0
    //   348: invokevirtual 304	java/io/FileInputStream:close	()V
    //   351: iconst_2
    //   352: istore 9
    //   354: goto -251 -> 103
    //   357: astore 6
    //   359: aload_0
    //   360: ifnull +7 -> 367
    //   363: aload_0
    //   364: invokevirtual 304	java/io/FileInputStream:close	()V
    //   367: aload 6
    //   369: athrow
    //   370: aload 10
    //   372: invokevirtual 347	android/view/Display:getWidth	()I
    //   375: getstatic 86	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   378: invokevirtual 326	com/whatsapp/App:getResources	()Landroid/content/res/Resources;
    //   381: ldc_w 340
    //   384: invokevirtual 344	android/content/res/Resources:getDimension	(I)F
    //   387: f2i
    //   388: isub
    //   389: aload 11
    //   391: invokevirtual 346	com/whatsapp/j4:c	()I
    //   394: isub
    //   395: istore 12
    //   397: aload 10
    //   399: invokevirtual 339	android/view/Display:getHeight	()I
    //   402: istore 13
    //   404: iload 12
    //   406: istore 14
    //   408: iload 13
    //   410: istore 15
    //   412: goto -209 -> 203
    //   415: astore_2
    //   416: aconst_null
    //   417: astore_3
    //   418: aload_3
    //   419: ifnull -352 -> 67
    //   422: aload_3
    //   423: invokevirtual 304	java/io/FileInputStream:close	()V
    //   426: goto -359 -> 67
    //   429: astore 4
    //   431: aload 4
    //   433: invokevirtual 271	java/io/IOException:toString	()Ljava/lang/String;
    //   436: astore 5
    //   438: goto -139 -> 299
    //   441: astore 20
    //   443: aload 20
    //   445: invokevirtual 271	java/io/IOException:toString	()Ljava/lang/String;
    //   448: invokestatic 186	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   451: goto -121 -> 330
    //   454: astore 7
    //   456: aload 7
    //   458: invokevirtual 271	java/io/IOException:toString	()Ljava/lang/String;
    //   461: invokestatic 186	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   464: goto -97 -> 367
    //   467: astore 18
    //   469: aload 18
    //   471: invokevirtual 271	java/io/IOException:toString	()Ljava/lang/String;
    //   474: invokestatic 186	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   477: goto -126 -> 351
    //   480: astore 22
    //   482: aload 22
    //   484: invokevirtual 271	java/io/IOException:toString	()Ljava/lang/String;
    //   487: invokestatic 186	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   490: goto -387 -> 103
    //   493: astore 24
    //   495: aload 24
    //   497: invokevirtual 271	java/io/IOException:toString	()Ljava/lang/String;
    //   500: invokestatic 186	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   503: goto -186 -> 317
    //   506: astore 33
    //   508: aload 33
    //   510: invokevirtual 271	java/io/IOException:toString	()Ljava/lang/String;
    //   513: astore 5
    //   515: goto -216 -> 299
    //   518: astore 31
    //   520: aload_3
    //   521: astore_0
    //   522: aload 31
    //   524: astore 23
    //   526: goto -217 -> 309
    //   529: astore 23
    //   531: aload 26
    //   533: astore_0
    //   534: goto -225 -> 309
    //   537: astore 30
    //   539: aload_3
    //   540: astore 26
    //   542: aload 30
    //   544: astore 25
    //   546: goto -274 -> 272
    //   549: astore 29
    //   551: goto -133 -> 418
    //
    // Exception table:
    //   from	to	target	type
    //   12	25	267	java/lang/OutOfMemoryError
    //   282	287	290	java/io/IOException
    //   12	25	307	finally
    //   73	91	320	java/io/IOException
    //   73	91	336	java/lang/OutOfMemoryError
    //   73	91	357	finally
    //   338	343	357	finally
    //   12	25	415	java/io/IOException
    //   422	426	429	java/io/IOException
    //   326	330	441	java/io/IOException
    //   363	367	454	java/io/IOException
    //   347	351	467	java/io/IOException
    //   99	103	480	java/io/IOException
    //   313	317	493	java/io/IOException
    //   63	67	506	java/io/IOException
    //   28	59	518	finally
    //   272	277	529	finally
    //   28	59	537	java/lang/OutOfMemoryError
    //   28	59	549	java/io/IOException
  }

  public static Uri c()
  {
    return Uri.fromFile(App.b(mh.b(new StringBuilder().append(App.bb.jabber_id).append(Long.toString(System.currentTimeMillis())).toString()) + z[24]));
  }

  // ERROR //
  public static void d()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: new 391	java/io/File
    //   5: dup
    //   6: new 391	java/io/File
    //   9: dup
    //   10: getstatic 394	com/whatsapp/App:c	Ljava/io/File;
    //   13: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   16: bipush 10
    //   18: aaload
    //   19: invokespecial 397	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   22: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   25: bipush 12
    //   27: aaload
    //   28: invokespecial 397	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   31: astore_1
    //   32: new 391	java/io/File
    //   35: dup
    //   36: getstatic 86	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   39: invokevirtual 401	com/whatsapp/App:getFilesDir	()Ljava/io/File;
    //   42: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   45: iconst_2
    //   46: aaload
    //   47: invokespecial 397	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   50: astore_2
    //   51: aload_2
    //   52: invokevirtual 404	java/io/File:exists	()Z
    //   55: ifne +4 -> 59
    //   58: return
    //   59: aload_1
    //   60: invokevirtual 407	java/io/File:getParentFile	()Ljava/io/File;
    //   63: invokevirtual 404	java/io/File:exists	()Z
    //   66: ifne +11 -> 77
    //   69: aload_1
    //   70: invokevirtual 407	java/io/File:getParentFile	()Ljava/io/File;
    //   73: invokevirtual 410	java/io/File:mkdirs	()Z
    //   76: pop
    //   77: invokestatic 415	android/os/Environment:getExternalStorageState	()Ljava/lang/String;
    //   80: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   83: bipush 13
    //   85: aaload
    //   86: invokevirtual 419	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   89: ifeq +154 -> 243
    //   92: new 125	java/lang/StringBuilder
    //   95: dup
    //   96: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   99: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   102: bipush 14
    //   104: aaload
    //   105: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: aload_2
    //   109: invokevirtual 422	java/io/File:length	()J
    //   112: invokevirtual 425	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   115: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   118: invokestatic 148	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   121: new 427	com/whatsapp/pf
    //   124: dup
    //   125: getstatic 431	com/whatsapp/App:B	Lcom/whatsapp/w5;
    //   128: aload_1
    //   129: invokespecial 434	com/whatsapp/pf:<init>	(Lcom/whatsapp/w5;Ljava/io/File;)V
    //   132: invokestatic 440	java/nio/channels/Channels:newChannel	(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;
    //   135: astore 6
    //   137: aload 6
    //   139: astore 4
    //   141: new 303	java/io/FileInputStream
    //   144: dup
    //   145: aload_2
    //   146: invokespecial 443	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   149: invokevirtual 447	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   152: astore_0
    //   153: aload_0
    //   154: aload 4
    //   156: invokestatic 452	com/whatsapp/s4:a	(Ljava/nio/channels/FileChannel;Ljava/nio/channels/WritableByteChannel;)V
    //   159: aload_0
    //   160: ifnull +7 -> 167
    //   163: aload_0
    //   164: invokevirtual 455	java/nio/channels/FileChannel:close	()V
    //   167: aload 4
    //   169: ifnull -111 -> 58
    //   172: aload 4
    //   174: invokeinterface 458 1 0
    //   179: goto -121 -> 58
    //   182: astore 5
    //   184: new 125	java/lang/StringBuilder
    //   187: dup
    //   188: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   191: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   194: bipush 11
    //   196: aaload
    //   197: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: aload 5
    //   202: invokevirtual 459	java/lang/Exception:toString	()Ljava/lang/String;
    //   205: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   208: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   211: invokestatic 350	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   214: goto -156 -> 58
    //   217: astore_3
    //   218: aconst_null
    //   219: astore 4
    //   221: aload_0
    //   222: ifnull +7 -> 229
    //   225: aload_0
    //   226: invokevirtual 455	java/nio/channels/FileChannel:close	()V
    //   229: aload 4
    //   231: ifnull +10 -> 241
    //   234: aload 4
    //   236: invokeinterface 458 1 0
    //   241: aload_3
    //   242: athrow
    //   243: new 125	java/lang/StringBuilder
    //   246: dup
    //   247: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   250: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   253: bipush 9
    //   255: aaload
    //   256: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: invokestatic 415	android/os/Environment:getExternalStorageState	()Ljava/lang/String;
    //   262: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   265: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   268: invokestatic 148	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   271: goto -213 -> 58
    //   274: astore_3
    //   275: goto -54 -> 221
    //
    // Exception table:
    //   from	to	target	type
    //   163	179	182	java/lang/Exception
    //   225	243	182	java/lang/Exception
    //   92	137	217	finally
    //   141	159	274	finally
  }

  // ERROR //
  public static void e()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: new 391	java/io/File
    //   5: dup
    //   6: new 391	java/io/File
    //   9: dup
    //   10: getstatic 394	com/whatsapp/App:c	Ljava/io/File;
    //   13: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   16: bipush 10
    //   18: aaload
    //   19: invokespecial 397	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   22: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   25: bipush 12
    //   27: aaload
    //   28: invokespecial 397	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   31: astore_1
    //   32: new 391	java/io/File
    //   35: dup
    //   36: getstatic 86	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   39: invokevirtual 401	com/whatsapp/App:getFilesDir	()Ljava/io/File;
    //   42: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   45: iconst_2
    //   46: aaload
    //   47: invokespecial 397	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   50: astore_2
    //   51: aload_1
    //   52: invokevirtual 404	java/io/File:exists	()Z
    //   55: ifeq +138 -> 193
    //   58: new 391	java/io/File
    //   61: dup
    //   62: getstatic 86	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   65: invokevirtual 401	com/whatsapp/App:getFilesDir	()Ljava/io/File;
    //   68: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   71: bipush 12
    //   73: aaload
    //   74: invokespecial 397	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   77: astore_3
    //   78: new 125	java/lang/StringBuilder
    //   81: dup
    //   82: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   85: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   88: bipush 17
    //   90: aaload
    //   91: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: aload_1
    //   95: invokevirtual 463	java/io/File:getName	()Ljava/lang/String;
    //   98: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: ldc_w 465
    //   104: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: aload_1
    //   108: invokevirtual 422	java/io/File:length	()J
    //   111: invokevirtual 425	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   114: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   117: invokestatic 148	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   120: new 257	java/io/FileOutputStream
    //   123: dup
    //   124: aload_3
    //   125: iconst_0
    //   126: invokespecial 468	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   129: invokestatic 440	java/nio/channels/Channels:newChannel	(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;
    //   132: astore 11
    //   134: aload 11
    //   136: astore 5
    //   138: new 303	java/io/FileInputStream
    //   141: dup
    //   142: aload_1
    //   143: invokespecial 443	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   146: invokevirtual 447	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   149: astore_0
    //   150: aload_0
    //   151: aload 5
    //   153: invokestatic 452	com/whatsapp/s4:a	(Ljava/nio/channels/FileChannel;Ljava/nio/channels/WritableByteChannel;)V
    //   156: aload_0
    //   157: ifnull +7 -> 164
    //   160: aload_0
    //   161: invokevirtual 455	java/nio/channels/FileChannel:close	()V
    //   164: aload 5
    //   166: ifnull +27 -> 193
    //   169: aload 5
    //   171: invokeinterface 458 1 0
    //   176: aload_3
    //   177: aload_2
    //   178: invokevirtual 472	java/io/File:renameTo	(Ljava/io/File;)Z
    //   181: ifne +12 -> 193
    //   184: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   187: bipush 18
    //   189: aaload
    //   190: invokestatic 186	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   193: return
    //   194: astore 8
    //   196: aconst_null
    //   197: astore 5
    //   199: new 125	java/lang/StringBuilder
    //   202: dup
    //   203: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   206: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   209: bipush 15
    //   211: aaload
    //   212: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: aload 8
    //   217: invokevirtual 271	java/io/IOException:toString	()Ljava/lang/String;
    //   220: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   226: invokestatic 350	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   229: aload_0
    //   230: ifnull +7 -> 237
    //   233: aload_0
    //   234: invokevirtual 455	java/nio/channels/FileChannel:close	()V
    //   237: aload 5
    //   239: ifnull -46 -> 193
    //   242: aload 5
    //   244: invokeinterface 458 1 0
    //   249: goto -56 -> 193
    //   252: astore 9
    //   254: new 125	java/lang/StringBuilder
    //   257: dup
    //   258: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   261: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   264: bipush 19
    //   266: aaload
    //   267: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: aload 9
    //   272: invokevirtual 271	java/io/IOException:toString	()Ljava/lang/String;
    //   275: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   278: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   281: invokestatic 350	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   284: goto -91 -> 193
    //   287: astore 4
    //   289: aconst_null
    //   290: astore 5
    //   292: aload_0
    //   293: ifnull +7 -> 300
    //   296: aload_0
    //   297: invokevirtual 455	java/nio/channels/FileChannel:close	()V
    //   300: aload 5
    //   302: ifnull +10 -> 312
    //   305: aload 5
    //   307: invokeinterface 458 1 0
    //   312: aload 4
    //   314: athrow
    //   315: astore 7
    //   317: new 125	java/lang/StringBuilder
    //   320: dup
    //   321: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   324: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   327: bipush 16
    //   329: aaload
    //   330: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   333: aload 7
    //   335: invokevirtual 271	java/io/IOException:toString	()Ljava/lang/String;
    //   338: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   341: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   344: invokestatic 350	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   347: goto -47 -> 300
    //   350: astore 6
    //   352: new 125	java/lang/StringBuilder
    //   355: dup
    //   356: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   359: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   362: bipush 19
    //   364: aaload
    //   365: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   368: aload 6
    //   370: invokevirtual 271	java/io/IOException:toString	()Ljava/lang/String;
    //   373: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   376: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   379: invokestatic 350	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   382: goto -70 -> 312
    //   385: astore 10
    //   387: new 125	java/lang/StringBuilder
    //   390: dup
    //   391: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   394: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   397: bipush 16
    //   399: aaload
    //   400: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   403: aload 10
    //   405: invokevirtual 271	java/io/IOException:toString	()Ljava/lang/String;
    //   408: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   411: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   414: invokestatic 350	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   417: goto -180 -> 237
    //   420: astore 13
    //   422: new 125	java/lang/StringBuilder
    //   425: dup
    //   426: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   429: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   432: bipush 16
    //   434: aaload
    //   435: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   438: aload 13
    //   440: invokevirtual 271	java/io/IOException:toString	()Ljava/lang/String;
    //   443: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   446: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   449: invokestatic 350	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   452: goto -288 -> 164
    //   455: astore 12
    //   457: new 125	java/lang/StringBuilder
    //   460: dup
    //   461: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   464: getstatic 80	com/whatsapp/wallpaper/l:z	[Ljava/lang/String;
    //   467: bipush 19
    //   469: aaload
    //   470: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   473: aload 12
    //   475: invokevirtual 271	java/io/IOException:toString	()Ljava/lang/String;
    //   478: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   481: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   484: invokestatic 350	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   487: goto -311 -> 176
    //   490: astore 4
    //   492: goto -200 -> 292
    //   495: astore 8
    //   497: goto -298 -> 199
    //
    // Exception table:
    //   from	to	target	type
    //   120	134	194	java/io/IOException
    //   242	249	252	java/io/IOException
    //   120	134	287	finally
    //   296	300	315	java/io/IOException
    //   305	312	350	java/io/IOException
    //   233	237	385	java/io/IOException
    //   160	164	420	java/io/IOException
    //   169	176	455	java/io/IOException
    //   138	156	490	finally
    //   199	229	490	finally
    //   138	156	495	java/io/IOException
  }
}