package com.whatsapp;

import android.text.SpannableStringBuilder;
import android.widget.TextView;

class cz
  implements ms
{
  final bz a;

  cz(bz parambz)
  {
  }

  public void a(String paramString)
  {
    if (paramString.length() == 0)
      return;
    App.Mb.a(paramString);
    App.h(paramString);
    SpannableStringBuilder localSpannableStringBuilder = v4.a(paramString, this.a.a);
    TextView localTextView = ProfileInfoActivity.a(this.a.a);
    if (localSpannableStringBuilder == null);
    while (true)
    {
      localTextView.setText(paramString);
      break;
      paramString = localSpannableStringBuilder;
    }
  }
}