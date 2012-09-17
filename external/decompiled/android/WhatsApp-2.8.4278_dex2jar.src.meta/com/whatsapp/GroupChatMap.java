package com.whatsapp;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ZoomButtonsController;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView.LayoutParams;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.Projection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class GroupChatMap extends MapActivity
  implements jt
{
  private static final String[] z;
  private String a;
  private ArrayList<sz> b = new ArrayList();
  private MyLocationOverlay c;
  private int d;
  private GoogleMapView e;
  private ff f;
  private TextView g;
  private zq h;
  private int i = -1;
  private View.OnLongClickListener j;
  private ArrayList<View> k = new ArrayList();
  private final lq l = new pq(this);

  static
  {
    String[] arrayOfString = new String[7];
    char[] arrayOfChar1 = "\004>5J\001\f,1\027\n\020".toCharArray();
    int m = arrayOfChar1.length;
    int n = 0;
    char[] arrayOfChar2;
    int i4;
    char[] arrayOfChar3;
    int i8;
    char[] arrayOfChar4;
    int i12;
    char[] arrayOfChar5;
    int i16;
    char[] arrayOfChar6;
    int i20;
    char[] arrayOfChar7;
    int i24;
    if (m <= n)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\034/!\004\021\f'\004\t\0060+\026".toCharArray();
      int i3 = arrayOfChar2.length;
      i4 = 0;
      if (i3 <= i4)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\005><\n\020\035��,\013\003\005>1��\027".toCharArray();
        int i7 = arrayOfChar3.length;
        i8 = 0;
        if (i7 > i8)
          break label441;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\016-*\020\02562$\025J\033:6\020\t\035p6\016\f\031p&\n\013\035>&\021E\00701E\004\r; \001".toCharArray();
        int i11 = arrayOfChar4.length;
        i12 = 0;
        if (i11 > i12)
          break label533;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\016-*\020\02562$\025J\033:6\020\t\035p&\n\013\035>&\021E\00701E\004\r; \001".toCharArray();
        int i15 = arrayOfChar5.length;
        i16 = 0;
        if (i15 > i16)
          break label625;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "\004>5J\006\033:$\021��".toCharArray();
        int i19 = arrayOfChar6.length;
        i20 = 0;
        if (i19 > i20)
          break label717;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "\0036!".toCharArray();
        int i23 = arrayOfChar7.length;
        i24 = 0;
        if (i23 > i24)
          break label809;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int i1 = arrayOfChar1[n];
      int i2;
      switch (n % 5)
      {
      default:
        i2 = 101;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[n] = (char)(i2 ^ i1);
        n++;
        break;
        i2 = 105;
        continue;
        i2 = 95;
        continue;
        i2 = 69;
        continue;
        i2 = 101;
      }
    }
    int i5 = arrayOfChar2[i4];
    int i6;
    switch (i4 % 5)
    {
    default:
      i6 = 101;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i4] = (char)(i6 ^ i5);
      i4++;
      break;
      i6 = 105;
      continue;
      i6 = 95;
      continue;
      i6 = 69;
      continue;
      i6 = 101;
    }
    label441: int i9 = arrayOfChar3[i8];
    int i10;
    switch (i8 % 5)
    {
    default:
      i10 = 101;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i8] = (char)(i10 ^ i9);
      i8++;
      break;
      i10 = 105;
      continue;
      i10 = 95;
      continue;
      i10 = 69;
      continue;
      i10 = 101;
    }
    label533: int i13 = arrayOfChar4[i12];
    int i14;
    switch (i12 % 5)
    {
    default:
      i14 = 101;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i12] = (char)(i14 ^ i13);
      i12++;
      break;
      i14 = 105;
      continue;
      i14 = 95;
      continue;
      i14 = 69;
      continue;
      i14 = 101;
    }
    label625: int i17 = arrayOfChar5[i16];
    int i18;
    switch (i16 % 5)
    {
    default:
      i18 = 101;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i16] = (char)(i18 ^ i17);
      i16++;
      break;
      i18 = 105;
      continue;
      i18 = 95;
      continue;
      i18 = 69;
      continue;
      i18 = 101;
    }
    label717: int i21 = arrayOfChar6[i20];
    int i22;
    switch (i20 % 5)
    {
    default:
      i22 = 101;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i20] = (char)(i22 ^ i21);
      i20++;
      break;
      i22 = 105;
      continue;
      i22 = 95;
      continue;
      i22 = 69;
      continue;
      i22 = 101;
    }
    label809: int i25 = arrayOfChar7[i24];
    int i26;
    switch (i24 % 5)
    {
    default:
      i26 = 101;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i24] = (char)(i26 ^ i25);
      i24++;
      break;
      i26 = 105;
      continue;
      i26 = 95;
      continue;
      i26 = 69;
      continue;
      i26 = 101;
    }
  }

  static int a(GroupChatMap paramGroupChatMap, int paramInt)
  {
    paramGroupChatMap.d = paramInt;
    return paramInt;
  }

  static MyLocationOverlay a(GroupChatMap paramGroupChatMap)
  {
    return paramGroupChatMap.c;
  }

  static sz a(GroupChatMap paramGroupChatMap, String paramString)
  {
    return paramGroupChatMap.a(paramString);
  }

  private sz a(String paramString)
  {
    boolean bool = DialogToastListActivity.f;
    Iterator localIterator = this.b.iterator();
    sz localsz;
    if (localIterator.hasNext())
    {
      localsz = (sz)localIterator.next();
      if (!paramString.equals(localsz.c));
    }
    while (true)
    {
      return localsz;
      if (!bool)
        break;
      localsz = null;
    }
  }

  static zq a(GroupChatMap paramGroupChatMap, zq paramzq)
  {
    paramGroupChatMap.h = paramzq;
    return paramzq;
  }

  private void a()
  {
    if ((this.d == -1) && (this.c.getMyLocation() == null))
      this.d = 0;
    if (this.d == -1)
    {
      this.e.getController().animateTo(this.c.getMyLocation());
      this.e.getController().setZoom(17);
      this.g.setText(getString(2131296898));
      if (!DialogToastListActivity.f);
    }
    else if (this.d < this.b.size())
    {
      sz localsz = (sz)this.b.get(this.d);
      GeoPoint localGeoPoint = new GeoPoint((int)(1000000.0D * localsz.q), (int)(1000000.0D * localsz.r));
      this.e.getController().animateTo(localGeoPoint);
      this.e.getController().setZoom(17);
      TextView localTextView = this.g;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(1 + this.d);
      arrayOfObject[1] = Integer.valueOf(this.b.size());
      localTextView.setText(getString(2131296897, arrayOfObject));
    }
  }

  private void a(View paramView, sz paramsz)
  {
    zq localzq = App.w.a(paramsz.c, null);
    ((TextView)paramView.findViewById(2131558524)).setText(localzq.b());
    ((TextView)paramView.findViewById(2131558525)).setText(t4.b(this, paramsz.i));
    ImageView localImageView = (ImageView)paramView.findViewById(2131558523);
    Bitmap localBitmap = localzq.a((int)App.Mb.getResources().getDimension(2131361796), j4.a(App.Mb.getApplicationContext()).L, true);
    if (localBitmap != null)
    {
      localImageView.setImageBitmap(localBitmap);
      if (!DialogToastListActivity.f);
    }
    else
    {
      localImageView.setImageResource(localzq.k());
    }
    paramView.setTag(paramsz.c);
  }

  static GoogleMapView b(GroupChatMap paramGroupChatMap)
  {
    return paramGroupChatMap.e;
  }

  private void b()
  {
    boolean bool = DialogToastListActivity.f;
    g5.d(z[1]);
    Iterator localIterator1 = this.k.iterator();
    do
    {
      if (!localIterator1.hasNext())
        break;
      View localView2 = (View)localIterator1.next();
      this.e.removeView(localView2);
    }
    while (!bool);
    int m = Math.min(this.e.getWidth(), this.e.getHeight()) / 10;
    double d1 = 256.0D * Math.pow(2.0D, this.e.getZoomLevel()) / 2.0D;
    double d2 = m * 360 / d1;
    double d3 = d2 / 2.0D;
    HashMap localHashMap = new HashMap();
    Point localPoint = new Point();
    Iterator localIterator2 = this.b.iterator();
    do
    {
      if (!localIterator2.hasNext())
        break;
      sz localsz2 = (sz)localIterator2.next();
      double d7 = localsz2.r;
      double d8 = localsz2.q;
      GeoPoint localGeoPoint2 = new GeoPoint((int)(1000000.0D * localsz2.q), (int)(1000000.0D * localsz2.r));
      this.e.getProjection().toPixels(localGeoPoint2, localPoint);
      String str = (int)((d7 + 180.0D) / d2) + " " + (int)((90.0D + d8) / d3);
      if (!localHashMap.containsKey(str))
        localHashMap.put(str, new ArrayList());
      ((ArrayList)localHashMap.get(str)).add(localsz2);
    }
    while (!bool);
    ArrayList localArrayList1 = new ArrayList(localHashMap.values());
    Collections.sort(localArrayList1, new tu(this));
    Iterator localIterator3 = localArrayList1.iterator();
    ArrayList localArrayList2;
    LinearLayout localLinearLayout1;
    double d4;
    double d5;
    label490: double d6;
    if (localIterator3.hasNext())
    {
      localArrayList2 = (ArrayList)localIterator3.next();
      localLinearLayout1 = new LinearLayout(this);
      localLinearLayout1.setOrientation(0);
      localLinearLayout1.setPadding(0, 0, 0, (int)(7.0F * j4.a(this).d));
      LinearLayout localLinearLayout2 = new LinearLayout(this);
      localLinearLayout2.setOrientation(1);
      localLinearLayout1.addView(localLinearLayout2);
      LayoutInflater localLayoutInflater = (LayoutInflater)getSystemService(z[2]);
      q localq = new q();
      localq.a((int)(12.0F * j4.a(this).d));
      localLinearLayout2.setBackgroundDrawable(localq);
      Iterator localIterator4 = localArrayList2.iterator();
      d4 = 0.0D;
      d5 = 0.0D;
      if (!localIterator4.hasNext())
        break label668;
      sz localsz1 = (sz)localIterator4.next();
      View localView1 = localLayoutInflater.inflate(2130903054, null);
      localView1.setClickable(true);
      localView1.setBackgroundResource(2130838546);
      a(localView1, localsz1);
      localLinearLayout2.addView(localView1);
      localView1.setOnLongClickListener(this.j);
      d4 += localsz1.q;
      d6 = d5 + localsz1.r;
      if (!bool)
        break label661;
    }
    while (true)
    {
      GeoPoint localGeoPoint1 = new GeoPoint((int)(1000000.0D * (d4 / localArrayList2.size())), (int)(1000000.0D * (d6 / localArrayList2.size())));
      this.e.addView(localLinearLayout1, new MapView.LayoutParams(-2, -2, localGeoPoint1, 81));
      this.k.add(localLinearLayout1);
      if (!bool)
        break;
      return;
      label661: d5 = d6;
      break label490;
      label668: d6 = d5;
    }
  }

  static TextView c(GroupChatMap paramGroupChatMap)
  {
    return paramGroupChatMap.g;
  }

  static int d(GroupChatMap paramGroupChatMap)
  {
    int m = paramGroupChatMap.d;
    paramGroupChatMap.d = (m - 1);
    return m;
  }

  static int e(GroupChatMap paramGroupChatMap)
  {
    return paramGroupChatMap.d;
  }

  static ArrayList f(GroupChatMap paramGroupChatMap)
  {
    return paramGroupChatMap.b;
  }

  static void g(GroupChatMap paramGroupChatMap)
  {
    paramGroupChatMap.a();
  }

  static int h(GroupChatMap paramGroupChatMap)
  {
    int m = paramGroupChatMap.d;
    paramGroupChatMap.d = (m + 1);
    return m;
  }

  static zq i(GroupChatMap paramGroupChatMap)
  {
    return paramGroupChatMap.h;
  }

  static String j(GroupChatMap paramGroupChatMap)
  {
    return paramGroupChatMap.a;
  }

  static void k(GroupChatMap paramGroupChatMap)
  {
    paramGroupChatMap.b();
  }

  static ff l(GroupChatMap paramGroupChatMap)
  {
    return paramGroupChatMap.f;
  }

  public void a(GeoPoint paramGeoPoint, int paramInt1, int paramInt2)
  {
    if (this.i != this.e.getZoomLevel())
    {
      this.i = this.e.getZoomLevel();
      b();
    }
  }

  protected boolean isRouteDisplayed()
  {
    return false;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    boolean bool = DialogToastListActivity.f;
    switch (paramInt1)
    {
    default:
    case 10:
    case 11:
    }
    while (true)
    {
      return;
      if (paramInt2 == -1)
      {
        if ((paramIntent != null) && (paramIntent.getData() != null))
        {
          App.w.a(paramIntent.getData(), this.h);
          if (!bool);
        }
        else
        {
          App.w.b(this.h);
          if (!bool);
        }
      }
      else
        g5.b(z[4]);
      g.a(false);
      if (bool)
      {
        if (paramInt2 == -1)
        {
          App.w.b(this.h);
          if (!bool);
        }
        else
        {
          g5.b(z[3]);
        }
        g.a(false);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool = DialogToastListActivity.f;
    super.onCreate(paramBundle);
    g5.b(z[5]);
    setContentView(2130903099);
    this.a = getIntent().getStringExtra(z[6]);
    zq localzq = gp.a(this.a);
    Object localObject = v4.a(localzq.b(), getBaseContext());
    TextView localTextView = (TextView)findViewById(2131558468);
    if (localObject == null)
      localObject = localzq.b();
    localTextView.setText((CharSequence)localObject);
    this.e = ((GoogleMapView)findViewById(2131558691));
    this.e.a(this);
    this.e.setBuiltInZoomControls(true);
    this.g = ((TextView)findViewById(2131558601));
    this.c = new hf(this, this.e);
    this.e.getOverlays().add(this.c);
    this.b = App.z.p(this.a);
    Collections.sort(this.b, new ku(this));
    this.j = new lu(this);
    Iterator localIterator = this.b.iterator();
    double d1 = -180.0D;
    double d2 = 180.0D;
    double d3 = 90.0D;
    double d4 = -90.0D;
    double d5;
    if (localIterator.hasNext())
    {
      sz localsz = (sz)localIterator.next();
      d3 = Math.min(d3, localsz.q);
      d4 = Math.max(d4, localsz.q);
      d2 = Math.min(d2, localsz.r);
      d5 = Math.max(d1, localsz.r);
      if (!bool);
    }
    while (true)
    {
      GeoPoint localGeoPoint = new GeoPoint((int)(1000000.0D * (d3 + d4) / 2.0D), (int)(1000000.0D * (d2 + d5) / 2.0D));
      this.e.getController().setCenter(localGeoPoint);
      int m = (int)(1000000.0D * (1.3D * (d4 - d3)));
      int n = (int)(1000000.0D * (1.3D * (d5 - d2)));
      if (this.b.size() <= 1)
      {
        this.e.getController().setZoom(17);
        if (!bool);
      }
      else
      {
        this.e.getController().zoomToSpan(m, n);
      }
      b();
      this.d = (-1 + this.b.size());
      this.f = new ff(this);
      this.f.a();
      this.e.getOverlays().add(this.f);
      findViewById(2131558690).setOnClickListener(new mu(this));
      findViewById(2131558693).setOnClickListener(new pu(this));
      findViewById(2131558694).setOnClickListener(new qu(this));
      findViewById(2131558692).setOnClickListener(new ru(this));
      View localView = this.e.getZoomButtonsController().getZoomControls();
      if (localView != null)
        localView.setPadding(0, 0, 0, (int)(48.0F * j4.a(this).d));
      App.z.a(this.l);
      return;
      d1 = d5;
      break;
      d5 = d1;
    }
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    Object localObject;
    switch (paramInt)
    {
    default:
      localObject = null;
    case 0:
    }
    while (true)
    {
      return localObject;
      ArrayList localArrayList = new ArrayList();
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = this.h.b();
      localArrayList.add(getString(2131296924, arrayOfObject1));
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = this.h.b();
      localArrayList.add(getString(2131296926, arrayOfObject2));
      if (this.h.g != null)
      {
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = this.h.b();
        localArrayList.add(getString(2131296495, arrayOfObject3));
        if (!DialogToastListActivity.f);
      }
      else
      {
        localArrayList.add(getString(2131296810));
        localArrayList.add(getString(2131296811));
      }
      String[] arrayOfString = new String[localArrayList.size()];
      localArrayList.toArray(arrayOfString);
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
      localBuilder.setItems(arrayOfString, new su(this));
      localObject = localBuilder.create();
      ((AlertDialog)localObject).requestWindowFeature(1);
    }
  }

  public void onDestroy()
  {
    g5.b(z[0]);
    super.onDestroy();
    App.z.b(this.l);
  }

  protected void onPause()
  {
    super.onPause();
    this.c.disableMyLocation();
  }

  protected void onResume()
  {
    super.onResume();
    this.c.enableMyLocation();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.GroupChatMap
 * JD-Core Version:    0.6.1
 */