package com.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import java.io.File;

public class ViewProfilePhoto extends DialogToastActivity
  implements uk
{
  private static final String[] z;
  private zq f;
  private Handler g = new vd(this);

  static
  {
    String[] arrayOfString = new String[8];
    char[] arrayOfChar1 = "\033\013]\035n\023��w\001u".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "��\rM\004j\004\013N\032v\023\024@\034n\031KK\001\027\020MS".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\033\013]\035n\023��".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label477;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "V\024@\034n\031;N\006v\032;A\027 ".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label569;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\034\rL".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label661;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "��\rM\004j\004\013N\032v\023\024@\034n\031KL\026i\002\026G\n".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label753;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "\037\027w\001\005\001\\".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label845;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "��\rM\004j\004\013N\032v\023\024@\034n\031KG\035j\004\013N\032v\023\024@\034n\031\007@\022t\021\001LSj\036\013\\\034E\020\021D\037E\037��\022".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label937;
        arrayOfString[7] = new String(arrayOfChar8).intern();
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
        m = 26;
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
        m = 100;
        continue;
        m = 40;
        continue;
        m = 115;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 26;
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
      i3 = 100;
      continue;
      i3 = 40;
      continue;
      i3 = 115;
    }
    label477: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 26;
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
      i7 = 100;
      continue;
      i7 = 40;
      continue;
      i7 = 115;
    }
    label569: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 26;
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
      i11 = 100;
      continue;
      i11 = 40;
      continue;
      i11 = 115;
    }
    label661: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 26;
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
      i15 = 100;
      continue;
      i15 = 40;
      continue;
      i15 = 115;
    }
    label753: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 26;
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
      i19 = 100;
      continue;
      i19 = 40;
      continue;
      i19 = 115;
    }
    label845: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 26;
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
      i23 = 118;
      continue;
      i23 = 100;
      continue;
      i23 = 40;
      continue;
      i23 = 115;
    }
    label937: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 26;
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
      i27 = 118;
      continue;
      i27 = 100;
      continue;
      i27 = 40;
      continue;
      i27 = 115;
    }
  }

  static zq a(ViewProfilePhoto paramViewProfilePhoto)
  {
    return paramViewProfilePhoto.f;
  }

  // ERROR //
  private void b()
  {
    // Byte code:
    //   0: getstatic 67	com/whatsapp/DialogToastListActivity:f	Z
    //   3: istore_1
    //   4: aload_0
    //   5: ldc 68
    //   7: invokevirtual 72	com/whatsapp/ViewProfilePhoto:findViewById	(I)Landroid/view/View;
    //   10: astore_2
    //   11: aload_0
    //   12: ldc 73
    //   14: invokevirtual 72	com/whatsapp/ViewProfilePhoto:findViewById	(I)Landroid/view/View;
    //   17: checkcast 75	com/whatsapp/wallpaper/ImageViewTouchBase
    //   20: astore_3
    //   21: aload_0
    //   22: ldc 76
    //   24: invokevirtual 72	com/whatsapp/ViewProfilePhoto:findViewById	(I)Landroid/view/View;
    //   27: checkcast 78	android/widget/TextView
    //   30: astore 4
    //   32: aload_0
    //   33: getfield 59	com/whatsapp/ViewProfilePhoto:f	Lcom/whatsapp/zq;
    //   36: getfield 83	com/whatsapp/zq:b	Ljava/lang/String;
    //   39: invokestatic 88	com/whatsapp/hz:a	(Ljava/lang/String;)Z
    //   42: ifeq +25 -> 67
    //   45: aload_2
    //   46: iconst_0
    //   47: invokevirtual 94	android/view/View:setVisibility	(I)V
    //   50: aload_3
    //   51: bipush 8
    //   53: invokevirtual 95	com/whatsapp/wallpaper/ImageViewTouchBase:setVisibility	(I)V
    //   56: aload 4
    //   58: bipush 8
    //   60: invokevirtual 96	android/widget/TextView:setVisibility	(I)V
    //   63: iload_1
    //   64: ifeq +184 -> 248
    //   67: aload_0
    //   68: getfield 59	com/whatsapp/ViewProfilePhoto:f	Lcom/whatsapp/zq;
    //   71: iconst_1
    //   72: invokevirtual 99	com/whatsapp/zq:b	(Z)Ljava/io/InputStream;
    //   75: astore 5
    //   77: aload_0
    //   78: getfield 59	com/whatsapp/ViewProfilePhoto:f	Lcom/whatsapp/zq;
    //   81: getfield 103	com/whatsapp/zq:o	I
    //   84: bipush 255
    //   86: if_icmpne +58 -> 144
    //   89: aload 5
    //   91: ifnonnull +53 -> 144
    //   94: aload_3
    //   95: bipush 8
    //   97: invokevirtual 95	com/whatsapp/wallpaper/ImageViewTouchBase:setVisibility	(I)V
    //   100: aload_2
    //   101: bipush 8
    //   103: invokevirtual 94	android/view/View:setVisibility	(I)V
    //   106: aload 4
    //   108: iconst_0
    //   109: invokevirtual 96	android/widget/TextView:setVisibility	(I)V
    //   112: aload_0
    //   113: getfield 59	com/whatsapp/ViewProfilePhoto:f	Lcom/whatsapp/zq;
    //   116: invokevirtual 106	com/whatsapp/zq:o	()Z
    //   119: ifeq +14 -> 133
    //   122: aload 4
    //   124: ldc 107
    //   126: invokevirtual 110	android/widget/TextView:setText	(I)V
    //   129: iload_1
    //   130: ifeq +108 -> 238
    //   133: aload 4
    //   135: ldc 111
    //   137: invokevirtual 110	android/widget/TextView:setText	(I)V
    //   140: iload_1
    //   141: ifeq +97 -> 238
    //   144: aload_3
    //   145: iconst_0
    //   146: invokevirtual 95	com/whatsapp/wallpaper/ImageViewTouchBase:setVisibility	(I)V
    //   149: aload 4
    //   151: bipush 8
    //   153: invokevirtual 96	android/widget/TextView:setVisibility	(I)V
    //   156: aload_0
    //   157: getfield 59	com/whatsapp/ViewProfilePhoto:f	Lcom/whatsapp/zq;
    //   160: getfield 103	com/whatsapp/zq:o	I
    //   163: ifne +12 -> 175
    //   166: aload_2
    //   167: iconst_0
    //   168: invokevirtual 94	android/view/View:setVisibility	(I)V
    //   171: iload_1
    //   172: ifeq +9 -> 181
    //   175: aload_2
    //   176: bipush 8
    //   178: invokevirtual 94	android/view/View:setVisibility	(I)V
    //   181: aload 5
    //   183: aconst_null
    //   184: new 113	android/graphics/BitmapFactory$Options
    //   187: dup
    //   188: invokespecial 114	android/graphics/BitmapFactory$Options:<init>	()V
    //   191: invokestatic 120	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   194: astore 8
    //   196: aload_0
    //   197: getfield 59	com/whatsapp/ViewProfilePhoto:f	Lcom/whatsapp/zq;
    //   200: getfield 103	com/whatsapp/zq:o	I
    //   203: ifgt +13 -> 216
    //   206: aload_0
    //   207: getfield 59	com/whatsapp/ViewProfilePhoto:f	Lcom/whatsapp/zq;
    //   210: getfield 123	com/whatsapp/zq:p	I
    //   213: ifle +13 -> 226
    //   216: aload_3
    //   217: ldc 124
    //   219: invokevirtual 127	com/whatsapp/wallpaper/ImageViewTouchBase:a	(F)V
    //   222: iload_1
    //   223: ifeq +9 -> 232
    //   226: aload_3
    //   227: ldc 128
    //   229: invokevirtual 127	com/whatsapp/wallpaper/ImageViewTouchBase:a	(F)V
    //   232: aload_3
    //   233: aload 8
    //   235: invokevirtual 132	com/whatsapp/wallpaper/ImageViewTouchBase:setImageBitmap	(Landroid/graphics/Bitmap;)V
    //   238: aload 5
    //   240: ifnull +8 -> 248
    //   243: aload 5
    //   245: invokevirtual 137	java/io/InputStream:close	()V
    //   248: return
    //   249: astore 6
    //   251: aload 5
    //   253: ifnull +8 -> 261
    //   256: aload 5
    //   258: invokevirtual 137	java/io/InputStream:close	()V
    //   261: aload 6
    //   263: athrow
    //   264: astore 9
    //   266: goto -18 -> 248
    //   269: astore 7
    //   271: goto -10 -> 261
    //
    // Exception table:
    //   from	to	target	type
    //   77	238	249	finally
    //   243	248	264	java/io/IOException
    //   256	261	269	java/io/IOException
  }

  public void a()
  {
    this.f = App.w.a(this.f.b, null);
    TextView localTextView = (TextView)findViewById(2131558468);
    if (this.f.o())
    {
      localTextView.setText(2131296632);
      if (!DialogToastListActivity.f);
    }
    else
    {
      Object localObject = v4.a(this.f.b(), getBaseContext());
      if (localObject == null)
        localObject = this.f.b();
      localTextView.setText((CharSequence)localObject);
    }
  }

  public void a(String paramString)
  {
    this.f = App.w.a(this.f.b, null);
    if (paramString.equals(this.f.b))
    {
      g5.b(z[7] + this.f.o);
      String str = Environment.getExternalStorageState();
      if ((!str.equals(z[2])) || (str.equals(z[0])))
        break label151;
    }
    label151: for (int i = 1; ; i = 0)
    {
      this.g.removeMessages(0);
      if ((i != 0) && (this.f.o == 0))
      {
        App.a(this.f.b, this.f.o, 1);
        this.g.sendEmptyMessageDelayed(0, 32000L);
      }
      b();
      return;
    }
  }

  public void b(String paramString)
  {
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    boolean bool = DialogToastListActivity.f;
    switch (paramInt1)
    {
    default:
    case 12:
    case 13:
    }
    while (true)
    {
      return;
      if (paramInt2 == -1)
        if ((paramIntent != null) && (paramIntent.getBooleanExtra(z[6], false)))
        {
          iz.b(this.f, this);
          finish();
          if (!bool);
        }
        else
        {
          iz.a(paramIntent, this.f, this, 13, this);
          if (bool)
          {
            iz.a().delete();
            if (paramInt2 == -1)
            {
              if (iz.a(this.f, this))
              {
                b();
                if (!bool);
              }
            }
            else if ((paramInt2 == 0) && (paramIntent != null))
              iz.a(paramIntent, this);
          }
        }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool = DialogToastListActivity.f;
    super.onCreate(paramBundle);
    setContentView(2130903129);
    String str1 = getIntent().getStringExtra(z[4]);
    this.f = App.w.a(str1, null);
    g5.b(z[1] + str1 + z[3] + this.f.o);
    View localView = findViewById(2131558789);
    TextView localTextView = (TextView)findViewById(2131558468);
    if ((this.f.o()) || (str1.equals(App.w.b().b)))
    {
      localView.setOnClickListener(new o7(this));
      if (this.f.o())
      {
        localTextView.setText(2131296632);
        if (!bool);
      }
      else
      {
        localTextView.setText(2131296633);
        if (!bool);
      }
    }
    else
    {
      localView.setVisibility(8);
      findViewById(2131558791).setVisibility(8);
      Object localObject = v4.a(this.f.b(), getBaseContext());
      if (localObject == null)
        localObject = this.f.b();
      localTextView.setText((CharSequence)localObject);
    }
    App.a(this);
    if (str1.equals(App.w.b().b))
    {
      if ((this.f.o > 0) && (!this.f.g().exists()))
      {
        this.f.o = 0;
        App.a(this.f.b, this.f.o, 1);
        this.g.sendEmptyMessageDelayed(0, 32000L);
        if (!bool);
      }
    }
    else
    {
      String str2 = Environment.getExternalStorageState();
      if ((!str2.equals(z[2])) || (str2.equals(z[0])))
        break label431;
    }
    label431: for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        if ((this.f.o > 0) && (!this.f.g().exists()))
          this.f.o = 0;
        App.a(this.f.b, this.f.o, 1);
        if (this.f.o == 0)
          this.g.sendEmptyMessageDelayed(0, 32000L);
      }
      b();
      return;
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    g5.b(z[5]);
    this.g.removeMessages(0);
    App.b(this);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ViewProfilePhoto
 * JD-Core Version:    0.6.1
 */