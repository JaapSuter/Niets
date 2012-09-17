package com.whatsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ResetPhoto extends Activity
{
  private static final String z;

  static
  {
    char[] arrayOfChar = "lh\0357zv~6".toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    if (i <= j)
    {
      z = new String(arrayOfChar).intern();
      return;
    }
    int k = arrayOfChar[j];
    int m;
    switch (j % 5)
    {
    default:
      m = 31;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar[j] = (char)(m ^ k);
      j++;
      break;
      m = 5;
      continue;
      m = 27;
      continue;
      m = 66;
      continue;
      m = 69;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Intent localIntent = new Intent();
    localIntent.putExtra(z, true);
    setResult(-1, localIntent);
    finish();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ResetPhoto
 * JD-Core Version:    0.6.1
 */