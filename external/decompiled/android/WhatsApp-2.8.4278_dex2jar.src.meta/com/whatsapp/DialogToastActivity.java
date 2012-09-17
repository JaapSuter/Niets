package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Build.VERSION;
import android.os.Bundle;

public class DialogToastActivity extends Activity
  implements lr
{
  private static final String[] z;
  private String a;
  private int b;
  private nr c;
  private ed d;
  private boolean e = true;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "T~P\rQV]m\003\\JNj\030OPT^".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "T~P\rQV]m\003\\JNj\030OPT^%Y".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "]SX��R^NV\rNM[Z\030TOSM\025\022VT[\r^RJK\tNJ_]C\\ZNP\032TMC\031\002R\031[Z\030TO_".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label289;
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
        m = 61;
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
        m = 57;
        continue;
        m = 58;
        continue;
        m = 57;
        continue;
        m = 108;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 61;
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
      i3 = 57;
      continue;
      i3 = 58;
      continue;
      i3 = 57;
      continue;
      i3 = 108;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 61;
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
      i7 = 57;
      continue;
      i7 = 58;
      continue;
      i7 = 57;
      continue;
      i7 = 108;
    }
  }

  static nr a(DialogToastActivity paramDialogToastActivity)
  {
    return paramDialogToastActivity.c;
  }

  public void a(int paramInt)
  {
    this.c = null;
    this.a = getString(paramInt);
    this.b = paramInt;
    if (!isFinishing())
      showDialog(500);
  }

  public void a(int paramInt, nr paramnr)
  {
    this.c = paramnr;
    this.a = getString(paramInt);
    this.b = paramInt;
    if (!isFinishing())
      showDialog(500);
  }

  public void c(String paramString)
  {
    this.c = null;
    this.a = paramString;
    this.b = 0;
    if (!isFinishing())
      showDialog(500);
  }

  public void onBackPressed()
  {
    if ((this.e) || (Build.VERSION.SDK_INT < 11))
    {
      super.onBackPressed();
      if (!DialogToastListActivity.f);
    }
    else
    {
      g5.d(z[2]);
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.d = new ed();
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 500:
    }
    for (Object localObject = super.onCreateDialog(paramInt); ; localObject = new AlertDialog.Builder(this).setMessage(this.a).setNeutralButton(2131296270, new mr(this)).create())
      return localObject;
  }

  protected void onPause()
  {
    App.b(this);
    super.onPause();
    if (this.d.hasMessages(0))
      this.d.removeMessages(0);
    App.nb();
    this.e = false;
  }

  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    super.onRestoreInstanceState(paramBundle);
    this.a = paramBundle.getString(z[0]);
    this.b = paramBundle.getInt(z[1], 0);
    if (this.b != 0)
      this.a = getString(this.b);
  }

  protected void onResume()
  {
    App.a(this);
    super.onResume();
    this.d.sendEmptyMessageDelayed(0, 3000L);
    this.e = true;
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putCharSequence(z[0], this.a);
    paramBundle.putInt(z[1], this.b);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.DialogToastActivity
 * JD-Core Version:    0.6.1
 */