package com.whatsapp;

import android.os.AsyncTask;
import java.io.IOException;

public class tb extends AsyncTask<String, Void, Integer>
{
  private static final String[] z;
  private String a;
  final RegisterPhone b;

  static
  {
    String[] arrayOfString = new String[6];
    char[] arrayOfChar1 = "\0234)4`\0254<rc\t> 8<\0029+>x\0234'3`\0250\"1v\005~+/a\016#n".toCharArray();
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
      arrayOfChar2 = "\0234)4`\0254<rc\t> 8<\0029+>x\0234'3`\0250\"1v\005~'2v\023#!/3".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "A#+;f\0224*".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label401;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\0234)4`\0254<rc\t> 8<\01749pz\017\":<\r0:4|\017".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label493;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\0234)4`\0254<rc\t> 8<\0234'3`\0250\"1v\005".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label585;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "\0234)4`\0254<rc\t> 8<\003=!>x\0045".toCharArray();
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
        m = 19;
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
        m = 97;
        continue;
        m = 81;
        continue;
        m = 78;
        continue;
        m = 93;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 19;
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
      i3 = 97;
      continue;
      i3 = 81;
      continue;
      i3 = 78;
      continue;
      i3 = 93;
    }
    label401: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 19;
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
      i7 = 97;
      continue;
      i7 = 81;
      continue;
      i7 = 78;
      continue;
      i7 = 93;
    }
    label493: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 19;
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
      i11 = 97;
      continue;
      i11 = 81;
      continue;
      i11 = 78;
      continue;
      i11 = 93;
    }
    label585: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 19;
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
      i15 = 97;
      continue;
      i15 = 81;
      continue;
      i15 = 78;
      continue;
      i15 = 93;
    }
    label677: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 19;
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
      i19 = 97;
      continue;
      i19 = 81;
      continue;
      i19 = 78;
      continue;
      i19 = 93;
    }
  }

  protected tb(RegisterPhone paramRegisterPhone)
  {
  }

  protected Integer a(String[] paramArrayOfString)
  {
    Object localObject;
    try
    {
      String str2 = paramArrayOfString[3];
      if ((str2 != null) && (str2.length() == 0))
        str2 = null;
      zp localzp = yp.a(paramArrayOfString[0], paramArrayOfString[1], paramArrayOfString[2], str2);
      if (localzp.a == tf.a)
      {
        this.a = localzp.c;
        localObject = Integer.valueOf(1);
      }
      else if (localzp.a == tf.b)
      {
        if (localzp.b == sf.b);
        for (int i = 5; ; i = 2)
        {
          Integer localInteger = Integer.valueOf(i);
          localObject = localInteger;
          break;
        }
      }
    }
    catch (IOException localIOException)
    {
      String str1 = localIOException.toString();
      g5.d(z[1] + str1);
      if ((str1 != null) && (str1.contains(z[2])))
        localObject = Integer.valueOf(4);
      else
        localObject = Integer.valueOf(3);
    }
    catch (Exception localException)
    {
      g5.d(z[0] + localException.toString());
      localObject = Integer.valueOf(4);
    }
    return localObject;
  }

  protected void a(Integer paramInteger)
  {
    boolean bool = DialogToastListActivity.f;
    this.b.A = false;
    if (paramInteger.intValue() == 1)
    {
      this.b.removeDialog(9);
      g5.b(z[4]);
      App.c(App.Mb, this.a);
      RegisterPhone.a(this.b, false);
      if (!bool);
    }
    else if (paramInteger.intValue() == 2)
    {
      g5.b(z[3]);
      this.b.e(VerifyNumber.j);
      if (this.b.d())
      {
        new ub(this.b).execute(new String[0]);
        if (!bool);
      }
      else
      {
        this.b.removeDialog(9);
        RegisterPhone.a(15);
        RegisterPhone.a(this.b);
        if ((!this.b.l) && (!this.b.isFinishing()))
        {
          this.b.showDialog(21);
          if (!bool);
        }
      }
    }
    else if (paramInteger.intValue() == 5)
    {
      g5.d(z[5]);
      this.b.A = true;
      this.b.removeDialog(9);
      if ((!this.b.l) && (!this.b.isFinishing()))
      {
        this.b.showDialog(23);
        if (!bool);
      }
    }
    else if (paramInteger.intValue() == 4)
    {
      this.b.removeDialog(9);
      if ((!this.b.l) && (!this.b.isFinishing()))
      {
        this.b.showDialog(109);
        if (!bool);
      }
    }
    else if (paramInteger.intValue() == 3)
    {
      this.b.removeDialog(9);
      RegisterPhone localRegisterPhone1 = this.b;
      RegisterPhone localRegisterPhone2 = this.b;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.b.getString(2131296328);
      localRegisterPhone1.f(localRegisterPhone2.getString(2131296333, arrayOfObject));
    }
  }

  protected void onPreExecute()
  {
    this.b.showDialog(9);
  }
}