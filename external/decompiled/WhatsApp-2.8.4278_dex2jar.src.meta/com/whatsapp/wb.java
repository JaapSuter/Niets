package com.whatsapp;

import android.os.AsyncTask;
import java.io.IOException;
import java.util.HashMap;

public class wb extends AsyncTask<String, Void, Integer>
{
  private static final String[] z;
  final Settings a;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "|%\\\022\ta'[I\003g%K\r\023v3\\\003\r|4I\022\025|oF\tM|%Z\020\005}m[\022\001{5[".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    char[] arrayOfChar4;
    int i9;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "|%\\\022\ta'[I\003g%K\r\023v3\\\003\r|4I\022\025|oF\tMl/F\b\005l4A\020\t{9".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "|%\\\022\ta'[I\003g%K\r\023v3\\\003\r|4I\022\025|oF\tM|4I\022\025|mN\t\022\"#@\007\024".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label325;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "l(I\022".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label417;
        arrayOfString[3] = new String(arrayOfChar4).intern();
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
        m = 96;
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
        m = 15;
        continue;
        m = 64;
        continue;
        m = 40;
        continue;
        m = 102;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 96;
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
      i3 = 15;
      continue;
      i3 = 64;
      continue;
      i3 = 40;
      continue;
      i3 = 102;
    }
    label325: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 96;
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
      i7 = 15;
      continue;
      i7 = 64;
      continue;
      i7 = 40;
      continue;
      i7 = 102;
    }
    label417: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 96;
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
      i11 = 15;
      continue;
      i11 = 64;
      continue;
      i11 = 40;
      continue;
      i11 = 102;
    }
  }

  protected wb(Settings paramSettings)
  {
  }

  protected Integer a(String[] paramArrayOfString)
  {
    try
    {
      Settings.a(this.a, yp.a());
      localInteger = Integer.valueOf(0);
      return localInteger;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        Settings.a(this.a, null);
        localInteger = Integer.valueOf(-1);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        Settings.a(this.a, null);
        Integer localInteger = Integer.valueOf(-1);
      }
    }
  }

  protected void a(Integer paramInteger)
  {
    boolean bool = DialogToastListActivity.f;
    this.a.removeDialog(11);
    int j;
    bq localbq;
    int i;
    String str;
    if (!App.sb())
    {
      g5.b(z[1]);
      Settings localSettings3 = this.a;
      Settings localSettings4 = this.a;
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = this.a.getString(2131296328);
      localSettings3.c(localSettings4.getString(2131296333, arrayOfObject3));
      if (!bool);
    }
    else
    {
      if (Settings.c(this.a) == null)
      {
        g5.b(z[0]);
        j = 1;
        if (!bool)
          break label390;
      }
      localbq = (bq)Settings.c(this.a).get(z[3]);
      if (localbq == null)
        break label373;
      if (localbq.a != vf.b)
        break label244;
      if (localbq.b > 0L)
        break label196;
      i = 3;
      str = this.a.getString(2131296720);
    }
    label390: 
    while (true)
    {
      if (i == 1)
      {
        if (!this.a.isFinishing())
        {
          this.a.showDialog(12);
          if (!bool);
        }
      }
      else
        this.a.c(str);
      return;
      label196: i = 2;
      Settings localSettings2 = this.a;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = t4.g(this.a, 1000L * localbq.b);
      str = localSettings2.getString(2131296719, arrayOfObject2);
      continue;
      label244: if ((localbq.a == vf.c) || (localbq.a == vf.d))
      {
        if (localbq.b <= 0L)
        {
          i = 6;
          str = this.a.getString(2131296345);
        }
        else
        {
          i = 5;
          Settings localSettings1 = this.a;
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = t4.g(this.a, 1000L * localbq.b);
          str = localSettings1.getString(2131296344, arrayOfObject1);
        }
      }
      else
      {
        if (localbq.a == vf.e)
        {
          j = 1;
          if (!bool);
        }
        else
        {
          i = 4;
          str = this.a.getString(2131296718);
          continue;
          label373: g5.c(z[2]);
          i = 1;
          str = null;
          continue;
        }
        i = j;
        str = null;
      }
    }
  }

  protected void onPreExecute()
  {
    this.a.showDialog(11);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.wb
 * JD-Core Version:    0.6.1
 */