package com.whatsapp;

final class l4
  implements Runnable
{
  private static final String z;
  final String a;

  static
  {
    char[] arrayOfChar = "\031W[6\020\t\031N;\\\036\\N&\025\tO_t\016\tTU \031LO_&\017\005VT".toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    if (i <= j)
    {
      z = new String(arrayOfChar).intern();
      return;
    }
    int k = arrayOfChar[j];
    int m;
    switch (j % 5)
    {
    default:
      m = 124;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar[j] = (char)(m ^ k);
      j++;
      break;
      m = 108;
      continue;
      m = 57;
      continue;
      m = 58;
      continue;
      m = 84;
    }
  }

  l4(String paramString)
  {
  }

  public void run()
  {
    boolean bool = DialogToastListActivity.f;
    String str = k4.i();
    n7 localn71;
    if (str.length() > 0)
    {
      localn71 = n7.a(this.a);
      if (localn71 != null);
    }
    label96: 
    while (true)
    {
      return;
      n7 localn72 = n7.a(str);
      if (localn72 != null)
      {
        switch (localn71.a(localn72))
        {
        default:
        case -1:
        case 0:
        case 1:
        }
        while (true)
        {
          if (!bool)
            break label96;
          g5.d(z);
          break;
          k4.j();
          if (bool)
            k4.h();
        }
      }
    }
  }
}