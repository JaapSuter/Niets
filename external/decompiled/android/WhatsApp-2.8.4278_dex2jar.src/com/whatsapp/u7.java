package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class u7
  implements View.OnClickListener
{
  final ViewSharedContactActivity a;

  u7(ViewSharedContactActivity paramViewSharedContactActivity)
  {
  }

  public void onClick(View paramView)
  {
    ViewSharedContactActivity.b(this.a);
  }
}