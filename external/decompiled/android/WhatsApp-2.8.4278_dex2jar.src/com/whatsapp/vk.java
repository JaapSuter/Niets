package com.whatsapp;

import java.util.ArrayList;
import java.util.HashMap;

class vk
  implements sq
{
  final Conversation a;

  vk(Conversation paramConversation)
  {
  }

  public void a()
  {
    if (Conversation.d(this.a) > 0)
      Conversation.a(this.a, Conversation.e(this.a).size());
    Conversation.e(this.a).clear();
    Conversation.f(this.a).clear();
    Conversation.a(this.a, true);
  }

  public void b()
  {
    this.a.Pb.notifyDataSetChanged();
  }
}