package com.whatsapp;

import android.location.Location;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapController;
import java.util.Iterator;

class jb extends AsyncTask<Void, Void, z9>
{
  private static final String z;
  private Location a;
  private String b;
  private int c;
  private boolean d;
  final LocationPicker e;

  static
  {
    char[] arrayOfChar = "'Df%T9Gf%R7^j:B<".toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    if (i <= j)
    {
      z = new String(arrayOfChar).intern();
      return;
    }
    int k = arrayOfChar[j];
    int m;
    switch (j % 5)
    {
    default:
      m = 11;
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
      m = 104;
      continue;
      m = 18;
      continue;
      m = 35;
      continue;
      m = 119;
    }
  }

  protected jb(LocationPicker paramLocationPicker, Location paramLocation, int paramInt, String paramString, boolean paramBoolean)
  {
    this.a = paramLocation;
    this.b = paramString;
    this.c = paramInt;
    this.d = paramBoolean;
  }

  // ERROR //
  protected z9 a(Void[] paramArrayOfVoid)
  {
    // Byte code:
    //   0: invokestatic 59	com/whatsapp/LocationPicker:c	()J
    //   3: invokestatic 64	java/lang/System:currentTimeMillis	()J
    //   6: lcmp
    //   7: ifge +84 -> 91
    //   10: invokestatic 67	com/whatsapp/LocationPicker:b	()Z
    //   13: ifne +78 -> 91
    //   16: aload_0
    //   17: getfield 43	com/whatsapp/jb:a	Landroid/location/Location;
    //   20: aload_0
    //   21: getfield 47	com/whatsapp/jb:c	I
    //   24: aconst_null
    //   25: aload_0
    //   26: getfield 45	com/whatsapp/jb:b	Ljava/lang/String;
    //   29: invokestatic 72	com/whatsapp/z9:a	(Landroid/location/Location;ILjava/lang/String;Ljava/lang/String;)Lcom/whatsapp/z9;
    //   32: astore 8
    //   34: aload 8
    //   36: astore_3
    //   37: aload_3
    //   38: invokevirtual 75	com/whatsapp/z9:isEmpty	()Z
    //   41: ifeq +48 -> 89
    //   44: getstatic 36	com/whatsapp/jb:z	Ljava/lang/String;
    //   47: aload_3
    //   48: getfield 78	com/whatsapp/z9:f	Ljava/lang/String;
    //   51: invokevirtual 82	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   54: ifeq +35 -> 89
    //   57: ldc2_w 83
    //   60: invokestatic 64	java/lang/System:currentTimeMillis	()J
    //   63: ladd
    //   64: invokestatic 87	com/whatsapp/LocationPicker:a	(J)J
    //   67: pop2
    //   68: aload_0
    //   69: getfield 43	com/whatsapp/jb:a	Landroid/location/Location;
    //   72: aload_0
    //   73: getfield 47	com/whatsapp/jb:c	I
    //   76: aconst_null
    //   77: aload_0
    //   78: getfield 45	com/whatsapp/jb:b	Ljava/lang/String;
    //   81: invokestatic 89	com/whatsapp/z9:b	(Landroid/location/Location;ILjava/lang/String;Ljava/lang/String;)Lcom/whatsapp/z9;
    //   84: astore 11
    //   86: aload 11
    //   88: astore_3
    //   89: aload_3
    //   90: areturn
    //   91: aload_0
    //   92: getfield 43	com/whatsapp/jb:a	Landroid/location/Location;
    //   95: aload_0
    //   96: getfield 47	com/whatsapp/jb:c	I
    //   99: aconst_null
    //   100: aload_0
    //   101: getfield 45	com/whatsapp/jb:b	Ljava/lang/String;
    //   104: invokestatic 89	com/whatsapp/z9:b	(Landroid/location/Location;ILjava/lang/String;Ljava/lang/String;)Lcom/whatsapp/z9;
    //   107: astore 7
    //   109: aload 7
    //   111: astore_3
    //   112: goto -23 -> 89
    //   115: astore 5
    //   117: aconst_null
    //   118: astore_3
    //   119: aload 5
    //   121: astore 6
    //   123: aload 6
    //   125: invokestatic 94	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   128: goto -39 -> 89
    //   131: astore_2
    //   132: aconst_null
    //   133: astore_3
    //   134: aload_2
    //   135: astore 4
    //   137: aload 4
    //   139: invokestatic 94	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   142: goto -53 -> 89
    //   145: astore 4
    //   147: goto -10 -> 137
    //   150: astore 6
    //   152: goto -29 -> 123
    //
    // Exception table:
    //   from	to	target	type
    //   0	34	115	java/io/IOException
    //   91	109	115	java/io/IOException
    //   0	34	131	org/json/JSONException
    //   91	109	131	org/json/JSONException
    //   37	86	145	org/json/JSONException
    //   37	86	150	java/io/IOException
  }

  protected void a(z9 paramz9)
  {
    boolean bool = DialogToastListActivity.f;
    double d1;
    double d2;
    double d3;
    double d4;
    double d5;
    if (!isCancelled())
    {
      if (paramz9 != null)
      {
        LocationPicker.a(this.e, paramz9);
        LocationPicker.a(this.e).a(this.a);
      }
      LocationPicker.i(this.e).setVisibility(8);
      if (LocationPicker.a(this.e).isEmpty())
      {
        Toast.makeText(this.e.getApplicationContext(), this.e.getString(2131296665), 1).show();
        this.e.findViewById(2131558700).setVisibility(0);
        if (!bool);
      }
      else
      {
        this.e.findViewById(2131558700).setVisibility(8);
      }
      LocationPicker.j(this.e);
      LocationPicker.k(this.e).notifyDataSetChanged();
      LocationPicker.l(this.e).a();
      LocationPicker.e(this.e).invalidate();
      if ((LocationPicker.a(this.e).d != null) && (!"".equals(LocationPicker.a(this.e).d)))
      {
        TextView localTextView = LocationPicker.m(this.e);
        LocationPicker localLocationPicker = this.e;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = LocationPicker.a(this.e).d;
        localTextView.setText(localLocationPicker.getString(2131296663, arrayOfObject));
        if (!bool);
      }
      else
      {
        LocationPicker.m(this.e).setText(2131296662);
      }
      if ((this.d) && (!LocationPicker.a(this.e).isEmpty()))
      {
        Iterator localIterator = LocationPicker.a(this.e).iterator();
        d1 = -180.0D;
        d2 = 180.0D;
        d3 = 90.0D;
        d4 = -90.0D;
        if (!localIterator.hasNext())
          break label516;
        fy localfy = (fy)localIterator.next();
        d3 = Math.min(d3, localfy.e);
        d4 = Math.max(d4, localfy.e);
        d2 = Math.min(d2, localfy.f);
        d5 = Math.max(d1, localfy.f);
        if (!bool)
          break label509;
      }
    }
    while (true)
    {
      GeoPoint localGeoPoint = new GeoPoint((int)(1000000.0D * (d3 + d4) / 2.0D), (int)(1000000.0D * (d2 + d5) / 2.0D));
      LocationPicker.e(this.e).getController().setCenter(localGeoPoint);
      int i = (int)(1000000.0D * (1.2D * (d4 - d3)));
      int j = (int)(1000000.0D * (1.2D * (d5 - d2)));
      if (LocationPicker.a(this.e).size() <= 1)
      {
        LocationPicker.e(this.e).getController().setZoom(18);
        if (!bool);
      }
      else
      {
        LocationPicker.e(this.e).getController().zoomToSpan(i, j);
      }
      return;
      label509: d1 = d5;
      break;
      label516: d5 = d1;
    }
  }
}