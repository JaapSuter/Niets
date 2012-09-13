package com.whatsapp;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

class ok
  implements CompoundButton.OnCheckedChangeListener
{
  private static final String[] z;
  final ContactPickerHelp a;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "\034o\034\035N\nj\032\021".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\nn\021\001J\nu\027\020G\031.\034\027\004\nm\026\026@\feP".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\ni\032\026@\fe".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label288;
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
        m = 43;
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
        m = 1;
        continue;
        m = 127;
        continue;
        m = 117;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 43;
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
      i3 = 1;
      continue;
      i3 = 127;
      continue;
      i3 = 117;
    }
    label288: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 43;
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
      i7 = 105;
      continue;
      i7 = 1;
      continue;
      i7 = 127;
      continue;
      i7 = 117;
    }
  }

  ok(ContactPickerHelp paramContactPickerHelp)
  {
  }

  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    StringBuilder localStringBuilder;
    if (this.a.l)
    {
      this.a.l = false;
      if (!DialogToastListActivity.f);
    }
    else
    {
      localStringBuilder = new StringBuilder().append(z[1]);
      if (!paramBoolean)
        break label100;
    }
    label100: for (String str = z[2]; ; str = z[0])
    {
      g5.b(str);
      App.a(this.a, this.a.h.isChecked());
      new ab(this.a).execute(new String[0]);
      return;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ok
 * JD-Core Version:    0.6.1
 */