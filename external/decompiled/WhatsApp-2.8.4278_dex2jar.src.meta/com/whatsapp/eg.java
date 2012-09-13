package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class eg
{
  static long a;
  static long b;
  static boolean c;
  static boolean d;
  static boolean e;
  static long f;
  static final int[] g;
  static int h;
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[11];
    char[] arrayOfChar1 = "\"x\004c(-oH`<0o8{<1u8x4.~G".toCharArray();
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
    char[] arrayOfChar8;
    int i25;
    char[] arrayOfChar9;
    int i29;
    char[] arrayOfChar10;
    int i33;
    char[] arrayOfChar11;
    int i37;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\"x\004c(-o8x$3~".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "/z\024x\0024z\025b4-|".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label637;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "&c\027e/\"o\016c3\034\006x8".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label729;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\"x\004c(-oHi%3r\025m)*t\t,".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label821;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "0t\001x*\"i\002S8;k\016~<7r\bb\002/z\024x\0024z\025b8'".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label913;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "\"k\027#.&o\021i/0r\bb.6vHj<*w\002h".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label1005;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "cu\002{`".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1097;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "\"x\004c(-oHi%3r\025m)*t\t#/,w\013n< pGc1'&".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1189;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "\"x\004c(-oHi%3r\025m)*t\t#8;o\002b9&Gc1'&".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1281;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "\"x\004c(-oH~8\"Hj<*wG".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label1373;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        z = arrayOfString;
        e = false;
        int[] arrayOfInt = new int[5];
        arrayOfInt[0] = 1;
        arrayOfInt[1] = 2;
        arrayOfInt[2] = 3;
        arrayOfInt[3] = 5;
        arrayOfInt[4] = 14;
        g = arrayOfInt;
        h = -1;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 93;
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
        m = 67;
        continue;
        m = 27;
        continue;
        m = 103;
        continue;
        m = 12;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 93;
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
      i3 = 67;
      continue;
      i3 = 27;
      continue;
      i3 = 103;
      continue;
      i3 = 12;
    }
    label637: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 93;
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
      i7 = 67;
      continue;
      i7 = 27;
      continue;
      i7 = 103;
      continue;
      i7 = 12;
    }
    label729: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 93;
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
      i11 = 67;
      continue;
      i11 = 27;
      continue;
      i11 = 103;
      continue;
      i11 = 12;
    }
    label821: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 93;
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
      i15 = 67;
      continue;
      i15 = 27;
      continue;
      i15 = 103;
      continue;
      i15 = 12;
    }
    label913: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 93;
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
      i19 = 67;
      continue;
      i19 = 27;
      continue;
      i19 = 103;
      continue;
      i19 = 12;
    }
    label1005: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 93;
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
      i23 = 67;
      continue;
      i23 = 27;
      continue;
      i23 = 103;
      continue;
      i23 = 12;
    }
    label1097: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 93;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar8[i25] = (char)(i27 ^ i26);
      i25++;
      break;
      i27 = 67;
      continue;
      i27 = 27;
      continue;
      i27 = 103;
      continue;
      i27 = 12;
    }
    label1189: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 93;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar9[i29] = (char)(i31 ^ i30);
      i29++;
      break;
      i31 = 67;
      continue;
      i31 = 27;
      continue;
      i31 = 103;
      continue;
      i31 = 12;
    }
    label1281: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 93;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar10[i33] = (char)(i35 ^ i34);
      i33++;
      break;
      i35 = 67;
      continue;
      i35 = 27;
      continue;
      i35 = 103;
      continue;
      i35 = 12;
    }
    label1373: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 93;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar11[i37] = (char)(i39 ^ i38);
      i37++;
      break;
      i39 = 67;
      continue;
      i39 = 27;
      continue;
      i39 = 103;
      continue;
      i39 = 12;
    }
  }

  // ERROR //
  static int a()
  {
    // Byte code:
    //   0: new 69	java/io/File
    //   3: dup
    //   4: getstatic 75	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   7: invokevirtual 79	com/whatsapp/App:getFilesDir	()Ljava/io/File;
    //   10: getstatic 58	com/whatsapp/eg:z	[Ljava/lang/String;
    //   13: iconst_1
    //   14: aaload
    //   15: invokespecial 82	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   18: astore_0
    //   19: aload_0
    //   20: invokevirtual 86	java/io/File:exists	()Z
    //   23: ifeq +57 -> 80
    //   26: aconst_null
    //   27: astore_2
    //   28: new 88	java/io/ObjectInputStream
    //   31: dup
    //   32: new 90	java/io/FileInputStream
    //   35: dup
    //   36: aload_0
    //   37: invokespecial 93	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   40: invokespecial 96	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   43: astore_3
    //   44: aload_3
    //   45: invokevirtual 99	java/io/ObjectInputStream:readInt	()I
    //   48: istore_1
    //   49: aload_3
    //   50: invokevirtual 102	java/io/ObjectInputStream:close	()V
    //   53: aload_3
    //   54: ifnull +7 -> 61
    //   57: aload_3
    //   58: invokevirtual 102	java/io/ObjectInputStream:close	()V
    //   61: iload_1
    //   62: ireturn
    //   63: astore 4
    //   65: aconst_null
    //   66: astore_3
    //   67: aload 4
    //   69: invokestatic 107	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   72: aload_3
    //   73: ifnull +7 -> 80
    //   76: aload_3
    //   77: invokevirtual 102	java/io/ObjectInputStream:close	()V
    //   80: bipush 255
    //   82: istore_1
    //   83: goto -22 -> 61
    //   86: astore 5
    //   88: aload_2
    //   89: ifnull +7 -> 96
    //   92: aload_2
    //   93: invokevirtual 102	java/io/ObjectInputStream:close	()V
    //   96: aload 5
    //   98: athrow
    //   99: astore 8
    //   101: goto -40 -> 61
    //   104: astore 7
    //   106: goto -26 -> 80
    //   109: astore 6
    //   111: goto -15 -> 96
    //   114: astore 5
    //   116: aload_3
    //   117: astore_2
    //   118: goto -30 -> 88
    //   121: astore 4
    //   123: goto -56 -> 67
    //
    // Exception table:
    //   from	to	target	type
    //   28	44	63	java/io/IOException
    //   28	44	86	finally
    //   57	61	99	java/io/IOException
    //   76	80	104	java/io/IOException
    //   92	96	109	java/io/IOException
    //   44	53	114	finally
    //   67	72	114	finally
    //   44	53	121	java/io/IOException
  }

  public static int a(Context paramContext)
  {
    int i = -1;
    boolean bool = DialogToastListActivity.f;
    Date localDate = App.o;
    if (localDate == null);
    label183: 
    while (true)
    {
      return i;
      SharedPreferences localSharedPreferences = paramContext.getSharedPreferences(paramContext.getString(2131296258), 0);
      long l1 = new Date().getTime();
      long l2 = localDate.getTime() - l1;
      long l3 = localSharedPreferences.getLong(z[5], 0L);
      int j = 1 + (int)(l2 / 86400000L);
      int[] arrayOfInt = g;
      int k = arrayOfInt.length;
      int i1;
      for (int m = 0; ; m = i1)
      {
        if (m >= k)
          break label183;
        int n = arrayOfInt[m];
        if ((j == n) && (!t4.b(l3)))
        {
          SharedPreferences.Editor localEditor = localSharedPreferences.edit();
          localEditor.putLong(z[5], l1);
          if (!localEditor.commit())
            g5.d(z[6]);
          i = n;
          break;
        }
        i1 = m + 1;
        if (bool)
          break;
      }
    }
  }

  public static int a(boolean paramBoolean)
  {
    int i = -1;
    boolean bool = DialogToastListActivity.f;
    long l1 = a(z[3]);
    if (l1 == 0L);
    label139: 
    while (true)
    {
      return i;
      long l2 = l1 - System.currentTimeMillis();
      long l3 = a(z[2]);
      if (l2 < 0L)
      {
        if ((paramBoolean) || (!t4.b(l3)))
          i = 0;
      }
      else
      {
        int j = 1 + (int)(l2 / 86400000L);
        int[] arrayOfInt = g;
        int k = arrayOfInt.length;
        int i1;
        for (int m = 0; ; m = i1)
        {
          if (m >= k)
            break label139;
          int n = arrayOfInt[m];
          if ((j == n) && (!t4.b(l3)))
          {
            i = n;
            break;
          }
          i1 = m + 1;
          if (bool)
            break;
        }
      }
    }
  }

  // ERROR //
  static long a(String paramString)
  {
    // Byte code:
    //   0: lconst_0
    //   1: lstore_1
    //   2: new 69	java/io/File
    //   5: dup
    //   6: getstatic 75	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   9: invokevirtual 79	com/whatsapp/App:getFilesDir	()Ljava/io/File;
    //   12: aload_0
    //   13: invokespecial 82	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   16: astore_3
    //   17: aload_3
    //   18: invokevirtual 86	java/io/File:exists	()Z
    //   21: ifeq +35 -> 56
    //   24: aconst_null
    //   25: astore 4
    //   27: aload_0
    //   28: getstatic 58	com/whatsapp/eg:z	[Ljava/lang/String;
    //   31: iconst_3
    //   32: aaload
    //   33: if_acmpne +77 -> 110
    //   36: getstatic 175	com/whatsapp/eg:b	J
    //   39: lload_1
    //   40: lcmp
    //   41: ifeq +17 -> 58
    //   44: getstatic 175	com/whatsapp/eg:b	J
    //   47: lstore_1
    //   48: iconst_0
    //   49: ifeq +7 -> 56
    //   52: aconst_null
    //   53: invokevirtual 102	java/io/ObjectInputStream:close	()V
    //   56: lload_1
    //   57: lreturn
    //   58: new 88	java/io/ObjectInputStream
    //   61: dup
    //   62: new 90	java/io/FileInputStream
    //   65: dup
    //   66: aload_3
    //   67: invokespecial 93	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   70: invokespecial 96	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   73: astore 12
    //   75: aload 12
    //   77: invokevirtual 178	java/io/ObjectInputStream:readLong	()J
    //   80: putstatic 175	com/whatsapp/eg:b	J
    //   83: aload 12
    //   85: invokevirtual 102	java/io/ObjectInputStream:close	()V
    //   88: getstatic 175	com/whatsapp/eg:b	J
    //   91: lstore_1
    //   92: aload 12
    //   94: ifnull -38 -> 56
    //   97: aload 12
    //   99: invokevirtual 102	java/io/ObjectInputStream:close	()V
    //   102: goto -46 -> 56
    //   105: astore 13
    //   107: goto -51 -> 56
    //   110: getstatic 180	com/whatsapp/eg:a	J
    //   113: lload_1
    //   114: lcmp
    //   115: ifeq +23 -> 138
    //   118: getstatic 180	com/whatsapp/eg:a	J
    //   121: lstore_1
    //   122: iconst_0
    //   123: ifeq -67 -> 56
    //   126: aconst_null
    //   127: invokevirtual 102	java/io/ObjectInputStream:close	()V
    //   130: goto -74 -> 56
    //   133: astore 11
    //   135: goto -79 -> 56
    //   138: new 88	java/io/ObjectInputStream
    //   141: dup
    //   142: new 90	java/io/FileInputStream
    //   145: dup
    //   146: aload_3
    //   147: invokespecial 93	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   150: invokespecial 96	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   153: astore 9
    //   155: aload 9
    //   157: invokevirtual 178	java/io/ObjectInputStream:readLong	()J
    //   160: putstatic 180	com/whatsapp/eg:a	J
    //   163: aload 9
    //   165: invokevirtual 102	java/io/ObjectInputStream:close	()V
    //   168: getstatic 180	com/whatsapp/eg:a	J
    //   171: lstore_1
    //   172: aload 9
    //   174: ifnull -118 -> 56
    //   177: aload 9
    //   179: invokevirtual 102	java/io/ObjectInputStream:close	()V
    //   182: goto -126 -> 56
    //   185: astore 10
    //   187: goto -131 -> 56
    //   190: astore 7
    //   192: new 182	java/lang/StringBuilder
    //   195: dup
    //   196: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   199: getstatic 58	com/whatsapp/eg:z	[Ljava/lang/String;
    //   202: bipush 10
    //   204: aaload
    //   205: invokevirtual 187	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   208: aload 7
    //   210: invokevirtual 190	java/io/IOException:toString	()Ljava/lang/String;
    //   213: invokevirtual 187	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   219: invokestatic 164	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   222: aload 4
    //   224: ifnull -168 -> 56
    //   227: aload 4
    //   229: invokevirtual 102	java/io/ObjectInputStream:close	()V
    //   232: goto -176 -> 56
    //   235: astore 8
    //   237: goto -181 -> 56
    //   240: astore 5
    //   242: aload 4
    //   244: ifnull +8 -> 252
    //   247: aload 4
    //   249: invokevirtual 102	java/io/ObjectInputStream:close	()V
    //   252: aload 5
    //   254: athrow
    //   255: astore 14
    //   257: goto -201 -> 56
    //   260: astore 6
    //   262: goto -10 -> 252
    //   265: astore 5
    //   267: aload 12
    //   269: astore 4
    //   271: goto -29 -> 242
    //   274: astore 5
    //   276: aload 9
    //   278: astore 4
    //   280: goto -38 -> 242
    //   283: astore 7
    //   285: aload 12
    //   287: astore 4
    //   289: goto -97 -> 192
    //   292: astore 7
    //   294: aload 9
    //   296: astore 4
    //   298: goto -106 -> 192
    //
    // Exception table:
    //   from	to	target	type
    //   97	102	105	java/io/IOException
    //   126	130	133	java/io/IOException
    //   177	182	185	java/io/IOException
    //   27	48	190	java/io/IOException
    //   58	75	190	java/io/IOException
    //   110	122	190	java/io/IOException
    //   138	155	190	java/io/IOException
    //   227	232	235	java/io/IOException
    //   27	48	240	finally
    //   58	75	240	finally
    //   110	122	240	finally
    //   138	155	240	finally
    //   192	222	240	finally
    //   52	56	255	java/io/IOException
    //   247	252	260	java/io/IOException
    //   75	92	265	finally
    //   155	172	274	finally
    //   75	92	283	java/io/IOException
    //   155	172	292	java/io/IOException
  }

  public static Dialog a(Activity paramActivity)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramActivity).setTitle(2131296670);
    String str = App.Z.a(2131427337, App.q);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(App.q);
    return localBuilder.setMessage(String.format(str, arrayOfObject)).setPositiveButton(2131296672, new gg(paramActivity)).setNegativeButton(2131296268, new fg(paramActivity)).create();
  }

  public static String a(Activity paramActivity, boolean paramBoolean)
  {
    String str1 = null;
    if (c)
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = ("+" + App.bb.jabber_id);
      arrayOfObject2[1] = t4.f(paramActivity, a(z[3]));
      str1 = paramActivity.getString(2131296832, arrayOfObject2);
      c = false;
    }
    while (true)
    {
      return str1;
      int i = a(paramBoolean);
      if (i > 0)
      {
        String str2 = App.Z.a(2131427333, i);
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(i);
        str1 = String.format(str2, arrayOfObject1);
      }
      else if (i == 0)
      {
        str1 = paramActivity.getString(2131296414);
      }
    }
  }

  public static void a(int paramInt)
  {
    h = paramInt;
  }

  public static void a(long paramLong)
  {
    long l = a(z[3]);
    c(paramLong);
    if ((l < paramLong) && (paramLong > 2592000000L + System.currentTimeMillis()) && (l != 0L))
    {
      g5.b(z[9] + new Date(l) + z[7] + new Date(paramLong));
      f = paramLong;
      e = false;
      App.a(paramLong);
      c = false;
      if (!DialogToastListActivity.f);
    }
    else if (l > paramLong)
    {
      f = paramLong;
      e = true;
      App.a(paramLong);
      g5.c(z[8] + new Date(l) + z[7] + new Date(paramLong));
    }
  }

  public static int b(int paramInt)
  {
    int i = 2131296820;
    boolean bool = DialogToastListActivity.f;
    switch (paramInt)
    {
    default:
    case -1:
    case 0:
    case 1:
    }
    while (true)
    {
      return i;
      if (bool)
      {
        int j = 2131296821;
        if (bool)
        {
          j = 2131296823;
          if (bool);
        }
        else
        {
          i = j;
        }
      }
    }
  }

  public static void b()
  {
    new File(App.Mb.getFilesDir(), z[3]).delete();
    b = 0L;
  }

  static void b(long paramLong)
  {
    g5.b(z[0] + new Date(paramLong));
    a = paramLong;
    d(paramLong);
  }

  public static void c()
  {
    new File(App.Mb.getFilesDir(), z[2]).delete();
    a = 0L;
  }

  public static void c(int paramInt)
  {
    d(paramInt);
  }

  private static void c(long paramLong)
  {
    b = paramLong;
    g5.b(z[4] + new Date(paramLong));
    try
    {
      ObjectOutputStream localObjectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(App.Mb.getFilesDir(), z[3])));
      localObjectOutputStream.writeLong(paramLong);
      localObjectOutputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        g5.d(localIOException);
    }
  }

  private static void d(int paramInt)
  {
    if (paramInt != -1);
    try
    {
      ObjectOutputStream localObjectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(App.Mb.getFilesDir(), z[1])));
      localObjectOutputStream.writeInt(paramInt);
      localObjectOutputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        g5.d(localIOException);
    }
  }

  private static void d(long paramLong)
  {
    g5.b(z[0] + new Date(paramLong));
    File localFile = new File(App.Mb.getFilesDir(), z[2]);
    try
    {
      ObjectOutputStream localObjectOutputStream = new ObjectOutputStream(new FileOutputStream(localFile));
      localObjectOutputStream.writeLong(paramLong);
      localObjectOutputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        g5.d(localIOException);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.eg
 * JD-Core Version:    0.6.1
 */