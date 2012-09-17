package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ViewFlipper;

final class y4
  implements View.OnClickListener
{
  final ViewFlipper a;
  final ViewGroup b;

  y4(ViewFlipper paramViewFlipper, ViewGroup paramViewGroup)
  {
  }

  public void onClick(View paramView)
  {
    v4.b = 2;
    this.a.setDisplayedChild(v4.b);
    v4.a(this.b, v4.b);
  }
}