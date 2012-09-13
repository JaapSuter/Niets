package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class si
  implements View.OnClickListener
{
  final BroadcastMessageComposer a;

  si(BroadcastMessageComposer paramBroadcastMessageComposer)
  {
  }

  public void onClick(View paramView)
  {
    int i = ((Integer)paramView.getTag()).intValue();
    char c = v4.b(v4.b, i);
    int j = this.a.i.getSelectionStart();
    int k = this.a.i.getSelectionEnd();
    if (j > k);
    while (true)
    {
      StringBuilder localStringBuilder = new StringBuilder(this.a.i.getText().toString());
      localStringBuilder.replace(k, j, Character.toString(c));
      this.a.i.setText(localStringBuilder);
      this.a.i.setSelection(k + 1);
      if (!this.a.p)
      {
        this.a.r.setVisibility(8);
        BroadcastMessageComposer.d(this.a);
      }
      return;
      int m = k;
      k = j;
      j = m;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.si
 * JD-Core Version:    0.6.1
 */