package com.whatsapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;

public class WebImagePicker extends DialogToastListActivity
{
  private static final String[] z;
  private q5 g;
  private TextView h;
  private ArrayList<w7> i = new ArrayList();
  private te j;
  private d8 k = new d8("");
  private int l = 4;
  private int m;
  private j4 n;
  private View.OnClickListener o;
  private Uri p;
  private gc q;
  private final File r = new File(App.Mb.getCacheDir(), z[4]);

  static
  {
    String[] arrayOfString = new String[10];
    char[] arrayOfChar1 = "N*+f!X(,|)X=*gcZ.'l)U\020 b-^*\026k#N!%`-]\020=n?R".toCharArray();
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
    if (i1 <= i2)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "N*+f!X(,|)X=*gcZ.'l)U\020-f-U .".toCharArray();
      int i5 = arrayOfChar2.length;
      i6 = 0;
      if (i5 <= i6)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "N*+f!X(,|)X=*gc]*:{>V6".toCharArray();
        int i9 = arrayOfChar3.length;
        i10 = 0;
        if (i9 > i10)
          break label553;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "P!9z8f\",{$V+".toCharArray();
        int i13 = arrayOfChar4.length;
        i14 = 0;
        if (i13 > i14)
          break label645;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "m'<b.J".toCharArray();
        int i17 = arrayOfChar5.length;
        i18 = 0;
        if (i17 > i18)
          break label737;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "V:=9M".toCharArray();
        int i21 = arrayOfChar6.length;
        i22 = 0;
        if (i21 > i22)
          break label829;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "H:,}5".toCharArray();
        int i25 = arrayOfChar7.length;
        i26 = 0;
        if (i25 > i26)
          break label921;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "T <a8\\+".toCharArray();
        int i29 = arrayOfChar8.length;
        i30 = 0;
        if (i29 > i30)
          break label1013;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "T <a8\\+\026}#".toCharArray();
        int i33 = arrayOfChar9.length;
        i34 = 0;
        if (i33 > i34)
          break label1105;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "N*+f!X(,|)X=*gcZ=,n8\\".toCharArray();
        int i37 = arrayOfChar10.length;
        i38 = 0;
        if (i37 > i38)
          break label1197;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int i3 = arrayOfChar1[i2];
      int i4;
      switch (i2 % 5)
      {
      default:
        i4 = 76;
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
        i4 = 57;
        continue;
        i4 = 79;
        continue;
        i4 = 73;
        continue;
        i4 = 15;
      }
    }
    int i7 = arrayOfChar2[i6];
    int i8;
    switch (i6 % 5)
    {
    default:
      i8 = 76;
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
      i8 = 57;
      continue;
      i8 = 79;
      continue;
      i8 = 73;
      continue;
      i8 = 15;
    }
    label553: int i11 = arrayOfChar3[i10];
    int i12;
    switch (i10 % 5)
    {
    default:
      i12 = 76;
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
      i12 = 57;
      continue;
      i12 = 79;
      continue;
      i12 = 73;
      continue;
      i12 = 15;
    }
    label645: int i15 = arrayOfChar4[i14];
    int i16;
    switch (i14 % 5)
    {
    default:
      i16 = 76;
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
      i16 = 57;
      continue;
      i16 = 79;
      continue;
      i16 = 73;
      continue;
      i16 = 15;
    }
    label737: int i19 = arrayOfChar5[i18];
    int i20;
    switch (i18 % 5)
    {
    default:
      i20 = 76;
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
      i20 = 57;
      continue;
      i20 = 79;
      continue;
      i20 = 73;
      continue;
      i20 = 15;
    }
    label829: int i23 = arrayOfChar6[i22];
    int i24;
    switch (i22 % 5)
    {
    default:
      i24 = 76;
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
      i24 = 57;
      continue;
      i24 = 79;
      continue;
      i24 = 73;
      continue;
      i24 = 15;
    }
    label921: int i27 = arrayOfChar7[i26];
    int i28;
    switch (i26 % 5)
    {
    default:
      i28 = 76;
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
      i28 = 57;
      continue;
      i28 = 79;
      continue;
      i28 = 73;
      continue;
      i28 = 15;
    }
    label1013: int i31 = arrayOfChar8[i30];
    int i32;
    switch (i30 % 5)
    {
    default:
      i32 = 76;
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
      i32 = 57;
      continue;
      i32 = 79;
      continue;
      i32 = 73;
      continue;
      i32 = 15;
    }
    label1105: int i35 = arrayOfChar9[i34];
    int i36;
    switch (i34 % 5)
    {
    default:
      i36 = 76;
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
      i36 = 57;
      continue;
      i36 = 79;
      continue;
      i36 = 73;
      continue;
      i36 = 15;
    }
    label1197: int i39 = arrayOfChar10[i38];
    int i40;
    switch (i38 % 5)
    {
    default:
      i40 = 76;
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
      i40 = 57;
      continue;
      i40 = 79;
      continue;
      i40 = 73;
      continue;
      i40 = 15;
    }
  }

  static Uri a(WebImagePicker paramWebImagePicker)
  {
    return paramWebImagePicker.p;
  }

  static d8 a(WebImagePicker paramWebImagePicker, d8 paramd8)
  {
    paramWebImagePicker.k = paramd8;
    return paramd8;
  }

  static gc a(WebImagePicker paramWebImagePicker, gc paramgc)
  {
    paramWebImagePicker.q = paramgc;
    return paramgc;
  }

  static q5 a(WebImagePicker paramWebImagePicker, q5 paramq5)
  {
    paramWebImagePicker.g = paramq5;
    return paramq5;
  }

  private void a()
  {
    String str = this.h.getText().toString();
    if ("".equals(str))
    {
      Toast.makeText(getApplicationContext(), getString(2131296651), 0).show();
      if (!DialogToastListActivity.f);
    }
    else
    {
      ((InputMethodManager)App.Mb.getSystemService(z[3])).hideSoftInputFromWindow(this.h.getWindowToken(), 0);
      te.a(this.j, str);
    }
  }

  static void a(WebImagePicker paramWebImagePicker, w7 paramw7)
  {
    paramWebImagePicker.a(paramw7);
  }

  private void a(w7 paramw7)
  {
    if (this.q != null)
      this.q.cancel(true);
    this.q = new gc(this, paramw7);
    this.q.execute(new Void[0]);
  }

  static ArrayList b(WebImagePicker paramWebImagePicker)
  {
    return paramWebImagePicker.i;
  }

  private void b()
  {
    this.m = (this.n.Y + 2 * this.n.Z + (int)this.n.ab);
    Display localDisplay = getWindowManager().getDefaultDisplay();
    this.l = (localDisplay.getWidth() / this.m);
    this.m = (localDisplay.getWidth() / this.l - (int)this.n.ab);
    this.g.a();
    this.g = new q5(2130838462, 2130838520, this.m, this.r);
  }

  static void c(WebImagePicker paramWebImagePicker)
  {
    paramWebImagePicker.a();
  }

  static TextView d(WebImagePicker paramWebImagePicker)
  {
    return paramWebImagePicker.h;
  }

  static gc e(WebImagePicker paramWebImagePicker)
  {
    return paramWebImagePicker.q;
  }

  static int f(WebImagePicker paramWebImagePicker)
  {
    return paramWebImagePicker.l;
  }

  static j4 g(WebImagePicker paramWebImagePicker)
  {
    return paramWebImagePicker.n;
  }

  static int h(WebImagePicker paramWebImagePicker)
  {
    return paramWebImagePicker.m;
  }

  static View.OnClickListener i(WebImagePicker paramWebImagePicker)
  {
    return paramWebImagePicker.o;
  }

  static q5 j(WebImagePicker paramWebImagePicker)
  {
    return paramWebImagePicker.g;
  }

  static File k(WebImagePicker paramWebImagePicker)
  {
    return paramWebImagePicker.r;
  }

  static d8 l(WebImagePicker paramWebImagePicker)
  {
    return paramWebImagePicker.k;
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    b();
    this.j.notifyDataSetChanged();
  }

  public void onCreate(Bundle paramBundle)
  {
    g5.b(z[9]);
    super.onCreate(paramBundle);
    this.n = j4.a(this);
    this.r.mkdirs();
    this.g = new q5(2130838462, 2130838520, 72, this.r);
    d8.a();
    setContentView(2130903134);
    this.h = ((TextView)findViewById(2131558808));
    String str1 = getIntent().getStringExtra(z[6]);
    if (str1 != null);
    for (String str2 = v4.c(str1); ; str2 = str1)
    {
      this.h.setText(str2);
      Bundle localBundle = getIntent().getExtras();
      if (localBundle != null)
        this.p = ((Uri)localBundle.getParcelable(z[5]));
      ListView localListView = getListView();
      localListView.requestFocus();
      localListView.setClickable(false);
      localListView.setBackgroundDrawable(null);
      localListView.setDividerHeight(0);
      this.j = new te(this, this);
      setListAdapter(this.j);
      this.o = new x7(this);
      findViewById(2131558807).setOnClickListener(new y7(this));
      this.h.setOnEditorActionListener(new z7(this));
      ImageButton localImageButton = (ImageButton)findViewById(2131558529);
      localImageButton.setOnClickListener(new a8(this, localImageButton));
      b8 localb8 = new b8(this, localImageButton);
      this.h.addTextChangedListener(localb8);
      this.h.setGravity(TextEmojiLabel.a(this.h.getText().toString()));
      if ((str2 != null) && (str2.length() > 0))
      {
        localImageButton.setVisibility(0);
        if (!DialogToastListActivity.f);
      }
      else
      {
        localImageButton.setVisibility(8);
      }
      b();
      String str3 = Environment.getExternalStorageState();
      int i1;
      if ((!str3.equals(z[7])) && (!str3.equals(z[8])))
      {
        Context localContext = getApplicationContext();
        if (App.tb())
        {
          i1 = 2131296438;
          Toast.makeText(localContext, i1, 1).show();
          finish();
        }
      }
      while (true)
      {
        return;
        i1 = 2131296439;
        break;
        te.a(this.j, str2);
      }
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    g5.b(z[2]);
    this.i.clear();
    this.g.a();
    this.g.b();
    if (this.q != null)
    {
      this.q.cancel(true);
      g5.b(z[0]);
      if (gc.a(this.q) != null)
      {
        g5.b(z[1]);
        gc.a(this.q).dismiss();
        gc.a(this.q, null);
      }
      this.q = null;
    }
    te.a(this.j);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.WebImagePicker
 * JD-Core Version:    0.6.1
 */