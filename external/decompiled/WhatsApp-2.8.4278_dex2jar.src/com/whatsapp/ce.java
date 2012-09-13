package com.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat;
import java.util.List;

class ce extends ArrayAdapter<zq>
{
  private static final String[] z;
  final BlockList a;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "33!\034\034=6=\013X4-<\020\005~".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "=>7\020\002%��'\021\021=>:\032\005".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\004\f".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label289;
        arrayOfString[2] = new String(arrayOfChar3).intern();
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
        m = 119;
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
        m = 81;
        continue;
        m = 95;
        continue;
        m = 78;
        continue;
        m = 127;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 119;
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
      i3 = 81;
      continue;
      i3 = 95;
      continue;
      i3 = 78;
      continue;
      i3 = 127;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 119;
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
      i7 = 81;
      continue;
      i7 = 95;
      continue;
      i7 = 78;
      continue;
      i7 = 127;
    }
  }

  public ce(Context paramContext, int paramInt, List<zq> paramList)
  {
    super(paramInt, paramList, localList);
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool = DialogToastListActivity.f;
    zq localzq = (zq)getItem(paramInt);
    LinearLayout localLinearLayout1;
    if (paramView == null)
    {
      localLinearLayout1 = new LinearLayout(getContext());
      ((LayoutInflater)getContext().getSystemService(z[1])).inflate(2130903060, localLinearLayout1, true);
      localLinearLayout1.findViewById(2131558554).setVisibility(8);
      if (!bool)
        break label241;
    }
    label241: for (LinearLayout localLinearLayout2 = (LinearLayout)paramView; ; localLinearLayout2 = localLinearLayout1)
    {
      LoadPhotoImageView localLoadPhotoImageView = (LoadPhotoImageView)localLinearLayout2.findViewById(2131558553);
      BlockList.a(this.a).a(localzq, localLoadPhotoImageView);
      ((TextView)localLinearLayout2.findViewById(2131558555)).setText(localzq.b());
      TextView localTextView = (TextView)localLinearLayout2.findViewById(2131558556);
      Object localObject = localzq.a();
      try
      {
        PhoneNumberUtil localPhoneNumberUtil = PhoneNumberUtil.getInstance();
        String str = localPhoneNumberUtil.format(localPhoneNumberUtil.parse((String)localObject, z[2]), PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL);
        localObject = str;
        localTextView.setText((CharSequence)localObject);
        if (paramInt % 2 == 0)
        {
          localLinearLayout2.setBackgroundResource(2130838548);
          if (!bool);
        }
        else
        {
          localLinearLayout2.setBackgroundResource(2130838550);
        }
        return localLinearLayout2;
      }
      catch (Exception localException)
      {
        while (true)
          g5.a(z[0] + (String)localObject, localException);
      }
    }
  }
}