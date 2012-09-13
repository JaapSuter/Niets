package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

class wn
  implements View.OnClickListener
{
  private static final String[] z;
  final cf a;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "\032u]qD].D`\016\001/Nn\021\025mL/\035\035l\006l\037\002r\026pC\036nJ;".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\023oMs\021\033e\007h\020\006dGuP\023b]h\021\034/H;%".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "R)".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label287;
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
        m = 126;
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
        m = 114;
        continue;
        m = 1;
        continue;
        m = 41;
        continue;
        m = 1;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 126;
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
      i3 = 114;
      continue;
      i3 = 1;
      continue;
      i3 = 41;
      continue;
      i3 = 1;
    }
    label287: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 126;
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
      i7 = 114;
      continue;
      i7 = 1;
      continue;
      i7 = 41;
      continue;
      i7 = 1;
    }
  }

  private wn(cf paramcf)
  {
  }

  wn(cf paramcf, un paramun)
  {
    this(paramcf);
  }

  public void onClick(View paramView)
  {
    boolean bool = DialogToastListActivity.f;
    String str1;
    if (this.a.o.b.b)
    {
      str1 = App.Mb.getString(2131296866);
      if (!bool);
    }
    else if ((this.a.o.b.a.contains("-")) && (this.a.o.c != null))
    {
      str1 = App.w.a(this.a.o.c, null).b();
      if (!bool);
    }
    else
    {
      str1 = App.w.a(this.a.o.b.a, null).b();
    }
    String str2 = str1.replace("(", "[").replace(")", "]");
    Uri localUri = Uri.parse(z[0] + this.a.o.q + "," + this.a.o.r + z[2] + str2 + ")");
    Intent localIntent = new Intent(z[1], localUri);
    this.a.getContext().startActivity(localIntent);
  }
}