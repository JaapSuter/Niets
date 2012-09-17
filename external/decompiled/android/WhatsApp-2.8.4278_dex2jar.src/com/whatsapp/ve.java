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