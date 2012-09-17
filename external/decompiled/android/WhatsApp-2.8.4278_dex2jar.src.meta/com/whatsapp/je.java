package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;

class je extends ArrayAdapter<zq>
{
  private static final String[] z;
  final MultipleContactPicker a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "\024\037".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "X^an\004@`qo\027X^ld\003".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
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
        m = 113;
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
        m = 52;
        continue;
        m = 63;
        continue;
        m = 24;
        continue;
        m = 1;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 113;
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
      i3 = 52;
      continue;
      i3 = 63;
      continue;
      i3 = 24;
      continue;
      i3 = 1;
    }
  }

  public je(Context paramContext, int paramInt, List<zq> paramList)
  {
    super(paramInt, paramList, localList);
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool = DialogToastListActivity.f;
    zq localzq = (zq)getItem(paramInt);
    if (MultipleContactPicker.b(localzq))
    {
      localObject1 = new LinearLayout(getContext());
      ((LayoutInflater)getContext().getSystemService(z[1])).inflate(2130903112, (ViewGroup)localObject1, true);
      ((LinearLayout)localObject1).setTag(Integer.valueOf(2));
      return localObject1;
    }
    LinearLayout localLinearLayout;
    if ((paramView == null) || (((Integer)paramView.getTag()).intValue() != 1))
    {
      localLinearLayout = new LinearLayout(getContext());
      ((LayoutInflater)getContext().getSystemService(z[1])).inflate(2130903111, localLinearLayout, true);
      if (!bool)
        break label529;
    }
    label512: label522: label529: for (Object localObject1 = (LinearLayout)paramView; ; localObject1 = localLinearLayout)
    {
      ((LinearLayout)localObject1).setTag(Integer.valueOf(1));
      LoadPhotoImageView localLoadPhotoImageView = (LoadPhotoImageView)((LinearLayout)localObject1).findViewById(2131558625);
      MultipleContactPicker.c(this.a).a(localzq, localLoadPhotoImageView);
      TextView localTextView1 = (TextView)((LinearLayout)localObject1).findViewById(2131558723);
      localTextView1.setText(localzq.b());
      TextView localTextView2 = (TextView)((LinearLayout)localObject1).findViewById(2131558724);
      String str;
      label246: Object localObject2;
      label337: SpannableStringBuilder localSpannableStringBuilder;
      if (localzq.c != null)
      {
        str = localzq.c + z[0];
        localTextView2.setText(str);
        if (App.g(localzq.b))
        {
          localTextView2.setText(2131296619);
          localTextView1.setTextColor(-7829368);
          ((LinearLayout)localObject1).setLongClickable(true);
          ((LinearLayout)localObject1).findViewById(2131558725).setVisibility(8);
          if (!bool);
        }
        else
        {
          if (localzq.c == null)
            break label512;
          localObject2 = localzq.c + z[0];
          localSpannableStringBuilder = v4.b((String)localObject2, this.a.getBaseContext());
          if (localSpannableStringBuilder != null)
            break label522;
        }
      }
      while (true)
      {
        localTextView2.setText((CharSequence)localObject2);
        localTextView1.setTextColor(-16777216);
        ((LinearLayout)localObject1).setLongClickable(false);
        ((LinearLayout)localObject1).findViewById(2131558725).setVisibility(0);
        CheckBox localCheckBox = (CheckBox)((LinearLayout)localObject1).findViewById(2131558725);
        localCheckBox.setOnClickListener(new rx(this));
        if (localzq.l)
        {
          localCheckBox.setChecked(true);
          if (!bool);
        }
        else
        {
          localCheckBox.setChecked(false);
        }
        localCheckBox.setTag(localzq);
        ((LinearLayout)localObject1).setOnClickListener(new sx(this));
        ((LinearLayout)localObject1).setBackgroundDrawable(this.a.getResources().getDrawable(2130838546));
        if (paramInt % 2 == 0)
        {
          ((LinearLayout)localObject1).setBackgroundResource(2130838548);
          if (!bool)
            break;
        }
        ((LinearLayout)localObject1).setBackgroundResource(2130838550);
        break;
        str = z[0];
        break label246;
        localObject2 = z[0];
        break label337;
        localObject2 = localSpannableStringBuilder;
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.je
 * JD-Core Version:    0.6.1
 */