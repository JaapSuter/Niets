package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract.Contacts;
import android.text.SpannableStringBuilder;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

public class GroupChatInfo extends DialogToastListActivity
  implements uk
{
  private static GroupChatInfo F;
  public static wz G;
  public static Handler H;
  static zq K;
  private static final String[] N;
  View A;
  View B;
  View C;
  ListView D;
  zq E;
  View.OnTouchListener I = new cu(this);
  View.OnClickListener J = new mt(this);
  Handler L = new id(this);
  private final lq M = new oq(this);
  private int g = -1;
  private float h = -1.0F;
  String i;
  TextView j;
  TextView k;
  TextView l;
  TextView m;
  TextView n;
  ArrayList<sz> o;
  ArrayList<sz> p;
  ie q;
  ArrayList<zq> r = new ArrayList();
  HashMap<String, zq> s = new HashMap();
  zq t;
  gu u;
  ViewGroup v;
  ImageButton w;
  ImageButton x;
  Button y;
  View z;

  static
  {
    String[] arrayOfString = new String[20];
    char[] arrayOfChar1 = " \025~fVg\016uIh\004~}R\"\037e3U>\024evKg\004~}R&\004e3J.\024e3E(\022}w\006)\be3@(\022w".toCharArray();
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
    char[] arrayOfChar11;
    int i42;
    char[] arrayOfChar12;
    int i46;
    char[] arrayOfChar13;
    int i50;
    char[] arrayOfChar14;
    int i54;
    char[] arrayOfChar15;
    int i58;
    char[] arrayOfChar16;
    int i62;
    char[] arrayOfChar17;
    int i66;
    char[] arrayOfChar18;
    int i70;
    char[] arrayOfChar19;
    int i74;
    char[] arrayOfChar20;
    int i78;
    if (i1 <= i2)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "7\017~}C".toCharArray();
      int i5 = arrayOfChar2.length;
      i6 = 0;
      if (i5 <= i6)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "&\tuaI.\003?zH3\002g\b&\004ezI)IX]u\0025E".toCharArray();
        int i9 = arrayOfChar3.length;
        i10 = 0;
        if (i9 > i10)
          break label953;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "7\017~}C\030\023hcC".toCharArray();
        int i13 = arrayOfChar4.length;
        i14 = 0;
        if (i13 > i14)
          break label1045;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "&\tuaI.\003?zH3\002g\b&\004ezI)IX]u\0025ELi\0258TWo\023".toCharArray();
        int i17 = arrayOfChar5.length;
        i18 = 0;
        if (i17 > i18)
          break label1137;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "1\tu=G)\003c|O#IrfT4\bc=O3\002|<E(\terE3".toCharArray();
        int i21 = arrayOfChar6.length;
        i22 = 0;
        if (i21 > i22)
          break label1229;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "3\002})".toCharArray();
        int i25 = arrayOfChar7.length;
        i26 = 0;
        if (i25 > i26)
          break label1321;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "&\tuaI.\003?zH3\002g\b&\004ezI)IRRj\013".toCharArray();
        int i29 = arrayOfChar8.length;
        i30 = 0;
        if (i29 > i30)
          break label1413;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = " \025~fV$\017pgO)\001~<G#\0031v^.\024ezH Gr|H3\006rg\034g\006rgO1\016ej\006)\be3@(\022w\ng\027c|D&\005}j\0063\006sC3".toCharArray();
        int i33 = arrayOfChar9.length;
        i34 = 0;
        if (i33 > i34)
          break label1505;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = " \025~fV\030\016uIh\003t`R5\bh".toCharArray();
        int i37 = arrayOfChar10.length;
        i38 = 0;
        if (i37 > i38)
          break label1597;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = " \016u".toCharArray();
        int i41 = arrayOfChar11.length;
        i42 = 0;
        if (i41 > i42)
          break label1689;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "+\006h|S38x}@+\006evT".toCharArray();
        int i45 = arrayOfChar12.length;
        i46 = 0;
        if (i45 > i46)
          break label1781;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "g\0331H".toCharArray();
        int i49 = arrayOfChar13.length;
        i50 = 0;
        if (i49 > i50)
          break label1873;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = " \025~fV\030\016uIh\024tge(\terE3\024]zU30xgN\006\003uvB\001\006xC#]1".toCharArray();
        int i53 = arrayOfChar14.length;
        i54 = 0;
        if (i53 > i54)
          break label1965;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = " \025~fV\030\016uIh\024tg\0062\tpwB\"\003+3".toCharArray();
        int i57 = arrayOfChar15.length;
        i58 = 0;
        if (i57 > i58)
          break label2057;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "!\027p>".toCharArray();
        int i61 = arrayOfChar16.length;
        i62 = 0;
        if (i61 > i62)
          break label2149;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = ".\024NaC4\002e".toCharArray();
        int i65 = arrayOfChar17.length;
        i66 = 0;
        if (i65 > i66)
          break label2241;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = " \025~fV\030\016uIh\025t`S+\023>`M.\027>pI)\023ppRg\t~g\006&\003uvB".toCharArray();
        int i69 = arrayOfChar18.length;
        i70 = 0;
        if (i69 > i70)
          break label2333;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "$\bgG$\023".toCharArray();
        int i73 = arrayOfChar19.length;
        i74 = 0;
        if (i73 > i74)
          break label2425;
        arrayOfString[18] = new String(arrayOfChar19).intern();
        arrayOfChar20 = " \025~fV\030\016uIh\025t`S+\023>pI)\023ppRg\t~g\006&\003uvB".toCharArray();
        int i77 = arrayOfChar20.length;
        i78 = 0;
        if (i77 > i78)
          break label2517;
        arrayOfString[19] = new String(arrayOfChar20).intern();
        N = arrayOfString;
        G = new kt();
        H = new hd();
      }
    }
    else
    {
      int i3 = arrayOfChar1[i2];
      int i4;
      switch (i2 % 5)
      {
      default:
        i4 = 38;
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
        i4 = 71;
        continue;
        i4 = 103;
        continue;
        i4 = 17;
        continue;
        i4 = 19;
      }
    }
    int i7 = arrayOfChar2[i6];
    int i8;
    switch (i6 % 5)
    {
    default:
      i8 = 38;
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
      i8 = 71;
      continue;
      i8 = 103;
      continue;
      i8 = 17;
      continue;
      i8 = 19;
    }
    label953: int i11 = arrayOfChar3[i10];
    int i12;
    switch (i10 % 5)
    {
    default:
      i12 = 38;
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
      i12 = 71;
      continue;
      i12 = 103;
      continue;
      i12 = 17;
      continue;
      i12 = 19;
    }
    label1045: int i15 = arrayOfChar4[i14];
    int i16;
    switch (i14 % 5)
    {
    default:
      i16 = 38;
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
      i16 = 71;
      continue;
      i16 = 103;
      continue;
      i16 = 17;
      continue;
      i16 = 19;
    }
    label1137: int i19 = arrayOfChar5[i18];
    int i20;
    switch (i18 % 5)
    {
    default:
      i20 = 38;
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
      i20 = 71;
      continue;
      i20 = 103;
      continue;
      i20 = 17;
      continue;
      i20 = 19;
    }
    label1229: int i23 = arrayOfChar6[i22];
    int i24;
    switch (i22 % 5)
    {
    default:
      i24 = 38;
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
      i24 = 71;
      continue;
      i24 = 103;
      continue;
      i24 = 17;
      continue;
      i24 = 19;
    }
    label1321: int i27 = arrayOfChar7[i26];
    int i28;
    switch (i26 % 5)
    {
    default:
      i28 = 38;
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
      i28 = 71;
      continue;
      i28 = 103;
      continue;
      i28 = 17;
      continue;
      i28 = 19;
    }
    label1413: int i31 = arrayOfChar8[i30];
    int i32;
    switch (i30 % 5)
    {
    default:
      i32 = 38;
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
      i32 = 71;
      continue;
      i32 = 103;
      continue;
      i32 = 17;
      continue;
      i32 = 19;
    }
    label1505: int i35 = arrayOfChar9[i34];
    int i36;
    switch (i34 % 5)
    {
    default:
      i36 = 38;
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
      i36 = 71;
      continue;
      i36 = 103;
      continue;
      i36 = 17;
      continue;
      i36 = 19;
    }
    label1597: int i39 = arrayOfChar10[i38];
    int i40;
    switch (i38 % 5)
    {
    default:
      i40 = 38;
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
      i40 = 71;
      continue;
      i40 = 103;
      continue;
      i40 = 17;
      continue;
      i40 = 19;
    }
    label1689: int i43 = arrayOfChar11[i42];
    int i44;
    switch (i42 % 5)
    {
    default:
      i44 = 38;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar11[i42] = (char)(i44 ^ i43);
      i42++;
      break;
      i44 = 71;
      continue;
      i44 = 103;
      continue;
      i44 = 17;
      continue;
      i44 = 19;
    }
    label1781: int i47 = arrayOfChar12[i46];
    int i48;
    switch (i46 % 5)
    {
    default:
      i48 = 38;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar12[i46] = (char)(i48 ^ i47);
      i46++;
      break;
      i48 = 71;
      continue;
      i48 = 103;
      continue;
      i48 = 17;
      continue;
      i48 = 19;
    }
    label1873: int i51 = arrayOfChar13[i50];
    int i52;
    switch (i50 % 5)
    {
    default:
      i52 = 38;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar13[i50] = (char)(i52 ^ i51);
      i50++;
      break;
      i52 = 71;
      continue;
      i52 = 103;
      continue;
      i52 = 17;
      continue;
      i52 = 19;
    }
    label1965: int i55 = arrayOfChar14[i54];
    int i56;
    switch (i54 % 5)
    {
    default:
      i56 = 38;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar14[i54] = (char)(i56 ^ i55);
      i54++;
      break;
      i56 = 71;
      continue;
      i56 = 103;
      continue;
      i56 = 17;
      continue;
      i56 = 19;
    }
    label2057: int i59 = arrayOfChar15[i58];
    int i60;
    switch (i58 % 5)
    {
    default:
      i60 = 38;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar15[i58] = (char)(i60 ^ i59);
      i58++;
      break;
      i60 = 71;
      continue;
      i60 = 103;
      continue;
      i60 = 17;
      continue;
      i60 = 19;
    }
    label2149: int i63 = arrayOfChar16[i62];
    int i64;
    switch (i62 % 5)
    {
    default:
      i64 = 38;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar16[i62] = (char)(i64 ^ i63);
      i62++;
      break;
      i64 = 71;
      continue;
      i64 = 103;
      continue;
      i64 = 17;
      continue;
      i64 = 19;
    }
    label2241: int i67 = arrayOfChar17[i66];
    int i68;
    switch (i66 % 5)
    {
    default:
      i68 = 38;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar17[i66] = (char)(i68 ^ i67);
      i66++;
      break;
      i68 = 71;
      continue;
      i68 = 103;
      continue;
      i68 = 17;
      continue;
      i68 = 19;
    }
    label2333: int i71 = arrayOfChar18[i70];
    int i72;
    switch (i70 % 5)
    {
    default:
      i72 = 38;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar18[i70] = (char)(i72 ^ i71);
      i70++;
      break;
      i72 = 71;
      continue;
      i72 = 103;
      continue;
      i72 = 17;
      continue;
      i72 = 19;
    }
    label2425: int i75 = arrayOfChar19[i74];
    int i76;
    switch (i74 % 5)
    {
    default:
      i76 = 38;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar19[i74] = (char)(i76 ^ i75);
      i74++;
      break;
      i76 = 71;
      continue;
      i76 = 103;
      continue;
      i76 = 17;
      continue;
      i76 = 19;
    }
    label2517: int i79 = arrayOfChar20[i78];
    int i80;
    switch (i78 % 5)
    {
    default:
      i80 = 38;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar20[i78] = (char)(i80 ^ i79);
      i78++;
      break;
      i80 = 71;
      continue;
      i80 = 103;
      continue;
      i80 = 17;
      continue;
      i80 = 19;
    }
  }

  static int a(GroupChatInfo paramGroupChatInfo)
  {
    return paramGroupChatInfo.g;
  }

  private ImageView a(sz paramsz, ImageView paramImageView)
  {
    return j5.a(paramsz, paramImageView, this);
  }

  static void a(GroupChatInfo paramGroupChatInfo, String paramString)
  {
    paramGroupChatInfo.g(paramString);
  }

  private void a(zq paramzq)
  {
    boolean bool = DialogToastListActivity.f;
    if (!paramzq.o())
      finish();
    while (true)
    {
      return;
      String str1;
      if (this.t.q().startsWith(App.c()))
        str1 = getString(2131296867);
      try
      {
        while (true)
        {
          String str3 = t4.d(this, Long.parseLong(paramzq.j));
          TextView localTextView3 = this.n;
          Resources localResources2 = getResources();
          Object[] arrayOfObject3 = new Object[2];
          arrayOfObject3[0] = str3;
          arrayOfObject3[1] = str1;
          localTextView3.setText(localResources2.getString(2131296928, arrayOfObject3));
          this.l = ((TextView)this.A.findViewById(2131558414));
          this.o = App.z.n(this.i);
          int i1 = this.o.size();
          this.l.setOnTouchListener(this.I);
          View localView = this.A.findViewById(2131558683);
          if (i1 == 0)
          {
            this.l.setVisibility(8);
            localView.setVisibility(8);
            if (!bool);
          }
          else
          {
            TextView localTextView2 = this.l;
            Object[] arrayOfObject2 = new Object[1];
            arrayOfObject2[0] = Integer.valueOf(i1);
            localTextView2.setText(getString(2131296895, arrayOfObject2));
            this.l.setVisibility(0);
            localView.setVisibility(0);
            ImageView localImageView1 = (ImageView)this.A.findViewById(2131558517);
            ImageView localImageView2 = (ImageView)this.A.findViewById(2131558518);
            ImageView localImageView3 = (ImageView)this.A.findViewById(2131558519);
            localImageView1.setVisibility(4);
            localImageView2.setVisibility(4);
            localImageView3.setVisibility(4);
            ArrayList localArrayList = new ArrayList(3);
            localObject = null;
            Iterator localIterator = this.o.iterator();
            do
            {
              if (!localIterator.hasNext())
                break;
              localsz = (sz)localIterator.next();
              if (localsz.l == 2)
              {
                if (!bool)
                  break label644;
                localObject = localsz;
              }
              localArrayList.add(localsz);
            }
            while (((localArrayList.size() != 3) || (bool)) && (!bool));
            int i2 = -1 + localArrayList.size();
            if (i2 >= 0)
            {
              i3 = i2 - 1;
              a((sz)localArrayList.get(i2), localImageView1);
              localImageView1.setVisibility(0);
              if (i3 < 0)
                break label637;
              int i5 = i3 - 1;
              a((sz)localArrayList.get(i3), localImageView2);
              localImageView2.setVisibility(0);
              i4 = i5;
              if (i4 >= 0)
              {
                (i4 - 1);
                a((sz)localArrayList.get(i4), localImageView3);
                localImageView3.setVisibility(0);
                if (!bool);
              }
            }
            else if (localObject != null)
            {
              a(localObject, localImageView1);
              localImageView1.setVisibility(0);
            }
          }
          this.m = ((TextView)this.A.findViewById(2131558684));
          this.m.setOnTouchListener(this.I);
          c();
          break;
          str1 = App.w.a(this.t.q(), null).b();
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        while (true)
        {
          sz localsz;
          int i3;
          g5.d(localNumberFormatException);
          String str2 = getString(2131296275);
          TextView localTextView1 = this.n;
          Resources localResources1 = getResources();
          Object[] arrayOfObject1 = new Object[2];
          arrayOfObject1[0] = str2;
          arrayOfObject1[1] = str1;
          localTextView1.setText(localResources1.getString(2131296928, arrayOfObject1));
          continue;
          label637: int i4 = i3;
          continue;
          label644: Object localObject = localsz;
        }
      }
    }
  }

  public static void a(zq paramzq, Activity paramActivity)
  {
    Intent localIntent = new Intent(paramActivity, GroupChatInfo.class);
    localIntent.putExtra(N[10], paramzq.b);
    paramActivity.startActivity(localIntent);
  }

  static boolean a(GroupChatInfo paramGroupChatInfo, zq paramzq, int paramInt)
  {
    return paramGroupChatInfo.a(paramzq, paramInt);
  }

  private boolean a(zq paramzq, int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 0:
    case 2:
    case 3:
    case 1:
    case 4:
    case 5:
    }
    while (true)
    {
      return true;
      if (paramzq.g != null)
      {
        ContactInfo.a(paramzq, this);
        continue;
        if (paramzq == null)
        {
          App.a(this, 2131296469, 0);
          if (!DialogToastListActivity.f);
        }
        else
        {
          K = paramzq;
          b(paramzq);
          continue;
          K = paramzq;
          j();
          continue;
          startActivity(Conversation.a(paramzq));
          continue;
          String str1 = paramzq.a();
          String str2 = N[6] + str1;
          startActivity(new Intent(N[7], Uri.parse(str2)));
          continue;
          showDialog(6);
        }
      }
    }
  }

  static float b(GroupChatInfo paramGroupChatInfo)
  {
    return paramGroupChatInfo.h;
  }

  private void b(zq paramzq)
  {
    String str = paramzq.a();
    Intent localIntent = new Intent(N[2], ContactsContract.Contacts.CONTENT_URI);
    localIntent.putExtra(N[1], str);
    localIntent.setComponent(localIntent.resolveActivity(getPackageManager()));
    if (localIntent.getComponent() != null)
    {
      g.a(true);
      startActivityForResult(localIntent, 10);
      if (!DialogToastListActivity.f);
    }
    else
    {
      g5.b(N[0]);
      App.h();
    }
  }

  private void c()
  {
    boolean bool = DialogToastListActivity.f;
    this.p = App.z.p(this.i);
    int i1 = this.p.size();
    View localView = this.A.findViewById(2131558685);
    ImageView[] arrayOfImageView;
    if (i1 == 0)
    {
      this.m.setVisibility(8);
      localView.setVisibility(8);
      if (!bool);
    }
    else
    {
      TextView localTextView = this.m;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i1);
      localTextView.setText(getString(2131296896, arrayOfObject));
      this.m.setVisibility(0);
      localView.setVisibility(0);
      arrayOfImageView = new ImageView[3];
      arrayOfImageView[0] = ((ImageView)this.A.findViewById(2131558686));
      arrayOfImageView[1] = ((ImageView)this.A.findViewById(2131558687));
      arrayOfImageView[2] = ((ImageView)this.A.findViewById(2131558688));
    }
    int i4;
    for (int i2 = 0; ; i2 = i4)
      if (i2 < Math.min(this.p.size(), arrayOfImageView.length))
      {
        a((sz)this.p.get(i2), arrayOfImageView[i2]);
        arrayOfImageView[i2].setVisibility(0);
        i4 = i2 + 1;
        if (!bool);
      }
      else
      {
        int i3 = this.p.size();
        do
        {
          if (i3 >= arrayOfImageView.length)
            break;
          arrayOfImageView[i3].setVisibility(8);
          i3++;
        }
        while (!bool);
        return;
      }
  }

  static void c(GroupChatInfo paramGroupChatInfo)
  {
    paramGroupChatInfo.c();
  }

  public static void d(String paramString)
  {
    if ((F != null) && (F.i.equals(paramString)))
    {
      F.i();
      F.removeDialog(0);
      F.removeDialog(5);
      F.removeDialog(1);
    }
  }

  public static boolean d()
  {
    if (F != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static GroupChatInfo e()
  {
    return F;
  }

  public static void e(String paramString)
  {
    if ((F != null) && (F.i.equals(paramString)))
    {
      F.t = App.w.a(paramString, null);
      F.a(F.t);
      F.h();
      F.B.setVisibility(8);
      F.w.setVisibility(0);
    }
  }

  public static void f()
  {
    if (F != null)
    {
      F.B.setVisibility(8);
      F.w.setVisibility(0);
      F.w.setOnClickListener(F.J);
    }
  }

  private void f(String paramString)
  {
    if (App.sb())
    {
      showDialog(0);
      new k9(this, paramString).start();
      if (!DialogToastListActivity.f);
    }
    else
    {
      eu.b(this.i, paramString);
      i();
    }
  }

  public static void g()
  {
    if (eu.d)
      H.sendEmptyMessage(0);
  }

  private void g(String paramString)
  {
    boolean bool = DialogToastListActivity.f;
    if (this.s.containsKey(paramString))
    {
      Vector localVector = new Vector();
      localVector.add(paramString);
      eu.c(this.i, localVector);
      if (!bool);
    }
    else if (App.sb())
    {
      showDialog(5);
      new l9(this, paramString).start();
      if (!bool);
    }
    else
    {
      i();
    }
  }

  private void h()
  {
    Object localObject = v4.a(this.t.b(), getBaseContext());
    TextView localTextView = this.j;
    if (localObject == null)
      localObject = this.t.b();
    localTextView.setText((CharSequence)localObject);
  }

  private void i()
  {
    boolean bool = DialogToastListActivity.f;
    this.t = App.w.a(this.i, null);
    h();
    b();
    this.r.clear();
    Iterator localIterator = eu.i(this.i).values().iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      String str = (String)localIterator.next();
      if ((str.length() > 0) && (!str.contains(App.c())))
      {
        zq localzq = App.w.a(str, null);
        if (!this.r.contains(localzq))
          this.r.add(localzq);
      }
    }
    while (!bool);
    Collections.sort(this.r, new du());
    a(this.i, this.r);
    this.B.setVisibility(8);
    this.w.setVisibility(0);
    TextView localTextView = this.k;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.r.size());
    arrayOfObject[1] = Integer.valueOf(eu.b);
    localTextView.setText(getString(2131296923, arrayOfObject));
    this.w.setOnClickListener(this.J);
    this.q.notifyDataSetChanged();
  }

  private void j()
  {
    try
    {
      g.a(true);
      Intent localIntent = new Intent(N[4]);
      localIntent.setType(N[5]);
      localIntent.putExtra(N[1], K.b());
      localIntent.putExtra(N[3], 2);
      localIntent.setFlags(524288);
      startActivityForResult(localIntent, 11);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      while (true)
        showDialog(4);
    }
  }

  public void a()
  {
    boolean bool = DialogToastListActivity.f;
    this.r.clear();
    this.t = App.w.c(this.i);
    Iterator localIterator = eu.i(this.i).values().iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      String str = (String)localIterator.next();
      if ((str.length() > 0) && (!str.contains(App.c())))
      {
        zq localzq = App.w.a(str, null);
        if (!this.r.contains(localzq))
          this.r.add(localzq);
      }
    }
    while (!bool);
    Collections.sort(this.r, new du());
    this.q.notifyDataSetChanged();
  }

  public void a(View paramView, boolean paramBoolean)
  {
    this.D.post(new lt(this, paramView, paramBoolean));
  }

  public void a(String paramString)
  {
    if (!eu.f(paramString))
    {
      zq localzq = App.w.a(paramString, null);
      if (localzq != null)
      {
        vq localvq = new vq(localzq);
        zq.a(this.r, localvq);
        this.q.notifyDataSetChanged();
      }
      if (!DialogToastListActivity.f);
    }
    else if (paramString.equals(this.i))
    {
      this.C.setVisibility(8);
      this.t.j();
      b();
    }
  }

  public void a(String paramString, ArrayList<zq> paramArrayList)
  {
    int i1 = 0;
    boolean bool = DialogToastListActivity.f;
    String str1 = App.Mb.getString(2131296258);
    String str2 = App.Mb.getSharedPreferences(str1, 0).getString(N[15] + paramString, "");
    g5.b(N[13] + paramString + N[12] + str2 + "]");
    this.s.clear();
    if (str2.length() > 0)
    {
      String[] arrayOfString = str2.split(",");
      int i2 = arrayOfString.length;
      do
      {
        if (i1 >= i2)
          break;
        String str3 = arrayOfString[i1];
        g5.b(N[14] + str3);
        zq localzq = App.w.a(str3, null);
        paramArrayList.add(localzq);
        this.s.put(str3, localzq);
        i1++;
      }
      while (!bool);
    }
    Collections.sort(paramArrayList, new du());
  }

  public void b()
  {
    boolean bool = DialogToastListActivity.f;
    this.C.setVisibility(8);
    if (!App.o())
    {
      this.x.setVisibility(8);
      this.y.setVisibility(8);
    }
    while (true)
    {
      return;
      if (hz.a(this.t.b))
      {
        this.C.setVisibility(0);
        this.x.setVisibility(4);
        this.y.setVisibility(4);
        if (!bool);
      }
      else
      {
        Bitmap localBitmap = this.t.a((int)App.Mb.getResources().getDimension(2131361808), j4.a(App.Mb.getApplicationContext()).L, false);
        this.x.setBackgroundDrawable(null);
        int i1 = (int)j4.a(this).K;
        this.x.setPadding(i1, i1, i1, i1);
        if (localBitmap == null)
        {
          this.y.setVisibility(0);
          this.x.setVisibility(4);
          if (!bool);
        }
        else
        {
          this.y.setVisibility(4);
          this.x.setVisibility(0);
          this.x.setImageDrawable(new p(getResources(), localBitmap, this.h, null));
          this.x.getDrawable().setDither(true);
          this.x.getDrawable().setFilterBitmap(true);
        }
      }
    }
  }

  public void b(String paramString)
  {
  }

  public void k()
  {
    new n9(this.L).start();
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    boolean bool = DialogToastListActivity.f;
    switch (paramInt1)
    {
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    default:
    case 10:
    case 11:
    case 1:
    case 12:
    case 13:
    case 14:
    }
    while (true)
    {
      return;
      if (paramInt2 == -1)
      {
        if ((paramIntent != null) && (paramIntent.getData() != null))
        {
          App.w.a(paramIntent.getData(), K);
          if (!bool);
        }
        else
        {
          App.w.b(K);
        }
        i();
        Conversation.e(K.b);
        if (!bool);
      }
      else
      {
        g5.b(N[19]);
      }
      g.a(false);
      if (bool)
      {
        if (paramInt2 == -1)
        {
          App.w.b(K);
          i();
          Conversation.e(K.b);
          if (!bool);
        }
        else
        {
          g5.b(N[17]);
        }
        g.a(false);
        if ((bool) && (paramInt2 == -1))
        {
          f(paramIntent.getStringExtra(N[18]));
          if ((bool) && (paramInt2 == -1))
            if ((paramIntent != null) && (paramIntent.getBooleanExtra(N[16], false)))
            {
              this.C.setVisibility(0);
              this.x.setVisibility(4);
              this.y.setVisibility(4);
              iz.b(this.t, this);
              if (!bool);
            }
            else
            {
              iz.a(paramIntent, this.t, this, 13, this);
              if (bool)
              {
                iz.a().delete();
                if (paramInt2 == -1)
                {
                  if (iz.a(this.t, this))
                  {
                    this.C.setVisibility(0);
                    this.x.setVisibility(4);
                    this.y.setVisibility(4);
                    if (!bool);
                  }
                }
                else if ((paramInt2 == 0) && (paramIntent != null))
                {
                  iz.a(paramIntent, this);
                  if (bool)
                    b();
                }
              }
            }
        }
      }
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
  }

  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    this.E = ((zq)((AdapterView.AdapterContextMenuInfo)paramMenuItem.getMenuInfo()).targetView.getTag());
    a(this.E, paramMenuItem.getItemId());
    return true;
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool1 = DialogToastListActivity.f;
    super.onCreate(paramBundle);
    setContentView(2130903096);
    eu.d = false;
    this.i = getIntent().getStringExtra(N[10]);
    this.t = App.w.a(this.i, null);
    if (this.g == -1)
      this.g = (int)getResources().getDimension(2131361796);
    if (this.h == -1.0F)
      this.h = j4.a(this).L;
    this.s.clear();
    this.u = ((gu)eu.e.get(this.i));
    Iterator localIterator = eu.i(this.i).values().iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      String str = (String)localIterator.next();
      if ((str.length() > 0) && (!str.contains(App.c())))
      {
        zq localzq = App.w.a(str, null);
        if (!this.r.contains(localzq))
          this.r.add(localzq);
      }
    }
    while (!bool1);
    Collections.sort(this.r, new du());
    a(this.i, this.r);
    this.D = getListView();
    this.q = new ie(this, this, 2130903116, this.r);
    LayoutInflater localLayoutInflater = (LayoutInflater)getBaseContext().getSystemService(N[11]);
    this.z = localLayoutInflater.inflate(2130903097, this.D, false);
    this.A = localLayoutInflater.inflate(2130903098, this.D, false);
    this.D.addFooterView(this.z);
    this.D.addHeaderView(this.A);
    this.D.setDividerHeight(0);
    this.D.setOnItemClickListener(new vt(this));
    this.A.setClickable(false);
    this.A.setFocusable(false);
    if (this.t.q().startsWith(App.c()))
    {
      findViewById(2131558461).setVisibility(0);
      findViewById(2131558676).setVisibility(0);
      findViewById(2131558676).setOnClickListener(new wt(this));
    }
    this.n = ((TextView)this.A.findViewById(2131558680));
    if ((this.t.b().contains(this.t.b.substring(0, this.t.b.indexOf("@")))) || (this.t.j == null) || (this.t.j.length() == 0))
    {
      App.l(this.i);
      if (!bool1);
    }
    else
    {
      a(this.t);
    }
    this.z.findViewById(2131558677).setOnClickListener(new yt(this));
    this.A.findViewById(2131558683).setOnClickListener(new zt(this));
    this.A.findViewById(2131558685).setOnClickListener(new au(this));
    this.x = ((ImageButton)this.A.findViewById(2131558678));
    this.y = ((Button)this.A.findViewById(2131558679));
    bu localbu = new bu(this);
    this.x.setOnClickListener(localbu);
    this.y.setOnClickListener(localbu);
    this.C = this.A.findViewById(2131558566);
    b();
    this.D.setAdapter(this.q);
    registerForContextMenu(this.D);
    this.v = ((ViewGroup)this.A.findViewById(2131558512));
    this.j = ((TextView)this.A.findViewById(2131558667));
    h();
    this.w = ((ImageButton)this.A.findViewById(2131558682));
    this.B = this.A.findViewById(2131558681);
    this.w.setOnClickListener(this.J);
    this.k = ((TextView)this.A.findViewById(2131558689));
    TextView localTextView = this.k;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.r.size());
    arrayOfObject[1] = Integer.valueOf(eu.b);
    localTextView.setText(getString(2131296923, arrayOfObject));
    this.k.setOnTouchListener(this.I);
    m5.b(this.i);
    App.z.a(this.M);
    App.a(this);
    if (App.wc != 0)
      if (!bool1)
        break label892;
    label892: for (boolean bool2 = false; ; bool2 = true)
    {
      DialogToastListActivity.f = bool2;
      return;
    }
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    zq localzq = (zq)((AdapterView.AdapterContextMenuInfo)paramContextMenuInfo).targetView.getTag();
    if (localzq == null);
    while (true)
    {
      return;
      if (!this.s.containsKey(localzq.b))
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localzq.d();
        paramContextMenu.add(0, 1, 0, getString(2131296924, arrayOfObject1));
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = localzq.d();
        paramContextMenu.add(0, 4, 0, getString(2131296926, arrayOfObject2));
        if (localzq.g == null)
        {
          paramContextMenu.add(0, 2, 0, getString(2131296810));
          paramContextMenu.add(0, 3, 0, getString(2131296811));
          if (!DialogToastListActivity.f);
        }
        else
        {
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = localzq.d();
          paramContextMenu.add(0, 0, 0, getString(2131296495, arrayOfObject3));
        }
        if (this.t.q().startsWith(App.c()))
        {
          Object[] arrayOfObject4 = new Object[1];
          arrayOfObject4[0] = localzq.d();
          paramContextMenu.add(0, 5, 0, getString(2131296927, arrayOfObject4));
        }
      }
    }
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    Object localObject1;
    switch (paramInt)
    {
    default:
      localObject1 = super.onCreateDialog(paramInt);
    case 0:
    case 5:
    case 1:
    case 50:
    case 2:
    case 6:
    case 4:
    case 3:
    }
    while (true)
    {
      return localObject1;
      localObject1 = new ProgressDialog(this);
      ((ProgressDialog)localObject1).setTitle(getString(2131296863));
      ((ProgressDialog)localObject1).setMessage(getString(2131296394));
      ((ProgressDialog)localObject1).setIndeterminate(true);
      ((ProgressDialog)localObject1).setCancelable(false);
      continue;
      localObject1 = new ProgressDialog(this);
      ((ProgressDialog)localObject1).setTitle(getString(2131296864));
      ((ProgressDialog)localObject1).setMessage(getString(2131296394));
      ((ProgressDialog)localObject1).setIndeterminate(true);
      ((ProgressDialog)localObject1).setCancelable(false);
      continue;
      localObject1 = new ProgressDialog(this);
      ((ProgressDialog)localObject1).setTitle(getString(2131296865));
      ((ProgressDialog)localObject1).setMessage(getString(2131296394));
      ((ProgressDialog)localObject1).setIndeterminate(true);
      ((ProgressDialog)localObject1).setCancelable(false);
      continue;
      nt localnt = new nt(this);
      localObject1 = new b(this, 2131296868, App.w.c(this.t.b).b(), localnt, eu.c, 2131296902, 2131296929);
      continue;
      Object[] arrayOfObject6 = new Object[1];
      arrayOfObject6[0] = this.t.b();
      Object localObject3 = getString(2131296472, arrayOfObject6);
      SpannableStringBuilder localSpannableStringBuilder2 = v4.a((String)localObject3, getBaseContext());
      AlertDialog.Builder localBuilder3 = new AlertDialog.Builder(this);
      if (localSpannableStringBuilder2 == null);
      while (true)
      {
        localObject1 = localBuilder3.setMessage((CharSequence)localObject3).setCancelable(true).setNegativeButton(2131296268, new pt(this)).setPositiveButton(2131296270, new ot(this)).create();
        break;
        localObject3 = localSpannableStringBuilder2;
      }
      if (this.E != null)
      {
        Object[] arrayOfObject5 = new Object[2];
        arrayOfObject5[0] = this.E.b();
        arrayOfObject5[1] = this.t.b();
        Object localObject2 = getString(2131296623, arrayOfObject5);
        SpannableStringBuilder localSpannableStringBuilder1 = v4.a((String)localObject2, getBaseContext());
        AlertDialog.Builder localBuilder2 = new AlertDialog.Builder(this);
        if (localSpannableStringBuilder1 == null);
        while (true)
        {
          localObject1 = localBuilder2.setMessage((CharSequence)localObject2).setCancelable(true).setNegativeButton(2131296268, new rt(this)).setPositiveButton(2131296270, new qt(this)).create();
          break;
          localObject2 = localSpannableStringBuilder1;
        }
      }
      localObject1 = super.onCreateDialog(paramInt);
      continue;
      g5.c(N[8]);
      localObject1 = new AlertDialog.Builder(this).setMessage(2131296533).setNeutralButton(2131296270, new st(this)).create();
      continue;
      if (this.E != null)
      {
        ArrayList localArrayList1 = new ArrayList();
        ArrayList localArrayList2 = new ArrayList();
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = this.E.d();
        localArrayList1.add(getString(2131296924, arrayOfObject1));
        localArrayList2.add(Integer.valueOf(1));
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = this.E.d();
        localArrayList1.add(getString(2131296926, arrayOfObject2));
        localArrayList2.add(Integer.valueOf(4));
        if (this.E.g != null)
        {
          Object[] arrayOfObject4 = new Object[1];
          arrayOfObject4[0] = this.E.d();
          localArrayList1.add(getString(2131296495, arrayOfObject4));
          localArrayList2.add(Integer.valueOf(0));
          if (!DialogToastListActivity.f);
        }
        else
        {
          localArrayList1.add(getString(2131296810));
          localArrayList2.add(Integer.valueOf(2));
          localArrayList1.add(getString(2131296811));
          localArrayList2.add(Integer.valueOf(3));
        }
        if (this.t.q().startsWith(App.c()))
        {
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = this.E.d();
          localArrayList1.add(getString(2131296927, arrayOfObject3));
          localArrayList2.add(Integer.valueOf(5));
        }
        String[] arrayOfString = new String[localArrayList1.size()];
        localArrayList1.toArray(arrayOfString);
        AlertDialog.Builder localBuilder1 = new AlertDialog.Builder(this);
        localBuilder1.setItems(arrayOfString, new tt(this, localArrayList2));
        localObject1 = localBuilder1.create();
        ((AlertDialog)localObject1).setOnCancelListener(new ut(this));
        ((AlertDialog)localObject1).requestWindowFeature(1);
      }
      else
      {
        localObject1 = super.onCreateDialog(paramInt);
      }
    }
  }

  public void onDestroy()
  {
    g5.b(N[9]);
    super.onDestroy();
    App.z.b(this.M);
    App.b(this);
    m5.c(this.i);
  }

  public void onStart()
  {
    super.onStart();
    F = this;
  }

  public void onStop()
  {
    super.onStop();
    F = null;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.GroupChatInfo
 * JD-Core Version:    0.6.1
 */