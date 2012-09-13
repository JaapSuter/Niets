package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.ArrayList;
import java.util.Vector;

class yo
  implements AdapterView.OnItemClickListener
{
  private static final String[] z;
  final Conversations a;

  static
  {
    String[] arrayOfString = new String[6];
    char[] arrayOfChar1 = "\032Cq)@>Y(\020\023^j5S8\020^(U0A".toCharArray();
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
      arrayOfChar2 = ">^p*U/B(Y2_msS1X}7\0377Xz|".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = ">^p*U/B(Y2_msS1X}7\0373Dr0\037-^m|".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label401;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "q\021r5C)\f".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label493;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "}Aq/\r".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label585;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = ">^p*U/B(Y2_msS1X}7\0373^j|C<\\{|Z4U?|F4Tia".toCharArray();
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
        m = 48;
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
        m = 93;
        continue;
        m = 49;
        continue;
        m = 30;
        continue;
        m = 92;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 48;
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
      i3 = 93;
      continue;
      i3 = 49;
      continue;
      i3 = 30;
      continue;
      i3 = 92;
    }
    label401: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 48;
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
      i7 = 93;
      continue;
      i7 = 49;
      continue;
      i7 = 30;
      continue;
      i7 = 92;
    }
    label493: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 48;
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
      i11 = 93;
      continue;
      i11 = 49;
      continue;
      i11 = 30;
      continue;
      i11 = 92;
    }
    label585: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 48;
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
      i15 = 93;
      continue;
      i15 = 49;
      continue;
      i15 = 30;
      continue;
      i15 = 92;
    }
    label677: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 48;
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
      i19 = 93;
      continue;
      i19 = 49;
      continue;
      i19 = 30;
      continue;
      i19 = 92;
    }
  }

  yo(Conversations paramConversations)
  {
  }

  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    boolean bool = DialogToastListActivity.f;
    fp localfp = (fp)paramView.getTag();
    if (localfp == null)
      g5.b(z[2] + paramInt);
    while (true)
    {
      return;
      String str1 = localfp.l;
      g5.b(z[1] + str1 + z[4] + paramInt);
      String str2 = (String)this.a.t.get(paramInt);
      if (!str1.equals(str2))
        g5.c(z[5] + str1 + z[3] + str2);
      zq localzq = gp.a(str2);
      if (localfp.c.getVisibility() != 0)
        if ((str2.contains(App.E)) || (str2.contains(z[0])))
        {
          sz localsz1 = App.z.j(str2);
          if ((localsz1 == null) || ((int)localsz1.m == -2))
          {
            if (App.sb())
            {
              eu.b();
              new y8(this).start();
              if (!bool);
            }
            else
            {
              App.a(this.a, 2131296881, 0);
              if (bool)
                continue;
            }
            if (!bool);
          }
        }
        else if (zq.c(str2))
        {
          if (App.sb())
          {
            sz localsz2 = App.z.j(str2);
            if (localsz2 != null)
            {
              App.z.a(eu.a(str2, localsz2.b(), (Vector)localsz2.t, 2));
              new z8(this, str2, localsz2).start();
              if (!bool);
            }
          }
          else
          {
            App.a(this.a, 2131296881, 0);
            if (!bool);
          }
        }
        else if (!localzq.p())
        {
          this.a.startActivity(Conversation.a(localzq));
        }
    }
  }
}