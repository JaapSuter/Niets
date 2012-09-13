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