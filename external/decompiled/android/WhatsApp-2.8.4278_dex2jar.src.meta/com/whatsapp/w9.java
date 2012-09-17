package com.whatsapp;

class w9 extends Thread
{
  final q5 a;

  w9(q5 paramq5)
  {
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: getstatic 22	com/whatsapp/g5:n	I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield 10	com/whatsapp/w9:a	Lcom/whatsapp/q5;
    //   8: getfield 28	com/whatsapp/q5:g	Lcom/whatsapp/s5;
    //   11: invokestatic 33	com/whatsapp/s5:a	(Lcom/whatsapp/s5;)Ljava/util/Stack;
    //   14: invokevirtual 39	java/util/Stack:size	()I
    //   17: ifne +34 -> 51
    //   20: aload_0
    //   21: getfield 10	com/whatsapp/w9:a	Lcom/whatsapp/q5;
    //   24: getfield 28	com/whatsapp/q5:g	Lcom/whatsapp/s5;
    //   27: invokestatic 33	com/whatsapp/s5:a	(Lcom/whatsapp/s5;)Ljava/util/Stack;
    //   30: astore 12
    //   32: aload 12
    //   34: monitorenter
    //   35: aload_0
    //   36: getfield 10	com/whatsapp/w9:a	Lcom/whatsapp/q5;
    //   39: getfield 28	com/whatsapp/q5:g	Lcom/whatsapp/s5;
    //   42: invokestatic 33	com/whatsapp/s5:a	(Lcom/whatsapp/s5;)Ljava/util/Stack;
    //   45: invokevirtual 44	java/lang/Object:wait	()V
    //   48: aload 12
    //   50: monitorexit
    //   51: aload_0
    //   52: getfield 10	com/whatsapp/w9:a	Lcom/whatsapp/q5;
    //   55: getfield 28	com/whatsapp/q5:g	Lcom/whatsapp/s5;
    //   58: invokestatic 33	com/whatsapp/s5:a	(Lcom/whatsapp/s5;)Ljava/util/Stack;
    //   61: invokevirtual 39	java/util/Stack:size	()I
    //   64: ifeq +170 -> 234
    //   67: aload_0
    //   68: getfield 10	com/whatsapp/w9:a	Lcom/whatsapp/q5;
    //   71: getfield 28	com/whatsapp/q5:g	Lcom/whatsapp/s5;
    //   74: invokestatic 33	com/whatsapp/s5:a	(Lcom/whatsapp/s5;)Ljava/util/Stack;
    //   77: astore 4
    //   79: aload 4
    //   81: monitorenter
    //   82: aload_0
    //   83: getfield 10	com/whatsapp/w9:a	Lcom/whatsapp/q5;
    //   86: getfield 28	com/whatsapp/q5:g	Lcom/whatsapp/s5;
    //   89: invokestatic 33	com/whatsapp/s5:a	(Lcom/whatsapp/s5;)Ljava/util/Stack;
    //   92: invokevirtual 48	java/util/Stack:pop	()Ljava/lang/Object;
    //   95: checkcast 50	com/whatsapp/t5
    //   98: astore 6
    //   100: aload 4
    //   102: monitorexit
    //   103: aload_0
    //   104: getfield 10	com/whatsapp/w9:a	Lcom/whatsapp/q5;
    //   107: aload 6
    //   109: invokestatic 53	com/whatsapp/q5:a	(Lcom/whatsapp/q5;Lcom/whatsapp/t5;)Landroid/graphics/Bitmap;
    //   112: astore 7
    //   114: aload 6
    //   116: getfield 57	com/whatsapp/t5:d	Lcom/whatsapp/u5;
    //   119: ifnonnull +40 -> 159
    //   122: aload_0
    //   123: getfield 10	com/whatsapp/w9:a	Lcom/whatsapp/q5;
    //   126: invokestatic 60	com/whatsapp/q5:a	(Lcom/whatsapp/q5;)Ljava/util/HashMap;
    //   129: astore 9
    //   131: aload 9
    //   133: monitorenter
    //   134: aload_0
    //   135: getfield 10	com/whatsapp/w9:a	Lcom/whatsapp/q5;
    //   138: invokestatic 60	com/whatsapp/q5:a	(Lcom/whatsapp/q5;)Ljava/util/HashMap;
    //   141: aload 6
    //   143: getfield 63	com/whatsapp/t5:a	Ljava/lang/String;
    //   146: aload 7
    //   148: invokevirtual 69	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   151: pop
    //   152: aload 9
    //   154: monitorexit
    //   155: iload_1
    //   156: ifeq +15 -> 171
    //   159: aload 6
    //   161: getfield 57	com/whatsapp/t5:d	Lcom/whatsapp/u5;
    //   164: aload 7
    //   166: invokeinterface 74 2 0
    //   171: aload 6
    //   173: getfield 78	com/whatsapp/t5:c	Landroid/widget/ImageView;
    //   176: invokevirtual 83	android/widget/ImageView:getTag	()Ljava/lang/Object;
    //   179: checkcast 85	java/lang/String
    //   182: aload 6
    //   184: getfield 63	com/whatsapp/t5:a	Ljava/lang/String;
    //   187: invokevirtual 89	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   190: ifeq +44 -> 234
    //   193: new 91	com/whatsapp/r5
    //   196: dup
    //   197: aload_0
    //   198: getfield 10	com/whatsapp/w9:a	Lcom/whatsapp/q5;
    //   201: aload 7
    //   203: aload 6
    //   205: getfield 78	com/whatsapp/t5:c	Landroid/widget/ImageView;
    //   208: aload 6
    //   210: getfield 63	com/whatsapp/t5:a	Ljava/lang/String;
    //   213: invokespecial 94	com/whatsapp/r5:<init>	(Lcom/whatsapp/q5;Landroid/graphics/Bitmap;Landroid/widget/ImageView;Ljava/lang/String;)V
    //   216: astore 8
    //   218: aload 6
    //   220: getfield 78	com/whatsapp/t5:c	Landroid/widget/ImageView;
    //   223: invokevirtual 98	android/widget/ImageView:getContext	()Landroid/content/Context;
    //   226: checkcast 100	android/app/Activity
    //   229: aload 8
    //   231: invokevirtual 104	android/app/Activity:runOnUiThread	(Ljava/lang/Runnable;)V
    //   234: invokestatic 108	java/lang/Thread:interrupted	()Z
    //   237: istore_3
    //   238: iload_3
    //   239: ifeq -235 -> 4
    //   242: return
    //   243: astore 13
    //   245: aload 12
    //   247: monitorexit
    //   248: aload 13
    //   250: athrow
    //   251: astore_2
    //   252: goto -10 -> 242
    //   255: astore 5
    //   257: aload 4
    //   259: monitorexit
    //   260: aload 5
    //   262: athrow
    //   263: astore 10
    //   265: aload 9
    //   267: monitorexit
    //   268: aload 10
    //   270: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   35	51	243	finally
    //   245	248	243	finally
    //   4	35	251	java/lang/InterruptedException
    //   51	82	251	java/lang/InterruptedException
    //   103	134	251	java/lang/InterruptedException
    //   159	238	251	java/lang/InterruptedException
    //   248	251	251	java/lang/InterruptedException
    //   260	263	251	java/lang/InterruptedException
    //   268	271	251	java/lang/InterruptedException
    //   82	103	255	finally
    //   257	260	255	finally
    //   134	155	263	finally
    //   265	268	263	finally
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.w9
 * JD-Core Version:    0.6.1
 */