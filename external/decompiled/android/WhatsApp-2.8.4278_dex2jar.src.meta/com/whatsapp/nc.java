package com.whatsapp;

import android.content.ContentResolver;
import android.os.Handler;
import android.os.Message;
import android.provider.ContactsContract.Contacts;

final class nc extends Handler
{
  private static final String z;

  static
  {
    char[] arrayOfChar = "\nF}#w\023A|fg\004Gefj\013".toCharArray();
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
      m = 5;
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
      m = 101;
      continue;
      m = 36;
      continue;
      m = 14;
      continue;
      m = 70;
    }
  }

  public void handleMessage(Message paramMessage)
  {
    g5.b(z);
    App.Mb.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, App.lc);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.nc
 * JD-Core Version:    0.6.1
 */