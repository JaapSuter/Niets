package com.whatsapp.accountsync;

import android.content.Intent;
import android.database.Cursor;
import android.os.AsyncTask.Status;
import android.os.Bundle;
import android.os.Environment;
import com.whatsapp.App;
import com.whatsapp.Conversation;
import com.whatsapp.Conversations;
import com.whatsapp.VerifyMessageStoreActivity;
import com.whatsapp.ac;
import com.whatsapp.eu;
import com.whatsapp.fq;
import com.whatsapp.g5;
import com.whatsapp.qp;
import com.whatsapp.zq;

public class ProfileActivity extends VerifyMessageStoreActivity
{
  private static final String[] z;
  d l = null;

  static
  {
    String[] arrayOfString = new String[6];
    char[] arrayOfChar1 = "\033#\022)m\023(85v".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\006>\b!p\032)\006$m\037:\0163`Y/\025\"x\002)".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\033#\022)m\023(".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label401;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\006>\b!p\032)\006$m\037:\0163`Y/\025\"x\002)H%x\025'\0227\037 \0024\0319\t#9".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label493;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "2\r3\006(".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label585;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "%5\t$|\022l\004(w\002-\0043>\005l\r.}V!\0164j\037\"��x".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label677;
        arrayOfString[5] = new String(arrayOfChar6).intern();
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
        m = 25;
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
        m = 118;
        continue;
        m = 76;
        continue;
        m = 103;
        continue;
        m = 71;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 25;
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
      i3 = 118;
      continue;
      i3 = 76;
      continue;
      i3 = 103;
      continue;
      i3 = 71;
    }
    label401: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 25;
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
      i7 = 118;
      continue;
      i7 = 76;
      continue;
      i7 = 103;
      continue;
      i7 = 71;
    }
    label493: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 25;
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
      i11 = 118;
      continue;
      i11 = 76;
      continue;
      i11 = 103;
      continue;
      i11 = 71;
    }
    label585: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 25;
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
      i15 = 118;
      continue;
      i15 = 76;
      continue;
      i15 = 103;
      continue;
      i15 = 71;
    }
    label677: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 25;
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
      i19 = 118;
      continue;
      i19 = 76;
      continue;
      i19 = 103;
      continue;
      i19 = 71;
    }
  }

  private void a()
  {
    boolean bool = PerformSyncManager.b;
    if (getIntent().getData() != null)
    {
      Cursor localCursor = managedQuery(getIntent().getData(), null, null, null, null);
      if (localCursor != null)
      {
        if (localCursor.moveToNext())
        {
          String str = localCursor.getString(localCursor.getColumnIndex(z[4]));
          zq localzq = App.w.a(str, null);
          if (localzq != null)
          {
            if (!isFinishing())
            {
              startActivity(Conversation.a(localzq));
              if (!bool);
            }
          }
          else if (!isFinishing())
            startActivity(new Intent(this, Conversations.class));
          finish();
        }
        localCursor.close();
      }
      if (!bool);
    }
    else
    {
      g5.d(z[5]);
      finish();
    }
  }

  static void a(ProfileActivity paramProfileActivity)
  {
    paramProfileActivity.a();
  }

  protected void d()
  {
    eu.h = true;
    eu.j = true;
  }

  protected void e()
  {
    if (eu.j)
    {
      if ((this.l == null) || (this.l.getStatus() != AsyncTask.Status.RUNNING))
      {
        this.l = new d(this);
        this.l.execute(new Void[0]);
        if (!PerformSyncManager.b);
      }
    }
    else
      a();
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool = PerformSyncManager.b;
    super.onCreate(paramBundle);
    g5.b(z[1]);
    if ((App.bb == null) || (App.c(this) != 3))
    {
      App.a(this, 2131296621, 1);
      finish();
    }
    while (true)
    {
      return;
      if (!App.z.l())
      {
        String str = Environment.getExternalStorageState();
        if ((!str.equals(z[2])) && (!str.equals(z[0])))
        {
          showDialog(107);
          if (!bool);
        }
        else
        {
          int i = App.z.e();
          g5.b(z[3] + i);
          if (i > 0)
          {
            showDialog(105);
            if (!bool);
          }
          else
          {
            new ac(this, false, false).execute(new Object[0]);
          }
        }
        if (!bool);
      }
      else
      {
        e();
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.accountsync.ProfileActivity
 * JD-Core Version:    0.6.1
 */