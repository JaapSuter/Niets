package com.whatsapp;

import org.apache.http.entity.ContentProducer;
import org.apache.http.entity.EntityTemplate;

class hab extends EntityTemplate
{
  long a;
  final at b;

  public hab(at paramat, ContentProducer paramContentProducer, long paramLong)
  {
    super(paramContentProducer);
    this.a = paramLong;
  }

  public long getContentLength()
  {
    return this.a;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.hab
 * JD-Core Version:    0.6.1
 */