package com.whatsapp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.ContentProducer;

class bt
  implements ContentProducer
{
  final String a;
  final String b;
  final at c;

  bt(at paramat, String paramString1, String paramString2)
  {
  }

  public void writeTo(OutputStream paramOutputStream)
    throws IOException
  {
    boolean bool = DialogToastListActivity.f;
    byte[] arrayOfByte = new byte[this.c.d];
    at.a(paramOutputStream, this.a);
    FileInputStream localFileInputStream = new FileInputStream(this.c.b);
    localFileInputStream.skip(this.c.c);
    int i = 0 + this.c.c;
    int j;
    do
    {
      j = localFileInputStream.read(arrayOfByte, 0, this.c.d);
      if (j >= 0)
      {
        i += j;
        paramOutputStream.write(arrayOfByte, 0, j);
        paramOutputStream.flush();
        if (this.c.e != null)
          this.c.e.a(i);
      }
      if (Thread.currentThread().isInterrupted())
      {
        Thread.currentThread().interrupt();
        localFileInputStream.close();
        paramOutputStream.close();
        if (!bool)
          break;
      }
    }
    while (j >= 0);
    if (!Thread.currentThread().isInterrupted())
    {
      localFileInputStream.close();
      at.a(paramOutputStream, this.b);
    }
  }
}