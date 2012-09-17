package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

class bm
  implements View.OnClickListener
{
  private static final String[] z;
  final Conversation a;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "v>p yg\"\"uz?1&np'w3k:\"{8x:8q{yg#q$<".toCharArray();
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
      arrayOfChar2 = ";;n1".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "v>p yg\"\"uz?1&np'w3k:\"{8x:>q;1p#l9n5".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label325;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "v>p yg\"\"uz?1&np'w3k:\"{8x:4l$sgq".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label417;
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
        m = 28;
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
        m = 21;
        continue;
        m = 81;
        continue;
        m = 30;
        continue;
        m = 86;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 28;
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
      i3 = 21;
      continue;
      i3 = 81;
      continue;
      i3 = 30;
      continue;
      i3 = 86;
    }
    label325: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 28;
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
      i7 = 21;
      continue;
      i7 = 81;
      continue;
      i7 = 30;
      continue;
      i7 = 86;
    }
    label417: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 28;
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
      i11 = 21;
      continue;
      i11 = 81;
      continue;
      i11 = 30;
      continue;
      i11 = 86;
    }
  }

  bm(Conversation paramConversation)
  {
  }

  public void onClick(View paramView)
  {
    Conversation.x(this.a);
    String str = j5.a(1);
    File localFile = App.a(str + z[1], (byte)1);
    try
    {
      Conversation.f(this.a, true);
      j5.a(this.a.Qb.b, j5.b, localFile);
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      while (true)
        g5.d(z[3] + localFileNotFoundException.toString());
    }
    catch (IOException localIOException)
    {
      while (true)
        g5.d(z[0] + localIOException.toString());
    }
    catch (dg localdg)
    {
      while (true)
      {
        this.a.db.setVisibility(8);
        this.a.showDialog(8);
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      while (true)
      {
        g5.d(z[2] + localOutOfMemoryError.toString());
        App.a(this.a, App.Mb.getString(2131296980));
      }
    }
  }
}