package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextWatcher;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import java.util.ArrayList;
import wb;

public class BroadcastMessageComposer extends DialogToastListActivity
{
  private static final String[] F;
  static boolean j;
  static sz k;
  static ArrayList<sz> l;
  private static int w;
  private static float x;
  private final View.OnClickListener A = new ti(this);
  final TextWatcher B = new aj(this);
  String C = null;
  bj D = new bj(this);
  View.OnClickListener E = new si(this);
  private ArrayList<zq> g = new ArrayList();
  final InputMethodManager h = (InputMethodManager)App.Mb.getSystemService(F[5]);
  EditText i;
  ImageButton m;
  Button n;
  Button o;
  boolean p;
  private ViewFlipper q;
  View r;
  int s;
  private le[] t = new le[v4.d.length];
  ViewGroup u;
  de v;
  private float y;
  private Handler z = new uc(this);

  static
  {
    String[] arrayOfString = new String[6];
    char[] arrayOfChar1 = "Im\007E\025Z?\nC[Nw\021[[yV?`4z@)m)v@-i)kV=i$xG.e)|K7c5\021?\034Y\017\035r\033_\b\\x\033\f\013\\m\037A\036Iz\f\f\022N?\020Y\027Q>".toCharArray();
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
    if (i1 <= i2)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "Jv\020H\024J".toCharArray();
      int i5 = arrayOfChar2.length;
      i6 = 0;
      if (i5 <= i6)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "Wv\032_".toCharArray();
        int i9 = arrayOfChar3.length;
        i10 = 0;
        if (i9 > i10)
          break label421;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "_m\021M\037^~\rX6Xl\rM\034X\\\021A\013Rl\033^TYz\rX\tRf".toCharArray();
        int i13 = arrayOfChar4.length;
        i14 = 0;
        if (i13 > i14)
          break label513;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "Rp\023".toCharArray();
        int i17 = arrayOfChar5.length;
        i18 = 0;
        if (i17 > i18)
          break label605;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "Tq\016Y\017br\033X\023R{".toCharArray();
        int i21 = arrayOfChar6.length;
        i22 = 0;
        if (i21 > i22)
          break label697;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        F = arrayOfString;
        l = new ArrayList();
        w = -1;
        x = -1.0F;
      }
    }
    else
    {
      int i3 = arrayOfChar1[i2];
      int i4;
      switch (i2 % 5)
      {
      default:
        i4 = 123;
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
        i4 = 61;
        continue;
        i4 = 31;
        continue;
        i4 = 126;
        continue;
        i4 = 44;
      }
    }
    int i7 = arrayOfChar2[i6];
    int i8;
    switch (i6 % 5)
    {
    default:
      i8 = 123;
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
      i8 = 61;
      continue;
      i8 = 31;
      continue;
      i8 = 126;
      continue;
      i8 = 44;
    }
    label421: int i11 = arrayOfChar3[i10];
    int i12;
    switch (i10 % 5)
    {
    default:
      i12 = 123;
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
      i12 = 61;
      continue;
      i12 = 31;
      continue;
      i12 = 126;
      continue;
      i12 = 44;
    }
    label513: int i15 = arrayOfChar4[i14];
    int i16;
    switch (i14 % 5)
    {
    default:
      i16 = 123;
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
      i16 = 61;
      continue;
      i16 = 31;
      continue;
      i16 = 126;
      continue;
      i16 = 44;
    }
    label605: int i19 = arrayOfChar5[i18];
    int i20;
    switch (i18 % 5)
    {
    default:
      i20 = 123;
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
      i20 = 61;
      continue;
      i20 = 31;
      continue;
      i20 = 126;
      continue;
      i20 = 44;
    }
    label697: int i23 = arrayOfChar6[i22];
    int i24;
    switch (i22 % 5)
    {
    default:
      i24 = 123;
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
      i24 = 61;
      continue;
      i24 = 31;
      continue;
      i24 = 126;
      continue;
      i24 = 44;
    }
  }

  static sz a(BroadcastMessageComposer paramBroadcastMessageComposer, zq paramzq)
  {
    return paramBroadcastMessageComposer.a(paramzq);
  }

  private sz a(zq paramzq)
  {
    sz localsz = new sz(paramzq.b, (byte[])null, k.t);
    localsz.l = k.l;
    localsz.h = k.h;
    localsz.a(k.c());
    localsz.p = k.p;
    localsz.m = k.m;
    localsz.j = k.j;
    localsz.p = k.p;
    localsz.k = k.k;
    localsz.a = k.a;
    localsz.q = k.q;
    localsz.r = k.r;
    return localsz;
  }

  private void a()
  {
    this.h.hideSoftInputFromWindow(this.i.getWindowToken(), 0);
  }

  static void a(BroadcastMessageComposer paramBroadcastMessageComposer)
  {
    paramBroadcastMessageComposer.c();
  }

  static void a(BroadcastMessageComposer paramBroadcastMessageComposer, boolean paramBoolean, Long paramLong)
  {
    paramBroadcastMessageComposer.a(paramBoolean, paramLong);
  }

  private void a(String paramString)
  {
    boolean bool = DialogToastListActivity.f;
    String[] arrayOfString = paramString.split(",");
    int i1 = arrayOfString.length;
    int i2 = 0;
    do
    {
      if (i2 >= i1)
        break;
      String str = arrayOfString[i2];
      zq localzq = App.w.a(str, null);
      this.g.add(localzq);
      i2++;
    }
    while (!bool);
  }

  private void a(boolean paramBoolean)
  {
    int i1 = 1;
    Button localButton1;
    if (paramBoolean)
    {
      findViewById(2131558486).setVisibility(0);
      findViewById(2131558485).setEnabled(i1);
      if (getResources().getConfiguration().orientation != i1)
      {
        this.n.setVisibility(0);
        Button localButton2 = this.n;
        if (this.i.length() <= 0)
          break label204;
        int i3 = i1;
        localButton2.setEnabled(i3);
        this.o.setVisibility(8);
        ((LinearLayout)findViewById(2131558490)).setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0F));
        if (!DialogToastListActivity.f);
      }
    }
    else
    {
      findViewById(2131558486).setVisibility(8);
      if (getResources().getConfiguration().orientation != i1)
      {
        this.n.setVisibility(0);
        localButton1 = this.n;
        if (this.i.length() <= 0)
          break label210;
      }
    }
    while (true)
    {
      localButton1.setEnabled(i1);
      this.o.setVisibility(8);
      ((LinearLayout)findViewById(2131558490)).setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0F));
      k = null;
      return;
      label204: int i4 = 0;
      break;
      label210: int i2 = 0;
    }
  }

  private void a(boolean paramBoolean, Long paramLong)
  {
    boolean bool = DialogToastListActivity.f;
    TextView localTextView;
    if (!paramBoolean)
    {
      findViewById(2131558492).setVisibility(8);
      findViewById(2131558493).setVisibility(0);
      localTextView = (TextView)findViewById(2131558491);
      localTextView.setVisibility(0);
      if (paramLong == null)
        break label266;
    }
    label266: for (String str = Formatter.formatShortFileSize(this, paramLong.longValue()); ; str = "")
    {
      localTextView.setText(str);
      if (getResources().getConfiguration().orientation != 1)
      {
        this.n.setVisibility(8);
        this.o.setVisibility(0);
        this.o.setEnabled(true);
        ((LinearLayout)findViewById(2131558490)).setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 0.0F));
        findViewById(2131558494).setVisibility(0);
        EditText localEditText = (EditText)findViewById(2131558484);
        localEditText.setMinLines(1);
        localEditText.setMaxLines(2);
        if (!bool);
      }
      else
      {
        findViewById(2131558485).setEnabled(true);
      }
      j = false;
      if (bool)
      {
        findViewById(2131558492).setVisibility(0);
        findViewById(2131558488).setVisibility(0);
        findViewById(2131558493).setVisibility(8);
        findViewById(2131558491).setVisibility(8);
        findViewById(2131558494).setVisibility(8);
        j = true;
      }
      findViewById(2131558489).setVisibility(8);
      return;
    }
  }

  static boolean a(BroadcastMessageComposer paramBroadcastMessageComposer, boolean paramBoolean)
  {
    return paramBroadcastMessageComposer.b(paramBoolean);
  }

  private void b()
  {
    if (!this.h.isFullscreenMode())
      this.h.toggleSoftInput(2, 0);
  }

  static void b(BroadcastMessageComposer paramBroadcastMessageComposer)
  {
    paramBroadcastMessageComposer.a();
  }

  private boolean b(boolean paramBoolean)
  {
    this.C = eg.a(this, paramBoolean);
    if (this.C != null)
      showDialog(3);
    if (this.C != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  static Handler c(BroadcastMessageComposer paramBroadcastMessageComposer)
  {
    return paramBroadcastMessageComposer.z;
  }

  private void c()
  {
    j = false;
    a(false);
    k = null;
  }

  private void d()
  {
    EditText localEditText = (EditText)findViewById(2131558484);
    if (getResources().getConfiguration().orientation == 1)
    {
      localEditText.setMinLines(3);
      localEditText.setMaxLines(5);
      if (this.o.getVisibility() == 0)
      {
        this.n.setEnabled(true);
        this.o.setVisibility(8);
        ((LinearLayout)findViewById(2131558490)).setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0F));
      }
      this.n.setVisibility(0);
      findViewById(2131558494).setVisibility(8);
      if (!DialogToastListActivity.f);
    }
    else
    {
      localEditText.setMinLines(1);
      localEditText.setMaxLines(2);
      if ((findViewById(2131558486).getVisibility() == 0) && (!j))
      {
        this.o.setVisibility(0);
        this.o.setEnabled(this.n.isEnabled());
        ((LinearLayout)findViewById(2131558490)).setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 0.0F));
        this.n.setVisibility(8);
        findViewById(2131558494).setVisibility(0);
      }
    }
  }

  static void d(BroadcastMessageComposer paramBroadcastMessageComposer)
  {
    paramBroadcastMessageComposer.b();
  }

  static int e()
  {
    return w;
  }

  static ArrayList e(BroadcastMessageComposer paramBroadcastMessageComposer)
  {
    return paramBroadcastMessageComposer.g;
  }

  static float f()
  {
    return x;
  }

  static float f(BroadcastMessageComposer paramBroadcastMessageComposer)
  {
    return paramBroadcastMessageComposer.y;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    boolean bool = DialogToastListActivity.f;
    if ((paramInt2 == 0) || (k == null))
      if ((paramIntent != null) && (paramIntent.getBooleanExtra(F[4], false)))
        App.a(this, App.Mb.getString(2131296980));
    ImageView localImageView;
    ViewGroup.LayoutParams localLayoutParams;
    while (true)
    {
      return;
      a(true);
      if (k.l != 4)
      {
        findViewById(2131558485).setEnabled(false);
        a(true, null);
        if (!bool);
      }
      else
      {
        findViewById(2131558489).setVisibility(0);
        findViewById(2131558491).setVisibility(8);
        findViewById(2131558488).setVisibility(8);
        if (getResources().getConfiguration().orientation != 1)
        {
          this.o.setVisibility(0);
          this.o.setEnabled(true);
          ((LinearLayout)findViewById(2131558490)).setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 0.0F));
          this.n.setVisibility(8);
          findViewById(2131558494).setVisibility(0);
        }
      }
      localImageView = (ImageView)findViewById(2131558488);
      localLayoutParams = localImageView.getLayoutParams();
      if (this.y < 1.0F)
      {
        localLayoutParams.width = -2;
        localLayoutParams.height = -2;
        localImageView.setLayoutParams(localLayoutParams);
      }
      switch (k.l)
      {
      default:
      case 1:
      case 5:
      case 4:
      case 2:
      case 3:
      }
    }
    label283: if (k.h == 0);
    for (byte[] arrayOfByte = wb.a(k.b()); ; arrayOfByte = k.c())
    {
      Bitmap localBitmap = BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length);
      if ((this.y < 1.0F) && (localBitmap.getHeight() >= 60))
      {
        localLayoutParams.width = 60;
        localLayoutParams.height = 60;
        localImageView.setLayoutParams(localLayoutParams);
      }
      ((ImageView)findViewById(2131558488)).setImageBitmap(localBitmap);
      new pb(k, false, this.D).a();
      if (!bool)
        break;
      ((ImageView)findViewById(2131558488)).setImageDrawable(getResources().getDrawable(2130837516));
      new mb(this, k, this.D).execute(new Void[0]);
      if (!bool)
        break;
      ((Button)findViewById(2131558489)).setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(2130838556), null, null, null);
      ((Button)findViewById(2131558489)).setText(k.p);
      j = false;
      break;
      localImageView.setImageDrawable(getResources().getDrawable(2130837518));
      new pb(k, false, this.D).a();
      if (!bool)
        break;
      ((ImageView)findViewById(2131558488)).setImageDrawable(getResources().getDrawable(2130837517));
      new pb(k, false, this.D).a();
      if (!bool)
        break;
      break label283;
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    boolean bool = DialogToastListActivity.f;
    super.onConfigurationChanged(paramConfiguration);
    this.s = (int)((getWindowManager().getDefaultDisplay().getWidth() - getResources().getDimension(2131361843)) / j4.a(this).t);
    int i1 = 0;
    do
    {
      if (i1 >= this.t.length)
        break;
      this.t[i1].notifyDataSetChanged();
      i1++;
    }
    while (!bool);
    d();
  }

  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    zq localzq = (zq)((AdapterView.AdapterContextMenuInfo)paramMenuItem.getMenuInfo()).targetView.getTag();
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    }
    while (true)
    {
      return true;
      if (this.g.size() > 1)
      {
        this.g.remove(localzq);
        this.v.notifyDataSetChanged();
        if (!DialogToastListActivity.f);
      }
      else
      {
        finish();
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool = DialogToastListActivity.f;
    super.onCreate(paramBundle);
    setContentView(2130903048);
    k = null;
    this.u = ((ViewGroup)findViewById(2131558478));
    String str = getIntent().getStringExtra(F[2]);
    if (str != null)
      a(str);
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)getSystemService(F[1])).getDefaultDisplay().getMetrics(localDisplayMetrics);
    this.y = localDisplayMetrics.density;
    this.n = ((Button)findViewById(2131558485));
    this.n.setOnClickListener(this.A);
    this.o = ((Button)findViewById(2131558495));
    this.o.setOnClickListener(this.A);
    d();
    findViewById(2131558493).setOnClickListener(new ui(this));
    findViewById(2131558466).setOnClickListener(new vi(this));
    this.i = ((EditText)findViewById(2131558484));
    this.i.addTextChangedListener(this.B);
    this.i.setGravity(TextEmojiLabel.a(this.i.getText().toString()));
    if (j4.a(this).a())
    {
      this.i.setMaxLines(3);
      this.i.setMinLines(3);
    }
    this.i.setOnClickListener(new wi(this));
    this.i.setOnEditorActionListener(new xi(this));
    this.m = ((ImageButton)findViewById(2131558470));
    this.r = findViewById(2131558472);
    this.m.setOnClickListener(new yi(this));
    this.m.setLongClickable(true);
    this.m.setHapticFeedbackEnabled(true);
    this.m.setOnLongClickListener(new zi(this));
    this.s = (int)((getWindowManager().getDefaultDisplay().getWidth() - getResources().getDimension(2131361843)) / j4.a(this).t);
    this.q = ((ViewFlipper)findViewById(2131558473));
    int i2;
    for (int i1 = 0; ; i1 = i2)
      if (i1 < v4.d.length)
      {
        ListView localListView2 = (ListView)findViewById(v4.d[i1]);
        this.t[i1] = new le(this, this, i1);
        localListView2.setAdapter(this.t[i1]);
        localListView2.setClickable(false);
        localListView2.setDividerHeight(0);
        i2 = i1 + 1;
        if (!bool);
      }
      else
      {
        this.q.setDisplayedChild(v4.b);
        v4.a(findViewById(2131558479), findViewById(2131558481), findViewById(2131558482), findViewById(2131558483), this.q, this.u);
        v4.a(this.u, v4.b);
        if (w == -1)
          w = (int)getResources().getDimension(2131361796);
        if (x == -1.0F)
          x = j4.a(this).L;
        ListView localListView1 = getListView();
        this.v = new de(this, this, 2130903116, this.g);
        localListView1.setAdapter(this.v);
        localListView1.setDividerHeight(0);
        localListView1.setSelector(2130838546);
        localListView1.setScrollbarFadingEnabled(true);
        registerForContextMenu(localListView1);
        this.i.requestFocus();
        return;
      }
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    if ((zq)((AdapterView.AdapterContextMenuInfo)paramContextMenuInfo).targetView.getTag() == null);
    while (true)
    {
      return;
      if (this.g.size() == 1)
      {
        paramContextMenu.add(0, 0, 0, 2131296849);
        if (!DialogToastListActivity.f);
      }
      else
      {
        paramContextMenu.add(0, 0, 0, 2131296848);
      }
    }
  }

  public Dialog onCreateDialog(int paramInt)
  {
    Object localObject = null;
    switch (paramInt)
    {
    default:
      localObject = super.onCreateDialog(paramInt);
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return localObject;
      localObject = new ProgressDialog(this);
      ((ProgressDialog)localObject).setTitle(getString(2131296845));
      ((ProgressDialog)localObject).setMessage(getString(2131296394));
      ((ProgressDialog)localObject).setIndeterminate(true);
      ((ProgressDialog)localObject).setCancelable(false);
      continue;
      pi localpi = new pi(this);
      localObject = new AlertDialog.Builder(this).setTitle(2131296526).setMessage(2131296527).setPositiveButton(2131296270, localpi).create();
      continue;
      if (this.C != null)
      {
        qi localqi = new qi(this);
        ri localri = new ri(this);
        localObject = new AlertDialog.Builder(this).setMessage(this.C).setCancelable(false).setPositiveButton(2131296272, localqi).setNegativeButton(2131296273, null).create();
        ((Dialog)localObject).setOnDismissListener(localri);
      }
      else
      {
        g5.c(F[0]);
      }
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    g5.b(F[3]);
    j = false;
    k = null;
    this.D.a(true);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (((paramInt == 82) || (paramInt == 4)) && (this.r.getVisibility() == 0))
      this.r.setVisibility(8);
    while (true)
    {
      return false;
      if (paramInt == 4)
      {
        j = false;
        super.onBackPressed();
      }
    }
  }

  public void onPause()
  {
    super.onPause();
    k = null;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.BroadcastMessageComposer
 * JD-Core Version:    0.6.1
 */