package com.whatsapp;

import org.json.JSONException;
import org.json.JSONObject;

class ww
  implements ct
{
  private static final String[] z;
  final vw a;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "i +".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "q;*9\022e\"\"".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "o;=9".toCharArray();
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
        m = 28;
        continue;
        m = 82;
        continue;
        m = 71;
        continue;
        m = 92;
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
      i3 = 28;
      continue;
      i3 = 82;
      continue;
      i3 = 71;
      continue;
      i3 = 92;
    }
    label289: int i6 = arrayOfChar3[i5];
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
      i7 = 28;
      continue;
      i7 = 82;
      continue;
      i7 = 71;
      continue;
      i7 = 92;
    }
  }

  ww(vw paramvw)
  {
  }

  public void a(int paramInt)
  {
    pb localpb = this.a.f;
    Integer[] arrayOfInteger = new Integer[1];
    arrayOfInteger[0] = Integer.valueOf(paramInt);
    pb.a(localpb, arrayOfInteger);
  }

  public void a(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      pb.a(this.a.f, new a1());
      pb.c(this.a.f).b = localJSONObject.optString(z[1]);
      pb.c(this.a.f).c = localJSONObject.optString(z[0]);
      pb.c(this.a.f).d = localJSONObject.optLong(z[2]);
      pb.a(this.a.f, true);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        g5.d(localJSONException);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ww
 * JD-Core Version:    0.6.1
 */