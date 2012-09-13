package com.whatsapp;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.text.SpannableStringBuilder;
import android.text.format.Formatter;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class MediaGallery extends DialogToastListActivity
{
  public static MediaGallery g;
  private static j4 h;
  public static int q;
  private static final String[] z;
  private String i;
  private Display j;
  private ArrayList<sz> k;
  private int l = 4;
  private se m;
  protected ListView n;
  private q9 o;
  private int p;
  private View.OnClickListener r;
  private TreeMap<aab, ArrayList<sz>> s = new TreeMap();
  private aab t;
  private aab u;
  private aab v;
  private Calendar w;

  static
  {
    String[] arrayOfString = new String[10];
    char[] arrayOfChar1 = "),N,=#(F)960\005&3(\007_(>!;Y".toCharArray();
    int i1 = arrayOfChar1.length;
    int i2 = 0;
    char[] arrayOfChar2;
    int i6;
    char[] arrayOfChar3;
    int i10;
    char[] arrayOfChar4;
    int i14;
    char[] arrayOfChar5;
    int i18;
    char[] arrayOfChar6;
    int i22;
    char[] arrayOfChar7;
    int i26;
    char[] arrayOfChar8;
    int i30;
    char[] arrayOfChar9;
    int i34;
    char[] arrayOfChar10;
    int i38;
    if (i1 <= i2)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "),N,=#(F)960\005797,^\0063*/C\")6(^,3*:\020".toCharArray();
      int i5 = arrayOfChar2.length;
      i6 = 0;
      if (i5 <= i6)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = ". N".toCharArray();
        int i9 = arrayOfChar3.length;
        i10 = 0;
        if (i9 > i10)
          break label557;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "),N,=#(F)960\005&.!(^ ".toCharArray();
        int i13 = arrayOfChar4.length;
        i14 = 0;
        if (i13 > i14)
          break label649;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = ")&_+(!-".toCharArray();
        int i17 = arrayOfChar5.length;
        i18 = 0;
        if (i17 > i18)
          break label741;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "%%O7(".toCharArray();
        int i21 = arrayOfChar6.length;
        i22 = 0;
        if (i21 > i22)
          break label833;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = ")&_+(!-u73".toCharArray();
        int i25 = arrayOfChar7.length;
        i26 = 0;
        if (i25 > i26)
          break label925;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "),N,=#(F)960\00579'0I)9\006 ^(=4:".toCharArray();
        int i29 = arrayOfChar8.length;
        i30 = 0;
        if (i29 > i30)
          break label1017;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "),N,=#(F)960\005!97=X*%".toCharArray();
        int i33 = arrayOfChar9.length;
        i34 = 0;
        if (i33 > i34)
          break label1109;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "*<F)".toCharArray();
        int i37 = arrayOfChar10.length;
        i38 = 0;
        if (i37 > i38)
          break label1201;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        z = arrayOfString;
        q = 0;
      }
    }
    else
    {
      int i3 = arrayOfChar1[i2];
      int i4;
      switch (i2 % 5)
      {
      default:
        i4 = 92;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[i2] = (char)(i4 ^ i3);
        i2++;
        break;
        i4 = 68;
        continue;
        i4 = 73;
        continue;
        i4 = 42;
        continue;
        i4 = 69;
      }
    }
    int i7 = arrayOfChar2[i6];
    int i8;
    switch (i6 % 5)
    {
    default:
      i8 = 92;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i6] = (char)(i8 ^ i7);
      i6++;
      break;
      i8 = 68;
      continue;
      i8 = 73;
      continue;
      i8 = 42;
      continue;
      i8 = 69;
    }
    label557: int i11 = arrayOfChar3[i10];
    int i12;
    switch (i10 % 5)
    {
    default:
      i12 = 92;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i10] = (char)(i12 ^ i11);
      i10++;
      break;
      i12 = 68;
      continue;
      i12 = 73;
      continue;
      i12 = 42;
      continue;
      i12 = 69;
    }
    label649: int i15 = arrayOfChar4[i14];
    int i16;
    switch (i14 % 5)
    {
    default:
      i16 = 92;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i14] = (char)(i16 ^ i15);
      i14++;
      break;
      i16 = 68;
      continue;
      i16 = 73;
      continue;
      i16 = 42;
      continue;
      i16 = 69;
    }
    label741: int i19 = arrayOfChar5[i18];
    int i20;
    switch (i18 % 5)
    {
    default:
      i20 = 92;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i18] = (char)(i20 ^ i19);
      i18++;
      break;
      i20 = 68;
      continue;
      i20 = 73;
      continue;
      i20 = 42;
      continue;
      i20 = 69;
    }
    label833: int i23 = arrayOfChar6[i22];
    int i24;
    switch (i22 % 5)
    {
    default:
      i24 = 92;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i22] = (char)(i24 ^ i23);
      i22++;
      break;
      i24 = 68;
      continue;
      i24 = 73;
      continue;
      i24 = 42;
      continue;
      i24 = 69;
    }
    label925: int i27 = arrayOfChar7[i26];
    int i28;
    switch (i26 % 5)
    {
    default:
      i28 = 92;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i26] = (char)(i28 ^ i27);
      i26++;
      break;
      i28 = 68;
      continue;
      i28 = 73;
      continue;
      i28 = 42;
      continue;
      i28 = 69;
    }
    label1017: int i31 = arrayOfChar8[i30];
    int i32;
    switch (i30 % 5)
    {
    default:
      i32 = 92;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar8[i30] = (char)(i32 ^ i31);
      i30++;
      break;
      i32 = 68;
      continue;
      i32 = 73;
      continue;
      i32 = 42;
      continue;
      i32 = 69;
    }
    label1109: int i35 = arrayOfChar9[i34];
    int i36;
    switch (i34 % 5)
    {
    default:
      i36 = 92;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar9[i34] = (char)(i36 ^ i35);
      i34++;
      break;
      i36 = 68;
      continue;
      i36 = 73;
      continue;
      i36 = 42;
      continue;
      i36 = 69;
    }
    label1201: int i39 = arrayOfChar10[i38];
    int i40;
    switch (i38 % 5)
    {
    default:
      i40 = 92;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar10[i38] = (char)(i40 ^ i39);
      i38++;
      break;
      i40 = 68;
      continue;
      i40 = 73;
      continue;
      i40 = 42;
      continue;
      i40 = 69;
    }
  }

  static ArrayList a(MediaGallery paramMediaGallery)
  {
    return paramMediaGallery.k;
  }

  static void a(MediaGallery paramMediaGallery, sz paramsz, int paramInt, MediaGalleryImageView paramMediaGalleryImageView)
  {
    paramMediaGallery.a(paramsz, paramInt, paramMediaGalleryImageView);
  }

  private void a(sz paramsz, int paramInt, MediaGalleryImageView paramMediaGalleryImageView)
  {
    boolean bool = DialogToastListActivity.f;
    if (paramsz == null)
      g5.d(z[9]);
    MediaData localMediaData = (MediaData)paramsz.t;
    switch (paramsz.l)
    {
    default:
    case 2:
    case 1:
      do
      {
        Bitmap localBitmap2;
        do
        {
          do
          {
            do
            {
              do
              {
                return;
                paramMediaGalleryImageView.setImageResource(2130837512);
              }
              while (!bool);
              SoftReference localSoftReference2 = (SoftReference)MediaGalleryImageView.tempBitmaps.get(paramsz.b);
              if (localSoftReference2 == null)
                break;
              Bitmap localBitmap3 = (Bitmap)localSoftReference2.get();
              if (localBitmap3 == null)
                break;
              paramMediaGalleryImageView.setImageBitmap(localBitmap3);
            }
            while (!bool);
            localBitmap2 = m5.b(paramsz);
          }
          while (localBitmap2 == null);
          paramMediaGalleryImageView.setImageBitmap(localBitmap2);
        }
        while ((localMediaData.file == null) || ((localBitmap2.getWidth() >= this.p) && (localBitmap2.getHeight() >= this.p)));
        paramMediaGalleryImageView.a(paramsz, paramInt, Uri.fromFile(localMediaData.file), this.p);
      }
      while (!bool);
    case 3:
    }
    SoftReference localSoftReference1 = (SoftReference)MediaGalleryImageView.tempBitmaps.get(paramsz.b);
    if (localSoftReference1 != null);
    for (Bitmap localBitmap1 = (Bitmap)localSoftReference1.get(); ; localBitmap1 = null)
    {
      if (localBitmap1 == null)
        localBitmap1 = m5.b(paramsz);
      if (localBitmap1 != null)
      {
        if ((localBitmap1.getWidth() != h.X) || (localBitmap1.getHeight() != h.X))
          localBitmap1 = Bitmap.createScaledBitmap(localBitmap1, h.X, h.X, true);
        paramMediaGalleryImageView.setImageDrawable(new VideoBitmapDrawable(this, localBitmap1, Formatter.formatShortFileSize(App.Mb, paramsz.m), 0.0F));
        if (!bool)
          break;
      }
      paramMediaGalleryImageView.setImageResource(2130837517);
      break;
    }
  }

  private int b()
  {
    int i1 = h.Y + 2 * h.Z + (int)h.ab;
    this.l = (this.j.getWidth() / i1);
    g5.b(z[0] + this.l);
    this.p = ((this.j.getWidth() - (int)h.ab * (2 + this.l)) / this.l);
    g5.b(z[1] + (this.j.getWidth() - this.p * this.l - (int)h.ab * (-1 + this.l)));
    return this.p;
  }

  static String b(MediaGallery paramMediaGallery)
  {
    return paramMediaGallery.i;
  }

  static TreeMap c(MediaGallery paramMediaGallery)
  {
    return paramMediaGallery.s;
  }

  static int d(MediaGallery paramMediaGallery)
  {
    return paramMediaGallery.l;
  }

  static j4 d()
  {
    return h;
  }

  static int e(MediaGallery paramMediaGallery)
  {
    return paramMediaGallery.p;
  }

  static View.OnClickListener f(MediaGallery paramMediaGallery)
  {
    return paramMediaGallery.r;
  }

  public aab a(long paramLong)
  {
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTime(new Date(paramLong));
    aab localaab;
    if (localCalendar.after(this.t))
      localaab = this.t;
    while (true)
    {
      return localaab;
      if (localCalendar.after(this.u))
        localaab = this.u;
      else if (localCalendar.after(this.v))
        localaab = this.v;
      else if (localCalendar.after(this.w))
        localaab = new aab(this, 4, new GregorianCalendar(localCalendar.get(1), localCalendar.get(2), 1));
      else
        localaab = new aab(this, 5, new GregorianCalendar(localCalendar.get(1), 1, 1));
    }
  }

  public void a()
  {
    boolean bool = DialogToastListActivity.f;
    Iterator localIterator = this.k.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      sz localsz = (sz)localIterator.next();
      aab localaab = a(localsz.i);
      ArrayList localArrayList = (ArrayList)this.s.get(localaab);
      if (localArrayList == null)
      {
        localArrayList = new ArrayList();
        this.s.put(localaab, localArrayList);
      }
      localArrayList.add(localsz);
    }
    while (!bool);
  }

  public void c()
  {
    g5.b(z[7]);
    this.n.removeAllViewsInLayout();
    MediaGalleryImageView.a();
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    b();
    this.m.a();
    this.m.notifyDataSetChanged();
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool = DialogToastListActivity.f;
    g5.b(z[3]);
    super.onCreate(paramBundle);
    App.z();
    setContentView(2130903107);
    if (h == null)
      h = j4.a(this);
    g = this;
    this.t = new aab(this, 1, Calendar.getInstance());
    this.t.add(6, -2);
    this.u = new aab(this, 2, Calendar.getInstance());
    this.u.add(6, -7);
    this.v = new aab(this, 3, Calendar.getInstance());
    this.v.add(6, -28);
    this.w = Calendar.getInstance();
    this.w.add(6, -366);
    this.i = getIntent().getStringExtra(z[2]);
    this.j = getWindowManager().getDefaultDisplay();
    zq localzq = App.w.a(this.i, null);
    Object localObject;
    SpannableStringBuilder localSpannableStringBuilder;
    if (localzq.o())
    {
      if (localzq.h != null)
      {
        localObject = localzq.b();
        localSpannableStringBuilder = v4.a((String)localObject, getBaseContext());
        TextView localTextView = (TextView)findViewById(2131558707);
        if (localSpannableStringBuilder != null)
          break label495;
        localTextView.setText((CharSequence)localObject);
        if (!bool);
      }
    }
    else
      ((TextView)findViewById(2131558708)).setText(2131296787);
    this.k = App.z.n(this.i);
    this.n = getListView();
    this.n.setClickable(false);
    b();
    if (this.k.size() == 0)
      findViewById(2131558708).setVisibility(0);
    a();
    this.n.setBackgroundDrawable(null);
    this.n.setDividerHeight(0);
    this.m = new se(this);
    this.n.setAdapter(this.m);
    this.n.setClickable(false);
    this.r = new rw(this);
    if (getIntent().getBooleanExtra(z[5], false))
    {
      String str = Environment.getExternalStorageState();
      if ((!str.equals(z[4])) && (!str.equals(z[6])))
        if (!App.tb())
          break label502;
    }
    label495: label502: for (int i1 = 2131296438; ; i1 = 2131296439)
    {
      a(i1);
      if (bool)
        a(2131296785);
      this.n.setSelection(-1 + this.m.getCount());
      this.n.setOnScrollListener(new sw(this));
      m5.b(this.i);
      return;
      localObject = localSpannableStringBuilder;
      break;
    }
  }

  public void onDestroy()
  {
    g5.b(z[8]);
    super.onDestroy();
    g = null;
    c();
    m5.c(this.i);
    App.z();
  }

  public void onPause()
  {
    if (this.o != null)
    {
      this.o.a();
      this.o.interrupt();
      this.o = null;
    }
    super.onPause();
  }

  public void onResume()
  {
    super.onResume();
    this.o = new q9();
    this.o.a = false;
    this.o.setPriority(1);
    this.o.start();
  }
}