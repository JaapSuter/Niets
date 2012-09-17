package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.format.Formatter;
import android.widget.ImageButton;
import android.widget.ImageView.ScaleType;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.io.File;
import java.util.List;

public final class df extends ze
{
  static String M = z(z("-\034\027*LXk"));
  private static final String[] N;
  private MediaData F;
  private int G;
  private final TextView H = (TextView)findViewById(2131558607);
  private final ImageButton I = (ImageButton)findViewById(2131558523);
  private final ProgressBar J = (ProgressBar)findViewById(2131558492);
  private int K;
  private boolean L = false;

  static
  {
    String[] arrayOfString = new String[4];
    arrayOfString[0] = z(z("\0214I"));
    arrayOfString[1] = z(z("\n>C"));
    arrayOfString[2] = z(z("\0132^"));
    arrayOfString[3] = z(z("��7_\b\001"));
    N = arrayOfString;
  }

  public df(Conversation paramConversation, sz paramsz)
  {
    super(paramConversation, paramsz);
    this.J.setMax(100);
    b(paramsz);
  }

  private static int a(int paramInt)
  {
    int i = 2131296756;
    switch (paramInt)
    {
    default:
      i = 2131296512;
    case 2:
    case 3:
    }
    return i;
  }

  static MediaData a(df paramdf)
  {
    return paramdf.F;
  }

  private static int b(int paramInt)
  {
    int i;
    switch (paramInt)
    {
    default:
      i = 2131296508;
    case 1:
    case 2:
    }
    while (true)
    {
      return i;
      i = 2131296506;
      continue;
      i = 2131296507;
    }
  }

  private void b(sz paramsz)
  {
    boolean bool = DialogToastListActivity.f;
    sz localsz = this.o;
    int i = this.G;
    this.F = ((MediaData)paramsz.t);
    this.G = paramsz.l;
    if (this.F.transferring)
    {
      if ((!this.L) || (this.K != 0))
      {
        this.J.setVisibility(0);
        this.H.setVisibility(4);
        this.I.setOnClickListener(new zn(this));
        this.K = 0;
      }
      this.J.setProgress((int)this.F.progress);
      if (!bool);
    }
    else if ((this.F.transferred) || ((paramsz.m > 0L) && (this.F.progress == paramsz.m)))
    {
      if ((!this.L) || (this.K != 1) || (this.G != i))
        this.H.setText(a(this.G));
      if ((!this.L) || (this.K != 1))
      {
        if ((!this.L) || (this.K != 2))
        {
          this.J.setVisibility(8);
          this.H.setVisibility(0);
        }
        zn localzn = new zn(this);
        this.H.setOnClickListener(localzn);
        this.I.setOnClickListener(localzn);
        this.K = 1;
        if (!bool);
      }
    }
    else
    {
      if ((!paramsz.b.b) && ((!this.L) || (this.K != 2) || (paramsz.m != localsz.m)))
        this.H.setText(getContext().getString(b(this.G)) + " " + Formatter.formatShortFileSize(App.Mb, paramsz.m));
      if ((!this.L) || (this.K != 2))
      {
        if ((!this.L) || (this.K != 1))
        {
          this.J.setVisibility(8);
          this.H.setVisibility(0);
        }
        if (paramsz.b.b)
        {
          this.H.setText(2131296484);
          this.H.setOnClickListener(new yn(this));
          this.I.setOnClickListener(new zn(this));
          if (!bool);
        }
        else
        {
          xn localxn = new xn(this);
          this.H.setOnClickListener(localxn);
          this.I.setOnClickListener(localxn);
        }
        this.K = 2;
      }
    }
    if ((paramsz.b.b) || ((!paramsz.b.b) && (this.K == 1)))
      this.I.setOnLongClickListener(new ao(this));
    this.I.setBackgroundDrawable(null);
    int j = (int)j4.a(this.f).K;
    this.I.setPadding(j, j, j, j);
    switch (this.G)
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      this.L = true;
      return;
      this.I.setScaleType(ImageView.ScaleType.CENTER);
      Bitmap localBitmap2 = m5.b(paramsz);
      if (localBitmap2 != null)
      {
        this.I.setImageDrawable(new o(this.f, localBitmap2));
        if (!bool);
      }
      else
      {
        this.I.setBackgroundResource(17301508);
        this.I.setImageResource(2130838490);
        if (bool)
        {
          this.I.setScaleType(ImageView.ScaleType.CENTER);
          this.I.setBackgroundResource(17301508);
          if ((!this.L) || (i != 2))
          {
            this.I.setImageResource(2130837518);
            if (bool)
            {
              this.I.setScaleType(ImageView.ScaleType.CENTER);
              Bitmap localBitmap1 = m5.b(paramsz);
              if (localBitmap1 != null)
              {
                try
                {
                  if ((localBitmap1.getWidth() != c.X) || (localBitmap1.getHeight() != c.X))
                    localBitmap1 = Bitmap.createScaledBitmap(localBitmap1, c.X, c.X, true);
                  if (paramsz.m > 0L)
                  {
                    VideoBitmapDrawable localVideoBitmapDrawable = new VideoBitmapDrawable(this.f, localBitmap1, Formatter.formatShortFileSize(App.Mb, paramsz.m), j4.a(this.f).M);
                    this.I.setImageDrawable(localVideoBitmapDrawable);
                    if (!bool)
                      continue;
                  }
                  o localo = new o(this.f, localBitmap1);
                  this.I.setImageDrawable(localo);
                }
                catch (IllegalArgumentException localIllegalArgumentException)
                {
                  this.I.setImageBitmap(localBitmap1);
                }
                if (!bool);
              }
              else
              {
                this.I.setPadding(1, 0, 0, 9);
                this.I.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.I.setBackgroundResource(17301508);
                this.I.setImageResource(2130837517);
              }
            }
          }
        }
      }
    }
  }

  private static String z(char[] paramArrayOfChar)
  {
    int i = paramArrayOfChar.length;
    int j = 0;
    if (i <= j)
      return new String(paramArrayOfChar).intern();
    int k = paramArrayOfChar[j];
    int m;
    switch (j % 5)
    {
    default:
      m = 117;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      paramArrayOfChar[j] = (char)(m ^ k);
      j++;
      break;
      m = 97;
      continue;
      m = 91;
      continue;
      m = 58;
      continue;
      m = 122;
    }
  }

  private static char[] z(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    if (arrayOfChar.length < 2)
      arrayOfChar[0] = (char)(0x75 ^ arrayOfChar[0]);
    return arrayOfChar;
  }

  protected int a()
  {
    return 2130903072;
  }

  public void a(Context paramContext, sz paramsz)
  {
    MediaData localMediaData = (MediaData)paramsz.t;
    if (localMediaData.transferring);
    while (true)
    {
      return;
      if ((localMediaData.transferred) && (localMediaData.file != null) && (!new File(Uri.fromFile(localMediaData.file).getPath()).exists()))
      {
        Intent localIntent = new Intent(this.n, MediaGallery.class);
        localIntent.putExtra(N[0], -1);
        localIntent.putExtra(N[3], true);
        localIntent.putExtra(N[2], this.n.Qb.b);
        localIntent.putExtra(N[1], paramsz.b.hashCode());
        this.n.startActivity(localIntent);
      }
      else
      {
        this.n.startActivity(MediaView.a(paramsz, this.n.Qb.b, this.n));
      }
    }
  }

  public void a(sz paramsz, boolean paramBoolean)
  {
    if ((paramsz != this.o) || (paramBoolean))
      b(paramsz);
    super.a(paramsz, paramBoolean);
  }

  void a(List<rn> paramList)
  {
    if ((this.o.b.b) && (this.o.a == 1))
      paramList.add(new rn(getResources().getString(2131296510), 4));
    if ((!this.o.b.b) && (this.F.transferring))
      paramList.add(new rn(getResources().getString(2131296511), 5));
    if ((this.o.b.b) || ((!this.o.b.b) && (this.K == 1)))
      paramList.add(new rn(getResources().getString(2131296539), 6));
  }

  protected int b()
  {
    return 2130903073;
  }

  public void d()
  {
    b(this.o);
    super.d();
  }

  public boolean i()
  {
    if ((this.o.b.b) || (this.F.transferred));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}