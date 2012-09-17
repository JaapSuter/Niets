package com.whatsapp;

import android.os.AsyncTask;

class eb extends AsyncTask<Void, Void, Boolean>
{
  final Conversations a;

  private eb(Conversations paramConversations)
  {
  }

  eb(Conversations paramConversations, u8 paramu8)
  {
    this(paramConversations);
  }

  protected Boolean a(Void[] paramArrayOfVoid)
  {
    return Boolean.valueOf(xp.d());
  }

  protected void a(Boolean paramBoolean)
  {
    this.a.removeDialog(1);
    Conversations.a(this.a, paramBoolean.booleanValue());
  }

  protected void onPreExecute()
  {
    this.a.showDialog(1);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.eb
 * JD-Core Version:    0.6.1
 */