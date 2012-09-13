package org.apache.commons.codec.net;

import org.apache.commons.codec.DecoderException;

class Utils
{
  static int digit16(byte paramByte)
    throws DecoderException
  {
    int i = Character.digit((char)paramByte, 16);
    if (i == -1)
      throw new DecoderException("Invalid URL encoding: not a valid digit (radix 16): " + paramByte);
    return i;
  }
}