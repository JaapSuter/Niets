package com.whatsapp.billing;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

class a extends SQLiteOpenHelper
{
  private static final String[] z;
  final j a;

  static
  {
    String[] arrayOfString = new String[8];
    char[] arrayOfChar1 = "kU[\"Ym'J\"OdB>\023xZdv\002~Mc6<dL'J&U|'N1DeFL:-cBGO-Yr\ryAsgCDfS[$Hz.".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "kU[\"Ym'J\"OdB>\013d[sq\021t��Xw\007-|BF7-xUW.Lz^>(Hq+>\020yIs{CDfS[$Hz+>\023Gck��yac>7HpS2CiMq{\017bXbl3lQkq\002i\bS[;Y\004'n\026Ko\020h|ns\006-aIJ&JmU7".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "lUQ3-|F\\/H\bNXCHpNM7^\bow\020yGug".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label477;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\bsqY-".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label569;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "lfj\002oIt{CxX`l\002iM'x\021bE'q\017i\022'".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label661;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "lUQ3-|F\\/H\bNXCHpNM7^\bwk\021n@fm\006i".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label753;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "xrl��eIt{'l\\f|\002~M".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label845;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "Xrl��eIt{MiJ".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label937;
        arrayOfString[7] = new String(arrayOfChar8).intern();
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
        m = 13;
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
        m = 40;
        continue;
        m = 7;
        continue;
        m = 30;
        continue;
        m = 99;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 13;
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
      i3 = 40;
      continue;
      i3 = 7;
      continue;
      i3 = 30;
      continue;
      i3 = 99;
    }
    label477: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 13;
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
      i7 = 40;
      continue;
      i7 = 7;
      continue;
      i7 = 30;
      continue;
      i7 = 99;
    }
    label569: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 13;
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
      i11 = 40;
      continue;
      i11 = 7;
      continue;
      i11 = 30;
      continue;
      i11 = 99;
    }
    label661: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 13;
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
      i15 = 40;
      continue;
      i15 = 7;
      continue;
      i15 = 30;
      continue;
      i15 = 99;
    }
    label753: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 13;
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
      i19 = 40;
      continue;
      i19 = 7;
      continue;
      i19 = 30;
      continue;
      i19 = 99;
    }
    label845: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 13;
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
      i23 = 40;
      continue;
      i23 = 7;
      continue;
      i23 = 30;
      continue;
      i23 = 99;
    }
    label937: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 13;
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
      i27 = 40;
      continue;
      i27 = 7;
      continue;
      i27 = 30;
      continue;
      i27 = 99;
    }
  }

  public a(j paramj, Context paramContext)
  {
    super(paramContext, z[7], null, 1);
  }

  private void a(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL(z[1]);
    paramSQLiteDatabase.execSQL(z[0]);
  }

  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    a(paramSQLiteDatabase);
  }

  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (paramInt2 != 1)
    {
      Log.w(z[6], z[4] + paramInt1 + z[3] + paramInt2);
      paramSQLiteDatabase.execSQL(z[2]);
      paramSQLiteDatabase.execSQL(z[5]);
      a(paramSQLiteDatabase);
    }
  }
}