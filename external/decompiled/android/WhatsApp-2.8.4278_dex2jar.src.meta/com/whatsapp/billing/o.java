package com.whatsapp.billing;

import android.text.TextUtils;
import android.util.Log;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class o
{
  private static final SecureRandom a;
  private static HashSet<Long> b;
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[22];
    char[] arrayOfChar1 = "d9zK`B\027EYlX?]Vno.J[s^?FP-".toCharArray();
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
    char[] arrayOfChar21;
    int i77;
    char[] arrayOfChar22;
    int i81;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "y\036h\017tC\"AlPk".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "y?NPb^#[[#\\3[WeC5HJjE8\tXbC:LZ-".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label1028;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "h7Z[5\036vM[`E2@Pd\n0HWoO2\007".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label1116;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "y3JKqC\"P".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label1204;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "y?NPb^#[[#O.J[s^?FP-".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label1292;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "c8__oC2\tUfSvZNfI?OW`K\"@Qm\004".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label1380;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "x\005h".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1468;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "Z#[]kK%LjjG3".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1556;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "Z7JUbM3g_nO".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1644;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "d9G]f\n8FJ#L9\\Pg\020v".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label1732;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "E$M[qY".toCharArray();
        int i40 = arrayOfChar12.length;
        i41 = 0;
        if (i40 > i41)
          break label1820;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "N3_[oE&LLSK/EQbN".toCharArray();
        int i44 = arrayOfChar13.length;
        i45 = 0;
        if (i44 > i45)
          break label1908;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "`\005fp#O.J[s^?FP9\n".toCharArray();
        int i48 = arrayOfChar14.length;
        i49 = 0;
        if (i48 > i49)
          break label1996;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "Z$FZvI\"`Z".toCharArray();
        int i52 = arrayOfChar15.length;
        i53 = 0;
        if (i52 > i53)
          break label2084;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "E$M[qc2".toCharArray();
        int i56 = arrayOfChar16.length;
        i57 = 0;
        if (i56 > i57)
          break label2172;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "N7]_#C%\tPvF:".toCharArray();
        int i60 = arrayOfChar17.length;
        i61 = 0;
        if (i60 > i61)
          break label2260;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "Y?NPb^#[[#N9LM#D9]\036nK\"JV#N7]_-".toCharArray();
        int i64 = arrayOfChar18.length;
        i65 = 0;
        if (i64 > i65)
          break label2348;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "S9\\L#Z#KRjIvB[z\n>LLf".toCharArray();
        int i68 = arrayOfChar19.length;
        i69 = 0;
        if (i68 > i69)
          break label2436;
        arrayOfString[18] = new String(arrayOfChar19).intern();
        arrayOfChar20 = "D9G]f".toCharArray();
        int i72 = arrayOfChar20.length;
        i73 = 0;
        if (i72 > i73)
          break label2524;
        arrayOfString[19] = new String(arrayOfChar20).intern();
        arrayOfChar21 = "Z#[]kK%LmwK\"L".toCharArray();
        int i76 = arrayOfChar21.length;
        i77 = 0;
        if (i76 > i77)
          break label2612;
        arrayOfString[20] = new String(arrayOfChar21).intern();
        arrayOfChar22 = "D9]WeC5HJjE8`Z".toCharArray();
        int i80 = arrayOfChar22.length;
        i81 = 0;
        if (i80 > i81)
          break label2700;
        arrayOfString[21] = new String(arrayOfChar22).intern();
        z = arrayOfString;
        a = new SecureRandom();
        b = new HashSet();
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 3;
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
        m = 42;
        continue;
        m = 86;
        continue;
        m = 41;
        continue;
        m = 62;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 3;
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
      i3 = 42;
      continue;
      i3 = 86;
      continue;
      i3 = 41;
      continue;
      i3 = 62;
    }
    label1028: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 3;
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
      i7 = 42;
      continue;
      i7 = 86;
      continue;
      i7 = 41;
      continue;
      i7 = 62;
    }
    label1116: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 3;
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
      i11 = 42;
      continue;
      i11 = 86;
      continue;
      i11 = 41;
      continue;
      i11 = 62;
    }
    label1204: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 3;
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
      i15 = 42;
      continue;
      i15 = 86;
      continue;
      i15 = 41;
      continue;
      i15 = 62;
    }
    label1292: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 3;
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
      i19 = 42;
      continue;
      i19 = 86;
      continue;
      i19 = 41;
      continue;
      i19 = 62;
    }
    label1380: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 3;
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
      i23 = 42;
      continue;
      i23 = 86;
      continue;
      i23 = 41;
      continue;
      i23 = 62;
    }
    label1468: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 3;
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
      i27 = 42;
      continue;
      i27 = 86;
      continue;
      i27 = 41;
      continue;
      i27 = 62;
    }
    label1556: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 3;
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
      i31 = 42;
      continue;
      i31 = 86;
      continue;
      i31 = 41;
      continue;
      i31 = 62;
    }
    label1644: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 3;
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
      i35 = 42;
      continue;
      i35 = 86;
      continue;
      i35 = 41;
      continue;
      i35 = 62;
    }
    label1732: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 3;
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
      i39 = 42;
      continue;
      i39 = 86;
      continue;
      i39 = 41;
      continue;
      i39 = 62;
    }
    label1820: int i42 = arrayOfChar12[i41];
    int i43;
    switch (i41 % 5)
    {
    default:
      i43 = 3;
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
      i43 = 42;
      continue;
      i43 = 86;
      continue;
      i43 = 41;
      continue;
      i43 = 62;
    }
    label1908: int i46 = arrayOfChar13[i45];
    int i47;
    switch (i45 % 5)
    {
    default:
      i47 = 3;
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
      i47 = 42;
      continue;
      i47 = 86;
      continue;
      i47 = 41;
      continue;
      i47 = 62;
    }
    label1996: int i50 = arrayOfChar14[i49];
    int i51;
    switch (i49 % 5)
    {
    default:
      i51 = 3;
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
      i51 = 42;
      continue;
      i51 = 86;
      continue;
      i51 = 41;
      continue;
      i51 = 62;
    }
    label2084: int i54 = arrayOfChar15[i53];
    int i55;
    switch (i53 % 5)
    {
    default:
      i55 = 3;
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
      i55 = 42;
      continue;
      i55 = 86;
      continue;
      i55 = 41;
      continue;
      i55 = 62;
    }
    label2172: int i58 = arrayOfChar16[i57];
    int i59;
    switch (i57 % 5)
    {
    default:
      i59 = 3;
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
      i59 = 42;
      continue;
      i59 = 86;
      continue;
      i59 = 41;
      continue;
      i59 = 62;
    }
    label2260: int i62 = arrayOfChar17[i61];
    int i63;
    switch (i61 % 5)
    {
    default:
      i63 = 3;
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
      i63 = 42;
      continue;
      i63 = 86;
      continue;
      i63 = 41;
      continue;
      i63 = 62;
    }
    label2348: int i66 = arrayOfChar18[i65];
    int i67;
    switch (i65 % 5)
    {
    default:
      i67 = 3;
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
      i67 = 42;
      continue;
      i67 = 86;
      continue;
      i67 = 41;
      continue;
      i67 = 62;
    }
    label2436: int i70 = arrayOfChar19[i69];
    int i71;
    switch (i69 % 5)
    {
    default:
      i71 = 3;
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
      i71 = 42;
      continue;
      i71 = 86;
      continue;
      i71 = 41;
      continue;
      i71 = 62;
    }
    label2524: int i74 = arrayOfChar20[i73];
    int i75;
    switch (i73 % 5)
    {
    default:
      i75 = 3;
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
      i75 = 42;
      continue;
      i75 = 86;
      continue;
      i75 = 41;
      continue;
      i75 = 62;
    }
    label2612: int i78 = arrayOfChar21[i77];
    int i79;
    switch (i77 % 5)
    {
    default:
      i79 = 3;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar21[i77] = (char)(i79 ^ i78);
      i77++;
      break;
      i79 = 42;
      continue;
      i79 = 86;
      continue;
      i79 = 41;
      continue;
      i79 = 62;
    }
    label2700: int i82 = arrayOfChar22[i81];
    int i83;
    switch (i81 % 5)
    {
    default:
      i83 = 3;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar22[i81] = (char)(i83 ^ i82);
      i81++;
      break;
      i83 = 42;
      continue;
      i83 = 86;
      continue;
      i83 = 41;
      continue;
      i83 = 62;
    }
  }

  public static long a()
  {
    long l = a.nextLong();
    b.add(Long.valueOf(l));
    return l;
  }

  public static PublicKey a(String paramString)
  {
    try
    {
      byte[] arrayOfByte = e.a(paramString);
      PublicKey localPublicKey = KeyFactory.getInstance(z[7]).generatePublic(new X509EncodedKeySpec(arrayOfByte));
      return localPublicKey;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      throw new RuntimeException(localNoSuchAlgorithmException);
    }
    catch (InvalidKeySpecException localInvalidKeySpecException)
    {
      Log.e(z[4], z[6]);
      throw new IllegalArgumentException(localInvalidKeySpecException);
    }
    catch (d locald)
    {
      Log.e(z[4], z[3]);
      throw new IllegalArgumentException(locald);
    }
  }

  public static ArrayList<p> a(String paramString1, String paramString2)
  {
    int i = i.b;
    if (paramString1 == null)
      Log.e(z[4], z[16]);
    boolean bool2;
    for (Object localObject = null; ; localObject = null)
    {
      return localObject;
      if (TextUtils.isEmpty(paramString2))
        break label430;
      bool2 = a(a(z[18]), paramString1, paramString2);
      if (bool2)
        break;
      Log.w(z[4], z[17]);
    }
    label417: label424: label430: for (boolean bool1 = bool2; ; bool1 = false)
      while (true)
      {
        long l1;
        JSONArray localJSONArray;
        try
        {
          JSONObject localJSONObject1 = new JSONObject(paramString1);
          l1 = localJSONObject1.optLong(z[19]);
          localJSONArray = localJSONObject1.optJSONArray(z[11]);
          if (localJSONArray == null)
            break label424;
          int n = localJSONArray.length();
          j = n;
          if (b(l1))
            break label188;
          Log.w(z[4], z[10] + l1);
          localObject = null;
        }
        catch (JSONException localJSONException1)
        {
          localObject = null;
        }
        break;
        label188: ArrayList localArrayList = new ArrayList();
        int m;
        for (int k = 0; ; k = m)
        {
          while (true)
          {
            if (k < j);
            try
            {
              JSONObject localJSONObject2 = localJSONArray.getJSONObject(k);
              b localb = b.a(localJSONObject2.getInt(z[20]));
              String str1 = localJSONObject2.getString(z[14]);
              localJSONObject2.getString(z[9]);
              long l2 = localJSONObject2.getLong(z[8]);
              String str2 = localJSONObject2.optString(z[15], "");
              String str3 = null;
              if (localJSONObject2.has(z[21]))
                str3 = localJSONObject2.getString(z[21]);
              String str4 = localJSONObject2.optString(z[12], null);
              if ((localb != b.a) || (bool1) || (i != 0))
                localArrayList.add(new p(localb, str3, str1, str2, l2, str4));
              m = k + 1;
              if (i == 0)
                break label417;
              a(l1);
              localObject = localArrayList;
            }
            catch (JSONException localJSONException2)
            {
              Log.e(z[4], z[13], localJSONException2);
              localObject = null;
            }
          }
          break;
        }
        int j = 0;
      }
  }

  public static void a(long paramLong)
  {
    b.remove(Long.valueOf(paramLong));
  }

  public static boolean a(PublicKey paramPublicKey, String paramString1, String paramString2)
  {
    boolean bool = false;
    try
    {
      Signature localSignature = Signature.getInstance(z[1]);
      localSignature.initVerify(paramPublicKey);
      localSignature.update(paramString1.getBytes());
      if (!localSignature.verify(e.a(paramString2)))
        Log.e(z[4], z[2]);
      while (true)
      {
        return bool;
        bool = true;
      }
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      while (true)
        Log.e(z[4], z[0]);
    }
    catch (InvalidKeyException localInvalidKeyException)
    {
      while (true)
        Log.e(z[4], z[6]);
    }
    catch (SignatureException localSignatureException)
    {
      while (true)
        Log.e(z[4], z[5]);
    }
    catch (d locald)
    {
      while (true)
        Log.e(z[4], z[3]);
    }
  }

  public static boolean b(long paramLong)
  {
    return b.contains(Long.valueOf(paramLong));
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.billing.o
 * JD-Core Version:    0.6.1
 */