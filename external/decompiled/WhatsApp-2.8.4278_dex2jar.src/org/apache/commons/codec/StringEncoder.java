package org.apache.commons.codec;

public abstract interface StringEncoder extends Encoder
{
  public abstract String encode(String paramString)
    throws EncoderException;
}