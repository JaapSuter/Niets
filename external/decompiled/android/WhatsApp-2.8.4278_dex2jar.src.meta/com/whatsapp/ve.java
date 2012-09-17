package com.whatsapp;

import android.widget.Filter;
import android.widget.Filter.FilterResults;

class ve extends Filter
{
  final fe a;

  private ve(fe paramfe)
  {
  }

  ve(fe paramfe, tj paramtj)
  {
    this(paramfe);
  }

  protected Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    return new Filter.FilterResults();
  }

  protected void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    if ((paramCharSequence == null) || (paramCharSequence.length() == 0))
    {
      ContactPicker.a(this.a.d, null);
      if (!DialogToastListActivity.f);
    }
    else
    {
      ContactPicker.a(this.a.d, paramCharSequence.toString());
    }
    this.a.notifyDataSetChanged();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ve
 * JD-Core Version:    0.6.1
 */