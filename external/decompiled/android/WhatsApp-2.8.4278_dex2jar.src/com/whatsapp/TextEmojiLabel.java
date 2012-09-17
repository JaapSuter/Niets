package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Spannable.Factory;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import android.widget.TextView.BufferType;

public class TextEmojiLabel extends TextView
{
  private static final Spannable.Factory spannableFactory;
  private static final String[] z;
  private int lastMeasuredWidth;
  private TextView.BufferType originalBufferType;
  private CharSequence originalText;

  static
  {
    String[] arrayOfString = new String[11];
    char[] arrayOfChar1 = "LD9<:uN+!3yC$$PqR\025-\007lm\025\032_lD9<_qRa-\022hU8h\020j\001/=\023t".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "lD9<\032uN+!\023yC$$PuD ;\njDph".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "lD9<\032uN+!\023yC$$PuD ;\njDa".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label601;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "(Y".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label693;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "4\001".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label785;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "8\t".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label877;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "tH/-_".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label969;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "lD9<E8".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1061;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "1\033a".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1153;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "uD ;\njD%?\026|U)r_".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1245;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "tH/- {N4&\013\"\001".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label1337;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        z = arrayOfString;
        spannableFactory = new zd();
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 127;
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
        m = 24;
        continue;
        m = 33;
        continue;
        m = 65;
        continue;
        m = 72;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 127;
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
      i3 = 24;
      continue;
      i3 = 33;
      continue;
      i3 = 65;
      continue;
      i3 = 72;
    }
    label601: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 127;
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
      i7 = 24;
      continue;
      i7 = 33;
      continue;
      i7 = 65;
      continue;
      i7 = 72;
    }
    label693: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 127;
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
      i11 = 24;
      continue;
      i11 = 33;
      continue;
      i11 = 65;
      continue;
      i11 = 72;
    }
    label785: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 127;
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
      i15 = 24;
      continue;
      i15 = 33;
      continue;
      i15 = 65;
      continue;
      i15 = 72;
    }
    label877: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 127;
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
      i19 = 24;
      continue;
      i19 = 33;
      continue;
      i19 = 65;
      continue;
      i19 = 72;
    }
    label969: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 127;
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
      i23 = 24;
      continue;
      i23 = 33;
      continue;
      i23 = 65;
      continue;
      i23 = 72;
    }
    label1061: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 127;
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
      i27 = 24;
      continue;
      i27 = 33;
      continue;
      i27 = 65;
      continue;
      i27 = 72;
    }
    label1153: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 127;
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
      i31 = 24;
      continue;
      i31 = 33;
      continue;
      i31 = 65;
      continue;
      i31 = 72;
    }
    label1245: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 127;
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
      i35 = 24;
      continue;
      i35 = 33;
      continue;
      i35 = 65;
      continue;
      i35 = 72;
    }
    label1337: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 127;
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
      i39 = 24;
      continue;
      i39 = 33;
      continue;
      i39 = 65;
      continue;
      i39 = 72;
    }
  }

  public TextEmojiLabel(Context paramContext)
  {
    super(paramContext);
    if (Build.VERSION.SDK_INT >= 11)
      setSpannableFactory(spannableFactory);
  }

  public TextEmojiLabel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (Build.VERSION.SDK_INT >= 11)
      setSpannableFactory(spannableFactory);
  }

  public TextEmojiLabel(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (Build.VERSION.SDK_INT >= 11)
      setSpannableFactory(spannableFactory);
  }

  public static int a(String paramString)
  {
    int i = 19;
    if (paramString.length() <= 0)
      if (!App.ub());
    while (true)
    {
      return i;
      i = 21;
      continue;
      if (Build.VERSION.SDK_INT >= 11)
        i = 16;
      else if (!b(paramString))
        i = 21;
    }
  }

  private String a(CharSequence paramCharSequence)
  {
    boolean bool = DialogToastListActivity.f;
    String str = "";
    int i = 0;
    do
    {
      if (i >= paramCharSequence.length())
        break;
      int j = paramCharSequence.charAt(i);
      str = str + z[3] + Integer.toHexString(j) + z[4];
      i++;
    }
    while (!bool);
    return str;
  }

  private void a()
  {
    boolean bool = DialogToastListActivity.f;
    g5.d(z[9] + getMeasuredWidth());
    CharSequence localCharSequence = getText();
    g5.d(z[7] + a(localCharSequence));
    Layout localLayout = getLayout();
    g5.d(z[10] + localLayout.getLineCount());
    int i = 0;
    do
    {
      if (i >= localLayout.getLineCount())
        break;
      int j = localLayout.getLineStart(i);
      int k;
      if (i == -1 + localLayout.getLineCount())
      {
        k = localCharSequence.length();
        if (!bool);
      }
      else
      {
        k = localLayout.getLineStart(i + 1);
      }
      if (j <= k)
      {
        g5.d(z[6] + i + z[5] + j + "-" + k + z[8] + a(localCharSequence.subSequence(j, k)));
        if (!bool);
      }
      else
      {
        g5.d(z[6] + i + z[5] + j + "-" + k + ")");
      }
      i++;
    }
    while (!bool);
  }

  public static boolean b(String paramString)
  {
    boolean bool = false;
    if ((paramString == null) || (paramString.length() <= 0))
      g5.c(z[0]);
    for (bool = true; ; bool = true)
    {
      int i;
      do
      {
        return bool;
        i = paramString.codePointAt(0);
      }
      while ((i >= 1424) && (i <= 1791));
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    try
    {
      super.onDraw(paramCanvas);
      return;
    }
    catch (Exception localException)
    {
      g5.d(localException);
      a();
      throw new RuntimeException(localException);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool = DialogToastListActivity.f;
    if (Build.VERSION.SDK_INT == 16);
    while (true)
    {
      SpannableStringBuilder localSpannableStringBuilder1;
      try
      {
        super.onMeasure(paramInt1, paramInt2);
        int i = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
        if ((this.lastMeasuredWidth != i) && ((this.originalText instanceof Spanned)) && (getEllipsize() != null))
        {
          this.lastMeasuredWidth = i;
          CharSequence localCharSequence = TextUtils.ellipsize(this.originalText, getPaint(), i, getEllipsize());
          if ((localCharSequence != null) && (!localCharSequence.equals(getText())))
            super.setText(localCharSequence, this.originalBufferType);
        }
        return;
      }
      catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException1)
      {
        localSpannableStringBuilder1 = new SpannableStringBuilder(this.originalText);
        g5.d(z[2] + localArrayIndexOutOfBoundsException1.toString());
        int j = localSpannableStringBuilder1.nextSpanTransition(0, localSpannableStringBuilder1.length(), MetricAffectingSpan.class);
        if ((j >= 0) && (j < localSpannableStringBuilder1.length()))
        {
          localSpannableStringBuilder1.insert(j, " ");
          j = localSpannableStringBuilder1.nextSpanTransition(j + 1, localSpannableStringBuilder1.length(), MetricAffectingSpan.class);
          if (!bool)
            continue;
        }
      }
      try
      {
        this.originalText = localSpannableStringBuilder1;
        super.setText(localSpannableStringBuilder1);
        super.onMeasure(paramInt1, paramInt2);
        if (!bool)
          continue;
        super.onMeasure(paramInt1, paramInt2);
      }
      catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException2)
      {
        while (true)
        {
          g5.d(z[1] + localArrayIndexOutOfBoundsException1.toString());
          SpannableStringBuilder localSpannableStringBuilder2 = new SpannableStringBuilder(this.originalText);
          int k = TextUtils.indexOf(localSpannableStringBuilder2, '\n', 0);
          SpannableStringBuilder localSpannableStringBuilder3 = localSpannableStringBuilder2;
          int m = k;
          do
          {
            if (m < 0)
              break;
            localSpannableStringBuilder3 = localSpannableStringBuilder3.replace(m, m + 1, " ");
            m = TextUtils.indexOf(localSpannableStringBuilder3, '\n', m + 1);
          }
          while (!bool);
          this.originalText = localSpannableStringBuilder3;
          super.setText(localSpannableStringBuilder3);
          super.onMeasure(paramInt1, paramInt2);
        }
      }
    }
  }

  public void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
  {
    this.originalText = paramCharSequence;
    this.originalBufferType = paramBufferType;
    this.lastMeasuredWidth = 0;
    if ((Build.VERSION.SDK_INT >= 11) && ((paramCharSequence instanceof Spanned)))
    {
      super.setText(paramCharSequence, TextView.BufferType.SPANNABLE);
      if (!DialogToastListActivity.f);
    }
    else
    {
      super.setText(paramCharSequence, paramBufferType);
    }
  }
}