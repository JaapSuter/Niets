package com.whatsapp;

import android.content.Intent;
import android.os.AsyncTask;
import com.whatsapp.messaging.MessageService;

final class hb extends AsyncTask<Void, Void, Void>
{
  private static final String z;

  static
  {
    char[] arrayOfChar = "*2_k%+6Pm%-8]h8<:\034j4\"2Gg> zPa<>;Vz4".toCharArray();
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
      m = 81;
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
      m = 78;
      continue;
      m = 87;
      continue;
      m = 51;
      continue;
      m = 14;
    }
  }

  protected Void a(Void[] paramArrayOfVoid)
  {
    try
    {
      Thread.sleep(1500L);
      label6: return null;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label6;
    }
  }

  protected void a(Void paramVoid)
  {
    MessageService.b(App.Mb);
    DeleteAccountConfirmation.e();
    App.z.x();
    App.a(App.Mb, 2131296969, 1);
    if (DeleteAccountConfirmation.d() != null)
    {
      DeleteAccountConfirmation.d().removeDialog(1);
      Intent localIntent = new Intent(DeleteAccountConfirmation.d(), EULA.class);
      DeleteAccountConfirmation.d().startActivity(localIntent);
      DeleteAccountConfirmation.d().finish();
    }
    if (Conversations.a())
    {
      Conversations localConversations = Conversations.b();
      if (localConversations != null)
        localConversations.finish();
    }
    g5.b(z);
  }
}