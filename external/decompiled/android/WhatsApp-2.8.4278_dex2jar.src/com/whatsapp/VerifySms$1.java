package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class VerifySms$1 extends BroadcastReceiver
{
  private static final String[] z;
  final VerifySms a;

  static
  {
    String[] arrayOfString = new String[15];
    char[] arrayOfChar1 = "\0375l\020[\020#s\n\022\034>m\034S\035".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\0375l\020[\020#s\n\022\0331z\020RD?x\037".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\0325r\037\020\0325p\035\020\006%jTR\017}m\034O\0379}\034".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label745;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\0375l\020[\020#s\n\022\0325p\r\020\0335}\034T\0375lVO\f#k\025II".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label837;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\0375l\020[\020#s\n\022\0325p\r\020\0335}\034T\0375lVT\007${\027I".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label929;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "\0375l\020[\020#s\n\022\006%jTR\017}m\034O\0379}\034".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label1021;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "\0325r\037\020\0325p\035\020\006%jTR\017}}\013X\r9j\n".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label1113;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "\0375l\020[\020#s\n\022\0045f\020^\006".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1205;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "Be,H".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1297;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "Be,".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1389;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "\0375l\020[\020#s\n\022\0325p\r\020\0335}\034T\0375lVY\f#j\013R\0205z".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label1481;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "\0375l\020[\020#s\n\022\0325p\r\020\0335}\034T\0375lVX\033\"q\013\035".toCharArray();
        int i40 = arrayOfChar12.length;
        i41 = 0;
        if (i40 > i41)
          break label1573;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "\0325r\037\020\0325p\035\020\0325p\035\020\0171w\025H\0335".toCharArray();
        int i44 = arrayOfChar13.length;
        i45 = 0;
        if (i44 > i45)
          break label1665;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "\0375l\020[\020#s\n\022\006%jTR\017}}\013X\r9j\n".toCharArray();
        int i48 = arrayOfChar14.length;
        i49 = 0;
        if (i48 > i49)
          break label1757;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "\f\"l\026O*?z\034".toCharArray();
        int i52 = arrayOfChar15.length;
        i53 = 0;
        if (i52 > i53)
          break label1849;
        arrayOfString[14] = new String(arrayOfChar15).intern();
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
        m = 61;
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
        m = 105;
        continue;
        m = 80;
        continue;
        m = 30;
        continue;
        m = 121;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 61;
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
      i3 = 105;
      continue;
      i3 = 80;
      continue;
      i3 = 30;
      continue;
      i3 = 121;
    }
    label745: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 61;
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
      i7 = 105;
      continue;
      i7 = 80;
      continue;
      i7 = 30;
      continue;
      i7 = 121;
    }
    label837: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 61;
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
      i11 = 105;
      continue;
      i11 = 80;
      continue;
      i11 = 30;
      continue;
      i11 = 121;
    }
    label929: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 61;
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
      i15 = 105;
      continue;
      i15 = 80;
      continue;
      i15 = 30;
      continue;
      i15 = 121;
    }
    label1021: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 61;
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
      i19 = 105;
      continue;
      i19 = 80;
      continue;
      i19 = 30;
      continue;
      i19 = 121;
    }
    label1113: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 61;
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
      i23 = 105;
      continue;
      i23 = 80;
      continue;
      i23 = 30;
      continue;
      i23 = 121;
    }
    label1205: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 61;
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
      i27 = 105;
      continue;
      i27 = 80;
      continue;
      i27 = 30;
      continue;
      i27 = 121;
    }
    label1297: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 61;
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
      i31 = 105;
      continue;
      i31 = 80;
      continue;
      i31 = 30;
      continue;
      i31 = 121;
    }
    label1389: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 61;
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
      i35 = 105;
      continue;
      i35 = 80;
      continue;
      i35 = 30;
      continue;
      i35 = 121;
    }
    label1481: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 61;
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
      i39 = 105;
      continue;
      i39 = 80;
      continue;
      i39 = 30;
      continue;
      i39 = 121;
    }
    label1573: int i42 = arrayOfChar12[i41];
    int i43;
    switch (i41 % 5)
    {
    default:
      i43 = 61;
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
      i43 = 105;
      continue;
      i43 = 80;
      continue;
      i43 = 30;
      continue;
      i43 = 121;
    }
    label1665: int i46 = arrayOfChar13[i45];
    int i47;
    switch (i45 % 5)
    {
    default:
      i47 = 61;
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
      i47 = 105;
      continue;
      i47 = 80;
      continue;
      i47 = 30;
      continue;
      i47 = 121;
    }
    label1757: int i50 = arrayOfChar14[i49];
    int i51;
    switch (i49 % 5)
    {
    default:
      i51 = 61;
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
      i51 = 105;
      continue;
      i51 = 80;
      continue;
      i51 = 30;
      continue;
      i51 = 121;
    }
    label1849: int i54 = arrayOfChar15[i53];
    int i55;
    switch (i53 % 5)
    {
    default:
      i55 = 61;
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
      i55 = 105;
      continue;
      i55 = 80;
      continue;
      i55 = 30;
      continue;
      i55 = 121;
    }
  }

  VerifySms$1(VerifySms paramVerifySms)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    boolean bool = DialogToastListActivity.f;
    g5.b(z[4]);
    if (!this.a.V)
    {
      int i = getResultCode();
      g5.b(z[3] + i);
      if (i != -1)
      {
        int j = paramIntent.getIntExtra(z[14], 0);
        g5.b(z[11] + j);
        VerifySms.a(this.a);
        switch (i)
        {
        case 3:
        default:
          switch (j)
          {
          default:
          case 16:
          case 98:
          }
          break;
        case 4:
        case 2:
        }
      }
    }
    while (true)
    {
      label164: g5.c(z[0]);
      this.a.e(z[12]);
      VerifySms.b(this.a);
      do
      {
        do
        {
          do
          {
            do
            {
              if (bool)
                g5.b(z[10]);
              return;
              g5.b(z[5]);
              this.a.e(z[2]);
              VerifySms.b(this.a);
            }
            while (!bool);
            g5.b(z[1]);
            VerifySms.a(7);
            VerifySms.c(this.a);
            this.a.c(7);
          }
          while (!bool);
          break;
          g5.b(z[13]);
          this.a.e(z[6]);
          VerifySms.b(this.a);
        }
        while (!bool);
        if ((!VerifySms.v().startsWith(z[9])) || (VerifySms.v().startsWith(z[8])))
          break label164;
        g5.b(z[7]);
        VerifySms.a(6);
        VerifySms.c(this.a);
        this.a.c(4);
      }
      while (!bool);
    }
  }
}