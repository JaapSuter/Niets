package com.whatsapp;

import android.content.ContentResolver;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Data;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class y extends AsyncTask<Void, Void, Void>
{
  private static final String[] z;
  final ContactInfo a;

  static
  {
    String[] arrayOfString = new String[10];
    char[] arrayOfChar1 = "\003Z\b_-\003A\017E*\017\032\023[(\001A\003O".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "?\\\002".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\004T\022J".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label553;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\004T\022J}".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label645;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "<q".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label737;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "\022T\021t/\017[\022J/\024j\017Oq_\025'e\b@X\017F)\024L\026NqGC\bOb\001[\002Y#\tQHH9\022F\tYb\tA\003Fc\020]\tE)?CT\f".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label829;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "\004T\022J~".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label921;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "\003Z\b_-\003A9B(".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1013;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "\022T\021t/\017[\022J/\024j\017O".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1105;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "\003Z\b_-\003A9B(]\nFj\002$\025\013B!\005A\037[)]\022\020E(NT\bO>\017\\\002\005/\025G\025D>N\\\022N!OE\016D\"\005j\020\031k".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1197;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 76;
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
        m = 96;
        continue;
        m = 53;
        continue;
        m = 102;
        continue;
        m = 43;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 76;
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
      i3 = 96;
      continue;
      i3 = 53;
      continue;
      i3 = 102;
      continue;
      i3 = 43;
    }
    label553: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 76;
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
      i7 = 96;
      continue;
      i7 = 53;
      continue;
      i7 = 102;
      continue;
      i7 = 43;
    }
    label645: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 76;
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
      i11 = 96;
      continue;
      i11 = 53;
      continue;
      i11 = 102;
      continue;
      i11 = 43;
    }
    label737: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 76;
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
      i15 = 96;
      continue;
      i15 = 53;
      continue;
      i15 = 102;
      continue;
      i15 = 43;
    }
    label829: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 76;
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
      i19 = 96;
      continue;
      i19 = 53;
      continue;
      i19 = 102;
      continue;
      i19 = 43;
    }
    label921: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 76;
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
      i23 = 96;
      continue;
      i23 = 53;
      continue;
      i23 = 102;
      continue;
      i23 = 43;
    }
    label1013: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 76;
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
      i27 = 96;
      continue;
      i27 = 53;
      continue;
      i27 = 102;
      continue;
      i27 = 43;
    }
    label1105: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 76;
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
      i31 = 96;
      continue;
      i31 = 53;
      continue;
      i31 = 102;
      continue;
      i31 = 43;
    }
    label1197: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 76;
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
      i35 = 96;
      continue;
      i35 = 53;
      continue;
      i35 = 102;
      continue;
      i35 = 43;
    }
  }

  y(ContactInfo paramContactInfo)
  {
  }

  private void a()
  {
    boolean bool = DialogToastListActivity.f;
    ContentResolver localContentResolver1 = this.a.getContentResolver();
    Uri localUri1 = ContactsContract.Data.CONTENT_URI;
    String[] arrayOfString1 = new String[2];
    arrayOfString1[0] = z[1];
    arrayOfString1[1] = z[7];
    String str1 = z[5];
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = String.valueOf(ContactInfo.a(this.a).a());
    Cursor localCursor1 = localContentResolver1.query(localUri1, arrayOfString1, str1, arrayOfString2, null);
    String str2 = null;
    String str3;
    if (localCursor1 != null)
    {
      if (localCursor1.moveToNext())
        str2 = localCursor1.getString(localCursor1.getColumnIndex(z[7]));
      localCursor1.close();
      str3 = str2;
    }
    for (Cursor localCursor2 = null; ; localCursor2 = localCursor1)
    {
      ArrayList localArrayList = new ArrayList();
      kj localkj1 = new kj(this.a, ContactInfo.a(this.a));
      localArrayList.add(localkj1);
      ContentResolver localContentResolver2;
      Uri localUri2;
      String[] arrayOfString3;
      String str8;
      String[] arrayOfString4;
      if (str3 != null)
      {
        localContentResolver2 = this.a.getContentResolver();
        localUri2 = ContactsContract.Data.CONTENT_URI;
        arrayOfString3 = new String[5];
        arrayOfString3[0] = z[1];
        arrayOfString3[1] = z[8];
        arrayOfString3[2] = z[3];
        arrayOfString3[3] = z[6];
        arrayOfString3[4] = z[2];
        str8 = z[9];
        arrayOfString4 = new String[1];
        arrayOfString4[0] = str3;
      }
      for (Cursor localCursor3 = localContentResolver2.query(localUri2, arrayOfString3, str8, arrayOfString4, null); ; localCursor3 = localCursor2)
      {
        kj localkj2;
        int j;
        label551: int k;
        if (localCursor3 != null)
          while (true)
            if (localCursor3.moveToNext())
            {
              String str4 = localCursor3.getString(localCursor3.getColumnIndex(z[3]));
              if ((str4 != null) || (bool))
                if ((!isCancelled()) || (bool))
                {
                  long l = localCursor3.getLong(localCursor3.getColumnIndex(z[8]));
                  int i = localCursor3.getInt(localCursor3.getColumnIndex(z[6]));
                  String str5 = localCursor3.getString(localCursor3.getColumnIndex(z[2]));
                  if ((i != 0) || (str5 == null))
                    str5 = this.a.getResources().getString(ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(i));
                  localkj2 = new kj(this.a, str4, str5);
                  zq localzq = App.w.a(new uq(l, PhoneNumberUtils.stripSeparators(str4)));
                  if (localzq != null)
                  {
                    if (localzq.k)
                      localkj2.c = localzq.b;
                    if (localzq.f == ContactInfo.a(this.a).f)
                    {
                      localkj1.a = str4;
                      localkj1.b = str5;
                    }
                  }
                  String str6 = str4.replaceAll(z[4], "");
                  Iterator localIterator = localArrayList.iterator();
                  j = 1;
                  if (!localIterator.hasNext())
                    break label683;
                  String str7 = ((kj)localIterator.next()).a.toString().replaceAll(z[4], "");
                  if ((!str6.endsWith(str7)) && (!str7.endsWith(str6)))
                    break label676;
                  k = 0;
                  if (bool)
                    label616: if (!bool)
                      break label669;
                }
            }
        while (true)
        {
          if (k != 0)
            localArrayList.add(localkj2);
          if (!bool)
            break;
          localCursor3.close();
          if (!isCancelled())
            this.a.runOnUiThread(new lj(this, localArrayList));
          return;
          label669: j = k;
          break label551;
          label676: k = j;
          break label616;
          label683: k = j;
        }
      }
      str3 = null;
    }
  }

  private void b()
  {
    ArrayList localArrayList = App.z.n(ContactInfo.a(this.a).b);
    if (!isCancelled())
      this.a.runOnUiThread(new mj(this, localArrayList));
  }

  private void c()
  {
    int i = (int)App.Mb.getResources().getDimension(2131361808);
    int j = (int)j4.a(this.a).L;
    Bitmap localBitmap = ContactInfo.a(this.a).a(i, j, false);
    if (localBitmap == null)
    {
      localBitmap = ContactInfo.a(this.a).l();
      if (localBitmap != null)
        localBitmap = Bitmap.createScaledBitmap(localBitmap, i, i, true);
    }
    if (!isCancelled())
      this.a.runOnUiThread(new nj(this, localBitmap));
  }

  private void d()
  {
    boolean bool = DialogToastListActivity.f;
    ArrayList localArrayList1 = App.w.i();
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator = localArrayList1.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      zq localzq = (zq)localIterator.next();
      if ((isCancelled()) && (!bool))
        break;
      if ((localzq.o()) && (!localzq.p()) && (localzq.h != null))
      {
        HashMap localHashMap = eu.i(localzq.b);
        if ((localHashMap != null) && (localHashMap.containsKey(ContactInfo.a(this.a).b)))
          localArrayList2.add(localzq);
      }
    }
    while (!bool);
    if (!isCancelled())
      this.a.runOnUiThread(new oj(this, localArrayList2));
  }

  public Void a(Void[] paramArrayOfVoid)
  {
    if (!isCancelled())
      c();
    if (!isCancelled())
      b();
    if (!isCancelled())
      d();
    if (!isCancelled())
      a();
    return null;
  }

  public void a(Void paramVoid)
  {
    ContactInfo.c(this.a).setVisibility(8);
    g5.b(z[0]);
  }
}