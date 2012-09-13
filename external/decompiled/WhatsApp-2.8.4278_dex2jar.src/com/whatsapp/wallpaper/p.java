package com.whatsapp.wallpaper;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import com.whatsapp.App;

class p
  implements DialogInterface.OnClickListener
{
  private static final String[] z;
  final WallpaperPicker a;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "+\031\027\021\r#\023]\n\f>\022\035\027L+\024\007\n\r$Y%*'\035".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    char[] arrayOfChar4;
    int i9;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "#\031��\027\003&\033,\r\r$(\036\002\020!\022\007<\003:\007��".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\"\003\007\023XeX\004\024\025d��\033\002\0269\026\003\023L)\030\036L\003$\023\001\f\013.X$\013\003>\0042\023\022\035\026\037\017\022+\007\026\021L+\007\030".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label325;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "'\026\001\b\007>M\\L\006/\003\022\n\0169H\032\007_)\030\036M\025\"\026\007\020\003:\007]\024\003&\033\003\002\022/\005".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label417;
        arrayOfString[3] = new String(arrayOfChar4).intern();
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
        m = 98;
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
        m = 119;
        continue;
        m = 115;
        continue;
        m = 99;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 98;
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
      i3 = 119;
      continue;
      i3 = 115;
      continue;
      i3 = 99;
    }
    label325: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 98;
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
      i7 = 119;
      continue;
      i7 = 115;
      continue;
      i7 = 99;
    }
    label417: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 98;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i9] = (char)(i11 ^ i10);
      i9++;
      break;
      i11 = 74;
      continue;
      i11 = 119;
      continue;
      i11 = 115;
      continue;
      i11 = 99;
    }
  }

  p(WallpaperPicker paramWallpaperPicker)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Uri localUri = null;
    if (App.g == 0)
      localUri = Uri.parse(z[3]);
    while (true)
    {
      Intent localIntent = new Intent(z[0], localUri);
      this.a.startActivity(localIntent);
      this.a.removeDialog(1);
      this.a.finish();
      return;
      try
      {
        int i = Settings.Secure.getInt(App.ib, z[1]);
        localUri = Uri.parse(z[2]);
        if (i != 1)
        {
          this.a.removeDialog(1);
          this.a.showDialog(2);
        }
      }
      catch (Settings.SettingNotFoundException localSettingNotFoundException)
      {
      }
    }
  }
}