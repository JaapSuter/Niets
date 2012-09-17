package com.whatsapp;

import android.media.MediaPlayer;
import android.view.View.OnClickListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

class n1
  implements View.OnClickListener
{
  private static final String z;
  final RecordAudio a;

  static
  {
    char[] arrayOfChar = ";\006pWu!\002ua`$".toCharArray();
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
      m = 5;
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
      m = 83;
      continue;
      m = 103;
      continue;
      m = 3;
      continue;
      m = 8;
    }
  }

  n1(RecordAudio paramRecordAudio)
  {
  }

  private void a()
  {
    try
    {
      j5.a(this.a, this.a, this.a.s, new File(RecordAudio.d(this.a)), (byte)2, j5.a(2));
      if ((this.a.j != null) && (this.a.j.isPlaying()))
        this.a.j.stop();
      this.a.finish();
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      while (true)
        g5.d(localFileNotFoundException);
    }
    catch (IOException localIOException)
    {
      while (true)
        g5.d(localIOException);
    }
  }

  // ERROR //
  public void onClick(android.view.View paramView)
  {
    // Byte code:
    //   0: getstatic 94	com/whatsapp/DialogToastListActivity:f	Z
    //   3: istore_2
    //   4: aload_0
    //   5: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   8: getfield 97	com/whatsapp/RecordAudio:f	I
    //   11: tableswitch	default:+37 -> 48, 0:+52->63, 1:+163->174, 2:+182->193, 3:+256->267, 4:+288->299, 5:+306->317
    //   49: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   52: aload_0
    //   53: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   56: getfield 97	com/whatsapp/RecordAudio:f	I
    //   59: invokevirtual 101	com/whatsapp/RecordAudio:b	(I)V
    //   62: return
    //   63: aload_0
    //   64: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   67: invokestatic 105	com/whatsapp/RecordAudio:c	(Lcom/whatsapp/RecordAudio;)Z
    //   70: ifeq +11 -> 81
    //   73: aload_0
    //   74: invokespecial 107	com/whatsapp/n1:a	()V
    //   77: iload_2
    //   78: ifeq -30 -> 48
    //   81: aload_0
    //   82: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   85: getfield 111	com/whatsapp/RecordAudio:p	Landroid/os/Handler;
    //   88: iconst_0
    //   89: invokevirtual 117	android/os/Handler:sendEmptyMessage	(I)Z
    //   92: pop
    //   93: aload_0
    //   94: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   97: getfield 121	com/whatsapp/RecordAudio:q	Landroid/widget/ProgressBar;
    //   100: ldc 122
    //   102: invokevirtual 127	android/widget/ProgressBar:setMax	(I)V
    //   105: aload_0
    //   106: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   109: invokestatic 133	java/lang/System:currentTimeMillis	()J
    //   112: putfield 137	com/whatsapp/RecordAudio:g	J
    //   115: aload_0
    //   116: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   119: getfield 141	com/whatsapp/RecordAudio:i	Landroid/media/MediaRecorder;
    //   122: invokevirtual 146	android/media/MediaRecorder:prepare	()V
    //   125: aload_0
    //   126: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   129: getfield 141	com/whatsapp/RecordAudio:i	Landroid/media/MediaRecorder;
    //   132: invokevirtual 149	android/media/MediaRecorder:start	()V
    //   135: aload_0
    //   136: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   139: iconst_1
    //   140: putfield 97	com/whatsapp/RecordAudio:f	I
    //   143: goto -95 -> 48
    //   146: astore 13
    //   148: aload 13
    //   150: invokestatic 82	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   153: aload_0
    //   154: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   157: ldc 150
    //   159: new 152	com/whatsapp/o1
    //   162: dup
    //   163: aload_0
    //   164: invokespecial 155	com/whatsapp/o1:<init>	(Lcom/whatsapp/n1;)V
    //   167: invokevirtual 158	com/whatsapp/RecordAudio:a	(ILcom/whatsapp/nr;)V
    //   170: iload_2
    //   171: ifeq -123 -> 48
    //   174: aload_0
    //   175: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   178: invokevirtual 159	com/whatsapp/RecordAudio:a	()V
    //   181: aload_0
    //   182: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   185: iconst_2
    //   186: putfield 97	com/whatsapp/RecordAudio:f	I
    //   189: iload_2
    //   190: ifeq -142 -> 48
    //   193: new 161	com/whatsapp/MediaData
    //   196: dup
    //   197: invokespecial 162	com/whatsapp/MediaData:<init>	()V
    //   200: aload_0
    //   201: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   204: getfield 166	com/whatsapp/RecordAudio:o	Ljava/io/File;
    //   207: putfield 169	com/whatsapp/MediaData:file	Ljava/io/File;
    //   210: new 171	android/content/Intent
    //   213: dup
    //   214: invokespecial 172	android/content/Intent:<init>	()V
    //   217: astore 8
    //   219: aload 8
    //   221: aload_0
    //   222: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   225: getfield 166	com/whatsapp/RecordAudio:o	Ljava/io/File;
    //   228: invokestatic 178	android/net/Uri:fromFile	(Ljava/io/File;)Landroid/net/Uri;
    //   231: invokevirtual 182	android/content/Intent:setData	(Landroid/net/Uri;)Landroid/content/Intent;
    //   234: pop
    //   235: aload 8
    //   237: getstatic 30	com/whatsapp/n1:z	Ljava/lang/String;
    //   240: iconst_0
    //   241: invokevirtual 186	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   244: pop
    //   245: aload_0
    //   246: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   249: bipush 255
    //   251: aload 8
    //   253: invokevirtual 190	com/whatsapp/RecordAudio:setResult	(ILandroid/content/Intent;)V
    //   256: aload_0
    //   257: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   260: invokevirtual 77	com/whatsapp/RecordAudio:finish	()V
    //   263: iload_2
    //   264: ifeq -216 -> 48
    //   267: aload_0
    //   268: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   271: getfield 65	com/whatsapp/RecordAudio:j	Landroid/media/MediaPlayer;
    //   274: invokevirtual 74	android/media/MediaPlayer:stop	()V
    //   277: aload_0
    //   278: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   281: getfield 65	com/whatsapp/RecordAudio:j	Landroid/media/MediaPlayer;
    //   284: invokevirtual 191	android/media/MediaPlayer:prepare	()V
    //   287: aload_0
    //   288: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   291: iconst_2
    //   292: putfield 97	com/whatsapp/RecordAudio:f	I
    //   295: iload_2
    //   296: ifeq -248 -> 48
    //   299: aload_0
    //   300: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   303: invokestatic 105	com/whatsapp/RecordAudio:c	(Lcom/whatsapp/RecordAudio;)Z
    //   306: ifeq -258 -> 48
    //   309: aload_0
    //   310: invokespecial 107	com/whatsapp/n1:a	()V
    //   313: iload_2
    //   314: ifeq -266 -> 48
    //   317: aload_0
    //   318: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   321: invokestatic 105	com/whatsapp/RecordAudio:c	(Lcom/whatsapp/RecordAudio;)Z
    //   324: ifeq -276 -> 48
    //   327: aload_0
    //   328: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   331: aload_0
    //   332: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   335: aload_0
    //   336: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   339: getfield 44	com/whatsapp/RecordAudio:s	Ljava/lang/String;
    //   342: new 46	java/io/File
    //   345: dup
    //   346: aload_0
    //   347: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   350: invokestatic 50	com/whatsapp/RecordAudio:d	(Lcom/whatsapp/RecordAudio;)Ljava/lang/String;
    //   353: invokespecial 53	java/io/File:<init>	(Ljava/lang/String;)V
    //   356: iconst_2
    //   357: iconst_2
    //   358: invokestatic 58	com/whatsapp/j5:a	(I)Ljava/lang/String;
    //   361: invokestatic 61	com/whatsapp/j5:a	(Landroid/app/Activity;Lcom/whatsapp/lr;Ljava/lang/String;Ljava/io/File;BLjava/lang/String;)Z
    //   364: pop
    //   365: aload_0
    //   366: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   369: invokevirtual 77	com/whatsapp/RecordAudio:finish	()V
    //   372: goto -324 -> 48
    //   375: astore 12
    //   377: aload 12
    //   379: invokestatic 82	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   382: goto -257 -> 125
    //   385: astore 7
    //   387: aload 7
    //   389: invokestatic 82	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   392: goto -105 -> 287
    //   395: astore 6
    //   397: aload 6
    //   399: invokestatic 82	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   402: aload_0
    //   403: getfield 33	com/whatsapp/n1:a	Lcom/whatsapp/RecordAudio;
    //   406: ldc 192
    //   408: new 194	com/whatsapp/p1
    //   411: dup
    //   412: aload_0
    //   413: invokespecial 195	com/whatsapp/p1:<init>	(Lcom/whatsapp/n1;)V
    //   416: invokevirtual 158	com/whatsapp/RecordAudio:a	(ILcom/whatsapp/nr;)V
    //   419: goto -132 -> 287
    //   422: astore 4
    //   424: aload 4
    //   426: invokestatic 82	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   429: goto -64 -> 365
    //   432: astore_3
    //   433: aload_3
    //   434: invokestatic 82	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   437: goto -72 -> 365
    //
    // Exception table:
    //   from	to	target	type
    //   125	143	146	java/lang/RuntimeException
    //   115	125	375	java/io/IOException
    //   277	287	385	java/lang/IllegalStateException
    //   277	287	395	java/io/IOException
    //   327	365	422	java/io/FileNotFoundException
    //   327	365	432	java/io/IOException
  }
}