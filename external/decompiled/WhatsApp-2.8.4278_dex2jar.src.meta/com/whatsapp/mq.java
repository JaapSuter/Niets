package com.whatsapp;

import android.app.NotificationManager;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.c2dm.C2DMRegistrar;
import com.whatsapp.messaging.MessageService;

final class mq extends lq
{
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[6];
    char[] arrayOfChar1 = "\030}\\O\030\034~_\001\022\034\"^\005\026\034dZ\005\021ViY\020\031\020nM\024\020Y".toCharArray();
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
      arrayOfChar2 = "Y`I\023\006\030jIZ".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\024~K\001\021\035hHO\023\013bA?\033\030`I@\034\n-I\r\005\rt\f@\037\020i\026".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label401;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\030cH\022\032\020i\002\022\020\nbY\022\026\0347\003O\026\026`\002\027\035\030y_\001\005\t\"\036QFH=\025YCM4".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label493;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\030}\\O\030\034~_\001\022\034nD\001\033\036hH@��\027fB\017\002\027-X\031\005\034-".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label585;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "\032bAN\022\026bK\f\020W}^\017\026\034~_N\022\030}\\\023".toCharArray();
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
        m = 117;
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
        m = 121;
        continue;
        m = 13;
        continue;
        m = 44;
        continue;
        m = 96;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 117;
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
      i3 = 121;
      continue;
      i3 = 13;
      continue;
      i3 = 44;
      continue;
      i3 = 96;
    }
    label401: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 117;
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
      i7 = 121;
      continue;
      i7 = 13;
      continue;
      i7 = 44;
      continue;
      i7 = 96;
    }
    label493: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 117;
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
      i11 = 121;
      continue;
      i11 = 13;
      continue;
      i11 = 44;
      continue;
      i11 = 96;
    }
    label585: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 117;
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
      i15 = 121;
      continue;
      i15 = 13;
      continue;
      i15 = 44;
      continue;
      i15 = 96;
    }
    label677: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 117;
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
      i19 = 121;
      continue;
      i19 = 13;
      continue;
      i19 = 44;
      continue;
      i19 = 96;
    }
  }

  private void a(long paramLong)
  {
    if ((!App.vb()) && (paramLong > 900000L) && (MessageService.c(App.Mb)))
    {
      C2DMRegistrar.a(App.Mb);
      App.s(z[5]);
      App.g(true);
    }
  }

  public void a(sz paramsz)
  {
    if ((paramsz.v) && (!App.wb()) && (System.currentTimeMillis() - paramsz.i > 900000L))
    {
      App.h(true);
      boolean bool = MessageService.c(App.Mb);
      if (bool)
      {
        App.c(App.Mb, 1 + App.j(App.Mb));
        if (MessageService.c(App.Mb) != bool)
          App.p(App.Mb);
      }
    }
  }

  public void a(sz paramsz, int paramInt)
  {
    Object localObject = null;
    boolean bool = DialogToastListActivity.f;
    long l;
    zq localzq;
    if (paramsz != null)
    {
      if (paramsz.b.b)
        break label374;
      App.k(paramsz);
      l = System.currentTimeMillis() - paramsz.i;
      String str = paramsz.b.a;
      localzq = gp.a(str);
      if (App.y.c(str))
      {
        App.y.b(str, false);
        App.f(str);
      }
      if (!localzq.o())
        break label251;
      if (paramsz.c != null)
        localObject = App.w.a(paramsz.c, null);
      if (TextUtils.isEmpty(paramsz.s))
        g5.c(z[2] + str + z[1] + paramsz.b.toString());
      if ((localObject != null) && (!TextUtils.isEmpty(paramsz.s)) && (!paramsz.s.equals(((zq)localObject).t)))
      {
        ((zq)localObject).t = paramsz.s;
        App.a(new nh(this, (zq)localObject));
      }
      if ((!Conversation.a()) || (App.u) || (!Conversation.b().p.equals(str)))
        break label310;
      if (!paramsz.v)
        break label257;
      a(l);
      if (!App.tb)
        break label257;
    }
    while (true)
    {
      return;
      label251: localObject = localzq;
      break;
      label257: App.tb = true;
      if (localzq.b.equals(Conversation.b().Qb.b))
      {
        App.gb.cancel(1);
        if (Conversation.s)
        {
          App.a(Uri.parse(z[3]));
          if (bool)
          {
            label310: localzq.a = (1 + localzq.a);
            App.a(new oh(this, localzq));
            if (paramsz.v)
            {
              App.a(true, App.tb);
              a(l);
              App.tb = true;
              if (!bool);
            }
            else
            {
              App.a(true, false);
            }
          }
        }
      }
      if (bool)
      {
        label374: if ((paramInt == -1) && (paramsz.a != 6))
          App.f(paramsz);
        if ((paramsz.a == 6) && (paramsz.m == 1L))
        {
          if (!paramsz.c.contains(App.c()))
            App.a(true, false);
          App.c(paramsz);
        }
        if ((paramsz.a == 6) && ((paramsz.m == 4L) || (paramsz.m == 5L) || (paramsz.m == 7L) || (paramsz.m == 6L)))
          App.d(paramsz);
      }
    }
  }

  public void b(sz paramsz)
  {
    if ((paramsz != null) && (!paramsz.b.b))
    {
      App.b(z[0], paramsz);
      App.k(paramsz);
    }
  }

  public void b(sz paramsz, int paramInt)
  {
    boolean bool = DialogToastListActivity.f;
    switch (paramInt)
    {
    case 0:
    case 2:
    default:
    case 1:
    case 4:
    case 3:
    case -1:
    }
    while (true)
    {
      g5.c(z[4] + paramInt);
      do
      {
        do
        {
          do
          {
            return;
            App.f(paramsz);
          }
          while ((paramsz.l != 3) && (paramsz.l != 1));
          j5.b(paramsz);
        }
        while (!bool);
        j5.b(paramsz);
      }
      while ((!bool) || (!bool));
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.mq
 * JD-Core Version:    0.6.1
 */