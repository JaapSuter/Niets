package com.whatsapp;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.View.OnClickListener;

class rs
  implements View.OnClickListener
{
  private static final String[] z;
  final EULA a;

  static
  {
    String[] arrayOfString = new String[5];
    char[] arrayOfChar1 = "FageZ@qgh��Ouy)\033F`|k\007H4~j\036M{|j".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    char[] arrayOfChar4;
    int i9;
    char[] arrayOfChar5;
    int i13;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "@{f*\002Kuw\024Sd%V\020D}xp\020QDck\033F:ya\006F`xp\024Wq".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "FageZ@qgh��Ouy)\033F`|k\007H4eq\031O".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label364;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "Qqlm\006Wqy+\020Vxj+\024@wnt\001\fpnr\034@qb`ZFfyk\007\003".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label452;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "Qqlm\006Wqy+\020Vxj+\024@wnt\001".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label540;
        arrayOfString[4] = new String(arrayOfChar5).intern();
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
        m = 117;
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
        m = 35;
        continue;
        m = 20;
        continue;
        m = 11;
        continue;
        m = 4;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 117;
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
      i3 = 35;
      continue;
      i3 = 20;
      continue;
      i3 = 11;
      continue;
      i3 = 4;
    }
    label364: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 117;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i5] = (char)(i7 ^ i6);
      i5++;
      break;
      i7 = 35;
      continue;
      i7 = 20;
      continue;
      i7 = 11;
      continue;
      i7 = 4;
    }
    label452: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 117;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i9] = (char)(i11 ^ i10);
      i9++;
      break;
      i11 = 35;
      continue;
      i11 = 20;
      continue;
      i11 = 11;
      continue;
      i11 = 4;
    }
    label540: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 117;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i13] = (char)(i15 ^ i14);
      i13++;
      break;
      i15 = 35;
      continue;
      i15 = 20;
      continue;
      i15 = 11;
      continue;
      i15 = 4;
    }
  }

  rs(EULA paramEULA)
  {
  }

  public void onClick(View paramView)
  {
    boolean bool = DialogToastListActivity.f;
    int i = App.db.getNetworkType();
    NetworkInfo localNetworkInfo = App.eb.getActiveNetworkInfo();
    int j;
    if ((localNetworkInfo != null) && (localNetworkInfo.isConnected()))
      j = 1;
    try
    {
      while (true)
      {
        String str2 = App.db.getDeviceId();
        str1 = str2;
        if (str1 == null)
          str1 = ((App)this.a.getApplication()).G();
        if (App.db == null)
        {
          g5.d(z[2]);
          this.a.showDialog(2);
          if (!bool);
        }
        else if ((i == 0) && (j == 0))
        {
          g5.d(z[0]);
          this.a.showDialog(2);
          if (!bool);
        }
        else if (str1 == null)
        {
          this.a.showDialog(3);
          if (!bool);
        }
        else
        {
          g5.b(z[4]);
          App.a(this.a, 1);
          Intent localIntent = new Intent(this.a, RegisterPhone.class);
          localIntent.putExtra(z[1], true);
          this.a.startActivity(localIntent);
          this.a.finish();
        }
        return;
        j = 0;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        g5.c(z[3] + localException.toString());
        String str1 = null;
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.rs
 * JD-Core Version:    0.6.1
 */