package com.whatsapp;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.util.DisplayMetrics;
import java.util.List;

public class bf extends ze
{
  private static float G;
  private static final String[] H;
  private final DividerView F;

  static
  {
    String[] arrayOfString = new String[5];
    char[] arrayOfChar1 = "M\n{PgL\021RKl^LK>".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\t\td]>".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "i\020#NkH\027~XsYMc\\w".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label368;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\t\0200".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label456;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "M\n{PgL\021RKl^L`PpZ\nc^\\[\016yfp[��7".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label544;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        H = arrayOfString;
        G = 0.0F;
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
        m = 41;
        continue;
        m = 99;
        continue;
        m = 13;
        continue;
        m = 57;
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
      i3 = 41;
      continue;
      i3 = 99;
      continue;
      i3 = 13;
      continue;
      i3 = 57;
    }
    label368: int i6 = arrayOfChar3[i5];
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
      i7 = 41;
      continue;
      i7 = 99;
      continue;
      i7 = 13;
      continue;
      i7 = 57;
    }
    label456: int i10 = arrayOfChar4[i9];
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
      i11 = 41;
      continue;
      i11 = 99;
      continue;
      i11 = 13;
      continue;
      i11 = 57;
    }
    label544: int i14 = arrayOfChar5[i13];
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
      i15 = 41;
      continue;
      i15 = 99;
      continue;
      i15 = 13;
      continue;
      i15 = 57;
    }
  }

  bf(Conversation paramConversation, sz paramsz)
  {
    super(paramConversation, paramsz);
    setClickable(false);
    setLongClickable(false);
    this.F = ((DividerView)findViewById(2131558524));
    b(paramsz);
  }

  private void b(sz paramsz)
  {
    boolean bool1 = DialogToastListActivity.f;
    this.F.setTextSize(c(getResources()));
    if ((paramsz.a == -1) && (paramsz.l == -1))
    {
      this.F.setText(App.Mb.getString(2131296557));
      return;
    }
    if (paramsz.b() != null);
    for (String[] arrayOfString = paramsz.b().split("\n"); ; arrayOfString = null)
    {
      SpannableStringBuilder localSpannableStringBuilder2;
      Object localObject2;
      if ((arrayOfString != null) && (arrayOfString.length == 2) && ((int)this.e.m == 1) && ((this.e.c == null) || ((arrayOfString[0].endsWith(H[2])) && (arrayOfString[1].lastIndexOf("\"") > arrayOfString[1].indexOf("\"")))))
      {
        String str5 = App.w.a(arrayOfString[0], null).b();
        int k = arrayOfString[1].indexOf("\"");
        int m = arrayOfString[1].lastIndexOf("\"");
        if (m <= k)
          g5.d(H[0] + this.e.c + H[1] + arrayOfString[0] + H[3] + arrayOfString[1]);
        App localApp9 = App.Mb;
        Object[] arrayOfObject9 = new Object[2];
        if (str5.equals(App.w.a(arrayOfString[0], null).a()))
          str5 = "‪" + str5 + "‬";
        arrayOfObject9[0] = str5;
        arrayOfObject9[1] = arrayOfString[1].substring(k + 1, m);
        String str6 = localApp9.getString(2131296856, arrayOfObject9);
        localSpannableStringBuilder2 = v4.b(str6, this.f);
        DividerView localDividerView2 = this.F;
        if (localSpannableStringBuilder2 != null)
          break label605;
        localObject2 = str6 + " ";
        label371: localDividerView2.setText((CharSequence)localObject2);
        if (!bool1)
          break;
      }
      String str1;
      boolean bool2;
      if (this.e.c == null)
      {
        g5.d(H[4] + g5.a(paramsz));
        if (!bool1);
      }
      else
      {
        str1 = App.w.a(this.e.c, null).b();
        bool2 = str1.equals(App.w.a(this.e.c, null).a());
      }
      while (true)
      {
        String str2;
        label523: SpannableStringBuilder localSpannableStringBuilder1;
        DividerView localDividerView1;
        switch ((int)this.e.m)
        {
        case 2:
        case 3:
        default:
          str2 = null;
          localSpannableStringBuilder1 = v4.b(str2, this.f);
          if (this.e.m == 1L)
            localSpannableStringBuilder1 = ef.a(str2, this.n.sb, localSpannableStringBuilder1);
          localDividerView1 = this.F;
          if (localSpannableStringBuilder1 != null)
            break;
        case 1:
        case 6:
        case 4:
        case 5:
        case 7:
        case 8:
        }
        for (Object localObject1 = str2 + " "; ; localObject1 = localSpannableStringBuilder1.append(" "))
        {
          localDividerView1.setText((CharSequence)localObject1);
          break;
          label605: localObject2 = localSpannableStringBuilder2.append(" ");
          break label371;
          if (!this.e.c.contains(App.c()))
          {
            App localApp8 = App.Mb;
            Object[] arrayOfObject8 = new Object[2];
            if (bool2)
              str1 = "‪" + str1 + "‬";
            arrayOfObject8[0] = str1;
            arrayOfObject8[1] = this.e.b();
            str2 = localApp8.getString(2131296856, arrayOfObject8);
            break label523;
          }
          int i = this.e.b().indexOf("\"");
          int j = this.e.b().lastIndexOf("\"");
          if ((i == 0) && (j == -1 + this.e.b().length()) && (i != j))
          {
            String str4 = this.e.b().substring(i + 1, j);
            App localApp7 = App.Mb;
            Object[] arrayOfObject7 = new Object[1];
            arrayOfObject7[0] = str4;
            str2 = localApp7.getString(2131296855, arrayOfObject7);
            break label523;
          }
          App localApp6 = App.Mb;
          Object[] arrayOfObject6 = new Object[1];
          arrayOfObject6[0] = this.e.b();
          str2 = localApp6.getString(2131296855, arrayOfObject6);
          break label523;
          if (this.e.c != null)
          {
            if (this.e.c.startsWith(App.c()))
            {
              if (paramsz.b() == null)
              {
                str2 = App.Mb.getString(2131296640);
                break label523;
              }
              str2 = App.Mb.getString(2131296639);
              break label523;
            }
            String str3 = App.w.a(this.e.c, null).b();
            boolean bool3 = str3.equals(App.w.a(this.e.c, null).a());
            if (paramsz.b() == null)
            {
              App localApp5 = App.Mb;
              Object[] arrayOfObject5 = new Object[1];
              if (bool3)
                str3 = "‪" + str3 + "‬";
              arrayOfObject5[0] = str3;
              str2 = localApp5.getString(2131296638, arrayOfObject5);
              break label523;
            }
            App localApp4 = App.Mb;
            Object[] arrayOfObject4 = new Object[1];
            if (bool3)
              str3 = "‪" + str3 + "‬";
            arrayOfObject4[0] = str3;
            str2 = localApp4.getString(2131296637, arrayOfObject4);
            break label523;
          }
          str2 = "";
          break label523;
          if ((this.e.c != null) && (this.e.c.startsWith(App.c())))
          {
            str2 = App.Mb.getString(2131296858);
            break label523;
          }
          App localApp3 = App.Mb;
          Object[] arrayOfObject3 = new Object[1];
          if (bool2)
            str1 = "‪" + str1 + "‬";
          arrayOfObject3[0] = str1;
          str2 = localApp3.getString(2131296857, arrayOfObject3);
          break label523;
          App localApp2 = App.Mb;
          Object[] arrayOfObject2 = new Object[1];
          if (bool2)
            str1 = "‪" + str1 + "‬";
          arrayOfObject2[0] = str1;
          str2 = localApp2.getString(2131296861, arrayOfObject2);
          break label523;
          if ((this.e.c != null) && (this.e.c.startsWith(App.c())))
          {
            str2 = App.Mb.getString(2131296860);
            break label523;
          }
          App localApp1 = App.Mb;
          Object[] arrayOfObject1 = new Object[1];
          if (bool2)
            str1 = "‪" + str1 + "‬";
          arrayOfObject1[0] = str1;
          str2 = localApp1.getString(2131296859, arrayOfObject1);
          break label523;
          str2 = App.Mb.getString(2131296862);
          break label523;
        }
        bool2 = false;
        str1 = null;
      }
    }
  }

  private static float c(Resources paramResources)
  {
    if (G == 0.0F)
    {
      float f = paramResources.getDisplayMetrics().density;
      G = paramResources.getDimensionPixelSize(2131361826) / f;
    }
    int i = 0;
    if (FontListPreference.a == -1)
    {
      i = -2;
      if (!DialogToastListActivity.f);
    }
    else if (FontListPreference.a == 1)
    {
      i = 4;
    }
    return G + i;
  }

  protected int a()
  {
    return 2130903068;
  }

  public void a(sz paramsz, boolean paramBoolean)
  {
    if ((this.o != paramsz) || (paramBoolean))
    {
      this.o = paramsz;
      this.e = paramsz;
      b(paramsz);
    }
    super.a(paramsz, paramBoolean);
  }

  void a(List<rn> paramList)
  {
  }

  protected int b()
  {
    return 2130903068;
  }

  public void d()
  {
    b(this.o);
    super.d();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.bf
 * JD-Core Version:    0.6.1
 */