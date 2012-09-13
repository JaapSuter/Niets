package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class mp
  implements AdapterView.OnItemClickListener
{
  private static final String[] z;
  final CountryPicker a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "\nm".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\naI+<\033wc+)\004k".toCharArray();
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
        m = 72;
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
        m = 105;
        continue;
        m = 14;
        continue;
        m = 60;
        continue;
        m = 69;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 72;
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
      i3 = 105;
      continue;
      i3 = 14;
      continue;
      i3 = 60;
      continue;
      i3 = 69;
    }
  }

  mp(CountryPicker paramCountryPicker)
  {
  }

  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    try
    {
      op localop = (op)paramAdapterView.getItemAtPosition(paramInt);
      Intent localIntent = new Intent();
      String str1 = localop.a;
      String str2 = localop.b;
      localIntent.putExtra(z[0], str2);
      localIntent.putExtra(z[1], str1);
      this.a.setResult(-1, localIntent);
      this.a.finish();
      label77: return;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      break label77;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.mp
 * JD-Core Version:    0.6.1
 */