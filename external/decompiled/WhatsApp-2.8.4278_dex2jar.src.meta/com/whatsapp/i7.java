package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

class i7
  implements View.OnClickListener
{
  private static final String[] z;
  final VerifySms a;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "\035\007\032:C\022\024\007:F\016M\0326T\036\007\033'\n\b\001U".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    char[] arrayOfChar4;
    int i9;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\035\007\032:C\022\024\007:F\016M\0326Q\031\033\0366W\002\004\021".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "D\f\035>G\016\020U".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label325;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "KJ".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label417;
        arrayOfString[3] = new String(arrayOfChar4).intern();
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
        m = 37;
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
        m = 107;
        continue;
        m = 98;
        continue;
        m = 104;
        continue;
        m = 83;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 37;
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
      i3 = 107;
      continue;
      i3 = 98;
      continue;
      i3 = 104;
      continue;
      i3 = 83;
    }
    label325: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 37;
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
      i7 = 107;
      continue;
      i7 = 98;
      continue;
      i7 = 104;
      continue;
      i7 = 83;
    }
    label417: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 37;
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
      i11 = 107;
      continue;
      i11 = 98;
      continue;
      i11 = 104;
      continue;
      i11 = 83;
    }
  }

  i7(VerifySms paramVerifySms)
  {
  }

  public void onClick(View paramView)
  {
    boolean bool = DialogToastListActivity.f;
    if (VerifySms.y() == 11)
    {
      g5.b(z[1]);
      String str = VerifySms.l(this.a).getText().toString();
      if (VerifySms.a(this.a, str))
      {
        VerifySms.m(this.a).setText(this.a.getString(2131296378));
        fc localfc = new fc(this.a);
        String[] arrayOfString = new String[1];
        arrayOfString[0] = str;
        localfc.execute(arrayOfString);
        if (!bool);
      }
      else if (!this.a.isFinishing())
      {
        this.a.showDialog(29);
      }
      if (!bool);
    }
    else
    {
      g5.b(z[0] + VerifySms.d(this.a) + z[2] + VerifySms.e(this.a) + z[3] + VerifyNumber.f() + ")");
      new dc(this.a).execute(new String[0]);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.i7
 * JD-Core Version:    0.6.1
 */