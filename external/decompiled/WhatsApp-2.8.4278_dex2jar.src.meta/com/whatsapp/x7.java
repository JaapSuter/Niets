package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.Iterator;

class x7
  implements View.OnClickListener
{
  final WebImagePicker a;

  x7(WebImagePicker paramWebImagePicker)
  {
  }

  public void onClick(View paramView)
  {
    boolean bool = DialogToastListActivity.f;
    String str = (String)paramView.getTag();
    if (str == null)
      return;
    while (true)
      if (WebImagePicker.a(this.a) != null)
      {
        Iterator localIterator = WebImagePicker.b(this.a).iterator();
        if (localIterator.hasNext())
        {
          w7 localw7 = (w7)localIterator.next();
          if (str.equals(localw7.a))
          {
            WebImagePicker.a(this.a, localw7);
            if (!bool);
          }
          else
          {
            if (!bool)
              break;
          }
        }
      }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.x7
 * JD-Core Version:    0.6.1
 */