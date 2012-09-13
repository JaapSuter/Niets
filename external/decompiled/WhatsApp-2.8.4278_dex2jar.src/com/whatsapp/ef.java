package com.whatsapp;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.URLSpan;
import android.widget.ImageView;
import android.widget.TextView;
import hb;
import java.util.List;

public class ef extends ze
{
  private static final String[] G;
  private final TextView F = (TextView)findViewById(2131558615);

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "\032V\n".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\003R\017Q}\001".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        G = arrayOfString;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 9;
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
        m = 110;
        continue;
        m = 51;
        continue;
        m = 102;
        continue;
        m = 61;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 9;
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
      i3 = 110;
      continue;
      i3 = 51;
      continue;
      i3 = 102;
      continue;
      i3 = 61;
    }
  }

  ef(Conversation paramConversation, sz paramsz)
  {
    super(paramConversation, paramsz);
    b(paramsz);
  }

  public static SpannableStringBuilder a(String paramString1, String paramString2, SpannableStringBuilder paramSpannableStringBuilder)
  {
    boolean bool = DialogToastListActivity.f;
    SpannableStringBuilder localSpannableStringBuilder;
    if ((hb.a(paramString2)) || (hb.a(paramString1)))
      localSpannableStringBuilder = paramSpannableStringBuilder;
    while (true)
    {
      return localSpannableStringBuilder;
      String str1 = paramString1.toLowerCase();
      String str2 = paramString2.toLowerCase();
      int i = str1.indexOf(str2);
      localSpannableStringBuilder = paramSpannableStringBuilder;
      if (i >= 0)
      {
        if (localSpannableStringBuilder == null)
          localSpannableStringBuilder = new SpannableStringBuilder(paramString1);
        localSpannableStringBuilder.setSpan(new BackgroundColorSpan(-256), i, i + str2.length(), 33);
        i = str1.indexOf(str2, i + 1);
        if (!bool)
          break;
      }
    }
  }

  private void b(sz paramsz)
  {
    int i = 4;
    boolean bool = DialogToastListActivity.f;
    int n;
    if (this.F != null)
      if ((paramsz.b != null) && (paramsz.b.b))
      {
        this.F.setGravity(TextEmojiLabel.a(paramsz.b()));
        if (!bool);
      }
      else
      {
        TextView localTextView3 = this.F;
        if (!App.ub())
          break label256;
        n = 19;
        localTextView3.setGravity(n);
      }
    SpannableStringBuilder localSpannableStringBuilder = v4.a(paramsz.b(), this.f);
    Object localObject = a(paramsz.b(), this.n.sb, localSpannableStringBuilder);
    TextView localTextView1 = this.F;
    if (localObject == null)
      localObject = paramsz.b();
    localTextView1.setText((CharSequence)localObject);
    this.F.setTextSize(b(getResources()));
    ImageView localImageView = (ImageView)findViewById(2131558601);
    int k;
    label174: int m;
    if (paramsz.a == i)
    {
      TextView localTextView2 = this.F;
      if (!App.ub())
        break label263;
      k = 0;
      localTextView2.setPadding(k, 0, i, 2);
      if (localImageView != null)
      {
        if (!App.ub())
          break label269;
        m = i;
        label198: localImageView.setPadding(m, 0, 0, 2);
        if (!bool);
      }
    }
    else
    {
      this.F.setPadding(i, 0, i, 2);
      if (localImageView != null)
        if (!App.ub())
          break label275;
    }
    label256: label263: label269: label275: for (int j = i; ; j = 0)
    {
      if (App.ub())
        i = 0;
      localImageView.setPadding(j, 0, i, 2);
      return;
      n = 21;
      break;
      k = i;
      break label174;
      m = 0;
      break label198;
    }
  }

  protected int a()
  {
    return 2130903074;
  }

  public void a(sz paramsz, boolean paramBoolean)
  {
    if ((paramsz != this.o) || (paramBoolean))
      b(paramsz);
    super.a(paramsz, paramBoolean);
  }

  void a(List<rn> paramList)
  {
    boolean bool = DialogToastListActivity.f;
    paramList.add(0, new rn(getResources().getString(2131296267), 2));
    URLSpan[] arrayOfURLSpan = this.F.getUrls();
    int i = arrayOfURLSpan.length;
    int j = 0;
    do
    {
      if (j >= i)
        break;
      URLSpan localURLSpan = arrayOfURLSpan[j];
      if (localURLSpan.getURL().contains(G[0]))
      {
        String str2 = localURLSpan.getURL();
        String str3 = str2.substring(1 + str2.indexOf(":"));
        paramList.add(0, new rn(getResources().getString(2131296450) + " " + str3, 11, str3));
        paramList.add(0, new rn(getResources().getString(2131296451) + " " + str3, 10, str3));
      }
      if (localURLSpan.getURL().contains(G[1]))
      {
        String str1 = localURLSpan.getURL().substring(1 + localURLSpan.getURL().indexOf(":"));
        paramList.add(0, new rn(getResources().getString(2131296451) + " " + str1, 9, str1));
      }
      j++;
    }
    while (!bool);
  }

  protected int b()
  {
    return 2130903075;
  }

  void b(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.F.setTextColor(-16776961);
      if (!DialogToastListActivity.f);
    }
    else
    {
      this.F.setTextColor(-16777216);
    }
  }

  public void d()
  {
    b(this.o);
    super.d();
  }
}