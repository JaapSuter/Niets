package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import b;
import g;
import j;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import m;

public class BroadcastMediaPicker extends DialogToastActivity
{
  private static final String[] z;
  String f;

  static
  {
    String[] arrayOfString = new String[7];
    char[] arrayOfChar1 = "b\027NW\tb\031Sm&d\003Pj\034x".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    char[] arrayOfChar4;
    int i9;
    char[] arrayOfChar5;
    int i13;
    char[] arrayOfChar6;
    int i17;
    char[] arrayOfChar7;
    int i21;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "U\037Y".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "n\037Nx\025k\017bf\030g\023".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label441;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "e\031P".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label533;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "l\037Qm".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label625;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "d\003QdYi\003O{\026x".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label717;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "U\022\\|\030".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label809;
        arrayOfString[6] = new String(arrayOfChar7).intern();
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
        m = 121;
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
        m = 10;
        continue;
        m = 118;
        continue;
        m = 61;
        continue;
        m = 8;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 121;
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
      i3 = 10;
      continue;
      i3 = 118;
      continue;
      i3 = 61;
      continue;
      i3 = 8;
    }
    label441: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 121;
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
      i7 = 10;
      continue;
      i7 = 118;
      continue;
      i7 = 61;
      continue;
      i7 = 8;
    }
    label533: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 121;
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
      i11 = 10;
      continue;
      i11 = 118;
      continue;
      i11 = 61;
      continue;
      i11 = 8;
    }
    label625: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 121;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i13] = (char)(i15 ^ i14);
      i13++;
      break;
      i15 = 10;
      continue;
      i15 = 118;
      continue;
      i15 = 61;
      continue;
      i15 = 8;
    }
    label717: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 121;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i17] = (char)(i19 ^ i18);
      i17++;
      break;
      i19 = 10;
      continue;
      i19 = 118;
      continue;
      i19 = 61;
      continue;
      i19 = 8;
    }
    label809: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 121;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i21] = (char)(i23 ^ i22);
      i21++;
      break;
      i23 = 10;
      continue;
      i23 = 118;
      continue;
      i23 = 61;
      continue;
      i23 = 8;
    }
  }

  public static File a(Uri paramUri)
    throws IOException
  {
    File localFile;
    if (paramUri.toString().startsWith(z[4]))
    {
      localFile = new File(paramUri.getPath());
      if (!DialogToastListActivity.f);
    }
    else
    {
      ContentResolver localContentResolver = App.ib;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = z[6];
      Cursor localCursor = localContentResolver.query(paramUri, arrayOfString, null, null, null);
      if (localCursor == null)
        throw new IOException(z[5]);
      localCursor.moveToFirst();
      localFile = new File(localCursor.getString(0));
      localCursor.close();
    }
    return localFile;
  }

  public static void a(Context paramContext, File paramFile, byte paramByte, String paramString)
    throws IOException, FileNotFoundException
  {
    if (paramFile.length() > 12582912L)
    {
      App.a(paramContext, 2131296760, 0);
      if (!DialogToastListActivity.f);
    }
    else
    {
      String str = paramFile.getName().substring(paramFile.getName().lastIndexOf("."));
      File localFile = App.a(paramString + str, paramByte);
      a(paramFile, localFile);
      MediaData localMediaData = new MediaData();
      localMediaData.file = localFile;
      BroadcastMessageComposer.k = new sz(App.bb.jabber_id + System.currentTimeMillis(), (byte[])null, localMediaData);
      BroadcastMessageComposer.k.h = 1;
      BroadcastMessageComposer.k.l = paramByte;
      BroadcastMessageComposer.k.p = localMediaData.file.getName();
      BroadcastMessageComposer.k.m = localMediaData.file.length();
      BroadcastMessageComposer.k.a = 1;
    }
  }

  public static void a(Intent paramIntent, File paramFile)
    throws IOException, FileNotFoundException, SecurityException, dg, OutOfMemoryError
  {
    Uri localUri;
    Bitmap localBitmap;
    if (paramIntent == null)
    {
      localUri = null;
      localBitmap = j5.a(localUri, paramFile);
      if (localBitmap != null)
        break label37;
      App.a(App.Mb.getApplicationContext(), 2131296775, 0);
    }
    while (true)
    {
      return;
      localUri = paramIntent.getData();
      break;
      label37: MediaData localMediaData = new MediaData();
      localMediaData.file = paramFile;
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      localBitmap.compress(Bitmap.CompressFormat.JPEG, 80, localByteArrayOutputStream);
      byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
      BroadcastMessageComposer.k = new sz(App.bb.jabber_id + System.currentTimeMillis(), arrayOfByte, localMediaData);
      BroadcastMessageComposer.k.h = 1;
      BroadcastMessageComposer.k.l = 1;
      BroadcastMessageComposer.k.p = localMediaData.file.getName();
      BroadcastMessageComposer.k.m = localMediaData.file.length();
      BroadcastMessageComposer.k.a = 1;
    }
  }

  // ERROR //
  static void a(File paramFile1, File paramFile2)
    throws IOException, FileNotFoundException
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: getstatic 68	com/whatsapp/DialogToastListActivity:f	Z
    //   5: istore_3
    //   6: new 235	java/io/FileInputStream
    //   9: dup
    //   10: aload_0
    //   11: invokespecial 238	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   14: astore 4
    //   16: new 240	java/io/FileOutputStream
    //   19: dup
    //   20: aload_1
    //   21: invokespecial 241	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   24: astore 5
    //   26: sipush 4096
    //   29: newarray byte
    //   31: astore 7
    //   33: aload 4
    //   35: aload 7
    //   37: iconst_0
    //   38: aload 7
    //   40: arraylength
    //   41: invokevirtual 247	java/io/InputStream:read	([BII)I
    //   44: istore 8
    //   46: iload 8
    //   48: iflt +22 -> 70
    //   51: aload 5
    //   53: aload 7
    //   55: iconst_0
    //   56: iload 8
    //   58: invokevirtual 253	java/io/OutputStream:write	([BII)V
    //   61: iload_2
    //   62: iload 8
    //   64: iadd
    //   65: istore_2
    //   66: iload_3
    //   67: ifeq -34 -> 33
    //   70: aload 4
    //   72: ifnull +8 -> 80
    //   75: aload 4
    //   77: invokevirtual 254	java/io/InputStream:close	()V
    //   80: return
    //   81: astore 6
    //   83: aconst_null
    //   84: astore 4
    //   86: aload 4
    //   88: ifnull +8 -> 96
    //   91: aload 4
    //   93: invokevirtual 254	java/io/InputStream:close	()V
    //   96: aload 6
    //   98: athrow
    //   99: astore 6
    //   101: goto -15 -> 86
    //
    // Exception table:
    //   from	to	target	type
    //   6	16	81	finally
    //   16	61	99	finally
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 == 0);
    while (true)
    {
      return;
      if (paramInt1 == 1)
      {
        try
        {
          a(paramIntent, j5.b());
          setResult(-1, null);
          finish();
        }
        catch (SecurityException localSecurityException)
        {
          g5.d(localSecurityException);
        }
        catch (FileNotFoundException localFileNotFoundException)
        {
          g5.d(localFileNotFoundException);
          App.a(this, 2131296759, 0);
          finish();
        }
        catch (dg localdg)
        {
          showDialog(0);
        }
        catch (IOException localIOException)
        {
          while (true)
          {
            g5.d(localIOException);
            App.a(this, 2131296759, 0);
          }
        }
        catch (OutOfMemoryError localOutOfMemoryError)
        {
          Intent localIntent = new Intent();
          localIntent.putExtra(z[3], true);
          setResult(0, localIntent);
          finish();
        }
        continue;
      }
      if (paramInt1 == 5)
      {
        File localFile2 = a(paramIntent.getData());
        this.f = j5.a(2);
        a(this, localFile2, (byte)2, this.f);
        setResult(-1, null);
        finish();
        continue;
      }
      if (paramInt1 == 4)
      {
        File localFile1 = a(paramIntent.getData());
        this.f = j5.a(3);
        a(this, localFile1, (byte)3, this.f);
        setResult(-1, null);
        finish();
        continue;
      }
      if (paramInt1 != 7)
        continue;
      Uri localUri = paramIntent.getData();
      String[] arrayOfString = new String[3];
      arrayOfString[0] = z[1];
      arrayOfString[1] = z[2];
      arrayOfString[2] = z[0];
      Cursor localCursor = App.ib.query(localUri, arrayOfString, null, null, null);
      g localg = new g(this);
      if (localCursor.moveToNext())
      {
        String str2 = localCursor.getString(localCursor.getColumnIndex(z[1]));
        localg.c.a = localCursor.getString(localCursor.getColumnIndex(z[2]));
        localg.c(str2);
        if (Integer.parseInt(localCursor.getString(localCursor.getColumnIndex(z[0]))) > 0)
          localg.d(str2);
        localg.e(str2);
        localg.f(str2);
        localg.g(str2);
        localg.h(str2);
        localg.i(str2);
        localg.j(str2);
        localg.k(str2);
      }
      localCursor.close();
      m localm = new m();
      try
      {
        String str1 = localm.a(localg, 2);
        BroadcastMessageComposer.k = new sz(App.bb.jabber_id + System.currentTimeMillis(), str1, null);
        BroadcastMessageComposer.k.h = 0;
        BroadcastMessageComposer.k.l = 4;
        BroadcastMessageComposer.k.p = localg.c.a;
        setResult(-1, null);
        finish();
      }
      catch (b localb)
      {
        while (true)
        {
          g5.d(localb);
          App.a(this, 2131296815, 0);
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(2130903117);
    if (App.bb == null)
      finish();
    while (true)
    {
      return;
      findViewById(2131558583).setFocusable(true);
      findViewById(2131558583).setClickable(true);
      findViewById(2131558583).setOnClickListener(new ji(this));
      findViewById(2131558584).setOnClickListener(new ki(this));
      findViewById(2131558585).setOnClickListener(new li(this));
      findViewById(2131558586).setOnClickListener(new mi(this));
      findViewById(2131558587).setOnClickListener(new ni(this));
    }
  }

  public Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 0:
    }
    for (Object localObject = super.onCreateDialog(paramInt); ; localObject = new AlertDialog.Builder(this).setMessage(2131296982).setNeutralButton(2131296270, new oi(this)).create())
      return localObject;
  }
}