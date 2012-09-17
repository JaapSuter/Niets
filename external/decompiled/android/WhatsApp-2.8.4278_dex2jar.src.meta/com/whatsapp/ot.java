package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

class ot
  implements DialogInterface.OnClickListener
{
  private static final String[] z;
  final GroupChatInfo a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "9VG:q8lL-j(Ct6a".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = ":AD*u\002ZE9jr\\E<i4P@��i8R]:B/\\^/".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 5;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[j] = (char)(m ^ k);
        j++;
        break;
        m = 93;
        continue;
        m = 51;
        continue;
        m = 43;
        continue;
        m = 95;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 5;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i1] = (char)(i3 ^ i2);
      i1++;
      break;
      i3 = 93;
      continue;
      i3 = 51;
      continue;
      i3 = 43;
      continue;
      i3 = 95;
    }
  }

  ot(GroupChatInfo paramGroupChatInfo)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    g5.b(z[1]);
    if (App.sb())
    {
      Intent localIntent = new Intent(App.Mb.getApplicationContext(), Conversations.class).putExtra(z[0], this.a.t.b).addFlags(603979776);
      this.a.startActivity(localIntent);
      if (!DialogToastListActivity.f);
    }
    else
    {
      App.a(this.a.getBaseContext(), 2131296882, 0);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ot
 * JD-Core Version:    0.6.1
 */