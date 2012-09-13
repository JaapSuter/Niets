package com.whatsapp.wallpaper;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.os.AsyncTask.Status;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import com.whatsapp.CustomVelocityGallery;
import com.whatsapp.g5;
import java.io.Serializable;
import java.util.ArrayList;

public class WallpaperPicker extends Activity
  implements AdapterView.OnItemSelectedListener, View.OnClickListener
{
  private static final String[] z;
  private CustomVelocityGallery a;
  private ImageView b;
  PackageManager c;
  private Bitmap d;
  private ArrayList<Integer> e = new ArrayList(24);
  private ArrayList<Integer> f = new ArrayList(24);
  private a g;
  private b h;
  private boolean i = false;
  Resources j = null;

  static
  {
    String[] arrayOfString = new String[9];
    char[] arrayOfChar1 = "W#9_U_)s^_B94C]Ec\016hyc\037\024yci\036\030yn\003\032~".toCharArray();
    int k = arrayOfChar1.length;
    int m = 0;
    char[] arrayOfChar2;
    int i3;
    char[] arrayOfChar3;
    int i7;
    char[] arrayOfChar4;
    int i11;
    char[] arrayOfChar5;
    int i15;
    char[] arrayOfChar6;
    int i19;
    char[] arrayOfChar7;
    int i23;
    char[] arrayOfChar8;
    int i27;
    char[] arrayOfChar9;
    int i31;
    if (k <= m)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "W#9_U_)s^_B94C]Ec\034}jz\004\036ln\002\023ris\031\tdtq\036".toCharArray();
      int i2 = arrayOfChar2.length;
      i3 = 0;
      if (i2 <= i3)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "Y?4HTB,)DUX".toCharArray();
        int i6 = arrayOfChar3.length;
        i7 = 0;
        if (i6 > i7)
          break label517;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "D(9d^".toCharArray();
        int i10 = arrayOfChar4.length;
        i11 = 0;
        if (i10 > i11)
          break label609;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "A,1AJW=8_eF$>F_D".toCharArray();
        int i14 = arrayOfChar5.length;
        i15 = 0;
        if (i14 > i15)
          break label701;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "U\"0\003M^,)^[F=sZ[Z!-LJS?".toCharArray();
        int i18 = arrayOfChar6.length;
        i19 = 0;
        if (i18 > i19)
          break label793;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "R?<Z[T!8".toCharArray();
        int i22 = arrayOfChar7.length;
        i23 = 0;
        if (i22 > i23)
          break label885;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "i>0LVZ".toCharArray();
        int i26 = arrayOfChar8.length;
        i27 = 0;
        if (i26 > i27)
          break label977;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "A,1AJW=8_\025D(.BOD.8rTY9\002KUC#9".toCharArray();
        int i30 = arrayOfChar9.length;
        i31 = 0;
        if (i30 > i31)
          break label1069;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int n = arrayOfChar1[m];
      int i1;
      switch (m % 5)
      {
      default:
        i1 = 58;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[m] = (char)(i1 ^ n);
        m++;
        break;
        i1 = 54;
        continue;
        i1 = 77;
        continue;
        i1 = 93;
        continue;
        i1 = 45;
      }
    }
    int i4 = arrayOfChar2[i3];
    int i5;
    switch (i3 % 5)
    {
    default:
      i5 = 58;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i3] = (char)(i5 ^ i4);
      i3++;
      break;
      i5 = 54;
      continue;
      i5 = 77;
      continue;
      i5 = 93;
      continue;
      i5 = 45;
    }
    label517: int i8 = arrayOfChar3[i7];
    int i9;
    switch (i7 % 5)
    {
    default:
      i9 = 58;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i7] = (char)(i9 ^ i8);
      i7++;
      break;
      i9 = 54;
      continue;
      i9 = 77;
      continue;
      i9 = 93;
      continue;
      i9 = 45;
    }
    label609: int i12 = arrayOfChar4[i11];
    int i13;
    switch (i11 % 5)
    {
    default:
      i13 = 58;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i11] = (char)(i13 ^ i12);
      i11++;
      break;
      i13 = 54;
      continue;
      i13 = 77;
      continue;
      i13 = 93;
      continue;
      i13 = 45;
    }
    label701: int i16 = arrayOfChar5[i15];
    int i17;
    switch (i15 % 5)
    {
    default:
      i17 = 58;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i15] = (char)(i17 ^ i16);
      i15++;
      break;
      i17 = 54;
      continue;
      i17 = 77;
      continue;
      i17 = 93;
      continue;
      i17 = 45;
    }
    label793: int i20 = arrayOfChar6[i19];
    int i21;
    switch (i19 % 5)
    {
    default:
      i21 = 58;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i19] = (char)(i21 ^ i20);
      i19++;
      break;
      i21 = 54;
      continue;
      i21 = 77;
      continue;
      i21 = 93;
      continue;
      i21 = 45;
    }
    label885: int i24 = arrayOfChar7[i23];
    int i25;
    switch (i23 % 5)
    {
    default:
      i25 = 58;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i23] = (char)(i25 ^ i24);
      i23++;
      break;
      i25 = 54;
      continue;
      i25 = 77;
      continue;
      i25 = 93;
      continue;
      i25 = 45;
    }
    label977: int i28 = arrayOfChar8[i27];
    int i29;
    switch (i27 % 5)
    {
    default:
      i29 = 58;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar8[i27] = (char)(i29 ^ i28);
      i27++;
      break;
      i29 = 54;
      continue;
      i29 = 77;
      continue;
      i29 = 93;
      continue;
      i29 = 45;
    }
    label1069: int i32 = arrayOfChar9[i31];
    int i33;
    switch (i31 % 5)
    {
    default:
      i33 = 58;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar9[i31] = (char)(i33 ^ i32);
      i31++;
      break;
      i33 = 54;
      continue;
      i33 = 77;
      continue;
      i33 = 93;
      continue;
      i33 = 45;
    }
  }

  static Bitmap a(WallpaperPicker paramWallpaperPicker, Bitmap paramBitmap)
  {
    paramWallpaperPicker.d = paramBitmap;
    return paramBitmap;
  }

  static a a(WallpaperPicker paramWallpaperPicker, a parama)
  {
    paramWallpaperPicker.g = parama;
    return parama;
  }

  static ArrayList a(WallpaperPicker paramWallpaperPicker)
  {
    return paramWallpaperPicker.e;
  }

  private void a()
  {
    a(this.j, z[5]);
  }

  private void a(int paramInt)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra(z[3], (Serializable)this.f.get(paramInt));
    int k = getIntent().getIntExtra(z[2], 1);
    localIntent.putExtra(z[2], k);
    setResult(-1, localIntent);
    finish();
  }

  private void a(Resources paramResources, String paramString)
  {
    boolean bool = ImageViewTouchBase.a;
    while (true)
    {
      int m;
      try
      {
        String[] arrayOfString = paramResources.getStringArray(2131034112);
        int k = arrayOfString.length;
        m = 0;
        if (m < k)
        {
          String str = arrayOfString[m];
          int n = paramResources.getIdentifier(str, z[6], paramString);
          if (n != 0)
          {
            int i1 = paramResources.getIdentifier(str + z[7], z[6], paramString);
            if (i1 != 0)
            {
              this.e.add(Integer.valueOf(i1));
              this.f.add(Integer.valueOf(n));
            }
          }
        }
        else if (this.f.size() == 0)
        {
          removeDialog(3);
          showDialog(1);
        }
        else
        {
          this.h.notifyDataSetChanged();
          this.i = true;
        }
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        g5.d(z[8]);
        removeDialog(3);
        showDialog(1);
      }
      catch (NullPointerException localNullPointerException)
      {
        removeDialog(3);
        showDialog(1);
      }
      m++;
      if (!bool);
    }
  }

  static ArrayList b(WallpaperPicker paramWallpaperPicker)
  {
    return paramWallpaperPicker.f;
  }

  static Bitmap c(WallpaperPicker paramWallpaperPicker)
  {
    return paramWallpaperPicker.d;
  }

  static ImageView d(WallpaperPicker paramWallpaperPicker)
  {
    return paramWallpaperPicker.b;
  }

  public void onClick(View paramView)
  {
    if (this.i)
    {
      a(this.a.getSelectedItemPosition());
      if (!ImageViewTouchBase.a);
    }
    else
    {
      finish();
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    this.c = getPackageManager();
    setContentView(2130903133);
    this.a = ((CustomVelocityGallery)findViewById(2131558709));
    this.a.a(new m(this));
    this.h = new b(this, this);
    this.a.setAdapter(this.h);
    this.a.setOnItemSelectedListener(this);
    this.a.setCallbackDuringFling(false);
    findViewById(2131558806).setOnClickListener(this);
    this.b = ((ImageView)findViewById(2131558805));
    try
    {
      this.j = this.c.getResourcesForApplication(z[5]);
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
      {
        g5.d(z[4] + localNameNotFoundException.toString());
        showDialog(3);
      }
    }
  }

  public Dialog onCreateDialog(int paramInt)
  {
    Object localObject;
    switch (paramInt)
    {
    default:
      localObject = null;
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      return localObject;
      if (Build.VERSION.SDK_INT >= 14);
      for (String str = z[0]; ; str = z[1])
      {
        localObject = new AlertDialog.Builder(this).setTitle(getString(2131296493)).setMessage(getString(2131296674)).setPositiveButton(getString(2131296272), new o(this, str)).setNegativeButton(getString(2131296273), new n(this)).create();
        break;
      }
      p localp = new p(this);
      localObject = new AlertDialog.Builder(this).setMessage(2131296583).setPositiveButton(2131296270, localp).setNegativeButton(2131296268, new r(this)).setOnCancelListener(new q(this)).create();
      continue;
      localObject = new AlertDialog.Builder(this).setTitle(getString(2131296269)).setMessage(getString(2131296587)).setPositiveButton(getString(2131296270), new s(this)).create();
    }
  }

  protected void onDestroy()
  {
    super.onDestroy();
    if ((this.g != null) && (this.g.getStatus() != AsyncTask.Status.FINISHED))
    {
      this.g.cancel(true);
      this.g = null;
    }
  }

  public void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ((this.g != null) && (this.g.getStatus() != AsyncTask.Status.FINISHED))
      this.g.a();
    a locala = new a(this);
    Integer[] arrayOfInteger = new Integer[1];
    arrayOfInteger[0] = Integer.valueOf(paramInt);
    this.g = ((a)locala.execute(arrayOfInteger));
  }

  public void onNothingSelected(AdapterView paramAdapterView)
  {
  }

  protected void onResume()
  {
    super.onResume();
    a();
  }
}