package com.whatsapp.accountsync;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorActivity;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.Toast;
import com.whatsapp.App;
import com.whatsapp.Main;
import com.whatsapp.g5;
import com.whatsapp.mh;

public class LoginActivity extends AccountAuthenticatorActivity
{
  private static final String[] z;
  String a;
  String b;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "\023\023P\036`\022\036X��L\024\t^\035V\017\025`\017V\022\bK6[\f\034".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\f\024X��Q\001\030K��I\t\017FF\\\022\036^\035Z".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\020\023P\007Z".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label289;
        arrayOfString[2] = new String(arrayOfChar3).intern();
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
        m = 63;
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
        m = 96;
        continue;
        m = 123;
        continue;
        m = 63;
        continue;
        m = 105;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 63;
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
      i3 = 96;
      continue;
      i3 = 123;
      continue;
      i3 = 63;
      continue;
      i3 = 105;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 63;
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
      i7 = 96;
      continue;
      i7 = 123;
      continue;
      i7 = 63;
      continue;
      i7 = 105;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool = PerformSyncManager.b;
    super.onCreate(paramBundle);
    setContentView(2130903106);
    g5.b(z[1]);
    Account[] arrayOfAccount = AccountManager.get(this).getAccounts();
    int i = arrayOfAccount.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      Account localAccount = arrayOfAccount[j];
      if (getBaseContext().getString(2131296266).contains(localAccount.type))
        k = 1;
      j++;
      if (bool)
        App.wc = 1 + App.wc;
    }
    if (k != 0)
    {
      Toast.makeText(getApplicationContext(), getString(2131296834), 1).show();
      finish();
      if (!bool);
    }
    else
    {
      this.a = App.c();
      if (this.a != null)
        break label171;
      Intent localIntent = new Intent(this, Main.class);
      localIntent.putExtra(z[0], true);
      startActivity(localIntent);
      finish();
    }
    while (true)
    {
      return;
      label171: this.b = mh.c(((TelephonyManager)getSystemService(z[2])).getDeviceId());
      c localc = new c(this, this);
      String[] arrayOfString = new String[2];
      arrayOfString[0] = this.a;
      arrayOfString[1] = this.b;
      localc.execute(arrayOfString);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.accountsync.LoginActivity
 * JD-Core Version:    0.6.1
 */