package com.whatsapp.c2dm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.App;
import com.whatsapp.g5;
import com.whatsapp.messaging.MessageService;
import java.util.ArrayList;

public class C2DMBroadcastReceiver extends BroadcastReceiver
{
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[6];
    char[] arrayOfChar1 = "\t\024}\t/\t\024}\t/\t\024}\t/\t\024}".toCharArray();
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
      arrayOfChar2 = "6B28.'\02550h#\025y;n!]?%,4\0242'd&\003".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "e^f{1{@".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label400;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "6\037;{f:\03719d{\02181s:\0312{bg\024;{h;\0043;u{\"\023\026D\034&\023".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label488;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "<\024".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label576;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "6B28.'\02550h#\025y<eu".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label664;
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
        m = 1;
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
        m = 85;
        continue;
        m = 112;
        continue;
        m = 86;
        continue;
        m = 85;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 1;
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
      i3 = 85;
      continue;
      i3 = 112;
      continue;
      i3 = 86;
      continue;
      i3 = 85;
    }
    label400: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 1;
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
      i7 = 85;
      continue;
      i7 = 112;
      continue;
      i7 = 86;
      continue;
      i7 = 85;
    }
    label488: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 1;
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
      i11 = 85;
      continue;
      i11 = 112;
      continue;
      i11 = 86;
      continue;
      i11 = 85;
    }
    label576: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 1;
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
      i15 = 85;
      continue;
      i15 = 112;
      continue;
      i15 = 86;
      continue;
      i15 = 85;
    }
    label664: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 1;
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
      i19 = 85;
      continue;
      i19 = 112;
      continue;
      i19 = 86;
      continue;
      i19 = 85;
    }
  }

  private boolean a(String paramString)
  {
    boolean bool = false;
    if ((paramString != null) && (paramString.matches(z[0])))
      if (!paramString.equals(z[2]));
    while (true)
    {
      return bool;
      bool = true;
      continue;
      g5.c(z[1]);
    }
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals(z[3]))
    {
      App.c(App.Mb, 0);
      ArrayList localArrayList = new ArrayList();
      String str = paramIntent.getStringExtra(z[4]);
      g5.b(z[5] + str);
      if (str != null)
      {
        String[] arrayOfString = str.split(",");
        if ((arrayOfString.length > 1) && (a(arrayOfString[1])))
          localArrayList.add(arrayOfString[1]);
        if ((localArrayList.size() > 0) && (arrayOfString.length > 2) && (a(arrayOfString[2])))
          localArrayList.add(arrayOfString[2]);
      }
      MessageService.a(paramContext, true, true, true, localArrayList);
      if (C2DMRegistrar.b == 0);
    }
    else
    {
      C2DMRegistrar.a(paramContext, paramIntent);
    }
    setResult(-1, null, null);
  }
}