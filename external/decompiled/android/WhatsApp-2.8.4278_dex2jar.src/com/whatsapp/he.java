package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;

public class he extends ArrayAdapter<op>
{
  private static final String[] z;
  final CountryPicker a;

  static
  {
    String[] arrayOfString = new String[6];
    char[] arrayOfChar1 = ":g([Le#vJZ?9g@Wf$gO\003y>\"VV|!#".toCharArray();
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
      arrayOfChar2 = ":g([Le#vJZS\"f]\003y>\"VV|!#".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = ":g([Le#vJZs\"f]\fd(zLUy(u\030JcmlMO|l".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label400;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "|,{WVd\022kVE|,v]Q".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label488;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = ":g([Le#vJZ?!cALe9\"QP0#wTO1".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label576;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = ":g([Le#vJZ0$q\030Me!n\031".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label664;
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
        m = 35;
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
        m = 16;
        continue;
        m = 77;
        continue;
        m = 2;
        continue;
        m = 56;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 35;
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
      i3 = 16;
      continue;
      i3 = 77;
      continue;
      i3 = 2;
      continue;
      i3 = 56;
    }
    label400: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 35;
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
      i7 = 16;
      continue;
      i7 = 77;
      continue;
      i7 = 2;
      continue;
      i7 = 56;
    }
    label488: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 35;
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
      i11 = 16;
      continue;
      i11 = 77;
      continue;
      i11 = 2;
      continue;
      i11 = 56;
    }
    label576: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 35;
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
      i15 = 16;
      continue;
      i15 = 77;
      continue;
      i15 = 2;
      continue;
      i15 = 56;
    }
    label664: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 35;
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
      i19 = 16;
      continue;
      i19 = 77;
      continue;
      i19 = 2;
      continue;
      i19 = 56;
    }
  }

  public he(Context paramContext, int paramInt, List<op> paramList)
  {
    super(paramInt, paramList, localList);
  }

  public int getCount()
  {
    int i = super.getCount();
    if (i == 0)
      i = 1;
    return i;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool = DialogToastListActivity.f;
    if (super.getCount() == 0)
    {
      if ((paramView == null) || ((paramView != null) && (paramView.findViewById(2131558552) == null)))
      {
        Context localContext2 = getContext();
        String str4 = z[3];
        paramView = new LinearLayout(localContext2);
        ((LayoutInflater)localContext2.getSystemService(str4)).inflate(2130903112, paramView, true);
        paramView.findViewById(2131558726).setClickable(true);
      }
      return paramView;
    }
    op localop = (op)getItem(paramInt);
    String str1 = localop.a;
    String str2 = localop.b;
    if (str1 == null)
      g5.c(z[5]);
    if (str2 == null)
      g5.c(z[1]);
    LinearLayout localLinearLayout;
    if ((paramView == null) || ((paramView != null) && (paramView.findViewById(2131558635) == null)))
    {
      Context localContext1 = getContext();
      String str3 = z[3];
      localLinearLayout = new LinearLayout(localContext1);
      ((LayoutInflater)localContext1.getSystemService(str3)).inflate(2130903082, localLinearLayout, true);
      if (!bool)
        break label380;
    }
    label380: for (paramView = (LinearLayout)paramView; ; paramView = localLinearLayout)
    {
      if (paramView == null)
        g5.c(z[4]);
      TextView localTextView1 = (TextView)paramView.findViewById(2131558635);
      if (localTextView1 == null)
        g5.c(z[0]);
      localTextView1.setText(str1);
      TextView localTextView2 = (TextView)paramView.findViewById(2131558636);
      if (localTextView2 == null)
        g5.c(z[2]);
      localTextView2.setText("+" + str2);
      ImageView localImageView = (ImageView)paramView.findViewById(2131558637);
      if ((str1 != null) && (str1.equals(CountryPicker.a(this.a))))
      {
        localTextView1.setTextColor(this.a.getResources().getColor(2131230737));
        localImageView.setBackgroundDrawable(this.a.getResources().getDrawable(2130837573));
        if (!bool)
          break;
      }
      localTextView1.setTextColor(-16777216);
      localImageView.setBackgroundDrawable(null);
      break;
    }
  }
}