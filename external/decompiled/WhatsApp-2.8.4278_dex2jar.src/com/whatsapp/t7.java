package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class t7
  implements View.OnClickListener
{
  final ViewSharedContactActivity a;

  t7(ViewSharedContactActivity paramViewSharedContactActivity)
  {
  }

  public void onClick(View paramView)
  {
    ViewSharedContactActivity.a(this.a);
  }
}