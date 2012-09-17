package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.Iterator;

class hi
  implements View.OnClickListener
{
  private static final String[] z;
  final BlockList a;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = ">nU\013%5`LV3-q".toCharArray();
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
      arrayOfChar2 = "?mWF98egI;.u".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "<o\\W=4e\026L<)dVQ|<bLL=3/hl\021\026".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label324;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "?mWF9\002bWK&<bL".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label412;
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
        m = 82;
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
        m = 1;
        continue;
        m = 56;
        continue;
        m = 37;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 82;
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
      i3 = 1;
      continue;
      i3 = 56;
      continue;
      i3 = 37;
    }
    label324: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 82;
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
      i7 = 1;
      continue;
      i7 = 56;
      continue;
      i7 = 37;
    }
    label412: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 82;
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
      i11 = 1;
      continue;
      i11 = 56;
      continue;
      i11 = 37;
    }
  }

  hi(BlockList paramBlockList)
  {
  }

  public void onClick(View paramView)
  {
    boolean bool = DialogToastListActivity.f;
    Intent localIntent = new Intent(z[2]);
    localIntent.addCategory(z[0]);
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = this.a.g.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      localStringBuilder.append(((zq)localIterator.next()).b).append(",");
    }
    while (!bool);
    localIntent.putExtra(z[3], true);
    localIntent.putExtra(z[1], localStringBuilder.toString());
    this.a.startActivityForResult(localIntent, 3);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.hi
 * JD-Core Version:    0.6.1
 */