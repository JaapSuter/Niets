package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class ez
  implements View.OnClickListener
{
  private static final String z;
  final ProfileInfoActivity a;

  static
  {
    char[] arrayOfChar = ":sG".toCharArray();
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
      m = 104;
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
      m = 80;
      continue;
      m = 26;
      continue;
      m = 35;
      continue;
      m = 111;
    }
  }

  ez(ProfileInfoActivity paramProfileInfoActivity)
  {
  }

  public void onClick(View paramView)
  {
    Intent localIntent = new Intent(this.a, ViewProfilePhoto.class);
    localIntent.putExtra(z, ProfileInfoActivity.b(this.a).b);
    this.a.startActivity(localIntent);
  }
}