package com.whatsapp;

import android.location.Location;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class z9 extends ArrayList<fy>
{
  private static ArrayList<z9> g;
  private static final String[] z;
  protected Location a;
  protected int b;
  protected String c = "";
  protected String d = "";
  protected String e;
  protected String f;
  public int h;

  static
  {
    String[] arrayOfString = new String[20];
    char[] arrayOfChar1 = "[4\034,^".toCharArray();
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
    char[] arrayOfChar6;
    int i17;
    char[] arrayOfChar7;
    int i21;
    char[] arrayOfChar8;
    int i25;
    char[] arrayOfChar9;
    int i29;
    char[] arrayOfChar10;
    int i33;
    char[] arrayOfChar11;
    int i37;
    char[] arrayOfChar12;
    int i41;
    char[] arrayOfChar13;
    int i45;
    char[] arrayOfChar14;
    int i49;
    char[] arrayOfChar15;
    int i53;
    char[] arrayOfChar16;
    int i57;
    char[] arrayOfChar17;
    int i61;
    char[] arrayOfChar18;
    int i65;
    char[] arrayOfChar19;
    int i69;
    char[] arrayOfChar20;
    int i73;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "_4b\031&C\"t".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "^%p\035<^".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label945;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "b\032".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label1037;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "C>1\033,^!~\007:H".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label1129;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "x\005WDq".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label1221;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "_0u��<^".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label1313;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "A>r\b=D>".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1405;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "Y(a\f:".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1497;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "F4h\036&_5".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1589;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "\\$t\0330".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label1681;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "u|C\b=H\035x\004 Y|]��$D%+I".toCharArray();
        int i40 = arrayOfChar12.length;
        i41 = 0;
        if (i40 > i41)
          break label1773;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "u|C\b=H\035x\004 Y|C\f$L8��'Jk1".toCharArray();
        int i44 = arrayOfChar13.length;
        i45 = 0;
        if (i44 > i45)
          break label1865;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "u|C\b=H\035x\004 Y|C\f$L8��'J".toCharArray();
        int i48 = arrayOfChar14.length;
        i49 = 0;
        if (i48 > i49)
          break label1957;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "u|C\b=H\035x\004 Y|]��$D%".toCharArray();
        int i52 = arrayOfChar15.length;
        i53 = 0;
        if (i52 > i53)
          break label2049;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "A=".toCharArray();
        int i56 = arrayOfChar16.length;
        i57 = 0;
        if (i56 > i57)
          break label2141;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "J4~\n&I4<^x\003!\016".toCharArray();
        int i60 = arrayOfChar17.length;
        i61 = 0;
        if (i60 > i61)
          break label2233;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "\0213cIf\023".toCharArray();
        int i64 = arrayOfChar18.length;
        i65 = 0;
        if (i64 > i65)
          break label2325;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "E%|\005\026L%e\033 O$e��&C\"".toCharArray();
        int i68 = arrayOfChar19.length;
        i69 = 0;
        if (i68 > i69)
          break label2417;
        arrayOfString[18] = new String(arrayOfChar19).intern();
        arrayOfChar20 = "_4b\034%Y\"".toCharArray();
        int i72 = arrayOfChar20.length;
        i73 = 0;
        if (i72 > i73)
          break label2509;
        arrayOfString[19] = new String(arrayOfChar20).intern();
        z = arrayOfString;
        g = new ArrayList();
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 73;
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
        m = 45;
        continue;
        m = 81;
        continue;
        m = 17;
        continue;
        m = 105;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 73;
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
      i3 = 45;
      continue;
      i3 = 81;
      continue;
      i3 = 17;
      continue;
      i3 = 105;
    }
    label945: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 73;
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
      i7 = 45;
      continue;
      i7 = 81;
      continue;
      i7 = 17;
      continue;
      i7 = 105;
    }
    label1037: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 73;
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
      i11 = 45;
      continue;
      i11 = 81;
      continue;
      i11 = 17;
      continue;
      i11 = 105;
    }
    label1129: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 73;
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
      i15 = 45;
      continue;
      i15 = 81;
      continue;
      i15 = 17;
      continue;
      i15 = 105;
    }
    label1221: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 73;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i17] = (char)(i19 ^ i18);
      i17++;
      break;
      i19 = 45;
      continue;
      i19 = 81;
      continue;
      i19 = 17;
      continue;
      i19 = 105;
    }
    label1313: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 73;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i21] = (char)(i23 ^ i22);
      i21++;
      break;
      i23 = 45;
      continue;
      i23 = 81;
      continue;
      i23 = 17;
      continue;
      i23 = 105;
    }
    label1405: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 73;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar8[i25] = (char)(i27 ^ i26);
      i25++;
      break;
      i27 = 45;
      continue;
      i27 = 81;
      continue;
      i27 = 17;
      continue;
      i27 = 105;
    }
    label1497: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 73;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar9[i29] = (char)(i31 ^ i30);
      i29++;
      break;
      i31 = 45;
      continue;
      i31 = 81;
      continue;
      i31 = 17;
      continue;
      i31 = 105;
    }
    label1589: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 73;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar10[i33] = (char)(i35 ^ i34);
      i33++;
      break;
      i35 = 45;
      continue;
      i35 = 81;
      continue;
      i35 = 17;
      continue;
      i35 = 105;
    }
    label1681: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 73;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar11[i37] = (char)(i39 ^ i38);
      i37++;
      break;
      i39 = 45;
      continue;
      i39 = 81;
      continue;
      i39 = 17;
      continue;
      i39 = 105;
    }
    label1773: int i42 = arrayOfChar12[i41];
    int i43;
    switch (i41 % 5)
    {
    default:
      i43 = 73;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar12[i41] = (char)(i43 ^ i42);
      i41++;
      break;
      i43 = 45;
      continue;
      i43 = 81;
      continue;
      i43 = 17;
      continue;
      i43 = 105;
    }
    label1865: int i46 = arrayOfChar13[i45];
    int i47;
    switch (i45 % 5)
    {
    default:
      i47 = 73;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar13[i45] = (char)(i47 ^ i46);
      i45++;
      break;
      i47 = 45;
      continue;
      i47 = 81;
      continue;
      i47 = 17;
      continue;
      i47 = 105;
    }
    label1957: int i50 = arrayOfChar14[i49];
    int i51;
    switch (i49 % 5)
    {
    default:
      i51 = 73;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar14[i49] = (char)(i51 ^ i50);
      i49++;
      break;
      i51 = 45;
      continue;
      i51 = 81;
      continue;
      i51 = 17;
      continue;
      i51 = 105;
    }
    label2049: int i54 = arrayOfChar15[i53];
    int i55;
    switch (i53 % 5)
    {
    default:
      i55 = 73;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar15[i53] = (char)(i55 ^ i54);
      i53++;
      break;
      i55 = 45;
      continue;
      i55 = 81;
      continue;
      i55 = 17;
      continue;
      i55 = 105;
    }
    label2141: int i58 = arrayOfChar16[i57];
    int i59;
    switch (i57 % 5)
    {
    default:
      i59 = 73;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar16[i57] = (char)(i59 ^ i58);
      i57++;
      break;
      i59 = 45;
      continue;
      i59 = 81;
      continue;
      i59 = 17;
      continue;
      i59 = 105;
    }
    label2233: int i62 = arrayOfChar17[i61];
    int i63;
    switch (i61 % 5)
    {
    default:
      i63 = 73;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar17[i61] = (char)(i63 ^ i62);
      i61++;
      break;
      i63 = 45;
      continue;
      i63 = 81;
      continue;
      i63 = 17;
      continue;
      i63 = 105;
    }
    label2325: int i66 = arrayOfChar18[i65];
    int i67;
    switch (i65 % 5)
    {
    default:
      i67 = 73;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar18[i65] = (char)(i67 ^ i66);
      i65++;
      break;
      i67 = 45;
      continue;
      i67 = 81;
      continue;
      i67 = 17;
      continue;
      i67 = 105;
    }
    label2417: int i70 = arrayOfChar19[i69];
    int i71;
    switch (i69 % 5)
    {
    default:
      i71 = 73;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar19[i69] = (char)(i71 ^ i70);
      i69++;
      break;
      i71 = 45;
      continue;
      i71 = 81;
      continue;
      i71 = 17;
      continue;
      i71 = 105;
    }
    label2509: int i74 = arrayOfChar20[i73];
    int i75;
    switch (i73 % 5)
    {
    default:
      i75 = 73;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar20[i73] = (char)(i75 ^ i74);
      i73++;
      break;
      i75 = 45;
      continue;
      i75 = 81;
      continue;
      i75 = 17;
      continue;
      i75 = 105;
    }
  }

  public z9()
  {
  }

  public z9(int paramInt1, Location paramLocation, int paramInt2, String paramString1, String paramString2)
  {
    this.h = paramInt1;
    this.a = paramLocation;
    this.b = paramInt2;
    if (paramString1 != null)
      this.c = paramString1;
    if (paramString2 != null)
      this.d = paramString2;
  }

  private static z9 a(int paramInt1, Location paramLocation, int paramInt2, String paramString1, String paramString2)
  {
    boolean bool = DialogToastListActivity.f;
    Iterator localIterator = g.iterator();
    z9 localz9;
    if (localIterator.hasNext())
    {
      localz9 = (z9)localIterator.next();
      if ((localz9.c.equalsIgnoreCase(paramString1)) && (localz9.d.equalsIgnoreCase(paramString2)))
      {
        double d1 = localz9.a.distanceTo(paramLocation);
        double d2 = 0.2D * (paramInt2 + localz9.b) / 2;
        if ((d1 >= d2) || (Math.abs(localz9.b - paramInt2) >= d2));
      }
    }
    while (true)
    {
      return localz9;
      if (!bool)
        break;
      localz9 = null;
    }
  }

  public static z9 a(Location paramLocation, int paramInt, String paramString1, String paramString2)
    throws IOException, JSONException
  {
    if (paramString1 == null);
    for (String str1 = ""; ; str1 = paramString1)
    {
      if (paramString2 == null);
      for (String str2 = ""; ; str2 = paramString2)
      {
        (int)(Math.log(paramInt) / Math.log(2.0D));
        z9 localz9 = a(1, paramLocation, paramInt, str1, str2);
        if (localz9 == null)
        {
          localz9 = new z9(1, paramLocation, paramInt, str1, str2);
          ArrayList localArrayList = new ArrayList();
          localArrayList.add(new BasicNameValuePair(z[7], paramLocation.getLatitude() + "," + paramLocation.getLongitude()));
          localArrayList.add(new BasicNameValuePair(z[6], Integer.toString(paramInt)));
          if ((str2 != null) && (!"".equals(str2)))
            localArrayList.add(new BasicNameValuePair(z[9], str2));
          if ((str1 != null) && (!"".equals(str1)))
            localArrayList.add(new BasicNameValuePair(z[8], str1));
          BasicHttpParams localBasicHttpParams = new BasicHttpParams();
          HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, 15000);
          HttpConnectionParams.setSoTimeout(localBasicHttpParams, 30000);
          HttpProtocolParams.setUserAgent(localBasicHttpParams, App.n);
          HttpResponse localHttpResponse = new DefaultHttpClient(localBasicHttpParams).execute(new HttpGet(f8.o + URLEncodedUtils.format(localArrayList, z[5])));
          if (localHttpResponse == null)
            throw new IOException(z[4]);
          if (localHttpResponse.getStatusLine().getStatusCode() == 200)
          {
            JSONObject localJSONObject = new JSONObject(EntityUtils.toString(localHttpResponse.getEntity()));
            localz9.f = localJSONObject.getString(z[2]);
            if (z[3].equals(localz9.f))
            {
              localz9.b(localJSONObject);
              g.add(localz9);
              if (g.size() > 12)
                g.remove(0);
            }
          }
        }
        return localz9;
      }
    }
  }

  public static void a(int paramInt)
  {
    boolean bool = DialogToastListActivity.f;
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = g.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      z9 localz9 = (z9)localIterator.next();
      if (localz9.h == paramInt)
        localArrayList.add(localz9);
    }
    while (!bool);
    g.removeAll(localArrayList);
  }

  public static z9 b(Location paramLocation, int paramInt, String paramString1, String paramString2)
    throws IOException, JSONException
  {
    if (paramString1 == null);
    for (String str1 = ""; ; str1 = paramString1)
    {
      if (paramString2 == null);
      for (String str2 = ""; ; str2 = paramString2)
      {
        z9 localz9 = a(2, paramLocation, paramInt, str1, str2);
        if (localz9 == null)
        {
          localz9 = new z9(2, paramLocation, paramInt, str1, str2);
          ArrayList localArrayList = new ArrayList();
          localArrayList.add(new BasicNameValuePair(z[15], paramLocation.getLatitude() + "," + paramLocation.getLongitude()));
          localArrayList.add(new BasicNameValuePair(z[6], Integer.toString(Math.min(paramInt, 99999))));
          if ((str2 != null) && (!"".equals(str2)))
            localArrayList.add(new BasicNameValuePair(z[10], str2));
          BasicHttpParams localBasicHttpParams = new BasicHttpParams();
          HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, 15000);
          HttpConnectionParams.setSoTimeout(localBasicHttpParams, 30000);
          HttpProtocolParams.setUserAgent(localBasicHttpParams, App.n);
          HttpResponse localHttpResponse = new DefaultHttpClient(localBasicHttpParams).execute(new HttpGet(f8.n + URLEncodedUtils.format(localArrayList, z[5])));
          if (localHttpResponse == null)
            throw new IOException(z[4]);
          Header localHeader1 = localHttpResponse.getFirstHeader(z[14]);
          if (localHeader1 != null)
            g5.b(z[11] + localHeader1.getValue());
          Header localHeader2 = localHttpResponse.getFirstHeader(z[13]);
          if (localHeader2 != null)
            g5.b(z[12] + localHeader2.getValue());
          if (localHttpResponse.getStatusLine().getStatusCode() == 200)
          {
            localz9.a(new JSONObject(EntityUtils.toString(localHttpResponse.getEntity())));
            g.add(localz9);
            if (g.size() > 12)
              g.remove(0);
          }
        }
        return localz9;
      }
    }
  }

  public void a(Location paramLocation)
  {
    boolean bool = DialogToastListActivity.f;
    Iterator localIterator = iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      fy localfy = (fy)localIterator.next();
      localfy.n = localfy.b().distanceTo(paramLocation);
    }
    while (!bool);
    Collections.sort(this, new gy(this));
  }

  public void a(JSONObject paramJSONObject)
    throws JSONException
  {
    int i = 0;
    boolean bool = DialogToastListActivity.f;
    JSONArray localJSONArray = paramJSONObject.getJSONObject(z[1]).getJSONArray(z[0]);
    while (true)
    {
      if (i < localJSONArray.length());
      try
      {
        JSONObject localJSONObject = localJSONArray.getJSONObject(i);
        fy localfy = new fy();
        localfy.b(localJSONObject, false);
        add(localfy);
        i++;
        if (!bool)
          continue;
        return;
      }
      catch (JSONException localJSONException)
      {
        while (true)
          g5.d(localJSONException);
      }
    }
  }

  public void b(JSONObject paramJSONObject)
    throws JSONException
  {
    int i = 0;
    boolean bool = DialogToastListActivity.f;
    JSONArray localJSONArray1 = paramJSONObject.getJSONArray(z[19]);
    int j = 0;
    while (true)
    {
      if (j < localJSONArray1.length());
      try
      {
        JSONObject localJSONObject = localJSONArray1.getJSONObject(j);
        fy localfy = new fy();
        localfy.a(localJSONObject, false);
        if ((localfy.k == null) || (!localfy.k.endsWith(z[16])))
          add(localfy);
        j++;
        if (!bool)
          continue;
      }
      catch (JSONException localJSONException2)
      {
        try
        {
          JSONArray localJSONArray2 = paramJSONObject.getJSONArray(z[18]);
          if (localJSONArray2.length() > 0)
          {
            this.e = "";
            do
            {
              if (i >= localJSONArray2.length())
                break;
              if (i > 0)
                this.e += z[17];
              this.e += localJSONArray2.getString(i);
              i++;
            }
            while (!bool);
          }
          return;
          localJSONException2 = localJSONException2;
          g5.d(localJSONException2);
        }
        catch (JSONException localJSONException1)
        {
          while (true)
            g5.d(localJSONException1);
        }
      }
    }
  }
}