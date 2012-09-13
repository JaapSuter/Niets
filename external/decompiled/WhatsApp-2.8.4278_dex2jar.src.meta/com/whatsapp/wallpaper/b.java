package com.whatsapp.wallpaper;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.whatsapp.g5;
import java.util.ArrayList;

class b extends BaseAdapter
{
  private static final String[] z;
  private LayoutInflater a;
  final WallpaperPicker b;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "oa'kc8f$u3.w-kcl".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\nu:v1oc-z,+n&~c;o=t!!f!uc=b;P'r".toCharArray();
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
        m = 67;
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
        m = 79;
        continue;
        m = 7;
        continue;
        m = 72;
        continue;
        m = 25;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 67;
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
      i3 = 79;
      continue;
      i3 = 7;
      continue;
      i3 = 72;
      continue;
      i3 = 25;
    }
  }

  b(WallpaperPicker paramWallpaperPicker1, WallpaperPicker paramWallpaperPicker2)
  {
    this.a = paramWallpaperPicker2.getLayoutInflater();
  }

  public int getCount()
  {
    return WallpaperPicker.a(this.b).size();
  }

  public Object getItem(int paramInt)
  {
    return Integer.valueOf(paramInt);
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool = ImageViewTouchBase.a;
    ImageView localImageView2;
    if (paramView == null)
    {
      localImageView2 = (ImageView)this.a.inflate(2130903132, paramViewGroup, false);
      if (!bool)
        break label136;
    }
    label136: for (ImageView localImageView1 = (ImageView)paramView; ; localImageView1 = localImageView2)
    {
      int i = ((Integer)WallpaperPicker.a(this.b).get(paramInt)).intValue();
      localImageView1.setImageDrawable(this.b.j.getDrawable(i));
      Drawable localDrawable = localImageView1.getDrawable();
      if (localDrawable != null)
      {
        localDrawable.setDither(true);
        if (!bool);
      }
      else
      {
        g5.d(z[1] + i + z[0] + paramInt);
      }
      return localImageView1;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.wallpaper.b
 * JD-Core Version:    0.6.1
 */