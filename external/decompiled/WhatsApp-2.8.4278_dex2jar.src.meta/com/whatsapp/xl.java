package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.HashMap;

class xl
  implements DialogInterface.OnClickListener
{
  final Conversation a;

  xl(Conversation paramConversation)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(13);
    if ((Conversation.j.containsKey(Conversation.u(this.a).b)) && (Conversation.v(this.a)))
    {
      Conversation.a(this.a, Conversation.u(this.a), Conversation.l);
      this.a.b(Conversation.w(this.a));
      App.n();
      if (!DialogToastListActivity.f);
    }
    else
    {
      this.a.b(Conversation.w(this.a));
      App.e(Conversation.u(this.a));
    }
    App.a(this.a, 2131296513, 0);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.xl
 * JD-Core Version:    0.6.1
 */