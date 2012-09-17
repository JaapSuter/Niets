package com.whatsapp;

import android.view.View;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.ListIterator;

class we extends Filter
{
  final ne a;

  private we(ne paramne)
  {
  }

  we(ne paramne, u8 paramu8)
  {
    this(paramne);
  }

  protected Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    boolean bool = DialogToastListActivity.f;
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    if (paramCharSequence.length() > 0);
    synchronized (gp.a)
    {
      ArrayList localArrayList2 = (ArrayList)gp.a.clone();
      ListIterator localListIterator = localArrayList2.listIterator();
      do
      {
        if (!localListIterator.hasNext())
          break;
        zq localzq = gp.a((String)localListIterator.next());
        if (((localzq.g == null) && (!localzq.o())) || ((localzq.o()) && (localzq.p())) || ((localzq.h != null) && (!localzq.h.toLowerCase().contains(paramCharSequence.toString().toLowerCase()))))
          localListIterator.remove();
      }
      while (!bool);
      localFilterResults.values = localArrayList2;
      localFilterResults.count = localArrayList2.size();
      if (bool)
      {
        localFilterResults.values = gp.a;
        localFilterResults.count = gp.a.size();
      }
      return localFilterResults;
    }
  }

  protected void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    boolean bool = DialogToastListActivity.f;
    if (paramFilterResults.count == 0)
    {
      if (paramCharSequence.length() > 0)
      {
        View localView = this.a.b.findViewById(2131558619);
        localView.setVisibility(0);
        this.a.b.p.setEmptyView(localView);
        this.a.b.findViewById(2131558622).setVisibility(8);
        this.a.b.findViewById(2131558620).setVisibility(8);
        if (!bool);
      }
      else
      {
        this.a.b.findViewById(2131558619).setVisibility(8);
        this.a.b.a();
        if (!bool);
      }
    }
    else
    {
      this.a.b.findViewById(2131558619).setVisibility(8);
      this.a.b.a();
    }
    this.a.b.t = ((ArrayList)paramFilterResults.values);
    if (this.a.b.t == null);
    synchronized (gp.a)
    {
      this.a.b.t = ((ArrayList)gp.a.clone());
      this.a.notifyDataSetChanged();
      return;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.we
 * JD-Core Version:    0.6.1
 */