package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class ue extends CursorAdapter
{
  private static final String[] z;
  private Object a;
  private int b;
  final Conversation c;

  static
  {
    String[] arrayOfString = new String[14];
    char[] arrayOfChar1 = "o_\031h8+G\007b`".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "hE\032s$yY\025q(dD\025a {^\021wnlO��l5nG[u.xC��l.e\005\035k7jF\035aa".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\"\nTv(qON".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label704;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "+\002".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label792;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "B\021kagE\025aamX\033haE\004%{".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label880;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "gE\025aamX\033hafC\020a-n\020".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label968;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "hE\030i {Y\021Z,nY\007d&n\005\004w$}\005\031l2xC\032blyG��(2yIN".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label1056;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "hE\030i {Y\021Z,nY\007d&n\005\032`9\005\031l2xC\032blyG��(2yIN".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1144;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "+VT".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1232;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "H_\006v.yc\032a$se\001q\016mh\033p/oY1}\"nZ��l.e\020".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1320;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "hE\032s$yY\025q(dD[b$\\\035`6$X\033rabYTk4gFU%,xMI".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label1408;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "gK\rj4u\035k'gK��`3".toCharArray();
        int i40 = arrayOfChar12.length;
        i41 = 0;
        if (i40 > i41)
          break label1496;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "hE\032s$yY\025q(dD[d%a_\007q\"jI\034`njZ\004`/oO\020".toCharArray();
        int i44 = arrayOfChar13.length;
        i45 = 0;
        if (i44 > i45)
          break label1584;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "hE\032s$yY\025q(dD\025a {^\021wneO\003%1jX\025habYTk4gFU".toCharArray();
        int i48 = arrayOfChar14.length;
        i49 = 0;
        if (i48 > i49)
          break label1672;
        arrayOfString[13] = new String(arrayOfChar14).intern();
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
        m = 65;
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
        m = 11;
        continue;
        m = 42;
        continue;
        m = 116;
        continue;
        m = 5;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 65;
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
      i3 = 11;
      continue;
      i3 = 42;
      continue;
      i3 = 116;
      continue;
      i3 = 5;
    }
    label704: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 65;
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
      i7 = 11;
      continue;
      i7 = 42;
      continue;
      i7 = 116;
      continue;
      i7 = 5;
    }
    label792: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 65;
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
      i11 = 11;
      continue;
      i11 = 42;
      continue;
      i11 = 116;
      continue;
      i11 = 5;
    }
    label880: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 65;
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
      i15 = 11;
      continue;
      i15 = 42;
      continue;
      i15 = 116;
      continue;
      i15 = 5;
    }
    label968: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 65;
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
      i19 = 11;
      continue;
      i19 = 42;
      continue;
      i19 = 116;
      continue;
      i19 = 5;
    }
    label1056: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 65;
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
      i23 = 11;
      continue;
      i23 = 42;
      continue;
      i23 = 116;
      continue;
      i23 = 5;
    }
    label1144: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 65;
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
      i27 = 11;
      continue;
      i27 = 42;
      continue;
      i27 = 116;
      continue;
      i27 = 5;
    }
    label1232: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 65;
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
      i31 = 11;
      continue;
      i31 = 42;
      continue;
      i31 = 116;
      continue;
      i31 = 5;
    }
    label1320: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 65;
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
      i35 = 11;
      continue;
      i35 = 42;
      continue;
      i35 = 116;
      continue;
      i35 = 5;
    }
    label1408: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 65;
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
      i39 = 11;
      continue;
      i39 = 42;
      continue;
      i39 = 116;
      continue;
      i39 = 5;
    }
    label1496: int i42 = arrayOfChar12[i41];
    int i43;
    switch (i41 % 5)
    {
    default:
      i43 = 65;
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
      i43 = 11;
      continue;
      i43 = 42;
      continue;
      i43 = 116;
      continue;
      i43 = 5;
    }
    label1584: int i46 = arrayOfChar13[i45];
    int i47;
    switch (i45 % 5)
    {
    default:
      i47 = 65;
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
      i47 = 11;
      continue;
      i47 = 42;
      continue;
      i47 = 116;
      continue;
      i47 = 5;
    }
    label1672: int i50 = arrayOfChar14[i49];
    int i51;
    switch (i49 % 5)
    {
    default:
      i51 = 65;
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
      i51 = 11;
      continue;
      i51 = 42;
      continue;
      i51 = 116;
      continue;
      i51 = 5;
    }
  }

  public ue(Conversation paramConversation, Context paramContext, Cursor paramCursor, boolean paramBoolean)
  {
    super(paramContext, paramCursor, paramBoolean);
  }

  private int a()
  {
    return getCursor().getCount() - Conversation.d(this.c);
  }

  private int a(sz paramsz, boolean paramBoolean, dj paramdj)
  {
    TextPaint localTextPaint = new TextPaint();
    localTextPaint.setTextSize(this.c.getResources().getDimension(2131361818));
    int i = 0 + a(t4.b(this.c.getBaseContext(), paramsz.i) + " ", localTextPaint);
    localTextPaint.setTextSize(this.c.getResources().getDimension(2131361817));
    int j = i + a(paramsz.b(), localTextPaint);
    int k;
    if (paramBoolean)
    {
      localTextPaint.setTextSize(this.c.getResources().getDimension(2131361819));
      k = a(App.w.a(paramsz.c, null).b(), localTextPaint);
      paramdj.c = (k + Conversation.m(this.c).R);
      if (k <= j);
    }
    while (true)
    {
      return k + Conversation.m(this.c).W;
      k = j;
      continue;
      k = j;
    }
  }

  static int a(ue paramue)
  {
    return paramue.a();
  }

  private int a(String paramString, TextPaint paramTextPaint)
  {
    int i = 0;
    boolean bool = DialogToastListActivity.f;
    if (paramString == null);
    while (true)
    {
      return i;
      float f = 0.0F;
      float[] arrayOfFloat = new float[paramString.length()];
      paramTextPaint.getTextWidths(paramString, 0, paramString.length(), arrayOfFloat);
      do
      {
        if (i >= arrayOfFloat.length)
          break;
        f += arrayOfFloat[i];
        i++;
      }
      while (!bool);
      i = (int)f;
    }
  }

  private void a(int paramInt)
  {
    boolean bool = DialogToastListActivity.f;
    int i = getCursor().getCount();
    if (paramInt < i);
    int m;
    for (int k = paramInt; ; k = m)
      if (k < i)
      {
        if ((sz)Conversation.f(this.c).get(Integer.valueOf(k)) != null)
          Conversation.f(this.c).remove(Integer.valueOf(k));
        m = k + 1;
        if (!bool);
      }
      else
      {
        if (bool)
        {
          g5.c(z[12]);
          int j = paramInt - i;
          Conversation.e(this.c).remove(j);
        }
        return;
      }
  }

  private void a(dj paramdj, int paramInt, boolean paramBoolean)
  {
    boolean bool = DialogToastListActivity.f;
    while (true)
    {
      if (paramdj != null)
      {
        paramdj.a(paramInt);
        if (!paramBoolean)
          break label30;
      }
      label30: for (dj localdj = paramdj.e; bool; localdj = paramdj.f)
        return;
      paramdj = localdj;
    }
  }

  static void a(ue paramue, int paramInt)
  {
    paramue.a(paramInt);
  }

  // ERROR //
  private void a(ze paramze, int paramInt, sz paramsz1, sz paramsz2, sz paramsz3, boolean paramBoolean)
  {
    // Byte code:
    //   0: getstatic 177	com/whatsapp/DialogToastListActivity:f	Z
    //   3: istore 7
    //   5: iconst_0
    //   6: istore 8
    //   8: aload 4
    //   10: ifnull +88 -> 98
    //   13: aload 4
    //   15: getfield 234	com/whatsapp/sz:l	B
    //   18: ifne +80 -> 98
    //   21: aload 4
    //   23: getfield 237	com/whatsapp/sz:b	Lcom/whatsapp/uz;
    //   26: getfield 241	com/whatsapp/uz:b	Z
    //   29: ifne +69 -> 98
    //   32: iload 6
    //   34: ifeq +64 -> 98
    //   37: aload 4
    //   39: getfield 143	com/whatsapp/sz:c	Ljava/lang/String;
    //   42: ifnull +26 -> 68
    //   45: aload 4
    //   47: getfield 143	com/whatsapp/sz:c	Ljava/lang/String;
    //   50: aload_3
    //   51: getfield 143	com/whatsapp/sz:c	Ljava/lang/String;
    //   54: invokevirtual 245	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   57: ifeq +41 -> 98
    //   60: iconst_1
    //   61: istore 8
    //   63: iload 7
    //   65: ifeq +33 -> 98
    //   68: new 102	java/lang/StringBuilder
    //   71: dup
    //   72: invokespecial 103	java/lang/StringBuilder:<init>	()V
    //   75: getstatic 58	com/whatsapp/ue:z	[Ljava/lang/String;
    //   78: bipush 6
    //   80: aaload
    //   81: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: aload 4
    //   86: invokestatic 248	com/whatsapp/g5:a	(Lcom/whatsapp/sz;)Ljava/lang/String;
    //   89: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   95: invokestatic 250	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   98: iload 8
    //   100: istore 9
    //   102: aload 5
    //   104: ifnull +1360 -> 1464
    //   107: aload 5
    //   109: getfield 113	com/whatsapp/sz:i	J
    //   112: aload_3
    //   113: getfield 113	com/whatsapp/sz:i	J
    //   116: invokestatic 253	com/whatsapp/t4:b	(JJ)Z
    //   119: istore 10
    //   121: aload 5
    //   123: ifnull +2006 -> 2129
    //   126: aload 5
    //   128: getfield 234	com/whatsapp/sz:l	B
    //   131: ifne +1998 -> 2129
    //   134: aload 5
    //   136: getfield 237	com/whatsapp/sz:b	Lcom/whatsapp/uz;
    //   139: getfield 241	com/whatsapp/uz:b	Z
    //   142: ifne +1987 -> 2129
    //   145: iload 10
    //   147: ifeq +1982 -> 2129
    //   150: aload 5
    //   152: getfield 143	com/whatsapp/sz:c	Ljava/lang/String;
    //   155: ifnull +1980 -> 2135
    //   158: aload 5
    //   160: getfield 143	com/whatsapp/sz:c	Ljava/lang/String;
    //   163: aload_3
    //   164: getfield 143	com/whatsapp/sz:c	Ljava/lang/String;
    //   167: invokevirtual 245	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   170: ifeq +1959 -> 2129
    //   173: iconst_1
    //   174: istore 112
    //   176: iload 7
    //   178: ifeq +33 -> 211
    //   181: new 102	java/lang/StringBuilder
    //   184: dup
    //   185: invokespecial 103	java/lang/StringBuilder:<init>	()V
    //   188: getstatic 58	com/whatsapp/ue:z	[Ljava/lang/String;
    //   191: bipush 7
    //   193: aaload
    //   194: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: aload 5
    //   199: invokestatic 248	com/whatsapp/g5:a	(Lcom/whatsapp/sz;)Ljava/lang/String;
    //   202: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   208: invokestatic 250	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   211: iload 112
    //   213: istore 11
    //   215: iload 9
    //   217: ifeq +1891 -> 2108
    //   220: iload 11
    //   222: ifeq +1886 -> 2108
    //   225: new 102	java/lang/StringBuilder
    //   228: dup
    //   229: invokespecial 103	java/lang/StringBuilder:<init>	()V
    //   232: getstatic 58	com/whatsapp/ue:z	[Ljava/lang/String;
    //   235: iconst_5
    //   236: aaload
    //   237: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   240: iload_2
    //   241: invokevirtual 256	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   244: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   247: invokestatic 258	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   250: iload_2
    //   251: iconst_1
    //   252: isub
    //   253: istore 63
    //   255: aload 4
    //   257: astore 64
    //   259: aload_3
    //   260: astore 65
    //   262: iload 63
    //   264: istore 66
    //   266: iload 9
    //   268: istore 67
    //   270: aload 5
    //   272: astore 68
    //   274: iload 67
    //   276: ifeq +1809 -> 2085
    //   279: iload 66
    //   281: iflt +1793 -> 2074
    //   284: iload 66
    //   286: iconst_1
    //   287: isub
    //   288: istore 104
    //   290: aload_0
    //   291: iload 104
    //   293: invokevirtual 261	com/whatsapp/ue:getItem	(I)Ljava/lang/Object;
    //   296: checkcast 109	com/whatsapp/sz
    //   299: astore 105
    //   301: iload 104
    //   303: istore 70
    //   305: aload 105
    //   307: astore 72
    //   309: aload 72
    //   311: ifnull +1226 -> 1537
    //   314: aload 72
    //   316: getfield 113	com/whatsapp/sz:i	J
    //   319: aload 64
    //   321: getfield 113	com/whatsapp/sz:i	J
    //   324: invokestatic 253	com/whatsapp/t4:b	(JJ)Z
    //   327: istore 106
    //   329: aload 72
    //   331: ifnull +51 -> 382
    //   334: aload 72
    //   336: getfield 234	com/whatsapp/sz:l	B
    //   339: ifne +43 -> 382
    //   342: aload 72
    //   344: getfield 237	com/whatsapp/sz:b	Lcom/whatsapp/uz;
    //   347: getfield 241	com/whatsapp/uz:b	Z
    //   350: ifne +32 -> 382
    //   353: iload 106
    //   355: ifeq +27 -> 382
    //   358: aload 72
    //   360: getfield 143	com/whatsapp/sz:c	Ljava/lang/String;
    //   363: aload 64
    //   365: getfield 143	com/whatsapp/sz:c	Ljava/lang/String;
    //   368: invokevirtual 245	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   371: ifeq +11 -> 382
    //   374: iconst_1
    //   375: istore 107
    //   377: iload 7
    //   379: ifeq +1637 -> 2016
    //   382: iconst_0
    //   383: istore 107
    //   385: iload 7
    //   387: ifeq +1629 -> 2016
    //   390: aload 65
    //   392: astore 71
    //   394: aload 64
    //   396: astore 65
    //   398: iconst_0
    //   399: istore 73
    //   401: iload 70
    //   403: iconst_1
    //   404: iadd
    //   405: istore 74
    //   407: new 102	java/lang/StringBuilder
    //   410: dup
    //   411: invokespecial 103	java/lang/StringBuilder:<init>	()V
    //   414: getstatic 58	com/whatsapp/ue:z	[Ljava/lang/String;
    //   417: iconst_4
    //   418: aaload
    //   419: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   422: iload 74
    //   424: invokevirtual 256	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   427: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   430: invokestatic 258	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   433: new 163	com/whatsapp/dj
    //   436: dup
    //   437: iconst_1
    //   438: aload 65
    //   440: invokespecial 264	com/whatsapp/dj:<init>	(ILcom/whatsapp/sz;)V
    //   443: astore 75
    //   445: aload_0
    //   446: aload 65
    //   448: iconst_1
    //   449: aload 75
    //   451: invokespecial 266	com/whatsapp/ue:a	(Lcom/whatsapp/sz;ZLcom/whatsapp/dj;)I
    //   454: istore 76
    //   456: new 163	com/whatsapp/dj
    //   459: dup
    //   460: aload 75
    //   462: iconst_1
    //   463: aload 71
    //   465: invokespecial 269	com/whatsapp/dj:<init>	(Lcom/whatsapp/dj;ZLcom/whatsapp/sz;)V
    //   468: astore 77
    //   470: aload 75
    //   472: aload 77
    //   474: putfield 225	com/whatsapp/dj:f	Lcom/whatsapp/dj;
    //   477: getstatic 273	com/whatsapp/Conversation:j	Ljava/util/HashMap;
    //   480: aload 65
    //   482: getfield 237	com/whatsapp/sz:b	Lcom/whatsapp/uz;
    //   485: aload 75
    //   487: invokevirtual 277	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   490: pop
    //   491: aconst_null
    //   492: astore 79
    //   494: iload 74
    //   496: iconst_1
    //   497: iadd
    //   498: istore 80
    //   500: aload 65
    //   502: astore 81
    //   504: iload 76
    //   506: istore 82
    //   508: aload 71
    //   510: astore 83
    //   512: iload 80
    //   514: istore 84
    //   516: aload 83
    //   518: astore 85
    //   520: iload 11
    //   522: ifeq +1415 -> 1937
    //   525: aload 85
    //   527: ifnonnull +8 -> 535
    //   530: iload 7
    //   532: ifeq +1405 -> 1937
    //   535: aload_0
    //   536: aload 85
    //   538: iconst_0
    //   539: aconst_null
    //   540: invokespecial 266	com/whatsapp/ue:a	(Lcom/whatsapp/sz;ZLcom/whatsapp/dj;)I
    //   543: istore 90
    //   545: aload 79
    //   547: ifnull +1383 -> 1930
    //   550: new 163	com/whatsapp/dj
    //   553: dup
    //   554: aload 79
    //   556: iconst_1
    //   557: aload 85
    //   559: invokespecial 269	com/whatsapp/dj:<init>	(Lcom/whatsapp/dj;ZLcom/whatsapp/sz;)V
    //   562: astore 91
    //   564: aload 79
    //   566: aload 91
    //   568: putfield 225	com/whatsapp/dj:f	Lcom/whatsapp/dj;
    //   571: aload 91
    //   573: astore 79
    //   575: iload 90
    //   577: iload 82
    //   579: if_icmple +964 -> 1543
    //   582: iload 90
    //   584: istore 92
    //   586: getstatic 273	com/whatsapp/Conversation:j	Ljava/util/HashMap;
    //   589: aload 85
    //   591: getfield 237	com/whatsapp/sz:b	Lcom/whatsapp/uz;
    //   594: aload 79
    //   596: invokevirtual 277	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   599: pop
    //   600: aconst_null
    //   601: astore 89
    //   603: iload 84
    //   605: iflt +1401 -> 2006
    //   608: iload 84
    //   610: iconst_1
    //   611: iadd
    //   612: istore 101
    //   614: aload_0
    //   615: iload 101
    //   617: invokevirtual 261	com/whatsapp/ue:getItem	(I)Ljava/lang/Object;
    //   620: checkcast 109	com/whatsapp/sz
    //   623: astore 95
    //   625: iload 101
    //   627: istore 94
    //   629: aload 95
    //   631: astore 96
    //   633: iload 94
    //   635: istore 97
    //   637: aload 96
    //   639: ifnull +983 -> 1622
    //   642: aload 96
    //   644: getfield 113	com/whatsapp/sz:i	J
    //   647: aload 85
    //   649: getfield 113	com/whatsapp/sz:i	J
    //   652: invokestatic 253	com/whatsapp/t4:b	(JJ)Z
    //   655: istore 98
    //   657: aload 96
    //   659: ifnull +51 -> 710
    //   662: aload 96
    //   664: getfield 234	com/whatsapp/sz:l	B
    //   667: ifne +43 -> 710
    //   670: aload 96
    //   672: getfield 237	com/whatsapp/sz:b	Lcom/whatsapp/uz;
    //   675: getfield 241	com/whatsapp/uz:b	Z
    //   678: ifne +32 -> 710
    //   681: iload 98
    //   683: ifeq +27 -> 710
    //   686: aload 96
    //   688: getfield 143	com/whatsapp/sz:c	Ljava/lang/String;
    //   691: aload 85
    //   693: getfield 143	com/whatsapp/sz:c	Ljava/lang/String;
    //   696: invokevirtual 245	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   699: ifeq +11 -> 710
    //   702: iconst_1
    //   703: istore 99
    //   705: iload 7
    //   707: ifeq +6 -> 713
    //   710: iconst_0
    //   711: istore 99
    //   713: iload 99
    //   715: ifeq +913 -> 1628
    //   718: iconst_2
    //   719: istore 100
    //   721: aload 79
    //   723: iload 100
    //   725: putfield 279	com/whatsapp/dj:a	I
    //   728: iload 7
    //   730: ifeq +1230 -> 1960
    //   733: iload 99
    //   735: istore 87
    //   737: aload 96
    //   739: astore 89
    //   741: iload 92
    //   743: istore 82
    //   745: iload 97
    //   747: istore 86
    //   749: aload_1
    //   750: iconst_2
    //   751: putfield 283	com/whatsapp/ze:m	I
    //   754: aload_1
    //   755: invokevirtual 285	com/whatsapp/ze:f	()V
    //   758: aload_0
    //   759: aload 75
    //   761: iload 82
    //   763: iconst_0
    //   764: invokespecial 287	com/whatsapp/ue:a	(Lcom/whatsapp/dj;IZ)V
    //   767: iload 7
    //   769: ifeq +694 -> 1463
    //   772: iload 87
    //   774: istore 11
    //   776: iload 73
    //   778: istore 12
    //   780: aload 85
    //   782: astore 15
    //   784: aload 89
    //   786: astore 13
    //   788: iload 86
    //   790: istore 16
    //   792: aload 72
    //   794: astore 14
    //   796: iload 12
    //   798: ifeq +344 -> 1142
    //   801: iload 11
    //   803: ifne +339 -> 1142
    //   806: new 163	com/whatsapp/dj
    //   809: dup
    //   810: iconst_3
    //   811: aload 15
    //   813: invokespecial 264	com/whatsapp/dj:<init>	(ILcom/whatsapp/sz;)V
    //   816: astore 38
    //   818: aload_0
    //   819: aload 15
    //   821: iconst_1
    //   822: aload 38
    //   824: invokespecial 266	com/whatsapp/ue:a	(Lcom/whatsapp/sz;ZLcom/whatsapp/dj;)I
    //   827: istore 39
    //   829: new 163	com/whatsapp/dj
    //   832: dup
    //   833: aload 38
    //   835: iconst_0
    //   836: aload 14
    //   838: invokespecial 269	com/whatsapp/dj:<init>	(Lcom/whatsapp/dj;ZLcom/whatsapp/sz;)V
    //   841: astore 40
    //   843: aload 38
    //   845: aload 40
    //   847: putfield 223	com/whatsapp/dj:e	Lcom/whatsapp/dj;
    //   850: getstatic 273	com/whatsapp/Conversation:j	Ljava/util/HashMap;
    //   853: aload 15
    //   855: getfield 237	com/whatsapp/sz:b	Lcom/whatsapp/uz;
    //   858: aload 38
    //   860: invokevirtual 277	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   863: pop
    //   864: aconst_null
    //   865: astore 42
    //   867: iload 16
    //   869: iconst_1
    //   870: isub
    //   871: istore 43
    //   873: iload 39
    //   875: istore 44
    //   877: iload 12
    //   879: istore 45
    //   881: iload 43
    //   883: istore 46
    //   885: aload 40
    //   887: astore 47
    //   889: iload 45
    //   891: ifeq +964 -> 1855
    //   894: aload 14
    //   896: ifnonnull +8 -> 904
    //   899: iload 7
    //   901: ifeq +954 -> 1855
    //   904: aload_0
    //   905: aload 14
    //   907: iconst_0
    //   908: aconst_null
    //   909: invokespecial 266	com/whatsapp/ue:a	(Lcom/whatsapp/sz;ZLcom/whatsapp/dj;)I
    //   912: istore 48
    //   914: aload 42
    //   916: ifnull +932 -> 1848
    //   919: new 163	com/whatsapp/dj
    //   922: dup
    //   923: aload 42
    //   925: iconst_0
    //   926: aload 14
    //   928: invokespecial 269	com/whatsapp/dj:<init>	(Lcom/whatsapp/dj;ZLcom/whatsapp/sz;)V
    //   931: astore 49
    //   933: aload 42
    //   935: aload 49
    //   937: putfield 223	com/whatsapp/dj:e	Lcom/whatsapp/dj;
    //   940: aload 49
    //   942: astore 42
    //   944: iload 48
    //   946: iload 44
    //   948: if_icmple +686 -> 1634
    //   951: iload 48
    //   953: istore 50
    //   955: getstatic 273	com/whatsapp/Conversation:j	Ljava/util/HashMap;
    //   958: aload 14
    //   960: getfield 237	com/whatsapp/sz:b	Lcom/whatsapp/uz;
    //   963: aload 42
    //   965: invokevirtual 277	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   968: pop
    //   969: iload 46
    //   971: iflt +949 -> 1920
    //   974: iload 46
    //   976: iconst_1
    //   977: isub
    //   978: istore 55
    //   980: aload_0
    //   981: iload 55
    //   983: invokevirtual 261	com/whatsapp/ue:getItem	(I)Ljava/lang/Object;
    //   986: checkcast 109	com/whatsapp/sz
    //   989: astore 53
    //   991: iload 55
    //   993: istore 52
    //   995: aload 53
    //   997: astore 54
    //   999: iload 52
    //   1001: istore 55
    //   1003: aload 54
    //   1005: ifnull +704 -> 1709
    //   1008: aload 54
    //   1010: getfield 113	com/whatsapp/sz:i	J
    //   1013: aload 14
    //   1015: getfield 113	com/whatsapp/sz:i	J
    //   1018: invokestatic 253	com/whatsapp/t4:b	(JJ)Z
    //   1021: istore 56
    //   1023: aload 54
    //   1025: ifnull +51 -> 1076
    //   1028: aload 54
    //   1030: getfield 234	com/whatsapp/sz:l	B
    //   1033: ifne +43 -> 1076
    //   1036: aload 54
    //   1038: getfield 237	com/whatsapp/sz:b	Lcom/whatsapp/uz;
    //   1041: getfield 241	com/whatsapp/uz:b	Z
    //   1044: ifne +32 -> 1076
    //   1047: iload 56
    //   1049: ifeq +27 -> 1076
    //   1052: aload 54
    //   1054: getfield 143	com/whatsapp/sz:c	Ljava/lang/String;
    //   1057: aload 14
    //   1059: getfield 143	com/whatsapp/sz:c	Ljava/lang/String;
    //   1062: invokevirtual 245	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1065: ifeq +11 -> 1076
    //   1068: iconst_1
    //   1069: istore 57
    //   1071: iload 7
    //   1073: ifeq +6 -> 1079
    //   1076: iconst_0
    //   1077: istore 57
    //   1079: iload 57
    //   1081: ifeq +634 -> 1715
    //   1084: iconst_2
    //   1085: istore 58
    //   1087: aload 42
    //   1089: iload 58
    //   1091: putfield 279	com/whatsapp/dj:a	I
    //   1094: iload 7
    //   1096: ifeq +770 -> 1866
    //   1099: iload 57
    //   1101: istore 12
    //   1103: aload 14
    //   1105: astore 15
    //   1107: iload 50
    //   1109: istore 60
    //   1111: iload 55
    //   1113: istore 16
    //   1115: iload 60
    //   1117: istore 44
    //   1119: aload_1
    //   1120: iconst_3
    //   1121: putfield 283	com/whatsapp/ze:m	I
    //   1124: aload_1
    //   1125: invokevirtual 285	com/whatsapp/ze:f	()V
    //   1128: aload_0
    //   1129: aload 38
    //   1131: iload 44
    //   1133: iconst_1
    //   1134: invokespecial 287	com/whatsapp/ue:a	(Lcom/whatsapp/dj;IZ)V
    //   1137: iload 7
    //   1139: ifeq +324 -> 1463
    //   1142: iload 16
    //   1144: istore 17
    //   1146: iload 12
    //   1148: ifne +315 -> 1463
    //   1151: iload 11
    //   1153: ifeq +310 -> 1463
    //   1156: new 163	com/whatsapp/dj
    //   1159: dup
    //   1160: iconst_1
    //   1161: aload 15
    //   1163: invokespecial 264	com/whatsapp/dj:<init>	(ILcom/whatsapp/sz;)V
    //   1166: astore 18
    //   1168: aload_0
    //   1169: aload 15
    //   1171: iconst_1
    //   1172: aload 18
    //   1174: invokespecial 266	com/whatsapp/ue:a	(Lcom/whatsapp/sz;ZLcom/whatsapp/dj;)I
    //   1177: istore 19
    //   1179: new 163	com/whatsapp/dj
    //   1182: dup
    //   1183: aload 18
    //   1185: iconst_1
    //   1186: aload 13
    //   1188: invokespecial 269	com/whatsapp/dj:<init>	(Lcom/whatsapp/dj;ZLcom/whatsapp/sz;)V
    //   1191: astore 20
    //   1193: aload 18
    //   1195: aload 20
    //   1197: putfield 225	com/whatsapp/dj:f	Lcom/whatsapp/dj;
    //   1200: getstatic 273	com/whatsapp/Conversation:j	Ljava/util/HashMap;
    //   1203: aload 15
    //   1205: getfield 237	com/whatsapp/sz:b	Lcom/whatsapp/uz;
    //   1208: aload 18
    //   1210: invokevirtual 277	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1213: pop
    //   1214: aconst_null
    //   1215: astore 22
    //   1217: iload 17
    //   1219: iconst_1
    //   1220: iadd
    //   1221: istore 23
    //   1223: iload 11
    //   1225: istore 24
    //   1227: aload 13
    //   1229: astore 25
    //   1231: iload 24
    //   1233: ifeq +212 -> 1445
    //   1236: aload 25
    //   1238: ifnonnull +8 -> 1246
    //   1241: iload 7
    //   1243: ifeq +202 -> 1445
    //   1246: aload_0
    //   1247: aload 25
    //   1249: iconst_0
    //   1250: aconst_null
    //   1251: invokespecial 266	com/whatsapp/ue:a	(Lcom/whatsapp/sz;ZLcom/whatsapp/dj;)I
    //   1254: istore 26
    //   1256: aload 22
    //   1258: ifnull +554 -> 1812
    //   1261: new 163	com/whatsapp/dj
    //   1264: dup
    //   1265: aload 22
    //   1267: iconst_1
    //   1268: aload 25
    //   1270: invokespecial 269	com/whatsapp/dj:<init>	(Lcom/whatsapp/dj;ZLcom/whatsapp/sz;)V
    //   1273: astore 27
    //   1275: aload 22
    //   1277: aload 27
    //   1279: putfield 225	com/whatsapp/dj:f	Lcom/whatsapp/dj;
    //   1282: aload 27
    //   1284: astore 22
    //   1286: iload 26
    //   1288: iload 19
    //   1290: if_icmple +431 -> 1721
    //   1293: iload 26
    //   1295: istore 28
    //   1297: getstatic 273	com/whatsapp/Conversation:j	Ljava/util/HashMap;
    //   1300: aload 25
    //   1302: getfield 237	com/whatsapp/sz:b	Lcom/whatsapp/uz;
    //   1305: aload 22
    //   1307: invokevirtual 277	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1310: pop
    //   1311: iload 23
    //   1313: iflt +525 -> 1838
    //   1316: iload 23
    //   1318: iconst_1
    //   1319: iadd
    //   1320: istore 36
    //   1322: aload_0
    //   1323: iload 36
    //   1325: invokevirtual 261	com/whatsapp/ue:getItem	(I)Ljava/lang/Object;
    //   1328: checkcast 109	com/whatsapp/sz
    //   1331: astore 31
    //   1333: iload 36
    //   1335: istore 30
    //   1337: aload 31
    //   1339: astore 32
    //   1341: iload 30
    //   1343: istore 33
    //   1345: aload 32
    //   1347: ifnull +453 -> 1800
    //   1350: aload 32
    //   1352: getfield 113	com/whatsapp/sz:i	J
    //   1355: aload 25
    //   1357: getfield 113	com/whatsapp/sz:i	J
    //   1360: invokestatic 253	com/whatsapp/t4:b	(JJ)Z
    //   1363: istore 34
    //   1365: aload 32
    //   1367: ifnull +51 -> 1418
    //   1370: aload 32
    //   1372: getfield 234	com/whatsapp/sz:l	B
    //   1375: ifne +43 -> 1418
    //   1378: aload 32
    //   1380: getfield 237	com/whatsapp/sz:b	Lcom/whatsapp/uz;
    //   1383: getfield 241	com/whatsapp/uz:b	Z
    //   1386: ifne +32 -> 1418
    //   1389: iload 34
    //   1391: ifeq +27 -> 1418
    //   1394: aload 32
    //   1396: getfield 143	com/whatsapp/sz:c	Ljava/lang/String;
    //   1399: aload 25
    //   1401: getfield 143	com/whatsapp/sz:c	Ljava/lang/String;
    //   1404: invokevirtual 245	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1407: ifeq +11 -> 1418
    //   1410: iconst_1
    //   1411: istore 24
    //   1413: iload 7
    //   1415: ifeq +6 -> 1421
    //   1418: iconst_0
    //   1419: istore 24
    //   1421: iload 24
    //   1423: ifeq +383 -> 1806
    //   1426: iconst_2
    //   1427: istore 35
    //   1429: aload 22
    //   1431: iload 35
    //   1433: putfield 279	com/whatsapp/dj:a	I
    //   1436: iload 7
    //   1438: ifeq +381 -> 1819
    //   1441: iload 28
    //   1443: istore 19
    //   1445: aload_1
    //   1446: iconst_1
    //   1447: putfield 283	com/whatsapp/ze:m	I
    //   1450: aload_1
    //   1451: invokevirtual 285	com/whatsapp/ze:f	()V
    //   1454: aload_0
    //   1455: aload 18
    //   1457: iload 19
    //   1459: iconst_0
    //   1460: invokespecial 287	com/whatsapp/ue:a	(Lcom/whatsapp/dj;IZ)V
    //   1463: return
    //   1464: iconst_0
    //   1465: istore 10
    //   1467: goto -1346 -> 121
    //   1470: astore 110
    //   1472: new 102	java/lang/StringBuilder
    //   1475: dup
    //   1476: invokespecial 103	java/lang/StringBuilder:<init>	()V
    //   1479: getstatic 58	com/whatsapp/ue:z	[Ljava/lang/String;
    //   1482: bipush 9
    //   1484: aaload
    //   1485: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1488: aload_0
    //   1489: getfield 61	com/whatsapp/ue:c	Lcom/whatsapp/Conversation;
    //   1492: getfield 291	com/whatsapp/Conversation:Pb	Lcom/whatsapp/ue;
    //   1495: invokevirtual 292	com/whatsapp/ue:getCount	()I
    //   1498: invokevirtual 256	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1501: getstatic 58	com/whatsapp/ue:z	[Ljava/lang/String;
    //   1504: bipush 8
    //   1506: aaload
    //   1507: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1510: iload 104
    //   1512: invokevirtual 256	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1515: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1518: invokestatic 250	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   1521: iload 7
    //   1523: ifeq +524 -> 2047
    //   1526: iload 104
    //   1528: istore 70
    //   1530: aload 64
    //   1532: astore 72
    //   1534: goto -1225 -> 309
    //   1537: iconst_0
    //   1538: istore 106
    //   1540: goto -1211 -> 329
    //   1543: iload 82
    //   1545: istore 92
    //   1547: goto -961 -> 586
    //   1550: astore 102
    //   1552: new 102	java/lang/StringBuilder
    //   1555: dup
    //   1556: invokespecial 103	java/lang/StringBuilder:<init>	()V
    //   1559: getstatic 58	com/whatsapp/ue:z	[Ljava/lang/String;
    //   1562: bipush 9
    //   1564: aaload
    //   1565: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1568: aload_0
    //   1569: getfield 61	com/whatsapp/ue:c	Lcom/whatsapp/Conversation;
    //   1572: getfield 291	com/whatsapp/Conversation:Pb	Lcom/whatsapp/ue;
    //   1575: invokevirtual 292	com/whatsapp/ue:getCount	()I
    //   1578: invokevirtual 256	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1581: getstatic 58	com/whatsapp/ue:z	[Ljava/lang/String;
    //   1584: bipush 8
    //   1586: aaload
    //   1587: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1590: iload 101
    //   1592: invokevirtual 256	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1595: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1598: invokestatic 250	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   1601: aload 79
    //   1603: iconst_3
    //   1604: putfield 279	com/whatsapp/dj:a	I
    //   1607: iload 7
    //   1609: ifeq +378 -> 1987
    //   1612: iload 101
    //   1614: istore 97
    //   1616: aconst_null
    //   1617: astore 96
    //   1619: goto -982 -> 637
    //   1622: iconst_0
    //   1623: istore 98
    //   1625: goto -968 -> 657
    //   1628: iconst_3
    //   1629: istore 100
    //   1631: goto -910 -> 721
    //   1634: iload 44
    //   1636: istore 50
    //   1638: goto -683 -> 955
    //   1641: astore 61
    //   1643: new 102	java/lang/StringBuilder
    //   1646: dup
    //   1647: invokespecial 103	java/lang/StringBuilder:<init>	()V
    //   1650: getstatic 58	com/whatsapp/ue:z	[Ljava/lang/String;
    //   1653: bipush 9
    //   1655: aaload
    //   1656: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1659: aload_0
    //   1660: getfield 61	com/whatsapp/ue:c	Lcom/whatsapp/Conversation;
    //   1663: getfield 291	com/whatsapp/Conversation:Pb	Lcom/whatsapp/ue;
    //   1666: invokevirtual 292	com/whatsapp/ue:getCount	()I
    //   1669: invokevirtual 256	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1672: getstatic 58	com/whatsapp/ue:z	[Ljava/lang/String;
    //   1675: bipush 8
    //   1677: aaload
    //   1678: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1681: iload 55
    //   1683: invokevirtual 256	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1686: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1689: invokestatic 250	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   1692: aload 42
    //   1694: iconst_1
    //   1695: putfield 279	com/whatsapp/dj:a	I
    //   1698: iload 7
    //   1700: ifeq +197 -> 1897
    //   1703: aconst_null
    //   1704: astore 54
    //   1706: goto -703 -> 1003
    //   1709: iconst_0
    //   1710: istore 56
    //   1712: goto -689 -> 1023
    //   1715: iconst_1
    //   1716: istore 58
    //   1718: goto -631 -> 1087
    //   1721: iload 19
    //   1723: istore 28
    //   1725: goto -428 -> 1297
    //   1728: astore 37
    //   1730: new 102	java/lang/StringBuilder
    //   1733: dup
    //   1734: invokespecial 103	java/lang/StringBuilder:<init>	()V
    //   1737: getstatic 58	com/whatsapp/ue:z	[Ljava/lang/String;
    //   1740: bipush 9
    //   1742: aaload
    //   1743: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1746: aload_0
    //   1747: getfield 61	com/whatsapp/ue:c	Lcom/whatsapp/Conversation;
    //   1750: getfield 291	com/whatsapp/Conversation:Pb	Lcom/whatsapp/ue;
    //   1753: invokevirtual 292	com/whatsapp/ue:getCount	()I
    //   1756: invokevirtual 256	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1759: getstatic 58	com/whatsapp/ue:z	[Ljava/lang/String;
    //   1762: bipush 8
    //   1764: aaload
    //   1765: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1768: iload 36
    //   1770: invokevirtual 256	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1773: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1776: invokestatic 250	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   1779: aload 22
    //   1781: iconst_3
    //   1782: putfield 279	com/whatsapp/dj:a	I
    //   1785: iload 7
    //   1787: ifeq -346 -> 1441
    //   1790: iload 36
    //   1792: istore 33
    //   1794: aconst_null
    //   1795: astore 32
    //   1797: goto -452 -> 1345
    //   1800: iconst_0
    //   1801: istore 34
    //   1803: goto -438 -> 1365
    //   1806: iconst_3
    //   1807: istore 35
    //   1809: goto -380 -> 1429
    //   1812: aload 20
    //   1814: astore 22
    //   1816: goto -530 -> 1286
    //   1819: aload 32
    //   1821: astore 25
    //   1823: iload 33
    //   1825: istore 23
    //   1827: iload 28
    //   1829: istore 19
    //   1831: aload 22
    //   1833: astore 20
    //   1835: goto -604 -> 1231
    //   1838: iload 23
    //   1840: istore 30
    //   1842: aconst_null
    //   1843: astore 31
    //   1845: goto -508 -> 1337
    //   1848: aload 47
    //   1850: astore 42
    //   1852: goto -908 -> 944
    //   1855: iload 46
    //   1857: istore 16
    //   1859: iload 45
    //   1861: istore 12
    //   1863: goto -744 -> 1119
    //   1866: iload 55
    //   1868: istore 46
    //   1870: iload 50
    //   1872: istore 44
    //   1874: aload 42
    //   1876: astore 47
    //   1878: aload 54
    //   1880: astore 59
    //   1882: iload 57
    //   1884: istore 45
    //   1886: aload 14
    //   1888: astore 15
    //   1890: aload 59
    //   1892: astore 14
    //   1894: goto -1005 -> 889
    //   1897: iload 45
    //   1899: istore 12
    //   1901: aload 14
    //   1903: astore 15
    //   1905: iload 50
    //   1907: istore 62
    //   1909: iload 55
    //   1911: istore 16
    //   1913: iload 62
    //   1915: istore 44
    //   1917: goto -798 -> 1119
    //   1920: iload 46
    //   1922: istore 52
    //   1924: aconst_null
    //   1925: astore 53
    //   1927: goto -932 -> 995
    //   1930: aload 77
    //   1932: astore 79
    //   1934: goto -1359 -> 575
    //   1937: iload 84
    //   1939: istore 86
    //   1941: iload 11
    //   1943: istore 87
    //   1945: aload 81
    //   1947: astore 88
    //   1949: aload 85
    //   1951: astore 89
    //   1953: aload 88
    //   1955: astore 85
    //   1957: goto -1208 -> 749
    //   1960: iload 97
    //   1962: istore 84
    //   1964: iload 99
    //   1966: istore 11
    //   1968: aload 85
    //   1970: astore 81
    //   1972: aload 96
    //   1974: astore 85
    //   1976: iload 92
    //   1978: istore 82
    //   1980: aload 79
    //   1982: astore 77
    //   1984: goto -1464 -> 520
    //   1987: iload 11
    //   1989: istore 87
    //   1991: iload 92
    //   1993: istore 103
    //   1995: iload 101
    //   1997: istore 86
    //   1999: iload 103
    //   2001: istore 82
    //   2003: goto -1254 -> 749
    //   2006: iload 84
    //   2008: istore 94
    //   2010: aconst_null
    //   2011: astore 95
    //   2013: goto -1384 -> 629
    //   2016: iload 107
    //   2018: istore 108
    //   2020: iload 70
    //   2022: istore 66
    //   2024: iload 108
    //   2026: istore 67
    //   2028: aload 72
    //   2030: astore 109
    //   2032: aload 65
    //   2034: astore 68
    //   2036: aload 64
    //   2038: astore 65
    //   2040: aload 109
    //   2042: astore 64
    //   2044: goto -1770 -> 274
    //   2047: aload 65
    //   2049: astore 71
    //   2051: aload 64
    //   2053: astore 65
    //   2055: aload 64
    //   2057: astore 111
    //   2059: iload 67
    //   2061: istore 73
    //   2063: iload 104
    //   2065: istore 70
    //   2067: aload 111
    //   2069: astore 72
    //   2071: goto -1670 -> 401
    //   2074: iload 66
    //   2076: istore 104
    //   2078: aload 64
    //   2080: astore 105
    //   2082: goto -1781 -> 301
    //   2085: iload 67
    //   2087: istore 69
    //   2089: iload 66
    //   2091: istore 70
    //   2093: aload 68
    //   2095: astore 71
    //   2097: aload 64
    //   2099: astore 72
    //   2101: iload 69
    //   2103: istore 73
    //   2105: goto -1704 -> 401
    //   2108: iload 9
    //   2110: istore 12
    //   2112: aload 5
    //   2114: astore 13
    //   2116: aload 4
    //   2118: astore 14
    //   2120: aload_3
    //   2121: astore 15
    //   2123: iload_2
    //   2124: istore 16
    //   2126: goto -1330 -> 796
    //   2129: iconst_0
    //   2130: istore 11
    //   2132: goto -1917 -> 215
    //   2135: iconst_0
    //   2136: istore 112
    //   2138: goto -1957 -> 181
    //
    // Exception table:
    //   from	to	target	type
    //   290	301	1470	android/database/CursorIndexOutOfBoundsException
    //   614	625	1550	android/database/CursorIndexOutOfBoundsException
    //   980	991	1641	android/database/CursorIndexOutOfBoundsException
    //   1322	1333	1728	android/database/CursorIndexOutOfBoundsException
  }

  public void bindView(View paramView, Context paramContext, Cursor paramCursor)
  {
  }

  public int getCount()
  {
    int i = 0;
    if ((!Conversation.J(this.c)) || (getCursor() == null));
    while (true)
    {
      return i;
      int j = getCursor().getCount() + Conversation.e(this.c).size();
      if (Conversation.d(this.c) > 0)
        i = 1;
      i += j;
    }
  }

  public Object getItem(int paramInt)
  {
    int i = getCursor().getCount();
    int j;
    Object localObject;
    if (Conversation.d(this.c) > 0)
    {
      j = 1;
      if (paramInt - j >= i)
        break label304;
      localObject = (sz)Conversation.f(this.c).get(Integer.valueOf(paramInt));
      if (localObject == null)
      {
        if ((Conversation.d(this.c) <= 0) || (paramInt != a()))
          break label110;
        if (this.a == null)
          this.a = new sz(null, z[0], null);
        localObject = this.a;
      }
    }
    while (true)
    {
      return localObject;
      j = 0;
      break;
      label110: int m;
      if ((Conversation.d(this.c) > 0) && (paramInt > a()))
      {
        m = paramInt - 1;
        if (!DialogToastListActivity.f);
      }
      else
      {
        m = paramInt;
      }
      int n = this.c.Pb.getCursor().getPosition();
      this.c.Pb.getCursor().moveToPosition(i - 1 - m);
      int i1 = this.c.Pb.getCursor().getPosition();
      localObject = App.z.b(this.c.Pb.getCursor(), this.c.p);
      if ((i1 < n) && ((i1 <= this.b) || (i1 > 50 + this.b)))
      {
        this.b = Math.max(0, i1 - 50);
        this.c.Pb.getCursor().moveToPosition(this.b);
      }
      Conversation.f(this.c).put(Integer.valueOf(paramInt), localObject);
      continue;
      label304: int k = paramInt - i;
      if (Conversation.d(this.c) > 0)
        k--;
      if ((k >= 0) && (k < Conversation.e(this.c).size()))
      {
        localObject = (sz)Conversation.e(this.c).get(k);
      }
      else
      {
        g5.c(z[1] + paramInt + z[3] + i + z[2] + Conversation.e(this.c).size());
        localObject = null;
      }
    }
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public int getItemViewType(int paramInt)
  {
    int i;
    if (!Conversation.J(this.c))
      i = -1;
    while (true)
    {
      return i;
      if ((Conversation.d(this.c) > 0) && (paramInt == a()))
        i = 10;
      else
        i = Conversation.d((sz)getItem(paramInt));
    }
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool1 = DialogToastListActivity.f;
    sz localsz1 = (sz)getItem(paramInt);
    Object localObject;
    if ((Conversation.d(this.c) > 0) && (paramInt == a()))
    {
      localObject = ((LayoutInflater)this.c.getSystemService(z[11])).inflate(2130903076, paramViewGroup, false);
      TextView localTextView = (TextView)((View)localObject).findViewById(2131558616);
      String str = App.Z.a(2131427334, Conversation.K(this.c));
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(Conversation.K(this.c));
      localTextView.setText(String.format(str, arrayOfObject));
    }
    label185: label463: label470: 
    while (true)
    {
      return localObject;
      boolean bool3;
      sz localsz2;
      boolean bool2;
      if ((paramView != null) && (paramView.getTag() != null) && (Conversation.d(localsz1) == Conversation.d((sz)paramView.getTag())))
        if ((Conversation.G(this.c).contains(localsz1)) || (!TextUtils.isEmpty(this.c.sb)))
        {
          bool3 = true;
          ze localze2 = (ze)paramView;
          localze2.a(localsz1, bool3);
          Conversation.G(this.c).remove(localsz1);
          localObject = localze2;
          if (paramInt == 0)
          {
            ((ze)localObject).a(true);
            if (!bool1)
              break label463;
          }
          localsz2 = (sz)getItem(paramInt - 1);
          bool2 = t4.b(localsz2.i, localsz1.i);
          if (!bool2)
          {
            ((ze)localObject).a(true);
            if (!bool1);
          }
          else
          {
            ((ze)localObject).a(false);
          }
        }
      for (sz localsz3 = localsz2; ; localsz3 = null)
      {
        while (true)
        {
          if ((!Conversation.k(this.c)) || (localsz1.b.b))
            break label470;
          ((ze)localObject).e();
          if (localsz1.l != 0)
            break;
          dj localdj = (dj)Conversation.j.get(localsz1.b);
          if (localdj != null)
          {
            ((ze)localObject).m = localdj.a;
            ((ze)localObject).f();
            if (!bool1)
              break;
          }
          a((ze)localObject, paramInt, localsz1, localsz3, (sz)getItem(paramInt + 1), bool2);
          break;
          bool3 = false;
          break label185;
          try
          {
            while (true)
            {
              ze localze1 = Conversation.d(this.c, localsz1);
              localObject = localze1;
              if (localObject != null)
                break;
              try
              {
                g5.c(z[10] + g5.a(localsz1));
              }
              catch (Exception localException1)
              {
              }
            }
            g5.d(localException1);
          }
          catch (Exception localException2)
          {
            while (true)
              localObject = null;
          }
        }
        bool2 = false;
      }
    }
  }

  public int getViewTypeCount()
  {
    if (Conversation.d(this.c) > 0);
    for (int i = 1; ; i = 0)
      return i + 11;
  }

  public boolean hasStableIds()
  {
    return true;
  }

  public View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    Object localObject = null;
    if ((paramContext == null) || (paramCursor == null))
      g5.c(z[13]);
    while (true)
    {
      return localObject;
      sz localsz = App.z.b(paramCursor, this.c.p);
      try
      {
        ze localze = Conversation.d(this.c, localsz);
        localObject = localze;
      }
      catch (Exception localException)
      {
        g5.d(localException);
      }
    }
  }

  public void notifyDataSetChanged()
  {
    if (!Conversation.H(this.c))
    {
      Conversation.j.clear();
      super.notifyDataSetChanged();
      if (!DialogToastListActivity.f);
    }
    else if (Conversation.I(this.c))
    {
      Conversation.l(this.c, false);
      Conversation.n(this.c, false);
    }
  }

  protected void onContentChanged()
  {
  }
}