package com.whatsapp;

import android.widget.Filter;
import android.widget.Filter.FilterResults;
import java.util.ArrayList;
import java.util.ListIterator;

class xe extends Filter
{
  final oe a;

  private xe(oe paramoe)
  {
  }

  xe(oe paramoe, fd paramfd)
  {
    this(paramoe);
  }

  protected Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    boolean bool = DialogToastListActivity.f;
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    if ((paramCharSequence != null) && (paramCharSequence.length() > 0))
    {
      ArrayList localArrayList = (ArrayList)this.a.c.h.clone();
      ListIterator localListIterator = localArrayList.listIterator();
      do
      {
        if (!localListIterator.hasNext())
          break;
        xr localxr = (xr)localListIterator.next();
        if ((!localxr.c.a.toLowerCase().contains(paramCharSequence.toString().toLowerCase())) || (EditGroupSubject.u.contains(localxr)))
          localListIterator.remove();
      }
      while (!bool);
      localFilterResults.values = localArrayList;
      localFilterResults.count = localArrayList.size();
    }
    return localFilterResults;
  }

  protected void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    this.a.a = ((ArrayList)paramFilterResults.values);
    this.a.notifyDataSetChanged();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.xe
 * JD-Core Version:    0.6.1
 */