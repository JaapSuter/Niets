package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.io.IOException;

class cr
  implements TextWatcher
{
  private static final String[] z;
  final DeleteAccount a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "\007;Eu\037\006?Js\037L)Hd\b\013;[?\n\005*Lb\037\006&]s\003\0020Nu\017C8Hy\007\006:\t|\004\f5\\`(\f+Gd\031\032\035Ft\016C8[\006C\035Fe\005\027,P@\003\f0LY\005\0051".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "?\032".toCharArray();
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
        m = 107;
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
        m = 99;
        continue;
        m = 94;
        continue;
        m = 41;
        continue;
        m = 16;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 107;
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
      i3 = 99;
      continue;
      i3 = 94;
      continue;
      i3 = 41;
      continue;
      i3 = 16;
    }
  }

  cr(DeleteAccount paramDeleteAccount)
  {
  }

  public void afterTextChanged(Editable paramEditable)
  {
    boolean bool = DialogToastListActivity.f;
    Object localObject = null;
    try
    {
      if ((DeleteAccount.a(this.a) != null) && (jp.c(DeleteAccount.a(this.a)).equalsIgnoreCase(paramEditable.toString())))
      {
        String str3 = DeleteAccount.a(this.a);
        localObject = str3;
      }
      while (true)
      {
        if (this.a.n.getText().toString().equals(""))
        {
          this.a.o.setText(this.a.getString(2131296354));
          if (!bool);
        }
        else if (localObject == null)
        {
          this.a.o.setText(this.a.getString(2131296355));
          if (!bool);
        }
        else
        {
          this.a.o.setText((CharSequence)localObject);
          DeleteAccount.a(this.a, (String)localObject);
          String str1 = this.a.p.getText().toString().replaceAll(z[1], "");
          this.a.p.setText(str1);
        }
        return;
        if ((DeleteAccount.a(this.a) == null) || ((paramEditable != null) && (paramEditable.length() > 0)))
        {
          localObject = jp.b(paramEditable.toString());
        }
        else
        {
          String str2 = DeleteAccount.a(this.a);
          localObject = str2;
        }
      }
    }
    catch (IOException localIOException)
    {
      while (true)
        g5.b(z[0], localIOException);
    }
  }

  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.cr
 * JD-Core Version:    0.6.1
 */