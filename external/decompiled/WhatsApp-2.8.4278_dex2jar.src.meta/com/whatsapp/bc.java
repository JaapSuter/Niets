package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.messaging.MessageService;

public class bc extends AsyncTask<Object, Integer, xf>
{
  private static final String[] z;
  boolean a = false;
  boolean b = false;
  boolean c;
  final VerifyMessageStoreListActivity d;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "N\013,\b\023A\003-\006\006L\001,\004\031Q\035*N\023Y\0072\004\021".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "N\013,\b\023A\003-\006\006L\001,\004\031Q\035*N\006M\r=\004\006K".toCharArray();
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
        m = 117;
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
        m = 56;
        continue;
        m = 110;
        continue;
        m = 94;
        continue;
        m = 97;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 117;
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
      i3 = 56;
      continue;
      i3 = 110;
      continue;
      i3 = 94;
      continue;
      i3 = 97;
    }
  }

  public bc(VerifyMessageStoreListActivity paramVerifyMessageStoreListActivity, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.c = paramBoolean1;
  }

  static void a(bc parambc, Object[] paramArrayOfObject)
  {
    parambc.publishProgress(paramArrayOfObject);
  }

  // ERROR //
  protected xf a(Object[] paramArrayOfObject)
  {
    // Byte code:
    //   0: getstatic 59	com/whatsapp/xf:a	Lcom/whatsapp/xf;
    //   3: astore_2
    //   4: new 61	com/whatsapp/u6
    //   7: dup
    //   8: aload_0
    //   9: invokespecial 64	com/whatsapp/u6:<init>	(Lcom/whatsapp/bc;)V
    //   12: astore_3
    //   13: getstatic 69	com/whatsapp/App:z	Lcom/whatsapp/fq;
    //   16: aload_0
    //   17: getfield 46	com/whatsapp/bc:c	Z
    //   20: aload_3
    //   21: invokevirtual 74	com/whatsapp/fq:a	(ZLcom/whatsapp/rq;)Lcom/whatsapp/xf;
    //   24: astore 7
    //   26: aload 7
    //   28: astore 5
    //   30: iconst_1
    //   31: anewarray 76	java/lang/Integer
    //   34: astore 8
    //   36: aload 8
    //   38: iconst_0
    //   39: bipush 100
    //   41: invokestatic 80	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   44: aastore
    //   45: aload_0
    //   46: aload 8
    //   48: invokevirtual 51	com/whatsapp/bc:publishProgress	([Ljava/lang/Object;)V
    //   51: aload 5
    //   53: areturn
    //   54: astore 4
    //   56: aload_2
    //   57: astore 5
    //   59: aload 4
    //   61: astore 6
    //   63: aload 6
    //   65: invokestatic 85	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   68: aload_0
    //   69: iconst_1
    //   70: putfield 42	com/whatsapp/bc:a	Z
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
    this.d.removeDialog(100);
    App.z.a();
    if (paramxf != xf.a)
    {
      g5.b(z[1]);
      this.d.c();
      if (!this.b)
        App.m(App.Mb);
      App.z.a(null);
      App.B();
      App.Mb.O();
      if (!DialogToastListActivity.f);
    }
    else
    {
      g5.b(z[0]);
    }
    MessageService.a(App.Mb);
    this.d.d();
    this.d.e();
  }

  public void a(Integer[] paramArrayOfInteger)
  {
    VerifyMessageStoreListActivity.g.setProgress(paramArrayOfInteger[0].intValue());
  }

  protected void onPreExecute()
  {
    if (!this.d.isFinishing())
      this.d.showDialog(100);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.bc
 * JD-Core Version:    0.6.1
 */