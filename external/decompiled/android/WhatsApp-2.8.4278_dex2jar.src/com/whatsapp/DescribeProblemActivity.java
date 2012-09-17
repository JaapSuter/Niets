package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DescribeProblemActivity extends DialogToastActivity
{
  private static final String[] z;
  private Button f;
  private Button g;
  private String h;
  private String i;
  private EditText j;
  private int k;
  private final TextWatcher l = new kr(this);

  static
  {
    String[] arrayOfString = new String[7];
    char[] arrayOfChar1 = "JYU)s\\SDesOIU/".toCharArray();
    int m = arrayOfChar1.length;
    int n = 0;
    char[] arrayOfChar2;
    int i4;
    char[] arrayOfChar3;
    int i8;
    char[] arrayOfChar4;
    int i12;
    char[] arrayOfChar5;
    int i16;
    char[] arrayOfChar6;
    int i20;
    char[] arrayOfChar7;
    int i24;
    if (m <= n)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "JYU)s\\SDegKOR8lW".toCharArray();
      int i3 = arrayOfChar2.length;
      i4 = 0;
      if (i3 <= i4)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "JYU)s\\SDeqKOS'f".toCharArray();
        int i7 = arrayOfChar3.length;
        i8 = 0;
        if (i7 > i8)
          break label440;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "JYU)s\\SD&fC\023E8fOHC".toCharArray();
        int i11 = arrayOfChar4.length;
        i12 = 0;
        if (i11 > i12)
          break label528;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "MSKdtF]R9b^L\b\016f]_T#aKlT%aBYK\013`ZUP#wW\022U/qXYT9wOHS9".toCharArray();
        int i15 = arrayOfChar5.length;
        i16 = 0;
        if (i15 > i16)
          break label616;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "MSKdtF]R9b^L\b\016f]_T#aKlT%aBYK\013`ZUP#wW\022@8lC".toCharArray();
        int i19 = arrayOfChar6.length;
        i20 = 0;
        if (i19 > i20)
          break label704;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "MSKdtF]R9b^L\b\016f]_T#aKlT%aBYK\013`ZUP#wW\022R3sK".toCharArray();
        int i23 = arrayOfChar7.length;
        i24 = 0;
        if (i23 > i24)
          break label792;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int i1 = arrayOfChar1[n];
      int i2;
      switch (n % 5)
      {
      default:
        i2 = 3;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[n] = (char)(i2 ^ i1);
        n++;
        break;
        i2 = 46;
        continue;
        i2 = 60;
        continue;
        i2 = 38;
        continue;
        i2 = 74;
      }
    }
    int i5 = arrayOfChar2[i4];
    int i6;
    switch (i4 % 5)
    {
    default:
      i6 = 3;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i4] = (char)(i6 ^ i5);
      i4++;
      break;
      i6 = 46;
      continue;
      i6 = 60;
      continue;
      i6 = 38;
      continue;
      i6 = 74;
    }
    label440: int i9 = arrayOfChar3[i8];
    int i10;
    switch (i8 % 5)
    {
    default:
      i10 = 3;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i8] = (char)(i10 ^ i9);
      i8++;
      break;
      i10 = 46;
      continue;
      i10 = 60;
      continue;
      i10 = 38;
      continue;
      i10 = 74;
    }
    label528: int i13 = arrayOfChar4[i12];
    int i14;
    switch (i12 % 5)
    {
    default:
      i14 = 3;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i12] = (char)(i14 ^ i13);
      i12++;
      break;
      i14 = 46;
      continue;
      i14 = 60;
      continue;
      i14 = 38;
      continue;
      i14 = 74;
    }
    label616: int i17 = arrayOfChar5[i16];
    int i18;
    switch (i16 % 5)
    {
    default:
      i18 = 3;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i16] = (char)(i18 ^ i17);
      i16++;
      break;
      i18 = 46;
      continue;
      i18 = 60;
      continue;
      i18 = 38;
      continue;
      i18 = 74;
    }
    label704: int i21 = arrayOfChar6[i20];
    int i22;
    switch (i20 % 5)
    {
    default:
      i22 = 3;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i20] = (char)(i22 ^ i21);
      i20++;
      break;
      i22 = 46;
      continue;
      i22 = 60;
      continue;
      i22 = 38;
      continue;
      i22 = 74;
    }
    label792: int i25 = arrayOfChar7[i24];
    int i26;
    switch (i24 % 5)
    {
    default:
      i26 = 3;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i24] = (char)(i26 ^ i25);
      i24++;
      break;
      i26 = 46;
      continue;
      i26 = 60;
      continue;
      i26 = 38;
      continue;
      i26 = 74;
    }
  }

  static String a(DescribeProblemActivity paramDescribeProblemActivity)
  {
    return paramDescribeProblemActivity.h;
  }

  static EditText b(DescribeProblemActivity paramDescribeProblemActivity)
  {
    return paramDescribeProblemActivity.j;
  }

  static Button c(DescribeProblemActivity paramDescribeProblemActivity)
  {
    return paramDescribeProblemActivity.g;
  }

  static String d(DescribeProblemActivity paramDescribeProblemActivity)
  {
    return paramDescribeProblemActivity.i;
  }

  public void onCreate(Bundle paramBundle)
  {
    g5.b(z[3]);
    super.onCreate(paramBundle);
    setContentView(2130903087);
    this.j = ((EditText)findViewById(2131558653));
    this.j.addTextChangedListener(this.l);
    this.j.setGravity(TextEmojiLabel.a(this.j.getText().toString()));
    this.f = ((Button)findViewById(2131558654));
    this.f.setOnClickListener(new ir(this));
    this.g = ((Button)findViewById(2131558652));
    this.g.setOnClickListener(new jr(this));
    Intent localIntent = getIntent();
    this.h = localIntent.getStringExtra(z[5]);
    this.i = localIntent.getStringExtra(z[4]);
    TextView localTextView = (TextView)findViewById(2131558651);
    this.k = localIntent.getIntExtra(z[6], 0);
    if (this.k == 1)
    {
      localTextView.setText(2131296994);
      if (!DialogToastListActivity.f);
    }
    else
    {
      localTextView.setText(2131296993);
    }
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    Object localObject;
    switch (paramInt)
    {
    default:
      localObject = super.onCreateDialog(paramInt);
    case 1:
    }
    while (true)
    {
      return localObject;
      localObject = new ProgressDialog(this);
      ((ProgressDialog)localObject).setMessage(getString(2131296337));
      ((ProgressDialog)localObject).setIndeterminate(true);
      ((ProgressDialog)localObject).setCancelable(false);
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    g5.b(z[1]);
  }

  public void onPause()
  {
    super.onPause();
    g5.b(z[0]);
  }

  public void onResume()
  {
    super.onResume();
    g5.b(z[2]);
  }
}