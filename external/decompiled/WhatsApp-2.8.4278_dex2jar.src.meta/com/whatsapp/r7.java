package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import i;

class r7
  implements View.OnClickListener
{
  private static final String[] z;
  final ViewSharedContactActivity a;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "O5U\0039G?\037\0308Z>_\005xK#E\0037��\036|0\037b".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "^7P\0308\001/T\t\"".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "O5U\0039G?\037\0308Z>_\005xO8E\0309@ub4\030j".toCharArray();
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
        m = 86;
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
        m = 46;
        continue;
        m = 91;
        continue;
        m = 49;
        continue;
        m = 113;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 86;
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
      i3 = 46;
      continue;
      i3 = 91;
      continue;
      i3 = 49;
      continue;
      i3 = 113;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 86;
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
      i7 = 46;
      continue;
      i7 = 91;
      continue;
      i7 = 49;
      continue;
      i7 = 113;
    }
  }

  r7(ViewSharedContactActivity paramViewSharedContactActivity)
  {
  }

  public void onClick(View paramView)
  {
    if (this.a.i)
      ViewSharedContactActivity.a(this.a, paramView);
    while (true)
    {
      return;
      String str1 = ((i)paramView.getTag()).c;
      Intent localIntent = new Intent(z[2]);
      localIntent.setType(z[1]);
      String str2 = z[0];
      String[] arrayOfString = new String[1];
      arrayOfString[0] = str1;
      localIntent.putExtra(str2, arrayOfString);
      this.a.startActivity(localIntent);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.r7
 * JD-Core Version:    0.6.1
 */