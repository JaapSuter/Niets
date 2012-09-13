package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class fj
  implements View.OnClickListener
{
  private static final String z;
  final ContactInfo a;

  static
  {
    char[] arrayOfChar = "\001<;".toCharArray();
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
      m = 117;
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
      m = 107;
      continue;
      m = 85;
      continue;
      m = 95;
      continue;
      m = 68;
    }
  }

  fj(ContactInfo paramContactInfo)
  {
  }

  public void onClick(View paramView)
  {
    if (ContactInfo.a(this.a).n)
    {
      Intent localIntent = new Intent(this.a, ViewProfilePhoto.class);
      localIntent.putExtra(z, ContactInfo.a(this.a).b);
      this.a.startActivity(localIntent);
      if (!DialogToastListActivity.f);
    }
    else
    {
      App.a(this.a, 2131296654, 0);
    }
  }
}