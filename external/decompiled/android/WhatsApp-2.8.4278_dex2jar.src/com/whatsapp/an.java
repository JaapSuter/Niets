package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class an
  implements View.OnClickListener
{
  private static final String[] z;
  final Conversation a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "$V1suaR0jy3O;}&".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "aH;u&".toCharArray();
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
        m = 65;
        continue;
        m = 59;
        continue;
        m = 94;
        continue;
        m = 25;
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
      i3 = 65;
      continue;
      i3 = 59;
      continue;
      i3 = 94;
      continue;
      i3 = 25;
    }
  }

  an(Conversation paramConversation)
  {
  }

  public void onClick(View paramView)
  {
    int i = ((Integer)paramView.getTag()).intValue();
    char c = v4.b(v4.b, i);
    int j = this.a.Jb.getSelectionStart();
    int k = this.a.Jb.getSelectionEnd();
    if (j > k);
    while (true)
    {
      StringBuilder localStringBuilder = new StringBuilder(this.a.Jb.getText().toString());
      localStringBuilder.replace(k, j, Character.toString(c));
      this.a.Jb.setText(localStringBuilder);
      this.a.Jb.setSelection(k + 1);
      if (App.h)
        g5.d(z[0] + v4.a(this.a.Jb.getText().toString()) + z[1] + this.a.Jb.getSelectionStart() + ":" + this.a.Jb.getSelectionStart());
      if (!this.a.U)
        this.a.V.setVisibility(8);
      return;
      int m = k;
      k = j;
      j = m;
    }
  }
}