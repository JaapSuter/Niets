package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.wallpaper.l;

public class ac extends AsyncTask<Object, Integer, xf>
{
  private static final String[] z;
  boolean a = false;
  boolean b;
  final VerifyMessageStoreActivity c;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "W\001\031ZPX\t\030TEU\013\031V\031R\021\bPSR\027".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "W\001\031ZPX\t\030TEU\013\031V\031G\005\002_SE".toCharArray();
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
        m = 54;
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
        m = 33;
        continue;
        m = 100;
        continue;
        m = 107;
        continue;
        m = 51;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 54;
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
      i3 = 33;
      continue;
      i3 = 100;
      continue;
      i3 = 107;
      continue;
      i3 = 51;
    }
  }

  public ac(VerifyMessageStoreActivity paramVerifyMessageStoreActivity, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.b = paramBoolean1;
  }

  static void a(ac paramac, Object[] paramArrayOfObject)
  {
    paramac.publishProgress(paramArrayOfObject);
  }

  // ERROR //
  protected xf a(Object[] paramArrayOfObject)
  {
    // Byte code:
    //   0: getstatic 56	com/whatsapp/xf:a	Lcom/whatsapp/xf;
    //   3: astore_2
    //   4: new 58	com/whatsapp/i6
    //   7: dup
    //   8: aload_0
    //   9: invokespecial 61	com/whatsapp/i6:<init>	(Lcom/whatsapp/ac;)V
    //   12: astore_3
    //   13: getstatic 66	com/whatsapp/App:z	Lcom/whatsapp/fq;
    //   16: aload_0
    //   17: getfield 43	com/whatsapp/ac:b	Z
    //   20: aload_3
    //   21: invokevirtual 71	com/whatsapp/fq:a	(ZLcom/whatsapp/rq;)Lcom/whatsapp/xf;
    //   24: astore 7
    //   26: aload 7
    //   28: astore 5
    //   30: iconst_1
    //   31: anewarray 73	java/lang/Integer
    //   34: astore 8
    //   36: aload 8
    //   38: iconst_0
    //   39: bipush 100
    //   41: invokestatic 77	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   44: aastore
    //   45: aload_0
    //   46: aload 8
    //   48: invokevirtual 48	com/whatsapp/ac:publishProgress	([Ljava/lang/Object;)V
    //   51: aload 5
    //   53: areturn
    //   54: astore 4
    //   56: aload_2
    //   57: astore 5
    //   59: aload 4
    //   61: astore 6
    //   63: aload 6
    //   65: invokestatic 83	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   68: aload_0
    //   69: iconst_1
    //   70: putfield 41	com/whatsapp/ac:a	Z
    //   73: goto -22 -> 51
    //   76: astore 6
    //   78: goto -15 -> 63
    //
    // Exception table:
    //   from	to	target	type
    //   13	26	54	java/io/IOException
    //   30	51	76	java/io/IOException
  }

  protected void a(xf paramxf)
  {
    if (VerifyMessageStoreActivity.j != null)
    {
      this.c.removeDialog(100);
      VerifyMessageStoreActivity.j = null;
    }
    App.z.a();
    if (paramxf != xf.a)
    {
      g5.b(z[0]);
      this.c.d();
      if (!this.c.k)
        App.m(App.Mb);
      App.z.a(null);
      App.B();
      App.Mb.O();
      if (!DialogToastListActivity.f);
    }
    else
    {
      g5.b(z[1]);
    }
    if (!this.c.k)
      MessageService.a(App.Mb);
    if ((this.c.k) && (this.b))
      l.e();
    this.c.e();
    this.c.f();
  }

  public void a(Integer[] paramArrayOfInteger)
  {
    if (VerifyMessageStoreActivity.j != null)
      VerifyMessageStoreActivity.j.setProgress(paramArrayOfInteger[0].intValue());
  }

  protected void onPreExecute()
  {
    if ((!this.c.isFinishing()) && ((!this.c.k) || (this.b)))
      this.c.showDialog(100);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ac
 * JD-Core Version:    0.6.1
 */