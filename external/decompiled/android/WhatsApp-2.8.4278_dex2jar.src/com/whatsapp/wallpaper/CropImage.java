package com.whatsapp.wallpaper;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;
import android.view.View;
import android.view.Window;
import com.whatsapp.App;
import com.whatsapp.d5;
import com.whatsapp.g5;
import com.whatsapp.j5;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

public class CropImage extends Activity
{
  public static final String[] a = arrayOfString2;
  private static final String[] z;
  private Bitmap.CompressFormat b = Bitmap.CompressFormat.JPEG;
  private Uri c = null;
  private int d;
  private int e;
  private boolean f = false;
  private int g;
  private int h;
  private int i;
  private boolean j;
  private boolean k = true;
  boolean l;
  private int m;
  public boolean n;
  private CropImageView o;
  private Bitmap p;
  private int q = 0;
  protected f r;
  protected boolean s;

  static
  {
    String[] arrayOfString1 = new String[36];
    arrayOfString1[0] = z(z("[^\b#'UM��6a[M\t=!Ls\0256=YA\027?+\002\f"));
    arrayOfString1[1] = z(z("QB\013: ]\001\0032:Y"));
    arrayOfString1[2] = z(z("JI\023&<V\001\0032:Y"));
    arrayOfString1[3] = z(z("[^\b#'UM��6a[M\t=!L\f\004?!KIG7;JE\t4nJI\0242#H@\002in"));
    arrayOfString1[4] = z(z("\\M\0232"));
    arrayOfString1[5] = z(z("gE\003n"));
    arrayOfString1[6] = z(z("JI\004'"));
    arrayOfString1[7] = z(z("VCJ >YO\002"));
    arrayOfString1[8] = z(z("vCG >YO\002"));
    arrayOfString1[9] = z(z("[^\b#'UM��6a[M\t=!L\f\02428]\026G"));
    arrayOfString1[10] = z(z("QCJ6<JC\025"));
    arrayOfString1[11] = z(z("[^\b#'UM��6aWC\n|:JUG /U\\\0136nKE\0356t\013"));
    arrayOfString1[12] = z(z("UE\t\020<W\\"));
    arrayOfString1[13] = z(z("Y_\0276-Lu"));
    arrayOfString1[14] = z(z("KO\006?+m\\.5��]I\0036*"));
    arrayOfString1[15] = z(z("w^\0166 LM\023:!V"));
    arrayOfString1[16] = z(z("[^\b#\fAc\022'>MX4:4]"));
    arrayOfString1[17] = z(z("]^\025<<\025C\b>"));
    arrayOfString1[18] = z(z("[^\b#'UM��6"));
    arrayOfString1[19] = z(z("[^\b#aWB\004!+YX\002"));
    arrayOfString1[20] = z(z("[^\b#'UM��6aWC\n|+VHJ'<AE\t4"));
    arrayOfString1[21] = z(z("WY\023#;Lt"));
    arrayOfString1[22] = z(z("VC\023~/\025E\n2)]"));
    arrayOfString1[23] = z(z("UM\037\025'TI4:4]"));
    arrayOfString1[24] = z(z("[^\b#aWB\004!+YX\002|+VH"));
    arrayOfString1[25] = z(z("[^\b#'UM��6aVC\023~/\025E\n2)]"));
    arrayOfString1[26] = z(z("Y_\0276-Lt"));
    arrayOfString1[27] = z(z("[E\0250\"]o\025<>"));
    arrayOfString1[28] = z(z("[^\b#'UM��6aWC\n|:JUG /U\\\0136nKE\0356t\n"));
    arrayOfString1[29] = z(z("WY\023#;Lj\b!#YX"));
    arrayOfString1[30] = z(z("^E\0136"));
    arrayOfString1[31] = z(z("KO\006?+"));
    arrayOfString1[32] = z(z("WY\023#;Lu"));
    arrayOfString1[33] = z(z("WY\023#;L"));
    arrayOfString1[34] = z(z("[C\t'+VX"));
    arrayOfString1[35] = z(z("[^\b#aWB\0036=L^\b*"));
    z = arrayOfString1;
    String[] arrayOfString2 = new String[11];
    arrayOfString2[0] = z(z("gE\003"));
    arrayOfString2[1] = z(z("LE\023?+"));
    arrayOfString2[2] = z(z("UE\n6\021LU\0276"));
    arrayOfString2[3] = z(z("TM\023::MH\002"));
    arrayOfString2[4] = z(z("TC\t4'LY\0036"));
    arrayOfString2[5] = z(z("\\M\0236:YG\002="));
    arrayOfString2[6] = z(z("\\M\0236\021YH\0036*"));
    arrayOfString2[7] = z(z("\\M\0236\021UC\003:(QI\003"));
    arrayOfString2[8] = z(z("gH\006'/"));
    arrayOfString2[9] = z(z("W^\0166 LM\023:!V"));
    arrayOfString2[10] = z(z("ZY\0048+Ls\0167"));
  }

  public static float a(int paramInt)
  {
    float f1;
    if (paramInt == 6)
      f1 = 90.0F;
    while (true)
    {
      return f1;
      if (paramInt == 3)
        f1 = 180.0F;
      else if (paramInt == 8)
        f1 = 270.0F;
      else
        f1 = 0.0F;
    }
  }

  public static j a(Context paramContext, Uri paramUri, int paramInt)
  {
    try
    {
      l1 = ContentUris.parseId(paramUri);
      localContentResolver = paramContext.getContentResolver();
      String str = z[5] + Long.toString(l1);
      if (paramInt == 0)
      {
        localUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        localCursor = localContentResolver.query(localUri, a, str, null, null);
        if (localCursor == null)
          break label192;
        if (!localCursor.moveToFirst())
          break label186;
        localj2 = new j();
      }
    }
    catch (Exception localException3)
    {
      while (true)
      {
        try
        {
          long l1;
          ContentResolver localContentResolver;
          a(localj2, localContentResolver, localCursor, localUri.toString() + "/");
          localj2.b = l1;
          localj1 = localj2;
        }
        catch (Exception localException3)
        {
          try
          {
            Cursor localCursor;
            j localj2;
            localCursor.close();
            return localj1;
            Uri localUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            continue;
            localException1 = localException1;
            Object localObject = localException1;
            localj1 = null;
            g5.d(((Exception)localObject).toString());
            continue;
            localException3 = localException3;
            localObject = localException3;
            localj1 = localj2;
            continue;
          }
          catch (Exception localException2)
          {
            continue;
          }
        }
        label186: j localj1 = null;
        continue;
        label192: localj1 = null;
      }
    }
  }

  // ERROR //
  private void a()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: getstatic 244	com/whatsapp/wallpaper/ImageViewTouchBase:a	Z
    //   5: istore_2
    //   6: aload_0
    //   7: getfield 246	com/whatsapp/wallpaper/CropImage:r	Lcom/whatsapp/wallpaper/f;
    //   10: ifnonnull +4 -> 14
    //   13: return
    //   14: aload_0
    //   15: getfield 248	com/whatsapp/wallpaper/CropImage:n	Z
    //   18: ifne -5 -> 13
    //   21: aload_0
    //   22: iconst_1
    //   23: putfield 248	com/whatsapp/wallpaper/CropImage:n	Z
    //   26: new 250	android/graphics/Paint
    //   29: dup
    //   30: invokespecial 251	android/graphics/Paint:<init>	()V
    //   33: astore_3
    //   34: aload_3
    //   35: iconst_1
    //   36: invokevirtual 255	android/graphics/Paint:setAntiAlias	(Z)V
    //   39: aload_3
    //   40: iconst_1
    //   41: invokevirtual 258	android/graphics/Paint:setFilterBitmap	(Z)V
    //   44: aload_3
    //   45: iconst_1
    //   46: invokevirtual 261	android/graphics/Paint:setDither	(Z)V
    //   49: aload_0
    //   50: getfield 246	com/whatsapp/wallpaper/CropImage:r	Lcom/whatsapp/wallpaper/f;
    //   53: invokevirtual 266	com/whatsapp/wallpaper/f:c	()Landroid/graphics/Rect;
    //   56: astore 4
    //   58: aload_0
    //   59: getfield 268	com/whatsapp/wallpaper/CropImage:h	I
    //   62: ifeq +514 -> 576
    //   65: aload_0
    //   66: getfield 270	com/whatsapp/wallpaper/CropImage:i	I
    //   69: ifeq +507 -> 576
    //   72: aload_0
    //   73: getfield 268	com/whatsapp/wallpaper/CropImage:h	I
    //   76: istore 13
    //   78: aload_0
    //   79: getfield 270	com/whatsapp/wallpaper/CropImage:i	I
    //   82: istore 14
    //   84: aload_0
    //   85: getfield 156	com/whatsapp/wallpaper/CropImage:k	Z
    //   88: ifne +29 -> 117
    //   91: aload 4
    //   93: invokevirtual 276	android/graphics/Rect:width	()I
    //   96: aload_0
    //   97: getfield 268	com/whatsapp/wallpaper/CropImage:h	I
    //   100: if_icmpge +17 -> 117
    //   103: aload 4
    //   105: invokevirtual 276	android/graphics/Rect:width	()I
    //   108: istore 13
    //   110: aload 4
    //   112: invokevirtual 279	android/graphics/Rect:height	()I
    //   115: istore 14
    //   117: fconst_1
    //   118: fstore 15
    //   120: aload_0
    //   121: getfield 281	com/whatsapp/wallpaper/CropImage:s	Z
    //   124: ifne +149 -> 273
    //   127: aload_0
    //   128: getfield 283	com/whatsapp/wallpaper/CropImage:p	Landroid/graphics/Bitmap;
    //   131: invokevirtual 288	android/graphics/Bitmap:getWidth	()I
    //   134: iload 13
    //   136: idiv
    //   137: aload_0
    //   138: getfield 283	com/whatsapp/wallpaper/CropImage:p	Landroid/graphics/Bitmap;
    //   141: invokevirtual 291	android/graphics/Bitmap:getHeight	()I
    //   144: iload 14
    //   146: idiv
    //   147: invokestatic 297	java/lang/Math:min	(II)I
    //   150: istore 26
    //   152: iload 26
    //   154: iconst_1
    //   155: if_icmple +118 -> 273
    //   158: aload_0
    //   159: getfield 283	com/whatsapp/wallpaper/CropImage:p	Landroid/graphics/Bitmap;
    //   162: invokevirtual 288	android/graphics/Bitmap:getWidth	()I
    //   165: i2f
    //   166: fstore 27
    //   168: aload_0
    //   169: getfield 283	com/whatsapp/wallpaper/CropImage:p	Landroid/graphics/Bitmap;
    //   172: invokevirtual 300	android/graphics/Bitmap:recycle	()V
    //   175: new 302	android/graphics/BitmapFactory$Options
    //   178: dup
    //   179: invokespecial 303	android/graphics/BitmapFactory$Options:<init>	()V
    //   182: astore 28
    //   184: aload 28
    //   186: iload 26
    //   188: putfield 306	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   191: aload 28
    //   193: iconst_1
    //   194: putfield 309	android/graphics/BitmapFactory$Options:inDither	Z
    //   197: aload 28
    //   199: iconst_0
    //   200: putfield 312	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   203: aload 28
    //   205: iconst_0
    //   206: putfield 315	android/graphics/BitmapFactory$Options:inScaled	Z
    //   209: getstatic 320	android/os/Build$VERSION:SDK_INT	I
    //   212: bipush 10
    //   214: if_icmplt +9 -> 223
    //   217: aload 28
    //   219: iconst_1
    //   220: putfield 323	android/graphics/BitmapFactory$Options:inPreferQualityOverSpeed	Z
    //   223: getstatic 329	com/whatsapp/App:ib	Landroid/content/ContentResolver;
    //   226: aload_0
    //   227: invokevirtual 333	com/whatsapp/wallpaper/CropImage:getIntent	()Landroid/content/Intent;
    //   230: invokevirtual 339	android/content/Intent:getData	()Landroid/net/Uri;
    //   233: invokevirtual 343	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   236: astore_1
    //   237: aload_0
    //   238: aload_1
    //   239: aconst_null
    //   240: aload 28
    //   242: invokestatic 349	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   245: putfield 283	com/whatsapp/wallpaper/CropImage:p	Landroid/graphics/Bitmap;
    //   248: aload_0
    //   249: getfield 283	com/whatsapp/wallpaper/CropImage:p	Landroid/graphics/Bitmap;
    //   252: invokevirtual 288	android/graphics/Bitmap:getWidth	()I
    //   255: istore 34
    //   257: iload 34
    //   259: i2f
    //   260: fload 27
    //   262: fdiv
    //   263: fstore 15
    //   265: aload_1
    //   266: ifnull +7 -> 273
    //   269: aload_1
    //   270: invokevirtual 352	java/io/InputStream:close	()V
    //   273: aload_0
    //   274: getfield 283	com/whatsapp/wallpaper/CropImage:p	Landroid/graphics/Bitmap;
    //   277: invokevirtual 356	android/graphics/Bitmap:getConfig	()Landroid/graphics/Bitmap$Config;
    //   280: astore 16
    //   282: aload 16
    //   284: ifnonnull +8 -> 292
    //   287: getstatic 362	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   290: astore 16
    //   292: iload 13
    //   294: iload 14
    //   296: aload 16
    //   298: invokestatic 366	android/graphics/Bitmap:createBitmap	(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   301: astore 17
    //   303: new 368	android/graphics/Canvas
    //   306: dup
    //   307: aload 17
    //   309: invokespecial 371	android/graphics/Canvas:<init>	(Landroid/graphics/Bitmap;)V
    //   312: astore 18
    //   314: aload 4
    //   316: fload 15
    //   318: aload 4
    //   320: getfield 374	android/graphics/Rect:left	I
    //   323: i2f
    //   324: fmul
    //   325: f2i
    //   326: putfield 374	android/graphics/Rect:left	I
    //   329: aload 4
    //   331: fload 15
    //   333: aload 4
    //   335: getfield 377	android/graphics/Rect:right	I
    //   338: i2f
    //   339: fmul
    //   340: f2i
    //   341: putfield 377	android/graphics/Rect:right	I
    //   344: aload 4
    //   346: fload 15
    //   348: aload 4
    //   350: getfield 380	android/graphics/Rect:top	I
    //   353: i2f
    //   354: fmul
    //   355: f2i
    //   356: putfield 380	android/graphics/Rect:top	I
    //   359: aload 4
    //   361: fload 15
    //   363: aload 4
    //   365: getfield 383	android/graphics/Rect:bottom	I
    //   368: i2f
    //   369: fmul
    //   370: f2i
    //   371: putfield 383	android/graphics/Rect:bottom	I
    //   374: new 272	android/graphics/Rect
    //   377: dup
    //   378: iconst_0
    //   379: iconst_0
    //   380: iload 13
    //   382: iload 14
    //   384: invokespecial 386	android/graphics/Rect:<init>	(IIII)V
    //   387: astore 19
    //   389: aload_0
    //   390: getfield 388	com/whatsapp/wallpaper/CropImage:j	Z
    //   393: ifeq +99 -> 492
    //   396: new 390	android/graphics/Matrix
    //   399: dup
    //   400: invokespecial 391	android/graphics/Matrix:<init>	()V
    //   403: astore 20
    //   405: aload 20
    //   407: aload_0
    //   408: getfield 158	com/whatsapp/wallpaper/CropImage:q	I
    //   411: sipush 360
    //   414: irem
    //   415: i2f
    //   416: aload 19
    //   418: getfield 374	android/graphics/Rect:left	I
    //   421: aload 19
    //   423: getfield 377	android/graphics/Rect:right	I
    //   426: iadd
    //   427: iconst_2
    //   428: idiv
    //   429: i2f
    //   430: aload 19
    //   432: getfield 380	android/graphics/Rect:top	I
    //   435: aload 19
    //   437: getfield 383	android/graphics/Rect:bottom	I
    //   440: iadd
    //   441: iconst_2
    //   442: idiv
    //   443: i2f
    //   444: invokevirtual 395	android/graphics/Matrix:preRotate	(FFF)Z
    //   447: pop
    //   448: new 397	android/graphics/RectF
    //   451: dup
    //   452: aload 19
    //   454: invokespecial 400	android/graphics/RectF:<init>	(Landroid/graphics/Rect;)V
    //   457: astore 22
    //   459: aload 20
    //   461: aload 22
    //   463: invokevirtual 404	android/graphics/Matrix:mapRect	(Landroid/graphics/RectF;)Z
    //   466: pop
    //   467: aload 18
    //   469: aload 20
    //   471: invokevirtual 408	android/graphics/Canvas:setMatrix	(Landroid/graphics/Matrix;)V
    //   474: aload 18
    //   476: aload_0
    //   477: getfield 283	com/whatsapp/wallpaper/CropImage:p	Landroid/graphics/Bitmap;
    //   480: aload 4
    //   482: aload 22
    //   484: aload_3
    //   485: invokevirtual 412	android/graphics/Canvas:drawBitmap	(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V
    //   488: iload_2
    //   489: ifeq +83 -> 572
    //   492: aload 4
    //   494: invokevirtual 276	android/graphics/Rect:width	()I
    //   497: aload 19
    //   499: invokevirtual 276	android/graphics/Rect:width	()I
    //   502: isub
    //   503: iconst_2
    //   504: idiv
    //   505: istore 24
    //   507: aload 4
    //   509: invokevirtual 279	android/graphics/Rect:height	()I
    //   512: aload 19
    //   514: invokevirtual 279	android/graphics/Rect:height	()I
    //   517: isub
    //   518: iconst_2
    //   519: idiv
    //   520: istore 25
    //   522: aload 4
    //   524: iconst_0
    //   525: iload 24
    //   527: invokestatic 415	java/lang/Math:max	(II)I
    //   530: iconst_0
    //   531: iload 25
    //   533: invokestatic 415	java/lang/Math:max	(II)I
    //   536: invokevirtual 419	android/graphics/Rect:inset	(II)V
    //   539: aload 19
    //   541: iconst_0
    //   542: iload 24
    //   544: ineg
    //   545: invokestatic 415	java/lang/Math:max	(II)I
    //   548: iconst_0
    //   549: iload 25
    //   551: ineg
    //   552: invokestatic 415	java/lang/Math:max	(II)I
    //   555: invokevirtual 419	android/graphics/Rect:inset	(II)V
    //   558: aload 18
    //   560: aload_0
    //   561: getfield 283	com/whatsapp/wallpaper/CropImage:p	Landroid/graphics/Bitmap;
    //   564: aload 4
    //   566: aload 19
    //   568: aload_3
    //   569: invokevirtual 422	android/graphics/Canvas:drawBitmap	(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
    //   572: iload_2
    //   573: ifeq +287 -> 860
    //   576: aload 4
    //   578: invokevirtual 276	android/graphics/Rect:width	()I
    //   581: istore 5
    //   583: aload 4
    //   585: invokevirtual 279	android/graphics/Rect:height	()I
    //   588: istore 6
    //   590: aload_0
    //   591: getfield 154	com/whatsapp/wallpaper/CropImage:f	Z
    //   594: ifeq +222 -> 816
    //   597: getstatic 362	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   600: astore 7
    //   602: iload 5
    //   604: iload 6
    //   606: aload 7
    //   608: invokestatic 366	android/graphics/Bitmap:createBitmap	(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   611: astore 8
    //   613: new 368	android/graphics/Canvas
    //   616: dup
    //   617: aload 8
    //   619: invokespecial 371	android/graphics/Canvas:<init>	(Landroid/graphics/Bitmap;)V
    //   622: astore 9
    //   624: new 272	android/graphics/Rect
    //   627: dup
    //   628: iconst_0
    //   629: iconst_0
    //   630: iload 5
    //   632: iload 6
    //   634: invokespecial 386	android/graphics/Rect:<init>	(IIII)V
    //   637: astore 10
    //   639: aload 9
    //   641: aload_0
    //   642: getfield 283	com/whatsapp/wallpaper/CropImage:p	Landroid/graphics/Bitmap;
    //   645: aload 4
    //   647: aload 10
    //   649: aload_3
    //   650: invokevirtual 422	android/graphics/Canvas:drawBitmap	(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
    //   653: aload_0
    //   654: getfield 424	com/whatsapp/wallpaper/CropImage:o	Lcom/whatsapp/wallpaper/CropImageView;
    //   657: invokevirtual 428	com/whatsapp/wallpaper/CropImageView:a	()V
    //   660: aload_0
    //   661: getfield 283	com/whatsapp/wallpaper/CropImage:p	Landroid/graphics/Bitmap;
    //   664: invokevirtual 300	android/graphics/Bitmap:recycle	()V
    //   667: aload_0
    //   668: invokevirtual 333	com/whatsapp/wallpaper/CropImage:getIntent	()Landroid/content/Intent;
    //   671: invokevirtual 432	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   674: astore 11
    //   676: aload 11
    //   678: ifnull +146 -> 824
    //   681: aload 11
    //   683: getstatic 116	com/whatsapp/wallpaper/CropImage:z	[Ljava/lang/String;
    //   686: iconst_4
    //   687: aaload
    //   688: invokevirtual 438	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   691: ifnonnull +16 -> 707
    //   694: aload 11
    //   696: getstatic 116	com/whatsapp/wallpaper/CropImage:z	[Ljava/lang/String;
    //   699: iconst_2
    //   700: aaload
    //   701: invokevirtual 442	android/os/Bundle:getBoolean	(Ljava/lang/String;)Z
    //   704: ifeq +120 -> 824
    //   707: new 434	android/os/Bundle
    //   710: dup
    //   711: invokespecial 443	android/os/Bundle:<init>	()V
    //   714: astore 12
    //   716: aload 12
    //   718: getstatic 116	com/whatsapp/wallpaper/CropImage:z	[Ljava/lang/String;
    //   721: iconst_4
    //   722: aaload
    //   723: aload 8
    //   725: invokevirtual 447	android/os/Bundle:putParcelable	(Ljava/lang/String;Landroid/os/Parcelable;)V
    //   728: aload_0
    //   729: bipush 255
    //   731: new 335	android/content/Intent
    //   734: dup
    //   735: invokespecial 448	android/content/Intent:<init>	()V
    //   738: getstatic 116	com/whatsapp/wallpaper/CropImage:z	[Ljava/lang/String;
    //   741: iconst_1
    //   742: aaload
    //   743: invokevirtual 452	android/content/Intent:setAction	(Ljava/lang/String;)Landroid/content/Intent;
    //   746: aload 12
    //   748: invokevirtual 456	android/content/Intent:putExtras	(Landroid/os/Bundle;)Landroid/content/Intent;
    //   751: invokevirtual 460	com/whatsapp/wallpaper/CropImage:setResult	(ILandroid/content/Intent;)V
    //   754: aload_0
    //   755: invokevirtual 463	com/whatsapp/wallpaper/CropImage:finish	()V
    //   758: goto -745 -> 13
    //   761: astore 31
    //   763: getstatic 116	com/whatsapp/wallpaper/CropImage:z	[Ljava/lang/String;
    //   766: iconst_0
    //   767: aaload
    //   768: aload 31
    //   770: invokestatic 466	com/whatsapp/g5:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   773: aload_1
    //   774: ifnull -501 -> 273
    //   777: aload_1
    //   778: invokevirtual 352	java/io/InputStream:close	()V
    //   781: goto -508 -> 273
    //   784: astore 32
    //   786: getstatic 116	com/whatsapp/wallpaper/CropImage:z	[Ljava/lang/String;
    //   789: iconst_3
    //   790: aaload
    //   791: astore 33
    //   793: aload 33
    //   795: aload 32
    //   797: invokestatic 466	com/whatsapp/g5:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   800: goto -527 -> 273
    //   803: astore 29
    //   805: aload_1
    //   806: ifnull +7 -> 813
    //   809: aload_1
    //   810: invokevirtual 352	java/io/InputStream:close	()V
    //   813: aload 29
    //   815: athrow
    //   816: getstatic 469	android/graphics/Bitmap$Config:RGB_565	Landroid/graphics/Bitmap$Config;
    //   819: astore 7
    //   821: goto -219 -> 602
    //   824: aload_0
    //   825: aload 8
    //   827: invokespecial 471	com/whatsapp/wallpaper/CropImage:a	(Landroid/graphics/Bitmap;)V
    //   830: goto -817 -> 13
    //   833: astore 30
    //   835: getstatic 116	com/whatsapp/wallpaper/CropImage:z	[Ljava/lang/String;
    //   838: iconst_3
    //   839: aaload
    //   840: aload 30
    //   842: invokestatic 466	com/whatsapp/g5:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   845: goto -32 -> 813
    //   848: astore 32
    //   850: getstatic 116	com/whatsapp/wallpaper/CropImage:z	[Ljava/lang/String;
    //   853: iconst_3
    //   854: aaload
    //   855: astore 33
    //   857: goto -64 -> 793
    //   860: aload 17
    //   862: astore 8
    //   864: goto -211 -> 653
    //
    // Exception table:
    //   from	to	target	type
    //   223	257	761	java/io/FileNotFoundException
    //   777	781	784	java/io/IOException
    //   223	257	803	finally
    //   763	773	803	finally
    //   809	813	833	java/io/IOException
    //   269	273	848	java/io/IOException
  }

  private void a(Bitmap paramBitmap)
  {
    boolean bool = ImageViewTouchBase.a;
    File localFile;
    int i1;
    if (this.c != null)
    {
      localFile = new File(this.c.getPath());
      i1 = 75;
    }
    while (true)
    {
      OutputStream localOutputStream = null;
      try
      {
        localOutputStream = App.ib.openOutputStream(this.c);
        if (localOutputStream != null)
          paramBitmap.compress(this.b, i1, localOutputStream);
        i1 -= 10;
        d5.a(localOutputStream);
        if ((this.m != 0) && (i1 > 0) && (localFile.exists()) && (localFile.length() > this.m))
          continue;
        i2 = 0;
        if (i2 == 0)
        {
          Intent localIntent1 = new Intent();
          localIntent1.setData(this.c);
          setResult(-1, localIntent1);
        }
        if (bool)
        {
          Bundle localBundle = new Bundle();
          localBundle.putString(z[6], this.r.c().toString());
          Intent localIntent2 = new Intent();
          localIntent2.putExtras(localBundle);
          setResult(-1, localIntent2);
        }
        paramBitmap.recycle();
        finish();
        return;
      }
      catch (IOException localIOException)
      {
        while (true)
        {
          g5.b(z[9] + this.c, localIOException);
          if ((localIOException.getMessage() != null) && (localIOException.getMessage().contains(z[8])))
          {
            setResult(0, new Intent().putExtra(z[7], true));
            if (!bool);
          }
          else
          {
            setResult(0, new Intent().putExtra(z[10], true));
          }
          d5.a(localOutputStream);
          int i2 = 1;
        }
      }
      finally
      {
        d5.a(localOutputStream);
      }
    }
  }

  static void a(CropImage paramCropImage)
  {
    paramCropImage.a();
  }

  public static final void a(j paramj, ContentResolver paramContentResolver, Cursor paramCursor, String paramString)
  {
    paramj.b = paramCursor.getLong(0);
    paramj.c = paramCursor.getString(1);
    paramj.e = paramCursor.getString(2);
    paramj.g = paramCursor.getDouble(3);
    paramj.h = paramCursor.getDouble(4);
    paramj.i = paramCursor.getLong(5);
    paramj.l = paramCursor.getLong(6);
    paramj.k = paramCursor.getLong(7);
    if (paramj.i == paramj.k)
      paramj.i = (1000L * paramj.k);
    paramj.q = paramCursor.getString(8);
    if (paramString != null)
      paramj.d = (paramString + paramj.b);
    int i1 = paramj.a();
    int i2 = paramCursor.getInt(9);
    if (i1 == 0)
    {
      paramj.p = i2;
      if (!ImageViewTouchBase.a);
    }
    else
    {
      paramj.m = i2;
    }
  }

  private void b()
  {
    boolean bool1 = ImageViewTouchBase.a;
    f localf = new f(this.o);
    int i1 = this.p.getWidth();
    int i2 = this.p.getHeight();
    Rect localRect = new Rect(0, 0, i1, i2);
    int i3 = 4 * Math.min(i1, i2) / 5;
    if (this.l)
      if ((this.h < i3) && (this.i < i3))
      {
        i4 = (int)(i3 * this.i / this.h);
        if (!bool1);
      }
      else
      {
        i3 = this.h;
      }
    for (int i4 = this.i; ; i4 = i3)
    {
      if ((this.d != 0) && (this.e != 0))
        if (this.d > this.e)
        {
          i4 = i3 * this.e / this.d;
          if (!bool1);
        }
        else
        {
          i3 = i4 * this.d / this.e;
        }
      if (i4 > i2)
      {
        float f1 = i4 / i2;
        i3 = (int)(i3 / f1);
        i4 = i2;
      }
      if (this.g > 0)
      {
        if (i3 < this.g)
        {
          i3 = this.g;
          if ((this.d != 0) && (this.e != 0))
            i4 = i3 * this.e / this.d;
        }
        if (i4 < this.g)
        {
          i4 = this.g;
          if ((this.d == 0) || (this.e == 0));
        }
      }
      for (int i5 = i4 * this.d / this.e; ; i5 = i3)
      {
        int i6 = (i1 - i5) / 2;
        int i7 = (i2 - i4) / 2;
        RectF localRectF = new RectF(i6, i7, i5 + i6, i4 + i7);
        Matrix localMatrix1 = new Matrix();
        localMatrix1.preRotate(this.q % 360, (localRectF.left + localRectF.right) / 2.0F, (localRectF.top + localRectF.bottom) / 2.0F);
        localMatrix1.mapRect(localRectF);
        Matrix localMatrix2 = this.o.getImageMatrix();
        boolean bool2 = this.f;
        if ((this.d != 0) && (this.e != 0));
        for (boolean bool3 = true; ; bool3 = false)
        {
          localf.a(localMatrix2, localRect, localRectF, bool2, bool3, this.l, this.g);
          this.o.c(localf);
          this.r = localf;
          return;
        }
      }
    }
  }

  private static String z(char[] paramArrayOfChar)
  {
    int i1 = paramArrayOfChar.length;
    int i2 = 0;
    if (i1 <= i2)
      return new String(paramArrayOfChar).intern();
    int i3 = paramArrayOfChar[i2];
    int i4;
    switch (i2 % 5)
    {
    default:
      i4 = 78;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      paramArrayOfChar[i2] = (char)(i4 ^ i3);
      i2++;
      break;
      i4 = 56;
      continue;
      i4 = 44;
      continue;
      i4 = 103;
      continue;
      i4 = 83;
    }
  }

  private static char[] z(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    if (arrayOfChar.length < 2)
      arrayOfChar[0] = (char)(0x4E ^ arrayOfChar[0]);
    return arrayOfChar;
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool1 = ImageViewTouchBase.a;
    g5.b(z[19]);
    super.onCreate(paramBundle);
    App.z();
    requestWindowFeature(1);
    setContentView(2130903083);
    this.o = ((CropImageView)findViewById(2131558560));
    Intent localIntent = getIntent();
    Bundle localBundle = localIntent.getExtras();
    boolean bool3;
    if (localBundle != null)
    {
      if (localBundle.getString(z[27]) != null)
      {
        this.f = true;
        this.d = 1;
        this.e = 1;
      }
      this.c = ((Uri)localBundle.getParcelable(z[33]));
      if (this.c != null)
      {
        String str2 = localBundle.getString(z[29]);
        if (str2 != null)
          this.b = Bitmap.CompressFormat.valueOf(str2);
      }
      this.p = ((Bitmap)localBundle.getParcelable(z[4]));
      this.d = localBundle.getInt(z[26]);
      this.e = localBundle.getInt(z[13]);
      this.h = localBundle.getInt(z[21]);
      this.i = localBundle.getInt(z[32]);
      this.g = localBundle.getInt(z[12]);
      CropImageView localCropImageView = this.o;
      boolean bool2 = localBundle.getBoolean(z[16], true);
      this.l = bool2;
      localCropImageView.cropByOutputSize = bool2;
      this.j = localBundle.getBoolean(z[31], true);
      this.k = localBundle.getBoolean(z[14], true);
      this.m = localBundle.getInt(z[23]);
      if (this.p == null)
        break label548;
      bool3 = true;
    }
    while (true)
    {
      this.s = bool3;
      Uri localUri;
      String str1;
      j localj;
      if (this.p == null)
      {
        localUri = localIntent.getData();
        str1 = localUri.getScheme();
        localj = null;
        if ((str1 != null) && (str1.equals(z[34])))
          localj = a(this, localUri, 0);
        if (localj == null);
      }
      try
      {
        this.p = MediaStore.Images.Media.getBitmap(App.ib, localIntent.getData());
        this.q = (int)localj.p;
        if (bool1)
        {
          this.p = MediaStore.Images.Media.getBitmap(App.ib, localIntent.getData());
          if ((str1 != null) && (str1.equals(z[30])))
            this.q = (int)a(new ExifInterface(localUri.getPath()).getAttributeInt(z[15], 1));
        }
        if ((this.p == null) || (this.p.getWidth() == 0) || (this.p.getHeight() == 0))
        {
          g5.d(z[25]);
          setResult(0, new Intent().putExtra(z[22], true));
          finish();
          return;
          label548: bool3 = false;
        }
      }
      catch (IOException localIOException)
      {
        while (true)
        {
          if ((localIOException.getMessage() != null) && (localIOException.getMessage().contains(z[8])))
          {
            setResult(0, new Intent().putExtra(z[7], true));
            if (!bool1);
          }
          else
          {
            setResult(0, new Intent().putExtra(z[10], true));
          }
          g5.b(z[18], localIOException);
          finish();
        }
      }
      catch (OutOfMemoryError localOutOfMemoryError2)
      {
        while (true)
        {
          try
          {
            g5.d(z[28]);
            this.p = j5.a(localUri, 2);
          }
          catch (OutOfMemoryError localOutOfMemoryError3)
          {
            g5.d(z[11]);
            try
            {
              this.p = j5.a(localUri, 3);
            }
            catch (OutOfMemoryError localOutOfMemoryError4)
            {
              g5.d(z[20]);
              setResult(0, new Intent().putExtra(z[17], true));
              finish();
            }
          }
          continue;
          this.o.a(new k(this.p, this.q), true);
          try
          {
            b();
            getWindow().addFlags(1024);
            findViewById(2131558639).setOnClickListener(new d(this));
            findViewById(2131558638).setOnClickListener(new e(this));
            g5.b(z[24]);
            App.z();
          }
          catch (OutOfMemoryError localOutOfMemoryError1)
          {
            setResult(0, new Intent().putExtra(z[17], true));
            finish();
          }
        }
      }
    }
  }

  protected void onDestroy()
  {
    super.onDestroy();
    if ((this.p != null) && (!this.p.isRecycled()))
    {
      this.o.isRecycle = true;
      this.p.recycle();
      this.p = null;
    }
    g5.b(z[35]);
    App.z();
  }

  protected void onPause()
  {
    super.onPause();
  }

  protected void onResume()
  {
    super.onResume();
  }
}