package com.whatsapp;

public class v5
{
  public static String a(long paramLong)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    long l1 = paramLong / 60L;
    long l2 = paramLong % 60L;
    localStringBuilder.append(l1);
    localStringBuilder.append(":");
    if (l2 < 10L)
      localStringBuilder.append("0");
    localStringBuilder.append(l2);
    return localStringBuilder.toString();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.v5
 * JD-Core Version:    0.6.1
 */