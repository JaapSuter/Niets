package com.whatsapp.billing;

import android.content.Context;

public class m
{
  private static k a;

  static k a()
  {
    return a;
  }

  public static void a(Context paramContext, b paramb, String paramString1, String paramString2, long paramLong, String paramString3)
  {
    new Thread(new n(paramContext, paramString2, paramString1, paramb, paramLong, paramString3)).start();
  }
}