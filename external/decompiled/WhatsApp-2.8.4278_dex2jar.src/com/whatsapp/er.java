package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import java.io.IOException;

class er
  implements View.OnClickListener
{
  private static final String[] z;
  final DeleteAccount a;

  static
  {
    String[] arrayOfString = new String[5];
    char[] arrayOfChar1 = "`\f\0336\013a\b\0240\013+\031\037<\021aF\0240B".toCharArray();
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
      arrayOfChar2 = "$A".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "+\007\002>\035a\033J".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label364;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "X-".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label452;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "`\f\0336\013a\b\0240\013+\031\037<\021aI\0212\026h\f\023s\013v��\032\037\032e\r\036=\030^\f\005<_b\033\030>_G\006\002=\013v\020';\020j\f>=\031k".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label540;
        arrayOfString[4] = new String(arrayOfChar5).intern();
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
        m = 127;
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
        m = 4;
        continue;
        m = 105;
        continue;
        m = 119;
        continue;
        m = 83;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 127;
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
      i3 = 4;
      continue;
      i3 = 105;
      continue;
      i3 = 119;
      continue;
      i3 = 83;
    }
    label364: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 127;
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
      i7 = 4;
      continue;
      i7 = 105;
      continue;
      i7 = 119;
      continue;
      i7 = 83;
    }
    label452: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 127;
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
      i11 = 4;
      continue;
      i11 = 105;
      continue;
      i11 = 119;
      continue;
      i11 = 83;
    }
    label540: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 127;
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
      i15 = 4;
      continue;
      i15 = 105;
      continue;
      i15 = 119;
      continue;
      i15 = 83;
    }
  }

  er(DeleteAccount paramDeleteAccount)
  {
  }

  public void onClick(View paramView)
  {
    String str1 = this.a.n.getText().toString().trim();
    String str2 = this.a.p.getText().toString();
    switch (RegisterPhone.a(str1, str2))
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      int i = Integer.parseInt(str1);
      Object localObject = str2.replaceAll(z[3], "");
      try
      {
        String str3 = jp.a(i, (String)localObject);
        localObject = str3;
        g5.b(z[0] + str1 + z[2] + (String)localObject + z[1] + VerifyNumber.f() + ")");
        DeleteAccount.b(str1);
        DeleteAccount.c((String)localObject);
        gb localgb = new gb(this.a);
        String[] arrayOfString = new String[2];
        arrayOfString[0] = DeleteAccount.a();
        arrayOfString[1] = DeleteAccount.b();
        localgb.execute(arrayOfString);
        while (true)
        {
          return;
          if (!DialogToastListActivity.f)
            break;
          this.a.a(2131296358);
          this.a.n.requestFocus();
          continue;
          this.a.a(2131296356);
          this.a.n.setText("");
          this.a.n.requestFocus();
          continue;
          this.a.a(2131296359);
          this.a.p.requestFocus();
          continue;
          DeleteAccount localDeleteAccount5 = this.a;
          DeleteAccount localDeleteAccount6 = this.a;
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = this.a.o.getText();
          localDeleteAccount5.c(localDeleteAccount6.getString(2131296361, arrayOfObject3));
          this.a.p.requestFocus();
          continue;
          DeleteAccount localDeleteAccount3 = this.a;
          DeleteAccount localDeleteAccount4 = this.a;
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = this.a.o.getText();
          localDeleteAccount3.c(localDeleteAccount4.getString(2131296362, arrayOfObject2));
          this.a.p.requestFocus();
          continue;
          DeleteAccount localDeleteAccount1 = this.a;
          DeleteAccount localDeleteAccount2 = this.a;
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = this.a.o.getText();
          localDeleteAccount1.c(localDeleteAccount2.getString(2131296360, arrayOfObject1));
          this.a.p.requestFocus();
        }
      }
      catch (IOException localIOException)
      {
        while (true)
          g5.b(z[4], localIOException);
      }
    }
  }
}