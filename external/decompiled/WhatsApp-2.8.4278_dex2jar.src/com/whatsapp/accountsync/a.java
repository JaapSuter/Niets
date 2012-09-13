package com.whatsapp.accountsync;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.NetworkErrorException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.g5;

class a extends AbstractAccountAuthenticator
{
  private static final String[] z;
  private Context a;

  static
  {
    String[] arrayOfString = new String[9];
    char[] arrayOfChar1 = "X\026\033#nW\001X?bW\026Xa;X\021\034\rxZ\032\r\"o".toCharArray();
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
    char[] arrayOfChar8;
    int i25;
    char[] arrayOfChar9;
    int i29;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "P\033\f)uM".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "X\026\033#nW\00199oQ\020\0268rZ\024\f#ik\020\013<tW\006\035".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label517;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\\\021\0218KK\032\b)iM\034\035?".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label609;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "Z\032\026*rK\030;>~]\020\0268rX\031\013".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label701;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "Q\024\013\n~X\001\r>~JOX".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label793;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "L\005\034-o\\6\n)\\\033\f%zU\006".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label885;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "^\020\f\rnM\035,#p\\\0334-y\\\031".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label977;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "^\020\f\rnM\035,#p\\\033".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1069;
        arrayOfString[8] = new String(arrayOfChar9).intern();
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
        m = 27;
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
        m = 57;
        continue;
        m = 117;
        continue;
        m = 120;
        continue;
        m = 76;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 27;
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
      i3 = 57;
      continue;
      i3 = 117;
      continue;
      i3 = 120;
      continue;
      i3 = 76;
    }
    label517: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 27;
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
      i7 = 57;
      continue;
      i7 = 117;
      continue;
      i7 = 120;
      continue;
      i7 = 76;
    }
    label609: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 27;
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
      i11 = 57;
      continue;
      i11 = 117;
      continue;
      i11 = 120;
      continue;
      i11 = 76;
    }
    label701: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 27;
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
      i15 = 57;
      continue;
      i15 = 117;
      continue;
      i15 = 120;
      continue;
      i15 = 76;
    }
    label793: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 27;
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
      i19 = 57;
      continue;
      i19 = 117;
      continue;
      i19 = 120;
      continue;
      i19 = 76;
    }
    label885: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 27;
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
      i23 = 57;
      continue;
      i23 = 117;
      continue;
      i23 = 120;
      continue;
      i23 = 76;
    }
    label977: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar8[i25] = (char)(i27 ^ i26);
      i25++;
      break;
      i27 = 57;
      continue;
      i27 = 117;
      continue;
      i27 = 120;
      continue;
      i27 = 76;
    }
    label1069: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar9[i29] = (char)(i31 ^ i30);
      i29++;
      break;
      i31 = 57;
      continue;
      i31 = 117;
      continue;
      i31 = 120;
      continue;
      i31 = 76;
    }
  }

  public a(Context paramContext)
  {
    super(paramContext);
    this.a = paramContext;
  }

  public Bundle addAccount(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, String paramString1, String paramString2, String[] paramArrayOfString, Bundle paramBundle)
    throws NetworkErrorException
  {
    g5.b(z[0]);
    Bundle localBundle = new Bundle();
    Intent localIntent = new Intent(this.a, LoginActivity.class);
    localIntent.putExtra(z[2], paramAccountAuthenticatorResponse);
    localBundle.putParcelable(z[1], localIntent);
    return localBundle;
  }

  public Bundle confirmCredentials(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, Bundle paramBundle)
  {
    g5.b(z[4]);
    return null;
  }

  public Bundle editProperties(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, String paramString)
  {
    g5.b(z[3]);
    return null;
  }

  public Bundle getAuthToken(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String paramString, Bundle paramBundle)
    throws NetworkErrorException
  {
    g5.b(z[8]);
    return null;
  }

  public String getAuthTokenLabel(String paramString)
  {
    g5.b(z[7]);
    return null;
  }

  public Bundle hasFeatures(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String[] paramArrayOfString)
    throws NetworkErrorException
  {
    g5.b(z[5] + paramArrayOfString);
    return null;
  }

  public Bundle updateCredentials(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String paramString, Bundle paramBundle)
  {
    g5.b(z[6]);
    return null;
  }
}