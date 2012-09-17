package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;

class js
  implements View.OnClickListener
{
  final b a;

  js(b paramb)
  {
  }

  public void onClick(View paramView)
  {
    this.a.l.setVisibility(8);
    int i = ((Integer)paramView.getTag()).intValue();
    char c = v4.b(v4.b, i);
    int j = this.a.q.getSelectionStart();
    int k = this.a.q.getSelectionEnd();
    if (j > k);
    while (true)
    {
      StringBuilder localStringBuilder = new StringBuilder(this.a.q.getText().toString());
      localStringBuilder.replace(k, j, Character.toString(c));
      if ((this.a.r > 0) && (localStringBuilder.length() > this.a.r));
      while (true)
      {
        return;
        this.a.q.setText(localStringBuilder);
        if (k < this.a.q.length())
          this.a.q.setSelection(k + 1);
      }
      int m = k;
      k = j;
      j = m;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.js
 * JD-Core Version:    0.6.1
 */