package com.whatsapp;

import android.net.SSLCertificateSocketFactory;
import android.os.Build.VERSION;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.StatusLine;
import org.apache.http.impl.DefaultHttpClientConnection;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.protocol.RequestContent;
import org.apache.http.protocol.RequestExpectContinue;
import org.apache.http.protocol.RequestTargetHost;
import org.apache.http.protocol.RequestUserAgent;

public class dq
{
  private static HashMap<String, List<InetAddress>> a;
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[18];
    char[] arrayOfChar1 = "s(".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "z ".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "2|\037c`9g\005}+9|\002| ".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label869;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "9d\004`+".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label961;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\017\\->v".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label1053;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "2|\037c)?|Dv<(g\0313f".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label1145;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "2|\037ca4gFg/(o\016g".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label1237;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "\031g\005}+9|\002| ".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1329;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "2|\037ca8i\017>>(g\037|-5d".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1421;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "2|\037c>5{\037<,;lF`:;|\036`-5l\0163".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1513;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "\035M?".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label1605;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "2|\037c)?|Dz!?z\031|<z ".toCharArray();
        int i40 = arrayOfChar12.length;
        i41 = 0;
        if (i40 > i41)
          break label1697;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "2|\037c)?|D{:.x\016a<5zK;".toCharArray();
        int i44 = arrayOfChar13.length;
        i45 = 0;
        if (i44 > i45)
          break label1789;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "2|\037c=".toCharArray();
        int i48 = arrayOfChar14.length;
        i49 = 0;
        if (i48 > i49)
          break label1881;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "2|\037ca8i\017f<6".toCharArray();
        int i52 = arrayOfChar15.length;
        i53 = 0;
        if (i52 > i53)
          break label1973;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "2|\037c)?|D}!wi\017w<?{\030v=".toCharArray();
        int i56 = arrayOfChar16.length;
        i57 = 0;
        if (i56 > i57)
          break label2065;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "2|\037ca;l\017aa4gF{!)|".toCharArray();
        int i60 = arrayOfChar17.length;
        i61 = 0;
        if (i60 > i61)
          break label2157;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "2|\037ca;l\017aa4g\005v".toCharArray();
        int i64 = arrayOfChar18.length;
        i65 = 0;
        if (i64 > i65)
          break label2249;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        z = arrayOfString;
        a = new HashMap();
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 78;
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
        m = 90;
        continue;
        m = 8;
        continue;
        m = 107;
        continue;
        m = 19;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 78;
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
      i3 = 90;
      continue;
      i3 = 8;
      continue;
      i3 = 107;
      continue;
      i3 = 19;
    }
    label869: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 78;
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
      i7 = 90;
      continue;
      i7 = 8;
      continue;
      i7 = 107;
      continue;
      i7 = 19;
    }
    label961: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 78;
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
      i11 = 90;
      continue;
      i11 = 8;
      continue;
      i11 = 107;
      continue;
      i11 = 19;
    }
    label1053: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 78;
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
      i15 = 90;
      continue;
      i15 = 8;
      continue;
      i15 = 107;
      continue;
      i15 = 19;
    }
    label1145: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 78;
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
      i19 = 90;
      continue;
      i19 = 8;
      continue;
      i19 = 107;
      continue;
      i19 = 19;
    }
    label1237: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 78;
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
      i23 = 90;
      continue;
      i23 = 8;
      continue;
      i23 = 107;
      continue;
      i23 = 19;
    }
    label1329: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 78;
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
      i27 = 90;
      continue;
      i27 = 8;
      continue;
      i27 = 107;
      continue;
      i27 = 19;
    }
    label1421: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 78;
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
      i31 = 90;
      continue;
      i31 = 8;
      continue;
      i31 = 107;
      continue;
      i31 = 19;
    }
    label1513: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 78;
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
      i35 = 90;
      continue;
      i35 = 8;
      continue;
      i35 = 107;
      continue;
      i35 = 19;
    }
    label1605: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 78;
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
      i39 = 90;
      continue;
      i39 = 8;
      continue;
      i39 = 107;
      continue;
      i39 = 19;
    }
    label1697: int i42 = arrayOfChar12[i41];
    int i43;
    switch (i41 % 5)
    {
    default:
      i43 = 78;
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
      i43 = 90;
      continue;
      i43 = 8;
      continue;
      i43 = 107;
      continue;
      i43 = 19;
    }
    label1789: int i46 = arrayOfChar13[i45];
    int i47;
    switch (i45 % 5)
    {
    default:
      i47 = 78;
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
      i47 = 90;
      continue;
      i47 = 8;
      continue;
      i47 = 107;
      continue;
      i47 = 19;
    }
    label1881: int i50 = arrayOfChar14[i49];
    int i51;
    switch (i49 % 5)
    {
    default:
      i51 = 78;
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
      i51 = 90;
      continue;
      i51 = 8;
      continue;
      i51 = 107;
      continue;
      i51 = 19;
    }
    label1973: int i54 = arrayOfChar15[i53];
    int i55;
    switch (i53 % 5)
    {
    default:
      i55 = 78;
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
      i55 = 90;
      continue;
      i55 = 8;
      continue;
      i55 = 107;
      continue;
      i55 = 19;
    }
    label2065: int i58 = arrayOfChar16[i57];
    int i59;
    switch (i57 % 5)
    {
    default:
      i59 = 78;
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
      i59 = 90;
      continue;
      i59 = 8;
      continue;
      i59 = 107;
      continue;
      i59 = 19;
    }
    label2157: int i62 = arrayOfChar17[i61];
    int i63;
    switch (i61 % 5)
    {
    default:
      i63 = 78;
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
      i63 = 90;
      continue;
      i63 = 8;
      continue;
      i63 = 107;
      continue;
      i63 = 19;
    }
    label2249: int i66 = arrayOfChar18[i65];
    int i67;
    switch (i65 % 5)
    {
    default:
      i67 = 78;
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
      i67 = 90;
      continue;
      i67 = 8;
      continue;
      i67 = 107;
      continue;
      i67 = 19;
    }
  }

  private static List<InetAddress> a(String paramString)
    throws UnknownHostException
  {
    Object localObject;
    if (paramString == null)
    {
      g5.d(z[16]);
      localObject = null;
    }
    while (true)
    {
      return localObject;
      localObject = (List)a.get(paramString);
      if (localObject == null)
      {
        localObject = Arrays.asList(InetAddress.getAllByName(paramString));
        if (localObject != null)
        {
          a.put(paramString, localObject);
        }
        else
        {
          g5.c(z[17]);
          localObject = null;
        }
      }
    }
  }

  public static HttpResponse b(String paramString)
    throws IOException, HttpException, Exception
  {
    int i = yq.e;
    HttpResponse localHttpResponse;
    if ((paramString == null) || (paramString.length() == 0))
    {
      g5.d(z[6]);
      localHttpResponse = null;
    }
    URL localURL;
    label83: List localList;
    while (true)
    {
      return localHttpResponse;
      try
      {
        localURL = new URL(paramString);
        if (localURL.getProtocol().equals(z[13]))
          break label83;
        g5.d(z[8]);
        localHttpResponse = null;
      }
      catch (MalformedURLException localMalformedURLException)
      {
        g5.d(z[14]);
        localHttpResponse = null;
      }
      continue;
      localList = a(localURL.getHost());
      if (localList != null)
        break;
      g5.c(z[15]);
      localHttpResponse = null;
    }
    int j = localURL.getPort();
    if (j == -1);
    for (int k = localURL.getDefaultPort(); ; k = j)
    {
      Collections.shuffle(localList);
      int m;
      BasicHttpProcessor localBasicHttpProcessor;
      if (localList.size() > 4)
      {
        m = 4;
        localBasicHttpProcessor = new BasicHttpProcessor();
        localBasicHttpProcessor.addInterceptor(new RequestContent());
        localBasicHttpProcessor.addInterceptor(new RequestTargetHost());
        localBasicHttpProcessor.addInterceptor(new RequestUserAgent());
        localBasicHttpProcessor.removeRequestInterceptorByClass(RequestExpectContinue.class);
      }
      int i1;
      for (int n = 0; ; n = i1)
        while (true)
        {
          BasicHttpParams localBasicHttpParams;
          HttpRequestExecutor localHttpRequestExecutor;
          BasicHttpContext localBasicHttpContext;
          DefaultHttpClientConnection localDefaultHttpClientConnection;
          InetAddress localInetAddress;
          if (n < m)
          {
            localBasicHttpParams = new BasicHttpParams();
            HttpProtocolParams.setVersion(localBasicHttpParams, HttpVersion.HTTP_1_1);
            HttpProtocolParams.setContentCharset(localBasicHttpParams, z[4]);
            HttpProtocolParams.setUserAgent(localBasicHttpParams, App.n);
            localHttpRequestExecutor = new HttpRequestExecutor();
            localBasicHttpContext = new BasicHttpContext(null);
            localDefaultHttpClientConnection = new DefaultHttpClientConnection();
            localInetAddress = (InetAddress)localList.get(n);
          }
          try
          {
            Thread.sleep((int)(Math.random() * (4000.0D * (Math.pow(2.0D, n) - 1.0D))));
            Socket localSocket1 = new Socket();
            InetSocketAddress localInetSocketAddress = new InetSocketAddress(localInetAddress, k);
            localSocket1.connect(localInetSocketAddress, 60000);
            localSocket1.setSoTimeout(60000);
            SSLSocketFactory localSSLSocketFactory;
            if (Build.VERSION.SDK_INT < 8)
            {
              localSSLSocketFactory = (SSLSocketFactory)SSLSocketFactory.getDefault();
              if (i == 0);
            }
            else
            {
              localSSLSocketFactory = SSLCertificateSocketFactory.getDefault(60000, null);
            }
            localSocket1.setSoTimeout(60000);
            Socket localSocket2 = localSSLSocketFactory.createSocket(localSocket1, localURL.getHost(), k, true);
            localBasicHttpContext.setAttribute(z[2], localDefaultHttpClientConnection);
            if (!localDefaultHttpClientConnection.isOpen())
              localDefaultHttpClientConnection.bind(localSocket2, localBasicHttpParams);
            String str = localURL.getPath();
            if (localURL.getQuery() != null)
              str = str + "?" + localURL.getQuery();
            BasicHttpRequest localBasicHttpRequest = new BasicHttpRequest(z[10], str);
            localBasicHttpRequest.addHeader(z[7], z[3]);
            localBasicHttpRequest.setParams(localBasicHttpParams);
            localHttpRequestExecutor.preProcess(localBasicHttpRequest, localBasicHttpProcessor, localBasicHttpContext);
            localHttpResponse = localHttpRequestExecutor.execute(localBasicHttpRequest, localDefaultHttpClientConnection, localBasicHttpContext);
            localHttpResponse.setParams(localBasicHttpParams);
            localHttpRequestExecutor.postProcess(localHttpResponse, localBasicHttpProcessor, localBasicHttpContext);
            int i2 = localHttpResponse.getStatusLine().getStatusCode();
            if ((i2 < 500) || (n == m - 1) || (!App.sb()))
              break;
            g5.c(z[9] + i2 + z[1] + n + "/" + m + ")");
            if (i != 0)
              break;
            i1 = n + 1;
            if (i != 0)
            {
              localHttpResponse = null;
              break;
              m = localList.size();
            }
          }
          catch (IOException localIOException)
          {
            do
              g5.a(z[11] + n + "/" + m + z[0], localIOException);
            while ((n != m - 1) && (App.sb()));
            throw localIOException;
          }
          catch (HttpException localHttpException)
          {
            do
              g5.c(z[12] + n + "/" + m + z[0] + localHttpException.toString());
            while ((n != m - 1) && (App.sb()));
            throw localHttpException;
          }
          catch (Exception localException)
          {
            do
              g5.c(z[5] + n + "/" + m + z[0] + localException.toString());
            while ((n != m - 1) && (App.sb()));
            throw localException;
          }
        }
    }
  }
}