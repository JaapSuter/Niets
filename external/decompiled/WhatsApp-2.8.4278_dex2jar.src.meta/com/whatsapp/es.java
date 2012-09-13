package com.whatsapp;

import android.app.Activity;
import android.text.method.TextKeyListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class es
  implements View.OnClickListener
{
  final b a;

  es(b paramb)
  {
  }

  public void onClick(View paramView)
  {
    b.a(this.a);
    b.a(this.a, false);
    b.b = null;
    this.a.d.removeDialog(50);
    TextKeyListener.clear(this.a.q.getText());
    this.a.dismiss();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.es
 * JD-Core Version:    0.6.1
 */