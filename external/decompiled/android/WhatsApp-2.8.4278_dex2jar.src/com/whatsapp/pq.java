package com.whatsapp;

import java.util.ArrayList;

class pq extends lq
{
  final GroupChatMap a;

  pq(GroupChatMap paramGroupChatMap)
  {
  }

  public void a(sz paramsz, int paramInt)
  {
    if ((paramsz != null) && (paramsz.b.a.equals(GroupChatMap.j(this.a))) && (!paramsz.b.b) && (paramsz.l == 5))
    {
      sz localsz = GroupChatMap.a(this.a, paramsz.c);
      if (localsz != null)
        GroupChatMap.f(this.a).remove(localsz);
      GroupChatMap.f(this.a).add(paramsz);
      GroupChatMap.k(this.a);
      GroupChatMap.l(this.a).a();
    }
  }
}