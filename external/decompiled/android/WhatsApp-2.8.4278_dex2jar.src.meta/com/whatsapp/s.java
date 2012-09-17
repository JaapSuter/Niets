package com.whatsapp;

import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Iterator;

final class s extends AsyncTask<Void, Void, ArrayList<sz>>
{
  private static final String z;

  static
  {
    char[] arrayOfChar = "G|s~*Hf?+\tol$1R,".toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    if (i <= j)
    {
      z = new String(arrayOfChar).intern();
      return;
    }
    int k = arrayOfChar[j];
    int m;
    switch (j % 5)
    {
    default:
      m = 95;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar[j] = (char)(m ^ k);
      j++;
      break;
      m = 38;
      continue;
      m = 12;
      continue;
      m = 3;
      continue;
      m = 81;
    }
  }

  protected ArrayList<sz> a(Void[] paramArrayOfVoid)
  {
    ArrayList localArrayList = App.z.n();
    g5.b(z + localArrayList.size());
    return localArrayList;
  }

  protected void a(ArrayList<sz> paramArrayList)
  {
    boolean bool = DialogToastListActivity.f;
    Iterator localIterator = paramArrayList.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      App.f((sz)localIterator.next());
    }
    while (!bool);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.s
 * JD-Core Version:    0.6.1
 */