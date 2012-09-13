package com.whatsapp;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AccountInfoActivity extends DialogToastActivity
{
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[5];
    char[] arrayOfChar1 = "E2[\006-E".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "W#E\0130S/\\\r,m?T\026'".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "S9V".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label365;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\0248^\0217_f".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label457;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\r+]\r,Wf".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label549;
        arrayOfString[4] = new String(arrayOfChar5).intern();
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
        m = 66;
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
        m = 50;
        continue;
        m = 91;
        continue;
        m = 53;
        continue;
        m = 98;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 66;
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
      i3 = 50;
      continue;
      i3 = 91;
      continue;
      i3 = 53;
      continue;
      i3 = 98;
    }
    label365: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 66;
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
      i7 = 50;
      continue;
      i7 = 91;
      continue;
      i7 = 53;
      continue;
      i7 = 98;
    }
    label457: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 66;
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
      i11 = 50;
      continue;
      i11 = 91;
      continue;
      i11 = 53;
      continue;
      i11 = 98;
    }
    label549: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 66;
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
      i15 = 50;
      continue;
      i15 = 91;
      continue;
      i15 = 53;
      continue;
      i15 = 98;
    }
  }

  private String a()
  {
    String str1 = App.bb.jabber_id + z[2];
    String str2 = z[4] + App.bb.jabber_id + z[3] + mh.b(str1);
    return f8.e + str2;
  }

  static String a(AccountInfoActivity paramAccountInfoActivity)
  {
    return paramAccountInfoActivity.a();
  }

  private void a(Bitmap paramBitmap1, Bitmap paramBitmap2, Button paramButton, DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    BitmapDrawable localBitmapDrawable1 = new BitmapDrawable(getResources(), paramBitmap1);
    BitmapDrawable localBitmapDrawable2 = new BitmapDrawable(getResources(), paramBitmap2);
    int i = (int)(2.0F * paramDisplayMetrics.density);
    int j = (int)(i + paramInt + 8.0F * paramDisplayMetrics.density);
    int k = j + paramBitmap2.getWidth();
    int m = (int)getResources().getDimension(2131361844);
    Bitmap localBitmap = Bitmap.createBitmap(k, m, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    int n = (int)(0.5D * m - paramBitmap1.getHeight());
    localBitmapDrawable1.setBounds(i, n, i + paramBitmap1.getWidth(), n + paramBitmap1.getHeight());
    localBitmapDrawable1.draw(localCanvas);
    localBitmapDrawable2.setBounds(j, (int)(1.0F + 2.0F * paramDisplayMetrics.density), k, (int)(m - 1.33D * paramDisplayMetrics.density));
    localBitmapDrawable2.draw(localCanvas);
    BitmapDrawable localBitmapDrawable3 = new BitmapDrawable(getResources(), localBitmap);
    localBitmapDrawable3.setBounds(0, 0, k, m);
    paramButton.setCompoundDrawables(localBitmapDrawable3, null, null, null);
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool = DialogToastListActivity.f;
    super.onCreate(paramBundle);
    setContentView(2130903042);
    ImageView localImageView = (ImageView)findViewById(2131558413);
    TextView localTextView = (TextView)findViewById(2131558412);
    int i = eg.b(eg.h);
    if (eg.h == -1)
    {
      i = eg.b(eg.a());
      if (!bool);
    }
    else if (eg.h == 1)
    {
      localImageView.setImageDrawable(getResources().getDrawable(2130837505));
      localTextView.setTextColor(getResources().getColor(2131230743));
    }
    long l = eg.a(z[1]);
    Object localObject;
    DisplayMetrics localDisplayMetrics;
    Bitmap localBitmap1;
    Bitmap localBitmap2;
    Button localButton;
    if (l == 0L)
    {
      localObject = getString(2131296820);
      String str2 = VerifyNumber.a(App.bb.cc, App.bb.jabber_id.substring(App.bb.cc.length()));
      ((TextView)findViewById(2131558412)).setText(i);
      ((TextView)findViewById(2131558417)).setText((CharSequence)localObject);
      ((TextView)findViewById(2131558415)).setText(str2);
      findViewById(2131558418).setOnClickListener(new hg(this));
      findViewById(2131558419).setOnClickListener(new ig(this));
      localDisplayMetrics = new DisplayMetrics();
      ((WindowManager)getSystemService(z[0])).getDefaultDisplay().getMetrics(localDisplayMetrics);
      localBitmap1 = BitmapFactory.decodeResource(getResources(), 2130838562);
      localBitmap2 = BitmapFactory.decodeResource(getResources(), 2130837577);
      localButton = (Button)findViewById(2131558418);
      if (localBitmap1.getWidth() <= localBitmap2.getWidth())
        break label433;
    }
    label433: for (int j = localBitmap1.getWidth(); ; j = localBitmap2.getWidth())
    {
      a(localBitmap1, localBitmap2, localButton, localDisplayMetrics, j);
      a(BitmapFactory.decodeResource(getResources(), 2130838445), localBitmap2, (Button)findViewById(2131558419), localDisplayMetrics, j);
      return;
      String str1 = t4.f(this, l);
      if (l < System.currentTimeMillis())
      {
        i = 2131296822;
        localTextView.setTextColor(getResources().getColor(2131230741));
        if (!bool);
      }
      else if (l - System.currentTimeMillis() < 1209600000L)
      {
        localTextView.setTextColor(getResources().getColor(2131230742));
      }
      localObject = str1;
      break;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.AccountInfoActivity
 * JD-Core Version:    0.6.1
 */