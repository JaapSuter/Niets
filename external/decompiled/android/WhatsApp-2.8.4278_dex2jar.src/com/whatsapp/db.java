package com.whatsapp;

import android.app.ProgressDialog;
import android.database.Cursor;
import android.os.AsyncTask;
import android.widget.ListView;
import android.widget.Toast;

class db extends AsyncTask<Void, Void, jq>
{
  private ProgressDialog a;
  private String b;
  private boolean c;
  private sz d;
  final Conversation e;

  public db(Conversation paramConversation, String paramString, boolean paramBoolean, sz paramsz)
  {
    this.b = paramString;
    this.c = paramBoolean;
    this.d = paramsz;
    this.a = ProgressDialog.show(paramConversation, "", paramConversation.getString(2131296499), true, false);
    this.a.setCancelable(true);
  }

  public jq a(Void[] paramArrayOfVoid)
  {
    jq localjq = App.z.a(this.e.Qb.b, this.d, this.c, this.b, 100, Conversation.z(this.e));
    if ((localjq != null) && (localjq.a != null))
    {
      int i = -50 + (localjq.a.getCount() - localjq.b);
      localjq.a.moveToPosition(Math.max(0, i));
    }
    return localjq;
  }

  public void a(jq paramjq)
  {
    this.a.dismiss();
    if (!isCancelled())
      if (paramjq != null)
      {
        Conversation.f(this.e, paramjq.b);
        if (paramjq.a != null)
        {
          Conversation.a(this.e, paramjq.a);
          Conversation.z(this.e).a();
          this.e.Pb.changeCursor(paramjq.a);
        }
        this.e.Ib.setTranscriptMode(0);
        this.e.Ib.setSelection(paramjq.b);
        Conversation.a(this.e, null);
        if (!DialogToastListActivity.f);
      }
      else
      {
        Conversation.f(this.e, -1);
        Toast.makeText(this.e.getApplicationContext(), this.e.getString(2131296500), 0).show();
      }
  }
}