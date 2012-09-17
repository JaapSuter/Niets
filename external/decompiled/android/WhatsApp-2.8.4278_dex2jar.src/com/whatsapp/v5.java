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