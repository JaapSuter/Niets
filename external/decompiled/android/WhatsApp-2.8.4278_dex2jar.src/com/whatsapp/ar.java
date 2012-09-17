package com.whatsapp;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.io.File;
import java.io.InputStream;

public class ar extends zq
{
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[6];
    char[] arrayOfChar1 = "\036\001".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\036\0013AH\024".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\003\026rMQ\037\001B[P\034\020rt^\006\bqtQ\027".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label401;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\020\013s_Y\020\020pJV\022\003xY\027��\001i[J\034\002tG]\003\fr_W\032��2MY\032\bxO".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label493;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\003\026rMQ\037\001B[P\034\020rtL\033\021pIg\032��".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label585;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "3\0273\\P\022\020nJH\003JsNL".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label677;
        arrayOfString[5] = new String(arrayOfChar6).intern();
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
        m = 56;
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
        m = 115;
        continue;
        m = 100;
        continue;
        m = 29;
        continue;
        m = 43;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 56;
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
      i3 = 115;
      continue;
      i3 = 100;
      continue;
      i3 = 29;
      continue;
      i3 = 43;
    }
    label401: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 56;
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
      i7 = 115;
      continue;
      i7 = 100;
      continue;
      i7 = 29;
      continue;
      i7 = 43;
    }
    label493: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 56;
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
      i11 = 115;
      continue;
      i11 = 100;
      continue;
      i11 = 29;
      continue;
      i11 = 43;
    }
    label585: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 56;
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
      i15 = 115;
      continue;
      i15 = 100;
      continue;
      i15 = 29;
      continue;
      i15 = 43;
    }
    label677: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 56;
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
      i19 = 115;
      continue;
      i19 = 100;
      continue;
      i19 = 29;
      continue;
      i19 = 43;
    }
  }

  public ar()
  {
    super(App.c() + z[5]);
    SharedPreferences localSharedPreferences = App.Mb.getSharedPreferences(App.Mb.getString(2131296258), 0);
    this.p = localSharedPreferences.getInt(z[4], 0);
    this.o = localSharedPreferences.getInt(z[2], 0);
  }

  protected InputStream a(boolean paramBoolean)
  {
    return null;
  }

  public void a(int paramInt1, int paramInt2)
  {
    this.o = paramInt1;
    this.p = paramInt2;
    SharedPreferences.Editor localEditor = App.Mb.getSharedPreferences(App.Mb.getString(2131296258), 0).edit();
    localEditor.putInt(z[4], paramInt2);
    localEditor.putInt(z[2], paramInt1);
    if (!localEditor.commit())
      g5.d(z[3]);
  }

  public boolean c(boolean paramBoolean)
  {
    return false;
  }

  public File g()
  {
    return new File(App.Mb.getFilesDir(), z[1]);
  }

  public File h()
  {
    return b(z[0]);
  }
}