package com.whatsapp;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.widget.MultiAutoCompleteTextView.Tokenizer;

public class as
  implements MultiAutoCompleteTextView.Tokenizer
{
  private static final String z;

  static
  {
    char[] arrayOfChar = "\023\024".toCharArray();
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
      m = 73;
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
      m = 63;
      continue;
      m = 52;
      continue;
      m = 59;
      continue;
      m = 83;
    }
  }

  public int findTokenEnd(CharSequence paramCharSequence, int paramInt)
  {
    boolean bool = DialogToastListActivity.f;
    int i = paramCharSequence.length();
    int j = paramInt;
    if (j < i)
      if ((paramCharSequence.charAt(j) != ',') || (j - 1 <= 0) || (paramCharSequence.charAt(j - 1) != '"'));
    while (true)
    {
      return j;
      j++;
      if (!bool)
        break;
      j = i;
    }
  }

  public int findTokenStart(CharSequence paramCharSequence, int paramInt)
  {
    boolean bool = DialogToastListActivity.f;
    int i = paramInt;
    do
    {
      if ((i <= 0) || (paramCharSequence.charAt(i - 1) == ','))
        break;
      i--;
    }
    while (!bool);
    do
    {
      if ((i >= paramInt) || (paramCharSequence.charAt(i) != ' '))
        break;
      i++;
    }
    while (!bool);
    return i;
  }

  public CharSequence terminateToken(CharSequence paramCharSequence)
  {
    boolean bool = DialogToastListActivity.f;
    int i = paramCharSequence.length();
    do
    {
      if ((i <= 0) || (paramCharSequence.charAt(i - 1) != ' '))
        break;
      i--;
    }
    while (!bool);
    Object localObject;
    if ((i > 0) && (paramCharSequence.charAt(i - 1) == ',') && (i - 1 > 0) && (paramCharSequence.charAt(i - 1) == '"'))
    {
      localObject = new SpannableStringBuilder("\"" + paramCharSequence + "\"");
      ((SpannableStringBuilder)localObject).setSpan(new StyleSpan(1), 1, 1 + paramCharSequence.length(), 33);
    }
    while (true)
    {
      return localObject;
      if ((paramCharSequence instanceof Spanned))
      {
        localObject = new SpannableString(paramCharSequence + z);
        TextUtils.copySpansFrom((Spanned)paramCharSequence, 0, paramCharSequence.length(), Object.class, (Spannable)localObject, 0);
      }
      else
      {
        localObject = new SpannableStringBuilder("\"" + paramCharSequence + "\"" + z);
        ((SpannableStringBuilder)localObject).setSpan(new StyleSpan(1), 1, 1 + paramCharSequence.length(), 33);
      }
    }
  }
}