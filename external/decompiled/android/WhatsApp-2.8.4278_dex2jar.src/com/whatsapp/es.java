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