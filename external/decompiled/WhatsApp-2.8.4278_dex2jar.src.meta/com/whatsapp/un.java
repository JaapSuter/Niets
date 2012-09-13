package com.whatsapp;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

class un
  implements View.OnClickListener
{
  private static final String[] z;
  final String a;
  final cf b;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "3S_a6;Y\025z7&XUgw3^Oz6<\023mZ\034\005".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = ":IOcc}\022".toCharArray();
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
        m = 89;
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
        m = 82;
        continue;
        m = 61;
        continue;
        m = 59;
        continue;
        m = 19;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 89;
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
      i3 = 82;
      continue;
      i3 = 61;
      continue;
      i3 = 59;
      continue;
      i3 = 19;
    }
  }

  un(cf paramcf, String paramString)
  {
  }

  public void onClick(View paramView)
  {
    Uri localUri = Uri.parse(this.a);
    if (localUri.getScheme() == null)
      localUri = Uri.parse(z[1] + this.a);
    Intent localIntent = new Intent(z[0], localUri);
    try
    {
      this.b.getContext().startActivity(localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      while (true)
        App.a(App.Mb.getApplicationContext(), 2131296533, 0);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.un
 * JD-Core Version:    0.6.1
 */