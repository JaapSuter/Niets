package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;

class h7
  implements TextWatcher
{
  final VerifySms a;

  h7(VerifySms paramVerifySms)
  {
  }

  public void afterTextChanged(Editable paramEditable)
  {
  }

  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramCharSequence != null) && (paramCharSequence.length() == 3))
      if (VerifySms.a(this.a, paramCharSequence.toString()))
      {
        fc localfc = new fc(this.a);
        String[] arrayOfString = new String[1];
        arrayOfString[0] = paramCharSequence.toString();
        localfc.execute(arrayOfString);
        if (!DialogToastListActivity.f);
      }
      else if (!this.a.isFinishing())
      {
        this.a.showDialog(29);
      }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.h7
 * JD-Core Version:    0.6.1
 */