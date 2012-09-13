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