package com.whatsapp;

import android.os.AsyncTask;
import java.io.IOException;

public class zb extends AsyncTask<String, Void, Integer>
{
  private static final String[] z;
  final UserFeedbackActivity a;

  static
  {
    String[] arrayOfString = new String[5];
    char[] arrayOfChar1 = "6\\o\017\t6]'\017\0221E+\030\037".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "*V%A".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "R9".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label365;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "*V%\005\025,A#\030\0177]".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label457;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "9E#\005\n9Q.\t".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label549;
        arrayOfString[4] = new String(arrayOfChar5).intern();
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
        m = 102;
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
        m = 88;
        continue;
        m = 51;
        continue;
        m = 66;
        continue;
        m = 108;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 102;
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
      i3 = 88;
      continue;
      i3 = 51;
      continue;
      i3 = 66;
      continue;
      i3 = 108;
    }
    label365: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 102;
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
      i7 = 88;
      continue;
      i7 = 51;
      continue;
      i7 = 66;
      continue;
      i7 = 108;
    }
    label457: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 102;
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
      i11 = 88;
      continue;
      i11 = 51;
      continue;
      i11 = 66;
      continue;
      i11 = 108;
    }
    label549: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 102;
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
      i15 = 88;
      continue;
      i15 = 51;
      continue;
      i15 = 66;
      continue;
      i15 = 108;
    }
  }

  protected zb(UserFeedbackActivity paramUserFeedbackActivity)
  {
  }

  protected Integer a(String[] paramArrayOfString)
  {
    try
    {
      UserFeedbackActivity.a(this.a, yp.a());
      localInteger = Integer.valueOf(0);
      return localInteger;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        UserFeedbackActivity.a(this.a, null);
        localInteger = Integer.valueOf(-1);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        UserFeedbackActivity.a(this.a, null);
        Integer localInteger = Integer.valueOf(-1);
      }
    }
  }

  protected void a(Integer paramInteger)
  {
    int i = 0;
    this.a.removeDialog(200);
    q4 localq4 = UserFeedbackActivity.a(this.a, z[3], UserFeedbackActivity.c(this.a));
    if (localq4.a != null)
    {
      if (localq4.b == z[0])
      {
        this.a.showDialog(202);
        return;
      }
      StringBuilder localStringBuilder = new StringBuilder().append(localq4.a).append(z[2]);
      UserFeedbackActivity localUserFeedbackActivity2 = this.a;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[i] = this.a.getString(2131296288);
      localq4.a = localUserFeedbackActivity2.getString(2131296346, arrayOfObject);
    }
    UserFeedbackActivity.a(this.a, localq4.a);
    if (localq4.b != null)
    {
      if (localq4.b == z[4])
        i = 1;
      localq4.b = (z[1] + localq4.b);
    }
    UserFeedbackActivity localUserFeedbackActivity1 = this.a;
    if (i != 0);
    for (String str = null; ; str = localq4.b)
    {
      UserFeedbackActivity.b(localUserFeedbackActivity1, str);
      if (this.a.isFinishing())
        break;
      if (UserFeedbackActivity.d(this.a) != null)
      {
        this.a.showDialog(201);
        if (!DialogToastListActivity.f)
          break;
      }
      UserFeedbackActivity.a(this.a, UserFeedbackActivity.a(this.a), UserFeedbackActivity.b(this.a), null);
      break;
    }
  }

  protected void onPreExecute()
  {
    this.a.showDialog(200);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.zb
 * JD-Core Version:    0.6.1
 */