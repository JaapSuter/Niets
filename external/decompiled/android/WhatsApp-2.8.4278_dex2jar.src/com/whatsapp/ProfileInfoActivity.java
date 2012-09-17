package com.whatsapp;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import java.io.File;

public class ProfileInfoActivity extends DialogToastActivity
  implements uk
{
  private static final String[] z;
  private TextView f;
  private ImageButton g;
  private Button h;
  private View i;
  private ImageButton j;
  private zq k;
  private Handler l;
  private Runnable m;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "\"!\035hG*+WsF7*\027n\006\",\rsG-a8N|\002\f1El\002\0338".toCharArray();
    int n = arrayOfChar1.length;
    int i1 = 0;
    char[] arrayOfChar2;
    int i5;
    char[] arrayOfChar3;
    int i9;
    char[] arrayOfChar4;
    int i13;
    if (n <= i1)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "3=\026|A/*\020tN,`\032hM\";\034".toCharArray();
      int i4 = arrayOfChar2.length;
      i5 = 0;
      if (i4 <= i5)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "3=\026|A/*\020tN,`\035[7=\026c".toCharArray();
        int i8 = arrayOfChar3.length;
        i9 = 0;
        if (i8 > i9)
          break label325;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "*<&hM0*\r".toCharArray();
        int i12 = arrayOfChar4.length;
        i13 = 0;
        if (i12 > i13)
          break label417;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int i2 = arrayOfChar1[i1];
      int i3;
      switch (i1 % 5)
      {
      default:
        i3 = 40;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[i1] = (char)(i3 ^ i2);
        i1++;
        break;
        i3 = 67;
        continue;
        i3 = 79;
        continue;
        i3 = 121;
        continue;
        i3 = 26;
      }
    }
    int i6 = arrayOfChar2[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 40;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i5] = (char)(i7 ^ i6);
      i5++;
      break;
      i7 = 67;
      continue;
      i7 = 79;
      continue;
      i7 = 121;
      continue;
      i7 = 26;
    }
    label325: int i10 = arrayOfChar3[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 40;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i9] = (char)(i11 ^ i10);
      i9++;
      break;
      i11 = 67;
      continue;
      i11 = 79;
      continue;
      i11 = 121;
      continue;
      i11 = 26;
    }
    label417: int i14 = arrayOfChar4[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 40;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i13] = (char)(i15 ^ i14);
      i13++;
      break;
      i15 = 67;
      continue;
      i15 = 79;
      continue;
      i15 = 121;
      continue;
      i15 = 26;
    }
  }

  static TextView a(ProfileInfoActivity paramProfileInfoActivity)
  {
    return paramProfileInfoActivity.f;
  }

  static zq b(ProfileInfoActivity paramProfileInfoActivity)
  {
    return paramProfileInfoActivity.k;
  }

  private void b()
  {
    boolean bool = DialogToastListActivity.f;
    this.i.setVisibility(8);
    if (!App.o())
    {
      this.g.setVisibility(8);
      this.h.setVisibility(8);
    }
    while (true)
    {
      return;
      if (hz.a(this.k.b))
      {
        this.i.setVisibility(0);
        this.g.setVisibility(4);
        this.h.setVisibility(4);
        if (!bool);
      }
      else
      {
        Bitmap localBitmap = this.k.a(getResources().getDimensionPixelSize(2131361805), 2.0F * j4.a(App.Mb.getApplicationContext()).L, false);
        this.g.setBackgroundDrawable(null);
        int n = (int)j4.a(this).K;
        this.g.setPadding(n, n, n, n);
        if (localBitmap == null)
        {
          if ((this.k.p == 0) && (this.k.o == 0))
          {
            this.i.setVisibility(0);
            this.h.setVisibility(4);
            if (this.l == null)
            {
              this.l = new Handler();
              this.m = new fz(this);
            }
            this.l.removeCallbacks(this.m);
            this.l.postDelayed(this.m, 30000L);
            if (!bool);
          }
          else
          {
            this.i.setVisibility(4);
            this.h.setVisibility(0);
          }
          this.g.setVisibility(4);
          this.j.setVisibility(4);
          if (!bool);
        }
        else
        {
          this.h.setVisibility(4);
          this.g.setVisibility(0);
          this.g.setImageDrawable(new p(getResources(), localBitmap, 2.0F * j4.a(this).L, null));
          this.g.getDrawable().setDither(true);
          this.g.getDrawable().setFilterBitmap(true);
          this.j.setVisibility(0);
        }
      }
    }
  }

  static View c(ProfileInfoActivity paramProfileInfoActivity)
  {
    return paramProfileInfoActivity.i;
  }

  static Button d(ProfileInfoActivity paramProfileInfoActivity)
  {
    return paramProfileInfoActivity.h;
  }

  static ImageButton e(ProfileInfoActivity paramProfileInfoActivity)
  {
    return paramProfileInfoActivity.g;
  }

  public void a()
  {
  }

  public void a(String paramString)
  {
    if (paramString.equals(this.k.b))
    {
      this.k = App.w.b();
      b();
    }
  }

  public void b(String paramString)
  {
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    boolean bool = DialogToastListActivity.f;
    switch (paramInt1)
    {
    default:
    case 12:
    case 13:
    }
    while (true)
    {
      return;
      if (paramInt2 == -1)
        if ((paramIntent != null) && (paramIntent.getBooleanExtra(z[3], false)))
        {
          this.i.setVisibility(0);
          this.g.setVisibility(4);
          this.h.setVisibility(4);
          iz.b(this.k, this);
          if (!bool);
        }
        else
        {
          iz.a(paramIntent, this.k, this, 13, this);
          if (bool)
          {
            iz.a().delete();
            if (paramInt2 == -1)
            {
              if (iz.a(this.k, this))
              {
                this.i.setVisibility(0);
                this.g.setVisibility(4);
                this.h.setVisibility(4);
                if (!bool);
              }
            }
            else if ((paramInt2 == 0) && (paramIntent != null))
              iz.a(paramIntent, this);
          }
        }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903119);
    g5.b(z[1]);
    this.k = App.w.b();
    this.f = ((TextView)findViewById(2131558746));
    Object localObject = App.b(this);
    SpannableStringBuilder localSpannableStringBuilder = v4.a((String)localObject, this);
    TextView localTextView = this.f;
    if (localSpannableStringBuilder == null);
    while (true)
    {
      localTextView.setText((CharSequence)localObject);
      findViewById(2131558748).setOnClickListener(new bz(this));
      this.g = ((ImageButton)findViewById(2131558678));
      this.h = ((Button)findViewById(2131558679));
      dz localdz = new dz(this);
      this.g.setOnClickListener(localdz);
      this.h.setOnClickListener(localdz);
      this.j = ((ImageButton)findViewById(2131558745));
      this.j.setOnClickListener(new ez(this));
      this.i = findViewById(2131558566);
      b();
      App.a(this);
      if (z[0].equals(getIntent().getAction()))
        iz.a(getIntent(), this.k, this, 13, this);
      return;
      localObject = localSpannableStringBuilder;
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    g5.b(z[2]);
    App.b(this);
    if (this.l != null)
      this.l.removeCallbacks(this.m);
  }
}