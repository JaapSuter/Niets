package com.whatsapp;

import android.widget.Button;

public class af extends ze
{
  private static final String G;
  private final Button F = (Button)findViewById(2131558489);

  static
  {
    char[] arrayOfChar = "Ug\013EcD{\004GoYfHAiA%\006\\hBi\006G)Ug\013GgU|HGnCe\007\034dW{��\0052\033l��PiRmJVtDg\027".toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    if (i <= j)
    {
      G = new String(arrayOfChar).intern();
      return;
    }
    int k = arrayOfChar[j];
    int m;
    switch (j % 5)
    {
    default:
      m = 6;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar[j] = (char)(m ^ k);
      j++;
      break;
      m = 54;
      continue;
      m = 8;
      continue;
      m = 101;
      continue;
      m = 51;
    }
  }

  af(Conversation paramConversation, sz paramsz)
  {
    super(paramConversation, paramsz);
    this.F.setOnClickListener(new tn(this, null));
    b(paramsz);
  }

  // ERROR //
  private void b(sz paramsz)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 67	com/whatsapp/sz:p	Ljava/lang/String;
    //   4: astore_2
    //   5: aload_0
    //   6: getfield 40	com/whatsapp/af:F	Landroid/widget/Button;
    //   9: aload_2
    //   10: invokevirtual 71	android/widget/Button:setText	(Ljava/lang/CharSequence;)V
    //   13: aload_1
    //   14: invokevirtual 73	com/whatsapp/sz:b	()Ljava/lang/String;
    //   17: invokestatic 78	g:b	(Ljava/lang/String;)Lg;
    //   20: astore 14
    //   22: aload 14
    //   24: astore 4
    //   26: aload 4
    //   28: ifnull +190 -> 218
    //   31: aload 4
    //   33: getfield 82	g:f	[B
    //   36: ifnull +182 -> 218
    //   39: aload 4
    //   41: getfield 82	g:f	[B
    //   44: arraylength
    //   45: ifle +173 -> 218
    //   48: aload 4
    //   50: getfield 82	g:f	[B
    //   53: invokestatic 87	wb:b	([B)[B
    //   56: astore 10
    //   58: aload 10
    //   60: iconst_0
    //   61: aload 10
    //   63: arraylength
    //   64: invokestatic 93	android/graphics/BitmapFactory:decodeByteArray	([BII)Landroid/graphics/Bitmap;
    //   67: astore 11
    //   69: aload 11
    //   71: astore 5
    //   73: aload_0
    //   74: getfield 96	com/whatsapp/af:f	Landroid/content/Context;
    //   77: invokevirtual 102	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   80: ldc 103
    //   82: invokevirtual 109	android/content/res/Resources:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   85: astore 6
    //   87: aload 5
    //   89: ifnull +53 -> 142
    //   92: new 111	com/whatsapp/o
    //   95: dup
    //   96: aload_0
    //   97: getfield 96	com/whatsapp/af:f	Landroid/content/Context;
    //   100: aload 5
    //   102: invokespecial 114	com/whatsapp/o:<init>	(Landroid/content/Context;Landroid/graphics/Bitmap;)V
    //   105: astore 7
    //   107: aload 7
    //   109: iconst_0
    //   110: iconst_0
    //   111: aload 6
    //   113: invokevirtual 120	android/graphics/drawable/Drawable:getIntrinsicWidth	()I
    //   116: aload 6
    //   118: invokevirtual 123	android/graphics/drawable/Drawable:getIntrinsicHeight	()I
    //   121: invokevirtual 127	com/whatsapp/o:setBounds	(IIII)V
    //   124: aload_0
    //   125: getfield 40	com/whatsapp/af:F	Landroid/widget/Button;
    //   128: aload 7
    //   130: aconst_null
    //   131: aconst_null
    //   132: aconst_null
    //   133: invokevirtual 131	android/widget/Button:setCompoundDrawables	(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   136: getstatic 136	com/whatsapp/DialogToastListActivity:f	Z
    //   139: ifeq +15 -> 154
    //   142: aload_0
    //   143: getfield 40	com/whatsapp/af:F	Landroid/widget/Button;
    //   146: aload 6
    //   148: aconst_null
    //   149: aconst_null
    //   150: aconst_null
    //   151: invokevirtual 139	android/widget/Button:setCompoundDrawablesWithIntrinsicBounds	(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   154: return
    //   155: astore 13
    //   157: aload 13
    //   159: invokestatic 145	com/whatsapp/g5:c	(Ljava/lang/Throwable;)V
    //   162: aconst_null
    //   163: astore 4
    //   165: goto -139 -> 26
    //   168: astore 12
    //   170: aload 12
    //   172: invokestatic 148	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   175: aconst_null
    //   176: astore 4
    //   178: goto -152 -> 26
    //   181: astore_3
    //   182: aload_3
    //   183: invokestatic 145	com/whatsapp/g5:c	(Ljava/lang/Throwable;)V
    //   186: aconst_null
    //   187: astore 4
    //   189: goto -163 -> 26
    //   192: astore 9
    //   194: getstatic 28	com/whatsapp/af:G	Ljava/lang/String;
    //   197: aload 9
    //   199: invokestatic 151	com/whatsapp/g5:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   202: aconst_null
    //   203: astore 5
    //   205: goto -132 -> 73
    //   208: astore 8
    //   210: getstatic 28	com/whatsapp/af:G	Ljava/lang/String;
    //   213: aload 8
    //   215: invokestatic 151	com/whatsapp/g5:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   218: aconst_null
    //   219: astore 5
    //   221: goto -148 -> 73
    //
    // Exception table:
    //   from	to	target	type
    //   13	22	155	java/io/UnsupportedEncodingException
    //   13	22	168	java/io/IOException
    //   13	22	181	b
    //   48	69	192	java/lang/ArrayIndexOutOfBoundsException
    //   48	69	208	java/lang/StringIndexOutOfBoundsException
  }

  protected int a()
  {
    return 2130903066;
  }

  public void a(sz paramsz, boolean paramBoolean)
  {
    if ((this.o != paramsz) || (paramBoolean))
      b(paramsz);
    super.a(paramsz, paramBoolean);
  }

  protected int b()
  {
    return 2130903067;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.af
 * JD-Core Version:    0.6.1
 */