package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;

public class SmsDefaultAppWarning extends DialogToastActivity
{
  private static final String z;

  static
  {
    char[] arrayOfChar = "\0043\022\032c\021?\024\022r\026.\021\tg\0050\b\020aX=\023\033g\003;".toCharArray();
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
      m = 6;
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
      m = 119;
      continue;
      m = 94;
      continue;
      m = 97;
      continue;
      m = 126;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    g5.b(z);
    showDialog(0);
  }

  public Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 0:
    }
    for (Object localObject = super.onCreateDialog(paramInt); ; localObject = new AlertDialog.Builder(this).setMessage(2131296575).setNeutralButton(2131296572, new d4(this)).setNegativeButton(2131296573, new c4(this)).setPositiveButton(2131296574, new b4(this)).setOnCancelListener(new a4(this)).create())
      return localObject;
  }
}