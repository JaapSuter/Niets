package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class ey
  implements View.OnClickListener
{
  private static final String[] z;
  final PickFileType a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "\026a\021\021}\036k[\n|\003j\033\027<\026l\001\n}\031!%*Q<".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\001a\021Ms\031k\007\f{\023!\026\026`\004`\007Mv\036}Z��}\031{\024��f".toCharArray();
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
        m = 18;
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
        m = 119;
        continue;
        m = 15;
        continue;
        m = 117;
        continue;
        m = 99;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 18;
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
      i3 = 119;
      continue;
      i3 = 15;
      continue;
      i3 = 117;
      continue;
      i3 = 99;
    }
  }

  ey(PickFileType paramPickFileType)
  {
  }

  public void onClick(View paramView)
  {
    Intent localIntent = new Intent(z[0]);
    localIntent.setType(z[1]);
    this.a.startActivityForResult(localIntent, 7);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ey
 * JD-Core Version:    0.6.1
 */