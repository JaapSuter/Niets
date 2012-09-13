package com.whatsapp.wallpaper;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.widget.ImageView;

class a extends AsyncTask<Integer, Void, Bitmap>
{
  private static final String[] z;
  BitmapFactory.Options a = new BitmapFactory.Options();
  final WallpaperPicker b;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "R\036*Q\017F\005\020S9J\001\030\f\bD\032\034W\003\005\006\020@\026\005\035\034[\003\005".toCharArray();
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
      arrayOfChar2 = "R\036*Q\017F\005\020S".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "F\001\030\017\021M\017\001R\007U\036[V\007I\002\005@\026@\034".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label325;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\005\0057".toCharArray();
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
        m = 102;
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
        m = 37;
        continue;
        m = 110;
        continue;
        m = 117;
        continue;
        m = 33;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 102;
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
      i3 = 37;
      continue;
      i3 = 110;
      continue;
      i3 = 117;
      continue;
      i3 = 33;
    }
    label325: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 102;
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
      i7 = 37;
      continue;
      i7 = 110;
      continue;
      i7 = 117;
      continue;
      i7 = 33;
    }
    label417: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 102;
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
      i11 = 37;
      continue;
      i11 = 110;
      continue;
      i11 = 117;
      continue;
      i11 = 33;
    }
  }

  a(WallpaperPicker paramWallpaperPicker)
  {
    this.a.inDither = false;
    this.a.inPreferredConfig = Bitmap.Config.ARGB_8888;
    this.a.inSampleSize = 2;
  }

  // ERROR //
  protected Bitmap a(Integer[] paramArrayOfInteger)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 73	com/whatsapp/wallpaper/a:isCancelled	()Z
    //   4: ifeq +7 -> 11
    //   7: aconst_null
    //   8: astore_3
    //   9: aload_3
    //   10: areturn
    //   11: aload_0
    //   12: getfield 40	com/whatsapp/wallpaper/a:b	Lcom/whatsapp/wallpaper/WallpaperPicker;
    //   15: getfield 79	com/whatsapp/wallpaper/WallpaperPicker:c	Landroid/content/pm/PackageManager;
    //   18: getstatic 37	com/whatsapp/wallpaper/a:z	[Ljava/lang/String;
    //   21: iconst_2
    //   22: aaload
    //   23: invokevirtual 85	android/content/pm/PackageManager:getResourcesForApplication	(Ljava/lang/String;)Landroid/content/res/Resources;
    //   26: aload_0
    //   27: getfield 40	com/whatsapp/wallpaper/a:b	Lcom/whatsapp/wallpaper/WallpaperPicker;
    //   30: invokestatic 88	com/whatsapp/wallpaper/WallpaperPicker:b	(Lcom/whatsapp/wallpaper/WallpaperPicker;)Ljava/util/ArrayList;
    //   33: aload_1
    //   34: iconst_0
    //   35: aaload
    //   36: invokevirtual 94	java/lang/Integer:intValue	()I
    //   39: invokevirtual 100	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   42: checkcast 90	java/lang/Integer
    //   45: invokevirtual 94	java/lang/Integer:intValue	()I
    //   48: aload_0
    //   49: getfield 47	com/whatsapp/wallpaper/a:a	Landroid/graphics/BitmapFactory$Options;
    //   52: invokestatic 106	android/graphics/BitmapFactory:decodeResource	(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   55: astore 8
    //   57: aload 8
    //   59: astore_3
    //   60: goto -51 -> 9
    //   63: astore 4
    //   65: aload_0
    //   66: getfield 47	com/whatsapp/wallpaper/a:a	Landroid/graphics/BitmapFactory$Options;
    //   69: iconst_3
    //   70: putfield 64	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   73: new 108	java/lang/StringBuilder
    //   76: dup
    //   77: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   80: getstatic 37	com/whatsapp/wallpaper/a:z	[Ljava/lang/String;
    //   83: iconst_1
    //   84: aaload
    //   85: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: aload 4
    //   90: invokevirtual 116	java/lang/OutOfMemoryError:toString	()Ljava/lang/String;
    //   93: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: invokevirtual 117	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   99: invokestatic 123	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   102: aload_0
    //   103: getfield 40	com/whatsapp/wallpaper/a:b	Lcom/whatsapp/wallpaper/WallpaperPicker;
    //   106: getfield 79	com/whatsapp/wallpaper/WallpaperPicker:c	Landroid/content/pm/PackageManager;
    //   109: getstatic 37	com/whatsapp/wallpaper/a:z	[Ljava/lang/String;
    //   112: iconst_2
    //   113: aaload
    //   114: invokevirtual 85	android/content/pm/PackageManager:getResourcesForApplication	(Ljava/lang/String;)Landroid/content/res/Resources;
    //   117: aload_0
    //   118: getfield 40	com/whatsapp/wallpaper/a:b	Lcom/whatsapp/wallpaper/WallpaperPicker;
    //   121: invokestatic 88	com/whatsapp/wallpaper/WallpaperPicker:b	(Lcom/whatsapp/wallpaper/WallpaperPicker;)Ljava/util/ArrayList;
    //   124: aload_1
    //   125: iconst_0
    //   126: aaload
    //   127: invokevirtual 94	java/lang/Integer:intValue	()I
    //   130: invokevirtual 100	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   133: checkcast 90	java/lang/Integer
    //   136: invokevirtual 94	java/lang/Integer:intValue	()I
    //   139: aload_0
    //   140: getfield 47	com/whatsapp/wallpaper/a:a	Landroid/graphics/BitmapFactory$Options;
    //   143: invokestatic 106	android/graphics/BitmapFactory:decodeResource	(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   146: astore 7
    //   148: aload 7
    //   150: astore_3
    //   151: goto -142 -> 9
    //   154: astore 6
    //   156: new 108	java/lang/StringBuilder
    //   159: dup
    //   160: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   163: getstatic 37	com/whatsapp/wallpaper/a:z	[Ljava/lang/String;
    //   166: iconst_0
    //   167: aaload
    //   168: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: invokestatic 129	android/os/Debug:getNativeHeapAllocatedSize	()J
    //   174: ldc2_w 130
    //   177: ldiv
    //   178: invokevirtual 134	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   181: getstatic 37	com/whatsapp/wallpaper/a:z	[Ljava/lang/String;
    //   184: iconst_3
    //   185: aaload
    //   186: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: invokevirtual 117	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   192: invokestatic 123	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   195: aconst_null
    //   196: astore_3
    //   197: goto -188 -> 9
    //   200: astore_2
    //   201: new 108	java/lang/StringBuilder
    //   204: dup
    //   205: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   208: getstatic 37	com/whatsapp/wallpaper/a:z	[Ljava/lang/String;
    //   211: iconst_1
    //   212: aaload
    //   213: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: aload_2
    //   217: invokevirtual 135	android/content/pm/PackageManager$NameNotFoundException:toString	()Ljava/lang/String;
    //   220: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: invokevirtual 117	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   226: invokestatic 123	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   229: aconst_null
    //   230: astore_3
    //   231: goto -222 -> 9
    //   234: astore 5
    //   236: goto -41 -> 195
    //
    // Exception table:
    //   from	to	target	type
    //   11	57	63	java/lang/OutOfMemoryError
    //   102	148	154	java/lang/OutOfMemoryError
    //   11	57	200	android/content/pm/PackageManager$NameNotFoundException
    //   102	148	234	android/content/pm/PackageManager$NameNotFoundException
  }

  void a()
  {
    this.a.requestCancelDecode();
    super.cancel(true);
  }

  protected void a(Bitmap paramBitmap)
  {
    if (paramBitmap == null);
    while (true)
    {
      return;
      if ((!isCancelled()) && (!this.a.mCancel))
      {
        if (WallpaperPicker.c(this.b) != null)
          WallpaperPicker.c(this.b).recycle();
        ImageView localImageView = WallpaperPicker.d(this.b);
        localImageView.setImageBitmap(paramBitmap);
        WallpaperPicker.a(this.b, paramBitmap);
        Drawable localDrawable = localImageView.getDrawable();
        localDrawable.setFilterBitmap(true);
        localDrawable.setDither(true);
        localImageView.postInvalidate();
        WallpaperPicker.a(this.b, null);
        if (!ImageViewTouchBase.a);
      }
      else
      {
        paramBitmap.recycle();
      }
    }
  }
}