package com.whatsapp.messaging;

import android.os.Messenger;
import com.whatsapp.bg;
import com.whatsapp.g5;
import com.whatsapp.qz;
import java.io.IOException;

class x extends Thread
{
  private static final String[] z;
  private final qz a;
  private final q b;

  static
  {
    String[] arrayOfString = new String[5];
    char[] arrayOfChar1 = "W(I]\021] XI[]j\\_L@7".toCharArray();
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
      arrayOfChar2 = "W(I]\021] XI[]jUBY@0M".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "W(I]\021] XI[]jPB\023J7KBL\017".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label365;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "W(I]\021] XI[]jZBL]0IY\023\\1KH_BjJY_A?X\r".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label457;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "W(I]\021] XI[]jZBL]0IY\023\\1KH_Bh\\_L@7\031".toCharArray();
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
        m = 62;
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
        m = 47;
        continue;
        m = 69;
        continue;
        m = 57;
        continue;
        m = 45;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 62;
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
      i3 = 47;
      continue;
      i3 = 69;
      continue;
      i3 = 57;
      continue;
      i3 = 45;
    }
    label365: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 62;
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
      i7 = 47;
      continue;
      i7 = 69;
      continue;
      i7 = 57;
      continue;
      i7 = 45;
    }
    label457: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 62;
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
      i11 = 47;
      continue;
      i11 = 69;
      continue;
      i11 = 57;
      continue;
      i11 = 45;
    }
    label549: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 62;
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
      i15 = 47;
      continue;
      i15 = 69;
      continue;
      i15 = 57;
      continue;
      i15 = 45;
    }
  }

  public x(qz paramqz, q paramq)
  {
    this.a = paramqz;
    this.b = paramq;
  }

  public void run()
  {
    int i = MessageService.C;
    try
    {
      boolean bool;
      do
        bool = this.a.k();
      while (bool);
      g5.b(z[1]);
      e.a(q.a(this.b));
      if (i != 0)
      {
        g5.b(z[0]);
        localMessenger = q.a(this.b);
        e.b(localMessenger);
      }
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        g5.b(z[2] + localIOException.toString());
        g5.b(z[0]);
        localMessenger = q.a(this.b);
      }
    }
    catch (bg localbg)
    {
      while (true)
      {
        g5.b(z[4] + localbg.toString());
        g5.b(z[3] + localbg.a());
        g5.b(z[0]);
        Messenger localMessenger = q.a(this.b);
      }
    }
    finally
    {
      g5.b(z[0]);
      e.b(q.a(this.b));
    }
  }
}