package com.whatsapp;

import android.widget.ImageView;
import java.util.Stack;

class rj
{
  private Stack<sj> a = new Stack();
  final pj b;

  rj(pj parampj)
  {
  }

  static Stack a(rj paramrj)
  {
    return paramrj.a;
  }

  public void a(ImageView paramImageView)
  {
    boolean bool = DialogToastListActivity.f;
    int i = 0;
    while (true)
    {
      int j;
      if (i < this.a.size())
      {
        if (((sj)this.a.get(i)).b == paramImageView)
        {
          this.a.remove(i);
          if (!bool);
        }
        else
        {
          j = i + 1;
          if (!bool);
        }
      }
      else
      {
        return;
        i = j;
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.rj
 * JD-Core Version:    0.6.1
 */