package com.whatsapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.TimerTask;

public class vw
  implements b1
{
  private static final String[] z;
  public String a;
  public String b;
  public String c;
  public String d;
  public long e;
  final pb f;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "o.tD".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "}3".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "I/5^Rh(hHJyruLN".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label289;
        arrayOfString[2] = new String(arrayOfChar3).intern();
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
        m = 58;
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
        m = 9;
        continue;
        m = 92;
        continue;
        m = 27;
        continue;
        m = 41;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 58;
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
      i3 = 9;
      continue;
      i3 = 92;
      continue;
      i3 = 27;
      continue;
      i3 = 41;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 58;
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
      i7 = 9;
      continue;
      i7 = 92;
      continue;
      i7 = 27;
      continue;
      i7 = 41;
    }
  }

  public vw(pb parampb)
  {
  }

  public void a(int paramInt)
  {
    pb.a(this.f).cancel();
    this.f.execute(new Void[0]);
  }

  public void a(a1 parama1)
  {
    pb.a(this.f).cancel();
    pb.a(this.f, parama1);
    pb localpb = this.f;
    if (parama1 != null);
    for (boolean bool = true; ; bool = false)
    {
      pb.a(localpb, bool);
      this.f.execute(new Void[0]);
      return;
    }
  }

  public void a(String paramString, int paramInt)
  {
    pb.a(this.f).cancel();
    try
    {
      URL localURL = new URL(paramString);
      pb.a(this.f, new at(localURL, pb.b(this.f).file, paramInt, 16384, new ww(this)));
      pb.d(this.f).a(z[0], App.bb.jabber_id + z[2]);
      pb.d(this.f).a(z[1], pb.e(this.f).b.a);
      this.f.execute(new Void[0]);
      return;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      while (true)
        this.f.a(Boolean.valueOf(false));
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.vw
 * JD-Core Version:    0.6.1
 */