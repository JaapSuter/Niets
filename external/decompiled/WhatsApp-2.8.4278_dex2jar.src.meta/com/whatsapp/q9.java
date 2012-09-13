package com.whatsapp;

import java.util.ArrayList;

class q9 extends Thread
{
  boolean a = true;

  public void a()
  {
    this.a = true;
    synchronized (MediaGalleryImageView.lock)
    {
      MediaGalleryImageView.taskList.clear();
      return;
    }
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: getstatic 37	com/whatsapp/DialogToastListActivity:f	Z
    //   3: istore_1
    //   4: aload_0
    //   5: getfield 12	com/whatsapp/q9:a	Z
    //   8: ifne +78 -> 86
    //   11: ldc2_w 38
    //   14: invokestatic 43	java/lang/Thread:sleep	(J)V
    //   17: getstatic 22	com/whatsapp/MediaGalleryImageView:taskList	Ljava/util/ArrayList;
    //   20: invokevirtual 47	java/util/ArrayList:size	()I
    //   23: ifle -19 -> 4
    //   26: aload_0
    //   27: getfield 12	com/whatsapp/q9:a	Z
    //   30: ifne -26 -> 4
    //   33: getstatic 53	com/whatsapp/MediaGallery:q	I
    //   36: ifne -32 -> 4
    //   39: aconst_null
    //   40: astore_3
    //   41: getstatic 18	com/whatsapp/MediaGalleryImageView:lock	Ljava/lang/Object;
    //   44: astore 6
    //   46: aload 6
    //   48: monitorenter
    //   49: getstatic 22	com/whatsapp/MediaGalleryImageView:taskList	Ljava/util/ArrayList;
    //   52: bipush 255
    //   54: getstatic 22	com/whatsapp/MediaGalleryImageView:taskList	Ljava/util/ArrayList;
    //   57: invokevirtual 47	java/util/ArrayList:size	()I
    //   60: iadd
    //   61: invokevirtual 57	java/util/ArrayList:remove	(I)Ljava/lang/Object;
    //   64: checkcast 59	com/whatsapp/tw
    //   67: astore 5
    //   69: aload 6
    //   71: monitorexit
    //   72: aload 5
    //   74: ifnull +8 -> 82
    //   77: aload 5
    //   79: invokevirtual 61	com/whatsapp/tw:run	()V
    //   82: iload_1
    //   83: ifeq -66 -> 17
    //   86: return
    //   87: astore 7
    //   89: aload 6
    //   91: monitorexit
    //   92: aload 7
    //   94: athrow
    //   95: astore 4
    //   97: aload 4
    //   99: invokestatic 67	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   102: aload_3
    //   103: astore 5
    //   105: goto -33 -> 72
    //   108: astore_2
    //   109: goto -92 -> 17
    //   112: astore 8
    //   114: aload 5
    //   116: astore_3
    //   117: aload 8
    //   119: astore 7
    //   121: goto -32 -> 89
    //
    // Exception table:
    //   from	to	target	type
    //   49	69	87	finally
    //   89	92	87	finally
    //   41	49	95	java/lang/IndexOutOfBoundsException
    //   92	95	95	java/lang/IndexOutOfBoundsException
    //   11	17	108	java/lang/InterruptedException
    //   69	72	112	finally
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.q9
 * JD-Core Version:    0.6.1
 */