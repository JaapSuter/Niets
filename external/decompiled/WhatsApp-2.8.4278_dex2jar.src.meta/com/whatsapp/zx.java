package com.whatsapp;

import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import com.google.i18n.phonenumbers.AsYouTypeFormatter;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import java.util.Locale;

public class zx
  implements TextWatcher
{
  private int a;
  private boolean b = false;
  private boolean c;
  private AsYouTypeFormatter d;

  public zx()
  {
    this(Locale.getDefault().getCountry());
  }

  public zx(String paramString)
  {
    if (paramString == null)
      throw new IllegalArgumentException();
    this.d = PhoneNumberUtil.getInstance().getAsYouTypeFormatter(paramString);
  }

  private String a(char paramChar, boolean paramBoolean)
  {
    if (paramBoolean);
    for (String str = this.d.inputDigitAndRememberPosition(paramChar); ; str = this.d.inputDigit(paramChar))
      return str;
  }

  private String a(CharSequence paramCharSequence, int paramInt)
  {
    boolean bool1 = DialogToastListActivity.f;
    int i = paramInt - 1;
    Object localObject1 = null;
    this.d.clear();
    int j = paramCharSequence.length();
    int k = 0;
    boolean bool2 = false;
    label160: char c5;
    for (char c1 = '\000'; ; c1 = c5)
    {
      Object localObject3;
      char c2;
      boolean bool3;
      Object localObject2;
      if (k < j)
      {
        char c3 = paramCharSequence.charAt(k);
        if (PhoneNumberUtils.isNonSeparator(c3))
        {
          if (c1 != 0)
          {
            localObject1 = a(c1, bool2);
            bool2 = false;
          }
          localObject3 = localObject1;
          c2 = c3;
          if (k == i)
            bool2 = true;
          k++;
          if (!bool1)
            break label160;
          bool3 = bool2;
          localObject2 = localObject3;
        }
      }
      while (true)
      {
        if (c2 != 0)
          localObject2 = a(c2, bool3);
        return localObject2;
        char c4 = c1;
        localObject3 = localObject1;
        c2 = c4;
        break;
        bool3 = bool2;
        localObject2 = localObject1;
        c2 = c1;
      }
      c5 = c2;
      localObject1 = localObject3;
    }
  }

  private void a()
  {
    this.c = true;
    this.d.clear();
  }

  private boolean a(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    boolean bool1 = DialogToastListActivity.f;
    int i = paramInt1;
    if (i < paramInt1 + paramInt2)
      if (PhoneNumberUtils.isNonSeparator(paramCharSequence.charAt(i)));
    for (boolean bool2 = true; ; bool2 = false)
    {
      return bool2;
      i++;
      if (!bool1)
        break;
    }
  }

  public void afterTextChanged(Editable paramEditable)
  {
    boolean bool = true;
    try
    {
      if (this.c)
        if (paramEditable.length() != 0)
          this.c = bool;
      while (true)
      {
        return;
        bool = false;
        break;
        if (!this.b)
        {
          String str = a(paramEditable, Selection.getSelectionEnd(paramEditable));
          if (str != null)
          {
            int i = this.d.getRememberedPosition();
            this.b = true;
            paramEditable.replace(0, paramEditable.length(), str, 0, str.length());
            if (str.equals(paramEditable.toString()))
              Selection.setSelection(paramEditable, i);
            this.b = false;
          }
        }
      }
    }
    finally
    {
    }
  }

  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = DialogToastListActivity.f;
    if ((this.b) || (this.c));
    while (true)
    {
      return;
      if ((paramInt2 == 0) && (paramCharSequence.length() == paramInt1))
      {
        this.a = 1;
        if (!bool);
      }
      else if ((paramInt3 == 0) && (paramInt1 + paramInt2 == paramCharSequence.length()) && (paramInt2 > 0))
      {
        this.a = 0;
        if (!bool);
      }
      else if ((paramInt2 > 0) && (!a(paramCharSequence, paramInt1, paramInt2)))
      {
        this.a = 2;
        if (!bool);
      }
      else
      {
        this.a = 3;
      }
    }
  }

  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((this.b) || (this.c));
    while (true)
    {
      return;
      if ((this.a == 3) && (paramInt3 > 0) && (!a(paramCharSequence, paramInt1, paramInt3)))
        this.a = 2;
      if ((this.a == 1) && (paramInt3 > 0) && (a(paramCharSequence, paramInt1, paramInt3)))
      {
        a();
        if (!DialogToastListActivity.f);
      }
      else if (this.a == 3)
      {
        a();
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.zx
 * JD-Core Version:    0.6.1
 */