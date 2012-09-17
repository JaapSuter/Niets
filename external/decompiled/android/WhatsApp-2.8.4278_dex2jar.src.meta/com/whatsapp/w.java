package com.whatsapp;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.whatsapp.wallpaper.l;
import java.io.IOException;

class w extends AsyncTask<Void, Void, Integer>
{
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[7];
    char[] arrayOfChar1 = "d\0226C\034v\0277".toCharArray();
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
    char[] arrayOfChar6;
    int i17;
    char[] arrayOfChar7;
    int i21;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "g\003%\007\013g\020>]\031)\0049\007\033c\0370I\032c".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "h\0260L6`\032-w\004u\024\nZ\bq,1I\035gS&M\035&\007:\b\017g\037&MI`\022<D\fb".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label441;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "h\0260L6`\032-w\004u\024\nZ\bq,1I\035g".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label533;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "g\003%\007\013g\020>]\031)\0049\007\be\002 A\033c".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label625;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "g\003%\007\013g\020>]\031)\026'Z\006tS".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label717;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "v\034\"M\033".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label809;
        arrayOfString[6] = new String(arrayOfChar7).intern();
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
        m = 105;
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
        m = 6;
        continue;
        m = 115;
        continue;
        m = 85;
        continue;
        m = 40;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 105;
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
      i3 = 6;
      continue;
      i3 = 115;
      continue;
      i3 = 85;
      continue;
      i3 = 40;
    }
    label441: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 105;
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
      i7 = 6;
      continue;
      i7 = 115;
      continue;
      i7 = 85;
      continue;
      i7 = 40;
    }
    label533: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 105;
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
      i11 = 6;
      continue;
      i11 = 115;
      continue;
      i11 = 85;
      continue;
      i11 = 40;
    }
    label625: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 105;
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
      i15 = 6;
      continue;
      i15 = 115;
      continue;
      i15 = 85;
      continue;
      i15 = 40;
    }
    label717: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 105;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i17] = (char)(i19 ^ i18);
      i17++;
      break;
      i19 = 6;
      continue;
      i19 = 115;
      continue;
      i19 = 85;
      continue;
      i19 = 40;
    }
    label809: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 105;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i21] = (char)(i23 ^ i22);
      i21++;
      break;
      i23 = 6;
      continue;
      i23 = 115;
      continue;
      i23 = 85;
      continue;
      i23 = 40;
    }
  }

  private w()
  {
  }

  w(mq parammq)
  {
    this();
  }

  protected Integer a(Void[] paramArrayOfVoid)
  {
    PowerManager localPowerManager = (PowerManager)App.Mb.getSystemService(z[6]);
    PowerManager.WakeLock localWakeLock = null;
    if (localPowerManager != null)
      localWakeLock = localPowerManager.newWakeLock(1, z[0]);
    if (localWakeLock != null);
    try
    {
      localWakeLock.acquire();
      g5.b(z[4]);
      App.z.a(false);
      l.d();
      SharedPreferences localSharedPreferences = App.Mb.getSharedPreferences(App.Mb.getString(2131296258), 0);
      if (localSharedPreferences.getBoolean(z[3], false))
      {
        if (!localSharedPreferences.edit().putBoolean(z[3], false).commit())
          g5.d(z[2]);
        App.z.z();
      }
      if ((localWakeLock != null) && (localWakeLock.isHeld()))
      {
        localWakeLock.release();
        str = z[1];
        g5.b(str);
      }
      return Integer.valueOf(10);
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        String str;
        g5.d(z[5] + localIOException.toString());
        if ((localWakeLock != null) && (localWakeLock.isHeld()))
        {
          localWakeLock.release();
          str = z[1];
        }
      }
    }
    finally
    {
      if ((localWakeLock != null) && (localWakeLock.isHeld()))
      {
        localWakeLock.release();
        g5.b(z[1]);
      }
    }
  }

  protected void a(Integer paramInteger)
  {
    Conversation.i();
    if (Conversation.a())
      Conversation.b().removeDialog(100);
    if (Conversations.a())
      Conversations.b().removeDialog(100);
  }

  protected void onPreExecute()
  {
    App.i(false);
    if ((Conversation.a()) && (!Conversation.b().isFinishing()))
      Conversation.b().showDialog(100);
    if (Conversations.a())
    {
      Conversations localConversations = Conversations.b();
      if (!localConversations.isFinishing())
        localConversations.showDialog(100);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.w
 * JD-Core Version:    0.6.1
 */