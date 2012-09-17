package com.whatsapp.accountsync;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;

class c extends AsyncTask<String, Void, Boolean>
{
  private static final String[] z;
  Context a;
  ProgressDialog b;
  final LoginActivity c;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "`U}^moBJHhd".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "`CjYYbUqDvu".toCharArray();
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
        m = 24;
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
        m = 1;
        continue;
        m = 54;
        continue;
        m = 30;
        continue;
        m = 49;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 24;
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
      i3 = 1;
      continue;
      i3 = 54;
      continue;
      i3 = 30;
      continue;
      i3 = 49;
    }
  }

  c(LoginActivity paramLoginActivity, Context paramContext)
  {
    this.a = paramContext;
    this.b = ProgressDialog.show(paramContext, "", paramLoginActivity.getString(2131296835), true, false);
    this.b.setCancelable(true);
  }

  public Boolean a(String[] paramArrayOfString)
  {
    String str1 = paramArrayOfString[0];
    String str2 = paramArrayOfString[1];
    try
    {
      Thread.sleep(2000L);
      Account localAccount = new Account(str1, this.a.getString(2131296266));
      if (AccountManager.get(this.a).addAccountExplicitly(localAccount, str2, null))
      {
        Bundle localBundle = new Bundle();
        localBundle.putString(z[1], localAccount.name);
        localBundle.putString(z[0], localAccount.type);
        this.c.setAccountAuthenticatorResult(localBundle);
        localBoolean = Boolean.valueOf(true);
        return localBoolean;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        localException.printStackTrace();
        continue;
        Boolean localBoolean = Boolean.valueOf(false);
      }
    }
  }

  public void a(Boolean paramBoolean)
  {
    this.b.dismiss();
    if (paramBoolean.booleanValue())
      this.c.finish();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.accountsync.c
 * JD-Core Version:    0.6.1
 */