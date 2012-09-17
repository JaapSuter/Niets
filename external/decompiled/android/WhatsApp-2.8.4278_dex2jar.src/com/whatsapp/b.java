package com.whatsapp;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LayoutAnimationController;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class b extends Dialog
{
  public static String b;
  private static final String[] z;
  final InputMethodManager a = (InputMethodManager)App.Mb.getSystemService(z[0]);
  private boolean c = true;
  Activity d;
  Context e;
  TextView f;
  private ms g;
  private int h;
  ImageButton i;
  private ViewFlipper j;
  boolean k;
  ViewGroup l;
  ViewGroup m;
  View n;
  int o;
  private pe[] p = new pe[v4.d.length];
  EditText q;
  int r = 0;
  int s;
  int t;
  String u = "";
  final TextWatcher v = new hs(this);
  View.OnClickListener w = new js(this);

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "L|f\034Rzs\035NJv".toCharArray();
    int i1 = arrayOfChar1.length;
    int i2 = 0;
    char[] arrayOfChar2;
    int i6;
    if (i1 <= i2)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "@v\035uQ`\007A\037".toCharArray();
      int i5 = arrayOfChar2.length;
      i6 = 0;
      if (i5 <= i6)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
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
        i4 = 37;
        continue;
        i4 = 18;
        continue;
        i4 = 22;
        continue;
        i4 = 105;
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
      i8 = 37;
      continue;
      i8 = 18;
      continue;
      i8 = 22;
      continue;
      i8 = 105;
    }
  }

  public b(Activity paramActivity, int paramInt1, String paramString, ms paramms, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramActivity);
    this.d = paramActivity;
    this.e = paramActivity.getBaseContext();
    this.g = paramms;
    this.h = paramInt1;
    this.r = paramInt2;
    this.s = paramInt3;
    this.t = paramInt4;
    this.u = paramString;
  }

  private void a()
  {
    ((InputMethodManager)this.d.getSystemService(z[0])).hideSoftInputFromWindow(this.q.getWindowToken(), 0);
  }

  static void a(b paramb)
  {
    paramb.a();
  }

  static boolean a(b paramb, boolean paramBoolean)
  {
    paramb.c = paramBoolean;
    return paramBoolean;
  }

  static ms b(b paramb)
  {
    return paramb.g;
  }

  private void b()
  {
    if (!this.a.isFullscreenMode())
      this.a.toggleSoftInput(2, 0);
  }

  public void a(ViewGroup paramViewGroup, Context paramContext)
  {
    AnimationSet localAnimationSet = new AnimationSet(true);
    TranslateAnimation localTranslateAnimation = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, -1.0F, 1, 0.0F);
    localTranslateAnimation.setDuration(300L);
    localTranslateAnimation.setAnimationListener(new is(this));
    localAnimationSet.addAnimation(localTranslateAnimation);
    paramViewGroup.setLayoutAnimation(new LayoutAnimationController(localAnimationSet, 0.25F));
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool = DialogToastListActivity.f;
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(2130903091);
    ((TextView)findViewById(2131558453)).setText(this.h);
    setTitle(this.h);
    ((Button)findViewById(2131558592)).setOnClickListener(new ls(this, null));
    ((Button)findViewById(2131558591)).setOnClickListener(new es(this));
    this.f = ((TextView)findViewById(2131558659));
    if (this.r > 0)
    {
      this.q = ((EditText)findViewById(2131558658));
      this.f.setVisibility(0);
      InputFilter[] arrayOfInputFilter = new InputFilter[1];
      arrayOfInputFilter[0] = new InputFilter.LengthFilter(this.r);
      this.q.setFilters(arrayOfInputFilter);
      if (!bool);
    }
    else
    {
      this.q = ((EditText)findViewById(2131558657));
    }
    this.q.setVisibility(0);
    this.q.addTextChangedListener(this.v);
    this.q.setGravity(TextEmojiLabel.a(this.q.getText().toString()));
    WindowManager.LayoutParams localLayoutParams = getWindow().getAttributes();
    localLayoutParams.width = -1;
    localLayoutParams.gravity = 48;
    getWindow().setAttributes(localLayoutParams);
    this.i = ((ImageButton)findViewById(2131558470));
    this.l = ((ViewGroup)findViewById(2131558472));
    this.i.setOnClickListener(new fs(this));
    this.n = findViewById(2131558452);
    this.o = (int)((-40 + this.d.getWindowManager().getDefaultDisplay().getWidth() - this.e.getResources().getDimension(2131361843)) / j4.a(this.e).t);
    this.m = ((ViewGroup)findViewById(2131558478));
    this.j = ((ViewFlipper)findViewById(2131558473));
    int i2;
    for (int i1 = 0; ; i1 = i2)
      if (i1 < v4.d.length)
      {
        ListView localListView = (ListView)findViewById(v4.d[i1]);
        this.p[i1] = new pe(this, this.e, i1);
        localListView.setAdapter(this.p[i1]);
        localListView.setClickable(false);
        localListView.setSelector(2130838554);
        localListView.setDividerHeight(0);
        i2 = i1 + 1;
        if (!bool);
      }
      else
      {
        this.j.setDisplayedChild(v4.b);
        v4.a(findViewById(2131558479), findViewById(2131558481), findViewById(2131558482), findViewById(2131558483), this.j, this.m);
        v4.a(this.m, v4.b);
        setOnCancelListener(new gs(this));
        return;
      }
  }

  public void onStart()
  {
    super.onStart();
    b();
    if (b != null);
    for (String str = b; ; str = this.u)
    {
      Object localObject = v4.a(str, this.e);
      if (this.s != 0)
        this.q.setHint(this.s);
      EditText localEditText = this.q;
      if (localObject == null)
        localObject = str;
      localEditText.setText((CharSequence)localObject);
      if (str != null)
        this.q.selectAll();
      return;
    }
  }

  public void onStop()
  {
    super.onStop();
    if (this.c)
      b = this.q.getText().toString();
    g5.d(z[1] + b);
  }
}