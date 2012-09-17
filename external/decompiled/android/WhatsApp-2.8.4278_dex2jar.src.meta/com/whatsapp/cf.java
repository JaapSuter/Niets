package com.whatsapp;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import android.widget.TextView;

public class cf extends ze
{
  private static final String[] P;
  private MediaData F;
  private final TextView G = (TextView)findViewById(2131558607);
  private final View H = findViewById(2131558604);
  private final ImageButton I = (ImageButton)findViewById(2131558523);
  private final TextView J = (TextView)findViewById(2131558605);
  private final TextView K = (TextView)findViewById(2131558606);
  private final View L = findViewById(2131558609);
  private final View M = findViewById(2131558487);
  private boolean N = false;
  private int O;

  static
  {
    String[] arrayOfString = new String[6];
    char[] arrayOfChar1 = "\023~,\024".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "s\"f".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\0230mB/J7p\b".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label401;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\ro".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label493;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "G%9Zg��~ K-\\*E2H=(\004>@<bG<_\"r[`".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label585;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "\t\"!F`".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label677;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        P = arrayOfString;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 93;
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
        m = 47;
        continue;
        m = 81;
        continue;
        m = 77;
        continue;
        m = 42;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 93;
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
      i3 = 47;
      continue;
      i3 = 81;
      continue;
      i3 = 77;
      continue;
      i3 = 42;
    }
    label401: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 93;
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
      i7 = 47;
      continue;
      i7 = 81;
      continue;
      i7 = 77;
      continue;
      i7 = 42;
    }
    label493: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 93;
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
      i11 = 47;
      continue;
      i11 = 81;
      continue;
      i11 = 77;
      continue;
      i11 = 42;
    }
    label585: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 93;
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
      i15 = 47;
      continue;
      i15 = 81;
      continue;
      i15 = 77;
      continue;
      i15 = 42;
    }
    label677: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 93;
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
      i19 = 47;
      continue;
      i19 = 81;
      continue;
      i19 = 77;
      continue;
      i19 = 42;
    }
  }

  cf(Conversation paramConversation, sz paramsz)
  {
    super(paramConversation, paramsz);
    b(paramsz);
  }

  private void b(sz paramsz)
  {
    boolean bool = DialogToastListActivity.f;
    if ((paramsz.r != 0.0D) && (paramsz.q != 0.0D))
      this.I.setOnClickListener(new wn(this, null));
    this.F = ((MediaData)paramsz.t);
    if ((paramsz.p == null) || ("".equals(paramsz.p)))
    {
      this.J.setVisibility(8);
      this.K.setVisibility(8);
      this.G.setVisibility(0);
      if (!bool);
    }
    else
    {
      this.J.setVisibility(0);
      String[] arrayOfString = paramsz.p.split("\n");
      String str;
      if ((paramsz.j == null) || ("".equals(paramsz.j)))
      {
        str = P[4] + Uri.encode(paramsz.p.replaceAll(P[1], "+")) + P[5] + paramsz.q + "," + paramsz.r;
        if (!bool);
      }
      else
      {
        str = paramsz.j;
      }
      this.J.setAutoLinkMask(0);
      Spanned localSpanned = Html.fromHtml(P[2] + str + P[3] + arrayOfString[0] + P[0]);
      SpannableStringBuilder localSpannableStringBuilder = ef.a(arrayOfString[0], this.n.sb, new SpannableStringBuilder(localSpanned));
      this.J.setText(localSpannableStringBuilder);
      if ((arrayOfString.length > 1) && (!"".equals(arrayOfString[1])))
      {
        this.K.setVisibility(0);
        Object localObject = ef.a(arrayOfString[1], this.n.sb, null);
        TextView localTextView = this.K;
        if (localObject == null)
          localObject = arrayOfString[1];
        localTextView.setText((CharSequence)localObject);
        if (!bool);
      }
      else
      {
        this.K.setVisibility(8);
      }
      un localun = new un(this, str);
      this.J.setOnClickListener(localun);
      this.K.setOnClickListener(localun);
      this.G.setVisibility(8);
    }
    if (this.L != null)
      this.L.setVisibility(0);
    if (this.F.transferring)
    {
      if (paramsz.b.b)
      {
        if (this.L != null)
          this.L.setVisibility(8);
        if ((!this.N) || (this.O != 0))
        {
          this.G.setVisibility(8);
          this.J.setVisibility(8);
          this.K.setVisibility(8);
          this.H.setVisibility(0);
          this.I.setOnClickListener(null);
          this.O = 0;
          if (!bool);
        }
      }
      else if ((!this.N) || (this.O != 0))
      {
        this.H.setVisibility(0);
        this.O = 0;
        if (!bool);
      }
    }
    else if ((!paramsz.b.b) || (this.F.transferred))
    {
      if ((!this.N) || (this.O != 1))
      {
        if ((!this.N) || (this.O != 2))
        {
          if ((paramsz.p == null) || ("".equals(paramsz.p)))
            this.G.setVisibility(0);
          if (this.H != null)
            this.H.setVisibility(8);
        }
        this.G.setOnClickListener(new wn(this, null));
        this.G.setText(2131296512);
        this.O = 1;
        if (!bool);
      }
    }
    else if ((!this.N) || (this.O != 2))
    {
      if ((!this.N) || (this.O != 2))
      {
        if ((paramsz.p == null) || ("".equals(paramsz.p)))
          this.G.setVisibility(0);
        if (this.H != null)
          this.H.setVisibility(8);
      }
      this.G.setText(2131296484);
      this.G.setOnClickListener(new vn(this, null));
      this.I.setOnClickListener(null);
      this.O = 2;
    }
    this.I.setBackgroundDrawable(null);
    int i = (int)j4.a(this.f).K;
    this.I.setPadding(i, i, i, i);
    Bitmap localBitmap = m5.b(paramsz);
    if (localBitmap != null)
    {
      this.I.setImageDrawable(new o(this.f, localBitmap));
      if (!bool);
    }
    else
    {
      this.I.setImageDrawable(new o(this.f, d5.a()));
    }
    this.N = true;
  }

  protected int a()
  {
    return 2130903070;
  }

  public void a(sz paramsz, boolean paramBoolean)
  {
    if ((paramsz != this.o) || (paramBoolean))
    {
      this.N = false;
      b(paramsz);
    }
    super.a(paramsz, paramBoolean);
  }

  protected int b()
  {
    return 2130903071;
  }

  public void d()
  {
    b(this.o);
    super.d();
  }

  public boolean i()
  {
    if ((!this.o.b.b) || (this.o.l != 5) || (this.o.a != 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.o.b.b)
    {
      ViewGroup localViewGroup = (ViewGroup)getChildAt(1);
      localViewGroup.getLayoutParams().width = -2;
      super.onMeasure(paramInt1, paramInt2);
      localViewGroup.getLayoutParams().width = 0;
      if (this.L.getVisibility() != 8)
      {
        ViewGroup.LayoutParams localLayoutParams2 = localViewGroup.getLayoutParams();
        localLayoutParams2.width += this.L.getMeasuredWidth();
      }
      if (this.M.getVisibility() != 8)
      {
        ViewGroup.LayoutParams localLayoutParams1 = localViewGroup.getLayoutParams();
        localLayoutParams1.width += this.M.getMeasuredWidth();
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.cf
 * JD-Core Version:    0.6.1
 */