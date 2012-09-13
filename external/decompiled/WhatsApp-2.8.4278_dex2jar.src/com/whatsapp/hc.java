package com.whatsapp;

import android.os.AsyncTask;
import android.widget.ListView;
import android.widget.TextView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

class hc extends AsyncTask<Void, Void, List<w7>>
{
  final te a;

  hc(te paramte)
  {
  }

  protected List<w7> a(Void[] paramArrayOfVoid)
  {
    try
    {
      List localList2 = WebImagePicker.l(this.a.c).b();
      localList1 = localList2;
      return localList1;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        g5.d(localIOException);
        List localList1 = null;
      }
    }
    catch (JSONException localJSONException)
    {
      while (true)
        g5.d(localJSONException);
    }
  }

  protected void a(List<w7> paramList)
  {
    te localte = this.a;
    if ((WebImagePicker.l(this.a.c).c()) && (WebImagePicker.b(this.a.c).size() < 100));
    for (boolean bool = true; ; bool = false)
    {
      te.a(localte, bool);
      te.a(this.a, null);
      if (paramList != null)
        WebImagePicker.b(this.a.c).addAll(paramList);
      if (WebImagePicker.b(this.a.c).isEmpty())
      {
        TextView localTextView = (TextView)this.a.c.getListView().getEmptyView();
        if (paramList == null)
        {
          localTextView.setText(2131296650);
          if (!DialogToastListActivity.f);
        }
        else
        {
          WebImagePicker localWebImagePicker = this.a.c;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = WebImagePicker.l(this.a.c).d();
          localTextView.setText(localWebImagePicker.getString(2131296649, arrayOfObject));
        }
      }
      this.a.notifyDataSetChanged();
      return;
    }
  }
}