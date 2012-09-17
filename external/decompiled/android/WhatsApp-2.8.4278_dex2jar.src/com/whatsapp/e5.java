package com.whatsapp;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLProtocolException;

public final class e5
  implements Closeable
{
  public static int m;
  private static final String[] z;
  private final Reader a;
  private boolean b = false;
  private final char[] c = new char[1024];
  private int d = 0;
  private int e = 0;
  private final List<zf> f = new ArrayList();
  private ag g;
  private String h;
  private String i;
  private int j;
  private int k;
  private boolean l;

  static
  {
    String[] arrayOfString = new String[27];
    char[] arrayOfChar1 = "\034TLQW".toCharArray();
    int n = arrayOfChar1.length;
    int i1 = 0;
    char[] arrayOfChar2;
    int i5;
    char[] arrayOfChar3;
    int i9;
    char[] arrayOfChar4;
    int i13;
    char[] arrayOfChar5;
    int i17;
    char[] arrayOfChar6;
    int i21;
    char[] arrayOfChar7;
    int i25;
    char[] arrayOfChar8;
    int i29;
    char[] arrayOfChar9;
    int i33;
    char[] arrayOfChar10;
    int i37;
    char[] arrayOfChar11;
    int i41;
    char[] arrayOfChar12;
    int i45;
    char[] arrayOfChar13;
    int i49;
    char[] arrayOfChar14;
    int i53;
    char[] arrayOfChar15;
    int i57;
    char[] arrayOfChar16;
    int i61;
    char[] arrayOfChar17;
    int i65;
    char[] arrayOfChar18;
    int i69;
    char[] arrayOfChar19;
    int i73;
    char[] arrayOfChar20;
    int i77;
    char[] arrayOfChar21;
    int i81;
    char[] arrayOfChar22;
    int i85;
    char[] arrayOfChar23;
    int i89;
    char[] arrayOfChar24;
    int i93;
    char[] arrayOfChar25;
    int i97;
    char[] arrayOfChar26;
    int i101;
    char[] arrayOfChar27;
    int i105;
    if (n <= i1)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\016GUG".toCharArray();
      int i4 = arrayOfChar2.length;
      i5 = 0;
      if (i4 <= i5)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\024@LN".toCharArray();
        int i8 = arrayOfChar3.length;
        i9 = 0;
        if (i8 > i9)
          break label1201;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "ZWUV\022\rTS\002".toCharArray();
        int i12 = arrayOfChar4.length;
        i13 = 0;
        if (i12 > i13)
          break label1293;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "?MPGQ\016PD\002".toCharArray();
        int i16 = arrayOfChar5.length;
        i17 = 0;
        if (i16 > i17)
          break label1385;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "?MPGQ\016PD\002SZFTP[\024R��@G\016\025WCAZ".toCharArray();
        int i20 = arrayOfChar6.length;
        i21 = 0;
        if (i20 > i21)
          break label1477;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "Z[EC@Z".toCharArray();
        int i24 = arrayOfChar7.length;
        i25 = 0;
        if (i24 > i25)
          break label1569;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "0FOL`\037TDG@Z\\S\002Q\026ZSGV".toCharArray();
        int i28 = arrayOfChar8.length;
        i29 = 0;
        if (i28 > i29)
          break label1661;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "?MPGQ\016PD\002x)zn\002V\025VUOW\024A��V]ZFTC@\016\025WKF\022\025\007y\025ZZR\002\025\001\022��@G\016\025WCAZ".toCharArray();
        int i32 = arrayOfChar9.length;
        i33 = 0;
        if (i32 > i33)
          break label1753;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "pWUD\017".toCharArray();
        int i36 = arrayOfChar10.length;
        i37 = 0;
        if (i36 > i37)
          break label1845;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "?MPGQ\016PD\002SZWOM^\037TN\002P\017A��US\t\025".toCharArray();
        int i40 = arrayOfChar11.length;
        i41 = 0;
        if (i40 > i41)
          break label1937;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "\023[��\037\017Z[UN^".toCharArray();
        int i44 = arrayOfChar12.length;
        i45 = 0;
        if (i44 > i45)
          break label2029;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "/[TG@\027\\NCF\037Q��GA\031TPG\022\tPQWW\024VE".toCharArray();
        int i48 = arrayOfChar13.length;
        i49 = 0;
        if (i48 > i49)
          break label2121;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "?MPGQ\016PD\002\\\033XE".toCharArray();
        int i52 = arrayOfChar14.length;
        i53 = 0;
        if (i52 > i53)
          break label2213;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "/[TG@\027\\NCF\037Q��MP\020PCV".toCharArray();
        int i56 = arrayOfChar15.length;
        i57 = 0;
        if (i56 > i57)
          break label2305;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "\020FOL@\037TDG@UVLMA\037\032EP@\025G��".toCharArray();
        int i60 = arrayOfChar16.length;
        i61 = 0;
        if (i60 > i61)
          break label2397;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "/FE\002x\tZNpW\033QEP\034\tPTnW\024\\ELFRARWWS\025TM\022\033VCGB\016\025MC^\034ZROW\036\025jq}4".toCharArray();
        int i64 = arrayOfChar17.length;
        i65 = 0;
        if (i64 > i65)
          break label2489;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "/[TG@\027\\NCF\037Q��QF\b\\NE".toCharArray();
        int i68 = arrayOfChar18.length;
        i69 = 0;
        if (i68 > i69)
          break label2581;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "\t^IRB\037Q\001".toCharArray();
        int i72 = arrayOfChar19.length;
        i73 = 0;
        if (i72 > i73)
          break label2673;
        arrayOfString[18] = new String(arrayOfChar19).intern();
        arrayOfChar20 = "?MPGQ\016PD\002SZ[AOWZWUV\022\rTS\002".toCharArray();
        int i76 = arrayOfChar20.length;
        i77 = 0;
        if (i76 > i77)
          break label2765;
        arrayOfString[19] = new String(arrayOfChar20).intern();
        arrayOfChar21 = "/[TG@\027\\NCF\037Q��C@\bTY".toCharArray();
        int i80 = arrayOfChar21.length;
        i81 = 0;
        if (i80 > i81)
          break label2857;
        arrayOfString[20] = new String(arrayOfChar21).intern();
        arrayOfChar22 = "?MPGQ\016PD\002\025@\022".toCharArray();
        int i84 = arrayOfChar22.length;
        i85 = 0;
        if (i84 > i85)
          break label2949;
        arrayOfString[21] = new String(arrayOfChar22).intern();
        arrayOfChar23 = "?MPGQ\016PD\002^\023AEPS\026\025VC^\017P".toCharArray();
        int i88 = arrayOfChar23.length;
        i89 = 0;
        if (i88 > i89)
          break label3041;
        arrayOfString[22] = new String(arrayOfChar23).intern();
        arrayOfChar24 = "?MPGQ\016PD\002S\024\025ILFZWUV\022\rTS\002".toCharArray();
        int i92 = arrayOfChar24.length;
        i93 = 0;
        if (i92 > i93)
          break label3133;
        arrayOfString[23] = new String(arrayOfChar24).intern();
        arrayOfChar25 = "?[D\002]\034\025ILB\017A".toCharArray();
        int i96 = arrayOfChar25.length;
        i97 = 0;
        if (i96 > i97)
          break label3225;
        arrayOfString[24] = new String(arrayOfChar25).intern();
        arrayOfChar26 = "/[TG@\027\\NCF\037Q��A]\027XELF".toCharArray();
        int i100 = arrayOfChar26.length;
        i101 = 0;
        if (i100 > i101)
          break label3317;
        arrayOfString[25] = new String(arrayOfChar26).intern();
        arrayOfChar27 = "P\032".toCharArray();
        int i104 = arrayOfChar27.length;
        i105 = 0;
        if (i104 > i105)
          break label3409;
        arrayOfString[26] = new String(arrayOfChar27).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int i2 = arrayOfChar1[i1];
      int i3;
      switch (i1 % 5)
      {
      default:
        i3 = 50;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[i1] = (char)(i3 ^ i2);
        i1++;
        break;
        i3 = 122;
        continue;
        i3 = 53;
        continue;
        i3 = 32;
        continue;
        i3 = 34;
      }
    }
    int i6 = arrayOfChar2[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i5] = (char)(i7 ^ i6);
      i5++;
      break;
      i7 = 122;
      continue;
      i7 = 53;
      continue;
      i7 = 32;
      continue;
      i7 = 34;
    }
    label1201: int i10 = arrayOfChar3[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i9] = (char)(i11 ^ i10);
      i9++;
      break;
      i11 = 122;
      continue;
      i11 = 53;
      continue;
      i11 = 32;
      continue;
      i11 = 34;
    }
    label1293: int i14 = arrayOfChar4[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i13] = (char)(i15 ^ i14);
      i13++;
      break;
      i15 = 122;
      continue;
      i15 = 53;
      continue;
      i15 = 32;
      continue;
      i15 = 34;
    }
    label1385: int i18 = arrayOfChar5[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i17] = (char)(i19 ^ i18);
      i17++;
      break;
      i19 = 122;
      continue;
      i19 = 53;
      continue;
      i19 = 32;
      continue;
      i19 = 34;
    }
    label1477: int i22 = arrayOfChar6[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i21] = (char)(i23 ^ i22);
      i21++;
      break;
      i23 = 122;
      continue;
      i23 = 53;
      continue;
      i23 = 32;
      continue;
      i23 = 34;
    }
    label1569: int i26 = arrayOfChar7[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i25] = (char)(i27 ^ i26);
      i25++;
      break;
      i27 = 122;
      continue;
      i27 = 53;
      continue;
      i27 = 32;
      continue;
      i27 = 34;
    }
    label1661: int i30 = arrayOfChar8[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar8[i29] = (char)(i31 ^ i30);
      i29++;
      break;
      i31 = 122;
      continue;
      i31 = 53;
      continue;
      i31 = 32;
      continue;
      i31 = 34;
    }
    label1753: int i34 = arrayOfChar9[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar9[i33] = (char)(i35 ^ i34);
      i33++;
      break;
      i35 = 122;
      continue;
      i35 = 53;
      continue;
      i35 = 32;
      continue;
      i35 = 34;
    }
    label1845: int i38 = arrayOfChar10[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar10[i37] = (char)(i39 ^ i38);
      i37++;
      break;
      i39 = 122;
      continue;
      i39 = 53;
      continue;
      i39 = 32;
      continue;
      i39 = 34;
    }
    label1937: int i42 = arrayOfChar11[i41];
    int i43;
    switch (i41 % 5)
    {
    default:
      i43 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar11[i41] = (char)(i43 ^ i42);
      i41++;
      break;
      i43 = 122;
      continue;
      i43 = 53;
      continue;
      i43 = 32;
      continue;
      i43 = 34;
    }
    label2029: int i46 = arrayOfChar12[i45];
    int i47;
    switch (i45 % 5)
    {
    default:
      i47 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar12[i45] = (char)(i47 ^ i46);
      i45++;
      break;
      i47 = 122;
      continue;
      i47 = 53;
      continue;
      i47 = 32;
      continue;
      i47 = 34;
    }
    label2121: int i50 = arrayOfChar13[i49];
    int i51;
    switch (i49 % 5)
    {
    default:
      i51 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar13[i49] = (char)(i51 ^ i50);
      i49++;
      break;
      i51 = 122;
      continue;
      i51 = 53;
      continue;
      i51 = 32;
      continue;
      i51 = 34;
    }
    label2213: int i54 = arrayOfChar14[i53];
    int i55;
    switch (i53 % 5)
    {
    default:
      i55 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar14[i53] = (char)(i55 ^ i54);
      i53++;
      break;
      i55 = 122;
      continue;
      i55 = 53;
      continue;
      i55 = 32;
      continue;
      i55 = 34;
    }
    label2305: int i58 = arrayOfChar15[i57];
    int i59;
    switch (i57 % 5)
    {
    default:
      i59 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar15[i57] = (char)(i59 ^ i58);
      i57++;
      break;
      i59 = 122;
      continue;
      i59 = 53;
      continue;
      i59 = 32;
      continue;
      i59 = 34;
    }
    label2397: int i62 = arrayOfChar16[i61];
    int i63;
    switch (i61 % 5)
    {
    default:
      i63 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar16[i61] = (char)(i63 ^ i62);
      i61++;
      break;
      i63 = 122;
      continue;
      i63 = 53;
      continue;
      i63 = 32;
      continue;
      i63 = 34;
    }
    label2489: int i66 = arrayOfChar17[i65];
    int i67;
    switch (i65 % 5)
    {
    default:
      i67 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar17[i65] = (char)(i67 ^ i66);
      i65++;
      break;
      i67 = 122;
      continue;
      i67 = 53;
      continue;
      i67 = 32;
      continue;
      i67 = 34;
    }
    label2581: int i70 = arrayOfChar18[i69];
    int i71;
    switch (i69 % 5)
    {
    default:
      i71 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar18[i69] = (char)(i71 ^ i70);
      i69++;
      break;
      i71 = 122;
      continue;
      i71 = 53;
      continue;
      i71 = 32;
      continue;
      i71 = 34;
    }
    label2673: int i74 = arrayOfChar19[i73];
    int i75;
    switch (i73 % 5)
    {
    default:
      i75 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar19[i73] = (char)(i75 ^ i74);
      i73++;
      break;
      i75 = 122;
      continue;
      i75 = 53;
      continue;
      i75 = 32;
      continue;
      i75 = 34;
    }
    label2765: int i78 = arrayOfChar20[i77];
    int i79;
    switch (i77 % 5)
    {
    default:
      i79 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar20[i77] = (char)(i79 ^ i78);
      i77++;
      break;
      i79 = 122;
      continue;
      i79 = 53;
      continue;
      i79 = 32;
      continue;
      i79 = 34;
    }
    label2857: int i82 = arrayOfChar21[i81];
    int i83;
    switch (i81 % 5)
    {
    default:
      i83 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar21[i81] = (char)(i83 ^ i82);
      i81++;
      break;
      i83 = 122;
      continue;
      i83 = 53;
      continue;
      i83 = 32;
      continue;
      i83 = 34;
    }
    label2949: int i86 = arrayOfChar22[i85];
    int i87;
    switch (i85 % 5)
    {
    default:
      i87 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar22[i85] = (char)(i87 ^ i86);
      i85++;
      break;
      i87 = 122;
      continue;
      i87 = 53;
      continue;
      i87 = 32;
      continue;
      i87 = 34;
    }
    label3041: int i90 = arrayOfChar23[i89];
    int i91;
    switch (i89 % 5)
    {
    default:
      i91 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar23[i89] = (char)(i91 ^ i90);
      i89++;
      break;
      i91 = 122;
      continue;
      i91 = 53;
      continue;
      i91 = 32;
      continue;
      i91 = 34;
    }
    label3133: int i94 = arrayOfChar24[i93];
    int i95;
    switch (i93 % 5)
    {
    default:
      i95 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar24[i93] = (char)(i95 ^ i94);
      i93++;
      break;
      i95 = 122;
      continue;
      i95 = 53;
      continue;
      i95 = 32;
      continue;
      i95 = 34;
    }
    label3225: int i98 = arrayOfChar25[i97];
    int i99;
    switch (i97 % 5)
    {
    default:
      i99 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar25[i97] = (char)(i99 ^ i98);
      i97++;
      break;
      i99 = 122;
      continue;
      i99 = 53;
      continue;
      i99 = 32;
      continue;
      i99 = 34;
    }
    label3317: int i102 = arrayOfChar26[i101];
    int i103;
    switch (i101 % 5)
    {
    default:
      i103 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar26[i101] = (char)(i103 ^ i102);
      i101++;
      break;
      i103 = 122;
      continue;
      i103 = 53;
      continue;
      i103 = 32;
      continue;
      i103 = 34;
    }
    label3409: int i106 = arrayOfChar27[i105];
    int i107;
    switch (i105 % 5)
    {
    default:
      i107 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar27[i105] = (char)(i107 ^ i106);
      i105++;
      break;
      i107 = 122;
      continue;
      i107 = 53;
      continue;
      i107 = 32;
      continue;
      i107 = 34;
    }
  }

  public e5(Reader paramReader)
  {
    a(zf.f);
    this.l = false;
    if (paramReader == null)
      throw new NullPointerException(z[11]);
    this.a = paramReader;
    if (n != 0)
      App.wc = 1 + App.wc;
  }

  private ag a(boolean paramBoolean)
    throws IOException
  {
    int n = m;
    ag localag;
    if (paramBoolean)
    {
      b(zf.b);
      if (n == 0);
    }
    else
    {
      switch (q())
      {
      default:
        throw b(z[20]);
      case 93:
        n();
        localag = ag.b;
        this.g = localag;
      case 59:
      case 44:
      }
    }
    while (true)
    {
      return localag;
      r();
      if (n != 0)
        break;
      switch (q())
      {
      default:
        this.d = (-1 + this.d);
        localag = p();
        break;
      case 93:
        if (paramBoolean)
        {
          n();
          localag = ag.b;
          this.g = localag;
        }
        break;
      case 44:
      case 59:
        r();
        this.d = (-1 + this.d);
        this.i = z[2];
        localag = ag.i;
        this.g = localag;
      }
    }
  }

  private ag a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int n = m;
    int i1 = paramArrayOfChar[paramInt1];
    int i2;
    if (i1 == 45)
    {
      i2 = paramInt1 + 1;
      i1 = paramArrayOfChar[i2];
    }
    while (true)
    {
      ag localag;
      if (i1 == 48)
      {
        i2++;
        i1 = paramArrayOfChar[i2];
        if (n == 0);
      }
      else
      {
        if ((i1 >= 49) && (i1 <= 57))
        {
          i2++;
          i1 = paramArrayOfChar[i2];
        }
        while ((i1 >= 48) && (i1 <= 57))
        {
          i2++;
          i1 = paramArrayOfChar[i2];
          if (n != 0)
          {
            localag = ag.f;
            return localag;
          }
        }
      }
      if (i1 == 46)
      {
        i2++;
        i1 = paramArrayOfChar[i2];
        do
        {
          if ((i1 < 48) || (i1 > 57))
            break;
          i2++;
          i1 = paramArrayOfChar[i2];
        }
        while (n == 0);
      }
      int i3 = i1;
      int i4 = i2;
      int i8;
      if ((i3 == 101) || (i3 == 69))
      {
        int i5 = i4 + 1;
        int i6 = paramArrayOfChar[i5];
        if ((i6 == 43) || (i6 == 45))
        {
          i5++;
          i6 = paramArrayOfChar[i5];
        }
        if ((i6 >= 48) && (i6 <= 57))
        {
          int i7 = i5 + 1;
          i8 = paramArrayOfChar[i7];
          i4 = i7;
        }
      }
      int i11;
      for (int i9 = i8; ; i9 = i11)
      {
        int i10;
        if ((i9 >= 48) && (i9 <= 57))
        {
          i10 = i4 + 1;
          i11 = paramArrayOfChar[i10];
          if (n == 0)
            break label306;
          localag = ag.f;
          break;
        }
        if (i4 == paramInt1 + paramInt2)
        {
          localag = ag.g;
          break;
        }
        localag = ag.f;
        break;
        label306: i4 = i10;
      }
      i2 = paramInt1;
    }
  }

  private String a(char paramChar)
    throws IOException
  {
    int n = m;
    Object localObject1 = null;
    int i1 = this.d;
    Object localObject2 = localObject1;
    label287: label302: int i6;
    for (int i2 = i1; ; i2 = i6)
    {
      int i8;
      Object localObject3;
      if (this.d < this.e)
      {
        char[] arrayOfChar = this.c;
        int i3 = this.d;
        this.d = (i3 + 1);
        char c1 = arrayOfChar[i3];
        if (c1 == paramChar)
        {
          String str;
          if (this.l)
            str = z[18];
          while (true)
          {
            return str;
            if (localObject2 == null)
            {
              str = new String(this.c, i2, -1 + (this.d - i2));
            }
            else
            {
              ((StringBuilder)localObject2).append(this.c, i2, -1 + (this.d - i2));
              str = ((StringBuilder)localObject2).toString();
            }
          }
        }
        if (c1 != '\\')
          break label287;
        if (localObject2 == null)
          localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append(this.c, i2, -1 + (this.d - i2));
        ((StringBuilder)localObject2).append(t());
        i8 = this.d;
        localObject3 = localObject2;
      }
      int i4;
      for (int i5 = i8; ; i5 = i4)
      {
        if (n == 0)
          break label302;
        int i7 = i5;
        localObject2 = localObject3;
        i2 = i7;
        if (localObject2 == null)
          localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append(this.c, i2, this.d - i2);
        if (!a(1))
          throw b(z[17]);
        localObject1 = localObject2;
        break;
        i4 = i2;
        localObject3 = localObject2;
      }
      i6 = i5;
      localObject2 = localObject3;
    }
  }

  private void a(ag paramag)
    throws IOException
  {
    f();
    if (this.g != paramag)
      throw new IllegalStateException(z[4] + paramag + z[3] + f());
    g();
  }

  private void a(zf paramzf)
  {
    this.f.add(paramzf);
  }

  private boolean a(int paramInt)
    throws IOException
  {
    boolean bool = false;
    int n = m;
    if (this.e != this.d)
    {
      this.e -= this.d;
      System.arraycopy(this.c, this.d, this.c, 0, this.e);
      if (n == 0);
    }
    else
    {
      this.e = 0;
    }
    this.d = 0;
    do
    {
      int i1 = this.a.read(this.c, this.e, this.c.length - this.e);
      if (i1 == -1)
        break;
      this.e = (i1 + this.e);
    }
    while (this.e < paramInt);
    bool = true;
    return bool;
  }

  private boolean a(String paramString)
    throws IOException
  {
    boolean bool = false;
    int n = m;
    if ((this.d + paramString.length() < this.e) || (a(paramString.length())))
    {
      int i1 = 0;
      do
      {
        if (i1 >= paramString.length())
          break;
        if ((this.c[(i1 + this.d)] != paramString.charAt(i1)) && (n == 0))
          break label81;
        i1++;
      }
      while (n == 0);
      bool = true;
    }
    while (true)
    {
      return bool;
      label81: this.d = (1 + this.d);
      if (n == 0)
        break;
    }
  }

  private ag b(boolean paramBoolean)
    throws IOException
  {
    int n = m;
    if (paramBoolean);
    ag localag;
    switch (q())
    {
    default:
      this.d = (-1 + this.d);
      if (n != 0)
        switch (q())
        {
        default:
          throw b(z[14]);
        case 125:
        case 44:
        case 59:
        }
      break;
    case 125:
      n();
      localag = ag.d;
      this.g = localag;
    }
    while (true)
    {
      return localag;
      n();
      localag = ag.d;
      this.g = localag;
      continue;
      if (n != 0)
        break;
      int i1 = q();
      switch (i1)
      {
      default:
      case 39:
      case 34:
      }
      do
      {
        r();
        this.d = (-1 + this.d);
        this.h = c(false);
        if (!this.h.isEmpty())
          break;
        throw b(z[13]);
        r();
        this.h = a((char)i1);
      }
      while (n != 0);
      b(zf.d);
      localag = ag.e;
      this.g = localag;
    }
  }

  private void b(zf paramzf)
  {
    this.f.set(-1 + this.f.size(), paramzf);
  }

  private String c(boolean paramBoolean)
    throws IOException
  {
    String str = null;
    int n = m;
    this.j = -1;
    this.k = 0;
    int i1 = 0;
    StringBuilder localStringBuilder = null;
    while (true)
    {
      if (i1 + this.d < this.e)
        switch (this.c[(i1 + this.d)])
        {
        default:
        case '#':
        case '/':
        case ';':
        case '=':
        case '\\':
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
        case ',':
        case ':':
        case '[':
        case ']':
        case '{':
        case '}':
        }
      while (true)
      {
        i1++;
        if (n == 0)
          break;
        if (i1 < this.c.length)
        {
          if ((a(i1 + 1)) && (n == 0))
            break;
          this.c[this.e] = '\000';
          if (n == 0)
            break label297;
        }
        if (localStringBuilder == null)
          localStringBuilder = new StringBuilder();
        localStringBuilder.append(this.c, this.d, i1);
        this.k = (i1 + this.k);
        this.d = (i1 + this.d);
        if (a(1))
          break label420;
        i1 = 0;
        label297: 
        do
        {
          if ((paramBoolean) && (localStringBuilder == null))
          {
            this.j = this.d;
            if (n == 0);
          }
          else if (this.l)
          {
            str = z[18];
            if (n == 0);
          }
          else if (localStringBuilder == null)
          {
            str = new String(this.c, this.d, i1);
            if (n == 0);
          }
          else
          {
            localStringBuilder.append(this.c, this.d, i1);
            str = localStringBuilder.toString();
          }
          this.k = (i1 + this.k);
          this.d = (i1 + this.d);
          return str;
          r();
        }
        while (n == 0);
      }
      label420: i1 = 0;
    }
  }

  private ag g()
    throws IOException
  {
    f();
    ag localag = this.g;
    this.g = null;
    this.i = null;
    this.h = null;
    return localag;
  }

  private zf m()
  {
    return (zf)this.f.get(-1 + this.f.size());
  }

  private zf n()
  {
    return (zf)this.f.remove(-1 + this.f.size());
  }

  private ag o()
    throws IOException
  {
    int n = m;
    switch (q())
    {
    case 59:
    case 60:
    default:
    case 58:
    case 61:
    }
    do
    {
      throw b(z[21]);
      if (n == 0)
        break;
      r();
      if (((this.d >= this.e) && (!a(1))) || (this.c[this.d] != '>'))
        break;
      this.d = (1 + this.d);
    }
    while (n != 0);
    b(zf.e);
    return p();
  }

  private ag p()
    throws IOException
  {
    int n = q();
    ag localag;
    switch (n)
    {
    default:
      this.d = (-1 + this.d);
      localag = u();
    case 123:
    case 91:
    case 39:
    case 34:
    }
    while (true)
    {
      return localag;
      a(zf.c);
      localag = ag.c;
      this.g = localag;
      continue;
      a(zf.a);
      localag = ag.a;
      this.g = localag;
      continue;
      r();
      this.i = a((char)n);
      localag = ag.f;
      this.g = localag;
    }
  }

  private int q()
    throws IOException
  {
    int n = m;
    if ((this.d < this.e) || (a(1)))
    {
      char[] arrayOfChar = this.c;
      int i1 = this.d;
      this.d = (i1 + 1);
      int i2 = arrayOfChar[i1];
      switch (i2)
      {
      default:
      case 9:
      case 10:
      case 13:
      case 32:
      case 47:
      case 35:
      }
      while (true)
      {
        return i2;
        if (n == 0)
          break;
        if ((this.d != this.e) || (a(1)))
        {
          r();
          switch (this.c[this.d])
          {
          default:
            break;
          case '*':
            this.d = (1 + this.d);
            if (!a(z[26]))
              throw b(z[25]);
            this.d = (2 + this.d);
            if (n == 0)
              break;
          case '/':
            this.d = (1 + this.d);
            s();
            if (n == 0)
              break;
            continue;
            r();
            s();
            if (n == 0)
              break;
          }
        }
      }
    }
    throw b(z[24]);
  }

  private void r()
    throws IOException
  {
    if (!this.b)
      throw b(z[16]);
  }

  private void s()
    throws IOException
  {
    int n = m;
    int i2;
    do
    {
      if ((this.d >= this.e) && (!a(1)))
        break;
      char[] arrayOfChar = this.c;
      int i1 = this.d;
      this.d = (i1 + 1);
      i2 = arrayOfChar[i1];
    }
    while ((i2 != 13) && ((i2 != 10) || (n != 0)) && (n == 0));
  }

  private char t()
    throws IOException
  {
    char c1 = '\f';
    if ((this.d == this.e) && (!a(1)))
      throw b(z[c1]);
    char[] arrayOfChar = this.c;
    int n = this.d;
    this.d = (n + 1);
    char c2 = arrayOfChar[n];
    switch (c2)
    {
    default:
      c1 = c2;
    case 'f':
    case 'u':
    case 't':
    case 'b':
    case 'n':
    case 'r':
    }
    while (true)
    {
      return c1;
      if ((4 + this.d > this.e) && (!a(4)))
        throw b(z[c1]);
      String str = new String(this.c, this.d, 4);
      this.d = (4 + this.d);
      c1 = (char)Integer.parseInt(str, 16);
      continue;
      c1 = '\t';
      continue;
      c1 = '\b';
      continue;
      c1 = '\n';
      continue;
      c1 = '\r';
    }
  }

  private ag u()
    throws IOException
  {
    this.i = c(true);
    if (this.k == 0)
      throw b(z[22]);
    this.g = v();
    if (this.g == ag.f)
      r();
    return this.g;
  }

  private ag v()
    throws IOException
  {
    ag localag;
    if (this.j == -1)
      localag = ag.f;
    while (true)
    {
      return localag;
      if ((this.k == 4) && (('n' == this.c[this.j]) || ('N' == this.c[this.j])) && (('u' == this.c[(1 + this.j)]) || ('U' == this.c[(1 + this.j)])) && (('l' == this.c[(2 + this.j)]) || ('L' == this.c[(2 + this.j)])) && (('l' == this.c[(3 + this.j)]) || ('L' == this.c[(3 + this.j)])))
      {
        this.i = z[2];
        localag = ag.i;
      }
      else if ((this.k == 4) && (('t' == this.c[this.j]) || ('T' == this.c[this.j])) && (('r' == this.c[(1 + this.j)]) || ('R' == this.c[(1 + this.j)])) && (('u' == this.c[(2 + this.j)]) || ('U' == this.c[(2 + this.j)])) && (('e' == this.c[(3 + this.j)]) || ('E' == this.c[(3 + this.j)])))
      {
        this.i = z[1];
        localag = ag.h;
      }
      else if ((this.k == 5) && (('f' == this.c[this.j]) || ('F' == this.c[this.j])) && (('a' == this.c[(1 + this.j)]) || ('A' == this.c[(1 + this.j)])) && (('l' == this.c[(2 + this.j)]) || ('L' == this.c[(2 + this.j)])) && (('s' == this.c[(3 + this.j)]) || ('S' == this.c[(3 + this.j)])) && (('e' == this.c[(4 + this.j)]) || ('E' == this.c[(4 + this.j)])))
      {
        this.i = z[0];
        localag = ag.h;
      }
      else
      {
        this.i = new String(this.c, this.j, this.k);
        localag = a(this.c, this.j, this.k);
      }
    }
  }

  private CharSequence w()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int n = Math.min(this.d, 20);
    localStringBuilder.append(this.c, this.d - n, n);
    int i1 = Math.min(this.e - this.d, 20);
    localStringBuilder.append(this.c, this.d, i1);
    return localStringBuilder;
  }

  public void a()
    throws IOException
  {
    a(ag.a);
  }

  public IOException b(String paramString)
    throws IOException
  {
    throw new of(paramString + z[6] + w() + z[9] + new String(this.c, 0, this.e), null);
  }

  public void b()
    throws IOException
  {
    a(ag.b);
  }

  public void c()
    throws IOException
  {
    a(ag.c);
  }

  public void close()
    throws IOException
  {
    this.i = null;
    this.g = null;
    this.f.clear();
    this.f.add(zf.h);
    try
    {
      this.a.close();
      return;
    }
    catch (SSLProtocolException localSSLProtocolException)
    {
      while (true)
        g5.c(z[15] + localSSLProtocolException.toString());
    }
  }

  public void d()
    throws IOException
  {
    a(ag.d);
  }

  public boolean e()
    throws IOException
  {
    f();
    if ((this.g != ag.d) && (this.g != ag.b));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public ag f()
    throws IOException
  {
    ag localag;
    if (this.g != null)
      localag = this.g;
    while (true)
    {
      return localag;
      switch (f5.a[m().ordinal()])
      {
      default:
        throw new AssertionError();
      case 1:
        b(zf.g);
        localag = p();
        if ((this.g != ag.a) && (this.g != ag.c))
          throw new IOException(z[8] + this.g);
        break;
      case 2:
        localag = a(true);
        break;
      case 3:
        localag = a(false);
        break;
      case 4:
        localag = b(true);
        break;
      case 5:
        localag = o();
        break;
      case 6:
        localag = b(false);
        break;
      case 7:
        localag = ag.j;
        this.g = localag;
      case 8:
      }
    }
    throw new IllegalStateException(z[7]);
  }

  public String h()
    throws IOException
  {
    f();
    if (this.g != ag.e)
      throw new IllegalStateException(z[19] + f());
    String str = this.h;
    g();
    return str;
  }

  public String i()
    throws IOException
  {
    f();
    if ((this.g != ag.f) && (this.g != ag.g))
      throw new IllegalStateException(z[5] + f());
    String str = this.i;
    g();
    return str;
  }

  public boolean j()
    throws IOException
  {
    boolean bool = true;
    f();
    if (this.g != ag.h)
      throw new IllegalStateException(z[10] + this.g);
    if (this.i == z[bool]);
    while (true)
    {
      g();
      return bool;
      bool = false;
    }
  }

  public int k()
    throws IOException
  {
    f();
    if ((this.g != ag.f) && (this.g != ag.g))
      throw new IllegalStateException(z[23] + this.g);
    try
    {
      int i1 = Integer.parseInt(this.i);
      n = i1;
      g();
      return n;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      int n;
      double d1;
      do
      {
        d1 = Double.parseDouble(this.i);
        n = (int)d1;
      }
      while (n == d1);
    }
    throw new NumberFormatException(this.i);
  }

  public void l()
    throws IOException
  {
    int n = m;
    this.l = true;
    int i1 = 0;
    while (true)
    {
      try
      {
        ag localag1 = g();
        if ((localag1 != ag.a) && (localag1 != ag.c))
        {
          if (localag1 != ag.b)
          {
            ag localag2 = ag.d;
            if (localag1 != localag2);
          }
          else
          {
            i1--;
          }
          if (i1 != 0)
            continue;
          this.l = false;
          if (App.wc != 0)
            m = n + 1;
          return;
        }
      }
      finally
      {
        this.l = false;
      }
      i1++;
      if (n == 0);
    }
  }

  public String toString()
  {
    return getClass().getSimpleName() + z[6] + w();
  }
}