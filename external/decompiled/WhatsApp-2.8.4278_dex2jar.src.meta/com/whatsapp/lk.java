package com.whatsapp;

import android.os.Environment;
import android.os.Handler;
import android.provider.ContactsContract.CommonDataKinds.Phone;

class lk
  implements Runnable
{
  private static final String[] z;
  final boolean a;
  final boolean b;
  final ContactPicker c;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "t\031\024Lvw_\017Zg".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "i\036\016Lga\025".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 19;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[j] = (char)(m ^ k);
        j++;
        break;
        m = 4;
        continue;
        m = 113;
        continue;
        m = 123;
        continue;
        m = 34;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 19;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i1] = (char)(i3 ^ i2);
      i1++;
      break;
      i3 = 4;
      continue;
      i3 = 113;
      continue;
      i3 = 123;
      continue;
      i3 = 34;
    }
  }

  lk(ContactPicker paramContactPicker, boolean paramBoolean1, boolean paramBoolean2)
  {
  }

  public void run()
  {
    if (App.f >= 1)
      ContactPicker.n(this.c);
    if (App.f == 2)
    {
      String str = Environment.getExternalStorageState();
      if (z[1].equals(str))
        Advanced.a(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, z[0]);
    }
    int i = tp.a(this.a);
    if (App.f >= 1)
      ContactPicker.n(this.c);
    ContactPicker.q(this.c).post(new mk(this, i));
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.lk
 * JD-Core Version:    0.6.1
 */