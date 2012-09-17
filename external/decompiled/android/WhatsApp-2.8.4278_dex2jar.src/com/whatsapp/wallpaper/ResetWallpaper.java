package com.whatsapp.wallpaper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ResetWallpaper extends Activity
{
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = ")~o\\O\"pv\001Y:a,\033V>tl\006\026+rv\033W$?P7k\017E]%y\006]R3h\017C".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "#b]��]9tv".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "#b]\026],pw\036L".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label288;
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
        m = 56;
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
        m = 74;
        continue;
        m = 17;
        continue;
        m = 2;
        continue;
        m = 114;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 56;
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
      i3 = 74;
      continue;
      i3 = 17;
      continue;
      i3 = 2;
      continue;
      i3 = 114;
    }
    label288: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 56;
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
      i7 = 74;
      continue;
      i7 = 17;
      continue;
      i7 = 2;
      continue;
      i7 = 114;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Intent localIntent = new Intent();
    if (z[0].equals(getIntent().getAction()))
    {
      localIntent.putExtra(z[1], true);
      if (!ImageViewTouchBase.a);
    }
    else
    {
      localIntent.putExtra(z[2], true);
    }
    setResult(-1, localIntent);
    finish();
  }
}