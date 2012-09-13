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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.impl.DefaultHttpClientConnection;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;
import org.apache.http.message.BasicNameValuePair;
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

public class eq
{
  private static HashMap<String, List<InetAddress>> a;
  private static final String[] z;
  private URL b;
  private HttpEntity c;
  private List<NameValuePair> d;
  private BasicHttpProcessor e;
  private Integer f;

  static
  {
    String[] arrayOfString = new String[18];
    char[] arrayOfChar1 = "SED\027sYPT\022.W".toCharArray();
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
      arrayOfChar2 = "SED\027sU^\035\023=IVU\023".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "SED\027/".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label869;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "SED\027sYPTJ,I^D\b?T]".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label961;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "SED\027sZUT\025sU^\035\0173HE".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label1053;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "SED\027sZUT\025sU^^\002".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label1145;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "k~c3".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label1237;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "SED\027,TBDH>ZU\035\024(ZEE\024?TUUG".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1329;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "SED\027,TBDH5TTB\0253I\021\030".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1421;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "SED\027rX^^\t9XEY\b2".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1513;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "SED\027,TBDH2T\034Q\0038ITC\0249H".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label1605;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "x^^\t9XEY\b2".toCharArray();
        int i40 = arrayOfChar12.length;
        i41 = 0;
        if (i40 > i41)
          break label1697;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "\033\031".toCharArray();
        int i44 = arrayOfChar13.length;
        i45 = 0;
        if (i44 > i45)
          break label1789;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "SED\027,TBDH9IC_\025|\023".toCharArray();
        int i48 = arrayOfChar14.length;
        i49 = 0;
        if (i48 > i49)
          break label1881;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "\022\021".toCharArray();
        int i52 = arrayOfChar15.length;
        i53 = 0;
        if (i52 > i53)
          break label1973;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "nevJd".toCharArray();
        int i56 = arrayOfChar16.length;
        i57 = 0;
        if (i56 > i57)
          break label2065;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "SED\027,TBDH4OE@\002.I^BGt".toCharArray();
        int i60 = arrayOfChar17.length;
        i61 = 0;
        if (i60 > i61)
          break label2157;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "X]_\0249".toCharArray();
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
        m = 92;
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
        m = 59;
        continue;
        m = 49;
        continue;
        m = 48;
        continue;
        m = 103;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 92;
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
      i3 = 59;
      continue;
      i3 = 49;
      continue;
      i3 = 48;
      continue;
      i3 = 103;
    }
    label869: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 92;
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
      i7 = 59;
      continue;
      i7 = 49;
      continue;
      i7 = 48;
      continue;
      i7 = 103;
    }
    label961: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 92;
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
      i11 = 59;
      continue;
      i11 = 49;
      continue;
      i11 = 48;
      continue;
      i11 = 103;
    }
    label1053: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 92;
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
      i15 = 59;
      continue;
      i15 = 49;
      continue;
      i15 = 48;
      continue;
      i15 = 103;
    }
    label1145: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 92;
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
      i19 = 59;
      continue;
      i19 = 49;
      continue;
      i19 = 48;
      continue;
      i19 = 103;
    }
    label1237: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 92;
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
      i23 = 59;
      continue;
      i23 = 49;
      continue;
      i23 = 48;
      continue;
      i23 = 103;
    }
    label1329: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 92;
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
      i27 = 59;
      continue;
      i27 = 49;
      continue;
      i27 = 48;
      continue;
      i27 = 103;
    }
    label1421: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 92;
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
      i31 = 59;
      continue;
      i31 = 49;
      continue;
      i31 = 48;
      continue;
      i31 = 103;
    }
    label1513: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 92;
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
      i35 = 59;
      continue;
      i35 = 49;
      continue;
      i35 = 48;
      continue;
      i35 = 103;
    }
    label1605: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 92;
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
      i39 = 59;
      continue;
      i39 = 49;
      continue;
      i39 = 48;
      continue;
      i39 = 103;
    }
    label1697: int i42 = arrayOfChar12[i41];
    int i43;
    switch (i41 % 5)
    {
    default:
      i43 = 92;
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
      i43 = 59;
      continue;
      i43 = 49;
      continue;
      i43 = 48;
      continue;
      i43 = 103;
    }
    label1789: int i46 = arrayOfChar13[i45];
    int i47;
    switch (i45 % 5)
    {
    default:
      i47 = 92;
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
      i47 = 59;
      continue;
      i47 = 49;
      continue;
      i47 = 48;
      continue;
      i47 = 103;
    }
    label1881: int i50 = arrayOfChar14[i49];
    int i51;
    switch (i49 % 5)
    {
    default:
      i51 = 92;
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
      i51 = 59;
      continue;
      i51 = 49;
      continue;
      i51 = 48;
      continue;
      i51 = 103;
    }
    label1973: int i54 = arrayOfChar15[i53];
    int i55;
    switch (i53 % 5)
    {
    default:
      i55 = 92;
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
      i55 = 59;
      continue;
      i55 = 49;
      continue;
      i55 = 48;
      continue;
      i55 = 103;
    }
    label2065: int i58 = arrayOfChar16[i57];
    int i59;
    switch (i57 % 5)
    {
    default:
      i59 = 92;
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
      i59 = 59;
      continue;
      i59 = 49;
      continue;
      i59 = 48;
      continue;
      i59 = 103;
    }
    label2157: int i62 = arrayOfChar17[i61];
    int i63;
    switch (i61 % 5)
    {
    default:
      i63 = 92;
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
      i63 = 59;
      continue;
      i63 = 49;
      continue;
      i63 = 48;
      continue;
      i63 = 103;
    }
    label2249: int i66 = arrayOfChar18[i65];
    int i67;
    switch (i65 % 5)
    {
    default:
      i67 = 92;
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
      i67 = 59;
      continue;
      i67 = 49;
      continue;
      i67 = 48;
      continue;
      i67 = 103;
    }
  }

  private eq(URL paramURL, String paramString)
  {
    this.b = paramURL;
    this.d = new ArrayList();
    this.e = new BasicHttpProcessor();
    this.e.addInterceptor(new RequestContent());
    this.e.addInterceptor(new RequestTargetHost());
    this.e.addInterceptor(new RequestUserAgent());
    this.e.removeRequestInterceptorByClass(RequestExpectContinue.class);
  }

  private static List<InetAddress> a(String paramString)
    throws UnknownHostException
  {
    Object localObject;
    if (paramString == null)
    {
      g5.d(z[4]);
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
          g5.c(z[5]);
          localObject = null;
        }
      }
    }
  }

  public static eq b(String paramString)
  {
    Object localObject = null;
    if ((paramString == null) || (paramString.length() == 0))
      g5.d(z[1]);
    while (true)
    {
      return localObject;
      URL localURL;
      try
      {
        localURL = new URL(paramString);
        if (localURL.getProtocol().equals(z[2]))
          break label70;
        g5.d(z[3]);
      }
      catch (MalformedURLException localMalformedURLException)
      {
        g5.d(z[0]);
      }
      continue;
      label70: eq localeq = new eq(localURL, paramString);
      localObject = localeq;
    }
  }

  public HttpResponse a()
    throws IOException, HttpException, Exception
  {
    int i = yq.e;
    List localList = a(this.b.getHost());
    Object localObject;
    if (localList == null)
    {
      g5.c(z[10]);
      localObject = null;
      return localObject;
    }
    int j = this.b.getPort();
    int k;
    label57: int m;
    label74: int n;
    if (j == -1)
    {
      k = this.b.getDefaultPort();
      Collections.shuffle(localList);
      if (localList.size() > 4)
      {
        m = 4;
        n = 0;
        label77: if (n >= m)
          break label961;
      }
    }
    while (true)
    {
      long l2;
      int i3;
      int i1;
      try
      {
        Thread.sleep((int)(Math.random() * (4000.0D * (Math.pow(2.0D, n) - 1.0D))));
        BasicHttpParams localBasicHttpParams = new BasicHttpParams();
        HttpProtocolParams.setVersion(localBasicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(localBasicHttpParams, z[15]);
        HttpProtocolParams.setUserAgent(localBasicHttpParams, App.n);
        BasicHttpContext localBasicHttpContext = new BasicHttpContext(null);
        DefaultHttpClientConnection localDefaultHttpClientConnection = new DefaultHttpClientConnection();
        HttpRequestExecutor localHttpRequestExecutor = new HttpRequestExecutor();
        InetAddress localInetAddress = (InetAddress)localList.get(n);
        Socket localSocket1 = new Socket();
        localSocket1.connect(new InetSocketAddress(localInetAddress, k), 60000);
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
        Socket localSocket2 = localSSLSocketFactory.createSocket(localSocket1, this.b.getHost(), k, true);
        localBasicHttpContext.setAttribute(z[9], localDefaultHttpClientConnection);
        if (!localDefaultHttpClientConnection.isOpen())
          localDefaultHttpClientConnection.bind(localSocket2, localBasicHttpParams);
        BasicHttpEntityEnclosingRequest localBasicHttpEntityEnclosingRequest = new BasicHttpEntityEnclosingRequest(z[6], this.b.getPath());
        if (this.c != null)
          localBasicHttpEntityEnclosingRequest.setEntity(this.c);
        localBasicHttpEntityEnclosingRequest.addHeader(z[11], z[17]);
        Iterator localIterator = this.d.iterator();
        if (localIterator.hasNext())
        {
          NameValuePair localNameValuePair = (NameValuePair)localIterator.next();
          localBasicHttpEntityEnclosingRequest.addHeader(localNameValuePair.getName(), localNameValuePair.getValue());
          if (i == 0)
            continue;
        }
        localBasicHttpEntityEnclosingRequest.setParams(localBasicHttpParams);
        localHttpRequestExecutor.preProcess(localBasicHttpEntityEnclosingRequest, this.e, localBasicHttpContext);
        HttpResponse localHttpResponse = localHttpRequestExecutor.execute(localBasicHttpEntityEnclosingRequest, localDefaultHttpClientConnection, localBasicHttpContext);
        if (this.f != null)
        {
          if (this.c == null)
          {
            l2 = 0L;
            break label980;
            HeaderIterator localHeaderIterator = localBasicHttpEntityEnclosingRequest.headerIterator();
            if (localHeaderIterator != null)
            {
              i3 = 0;
              if (!localHeaderIterator.hasNext())
                break label993;
              Header localHeader = localHeaderIterator.nextHeader();
              i3 += 4 + localHeader.getName().length() + localHeader.getValue().length();
              if (i == 0)
                continue;
              break label993;
            }
            e4.b(l2 + 4 + localBasicHttpEntityEnclosingRequest.getRequestLine().toString().length(), this.f.intValue());
          }
        }
        else
        {
          localHttpResponse.setParams(localBasicHttpParams);
          localHttpRequestExecutor.postProcess(localHttpResponse, this.e, localBasicHttpContext);
          int i2 = localHttpResponse.getStatusLine().getStatusCode();
          if ((i2 >= 500) && (n != m - 1) && (App.sb()))
          {
            g5.c(z[7] + i2 + z[12] + n + "/" + m + ")");
            if (i == 0)
              continue;
          }
          localObject = localHttpResponse;
          break;
          m = localList.size();
          break label74;
        }
        long l1 = this.c.getContentLength();
        l2 = l1;
      }
      catch (IOException localIOException)
      {
        g5.c(z[8] + n + "/" + m + z[14] + localIOException.toString());
        if ((n == m - 1) || (!App.sb()))
          throw localIOException;
      }
      catch (HttpException localHttpException)
      {
        g5.c(z[16] + n + "/" + m + z[14] + localHttpException.toString());
        if ((n == m - 1) || (!App.sb()))
          throw localHttpException;
      }
      catch (Exception localException)
      {
        g5.c(z[13] + n + "/" + m + z[14] + localException.toString());
        if ((n == m - 1) || (!App.sb()))
          throw localException;
        i1 = n + 1;
        if (i == 0)
          break label967;
      }
      label961: localObject = null;
      break;
      label967: n = i1;
      break label77;
      k = j;
      break label57;
      label980: if (l2 < 0L)
      {
        l2 = 0L;
        continue;
        label993: l2 += i3;
      }
    }
  }

  public void a(int paramInt)
  {
    this.f = Integer.valueOf(paramInt);
  }

  public void a(String paramString1, String paramString2)
  {
    this.d.add(new BasicNameValuePair(paramString1, paramString2));
  }

  public void a(HttpEntity paramHttpEntity)
  {
    this.c = paramHttpEntity;
  }
}