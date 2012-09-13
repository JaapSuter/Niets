package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

final class bd extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    int i = yq.e;
    String str1 = (String)paramMessage.obj;
    switch (paramMessage.what)
    {
    case 3:
    case 4:
    case 5:
    default:
      return;
      break;
    case 1:
    case 2:
    case 6:
    case 7:
    }
    while (true)
    {
      fq.C().remove(str1);
      fq.B().a(str1);
      if (i != 0)
      {
        fq.A().a(str1);
        fq.B().b(str1);
        if (i != 0)
        {
          Enumeration localEnumeration = fq.D().keys();
          do
          {
            if (!localEnumeration.hasMoreElements())
              break;
            String str3 = (String)localEnumeration.nextElement();
            fq.B().a(str3);
            fq.D().put(str3, new kq(null, 1L));
            fq.E().remove(str3);
            fq.C().remove(str3);
            fq.B().b(str3);
          }
          while (i == 0);
          if (i != 0)
          {
            HashSet localHashSet = new HashSet(fq.D().keySet());
            fq.E().clear();
            fq.C().clear();
            Iterator localIterator = localHashSet.iterator();
            if (localIterator.hasNext())
            {
              String str2 = (String)localIterator.next();
              if (!str2.contains("-"))
              {
                fq.D().remove(str2);
                if (i == 0);
              }
              else
              {
                fq.D().put(str2, new kq(null, 1L));
              }
              fq.B().a(str2);
              fq.B().b(str2);
              if (i == 0)
                break;
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.bd
 * JD-Core Version:    0.6.1
 */