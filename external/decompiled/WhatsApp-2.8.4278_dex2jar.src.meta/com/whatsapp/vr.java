package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class vr
  implements TextWatcher
{
  private static final String[] z;
  final EditGroupSubject a;

  static
  {
    String[] arrayOfString = new String[7];
    char[] arrayOfChar1 = "jbtl".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = ">!$".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "1iaypxa&".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label440;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "yik|lAxvl}j~+osku`)rqo$d}jxl&".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label528;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "yik|lAxvl}j~+gyi;pf<rrw}3".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label616;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = ">;$".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label704;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "l~w|pj!".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label792;
        arrayOfString[6] = new String(arrayOfChar7).intern();
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
        m = 28;
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
        m = 30;
        continue;
        m = 27;
        continue;
        m = 4;
        continue;
        m = 9;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 28;
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
      i3 = 30;
      continue;
      i3 = 27;
      continue;
      i3 = 4;
      continue;
      i3 = 9;
    }
    label440: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 28;
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
      i7 = 30;
      continue;
      i7 = 27;
      continue;
      i7 = 4;
      continue;
      i7 = 9;
    }
    label528: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 28;
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
      i11 = 30;
      continue;
      i11 = 27;
      continue;
      i11 = 4;
      continue;
      i11 = 9;
    }
    label616: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 28;
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
      i15 = 30;
      continue;
      i15 = 27;
      continue;
      i15 = 4;
      continue;
      i15 = 9;
    }
    label704: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 28;
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
      i19 = 30;
      continue;
      i19 = 27;
      continue;
      i19 = 4;
      continue;
      i19 = 9;
    }
    label792: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 28;
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
      i23 = 30;
      continue;
      i23 = 27;
      continue;
      i23 = 4;
      continue;
      i23 = 9;
    }
  }

  vr(EditGroupSubject paramEditGroupSubject)
  {
  }

  public void afterTextChanged(Editable paramEditable)
  {
  }

  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = DialogToastListActivity.f;
    if (this.a.i != null)
      this.a.i.setGravity(TextEmojiLabel.a(paramCharSequence.toString()));
    if (this.a.C)
    {
      this.a.C = false;
      return;
    }
    this.a.o.smoothScrollTo(0, this.a.i.getBottom());
    if ((paramCharSequence.length() > 0) && (this.a.g.getText().length() > 0))
    {
      this.a.findViewById(2131558666).setEnabled(true);
      if (!bool);
    }
    else
    {
      this.a.findViewById(2131558666).setEnabled(false);
    }
    String str1 = paramCharSequence.toString();
    ArrayList localArrayList = new ArrayList();
    String[] arrayOfString = EditGroupSubject.b(this.a, str1);
    if (EditGroupSubject.w)
      g5.b(Arrays.deepToString(this.a.v.toArray()) + z[1] + Arrays.deepToString(arrayOfString) + z[5] + this.a.n.length() + z[1] + str1.length());
    int i = 0;
    int k;
    for (int j = 0; ; j = k)
    {
      int m;
      if ((i < arrayOfString.length) || (j < this.a.v.size()))
      {
        if ((j < this.a.v.size()) && (i < arrayOfString.length))
        {
          String str3 = EditGroupSubject.c(this.a, arrayOfString[i].trim());
          if (!((yr)this.a.v.get(j)).a.equalsIgnoreCase(str3))
          {
            xr localxr2 = (xr)EditGroupSubject.s.get(str3);
            if (localxr2 != null)
            {
              localArrayList.add(localxr2.c);
              if (EditGroupSubject.w)
                g5.d(z[3] + i + z[2] + localArrayList.get(-1 + localArrayList.size()));
              if (this.a.z == -1)
                this.a.z = i;
              int i4 = this.a.i.getText().toString().indexOf(str3);
              this.a.i.getText().setSpan(new ForegroundColorSpan(-16777216), i4, i4 + str3.length(), 33);
              int i5 = this.a.i.getText().toString().indexOf(str3, i4 + str3.length());
              do
              {
                if (i5 <= -1)
                  break;
                this.a.i.getText().setSpan(new ForegroundColorSpan(-16777216), i5, i5 + str3.length(), 33);
                i5 = this.a.i.getText().toString().indexOf(str3, i5 + str3.length());
              }
              while (!bool);
              if (!bool);
            }
            else
            {
              int i3 = this.a.i.getText().toString().indexOf(str3);
              this.a.i.getText().setSpan(new ForegroundColorSpan(-7829368), i3, i3 + str3.length(), 33);
            }
            if (!bool);
          }
          else
          {
            localArrayList.add(this.a.v.get(j));
          }
          if (!bool);
        }
        else if (i < arrayOfString.length)
        {
          String str2 = EditGroupSubject.c(this.a, arrayOfString[i].trim());
          xr localxr1 = (xr)EditGroupSubject.s.get(str2);
          if (localxr1 != null)
          {
            localArrayList.add(localxr1.c);
            if (this.a.z == -1)
              this.a.z = i;
            if (EditGroupSubject.w)
              g5.d(z[4] + i + z[2] + localArrayList.get(-1 + localArrayList.size()));
            int i1 = this.a.i.getText().toString().indexOf(str2);
            this.a.i.getText().setSpan(new ForegroundColorSpan(-16777216), i1, i1 + str2.length(), 33);
            int i2 = this.a.i.getText().toString().indexOf(str2, i1 + str2.length());
            do
            {
              if (i2 <= -1)
                break;
              this.a.i.getText().setSpan(new ForegroundColorSpan(-16777216), i2, i2 + str2.length(), 33);
              i2 = this.a.i.getText().toString().indexOf(str2, i2 + str2.length());
            }
            while (!bool);
            if (!bool);
          }
          else
          {
            int n = this.a.i.getText().toString().indexOf(str2);
            this.a.i.getText().setSpan(new ForegroundColorSpan(-7829368), n, n + str2.length(), 33);
          }
        }
        k = j + 1;
        m = i + 1;
        if (!bool);
      }
      else
      {
        this.a.D = paramCharSequence.toString();
        this.a.v.clear();
        this.a.v.addAll(localArrayList);
        EditGroupSubject.f(this.a);
        if (EditGroupSubject.w)
        {
          g5.b(z[6] + Arrays.deepToString(localArrayList.toArray()));
          EditGroupSubject.a(this.a, z[0]);
          EditGroupSubject.e(this.a);
        }
        this.a.i.invalidate();
        EditGroupSubject.d(this.a);
        break;
      }
      i = m;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.vr
 * JD-Core Version:    0.6.1
 */