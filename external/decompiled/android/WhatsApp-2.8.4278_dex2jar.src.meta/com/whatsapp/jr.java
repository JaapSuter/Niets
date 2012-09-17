package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class jr
  implements View.OnClickListener
{
  final DescribeProblemActivity a;

  jr(DescribeProblemActivity paramDescribeProblemActivity)
  {
  }

  public void onClick(View paramView)
  {
    new ib(this.a, DescribeProblemActivity.a(this.a), DescribeProblemActivity.b(this.a).getText().toString()).execute(new String[0]);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.jr
 * JD-Core Version:    0.6.1
 */