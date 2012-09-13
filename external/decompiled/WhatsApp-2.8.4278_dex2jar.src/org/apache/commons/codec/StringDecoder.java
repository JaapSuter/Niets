package org.apache.commons.codec;

public abstract interface StringDecoder extends Decoder
{
  public abstract String decode(String paramString)
    throws DecoderException;
}