package com.whatsapp;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;

class ne extends BaseAdapter
  implements Filterable
{
  private static final String[] z;
  public Filter a = new we(this, null);
  final Conversations b;

  static
  {
    String[] arrayOfString = new String[6];
    char[] arrayOfChar1 = "xw".toCharArray();
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
      arrayOfChar2 = "{z=\016o/".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = ";\"1>\t*>+)\0057#,\027\0367:p%\005+>6&\013\007?2<3+?<r".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label401;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "bm".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label493;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "{yj|Ylx".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label585;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "4,&'\031,\0226&\n4,+-\036".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label677;
        arrayOfString[5] = new String(arrayOfChar6).intern();
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
        m = 108;
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
        m = 88;
        continue;
        m = 77;
        continue;
        m = 95;
        continue;
        m = 72;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 108;
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
      i3 = 88;
      continue;
      i3 = 77;
      continue;
      i3 = 95;
      continue;
      i3 = 72;
    }
    label401: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 108;
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
      i7 = 88;
      continue;
      i7 = 77;
      continue;
      i7 = 95;
      continue;
      i7 = 72;
    }
    label493: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 108;
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
      i11 = 88;
      continue;
      i11 = 77;
      continue;
      i11 = 95;
      continue;
      i11 = 72;
    }
    label585: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 108;
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
      i15 = 88;
      continue;
      i15 = 77;
      continue;
      i15 = 95;
      continue;
      i15 = 72;
    }
    label677: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 108;
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
      i19 = 88;
      continue;
      i19 = 77;
      continue;
      i19 = 95;
      continue;
      i19 = 72;
    }
  }

  ne(Conversations paramConversations)
  {
  }

  private int a(zq paramzq, sz paramsz)
  {
    int i = 2130838510;
    if (paramsz.b.b)
      switch (paramsz.a)
      {
      case 0:
      case 1:
      case 2:
      case 3:
      default:
      case 4:
      case 5:
      }
    while (true)
    {
      return i;
      i = 2130838513;
      continue;
      i = 2130838509;
      continue;
      if (paramzq.a == 0)
        i = 2130838511;
      else
        i = 2130838514;
    }
  }

  public String a(int paramInt)
  {
    return (String)this.b.t.get(paramInt);
  }

  public final void a(View paramView, zq paramzq, boolean paramBoolean, fp paramfp)
  {
    boolean bool = DialogToastListActivity.f;
    if (paramBoolean)
    {
      sz localsz2 = App.z.j(paramzq.b);
      paramfp.a.setText(Conversations.h(this.b).a);
      if ((localsz2 == null) || (localsz2.m == -2L))
      {
        paramfp.a.setTextColor(this.b.getResources().getColor(2131230737));
        paramfp.c.setVisibility(4);
        if (!bool);
      }
      else
      {
        paramfp.a.setTextColor(this.b.getResources().getColor(2131230725));
        paramfp.c.setVisibility(0);
      }
      return;
    }
    Conversations.i(this.b).a(paramzq, paramfp.d);
    Object localObject1 = "";
    sz localsz1 = App.z.j(paramzq.b);
    Object localObject2 = v4.a(paramzq.b(), this.b.getBaseContext(), paramfp.b.getPaint());
    TextView localTextView1 = paramfp.b;
    if (localObject2 == null)
      localObject2 = paramzq.b();
    localTextView1.setText((CharSequence)localObject2);
    if ((localsz1 != null) && (localsz1.l == 0) && ((localsz1.m == 2L) || (localsz1.m == 3L)))
    {
      paramfp.b.setTextColor(this.b.getResources().getColor(2131230725));
      if (!bool);
    }
    else
    {
      paramfp.b.setTextColor(this.b.getResources().getColor(2131230721));
    }
    if (paramzq.a > 0)
    {
      paramfp.g.a(paramzq.a);
      paramfp.g.setVisibility(0);
      if (!bool);
    }
    else
    {
      paramfp.g.setVisibility(8);
    }
    paramfp.c.setVisibility(8);
    paramfp.h.setVisibility(0);
    paramfp.i.setVisibility(8);
    Object localObject5;
    label394: label444: Object localObject6;
    label657: Object localObject8;
    if (localsz1 != null)
    {
      int j = localsz1.l;
      if (j == 0)
      {
        if (localsz1.a == 6)
          break label1593;
        localObject5 = localsz1.b();
        if (!bool)
          break label657;
      }
      switch ((int)localsz1.m)
      {
      default:
        paramfp.h.setVisibility(8);
        if (bool)
          if (j == 1)
          {
            localObject5 = Conversations.h(this.b).o;
            if (!bool);
          }
          else if (j == 2)
          {
            localObject5 = Conversations.h(this.b).p;
            if (!bool);
          }
          else if (j == 3)
          {
            localObject5 = Conversations.h(this.b).q;
            if (!bool);
          }
          else if (j == 4)
          {
            localObject5 = Conversations.h(this.b).s;
            if (!bool);
          }
          else if (j == 5)
          {
            localObject5 = Conversations.h(this.b).r;
            if ((localsz1.p != null) && (localsz1.p.length() > 0))
            {
              String[] arrayOfString = localsz1.p.split("\n");
              if ((arrayOfString.length > 0) && (arrayOfString[0].length() > 0))
                localObject5 = arrayOfString[0];
            }
            paramfp.i.setVisibility(0);
            paramfp.i.setImageResource(2130838488);
            if (!bool);
          }
          else
          {
            localObject5 = this.b.getString(2131296769);
          }
        localObject6 = t4.e(this.b, localsz1.i) + " ";
        int k = a(paramzq, localsz1);
        if (k != 0)
        {
          if (localsz1.a == 6)
          {
            paramfp.h.setImageBitmap(null);
            if (!bool);
          }
          else
          {
            paramfp.h.setImageResource(k);
            if (!bool);
          }
        }
        else
          paramfp.h.setImageBitmap(null);
        if (bool)
        {
          localObject8 = localObject6;
          localObject1 = localObject5;
        }
        break;
      case 4:
      case 5:
      case 7:
      case 1:
      case 6:
      case 3:
      case 2:
      }
    }
    for (Object localObject3 = localObject8; ; localObject3 = "")
    {
      paramfp.h.setImageBitmap(null);
      Object localObject4 = localObject3;
      localObject5 = localObject1;
      localObject6 = localObject4;
      int i;
      label818: Object localObject7;
      SpannableStringBuilder localSpannableStringBuilder2;
      label1019: SpannableStringBuilder localSpannableStringBuilder1;
      TextView localTextView2;
      if (paramfp.j != null)
      {
        ImageView localImageView = paramfp.j;
        if (n5.a(paramzq.b))
        {
          i = 0;
          localImageView.setVisibility(i);
        }
      }
      else
      {
        paramfp.f.setVisibility(8);
        if ((paramzq.o()) && (((String)localObject5).length() > 0))
          if (localsz1.c != null)
          {
            zq localzq = App.w.a(localsz1.c, null);
            if (localzq.b.contains(App.c()))
            {
              localObject7 = Conversations.h(this.b).t;
              if (!bool);
            }
            else
            {
              localObject7 = localzq.d();
            }
            if (((App.ub()) && (TextEmojiLabel.b((String)localObject7))) || ((!App.ub()) && (!TextEmojiLabel.b((String)localObject7))))
            {
              localObject7 = (String)localObject7 + z[3];
              if (!bool);
            }
            else
            {
              localObject7 = z[0] + (String)localObject7;
            }
            localSpannableStringBuilder2 = v4.b((String)localObject7, this.b.getBaseContext());
            TextView localTextView3 = paramfp.f;
            if (localSpannableStringBuilder2 != null)
              break label1579;
            localTextView3.setText((CharSequence)localObject7);
            paramfp.f.setVisibility(0);
            if (!bool);
          }
          else if (!localsz1.b.b)
          {
            g5.d(z[2] + g5.a(localsz1));
          }
        localSpannableStringBuilder1 = v4.b((String)localObject5, this.b.getBaseContext());
        localTextView2 = paramfp.e;
        if (localSpannableStringBuilder1 != null)
          break label1586;
      }
      while (true)
      {
        localTextView2.setText((CharSequence)localObject5);
        paramfp.k.setText((CharSequence)localObject6);
        if (paramzq.a > 0)
        {
          paramfp.e.setTypeface(Typeface.DEFAULT_BOLD);
          paramfp.e.setTextColor(Color.parseColor(z[4]));
          paramfp.f.setTypeface(Typeface.DEFAULT_BOLD);
          paramfp.f.setTextColor(Color.parseColor(z[4]));
          if (!bool)
            break;
        }
        paramfp.e.setTypeface(Typeface.DEFAULT);
        paramfp.e.setTextColor(Color.parseColor(z[1]));
        paramfp.f.setTypeface(Typeface.DEFAULT);
        paramfp.f.setTextColor(Color.parseColor(z[1]));
        break;
        if (localsz1.c.startsWith(App.c()))
        {
          localObject5 = Conversations.h(this.b).b;
          if (!bool)
            break label444;
        }
        localObject5 = Conversations.h(this.b).c;
        if (!bool)
          break label444;
        localObject5 = Conversations.h(this.b).f;
        if (!bool)
          break label444;
        if (localsz1.c.startsWith(App.c()))
        {
          localObject5 = Conversations.h(this.b).d;
          if (!bool)
            break label444;
        }
        localObject5 = Conversations.h(this.b).e;
        if ((!bool) || (localsz1.c == null))
          break label444;
        if (localsz1.c.contains(App.c()))
        {
          localObject5 = Conversations.h(this.b).g;
          if (!bool)
            break label444;
        }
        localObject5 = Conversations.h(this.b).h;
        if ((!bool) || (localsz1.c == null))
          break label444;
        if (localsz1.c.contains(App.c()))
        {
          if (localsz1.b() == null)
          {
            localObject5 = Conversations.h(this.b).l;
            if (!bool)
              break label444;
          }
          localObject5 = Conversations.h(this.b).k;
          if (!bool)
            break label444;
        }
        if (localsz1.b() == null)
        {
          localObject5 = Conversations.h(this.b).j;
          if (!bool)
            break label444;
        }
        localObject5 = Conversations.h(this.b).i;
        if (!bool)
          break label444;
        localObject5 = Conversations.h(this.b).m;
        paramfp.c.setVisibility(8);
        if (!bool)
          break label444;
        localObject5 = Conversations.h(this.b).n;
        paramfp.c.setVisibility(0);
        break label444;
        i = 8;
        break label818;
        label1579: localObject7 = localSpannableStringBuilder2;
        break label1019;
        label1586: localObject5 = localSpannableStringBuilder1;
      }
      label1593: localObject5 = localObject1;
      break label394;
    }
  }

  public int getCount()
  {
    return this.b.t.size();
  }

  public Filter getFilter()
  {
    return this.a;
  }

  public long getItemId(int paramInt)
  {
    return ((String)this.b.t.get(paramInt)).hashCode();
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = 1;
    boolean bool1 = DialogToastListActivity.f;
    zq localzq = gp.a(a(paramInt));
    boolean bool2 = localzq.b.contains(App.E);
    if (paramView == null)
      if (!bool1);
    for (int j = i; ; j = 0)
    {
      Object localObject1 = (fp)paramView.getTag();
      Object localObject2;
      if (bool2 != ((fp)localObject1).l.contains(App.E))
        if (bool1)
          localObject2 = paramView;
      while (true)
      {
        fp localfp;
        View localView;
        if (i != 0)
        {
          LayoutInflater localLayoutInflater = (LayoutInflater)this.b.getSystemService(z[5]);
          localfp = new fp();
          if (bool2)
          {
            localView = localLayoutInflater.inflate(2130903078, paramViewGroup, false);
            localfp.a = ((TextView)localView.findViewById(2131558623));
            localfp.c = localView.findViewById(2131558624);
            if (!bool1)
              break label409;
          }
          localObject2 = localLayoutInflater.inflate(2130903079, paramViewGroup, false);
          localfp.b = ((TextView)((View)localObject2).findViewById(2131558626));
          localfp.c = ((View)localObject2).findViewById(2131558624);
          localfp.d = ((LoadPhotoImageView)((View)localObject2).findViewById(2131558625));
          localfp.e = ((TextView)((View)localObject2).findViewById(2131558631));
          localfp.f = ((TextView)((View)localObject2).findViewById(2131558629));
          localfp.g = ((UnreadMsgIndicator)((View)localObject2).findViewById(2131558633));
          localfp.h = ((ImageView)((View)localObject2).findViewById(2131558628));
          localfp.i = ((ImageView)((View)localObject2).findViewById(2131558630));
          localfp.j = ((ImageView)((View)localObject2).findViewById(2131558632));
          localfp.k = ((TextView)((View)localObject2).findViewById(2131558627));
          localObject1 = localfp;
        }
        while (true)
        {
          ((fp)localObject1).l = localzq.b;
          Conversations.g(this.b).put(((fp)localObject1).l, localObject1);
          ((View)localObject2).setTag(localObject1);
          a((View)localObject2, localzq, bool2, (fp)localObject1);
          if (paramInt % 2 == 0)
          {
            ((View)localObject2).setBackgroundResource(2130838548);
            if (!bool1);
          }
          else
          {
            ((View)localObject2).setBackgroundResource(2130838550);
          }
          return localObject2;
          label409: localObject1 = localfp;
          localObject2 = localView;
        }
        localObject2 = null;
        continue;
        i = j;
        break;
        localObject1 = null;
        localObject2 = null;
      }
    }
  }

  public boolean hasStableIds()
  {
    return true;
  }
}