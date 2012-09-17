package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;

class f7
  implements DialogInterface.OnClickListener
{
  final EditText a;
  final VerifySms b;

  f7(VerifySms paramVerifySms, EditText paramEditText)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    String str = this.a.getText().toString().trim();
    if ((str == null) || (str == "") || (str.length() != 3))
    {
      this.b.removeDialog(28);
      this.b.showDialog(29);
      if (!DialogToastListActivity.f);
    }
    else
    {
      this.b.removeDialog(28);
      fc localfc = new fc(this.b);
      String[] arrayOfString = new String[1];
      arrayOfString[0] = str;
      localfc.execute(arrayOfString);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.f7
 * JD-Core Version:    0.6.1
 */