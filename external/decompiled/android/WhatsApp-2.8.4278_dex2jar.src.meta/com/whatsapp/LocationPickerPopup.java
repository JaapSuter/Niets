package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class LocationPickerPopup extends Activity
{
  private static long o;
  private static final String[] z;
  private String a;
  private re b;
  private z9 c;
  private Location d;
  private LocationManager e;
  private LocationListener f;
  private View g;
  private ImageView h;
  private TextView i;
  private kb j;
  private AlertDialog k;
  private Location l;
  private Handler m;
  private Runnable n;

  static
  {
    String[] arrayOfString = new String[9];
    char[] arrayOfChar1 = ":1\030U\036?1\025D\00355\036@E2;\b@\0309'".toCharArray();
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
    if (i1 <= i2)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "<7\037".toCharArray();
      int i5 = arrayOfChar2.length;
      i6 = 0;
      if (i5 <= i6)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = ":?\002[\037\"\001\022Z\f:?\017Q\030".toCharArray();
        int i9 = arrayOfChar3.length;
        i10 = 0;
        if (i9 > i10)
          break label521;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = ":1\030U\036?1\025".toCharArray();
        int i13 = arrayOfChar4.length;
        i14 = 0;
        if (i13 > i14)
          break label613;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = ":1\030U\036?1\025D\00355\036FE5,\036U\0363".toCharArray();
        int i17 = arrayOfChar5.length;
        i18 = 0;
        if (i17 > i18)
          break label705;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "0?\022X\0172~\017[J$;\nA\017%*[s:\005~\027[\t7*\022[\004v+\013P\013\";W\024\00310\024F\017".toCharArray();
        int i21 = arrayOfChar6.length;
        i22 = 0;
        if (i21 > i22)
          break label797;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "1.\b".toCharArray();
        int i25 = arrayOfChar7.length;
        i26 = 0;
        if (i25 > i26)
          break label889;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "8;\017C\005$5".toCharArray();
        int i29 = arrayOfChar8.length;
        i30 = 0;
        if (i29 > i30)
          break label981;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "0?\022XJ\"1[F\017'+\036G\036v\020>`=\031\f0\024\0069=\032@\00390[A\0322?\017QFv7\034Z\005$;".toCharArray();
        int i33 = arrayOfChar9.length;
        i34 = 0;
        if (i33 > i34)
          break label1073;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        z = arrayOfString;
        o = 0L;
      }
    }
    else
    {
      int i3 = arrayOfChar1[i2];
      int i4;
      switch (i2 % 5)
      {
      default:
        i4 = 106;
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
        i4 = 86;
        continue;
        i4 = 94;
        continue;
        i4 = 123;
        continue;
        i4 = 52;
      }
    }
    int i7 = arrayOfChar2[i6];
    int i8;
    switch (i6 % 5)
    {
    default:
      i8 = 106;
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
      i8 = 86;
      continue;
      i8 = 94;
      continue;
      i8 = 123;
      continue;
      i8 = 52;
    }
    label521: int i11 = arrayOfChar3[i10];
    int i12;
    switch (i10 % 5)
    {
    default:
      i12 = 106;
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
      i12 = 86;
      continue;
      i12 = 94;
      continue;
      i12 = 123;
      continue;
      i12 = 52;
    }
    label613: int i15 = arrayOfChar4[i14];
    int i16;
    switch (i14 % 5)
    {
    default:
      i16 = 106;
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
      i16 = 86;
      continue;
      i16 = 94;
      continue;
      i16 = 123;
      continue;
      i16 = 52;
    }
    label705: int i19 = arrayOfChar5[i18];
    int i20;
    switch (i18 % 5)
    {
    default:
      i20 = 106;
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
      i20 = 86;
      continue;
      i20 = 94;
      continue;
      i20 = 123;
      continue;
      i20 = 52;
    }
    label797: int i23 = arrayOfChar6[i22];
    int i24;
    switch (i22 % 5)
    {
    default:
      i24 = 106;
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
      i24 = 86;
      continue;
      i24 = 94;
      continue;
      i24 = 123;
      continue;
      i24 = 52;
    }
    label889: int i27 = arrayOfChar7[i26];
    int i28;
    switch (i26 % 5)
    {
    default:
      i28 = 106;
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
      i28 = 86;
      continue;
      i28 = 94;
      continue;
      i28 = 123;
      continue;
      i28 = 52;
    }
    label981: int i31 = arrayOfChar8[i30];
    int i32;
    switch (i30 % 5)
    {
    default:
      i32 = 106;
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
      i32 = 86;
      continue;
      i32 = 94;
      continue;
      i32 = 123;
      continue;
      i32 = 52;
    }
    label1073: int i35 = arrayOfChar9[i34];
    int i36;
    switch (i34 % 5)
    {
    default:
      i36 = 106;
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
      i36 = 86;
      continue;
      i36 = 94;
      continue;
      i36 = 123;
      continue;
      i36 = 52;
    }
  }

  static long a()
  {
    return o;
  }

  static long a(long paramLong)
  {
    o = paramLong;
    return paramLong;
  }

  static Location a(LocationPickerPopup paramLocationPickerPopup)
  {
    return paramLocationPickerPopup.l;
  }

  static z9 a(LocationPickerPopup paramLocationPickerPopup, z9 paramz9)
  {
    paramLocationPickerPopup.c = paramz9;
    return paramz9;
  }

  private void a(Location paramLocation)
  {
    if (this.c == null)
    {
      this.e.removeUpdates(this.f);
      this.c = new z9();
      this.d = paramLocation;
      this.j = new kb(this, paramLocation);
      this.j.execute(new Void[0]);
    }
  }

  static void a(LocationPickerPopup paramLocationPickerPopup, Location paramLocation)
  {
    paramLocationPickerPopup.a(paramLocation);
  }

  static Location b(LocationPickerPopup paramLocationPickerPopup, Location paramLocation)
  {
    paramLocationPickerPopup.l = paramLocation;
    return paramLocation;
  }

  static z9 b(LocationPickerPopup paramLocationPickerPopup)
  {
    return paramLocationPickerPopup.c;
  }

  static Runnable c(LocationPickerPopup paramLocationPickerPopup)
  {
    return paramLocationPickerPopup.n;
  }

  static Handler d(LocationPickerPopup paramLocationPickerPopup)
  {
    return paramLocationPickerPopup.m;
  }

  static Location e(LocationPickerPopup paramLocationPickerPopup)
  {
    return paramLocationPickerPopup.d;
  }

  static String f(LocationPickerPopup paramLocationPickerPopup)
  {
    return paramLocationPickerPopup.a;
  }

  static TextView g(LocationPickerPopup paramLocationPickerPopup)
  {
    return paramLocationPickerPopup.i;
  }

  static ImageView h(LocationPickerPopup paramLocationPickerPopup)
  {
    return paramLocationPickerPopup.h;
  }

  static View i(LocationPickerPopup paramLocationPickerPopup)
  {
    return paramLocationPickerPopup.g;
  }

  static AlertDialog j(LocationPickerPopup paramLocationPickerPopup)
  {
    return paramLocationPickerPopup.k;
  }

  static re k(LocationPickerPopup paramLocationPickerPopup)
  {
    return paramLocationPickerPopup.b;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    g5.b(z[4]);
    if (App.bb == null)
      finish();
    while (true)
    {
      return;
      this.a = getIntent().getStringExtra(z[1]);
      this.b = new re(this, this);
      LayoutInflater localLayoutInflater = (LayoutInflater)App.Mb.getBaseContext().getSystemService(z[2]);
      this.l = null;
      this.m = new Handler();
      this.n = new cw(this);
      this.m.postDelayed(this.n, 15000L);
      this.e = ((LocationManager)getSystemService(z[3]));
      this.f = new dw(this);
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
      localBuilder.setTitle(getResources().getText(2131296656));
      localBuilder.setAdapter(this.b, new ew(this));
      this.k = localBuilder.create();
      this.k.setOnCancelListener(new fw(this));
      ListView localListView = this.k.getListView();
      localListView.setHeaderDividersEnabled(true);
      View localView = localLayoutInflater.inflate(2130903103, null);
      this.i = ((TextView)localView.findViewById(2131558702));
      this.h = ((ImageView)localView.findViewById(2131558703));
      localListView.addHeaderView(localView, null, true);
      this.g = localLayoutInflater.inflate(2130903104, null);
      ((TextView)this.g.findViewById(2131558704)).setText(2131296659);
      localListView.addHeaderView(this.g, null, false);
      this.k.show();
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    g5.b(z[0]);
    this.m.removeCallbacks(this.n);
    if (this.j != null)
      this.j.cancel(true);
  }

  public void onPause()
  {
    this.e.removeUpdates(this.f);
    super.onPause();
  }

  public void onResume()
  {
    super.onResume();
    if (this.d == null);
    try
    {
      this.e.requestLocationUpdates(z[6], 0L, 0.0F, this.f);
    }
    catch (RuntimeException localRuntimeException1)
    {
      try
      {
        while (true)
        {
          this.e.requestLocationUpdates(z[7], 0L, 0.0F, this.f);
          return;
          localRuntimeException1 = localRuntimeException1;
          g5.b(z[5], localRuntimeException1);
        }
      }
      catch (RuntimeException localRuntimeException2)
      {
        while (true)
          g5.b(z[8], localRuntimeException2);
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.LocationPickerPopup
 * JD-Core Version:    0.6.1
 */