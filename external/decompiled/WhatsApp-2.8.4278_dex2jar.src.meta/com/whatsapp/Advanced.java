package com.whatsapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.whatsapp.messaging.m;
import java.io.File;

public class Advanced extends Activity
{
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[5];
    char[] arrayOfChar1 = "J\017}mkH\016o#a^\006{xdI\007n#lDFn~wD\031+".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "J\017}mkH\016o#a^\006{xdI\007n#fJ\005ecq\013\byid_\016+hlY".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "J\017}mkH\016o#a^\006{xdI\007n#cB\007nbdF\016+ev\013\005~`i".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label364;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "HE|dd_\030j|u\005\005nx+".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label452;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "b$_iv_4".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label540;
        arrayOfString[4] = new String(arrayOfChar5).intern();
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
        m = 5;
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
        m = 43;
        continue;
        m = 107;
        continue;
        m = 11;
        continue;
        m = 12;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 5;
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
      i3 = 43;
      continue;
      i3 = 107;
      continue;
      i3 = 11;
      continue;
      i3 = 12;
    }
    label364: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 5;
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
      i7 = 43;
      continue;
      i7 = 107;
      continue;
      i7 = 11;
      continue;
      i7 = 12;
    }
    label452: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 5;
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
      i11 = 43;
      continue;
      i11 = 107;
      continue;
      i11 = 11;
      continue;
      i11 = 12;
    }
    label540: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 5;
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
      i15 = 43;
      continue;
      i15 = 107;
      continue;
      i15 = 11;
      continue;
      i15 = 12;
    }
  }

  // ERROR //
  static void a(android.net.Uri paramUri, String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +12 -> 13
    //   4: getstatic 34	com/whatsapp/Advanced:z	[Ljava/lang/String;
    //   7: iconst_2
    //   8: aaload
    //   9: invokestatic 46	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   12: return
    //   13: getstatic 51	com/whatsapp/App:c	Ljava/io/File;
    //   16: astore_2
    //   17: aload_2
    //   18: invokevirtual 57	java/io/File:exists	()Z
    //   21: ifne +21 -> 42
    //   24: aload_2
    //   25: invokevirtual 60	java/io/File:mkdirs	()Z
    //   28: ifne +14 -> 42
    //   31: getstatic 34	com/whatsapp/Advanced:z	[Ljava/lang/String;
    //   34: iconst_1
    //   35: aaload
    //   36: invokestatic 46	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   39: goto -27 -> 12
    //   42: new 53	java/io/File
    //   45: dup
    //   46: aload_2
    //   47: aload_1
    //   48: invokespecial 63	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   51: astore_3
    //   52: new 65	java/io/PrintStream
    //   55: dup
    //   56: aload_3
    //   57: invokespecial 68	java/io/PrintStream:<init>	(Ljava/io/File;)V
    //   60: astore 4
    //   62: getstatic 72	com/whatsapp/App:ib	Landroid/content/ContentResolver;
    //   65: aload_0
    //   66: aconst_null
    //   67: aconst_null
    //   68: aconst_null
    //   69: aconst_null
    //   70: invokevirtual 78	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   73: astore 8
    //   75: aload 8
    //   77: astore 6
    //   79: aload 6
    //   81: ifnull +10 -> 91
    //   84: aload 6
    //   86: aload 4
    //   88: invokestatic 84	android/database/DatabaseUtils:dumpCursor	(Landroid/database/Cursor;Ljava/io/PrintStream;)V
    //   91: aload 6
    //   93: invokeinterface 89 1 0
    //   98: iconst_0
    //   99: ifeq -87 -> 12
    //   102: aconst_null
    //   103: invokeinterface 89 1 0
    //   108: goto -96 -> 12
    //   111: astore 7
    //   113: aconst_null
    //   114: astore 6
    //   116: new 91	java/lang/StringBuilder
    //   119: dup
    //   120: invokespecial 92	java/lang/StringBuilder:<init>	()V
    //   123: getstatic 34	com/whatsapp/Advanced:z	[Ljava/lang/String;
    //   126: iconst_0
    //   127: aaload
    //   128: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: aload 7
    //   133: invokevirtual 99	java/io/IOException:toString	()Ljava/lang/String;
    //   136: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   142: invokestatic 103	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   145: aload 6
    //   147: ifnull -135 -> 12
    //   150: aload 6
    //   152: invokeinterface 89 1 0
    //   157: goto -145 -> 12
    //   160: astore 5
    //   162: aconst_null
    //   163: astore 6
    //   165: aload 6
    //   167: ifnull +10 -> 177
    //   170: aload 6
    //   172: invokeinterface 89 1 0
    //   177: aload 5
    //   179: athrow
    //   180: astore 5
    //   182: goto -17 -> 165
    //   185: astore 7
    //   187: goto -71 -> 116
    //
    // Exception table:
    //   from	to	target	type
    //   52	75	111	java/io/IOException
    //   52	75	160	finally
    //   84	98	180	finally
    //   116	145	180	finally
    //   84	98	185	java/io/IOException
  }

  static void a(Advanced paramAdvanced, File paramFile, int paramInt)
  {
    paramAdvanced.a(paramFile, paramInt);
  }

  // ERROR //
  private void a(File paramFile, int paramInt)
  {
    // Byte code:
    //   0: getstatic 113	com/whatsapp/DialogToastListActivity:f	Z
    //   3: istore_3
    //   4: iload_2
    //   5: anewarray 53	java/io/File
    //   8: astore 4
    //   10: iconst_0
    //   11: istore 5
    //   13: iload 5
    //   15: aload 4
    //   17: arraylength
    //   18: if_icmpge +36 -> 54
    //   21: aload 4
    //   23: iload 5
    //   25: new 53	java/io/File
    //   28: dup
    //   29: aload_1
    //   30: getstatic 34	com/whatsapp/Advanced:z	[Ljava/lang/String;
    //   33: iconst_4
    //   34: aaload
    //   35: iload 5
    //   37: invokestatic 118	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   40: invokevirtual 122	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   43: invokespecial 63	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   46: aastore
    //   47: iinc 5 1
    //   50: iload_3
    //   51: ifeq -38 -> 13
    //   54: invokestatic 128	android/os/SystemClock:elapsedRealtime	()J
    //   57: pop2
    //   58: aload 4
    //   60: arraylength
    //   61: istore 8
    //   63: iconst_0
    //   64: istore 9
    //   66: iload 9
    //   68: iload 8
    //   70: if_icmpge +41 -> 111
    //   73: aload 4
    //   75: iload 9
    //   77: aaload
    //   78: astore 33
    //   80: invokestatic 128	android/os/SystemClock:elapsedRealtime	()J
    //   83: lstore 34
    //   85: aload 33
    //   87: invokevirtual 131	java/io/File:createNewFile	()Z
    //   90: pop
    //   91: invokestatic 128	android/os/SystemClock:elapsedRealtime	()J
    //   94: lload 34
    //   96: lsub
    //   97: ldc2_w 132
    //   100: lcmp
    //   101: ifle +3 -> 104
    //   104: iinc 9 1
    //   107: iload_3
    //   108: ifeq -42 -> 66
    //   111: invokestatic 128	android/os/SystemClock:elapsedRealtime	()J
    //   114: pop2
    //   115: aload 4
    //   117: arraylength
    //   118: istore 12
    //   120: iconst_0
    //   121: istore 13
    //   123: iload 13
    //   125: iload 12
    //   127: if_icmpge +75 -> 202
    //   130: aload 4
    //   132: iload 13
    //   134: aaload
    //   135: astore 22
    //   137: invokestatic 128	android/os/SystemClock:elapsedRealtime	()J
    //   140: lstore 23
    //   142: aconst_null
    //   143: astore 25
    //   145: new 135	java/io/ObjectOutputStream
    //   148: dup
    //   149: new 137	java/io/FileOutputStream
    //   152: dup
    //   153: aload 22
    //   155: invokespecial 138	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   158: invokespecial 141	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   161: astore 26
    //   163: aload 26
    //   165: aconst_null
    //   166: invokevirtual 145	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   169: aload 26
    //   171: ifnull +8 -> 179
    //   174: aload 26
    //   176: invokevirtual 146	java/io/ObjectOutputStream:close	()V
    //   179: invokestatic 128	android/os/SystemClock:elapsedRealtime	()J
    //   182: lload 23
    //   184: lsub
    //   185: ldc2_w 132
    //   188: lcmp
    //   189: ifle +3 -> 192
    //   192: iload 13
    //   194: iconst_1
    //   195: iadd
    //   196: istore 31
    //   198: iload_3
    //   199: ifeq +148 -> 347
    //   202: invokestatic 128	android/os/SystemClock:elapsedRealtime	()J
    //   205: pop2
    //   206: aload 4
    //   208: arraylength
    //   209: istore 16
    //   211: iconst_0
    //   212: istore 17
    //   214: iload 17
    //   216: iload 16
    //   218: if_icmpge +41 -> 259
    //   221: aload 4
    //   223: iload 17
    //   225: aaload
    //   226: astore 18
    //   228: invokestatic 128	android/os/SystemClock:elapsedRealtime	()J
    //   231: lstore 19
    //   233: aload 18
    //   235: invokevirtual 149	java/io/File:delete	()Z
    //   238: pop
    //   239: invokestatic 128	android/os/SystemClock:elapsedRealtime	()J
    //   242: lload 19
    //   244: lsub
    //   245: ldc2_w 132
    //   248: lcmp
    //   249: ifle +3 -> 252
    //   252: iinc 17 1
    //   255: iload_3
    //   256: ifeq -42 -> 214
    //   259: return
    //   260: astore 32
    //   262: aload 32
    //   264: invokestatic 152	com/whatsapp/g5:c	(Ljava/lang/Throwable;)V
    //   267: goto -88 -> 179
    //   270: astore 27
    //   272: aconst_null
    //   273: astore 26
    //   275: aload 27
    //   277: invokestatic 152	com/whatsapp/g5:c	(Ljava/lang/Throwable;)V
    //   280: aload 26
    //   282: ifnull -103 -> 179
    //   285: aload 26
    //   287: invokevirtual 146	java/io/ObjectOutputStream:close	()V
    //   290: goto -111 -> 179
    //   293: astore 30
    //   295: aload 30
    //   297: invokestatic 152	com/whatsapp/g5:c	(Ljava/lang/Throwable;)V
    //   300: goto -121 -> 179
    //   303: astore 28
    //   305: aload 25
    //   307: ifnull +8 -> 315
    //   310: aload 25
    //   312: invokevirtual 146	java/io/ObjectOutputStream:close	()V
    //   315: aload 28
    //   317: athrow
    //   318: astore 29
    //   320: aload 29
    //   322: invokestatic 152	com/whatsapp/g5:c	(Ljava/lang/Throwable;)V
    //   325: goto -10 -> 315
    //   328: astore 36
    //   330: goto -239 -> 91
    //   333: astore 28
    //   335: aload 26
    //   337: astore 25
    //   339: goto -34 -> 305
    //   342: astore 27
    //   344: goto -69 -> 275
    //   347: iload 31
    //   349: istore 13
    //   351: goto -228 -> 123
    //
    // Exception table:
    //   from	to	target	type
    //   174	179	260	java/io/IOException
    //   145	163	270	java/io/IOException
    //   285	290	293	java/io/IOException
    //   145	163	303	finally
    //   310	315	318	java/io/IOException
    //   85	91	328	java/io/IOException
    //   163	169	333	finally
    //   275	280	333	finally
    //   163	169	342	java/io/IOException
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903043);
    ((EditText)findViewById(2131558420)).setText(z[3]);
    EditText localEditText1 = (EditText)findViewById(2131558421);
    if (m.y >= m.a.length)
      m.y = 0;
    localEditText1.setText(Integer.toString(m.a[m.y]));
    ((TextView)findViewById(2131558423)).setText(Integer.toString(App.sb));
    ((Button)findViewById(2131558424)).setOnClickListener(new jg(this));
    ((Button)findViewById(2131558425)).setOnClickListener(new wg(this));
    ((Button)findViewById(2131558427)).setOnClickListener(new fh(this));
    ((Button)findViewById(2131558428)).setOnClickListener(new gh(this));
    ((Button)findViewById(2131558429)).setOnClickListener(new hh(this));
    ((Button)findViewById(2131558426)).setOnClickListener(new ih(this));
    ((Button)findViewById(2131558430)).setOnClickListener(new jh(this));
    ((Button)findViewById(2131558446)).setOnClickListener(new kh(this));
    ((Button)findViewById(2131558447)).setOnClickListener(new lh(this));
    ((Button)findViewById(2131558431)).setOnClickListener(new kg(this));
    ((Button)findViewById(2131558434)).setOnClickListener(new lg(this));
    ((Button)findViewById(2131558432)).setOnClickListener(new mg(this));
    ((Button)findViewById(2131558433)).setOnClickListener(new ng(this));
    ((Button)findViewById(2131558435)).setOnClickListener(new og(this));
    ((Button)findViewById(2131558436)).setOnClickListener(new qg(this));
    ((Button)findViewById(2131558437)).setOnClickListener(new rg(this));
    EditText localEditText2 = (EditText)findViewById(2131558438);
    ((Button)findViewById(2131558439)).setOnClickListener(new tg(this, localEditText2));
    ((Button)findViewById(2131558440)).setOnClickListener(new ug(this, localEditText2));
    ((Button)findViewById(2131558441)).setOnClickListener(new vg(this));
    ((Button)findViewById(2131558442)).setOnClickListener(new xg(this));
    ((Button)findViewById(2131558443)).setOnClickListener(new yg(this));
    ((Button)findViewById(2131558444)).setOnClickListener(new zg(this));
    ((Button)findViewById(2131558445)).setOnClickListener(new ah(this));
    ((Button)findViewById(2131558448)).setOnClickListener(new bh(this));
    ((Button)findViewById(2131558449)).setOnClickListener(new ch(this));
    ((Button)findViewById(2131558450)).setOnClickListener(new dh(this));
    ((Button)findViewById(2131558451)).setOnClickListener(new eh(this));
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.Advanced
 * JD-Core Version:    0.6.1
 */