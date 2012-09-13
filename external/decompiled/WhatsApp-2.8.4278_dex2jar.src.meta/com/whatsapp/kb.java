package com.whatsapp;

import android.app.AlertDialog;
import android.graphics.Bitmap;
import android.location.Location;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ListView;
import android.widget.TextView;

class kb extends AsyncTask<Void, Void, z9>
{
  private static final String z;
  private Location a;
  private Bitmap b = null;
  final LocationPickerPopup c;

  static
  {
    char[] arrayOfChar = "s\013^\024\nm\b^\024\fc\021R\013\034h".toCharArray();
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
      m = 85;
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
      m = 60;
      continue;
      m = 93;
      continue;
      m = 27;
      continue;
      m = 70;
    }
  }

  protected kb(LocationPickerPopup paramLocationPickerPopup, Location paramLocation)
  {
    this.a = paramLocation;
  }

  // ERROR //
  protected z9 a(Void[] paramArrayOfVoid)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield 42	com/whatsapp/kb:a	Landroid/location/Location;
    //   5: invokevirtual 53	android/location/Location:getLatitude	()D
    //   8: aload_0
    //   9: getfield 42	com/whatsapp/kb:a	Landroid/location/Location;
    //   12: invokevirtual 56	android/location/Location:getLongitude	()D
    //   15: invokestatic 61	com/whatsapp/mb:b	(DD)Landroid/graphics/Bitmap;
    //   18: putfield 40	com/whatsapp/kb:b	Landroid/graphics/Bitmap;
    //   21: aload_0
    //   22: getfield 42	com/whatsapp/kb:a	Landroid/location/Location;
    //   25: invokevirtual 65	android/location/Location:getAccuracy	()F
    //   28: f2i
    //   29: bipush 100
    //   31: invokestatic 71	java/lang/Math:max	(II)I
    //   34: istore 7
    //   36: invokestatic 76	com/whatsapp/LocationPickerPopup:a	()J
    //   39: invokestatic 81	java/lang/System:currentTimeMillis	()J
    //   42: lcmp
    //   43: ifge +68 -> 111
    //   46: aload_0
    //   47: getfield 42	com/whatsapp/kb:a	Landroid/location/Location;
    //   50: iload 7
    //   52: aconst_null
    //   53: aconst_null
    //   54: invokestatic 86	com/whatsapp/z9:a	(Landroid/location/Location;ILjava/lang/String;Ljava/lang/String;)Lcom/whatsapp/z9;
    //   57: astore 9
    //   59: aload 9
    //   61: astore_3
    //   62: aload_3
    //   63: invokevirtual 90	com/whatsapp/z9:isEmpty	()Z
    //   66: ifeq +43 -> 109
    //   69: getstatic 33	com/whatsapp/kb:z	Ljava/lang/String;
    //   72: aload_3
    //   73: getfield 93	com/whatsapp/z9:f	Ljava/lang/String;
    //   76: invokevirtual 97	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   79: ifeq +30 -> 109
    //   82: ldc2_w 98
    //   85: invokestatic 81	java/lang/System:currentTimeMillis	()J
    //   88: ladd
    //   89: invokestatic 102	com/whatsapp/LocationPickerPopup:a	(J)J
    //   92: pop2
    //   93: aload_0
    //   94: getfield 42	com/whatsapp/kb:a	Landroid/location/Location;
    //   97: iload 7
    //   99: aconst_null
    //   100: aconst_null
    //   101: invokestatic 104	com/whatsapp/z9:b	(Landroid/location/Location;ILjava/lang/String;Ljava/lang/String;)Lcom/whatsapp/z9;
    //   104: astore 12
    //   106: aload 12
    //   108: astore_3
    //   109: aload_3
    //   110: areturn
    //   111: aload_0
    //   112: getfield 42	com/whatsapp/kb:a	Landroid/location/Location;
    //   115: iload 7
    //   117: aconst_null
    //   118: aconst_null
    //   119: invokestatic 104	com/whatsapp/z9:b	(Landroid/location/Location;ILjava/lang/String;Ljava/lang/String;)Lcom/whatsapp/z9;
    //   122: astore 8
    //   124: aload 8
    //   126: astore_3
    //   127: goto -18 -> 109
    //   130: astore 5
    //   132: aconst_null
    //   133: astore_3
    //   134: aload 5
    //   136: astore 6
    //   138: aload 6
    //   140: invokestatic 110	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   143: goto -34 -> 109
    //   146: astore_2
    //   147: aconst_null
    //   148: astore_3
    //   149: aload_2
    //   150: astore 4
    //   152: aload 4
    //   154: invokestatic 110	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   157: goto -48 -> 109
    //   160: astore 4
    //   162: goto -10 -> 152
    //   165: astore 6
    //   167: goto -29 -> 138
    //
    // Exception table:
    //   from	to	target	type
    //   21	59	130	java/io/IOException
    //   111	124	130	java/io/IOException
    //   21	59	146	org/json/JSONException
    //   111	124	146	org/json/JSONException
    //   62	106	160	org/json/JSONException
    //   62	106	165	java/io/IOException
  }

  protected void a(z9 paramz9)
  {
    boolean bool = DialogToastListActivity.f;
    if (!isCancelled())
    {
      if (paramz9 != null)
      {
        LocationPickerPopup.a(this.c, paramz9);
        LocationPickerPopup.b(this.c).a(this.a);
      }
      if (this.a != null)
      {
        if (this.a.hasAccuracy())
        {
          TextView localTextView = LocationPickerPopup.g(this.c);
          LocationPickerPopup localLocationPickerPopup = this.c;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Integer.valueOf(Math.max(2, (int)this.a.getAccuracy()));
          localTextView.setText(localLocationPickerPopup.getString(2131296658, arrayOfObject));
          LocationPickerPopup.g(this.c).setVisibility(0);
          if (!bool);
        }
        else
        {
          LocationPickerPopup.g(this.c).setVisibility(8);
          if (!bool);
        }
      }
      else
        LocationPickerPopup.g(this.c).setVisibility(8);
      if (this.b != null)
      {
        LocationPickerPopup.h(this.c).setBackgroundDrawable(null);
        int i = (int)j4.a(App.Mb).K;
        LocationPickerPopup.h(this.c).setPadding(i, i, i, i);
        LocationPickerPopup.h(this.c).setScaleType(ImageView.ScaleType.FIT_CENTER);
        LocationPickerPopup.h(this.c).setImageDrawable(new o(this.c, this.b));
        LocationPickerPopup.h(this.c).setVisibility(0);
      }
      if ((LocationPickerPopup.b(this.c) != null) && (!LocationPickerPopup.b(this.c).isEmpty()))
      {
        ((TextView)LocationPickerPopup.i(this.c).findViewById(2131558704)).setText(2131296660);
        LocationPickerPopup.i(this.c).findViewById(2131558624).setVisibility(8);
        ImageView localImageView = (ImageView)LocationPickerPopup.i(this.c).findViewById(2131558705);
        localImageView.setVisibility(0);
        if (LocationPickerPopup.b(this.c).h == 2)
        {
          localImageView.setImageResource(2130838526);
          if (!bool);
        }
        else if (LocationPickerPopup.b(this.c).h == 1)
        {
          localImageView.setImageResource(2130838527);
          if (!bool);
        }
        else
        {
          localImageView.setVisibility(8);
        }
        if (!bool);
      }
      else
      {
        LocationPickerPopup.j(this.c).getListView().removeHeaderView(LocationPickerPopup.i(this.c));
      }
      LocationPickerPopup.k(this.c).notifyDataSetChanged();
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.kb
 * JD-Core Version:    0.6.1
 */