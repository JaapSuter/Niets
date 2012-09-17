package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class fe extends ArrayAdapter<zq>
{
  private static final String z;
  private ArrayList<zq> a;
  private LayoutInflater b;
  private Filter c = new ve(this, null);
  final ContactPicker d;

  static
  {
    char[] arrayOfChar = "\003W".toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    if (i <= j)
    {
      z = new String(arrayOfChar).intern();
      return;
    }
    int k = arrayOfChar[j];
    int m;
    switch (j % 5)
    {
    default:
      m = 125;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar[j] = (char)(m ^ k);
      j++;
      break;
      m = 35;
      continue;
      m = 119;
      continue;
      m = 91;
      continue;
      m = 27;
    }
  }

  public fe(Context paramContext, ArrayList<zq> paramArrayList)
  {
    super(paramArrayList, 2130903060, localList);
    this.a = localList;
    this.b = LayoutInflater.from(paramArrayList);
  }

  public zq a(int paramInt)
  {
    return (zq)this.a.get(paramInt);
  }

  public int getCount()
  {
    return this.a.size();
  }

  public Filter getFilter()
  {
    return this.c;
  }

  public long getItemId(int paramInt)
  {
    return paramInt * 1024;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool1 = DialogToastListActivity.f;
    zq localzq = a(paramInt);
    Object localObject1;
    if (ContactPicker.c(localzq))
    {
      localObject1 = new LinearLayout(getContext());
      this.b.inflate(2130903112, (ViewGroup)localObject1, true);
      ((LinearLayout)localObject1).setTag(Integer.valueOf(3));
      ((LinearLayout)localObject1).findViewById(2131558726).setClickable(true);
      ((LinearLayout)localObject1).setBackgroundResource(2130838550);
      return localObject1;
    }
    boolean bool2 = ContactPicker.b(this.d, paramInt);
    boolean bool3 = ContactPicker.d(this.d, paramInt);
    if (paramView == null)
    {
      if ((bool2) || (ContactPicker.c(this.d, paramInt)))
      {
        paramView = this.b.inflate(2130903061, null);
        if (bool2)
        {
          paramView.setTag(Integer.valueOf(2));
          if (!bool1);
        }
        else
        {
          paramView.findViewById(2131558559).setVisibility(8);
          ((TextView)paramView.findViewById(2131558561)).setText(2131296944);
          ((ImageView)paramView.findViewById(2131558560)).setImageResource(2130838470);
          paramView.setTag(Integer.valueOf(4));
        }
        paramView.setBackgroundResource(2130838548);
        if (!bool1)
          break label676;
      }
      if (bool3)
      {
        paramView = this.b.inflate(2130903059, null);
        AbsListView.LayoutParams localLayoutParams2 = new AbsListView.LayoutParams(-2, (int)this.d.getResources().getDimension(2131361807));
        paramView.findViewById(2131558551).setLayoutParams(localLayoutParams2);
        paramView.findViewById(2131558552).setClickable(true);
      }
    }
    label296: label313: int i;
    View localView1;
    View localView3;
    switch (ContactPicker.c(this.d))
    {
    default:
      ((TextView)paramView.findViewById(2131558552)).setText(2131296458);
      paramView.setBackgroundResource(2130838548);
      paramView.setTag(Integer.valueOf(5));
      if (bool1)
      {
        paramView = this.b.inflate(2130903060, paramViewGroup, false);
        paramView.setTag(Integer.valueOf(1));
        if (bool1)
        {
          i = ((Integer)paramView.getTag()).intValue();
          if (bool2)
          {
            if (i != 2)
            {
              paramView = this.b.inflate(2130903061, null);
              paramView.setBackgroundResource(2130838548);
              paramView.setTag(Integer.valueOf(2));
              if (!bool1)
                break;
            }
          }
          else if (ContactPicker.c(this.d, paramInt))
          {
            if (i != 4)
            {
              paramView = this.b.inflate(2130903061, null);
              ((ImageView)paramView.findViewById(2131558560)).setImageResource(2130838470);
              paramView.findViewById(2131558559).setVisibility(8);
              ((TextView)paramView.findViewById(2131558561)).setText(2131296944);
              paramView.setBackgroundResource(2130838548);
              paramView.setTag(Integer.valueOf(4));
              if (!bool1)
                break;
            }
          }
          else
          {
            localView1 = paramView;
            if (!bool3)
              break label1187;
            if (i != 5)
            {
              localView1 = this.b.inflate(2130903059, null);
              AbsListView.LayoutParams localLayoutParams1 = new AbsListView.LayoutParams(-2, (int)this.d.getResources().getDimension(2131361807));
              localView1.findViewById(2131558551).setLayoutParams(localLayoutParams1);
              localView1.findViewById(2131558552).setClickable(true);
              localView1.setBackgroundResource(2130838548);
              localView1.setTag(Integer.valueOf(5));
            }
            localView3 = localView1;
            switch (ContactPicker.c(this.d))
            {
            default:
              label624: ((TextView)localView3.findViewById(2131558552)).setText(2131296458);
              if (!bool1);
              break;
            case 0:
            case 1:
            case 2:
            }
          }
        }
      }
      break;
    case 0:
    case 1:
    case 2:
    }
    label1172: label1180: label1187: for (paramView = localView3; ; paramView = localView1)
    {
      if (i != 1)
      {
        paramView = this.b.inflate(2130903060, paramViewGroup, false);
        paramView.setTag(Integer.valueOf(1));
      }
      label676: for (View localView2 = paramView; ; localView2 = localView3)
      {
        if ((!bool2) && (!ContactPicker.c(this.d, paramInt)) && (!bool3))
          break label852;
        localObject1 = localView2;
        break;
        ((TextView)paramView.findViewById(2131558552)).setText(2131296456);
        if (!bool1)
          break label313;
        ((TextView)paramView.findViewById(2131558552)).setText(2131296457);
        if (!bool1)
          break label313;
        ((TextView)paramView.findViewById(2131558552)).setText(2131296458);
        if (!bool1)
          break label313;
        break label296;
        ((TextView)localView3.findViewById(2131558552)).setText(2131296456);
        if (bool1)
        {
          ((TextView)localView3.findViewById(2131558552)).setText(2131296457);
          if (bool1)
          {
            ((TextView)localView3.findViewById(2131558552)).setText(2131296458);
            if (bool1)
              break label624;
          }
        }
      }
      label852: LoadPhotoImageView localLoadPhotoImageView = (LoadPhotoImageView)localView2.findViewById(2131558553);
      ContactPicker.m(this.d).a(localzq, localLoadPhotoImageView);
      TextView localTextView1 = (TextView)localView2.findViewById(2131558555);
      TextView localTextView2 = (TextView)localView2.findViewById(2131558556);
      TextView localTextView3 = (TextView)localView2.findViewById(2131558554);
      Object localObject2;
      label1075: SpannableStringBuilder localSpannableStringBuilder;
      if (localzq.o())
      {
        Object localObject3 = v4.a(localzq.b(), this.d);
        if (localObject3 == null)
          localObject3 = localzq.b();
        localTextView1.setText((CharSequence)localObject3);
        localTextView2.setText(eu.j(localzq.b));
        localTextView3.setText("");
        localTextView1.setTextColor(-16777216);
        localView2.setLongClickable(false);
        if (!bool1);
      }
      else
      {
        localTextView1.setText(localzq.b());
        if (App.g(localzq.b))
        {
          localTextView2.setText(2131296619);
          localTextView1.setTextColor(-7829368);
          localView2.setLongClickable(true);
          if (!bool1);
        }
        else
        {
          if (localzq.c == null)
            break label1172;
          localObject2 = localzq.c + z;
          localSpannableStringBuilder = v4.b((String)localObject2, this.d.getBaseContext());
          if (localSpannableStringBuilder != null)
            break label1180;
        }
      }
      while (true)
      {
        localTextView2.setText((CharSequence)localObject2);
        localTextView1.setTextColor(-16777216);
        localView2.setLongClickable(false);
        CharSequence localCharSequence = localzq.a(this.d.getResources());
        if (localCharSequence != null)
          localTextView3.setText(localCharSequence);
        if (paramInt % 2 == 0)
        {
          localView2.setBackgroundResource(2130838548);
          if (!bool1);
        }
        else
        {
          localView2.setBackgroundResource(2130838550);
        }
        localObject1 = localView2;
        break;
        localObject2 = z;
        break label1075;
        localObject2 = localSpannableStringBuilder;
      }
    }
  }

  public boolean hasStableIds()
  {
    return true;
  }
}