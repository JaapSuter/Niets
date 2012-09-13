package com.whatsapp;

import android.app.Activity;
import android.text.method.TextKeyListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class ls
  implements View.OnClickListener
{
  final b a;

  private ls(b paramb)
  {
  }

  ls(b paramb, es parames)
  {
    this(paramb);
  }

  public void onClick(View paramView)
  {
    b.a(this.a);
    String str = this.a.q.getText().toString();
    if ((str != null) && (str.trim().length() > 0))
    {
      b.b(this.a).a(str.trim());
      b.a(this.a, false);
      b.b = null;
      this.a.dismiss();
      if (!DialogToastListActivity.f);
    }
    else
    {
      App.a(this.a.getContext(), this.a.t, 0);
    }
    this.a.d.removeDialog(50);
    TextKeyListener.clear(this.a.q.getText());
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ls
 * JD-Core Version:    0.6.1
 */