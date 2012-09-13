package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class gj
  implements View.OnClickListener
{
  private static final String z;
  final ContactInfo a;

  static
  {
    char[] arrayOfChar = "Z\004o".toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    if (i <= j)
    {
      z = new String(arrayOfChar).intern();
      return;
    }
    int k = arrayOfChar[j];
    int m;
    switch (j % 5)
    {
    default:
      m = 52;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar[j] = (char)(m ^ k);
      j++;
      break;
      m = 48;
      continue;
      m = 109;
      continue;
      m = 11;
      continue;
      m = 127;
    }
  }

  gj(ContactInfo paramContactInfo)
  {
  }

  public void onClick(View paramView)
  {
    Intent localIntent = new Intent(this.a, MediaGallery.class);
    localIntent.putExtra(z, ContactInfo.a(this.a).b);
    this.a.startActivity(localIntent);
  }
}