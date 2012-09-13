package com.whatsapp;

import android.widget.ImageView;
import java.util.Stack;

class s5
{
  private Stack<t5> a = new Stack();
  final q5 b;

  s5(q5 paramq5)
  {
  }

  static Stack a(s5 params5)
  {
    return params5.a;
  }

  public void a(ImageView paramImageView)
  {
    int i = g5.n;
    int j = 0;
    while (true)
    {
      int k;
      if (j < this.a.size())
      {
        if (((t5)this.a.get(j)).c == paramImageView)
        {
          this.a.remove(j);
          if (i == 0);
        }
        else
        {
          k = j + 1;
          if (i == 0);
        }
      }
      else
      {
        return;
        j = k;
      }
    }
  }
}