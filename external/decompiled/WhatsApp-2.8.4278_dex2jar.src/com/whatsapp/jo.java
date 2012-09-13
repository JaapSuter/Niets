package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class jo
  implements DialogInterface.OnClickListener
{
  private static final String[] z;
  final Conversations a;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "\021Q \034\022��M/\036\036\035P=E\023\027R+\036\022]J+\007\007_Y<\005\002\002\004".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\021Q \034\022��M/\036\036\035P=E\023\027R+\036\022]Y<\005\002\002\004".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\021Q \034\022��M/\036\036\035P=E\002\001[<G\003��Gc\006\022\023H+-\005\035K>".toCharArray();
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
        m = 119;
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
        m = 62;
        continue;
        m = 78;
        continue;
        m = 106;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 119;
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
      i3 = 62;
      continue;
      i3 = 78;
      continue;
      i3 = 106;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 119;
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
      i7 = 62;
      continue;
      i7 = 78;
      continue;
      i7 = 106;
    }
  }

  jo(Conversations paramConversations)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    boolean bool = DialogToastListActivity.f;
    g5.b(z[2]);
    if (Conversations.l().p())
    {
      g5.b(z[0] + Conversations.l());
      App.m(Conversations.l().b);
      if (!bool);
    }
    else if (App.sb())
    {
      g5.b(z[1] + Conversations.l());
      this.a.a(Conversations.l().b, true);
      new x8(this).start();
      Conversations.a(this.a, 1 + Conversations.f(this.a));
      if (!bool);
    }
    else
    {
      App.a(this.a.getBaseContext(), 2131296882, 0);
    }
    this.a.removeDialog(7);
  }
}