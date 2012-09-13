package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.io.IOException;

class g2
  implements TextWatcher
{
  private static final String[] z;
  final RegisterPhone a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "O]l\005*I]yC)UWe\tv^W~\002-OA|\r-^Pn\036v\\^\t+I]s\030:UYe\013<Y\030g\0036VM{/6HV\036 ~Wo\ty[Jd\001y~W~\002-OA[\0046S]B\002?R\030m\r0Q]o".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "a|".toCharArray();
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
        m = 89;
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
        m = 61;
        continue;
        m = 56;
        continue;
        m = 11;
        continue;
        m = 108;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 89;
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
      i3 = 61;
      continue;
      i3 = 56;
      continue;
      i3 = 11;
      continue;
      i3 = 108;
    }
  }

  g2(RegisterPhone paramRegisterPhone)
  {
  }

  public void afterTextChanged(Editable paramEditable)
  {
    boolean bool = DialogToastListActivity.f;
    Object localObject = null;
    try
    {
      if ((RegisterPhone.b(this.a) != null) && (jp.c(RegisterPhone.b(this.a)).equalsIgnoreCase(paramEditable.toString())))
      {
        String str3 = RegisterPhone.b(this.a);
        localObject = str3;
      }
      while (true)
      {
        if (this.a.B.getText().toString().equals(""))
        {
          this.a.C.setText(this.a.getString(2131296354));
          if (!bool);
        }
        else if (localObject == null)
        {
          this.a.C.setText(this.a.getString(2131296355));
          if (!bool);
        }
        else
        {
          this.a.C.setText((CharSequence)localObject);
          RegisterPhone.a(this.a, (String)localObject);
          String str1 = this.a.D.getText().toString().replaceAll(z[1], "");
          this.a.D.setText(str1);
        }
        return;
        if ((RegisterPhone.b(this.a) == null) || ((paramEditable != null) && (paramEditable.length() > 0)))
        {
          localObject = jp.b(paramEditable.toString());
        }
        else
        {
          String str2 = RegisterPhone.b(this.a);
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
 * Qualified Name:     com.whatsapp.g2
 * JD-Core Version:    0.6.1
 */