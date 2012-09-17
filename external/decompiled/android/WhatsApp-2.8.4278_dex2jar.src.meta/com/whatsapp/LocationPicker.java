package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MyLocationOverlay;
import java.util.List;

public class LocationPicker extends MapActivity
  implements jt
{
  private static long m;
  private static boolean s;
  private static final String[] z;
  private String a;
  private GoogleMapView b;
  private TextView c;
  private MyLocationOverlay d;
  private gf e;
  private ProgressBar f;
  private ListView g;
  private TextView h;
  private qe i;
  private jb j;
  private z9 k;
  private fy l;
  private Handler n;
  private Runnable o;
  private boolean p;
  private Location q;
  private boolean r = true;

  static
  {
    String[] arrayOfString = new String[10];
    char[] arrayOfChar1 = "\026z\0018".toCharArray();
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
      arrayOfChar2 = "��t\032".toCharArray();
      int i5 = arrayOfChar2.length;
      i6 = 0;
      if (i5 <= i6)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "��z��".toCharArray();
        int i9 = arrayOfChar3.length;
        i10 = 0;
        if (i9 > i10)
          break label560;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\r{\n'm\005q@<l\030p��!,\rv\032<m\002;=\020C>V&".toCharArray();
        int i13 = arrayOfChar4.length;
        i14 = 0;
        if (i13 > i14)
          break label648;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\035`\013'{".toCharArray();
        int i17 = arrayOfChar5.length;
        i18 = 0;
        if (i17 > i18)
          break label736;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "\013e\035".toCharArray();
        int i21 = arrayOfChar6.length;
        i22 = 0;
        if (i21 > i22)
          break label824;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "\002p\032\"m\036~".toCharArray();
        int i25 = arrayOfChar7.length;
        i26 = 0;
        if (i25 > i26)
          break label912;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "��z\r4v\005z��".toCharArray();
        int i29 = arrayOfChar8.length;
        i30 = 0;
        if (i29 > i30)
          break label1000;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "��z\r4v\005z��%k\017~\013'-\017g\0134v\t".toCharArray();
        int i33 = arrayOfChar9.length;
        i34 = 0;
        if (i33 > i34)
          break label1088;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "\006|\n".toCharArray();
        int i37 = arrayOfChar10.length;
        i38 = 0;
        if (i37 > i38)
          break label1176;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        z = arrayOfString;
        m = 0L;
        s = false;
      }
    }
    else
    {
      int i3 = arrayOfChar1[i2];
      int i4;
      switch (i2 % 5)
      {
      default:
        i4 = 2;
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
        i4 = 108;
        continue;
        i4 = 21;
        continue;
        i4 = 110;
        continue;
        i4 = 85;
      }
    }
    int i7 = arrayOfChar2[i6];
    int i8;
    switch (i6 % 5)
    {
    default:
      i8 = 2;
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
      i8 = 108;
      continue;
      i8 = 21;
      continue;
      i8 = 110;
      continue;
      i8 = 85;
    }
    label560: int i11 = arrayOfChar3[i10];
    int i12;
    switch (i10 % 5)
    {
    default:
      i12 = 2;
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
      i12 = 108;
      continue;
      i12 = 21;
      continue;
      i12 = 110;
      continue;
      i12 = 85;
    }
    label648: int i15 = arrayOfChar4[i14];
    int i16;
    switch (i14 % 5)
    {
    default:
      i16 = 2;
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
      i16 = 108;
      continue;
      i16 = 21;
      continue;
      i16 = 110;
      continue;
      i16 = 85;
    }
    label736: int i19 = arrayOfChar5[i18];
    int i20;
    switch (i18 % 5)
    {
    default:
      i20 = 2;
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
      i20 = 108;
      continue;
      i20 = 21;
      continue;
      i20 = 110;
      continue;
      i20 = 85;
    }
    label824: int i23 = arrayOfChar6[i22];
    int i24;
    switch (i22 % 5)
    {
    default:
      i24 = 2;
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
      i24 = 108;
      continue;
      i24 = 21;
      continue;
      i24 = 110;
      continue;
      i24 = 85;
    }
    label912: int i27 = arrayOfChar7[i26];
    int i28;
    switch (i26 % 5)
    {
    default:
      i28 = 2;
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
      i28 = 108;
      continue;
      i28 = 21;
      continue;
      i28 = 110;
      continue;
      i28 = 85;
    }
    label1000: int i31 = arrayOfChar8[i30];
    int i32;
    switch (i30 % 5)
    {
    default:
      i32 = 2;
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
      i32 = 108;
      continue;
      i32 = 21;
      continue;
      i32 = 110;
      continue;
      i32 = 85;
    }
    label1088: int i35 = arrayOfChar9[i34];
    int i36;
    switch (i34 % 5)
    {
    default:
      i36 = 2;
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
      i36 = 108;
      continue;
      i36 = 21;
      continue;
      i36 = 110;
      continue;
      i36 = 85;
    }
    label1176: int i39 = arrayOfChar10[i38];
    int i40;
    switch (i38 % 5)
    {
    default:
      i40 = 2;
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
      i40 = 108;
      continue;
      i40 = 21;
      continue;
      i40 = 110;
      continue;
      i40 = 85;
    }
  }

  static long a(long paramLong)
  {
    m = paramLong;
    return paramLong;
  }

  static Location a(LocationPicker paramLocationPicker, Location paramLocation)
  {
    paramLocationPicker.q = paramLocation;
    return paramLocation;
  }

  static fy a(LocationPicker paramLocationPicker, fy paramfy)
  {
    paramLocationPicker.l = paramfy;
    return paramfy;
  }

  static z9 a(LocationPicker paramLocationPicker)
  {
    return paramLocationPicker.k;
  }

  static z9 a(LocationPicker paramLocationPicker, z9 paramz9)
  {
    paramLocationPicker.k = paramz9;
    return paramz9;
  }

  private void a()
  {
    String str;
    if (this.k != null)
      if (this.k.h == 2)
        str = getString(2131296666);
    while (true)
    {
      this.g.removeFooterView(this.h);
      if (str != null)
      {
        this.h.setText(Html.fromHtml(str));
        this.g.addFooterView(this.h, null, true);
      }
      return;
      str = this.k.e;
      continue;
      str = null;
    }
  }

  private void a(Location paramLocation, int paramInt, String paramString, boolean paramBoolean)
  {
    this.n.removeCallbacks(this.o);
    this.f.setVisibility(0);
    this.g.removeFooterView(this.h);
    this.k = new z9();
    this.i.notifyDataSetChanged();
    this.j = new jb(this, paramLocation, paramInt, paramString, paramBoolean);
    this.j.execute(new Void[0]);
  }

  static void a(LocationPicker paramLocationPicker, Location paramLocation, int paramInt, String paramString, boolean paramBoolean)
  {
    paramLocationPicker.a(paramLocation, paramInt, paramString, paramBoolean);
  }

  static boolean a(LocationPicker paramLocationPicker, boolean paramBoolean)
  {
    paramLocationPicker.r = paramBoolean;
    return paramBoolean;
  }

  static boolean a(boolean paramBoolean)
  {
    s = paramBoolean;
    return paramBoolean;
  }

  static boolean b()
  {
    return s;
  }

  static boolean b(LocationPicker paramLocationPicker)
  {
    return paramLocationPicker.r;
  }

  static boolean b(LocationPicker paramLocationPicker, boolean paramBoolean)
  {
    paramLocationPicker.p = paramBoolean;
    return paramBoolean;
  }

  static long c()
  {
    return m;
  }

  static boolean c(LocationPicker paramLocationPicker)
  {
    return paramLocationPicker.p;
  }

  static MyLocationOverlay d(LocationPicker paramLocationPicker)
  {
    return paramLocationPicker.d;
  }

  static GoogleMapView e(LocationPicker paramLocationPicker)
  {
    return paramLocationPicker.b;
  }

  static Location f(LocationPicker paramLocationPicker)
  {
    return paramLocationPicker.q;
  }

  static String g(LocationPicker paramLocationPicker)
  {
    return paramLocationPicker.a;
  }

  static fy h(LocationPicker paramLocationPicker)
  {
    return paramLocationPicker.l;
  }

  static ProgressBar i(LocationPicker paramLocationPicker)
  {
    return paramLocationPicker.f;
  }

  static void j(LocationPicker paramLocationPicker)
  {
    paramLocationPicker.a();
  }

  static qe k(LocationPicker paramLocationPicker)
  {
    return paramLocationPicker.i;
  }

  static gf l(LocationPicker paramLocationPicker)
  {
    return paramLocationPicker.e;
  }

  static TextView m(LocationPicker paramLocationPicker)
  {
    return paramLocationPicker.c;
  }

  static ListView n(LocationPicker paramLocationPicker)
  {
    return paramLocationPicker.g;
  }

  public void a(GeoPoint paramGeoPoint, int paramInt1, int paramInt2)
  {
  }

  protected boolean isRouteDisplayed()
  {
    return false;
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool = DialogToastListActivity.f;
    super.onCreate(paramBundle);
    g5.b(z[8]);
    if (App.bb == null)
    {
      finish();
      return;
    }
    this.a = getIntent().getStringExtra(z[9]);
    this.k = ((z9)getLastNonConfigurationInstance());
    setContentView(2130903102);
    this.c = ((TextView)findViewById(2131558698));
    this.b = ((GoogleMapView)findViewById(2131558691));
    this.b.a(this);
    this.b.setBuiltInZoomControls(false);
    this.b.getController().setZoom(18);
    this.d = new jf(this, this, this.b);
    this.n = new Handler();
    this.o = new sv(this);
    if (this.k == null)
    {
      this.d.runOnFirstFix(new tv(this));
      this.n.postDelayed(this.o, 15000L);
      if (!bool);
    }
    else
    {
      if (paramBundle != null)
      {
        int i2 = paramBundle.getInt(z[0]);
        if (i2 > 0)
        {
          GeoPoint localGeoPoint = new GeoPoint(paramBundle.getInt(z[1]), paramBundle.getInt(z[2]));
          this.b.getController().setCenter(localGeoPoint);
          this.b.getController().setZoom(i2);
        }
        if (!bool);
      }
      else if (this.k.a != null)
      {
        this.b.b(GoogleMapView.a(this.k.a));
      }
      if ((this.k.d != null) && (!"".equals(this.k.d)))
      {
        TextView localTextView = this.c;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.k.d;
        localTextView.setText(getString(2131296663, arrayOfObject));
        if (!bool);
      }
      else
      {
        this.c.setText(2131296662);
      }
    }
    this.e = new gf(this);
    this.e.a();
    this.b.getOverlays().add(this.e);
    this.b.getOverlays().add(this.d);
    findViewById(2131558697).setOnClickListener(new uv(this));
    this.i = new qe(this, this);
    this.g = ((ListView)findViewById(2131558699));
    this.h = new TextView(this);
    this.h.setMovementMethod(LinkMovementMethod.getInstance());
    this.h.setGravity(17);
    this.h.setPadding((int)j4.a(this).J, 0, (int)j4.a(this).J, 0);
    this.g.setFooterDividersEnabled(true);
    this.g.addFooterView(this.h, null, true);
    this.g.setAdapter(this.i);
    a();
    this.g.setOnItemClickListener(new vv(this));
    findViewById(2131558690).setOnClickListener(new wv(this));
    findViewById(2131558533).setOnClickListener(new yv(this));
    this.f = ((ProgressBar)findViewById(2131558624));
    ProgressBar localProgressBar = this.f;
    if (this.k == null);
    for (int i1 = 0; ; i1 = 8)
    {
      localProgressBar.setVisibility(i1);
      ImageButton localImageButton = (ImageButton)findViewById(2131558696);
      localImageButton.setOnClickListener(new zv(this));
      if (App.f == 3)
        localImageButton.setOnLongClickListener(new aw(this));
      if (paramBundle != null)
        break;
      LocationManager localLocationManager = (LocationManager)getSystemService(z[7]);
      if ((localLocationManager.isProviderEnabled(z[5])) || (localLocationManager.isProviderEnabled(z[6])))
        break;
      showDialog(2);
      break;
    }
  }

  public Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 2:
    }
    rv localrv;
    for (Object localObject = super.onCreateDialog(paramInt); ; localObject = new AlertDialog.Builder(this).setTitle(2131296526).setMessage(2131296527).setCancelable(true).setPositiveButton(2131296270, localrv).create())
    {
      return localObject;
      localrv = new rv(this);
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    if (this.n != null)
      this.n.removeCallbacks(this.o);
    if (this.j != null)
    {
      this.j.cancel(true);
      this.j = null;
    }
  }

  public void onNewIntent(Intent paramIntent)
  {
    if (z[3].equals(paramIntent.getAction()))
    {
      String str = paramIntent.getStringExtra(z[4]);
      a(this.b.c(), Math.max(this.b.b(), 1500), str, true);
    }
  }

  protected void onPause()
  {
    super.onPause();
    this.d.disableMyLocation();
  }

  protected void onResume()
  {
    super.onResume();
    this.d.enableMyLocation();
  }

  public Object onRetainNonConfigurationInstance()
  {
    return this.k;
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    GeoPoint localGeoPoint = this.b.getMapCenter();
    paramBundle.putInt(z[1], localGeoPoint.getLatitudeE6());
    paramBundle.putInt(z[2], localGeoPoint.getLongitudeE6());
    paramBundle.putInt(z[0], this.b.getZoomLevel());
  }

  public boolean onSearchRequested()
  {
    this.b.setLayoutParams(new LinearLayout.LayoutParams(this.b.getWidth(), this.b.getHeight()));
    if (this.k == null);
    for (String str = null; ; str = this.k.d)
    {
      startSearch(str, true, null, false);
      return true;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.LocationPicker
 * JD-Core Version:    0.6.1
 */