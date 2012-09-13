package com.whatsapp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

class iy
  implements View.OnClickListener
{
  private static final String[] z;
  final String a;
  final PopupNotification b;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "\006\032k\017:\016\020!\024;\023\021a\t{\006\027{\024:\tZY4\0200".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\017��{\roH[".toCharArray();
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
        m = 85;
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
        m = 103;
        continue;
        m = 116;
        continue;
        m = 15;
        continue;
        m = 125;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 85;
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
      i3 = 103;
      continue;
      i3 = 116;
      continue;
      i3 = 15;
      continue;
      i3 = 125;
    }
  }

  iy(PopupNotification paramPopupNotification, String paramString)
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
      this.b.startActivity(localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      while (true)
        App.a(App.Mb.getApplicationContext(), 2131296533, 0);
    }
  }
}