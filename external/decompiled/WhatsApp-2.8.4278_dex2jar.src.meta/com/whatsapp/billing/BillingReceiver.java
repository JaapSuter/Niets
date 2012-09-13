package com.whatsapp.billing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BillingReceiver extends BroadcastReceiver
{
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[11];
    char[] arrayOfChar1 = "zb->TL%)Jvh\023*Egm".toCharArray();
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
    char[] arrayOfChar10;
    int i33;
    char[] arrayOfChar11;
    int i37;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "pc!`E}h>!Mw\":+Jwe\")\nqe \"M}kb\036qAO\004\017wVS\037\032eGI\023\rlRB\013\013`".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "zb->TL%)Jrx9<A".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label593;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "pc!`E}h>!Mw\":+Jwe\")\nqe \"M}kb\007jLM\034\036{]C\030\007bJ".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label685;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "Qe \"M}k\036+Gve:+V".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label777;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "pc!`E}h>!Mw\":+Jwe\")\nqe \"M}kb\034a@\\\003��wVS\017\001`V".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label869;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "}c8'Bzo-:M|b\023'@".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label961;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "fb)6Tvo8+@3m/:M|bvn".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1053;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "ai=;A`x\023'@".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1145;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "ai?>K})\021G|h)".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1237;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "pc!`S{m8=Ec|b,M`% C=K\t\032{CY\036\rlR_\t\021m]J\003\034iRX\005\001j".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label1329;
        arrayOfString[10] = new String(arrayOfChar11).intern();
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
        m = 36;
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
        m = 19;
        continue;
        m = 12;
        continue;
        m = 76;
        continue;
        m = 78;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 36;
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
      i3 = 19;
      continue;
      i3 = 12;
      continue;
      i3 = 76;
      continue;
      i3 = 78;
    }
    label593: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 36;
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
      i7 = 19;
      continue;
      i7 = 12;
      continue;
      i7 = 76;
      continue;
      i7 = 78;
    }
    label685: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 36;
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
      i11 = 19;
      continue;
      i11 = 12;
      continue;
      i11 = 76;
      continue;
      i11 = 78;
    }
    label777: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 36;
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
      i15 = 19;
      continue;
      i15 = 12;
      continue;
      i15 = 76;
      continue;
      i15 = 78;
    }
    label869: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 36;
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
      i19 = 19;
      continue;
      i19 = 12;
      continue;
      i19 = 76;
      continue;
      i19 = 78;
    }
    label961: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 36;
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
      i23 = 19;
      continue;
      i23 = 12;
      continue;
      i23 = 76;
      continue;
      i23 = 78;
    }
    label1053: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 36;
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
      i27 = 19;
      continue;
      i27 = 12;
      continue;
      i27 = 76;
      continue;
      i27 = 78;
    }
    label1145: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 36;
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
      i31 = 19;
      continue;
      i31 = 12;
      continue;
      i31 = 76;
      continue;
      i31 = 78;
    }
    label1237: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 36;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar10[i33] = (char)(i35 ^ i34);
      i33++;
      break;
      i35 = 19;
      continue;
      i35 = 12;
      continue;
      i35 = 76;
      continue;
      i35 = 78;
    }
    label1329: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 36;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar11[i37] = (char)(i39 ^ i38);
      i37++;
      break;
      i39 = 19;
      continue;
      i39 = 12;
      continue;
      i39 = 76;
      continue;
      i39 = 78;
    }
  }

  private void a(Context paramContext, long paramLong, int paramInt)
  {
    Intent localIntent = new Intent(z[5]);
    localIntent.setClass(paramContext, BillingService.class);
    localIntent.putExtra(z[8], paramLong);
    localIntent.putExtra(z[9], paramInt);
    paramContext.startService(localIntent);
  }

  private void a(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent(z[10]);
    localIntent.setClass(paramContext, BillingService.class);
    localIntent.putExtra(z[6], paramString);
    paramContext.startService(localIntent);
  }

  private void a(Context paramContext, String paramString1, String paramString2)
  {
    Intent localIntent = new Intent(z[1]);
    localIntent.setClass(paramContext, BillingService.class);
    localIntent.putExtra(z[0], paramString1);
    localIntent.putExtra(z[2], paramString2);
    paramContext.startService(localIntent);
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    int i = i.b;
    String str = paramIntent.getAction();
    if (z[1].equals(str))
    {
      a(paramContext, paramIntent.getStringExtra(z[0]), paramIntent.getStringExtra(z[2]));
      if (i == 0);
    }
    else if (z[3].equals(str))
    {
      a(paramContext, paramIntent.getStringExtra(z[6]));
      if (i == 0);
    }
    else if (z[5].equals(str))
    {
      a(paramContext, paramIntent.getLongExtra(z[8], -1L), paramIntent.getIntExtra(z[9], c.g.ordinal()));
      if (i == 0);
    }
    else
    {
      Log.w(z[4], z[7] + str);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.billing.BillingReceiver
 * JD-Core Version:    0.6.1
 */