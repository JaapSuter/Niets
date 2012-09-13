package org.apache.commons.codec.language;

import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

final class SoundexUtils
{
  static String clean(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
      return paramString;
    int i = paramString.length();
    char[] arrayOfChar = new char[i];
    int j = 0;
    int k = 0;
    label27: int m;
    if (j < i)
    {
      if (!Character.isLetter(paramString.charAt(j)))
        break label106;
      m = k + 1;
      arrayOfChar[k] = paramString.charAt(j);
    }
    while (true)
    {
      j++;
      k = m;
      break label27;
      if (k == i)
      {
        paramString = paramString.toUpperCase(Locale.ENGLISH);
        break;
      }
      paramString = new String(arrayOfChar, 0, k).toUpperCase(Locale.ENGLISH);
      break;
      label106: m = k;
    }
  }

  static int difference(StringEncoder paramStringEncoder, String paramString1, String paramString2)
    throws EncoderException
  {
    return differenceEncoded(paramStringEncoder.encode(paramString1), paramStringEncoder.encode(paramString2));
  }

  static int differenceEncoded(String paramString1, String paramString2)
  {
    int i;
    if ((paramString1 == null) || (paramString2 == null))
      i = 0;
    while (true)
    {
      return i;
      int j = Math.min(paramString1.length(), paramString2.length());
      i = 0;
      for (int k = 0; k < j; k++)
        if (paramString1.charAt(k) == paramString2.charAt(k))
          i++;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     org.apache.commons.codec.language.SoundexUtils
 * JD-Core Version:    0.6.1
 */