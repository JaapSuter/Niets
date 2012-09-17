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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     org.apache.commons.codec.net.Utils
 * JD-Core Version:    0.6.1
 */