package com.whatsapp;

final class iq extends hq
{
  private static final String[] z;
  private int a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "\003\022\013U~GNDDbHLHYZUFD1K]GYcL\005@PeLJ��".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\003\022\013U~GNDDbHLHYZUFD>@VESi\tQR\026L_@Bx_]��".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
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
        m = 17;
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
        m = 41;
        continue;
        m = 56;
        continue;
        m = 33;
        continue;
        m = 54;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 17;
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
      i3 = 41;
      continue;
      i3 = 56;
      continue;
      i3 = 33;
      continue;
      i3 = 54;
    }
  }

  public void a(String paramString)
  {
    this.a = gp.f(paramString);
    if (this.a < 0)
      g5.c(z[1]);
    if (Conversations.a())
      Conversations.b().h();
  }

  public void b(String paramString)
  {
    int i;
    if (App.z.i(paramString))
    {
      i = gp.g(paramString);
      if (!DialogToastListActivity.f);
    }
    else
    {
      if (this.a == -1)
        g5.c(z[0]);
      i = -1;
    }
    if (Conversations.a())
    {
      if ((this.a != i) || (i == -1))
        Conversations.b().h();
      Conversations.b().d(paramString);
    }
  }

  public void c(String paramString)
  {
    if (App.z.i(paramString))
    {
      gp.g(paramString);
      if (Conversations.a())
        Conversations.b().h();
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.iq
 * JD-Core Version:    0.6.1
 */