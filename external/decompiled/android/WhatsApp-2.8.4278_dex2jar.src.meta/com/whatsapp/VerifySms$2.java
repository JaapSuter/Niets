package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;

class VerifySms$2 extends BroadcastReceiver
{
  private static final String[] z;
  final VerifySms a;

  static
  {
    String[] arrayOfString = new String[22];
    char[] arrayOfChar1 = "f>\0035\013gv\002&��qv\034*\035x:\005 \0068>\0343\032l".toCharArray();
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
    char[] arrayOfChar12;
    int i41;
    char[] arrayOfChar13;
    int i45;
    char[] arrayOfChar14;
    int i49;
    char[] arrayOfChar15;
    int i53;
    char[] arrayOfChar16;
    int i57;
    char[] arrayOfChar17;
    int i61;
    char[] arrayOfChar18;
    int i65;
    char[] arrayOfChar19;
    int i69;
    char[] arrayOfChar20;
    int i73;
    char[] arrayOfChar21;
    int i77;
    char[] arrayOfChar22;
    int i81;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "e?\0040".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "c>\003*\bl(\0340Ar>\005\016\013f(\020$\013W4\025:N".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label1009;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "c>\003*\bl(\0340Aq2\0023\002t\">1\007r2\037\"\032|5\026\002\nq)\0240\0355".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label1101;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "c>\003*\bl(\0340Aq2\0023\002t\"<&\035f:\026&,z?\bc".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label1193;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "c>\003*\bl(\0340Ar>\005\023\035p.\025,=`9\033&\ra{".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label1285;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "c>\003*\bl(\0340Ag>\022&\007c>\025n\034p8\024*\030p)^.\013f(\020$\01385\004/\002".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label1377;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "B3\0207\035T+\001c\rz?\024c".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1469;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "c>\003*\bl(\0340Ap6\020*\002S)\036.N".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1561;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "c>\003*\bl(\0340Ap6\020*\002W4\025:N".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1653;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "c>\003*\bl(\0340Ar>\005\f\034|<\030-\017a2\037$/q?\003&\035f{".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label1745;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "c>\003*\bl(\0340Aa>\t7Cg>\022&\007c>\003l��z/.0\003f\004\007&\034|=\030 \017a2\036-".toCharArray();
        int i40 = arrayOfChar12.length;
        i41 = 0;
        if (i40 > i41)
          break label1837;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "c>\003*\bl(\0340Ar>\005\020\013g-\030 \013V>\0377\013g\032\025'\034p(\002c".toCharArray();
        int i44 = arrayOfChar13.length;
        i45 = 0;
        if (i44 > i45)
          break label1929;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "c>\003*\bl(\0340Ag>\022&\007c>\025n\034p8\024*\030p)^3\n`(\\/\013{<\005+A".toCharArray();
        int i48 = arrayOfChar14.length;
        i49 = 0;
        if (i48 > i49)
          break label2021;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "c>\003*\bl(\0340Ag>\022&\007c>\025n\034p8\024*\030p)^'\013f/\003,\027p?".toCharArray();
        int i52 = arrayOfChar15.length;
        i53 = 0;
        if (i52 > i53)
          break label2113;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "c>\003*\bl(\0340".toCharArray();
        int i56 = arrayOfChar16.length;
        i57 = 0;
        if (i56 > i57)
          break label2205;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "c>\003*\bl(\0340Aa>\t7Cg>\022&\007c>\003l".toCharArray();
        int i60 = arrayOfChar17.length;
        i61 = 0;
        if (i60 > i61)
          break label2297;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "c>\003*\bl(\0340Aa>\t7Cg>\022&\007c>\003l��zv\022,\np".toCharArray();
        int i64 = arrayOfChar18.length;
        i65 = 0;
        if (i64 > i65)
          break label2389;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "c>\003*\bl(\0340Aa>\t7Cg>\022&\007c>\003l\013g)\0361N".toCharArray();
        int i68 = arrayOfChar19.length;
        i69 = 0;
        if (i68 > i69)
          break label2481;
        arrayOfString[18] = new String(arrayOfChar19).intern();
        arrayOfChar20 = "c>\003*\bl(\0340Aa>\t7Az.\005n\001sv\034&\003z)\bc".toCharArray();
        int i72 = arrayOfChar20.length;
        i73 = 0;
        if (i72 > i73)
          break label2573;
        arrayOfString[19] = new String(arrayOfChar20).intern();
        arrayOfChar21 = "c>\003*\bl(\0340Ag>\022&\007c>\025n\034p8\024*\030p)^7\013m/^*��a>\0377".toCharArray();
        int i76 = arrayOfChar21.length;
        i77 = 0;
        if (i76 > i77)
          break label2665;
        arrayOfString[20] = new String(arrayOfChar21).intern();
        arrayOfChar22 = "c>\003*\bl(\0340Ag>\022&\007c>\025n\034p8\024*\030p)^!\033{?\035&C{.\035/".toCharArray();
        int i80 = arrayOfChar22.length;
        i81 = 0;
        if (i80 > i81)
          break label2757;
        arrayOfString[21] = new String(arrayOfChar22).intern();
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
        m = 110;
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
        m = 21;
        continue;
        m = 91;
        continue;
        m = 113;
        continue;
        m = 67;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 110;
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
      i3 = 21;
      continue;
      i3 = 91;
      continue;
      i3 = 113;
      continue;
      i3 = 67;
    }
    label1009: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 110;
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
      i7 = 21;
      continue;
      i7 = 91;
      continue;
      i7 = 113;
      continue;
      i7 = 67;
    }
    label1101: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 110;
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
      i11 = 21;
      continue;
      i11 = 91;
      continue;
      i11 = 113;
      continue;
      i11 = 67;
    }
    label1193: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 110;
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
      i15 = 21;
      continue;
      i15 = 91;
      continue;
      i15 = 113;
      continue;
      i15 = 67;
    }
    label1285: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 110;
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
      i19 = 21;
      continue;
      i19 = 91;
      continue;
      i19 = 113;
      continue;
      i19 = 67;
    }
    label1377: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 110;
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
      i23 = 21;
      continue;
      i23 = 91;
      continue;
      i23 = 113;
      continue;
      i23 = 67;
    }
    label1469: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 110;
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
      i27 = 21;
      continue;
      i27 = 91;
      continue;
      i27 = 113;
      continue;
      i27 = 67;
    }
    label1561: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 110;
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
      i31 = 21;
      continue;
      i31 = 91;
      continue;
      i31 = 113;
      continue;
      i31 = 67;
    }
    label1653: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 110;
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
      i35 = 21;
      continue;
      i35 = 91;
      continue;
      i35 = 113;
      continue;
      i35 = 67;
    }
    label1745: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 110;
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
      i39 = 21;
      continue;
      i39 = 91;
      continue;
      i39 = 113;
      continue;
      i39 = 67;
    }
    label1837: int i42 = arrayOfChar12[i41];
    int i43;
    switch (i41 % 5)
    {
    default:
      i43 = 110;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar12[i41] = (char)(i43 ^ i42);
      i41++;
      break;
      i43 = 21;
      continue;
      i43 = 91;
      continue;
      i43 = 113;
      continue;
      i43 = 67;
    }
    label1929: int i46 = arrayOfChar13[i45];
    int i47;
    switch (i45 % 5)
    {
    default:
      i47 = 110;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar13[i45] = (char)(i47 ^ i46);
      i45++;
      break;
      i47 = 21;
      continue;
      i47 = 91;
      continue;
      i47 = 113;
      continue;
      i47 = 67;
    }
    label2021: int i50 = arrayOfChar14[i49];
    int i51;
    switch (i49 % 5)
    {
    default:
      i51 = 110;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar14[i49] = (char)(i51 ^ i50);
      i49++;
      break;
      i51 = 21;
      continue;
      i51 = 91;
      continue;
      i51 = 113;
      continue;
      i51 = 67;
    }
    label2113: int i54 = arrayOfChar15[i53];
    int i55;
    switch (i53 % 5)
    {
    default:
      i55 = 110;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar15[i53] = (char)(i55 ^ i54);
      i53++;
      break;
      i55 = 21;
      continue;
      i55 = 91;
      continue;
      i55 = 113;
      continue;
      i55 = 67;
    }
    label2205: int i58 = arrayOfChar16[i57];
    int i59;
    switch (i57 % 5)
    {
    default:
      i59 = 110;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar16[i57] = (char)(i59 ^ i58);
      i57++;
      break;
      i59 = 21;
      continue;
      i59 = 91;
      continue;
      i59 = 113;
      continue;
      i59 = 67;
    }
    label2297: int i62 = arrayOfChar17[i61];
    int i63;
    switch (i61 % 5)
    {
    default:
      i63 = 110;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar17[i61] = (char)(i63 ^ i62);
      i61++;
      break;
      i63 = 21;
      continue;
      i63 = 91;
      continue;
      i63 = 113;
      continue;
      i63 = 67;
    }
    label2389: int i66 = arrayOfChar18[i65];
    int i67;
    switch (i65 % 5)
    {
    default:
      i67 = 110;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar18[i65] = (char)(i67 ^ i66);
      i65++;
      break;
      i67 = 21;
      continue;
      i67 = 91;
      continue;
      i67 = 113;
      continue;
      i67 = 67;
    }
    label2481: int i70 = arrayOfChar19[i69];
    int i71;
    switch (i69 % 5)
    {
    default:
      i71 = 110;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar19[i69] = (char)(i71 ^ i70);
      i69++;
      break;
      i71 = 21;
      continue;
      i71 = 91;
      continue;
      i71 = 113;
      continue;
      i71 = 67;
    }
    label2573: int i74 = arrayOfChar20[i73];
    int i75;
    switch (i73 % 5)
    {
    default:
      i75 = 110;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar20[i73] = (char)(i75 ^ i74);
      i73++;
      break;
      i75 = 21;
      continue;
      i75 = 91;
      continue;
      i75 = 113;
      continue;
      i75 = 67;
    }
    label2665: int i78 = arrayOfChar21[i77];
    int i79;
    switch (i77 % 5)
    {
    default:
      i79 = 110;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar21[i77] = (char)(i79 ^ i78);
      i77++;
      break;
      i79 = 21;
      continue;
      i79 = 91;
      continue;
      i79 = 113;
      continue;
      i79 = 67;
    }
    label2757: int i82 = arrayOfChar22[i81];
    int i83;
    switch (i81 % 5)
    {
    default:
      i83 = 110;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar22[i81] = (char)(i83 ^ i82);
      i81++;
      break;
      i83 = 21;
      continue;
      i83 = 91;
      continue;
      i83 = 113;
      continue;
      i83 = 67;
    }
  }

  VerifySms$2(VerifySms paramVerifySms)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    boolean bool = DialogToastListActivity.f;
    g5.b(z[20]);
    Object[] arrayOfObject;
    int i;
    if (!this.a.V)
    {
      Bundle localBundle = paramIntent.getExtras();
      if (localBundle != null)
      {
        arrayOfObject = (Object[])localBundle.get(z[1]);
        g5.b(z[13] + arrayOfObject.length);
        i = 0;
        if (i >= arrayOfObject.length);
      }
    }
    while (true)
    {
      try
      {
        SmsMessage localSmsMessage2 = SmsMessage.createFromPdu((byte[])arrayOfObject[i]);
        localSmsMessage1 = localSmsMessage2;
        if (localSmsMessage1 == null)
          break label703;
      }
      catch (OutOfMemoryError localNullPointerException1)
      {
        try
        {
          String str5 = localSmsMessage1.getMessageBody();
          str4 = str5;
        }
        catch (NullPointerException localNullPointerException1)
        {
          try
          {
            SmsMessage localSmsMessage1;
            String str4;
            g5.b(z[2] + str4);
            g5.b(z[4] + localSmsMessage1.getDisplayMessageBody());
            g5.b(z[3] + localSmsMessage1.getDisplayOriginatingAddress());
            g5.b(z[9] + localSmsMessage1.getEmailBody());
            g5.b(z[8] + localSmsMessage1.getEmailFrom());
            g5.b(z[10] + localSmsMessage1.getOriginatingAddress());
            g5.b(z[5] + localSmsMessage1.getPseudoSubject());
            g5.b(z[12] + localSmsMessage1.getServiceCenterAddress());
            str1 = str4;
            String str2;
            int k;
            String str3;
            if ((localSmsMessage1 != null) && (str1 != null))
            {
              g5.b(z[16] + str1);
              str2 = z[7];
              k = str1.indexOf(str2);
              if (k >= 0)
                str3 = "";
            }
            try
            {
              str3 = str1.substring(k + str2.length(), 3 + (k + str2.length()));
              int n = Integer.parseInt(str3);
              m = n;
              if (m != -1)
              {
                ec localec = new ec(this.a);
                String[] arrayOfString = new String[1];
                arrayOfString[0] = str3;
                localec.execute(arrayOfString);
                if (!bool);
              }
              else
              {
                g5.c(z[17]);
                this.a.e(z[0]);
              }
              if (bool)
                g5.c(z[11]);
              if (bool)
                g5.b(z[6]);
              j = i + 1;
              if (bool)
              {
                if (bool)
                  g5.b(z[21]);
                if (bool)
                  g5.b(z[14]);
                return;
                localOutOfMemoryError = localOutOfMemoryError;
                g5.d(z[19] + localOutOfMemoryError.toString());
                localSmsMessage1 = null;
                continue;
                localNullPointerException1 = localNullPointerException1;
                str4 = null;
                g5.b(z[15], localNullPointerException1);
                str1 = str4;
              }
            }
            catch (Exception localException)
            {
              g5.c(z[18] + localException.toString());
              int m = -1;
              continue;
            }
          }
          catch (NullPointerException localNullPointerException2)
          {
            int j;
            continue;
            i = j;
          }
        }
      }
      break;
      label703: String str1 = null;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.VerifySms.2
 * JD-Core Version:    0.6.1
 */