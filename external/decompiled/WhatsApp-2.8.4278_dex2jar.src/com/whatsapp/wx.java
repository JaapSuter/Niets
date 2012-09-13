package com.whatsapp;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.widget.RemoteViews;

public class wx extends vx
{
  private static final String[] z;
  private int b;
  private Bitmap c;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "gp\013&^oz".toCharArray();
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
      arrayOfChar2 = "u{\033\026Peu\b&^sp\013\006Tuq\032&Rc".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "oz".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label325;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "op\t;".toCharArray();
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
        m = 49;
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
        m = 6;
        continue;
        m = 30;
        continue;
        m = 111;
        continue;
        m = 84;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 49;
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
      i3 = 6;
      continue;
      i3 = 30;
      continue;
      i3 = 111;
      continue;
      i3 = 84;
    }
    label325: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 49;
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
      i7 = 6;
      continue;
      i7 = 30;
      continue;
      i7 = 111;
      continue;
      i7 = 84;
    }
    label417: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 49;
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
      i11 = 6;
      continue;
      i11 = 30;
      continue;
      i11 = 111;
      continue;
      i11 = 84;
    }
  }

  public wx(Context paramContext)
  {
    super(paramContext);
  }

  public Notification a()
  {
    Notification localNotification = super.a();
    localNotification.largeIcon = this.c;
    if ((localNotification.contentView != null) && (this.c != null))
    {
      localNotification.contentView.setViewVisibility(16908294, 8);
      int i = Resources.getSystem().getIdentifier(z[3], z[2], z[0]);
      if (i != 0)
      {
        localNotification.contentView.setViewVisibility(i, 0);
        localNotification.contentView.setTextViewText(i, "");
        localNotification.contentView.setInt(i, z[1], this.b);
      }
    }
    return localNotification;
  }

  public tx a(int paramInt)
  {
    this.b = paramInt;
    return super.a(paramInt);
  }

  public tx a(Bitmap paramBitmap)
  {
    this.c = paramBitmap;
    return this;
  }
}