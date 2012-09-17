package com.whatsapp;

import android.os.Handler.Callback;
import android.os.Message;
import java.util.LinkedList;

public class l5
  implements Handler.Callback
{
  private static final String[] z;
  private final LinkedList<Message> a = new LinkedList();
  private boolean b;

  static
  {
    String[] arrayOfString = new String[6];
    char[] arrayOfChar1 = "\026Pb^\034\036V`]F\037Qj_I\034QjZ\031[N`\\\032\032D`\025".toCharArray();
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
      arrayOfChar2 = "\026Pb^\034\036V`]F\032Ga\017".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\026Pb^\034\036V`]F\tFh@\037\036\003".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label400;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\026Pb^\034\036V`]F\bWj_".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label488;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\026Pb^\034\036V`]F\bFq\017".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label576;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "\026Pb^\034\036V`]F\bWd]\035".toCharArray();
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
        m = 105;
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
        m = 123;
        continue;
        m = 35;
        continue;
        m = 5;
        continue;
        m = 47;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 105;
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
      i3 = 123;
      continue;
      i3 = 35;
      continue;
      i3 = 5;
      continue;
      i3 = 47;
    }
    label400: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 105;
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
      i7 = 123;
      continue;
      i7 = 35;
      continue;
      i7 = 5;
      continue;
      i7 = 47;
    }
    label488: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 105;
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
      i11 = 123;
      continue;
      i11 = 35;
      continue;
      i11 = 5;
      continue;
      i11 = 47;
    }
    label576: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 105;
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
      i15 = 123;
      continue;
      i15 = 35;
      continue;
      i15 = 5;
      continue;
      i15 = 47;
    }
    label664: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 105;
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
      i19 = 123;
      continue;
      i19 = 35;
      continue;
      i19 = 5;
      continue;
      i19 = 47;
    }
  }

  public l5(boolean paramBoolean)
  {
    this.b = paramBoolean;
    g5.b(z[4] + paramBoolean);
  }

  public void a()
  {
    this.b = true;
    g5.b(z[5]);
  }

  public void b()
  {
    int i = g5.n;
    this.b = false;
    g5.b(z[3]);
    do
    {
      if (this.a.isEmpty())
        break;
      g5.b(z[2] + this.a.size());
      ((Message)this.a.remove()).sendToTarget();
    }
    while (i == 0);
  }

  public boolean handleMessage(Message paramMessage)
  {
    boolean bool = true;
    if (this.b)
    {
      g5.b(z[bool] + this.a.size());
      if ((paramMessage.what >= 13) && (paramMessage.what <= 23) && (!App.sb()))
        g5.b(z[0] + paramMessage.what);
    }
    while (true)
    {
      return bool;
      this.a.add(Message.obtain(paramMessage));
      continue;
      bool = false;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.l5
 * JD-Core Version:    0.6.1
 */