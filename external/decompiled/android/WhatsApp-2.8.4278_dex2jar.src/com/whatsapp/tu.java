package com.whatsapp;

import java.util.ArrayList;
import java.util.Comparator;

class tu
  implements Comparator<ArrayList<sz>>
{
  final GroupChatMap a;

  tu(GroupChatMap paramGroupChatMap)
  {
  }

  public int a(ArrayList<sz> paramArrayList1, ArrayList<sz> paramArrayList2)
  {
    return (int)(1000000.0D * ((sz)paramArrayList2.get(0)).q - 1000000.0D * ((sz)paramArrayList1.get(0)).q);
  }
}