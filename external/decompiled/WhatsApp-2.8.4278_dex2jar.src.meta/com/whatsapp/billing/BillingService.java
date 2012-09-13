package com.whatsapp.billing;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.a;
import com.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class BillingService extends Service
  implements ServiceConnection
{
  private static b a;
  private static LinkedList<f> b;
  private static HashMap<Long, f> c;
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[14];
    char[] arrayOfChar1 = "F(gq?M&~,)U7$=!I+c1/\013\004E\021\016l\025G��\006j\023C\031\001f\006^\026\007k".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "L)k/8z4c8&@#U;)Q&".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "F(gq)K#x0!Ai|:&A.d8fG.f3!K $\017\035w\004B\036\033`\030Y\013\tq\002U\034��d\tM\032\f".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label725;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "W\"y/'K4o��+J#o".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label817;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "F(gq?M&~,)U7$=!I+c1/\013��O\013\027u\022X\034��d\024O��\001k\001E\r\005d\023C\020\006".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label909;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "W\"{*-V3U6,".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label1001;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "L)k/8z4c8&D3--".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label1093;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "F(gq)K#x0!Ai|:&A.d8fG.f3!K $\r\rv\027E\021\033`\030I\020\f`".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1185;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "K(~6.L$k+!J)U6,".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1277;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "g.f3!K Y::S.i:".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1369;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "g.f3!K *,-W1c<-\005#c,+J)d:+Q\"n".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label1461;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "f(3,\005)e+hG.d;hQ(*,-W1c<-\013".toCharArray();
        int i40 = arrayOfChar12.length;
        i41 = 0;
        if (i40 > i41)
          break label1553;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "F(gq)K#x0!Ai|:&A.d8fG.f3!K $\022)W,o+\nL+f6&B\024o->L$oq\nl\tN".toCharArray();
        int i44 = arrayOfChar13.length;
        i45 = 0;
        if (i44 > i45)
          break label1645;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "v\"i*:L3s-]$o/<L(deh".toCharArray();
        int i48 = arrayOfChar14.length;
        i49 = 0;
        if (i48 > i49)
          break label1737;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        z = arrayOfString;
        b = new LinkedList();
        c = new HashMap();
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 72;
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
        m = 37;
        continue;
        m = 71;
        continue;
        m = 10;
        continue;
        m = 95;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 72;
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
      i3 = 37;
      continue;
      i3 = 71;
      continue;
      i3 = 10;
      continue;
      i3 = 95;
    }
    label725: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 72;
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
      i7 = 37;
      continue;
      i7 = 71;
      continue;
      i7 = 10;
      continue;
      i7 = 95;
    }
    label817: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 72;
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
      i11 = 37;
      continue;
      i11 = 71;
      continue;
      i11 = 10;
      continue;
      i11 = 95;
    }
    label909: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 72;
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
      i15 = 37;
      continue;
      i15 = 71;
      continue;
      i15 = 10;
      continue;
      i15 = 95;
    }
    label1001: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 72;
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
      i19 = 37;
      continue;
      i19 = 71;
      continue;
      i19 = 10;
      continue;
      i19 = 95;
    }
    label1093: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 72;
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
      i23 = 37;
      continue;
      i23 = 71;
      continue;
      i23 = 10;
      continue;
      i23 = 95;
    }
    label1185: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 72;
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
      i27 = 37;
      continue;
      i27 = 71;
      continue;
      i27 = 10;
      continue;
      i27 = 95;
    }
    label1277: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 72;
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
      i31 = 37;
      continue;
      i31 = 71;
      continue;
      i31 = 10;
      continue;
      i31 = 95;
    }
    label1369: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 72;
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
      i35 = 37;
      continue;
      i35 = 71;
      continue;
      i35 = 10;
      continue;
      i35 = 95;
    }
    label1461: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 72;
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
      i39 = 37;
      continue;
      i39 = 71;
      continue;
      i39 = 10;
      continue;
      i39 = 95;
    }
    label1553: int i42 = arrayOfChar12[i41];
    int i43;
    switch (i41 % 5)
    {
    default:
      i43 = 72;
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
      i43 = 37;
      continue;
      i43 = 71;
      continue;
      i43 = 10;
      continue;
      i43 = 95;
    }
    label1645: int i46 = arrayOfChar13[i45];
    int i47;
    switch (i45 % 5)
    {
    default:
      i47 = 72;
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
      i47 = 37;
      continue;
      i47 = 71;
      continue;
      i47 = 10;
      continue;
      i47 = 95;
    }
    label1737: int i50 = arrayOfChar14[i49];
    int i51;
    switch (i49 % 5)
    {
    default:
      i51 = 72;
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
      i51 = 37;
      continue;
      i51 = 71;
      continue;
      i51 = 10;
      continue;
      i51 = 95;
    }
  }

  static b a(b paramb)
  {
    a = paramb;
    return paramb;
  }

  private void a(int paramInt, String paramString1, String paramString2)
  {
    int i = i.b;
    ArrayList localArrayList1 = o.a(paramString1, paramString2);
    if (localArrayList1 == null);
    while (true)
    {
      return;
      ArrayList localArrayList2 = new ArrayList();
      Iterator localIterator = localArrayList1.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        p localp = (p)localIterator.next();
        if (localp.b != null)
          localArrayList2.add(localp.b);
        m.a(this, localp.a, localp.c, localp.d, localp.e, localp.f);
      }
      while (i == 0);
      if (!localArrayList2.isEmpty())
        a(paramInt, (String[])localArrayList2.toArray(new String[localArrayList2.size()]));
    }
  }

  private void a(long paramLong, c paramc)
  {
    f localf = (f)c.get(Long.valueOf(paramLong));
    if (localf != null)
      localf.a(paramc);
    c.remove(Long.valueOf(paramLong));
  }

  private boolean a()
  {
    boolean bool = true;
    try
    {
      if (!bindService(new Intent(z[12]), this, 1))
      {
        Log.e(z[9], z[11]);
        bool = false;
      }
    }
    catch (SecurityException localSecurityException)
    {
      while (true)
        Log.e(z[9], z[13] + localSecurityException);
    }
    return bool;
  }

  private boolean a(int paramInt, String[] paramArrayOfString)
  {
    return new g(this, paramInt, paramArrayOfString).b();
  }

  static boolean a(BillingService paramBillingService)
  {
    return paramBillingService.a();
  }

  private void b()
  {
    int i = i.b;
    int j = -1;
    while (true)
    {
      f localf = (f)b.peek();
      int k;
      if (localf != null)
      {
        if (localf.c())
        {
          b.remove();
          if (j < localf.a())
          {
            k = localf.a();
            if (i == 0);
          }
        }
        else
        {
          a();
        }
      }
      else
      {
        while (true)
        {
          return;
          if (j >= 0)
            stopSelf(j);
        }
        j = k;
      }
    }
  }

  private boolean b(int paramInt, String[] paramArrayOfString)
  {
    return new h(this, paramInt, paramArrayOfString).b();
  }

  static LinkedList c()
  {
    return b;
  }

  static b d()
  {
    return a;
  }

  static HashMap e()
  {
    return c;
  }

  public void a(Intent paramIntent, int paramInt)
  {
    int i = i.b;
    String str1 = paramIntent.getAction();
    if (z[0].equals(str1))
    {
      a(paramInt, paramIntent.getStringArrayExtra(z[8]));
      if (i == 0);
    }
    else if (z[4].equals(str1))
    {
      String str2 = paramIntent.getStringExtra(z[8]);
      String[] arrayOfString = new String[1];
      arrayOfString[0] = str2;
      b(paramInt, arrayOfString);
      if (i == 0);
    }
    else if (z[2].equals(str1))
    {
      a(paramInt, paramIntent.getStringExtra(z[1]), paramIntent.getStringExtra(z[6]));
      if (i == 0);
    }
    else if (z[7].equals(str1))
    {
      a(paramIntent.getLongExtra(z[5], -1L), c.a(paramIntent.getIntExtra(z[3], c.g.ordinal())));
    }
  }

  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    a = a.a(paramIBinder);
    b();
  }

  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    Log.w(z[9], z[10]);
    a = null;
  }

  public void onStart(Intent paramIntent, int paramInt)
  {
    a(paramIntent, paramInt);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.billing.BillingService
 * JD-Core Version:    0.6.1
 */