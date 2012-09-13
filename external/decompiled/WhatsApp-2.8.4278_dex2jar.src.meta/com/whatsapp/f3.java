package com.whatsapp;

import android.preference.Preference;
import android.text.SpannableStringBuilder;

class f3
  implements ms
{
  private static final String z;
  final e3 a;

  static
  {
    char[] arrayOfChar = "ty".toCharArray();
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
      m = 124;
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
      m = 78;
      continue;
      m = 89;
      continue;
      m = 66;
      continue;
      m = 115;
    }
  }

  f3(e3 parame3)
  {
  }

  public void a(String paramString)
  {
    if (paramString.length() == 0)
      return;
    App.Mb.a(paramString);
    App.h(paramString);
    Object localObject = this.a.b.getString(2131296691) + z + paramString;
    SpannableStringBuilder localSpannableStringBuilder = v4.a((String)localObject, this.a.b);
    Preference localPreference = this.a.a;
    if (localSpannableStringBuilder == null);
    while (true)
    {
      localPreference.setTitle((CharSequence)localObject);
      break;
      localObject = localSpannableStringBuilder;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.f3
 * JD-Core Version:    0.6.1
 */